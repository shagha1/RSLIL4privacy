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
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.Enforcement
import org.xtext.rslilconvertors.rslil4privacy.rslil4privacy.ReferToRecipientTarget
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Rslil4privacyGeneratorC implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className+'.txt', 		
resource.allContents.filter(typeof(Policy)).map[compilepo].join('

'))}       
//----------------------------------------------------  

def className(Resource res) {
    var name = res.URI.lastSegment
    return name.substring(0, name.indexOf('.'))
    }
//----------------------------------------------------
def compilepo(Policy policy)
'''
«policy.name» Privacy Policy
----------------------------------------
«IF !policy.enforcement.empty»

#Enforcement 
------------------
«FOR x:policy.enforcement»«x.compileEn»«ENDFOR»«ENDIF»
«IF !policy.service.empty»

#Service 
------------------
«FOR x:policy.service»«x.compileSer»«ENDFOR»«ENDIF»
«IF !policy.recipient.empty»

#Recipients 
------------------
«FOR x:policy.recipient»«x.compileRec»«ENDFOR»«ENDIF»
«IF !policy.privateData.empty»

#PrivateData 
------------------
«FOR x:policy.privateData»«x.compilePr»«ENDFOR»«ENDIF»
«IF !policy.collection.empty»

#Collection 
------------------
«FOR x:policy.collection»«x.compilecol»«ENDFOR»«ENDIF»

«IF !policy.disclosure.empty»

#Disclosure 
------------------
«FOR x:policy.disclosure»«x.compiledis»«ENDFOR»«ENDIF»
«IF !policy.retention.empty»

#Retention 
------------------
«FOR x:policy.retention»«x.compileret»«ENDFOR»«ENDIF»
«IF !policy.usage.empty»

#Usage 
------------------
«FOR x:policy.usage»«x.compileuset»«ENDFOR»«ENDIF»
«IF !policy.informative.empty»

#Informative 
------------------
«FOR x:policy.informative»«x.compileinf»«ENDFOR»«ENDIF»
'''
//----------------------------------------------------      
def compileEn(Enforcement En)
'''
«En.name».«En.enforcementName»(«En.enforcementKind»):
«En.enforcementDescription»,
'''    
//----------------------------------------------------    
def compileSer(Service se)
'''
«se.servicename»:«se.description»,
	«IF !se.refertoservice.empty»Service_Part:«FOR part:se.refertoservice SEPARATOR ','»«part.compilerespart»«ENDFOR»,«ENDIF»
	«IF !se.reftoPrivateData.empty»Refers To PrivateData:«FOR part:se.reftoPrivateData SEPARATOR ','»«part.compilerrefp»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compileRec (Recipient r)
'''
«r.name».«r.recipientname»(«r.recipientScope»-«r.recipientType»):
   «r.recipientDescription», 
   «IF !r.partof.empty»Recipient_Part:«FOR part:r.partof SEPARATOR ','»«part.compilepart»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compilePr(PrivateData e)
'''
«e.name»(«e.privateDataKind»): «e.privatedata»,
	Attribute:«FOR a:e.attribute SEPARATOR ','»«a.compile»«ENDFOR»
'''
def compile(Attribute a)
'''«a.name»(«a.attributeName»)'''
//----------------------------------------------------
def compilecol(Collection col)
'''
«col.name»(«col.modalitykind»):«col.collectiondescription»,
«IF !col.refertoservice.empty»Refers To Service:«FOR b:col.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !col.reftoPrivateData.empty»Refers To PrivateData:«FOR p:col.reftoPrivateData SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !col.refertoEnforcement.empty»Refers To Enforcement:«FOR p:col.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compiledis(Disclosure dis)
'''
«dis.name»(«dis.modalitykind»):«dis.didescription»,
«IF !dis.referToRecipienttarget.empty»Refers To Recipient:«FOR p:dis.referToRecipienttarget SEPARATOR ','»«p.compileres»«ENDFOR»,«ENDIF»
«IF !dis.refertoservice.empty»Refers To Service:«FOR b:dis.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !dis.reftoPrivateData.empty»Refers To PrivateData:«FOR p:dis.reftoPrivateData SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !dis.refertoEnforcement.empty»Refers To Enforcement:«FOR d:dis.refertoEnforcement SEPARATOR ','»«d.compilerreEn»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compileret(Retention ret)
'''
«ret.name»(«ret.modalitykind»-«ret.period»):«ret.retentiondescription»,
«IF !ret.refertoservice.empty»Refers To Service:«FOR b:ret.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !ret.reftoPrivateData.empty»Refers To PrivateData:«FOR p:ret.reftoPrivateData SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !ret.refertoEnforcement.empty»Refers To Enforcement:«FOR p:ret.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compileuset(Usage u)
'''
«u.name»(«u.modalitykind»):«u.usagedescription»,
«IF !u.refertoservice.empty»Refers To Service:«FOR b:u.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !u.reftoPrivateData.empty»Refers To PrivateData:«FOR p:u.reftoPrivateData SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !u.refertoEnforcement.empty»Refers To Enforcement:«FOR p:u.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compileinf(Informative I)
'''
«I.name»(«I.modalitykind»):«I.infdescription»,
«IF !I.refertoservice.empty»Refers To Service:«FOR b:I.refertoservice SEPARATOR ','»«b.compilerespart»«ENDFOR»,«ENDIF»
«IF !I.reftoPrivateData.empty»Refers To PrivateData:«FOR p:I.reftoPrivateData SEPARATOR ','»«p.compilerrefp»«ENDFOR»,«ENDIF»
«IF !I.refertoEnforcement.empty»Refers To Enforcement:«FOR p:I.refertoEnforcement SEPARATOR ','»«p.compilerreEn»«ENDFOR»,«ENDIF»
'''
//----------------------------------------------------
def compilepe(Retention pe) '''   Retention Period:«pe.period»''' 
def compileres(ReferToRecipientTarget r) 
'''«r.refertore.name»'''
def compilerespart (ReferToService sp)
'''«sp.refertose.name»'''
def compilerrefp (ReftoPrivateData pp)
'''«pp.refpr.name»'''
def compilepart (Partof part)
'''«part.partof.name»'''
def compilerreEn (RefertoEnforcement en)
'''«en.refen.name»'''
}   


