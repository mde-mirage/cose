<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="iptables2network"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchfilterSpec2Connection():V"/>
		<constant value="A.__matchiptablesState2NetworkState():V"/>
		<constant value="__exec__"/>
		<constant value="filterSpec2Connection"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyfilterSpec2Connection(NTransientLink;):V"/>
		<constant value="iptablesState2NetworkState"/>
		<constant value="A.__applyiptablesState2NetworkState(NTransientLink;):V"/>
		<constant value="__matchfilterSpec2Connection"/>
		<constant value="FilterSpec"/>
		<constant value="Iptables"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Connection"/>
		<constant value="Network"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-17:4"/>
		<constant value="__applyfilterSpec2Connection"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="target"/>
		<constant value="ACCEPT"/>
		<constant value="J.=(J):J"/>
		<constant value="23"/>
		<constant value="EnumLiteral"/>
		<constant value="deny"/>
		<constant value="29"/>
		<constant value="allow"/>
		<constant value="kind"/>
		<constant value="destinationPort"/>
		<constant value="service"/>
		<constant value="states"/>
		<constant value="flags"/>
		<constant value="4"/>
		<constant value="J.iptablesFlag2NetworkFlag(J):J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="setFlags"/>
		<constant value="examFlags"/>
		<constant value="unsetFlags"/>
		<constant value="12:15-12:16"/>
		<constant value="12:15-12:23"/>
		<constant value="12:26-12:34"/>
		<constant value="12:15-12:34"/>
		<constant value="12:52-12:57"/>
		<constant value="12:40-12:46"/>
		<constant value="12:12-12:63"/>
		<constant value="12:4-12:63"/>
		<constant value="13:15-13:16"/>
		<constant value="13:15-13:32"/>
		<constant value="13:4-13:32"/>
		<constant value="14:14-14:15"/>
		<constant value="14:14-14:22"/>
		<constant value="14:4-14:22"/>
		<constant value="15:16-15:17"/>
		<constant value="15:16-15:23"/>
		<constant value="15:35-15:45"/>
		<constant value="15:71-15:72"/>
		<constant value="15:35-15:73"/>
		<constant value="15:16-15:74"/>
		<constant value="15:4-15:74"/>
		<constant value="16:18-16:19"/>
		<constant value="16:18-16:29"/>
		<constant value="16:42-16:52"/>
		<constant value="16:78-16:79"/>
		<constant value="16:42-16:80"/>
		<constant value="16:18-16:81"/>
		<constant value="16:4-16:81"/>
		<constant value="link"/>
		<constant value="__matchiptablesState2NetworkState"/>
		<constant value="State"/>
		<constant value="24:3-26:4"/>
		<constant value="__applyiptablesState2NetworkState"/>
		<constant value="25:12-25:13"/>
		<constant value="25:12-25:18"/>
		<constant value="25:4-25:18"/>
		<constant value="iptablesFlag2NetworkFlag"/>
		<constant value="MIptables!TCPFlag;"/>
		<constant value="Flag"/>
		<constant value="34:12-34:13"/>
		<constant value="34:12-34:18"/>
		<constant value="34:4-34:18"/>
		<constant value="33:3-35:4"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="49"/>
			<push arg="50"/>
			<findme/>
			<push arg="51"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<push arg="58"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="62" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="55" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="55"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="68"/>
			<push arg="69"/>
			<call arg="70"/>
			<if arg="71"/>
			<push arg="72"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="73"/>
			<set arg="38"/>
			<goto arg="74"/>
			<push arg="72"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="75"/>
			<set arg="38"/>
			<call arg="30"/>
			<set arg="76"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="77"/>
			<call arg="30"/>
			<set arg="78"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="79"/>
			<call arg="30"/>
			<set arg="79"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="80"/>
			<iterate/>
			<store arg="81"/>
			<getasm/>
			<load arg="81"/>
			<call arg="82"/>
			<call arg="83"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="84"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="85"/>
			<iterate/>
			<store arg="81"/>
			<getasm/>
			<load arg="81"/>
			<call arg="82"/>
			<call arg="83"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="86"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="87" begin="11" end="11"/>
			<lne id="88" begin="11" end="12"/>
			<lne id="89" begin="13" end="13"/>
			<lne id="90" begin="11" end="14"/>
			<lne id="91" begin="16" end="21"/>
			<lne id="92" begin="23" end="28"/>
			<lne id="93" begin="11" end="28"/>
			<lne id="94" begin="9" end="30"/>
			<lne id="95" begin="33" end="33"/>
			<lne id="96" begin="33" end="34"/>
			<lne id="97" begin="31" end="36"/>
			<lne id="98" begin="39" end="39"/>
			<lne id="99" begin="39" end="40"/>
			<lne id="100" begin="37" end="42"/>
			<lne id="101" begin="48" end="48"/>
			<lne id="102" begin="48" end="49"/>
			<lne id="103" begin="52" end="52"/>
			<lne id="104" begin="53" end="53"/>
			<lne id="105" begin="52" end="54"/>
			<lne id="106" begin="45" end="56"/>
			<lne id="107" begin="43" end="58"/>
			<lne id="108" begin="64" end="64"/>
			<lne id="109" begin="64" end="65"/>
			<lne id="110" begin="68" end="68"/>
			<lne id="111" begin="69" end="69"/>
			<lne id="112" begin="68" end="70"/>
			<lne id="113" begin="61" end="72"/>
			<lne id="114" begin="59" end="74"/>
			<lne id="62" begin="8" end="75"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="33" begin="51" end="55"/>
			<lve slot="4" name="33" begin="67" end="71"/>
			<lve slot="3" name="57" begin="7" end="75"/>
			<lve slot="2" name="55" begin="3" end="75"/>
			<lve slot="0" name="17" begin="0" end="75"/>
			<lve slot="1" name="115" begin="0" end="75"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="117"/>
			<push arg="50"/>
			<findme/>
			<push arg="51"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<push arg="117"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="118" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="55" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="119">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="55"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="120" begin="11" end="11"/>
			<lne id="121" begin="11" end="12"/>
			<lne id="122" begin="9" end="14"/>
			<lne id="118" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="57" begin="7" end="15"/>
			<lve slot="2" name="55" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="115" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="123">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="124"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="123"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<push arg="125"/>
			<push arg="59"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="60"/>
			<pushf/>
			<pcall arg="61"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="126" begin="25" end="25"/>
			<lne id="127" begin="25" end="26"/>
			<lne id="128" begin="23" end="28"/>
			<lne id="129" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="57" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="55" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
