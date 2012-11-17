package org.xtext.example.iptables.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.iptables.services.IptablesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIptablesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'conntrack'", "'State'", "'NEW'", "'NONE'", "'SYN_SENT'", "'SYN_RECV'", "'ESTABLISHED'", "'FIN_WAIT'", "'CLOSE_WAIT'", "'LAST_ACK'", "'TIME_WAIT'", "'CLOSE'", "'SYN'", "'ACK'", "'FIN'", "'RST'", "'ALL'", "'tcp'", "'udp'", "'icmp'", "'-A'", "'-D'", "'-P'", "'iptables'", "'-j'", "'-s'", "'-i'", "'-d'", "'-p'", "'--sport'", "'--dport'", "'--m'", "'--ctstate'", "','", "'--ctdir'", "'--ctstatus'", "'--state'", "'--tcp-flags'", "'--log-prefix'", "'-N'", "'.'", "'/'", "'!'", "'--syn'"
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g"; }


     
     	private IptablesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IptablesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:61:1: ( ruleModel EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:69:1: ruleModel : ( ( rule__Model__RulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:73:2: ( ( ( rule__Model__RulesAssignment )* ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:74:1: ( ( rule__Model__RulesAssignment )* )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:74:1: ( ( rule__Model__RulesAssignment )* )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:75:1: ( rule__Model__RulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:76:1: ( rule__Model__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:76:2: rule__Model__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__RulesAssignment_in_ruleModel94);
            	    rule__Model__RulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:89:1: ( ruleRule EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule122);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:97:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:101:2: ( ( ( rule__Rule__Alternatives ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:102:1: ( ( rule__Rule__Alternatives ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:102:1: ( ( rule__Rule__Alternatives ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:103:1: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:104:1: ( rule__Rule__Alternatives )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:104:2: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule155);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilterDeclaration"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:116:1: entryRuleFilterDeclaration : ruleFilterDeclaration EOF ;
    public final void entryRuleFilterDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:117:1: ( ruleFilterDeclaration EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:118:1: ruleFilterDeclaration EOF
            {
             before(grammarAccess.getFilterDeclarationRule()); 
            pushFollow(FOLLOW_ruleFilterDeclaration_in_entryRuleFilterDeclaration182);
            ruleFilterDeclaration();

            state._fsp--;

             after(grammarAccess.getFilterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterDeclaration189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterDeclaration"


    // $ANTLR start "ruleFilterDeclaration"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:125:1: ruleFilterDeclaration : ( ( rule__FilterDeclaration__FilterAssignment ) ) ;
    public final void ruleFilterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:129:2: ( ( ( rule__FilterDeclaration__FilterAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:130:1: ( ( rule__FilterDeclaration__FilterAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:130:1: ( ( rule__FilterDeclaration__FilterAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:131:1: ( rule__FilterDeclaration__FilterAssignment )
            {
             before(grammarAccess.getFilterDeclarationAccess().getFilterAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:132:1: ( rule__FilterDeclaration__FilterAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:132:2: rule__FilterDeclaration__FilterAssignment
            {
            pushFollow(FOLLOW_rule__FilterDeclaration__FilterAssignment_in_ruleFilterDeclaration215);
            rule__FilterDeclaration__FilterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFilterDeclarationAccess().getFilterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterDeclaration"


    // $ANTLR start "entryRuleFilteringSpec"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:144:1: entryRuleFilteringSpec : ruleFilteringSpec EOF ;
    public final void entryRuleFilteringSpec() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:145:1: ( ruleFilteringSpec EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:146:1: ruleFilteringSpec EOF
            {
             before(grammarAccess.getFilteringSpecRule()); 
            pushFollow(FOLLOW_ruleFilteringSpec_in_entryRuleFilteringSpec242);
            ruleFilteringSpec();

            state._fsp--;

             after(grammarAccess.getFilteringSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilteringSpec249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilteringSpec"


    // $ANTLR start "ruleFilteringSpec"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:153:1: ruleFilteringSpec : ( ruleFilterSpec ) ;
    public final void ruleFilteringSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:157:2: ( ( ruleFilterSpec ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:158:1: ( ruleFilterSpec )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:158:1: ( ruleFilterSpec )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:159:1: ruleFilterSpec
            {
             before(grammarAccess.getFilteringSpecAccess().getFilterSpecParserRuleCall()); 
            pushFollow(FOLLOW_ruleFilterSpec_in_ruleFilteringSpec275);
            ruleFilterSpec();

            state._fsp--;

             after(grammarAccess.getFilteringSpecAccess().getFilterSpecParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilteringSpec"


    // $ANTLR start "entryRuleFilterSpec"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:172:1: entryRuleFilterSpec : ruleFilterSpec EOF ;
    public final void entryRuleFilterSpec() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:173:1: ( ruleFilterSpec EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:174:1: ruleFilterSpec EOF
            {
             before(grammarAccess.getFilterSpecRule()); 
            pushFollow(FOLLOW_ruleFilterSpec_in_entryRuleFilterSpec301);
            ruleFilterSpec();

            state._fsp--;

             after(grammarAccess.getFilterSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterSpec308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterSpec"


    // $ANTLR start "ruleFilterSpec"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:181:1: ruleFilterSpec : ( ( rule__FilterSpec__Group__0 ) ) ;
    public final void ruleFilterSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:185:2: ( ( ( rule__FilterSpec__Group__0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:186:1: ( ( rule__FilterSpec__Group__0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:186:1: ( ( rule__FilterSpec__Group__0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:187:1: ( rule__FilterSpec__Group__0 )
            {
             before(grammarAccess.getFilterSpecAccess().getGroup()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:188:1: ( rule__FilterSpec__Group__0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:188:2: rule__FilterSpec__Group__0
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__0_in_ruleFilterSpec334);
            rule__FilterSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterSpec"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:200:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:201:1: ( ruleInterface EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:202:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface361);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:209:1: ruleInterface : ( ( rule__Interface__NameAssignment ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:213:2: ( ( ( rule__Interface__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:214:1: ( ( rule__Interface__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:214:1: ( ( rule__Interface__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:215:1: ( rule__Interface__NameAssignment )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:216:1: ( rule__Interface__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:216:2: rule__Interface__NameAssignment
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_in_ruleInterface394);
            rule__Interface__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleLP"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:228:1: entryRuleLP : ruleLP EOF ;
    public final void entryRuleLP() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:229:1: ( ruleLP EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:230:1: ruleLP EOF
            {
             before(grammarAccess.getLPRule()); 
            pushFollow(FOLLOW_ruleLP_in_entryRuleLP421);
            ruleLP();

            state._fsp--;

             after(grammarAccess.getLPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLP428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLP"


    // $ANTLR start "ruleLP"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:237:1: ruleLP : ( ( rule__LP__NameAssignment ) ) ;
    public final void ruleLP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:241:2: ( ( ( rule__LP__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:242:1: ( ( rule__LP__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:242:1: ( ( rule__LP__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:243:1: ( rule__LP__NameAssignment )
            {
             before(grammarAccess.getLPAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:244:1: ( rule__LP__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:244:2: rule__LP__NameAssignment
            {
            pushFollow(FOLLOW_rule__LP__NameAssignment_in_ruleLP454);
            rule__LP__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLPAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLP"


    // $ANTLR start "entryRuleMatch"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:256:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:257:1: ( ruleMatch EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:258:1: ruleMatch EOF
            {
             before(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_ruleMatch_in_entryRuleMatch481);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getMatchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatch488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:265:1: ruleMatch : ( ( rule__Match__NameAssignment ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:269:2: ( ( ( rule__Match__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:270:1: ( ( rule__Match__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:270:1: ( ( rule__Match__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:271:1: ( rule__Match__NameAssignment )
            {
             before(grammarAccess.getMatchAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:272:1: ( rule__Match__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:272:2: rule__Match__NameAssignment
            {
            pushFollow(FOLLOW_rule__Match__NameAssignment_in_ruleMatch514);
            rule__Match__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleDir"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:284:1: entryRuleDir : ruleDir EOF ;
    public final void entryRuleDir() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:285:1: ( ruleDir EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:286:1: ruleDir EOF
            {
             before(grammarAccess.getDirRule()); 
            pushFollow(FOLLOW_ruleDir_in_entryRuleDir541);
            ruleDir();

            state._fsp--;

             after(grammarAccess.getDirRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDir548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDir"


    // $ANTLR start "ruleDir"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:293:1: ruleDir : ( RULE_ID ) ;
    public final void ruleDir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:297:2: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:298:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:298:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:299:1: RULE_ID
            {
             before(grammarAccess.getDirAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDir574); 
             after(grammarAccess.getDirAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDir"


    // $ANTLR start "entryRuleStatus"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:312:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:313:1: ( ruleStatus EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:314:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus600);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:321:1: ruleStatus : ( RULE_ID ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:325:2: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:326:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:326:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:327:1: RULE_ID
            {
             before(grammarAccess.getStatusAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatus633); 
             after(grammarAccess.getStatusAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleConntrack"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:340:1: entryRuleConntrack : ruleConntrack EOF ;
    public final void entryRuleConntrack() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:341:1: ( ruleConntrack EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:342:1: ruleConntrack EOF
            {
             before(grammarAccess.getConntrackRule()); 
            pushFollow(FOLLOW_ruleConntrack_in_entryRuleConntrack659);
            ruleConntrack();

            state._fsp--;

             after(grammarAccess.getConntrackRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConntrack666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConntrack"


    // $ANTLR start "ruleConntrack"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:349:1: ruleConntrack : ( 'conntrack' ) ;
    public final void ruleConntrack() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:353:2: ( ( 'conntrack' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:354:1: ( 'conntrack' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:354:1: ( 'conntrack' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:355:1: 'conntrack'
            {
             before(grammarAccess.getConntrackAccess().getConntrackKeyword()); 
            match(input,11,FOLLOW_11_in_ruleConntrack693); 
             after(grammarAccess.getConntrackAccess().getConntrackKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConntrack"


    // $ANTLR start "entryRuleStateMatch"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:370:1: entryRuleStateMatch : ruleStateMatch EOF ;
    public final void entryRuleStateMatch() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:371:1: ( ruleStateMatch EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:372:1: ruleStateMatch EOF
            {
             before(grammarAccess.getStateMatchRule()); 
            pushFollow(FOLLOW_ruleStateMatch_in_entryRuleStateMatch721);
            ruleStateMatch();

            state._fsp--;

             after(grammarAccess.getStateMatchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMatch728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMatch"


    // $ANTLR start "ruleStateMatch"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:379:1: ruleStateMatch : ( 'State' ) ;
    public final void ruleStateMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:383:2: ( ( 'State' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:384:1: ( 'State' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:384:1: ( 'State' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:385:1: 'State'
            {
             before(grammarAccess.getStateMatchAccess().getStateKeyword()); 
            match(input,12,FOLLOW_12_in_ruleStateMatch755); 
             after(grammarAccess.getStateMatchAccess().getStateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMatch"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:400:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:401:1: ( ruleState EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:402:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState783);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:409:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:413:2: ( ( ( rule__State__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:414:1: ( ( rule__State__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:414:1: ( ( rule__State__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:415:1: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:416:1: ( rule__State__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:416:2: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_in_ruleState816);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateFulMatchStates"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:428:1: entryRuleStateFulMatchStates : ruleStateFulMatchStates EOF ;
    public final void entryRuleStateFulMatchStates() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:429:1: ( ruleStateFulMatchStates EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:430:1: ruleStateFulMatchStates EOF
            {
             before(grammarAccess.getStateFulMatchStatesRule()); 
            pushFollow(FOLLOW_ruleStateFulMatchStates_in_entryRuleStateFulMatchStates843);
            ruleStateFulMatchStates();

            state._fsp--;

             after(grammarAccess.getStateFulMatchStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFulMatchStates850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateFulMatchStates"


    // $ANTLR start "ruleStateFulMatchStates"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:437:1: ruleStateFulMatchStates : ( ( rule__StateFulMatchStates__NameAssignment ) ) ;
    public final void ruleStateFulMatchStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:441:2: ( ( ( rule__StateFulMatchStates__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:442:1: ( ( rule__StateFulMatchStates__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:442:1: ( ( rule__StateFulMatchStates__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:443:1: ( rule__StateFulMatchStates__NameAssignment )
            {
             before(grammarAccess.getStateFulMatchStatesAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:444:1: ( rule__StateFulMatchStates__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:444:2: rule__StateFulMatchStates__NameAssignment
            {
            pushFollow(FOLLOW_rule__StateFulMatchStates__NameAssignment_in_ruleStateFulMatchStates876);
            rule__StateFulMatchStates__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateFulMatchStatesAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateFulMatchStates"


    // $ANTLR start "entryRuleNormalMatchStates"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:456:1: entryRuleNormalMatchStates : ruleNormalMatchStates EOF ;
    public final void entryRuleNormalMatchStates() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:457:1: ( ruleNormalMatchStates EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:458:1: ruleNormalMatchStates EOF
            {
             before(grammarAccess.getNormalMatchStatesRule()); 
            pushFollow(FOLLOW_ruleNormalMatchStates_in_entryRuleNormalMatchStates903);
            ruleNormalMatchStates();

            state._fsp--;

             after(grammarAccess.getNormalMatchStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalMatchStates910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormalMatchStates"


    // $ANTLR start "ruleNormalMatchStates"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:465:1: ruleNormalMatchStates : ( ( rule__NormalMatchStates__NameAssignment ) ) ;
    public final void ruleNormalMatchStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:469:2: ( ( ( rule__NormalMatchStates__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:470:1: ( ( rule__NormalMatchStates__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:470:1: ( ( rule__NormalMatchStates__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:471:1: ( rule__NormalMatchStates__NameAssignment )
            {
             before(grammarAccess.getNormalMatchStatesAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:472:1: ( rule__NormalMatchStates__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:472:2: rule__NormalMatchStates__NameAssignment
            {
            pushFollow(FOLLOW_rule__NormalMatchStates__NameAssignment_in_ruleNormalMatchStates936);
            rule__NormalMatchStates__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNormalMatchStatesAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalMatchStates"


    // $ANTLR start "entryRuleNew"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:484:1: entryRuleNew : ruleNew EOF ;
    public final void entryRuleNew() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:485:1: ( ruleNew EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:486:1: ruleNew EOF
            {
             before(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew963);
            ruleNew();

            state._fsp--;

             after(grammarAccess.getNewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:493:1: ruleNew : ( 'NEW' ) ;
    public final void ruleNew() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:497:2: ( ( 'NEW' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:498:1: ( 'NEW' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:498:1: ( 'NEW' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:499:1: 'NEW'
            {
             before(grammarAccess.getNewAccess().getNEWKeyword()); 
            match(input,13,FOLLOW_13_in_ruleNew997); 
             after(grammarAccess.getNewAccess().getNEWKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleNoneS"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:514:1: entryRuleNoneS : ruleNoneS EOF ;
    public final void entryRuleNoneS() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:515:1: ( ruleNoneS EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:516:1: ruleNoneS EOF
            {
             before(grammarAccess.getNoneSRule()); 
            pushFollow(FOLLOW_ruleNoneS_in_entryRuleNoneS1025);
            ruleNoneS();

            state._fsp--;

             after(grammarAccess.getNoneSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoneS1032); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoneS"


    // $ANTLR start "ruleNoneS"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:523:1: ruleNoneS : ( 'NONE' ) ;
    public final void ruleNoneS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:527:2: ( ( 'NONE' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:528:1: ( 'NONE' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:528:1: ( 'NONE' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:529:1: 'NONE'
            {
             before(grammarAccess.getNoneSAccess().getNONEKeyword()); 
            match(input,14,FOLLOW_14_in_ruleNoneS1059); 
             after(grammarAccess.getNoneSAccess().getNONEKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoneS"


    // $ANTLR start "entryRuleSynSent"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:544:1: entryRuleSynSent : ruleSynSent EOF ;
    public final void entryRuleSynSent() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:545:1: ( ruleSynSent EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:546:1: ruleSynSent EOF
            {
             before(grammarAccess.getSynSentRule()); 
            pushFollow(FOLLOW_ruleSynSent_in_entryRuleSynSent1087);
            ruleSynSent();

            state._fsp--;

             after(grammarAccess.getSynSentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynSent1094); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSynSent"


    // $ANTLR start "ruleSynSent"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:553:1: ruleSynSent : ( 'SYN_SENT' ) ;
    public final void ruleSynSent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:557:2: ( ( 'SYN_SENT' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:558:1: ( 'SYN_SENT' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:558:1: ( 'SYN_SENT' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:559:1: 'SYN_SENT'
            {
             before(grammarAccess.getSynSentAccess().getSYN_SENTKeyword()); 
            match(input,15,FOLLOW_15_in_ruleSynSent1121); 
             after(grammarAccess.getSynSentAccess().getSYN_SENTKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSynSent"


    // $ANTLR start "entryRuleSynRecv"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:574:1: entryRuleSynRecv : ruleSynRecv EOF ;
    public final void entryRuleSynRecv() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:575:1: ( ruleSynRecv EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:576:1: ruleSynRecv EOF
            {
             before(grammarAccess.getSynRecvRule()); 
            pushFollow(FOLLOW_ruleSynRecv_in_entryRuleSynRecv1149);
            ruleSynRecv();

            state._fsp--;

             after(grammarAccess.getSynRecvRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSynRecv1156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSynRecv"


    // $ANTLR start "ruleSynRecv"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:583:1: ruleSynRecv : ( 'SYN_RECV' ) ;
    public final void ruleSynRecv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:587:2: ( ( 'SYN_RECV' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:588:1: ( 'SYN_RECV' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:588:1: ( 'SYN_RECV' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:589:1: 'SYN_RECV'
            {
             before(grammarAccess.getSynRecvAccess().getSYN_RECVKeyword()); 
            match(input,16,FOLLOW_16_in_ruleSynRecv1183); 
             after(grammarAccess.getSynRecvAccess().getSYN_RECVKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSynRecv"


    // $ANTLR start "entryRuleEstablished"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:604:1: entryRuleEstablished : ruleEstablished EOF ;
    public final void entryRuleEstablished() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:605:1: ( ruleEstablished EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:606:1: ruleEstablished EOF
            {
             before(grammarAccess.getEstablishedRule()); 
            pushFollow(FOLLOW_ruleEstablished_in_entryRuleEstablished1211);
            ruleEstablished();

            state._fsp--;

             after(grammarAccess.getEstablishedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstablished1218); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstablished"


    // $ANTLR start "ruleEstablished"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:613:1: ruleEstablished : ( 'ESTABLISHED' ) ;
    public final void ruleEstablished() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:617:2: ( ( 'ESTABLISHED' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:618:1: ( 'ESTABLISHED' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:618:1: ( 'ESTABLISHED' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:619:1: 'ESTABLISHED'
            {
             before(grammarAccess.getEstablishedAccess().getESTABLISHEDKeyword()); 
            match(input,17,FOLLOW_17_in_ruleEstablished1245); 
             after(grammarAccess.getEstablishedAccess().getESTABLISHEDKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstablished"


    // $ANTLR start "entryRuleFinWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:634:1: entryRuleFinWait : ruleFinWait EOF ;
    public final void entryRuleFinWait() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:635:1: ( ruleFinWait EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:636:1: ruleFinWait EOF
            {
             before(grammarAccess.getFinWaitRule()); 
            pushFollow(FOLLOW_ruleFinWait_in_entryRuleFinWait1273);
            ruleFinWait();

            state._fsp--;

             after(grammarAccess.getFinWaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinWait1280); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinWait"


    // $ANTLR start "ruleFinWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:643:1: ruleFinWait : ( 'FIN_WAIT' ) ;
    public final void ruleFinWait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:647:2: ( ( 'FIN_WAIT' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:648:1: ( 'FIN_WAIT' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:648:1: ( 'FIN_WAIT' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:649:1: 'FIN_WAIT'
            {
             before(grammarAccess.getFinWaitAccess().getFIN_WAITKeyword()); 
            match(input,18,FOLLOW_18_in_ruleFinWait1307); 
             after(grammarAccess.getFinWaitAccess().getFIN_WAITKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinWait"


    // $ANTLR start "entryRuleCloseWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:664:1: entryRuleCloseWait : ruleCloseWait EOF ;
    public final void entryRuleCloseWait() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:665:1: ( ruleCloseWait EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:666:1: ruleCloseWait EOF
            {
             before(grammarAccess.getCloseWaitRule()); 
            pushFollow(FOLLOW_ruleCloseWait_in_entryRuleCloseWait1335);
            ruleCloseWait();

            state._fsp--;

             after(grammarAccess.getCloseWaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCloseWait1342); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloseWait"


    // $ANTLR start "ruleCloseWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:673:1: ruleCloseWait : ( 'CLOSE_WAIT' ) ;
    public final void ruleCloseWait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:677:2: ( ( 'CLOSE_WAIT' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:678:1: ( 'CLOSE_WAIT' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:678:1: ( 'CLOSE_WAIT' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:679:1: 'CLOSE_WAIT'
            {
             before(grammarAccess.getCloseWaitAccess().getCLOSE_WAITKeyword()); 
            match(input,19,FOLLOW_19_in_ruleCloseWait1369); 
             after(grammarAccess.getCloseWaitAccess().getCLOSE_WAITKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloseWait"


    // $ANTLR start "entryRuleLastAck"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:694:1: entryRuleLastAck : ruleLastAck EOF ;
    public final void entryRuleLastAck() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:695:1: ( ruleLastAck EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:696:1: ruleLastAck EOF
            {
             before(grammarAccess.getLastAckRule()); 
            pushFollow(FOLLOW_ruleLastAck_in_entryRuleLastAck1397);
            ruleLastAck();

            state._fsp--;

             after(grammarAccess.getLastAckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastAck1404); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLastAck"


    // $ANTLR start "ruleLastAck"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:703:1: ruleLastAck : ( 'LAST_ACK' ) ;
    public final void ruleLastAck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:707:2: ( ( 'LAST_ACK' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:708:1: ( 'LAST_ACK' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:708:1: ( 'LAST_ACK' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:709:1: 'LAST_ACK'
            {
             before(grammarAccess.getLastAckAccess().getLAST_ACKKeyword()); 
            match(input,20,FOLLOW_20_in_ruleLastAck1431); 
             after(grammarAccess.getLastAckAccess().getLAST_ACKKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLastAck"


    // $ANTLR start "entryRuleTimeWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:724:1: entryRuleTimeWait : ruleTimeWait EOF ;
    public final void entryRuleTimeWait() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:725:1: ( ruleTimeWait EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:726:1: ruleTimeWait EOF
            {
             before(grammarAccess.getTimeWaitRule()); 
            pushFollow(FOLLOW_ruleTimeWait_in_entryRuleTimeWait1459);
            ruleTimeWait();

            state._fsp--;

             after(grammarAccess.getTimeWaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeWait1466); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeWait"


    // $ANTLR start "ruleTimeWait"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:733:1: ruleTimeWait : ( 'TIME_WAIT' ) ;
    public final void ruleTimeWait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:737:2: ( ( 'TIME_WAIT' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:738:1: ( 'TIME_WAIT' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:738:1: ( 'TIME_WAIT' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:739:1: 'TIME_WAIT'
            {
             before(grammarAccess.getTimeWaitAccess().getTIME_WAITKeyword()); 
            match(input,21,FOLLOW_21_in_ruleTimeWait1493); 
             after(grammarAccess.getTimeWaitAccess().getTIME_WAITKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeWait"


    // $ANTLR start "entryRuleClose"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:754:1: entryRuleClose : ruleClose EOF ;
    public final void entryRuleClose() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:755:1: ( ruleClose EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:756:1: ruleClose EOF
            {
             before(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_ruleClose_in_entryRuleClose1521);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getCloseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClose1528); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:763:1: ruleClose : ( 'CLOSE' ) ;
    public final void ruleClose() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:767:2: ( ( 'CLOSE' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:768:1: ( 'CLOSE' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:768:1: ( 'CLOSE' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:769:1: 'CLOSE'
            {
             before(grammarAccess.getCloseAccess().getCLOSEKeyword()); 
            match(input,22,FOLLOW_22_in_ruleClose1555); 
             after(grammarAccess.getCloseAccess().getCLOSEKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleTCPFlag"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:784:1: entryRuleTCPFlag : ruleTCPFlag EOF ;
    public final void entryRuleTCPFlag() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:785:1: ( ruleTCPFlag EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:786:1: ruleTCPFlag EOF
            {
             before(grammarAccess.getTCPFlagRule()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_entryRuleTCPFlag1583);
            ruleTCPFlag();

            state._fsp--;

             after(grammarAccess.getTCPFlagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCPFlag1590); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTCPFlag"


    // $ANTLR start "ruleTCPFlag"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:793:1: ruleTCPFlag : ( ( rule__TCPFlag__NameAssignment ) ) ;
    public final void ruleTCPFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:797:2: ( ( ( rule__TCPFlag__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:798:1: ( ( rule__TCPFlag__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:798:1: ( ( rule__TCPFlag__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:799:1: ( rule__TCPFlag__NameAssignment )
            {
             before(grammarAccess.getTCPFlagAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:800:1: ( rule__TCPFlag__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:800:2: rule__TCPFlag__NameAssignment
            {
            pushFollow(FOLLOW_rule__TCPFlag__NameAssignment_in_ruleTCPFlag1616);
            rule__TCPFlag__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTCPFlagAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTCPFlag"


    // $ANTLR start "entryRuleSyn"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:812:1: entryRuleSyn : ruleSyn EOF ;
    public final void entryRuleSyn() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:813:1: ( ruleSyn EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:814:1: ruleSyn EOF
            {
             before(grammarAccess.getSynRule()); 
            pushFollow(FOLLOW_ruleSyn_in_entryRuleSyn1643);
            ruleSyn();

            state._fsp--;

             after(grammarAccess.getSynRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyn1650); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyn"


    // $ANTLR start "ruleSyn"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:821:1: ruleSyn : ( 'SYN' ) ;
    public final void ruleSyn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:825:2: ( ( 'SYN' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:826:1: ( 'SYN' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:826:1: ( 'SYN' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:827:1: 'SYN'
            {
             before(grammarAccess.getSynAccess().getSYNKeyword()); 
            match(input,23,FOLLOW_23_in_ruleSyn1677); 
             after(grammarAccess.getSynAccess().getSYNKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyn"


    // $ANTLR start "entryRuleAck"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:842:1: entryRuleAck : ruleAck EOF ;
    public final void entryRuleAck() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:843:1: ( ruleAck EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:844:1: ruleAck EOF
            {
             before(grammarAccess.getAckRule()); 
            pushFollow(FOLLOW_ruleAck_in_entryRuleAck1705);
            ruleAck();

            state._fsp--;

             after(grammarAccess.getAckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAck1712); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAck"


    // $ANTLR start "ruleAck"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:851:1: ruleAck : ( 'ACK' ) ;
    public final void ruleAck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:855:2: ( ( 'ACK' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:856:1: ( 'ACK' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:856:1: ( 'ACK' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:857:1: 'ACK'
            {
             before(grammarAccess.getAckAccess().getACKKeyword()); 
            match(input,24,FOLLOW_24_in_ruleAck1739); 
             after(grammarAccess.getAckAccess().getACKKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAck"


    // $ANTLR start "entryRuleFin"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:872:1: entryRuleFin : ruleFin EOF ;
    public final void entryRuleFin() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:873:1: ( ruleFin EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:874:1: ruleFin EOF
            {
             before(grammarAccess.getFinRule()); 
            pushFollow(FOLLOW_ruleFin_in_entryRuleFin1767);
            ruleFin();

            state._fsp--;

             after(grammarAccess.getFinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFin1774); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFin"


    // $ANTLR start "ruleFin"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:881:1: ruleFin : ( 'FIN' ) ;
    public final void ruleFin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:885:2: ( ( 'FIN' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:886:1: ( 'FIN' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:886:1: ( 'FIN' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:887:1: 'FIN'
            {
             before(grammarAccess.getFinAccess().getFINKeyword()); 
            match(input,25,FOLLOW_25_in_ruleFin1801); 
             after(grammarAccess.getFinAccess().getFINKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFin"


    // $ANTLR start "entryRuleRst"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:902:1: entryRuleRst : ruleRst EOF ;
    public final void entryRuleRst() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:903:1: ( ruleRst EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:904:1: ruleRst EOF
            {
             before(grammarAccess.getRstRule()); 
            pushFollow(FOLLOW_ruleRst_in_entryRuleRst1829);
            ruleRst();

            state._fsp--;

             after(grammarAccess.getRstRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRst1836); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRst"


    // $ANTLR start "ruleRst"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:911:1: ruleRst : ( 'RST' ) ;
    public final void ruleRst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:915:2: ( ( 'RST' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:916:1: ( 'RST' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:916:1: ( 'RST' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:917:1: 'RST'
            {
             before(grammarAccess.getRstAccess().getRSTKeyword()); 
            match(input,26,FOLLOW_26_in_ruleRst1863); 
             after(grammarAccess.getRstAccess().getRSTKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRst"


    // $ANTLR start "entryRuleAll"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:932:1: entryRuleAll : ruleAll EOF ;
    public final void entryRuleAll() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:933:1: ( ruleAll EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:934:1: ruleAll EOF
            {
             before(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_ruleAll_in_entryRuleAll1891);
            ruleAll();

            state._fsp--;

             after(grammarAccess.getAllRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAll1898); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:941:1: ruleAll : ( 'ALL' ) ;
    public final void ruleAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:945:2: ( ( 'ALL' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:946:1: ( 'ALL' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:946:1: ( 'ALL' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:947:1: 'ALL'
            {
             before(grammarAccess.getAllAccess().getALLKeyword()); 
            match(input,27,FOLLOW_27_in_ruleAll1925); 
             after(grammarAccess.getAllAccess().getALLKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleNone"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:962:1: entryRuleNone : ruleNone EOF ;
    public final void entryRuleNone() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:963:1: ( ruleNone EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:964:1: ruleNone EOF
            {
             before(grammarAccess.getNoneRule()); 
            pushFollow(FOLLOW_ruleNone_in_entryRuleNone1953);
            ruleNone();

            state._fsp--;

             after(grammarAccess.getNoneRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNone1960); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNone"


    // $ANTLR start "ruleNone"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:971:1: ruleNone : ( 'NONE' ) ;
    public final void ruleNone() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:975:2: ( ( 'NONE' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:976:1: ( 'NONE' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:976:1: ( 'NONE' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:977:1: 'NONE'
            {
             before(grammarAccess.getNoneAccess().getNONEKeyword()); 
            match(input,14,FOLLOW_14_in_ruleNone1987); 
             after(grammarAccess.getNoneAccess().getNONEKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNone"


    // $ANTLR start "entryRuleProtocol"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:992:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:993:1: ( ruleProtocol EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:994:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol2015);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol2022); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1001:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1005:2: ( ( ( rule__Protocol__Alternatives ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1006:1: ( ( rule__Protocol__Alternatives ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1006:1: ( ( rule__Protocol__Alternatives ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1007:1: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1008:1: ( rule__Protocol__Alternatives )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1008:2: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_rule__Protocol__Alternatives_in_ruleProtocol2048);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleTcp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1020:1: entryRuleTcp : ruleTcp EOF ;
    public final void entryRuleTcp() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1021:1: ( ruleTcp EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1022:1: ruleTcp EOF
            {
             before(grammarAccess.getTcpRule()); 
            pushFollow(FOLLOW_ruleTcp_in_entryRuleTcp2075);
            ruleTcp();

            state._fsp--;

             after(grammarAccess.getTcpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTcp2082); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTcp"


    // $ANTLR start "ruleTcp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1029:1: ruleTcp : ( 'tcp' ) ;
    public final void ruleTcp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1033:2: ( ( 'tcp' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1034:1: ( 'tcp' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1034:1: ( 'tcp' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1035:1: 'tcp'
            {
             before(grammarAccess.getTcpAccess().getTcpKeyword()); 
            match(input,28,FOLLOW_28_in_ruleTcp2109); 
             after(grammarAccess.getTcpAccess().getTcpKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTcp"


    // $ANTLR start "entryRuleUdp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1050:1: entryRuleUdp : ruleUdp EOF ;
    public final void entryRuleUdp() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1051:1: ( ruleUdp EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1052:1: ruleUdp EOF
            {
             before(grammarAccess.getUdpRule()); 
            pushFollow(FOLLOW_ruleUdp_in_entryRuleUdp2137);
            ruleUdp();

            state._fsp--;

             after(grammarAccess.getUdpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUdp2144); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUdp"


    // $ANTLR start "ruleUdp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1059:1: ruleUdp : ( 'udp' ) ;
    public final void ruleUdp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1063:2: ( ( 'udp' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1064:1: ( 'udp' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1064:1: ( 'udp' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1065:1: 'udp'
            {
             before(grammarAccess.getUdpAccess().getUdpKeyword()); 
            match(input,29,FOLLOW_29_in_ruleUdp2171); 
             after(grammarAccess.getUdpAccess().getUdpKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUdp"


    // $ANTLR start "entryRuleIcmp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1080:1: entryRuleIcmp : ruleIcmp EOF ;
    public final void entryRuleIcmp() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1081:1: ( ruleIcmp EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1082:1: ruleIcmp EOF
            {
             before(grammarAccess.getIcmpRule()); 
            pushFollow(FOLLOW_ruleIcmp_in_entryRuleIcmp2199);
            ruleIcmp();

            state._fsp--;

             after(grammarAccess.getIcmpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIcmp2206); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIcmp"


    // $ANTLR start "ruleIcmp"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1089:1: ruleIcmp : ( 'icmp' ) ;
    public final void ruleIcmp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1093:2: ( ( 'icmp' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1094:1: ( 'icmp' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1094:1: ( 'icmp' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1095:1: 'icmp'
            {
             before(grammarAccess.getIcmpAccess().getIcmpKeyword()); 
            match(input,30,FOLLOW_30_in_ruleIcmp2233); 
             after(grammarAccess.getIcmpAccess().getIcmpKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIcmp"


    // $ANTLR start "entryRuleTarget"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1110:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1111:1: ( ruleTarget EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1112:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_ruleTarget_in_entryRuleTarget2261);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTarget2268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1119:1: ruleTarget : ( RULE_ID ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1123:2: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1124:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1124:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1125:1: RULE_ID
            {
             before(grammarAccess.getTargetAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTarget2294); 
             after(grammarAccess.getTargetAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleChain"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1138:1: entryRuleChain : ruleChain EOF ;
    public final void entryRuleChain() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1139:1: ( ruleChain EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1140:1: ruleChain EOF
            {
             before(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_ruleChain_in_entryRuleChain2320);
            ruleChain();

            state._fsp--;

             after(grammarAccess.getChainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChain2327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1147:1: ruleChain : ( ( rule__Chain__ChainNameAssignment ) ) ;
    public final void ruleChain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1151:2: ( ( ( rule__Chain__ChainNameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1152:1: ( ( rule__Chain__ChainNameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1152:1: ( ( rule__Chain__ChainNameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1153:1: ( rule__Chain__ChainNameAssignment )
            {
             before(grammarAccess.getChainAccess().getChainNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1154:1: ( rule__Chain__ChainNameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1154:2: rule__Chain__ChainNameAssignment
            {
            pushFollow(FOLLOW_rule__Chain__ChainNameAssignment_in_ruleChain2353);
            rule__Chain__ChainNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChainAccess().getChainNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleChainDeclaration"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1168:1: entryRuleChainDeclaration : ruleChainDeclaration EOF ;
    public final void entryRuleChainDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1169:1: ( ruleChainDeclaration EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1170:1: ruleChainDeclaration EOF
            {
             before(grammarAccess.getChainDeclarationRule()); 
            pushFollow(FOLLOW_ruleChainDeclaration_in_entryRuleChainDeclaration2382);
            ruleChainDeclaration();

            state._fsp--;

             after(grammarAccess.getChainDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChainDeclaration2389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChainDeclaration"


    // $ANTLR start "ruleChainDeclaration"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1177:1: ruleChainDeclaration : ( ( rule__ChainDeclaration__Group__0 ) ) ;
    public final void ruleChainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1181:2: ( ( ( rule__ChainDeclaration__Group__0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1182:1: ( ( rule__ChainDeclaration__Group__0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1182:1: ( ( rule__ChainDeclaration__Group__0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1183:1: ( rule__ChainDeclaration__Group__0 )
            {
             before(grammarAccess.getChainDeclarationAccess().getGroup()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1184:1: ( rule__ChainDeclaration__Group__0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1184:2: rule__ChainDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ChainDeclaration__Group__0_in_ruleChainDeclaration2415);
            rule__ChainDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChainDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChainDeclaration"


    // $ANTLR start "entryRuleChainName"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1196:1: entryRuleChainName : ruleChainName EOF ;
    public final void entryRuleChainName() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1197:1: ( ruleChainName EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1198:1: ruleChainName EOF
            {
             before(grammarAccess.getChainNameRule()); 
            pushFollow(FOLLOW_ruleChainName_in_entryRuleChainName2442);
            ruleChainName();

            state._fsp--;

             after(grammarAccess.getChainNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChainName2449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChainName"


    // $ANTLR start "ruleChainName"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1205:1: ruleChainName : ( ( rule__ChainName__NameAssignment ) ) ;
    public final void ruleChainName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1209:2: ( ( ( rule__ChainName__NameAssignment ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1210:1: ( ( rule__ChainName__NameAssignment ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1210:1: ( ( rule__ChainName__NameAssignment ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1211:1: ( rule__ChainName__NameAssignment )
            {
             before(grammarAccess.getChainNameAccess().getNameAssignment()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1212:1: ( rule__ChainName__NameAssignment )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1212:2: rule__ChainName__NameAssignment
            {
            pushFollow(FOLLOW_rule__ChainName__NameAssignment_in_ruleChainName2475);
            rule__ChainName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChainNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChainName"


    // $ANTLR start "entryRuleIPExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1224:1: entryRuleIPExpr : ruleIPExpr EOF ;
    public final void entryRuleIPExpr() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1225:1: ( ruleIPExpr EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1226:1: ruleIPExpr EOF
            {
             before(grammarAccess.getIPExprRule()); 
            pushFollow(FOLLOW_ruleIPExpr_in_entryRuleIPExpr2502);
            ruleIPExpr();

            state._fsp--;

             after(grammarAccess.getIPExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPExpr2509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIPExpr"


    // $ANTLR start "ruleIPExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1233:1: ruleIPExpr : ( ( rule__IPExpr__Group__0 ) ) ;
    public final void ruleIPExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1237:2: ( ( ( rule__IPExpr__Group__0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1238:1: ( ( rule__IPExpr__Group__0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1238:1: ( ( rule__IPExpr__Group__0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1239:1: ( rule__IPExpr__Group__0 )
            {
             before(grammarAccess.getIPExprAccess().getGroup()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1240:1: ( rule__IPExpr__Group__0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1240:2: rule__IPExpr__Group__0
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__0_in_ruleIPExpr2535);
            rule__IPExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIPExpr"


    // $ANTLR start "entryRuleipByteExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1252:1: entryRuleipByteExpr : ruleipByteExpr EOF ;
    public final void entryRuleipByteExpr() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1253:1: ( ruleipByteExpr EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1254:1: ruleipByteExpr EOF
            {
             before(grammarAccess.getIpByteExprRule()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_entryRuleipByteExpr2562);
            ruleipByteExpr();

            state._fsp--;

             after(grammarAccess.getIpByteExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleipByteExpr2569); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleipByteExpr"


    // $ANTLR start "ruleipByteExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1261:1: ruleipByteExpr : ( RULE_INT ) ;
    public final void ruleipByteExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1265:2: ( ( RULE_INT ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1266:1: ( RULE_INT )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1266:1: ( RULE_INT )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1267:1: RULE_INT
            {
             before(grammarAccess.getIpByteExprAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleipByteExpr2595); 
             after(grammarAccess.getIpByteExprAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleipByteExpr"


    // $ANTLR start "entryRuleIpRangeExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1280:1: entryRuleIpRangeExpr : ruleIpRangeExpr EOF ;
    public final void entryRuleIpRangeExpr() throws RecognitionException {
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1281:1: ( ruleIpRangeExpr EOF )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1282:1: ruleIpRangeExpr EOF
            {
             before(grammarAccess.getIpRangeExprRule()); 
            pushFollow(FOLLOW_ruleIpRangeExpr_in_entryRuleIpRangeExpr2621);
            ruleIpRangeExpr();

            state._fsp--;

             after(grammarAccess.getIpRangeExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIpRangeExpr2628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIpRangeExpr"


    // $ANTLR start "ruleIpRangeExpr"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1289:1: ruleIpRangeExpr : ( ( rule__IpRangeExpr__Group__0 ) ) ;
    public final void ruleIpRangeExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1293:2: ( ( ( rule__IpRangeExpr__Group__0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1294:1: ( ( rule__IpRangeExpr__Group__0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1294:1: ( ( rule__IpRangeExpr__Group__0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1295:1: ( rule__IpRangeExpr__Group__0 )
            {
             before(grammarAccess.getIpRangeExprAccess().getGroup()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1296:1: ( rule__IpRangeExpr__Group__0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1296:2: rule__IpRangeExpr__Group__0
            {
            pushFollow(FOLLOW_rule__IpRangeExpr__Group__0_in_ruleIpRangeExpr2654);
            rule__IpRangeExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIpRangeExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIpRangeExpr"


    // $ANTLR start "rule__Rule__Alternatives"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1308:1: rule__Rule__Alternatives : ( ( ( rule__Rule__DeclarationAssignment_0 ) ) | ( ( rule__Rule__FilterAssignment_1 ) ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1312:1: ( ( ( rule__Rule__DeclarationAssignment_0 ) ) | ( ( rule__Rule__FilterAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=31 && LA2_1<=33)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==50) ) {
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
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1313:1: ( ( rule__Rule__DeclarationAssignment_0 ) )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1313:1: ( ( rule__Rule__DeclarationAssignment_0 ) )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1314:1: ( rule__Rule__DeclarationAssignment_0 )
                    {
                     before(grammarAccess.getRuleAccess().getDeclarationAssignment_0()); 
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1315:1: ( rule__Rule__DeclarationAssignment_0 )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1315:2: rule__Rule__DeclarationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__DeclarationAssignment_0_in_rule__Rule__Alternatives2690);
                    rule__Rule__DeclarationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getDeclarationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1319:6: ( ( rule__Rule__FilterAssignment_1 ) )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1319:6: ( ( rule__Rule__FilterAssignment_1 ) )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1320:1: ( rule__Rule__FilterAssignment_1 )
                    {
                     before(grammarAccess.getRuleAccess().getFilterAssignment_1()); 
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1321:1: ( rule__Rule__FilterAssignment_1 )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1321:2: rule__Rule__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Alternatives2708);
                    rule__Rule__FilterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getFilterAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__FilterSpec__OptionAlternatives_1_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1330:1: rule__FilterSpec__OptionAlternatives_1_0 : ( ( '-A' ) | ( '-D' ) | ( '-P' ) );
    public final void rule__FilterSpec__OptionAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1334:1: ( ( '-A' ) | ( '-D' ) | ( '-P' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
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
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1335:1: ( '-A' )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1335:1: ( '-A' )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1336:1: '-A'
                    {
                     before(grammarAccess.getFilterSpecAccess().getOptionAKeyword_1_0_0()); 
                    match(input,31,FOLLOW_31_in_rule__FilterSpec__OptionAlternatives_1_02742); 
                     after(grammarAccess.getFilterSpecAccess().getOptionAKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1343:6: ( '-D' )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1343:6: ( '-D' )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1344:1: '-D'
                    {
                     before(grammarAccess.getFilterSpecAccess().getOptionDKeyword_1_0_1()); 
                    match(input,32,FOLLOW_32_in_rule__FilterSpec__OptionAlternatives_1_02762); 
                     after(grammarAccess.getFilterSpecAccess().getOptionDKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1351:6: ( '-P' )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1351:6: ( '-P' )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1352:1: '-P'
                    {
                     before(grammarAccess.getFilterSpecAccess().getOptionPKeyword_1_0_2()); 
                    match(input,33,FOLLOW_33_in_rule__FilterSpec__OptionAlternatives_1_02782); 
                     after(grammarAccess.getFilterSpecAccess().getOptionPKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__OptionAlternatives_1_0"


    // $ANTLR start "rule__Match__NameAlternatives_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1364:1: rule__Match__NameAlternatives_0 : ( ( ruleConntrack ) | ( ruleStateMatch ) );
    public final void rule__Match__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1368:1: ( ( ruleConntrack ) | ( ruleStateMatch ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1369:1: ( ruleConntrack )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1369:1: ( ruleConntrack )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1370:1: ruleConntrack
                    {
                     before(grammarAccess.getMatchAccess().getNameConntrackParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleConntrack_in_rule__Match__NameAlternatives_02816);
                    ruleConntrack();

                    state._fsp--;

                     after(grammarAccess.getMatchAccess().getNameConntrackParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1375:6: ( ruleStateMatch )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1375:6: ( ruleStateMatch )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1376:1: ruleStateMatch
                    {
                     before(grammarAccess.getMatchAccess().getNameStateMatchParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStateMatch_in_rule__Match__NameAlternatives_02833);
                    ruleStateMatch();

                    state._fsp--;

                     after(grammarAccess.getMatchAccess().getNameStateMatchParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__NameAlternatives_0"


    // $ANTLR start "rule__State__NameAlternatives_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1386:1: rule__State__NameAlternatives_0 : ( ( ruleNormalMatchStates ) | ( ruleStateFulMatchStates ) );
    public final void rule__State__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1390:1: ( ( ruleNormalMatchStates ) | ( ruleStateFulMatchStates ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=14 && LA5_0<=22)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1391:1: ( ruleNormalMatchStates )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1391:1: ( ruleNormalMatchStates )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1392:1: ruleNormalMatchStates
                    {
                     before(grammarAccess.getStateAccess().getNameNormalMatchStatesParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleNormalMatchStates_in_rule__State__NameAlternatives_02865);
                    ruleNormalMatchStates();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getNameNormalMatchStatesParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1397:6: ( ruleStateFulMatchStates )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1397:6: ( ruleStateFulMatchStates )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1398:1: ruleStateFulMatchStates
                    {
                     before(grammarAccess.getStateAccess().getNameStateFulMatchStatesParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleStateFulMatchStates_in_rule__State__NameAlternatives_02882);
                    ruleStateFulMatchStates();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getNameStateFulMatchStatesParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAlternatives_0"


    // $ANTLR start "rule__StateFulMatchStates__NameAlternatives_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1408:1: rule__StateFulMatchStates__NameAlternatives_0 : ( ( ruleNoneS ) | ( ruleSynSent ) | ( ruleSynRecv ) | ( ruleEstablished ) | ( ruleFinWait ) | ( ruleCloseWait ) | ( ruleLastAck ) | ( ruleTimeWait ) | ( ruleClose ) );
    public final void rule__StateFulMatchStates__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1412:1: ( ( ruleNoneS ) | ( ruleSynSent ) | ( ruleSynRecv ) | ( ruleEstablished ) | ( ruleFinWait ) | ( ruleCloseWait ) | ( ruleLastAck ) | ( ruleTimeWait ) | ( ruleClose ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            case 22:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1413:1: ( ruleNoneS )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1413:1: ( ruleNoneS )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1414:1: ruleNoneS
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameNoneSParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleNoneS_in_rule__StateFulMatchStates__NameAlternatives_02914);
                    ruleNoneS();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameNoneSParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1419:6: ( ruleSynSent )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1419:6: ( ruleSynSent )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1420:1: ruleSynSent
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameSynSentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleSynSent_in_rule__StateFulMatchStates__NameAlternatives_02931);
                    ruleSynSent();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameSynSentParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1425:6: ( ruleSynRecv )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1425:6: ( ruleSynRecv )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1426:1: ruleSynRecv
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameSynRecvParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleSynRecv_in_rule__StateFulMatchStates__NameAlternatives_02948);
                    ruleSynRecv();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameSynRecvParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1431:6: ( ruleEstablished )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1431:6: ( ruleEstablished )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1432:1: ruleEstablished
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameEstablishedParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleEstablished_in_rule__StateFulMatchStates__NameAlternatives_02965);
                    ruleEstablished();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameEstablishedParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1437:6: ( ruleFinWait )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1437:6: ( ruleFinWait )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1438:1: ruleFinWait
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameFinWaitParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleFinWait_in_rule__StateFulMatchStates__NameAlternatives_02982);
                    ruleFinWait();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameFinWaitParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1443:6: ( ruleCloseWait )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1443:6: ( ruleCloseWait )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1444:1: ruleCloseWait
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameCloseWaitParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleCloseWait_in_rule__StateFulMatchStates__NameAlternatives_02999);
                    ruleCloseWait();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameCloseWaitParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1449:6: ( ruleLastAck )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1449:6: ( ruleLastAck )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1450:1: ruleLastAck
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameLastAckParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_ruleLastAck_in_rule__StateFulMatchStates__NameAlternatives_03016);
                    ruleLastAck();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameLastAckParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1455:6: ( ruleTimeWait )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1455:6: ( ruleTimeWait )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1456:1: ruleTimeWait
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameTimeWaitParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_ruleTimeWait_in_rule__StateFulMatchStates__NameAlternatives_03033);
                    ruleTimeWait();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameTimeWaitParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1461:6: ( ruleClose )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1461:6: ( ruleClose )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1462:1: ruleClose
                    {
                     before(grammarAccess.getStateFulMatchStatesAccess().getNameCloseParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_ruleClose_in_rule__StateFulMatchStates__NameAlternatives_03050);
                    ruleClose();

                    state._fsp--;

                     after(grammarAccess.getStateFulMatchStatesAccess().getNameCloseParserRuleCall_0_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFulMatchStates__NameAlternatives_0"


    // $ANTLR start "rule__TCPFlag__NameAlternatives_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1472:1: rule__TCPFlag__NameAlternatives_0 : ( ( ruleSyn ) | ( ruleAck ) | ( ruleFin ) | ( ruleRst ) | ( ruleAll ) | ( ruleNone ) );
    public final void rule__TCPFlag__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1476:1: ( ( ruleSyn ) | ( ruleAck ) | ( ruleFin ) | ( ruleRst ) | ( ruleAll ) | ( ruleNone ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 14:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1477:1: ( ruleSyn )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1477:1: ( ruleSyn )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1478:1: ruleSyn
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameSynParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSyn_in_rule__TCPFlag__NameAlternatives_03082);
                    ruleSyn();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameSynParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1483:6: ( ruleAck )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1483:6: ( ruleAck )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1484:1: ruleAck
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameAckParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleAck_in_rule__TCPFlag__NameAlternatives_03099);
                    ruleAck();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameAckParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1489:6: ( ruleFin )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1489:6: ( ruleFin )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1490:1: ruleFin
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameFinParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleFin_in_rule__TCPFlag__NameAlternatives_03116);
                    ruleFin();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameFinParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1495:6: ( ruleRst )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1495:6: ( ruleRst )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1496:1: ruleRst
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameRstParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleRst_in_rule__TCPFlag__NameAlternatives_03133);
                    ruleRst();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameRstParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1501:6: ( ruleAll )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1501:6: ( ruleAll )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1502:1: ruleAll
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameAllParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleAll_in_rule__TCPFlag__NameAlternatives_03150);
                    ruleAll();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameAllParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1507:6: ( ruleNone )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1507:6: ( ruleNone )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1508:1: ruleNone
                    {
                     before(grammarAccess.getTCPFlagAccess().getNameNoneParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleNone_in_rule__TCPFlag__NameAlternatives_03167);
                    ruleNone();

                    state._fsp--;

                     after(grammarAccess.getTCPFlagAccess().getNameNoneParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCPFlag__NameAlternatives_0"


    // $ANTLR start "rule__Protocol__Alternatives"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1518:1: rule__Protocol__Alternatives : ( ( ruleTcp ) | ( ruleUdp ) | ( ruleIcmp ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1522:1: ( ( ruleTcp ) | ( ruleUdp ) | ( ruleIcmp ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1523:1: ( ruleTcp )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1523:1: ( ruleTcp )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1524:1: ruleTcp
                    {
                     before(grammarAccess.getProtocolAccess().getTcpParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTcp_in_rule__Protocol__Alternatives3199);
                    ruleTcp();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getTcpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1529:6: ( ruleUdp )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1529:6: ( ruleUdp )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1530:1: ruleUdp
                    {
                     before(grammarAccess.getProtocolAccess().getUdpParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUdp_in_rule__Protocol__Alternatives3216);
                    ruleUdp();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getUdpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1535:6: ( ruleIcmp )
                    {
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1535:6: ( ruleIcmp )
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1536:1: ruleIcmp
                    {
                     before(grammarAccess.getProtocolAccess().getIcmpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIcmp_in_rule__Protocol__Alternatives3233);
                    ruleIcmp();

                    state._fsp--;

                     after(grammarAccess.getProtocolAccess().getIcmpParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__FilterSpec__Group__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1548:1: rule__FilterSpec__Group__0 : rule__FilterSpec__Group__0__Impl rule__FilterSpec__Group__1 ;
    public final void rule__FilterSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1552:1: ( rule__FilterSpec__Group__0__Impl rule__FilterSpec__Group__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1553:2: rule__FilterSpec__Group__0__Impl rule__FilterSpec__Group__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__0__Impl_in_rule__FilterSpec__Group__03263);
            rule__FilterSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__1_in_rule__FilterSpec__Group__03266);
            rule__FilterSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__0"


    // $ANTLR start "rule__FilterSpec__Group__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1560:1: rule__FilterSpec__Group__0__Impl : ( 'iptables' ) ;
    public final void rule__FilterSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1564:1: ( ( 'iptables' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1565:1: ( 'iptables' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1565:1: ( 'iptables' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1566:1: 'iptables'
            {
             before(grammarAccess.getFilterSpecAccess().getIptablesKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FilterSpec__Group__0__Impl3294); 
             after(grammarAccess.getFilterSpecAccess().getIptablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1579:1: rule__FilterSpec__Group__1 : rule__FilterSpec__Group__1__Impl rule__FilterSpec__Group__2 ;
    public final void rule__FilterSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1583:1: ( rule__FilterSpec__Group__1__Impl rule__FilterSpec__Group__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1584:2: rule__FilterSpec__Group__1__Impl rule__FilterSpec__Group__2
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__1__Impl_in_rule__FilterSpec__Group__13325);
            rule__FilterSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__2_in_rule__FilterSpec__Group__13328);
            rule__FilterSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__1"


    // $ANTLR start "rule__FilterSpec__Group__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1591:1: rule__FilterSpec__Group__1__Impl : ( ( rule__FilterSpec__OptionAssignment_1 ) ) ;
    public final void rule__FilterSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1595:1: ( ( ( rule__FilterSpec__OptionAssignment_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1596:1: ( ( rule__FilterSpec__OptionAssignment_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1596:1: ( ( rule__FilterSpec__OptionAssignment_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1597:1: ( rule__FilterSpec__OptionAssignment_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getOptionAssignment_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1598:1: ( rule__FilterSpec__OptionAssignment_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1598:2: rule__FilterSpec__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__OptionAssignment_1_in_rule__FilterSpec__Group__1__Impl3355);
            rule__FilterSpec__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1608:1: rule__FilterSpec__Group__2 : rule__FilterSpec__Group__2__Impl rule__FilterSpec__Group__3 ;
    public final void rule__FilterSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1612:1: ( rule__FilterSpec__Group__2__Impl rule__FilterSpec__Group__3 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1613:2: rule__FilterSpec__Group__2__Impl rule__FilterSpec__Group__3
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__2__Impl_in_rule__FilterSpec__Group__23385);
            rule__FilterSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__3_in_rule__FilterSpec__Group__23388);
            rule__FilterSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__2"


    // $ANTLR start "rule__FilterSpec__Group__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1620:1: rule__FilterSpec__Group__2__Impl : ( ( rule__FilterSpec__ChainAssignment_2 ) ) ;
    public final void rule__FilterSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1624:1: ( ( ( rule__FilterSpec__ChainAssignment_2 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1625:1: ( ( rule__FilterSpec__ChainAssignment_2 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1625:1: ( ( rule__FilterSpec__ChainAssignment_2 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1626:1: ( rule__FilterSpec__ChainAssignment_2 )
            {
             before(grammarAccess.getFilterSpecAccess().getChainAssignment_2()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1627:1: ( rule__FilterSpec__ChainAssignment_2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1627:2: rule__FilterSpec__ChainAssignment_2
            {
            pushFollow(FOLLOW_rule__FilterSpec__ChainAssignment_2_in_rule__FilterSpec__Group__2__Impl3415);
            rule__FilterSpec__ChainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getChainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__2__Impl"


    // $ANTLR start "rule__FilterSpec__Group__3"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1637:1: rule__FilterSpec__Group__3 : rule__FilterSpec__Group__3__Impl rule__FilterSpec__Group__4 ;
    public final void rule__FilterSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1641:1: ( rule__FilterSpec__Group__3__Impl rule__FilterSpec__Group__4 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1642:2: rule__FilterSpec__Group__3__Impl rule__FilterSpec__Group__4
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__3__Impl_in_rule__FilterSpec__Group__33445);
            rule__FilterSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__4_in_rule__FilterSpec__Group__33448);
            rule__FilterSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__3"


    // $ANTLR start "rule__FilterSpec__Group__3__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1649:1: rule__FilterSpec__Group__3__Impl : ( ( rule__FilterSpec__Group_3__0 )? ) ;
    public final void rule__FilterSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1653:1: ( ( ( rule__FilterSpec__Group_3__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1654:1: ( ( rule__FilterSpec__Group_3__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1654:1: ( ( rule__FilterSpec__Group_3__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1655:1: ( rule__FilterSpec__Group_3__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_3()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1656:1: ( rule__FilterSpec__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1656:2: rule__FilterSpec__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_3__0_in_rule__FilterSpec__Group__3__Impl3475);
                    rule__FilterSpec__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__3__Impl"


    // $ANTLR start "rule__FilterSpec__Group__4"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1666:1: rule__FilterSpec__Group__4 : rule__FilterSpec__Group__4__Impl rule__FilterSpec__Group__5 ;
    public final void rule__FilterSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1670:1: ( rule__FilterSpec__Group__4__Impl rule__FilterSpec__Group__5 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1671:2: rule__FilterSpec__Group__4__Impl rule__FilterSpec__Group__5
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__4__Impl_in_rule__FilterSpec__Group__43506);
            rule__FilterSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__5_in_rule__FilterSpec__Group__43509);
            rule__FilterSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__4"


    // $ANTLR start "rule__FilterSpec__Group__4__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1678:1: rule__FilterSpec__Group__4__Impl : ( ( rule__FilterSpec__Group_4__0 )? ) ;
    public final void rule__FilterSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1682:1: ( ( ( rule__FilterSpec__Group_4__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1683:1: ( ( rule__FilterSpec__Group_4__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1683:1: ( ( rule__FilterSpec__Group_4__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1684:1: ( rule__FilterSpec__Group_4__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_4()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1685:1: ( rule__FilterSpec__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1685:2: rule__FilterSpec__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_4__0_in_rule__FilterSpec__Group__4__Impl3536);
                    rule__FilterSpec__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__4__Impl"


    // $ANTLR start "rule__FilterSpec__Group__5"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1695:1: rule__FilterSpec__Group__5 : rule__FilterSpec__Group__5__Impl rule__FilterSpec__Group__6 ;
    public final void rule__FilterSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1699:1: ( rule__FilterSpec__Group__5__Impl rule__FilterSpec__Group__6 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1700:2: rule__FilterSpec__Group__5__Impl rule__FilterSpec__Group__6
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__5__Impl_in_rule__FilterSpec__Group__53567);
            rule__FilterSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__6_in_rule__FilterSpec__Group__53570);
            rule__FilterSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__5"


    // $ANTLR start "rule__FilterSpec__Group__5__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1707:1: rule__FilterSpec__Group__5__Impl : ( ( rule__FilterSpec__Group_5__0 )? ) ;
    public final void rule__FilterSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1711:1: ( ( ( rule__FilterSpec__Group_5__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1712:1: ( ( rule__FilterSpec__Group_5__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1712:1: ( ( rule__FilterSpec__Group_5__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1713:1: ( rule__FilterSpec__Group_5__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_5()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1714:1: ( rule__FilterSpec__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1714:2: rule__FilterSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_5__0_in_rule__FilterSpec__Group__5__Impl3597);
                    rule__FilterSpec__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__5__Impl"


    // $ANTLR start "rule__FilterSpec__Group__6"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1724:1: rule__FilterSpec__Group__6 : rule__FilterSpec__Group__6__Impl rule__FilterSpec__Group__7 ;
    public final void rule__FilterSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1728:1: ( rule__FilterSpec__Group__6__Impl rule__FilterSpec__Group__7 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1729:2: rule__FilterSpec__Group__6__Impl rule__FilterSpec__Group__7
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__6__Impl_in_rule__FilterSpec__Group__63628);
            rule__FilterSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__7_in_rule__FilterSpec__Group__63631);
            rule__FilterSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__6"


    // $ANTLR start "rule__FilterSpec__Group__6__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1736:1: rule__FilterSpec__Group__6__Impl : ( ( rule__FilterSpec__Group_6__0 )? ) ;
    public final void rule__FilterSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1740:1: ( ( ( rule__FilterSpec__Group_6__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1741:1: ( ( rule__FilterSpec__Group_6__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1741:1: ( ( rule__FilterSpec__Group_6__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1742:1: ( rule__FilterSpec__Group_6__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_6()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1743:1: ( rule__FilterSpec__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1743:2: rule__FilterSpec__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_6__0_in_rule__FilterSpec__Group__6__Impl3658);
                    rule__FilterSpec__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__6__Impl"


    // $ANTLR start "rule__FilterSpec__Group__7"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1753:1: rule__FilterSpec__Group__7 : rule__FilterSpec__Group__7__Impl rule__FilterSpec__Group__8 ;
    public final void rule__FilterSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1757:1: ( rule__FilterSpec__Group__7__Impl rule__FilterSpec__Group__8 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1758:2: rule__FilterSpec__Group__7__Impl rule__FilterSpec__Group__8
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__7__Impl_in_rule__FilterSpec__Group__73689);
            rule__FilterSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__8_in_rule__FilterSpec__Group__73692);
            rule__FilterSpec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__7"


    // $ANTLR start "rule__FilterSpec__Group__7__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1765:1: rule__FilterSpec__Group__7__Impl : ( ( rule__FilterSpec__Group_7__0 )? ) ;
    public final void rule__FilterSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1769:1: ( ( ( rule__FilterSpec__Group_7__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1770:1: ( ( rule__FilterSpec__Group_7__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1770:1: ( ( rule__FilterSpec__Group_7__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1771:1: ( rule__FilterSpec__Group_7__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_7()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1772:1: ( rule__FilterSpec__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1772:2: rule__FilterSpec__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_7__0_in_rule__FilterSpec__Group__7__Impl3719);
                    rule__FilterSpec__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__7__Impl"


    // $ANTLR start "rule__FilterSpec__Group__8"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1782:1: rule__FilterSpec__Group__8 : rule__FilterSpec__Group__8__Impl rule__FilterSpec__Group__9 ;
    public final void rule__FilterSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1786:1: ( rule__FilterSpec__Group__8__Impl rule__FilterSpec__Group__9 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1787:2: rule__FilterSpec__Group__8__Impl rule__FilterSpec__Group__9
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__8__Impl_in_rule__FilterSpec__Group__83750);
            rule__FilterSpec__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__9_in_rule__FilterSpec__Group__83753);
            rule__FilterSpec__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__8"


    // $ANTLR start "rule__FilterSpec__Group__8__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1794:1: rule__FilterSpec__Group__8__Impl : ( ( rule__FilterSpec__Group_8__0 )? ) ;
    public final void rule__FilterSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1798:1: ( ( ( rule__FilterSpec__Group_8__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1799:1: ( ( rule__FilterSpec__Group_8__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1799:1: ( ( rule__FilterSpec__Group_8__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1800:1: ( rule__FilterSpec__Group_8__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_8()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1801:1: ( rule__FilterSpec__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1801:2: rule__FilterSpec__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_8__0_in_rule__FilterSpec__Group__8__Impl3780);
                    rule__FilterSpec__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__8__Impl"


    // $ANTLR start "rule__FilterSpec__Group__9"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1811:1: rule__FilterSpec__Group__9 : rule__FilterSpec__Group__9__Impl rule__FilterSpec__Group__10 ;
    public final void rule__FilterSpec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1815:1: ( rule__FilterSpec__Group__9__Impl rule__FilterSpec__Group__10 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1816:2: rule__FilterSpec__Group__9__Impl rule__FilterSpec__Group__10
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__9__Impl_in_rule__FilterSpec__Group__93811);
            rule__FilterSpec__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__10_in_rule__FilterSpec__Group__93814);
            rule__FilterSpec__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__9"


    // $ANTLR start "rule__FilterSpec__Group__9__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1823:1: rule__FilterSpec__Group__9__Impl : ( ( rule__FilterSpec__NegAssignment_9 )? ) ;
    public final void rule__FilterSpec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1827:1: ( ( ( rule__FilterSpec__NegAssignment_9 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1828:1: ( ( rule__FilterSpec__NegAssignment_9 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1828:1: ( ( rule__FilterSpec__NegAssignment_9 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1829:1: ( rule__FilterSpec__NegAssignment_9 )?
            {
             before(grammarAccess.getFilterSpecAccess().getNegAssignment_9()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1830:1: ( rule__FilterSpec__NegAssignment_9 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1830:2: rule__FilterSpec__NegAssignment_9
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__NegAssignment_9_in_rule__FilterSpec__Group__9__Impl3841);
                    rule__FilterSpec__NegAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getNegAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__9__Impl"


    // $ANTLR start "rule__FilterSpec__Group__10"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1840:1: rule__FilterSpec__Group__10 : rule__FilterSpec__Group__10__Impl rule__FilterSpec__Group__11 ;
    public final void rule__FilterSpec__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1844:1: ( rule__FilterSpec__Group__10__Impl rule__FilterSpec__Group__11 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1845:2: rule__FilterSpec__Group__10__Impl rule__FilterSpec__Group__11
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__10__Impl_in_rule__FilterSpec__Group__103872);
            rule__FilterSpec__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__11_in_rule__FilterSpec__Group__103875);
            rule__FilterSpec__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__10"


    // $ANTLR start "rule__FilterSpec__Group__10__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1852:1: rule__FilterSpec__Group__10__Impl : ( ( rule__FilterSpec__SynAssignment_10 )? ) ;
    public final void rule__FilterSpec__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1856:1: ( ( ( rule__FilterSpec__SynAssignment_10 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1857:1: ( ( rule__FilterSpec__SynAssignment_10 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1857:1: ( ( rule__FilterSpec__SynAssignment_10 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1858:1: ( rule__FilterSpec__SynAssignment_10 )?
            {
             before(grammarAccess.getFilterSpecAccess().getSynAssignment_10()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1859:1: ( rule__FilterSpec__SynAssignment_10 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1859:2: rule__FilterSpec__SynAssignment_10
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__SynAssignment_10_in_rule__FilterSpec__Group__10__Impl3902);
                    rule__FilterSpec__SynAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getSynAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__10__Impl"


    // $ANTLR start "rule__FilterSpec__Group__11"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1869:1: rule__FilterSpec__Group__11 : rule__FilterSpec__Group__11__Impl rule__FilterSpec__Group__12 ;
    public final void rule__FilterSpec__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1873:1: ( rule__FilterSpec__Group__11__Impl rule__FilterSpec__Group__12 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1874:2: rule__FilterSpec__Group__11__Impl rule__FilterSpec__Group__12
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__11__Impl_in_rule__FilterSpec__Group__113933);
            rule__FilterSpec__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__12_in_rule__FilterSpec__Group__113936);
            rule__FilterSpec__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__11"


    // $ANTLR start "rule__FilterSpec__Group__11__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1881:1: rule__FilterSpec__Group__11__Impl : ( ( rule__FilterSpec__Group_11__0 )? ) ;
    public final void rule__FilterSpec__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1885:1: ( ( ( rule__FilterSpec__Group_11__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1886:1: ( ( rule__FilterSpec__Group_11__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1886:1: ( ( rule__FilterSpec__Group_11__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1887:1: ( rule__FilterSpec__Group_11__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_11()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1888:1: ( rule__FilterSpec__Group_11__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1888:2: rule__FilterSpec__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_11__0_in_rule__FilterSpec__Group__11__Impl3963);
                    rule__FilterSpec__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__11__Impl"


    // $ANTLR start "rule__FilterSpec__Group__12"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1898:1: rule__FilterSpec__Group__12 : rule__FilterSpec__Group__12__Impl rule__FilterSpec__Group__13 ;
    public final void rule__FilterSpec__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1902:1: ( rule__FilterSpec__Group__12__Impl rule__FilterSpec__Group__13 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1903:2: rule__FilterSpec__Group__12__Impl rule__FilterSpec__Group__13
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__12__Impl_in_rule__FilterSpec__Group__123994);
            rule__FilterSpec__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__13_in_rule__FilterSpec__Group__123997);
            rule__FilterSpec__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__12"


    // $ANTLR start "rule__FilterSpec__Group__12__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1910:1: rule__FilterSpec__Group__12__Impl : ( ( rule__FilterSpec__Group_12__0 )? ) ;
    public final void rule__FilterSpec__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1914:1: ( ( ( rule__FilterSpec__Group_12__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1915:1: ( ( rule__FilterSpec__Group_12__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1915:1: ( ( rule__FilterSpec__Group_12__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1916:1: ( rule__FilterSpec__Group_12__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_12()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1917:1: ( rule__FilterSpec__Group_12__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1917:2: rule__FilterSpec__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_12__0_in_rule__FilterSpec__Group__12__Impl4024);
                    rule__FilterSpec__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__12__Impl"


    // $ANTLR start "rule__FilterSpec__Group__13"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1927:1: rule__FilterSpec__Group__13 : rule__FilterSpec__Group__13__Impl rule__FilterSpec__Group__14 ;
    public final void rule__FilterSpec__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1931:1: ( rule__FilterSpec__Group__13__Impl rule__FilterSpec__Group__14 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1932:2: rule__FilterSpec__Group__13__Impl rule__FilterSpec__Group__14
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__13__Impl_in_rule__FilterSpec__Group__134055);
            rule__FilterSpec__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__14_in_rule__FilterSpec__Group__134058);
            rule__FilterSpec__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__13"


    // $ANTLR start "rule__FilterSpec__Group__13__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1939:1: rule__FilterSpec__Group__13__Impl : ( ( rule__FilterSpec__Group_13__0 )? ) ;
    public final void rule__FilterSpec__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1943:1: ( ( ( rule__FilterSpec__Group_13__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1944:1: ( ( rule__FilterSpec__Group_13__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1944:1: ( ( rule__FilterSpec__Group_13__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1945:1: ( rule__FilterSpec__Group_13__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_13()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1946:1: ( rule__FilterSpec__Group_13__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1946:2: rule__FilterSpec__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_13__0_in_rule__FilterSpec__Group__13__Impl4085);
                    rule__FilterSpec__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__13__Impl"


    // $ANTLR start "rule__FilterSpec__Group__14"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1956:1: rule__FilterSpec__Group__14 : rule__FilterSpec__Group__14__Impl rule__FilterSpec__Group__15 ;
    public final void rule__FilterSpec__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1960:1: ( rule__FilterSpec__Group__14__Impl rule__FilterSpec__Group__15 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1961:2: rule__FilterSpec__Group__14__Impl rule__FilterSpec__Group__15
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__14__Impl_in_rule__FilterSpec__Group__144116);
            rule__FilterSpec__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__15_in_rule__FilterSpec__Group__144119);
            rule__FilterSpec__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__14"


    // $ANTLR start "rule__FilterSpec__Group__14__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1968:1: rule__FilterSpec__Group__14__Impl : ( ( rule__FilterSpec__Group_14__0 )? ) ;
    public final void rule__FilterSpec__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1972:1: ( ( ( rule__FilterSpec__Group_14__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1973:1: ( ( rule__FilterSpec__Group_14__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1973:1: ( ( rule__FilterSpec__Group_14__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1974:1: ( rule__FilterSpec__Group_14__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_14()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1975:1: ( rule__FilterSpec__Group_14__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1975:2: rule__FilterSpec__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_14__0_in_rule__FilterSpec__Group__14__Impl4146);
                    rule__FilterSpec__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__14__Impl"


    // $ANTLR start "rule__FilterSpec__Group__15"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1985:1: rule__FilterSpec__Group__15 : rule__FilterSpec__Group__15__Impl rule__FilterSpec__Group__16 ;
    public final void rule__FilterSpec__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1989:1: ( rule__FilterSpec__Group__15__Impl rule__FilterSpec__Group__16 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1990:2: rule__FilterSpec__Group__15__Impl rule__FilterSpec__Group__16
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__15__Impl_in_rule__FilterSpec__Group__154177);
            rule__FilterSpec__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__16_in_rule__FilterSpec__Group__154180);
            rule__FilterSpec__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__15"


    // $ANTLR start "rule__FilterSpec__Group__15__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:1997:1: rule__FilterSpec__Group__15__Impl : ( ( rule__FilterSpec__Group_15__0 )? ) ;
    public final void rule__FilterSpec__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2001:1: ( ( ( rule__FilterSpec__Group_15__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2002:1: ( ( rule__FilterSpec__Group_15__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2002:1: ( ( rule__FilterSpec__Group_15__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2003:1: ( rule__FilterSpec__Group_15__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_15()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2004:1: ( rule__FilterSpec__Group_15__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2004:2: rule__FilterSpec__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_15__0_in_rule__FilterSpec__Group__15__Impl4207);
                    rule__FilterSpec__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__15__Impl"


    // $ANTLR start "rule__FilterSpec__Group__16"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2014:1: rule__FilterSpec__Group__16 : rule__FilterSpec__Group__16__Impl rule__FilterSpec__Group__17 ;
    public final void rule__FilterSpec__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2018:1: ( rule__FilterSpec__Group__16__Impl rule__FilterSpec__Group__17 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2019:2: rule__FilterSpec__Group__16__Impl rule__FilterSpec__Group__17
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__16__Impl_in_rule__FilterSpec__Group__164238);
            rule__FilterSpec__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__17_in_rule__FilterSpec__Group__164241);
            rule__FilterSpec__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__16"


    // $ANTLR start "rule__FilterSpec__Group__16__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2026:1: rule__FilterSpec__Group__16__Impl : ( ( rule__FilterSpec__Group_16__0 )? ) ;
    public final void rule__FilterSpec__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2030:1: ( ( ( rule__FilterSpec__Group_16__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2031:1: ( ( rule__FilterSpec__Group_16__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2031:1: ( ( rule__FilterSpec__Group_16__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2032:1: ( rule__FilterSpec__Group_16__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_16()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2033:1: ( rule__FilterSpec__Group_16__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2033:2: rule__FilterSpec__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_16__0_in_rule__FilterSpec__Group__16__Impl4268);
                    rule__FilterSpec__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__16__Impl"


    // $ANTLR start "rule__FilterSpec__Group__17"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2043:1: rule__FilterSpec__Group__17 : rule__FilterSpec__Group__17__Impl rule__FilterSpec__Group__18 ;
    public final void rule__FilterSpec__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2047:1: ( rule__FilterSpec__Group__17__Impl rule__FilterSpec__Group__18 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2048:2: rule__FilterSpec__Group__17__Impl rule__FilterSpec__Group__18
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__17__Impl_in_rule__FilterSpec__Group__174299);
            rule__FilterSpec__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__18_in_rule__FilterSpec__Group__174302);
            rule__FilterSpec__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__17"


    // $ANTLR start "rule__FilterSpec__Group__17__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2055:1: rule__FilterSpec__Group__17__Impl : ( ( '-j' )? ) ;
    public final void rule__FilterSpec__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2059:1: ( ( ( '-j' )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2060:1: ( ( '-j' )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2060:1: ( ( '-j' )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2061:1: ( '-j' )?
            {
             before(grammarAccess.getFilterSpecAccess().getJKeyword_17()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2062:1: ( '-j' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2063:2: '-j'
                    {
                    match(input,35,FOLLOW_35_in_rule__FilterSpec__Group__17__Impl4331); 

                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getJKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__17__Impl"


    // $ANTLR start "rule__FilterSpec__Group__18"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2074:1: rule__FilterSpec__Group__18 : rule__FilterSpec__Group__18__Impl rule__FilterSpec__Group__19 ;
    public final void rule__FilterSpec__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2078:1: ( rule__FilterSpec__Group__18__Impl rule__FilterSpec__Group__19 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2079:2: rule__FilterSpec__Group__18__Impl rule__FilterSpec__Group__19
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__18__Impl_in_rule__FilterSpec__Group__184364);
            rule__FilterSpec__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group__19_in_rule__FilterSpec__Group__184367);
            rule__FilterSpec__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__18"


    // $ANTLR start "rule__FilterSpec__Group__18__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2086:1: rule__FilterSpec__Group__18__Impl : ( ( rule__FilterSpec__TargetAssignment_18 ) ) ;
    public final void rule__FilterSpec__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2090:1: ( ( ( rule__FilterSpec__TargetAssignment_18 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2091:1: ( ( rule__FilterSpec__TargetAssignment_18 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2091:1: ( ( rule__FilterSpec__TargetAssignment_18 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2092:1: ( rule__FilterSpec__TargetAssignment_18 )
            {
             before(grammarAccess.getFilterSpecAccess().getTargetAssignment_18()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2093:1: ( rule__FilterSpec__TargetAssignment_18 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2093:2: rule__FilterSpec__TargetAssignment_18
            {
            pushFollow(FOLLOW_rule__FilterSpec__TargetAssignment_18_in_rule__FilterSpec__Group__18__Impl4394);
            rule__FilterSpec__TargetAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getTargetAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__18__Impl"


    // $ANTLR start "rule__FilterSpec__Group__19"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2103:1: rule__FilterSpec__Group__19 : rule__FilterSpec__Group__19__Impl ;
    public final void rule__FilterSpec__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2107:1: ( rule__FilterSpec__Group__19__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2108:2: rule__FilterSpec__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group__19__Impl_in_rule__FilterSpec__Group__194424);
            rule__FilterSpec__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__19"


    // $ANTLR start "rule__FilterSpec__Group__19__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2114:1: rule__FilterSpec__Group__19__Impl : ( ( rule__FilterSpec__Group_19__0 )? ) ;
    public final void rule__FilterSpec__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2118:1: ( ( ( rule__FilterSpec__Group_19__0 )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2119:1: ( ( rule__FilterSpec__Group_19__0 )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2119:1: ( ( rule__FilterSpec__Group_19__0 )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2120:1: ( rule__FilterSpec__Group_19__0 )?
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_19()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2121:1: ( rule__FilterSpec__Group_19__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2121:2: rule__FilterSpec__Group_19__0
                    {
                    pushFollow(FOLLOW_rule__FilterSpec__Group_19__0_in_rule__FilterSpec__Group__19__Impl4451);
                    rule__FilterSpec__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterSpecAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group__19__Impl"


    // $ANTLR start "rule__FilterSpec__Group_3__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2171:1: rule__FilterSpec__Group_3__0 : rule__FilterSpec__Group_3__0__Impl rule__FilterSpec__Group_3__1 ;
    public final void rule__FilterSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2175:1: ( rule__FilterSpec__Group_3__0__Impl rule__FilterSpec__Group_3__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2176:2: rule__FilterSpec__Group_3__0__Impl rule__FilterSpec__Group_3__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_3__0__Impl_in_rule__FilterSpec__Group_3__04522);
            rule__FilterSpec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_3__1_in_rule__FilterSpec__Group_3__04525);
            rule__FilterSpec__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_3__0"


    // $ANTLR start "rule__FilterSpec__Group_3__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2183:1: rule__FilterSpec__Group_3__0__Impl : ( '-s' ) ;
    public final void rule__FilterSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2187:1: ( ( '-s' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2188:1: ( '-s' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2188:1: ( '-s' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2189:1: '-s'
            {
             before(grammarAccess.getFilterSpecAccess().getSKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__FilterSpec__Group_3__0__Impl4553); 
             after(grammarAccess.getFilterSpecAccess().getSKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_3__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_3__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2202:1: rule__FilterSpec__Group_3__1 : rule__FilterSpec__Group_3__1__Impl ;
    public final void rule__FilterSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2206:1: ( rule__FilterSpec__Group_3__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2207:2: rule__FilterSpec__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_3__1__Impl_in_rule__FilterSpec__Group_3__14584);
            rule__FilterSpec__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_3__1"


    // $ANTLR start "rule__FilterSpec__Group_3__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2213:1: rule__FilterSpec__Group_3__1__Impl : ( ( rule__FilterSpec__IpAssignment_3_1 ) ) ;
    public final void rule__FilterSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2217:1: ( ( ( rule__FilterSpec__IpAssignment_3_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2218:1: ( ( rule__FilterSpec__IpAssignment_3_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2218:1: ( ( rule__FilterSpec__IpAssignment_3_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2219:1: ( rule__FilterSpec__IpAssignment_3_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getIpAssignment_3_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2220:1: ( rule__FilterSpec__IpAssignment_3_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2220:2: rule__FilterSpec__IpAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__IpAssignment_3_1_in_rule__FilterSpec__Group_3__1__Impl4611);
            rule__FilterSpec__IpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getIpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_3__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_4__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2234:1: rule__FilterSpec__Group_4__0 : rule__FilterSpec__Group_4__0__Impl rule__FilterSpec__Group_4__1 ;
    public final void rule__FilterSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2238:1: ( rule__FilterSpec__Group_4__0__Impl rule__FilterSpec__Group_4__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2239:2: rule__FilterSpec__Group_4__0__Impl rule__FilterSpec__Group_4__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_4__0__Impl_in_rule__FilterSpec__Group_4__04645);
            rule__FilterSpec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_4__1_in_rule__FilterSpec__Group_4__04648);
            rule__FilterSpec__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_4__0"


    // $ANTLR start "rule__FilterSpec__Group_4__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2246:1: rule__FilterSpec__Group_4__0__Impl : ( '-i' ) ;
    public final void rule__FilterSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2250:1: ( ( '-i' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2251:1: ( '-i' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2251:1: ( '-i' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2252:1: '-i'
            {
             before(grammarAccess.getFilterSpecAccess().getIKeyword_4_0()); 
            match(input,37,FOLLOW_37_in_rule__FilterSpec__Group_4__0__Impl4676); 
             after(grammarAccess.getFilterSpecAccess().getIKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_4__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_4__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2265:1: rule__FilterSpec__Group_4__1 : rule__FilterSpec__Group_4__1__Impl ;
    public final void rule__FilterSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2269:1: ( rule__FilterSpec__Group_4__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2270:2: rule__FilterSpec__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_4__1__Impl_in_rule__FilterSpec__Group_4__14707);
            rule__FilterSpec__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_4__1"


    // $ANTLR start "rule__FilterSpec__Group_4__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2276:1: rule__FilterSpec__Group_4__1__Impl : ( ( rule__FilterSpec__InterfaceAssignment_4_1 ) ) ;
    public final void rule__FilterSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2280:1: ( ( ( rule__FilterSpec__InterfaceAssignment_4_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2281:1: ( ( rule__FilterSpec__InterfaceAssignment_4_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2281:1: ( ( rule__FilterSpec__InterfaceAssignment_4_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2282:1: ( rule__FilterSpec__InterfaceAssignment_4_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getInterfaceAssignment_4_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2283:1: ( rule__FilterSpec__InterfaceAssignment_4_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2283:2: rule__FilterSpec__InterfaceAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__InterfaceAssignment_4_1_in_rule__FilterSpec__Group_4__1__Impl4734);
            rule__FilterSpec__InterfaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getInterfaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_4__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_5__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2297:1: rule__FilterSpec__Group_5__0 : rule__FilterSpec__Group_5__0__Impl rule__FilterSpec__Group_5__1 ;
    public final void rule__FilterSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2301:1: ( rule__FilterSpec__Group_5__0__Impl rule__FilterSpec__Group_5__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2302:2: rule__FilterSpec__Group_5__0__Impl rule__FilterSpec__Group_5__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_5__0__Impl_in_rule__FilterSpec__Group_5__04768);
            rule__FilterSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_5__1_in_rule__FilterSpec__Group_5__04771);
            rule__FilterSpec__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_5__0"


    // $ANTLR start "rule__FilterSpec__Group_5__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2309:1: rule__FilterSpec__Group_5__0__Impl : ( '-d' ) ;
    public final void rule__FilterSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2313:1: ( ( '-d' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2314:1: ( '-d' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2314:1: ( '-d' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2315:1: '-d'
            {
             before(grammarAccess.getFilterSpecAccess().getDKeyword_5_0()); 
            match(input,38,FOLLOW_38_in_rule__FilterSpec__Group_5__0__Impl4799); 
             after(grammarAccess.getFilterSpecAccess().getDKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_5__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_5__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2328:1: rule__FilterSpec__Group_5__1 : rule__FilterSpec__Group_5__1__Impl ;
    public final void rule__FilterSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2332:1: ( rule__FilterSpec__Group_5__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2333:2: rule__FilterSpec__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_5__1__Impl_in_rule__FilterSpec__Group_5__14830);
            rule__FilterSpec__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_5__1"


    // $ANTLR start "rule__FilterSpec__Group_5__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2339:1: rule__FilterSpec__Group_5__1__Impl : ( ( rule__FilterSpec__IpDstAssignment_5_1 ) ) ;
    public final void rule__FilterSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2343:1: ( ( ( rule__FilterSpec__IpDstAssignment_5_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2344:1: ( ( rule__FilterSpec__IpDstAssignment_5_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2344:1: ( ( rule__FilterSpec__IpDstAssignment_5_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2345:1: ( rule__FilterSpec__IpDstAssignment_5_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getIpDstAssignment_5_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2346:1: ( rule__FilterSpec__IpDstAssignment_5_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2346:2: rule__FilterSpec__IpDstAssignment_5_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__IpDstAssignment_5_1_in_rule__FilterSpec__Group_5__1__Impl4857);
            rule__FilterSpec__IpDstAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getIpDstAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_5__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_6__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2360:1: rule__FilterSpec__Group_6__0 : rule__FilterSpec__Group_6__0__Impl rule__FilterSpec__Group_6__1 ;
    public final void rule__FilterSpec__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2364:1: ( rule__FilterSpec__Group_6__0__Impl rule__FilterSpec__Group_6__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2365:2: rule__FilterSpec__Group_6__0__Impl rule__FilterSpec__Group_6__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_6__0__Impl_in_rule__FilterSpec__Group_6__04891);
            rule__FilterSpec__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_6__1_in_rule__FilterSpec__Group_6__04894);
            rule__FilterSpec__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_6__0"


    // $ANTLR start "rule__FilterSpec__Group_6__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2372:1: rule__FilterSpec__Group_6__0__Impl : ( '-p' ) ;
    public final void rule__FilterSpec__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2376:1: ( ( '-p' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2377:1: ( '-p' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2377:1: ( '-p' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2378:1: '-p'
            {
             before(grammarAccess.getFilterSpecAccess().getPKeyword_6_0()); 
            match(input,39,FOLLOW_39_in_rule__FilterSpec__Group_6__0__Impl4922); 
             after(grammarAccess.getFilterSpecAccess().getPKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_6__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_6__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2391:1: rule__FilterSpec__Group_6__1 : rule__FilterSpec__Group_6__1__Impl ;
    public final void rule__FilterSpec__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2395:1: ( rule__FilterSpec__Group_6__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2396:2: rule__FilterSpec__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_6__1__Impl_in_rule__FilterSpec__Group_6__14953);
            rule__FilterSpec__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_6__1"


    // $ANTLR start "rule__FilterSpec__Group_6__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2402:1: rule__FilterSpec__Group_6__1__Impl : ( ( rule__FilterSpec__ProtocolAssignment_6_1 ) ) ;
    public final void rule__FilterSpec__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2406:1: ( ( ( rule__FilterSpec__ProtocolAssignment_6_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2407:1: ( ( rule__FilterSpec__ProtocolAssignment_6_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2407:1: ( ( rule__FilterSpec__ProtocolAssignment_6_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2408:1: ( rule__FilterSpec__ProtocolAssignment_6_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getProtocolAssignment_6_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2409:1: ( rule__FilterSpec__ProtocolAssignment_6_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2409:2: rule__FilterSpec__ProtocolAssignment_6_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__ProtocolAssignment_6_1_in_rule__FilterSpec__Group_6__1__Impl4980);
            rule__FilterSpec__ProtocolAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getProtocolAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_6__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_7__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2423:1: rule__FilterSpec__Group_7__0 : rule__FilterSpec__Group_7__0__Impl rule__FilterSpec__Group_7__1 ;
    public final void rule__FilterSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2427:1: ( rule__FilterSpec__Group_7__0__Impl rule__FilterSpec__Group_7__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2428:2: rule__FilterSpec__Group_7__0__Impl rule__FilterSpec__Group_7__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_7__0__Impl_in_rule__FilterSpec__Group_7__05014);
            rule__FilterSpec__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_7__1_in_rule__FilterSpec__Group_7__05017);
            rule__FilterSpec__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_7__0"


    // $ANTLR start "rule__FilterSpec__Group_7__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2435:1: rule__FilterSpec__Group_7__0__Impl : ( '--sport' ) ;
    public final void rule__FilterSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2439:1: ( ( '--sport' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2440:1: ( '--sport' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2440:1: ( '--sport' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2441:1: '--sport'
            {
             before(grammarAccess.getFilterSpecAccess().getSportKeyword_7_0()); 
            match(input,40,FOLLOW_40_in_rule__FilterSpec__Group_7__0__Impl5045); 
             after(grammarAccess.getFilterSpecAccess().getSportKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_7__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_7__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2454:1: rule__FilterSpec__Group_7__1 : rule__FilterSpec__Group_7__1__Impl ;
    public final void rule__FilterSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2458:1: ( rule__FilterSpec__Group_7__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2459:2: rule__FilterSpec__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_7__1__Impl_in_rule__FilterSpec__Group_7__15076);
            rule__FilterSpec__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_7__1"


    // $ANTLR start "rule__FilterSpec__Group_7__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2465:1: rule__FilterSpec__Group_7__1__Impl : ( ( rule__FilterSpec__SourcePortAssignment_7_1 ) ) ;
    public final void rule__FilterSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2469:1: ( ( ( rule__FilterSpec__SourcePortAssignment_7_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2470:1: ( ( rule__FilterSpec__SourcePortAssignment_7_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2470:1: ( ( rule__FilterSpec__SourcePortAssignment_7_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2471:1: ( rule__FilterSpec__SourcePortAssignment_7_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getSourcePortAssignment_7_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2472:1: ( rule__FilterSpec__SourcePortAssignment_7_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2472:2: rule__FilterSpec__SourcePortAssignment_7_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__SourcePortAssignment_7_1_in_rule__FilterSpec__Group_7__1__Impl5103);
            rule__FilterSpec__SourcePortAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getSourcePortAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_7__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_8__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2486:1: rule__FilterSpec__Group_8__0 : rule__FilterSpec__Group_8__0__Impl rule__FilterSpec__Group_8__1 ;
    public final void rule__FilterSpec__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2490:1: ( rule__FilterSpec__Group_8__0__Impl rule__FilterSpec__Group_8__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2491:2: rule__FilterSpec__Group_8__0__Impl rule__FilterSpec__Group_8__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_8__0__Impl_in_rule__FilterSpec__Group_8__05137);
            rule__FilterSpec__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_8__1_in_rule__FilterSpec__Group_8__05140);
            rule__FilterSpec__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_8__0"


    // $ANTLR start "rule__FilterSpec__Group_8__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2498:1: rule__FilterSpec__Group_8__0__Impl : ( '--dport' ) ;
    public final void rule__FilterSpec__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2502:1: ( ( '--dport' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2503:1: ( '--dport' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2503:1: ( '--dport' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2504:1: '--dport'
            {
             before(grammarAccess.getFilterSpecAccess().getDportKeyword_8_0()); 
            match(input,41,FOLLOW_41_in_rule__FilterSpec__Group_8__0__Impl5168); 
             after(grammarAccess.getFilterSpecAccess().getDportKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_8__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_8__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2517:1: rule__FilterSpec__Group_8__1 : rule__FilterSpec__Group_8__1__Impl ;
    public final void rule__FilterSpec__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2521:1: ( rule__FilterSpec__Group_8__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2522:2: rule__FilterSpec__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_8__1__Impl_in_rule__FilterSpec__Group_8__15199);
            rule__FilterSpec__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_8__1"


    // $ANTLR start "rule__FilterSpec__Group_8__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2528:1: rule__FilterSpec__Group_8__1__Impl : ( ( rule__FilterSpec__DestinationPortAssignment_8_1 ) ) ;
    public final void rule__FilterSpec__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2532:1: ( ( ( rule__FilterSpec__DestinationPortAssignment_8_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2533:1: ( ( rule__FilterSpec__DestinationPortAssignment_8_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2533:1: ( ( rule__FilterSpec__DestinationPortAssignment_8_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2534:1: ( rule__FilterSpec__DestinationPortAssignment_8_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getDestinationPortAssignment_8_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2535:1: ( rule__FilterSpec__DestinationPortAssignment_8_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2535:2: rule__FilterSpec__DestinationPortAssignment_8_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__DestinationPortAssignment_8_1_in_rule__FilterSpec__Group_8__1__Impl5226);
            rule__FilterSpec__DestinationPortAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getDestinationPortAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_8__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_11__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2549:1: rule__FilterSpec__Group_11__0 : rule__FilterSpec__Group_11__0__Impl rule__FilterSpec__Group_11__1 ;
    public final void rule__FilterSpec__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2553:1: ( rule__FilterSpec__Group_11__0__Impl rule__FilterSpec__Group_11__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2554:2: rule__FilterSpec__Group_11__0__Impl rule__FilterSpec__Group_11__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_11__0__Impl_in_rule__FilterSpec__Group_11__05260);
            rule__FilterSpec__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_11__1_in_rule__FilterSpec__Group_11__05263);
            rule__FilterSpec__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_11__0"


    // $ANTLR start "rule__FilterSpec__Group_11__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2561:1: rule__FilterSpec__Group_11__0__Impl : ( '--m' ) ;
    public final void rule__FilterSpec__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2565:1: ( ( '--m' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2566:1: ( '--m' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2566:1: ( '--m' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2567:1: '--m'
            {
             before(grammarAccess.getFilterSpecAccess().getMKeyword_11_0()); 
            match(input,42,FOLLOW_42_in_rule__FilterSpec__Group_11__0__Impl5291); 
             after(grammarAccess.getFilterSpecAccess().getMKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_11__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_11__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2580:1: rule__FilterSpec__Group_11__1 : rule__FilterSpec__Group_11__1__Impl ;
    public final void rule__FilterSpec__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2584:1: ( rule__FilterSpec__Group_11__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2585:2: rule__FilterSpec__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_11__1__Impl_in_rule__FilterSpec__Group_11__15322);
            rule__FilterSpec__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_11__1"


    // $ANTLR start "rule__FilterSpec__Group_11__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2591:1: rule__FilterSpec__Group_11__1__Impl : ( ( rule__FilterSpec__MatchesAssignment_11_1 ) ) ;
    public final void rule__FilterSpec__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2595:1: ( ( ( rule__FilterSpec__MatchesAssignment_11_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2596:1: ( ( rule__FilterSpec__MatchesAssignment_11_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2596:1: ( ( rule__FilterSpec__MatchesAssignment_11_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2597:1: ( rule__FilterSpec__MatchesAssignment_11_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getMatchesAssignment_11_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2598:1: ( rule__FilterSpec__MatchesAssignment_11_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2598:2: rule__FilterSpec__MatchesAssignment_11_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__MatchesAssignment_11_1_in_rule__FilterSpec__Group_11__1__Impl5349);
            rule__FilterSpec__MatchesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getMatchesAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_11__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_12__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2612:1: rule__FilterSpec__Group_12__0 : rule__FilterSpec__Group_12__0__Impl rule__FilterSpec__Group_12__1 ;
    public final void rule__FilterSpec__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2616:1: ( rule__FilterSpec__Group_12__0__Impl rule__FilterSpec__Group_12__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2617:2: rule__FilterSpec__Group_12__0__Impl rule__FilterSpec__Group_12__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_12__0__Impl_in_rule__FilterSpec__Group_12__05383);
            rule__FilterSpec__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_12__1_in_rule__FilterSpec__Group_12__05386);
            rule__FilterSpec__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__0"


    // $ANTLR start "rule__FilterSpec__Group_12__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2624:1: rule__FilterSpec__Group_12__0__Impl : ( '--ctstate' ) ;
    public final void rule__FilterSpec__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2628:1: ( ( '--ctstate' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2629:1: ( '--ctstate' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2629:1: ( '--ctstate' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2630:1: '--ctstate'
            {
             before(grammarAccess.getFilterSpecAccess().getCtstateKeyword_12_0()); 
            match(input,43,FOLLOW_43_in_rule__FilterSpec__Group_12__0__Impl5414); 
             after(grammarAccess.getFilterSpecAccess().getCtstateKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_12__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2643:1: rule__FilterSpec__Group_12__1 : rule__FilterSpec__Group_12__1__Impl rule__FilterSpec__Group_12__2 ;
    public final void rule__FilterSpec__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2647:1: ( rule__FilterSpec__Group_12__1__Impl rule__FilterSpec__Group_12__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2648:2: rule__FilterSpec__Group_12__1__Impl rule__FilterSpec__Group_12__2
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_12__1__Impl_in_rule__FilterSpec__Group_12__15445);
            rule__FilterSpec__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_12__2_in_rule__FilterSpec__Group_12__15448);
            rule__FilterSpec__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__1"


    // $ANTLR start "rule__FilterSpec__Group_12__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2655:1: rule__FilterSpec__Group_12__1__Impl : ( ( rule__FilterSpec__StatesAssignment_12_1 ) ) ;
    public final void rule__FilterSpec__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2659:1: ( ( ( rule__FilterSpec__StatesAssignment_12_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2660:1: ( ( rule__FilterSpec__StatesAssignment_12_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2660:1: ( ( rule__FilterSpec__StatesAssignment_12_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2661:1: ( rule__FilterSpec__StatesAssignment_12_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getStatesAssignment_12_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2662:1: ( rule__FilterSpec__StatesAssignment_12_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2662:2: rule__FilterSpec__StatesAssignment_12_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__StatesAssignment_12_1_in_rule__FilterSpec__Group_12__1__Impl5475);
            rule__FilterSpec__StatesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getStatesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_12__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2672:1: rule__FilterSpec__Group_12__2 : rule__FilterSpec__Group_12__2__Impl ;
    public final void rule__FilterSpec__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2676:1: ( rule__FilterSpec__Group_12__2__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2677:2: rule__FilterSpec__Group_12__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_12__2__Impl_in_rule__FilterSpec__Group_12__25505);
            rule__FilterSpec__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__2"


    // $ANTLR start "rule__FilterSpec__Group_12__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2683:1: rule__FilterSpec__Group_12__2__Impl : ( ( rule__FilterSpec__Group_12_2__0 )* ) ;
    public final void rule__FilterSpec__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2687:1: ( ( ( rule__FilterSpec__Group_12_2__0 )* ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2688:1: ( ( rule__FilterSpec__Group_12_2__0 )* )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2688:1: ( ( rule__FilterSpec__Group_12_2__0 )* )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2689:1: ( rule__FilterSpec__Group_12_2__0 )*
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_12_2()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2690:1: ( rule__FilterSpec__Group_12_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2690:2: rule__FilterSpec__Group_12_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FilterSpec__Group_12_2__0_in_rule__FilterSpec__Group_12__2__Impl5532);
            	    rule__FilterSpec__Group_12_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFilterSpecAccess().getGroup_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12__2__Impl"


    // $ANTLR start "rule__FilterSpec__Group_12_2__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2706:1: rule__FilterSpec__Group_12_2__0 : rule__FilterSpec__Group_12_2__0__Impl rule__FilterSpec__Group_12_2__1 ;
    public final void rule__FilterSpec__Group_12_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2710:1: ( rule__FilterSpec__Group_12_2__0__Impl rule__FilterSpec__Group_12_2__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2711:2: rule__FilterSpec__Group_12_2__0__Impl rule__FilterSpec__Group_12_2__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_12_2__0__Impl_in_rule__FilterSpec__Group_12_2__05569);
            rule__FilterSpec__Group_12_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_12_2__1_in_rule__FilterSpec__Group_12_2__05572);
            rule__FilterSpec__Group_12_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12_2__0"


    // $ANTLR start "rule__FilterSpec__Group_12_2__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2718:1: rule__FilterSpec__Group_12_2__0__Impl : ( ',' ) ;
    public final void rule__FilterSpec__Group_12_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2722:1: ( ( ',' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2723:1: ( ',' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2723:1: ( ',' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2724:1: ','
            {
             before(grammarAccess.getFilterSpecAccess().getCommaKeyword_12_2_0()); 
            match(input,44,FOLLOW_44_in_rule__FilterSpec__Group_12_2__0__Impl5600); 
             after(grammarAccess.getFilterSpecAccess().getCommaKeyword_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12_2__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_12_2__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2737:1: rule__FilterSpec__Group_12_2__1 : rule__FilterSpec__Group_12_2__1__Impl ;
    public final void rule__FilterSpec__Group_12_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2741:1: ( rule__FilterSpec__Group_12_2__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2742:2: rule__FilterSpec__Group_12_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_12_2__1__Impl_in_rule__FilterSpec__Group_12_2__15631);
            rule__FilterSpec__Group_12_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12_2__1"


    // $ANTLR start "rule__FilterSpec__Group_12_2__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2748:1: rule__FilterSpec__Group_12_2__1__Impl : ( ( rule__FilterSpec__StatesAssignment_12_2_1 ) ) ;
    public final void rule__FilterSpec__Group_12_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2752:1: ( ( ( rule__FilterSpec__StatesAssignment_12_2_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2753:1: ( ( rule__FilterSpec__StatesAssignment_12_2_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2753:1: ( ( rule__FilterSpec__StatesAssignment_12_2_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2754:1: ( rule__FilterSpec__StatesAssignment_12_2_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getStatesAssignment_12_2_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2755:1: ( rule__FilterSpec__StatesAssignment_12_2_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2755:2: rule__FilterSpec__StatesAssignment_12_2_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__StatesAssignment_12_2_1_in_rule__FilterSpec__Group_12_2__1__Impl5658);
            rule__FilterSpec__StatesAssignment_12_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getStatesAssignment_12_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_12_2__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_13__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2769:1: rule__FilterSpec__Group_13__0 : rule__FilterSpec__Group_13__0__Impl rule__FilterSpec__Group_13__1 ;
    public final void rule__FilterSpec__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2773:1: ( rule__FilterSpec__Group_13__0__Impl rule__FilterSpec__Group_13__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2774:2: rule__FilterSpec__Group_13__0__Impl rule__FilterSpec__Group_13__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_13__0__Impl_in_rule__FilterSpec__Group_13__05692);
            rule__FilterSpec__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_13__1_in_rule__FilterSpec__Group_13__05695);
            rule__FilterSpec__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_13__0"


    // $ANTLR start "rule__FilterSpec__Group_13__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2781:1: rule__FilterSpec__Group_13__0__Impl : ( '--ctdir' ) ;
    public final void rule__FilterSpec__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2785:1: ( ( '--ctdir' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2786:1: ( '--ctdir' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2786:1: ( '--ctdir' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2787:1: '--ctdir'
            {
             before(grammarAccess.getFilterSpecAccess().getCtdirKeyword_13_0()); 
            match(input,45,FOLLOW_45_in_rule__FilterSpec__Group_13__0__Impl5723); 
             after(grammarAccess.getFilterSpecAccess().getCtdirKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_13__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_13__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2800:1: rule__FilterSpec__Group_13__1 : rule__FilterSpec__Group_13__1__Impl ;
    public final void rule__FilterSpec__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2804:1: ( rule__FilterSpec__Group_13__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2805:2: rule__FilterSpec__Group_13__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_13__1__Impl_in_rule__FilterSpec__Group_13__15754);
            rule__FilterSpec__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_13__1"


    // $ANTLR start "rule__FilterSpec__Group_13__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2811:1: rule__FilterSpec__Group_13__1__Impl : ( ( rule__FilterSpec__DirAssignment_13_1 ) ) ;
    public final void rule__FilterSpec__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2815:1: ( ( ( rule__FilterSpec__DirAssignment_13_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2816:1: ( ( rule__FilterSpec__DirAssignment_13_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2816:1: ( ( rule__FilterSpec__DirAssignment_13_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2817:1: ( rule__FilterSpec__DirAssignment_13_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getDirAssignment_13_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2818:1: ( rule__FilterSpec__DirAssignment_13_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2818:2: rule__FilterSpec__DirAssignment_13_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__DirAssignment_13_1_in_rule__FilterSpec__Group_13__1__Impl5781);
            rule__FilterSpec__DirAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getDirAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_13__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_14__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2832:1: rule__FilterSpec__Group_14__0 : rule__FilterSpec__Group_14__0__Impl rule__FilterSpec__Group_14__1 ;
    public final void rule__FilterSpec__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2836:1: ( rule__FilterSpec__Group_14__0__Impl rule__FilterSpec__Group_14__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2837:2: rule__FilterSpec__Group_14__0__Impl rule__FilterSpec__Group_14__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_14__0__Impl_in_rule__FilterSpec__Group_14__05815);
            rule__FilterSpec__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_14__1_in_rule__FilterSpec__Group_14__05818);
            rule__FilterSpec__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_14__0"


    // $ANTLR start "rule__FilterSpec__Group_14__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2844:1: rule__FilterSpec__Group_14__0__Impl : ( '--ctstatus' ) ;
    public final void rule__FilterSpec__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2848:1: ( ( '--ctstatus' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2849:1: ( '--ctstatus' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2849:1: ( '--ctstatus' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2850:1: '--ctstatus'
            {
             before(grammarAccess.getFilterSpecAccess().getCtstatusKeyword_14_0()); 
            match(input,46,FOLLOW_46_in_rule__FilterSpec__Group_14__0__Impl5846); 
             after(grammarAccess.getFilterSpecAccess().getCtstatusKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_14__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_14__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2863:1: rule__FilterSpec__Group_14__1 : rule__FilterSpec__Group_14__1__Impl ;
    public final void rule__FilterSpec__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2867:1: ( rule__FilterSpec__Group_14__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2868:2: rule__FilterSpec__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_14__1__Impl_in_rule__FilterSpec__Group_14__15877);
            rule__FilterSpec__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_14__1"


    // $ANTLR start "rule__FilterSpec__Group_14__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2874:1: rule__FilterSpec__Group_14__1__Impl : ( ( rule__FilterSpec__StatusAssignment_14_1 ) ) ;
    public final void rule__FilterSpec__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2878:1: ( ( ( rule__FilterSpec__StatusAssignment_14_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2879:1: ( ( rule__FilterSpec__StatusAssignment_14_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2879:1: ( ( rule__FilterSpec__StatusAssignment_14_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2880:1: ( rule__FilterSpec__StatusAssignment_14_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getStatusAssignment_14_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2881:1: ( rule__FilterSpec__StatusAssignment_14_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2881:2: rule__FilterSpec__StatusAssignment_14_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__StatusAssignment_14_1_in_rule__FilterSpec__Group_14__1__Impl5904);
            rule__FilterSpec__StatusAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getStatusAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_14__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_15__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2895:1: rule__FilterSpec__Group_15__0 : rule__FilterSpec__Group_15__0__Impl rule__FilterSpec__Group_15__1 ;
    public final void rule__FilterSpec__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2899:1: ( rule__FilterSpec__Group_15__0__Impl rule__FilterSpec__Group_15__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2900:2: rule__FilterSpec__Group_15__0__Impl rule__FilterSpec__Group_15__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_15__0__Impl_in_rule__FilterSpec__Group_15__05938);
            rule__FilterSpec__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_15__1_in_rule__FilterSpec__Group_15__05941);
            rule__FilterSpec__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__0"


    // $ANTLR start "rule__FilterSpec__Group_15__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2907:1: rule__FilterSpec__Group_15__0__Impl : ( '--state' ) ;
    public final void rule__FilterSpec__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2911:1: ( ( '--state' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2912:1: ( '--state' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2912:1: ( '--state' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2913:1: '--state'
            {
             before(grammarAccess.getFilterSpecAccess().getStateKeyword_15_0()); 
            match(input,47,FOLLOW_47_in_rule__FilterSpec__Group_15__0__Impl5969); 
             after(grammarAccess.getFilterSpecAccess().getStateKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_15__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2926:1: rule__FilterSpec__Group_15__1 : rule__FilterSpec__Group_15__1__Impl rule__FilterSpec__Group_15__2 ;
    public final void rule__FilterSpec__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2930:1: ( rule__FilterSpec__Group_15__1__Impl rule__FilterSpec__Group_15__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2931:2: rule__FilterSpec__Group_15__1__Impl rule__FilterSpec__Group_15__2
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_15__1__Impl_in_rule__FilterSpec__Group_15__16000);
            rule__FilterSpec__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_15__2_in_rule__FilterSpec__Group_15__16003);
            rule__FilterSpec__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__1"


    // $ANTLR start "rule__FilterSpec__Group_15__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2938:1: rule__FilterSpec__Group_15__1__Impl : ( ( rule__FilterSpec__StatesAssignment_15_1 ) ) ;
    public final void rule__FilterSpec__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2942:1: ( ( ( rule__FilterSpec__StatesAssignment_15_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2943:1: ( ( rule__FilterSpec__StatesAssignment_15_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2943:1: ( ( rule__FilterSpec__StatesAssignment_15_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2944:1: ( rule__FilterSpec__StatesAssignment_15_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getStatesAssignment_15_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2945:1: ( rule__FilterSpec__StatesAssignment_15_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2945:2: rule__FilterSpec__StatesAssignment_15_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__StatesAssignment_15_1_in_rule__FilterSpec__Group_15__1__Impl6030);
            rule__FilterSpec__StatesAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getStatesAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_15__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2955:1: rule__FilterSpec__Group_15__2 : rule__FilterSpec__Group_15__2__Impl ;
    public final void rule__FilterSpec__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2959:1: ( rule__FilterSpec__Group_15__2__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2960:2: rule__FilterSpec__Group_15__2__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_15__2__Impl_in_rule__FilterSpec__Group_15__26060);
            rule__FilterSpec__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__2"


    // $ANTLR start "rule__FilterSpec__Group_15__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2966:1: rule__FilterSpec__Group_15__2__Impl : ( ( rule__FilterSpec__Group_15_2__0 )* ) ;
    public final void rule__FilterSpec__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2970:1: ( ( ( rule__FilterSpec__Group_15_2__0 )* ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2971:1: ( ( rule__FilterSpec__Group_15_2__0 )* )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2971:1: ( ( rule__FilterSpec__Group_15_2__0 )* )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2972:1: ( rule__FilterSpec__Group_15_2__0 )*
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_15_2()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2973:1: ( rule__FilterSpec__Group_15_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2973:2: rule__FilterSpec__Group_15_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FilterSpec__Group_15_2__0_in_rule__FilterSpec__Group_15__2__Impl6087);
            	    rule__FilterSpec__Group_15_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFilterSpecAccess().getGroup_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15__2__Impl"


    // $ANTLR start "rule__FilterSpec__Group_15_2__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2989:1: rule__FilterSpec__Group_15_2__0 : rule__FilterSpec__Group_15_2__0__Impl rule__FilterSpec__Group_15_2__1 ;
    public final void rule__FilterSpec__Group_15_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2993:1: ( rule__FilterSpec__Group_15_2__0__Impl rule__FilterSpec__Group_15_2__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:2994:2: rule__FilterSpec__Group_15_2__0__Impl rule__FilterSpec__Group_15_2__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_15_2__0__Impl_in_rule__FilterSpec__Group_15_2__06124);
            rule__FilterSpec__Group_15_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_15_2__1_in_rule__FilterSpec__Group_15_2__06127);
            rule__FilterSpec__Group_15_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15_2__0"


    // $ANTLR start "rule__FilterSpec__Group_15_2__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3001:1: rule__FilterSpec__Group_15_2__0__Impl : ( ',' ) ;
    public final void rule__FilterSpec__Group_15_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3005:1: ( ( ',' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3006:1: ( ',' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3006:1: ( ',' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3007:1: ','
            {
             before(grammarAccess.getFilterSpecAccess().getCommaKeyword_15_2_0()); 
            match(input,44,FOLLOW_44_in_rule__FilterSpec__Group_15_2__0__Impl6155); 
             after(grammarAccess.getFilterSpecAccess().getCommaKeyword_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15_2__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_15_2__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3020:1: rule__FilterSpec__Group_15_2__1 : rule__FilterSpec__Group_15_2__1__Impl ;
    public final void rule__FilterSpec__Group_15_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3024:1: ( rule__FilterSpec__Group_15_2__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3025:2: rule__FilterSpec__Group_15_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_15_2__1__Impl_in_rule__FilterSpec__Group_15_2__16186);
            rule__FilterSpec__Group_15_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15_2__1"


    // $ANTLR start "rule__FilterSpec__Group_15_2__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3031:1: rule__FilterSpec__Group_15_2__1__Impl : ( ( rule__FilterSpec__StatesAssignment_15_2_1 ) ) ;
    public final void rule__FilterSpec__Group_15_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3035:1: ( ( ( rule__FilterSpec__StatesAssignment_15_2_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3036:1: ( ( rule__FilterSpec__StatesAssignment_15_2_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3036:1: ( ( rule__FilterSpec__StatesAssignment_15_2_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3037:1: ( rule__FilterSpec__StatesAssignment_15_2_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getStatesAssignment_15_2_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3038:1: ( rule__FilterSpec__StatesAssignment_15_2_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3038:2: rule__FilterSpec__StatesAssignment_15_2_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__StatesAssignment_15_2_1_in_rule__FilterSpec__Group_15_2__1__Impl6213);
            rule__FilterSpec__StatesAssignment_15_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getStatesAssignment_15_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_15_2__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3052:1: rule__FilterSpec__Group_16__0 : rule__FilterSpec__Group_16__0__Impl rule__FilterSpec__Group_16__1 ;
    public final void rule__FilterSpec__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3056:1: ( rule__FilterSpec__Group_16__0__Impl rule__FilterSpec__Group_16__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3057:2: rule__FilterSpec__Group_16__0__Impl rule__FilterSpec__Group_16__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16__0__Impl_in_rule__FilterSpec__Group_16__06247);
            rule__FilterSpec__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16__1_in_rule__FilterSpec__Group_16__06250);
            rule__FilterSpec__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__0"


    // $ANTLR start "rule__FilterSpec__Group_16__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3064:1: rule__FilterSpec__Group_16__0__Impl : ( '--tcp-flags' ) ;
    public final void rule__FilterSpec__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3068:1: ( ( '--tcp-flags' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3069:1: ( '--tcp-flags' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3069:1: ( '--tcp-flags' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3070:1: '--tcp-flags'
            {
             before(grammarAccess.getFilterSpecAccess().getTcpFlagsKeyword_16_0()); 
            match(input,48,FOLLOW_48_in_rule__FilterSpec__Group_16__0__Impl6278); 
             after(grammarAccess.getFilterSpecAccess().getTcpFlagsKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3083:1: rule__FilterSpec__Group_16__1 : rule__FilterSpec__Group_16__1__Impl rule__FilterSpec__Group_16__2 ;
    public final void rule__FilterSpec__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3087:1: ( rule__FilterSpec__Group_16__1__Impl rule__FilterSpec__Group_16__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3088:2: rule__FilterSpec__Group_16__1__Impl rule__FilterSpec__Group_16__2
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16__1__Impl_in_rule__FilterSpec__Group_16__16309);
            rule__FilterSpec__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16__2_in_rule__FilterSpec__Group_16__16312);
            rule__FilterSpec__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__1"


    // $ANTLR start "rule__FilterSpec__Group_16__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3095:1: rule__FilterSpec__Group_16__1__Impl : ( ( rule__FilterSpec__ExamFlagsAssignment_16_1 ) ) ;
    public final void rule__FilterSpec__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3099:1: ( ( ( rule__FilterSpec__ExamFlagsAssignment_16_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3100:1: ( ( rule__FilterSpec__ExamFlagsAssignment_16_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3100:1: ( ( rule__FilterSpec__ExamFlagsAssignment_16_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3101:1: ( rule__FilterSpec__ExamFlagsAssignment_16_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getExamFlagsAssignment_16_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3102:1: ( rule__FilterSpec__ExamFlagsAssignment_16_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3102:2: rule__FilterSpec__ExamFlagsAssignment_16_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__ExamFlagsAssignment_16_1_in_rule__FilterSpec__Group_16__1__Impl6339);
            rule__FilterSpec__ExamFlagsAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getExamFlagsAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3112:1: rule__FilterSpec__Group_16__2 : rule__FilterSpec__Group_16__2__Impl rule__FilterSpec__Group_16__3 ;
    public final void rule__FilterSpec__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3116:1: ( rule__FilterSpec__Group_16__2__Impl rule__FilterSpec__Group_16__3 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3117:2: rule__FilterSpec__Group_16__2__Impl rule__FilterSpec__Group_16__3
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16__2__Impl_in_rule__FilterSpec__Group_16__26369);
            rule__FilterSpec__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16__3_in_rule__FilterSpec__Group_16__26372);
            rule__FilterSpec__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__2"


    // $ANTLR start "rule__FilterSpec__Group_16__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3124:1: rule__FilterSpec__Group_16__2__Impl : ( ( rule__FilterSpec__Group_16_2__0 )* ) ;
    public final void rule__FilterSpec__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3128:1: ( ( ( rule__FilterSpec__Group_16_2__0 )* ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3129:1: ( ( rule__FilterSpec__Group_16_2__0 )* )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3129:1: ( ( rule__FilterSpec__Group_16_2__0 )* )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3130:1: ( rule__FilterSpec__Group_16_2__0 )*
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_16_2()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3131:1: ( rule__FilterSpec__Group_16_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3131:2: rule__FilterSpec__Group_16_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FilterSpec__Group_16_2__0_in_rule__FilterSpec__Group_16__2__Impl6399);
            	    rule__FilterSpec__Group_16_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFilterSpecAccess().getGroup_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__2__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16__3"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3141:1: rule__FilterSpec__Group_16__3 : rule__FilterSpec__Group_16__3__Impl rule__FilterSpec__Group_16__4 ;
    public final void rule__FilterSpec__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3145:1: ( rule__FilterSpec__Group_16__3__Impl rule__FilterSpec__Group_16__4 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3146:2: rule__FilterSpec__Group_16__3__Impl rule__FilterSpec__Group_16__4
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16__3__Impl_in_rule__FilterSpec__Group_16__36430);
            rule__FilterSpec__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16__4_in_rule__FilterSpec__Group_16__36433);
            rule__FilterSpec__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__3"


    // $ANTLR start "rule__FilterSpec__Group_16__3__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3153:1: rule__FilterSpec__Group_16__3__Impl : ( ( rule__FilterSpec__FlagsAssignment_16_3 ) ) ;
    public final void rule__FilterSpec__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3157:1: ( ( ( rule__FilterSpec__FlagsAssignment_16_3 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3158:1: ( ( rule__FilterSpec__FlagsAssignment_16_3 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3158:1: ( ( rule__FilterSpec__FlagsAssignment_16_3 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3159:1: ( rule__FilterSpec__FlagsAssignment_16_3 )
            {
             before(grammarAccess.getFilterSpecAccess().getFlagsAssignment_16_3()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3160:1: ( rule__FilterSpec__FlagsAssignment_16_3 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3160:2: rule__FilterSpec__FlagsAssignment_16_3
            {
            pushFollow(FOLLOW_rule__FilterSpec__FlagsAssignment_16_3_in_rule__FilterSpec__Group_16__3__Impl6460);
            rule__FilterSpec__FlagsAssignment_16_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getFlagsAssignment_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__3__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16__4"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3170:1: rule__FilterSpec__Group_16__4 : rule__FilterSpec__Group_16__4__Impl ;
    public final void rule__FilterSpec__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3174:1: ( rule__FilterSpec__Group_16__4__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3175:2: rule__FilterSpec__Group_16__4__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16__4__Impl_in_rule__FilterSpec__Group_16__46490);
            rule__FilterSpec__Group_16__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__4"


    // $ANTLR start "rule__FilterSpec__Group_16__4__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3181:1: rule__FilterSpec__Group_16__4__Impl : ( ( rule__FilterSpec__Group_16_4__0 )* ) ;
    public final void rule__FilterSpec__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3185:1: ( ( ( rule__FilterSpec__Group_16_4__0 )* ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3186:1: ( ( rule__FilterSpec__Group_16_4__0 )* )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3186:1: ( ( rule__FilterSpec__Group_16_4__0 )* )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3187:1: ( rule__FilterSpec__Group_16_4__0 )*
            {
             before(grammarAccess.getFilterSpecAccess().getGroup_16_4()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3188:1: ( rule__FilterSpec__Group_16_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3188:2: rule__FilterSpec__Group_16_4__0
            	    {
            	    pushFollow(FOLLOW_rule__FilterSpec__Group_16_4__0_in_rule__FilterSpec__Group_16__4__Impl6517);
            	    rule__FilterSpec__Group_16_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getFilterSpecAccess().getGroup_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16__4__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16_2__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3208:1: rule__FilterSpec__Group_16_2__0 : rule__FilterSpec__Group_16_2__0__Impl rule__FilterSpec__Group_16_2__1 ;
    public final void rule__FilterSpec__Group_16_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3212:1: ( rule__FilterSpec__Group_16_2__0__Impl rule__FilterSpec__Group_16_2__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3213:2: rule__FilterSpec__Group_16_2__0__Impl rule__FilterSpec__Group_16_2__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16_2__0__Impl_in_rule__FilterSpec__Group_16_2__06558);
            rule__FilterSpec__Group_16_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16_2__1_in_rule__FilterSpec__Group_16_2__06561);
            rule__FilterSpec__Group_16_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_2__0"


    // $ANTLR start "rule__FilterSpec__Group_16_2__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3220:1: rule__FilterSpec__Group_16_2__0__Impl : ( ',' ) ;
    public final void rule__FilterSpec__Group_16_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3224:1: ( ( ',' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3225:1: ( ',' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3225:1: ( ',' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3226:1: ','
            {
             before(grammarAccess.getFilterSpecAccess().getCommaKeyword_16_2_0()); 
            match(input,44,FOLLOW_44_in_rule__FilterSpec__Group_16_2__0__Impl6589); 
             after(grammarAccess.getFilterSpecAccess().getCommaKeyword_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_2__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16_2__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3239:1: rule__FilterSpec__Group_16_2__1 : rule__FilterSpec__Group_16_2__1__Impl ;
    public final void rule__FilterSpec__Group_16_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3243:1: ( rule__FilterSpec__Group_16_2__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3244:2: rule__FilterSpec__Group_16_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16_2__1__Impl_in_rule__FilterSpec__Group_16_2__16620);
            rule__FilterSpec__Group_16_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_2__1"


    // $ANTLR start "rule__FilterSpec__Group_16_2__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3250:1: rule__FilterSpec__Group_16_2__1__Impl : ( ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 ) ) ;
    public final void rule__FilterSpec__Group_16_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3254:1: ( ( ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3255:1: ( ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3255:1: ( ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3256:1: ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getExamFlagsAssignment_16_2_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3257:1: ( rule__FilterSpec__ExamFlagsAssignment_16_2_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3257:2: rule__FilterSpec__ExamFlagsAssignment_16_2_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__ExamFlagsAssignment_16_2_1_in_rule__FilterSpec__Group_16_2__1__Impl6647);
            rule__FilterSpec__ExamFlagsAssignment_16_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getExamFlagsAssignment_16_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_2__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16_4__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3271:1: rule__FilterSpec__Group_16_4__0 : rule__FilterSpec__Group_16_4__0__Impl rule__FilterSpec__Group_16_4__1 ;
    public final void rule__FilterSpec__Group_16_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3275:1: ( rule__FilterSpec__Group_16_4__0__Impl rule__FilterSpec__Group_16_4__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3276:2: rule__FilterSpec__Group_16_4__0__Impl rule__FilterSpec__Group_16_4__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16_4__0__Impl_in_rule__FilterSpec__Group_16_4__06681);
            rule__FilterSpec__Group_16_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_16_4__1_in_rule__FilterSpec__Group_16_4__06684);
            rule__FilterSpec__Group_16_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_4__0"


    // $ANTLR start "rule__FilterSpec__Group_16_4__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3283:1: rule__FilterSpec__Group_16_4__0__Impl : ( ',' ) ;
    public final void rule__FilterSpec__Group_16_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3287:1: ( ( ',' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3288:1: ( ',' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3288:1: ( ',' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3289:1: ','
            {
             before(grammarAccess.getFilterSpecAccess().getCommaKeyword_16_4_0()); 
            match(input,44,FOLLOW_44_in_rule__FilterSpec__Group_16_4__0__Impl6712); 
             after(grammarAccess.getFilterSpecAccess().getCommaKeyword_16_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_4__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_16_4__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3302:1: rule__FilterSpec__Group_16_4__1 : rule__FilterSpec__Group_16_4__1__Impl ;
    public final void rule__FilterSpec__Group_16_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3306:1: ( rule__FilterSpec__Group_16_4__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3307:2: rule__FilterSpec__Group_16_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_16_4__1__Impl_in_rule__FilterSpec__Group_16_4__16743);
            rule__FilterSpec__Group_16_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_4__1"


    // $ANTLR start "rule__FilterSpec__Group_16_4__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3313:1: rule__FilterSpec__Group_16_4__1__Impl : ( ( rule__FilterSpec__FlagsAssignment_16_4_1 ) ) ;
    public final void rule__FilterSpec__Group_16_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3317:1: ( ( ( rule__FilterSpec__FlagsAssignment_16_4_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3318:1: ( ( rule__FilterSpec__FlagsAssignment_16_4_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3318:1: ( ( rule__FilterSpec__FlagsAssignment_16_4_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3319:1: ( rule__FilterSpec__FlagsAssignment_16_4_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getFlagsAssignment_16_4_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3320:1: ( rule__FilterSpec__FlagsAssignment_16_4_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3320:2: rule__FilterSpec__FlagsAssignment_16_4_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__FlagsAssignment_16_4_1_in_rule__FilterSpec__Group_16_4__1__Impl6770);
            rule__FilterSpec__FlagsAssignment_16_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getFlagsAssignment_16_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_16_4__1__Impl"


    // $ANTLR start "rule__FilterSpec__Group_19__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3334:1: rule__FilterSpec__Group_19__0 : rule__FilterSpec__Group_19__0__Impl rule__FilterSpec__Group_19__1 ;
    public final void rule__FilterSpec__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3338:1: ( rule__FilterSpec__Group_19__0__Impl rule__FilterSpec__Group_19__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3339:2: rule__FilterSpec__Group_19__0__Impl rule__FilterSpec__Group_19__1
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_19__0__Impl_in_rule__FilterSpec__Group_19__06804);
            rule__FilterSpec__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FilterSpec__Group_19__1_in_rule__FilterSpec__Group_19__06807);
            rule__FilterSpec__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_19__0"


    // $ANTLR start "rule__FilterSpec__Group_19__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3346:1: rule__FilterSpec__Group_19__0__Impl : ( '--log-prefix' ) ;
    public final void rule__FilterSpec__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3350:1: ( ( '--log-prefix' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3351:1: ( '--log-prefix' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3351:1: ( '--log-prefix' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3352:1: '--log-prefix'
            {
             before(grammarAccess.getFilterSpecAccess().getLogPrefixKeyword_19_0()); 
            match(input,49,FOLLOW_49_in_rule__FilterSpec__Group_19__0__Impl6835); 
             after(grammarAccess.getFilterSpecAccess().getLogPrefixKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_19__0__Impl"


    // $ANTLR start "rule__FilterSpec__Group_19__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3365:1: rule__FilterSpec__Group_19__1 : rule__FilterSpec__Group_19__1__Impl ;
    public final void rule__FilterSpec__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3369:1: ( rule__FilterSpec__Group_19__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3370:2: rule__FilterSpec__Group_19__1__Impl
            {
            pushFollow(FOLLOW_rule__FilterSpec__Group_19__1__Impl_in_rule__FilterSpec__Group_19__16866);
            rule__FilterSpec__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_19__1"


    // $ANTLR start "rule__FilterSpec__Group_19__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3376:1: rule__FilterSpec__Group_19__1__Impl : ( ( rule__FilterSpec__LpAssignment_19_1 ) ) ;
    public final void rule__FilterSpec__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3380:1: ( ( ( rule__FilterSpec__LpAssignment_19_1 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3381:1: ( ( rule__FilterSpec__LpAssignment_19_1 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3381:1: ( ( rule__FilterSpec__LpAssignment_19_1 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3382:1: ( rule__FilterSpec__LpAssignment_19_1 )
            {
             before(grammarAccess.getFilterSpecAccess().getLpAssignment_19_1()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3383:1: ( rule__FilterSpec__LpAssignment_19_1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3383:2: rule__FilterSpec__LpAssignment_19_1
            {
            pushFollow(FOLLOW_rule__FilterSpec__LpAssignment_19_1_in_rule__FilterSpec__Group_19__1__Impl6893);
            rule__FilterSpec__LpAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getLpAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__Group_19__1__Impl"


    // $ANTLR start "rule__ChainDeclaration__Group__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3397:1: rule__ChainDeclaration__Group__0 : rule__ChainDeclaration__Group__0__Impl rule__ChainDeclaration__Group__1 ;
    public final void rule__ChainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3401:1: ( rule__ChainDeclaration__Group__0__Impl rule__ChainDeclaration__Group__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3402:2: rule__ChainDeclaration__Group__0__Impl rule__ChainDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ChainDeclaration__Group__0__Impl_in_rule__ChainDeclaration__Group__06927);
            rule__ChainDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChainDeclaration__Group__1_in_rule__ChainDeclaration__Group__06930);
            rule__ChainDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__0"


    // $ANTLR start "rule__ChainDeclaration__Group__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3409:1: rule__ChainDeclaration__Group__0__Impl : ( 'iptables' ) ;
    public final void rule__ChainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3413:1: ( ( 'iptables' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3414:1: ( 'iptables' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3414:1: ( 'iptables' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3415:1: 'iptables'
            {
             before(grammarAccess.getChainDeclarationAccess().getIptablesKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ChainDeclaration__Group__0__Impl6958); 
             after(grammarAccess.getChainDeclarationAccess().getIptablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ChainDeclaration__Group__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3428:1: rule__ChainDeclaration__Group__1 : rule__ChainDeclaration__Group__1__Impl rule__ChainDeclaration__Group__2 ;
    public final void rule__ChainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3432:1: ( rule__ChainDeclaration__Group__1__Impl rule__ChainDeclaration__Group__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3433:2: rule__ChainDeclaration__Group__1__Impl rule__ChainDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ChainDeclaration__Group__1__Impl_in_rule__ChainDeclaration__Group__16989);
            rule__ChainDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChainDeclaration__Group__2_in_rule__ChainDeclaration__Group__16992);
            rule__ChainDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__1"


    // $ANTLR start "rule__ChainDeclaration__Group__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3440:1: rule__ChainDeclaration__Group__1__Impl : ( '-N' ) ;
    public final void rule__ChainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3444:1: ( ( '-N' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3445:1: ( '-N' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3445:1: ( '-N' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3446:1: '-N'
            {
             before(grammarAccess.getChainDeclarationAccess().getNKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__ChainDeclaration__Group__1__Impl7020); 
             after(grammarAccess.getChainDeclarationAccess().getNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ChainDeclaration__Group__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3459:1: rule__ChainDeclaration__Group__2 : rule__ChainDeclaration__Group__2__Impl ;
    public final void rule__ChainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3463:1: ( rule__ChainDeclaration__Group__2__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3464:2: rule__ChainDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChainDeclaration__Group__2__Impl_in_rule__ChainDeclaration__Group__27051);
            rule__ChainDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__2"


    // $ANTLR start "rule__ChainDeclaration__Group__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3470:1: rule__ChainDeclaration__Group__2__Impl : ( ruleChainName ) ;
    public final void rule__ChainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3474:1: ( ( ruleChainName ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3475:1: ( ruleChainName )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3475:1: ( ruleChainName )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3476:1: ruleChainName
            {
             before(grammarAccess.getChainDeclarationAccess().getChainNameParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleChainName_in_rule__ChainDeclaration__Group__2__Impl7078);
            ruleChainName();

            state._fsp--;

             after(grammarAccess.getChainDeclarationAccess().getChainNameParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainDeclaration__Group__2__Impl"


    // $ANTLR start "rule__IPExpr__Group__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3493:1: rule__IPExpr__Group__0 : rule__IPExpr__Group__0__Impl rule__IPExpr__Group__1 ;
    public final void rule__IPExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3497:1: ( rule__IPExpr__Group__0__Impl rule__IPExpr__Group__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3498:2: rule__IPExpr__Group__0__Impl rule__IPExpr__Group__1
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__0__Impl_in_rule__IPExpr__Group__07113);
            rule__IPExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__1_in_rule__IPExpr__Group__07116);
            rule__IPExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__0"


    // $ANTLR start "rule__IPExpr__Group__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3505:1: rule__IPExpr__Group__0__Impl : ( ruleipByteExpr ) ;
    public final void rule__IPExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3509:1: ( ( ruleipByteExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3510:1: ( ruleipByteExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3510:1: ( ruleipByteExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3511:1: ruleipByteExpr
            {
             before(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__0__Impl7143);
            ruleipByteExpr();

            state._fsp--;

             after(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__0__Impl"


    // $ANTLR start "rule__IPExpr__Group__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3522:1: rule__IPExpr__Group__1 : rule__IPExpr__Group__1__Impl rule__IPExpr__Group__2 ;
    public final void rule__IPExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3526:1: ( rule__IPExpr__Group__1__Impl rule__IPExpr__Group__2 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3527:2: rule__IPExpr__Group__1__Impl rule__IPExpr__Group__2
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__1__Impl_in_rule__IPExpr__Group__17172);
            rule__IPExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__2_in_rule__IPExpr__Group__17175);
            rule__IPExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__1"


    // $ANTLR start "rule__IPExpr__Group__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3534:1: rule__IPExpr__Group__1__Impl : ( '.' ) ;
    public final void rule__IPExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3538:1: ( ( '.' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3539:1: ( '.' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3539:1: ( '.' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3540:1: '.'
            {
             before(grammarAccess.getIPExprAccess().getFullStopKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__IPExpr__Group__1__Impl7203); 
             after(grammarAccess.getIPExprAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__1__Impl"


    // $ANTLR start "rule__IPExpr__Group__2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3553:1: rule__IPExpr__Group__2 : rule__IPExpr__Group__2__Impl rule__IPExpr__Group__3 ;
    public final void rule__IPExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3557:1: ( rule__IPExpr__Group__2__Impl rule__IPExpr__Group__3 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3558:2: rule__IPExpr__Group__2__Impl rule__IPExpr__Group__3
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__2__Impl_in_rule__IPExpr__Group__27234);
            rule__IPExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__3_in_rule__IPExpr__Group__27237);
            rule__IPExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__2"


    // $ANTLR start "rule__IPExpr__Group__2__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3565:1: rule__IPExpr__Group__2__Impl : ( ruleipByteExpr ) ;
    public final void rule__IPExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3569:1: ( ( ruleipByteExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3570:1: ( ruleipByteExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3570:1: ( ruleipByteExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3571:1: ruleipByteExpr
            {
             before(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__2__Impl7264);
            ruleipByteExpr();

            state._fsp--;

             after(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__2__Impl"


    // $ANTLR start "rule__IPExpr__Group__3"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3582:1: rule__IPExpr__Group__3 : rule__IPExpr__Group__3__Impl rule__IPExpr__Group__4 ;
    public final void rule__IPExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3586:1: ( rule__IPExpr__Group__3__Impl rule__IPExpr__Group__4 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3587:2: rule__IPExpr__Group__3__Impl rule__IPExpr__Group__4
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__3__Impl_in_rule__IPExpr__Group__37293);
            rule__IPExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__4_in_rule__IPExpr__Group__37296);
            rule__IPExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__3"


    // $ANTLR start "rule__IPExpr__Group__3__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3594:1: rule__IPExpr__Group__3__Impl : ( '.' ) ;
    public final void rule__IPExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3598:1: ( ( '.' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3599:1: ( '.' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3599:1: ( '.' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3600:1: '.'
            {
             before(grammarAccess.getIPExprAccess().getFullStopKeyword_3()); 
            match(input,51,FOLLOW_51_in_rule__IPExpr__Group__3__Impl7324); 
             after(grammarAccess.getIPExprAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__3__Impl"


    // $ANTLR start "rule__IPExpr__Group__4"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3613:1: rule__IPExpr__Group__4 : rule__IPExpr__Group__4__Impl rule__IPExpr__Group__5 ;
    public final void rule__IPExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3617:1: ( rule__IPExpr__Group__4__Impl rule__IPExpr__Group__5 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3618:2: rule__IPExpr__Group__4__Impl rule__IPExpr__Group__5
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__4__Impl_in_rule__IPExpr__Group__47355);
            rule__IPExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__5_in_rule__IPExpr__Group__47358);
            rule__IPExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__4"


    // $ANTLR start "rule__IPExpr__Group__4__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3625:1: rule__IPExpr__Group__4__Impl : ( ruleipByteExpr ) ;
    public final void rule__IPExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3629:1: ( ( ruleipByteExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3630:1: ( ruleipByteExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3630:1: ( ruleipByteExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3631:1: ruleipByteExpr
            {
             before(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__4__Impl7385);
            ruleipByteExpr();

            state._fsp--;

             after(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__4__Impl"


    // $ANTLR start "rule__IPExpr__Group__5"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3642:1: rule__IPExpr__Group__5 : rule__IPExpr__Group__5__Impl rule__IPExpr__Group__6 ;
    public final void rule__IPExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3646:1: ( rule__IPExpr__Group__5__Impl rule__IPExpr__Group__6 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3647:2: rule__IPExpr__Group__5__Impl rule__IPExpr__Group__6
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__5__Impl_in_rule__IPExpr__Group__57414);
            rule__IPExpr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__6_in_rule__IPExpr__Group__57417);
            rule__IPExpr__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__5"


    // $ANTLR start "rule__IPExpr__Group__5__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3654:1: rule__IPExpr__Group__5__Impl : ( '.' ) ;
    public final void rule__IPExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3658:1: ( ( '.' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3659:1: ( '.' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3659:1: ( '.' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3660:1: '.'
            {
             before(grammarAccess.getIPExprAccess().getFullStopKeyword_5()); 
            match(input,51,FOLLOW_51_in_rule__IPExpr__Group__5__Impl7445); 
             after(grammarAccess.getIPExprAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__5__Impl"


    // $ANTLR start "rule__IPExpr__Group__6"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3673:1: rule__IPExpr__Group__6 : rule__IPExpr__Group__6__Impl rule__IPExpr__Group__7 ;
    public final void rule__IPExpr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3677:1: ( rule__IPExpr__Group__6__Impl rule__IPExpr__Group__7 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3678:2: rule__IPExpr__Group__6__Impl rule__IPExpr__Group__7
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__6__Impl_in_rule__IPExpr__Group__67476);
            rule__IPExpr__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IPExpr__Group__7_in_rule__IPExpr__Group__67479);
            rule__IPExpr__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__6"


    // $ANTLR start "rule__IPExpr__Group__6__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3685:1: rule__IPExpr__Group__6__Impl : ( ruleipByteExpr ) ;
    public final void rule__IPExpr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3689:1: ( ( ruleipByteExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3690:1: ( ruleipByteExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3690:1: ( ruleipByteExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3691:1: ruleipByteExpr
            {
             before(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_6()); 
            pushFollow(FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__6__Impl7506);
            ruleipByteExpr();

            state._fsp--;

             after(grammarAccess.getIPExprAccess().getIpByteExprParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__6__Impl"


    // $ANTLR start "rule__IPExpr__Group__7"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3702:1: rule__IPExpr__Group__7 : rule__IPExpr__Group__7__Impl ;
    public final void rule__IPExpr__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3706:1: ( rule__IPExpr__Group__7__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3707:2: rule__IPExpr__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__IPExpr__Group__7__Impl_in_rule__IPExpr__Group__77535);
            rule__IPExpr__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__7"


    // $ANTLR start "rule__IPExpr__Group__7__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3713:1: rule__IPExpr__Group__7__Impl : ( ( ruleIpRangeExpr )? ) ;
    public final void rule__IPExpr__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3717:1: ( ( ( ruleIpRangeExpr )? ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3718:1: ( ( ruleIpRangeExpr )? )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3718:1: ( ( ruleIpRangeExpr )? )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3719:1: ( ruleIpRangeExpr )?
            {
             before(grammarAccess.getIPExprAccess().getIpRangeExprParserRuleCall_7()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3720:1: ( ruleIpRangeExpr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3720:3: ruleIpRangeExpr
                    {
                    pushFollow(FOLLOW_ruleIpRangeExpr_in_rule__IPExpr__Group__7__Impl7563);
                    ruleIpRangeExpr();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIPExprAccess().getIpRangeExprParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IPExpr__Group__7__Impl"


    // $ANTLR start "rule__IpRangeExpr__Group__0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3746:1: rule__IpRangeExpr__Group__0 : rule__IpRangeExpr__Group__0__Impl rule__IpRangeExpr__Group__1 ;
    public final void rule__IpRangeExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3750:1: ( rule__IpRangeExpr__Group__0__Impl rule__IpRangeExpr__Group__1 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3751:2: rule__IpRangeExpr__Group__0__Impl rule__IpRangeExpr__Group__1
            {
            pushFollow(FOLLOW_rule__IpRangeExpr__Group__0__Impl_in_rule__IpRangeExpr__Group__07610);
            rule__IpRangeExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IpRangeExpr__Group__1_in_rule__IpRangeExpr__Group__07613);
            rule__IpRangeExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IpRangeExpr__Group__0"


    // $ANTLR start "rule__IpRangeExpr__Group__0__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3758:1: rule__IpRangeExpr__Group__0__Impl : ( '/' ) ;
    public final void rule__IpRangeExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3762:1: ( ( '/' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3763:1: ( '/' )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3763:1: ( '/' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3764:1: '/'
            {
             before(grammarAccess.getIpRangeExprAccess().getSolidusKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__IpRangeExpr__Group__0__Impl7641); 
             after(grammarAccess.getIpRangeExprAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IpRangeExpr__Group__0__Impl"


    // $ANTLR start "rule__IpRangeExpr__Group__1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3777:1: rule__IpRangeExpr__Group__1 : rule__IpRangeExpr__Group__1__Impl ;
    public final void rule__IpRangeExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3781:1: ( rule__IpRangeExpr__Group__1__Impl )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3782:2: rule__IpRangeExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IpRangeExpr__Group__1__Impl_in_rule__IpRangeExpr__Group__17672);
            rule__IpRangeExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IpRangeExpr__Group__1"


    // $ANTLR start "rule__IpRangeExpr__Group__1__Impl"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3788:1: rule__IpRangeExpr__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__IpRangeExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3792:1: ( ( RULE_INT ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3793:1: ( RULE_INT )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3793:1: ( RULE_INT )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3794:1: RULE_INT
            {
             before(grammarAccess.getIpRangeExprAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IpRangeExpr__Group__1__Impl7699); 
             after(grammarAccess.getIpRangeExprAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IpRangeExpr__Group__1__Impl"


    // $ANTLR start "rule__Model__RulesAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3810:1: rule__Model__RulesAssignment : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3814:1: ( ( ruleRule ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3815:1: ( ruleRule )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3815:1: ( ruleRule )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3816:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment7737);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment"


    // $ANTLR start "rule__Rule__DeclarationAssignment_0"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3825:1: rule__Rule__DeclarationAssignment_0 : ( ruleChainDeclaration ) ;
    public final void rule__Rule__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3829:1: ( ( ruleChainDeclaration ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3830:1: ( ruleChainDeclaration )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3830:1: ( ruleChainDeclaration )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3831:1: ruleChainDeclaration
            {
             before(grammarAccess.getRuleAccess().getDeclarationChainDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleChainDeclaration_in_rule__Rule__DeclarationAssignment_07768);
            ruleChainDeclaration();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDeclarationChainDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__DeclarationAssignment_0"


    // $ANTLR start "rule__Rule__FilterAssignment_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3840:1: rule__Rule__FilterAssignment_1 : ( ruleFilterDeclaration ) ;
    public final void rule__Rule__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3844:1: ( ( ruleFilterDeclaration ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3845:1: ( ruleFilterDeclaration )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3845:1: ( ruleFilterDeclaration )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3846:1: ruleFilterDeclaration
            {
             before(grammarAccess.getRuleAccess().getFilterFilterDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFilterDeclaration_in_rule__Rule__FilterAssignment_17799);
            ruleFilterDeclaration();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterFilterDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FilterAssignment_1"


    // $ANTLR start "rule__FilterDeclaration__FilterAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3855:1: rule__FilterDeclaration__FilterAssignment : ( ruleFilteringSpec ) ;
    public final void rule__FilterDeclaration__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3859:1: ( ( ruleFilteringSpec ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3860:1: ( ruleFilteringSpec )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3860:1: ( ruleFilteringSpec )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3861:1: ruleFilteringSpec
            {
             before(grammarAccess.getFilterDeclarationAccess().getFilterFilteringSpecParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFilteringSpec_in_rule__FilterDeclaration__FilterAssignment7830);
            ruleFilteringSpec();

            state._fsp--;

             after(grammarAccess.getFilterDeclarationAccess().getFilterFilteringSpecParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDeclaration__FilterAssignment"


    // $ANTLR start "rule__FilterSpec__OptionAssignment_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3870:1: rule__FilterSpec__OptionAssignment_1 : ( ( rule__FilterSpec__OptionAlternatives_1_0 ) ) ;
    public final void rule__FilterSpec__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3874:1: ( ( ( rule__FilterSpec__OptionAlternatives_1_0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3875:1: ( ( rule__FilterSpec__OptionAlternatives_1_0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3875:1: ( ( rule__FilterSpec__OptionAlternatives_1_0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3876:1: ( rule__FilterSpec__OptionAlternatives_1_0 )
            {
             before(grammarAccess.getFilterSpecAccess().getOptionAlternatives_1_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3877:1: ( rule__FilterSpec__OptionAlternatives_1_0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3877:2: rule__FilterSpec__OptionAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__FilterSpec__OptionAlternatives_1_0_in_rule__FilterSpec__OptionAssignment_17861);
            rule__FilterSpec__OptionAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterSpecAccess().getOptionAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__OptionAssignment_1"


    // $ANTLR start "rule__FilterSpec__ChainAssignment_2"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3886:1: rule__FilterSpec__ChainAssignment_2 : ( ruleChain ) ;
    public final void rule__FilterSpec__ChainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3890:1: ( ( ruleChain ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3891:1: ( ruleChain )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3891:1: ( ruleChain )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3892:1: ruleChain
            {
             before(grammarAccess.getFilterSpecAccess().getChainChainParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleChain_in_rule__FilterSpec__ChainAssignment_27894);
            ruleChain();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getChainChainParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__ChainAssignment_2"


    // $ANTLR start "rule__FilterSpec__IpAssignment_3_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3901:1: rule__FilterSpec__IpAssignment_3_1 : ( ruleIPExpr ) ;
    public final void rule__FilterSpec__IpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3905:1: ( ( ruleIPExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3906:1: ( ruleIPExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3906:1: ( ruleIPExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3907:1: ruleIPExpr
            {
             before(grammarAccess.getFilterSpecAccess().getIpIPExprParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIPExpr_in_rule__FilterSpec__IpAssignment_3_17925);
            ruleIPExpr();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getIpIPExprParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__IpAssignment_3_1"


    // $ANTLR start "rule__FilterSpec__InterfaceAssignment_4_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3916:1: rule__FilterSpec__InterfaceAssignment_4_1 : ( ruleInterface ) ;
    public final void rule__FilterSpec__InterfaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3920:1: ( ( ruleInterface ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3921:1: ( ruleInterface )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3921:1: ( ruleInterface )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3922:1: ruleInterface
            {
             before(grammarAccess.getFilterSpecAccess().getInterfaceInterfaceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__FilterSpec__InterfaceAssignment_4_17956);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getInterfaceInterfaceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__InterfaceAssignment_4_1"


    // $ANTLR start "rule__FilterSpec__IpDstAssignment_5_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3931:1: rule__FilterSpec__IpDstAssignment_5_1 : ( ruleIPExpr ) ;
    public final void rule__FilterSpec__IpDstAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3935:1: ( ( ruleIPExpr ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3936:1: ( ruleIPExpr )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3936:1: ( ruleIPExpr )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3937:1: ruleIPExpr
            {
             before(grammarAccess.getFilterSpecAccess().getIpDstIPExprParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleIPExpr_in_rule__FilterSpec__IpDstAssignment_5_17987);
            ruleIPExpr();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getIpDstIPExprParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__IpDstAssignment_5_1"


    // $ANTLR start "rule__FilterSpec__ProtocolAssignment_6_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3946:1: rule__FilterSpec__ProtocolAssignment_6_1 : ( ruleProtocol ) ;
    public final void rule__FilterSpec__ProtocolAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3950:1: ( ( ruleProtocol ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3951:1: ( ruleProtocol )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3951:1: ( ruleProtocol )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3952:1: ruleProtocol
            {
             before(grammarAccess.getFilterSpecAccess().getProtocolProtocolParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleProtocol_in_rule__FilterSpec__ProtocolAssignment_6_18018);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getProtocolProtocolParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__ProtocolAssignment_6_1"


    // $ANTLR start "rule__FilterSpec__SourcePortAssignment_7_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3961:1: rule__FilterSpec__SourcePortAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__FilterSpec__SourcePortAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3965:1: ( ( RULE_INT ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3966:1: ( RULE_INT )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3966:1: ( RULE_INT )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3967:1: RULE_INT
            {
             before(grammarAccess.getFilterSpecAccess().getSourcePortINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FilterSpec__SourcePortAssignment_7_18049); 
             after(grammarAccess.getFilterSpecAccess().getSourcePortINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__SourcePortAssignment_7_1"


    // $ANTLR start "rule__FilterSpec__DestinationPortAssignment_8_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3976:1: rule__FilterSpec__DestinationPortAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__FilterSpec__DestinationPortAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3980:1: ( ( RULE_INT ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3981:1: ( RULE_INT )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3981:1: ( RULE_INT )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3982:1: RULE_INT
            {
             before(grammarAccess.getFilterSpecAccess().getDestinationPortINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FilterSpec__DestinationPortAssignment_8_18080); 
             after(grammarAccess.getFilterSpecAccess().getDestinationPortINTTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__DestinationPortAssignment_8_1"


    // $ANTLR start "rule__FilterSpec__NegAssignment_9"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3991:1: rule__FilterSpec__NegAssignment_9 : ( ( '!' ) ) ;
    public final void rule__FilterSpec__NegAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3995:1: ( ( ( '!' ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3996:1: ( ( '!' ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3996:1: ( ( '!' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3997:1: ( '!' )
            {
             before(grammarAccess.getFilterSpecAccess().getNegExclamationMarkKeyword_9_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3998:1: ( '!' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:3999:1: '!'
            {
             before(grammarAccess.getFilterSpecAccess().getNegExclamationMarkKeyword_9_0()); 
            match(input,53,FOLLOW_53_in_rule__FilterSpec__NegAssignment_98116); 
             after(grammarAccess.getFilterSpecAccess().getNegExclamationMarkKeyword_9_0()); 

            }

             after(grammarAccess.getFilterSpecAccess().getNegExclamationMarkKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__NegAssignment_9"


    // $ANTLR start "rule__FilterSpec__SynAssignment_10"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4014:1: rule__FilterSpec__SynAssignment_10 : ( ( '--syn' ) ) ;
    public final void rule__FilterSpec__SynAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4018:1: ( ( ( '--syn' ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4019:1: ( ( '--syn' ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4019:1: ( ( '--syn' ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4020:1: ( '--syn' )
            {
             before(grammarAccess.getFilterSpecAccess().getSynSynKeyword_10_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4021:1: ( '--syn' )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4022:1: '--syn'
            {
             before(grammarAccess.getFilterSpecAccess().getSynSynKeyword_10_0()); 
            match(input,54,FOLLOW_54_in_rule__FilterSpec__SynAssignment_108160); 
             after(grammarAccess.getFilterSpecAccess().getSynSynKeyword_10_0()); 

            }

             after(grammarAccess.getFilterSpecAccess().getSynSynKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__SynAssignment_10"


    // $ANTLR start "rule__FilterSpec__MatchesAssignment_11_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4037:1: rule__FilterSpec__MatchesAssignment_11_1 : ( ruleMatch ) ;
    public final void rule__FilterSpec__MatchesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4041:1: ( ( ruleMatch ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4042:1: ( ruleMatch )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4042:1: ( ruleMatch )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4043:1: ruleMatch
            {
             before(grammarAccess.getFilterSpecAccess().getMatchesMatchParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_ruleMatch_in_rule__FilterSpec__MatchesAssignment_11_18199);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getMatchesMatchParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__MatchesAssignment_11_1"


    // $ANTLR start "rule__FilterSpec__StatesAssignment_12_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4052:1: rule__FilterSpec__StatesAssignment_12_1 : ( ruleState ) ;
    public final void rule__FilterSpec__StatesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4056:1: ( ( ruleState ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4057:1: ( ruleState )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4057:1: ( ruleState )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4058:1: ruleState
            {
             before(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_12_18230);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__StatesAssignment_12_1"


    // $ANTLR start "rule__FilterSpec__StatesAssignment_12_2_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4067:1: rule__FilterSpec__StatesAssignment_12_2_1 : ( ruleState ) ;
    public final void rule__FilterSpec__StatesAssignment_12_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4071:1: ( ( ruleState ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4072:1: ( ruleState )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4072:1: ( ruleState )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4073:1: ruleState
            {
             before(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_2_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_12_2_18261);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_12_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__StatesAssignment_12_2_1"


    // $ANTLR start "rule__FilterSpec__DirAssignment_13_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4082:1: rule__FilterSpec__DirAssignment_13_1 : ( ruleDir ) ;
    public final void rule__FilterSpec__DirAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4086:1: ( ( ruleDir ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4087:1: ( ruleDir )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4087:1: ( ruleDir )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4088:1: ruleDir
            {
             before(grammarAccess.getFilterSpecAccess().getDirDirParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_ruleDir_in_rule__FilterSpec__DirAssignment_13_18292);
            ruleDir();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getDirDirParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__DirAssignment_13_1"


    // $ANTLR start "rule__FilterSpec__StatusAssignment_14_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4097:1: rule__FilterSpec__StatusAssignment_14_1 : ( ruleStatus ) ;
    public final void rule__FilterSpec__StatusAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4101:1: ( ( ruleStatus ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4102:1: ( ruleStatus )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4102:1: ( ruleStatus )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4103:1: ruleStatus
            {
             before(grammarAccess.getFilterSpecAccess().getStatusStatusParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_ruleStatus_in_rule__FilterSpec__StatusAssignment_14_18323);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getStatusStatusParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__StatusAssignment_14_1"


    // $ANTLR start "rule__FilterSpec__StatesAssignment_15_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4112:1: rule__FilterSpec__StatesAssignment_15_1 : ( ruleState ) ;
    public final void rule__FilterSpec__StatesAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4116:1: ( ( ruleState ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4117:1: ( ruleState )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4117:1: ( ruleState )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4118:1: ruleState
            {
             before(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_15_18354);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__StatesAssignment_15_1"


    // $ANTLR start "rule__FilterSpec__StatesAssignment_15_2_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4127:1: rule__FilterSpec__StatesAssignment_15_2_1 : ( ruleState ) ;
    public final void rule__FilterSpec__StatesAssignment_15_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4131:1: ( ( ruleState ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4132:1: ( ruleState )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4132:1: ( ruleState )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4133:1: ruleState
            {
             before(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_2_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_15_2_18385);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getStatesStateParserRuleCall_15_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__StatesAssignment_15_2_1"


    // $ANTLR start "rule__FilterSpec__ExamFlagsAssignment_16_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4142:1: rule__FilterSpec__ExamFlagsAssignment_16_1 : ( ruleTCPFlag ) ;
    public final void rule__FilterSpec__ExamFlagsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4146:1: ( ( ruleTCPFlag ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4147:1: ( ruleTCPFlag )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4147:1: ( ruleTCPFlag )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4148:1: ruleTCPFlag
            {
             before(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_rule__FilterSpec__ExamFlagsAssignment_16_18416);
            ruleTCPFlag();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__ExamFlagsAssignment_16_1"


    // $ANTLR start "rule__FilterSpec__ExamFlagsAssignment_16_2_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4157:1: rule__FilterSpec__ExamFlagsAssignment_16_2_1 : ( ruleTCPFlag ) ;
    public final void rule__FilterSpec__ExamFlagsAssignment_16_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4161:1: ( ( ruleTCPFlag ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4162:1: ( ruleTCPFlag )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4162:1: ( ruleTCPFlag )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4163:1: ruleTCPFlag
            {
             before(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_2_1_0()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_rule__FilterSpec__ExamFlagsAssignment_16_2_18447);
            ruleTCPFlag();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getExamFlagsTCPFlagParserRuleCall_16_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__ExamFlagsAssignment_16_2_1"


    // $ANTLR start "rule__FilterSpec__FlagsAssignment_16_3"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4172:1: rule__FilterSpec__FlagsAssignment_16_3 : ( ruleTCPFlag ) ;
    public final void rule__FilterSpec__FlagsAssignment_16_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4176:1: ( ( ruleTCPFlag ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4177:1: ( ruleTCPFlag )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4177:1: ( ruleTCPFlag )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4178:1: ruleTCPFlag
            {
             before(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_3_0()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_rule__FilterSpec__FlagsAssignment_16_38478);
            ruleTCPFlag();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__FlagsAssignment_16_3"


    // $ANTLR start "rule__FilterSpec__FlagsAssignment_16_4_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4187:1: rule__FilterSpec__FlagsAssignment_16_4_1 : ( ruleTCPFlag ) ;
    public final void rule__FilterSpec__FlagsAssignment_16_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4191:1: ( ( ruleTCPFlag ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4192:1: ( ruleTCPFlag )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4192:1: ( ruleTCPFlag )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4193:1: ruleTCPFlag
            {
             before(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_4_1_0()); 
            pushFollow(FOLLOW_ruleTCPFlag_in_rule__FilterSpec__FlagsAssignment_16_4_18509);
            ruleTCPFlag();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getFlagsTCPFlagParserRuleCall_16_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__FlagsAssignment_16_4_1"


    // $ANTLR start "rule__FilterSpec__TargetAssignment_18"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4202:1: rule__FilterSpec__TargetAssignment_18 : ( ruleTarget ) ;
    public final void rule__FilterSpec__TargetAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4206:1: ( ( ruleTarget ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4207:1: ( ruleTarget )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4207:1: ( ruleTarget )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4208:1: ruleTarget
            {
             before(grammarAccess.getFilterSpecAccess().getTargetTargetParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleTarget_in_rule__FilterSpec__TargetAssignment_188540);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getTargetTargetParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__TargetAssignment_18"


    // $ANTLR start "rule__FilterSpec__LpAssignment_19_1"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4217:1: rule__FilterSpec__LpAssignment_19_1 : ( ruleLP ) ;
    public final void rule__FilterSpec__LpAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4221:1: ( ( ruleLP ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4222:1: ( ruleLP )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4222:1: ( ruleLP )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4223:1: ruleLP
            {
             before(grammarAccess.getFilterSpecAccess().getLpLPParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_ruleLP_in_rule__FilterSpec__LpAssignment_19_18571);
            ruleLP();

            state._fsp--;

             after(grammarAccess.getFilterSpecAccess().getLpLPParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterSpec__LpAssignment_19_1"


    // $ANTLR start "rule__Interface__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4232:1: rule__Interface__NameAssignment : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4236:1: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4237:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4237:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4238:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment8602); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment"


    // $ANTLR start "rule__LP__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4247:1: rule__LP__NameAssignment : ( RULE_STRING ) ;
    public final void rule__LP__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4251:1: ( ( RULE_STRING ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4252:1: ( RULE_STRING )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4252:1: ( RULE_STRING )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4253:1: RULE_STRING
            {
             before(grammarAccess.getLPAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LP__NameAssignment8633); 
             after(grammarAccess.getLPAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LP__NameAssignment"


    // $ANTLR start "rule__Match__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4262:1: rule__Match__NameAssignment : ( ( rule__Match__NameAlternatives_0 ) ) ;
    public final void rule__Match__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4266:1: ( ( ( rule__Match__NameAlternatives_0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4267:1: ( ( rule__Match__NameAlternatives_0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4267:1: ( ( rule__Match__NameAlternatives_0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4268:1: ( rule__Match__NameAlternatives_0 )
            {
             before(grammarAccess.getMatchAccess().getNameAlternatives_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4269:1: ( rule__Match__NameAlternatives_0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4269:2: rule__Match__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__Match__NameAlternatives_0_in_rule__Match__NameAssignment8664);
            rule__Match__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__NameAssignment"


    // $ANTLR start "rule__State__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4278:1: rule__State__NameAssignment : ( ( rule__State__NameAlternatives_0 ) ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4282:1: ( ( ( rule__State__NameAlternatives_0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4283:1: ( ( rule__State__NameAlternatives_0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4283:1: ( ( rule__State__NameAlternatives_0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4284:1: ( rule__State__NameAlternatives_0 )
            {
             before(grammarAccess.getStateAccess().getNameAlternatives_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4285:1: ( rule__State__NameAlternatives_0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4285:2: rule__State__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__State__NameAlternatives_0_in_rule__State__NameAssignment8697);
            rule__State__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__StateFulMatchStates__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4294:1: rule__StateFulMatchStates__NameAssignment : ( ( rule__StateFulMatchStates__NameAlternatives_0 ) ) ;
    public final void rule__StateFulMatchStates__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4298:1: ( ( ( rule__StateFulMatchStates__NameAlternatives_0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4299:1: ( ( rule__StateFulMatchStates__NameAlternatives_0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4299:1: ( ( rule__StateFulMatchStates__NameAlternatives_0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4300:1: ( rule__StateFulMatchStates__NameAlternatives_0 )
            {
             before(grammarAccess.getStateFulMatchStatesAccess().getNameAlternatives_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4301:1: ( rule__StateFulMatchStates__NameAlternatives_0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4301:2: rule__StateFulMatchStates__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__StateFulMatchStates__NameAlternatives_0_in_rule__StateFulMatchStates__NameAssignment8730);
            rule__StateFulMatchStates__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStateFulMatchStatesAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFulMatchStates__NameAssignment"


    // $ANTLR start "rule__NormalMatchStates__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4310:1: rule__NormalMatchStates__NameAssignment : ( ruleNew ) ;
    public final void rule__NormalMatchStates__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4314:1: ( ( ruleNew ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4315:1: ( ruleNew )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4315:1: ( ruleNew )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4316:1: ruleNew
            {
             before(grammarAccess.getNormalMatchStatesAccess().getNameNewParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNew_in_rule__NormalMatchStates__NameAssignment8763);
            ruleNew();

            state._fsp--;

             after(grammarAccess.getNormalMatchStatesAccess().getNameNewParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalMatchStates__NameAssignment"


    // $ANTLR start "rule__TCPFlag__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4325:1: rule__TCPFlag__NameAssignment : ( ( rule__TCPFlag__NameAlternatives_0 ) ) ;
    public final void rule__TCPFlag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4329:1: ( ( ( rule__TCPFlag__NameAlternatives_0 ) ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4330:1: ( ( rule__TCPFlag__NameAlternatives_0 ) )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4330:1: ( ( rule__TCPFlag__NameAlternatives_0 ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4331:1: ( rule__TCPFlag__NameAlternatives_0 )
            {
             before(grammarAccess.getTCPFlagAccess().getNameAlternatives_0()); 
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4332:1: ( rule__TCPFlag__NameAlternatives_0 )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4332:2: rule__TCPFlag__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__TCPFlag__NameAlternatives_0_in_rule__TCPFlag__NameAssignment8794);
            rule__TCPFlag__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTCPFlagAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCPFlag__NameAssignment"


    // $ANTLR start "rule__Chain__ChainNameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4341:1: rule__Chain__ChainNameAssignment : ( RULE_ID ) ;
    public final void rule__Chain__ChainNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4345:1: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4346:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4346:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4347:1: RULE_ID
            {
             before(grammarAccess.getChainAccess().getChainNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chain__ChainNameAssignment8827); 
             after(grammarAccess.getChainAccess().getChainNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__ChainNameAssignment"


    // $ANTLR start "rule__ChainName__NameAssignment"
    // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4357:1: rule__ChainName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ChainName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4361:1: ( ( RULE_ID ) )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4362:1: ( RULE_ID )
            {
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4362:1: ( RULE_ID )
            // ../org.xtext.firewall.iptables.ui/src-gen/org/xtext/example/iptables/ui/contentassist/antlr/internal/InternalIptables.g:4363:1: RULE_ID
            {
             before(grammarAccess.getChainNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChainName__NameAssignment8859); 
             after(grammarAccess.getChainNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainName__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterDeclaration_in_entryRuleFilterDeclaration182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterDeclaration__FilterAssignment_in_ruleFilterDeclaration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilteringSpec_in_entryRuleFilteringSpec242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilteringSpec249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterSpec_in_ruleFilteringSpec275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterSpec_in_entryRuleFilterSpec301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterSpec308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__0_in_ruleFilterSpec334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_in_ruleInterface394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLP_in_entryRuleLP421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLP428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LP__NameAssignment_in_ruleLP454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatch488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__NameAssignment_in_ruleMatch514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_entryRuleDir541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDir548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDir574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatus633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConntrack_in_entryRuleConntrack659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConntrack666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConntrack693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMatch_in_entryRuleStateMatch721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMatch728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStateMatch755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_in_ruleState816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFulMatchStates_in_entryRuleStateFulMatchStates843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFulMatchStates850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFulMatchStates__NameAssignment_in_ruleStateFulMatchStates876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalMatchStates_in_entryRuleNormalMatchStates903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalMatchStates910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalMatchStates__NameAssignment_in_ruleNormalMatchStates936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNew997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoneS_in_entryRuleNoneS1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoneS1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNoneS1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynSent_in_entryRuleSynSent1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynSent1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSynSent1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynRecv_in_entryRuleSynRecv1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSynRecv1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSynRecv1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstablished_in_entryRuleEstablished1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstablished1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEstablished1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinWait_in_entryRuleFinWait1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinWait1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFinWait1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseWait_in_entryRuleCloseWait1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCloseWait1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCloseWait1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastAck_in_entryRuleLastAck1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastAck1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLastAck1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeWait_in_entryRuleTimeWait1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeWait1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTimeWait1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClose_in_entryRuleClose1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClose1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleClose1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_entryRuleTCPFlag1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCPFlag1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TCPFlag__NameAssignment_in_ruleTCPFlag1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyn_in_entryRuleSyn1643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyn1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSyn1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAck_in_entryRuleAck1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAck1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAck1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFin_in_entryRuleFin1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFin1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFin1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRst_in_entryRuleRst1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRst1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRst1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_entryRuleAll1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAll1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAll1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNone_in_entryRuleNone1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNone1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNone1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Alternatives_in_ruleProtocol2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTcp_in_entryRuleTcp2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTcp2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTcp2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUdp_in_entryRuleUdp2137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUdp2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUdp2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcmp_in_entryRuleIcmp2199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIcmp2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIcmp2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_entryRuleTarget2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTarget2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTarget2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChain_in_entryRuleChain2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChain2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chain__ChainNameAssignment_in_ruleChain2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainDeclaration_in_entryRuleChainDeclaration2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChainDeclaration2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__0_in_ruleChainDeclaration2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainName_in_entryRuleChainName2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChainName2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChainName__NameAssignment_in_ruleChainName2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPExpr_in_entryRuleIPExpr2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPExpr2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__0_in_ruleIPExpr2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_entryRuleipByteExpr2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleipByteExpr2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleipByteExpr2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIpRangeExpr_in_entryRuleIpRangeExpr2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIpRangeExpr2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IpRangeExpr__Group__0_in_ruleIpRangeExpr2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DeclarationAssignment_0_in_rule__Rule__Alternatives2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FilterSpec__OptionAlternatives_1_02742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FilterSpec__OptionAlternatives_1_02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FilterSpec__OptionAlternatives_1_02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConntrack_in_rule__Match__NameAlternatives_02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMatch_in_rule__Match__NameAlternatives_02833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalMatchStates_in_rule__State__NameAlternatives_02865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFulMatchStates_in_rule__State__NameAlternatives_02882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoneS_in_rule__StateFulMatchStates__NameAlternatives_02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynSent_in_rule__StateFulMatchStates__NameAlternatives_02931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynRecv_in_rule__StateFulMatchStates__NameAlternatives_02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstablished_in_rule__StateFulMatchStates__NameAlternatives_02965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinWait_in_rule__StateFulMatchStates__NameAlternatives_02982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCloseWait_in_rule__StateFulMatchStates__NameAlternatives_02999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastAck_in_rule__StateFulMatchStates__NameAlternatives_03016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeWait_in_rule__StateFulMatchStates__NameAlternatives_03033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClose_in_rule__StateFulMatchStates__NameAlternatives_03050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyn_in_rule__TCPFlag__NameAlternatives_03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAck_in_rule__TCPFlag__NameAlternatives_03099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFin_in_rule__TCPFlag__NameAlternatives_03116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRst_in_rule__TCPFlag__NameAlternatives_03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_rule__TCPFlag__NameAlternatives_03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNone_in_rule__TCPFlag__NameAlternatives_03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTcp_in_rule__Protocol__Alternatives3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUdp_in_rule__Protocol__Alternatives3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIcmp_in_rule__Protocol__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__0__Impl_in_rule__FilterSpec__Group__03263 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__1_in_rule__FilterSpec__Group__03266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FilterSpec__Group__0__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__1__Impl_in_rule__FilterSpec__Group__13325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__2_in_rule__FilterSpec__Group__13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__OptionAssignment_1_in_rule__FilterSpec__Group__1__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__2__Impl_in_rule__FilterSpec__Group__23385 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__3_in_rule__FilterSpec__Group__23388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__ChainAssignment_2_in_rule__FilterSpec__Group__2__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__3__Impl_in_rule__FilterSpec__Group__33445 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__4_in_rule__FilterSpec__Group__33448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_3__0_in_rule__FilterSpec__Group__3__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__4__Impl_in_rule__FilterSpec__Group__43506 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__5_in_rule__FilterSpec__Group__43509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_4__0_in_rule__FilterSpec__Group__4__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__5__Impl_in_rule__FilterSpec__Group__53567 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__6_in_rule__FilterSpec__Group__53570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_5__0_in_rule__FilterSpec__Group__5__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__6__Impl_in_rule__FilterSpec__Group__63628 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__7_in_rule__FilterSpec__Group__63631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_6__0_in_rule__FilterSpec__Group__6__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__7__Impl_in_rule__FilterSpec__Group__73689 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__8_in_rule__FilterSpec__Group__73692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_7__0_in_rule__FilterSpec__Group__7__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__8__Impl_in_rule__FilterSpec__Group__83750 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__9_in_rule__FilterSpec__Group__83753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_8__0_in_rule__FilterSpec__Group__8__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__9__Impl_in_rule__FilterSpec__Group__93811 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__10_in_rule__FilterSpec__Group__93814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__NegAssignment_9_in_rule__FilterSpec__Group__9__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__10__Impl_in_rule__FilterSpec__Group__103872 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__11_in_rule__FilterSpec__Group__103875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__SynAssignment_10_in_rule__FilterSpec__Group__10__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__11__Impl_in_rule__FilterSpec__Group__113933 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__12_in_rule__FilterSpec__Group__113936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_11__0_in_rule__FilterSpec__Group__11__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__12__Impl_in_rule__FilterSpec__Group__123994 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__13_in_rule__FilterSpec__Group__123997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__0_in_rule__FilterSpec__Group__12__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__13__Impl_in_rule__FilterSpec__Group__134055 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__14_in_rule__FilterSpec__Group__134058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_13__0_in_rule__FilterSpec__Group__13__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__14__Impl_in_rule__FilterSpec__Group__144116 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__15_in_rule__FilterSpec__Group__144119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_14__0_in_rule__FilterSpec__Group__14__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__15__Impl_in_rule__FilterSpec__Group__154177 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__16_in_rule__FilterSpec__Group__154180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__0_in_rule__FilterSpec__Group__15__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__16__Impl_in_rule__FilterSpec__Group__164238 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__17_in_rule__FilterSpec__Group__164241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__0_in_rule__FilterSpec__Group__16__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__17__Impl_in_rule__FilterSpec__Group__174299 = new BitSet(new long[]{0x0061EFF800000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__18_in_rule__FilterSpec__Group__174302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FilterSpec__Group__17__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__18__Impl_in_rule__FilterSpec__Group__184364 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__19_in_rule__FilterSpec__Group__184367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__TargetAssignment_18_in_rule__FilterSpec__Group__18__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group__19__Impl_in_rule__FilterSpec__Group__194424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_19__0_in_rule__FilterSpec__Group__19__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_3__0__Impl_in_rule__FilterSpec__Group_3__04522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_3__1_in_rule__FilterSpec__Group_3__04525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FilterSpec__Group_3__0__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_3__1__Impl_in_rule__FilterSpec__Group_3__14584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__IpAssignment_3_1_in_rule__FilterSpec__Group_3__1__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_4__0__Impl_in_rule__FilterSpec__Group_4__04645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_4__1_in_rule__FilterSpec__Group_4__04648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FilterSpec__Group_4__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_4__1__Impl_in_rule__FilterSpec__Group_4__14707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__InterfaceAssignment_4_1_in_rule__FilterSpec__Group_4__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_5__0__Impl_in_rule__FilterSpec__Group_5__04768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_5__1_in_rule__FilterSpec__Group_5__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FilterSpec__Group_5__0__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_5__1__Impl_in_rule__FilterSpec__Group_5__14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__IpDstAssignment_5_1_in_rule__FilterSpec__Group_5__1__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_6__0__Impl_in_rule__FilterSpec__Group_6__04891 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_6__1_in_rule__FilterSpec__Group_6__04894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FilterSpec__Group_6__0__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_6__1__Impl_in_rule__FilterSpec__Group_6__14953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__ProtocolAssignment_6_1_in_rule__FilterSpec__Group_6__1__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_7__0__Impl_in_rule__FilterSpec__Group_7__05014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_7__1_in_rule__FilterSpec__Group_7__05017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FilterSpec__Group_7__0__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_7__1__Impl_in_rule__FilterSpec__Group_7__15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__SourcePortAssignment_7_1_in_rule__FilterSpec__Group_7__1__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_8__0__Impl_in_rule__FilterSpec__Group_8__05137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_8__1_in_rule__FilterSpec__Group_8__05140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FilterSpec__Group_8__0__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_8__1__Impl_in_rule__FilterSpec__Group_8__15199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__DestinationPortAssignment_8_1_in_rule__FilterSpec__Group_8__1__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_11__0__Impl_in_rule__FilterSpec__Group_11__05260 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_11__1_in_rule__FilterSpec__Group_11__05263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FilterSpec__Group_11__0__Impl5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_11__1__Impl_in_rule__FilterSpec__Group_11__15322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__MatchesAssignment_11_1_in_rule__FilterSpec__Group_11__1__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__0__Impl_in_rule__FilterSpec__Group_12__05383 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__1_in_rule__FilterSpec__Group_12__05386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FilterSpec__Group_12__0__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__1__Impl_in_rule__FilterSpec__Group_12__15445 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__2_in_rule__FilterSpec__Group_12__15448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__StatesAssignment_12_1_in_rule__FilterSpec__Group_12__1__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12__2__Impl_in_rule__FilterSpec__Group_12__25505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12_2__0_in_rule__FilterSpec__Group_12__2__Impl5532 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12_2__0__Impl_in_rule__FilterSpec__Group_12_2__05569 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12_2__1_in_rule__FilterSpec__Group_12_2__05572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FilterSpec__Group_12_2__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_12_2__1__Impl_in_rule__FilterSpec__Group_12_2__15631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__StatesAssignment_12_2_1_in_rule__FilterSpec__Group_12_2__1__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_13__0__Impl_in_rule__FilterSpec__Group_13__05692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_13__1_in_rule__FilterSpec__Group_13__05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FilterSpec__Group_13__0__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_13__1__Impl_in_rule__FilterSpec__Group_13__15754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__DirAssignment_13_1_in_rule__FilterSpec__Group_13__1__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_14__0__Impl_in_rule__FilterSpec__Group_14__05815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_14__1_in_rule__FilterSpec__Group_14__05818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FilterSpec__Group_14__0__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_14__1__Impl_in_rule__FilterSpec__Group_14__15877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__StatusAssignment_14_1_in_rule__FilterSpec__Group_14__1__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__0__Impl_in_rule__FilterSpec__Group_15__05938 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__1_in_rule__FilterSpec__Group_15__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FilterSpec__Group_15__0__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__1__Impl_in_rule__FilterSpec__Group_15__16000 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__2_in_rule__FilterSpec__Group_15__16003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__StatesAssignment_15_1_in_rule__FilterSpec__Group_15__1__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15__2__Impl_in_rule__FilterSpec__Group_15__26060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15_2__0_in_rule__FilterSpec__Group_15__2__Impl6087 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15_2__0__Impl_in_rule__FilterSpec__Group_15_2__06124 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15_2__1_in_rule__FilterSpec__Group_15_2__06127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FilterSpec__Group_15_2__0__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_15_2__1__Impl_in_rule__FilterSpec__Group_15_2__16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__StatesAssignment_15_2_1_in_rule__FilterSpec__Group_15_2__1__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__0__Impl_in_rule__FilterSpec__Group_16__06247 = new BitSet(new long[]{0x000000000F804000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__1_in_rule__FilterSpec__Group_16__06250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FilterSpec__Group_16__0__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__1__Impl_in_rule__FilterSpec__Group_16__16309 = new BitSet(new long[]{0x000010000F804000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__2_in_rule__FilterSpec__Group_16__16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__ExamFlagsAssignment_16_1_in_rule__FilterSpec__Group_16__1__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__2__Impl_in_rule__FilterSpec__Group_16__26369 = new BitSet(new long[]{0x000010000F804000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__3_in_rule__FilterSpec__Group_16__26372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_2__0_in_rule__FilterSpec__Group_16__2__Impl6399 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__3__Impl_in_rule__FilterSpec__Group_16__36430 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__4_in_rule__FilterSpec__Group_16__36433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__FlagsAssignment_16_3_in_rule__FilterSpec__Group_16__3__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16__4__Impl_in_rule__FilterSpec__Group_16__46490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_4__0_in_rule__FilterSpec__Group_16__4__Impl6517 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_2__0__Impl_in_rule__FilterSpec__Group_16_2__06558 = new BitSet(new long[]{0x000000000F804000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_2__1_in_rule__FilterSpec__Group_16_2__06561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FilterSpec__Group_16_2__0__Impl6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_2__1__Impl_in_rule__FilterSpec__Group_16_2__16620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__ExamFlagsAssignment_16_2_1_in_rule__FilterSpec__Group_16_2__1__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_4__0__Impl_in_rule__FilterSpec__Group_16_4__06681 = new BitSet(new long[]{0x000000000F804000L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_4__1_in_rule__FilterSpec__Group_16_4__06684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FilterSpec__Group_16_4__0__Impl6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_16_4__1__Impl_in_rule__FilterSpec__Group_16_4__16743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__FlagsAssignment_16_4_1_in_rule__FilterSpec__Group_16_4__1__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_19__0__Impl_in_rule__FilterSpec__Group_19__06804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_19__1_in_rule__FilterSpec__Group_19__06807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FilterSpec__Group_19__0__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__Group_19__1__Impl_in_rule__FilterSpec__Group_19__16866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__LpAssignment_19_1_in_rule__FilterSpec__Group_19__1__Impl6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__0__Impl_in_rule__ChainDeclaration__Group__06927 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__1_in_rule__ChainDeclaration__Group__06930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ChainDeclaration__Group__0__Impl6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__1__Impl_in_rule__ChainDeclaration__Group__16989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__2_in_rule__ChainDeclaration__Group__16992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ChainDeclaration__Group__1__Impl7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChainDeclaration__Group__2__Impl_in_rule__ChainDeclaration__Group__27051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainName_in_rule__ChainDeclaration__Group__2__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__0__Impl_in_rule__IPExpr__Group__07113 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__1_in_rule__IPExpr__Group__07116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__0__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__1__Impl_in_rule__IPExpr__Group__17172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__2_in_rule__IPExpr__Group__17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IPExpr__Group__1__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__2__Impl_in_rule__IPExpr__Group__27234 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__3_in_rule__IPExpr__Group__27237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__2__Impl7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__3__Impl_in_rule__IPExpr__Group__37293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__4_in_rule__IPExpr__Group__37296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IPExpr__Group__3__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__4__Impl_in_rule__IPExpr__Group__47355 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__5_in_rule__IPExpr__Group__47358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__4__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__5__Impl_in_rule__IPExpr__Group__57414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__6_in_rule__IPExpr__Group__57417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IPExpr__Group__5__Impl7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__6__Impl_in_rule__IPExpr__Group__67476 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__7_in_rule__IPExpr__Group__67479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleipByteExpr_in_rule__IPExpr__Group__6__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IPExpr__Group__7__Impl_in_rule__IPExpr__Group__77535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIpRangeExpr_in_rule__IPExpr__Group__7__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IpRangeExpr__Group__0__Impl_in_rule__IpRangeExpr__Group__07610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IpRangeExpr__Group__1_in_rule__IpRangeExpr__Group__07613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__IpRangeExpr__Group__0__Impl7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IpRangeExpr__Group__1__Impl_in_rule__IpRangeExpr__Group__17672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IpRangeExpr__Group__1__Impl7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChainDeclaration_in_rule__Rule__DeclarationAssignment_07768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterDeclaration_in_rule__Rule__FilterAssignment_17799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilteringSpec_in_rule__FilterDeclaration__FilterAssignment7830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FilterSpec__OptionAlternatives_1_0_in_rule__FilterSpec__OptionAssignment_17861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChain_in_rule__FilterSpec__ChainAssignment_27894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPExpr_in_rule__FilterSpec__IpAssignment_3_17925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__FilterSpec__InterfaceAssignment_4_17956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPExpr_in_rule__FilterSpec__IpDstAssignment_5_17987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rule__FilterSpec__ProtocolAssignment_6_18018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FilterSpec__SourcePortAssignment_7_18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FilterSpec__DestinationPortAssignment_8_18080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FilterSpec__NegAssignment_98116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FilterSpec__SynAssignment_108160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatch_in_rule__FilterSpec__MatchesAssignment_11_18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_12_18230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_12_2_18261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_rule__FilterSpec__DirAssignment_13_18292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__FilterSpec__StatusAssignment_14_18323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_15_18354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__FilterSpec__StatesAssignment_15_2_18385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_rule__FilterSpec__ExamFlagsAssignment_16_18416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_rule__FilterSpec__ExamFlagsAssignment_16_2_18447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_rule__FilterSpec__FlagsAssignment_16_38478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCPFlag_in_rule__FilterSpec__FlagsAssignment_16_4_18509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTarget_in_rule__FilterSpec__TargetAssignment_188540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLP_in_rule__FilterSpec__LpAssignment_19_18571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LP__NameAssignment8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Match__NameAlternatives_0_in_rule__Match__NameAssignment8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAlternatives_0_in_rule__State__NameAssignment8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFulMatchStates__NameAlternatives_0_in_rule__StateFulMatchStates__NameAssignment8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_rule__NormalMatchStates__NameAssignment8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TCPFlag__NameAlternatives_0_in_rule__TCPFlag__NameAssignment8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chain__ChainNameAssignment8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChainName__NameAssignment8859 = new BitSet(new long[]{0x0000000000000002L});

}