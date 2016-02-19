package org.xtext.rslilconvertors.rslil4privacy.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.rslilconvertors.rslil4privacy.services.Rslil4privacyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRslil4privacyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'};'", "'.'", "'import'", "'.*'", "'Enforcement'", "'Name'", "','", "'Description'", "'Type'", "'Action'", "'Algorithm'", "'Config'", "'Process'", "'Tool'", "'Service'", "'RefersTo PrivateData'", "'Service_Part'", "'Recipient'", "'Recipient_Part'", "'Scope'", "'Internal'", "'External'", "'Internal/External'", "'Individual'", "'Organization'", "'Individual/Organization'", "'PrivateData'", "'PersonalInformation'", "'UsageInformation'", "'Attribute'", "'Collection'", "'Condition'", "'RefersTo Service'", "'RefersTo Enforcement'", "'Modality'", "'Permitted'", "'Obligation'", "'Forbidden'", "'Disclosure'", "'RefersTo Recipient'", "'RefersTo Recipient-Source'", "'RefersTo Recipient-Target'", "'Retention'", "'Period'", "'Usage'", "'Informative'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRslil4privacyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRslil4privacyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRslil4privacyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g"; }



     	private Rslil4privacyGrammarAccess grammarAccess;
     	
        public InternalRslil4privacyParser(TokenStream input, Rslil4privacyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Policy";	
       	}
       	
       	@Override
       	protected Rslil4privacyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePolicy"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:67:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:68:2: (iv_rulePolicy= rulePolicy EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:69:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy75);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:76:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_importelements_3_0 = null;

        EObject lv_collection_4_0 = null;

        EObject lv_disclosure_5_0 = null;

        EObject lv_retention_6_0 = null;

        EObject lv_usage_7_0 = null;

        EObject lv_informative_8_0 = null;

        EObject lv_privateData_9_0 = null;

        EObject lv_recipient_10_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_enforcement_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:79:28: ( (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:80:1: (otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:80:3: otherlv_0= 'Package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_importelements_3_0= ruleImport ) )* ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )* ( (lv_privateData_9_0= rulePrivateData ) )* ( (lv_recipient_10_0= ruleRecipient ) )* ( (lv_service_11_0= ruleService ) )* ( (lv_enforcement_12_0= ruleEnforcement ) )* otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy122); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPackageKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:86:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPolicyAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePolicy143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePolicy155); 

                	newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:106:1: ( (lv_importelements_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:107:1: (lv_importelements_3_0= ruleImport )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:107:1: (lv_importelements_3_0= ruleImport )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:108:3: lv_importelements_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getImportelementsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_rulePolicy176);
            	    lv_importelements_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"importelements",
            	            		lv_importelements_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:124:3: ( ( (lv_collection_4_0= ruleCollection ) ) | ( (lv_disclosure_5_0= ruleDisclosure ) ) | ( (lv_retention_6_0= ruleRetention ) ) | ( (lv_usage_7_0= ruleUsage ) ) | ( (lv_informative_8_0= ruleInformative ) ) )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    alt2=1;
                    }
                    break;
                case 51:
                    {
                    alt2=2;
                    }
                    break;
                case 55:
                    {
                    alt2=3;
                    }
                    break;
                case 57:
                    {
                    alt2=4;
                    }
                    break;
                case 58:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:124:4: ( (lv_collection_4_0= ruleCollection ) )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:124:4: ( (lv_collection_4_0= ruleCollection ) )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:125:1: (lv_collection_4_0= ruleCollection )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:125:1: (lv_collection_4_0= ruleCollection )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:126:3: lv_collection_4_0= ruleCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getCollectionCollectionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCollection_in_rulePolicy199);
            	    lv_collection_4_0=ruleCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"collection",
            	            		lv_collection_4_0, 
            	            		"Collection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:143:6: ( (lv_disclosure_5_0= ruleDisclosure ) )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:143:6: ( (lv_disclosure_5_0= ruleDisclosure ) )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:144:1: (lv_disclosure_5_0= ruleDisclosure )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:144:1: (lv_disclosure_5_0= ruleDisclosure )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:145:3: lv_disclosure_5_0= ruleDisclosure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getDisclosureDisclosureParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisclosure_in_rulePolicy226);
            	    lv_disclosure_5_0=ruleDisclosure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"disclosure",
            	            		lv_disclosure_5_0, 
            	            		"Disclosure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:162:6: ( (lv_retention_6_0= ruleRetention ) )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:162:6: ( (lv_retention_6_0= ruleRetention ) )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:163:1: (lv_retention_6_0= ruleRetention )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:163:1: (lv_retention_6_0= ruleRetention )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:164:3: lv_retention_6_0= ruleRetention
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRetentionRetentionParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRetention_in_rulePolicy253);
            	    lv_retention_6_0=ruleRetention();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"retention",
            	            		lv_retention_6_0, 
            	            		"Retention");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:181:6: ( (lv_usage_7_0= ruleUsage ) )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:181:6: ( (lv_usage_7_0= ruleUsage ) )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:182:1: (lv_usage_7_0= ruleUsage )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:182:1: (lv_usage_7_0= ruleUsage )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:183:3: lv_usage_7_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsageUsageParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_rulePolicy280);
            	    lv_usage_7_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usage",
            	            		lv_usage_7_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:200:6: ( (lv_informative_8_0= ruleInformative ) )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:200:6: ( (lv_informative_8_0= ruleInformative ) )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:201:1: (lv_informative_8_0= ruleInformative )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:201:1: (lv_informative_8_0= ruleInformative )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:202:3: lv_informative_8_0= ruleInformative
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getInformativeInformativeParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInformative_in_rulePolicy307);
            	    lv_informative_8_0=ruleInformative();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informative",
            	            		lv_informative_8_0, 
            	            		"Informative");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:218:4: ( (lv_privateData_9_0= rulePrivateData ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:219:1: (lv_privateData_9_0= rulePrivateData )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:219:1: (lv_privateData_9_0= rulePrivateData )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:220:3: lv_privateData_9_0= rulePrivateData
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPrivateDataPrivateDataParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrivateData_in_rulePolicy330);
            	    lv_privateData_9_0=rulePrivateData();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"privateData",
            	            		lv_privateData_9_0, 
            	            		"PrivateData");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:236:3: ( (lv_recipient_10_0= ruleRecipient ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:237:1: (lv_recipient_10_0= ruleRecipient )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:237:1: (lv_recipient_10_0= ruleRecipient )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:238:3: lv_recipient_10_0= ruleRecipient
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRecipientRecipientParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecipient_in_rulePolicy352);
            	    lv_recipient_10_0=ruleRecipient();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"recipient",
            	            		lv_recipient_10_0, 
            	            		"Recipient");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:254:3: ( (lv_service_11_0= ruleService ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:255:1: (lv_service_11_0= ruleService )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:255:1: (lv_service_11_0= ruleService )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:256:3: lv_service_11_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getServiceServiceParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_rulePolicy374);
            	    lv_service_11_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_11_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:272:3: ( (lv_enforcement_12_0= ruleEnforcement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:273:1: (lv_enforcement_12_0= ruleEnforcement )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:273:1: (lv_enforcement_12_0= ruleEnforcement )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:274:3: lv_enforcement_12_0= ruleEnforcement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getEnforcementEnforcementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnforcement_in_rulePolicy396);
            	    lv_enforcement_12_0=ruleEnforcement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enforcement",
            	            		lv_enforcement_12_0, 
            	            		"Enforcement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulePolicy409); 

                	newLeafNode(otherlv_13, grammarAccess.getPolicyAccess().getRightCurlyBracketSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:302:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:303:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:304:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName446);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:311:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:314:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:315:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:315:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:315:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName497); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:322:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:323:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName516); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName531); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:343:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:344:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:345:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport578);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:352:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:355:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:356:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:356:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:356:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport625); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:360:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:361:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:361:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:362:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport646);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:386:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:387:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:388:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard683);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:395:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:398:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:399:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:399:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:400:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard741);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:410:1: (kw= '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:411:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard760); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleEnforcement"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:424:1: entryRuleEnforcement returns [EObject current=null] : iv_ruleEnforcement= ruleEnforcement EOF ;
    public final EObject entryRuleEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforcement = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:425:2: (iv_ruleEnforcement= ruleEnforcement EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:426:2: iv_ruleEnforcement= ruleEnforcement EOF
            {
             newCompositeNode(grammarAccess.getEnforcementRule()); 
            pushFollow(FOLLOW_ruleEnforcement_in_entryRuleEnforcement802);
            iv_ruleEnforcement=ruleEnforcement();

            state._fsp--;

             current =iv_ruleEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnforcement812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnforcement"


    // $ANTLR start "ruleEnforcement"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:433:1: ruleEnforcement returns [EObject current=null] : (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) ;
    public final EObject ruleEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enforcementName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_enforcementDescription_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_enforcementKind_10_1=null;
        Token lv_enforcementKind_10_2=null;
        Token lv_enforcementKind_10_3=null;
        Token lv_enforcementKind_10_4=null;
        Token lv_enforcementKind_10_5=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:436:28: ( (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:437:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:437:1: (otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:437:3: otherlv_0= 'Enforcement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_enforcementName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_enforcementDescription_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Type' ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) ) otherlv_11= '};'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnforcement849); 

                	newLeafNode(otherlv_0, grammarAccess.getEnforcementAccess().getEnforcementKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:441:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:442:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:442:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:443:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnforcement866); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnforcementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnforcement883); 

                	newLeafNode(otherlv_2, grammarAccess.getEnforcementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEnforcement895); 

                	newLeafNode(otherlv_3, grammarAccess.getEnforcementAccess().getNameKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:467:1: ( (lv_enforcementName_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:468:1: (lv_enforcementName_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:468:1: (lv_enforcementName_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:469:3: lv_enforcementName_4_0= RULE_STRING
            {
            lv_enforcementName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement912); 

            			newLeafNode(lv_enforcementName_4_0, grammarAccess.getEnforcementAccess().getEnforcementNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enforcementName",
                    		lv_enforcementName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement929); 

                	newLeafNode(otherlv_5, grammarAccess.getEnforcementAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEnforcement941); 

                	newLeafNode(otherlv_6, grammarAccess.getEnforcementAccess().getDescriptionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:493:1: ( (lv_enforcementDescription_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:494:1: (lv_enforcementDescription_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:494:1: (lv_enforcementDescription_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:495:3: lv_enforcementDescription_7_0= RULE_STRING
            {
            lv_enforcementDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnforcement958); 

            			newLeafNode(lv_enforcementDescription_7_0, grammarAccess.getEnforcementAccess().getEnforcementDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnforcementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enforcementDescription",
                    		lv_enforcementDescription_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEnforcement975); 

                	newLeafNode(otherlv_8, grammarAccess.getEnforcementAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleEnforcement987); 

                	newLeafNode(otherlv_9, grammarAccess.getEnforcementAccess().getTypeKeyword_9());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:519:1: ( ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:520:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:520:1: ( (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:521:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:521:1: (lv_enforcementKind_10_1= 'Action' | lv_enforcementKind_10_2= 'Algorithm' | lv_enforcementKind_10_3= 'Config' | lv_enforcementKind_10_4= 'Process' | lv_enforcementKind_10_5= 'Tool' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:522:3: lv_enforcementKind_10_1= 'Action'
                    {
                    lv_enforcementKind_10_1=(Token)match(input,22,FOLLOW_22_in_ruleEnforcement1007); 

                            newLeafNode(lv_enforcementKind_10_1, grammarAccess.getEnforcementAccess().getEnforcementKindActionKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:534:8: lv_enforcementKind_10_2= 'Algorithm'
                    {
                    lv_enforcementKind_10_2=(Token)match(input,23,FOLLOW_23_in_ruleEnforcement1036); 

                            newLeafNode(lv_enforcementKind_10_2, grammarAccess.getEnforcementAccess().getEnforcementKindAlgorithmKeyword_10_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:546:8: lv_enforcementKind_10_3= 'Config'
                    {
                    lv_enforcementKind_10_3=(Token)match(input,24,FOLLOW_24_in_ruleEnforcement1065); 

                            newLeafNode(lv_enforcementKind_10_3, grammarAccess.getEnforcementAccess().getEnforcementKindConfigKeyword_10_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:558:8: lv_enforcementKind_10_4= 'Process'
                    {
                    lv_enforcementKind_10_4=(Token)match(input,25,FOLLOW_25_in_ruleEnforcement1094); 

                            newLeafNode(lv_enforcementKind_10_4, grammarAccess.getEnforcementAccess().getEnforcementKindProcessKeyword_10_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:570:8: lv_enforcementKind_10_5= 'Tool'
                    {
                    lv_enforcementKind_10_5=(Token)match(input,26,FOLLOW_26_in_ruleEnforcement1123); 

                            newLeafNode(lv_enforcementKind_10_5, grammarAccess.getEnforcementAccess().getEnforcementKindToolKeyword_10_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnforcementRule());
                    	        }
                           		setWithLastConsumed(current, "enforcementKind", lv_enforcementKind_10_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleEnforcement1151); 

                	newLeafNode(otherlv_11, grammarAccess.getEnforcementAccess().getRightCurlyBracketSemicolonKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnforcement"


    // $ANTLR start "entryRuleService"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:597:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:598:2: (iv_ruleService= ruleService EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:599:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1187);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:606:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? otherlv_15= '};' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_servicename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_reftoPrivateData_10_0 = null;

        EObject lv_refertoservice_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:609:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? otherlv_15= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:610:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? otherlv_15= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:610:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? otherlv_15= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:610:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_servicename_4_0= RULE_STRING ) ) otherlv_5= ',' (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )? (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleService1234); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:614:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:615:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:615:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:616:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService1251); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleService1268); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleService1280); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getNameKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:640:1: ( (lv_servicename_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:641:1: (lv_servicename_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:641:1: (lv_servicename_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:642:3: lv_servicename_4_0= RULE_STRING
            {
            lv_servicename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1297); 

            			newLeafNode(lv_servicename_4_0, grammarAccess.getServiceAccess().getServicenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"servicename",
                    		lv_servicename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleService1314); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:662:1: (otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:662:3: otherlv_6= 'Description' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleService1327); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getDescriptionKeyword_6_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:666:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:667:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:667:1: (lv_description_7_0= RULE_STRING )
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:668:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService1344); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getServiceAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleService1361); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_6_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:688:3: (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:688:5: otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleService1376); 

                        	newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRefersToPrivateDataKeyword_7_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:692:1: ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:693:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:693:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:694:3: lv_reftoPrivateData_10_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleService1397);
                    	    lv_reftoPrivateData_10_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_10_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleService1410); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCommaKeyword_7_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:714:3: (otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:714:5: otherlv_12= 'Service_Part' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleService1425); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getService_PartKeyword_8_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:718:1: ( (lv_refertoservice_13_0= ruleReferToService ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:719:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:719:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:720:3: lv_refertoservice_13_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceAccess().getRefertoserviceReferToServiceParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleService1446);
                    	    lv_refertoservice_13_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_13_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleService1459); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getCommaKeyword_8_2());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleService1473); 

                	newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRecipient"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:752:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:753:2: (iv_ruleRecipient= ruleRecipient EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:754:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_ruleRecipient_in_entryRuleRecipient1509);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecipient1519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecipient"


    // $ANTLR start "ruleRecipient"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:761:1: ruleRecipient returns [EObject current=null] : (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_recipientDescription_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) ;
    public final EObject ruleRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_recipientname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_recipientDescription_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_recipientScope_13_1=null;
        Token lv_recipientScope_13_2=null;
        Token lv_recipientScope_13_3=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_recipientType_16_1=null;
        Token lv_recipientType_16_2=null;
        Token lv_recipientType_16_3=null;
        Token otherlv_17=null;
        EObject lv_partof_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:764:28: ( (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_recipientDescription_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:765:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_recipientDescription_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:765:1: (otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_recipientDescription_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:765:3: otherlv_0= 'Recipient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Name' ( (lv_recipientname_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Description' ( (lv_recipientDescription_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )? otherlv_12= 'Scope' ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) ) otherlv_14= ',' otherlv_15= 'Type' ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) ) otherlv_17= '};'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleRecipient1556); 

                	newLeafNode(otherlv_0, grammarAccess.getRecipientAccess().getRecipientKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:770:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:770:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecipient1573); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRecipientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecipient1590); 

                	newLeafNode(otherlv_2, grammarAccess.getRecipientAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleRecipient1602); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipientAccess().getNameKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:795:1: ( (lv_recipientname_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:796:1: (lv_recipientname_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:796:1: (lv_recipientname_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:797:3: lv_recipientname_4_0= RULE_STRING
            {
            lv_recipientname_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1619); 

            			newLeafNode(lv_recipientname_4_0, grammarAccess.getRecipientAccess().getRecipientnameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"recipientname",
                    		lv_recipientname_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1636); 

                	newLeafNode(otherlv_5, grammarAccess.getRecipientAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleRecipient1648); 

                	newLeafNode(otherlv_6, grammarAccess.getRecipientAccess().getDescriptionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:821:1: ( (lv_recipientDescription_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:822:1: (lv_recipientDescription_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:822:1: (lv_recipientDescription_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:823:3: lv_recipientDescription_7_0= RULE_STRING
            {
            lv_recipientDescription_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRecipient1665); 

            			newLeafNode(lv_recipientDescription_7_0, grammarAccess.getRecipientAccess().getRecipientDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecipientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"recipientDescription",
                    		lv_recipientDescription_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1682); 

                	newLeafNode(otherlv_8, grammarAccess.getRecipientAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:843:1: (otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:843:3: otherlv_9= 'Recipient_Part' ( (lv_partof_10_0= rulePartof ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleRecipient1695); 

                        	newLeafNode(otherlv_9, grammarAccess.getRecipientAccess().getRecipient_PartKeyword_9_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:847:1: ( (lv_partof_10_0= rulePartof ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:848:1: (lv_partof_10_0= rulePartof )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:848:1: (lv_partof_10_0= rulePartof )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:849:3: lv_partof_10_0= rulePartof
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipientAccess().getPartofPartofParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePartof_in_ruleRecipient1716);
                    	    lv_partof_10_0=rulePartof();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipientRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"partof",
                    	            		lv_partof_10_0, 
                    	            		"Partof");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1729); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipientAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleRecipient1743); 

                	newLeafNode(otherlv_12, grammarAccess.getRecipientAccess().getScopeKeyword_10());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:873:1: ( ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:874:1: ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:874:1: ( (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:875:1: (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:875:1: (lv_recipientScope_13_1= 'Internal' | lv_recipientScope_13_2= 'External' | lv_recipientScope_13_3= 'Internal/External' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:876:3: lv_recipientScope_13_1= 'Internal'
                    {
                    lv_recipientScope_13_1=(Token)match(input,33,FOLLOW_33_in_ruleRecipient1763); 

                            newLeafNode(lv_recipientScope_13_1, grammarAccess.getRecipientAccess().getRecipientScopeInternalKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientScope", lv_recipientScope_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:888:8: lv_recipientScope_13_2= 'External'
                    {
                    lv_recipientScope_13_2=(Token)match(input,34,FOLLOW_34_in_ruleRecipient1792); 

                            newLeafNode(lv_recipientScope_13_2, grammarAccess.getRecipientAccess().getRecipientScopeExternalKeyword_11_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientScope", lv_recipientScope_13_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:900:8: lv_recipientScope_13_3= 'Internal/External'
                    {
                    lv_recipientScope_13_3=(Token)match(input,35,FOLLOW_35_in_ruleRecipient1821); 

                            newLeafNode(lv_recipientScope_13_3, grammarAccess.getRecipientAccess().getRecipientScopeInternalExternalKeyword_11_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientScope", lv_recipientScope_13_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRecipient1849); 

                	newLeafNode(otherlv_14, grammarAccess.getRecipientAccess().getCommaKeyword_12());
                
            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleRecipient1861); 

                	newLeafNode(otherlv_15, grammarAccess.getRecipientAccess().getTypeKeyword_13());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:923:1: ( ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:924:1: ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:924:1: ( (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:925:1: (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:925:1: (lv_recipientType_16_1= 'Individual' | lv_recipientType_16_2= 'Organization' | lv_recipientType_16_3= 'Individual/Organization' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:926:3: lv_recipientType_16_1= 'Individual'
                    {
                    lv_recipientType_16_1=(Token)match(input,36,FOLLOW_36_in_ruleRecipient1881); 

                            newLeafNode(lv_recipientType_16_1, grammarAccess.getRecipientAccess().getRecipientTypeIndividualKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientType", lv_recipientType_16_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:938:8: lv_recipientType_16_2= 'Organization'
                    {
                    lv_recipientType_16_2=(Token)match(input,37,FOLLOW_37_in_ruleRecipient1910); 

                            newLeafNode(lv_recipientType_16_2, grammarAccess.getRecipientAccess().getRecipientTypeOrganizationKeyword_14_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientType", lv_recipientType_16_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:950:8: lv_recipientType_16_3= 'Individual/Organization'
                    {
                    lv_recipientType_16_3=(Token)match(input,38,FOLLOW_38_in_ruleRecipient1939); 

                            newLeafNode(lv_recipientType_16_3, grammarAccess.getRecipientAccess().getRecipientTypeIndividualOrganizationKeyword_14_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecipientRule());
                    	        }
                           		setWithLastConsumed(current, "recipientType", lv_recipientType_16_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRecipient1967); 

                	newLeafNode(otherlv_17, grammarAccess.getRecipientAccess().getRightCurlyBracketSemicolonKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecipient"


    // $ANTLR start "entryRulePrivateData"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:977:1: entryRulePrivateData returns [EObject current=null] : iv_rulePrivateData= rulePrivateData EOF ;
    public final EObject entryRulePrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateData = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:978:2: (iv_rulePrivateData= rulePrivateData EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:979:2: iv_rulePrivateData= rulePrivateData EOF
            {
             newCompositeNode(grammarAccess.getPrivateDataRule()); 
            pushFollow(FOLLOW_rulePrivateData_in_entryRulePrivateData2003);
            iv_rulePrivateData=rulePrivateData();

            state._fsp--;

             current =iv_rulePrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivateData2013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateData"


    // $ANTLR start "rulePrivateData"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:986:1: rulePrivateData returns [EObject current=null] : (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) ;
    public final EObject rulePrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_privatedata_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_PrivateDataKind_7_1=null;
        Token lv_PrivateDataKind_7_2=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attribute_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:989:28: ( (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:990:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:990:1: (otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:990:3: otherlv_0= 'PrivateData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_privatedata_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Type' ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) ) otherlv_8= ',' ( (lv_attribute_9_0= ruleAttribute ) )* otherlv_10= '};'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_rulePrivateData2050); 

                	newLeafNode(otherlv_0, grammarAccess.getPrivateDataAccess().getPrivateDataKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:994:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:995:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:995:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:996:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrivateData2067); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrivateDataAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrivateData2084); 

                	newLeafNode(otherlv_2, grammarAccess.getPrivateDataAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePrivateData2096); 

                	newLeafNode(otherlv_3, grammarAccess.getPrivateDataAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1020:1: ( (lv_privatedata_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1021:1: (lv_privatedata_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1021:1: (lv_privatedata_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1022:3: lv_privatedata_4_0= RULE_STRING
            {
            lv_privatedata_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrivateData2113); 

            			newLeafNode(lv_privatedata_4_0, grammarAccess.getPrivateDataAccess().getPrivatedataSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrivateDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"privatedata",
                    		lv_privatedata_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2130); 

                	newLeafNode(otherlv_5, grammarAccess.getPrivateDataAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePrivateData2142); 

                	newLeafNode(otherlv_6, grammarAccess.getPrivateDataAccess().getTypeKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1046:1: ( ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1047:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1047:1: ( (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1048:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1048:1: (lv_PrivateDataKind_7_1= 'PersonalInformation' | lv_PrivateDataKind_7_2= 'UsageInformation' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( (LA19_0==41) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1049:3: lv_PrivateDataKind_7_1= 'PersonalInformation'
                    {
                    lv_PrivateDataKind_7_1=(Token)match(input,40,FOLLOW_40_in_rulePrivateData2162); 

                            newLeafNode(lv_PrivateDataKind_7_1, grammarAccess.getPrivateDataAccess().getPrivateDataKindPersonalInformationKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "PrivateDataKind", lv_PrivateDataKind_7_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1061:8: lv_PrivateDataKind_7_2= 'UsageInformation'
                    {
                    lv_PrivateDataKind_7_2=(Token)match(input,41,FOLLOW_41_in_rulePrivateData2191); 

                            newLeafNode(lv_PrivateDataKind_7_2, grammarAccess.getPrivateDataAccess().getPrivateDataKindUsageInformationKeyword_7_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrivateDataRule());
                    	        }
                           		setWithLastConsumed(current, "PrivateDataKind", lv_PrivateDataKind_7_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_rulePrivateData2219); 

                	newLeafNode(otherlv_8, grammarAccess.getPrivateDataAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1080:1: ( (lv_attribute_9_0= ruleAttribute ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1081:1: (lv_attribute_9_0= ruleAttribute )
            	    {
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1081:1: (lv_attribute_9_0= ruleAttribute )
            	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1082:3: lv_attribute_9_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrivateDataAccess().getAttributeAttributeParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulePrivateData2240);
            	    lv_attribute_9_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrivateDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_9_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_rulePrivateData2253); 

                	newLeafNode(otherlv_10, grammarAccess.getPrivateDataAccess().getRightCurlyBracketSemicolonKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateData"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1110:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1111:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1112:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2289);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1119:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_attributeName_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1122:28: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1123:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1123:1: (otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1123:3: otherlv_0= 'Attribute' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_attributeName_3_0= RULE_STRING ) ) (otherlv_4= ',' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAttribute2336); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1127:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1128:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1128:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1129:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2353); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAttribute2370); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDescriptionKeyword_2());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1149:1: ( (lv_attributeName_3_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1150:1: (lv_attributeName_3_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1150:1: (lv_attributeName_3_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1151:3: lv_attributeName_3_0= RULE_STRING
            {
            lv_attributeName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2387); 

            			newLeafNode(lv_attributeName_3_0, grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attributeName",
                    		lv_attributeName_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1167:2: (otherlv_4= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1167:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAttribute2405); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCollection"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1179:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1180:2: (iv_ruleCollection= ruleCollection EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1181:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection2443);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection2453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1188:1: ruleCollection returns [EObject current=null] : (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_collectiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_collectioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_collectiondescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_collectioncondition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_modalitykind_19_1=null;
        Token lv_modalitykind_19_2=null;
        Token lv_modalitykind_19_3=null;
        Token otherlv_20=null;
        EObject lv_reftoPrivateData_10_0 = null;

        EObject lv_refertoservice_13_0 = null;

        EObject lv_refertoEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1191:28: ( (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_collectiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_collectioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1192:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_collectiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_collectioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1192:1: (otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_collectiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_collectioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1192:3: otherlv_0= 'Collection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_collectiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_collectioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCollection2490); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getCollectionKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1196:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1197:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1197:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1198:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollection2507); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCollectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCollection2524); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection2536); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1222:1: ( (lv_collectiondescription_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1223:1: (lv_collectiondescription_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1223:1: (lv_collectiondescription_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1224:3: lv_collectiondescription_4_0= RULE_STRING
            {
            lv_collectiondescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2553); 

            			newLeafNode(lv_collectiondescription_4_0, grammarAccess.getCollectionAccess().getCollectiondescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"collectiondescription",
                    		lv_collectiondescription_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCollection2570); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleCollection2582); 

                	newLeafNode(otherlv_6, grammarAccess.getCollectionAccess().getConditionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1248:1: ( (lv_collectioncondition_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1249:1: (lv_collectioncondition_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1249:1: (lv_collectioncondition_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1250:3: lv_collectioncondition_7_0= RULE_STRING
            {
            lv_collectioncondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCollection2599); 

            			newLeafNode(lv_collectioncondition_7_0, grammarAccess.getCollectionAccess().getCollectionconditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"collectioncondition",
                    		lv_collectioncondition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCollection2616); 

                	newLeafNode(otherlv_8, grammarAccess.getCollectionAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1270:1: (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1270:3: otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleCollection2629); 

                        	newLeafNode(otherlv_9, grammarAccess.getCollectionAccess().getRefersToPrivateDataKeyword_9_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1274:1: ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1275:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1275:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1276:3: lv_reftoPrivateData_10_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleCollection2650);
                    	    lv_reftoPrivateData_10_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_10_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCollection2663); 

                        	newLeafNode(otherlv_11, grammarAccess.getCollectionAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1296:3: (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1296:5: otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleCollection2678); 

                        	newLeafNode(otherlv_12, grammarAccess.getCollectionAccess().getRefersToServiceKeyword_10_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1300:1: ( (lv_refertoservice_13_0= ruleReferToService ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1301:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1301:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1302:3: lv_refertoservice_13_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoserviceReferToServiceParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleCollection2699);
                    	    lv_refertoservice_13_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_13_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleCollection2712); 

                        	newLeafNode(otherlv_14, grammarAccess.getCollectionAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1322:3: (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1322:5: otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleCollection2727); 

                        	newLeafNode(otherlv_15, grammarAccess.getCollectionAccess().getRefersToEnforcementKeyword_11_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1326:1: ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_ID) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1327:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1327:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1328:3: lv_refertoEnforcement_16_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCollectionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleCollection2748);
                    	    lv_refertoEnforcement_16_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_16_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleCollection2761); 

                        	newLeafNode(otherlv_17, grammarAccess.getCollectionAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleCollection2775); 

                	newLeafNode(otherlv_18, grammarAccess.getCollectionAccess().getModalityKeyword_12());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1352:1: ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1353:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1353:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1354:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1354:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 50:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1355:3: lv_modalitykind_19_1= 'Permitted'
                    {
                    lv_modalitykind_19_1=(Token)match(input,48,FOLLOW_48_in_ruleCollection2795); 

                            newLeafNode(lv_modalitykind_19_1, grammarAccess.getCollectionAccess().getModalitykindPermittedKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1367:8: lv_modalitykind_19_2= 'Obligation'
                    {
                    lv_modalitykind_19_2=(Token)match(input,49,FOLLOW_49_in_ruleCollection2824); 

                            newLeafNode(lv_modalitykind_19_2, grammarAccess.getCollectionAccess().getModalitykindObligationKeyword_13_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1379:8: lv_modalitykind_19_3= 'Forbidden'
                    {
                    lv_modalitykind_19_3=(Token)match(input,50,FOLLOW_50_in_ruleCollection2853); 

                            newLeafNode(lv_modalitykind_19_3, grammarAccess.getCollectionAccess().getModalitykindForbiddenKeyword_13_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleCollection2881); 

                	newLeafNode(otherlv_20, grammarAccess.getCollectionAccess().getRightCurlyBracketSemicolonKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleDisclosure"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1406:1: entryRuleDisclosure returns [EObject current=null] : iv_ruleDisclosure= ruleDisclosure EOF ;
    public final EObject entryRuleDisclosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisclosure = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1407:2: (iv_ruleDisclosure= ruleDisclosure EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1408:2: iv_ruleDisclosure= ruleDisclosure EOF
            {
             newCompositeNode(grammarAccess.getDisclosureRule()); 
            pushFollow(FOLLOW_ruleDisclosure_in_entryRuleDisclosure2917);
            iv_ruleDisclosure=ruleDisclosure();

            state._fsp--;

             current =iv_ruleDisclosure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisclosure2927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisclosure"


    // $ANTLR start "ruleDisclosure"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1415:1: ruleDisclosure returns [EObject current=null] : (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_didescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_discondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) ) otherlv_29= '};' ) ;
    public final EObject ruleDisclosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_didescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_discondition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_modalitykind_28_1=null;
        Token lv_modalitykind_28_2=null;
        Token lv_modalitykind_28_3=null;
        Token otherlv_29=null;
        EObject lv_referToRecipient_10_0 = null;

        EObject lv_referToRecipientsource_13_0 = null;

        EObject lv_referToRecipienttarget_16_0 = null;

        EObject lv_reftoPrivateData_19_0 = null;

        EObject lv_refertoservice_22_0 = null;

        EObject lv_refertoEnforcement_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1418:28: ( (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_didescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_discondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) ) otherlv_29= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1419:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_didescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_discondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) ) otherlv_29= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1419:1: (otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_didescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_discondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) ) otherlv_29= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1419:3: otherlv_0= 'Disclosure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_didescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_discondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )? (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )? (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )? otherlv_27= 'Modality' ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) ) otherlv_29= '};'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleDisclosure2964); 

                	newLeafNode(otherlv_0, grammarAccess.getDisclosureAccess().getDisclosureKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1424:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1424:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDisclosure2981); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDisclosureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDisclosure2998); 

                	newLeafNode(otherlv_2, grammarAccess.getDisclosureAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDisclosure3010); 

                	newLeafNode(otherlv_3, grammarAccess.getDisclosureAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1449:1: ( (lv_didescription_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1450:1: (lv_didescription_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1450:1: (lv_didescription_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1451:3: lv_didescription_4_0= RULE_STRING
            {
            lv_didescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3027); 

            			newLeafNode(lv_didescription_4_0, grammarAccess.getDisclosureAccess().getDidescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"didescription",
                    		lv_didescription_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3044); 

                	newLeafNode(otherlv_5, grammarAccess.getDisclosureAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleDisclosure3056); 

                	newLeafNode(otherlv_6, grammarAccess.getDisclosureAccess().getConditionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1475:1: ( (lv_discondition_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1476:1: (lv_discondition_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1476:1: (lv_discondition_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1477:3: lv_discondition_7_0= RULE_STRING
            {
            lv_discondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisclosure3073); 

            			newLeafNode(lv_discondition_7_0, grammarAccess.getDisclosureAccess().getDisconditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisclosureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"discondition",
                    		lv_discondition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3090); 

                	newLeafNode(otherlv_8, grammarAccess.getDisclosureAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1497:1: (otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1497:3: otherlv_9= 'RefersTo Recipient' ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_52_in_ruleDisclosure3103); 

                        	newLeafNode(otherlv_9, grammarAccess.getDisclosureAccess().getRefersToRecipientKeyword_9_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1501:1: ( (lv_referToRecipient_10_0= ruleReferToRecipient ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1502:1: (lv_referToRecipient_10_0= ruleReferToRecipient )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1502:1: (lv_referToRecipient_10_0= ruleReferToRecipient )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1503:3: lv_referToRecipient_10_0= ruleReferToRecipient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientReferToRecipientParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipient_in_ruleDisclosure3124);
                    	    lv_referToRecipient_10_0=ruleReferToRecipient();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipient",
                    	            		lv_referToRecipient_10_0, 
                    	            		"ReferToRecipient");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3137); 

                        	newLeafNode(otherlv_11, grammarAccess.getDisclosureAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1523:3: (otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1523:5: otherlv_12= 'RefersTo Recipient-Source' ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleDisclosure3152); 

                        	newLeafNode(otherlv_12, grammarAccess.getDisclosureAccess().getRefersToRecipientSourceKeyword_10_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1527:1: ( (lv_referToRecipientsource_13_0= ruleReferToRecipientSource ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1528:1: (lv_referToRecipientsource_13_0= ruleReferToRecipientSource )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1528:1: (lv_referToRecipientsource_13_0= ruleReferToRecipientSource )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1529:3: lv_referToRecipientsource_13_0= ruleReferToRecipientSource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipientsourceReferToRecipientSourceParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3173);
                    	    lv_referToRecipientsource_13_0=ruleReferToRecipientSource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipientsource",
                    	            		lv_referToRecipientsource_13_0, 
                    	            		"ReferToRecipientSource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3186); 

                        	newLeafNode(otherlv_14, grammarAccess.getDisclosureAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1549:3: (otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1549:5: otherlv_15= 'RefersTo Recipient-Target' ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleDisclosure3201); 

                        	newLeafNode(otherlv_15, grammarAccess.getDisclosureAccess().getRefersToRecipientTargetKeyword_11_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1553:1: ( (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1554:1: (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1554:1: (lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1555:3: lv_referToRecipienttarget_16_0= ruleReferToRecipientTarget
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReferToRecipienttargetReferToRecipientTargetParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3222);
                    	    lv_referToRecipienttarget_16_0=ruleReferToRecipientTarget();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"referToRecipienttarget",
                    	            		lv_referToRecipienttarget_16_0, 
                    	            		"ReferToRecipientTarget");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3235); 

                        	newLeafNode(otherlv_17, grammarAccess.getDisclosureAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1575:3: (otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1575:5: otherlv_18= 'RefersTo PrivateData' ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleDisclosure3250); 

                        	newLeafNode(otherlv_18, grammarAccess.getDisclosureAccess().getRefersToPrivateDataKeyword_12_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1579:1: ( (lv_reftoPrivateData_19_0= ruleReftoPrivateData ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1580:1: (lv_reftoPrivateData_19_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1580:1: (lv_reftoPrivateData_19_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1581:3: lv_reftoPrivateData_19_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleDisclosure3271);
                    	    lv_reftoPrivateData_19_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_19_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3284); 

                        	newLeafNode(otherlv_20, grammarAccess.getDisclosureAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1601:3: (otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1601:5: otherlv_21= 'RefersTo Service' ( (lv_refertoservice_22_0= ruleReferToService ) )* otherlv_23= ','
                    {
                    otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleDisclosure3299); 

                        	newLeafNode(otherlv_21, grammarAccess.getDisclosureAccess().getRefersToServiceKeyword_13_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1605:1: ( (lv_refertoservice_22_0= ruleReferToService ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1606:1: (lv_refertoservice_22_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1606:1: (lv_refertoservice_22_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1607:3: lv_refertoservice_22_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoserviceReferToServiceParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleDisclosure3320);
                    	    lv_refertoservice_22_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_22_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3333); 

                        	newLeafNode(otherlv_23, grammarAccess.getDisclosureAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1627:3: (otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1627:5: otherlv_24= 'RefersTo Enforcement' ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )* otherlv_26= ','
                    {
                    otherlv_24=(Token)match(input,46,FOLLOW_46_in_ruleDisclosure3348); 

                        	newLeafNode(otherlv_24, grammarAccess.getDisclosureAccess().getRefersToEnforcementKeyword_14_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1631:1: ( (lv_refertoEnforcement_25_0= ruleRefertoEnforcement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1632:1: (lv_refertoEnforcement_25_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1632:1: (lv_refertoEnforcement_25_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1633:3: lv_refertoEnforcement_25_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDisclosureAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3369);
                    	    lv_refertoEnforcement_25_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDisclosureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_25_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,19,FOLLOW_19_in_ruleDisclosure3382); 

                        	newLeafNode(otherlv_26, grammarAccess.getDisclosureAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,47,FOLLOW_47_in_ruleDisclosure3396); 

                	newLeafNode(otherlv_27, grammarAccess.getDisclosureAccess().getModalityKeyword_15());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1657:1: ( ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1658:1: ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1658:1: ( (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1659:1: (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1659:1: (lv_modalitykind_28_1= 'Permitted' | lv_modalitykind_28_2= 'Obligation' | lv_modalitykind_28_3= 'Forbidden' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt41=1;
                }
                break;
            case 49:
                {
                alt41=2;
                }
                break;
            case 50:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1660:3: lv_modalitykind_28_1= 'Permitted'
                    {
                    lv_modalitykind_28_1=(Token)match(input,48,FOLLOW_48_in_ruleDisclosure3416); 

                            newLeafNode(lv_modalitykind_28_1, grammarAccess.getDisclosureAccess().getModalitykindPermittedKeyword_16_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_28_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1672:8: lv_modalitykind_28_2= 'Obligation'
                    {
                    lv_modalitykind_28_2=(Token)match(input,49,FOLLOW_49_in_ruleDisclosure3445); 

                            newLeafNode(lv_modalitykind_28_2, grammarAccess.getDisclosureAccess().getModalitykindObligationKeyword_16_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_28_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1684:8: lv_modalitykind_28_3= 'Forbidden'
                    {
                    lv_modalitykind_28_3=(Token)match(input,50,FOLLOW_50_in_ruleDisclosure3474); 

                            newLeafNode(lv_modalitykind_28_3, grammarAccess.getDisclosureAccess().getModalitykindForbiddenKeyword_16_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDisclosureRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_28_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_29=(Token)match(input,13,FOLLOW_13_in_ruleDisclosure3502); 

                	newLeafNode(otherlv_29, grammarAccess.getDisclosureAccess().getRightCurlyBracketSemicolonKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisclosure"


    // $ANTLR start "entryRuleRetention"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1711:1: entryRuleRetention returns [EObject current=null] : iv_ruleRetention= ruleRetention EOF ;
    public final EObject entryRuleRetention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetention = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1712:2: (iv_ruleRetention= ruleRetention EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1713:2: iv_ruleRetention= ruleRetention EOF
            {
             newCompositeNode(grammarAccess.getRetentionRule()); 
            pushFollow(FOLLOW_ruleRetention_in_entryRuleRetention3538);
            iv_ruleRetention=ruleRetention();

            state._fsp--;

             current =iv_ruleRetention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRetention3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetention"


    // $ANTLR start "ruleRetention"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1720:1: ruleRetention returns [EObject current=null] : (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_retentiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_retentioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) otherlv_11= ',' (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) ;
    public final EObject ruleRetention() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_retentiondescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_retentioncondition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_period_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_modalitykind_22_1=null;
        Token lv_modalitykind_22_2=null;
        Token lv_modalitykind_22_3=null;
        Token otherlv_23=null;
        EObject lv_reftoPrivateData_13_0 = null;

        EObject lv_refertoservice_16_0 = null;

        EObject lv_refertoEnforcement_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1723:28: ( (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_retentiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_retentioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) otherlv_11= ',' (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1724:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_retentiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_retentioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) otherlv_11= ',' (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1724:1: (otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_retentiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_retentioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) otherlv_11= ',' (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1724:3: otherlv_0= 'Retention' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_retentiondescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_retentioncondition_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Period' ( (lv_period_10_0= RULE_STRING ) ) otherlv_11= ',' (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )? (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )? otherlv_21= 'Modality' ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) ) otherlv_23= '};'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleRetention3585); 

                	newLeafNode(otherlv_0, grammarAccess.getRetentionAccess().getRetentionKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1728:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1729:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1729:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1730:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRetention3602); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRetentionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRetention3619); 

                	newLeafNode(otherlv_2, grammarAccess.getRetentionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRetention3631); 

                	newLeafNode(otherlv_3, grammarAccess.getRetentionAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1754:1: ( (lv_retentiondescription_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1755:1: (lv_retentiondescription_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1755:1: (lv_retentiondescription_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1756:3: lv_retentiondescription_4_0= RULE_STRING
            {
            lv_retentiondescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3648); 

            			newLeafNode(lv_retentiondescription_4_0, grammarAccess.getRetentionAccess().getRetentiondescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"retentiondescription",
                    		lv_retentiondescription_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRetention3665); 

                	newLeafNode(otherlv_5, grammarAccess.getRetentionAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleRetention3677); 

                	newLeafNode(otherlv_6, grammarAccess.getRetentionAccess().getConditionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1780:1: ( (lv_retentioncondition_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1781:1: (lv_retentioncondition_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1781:1: (lv_retentioncondition_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1782:3: lv_retentioncondition_7_0= RULE_STRING
            {
            lv_retentioncondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3694); 

            			newLeafNode(lv_retentioncondition_7_0, grammarAccess.getRetentionAccess().getRetentionconditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"retentioncondition",
                    		lv_retentioncondition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRetention3711); 

                	newLeafNode(otherlv_8, grammarAccess.getRetentionAccess().getCommaKeyword_8());
                
            otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleRetention3723); 

                	newLeafNode(otherlv_9, grammarAccess.getRetentionAccess().getPeriodKeyword_9());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1806:1: ( (lv_period_10_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1807:1: (lv_period_10_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1807:1: (lv_period_10_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1808:3: lv_period_10_0= RULE_STRING
            {
            lv_period_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRetention3740); 

            			newLeafNode(lv_period_10_0, grammarAccess.getRetentionAccess().getPeriodSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRetentionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"period",
                    		lv_period_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleRetention3757); 

                	newLeafNode(otherlv_11, grammarAccess.getRetentionAccess().getCommaKeyword_11());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1828:1: (otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ',' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1828:3: otherlv_12= 'RefersTo PrivateData' ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleRetention3770); 

                        	newLeafNode(otherlv_12, grammarAccess.getRetentionAccess().getRefersToPrivateDataKeyword_12_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1832:1: ( (lv_reftoPrivateData_13_0= ruleReftoPrivateData ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1833:1: (lv_reftoPrivateData_13_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1833:1: (lv_reftoPrivateData_13_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1834:3: lv_reftoPrivateData_13_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleRetention3791);
                    	    lv_reftoPrivateData_13_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_13_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleRetention3804); 

                        	newLeafNode(otherlv_14, grammarAccess.getRetentionAccess().getCommaKeyword_12_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1854:3: (otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ',' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1854:5: otherlv_15= 'RefersTo Service' ( (lv_refertoservice_16_0= ruleReferToService ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_45_in_ruleRetention3819); 

                        	newLeafNode(otherlv_15, grammarAccess.getRetentionAccess().getRefersToServiceKeyword_13_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1858:1: ( (lv_refertoservice_16_0= ruleReferToService ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1859:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1859:1: (lv_refertoservice_16_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1860:3: lv_refertoservice_16_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoserviceReferToServiceParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleRetention3840);
                    	    lv_refertoservice_16_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_16_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleRetention3853); 

                        	newLeafNode(otherlv_17, grammarAccess.getRetentionAccess().getCommaKeyword_13_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1880:3: (otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ',' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1880:5: otherlv_18= 'RefersTo Enforcement' ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )* otherlv_20= ','
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_46_in_ruleRetention3868); 

                        	newLeafNode(otherlv_18, grammarAccess.getRetentionAccess().getRefersToEnforcementKeyword_14_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1884:1: ( (lv_refertoEnforcement_19_0= ruleRefertoEnforcement ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1885:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1885:1: (lv_refertoEnforcement_19_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1886:3: lv_refertoEnforcement_19_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRetentionAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleRetention3889);
                    	    lv_refertoEnforcement_19_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRetentionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_19_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleRetention3902); 

                        	newLeafNode(otherlv_20, grammarAccess.getRetentionAccess().getCommaKeyword_14_2());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleRetention3916); 

                	newLeafNode(otherlv_21, grammarAccess.getRetentionAccess().getModalityKeyword_15());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1910:1: ( ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1911:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1911:1: ( (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1912:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1912:1: (lv_modalitykind_22_1= 'Permitted' | lv_modalitykind_22_2= 'Obligation' | lv_modalitykind_22_3= 'Forbidden' )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt48=1;
                }
                break;
            case 49:
                {
                alt48=2;
                }
                break;
            case 50:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1913:3: lv_modalitykind_22_1= 'Permitted'
                    {
                    lv_modalitykind_22_1=(Token)match(input,48,FOLLOW_48_in_ruleRetention3936); 

                            newLeafNode(lv_modalitykind_22_1, grammarAccess.getRetentionAccess().getModalitykindPermittedKeyword_16_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1925:8: lv_modalitykind_22_2= 'Obligation'
                    {
                    lv_modalitykind_22_2=(Token)match(input,49,FOLLOW_49_in_ruleRetention3965); 

                            newLeafNode(lv_modalitykind_22_2, grammarAccess.getRetentionAccess().getModalitykindObligationKeyword_16_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1937:8: lv_modalitykind_22_3= 'Forbidden'
                    {
                    lv_modalitykind_22_3=(Token)match(input,50,FOLLOW_50_in_ruleRetention3994); 

                            newLeafNode(lv_modalitykind_22_3, grammarAccess.getRetentionAccess().getModalitykindForbiddenKeyword_16_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRetentionRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_22_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleRetention4022); 

                	newLeafNode(otherlv_23, grammarAccess.getRetentionAccess().getRightCurlyBracketSemicolonKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetention"


    // $ANTLR start "entryRuleUsage"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1964:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1965:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1966:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage4058);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage4068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1973:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_usagedescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_usagecondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_usagedescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_usagecondition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_modalitykind_19_1=null;
        Token lv_modalitykind_19_2=null;
        Token lv_modalitykind_19_3=null;
        Token otherlv_20=null;
        EObject lv_reftoPrivateData_10_0 = null;

        EObject lv_refertoservice_13_0 = null;

        EObject lv_refertoEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1976:28: ( (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_usagedescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_usagecondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1977:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_usagedescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_usagecondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1977:1: (otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_usagedescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_usagecondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1977:3: otherlv_0= 'Usage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_usagedescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_usagecondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleUsage4105); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1981:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1982:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1982:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:1983:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage4122); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUsageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUsage4139); 

                	newLeafNode(otherlv_2, grammarAccess.getUsageAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleUsage4151); 

                	newLeafNode(otherlv_3, grammarAccess.getUsageAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2007:1: ( (lv_usagedescription_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2008:1: (lv_usagedescription_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2008:1: (lv_usagedescription_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2009:3: lv_usagedescription_4_0= RULE_STRING
            {
            lv_usagedescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4168); 

            			newLeafNode(lv_usagedescription_4_0, grammarAccess.getUsageAccess().getUsagedescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"usagedescription",
                    		lv_usagedescription_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUsage4185); 

                	newLeafNode(otherlv_5, grammarAccess.getUsageAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleUsage4197); 

                	newLeafNode(otherlv_6, grammarAccess.getUsageAccess().getConditionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2033:1: ( (lv_usagecondition_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2034:1: (lv_usagecondition_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2034:1: (lv_usagecondition_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2035:3: lv_usagecondition_7_0= RULE_STRING
            {
            lv_usagecondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUsage4214); 

            			newLeafNode(lv_usagecondition_7_0, grammarAccess.getUsageAccess().getUsageconditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"usagecondition",
                    		lv_usagecondition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleUsage4231); 

                	newLeafNode(otherlv_8, grammarAccess.getUsageAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2055:1: (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2055:3: otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleUsage4244); 

                        	newLeafNode(otherlv_9, grammarAccess.getUsageAccess().getRefersToPrivateDataKeyword_9_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2059:1: ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2060:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2060:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2061:3: lv_reftoPrivateData_10_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleUsage4265);
                    	    lv_reftoPrivateData_10_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_10_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleUsage4278); 

                        	newLeafNode(otherlv_11, grammarAccess.getUsageAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2081:3: (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==45) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2081:5: otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleUsage4293); 

                        	newLeafNode(otherlv_12, grammarAccess.getUsageAccess().getRefersToServiceKeyword_10_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2085:1: ( (lv_refertoservice_13_0= ruleReferToService ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2086:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2086:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2087:3: lv_refertoservice_13_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoserviceReferToServiceParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleUsage4314);
                    	    lv_refertoservice_13_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_13_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleUsage4327); 

                        	newLeafNode(otherlv_14, grammarAccess.getUsageAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2107:3: (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2107:5: otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleUsage4342); 

                        	newLeafNode(otherlv_15, grammarAccess.getUsageAccess().getRefersToEnforcementKeyword_11_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2111:1: ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2112:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2112:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2113:3: lv_refertoEnforcement_16_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUsageAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleUsage4363);
                    	    lv_refertoEnforcement_16_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUsageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_16_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleUsage4376); 

                        	newLeafNode(otherlv_17, grammarAccess.getUsageAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleUsage4390); 

                	newLeafNode(otherlv_18, grammarAccess.getUsageAccess().getModalityKeyword_12());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2137:1: ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2138:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2138:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2139:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2139:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt55=1;
                }
                break;
            case 49:
                {
                alt55=2;
                }
                break;
            case 50:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2140:3: lv_modalitykind_19_1= 'Permitted'
                    {
                    lv_modalitykind_19_1=(Token)match(input,48,FOLLOW_48_in_ruleUsage4410); 

                            newLeafNode(lv_modalitykind_19_1, grammarAccess.getUsageAccess().getModalitykindPermittedKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2152:8: lv_modalitykind_19_2= 'Obligation'
                    {
                    lv_modalitykind_19_2=(Token)match(input,49,FOLLOW_49_in_ruleUsage4439); 

                            newLeafNode(lv_modalitykind_19_2, grammarAccess.getUsageAccess().getModalitykindObligationKeyword_13_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2164:8: lv_modalitykind_19_3= 'Forbidden'
                    {
                    lv_modalitykind_19_3=(Token)match(input,50,FOLLOW_50_in_ruleUsage4468); 

                            newLeafNode(lv_modalitykind_19_3, grammarAccess.getUsageAccess().getModalitykindForbiddenKeyword_13_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUsageRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleUsage4496); 

                	newLeafNode(otherlv_20, grammarAccess.getUsageAccess().getRightCurlyBracketSemicolonKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleInformative"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2191:1: entryRuleInformative returns [EObject current=null] : iv_ruleInformative= ruleInformative EOF ;
    public final EObject entryRuleInformative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformative = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2192:2: (iv_ruleInformative= ruleInformative EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2193:2: iv_ruleInformative= ruleInformative EOF
            {
             newCompositeNode(grammarAccess.getInformativeRule()); 
            pushFollow(FOLLOW_ruleInformative_in_entryRuleInformative4532);
            iv_ruleInformative=ruleInformative();

            state._fsp--;

             current =iv_ruleInformative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformative4542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInformative"


    // $ANTLR start "ruleInformative"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2200:1: ruleInformative returns [EObject current=null] : (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_infdescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_infcondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) ;
    public final EObject ruleInformative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_infdescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_infcondition_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_modalitykind_19_1=null;
        Token lv_modalitykind_19_2=null;
        Token lv_modalitykind_19_3=null;
        Token otherlv_20=null;
        EObject lv_reftoPrivateData_10_0 = null;

        EObject lv_refertoservice_13_0 = null;

        EObject lv_refertoEnforcement_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2203:28: ( (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_infdescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_infcondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2204:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_infdescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_infcondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2204:1: (otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_infdescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_infcondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};' )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2204:3: otherlv_0= 'Informative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Description' ( (lv_infdescription_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Condition' ( (lv_infcondition_7_0= RULE_STRING ) ) otherlv_8= ',' (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )? (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )? (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )? otherlv_18= 'Modality' ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) ) otherlv_20= '};'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleInformative4579); 

                	newLeafNode(otherlv_0, grammarAccess.getInformativeAccess().getInformativeKeyword_0());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2209:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2209:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformative4596); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInformativeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInformative4613); 

                	newLeafNode(otherlv_2, grammarAccess.getInformativeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInformative4625); 

                	newLeafNode(otherlv_3, grammarAccess.getInformativeAccess().getDescriptionKeyword_3());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2234:1: ( (lv_infdescription_4_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2235:1: (lv_infdescription_4_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2235:1: (lv_infdescription_4_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2236:3: lv_infdescription_4_0= RULE_STRING
            {
            lv_infdescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4642); 

            			newLeafNode(lv_infdescription_4_0, grammarAccess.getInformativeAccess().getInfdescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"infdescription",
                    		lv_infdescription_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInformative4659); 

                	newLeafNode(otherlv_5, grammarAccess.getInformativeAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleInformative4671); 

                	newLeafNode(otherlv_6, grammarAccess.getInformativeAccess().getConditionKeyword_6());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2260:1: ( (lv_infcondition_7_0= RULE_STRING ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2261:1: (lv_infcondition_7_0= RULE_STRING )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2261:1: (lv_infcondition_7_0= RULE_STRING )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2262:3: lv_infcondition_7_0= RULE_STRING
            {
            lv_infcondition_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInformative4688); 

            			newLeafNode(lv_infcondition_7_0, grammarAccess.getInformativeAccess().getInfconditionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"infcondition",
                    		lv_infcondition_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleInformative4705); 

                	newLeafNode(otherlv_8, grammarAccess.getInformativeAccess().getCommaKeyword_8());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2282:1: (otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ',' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2282:3: otherlv_9= 'RefersTo PrivateData' ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )* otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleInformative4718); 

                        	newLeafNode(otherlv_9, grammarAccess.getInformativeAccess().getRefersToPrivateDataKeyword_9_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2286:1: ( (lv_reftoPrivateData_10_0= ruleReftoPrivateData ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ID) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2287:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2287:1: (lv_reftoPrivateData_10_0= ruleReftoPrivateData )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2288:3: lv_reftoPrivateData_10_0= ruleReftoPrivateData
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getReftoPrivateDataReftoPrivateDataParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReftoPrivateData_in_ruleInformative4739);
                    	    lv_reftoPrivateData_10_0=ruleReftoPrivateData();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reftoPrivateData",
                    	            		lv_reftoPrivateData_10_0, 
                    	            		"ReftoPrivateData");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleInformative4752); 

                        	newLeafNode(otherlv_11, grammarAccess.getInformativeAccess().getCommaKeyword_9_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2308:3: (otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ',' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==45) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2308:5: otherlv_12= 'RefersTo Service' ( (lv_refertoservice_13_0= ruleReferToService ) )* otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleInformative4767); 

                        	newLeafNode(otherlv_12, grammarAccess.getInformativeAccess().getRefersToServiceKeyword_10_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2312:1: ( (lv_refertoservice_13_0= ruleReferToService ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_ID) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2313:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2313:1: (lv_refertoservice_13_0= ruleReferToService )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2314:3: lv_refertoservice_13_0= ruleReferToService
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoserviceReferToServiceParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReferToService_in_ruleInformative4788);
                    	    lv_refertoservice_13_0=ruleReferToService();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoservice",
                    	            		lv_refertoservice_13_0, 
                    	            		"ReferToService");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleInformative4801); 

                        	newLeafNode(otherlv_14, grammarAccess.getInformativeAccess().getCommaKeyword_10_2());
                        

                    }
                    break;

            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2334:3: (otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ',' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2334:5: otherlv_15= 'RefersTo Enforcement' ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )* otherlv_17= ','
                    {
                    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleInformative4816); 

                        	newLeafNode(otherlv_15, grammarAccess.getInformativeAccess().getRefersToEnforcementKeyword_11_0());
                        
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2338:1: ( (lv_refertoEnforcement_16_0= ruleRefertoEnforcement ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2339:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    {
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2339:1: (lv_refertoEnforcement_16_0= ruleRefertoEnforcement )
                    	    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2340:3: lv_refertoEnforcement_16_0= ruleRefertoEnforcement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformativeAccess().getRefertoEnforcementRefertoEnforcementParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRefertoEnforcement_in_ruleInformative4837);
                    	    lv_refertoEnforcement_16_0=ruleRefertoEnforcement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformativeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"refertoEnforcement",
                    	            		lv_refertoEnforcement_16_0, 
                    	            		"RefertoEnforcement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleInformative4850); 

                        	newLeafNode(otherlv_17, grammarAccess.getInformativeAccess().getCommaKeyword_11_2());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,47,FOLLOW_47_in_ruleInformative4864); 

                	newLeafNode(otherlv_18, grammarAccess.getInformativeAccess().getModalityKeyword_12());
                
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2364:1: ( ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2365:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2365:1: ( (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2366:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2366:1: (lv_modalitykind_19_1= 'Permitted' | lv_modalitykind_19_2= 'Obligation' | lv_modalitykind_19_3= 'Forbidden' )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt62=1;
                }
                break;
            case 49:
                {
                alt62=2;
                }
                break;
            case 50:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2367:3: lv_modalitykind_19_1= 'Permitted'
                    {
                    lv_modalitykind_19_1=(Token)match(input,48,FOLLOW_48_in_ruleInformative4884); 

                            newLeafNode(lv_modalitykind_19_1, grammarAccess.getInformativeAccess().getModalitykindPermittedKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2379:8: lv_modalitykind_19_2= 'Obligation'
                    {
                    lv_modalitykind_19_2=(Token)match(input,49,FOLLOW_49_in_ruleInformative4913); 

                            newLeafNode(lv_modalitykind_19_2, grammarAccess.getInformativeAccess().getModalitykindObligationKeyword_13_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2391:8: lv_modalitykind_19_3= 'Forbidden'
                    {
                    lv_modalitykind_19_3=(Token)match(input,50,FOLLOW_50_in_ruleInformative4942); 

                            newLeafNode(lv_modalitykind_19_3, grammarAccess.getInformativeAccess().getModalitykindForbiddenKeyword_13_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInformativeRule());
                    	        }
                           		setWithLastConsumed(current, "modalitykind", lv_modalitykind_19_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_13_in_ruleInformative4970); 

                	newLeafNode(otherlv_20, grammarAccess.getInformativeAccess().getRightCurlyBracketSemicolonKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInformative"


    // $ANTLR start "entryRulePartof"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2418:1: entryRulePartof returns [EObject current=null] : iv_rulePartof= rulePartof EOF ;
    public final EObject entryRulePartof() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartof = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2419:2: (iv_rulePartof= rulePartof EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2420:2: iv_rulePartof= rulePartof EOF
            {
             newCompositeNode(grammarAccess.getPartofRule()); 
            pushFollow(FOLLOW_rulePartof_in_entryRulePartof5006);
            iv_rulePartof=rulePartof();

            state._fsp--;

             current =iv_rulePartof; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartof5016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartof"


    // $ANTLR start "rulePartof"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2427:1: rulePartof returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject rulePartof() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2430:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2431:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2431:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2431:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2431:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2432:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2432:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2433:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartofRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPartofAccess().getPartofRecipientCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePartof5064);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2446:2: (otherlv_1= '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==59) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2446:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_rulePartof5077); 

                        	newLeafNode(otherlv_1, grammarAccess.getPartofAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartof"


    // $ANTLR start "entryRuleReferToRecipient"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2458:1: entryRuleReferToRecipient returns [EObject current=null] : iv_ruleReferToRecipient= ruleReferToRecipient EOF ;
    public final EObject entryRuleReferToRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipient = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2459:2: (iv_ruleReferToRecipient= ruleReferToRecipient EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2460:2: iv_ruleReferToRecipient= ruleReferToRecipient EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientRule()); 
            pushFollow(FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5115);
            iv_ruleReferToRecipient=ruleReferToRecipient();

            state._fsp--;

             current =iv_ruleReferToRecipient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipient5125); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferToRecipient"


    // $ANTLR start "ruleReferToRecipient"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2467:1: ruleReferToRecipient returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2470:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2471:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2471:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2471:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2471:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2472:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2472:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2473:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferToRecipientAccess().getRefertoreRecipientCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferToRecipient5173);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2486:2: (otherlv_1= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2486:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleReferToRecipient5186); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferToRecipient"


    // $ANTLR start "entryRuleReferToRecipientSource"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2498:1: entryRuleReferToRecipientSource returns [EObject current=null] : iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF ;
    public final EObject entryRuleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientSource = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2499:2: (iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2500:2: iv_ruleReferToRecipientSource= ruleReferToRecipientSource EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientSourceRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5224);
            iv_ruleReferToRecipientSource=ruleReferToRecipientSource();

            state._fsp--;

             current =iv_ruleReferToRecipientSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientSource5234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferToRecipientSource"


    // $ANTLR start "ruleReferToRecipientSource"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2507:1: ruleReferToRecipientSource returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2510:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2511:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2511:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2511:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2511:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2512:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2512:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2513:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientSourceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferToRecipientSourceAccess().getRefertoreRecipientCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferToRecipientSource5282);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2526:2: (otherlv_1= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2526:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleReferToRecipientSource5295); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientSourceAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferToRecipientSource"


    // $ANTLR start "entryRuleReferToRecipientTarget"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2538:1: entryRuleReferToRecipientTarget returns [EObject current=null] : iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF ;
    public final EObject entryRuleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToRecipientTarget = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2539:2: (iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2540:2: iv_ruleReferToRecipientTarget= ruleReferToRecipientTarget EOF
            {
             newCompositeNode(grammarAccess.getReferToRecipientTargetRule()); 
            pushFollow(FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5333);
            iv_ruleReferToRecipientTarget=ruleReferToRecipientTarget();

            state._fsp--;

             current =iv_ruleReferToRecipientTarget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToRecipientTarget5343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferToRecipientTarget"


    // $ANTLR start "ruleReferToRecipientTarget"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2547:1: ruleReferToRecipientTarget returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToRecipientTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2550:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2551:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2551:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2551:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2551:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2552:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2552:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2553:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToRecipientTargetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferToRecipientTargetAccess().getRefertoreRecipientCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferToRecipientTarget5391);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2566:2: (otherlv_1= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2566:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleReferToRecipientTarget5404); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToRecipientTargetAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferToRecipientTarget"


    // $ANTLR start "entryRuleReferToService"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2578:1: entryRuleReferToService returns [EObject current=null] : iv_ruleReferToService= ruleReferToService EOF ;
    public final EObject entryRuleReferToService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferToService = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2579:2: (iv_ruleReferToService= ruleReferToService EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2580:2: iv_ruleReferToService= ruleReferToService EOF
            {
             newCompositeNode(grammarAccess.getReferToServiceRule()); 
            pushFollow(FOLLOW_ruleReferToService_in_entryRuleReferToService5442);
            iv_ruleReferToService=ruleReferToService();

            state._fsp--;

             current =iv_ruleReferToService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferToService5452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferToService"


    // $ANTLR start "ruleReferToService"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2587:1: ruleReferToService returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReferToService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2590:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2591:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2591:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2591:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2591:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2592:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2592:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2593:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferToServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferToServiceAccess().getRefertoseServiceCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferToService5500);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2606:2: (otherlv_1= '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==59) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2606:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleReferToService5513); 

                        	newLeafNode(otherlv_1, grammarAccess.getReferToServiceAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferToService"


    // $ANTLR start "entryRuleReftoPrivateData"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2618:1: entryRuleReftoPrivateData returns [EObject current=null] : iv_ruleReftoPrivateData= ruleReftoPrivateData EOF ;
    public final EObject entryRuleReftoPrivateData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReftoPrivateData = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2619:2: (iv_ruleReftoPrivateData= ruleReftoPrivateData EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2620:2: iv_ruleReftoPrivateData= ruleReftoPrivateData EOF
            {
             newCompositeNode(grammarAccess.getReftoPrivateDataRule()); 
            pushFollow(FOLLOW_ruleReftoPrivateData_in_entryRuleReftoPrivateData5551);
            iv_ruleReftoPrivateData=ruleReftoPrivateData();

            state._fsp--;

             current =iv_ruleReftoPrivateData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReftoPrivateData5561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReftoPrivateData"


    // $ANTLR start "ruleReftoPrivateData"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2627:1: ruleReftoPrivateData returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleReftoPrivateData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2630:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2631:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2631:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2631:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2631:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2632:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2632:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2633:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReftoPrivateDataRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReftoPrivateDataAccess().getRefprPrivateDataCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReftoPrivateData5609);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2646:2: (otherlv_1= '-' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==59) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2646:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleReftoPrivateData5622); 

                        	newLeafNode(otherlv_1, grammarAccess.getReftoPrivateDataAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReftoPrivateData"


    // $ANTLR start "entryRuleRefertoEnforcement"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2658:1: entryRuleRefertoEnforcement returns [EObject current=null] : iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF ;
    public final EObject entryRuleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefertoEnforcement = null;


        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2659:2: (iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2660:2: iv_ruleRefertoEnforcement= ruleRefertoEnforcement EOF
            {
             newCompositeNode(grammarAccess.getRefertoEnforcementRule()); 
            pushFollow(FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5660);
            iv_ruleRefertoEnforcement=ruleRefertoEnforcement();

            state._fsp--;

             current =iv_ruleRefertoEnforcement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefertoEnforcement5670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefertoEnforcement"


    // $ANTLR start "ruleRefertoEnforcement"
    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2667:1: ruleRefertoEnforcement returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) ;
    public final EObject ruleRefertoEnforcement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2670:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2671:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2671:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '-' )? )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2671:2: ( ( ruleQualifiedName ) ) (otherlv_1= '-' )?
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2671:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2672:1: ( ruleQualifiedName )
            {
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2672:1: ( ruleQualifiedName )
            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2673:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefertoEnforcementRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRefertoEnforcementAccess().getRefenEnforcementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRefertoEnforcement5718);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2686:2: (otherlv_1= '-' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==59) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.rslilconvertors.rslil4privacy/src-gen/org/xtext/rslilconvertors/rslil4privacy/parser/antlr/internal/InternalRslil4privacy.g:2686:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleRefertoEnforcement5731); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefertoEnforcementAccess().getHyphenMinusKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefertoEnforcement"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolicy122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePolicy143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy155 = new BitSet(new long[]{0x068808804802A000L});
    public static final BitSet FOLLOW_ruleImport_in_rulePolicy176 = new BitSet(new long[]{0x068808804802A000L});
    public static final BitSet FOLLOW_ruleCollection_in_rulePolicy199 = new BitSet(new long[]{0x0688088048022000L});
    public static final BitSet FOLLOW_ruleDisclosure_in_rulePolicy226 = new BitSet(new long[]{0x0688088048022000L});
    public static final BitSet FOLLOW_ruleRetention_in_rulePolicy253 = new BitSet(new long[]{0x0688088048022000L});
    public static final BitSet FOLLOW_ruleUsage_in_rulePolicy280 = new BitSet(new long[]{0x0688088048022000L});
    public static final BitSet FOLLOW_ruleInformative_in_rulePolicy307 = new BitSet(new long[]{0x0688088048022000L});
    public static final BitSet FOLLOW_rulePrivateData_in_rulePolicy330 = new BitSet(new long[]{0x0000008048022000L});
    public static final BitSet FOLLOW_ruleRecipient_in_rulePolicy352 = new BitSet(new long[]{0x0000000048022000L});
    public static final BitSet FOLLOW_ruleService_in_rulePolicy374 = new BitSet(new long[]{0x0000000008022000L});
    public static final BitSet FOLLOW_ruleEnforcement_in_rulePolicy396 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_rulePolicy409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName497 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName531 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard741 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnforcement_in_entryRuleEnforcement802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnforcement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEnforcement849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnforcement866 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnforcement883 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnforcement895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement929 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnforcement941 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnforcement958 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnforcement975 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnforcement987 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_22_in_ruleEnforcement1007 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleEnforcement1036 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24_in_ruleEnforcement1065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25_in_ruleEnforcement1094 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26_in_ruleEnforcement1123 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnforcement1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleService1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleService1268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleService1280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService1314 = new BitSet(new long[]{0x0000000030102000L});
    public static final BitSet FOLLOW_20_in_ruleService1327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService1344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService1361 = new BitSet(new long[]{0x0000000030002000L});
    public static final BitSet FOLLOW_28_in_ruleService1376 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleService1397 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleService1410 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_29_in_ruleService1425 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleService1446 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleService1459 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecipient_in_entryRuleRecipient1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecipient1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRecipient1556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecipient1573 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecipient1590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecipient1602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1636 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecipient1648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRecipient1665 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1682 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleRecipient1695 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulePartof_in_ruleRecipient1716 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1729 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRecipient1743 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_ruleRecipient1763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34_in_ruleRecipient1792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_35_in_ruleRecipient1821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecipient1849 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRecipient1861 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ruleRecipient1881 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_37_in_ruleRecipient1910 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38_in_ruleRecipient1939 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRecipient1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivateData_in_entryRulePrivateData2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivateData2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrivateData2050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrivateData2067 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrivateData2084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrivateData2096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrivateData2113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2130 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrivateData2142 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_rulePrivateData2162 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_41_in_rulePrivateData2191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrivateData2219 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePrivateData2240 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_rulePrivateData2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttribute2336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2353 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute2370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2387 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection2443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCollection2490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollection2507 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCollection2524 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCollection2536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2570 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCollection2582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCollection2599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCollection2616 = new BitSet(new long[]{0x0000E00010000000L});
    public static final BitSet FOLLOW_28_in_ruleCollection2629 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleCollection2650 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2663 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleCollection2678 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleCollection2699 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2712 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleCollection2727 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleCollection2748 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleCollection2761 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCollection2775 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCollection2795 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_49_in_ruleCollection2824 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleCollection2853 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCollection2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisclosure_in_entryRuleDisclosure2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisclosure2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDisclosure2964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDisclosure2981 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDisclosure2998 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDisclosure3010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3044 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDisclosure3056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisclosure3073 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3090 = new BitSet(new long[]{0x0070E00010000000L});
    public static final BitSet FOLLOW_52_in_ruleDisclosure3103 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_ruleDisclosure3124 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3137 = new BitSet(new long[]{0x0060E00010000000L});
    public static final BitSet FOLLOW_53_in_ruleDisclosure3152 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_ruleDisclosure3173 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3186 = new BitSet(new long[]{0x0040E00010000000L});
    public static final BitSet FOLLOW_54_in_ruleDisclosure3201 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_ruleDisclosure3222 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3235 = new BitSet(new long[]{0x0000E00010000000L});
    public static final BitSet FOLLOW_28_in_ruleDisclosure3250 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleDisclosure3271 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3284 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleDisclosure3299 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleDisclosure3320 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3333 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleDisclosure3348 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleDisclosure3369 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleDisclosure3382 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDisclosure3396 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_48_in_ruleDisclosure3416 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_49_in_ruleDisclosure3445 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleDisclosure3474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDisclosure3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRetention_in_entryRuleRetention3538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRetention3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRetention3585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRetention3602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRetention3619 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRetention3631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3648 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3665 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleRetention3677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3711 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleRetention3723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRetention3740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRetention3757 = new BitSet(new long[]{0x0000E00010000000L});
    public static final BitSet FOLLOW_28_in_ruleRetention3770 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleRetention3791 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3804 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleRetention3819 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleRetention3840 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3853 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleRetention3868 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleRetention3889 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRetention3902 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRetention3916 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_48_in_ruleRetention3936 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_49_in_ruleRetention3965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleRetention3994 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRetention4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage4058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUsage4105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage4122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUsage4139 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUsage4151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4168 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4185 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUsage4197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUsage4214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUsage4231 = new BitSet(new long[]{0x0000E00010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsage4244 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleUsage4265 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4278 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleUsage4293 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleUsage4314 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4327 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleUsage4342 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleUsage4363 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleUsage4376 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUsage4390 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_48_in_ruleUsage4410 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_49_in_ruleUsage4439 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleUsage4468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUsage4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformative_in_entryRuleInformative4532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformative4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInformative4579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformative4596 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInformative4613 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInformative4625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4642 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4659 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleInformative4671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInformative4688 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInformative4705 = new BitSet(new long[]{0x0000E00010000000L});
    public static final BitSet FOLLOW_28_in_ruleInformative4718 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_ruleInformative4739 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative4752 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleInformative4767 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleReferToService_in_ruleInformative4788 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative4801 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleInformative4816 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_ruleInformative4837 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleInformative4850 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleInformative4864 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInformative4884 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_49_in_ruleInformative4913 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_50_in_ruleInformative4942 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInformative4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartof_in_entryRulePartof5006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartof5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartof5064 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_rulePartof5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipient_in_entryRuleReferToRecipient5115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipient5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferToRecipient5173 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReferToRecipient5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientSource_in_entryRuleReferToRecipientSource5224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientSource5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferToRecipientSource5282 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReferToRecipientSource5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToRecipientTarget_in_entryRuleReferToRecipientTarget5333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToRecipientTarget5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferToRecipientTarget5391 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReferToRecipientTarget5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferToService_in_entryRuleReferToService5442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferToService5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferToService5500 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReferToService5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReftoPrivateData_in_entryRuleReftoPrivateData5551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReftoPrivateData5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReftoPrivateData5609 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReftoPrivateData5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefertoEnforcement_in_entryRuleRefertoEnforcement5660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefertoEnforcement5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRefertoEnforcement5718 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRefertoEnforcement5731 = new BitSet(new long[]{0x0000000000000002L});

}