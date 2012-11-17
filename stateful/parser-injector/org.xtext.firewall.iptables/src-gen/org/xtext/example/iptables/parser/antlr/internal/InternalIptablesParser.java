package org.xtext.example.iptables.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.iptables.services.IptablesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIptablesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'iptables'", "'-A'", "'-D'", "'-P'", "'-s'", "'-i'", "'-d'", "'-p'", "'--sport'", "'--dport'", "'!'", "'--syn'", "'--m'", "'--ctstate'", "','", "'--ctdir'", "'--ctstatus'", "'--state'", "'--tcp-flags'", "'-j'", "'--log-prefix'", "'conntrack'", "'State'", "'NEW'", "'NONE'", "'SYN_SENT'", "'SYN_RECV'", "'ESTABLISHED'", "'FIN_WAIT'", "'CLOSE_WAIT'", "'LAST_ACK'", "'TIME_WAIT'", "'CLOSE'", "'SYN'", "'ACK'", "'FIN'", "'RST'", "'ALL'", "'tcp'", "'udp'", "'icmp'", "'-N'", "'.'", "'/'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__19=19;
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
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=6;
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


        public InternalIptablesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIptablesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIptablesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g"; }



     	private IptablesGrammarAccess grammarAccess;
     	
        public InternalIptablesParser(TokenStream input, IptablesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected IptablesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:76:1: ruleModel returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:79:28: ( ( (lv_rules_0_0= ruleRule ) )* )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:80:1: ( (lv_rules_0_0= ruleRule ) )*
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:80:1: ( (lv_rules_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:81:1: (lv_rules_0_0= ruleRule )
            	    {
            	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:81:1: (lv_rules_0_0= ruleRule )
            	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:82:3: lv_rules_0_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleModel130);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_0_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:106:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:107:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:108:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule166);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule176); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:115:1: ruleRule returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleChainDeclaration ) ) | ( (lv_filter_1_0= ruleFilterDeclaration ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:118:28: ( ( ( (lv_declaration_0_0= ruleChainDeclaration ) ) | ( (lv_filter_1_0= ruleFilterDeclaration ) ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:119:1: ( ( (lv_declaration_0_0= ruleChainDeclaration ) ) | ( (lv_filter_1_0= ruleFilterDeclaration ) ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:119:1: ( ( (lv_declaration_0_0= ruleChainDeclaration ) ) | ( (lv_filter_1_0= ruleFilterDeclaration ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=12 && LA2_1<=14)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==52) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:119:2: ( (lv_declaration_0_0= ruleChainDeclaration ) )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:119:2: ( (lv_declaration_0_0= ruleChainDeclaration ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:120:1: (lv_declaration_0_0= ruleChainDeclaration )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:120:1: (lv_declaration_0_0= ruleChainDeclaration )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:121:3: lv_declaration_0_0= ruleChainDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getDeclarationChainDeclarationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChainDeclaration_in_ruleRule222);
                    lv_declaration_0_0=ruleChainDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"declaration",
                            		lv_declaration_0_0, 
                            		"ChainDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:138:6: ( (lv_filter_1_0= ruleFilterDeclaration ) )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:138:6: ( (lv_filter_1_0= ruleFilterDeclaration ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:139:1: (lv_filter_1_0= ruleFilterDeclaration )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:139:1: (lv_filter_1_0= ruleFilterDeclaration )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:140:3: lv_filter_1_0= ruleFilterDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterDeclarationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterDeclaration_in_ruleRule249);
                    lv_filter_1_0=ruleFilterDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
                            		"FilterDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilterDeclaration"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:164:1: entryRuleFilterDeclaration returns [EObject current=null] : iv_ruleFilterDeclaration= ruleFilterDeclaration EOF ;
    public final EObject entryRuleFilterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDeclaration = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:165:2: (iv_ruleFilterDeclaration= ruleFilterDeclaration EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:166:2: iv_ruleFilterDeclaration= ruleFilterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFilterDeclarationRule()); 
            pushFollow(FOLLOW_ruleFilterDeclaration_in_entryRuleFilterDeclaration285);
            iv_ruleFilterDeclaration=ruleFilterDeclaration();

            state._fsp--;

             current =iv_ruleFilterDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterDeclaration295); 

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
    // $ANTLR end "entryRuleFilterDeclaration"


    // $ANTLR start "ruleFilterDeclaration"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:173:1: ruleFilterDeclaration returns [EObject current=null] : ( (lv_filter_0_0= ruleFilteringSpec ) ) ;
    public final EObject ruleFilterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_filter_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:176:28: ( ( (lv_filter_0_0= ruleFilteringSpec ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:177:1: ( (lv_filter_0_0= ruleFilteringSpec ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:177:1: ( (lv_filter_0_0= ruleFilteringSpec ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:178:1: (lv_filter_0_0= ruleFilteringSpec )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:178:1: (lv_filter_0_0= ruleFilteringSpec )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:179:3: lv_filter_0_0= ruleFilteringSpec
            {
             
            	        newCompositeNode(grammarAccess.getFilterDeclarationAccess().getFilterFilteringSpecParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleFilteringSpec_in_ruleFilterDeclaration340);
            lv_filter_0_0=ruleFilteringSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"filter",
                    		lv_filter_0_0, 
                    		"FilteringSpec");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFilterDeclaration"


    // $ANTLR start "entryRuleFilteringSpec"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:203:1: entryRuleFilteringSpec returns [EObject current=null] : iv_ruleFilteringSpec= ruleFilteringSpec EOF ;
    public final EObject entryRuleFilteringSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringSpec = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:204:2: (iv_ruleFilteringSpec= ruleFilteringSpec EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:205:2: iv_ruleFilteringSpec= ruleFilteringSpec EOF
            {
             newCompositeNode(grammarAccess.getFilteringSpecRule()); 
            pushFollow(FOLLOW_ruleFilteringSpec_in_entryRuleFilteringSpec375);
            iv_ruleFilteringSpec=ruleFilteringSpec();

            state._fsp--;

             current =iv_ruleFilteringSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilteringSpec385); 

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
    // $ANTLR end "entryRuleFilteringSpec"


    // $ANTLR start "ruleFilteringSpec"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:212:1: ruleFilteringSpec returns [EObject current=null] : this_FilterSpec_0= ruleFilterSpec ;
    public final EObject ruleFilteringSpec() throws RecognitionException {
        EObject current = null;

        EObject this_FilterSpec_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:215:28: (this_FilterSpec_0= ruleFilterSpec )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:217:5: this_FilterSpec_0= ruleFilterSpec
            {
             
                    newCompositeNode(grammarAccess.getFilteringSpecAccess().getFilterSpecParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFilterSpec_in_ruleFilteringSpec431);
            this_FilterSpec_0=ruleFilterSpec();

            state._fsp--;

             
                    current = this_FilterSpec_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFilteringSpec"


    // $ANTLR start "entryRuleFilterSpec"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:233:1: entryRuleFilterSpec returns [EObject current=null] : iv_ruleFilterSpec= ruleFilterSpec EOF ;
    public final EObject entryRuleFilterSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterSpec = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:234:2: (iv_ruleFilterSpec= ruleFilterSpec EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:235:2: iv_ruleFilterSpec= ruleFilterSpec EOF
            {
             newCompositeNode(grammarAccess.getFilterSpecRule()); 
            pushFollow(FOLLOW_ruleFilterSpec_in_entryRuleFilterSpec465);
            iv_ruleFilterSpec=ruleFilterSpec();

            state._fsp--;

             current =iv_ruleFilterSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterSpec475); 

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
    // $ANTLR end "entryRuleFilterSpec"


    // $ANTLR start "ruleFilterSpec"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:242:1: ruleFilterSpec returns [EObject current=null] : (otherlv_0= 'iptables' ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) ) ( (lv_chain_2_0= ruleChain ) ) (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )? (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )? (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )? (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )? (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )? (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )? ( (lv_neg_15_0= '!' ) )? ( (lv_syn_16_0= '--syn' ) )? (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )? (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )? (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )? (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )? (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )? (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )? (otherlv_38= '-j' )? ( (lv_target_39_0= ruleTarget ) ) (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )? ) ;
    public final EObject ruleFilterSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_1=null;
        Token lv_option_1_2=null;
        Token lv_option_1_3=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_sourcePort_12_0=null;
        Token otherlv_13=null;
        Token lv_destinationPort_14_0=null;
        Token lv_neg_15_0=null;
        Token lv_syn_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_chain_2_0 = null;

        AntlrDatatypeRuleToken lv_ip_4_0 = null;

        EObject lv_interface_6_0 = null;

        AntlrDatatypeRuleToken lv_ipDst_8_0 = null;

        AntlrDatatypeRuleToken lv_protocol_10_0 = null;

        EObject lv_matches_18_0 = null;

        EObject lv_states_20_0 = null;

        EObject lv_states_22_0 = null;

        AntlrDatatypeRuleToken lv_dir_24_0 = null;

        AntlrDatatypeRuleToken lv_status_26_0 = null;

        EObject lv_states_28_0 = null;

        EObject lv_states_30_0 = null;

        EObject lv_examFlags_32_0 = null;

        EObject lv_examFlags_34_0 = null;

        EObject lv_flags_35_0 = null;

        EObject lv_flags_37_0 = null;

        AntlrDatatypeRuleToken lv_target_39_0 = null;

        EObject lv_lp_41_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:245:28: ( (otherlv_0= 'iptables' ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) ) ( (lv_chain_2_0= ruleChain ) ) (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )? (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )? (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )? (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )? (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )? (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )? ( (lv_neg_15_0= '!' ) )? ( (lv_syn_16_0= '--syn' ) )? (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )? (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )? (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )? (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )? (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )? (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )? (otherlv_38= '-j' )? ( (lv_target_39_0= ruleTarget ) ) (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )? ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:246:1: (otherlv_0= 'iptables' ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) ) ( (lv_chain_2_0= ruleChain ) ) (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )? (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )? (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )? (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )? (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )? (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )? ( (lv_neg_15_0= '!' ) )? ( (lv_syn_16_0= '--syn' ) )? (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )? (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )? (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )? (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )? (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )? (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )? (otherlv_38= '-j' )? ( (lv_target_39_0= ruleTarget ) ) (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )? )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:246:1: (otherlv_0= 'iptables' ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) ) ( (lv_chain_2_0= ruleChain ) ) (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )? (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )? (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )? (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )? (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )? (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )? ( (lv_neg_15_0= '!' ) )? ( (lv_syn_16_0= '--syn' ) )? (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )? (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )? (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )? (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )? (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )? (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )? (otherlv_38= '-j' )? ( (lv_target_39_0= ruleTarget ) ) (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )? )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:246:3: otherlv_0= 'iptables' ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) ) ( (lv_chain_2_0= ruleChain ) ) (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )? (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )? (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )? (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )? (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )? (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )? ( (lv_neg_15_0= '!' ) )? ( (lv_syn_16_0= '--syn' ) )? (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )? (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )? (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )? (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )? (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )? (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )? (otherlv_38= '-j' )? ( (lv_target_39_0= ruleTarget ) ) (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleFilterSpec512); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterSpecAccess().getIptablesKeyword_0());
                
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:250:1: ( ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:251:1: ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:251:1: ( (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:252:1: (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:252:1: (lv_option_1_1= '-A' | lv_option_1_2= '-D' | lv_option_1_3= '-P' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:253:3: lv_option_1_1= '-A'
                    {
                    lv_option_1_1=(Token)match(input,12,FOLLOW_12_in_ruleFilterSpec532); 

                            newLeafNode(lv_option_1_1, grammarAccess.getFilterSpecAccess().getOptionAKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:265:8: lv_option_1_2= '-D'
                    {
                    lv_option_1_2=(Token)match(input,13,FOLLOW_13_in_ruleFilterSpec561); 

                            newLeafNode(lv_option_1_2, grammarAccess.getFilterSpecAccess().getOptionDKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:277:8: lv_option_1_3= '-P'
                    {
                    lv_option_1_3=(Token)match(input,14,FOLLOW_14_in_ruleFilterSpec590); 

                            newLeafNode(lv_option_1_3, grammarAccess.getFilterSpecAccess().getOptionPKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(current, "option", lv_option_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:292:2: ( (lv_chain_2_0= ruleChain ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:293:1: (lv_chain_2_0= ruleChain )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:293:1: (lv_chain_2_0= ruleChain )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:294:3: lv_chain_2_0= ruleChain
            {
             
            	        newCompositeNode(grammarAccess.getFilterSpecAccess().getChainChainParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleChain_in_ruleFilterSpec627);
            lv_chain_2_0=ruleChain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
            	        }
                   		set(
                   			current, 
                   			"chain",
                    		lv_chain_2_0, 
                    		"Chain");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:310:2: (otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:310:4: otherlv_3= '-s' ( (lv_ip_4_0= ruleIPExpr ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFilterSpec640); 

                        	newLeafNode(otherlv_3, grammarAccess.getFilterSpecAccess().getSKeyword_3_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:314:1: ( (lv_ip_4_0= ruleIPExpr ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:315:1: (lv_ip_4_0= ruleIPExpr )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:315:1: (lv_ip_4_0= ruleIPExpr )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:316:3: lv_ip_4_0= ruleIPExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getIpIPExprParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIPExpr_in_ruleFilterSpec661);
                    lv_ip_4_0=ruleIPExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"ip",
                            		lv_ip_4_0, 
                            		"IPExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:332:4: (otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:332:6: otherlv_5= '-i' ( (lv_interface_6_0= ruleInterface ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFilterSpec676); 

                        	newLeafNode(otherlv_5, grammarAccess.getFilterSpecAccess().getIKeyword_4_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:336:1: ( (lv_interface_6_0= ruleInterface ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:337:1: (lv_interface_6_0= ruleInterface )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:337:1: (lv_interface_6_0= ruleInterface )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:338:3: lv_interface_6_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getInterfaceInterfaceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_in_ruleFilterSpec697);
                    lv_interface_6_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"interface",
                            		lv_interface_6_0, 
                            		"Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:354:4: (otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:354:6: otherlv_7= '-d' ( (lv_ipDst_8_0= ruleIPExpr ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleFilterSpec712); 

                        	newLeafNode(otherlv_7, grammarAccess.getFilterSpecAccess().getDKeyword_5_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:358:1: ( (lv_ipDst_8_0= ruleIPExpr ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:359:1: (lv_ipDst_8_0= ruleIPExpr )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:359:1: (lv_ipDst_8_0= ruleIPExpr )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:360:3: lv_ipDst_8_0= ruleIPExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getIpDstIPExprParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIPExpr_in_ruleFilterSpec733);
                    lv_ipDst_8_0=ruleIPExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"ipDst",
                            		lv_ipDst_8_0, 
                            		"IPExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:376:4: (otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:376:6: otherlv_9= '-p' ( (lv_protocol_10_0= ruleProtocol ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleFilterSpec748); 

                        	newLeafNode(otherlv_9, grammarAccess.getFilterSpecAccess().getPKeyword_6_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:380:1: ( (lv_protocol_10_0= ruleProtocol ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:381:1: (lv_protocol_10_0= ruleProtocol )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:381:1: (lv_protocol_10_0= ruleProtocol )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:382:3: lv_protocol_10_0= ruleProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getProtocolProtocolParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProtocol_in_ruleFilterSpec769);
                    lv_protocol_10_0=ruleProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"protocol",
                            		lv_protocol_10_0, 
                            		"Protocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:398:4: (otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:398:6: otherlv_11= '--sport' ( (lv_sourcePort_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleFilterSpec784); 

                        	newLeafNode(otherlv_11, grammarAccess.getFilterSpecAccess().getSportKeyword_7_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:402:1: ( (lv_sourcePort_12_0= RULE_INT ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:403:1: (lv_sourcePort_12_0= RULE_INT )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:403:1: (lv_sourcePort_12_0= RULE_INT )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:404:3: lv_sourcePort_12_0= RULE_INT
                    {
                    lv_sourcePort_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFilterSpec801); 

                    			newLeafNode(lv_sourcePort_12_0, grammarAccess.getFilterSpecAccess().getSourcePortINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sourcePort",
                            		lv_sourcePort_12_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:420:4: (otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:420:6: otherlv_13= '--dport' ( (lv_destinationPort_14_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleFilterSpec821); 

                        	newLeafNode(otherlv_13, grammarAccess.getFilterSpecAccess().getDportKeyword_8_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:424:1: ( (lv_destinationPort_14_0= RULE_INT ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:425:1: (lv_destinationPort_14_0= RULE_INT )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:425:1: (lv_destinationPort_14_0= RULE_INT )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:426:3: lv_destinationPort_14_0= RULE_INT
                    {
                    lv_destinationPort_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFilterSpec838); 

                    			newLeafNode(lv_destinationPort_14_0, grammarAccess.getFilterSpecAccess().getDestinationPortINTTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"destinationPort",
                            		lv_destinationPort_14_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:442:4: ( (lv_neg_15_0= '!' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:443:1: (lv_neg_15_0= '!' )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:443:1: (lv_neg_15_0= '!' )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:444:3: lv_neg_15_0= '!'
                    {
                    lv_neg_15_0=(Token)match(input,21,FOLLOW_21_in_ruleFilterSpec863); 

                            newLeafNode(lv_neg_15_0, grammarAccess.getFilterSpecAccess().getNegExclamationMarkKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(current, "neg", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:457:3: ( (lv_syn_16_0= '--syn' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:458:1: (lv_syn_16_0= '--syn' )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:458:1: (lv_syn_16_0= '--syn' )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:459:3: lv_syn_16_0= '--syn'
                    {
                    lv_syn_16_0=(Token)match(input,22,FOLLOW_22_in_ruleFilterSpec895); 

                            newLeafNode(lv_syn_16_0, grammarAccess.getFilterSpecAccess().getSynSynKeyword_10_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFilterSpecRule());
                    	        }
                           		setWithLastConsumed(current, "syn", true, "--syn");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:472:3: (otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:472:5: otherlv_17= '--m' ( (lv_matches_18_0= ruleMatch ) )
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleFilterSpec922); 

                        	newLeafNode(otherlv_17, grammarAccess.getFilterSpecAccess().getMKeyword_11_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:476:1: ( (lv_matches_18_0= ruleMatch ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:477:1: (lv_matches_18_0= ruleMatch )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:477:1: (lv_matches_18_0= ruleMatch )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:478:3: lv_matches_18_0= ruleMatch
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getMatchesMatchParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMatch_in_ruleFilterSpec943);
                    lv_matches_18_0=ruleMatch();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"matches",
                            		lv_matches_18_0, 
                            		"Match");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:494:4: (otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:494:6: otherlv_19= '--ctstate' ( (lv_states_20_0= ruleState ) ) (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )*
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleFilterSpec958); 

                        	newLeafNode(otherlv_19, grammarAccess.getFilterSpecAccess().getCtstateKeyword_12_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:498:1: ( (lv_states_20_0= ruleState ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:499:1: (lv_states_20_0= ruleState )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:499:1: (lv_states_20_0= ruleState )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:500:3: lv_states_20_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleState_in_ruleFilterSpec979);
                    lv_states_20_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"states",
                            		lv_states_20_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:516:2: (otherlv_21= ',' ( (lv_states_22_0= ruleState ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:516:4: otherlv_21= ',' ( (lv_states_22_0= ruleState ) )
                    	    {
                    	    otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleFilterSpec992); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getFilterSpecAccess().getCommaKeyword_12_2_0());
                    	        
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:520:1: ( (lv_states_22_0= ruleState ) )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:521:1: (lv_states_22_0= ruleState )
                    	    {
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:521:1: (lv_states_22_0= ruleState )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:522:3: lv_states_22_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleState_in_ruleFilterSpec1013);
                    	    lv_states_22_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_22_0, 
                    	            		"State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:538:6: (otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:538:8: otherlv_23= '--ctdir' ( (lv_dir_24_0= ruleDir ) )
                    {
                    otherlv_23=(Token)match(input,26,FOLLOW_26_in_ruleFilterSpec1030); 

                        	newLeafNode(otherlv_23, grammarAccess.getFilterSpecAccess().getCtdirKeyword_13_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:542:1: ( (lv_dir_24_0= ruleDir ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:543:1: (lv_dir_24_0= ruleDir )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:543:1: (lv_dir_24_0= ruleDir )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:544:3: lv_dir_24_0= ruleDir
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getDirDirParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDir_in_ruleFilterSpec1051);
                    lv_dir_24_0=ruleDir();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"dir",
                            		lv_dir_24_0, 
                            		"Dir");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:560:4: (otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:560:6: otherlv_25= '--ctstatus' ( (lv_status_26_0= ruleStatus ) )
                    {
                    otherlv_25=(Token)match(input,27,FOLLOW_27_in_ruleFilterSpec1066); 

                        	newLeafNode(otherlv_25, grammarAccess.getFilterSpecAccess().getCtstatusKeyword_14_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:564:1: ( (lv_status_26_0= ruleStatus ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:565:1: (lv_status_26_0= ruleStatus )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:565:1: (lv_status_26_0= ruleStatus )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:566:3: lv_status_26_0= ruleStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getStatusStatusParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatus_in_ruleFilterSpec1087);
                    lv_status_26_0=ruleStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_26_0, 
                            		"Status");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:582:4: (otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:582:6: otherlv_27= '--state' ( (lv_states_28_0= ruleState ) ) (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )*
                    {
                    otherlv_27=(Token)match(input,28,FOLLOW_28_in_ruleFilterSpec1102); 

                        	newLeafNode(otherlv_27, grammarAccess.getFilterSpecAccess().getStateKeyword_15_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:586:1: ( (lv_states_28_0= ruleState ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:587:1: (lv_states_28_0= ruleState )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:587:1: (lv_states_28_0= ruleState )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:588:3: lv_states_28_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleState_in_ruleFilterSpec1123);
                    lv_states_28_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"states",
                            		lv_states_28_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:604:2: (otherlv_29= ',' ( (lv_states_30_0= ruleState ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:604:4: otherlv_29= ',' ( (lv_states_30_0= ruleState ) )
                    	    {
                    	    otherlv_29=(Token)match(input,25,FOLLOW_25_in_ruleFilterSpec1136); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getFilterSpecAccess().getCommaKeyword_15_2_0());
                    	        
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:608:1: ( (lv_states_30_0= ruleState ) )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:609:1: (lv_states_30_0= ruleState )
                    	    {
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:609:1: (lv_states_30_0= ruleState )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:610:3: lv_states_30_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleState_in_ruleFilterSpec1157);
                    	    lv_states_30_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_30_0, 
                    	            		"State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:626:6: (otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:626:8: otherlv_31= '--tcp-flags' ( (lv_examFlags_32_0= ruleTCPFlag ) ) (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )* ( (lv_flags_35_0= ruleTCPFlag ) ) (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )*
                    {
                    otherlv_31=(Token)match(input,29,FOLLOW_29_in_ruleFilterSpec1174); 

                        	newLeafNode(otherlv_31, grammarAccess.getFilterSpecAccess().getTcpFlagsKeyword_16_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:630:1: ( (lv_examFlags_32_0= ruleTCPFlag ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:631:1: (lv_examFlags_32_0= ruleTCPFlag )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:631:1: (lv_examFlags_32_0= ruleTCPFlag )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:632:3: lv_examFlags_32_0= ruleTCPFlag
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTCPFlag_in_ruleFilterSpec1195);
                    lv_examFlags_32_0=ruleTCPFlag();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"examFlags",
                            		lv_examFlags_32_0, 
                            		"TCPFlag");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:648:2: (otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:648:4: otherlv_33= ',' ( (lv_examFlags_34_0= ruleTCPFlag ) )
                    	    {
                    	    otherlv_33=(Token)match(input,25,FOLLOW_25_in_ruleFilterSpec1208); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getFilterSpecAccess().getCommaKeyword_16_2_0());
                    	        
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:652:1: ( (lv_examFlags_34_0= ruleTCPFlag ) )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:653:1: (lv_examFlags_34_0= ruleTCPFlag )
                    	    {
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:653:1: (lv_examFlags_34_0= ruleTCPFlag )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:654:3: lv_examFlags_34_0= ruleTCPFlag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTCPFlag_in_ruleFilterSpec1229);
                    	    lv_examFlags_34_0=ruleTCPFlag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"examFlags",
                    	            		lv_examFlags_34_0, 
                    	            		"TCPFlag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:670:4: ( (lv_flags_35_0= ruleTCPFlag ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:671:1: (lv_flags_35_0= ruleTCPFlag )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:671:1: (lv_flags_35_0= ruleTCPFlag )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:672:3: lv_flags_35_0= ruleTCPFlag
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTCPFlag_in_ruleFilterSpec1252);
                    lv_flags_35_0=ruleTCPFlag();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		add(
                           			current, 
                           			"flags",
                            		lv_flags_35_0, 
                            		"TCPFlag");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:688:2: (otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:688:4: otherlv_36= ',' ( (lv_flags_37_0= ruleTCPFlag ) )
                    	    {
                    	    otherlv_36=(Token)match(input,25,FOLLOW_25_in_ruleFilterSpec1265); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getFilterSpecAccess().getCommaKeyword_16_4_0());
                    	        
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:692:1: ( (lv_flags_37_0= ruleTCPFlag ) )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:693:1: (lv_flags_37_0= ruleTCPFlag )
                    	    {
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:693:1: (lv_flags_37_0= ruleTCPFlag )
                    	    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:694:3: lv_flags_37_0= ruleTCPFlag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTCPFlag_in_ruleFilterSpec1286);
                    	    lv_flags_37_0=ruleTCPFlag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"flags",
                    	            		lv_flags_37_0, 
                    	            		"TCPFlag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:710:6: (otherlv_38= '-j' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:710:8: otherlv_38= '-j'
                    {
                    otherlv_38=(Token)match(input,30,FOLLOW_30_in_ruleFilterSpec1303); 

                        	newLeafNode(otherlv_38, grammarAccess.getFilterSpecAccess().getJKeyword_17());
                        

                    }
                    break;

            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:714:3: ( (lv_target_39_0= ruleTarget ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:715:1: (lv_target_39_0= ruleTarget )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:715:1: (lv_target_39_0= ruleTarget )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:716:3: lv_target_39_0= ruleTarget
            {
             
            	        newCompositeNode(grammarAccess.getFilterSpecAccess().getTargetTargetParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleTarget_in_ruleFilterSpec1326);
            lv_target_39_0=ruleTarget();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_39_0, 
                    		"Target");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:732:2: (otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:732:4: otherlv_40= '--log-prefix' ( (lv_lp_41_0= ruleLP ) )
                    {
                    otherlv_40=(Token)match(input,31,FOLLOW_31_in_ruleFilterSpec1339); 

                        	newLeafNode(otherlv_40, grammarAccess.getFilterSpecAccess().getLogPrefixKeyword_19_0());
                        
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:736:1: ( (lv_lp_41_0= ruleLP ) )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:737:1: (lv_lp_41_0= ruleLP )
                    {
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:737:1: (lv_lp_41_0= ruleLP )
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:738:3: lv_lp_41_0= ruleLP
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterSpecAccess().getLpLPParserRuleCall_19_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLP_in_ruleFilterSpec1360);
                    lv_lp_41_0=ruleLP();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterSpecRule());
                    	        }
                           		set(
                           			current, 
                           			"lp",
                            		lv_lp_41_0, 
                            		"LP");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleFilterSpec"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:762:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:763:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:764:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1398);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1408); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:771:1: ruleInterface returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:774:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:775:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:775:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:776:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:776:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:777:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1449); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleLP"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:801:1: entryRuleLP returns [EObject current=null] : iv_ruleLP= ruleLP EOF ;
    public final EObject entryRuleLP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLP = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:802:2: (iv_ruleLP= ruleLP EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:803:2: iv_ruleLP= ruleLP EOF
            {
             newCompositeNode(grammarAccess.getLPRule()); 
            pushFollow(FOLLOW_ruleLP_in_entryRuleLP1489);
            iv_ruleLP=ruleLP();

            state._fsp--;

             current =iv_ruleLP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLP1499); 

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
    // $ANTLR end "entryRuleLP"


    // $ANTLR start "ruleLP"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:810:1: ruleLP returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleLP() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:813:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:814:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:814:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:815:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:815:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:816:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLP1540); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLPAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleLP"


    // $ANTLR start "entryRuleMatch"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:840:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:841:2: (iv_ruleMatch= ruleMatch EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:842:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_ruleMatch_in_entryRuleMatch1580);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatch1590); 

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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:849:1: ruleMatch returns [EObject current=null] : ( ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) ) ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:852:28: ( ( ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:853:1: ( ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:853:1: ( ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:854:1: ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:854:1: ( (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:855:1: (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:855:1: (lv_name_0_1= ruleConntrack | lv_name_0_2= ruleStateMatch )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:856:3: lv_name_0_1= ruleConntrack
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchAccess().getNameConntrackParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConntrack_in_ruleMatch1637);
                    lv_name_0_1=ruleConntrack();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"Conntrack");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:871:8: lv_name_0_2= ruleStateMatch
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchAccess().getNameStateMatchParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleStateMatch_in_ruleMatch1656);
                    lv_name_0_2=ruleStateMatch();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"StateMatch");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleDir"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:897:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:898:2: (iv_ruleDir= ruleDir EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:899:2: iv_ruleDir= ruleDir EOF
            {
             newCompositeNode(grammarAccess.getDirRule()); 
            pushFollow(FOLLOW_ruleDir_in_entryRuleDir1695);
            iv_ruleDir=ruleDir();

            state._fsp--;

             current =iv_ruleDir.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDir1706); 

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
    // $ANTLR end "entryRuleDir"


    // $ANTLR start "ruleDir"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:906:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:909:28: (this_ID_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:910:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDir1745); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleDir"


    // $ANTLR start "entryRuleStatus"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:925:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:926:2: (iv_ruleStatus= ruleStatus EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:927:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus1790);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus1801); 

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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:934:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:937:28: (this_ID_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:938:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatus1840); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getStatusAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleConntrack"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:953:1: entryRuleConntrack returns [String current=null] : iv_ruleConntrack= ruleConntrack EOF ;
    public final String entryRuleConntrack() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConntrack = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:954:2: (iv_ruleConntrack= ruleConntrack EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:955:2: iv_ruleConntrack= ruleConntrack EOF
            {
             newCompositeNode(grammarAccess.getConntrackRule()); 
            pushFollow(FOLLOW_ruleConntrack_in_entryRuleConntrack1885);
            iv_ruleConntrack=ruleConntrack();

            state._fsp--;

             current =iv_ruleConntrack.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConntrack1896); 

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
    // $ANTLR end "entryRuleConntrack"


    // $ANTLR start "ruleConntrack"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:962:1: ruleConntrack returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'conntrack' ;
    public final AntlrDatatypeRuleToken ruleConntrack() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:965:28: (kw= 'conntrack' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:967:2: kw= 'conntrack'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleConntrack1933); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConntrackAccess().getConntrackKeyword()); 
                

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
    // $ANTLR end "ruleConntrack"


    // $ANTLR start "entryRuleStateMatch"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:980:1: entryRuleStateMatch returns [String current=null] : iv_ruleStateMatch= ruleStateMatch EOF ;
    public final String entryRuleStateMatch() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStateMatch = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:981:2: (iv_ruleStateMatch= ruleStateMatch EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:982:2: iv_ruleStateMatch= ruleStateMatch EOF
            {
             newCompositeNode(grammarAccess.getStateMatchRule()); 
            pushFollow(FOLLOW_ruleStateMatch_in_entryRuleStateMatch1973);
            iv_ruleStateMatch=ruleStateMatch();

            state._fsp--;

             current =iv_ruleStateMatch.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMatch1984); 

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
    // $ANTLR end "entryRuleStateMatch"


    // $ANTLR start "ruleStateMatch"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:989:1: ruleStateMatch returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'State' ;
    public final AntlrDatatypeRuleToken ruleStateMatch() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:992:28: (kw= 'State' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:994:2: kw= 'State'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleStateMatch2021); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStateMatchAccess().getStateKeyword()); 
                

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
    // $ANTLR end "ruleStateMatch"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1007:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1008:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1009:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2060);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2070); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1016:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_1 = null;

        EObject lv_name_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1019:28: ( ( ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1020:1: ( ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1020:1: ( ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1021:1: ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1021:1: ( (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1022:1: (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1022:1: (lv_name_0_1= ruleNormalMatchStates | lv_name_0_2= ruleStateFulMatchStates )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=35 && LA25_0<=43)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1023:3: lv_name_0_1= ruleNormalMatchStates
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getNameNormalMatchStatesParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNormalMatchStates_in_ruleState2117);
                    lv_name_0_1=ruleNormalMatchStates();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"NormalMatchStates");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1038:8: lv_name_0_2= ruleStateFulMatchStates
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getNameStateFulMatchStatesParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFulMatchStates_in_ruleState2136);
                    lv_name_0_2=ruleStateFulMatchStates();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"StateFulMatchStates");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateFulMatchStates"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1064:1: entryRuleStateFulMatchStates returns [EObject current=null] : iv_ruleStateFulMatchStates= ruleStateFulMatchStates EOF ;
    public final EObject entryRuleStateFulMatchStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFulMatchStates = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1065:2: (iv_ruleStateFulMatchStates= ruleStateFulMatchStates EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1066:2: iv_ruleStateFulMatchStates= ruleStateFulMatchStates EOF
            {
             newCompositeNode(grammarAccess.getStateFulMatchStatesRule()); 
            pushFollow(FOLLOW_ruleStateFulMatchStates_in_entryRuleStateFulMatchStates2174);
            iv_ruleStateFulMatchStates=ruleStateFulMatchStates();

            state._fsp--;

             current =iv_ruleStateFulMatchStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFulMatchStates2184); 

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
    // $ANTLR end "entryRuleStateFulMatchStates"


    // $ANTLR start "ruleStateFulMatchStates"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1073:1: ruleStateFulMatchStates returns [EObject current=null] : ( ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) ) ) ;
    public final EObject ruleStateFulMatchStates() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;

        AntlrDatatypeRuleToken lv_name_0_3 = null;

        AntlrDatatypeRuleToken lv_name_0_4 = null;

        AntlrDatatypeRuleToken lv_name_0_5 = null;

        AntlrDatatypeRuleToken lv_name_0_6 = null;

        AntlrDatatypeRuleToken lv_name_0_7 = null;

        AntlrDatatypeRuleToken lv_name_0_8 = null;

        AntlrDatatypeRuleToken lv_name_0_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1076:28: ( ( ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1077:1: ( ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1077:1: ( ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1078:1: ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1078:1: ( (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1079:1: (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1079:1: (lv_name_0_1= ruleNoneS | lv_name_0_2= ruleSynSent | lv_name_0_3= ruleSynRecv | lv_name_0_4= ruleEstablished | lv_name_0_5= ruleFinWait | lv_name_0_6= ruleCloseWait | lv_name_0_7= ruleLastAck | lv_name_0_8= ruleTimeWait | lv_name_0_9= ruleClose )
            int alt26=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            case 38:
                {
                alt26=4;
                }
                break;
            case 39:
                {
                alt26=5;
                }
                break;
            case 40:
                {
                alt26=6;
                }
                break;
            case 41:
                {
                alt26=7;
                }
                break;
            case 42:
                {
                alt26=8;
                }
                break;
            case 43:
                {
                alt26=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1080:3: lv_name_0_1= ruleNoneS
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameNoneSParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNoneS_in_ruleStateFulMatchStates2231);
                    lv_name_0_1=ruleNoneS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"NoneS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1095:8: lv_name_0_2= ruleSynSent
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameSynSentParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSynSent_in_ruleStateFulMatchStates2250);
                    lv_name_0_2=ruleSynSent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"SynSent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1110:8: lv_name_0_3= ruleSynRecv
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameSynRecvParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleSynRecv_in_ruleStateFulMatchStates2269);
                    lv_name_0_3=ruleSynRecv();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_3, 
                            		"SynRecv");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1125:8: lv_name_0_4= ruleEstablished
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameEstablishedParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleEstablished_in_ruleStateFulMatchStates2288);
                    lv_name_0_4=ruleEstablished();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_4, 
                            		"Established");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1140:8: lv_name_0_5= ruleFinWait
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameFinWaitParserRuleCall_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleFinWait_in_ruleStateFulMatchStates2307);
                    lv_name_0_5=ruleFinWait();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_5, 
                            		"FinWait");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 6 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1155:8: lv_name_0_6= ruleCloseWait
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameCloseWaitParserRuleCall_0_5()); 
                    	    
                    pushFollow(FOLLOW_ruleCloseWait_in_ruleStateFulMatchStates2326);
                    lv_name_0_6=ruleCloseWait();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_6, 
                            		"CloseWait");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 7 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1170:8: lv_name_0_7= ruleLastAck
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameLastAckParserRuleCall_0_6()); 
                    	    
                    pushFollow(FOLLOW_ruleLastAck_in_ruleStateFulMatchStates2345);
                    lv_name_0_7=ruleLastAck();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_7, 
                            		"LastAck");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 8 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1185:8: lv_name_0_8= ruleTimeWait
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameTimeWaitParserRuleCall_0_7()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeWait_in_ruleStateFulMatchStates2364);
                    lv_name_0_8=ruleTimeWait();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_8, 
                            		"TimeWait");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 9 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1200:8: lv_name_0_9= ruleClose
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFulMatchStatesAccess().getNameCloseParserRuleCall_0_8()); 
                    	    
                    pushFollow(FOLLOW_ruleClose_in_ruleStateFulMatchStates2383);
                    lv_name_0_9=ruleClose();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFulMatchStatesRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_9, 
                            		"Close");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleStateFulMatchStates"


    // $ANTLR start "entryRuleNormalMatchStates"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1226:1: entryRuleNormalMatchStates returns [EObject current=null] : iv_ruleNormalMatchStates= ruleNormalMatchStates EOF ;
    public final EObject entryRuleNormalMatchStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalMatchStates = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1227:2: (iv_ruleNormalMatchStates= ruleNormalMatchStates EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1228:2: iv_ruleNormalMatchStates= ruleNormalMatchStates EOF
            {
             newCompositeNode(grammarAccess.getNormalMatchStatesRule()); 
            pushFollow(FOLLOW_ruleNormalMatchStates_in_entryRuleNormalMatchStates2421);
            iv_ruleNormalMatchStates=ruleNormalMatchStates();

            state._fsp--;

             current =iv_ruleNormalMatchStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalMatchStates2431); 

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
    // $ANTLR end "entryRuleNormalMatchStates"


    // $ANTLR start "ruleNormalMatchStates"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1235:1: ruleNormalMatchStates returns [EObject current=null] : ( (lv_name_0_0= ruleNew ) ) ;
    public final EObject ruleNormalMatchStates() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1238:28: ( ( (lv_name_0_0= ruleNew ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1239:1: ( (lv_name_0_0= ruleNew ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1239:1: ( (lv_name_0_0= ruleNew ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1240:1: (lv_name_0_0= ruleNew )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1240:1: (lv_name_0_0= ruleNew )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1241:3: lv_name_0_0= ruleNew
            {
             
            	        newCompositeNode(grammarAccess.getNormalMatchStatesAccess().getNameNewParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNew_in_ruleNormalMatchStates2476);
            lv_name_0_0=ruleNew();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalMatchStatesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"New");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNormalMatchStates"


    // $ANTLR start "entryRuleNew"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1265:1: entryRuleNew returns [String current=null] : iv_ruleNew= ruleNew EOF ;
    public final String entryRuleNew() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNew = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1266:2: (iv_ruleNew= ruleNew EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1267:2: iv_ruleNew= ruleNew EOF
            {
             newCompositeNode(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew2512);
            iv_ruleNew=ruleNew();

            state._fsp--;

             current =iv_ruleNew.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew2523); 

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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1274:1: ruleNew returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NEW' ;
    public final AntlrDatatypeRuleToken ruleNew() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1277:28: (kw= 'NEW' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1279:2: kw= 'NEW'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleNew2560); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNewAccess().getNEWKeyword()); 
                

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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleNoneS"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1292:1: entryRuleNoneS returns [String current=null] : iv_ruleNoneS= ruleNoneS EOF ;
    public final String entryRuleNoneS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoneS = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1293:2: (iv_ruleNoneS= ruleNoneS EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1294:2: iv_ruleNoneS= ruleNoneS EOF
            {
             newCompositeNode(grammarAccess.getNoneSRule()); 
            pushFollow(FOLLOW_ruleNoneS_in_entryRuleNoneS2600);
            iv_ruleNoneS=ruleNoneS();

            state._fsp--;

             current =iv_ruleNoneS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoneS2611); 

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
    // $ANTLR end "entryRuleNoneS"


    // $ANTLR start "ruleNoneS"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1301:1: ruleNoneS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NONE' ;
    public final AntlrDatatypeRuleToken ruleNoneS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1304:28: (kw= 'NONE' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1306:2: kw= 'NONE'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleNoneS2648); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoneSAccess().getNONEKeyword()); 
                

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
    // $ANTLR end "ruleNoneS"


    // $ANTLR start "entryRuleSynSent"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1319:1: entryRuleSynSent returns [String current=null] : iv_ruleSynSent= ruleSynSent EOF ;
    public final String entryRuleSynSent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSynSent = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1320:2: (iv_ruleSynSent= ruleSynSent EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1321:2: iv_ruleSynSent= ruleSynSent EOF
            {
             newCompositeNode(grammarAccess.getSynSentRule()); 
            pushFollow(FOLLOW_ruleSynSent_in_entryRuleSynSent2688);
            iv_ruleSynSent=ruleSynSent();

            state._fsp--;

             current =iv_ruleSynSent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynSent2699); 

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
    // $ANTLR end "entryRuleSynSent"


    // $ANTLR start "ruleSynSent"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1328:1: ruleSynSent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'SYN_SENT' ;
    public final AntlrDatatypeRuleToken ruleSynSent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1331:28: (kw= 'SYN_SENT' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1333:2: kw= 'SYN_SENT'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleSynSent2736); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSynSentAccess().getSYN_SENTKeyword()); 
                

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
    // $ANTLR end "ruleSynSent"


    // $ANTLR start "entryRuleSynRecv"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1346:1: entryRuleSynRecv returns [String current=null] : iv_ruleSynRecv= ruleSynRecv EOF ;
    public final String entryRuleSynRecv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSynRecv = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1347:2: (iv_ruleSynRecv= ruleSynRecv EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1348:2: iv_ruleSynRecv= ruleSynRecv EOF
            {
             newCompositeNode(grammarAccess.getSynRecvRule()); 
            pushFollow(FOLLOW_ruleSynRecv_in_entryRuleSynRecv2776);
            iv_ruleSynRecv=ruleSynRecv();

            state._fsp--;

             current =iv_ruleSynRecv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynRecv2787); 

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
    // $ANTLR end "entryRuleSynRecv"


    // $ANTLR start "ruleSynRecv"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1355:1: ruleSynRecv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'SYN_RECV' ;
    public final AntlrDatatypeRuleToken ruleSynRecv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1358:28: (kw= 'SYN_RECV' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1360:2: kw= 'SYN_RECV'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleSynRecv2824); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSynRecvAccess().getSYN_RECVKeyword()); 
                

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
    // $ANTLR end "ruleSynRecv"


    // $ANTLR start "entryRuleEstablished"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1373:1: entryRuleEstablished returns [String current=null] : iv_ruleEstablished= ruleEstablished EOF ;
    public final String entryRuleEstablished() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEstablished = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1374:2: (iv_ruleEstablished= ruleEstablished EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1375:2: iv_ruleEstablished= ruleEstablished EOF
            {
             newCompositeNode(grammarAccess.getEstablishedRule()); 
            pushFollow(FOLLOW_ruleEstablished_in_entryRuleEstablished2864);
            iv_ruleEstablished=ruleEstablished();

            state._fsp--;

             current =iv_ruleEstablished.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstablished2875); 

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
    // $ANTLR end "entryRuleEstablished"


    // $ANTLR start "ruleEstablished"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1382:1: ruleEstablished returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ESTABLISHED' ;
    public final AntlrDatatypeRuleToken ruleEstablished() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1385:28: (kw= 'ESTABLISHED' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1387:2: kw= 'ESTABLISHED'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleEstablished2912); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEstablishedAccess().getESTABLISHEDKeyword()); 
                

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
    // $ANTLR end "ruleEstablished"


    // $ANTLR start "entryRuleFinWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1400:1: entryRuleFinWait returns [String current=null] : iv_ruleFinWait= ruleFinWait EOF ;
    public final String entryRuleFinWait() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFinWait = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1401:2: (iv_ruleFinWait= ruleFinWait EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1402:2: iv_ruleFinWait= ruleFinWait EOF
            {
             newCompositeNode(grammarAccess.getFinWaitRule()); 
            pushFollow(FOLLOW_ruleFinWait_in_entryRuleFinWait2952);
            iv_ruleFinWait=ruleFinWait();

            state._fsp--;

             current =iv_ruleFinWait.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinWait2963); 

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
    // $ANTLR end "entryRuleFinWait"


    // $ANTLR start "ruleFinWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1409:1: ruleFinWait returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'FIN_WAIT' ;
    public final AntlrDatatypeRuleToken ruleFinWait() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1412:28: (kw= 'FIN_WAIT' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1414:2: kw= 'FIN_WAIT'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleFinWait3000); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFinWaitAccess().getFIN_WAITKeyword()); 
                

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
    // $ANTLR end "ruleFinWait"


    // $ANTLR start "entryRuleCloseWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1427:1: entryRuleCloseWait returns [String current=null] : iv_ruleCloseWait= ruleCloseWait EOF ;
    public final String entryRuleCloseWait() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCloseWait = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1428:2: (iv_ruleCloseWait= ruleCloseWait EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1429:2: iv_ruleCloseWait= ruleCloseWait EOF
            {
             newCompositeNode(grammarAccess.getCloseWaitRule()); 
            pushFollow(FOLLOW_ruleCloseWait_in_entryRuleCloseWait3040);
            iv_ruleCloseWait=ruleCloseWait();

            state._fsp--;

             current =iv_ruleCloseWait.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloseWait3051); 

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
    // $ANTLR end "entryRuleCloseWait"


    // $ANTLR start "ruleCloseWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1436:1: ruleCloseWait returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CLOSE_WAIT' ;
    public final AntlrDatatypeRuleToken ruleCloseWait() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1439:28: (kw= 'CLOSE_WAIT' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1441:2: kw= 'CLOSE_WAIT'
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleCloseWait3088); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCloseWaitAccess().getCLOSE_WAITKeyword()); 
                

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
    // $ANTLR end "ruleCloseWait"


    // $ANTLR start "entryRuleLastAck"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1454:1: entryRuleLastAck returns [String current=null] : iv_ruleLastAck= ruleLastAck EOF ;
    public final String entryRuleLastAck() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLastAck = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1455:2: (iv_ruleLastAck= ruleLastAck EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1456:2: iv_ruleLastAck= ruleLastAck EOF
            {
             newCompositeNode(grammarAccess.getLastAckRule()); 
            pushFollow(FOLLOW_ruleLastAck_in_entryRuleLastAck3128);
            iv_ruleLastAck=ruleLastAck();

            state._fsp--;

             current =iv_ruleLastAck.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastAck3139); 

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
    // $ANTLR end "entryRuleLastAck"


    // $ANTLR start "ruleLastAck"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1463:1: ruleLastAck returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAST_ACK' ;
    public final AntlrDatatypeRuleToken ruleLastAck() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1466:28: (kw= 'LAST_ACK' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1468:2: kw= 'LAST_ACK'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleLastAck3176); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLastAckAccess().getLAST_ACKKeyword()); 
                

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
    // $ANTLR end "ruleLastAck"


    // $ANTLR start "entryRuleTimeWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1481:1: entryRuleTimeWait returns [String current=null] : iv_ruleTimeWait= ruleTimeWait EOF ;
    public final String entryRuleTimeWait() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeWait = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1482:2: (iv_ruleTimeWait= ruleTimeWait EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1483:2: iv_ruleTimeWait= ruleTimeWait EOF
            {
             newCompositeNode(grammarAccess.getTimeWaitRule()); 
            pushFollow(FOLLOW_ruleTimeWait_in_entryRuleTimeWait3216);
            iv_ruleTimeWait=ruleTimeWait();

            state._fsp--;

             current =iv_ruleTimeWait.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeWait3227); 

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
    // $ANTLR end "entryRuleTimeWait"


    // $ANTLR start "ruleTimeWait"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1490:1: ruleTimeWait returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TIME_WAIT' ;
    public final AntlrDatatypeRuleToken ruleTimeWait() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1493:28: (kw= 'TIME_WAIT' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1495:2: kw= 'TIME_WAIT'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleTimeWait3264); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTimeWaitAccess().getTIME_WAITKeyword()); 
                

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
    // $ANTLR end "ruleTimeWait"


    // $ANTLR start "entryRuleClose"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1508:1: entryRuleClose returns [String current=null] : iv_ruleClose= ruleClose EOF ;
    public final String entryRuleClose() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClose = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1509:2: (iv_ruleClose= ruleClose EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1510:2: iv_ruleClose= ruleClose EOF
            {
             newCompositeNode(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_ruleClose_in_entryRuleClose3304);
            iv_ruleClose=ruleClose();

            state._fsp--;

             current =iv_ruleClose.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClose3315); 

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
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1517:1: ruleClose returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CLOSE' ;
    public final AntlrDatatypeRuleToken ruleClose() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1520:28: (kw= 'CLOSE' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1522:2: kw= 'CLOSE'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleClose3352); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCloseAccess().getCLOSEKeyword()); 
                

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
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleTCPFlag"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1535:1: entryRuleTCPFlag returns [EObject current=null] : iv_ruleTCPFlag= ruleTCPFlag EOF ;
    public final EObject entryRuleTCPFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTCPFlag = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1536:2: (iv_ruleTCPFlag= ruleTCPFlag EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1537:2: iv_ruleTCPFlag= ruleTCPFlag EOF
            {
             newCompositeNode(grammarAccess.getTCPFlagRule()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_entryRuleTCPFlag3391);
            iv_ruleTCPFlag=ruleTCPFlag();

            state._fsp--;

             current =iv_ruleTCPFlag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCPFlag3401); 

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
    // $ANTLR end "entryRuleTCPFlag"


    // $ANTLR start "ruleTCPFlag"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1544:1: ruleTCPFlag returns [EObject current=null] : ( ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) ) ) ;
    public final EObject ruleTCPFlag() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;

        AntlrDatatypeRuleToken lv_name_0_3 = null;

        AntlrDatatypeRuleToken lv_name_0_4 = null;

        AntlrDatatypeRuleToken lv_name_0_5 = null;

        AntlrDatatypeRuleToken lv_name_0_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1547:28: ( ( ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1548:1: ( ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1548:1: ( ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1549:1: ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1549:1: ( (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1550:1: (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1550:1: (lv_name_0_1= ruleSyn | lv_name_0_2= ruleAck | lv_name_0_3= ruleFin | lv_name_0_4= ruleRst | lv_name_0_5= ruleAll | lv_name_0_6= ruleNone )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            case 47:
                {
                alt27=4;
                }
                break;
            case 48:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1551:3: lv_name_0_1= ruleSyn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameSynParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSyn_in_ruleTCPFlag3448);
                    lv_name_0_1=ruleSyn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"Syn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1566:8: lv_name_0_2= ruleAck
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameAckParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAck_in_ruleTCPFlag3467);
                    lv_name_0_2=ruleAck();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"Ack");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1581:8: lv_name_0_3= ruleFin
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameFinParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleFin_in_ruleTCPFlag3486);
                    lv_name_0_3=ruleFin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_3, 
                            		"Fin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1596:8: lv_name_0_4= ruleRst
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameRstParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleRst_in_ruleTCPFlag3505);
                    lv_name_0_4=ruleRst();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_4, 
                            		"Rst");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1611:8: lv_name_0_5= ruleAll
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameAllParserRuleCall_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleAll_in_ruleTCPFlag3524);
                    lv_name_0_5=ruleAll();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_5, 
                            		"All");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 6 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1626:8: lv_name_0_6= ruleNone
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCPFlagAccess().getNameNoneParserRuleCall_0_5()); 
                    	    
                    pushFollow(FOLLOW_ruleNone_in_ruleTCPFlag3543);
                    lv_name_0_6=ruleNone();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCPFlagRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_6, 
                            		"None");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleTCPFlag"


    // $ANTLR start "entryRuleSyn"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1652:1: entryRuleSyn returns [String current=null] : iv_ruleSyn= ruleSyn EOF ;
    public final String entryRuleSyn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSyn = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1653:2: (iv_ruleSyn= ruleSyn EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1654:2: iv_ruleSyn= ruleSyn EOF
            {
             newCompositeNode(grammarAccess.getSynRule()); 
            pushFollow(FOLLOW_ruleSyn_in_entryRuleSyn3582);
            iv_ruleSyn=ruleSyn();

            state._fsp--;

             current =iv_ruleSyn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyn3593); 

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
    // $ANTLR end "entryRuleSyn"


    // $ANTLR start "ruleSyn"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1661:1: ruleSyn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'SYN' ;
    public final AntlrDatatypeRuleToken ruleSyn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1664:28: (kw= 'SYN' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1666:2: kw= 'SYN'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleSyn3630); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSynAccess().getSYNKeyword()); 
                

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
    // $ANTLR end "ruleSyn"


    // $ANTLR start "entryRuleAck"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1679:1: entryRuleAck returns [String current=null] : iv_ruleAck= ruleAck EOF ;
    public final String entryRuleAck() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAck = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1680:2: (iv_ruleAck= ruleAck EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1681:2: iv_ruleAck= ruleAck EOF
            {
             newCompositeNode(grammarAccess.getAckRule()); 
            pushFollow(FOLLOW_ruleAck_in_entryRuleAck3670);
            iv_ruleAck=ruleAck();

            state._fsp--;

             current =iv_ruleAck.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAck3681); 

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
    // $ANTLR end "entryRuleAck"


    // $ANTLR start "ruleAck"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1688:1: ruleAck returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ACK' ;
    public final AntlrDatatypeRuleToken ruleAck() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1691:28: (kw= 'ACK' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1693:2: kw= 'ACK'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleAck3718); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAckAccess().getACKKeyword()); 
                

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
    // $ANTLR end "ruleAck"


    // $ANTLR start "entryRuleFin"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1706:1: entryRuleFin returns [String current=null] : iv_ruleFin= ruleFin EOF ;
    public final String entryRuleFin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFin = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1707:2: (iv_ruleFin= ruleFin EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1708:2: iv_ruleFin= ruleFin EOF
            {
             newCompositeNode(grammarAccess.getFinRule()); 
            pushFollow(FOLLOW_ruleFin_in_entryRuleFin3758);
            iv_ruleFin=ruleFin();

            state._fsp--;

             current =iv_ruleFin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFin3769); 

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
    // $ANTLR end "entryRuleFin"


    // $ANTLR start "ruleFin"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1715:1: ruleFin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'FIN' ;
    public final AntlrDatatypeRuleToken ruleFin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1718:28: (kw= 'FIN' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1720:2: kw= 'FIN'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleFin3806); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFinAccess().getFINKeyword()); 
                

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
    // $ANTLR end "ruleFin"


    // $ANTLR start "entryRuleRst"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1733:1: entryRuleRst returns [String current=null] : iv_ruleRst= ruleRst EOF ;
    public final String entryRuleRst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRst = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1734:2: (iv_ruleRst= ruleRst EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1735:2: iv_ruleRst= ruleRst EOF
            {
             newCompositeNode(grammarAccess.getRstRule()); 
            pushFollow(FOLLOW_ruleRst_in_entryRuleRst3846);
            iv_ruleRst=ruleRst();

            state._fsp--;

             current =iv_ruleRst.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRst3857); 

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
    // $ANTLR end "entryRuleRst"


    // $ANTLR start "ruleRst"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1742:1: ruleRst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'RST' ;
    public final AntlrDatatypeRuleToken ruleRst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1745:28: (kw= 'RST' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1747:2: kw= 'RST'
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleRst3894); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRstAccess().getRSTKeyword()); 
                

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
    // $ANTLR end "ruleRst"


    // $ANTLR start "entryRuleAll"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1760:1: entryRuleAll returns [String current=null] : iv_ruleAll= ruleAll EOF ;
    public final String entryRuleAll() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAll = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1761:2: (iv_ruleAll= ruleAll EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1762:2: iv_ruleAll= ruleAll EOF
            {
             newCompositeNode(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_ruleAll_in_entryRuleAll3934);
            iv_ruleAll=ruleAll();

            state._fsp--;

             current =iv_ruleAll.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAll3945); 

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
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1769:1: ruleAll returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ALL' ;
    public final AntlrDatatypeRuleToken ruleAll() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1772:28: (kw= 'ALL' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1774:2: kw= 'ALL'
            {
            kw=(Token)match(input,48,FOLLOW_48_in_ruleAll3982); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAllAccess().getALLKeyword()); 
                

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
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleNone"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1787:1: entryRuleNone returns [String current=null] : iv_ruleNone= ruleNone EOF ;
    public final String entryRuleNone() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNone = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1788:2: (iv_ruleNone= ruleNone EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1789:2: iv_ruleNone= ruleNone EOF
            {
             newCompositeNode(grammarAccess.getNoneRule()); 
            pushFollow(FOLLOW_ruleNone_in_entryRuleNone4022);
            iv_ruleNone=ruleNone();

            state._fsp--;

             current =iv_ruleNone.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNone4033); 

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
    // $ANTLR end "entryRuleNone"


    // $ANTLR start "ruleNone"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1796:1: ruleNone returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NONE' ;
    public final AntlrDatatypeRuleToken ruleNone() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1799:28: (kw= 'NONE' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1801:2: kw= 'NONE'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleNone4070); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoneAccess().getNONEKeyword()); 
                

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
    // $ANTLR end "ruleNone"


    // $ANTLR start "entryRuleProtocol"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1814:1: entryRuleProtocol returns [String current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final String entryRuleProtocol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtocol = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1815:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1816:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol4110);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol4121); 

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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1823:1: ruleProtocol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Tcp_0= ruleTcp | this_Udp_1= ruleUdp | this_Icmp_2= ruleIcmp ) ;
    public final AntlrDatatypeRuleToken ruleProtocol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Tcp_0 = null;

        AntlrDatatypeRuleToken this_Udp_1 = null;

        AntlrDatatypeRuleToken this_Icmp_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1826:28: ( (this_Tcp_0= ruleTcp | this_Udp_1= ruleUdp | this_Icmp_2= ruleIcmp ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1827:1: (this_Tcp_0= ruleTcp | this_Udp_1= ruleUdp | this_Icmp_2= ruleIcmp )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1827:1: (this_Tcp_0= ruleTcp | this_Udp_1= ruleUdp | this_Icmp_2= ruleIcmp )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt28=1;
                }
                break;
            case 50:
                {
                alt28=2;
                }
                break;
            case 51:
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
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1828:5: this_Tcp_0= ruleTcp
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getTcpParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTcp_in_ruleProtocol4168);
                    this_Tcp_0=ruleTcp();

                    state._fsp--;


                    		current.merge(this_Tcp_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1840:5: this_Udp_1= ruleUdp
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getUdpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUdp_in_ruleProtocol4201);
                    this_Udp_1=ruleUdp();

                    state._fsp--;


                    		current.merge(this_Udp_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1852:5: this_Icmp_2= ruleIcmp
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getIcmpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIcmp_in_ruleProtocol4234);
                    this_Icmp_2=ruleIcmp();

                    state._fsp--;


                    		current.merge(this_Icmp_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleTcp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1870:1: entryRuleTcp returns [String current=null] : iv_ruleTcp= ruleTcp EOF ;
    public final String entryRuleTcp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTcp = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1871:2: (iv_ruleTcp= ruleTcp EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1872:2: iv_ruleTcp= ruleTcp EOF
            {
             newCompositeNode(grammarAccess.getTcpRule()); 
            pushFollow(FOLLOW_ruleTcp_in_entryRuleTcp4280);
            iv_ruleTcp=ruleTcp();

            state._fsp--;

             current =iv_ruleTcp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTcp4291); 

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
    // $ANTLR end "entryRuleTcp"


    // $ANTLR start "ruleTcp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1879:1: ruleTcp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'tcp' ;
    public final AntlrDatatypeRuleToken ruleTcp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1882:28: (kw= 'tcp' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1884:2: kw= 'tcp'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleTcp4328); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTcpAccess().getTcpKeyword()); 
                

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
    // $ANTLR end "ruleTcp"


    // $ANTLR start "entryRuleUdp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1897:1: entryRuleUdp returns [String current=null] : iv_ruleUdp= ruleUdp EOF ;
    public final String entryRuleUdp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUdp = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1898:2: (iv_ruleUdp= ruleUdp EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1899:2: iv_ruleUdp= ruleUdp EOF
            {
             newCompositeNode(grammarAccess.getUdpRule()); 
            pushFollow(FOLLOW_ruleUdp_in_entryRuleUdp4368);
            iv_ruleUdp=ruleUdp();

            state._fsp--;

             current =iv_ruleUdp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUdp4379); 

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
    // $ANTLR end "entryRuleUdp"


    // $ANTLR start "ruleUdp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1906:1: ruleUdp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'udp' ;
    public final AntlrDatatypeRuleToken ruleUdp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1909:28: (kw= 'udp' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1911:2: kw= 'udp'
            {
            kw=(Token)match(input,50,FOLLOW_50_in_ruleUdp4416); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUdpAccess().getUdpKeyword()); 
                

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
    // $ANTLR end "ruleUdp"


    // $ANTLR start "entryRuleIcmp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1924:1: entryRuleIcmp returns [String current=null] : iv_ruleIcmp= ruleIcmp EOF ;
    public final String entryRuleIcmp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIcmp = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1925:2: (iv_ruleIcmp= ruleIcmp EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1926:2: iv_ruleIcmp= ruleIcmp EOF
            {
             newCompositeNode(grammarAccess.getIcmpRule()); 
            pushFollow(FOLLOW_ruleIcmp_in_entryRuleIcmp4456);
            iv_ruleIcmp=ruleIcmp();

            state._fsp--;

             current =iv_ruleIcmp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIcmp4467); 

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
    // $ANTLR end "entryRuleIcmp"


    // $ANTLR start "ruleIcmp"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1933:1: ruleIcmp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'icmp' ;
    public final AntlrDatatypeRuleToken ruleIcmp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1936:28: (kw= 'icmp' )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1938:2: kw= 'icmp'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleIcmp4504); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIcmpAccess().getIcmpKeyword()); 
                

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
    // $ANTLR end "ruleIcmp"


    // $ANTLR start "entryRuleTarget"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1951:1: entryRuleTarget returns [String current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final String entryRuleTarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTarget = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1952:2: (iv_ruleTarget= ruleTarget EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1953:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_ruleTarget_in_entryRuleTarget4544);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTarget4555); 

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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1960:1: ruleTarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1963:28: (this_ID_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1964:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTarget4594); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getTargetAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleChain"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1979:1: entryRuleChain returns [EObject current=null] : iv_ruleChain= ruleChain EOF ;
    public final EObject entryRuleChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1980:2: (iv_ruleChain= ruleChain EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1981:2: iv_ruleChain= ruleChain EOF
            {
             newCompositeNode(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_ruleChain_in_entryRuleChain4638);
            iv_ruleChain=ruleChain();

            state._fsp--;

             current =iv_ruleChain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChain4648); 

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
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1988:1: ruleChain returns [EObject current=null] : ( (lv_chainName_0_0= RULE_ID ) ) ;
    public final EObject ruleChain() throws RecognitionException {
        EObject current = null;

        Token lv_chainName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1991:28: ( ( (lv_chainName_0_0= RULE_ID ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1992:1: ( (lv_chainName_0_0= RULE_ID ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1992:1: ( (lv_chainName_0_0= RULE_ID ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1993:1: (lv_chainName_0_0= RULE_ID )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1993:1: (lv_chainName_0_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:1994:3: lv_chainName_0_0= RULE_ID
            {
            lv_chainName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChain4689); 

            			newLeafNode(lv_chainName_0_0, grammarAccess.getChainAccess().getChainNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"chainName",
                    		lv_chainName_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleChainDeclaration"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2020:1: entryRuleChainDeclaration returns [EObject current=null] : iv_ruleChainDeclaration= ruleChainDeclaration EOF ;
    public final EObject entryRuleChainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainDeclaration = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2021:2: (iv_ruleChainDeclaration= ruleChainDeclaration EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2022:2: iv_ruleChainDeclaration= ruleChainDeclaration EOF
            {
             newCompositeNode(grammarAccess.getChainDeclarationRule()); 
            pushFollow(FOLLOW_ruleChainDeclaration_in_entryRuleChainDeclaration4731);
            iv_ruleChainDeclaration=ruleChainDeclaration();

            state._fsp--;

             current =iv_ruleChainDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChainDeclaration4741); 

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
    // $ANTLR end "entryRuleChainDeclaration"


    // $ANTLR start "ruleChainDeclaration"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2029:1: ruleChainDeclaration returns [EObject current=null] : (otherlv_0= 'iptables' otherlv_1= '-N' this_ChainName_2= ruleChainName ) ;
    public final EObject ruleChainDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_ChainName_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2032:28: ( (otherlv_0= 'iptables' otherlv_1= '-N' this_ChainName_2= ruleChainName ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2033:1: (otherlv_0= 'iptables' otherlv_1= '-N' this_ChainName_2= ruleChainName )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2033:1: (otherlv_0= 'iptables' otherlv_1= '-N' this_ChainName_2= ruleChainName )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2033:3: otherlv_0= 'iptables' otherlv_1= '-N' this_ChainName_2= ruleChainName
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleChainDeclaration4778); 

                	newLeafNode(otherlv_0, grammarAccess.getChainDeclarationAccess().getIptablesKeyword_0());
                
            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleChainDeclaration4790); 

                	newLeafNode(otherlv_1, grammarAccess.getChainDeclarationAccess().getNKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getChainDeclarationAccess().getChainNameParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleChainName_in_ruleChainDeclaration4812);
            this_ChainName_2=ruleChainName();

            state._fsp--;

             
                    current = this_ChainName_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleChainDeclaration"


    // $ANTLR start "entryRuleChainName"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2058:1: entryRuleChainName returns [EObject current=null] : iv_ruleChainName= ruleChainName EOF ;
    public final EObject entryRuleChainName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainName = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2059:2: (iv_ruleChainName= ruleChainName EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2060:2: iv_ruleChainName= ruleChainName EOF
            {
             newCompositeNode(grammarAccess.getChainNameRule()); 
            pushFollow(FOLLOW_ruleChainName_in_entryRuleChainName4847);
            iv_ruleChainName=ruleChainName();

            state._fsp--;

             current =iv_ruleChainName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChainName4857); 

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
    // $ANTLR end "entryRuleChainName"


    // $ANTLR start "ruleChainName"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2067:1: ruleChainName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChainName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2070:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2071:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2071:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2072:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2072:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2073:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChainName4898); 

            			newLeafNode(lv_name_0_0, grammarAccess.getChainNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChainNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleChainName"


    // $ANTLR start "entryRuleIPExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2097:1: entryRuleIPExpr returns [String current=null] : iv_ruleIPExpr= ruleIPExpr EOF ;
    public final String entryRuleIPExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIPExpr = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2098:2: (iv_ruleIPExpr= ruleIPExpr EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2099:2: iv_ruleIPExpr= ruleIPExpr EOF
            {
             newCompositeNode(grammarAccess.getIPExprRule()); 
            pushFollow(FOLLOW_ruleIPExpr_in_entryRuleIPExpr4939);
            iv_ruleIPExpr=ruleIPExpr();

            state._fsp--;

             current =iv_ruleIPExpr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPExpr4950); 

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
    // $ANTLR end "entryRuleIPExpr"


    // $ANTLR start "ruleIPExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2106:1: ruleIPExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ipByteExpr_0= ruleipByteExpr kw= '.' this_ipByteExpr_2= ruleipByteExpr kw= '.' this_ipByteExpr_4= ruleipByteExpr kw= '.' this_ipByteExpr_6= ruleipByteExpr (this_IpRangeExpr_7= ruleIpRangeExpr )? ) ;
    public final AntlrDatatypeRuleToken ruleIPExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ipByteExpr_0 = null;

        AntlrDatatypeRuleToken this_ipByteExpr_2 = null;

        AntlrDatatypeRuleToken this_ipByteExpr_4 = null;

        AntlrDatatypeRuleToken this_ipByteExpr_6 = null;

        AntlrDatatypeRuleToken this_IpRangeExpr_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2109:28: ( (this_ipByteExpr_0= ruleipByteExpr kw= '.' this_ipByteExpr_2= ruleipByteExpr kw= '.' this_ipByteExpr_4= ruleipByteExpr kw= '.' this_ipByteExpr_6= ruleipByteExpr (this_IpRangeExpr_7= ruleIpRangeExpr )? ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2110:1: (this_ipByteExpr_0= ruleipByteExpr kw= '.' this_ipByteExpr_2= ruleipByteExpr kw= '.' this_ipByteExpr_4= ruleipByteExpr kw= '.' this_ipByteExpr_6= ruleipByteExpr (this_IpRangeExpr_7= ruleIpRangeExpr )? )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2110:1: (this_ipByteExpr_0= ruleipByteExpr kw= '.' this_ipByteExpr_2= ruleipByteExpr kw= '.' this_ipByteExpr_4= ruleipByteExpr kw= '.' this_ipByteExpr_6= ruleipByteExpr (this_IpRangeExpr_7= ruleIpRangeExpr )? )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2111:5: this_ipByteExpr_0= ruleipByteExpr kw= '.' this_ipByteExpr_2= ruleipByteExpr kw= '.' this_ipByteExpr_4= ruleipByteExpr kw= '.' this_ipByteExpr_6= ruleipByteExpr (this_IpRangeExpr_7= ruleIpRangeExpr )?
            {
             
                    newCompositeNode(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleipByteExpr_in_ruleIPExpr4997);
            this_ipByteExpr_0=ruleipByteExpr();

            state._fsp--;


            		current.merge(this_ipByteExpr_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,53,FOLLOW_53_in_ruleIPExpr5015); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIPExprAccess().getFullStopKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleipByteExpr_in_ruleIPExpr5037);
            this_ipByteExpr_2=ruleipByteExpr();

            state._fsp--;


            		current.merge(this_ipByteExpr_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,53,FOLLOW_53_in_ruleIPExpr5055); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIPExprAccess().getFullStopKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleipByteExpr_in_ruleIPExpr5077);
            this_ipByteExpr_4=ruleipByteExpr();

            state._fsp--;


            		current.merge(this_ipByteExpr_4);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,53,FOLLOW_53_in_ruleIPExpr5095); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIPExprAccess().getFullStopKeyword_5()); 
                
             
                    newCompositeNode(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_6()); 
                
            pushFollow(FOLLOW_ruleipByteExpr_in_ruleIPExpr5117);
            this_ipByteExpr_6=ruleipByteExpr();

            state._fsp--;


            		current.merge(this_ipByteExpr_6);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2172:1: (this_IpRangeExpr_7= ruleIpRangeExpr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2173:5: this_IpRangeExpr_7= ruleIpRangeExpr
                    {
                     
                            newCompositeNode(grammarAccess.getIPExprAccess().getIpRangeExprParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleIpRangeExpr_in_ruleIPExpr5145);
                    this_IpRangeExpr_7=ruleIpRangeExpr();

                    state._fsp--;


                    		current.merge(this_IpRangeExpr_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleIPExpr"


    // $ANTLR start "entryRuleipByteExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2191:1: entryRuleipByteExpr returns [String current=null] : iv_ruleipByteExpr= ruleipByteExpr EOF ;
    public final String entryRuleipByteExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleipByteExpr = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2192:2: (iv_ruleipByteExpr= ruleipByteExpr EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2193:2: iv_ruleipByteExpr= ruleipByteExpr EOF
            {
             newCompositeNode(grammarAccess.getIpByteExprRule()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_entryRuleipByteExpr5193);
            iv_ruleipByteExpr=ruleipByteExpr();

            state._fsp--;

             current =iv_ruleipByteExpr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleipByteExpr5204); 

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
    // $ANTLR end "entryRuleipByteExpr"


    // $ANTLR start "ruleipByteExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2200:1: ruleipByteExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleipByteExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2203:28: (this_INT_0= RULE_INT )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2204:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleipByteExpr5243); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getIpByteExprAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleipByteExpr"


    // $ANTLR start "entryRuleIpRangeExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2219:1: entryRuleIpRangeExpr returns [String current=null] : iv_ruleIpRangeExpr= ruleIpRangeExpr EOF ;
    public final String entryRuleIpRangeExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIpRangeExpr = null;


        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2220:2: (iv_ruleIpRangeExpr= ruleIpRangeExpr EOF )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2221:2: iv_ruleIpRangeExpr= ruleIpRangeExpr EOF
            {
             newCompositeNode(grammarAccess.getIpRangeExprRule()); 
            pushFollow(FOLLOW_ruleIpRangeExpr_in_entryRuleIpRangeExpr5288);
            iv_ruleIpRangeExpr=ruleIpRangeExpr();

            state._fsp--;

             current =iv_ruleIpRangeExpr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIpRangeExpr5299); 

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
    // $ANTLR end "entryRuleIpRangeExpr"


    // $ANTLR start "ruleIpRangeExpr"
    // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2228:1: ruleIpRangeExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIpRangeExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2231:28: ( (kw= '/' this_INT_1= RULE_INT ) )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2232:1: (kw= '/' this_INT_1= RULE_INT )
            {
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2232:1: (kw= '/' this_INT_1= RULE_INT )
            // ../org.xtext.firewall.iptables/src-gen/org/xtext/example/iptables/parser/antlr/internal/InternalIptables.g:2233:2: kw= '/' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleIpRangeExpr5337); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIpRangeExprAccess().getSolidusKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIpRangeExpr5352); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getIpRangeExprAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleIpRangeExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainDeclaration_in_ruleRule222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterDeclaration_in_ruleRule249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterDeclaration_in_entryRuleFilterDeclaration285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterDeclaration295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilteringSpec_in_ruleFilterDeclaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilteringSpec_in_entryRuleFilteringSpec375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilteringSpec385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterSpec_in_ruleFilteringSpec431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterSpec_in_entryRuleFilterSpec465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterSpec475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFilterSpec512 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleFilterSpec532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13_in_ruleFilterSpec561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14_in_ruleFilterSpec590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleChain_in_ruleFilterSpec627 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_15_in_ruleFilterSpec640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIPExpr_in_ruleFilterSpec661 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_16_in_ruleFilterSpec676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleFilterSpec697 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_17_in_ruleFilterSpec712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIPExpr_in_ruleFilterSpec733 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_18_in_ruleFilterSpec748 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleFilterSpec769 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_19_in_ruleFilterSpec784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFilterSpec801 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_20_in_ruleFilterSpec821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFilterSpec838 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_21_in_ruleFilterSpec863 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_22_in_ruleFilterSpec895 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_23_in_ruleFilterSpec922 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleMatch_in_ruleFilterSpec943 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_24_in_ruleFilterSpec958 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleFilterSpec979 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_25_in_ruleFilterSpec992 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleFilterSpec1013 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_26_in_ruleFilterSpec1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDir_in_ruleFilterSpec1051 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_27_in_ruleFilterSpec1066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleStatus_in_ruleFilterSpec1087 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_28_in_ruleFilterSpec1102 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleFilterSpec1123 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_25_in_ruleFilterSpec1136 = new BitSet(new long[]{0x00000FFC00000000L});
    public static final BitSet FOLLOW_ruleState_in_ruleFilterSpec1157 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_29_in_ruleFilterSpec1174 = new BitSet(new long[]{0x0001F00800000000L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_ruleFilterSpec1195 = new BitSet(new long[]{0x0001F00802000000L});
    public static final BitSet FOLLOW_25_in_ruleFilterSpec1208 = new BitSet(new long[]{0x0001F00800000000L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_ruleFilterSpec1229 = new BitSet(new long[]{0x0001F00802000000L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_ruleFilterSpec1252 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_25_in_ruleFilterSpec1265 = new BitSet(new long[]{0x0001F00800000000L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_ruleFilterSpec1286 = new BitSet(new long[]{0x000000007FFF8020L});
    public static final BitSet FOLLOW_30_in_ruleFilterSpec1303 = new BitSet(new long[]{0x000000007DFF8020L});
    public static final BitSet FOLLOW_ruleTarget_in_ruleFilterSpec1326 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleFilterSpec1339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLP_in_ruleFilterSpec1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLP_in_entryRuleLP1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLP1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLP1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConntrack_in_ruleMatch1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMatch_in_ruleMatch1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_entryRuleDir1695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDir1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDir1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatus1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConntrack_in_entryRuleConntrack1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConntrack1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConntrack1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMatch_in_entryRuleStateMatch1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMatch1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateMatch2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalMatchStates_in_ruleState2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFulMatchStates_in_ruleState2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFulMatchStates_in_entryRuleStateFulMatchStates2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFulMatchStates2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoneS_in_ruleStateFulMatchStates2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynSent_in_ruleStateFulMatchStates2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynRecv_in_ruleStateFulMatchStates2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstablished_in_ruleStateFulMatchStates2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinWait_in_ruleStateFulMatchStates2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseWait_in_ruleStateFulMatchStates2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastAck_in_ruleStateFulMatchStates2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeWait_in_ruleStateFulMatchStates2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClose_in_ruleStateFulMatchStates2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalMatchStates_in_entryRuleNormalMatchStates2421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalMatchStates2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_ruleNormalMatchStates2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNew2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoneS_in_entryRuleNoneS2600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoneS2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNoneS2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynSent_in_entryRuleSynSent2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynSent2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSynSent2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynRecv_in_entryRuleSynRecv2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynRecv2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSynRecv2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstablished_in_entryRuleEstablished2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstablished2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEstablished2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinWait_in_entryRuleFinWait2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinWait2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFinWait3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseWait_in_entryRuleCloseWait3040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloseWait3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCloseWait3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastAck_in_entryRuleLastAck3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastAck3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLastAck3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeWait_in_entryRuleTimeWait3216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeWait3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTimeWait3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClose_in_entryRuleClose3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClose3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClose3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_entryRuleTCPFlag3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCPFlag3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyn_in_ruleTCPFlag3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAck_in_ruleTCPFlag3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFin_in_ruleTCPFlag3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRst_in_ruleTCPFlag3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_ruleTCPFlag3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNone_in_ruleTCPFlag3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyn_in_entryRuleSyn3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyn3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSyn3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAck_in_entryRuleAck3670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAck3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAck3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFin_in_entryRuleFin3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFin3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFin3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRst_in_entryRuleRst3846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRst3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRst3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_entryRuleAll3934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAll3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAll3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNone_in_entryRuleNone4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNone4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNone4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol4110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTcp_in_ruleProtocol4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUdp_in_ruleProtocol4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcmp_in_ruleProtocol4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTcp_in_entryRuleTcp4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTcp4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTcp4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUdp_in_entryRuleUdp4368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUdp4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUdp4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcmp_in_entryRuleIcmp4456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIcmp4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIcmp4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_entryRuleTarget4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTarget4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTarget4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChain_in_entryRuleChain4638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChain4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChain4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainDeclaration_in_entryRuleChainDeclaration4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChainDeclaration4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleChainDeclaration4778 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleChainDeclaration4790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleChainName_in_ruleChainDeclaration4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainName_in_entryRuleChainName4847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChainName4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChainName4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPExpr_in_entryRuleIPExpr4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPExpr4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_ruleIPExpr4997 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleIPExpr5015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_ruleIPExpr5037 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleIPExpr5055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_ruleIPExpr5077 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleIPExpr5095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_ruleIPExpr5117 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleIpRangeExpr_in_ruleIPExpr5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_entryRuleipByteExpr5193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleipByteExpr5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleipByteExpr5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIpRangeExpr_in_entryRuleIpRangeExpr5288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIpRangeExpr5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIpRangeExpr5337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIpRangeExpr5352 = new BitSet(new long[]{0x0000000000000002L});

}