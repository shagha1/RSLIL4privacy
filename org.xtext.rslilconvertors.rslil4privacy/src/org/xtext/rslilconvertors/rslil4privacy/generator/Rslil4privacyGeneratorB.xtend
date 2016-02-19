package org.xtext.rslilconvertors.rslil4privacy.generator


import org.eclipse.emf.ecore.resource.Resource
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Policy
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.PrivateData
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Recipient
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Partof
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Service
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToService
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Attribute
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Collection
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Disclosure
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Retention
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Usage
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Informative
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReftoPrivateData
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.RefertoEnforcement
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipient
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class Rslil4privacyGeneratorB implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className+'.json', 		
		resource.allContents.filter(typeof(Policy)).map[compilepo].join('
'))}       
//----------------------------------------------------  
def className(Resource res) {
    var name = res.URI.lastSegment
    return name.substring(0, name.indexOf('.'))
    }
//----------------------------------------------------
def compilepo(Policy policy)
'''{
	"name": "«policy.name»",
	«IF !policy.collection.empty»"Collections": [
    «FOR c:policy.collection SEPARATOR ','»«c.compileCollection»«ENDFOR»],«ENDIF»
    «IF !policy.disclosure.empty»"Disclosure": [
    «FOR d:policy.disclosure SEPARATOR ','»«d.compileDisclosure»«ENDFOR»],«ENDIF»
    «IF !policy.retention.empty»"Retention": [
    «FOR d:policy.retention SEPARATOR ','»«d.compileRetention»«ENDFOR»],«ENDIF»
    «IF !policy.usage.empty»"Usage": [
    «FOR d:policy.usage SEPARATOR ','»«d.compileUsage»«ENDFOR»],«ENDIF»
    «IF !policy.informative.empty»"Informative": [
    «FOR d:policy.informative SEPARATOR ','»«d.compileInformative»«ENDFOR»],«ENDIF»
    «IF !policy.privateData.empty» "PrivateDatums": [
    «FOR z:policy.privateData SEPARATOR ','»«z.compilePrivateData»«ENDFOR»],«ENDIF»
    «IF !policy.recipient.empty» "Recipients": [
    «FOR a:policy.recipient SEPARATOR ','»«a.compileallRecipient»«ENDFOR»],«ENDIF»
    «IF !policy.service.empty»"Services": [
    «FOR y:policy.service SEPARATOR ','»«y.compileService»«ENDFOR»],«ENDIF»
    «IF !policy.enforcement.empty»"Enforcements": [
    «FOR o:policy.enforcement SEPARATOR ','»«o.compileEnforcement»«ENDFOR»]«ENDIF»
}
'''
//----------------------------------------------------
def compileInformative (Informative inf)
'''	{
		"ID": "«inf.name»",
		"Description": "«inf.infdescription»",
		"Condition": "«inf.infcondition»",
		«IF !inf.reftoPrivateData.empty»"PrivateDatums": [«FOR b:inf.reftoPrivateData SEPARATOR ','»«b.compilerrefprivatedata5»«ENDFOR»],«ENDIF»
		«IF !inf.refertoservice.empty»"Services": [«FOR b:inf.refertoservice SEPARATOR ','»«b.compilerrefertoservice5»«ENDFOR»],«ENDIF»
		«IF !inf.refertoEnforcement.empty»"Enforcements": [«FOR b:inf.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement5»«ENDFOR»],«ENDIF»
		"Type": "«IF inf.modalitykind=='Permission'»Permission«ELSEIF inf.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
def compilerrefprivatedata5 (ReftoPrivateData refpr5)
'''"«refpr5.refpr.name»"'''
def compilerrefertoservice5 (ReferToService refse5)
'''"«refse5.refertose.name»"'''
def compilerrefertoEnforcement5 (RefertoEnforcement refe5)
'''"«refe5.refen.name»"'''
//----------------------------------------------------
def compileUsage (Usage use)
'''	{
		"ID": "«use.name»",
		"Description": "«use.usagedescription»",
		"Condition": "«use.usagecondition»",
		«IF !use.reftoPrivateData.empty»"PrivateDatums": [«FOR b:use.reftoPrivateData SEPARATOR ','»«b.compilerrefprivatedata4»«ENDFOR»],«ENDIF»
		«IF !use.refertoservice.empty»"Services": [«FOR b:use.refertoservice SEPARATOR ','»«b.compilerrefertoservice4»«ENDFOR»],«ENDIF»
		«IF !use.refertoEnforcement.empty»"Enforcements": [«FOR b:use.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement4»«ENDFOR»],«ENDIF»
		"Type": "«IF use.modalitykind=='Permission'»Permission«ELSEIF use.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
def compilerrefprivatedata4 (ReftoPrivateData refpr4)
'''"«refpr4.refpr.name»"'''
def compilerrefertoservice4 (ReferToService refse4)
'''"«refse4.refertose.name»"'''
def compilerrefertoEnforcement4 (RefertoEnforcement refe4)
'''"«refe4.refen.name»"'''
//----------------------------------------------------
def compileRetention (Retention ret)
'''	{
		"ID": "«ret.name»",
		"Description": "«ret.retentiondescription»",
		"Condition": "«ret.retentioncondition»",
		«IF !ret.period.empty»"Period": "«ret.period»",«ENDIF»
		«IF !ret.reftoPrivateData.empty»"PrivateDatums": [«FOR b:ret.reftoPrivateData SEPARATOR ','»«b.compilerrefprivatedata3»«ENDFOR»],«ENDIF»
		«IF !ret.refertoservice.empty»"Services": [«FOR b:ret.refertoservice SEPARATOR ','»«b.compilerrefertoservice3»«ENDFOR»],«ENDIF»
		«IF !ret.refertoEnforcement.empty»"Enforcements": [«FOR b:ret.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement3»«ENDFOR»],«ENDIF»
		"Type": "«IF ret.modalitykind=='Permission'»Permission«ELSEIF ret.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
	'''
def compilerrefprivatedata3 (ReftoPrivateData refpr3)
'''"«refpr3.refpr.name»"'''
def compilerrefertoservice3 (ReferToService refse3)
'''"«refse3.refertose.name»"'''
def compilerrefertoEnforcement3 (RefertoEnforcement refe3)
'''"«refe3.refen.name»"'''
//----------------------------------------------------
def compileCollection (Collection coll)
'''	{
		"ID": "«coll.name»",
		"Description": "«coll.collectiondescription»",
		"Condition": "«coll.collectioncondition»",
		«IF !coll.reftoPrivateData.empty»"PrivateDatums": [«FOR b:coll.reftoPrivateData SEPARATOR ','»«b.compilerrefprivatedata»«ENDFOR»],«ENDIF»
		«IF !coll.refertoservice.empty»"Services": [«FOR b:coll.refertoservice SEPARATOR ','»«b.compilerrefertoservice»«ENDFOR»],«ENDIF»
		«IF !coll.refertoEnforcement.empty»"Enforcements": [«FOR b:coll.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement»«ENDFOR»],«ENDIF»
		"Type": "«IF coll.modalitykind=='Permission'»Permission«ELSEIF coll.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
	'''
def compilerrefprivatedata (ReftoPrivateData refpr)
'''"«refpr.refpr.name»"'''
def compilerrefertoservice (ReferToService refse)
'''"«refse.refertose.name»"'''
def compilerrefertoEnforcement (RefertoEnforcement refe)
'''"«refe.refen.name»"'''
//----------------------------------------------------
def compileDisclosure (Disclosure dis)
'''	{
		"ID": "«dis.name»",
		"Description": "«dis.didescription»",
		"Condition": "«dis.discondition»",
		«IF !dis.referToRecipient.empty»"Recipients": [«FOR b:dis.referToRecipient SEPARATOR ','»«b.compilerreferToRecipient»«ENDFOR»],«ENDIF»
		«IF !dis.reftoPrivateData.empty»"PrivateDatums": [«FOR b:dis.reftoPrivateData SEPARATOR ','»«b.compilerrefprivatedata2»«ENDFOR»],«ENDIF»
		«IF !dis.refertoservice.empty»"Services": [«FOR b:dis.refertoservice SEPARATOR ','»«b.compilerrefertoservice2»«ENDFOR»],«ENDIF»
		«IF !dis.refertoEnforcement.empty»"Enforcements": [«FOR b:dis.refertoEnforcement SEPARATOR ','»«b.compilerrefertoEnforcement2»«ENDFOR»],«ENDIF»
		"Type": "«IF dis.modalitykind=='Permission'»Permission«ELSEIF dis.modalitykind=='Obligation'»Obligation«ELSE»Prohibition«ENDIF»"
	}
'''
def compilerreferToRecipient (ReferToRecipient refrec)
'''"«refrec.refertore.name»"'''
def compilerrefprivatedata2 (ReftoPrivateData refpr2)
'''"«refpr2.refpr.name»"'''
def compilerrefertoservice2 (ReferToService refse2)
'''"«refse2.refertose.name»"'''
def compilerrefertoEnforcement2 (RefertoEnforcement refe2)
'''"«refe2.refen.name»"'''
//----------------------------------------------------
def compileallRecipient (Recipient recip)
'''	{
		"ID": "«recip.name»",
		"Name": "«recip.recipientname»",
		"Description": "«recip.recipientDescription»",
		«IF !recip.partof.empty»"Recipient_Parts": [«FOR b:recip.partof SEPARATOR ','»«b.compilerpartr»«ENDFOR»],«ENDIF»
		"Type": "«IF recip.recipientType=='Individual'»Individual«ELSEIF recip.recipientType=='Organization'»Organization«ELSE»Individual/Organization«ENDIF»",
		"Scope": "«IF recip.recipientScope=='Internal'»Internal«ELSEIF recip.recipientScope=='External'»External«ELSE»Internal/External«ENDIF»"
		
	}
'''
def compilerpartr (Partof partr)
'''"«partr.partof.recipientname»"'''
//----------------------------------------------------
def compileEnforcement (Enforcement en)
'''	{
		"ID": "«en.name»",
		"Name": "«en.enforcementName»",
		"Description": "«en.enforcementDescription»",
		"Type": "«IF en.enforcementKind=='Action'»Action«/*
		*/»«ELSEIF en.enforcementKind=='Algorithm'»Algorithm«/*
		*/»«ELSEIF en.enforcementKind=='Config'»Config«/*
		*/»«ELSEIF en.enforcementKind=='Process'»Process«/*
		*/»«ELSE»Tool«ENDIF»"
	}
'''
//----------------------------------------------------
def compileService (Service s)
'''	{
		"ID": "«s.name»",
		"Description": "«s.description»",
		«IF s.reftoPrivateData!=0»"PrivateDatums": [«FOR b:s.reftoPrivateData SEPARATOR ','»«b.compilerp»«ENDFOR»],«ENDIF»
		«IF !s.refertoservice.empty»"Service_Parts": [«FOR b:s.refertoservice SEPARATOR ','»«b.compilerservicepartof»«ENDFOR»]«ENDIF»
	}
'''
def compilerp (ReftoPrivateData rp)
'''"«rp.refpr.name»"'''
def compilerservicepartof (ReferToService b)
'''"«b.refertose.name»"'''
//----------------------------------------------------
def compilePrivateData (PrivateData p)
'''	{
		"ID": "«p.name»",
		"Description": "«p.privatedata»",
		"Type": "«IF p.privateDataKind=='PersonalInformation'»PersonalInformation«/*
		*/»«ELSE»UsageInformation«ENDIF»",
		«IF p.attribute!=0»"Attributes": [
		«FOR b:p.attribute SEPARATOR ','»«b.compileatt»«ENDFOR»
		]«ENDIF»
	}
'''
def compileatt (Attribute att)
'''	{
		"name": "«att.name»",
		"Description": "«att.attributeName»"
	}
'''	
}
