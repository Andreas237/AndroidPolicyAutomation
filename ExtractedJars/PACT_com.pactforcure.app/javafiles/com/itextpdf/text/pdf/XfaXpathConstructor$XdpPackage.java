// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			XfaXpathConstructor

public static final class XfaXpathConstructor$XdpPackage extends Enum
{

	public static XfaXpathConstructor$XdpPackage valueOf(String s)
	{
		return (XfaXpathConstructor$XdpPackage)Enum.valueOf(com/itextpdf/text/pdf/XfaXpathConstructor$XdpPackage, s);
	//    0    0:ldc1            #2   <Class XfaXpathConstructor$XdpPackage>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class XfaXpathConstructor$XdpPackage>
	//    4    9:areturn         
	}

	public static XfaXpathConstructor$XdpPackage[] values()
	{
		return (XfaXpathConstructor$XdpPackage[])((XfaXpathConstructor$XdpPackage []) ($VALUES)).clone();
	//    0    0:getstatic       #63  <Field XfaXpathConstructor$XdpPackage[] $VALUES>
	//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.itextpdf.text.pdf.XfaXpathConstructor$XdpPackage_3B_.clone()>
	//    2    6:checkcast       #74  <Class XfaXpathConstructor$XdpPackage[]>
	//    3    9:areturn         
	}

	private static final XfaXpathConstructor$XdpPackage $VALUES[];
	public static final XfaXpathConstructor$XdpPackage Config;
	public static final XfaXpathConstructor$XdpPackage ConnectionSet;
	public static final XfaXpathConstructor$XdpPackage Datasets;
	public static final XfaXpathConstructor$XdpPackage LocaleSet;
	public static final XfaXpathConstructor$XdpPackage Pdf;
	public static final XfaXpathConstructor$XdpPackage SourceSet;
	public static final XfaXpathConstructor$XdpPackage Stylesheet;
	public static final XfaXpathConstructor$XdpPackage Template;
	public static final XfaXpathConstructor$XdpPackage Xdc;
	public static final XfaXpathConstructor$XdpPackage Xfdf;
	public static final XfaXpathConstructor$XdpPackage Xmpmeta;

	static 
	{
		Config = new XfaXpathConstructor$XdpPackage("Config", 0);
	//    0    0:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "Config">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//    5   10:putstatic       #31  <Field XfaXpathConstructor$XdpPackage Config>
		ConnectionSet = new XfaXpathConstructor$XdpPackage("ConnectionSet", 1);
	//    6   13:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "ConnectionSet">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   11   23:putstatic       #34  <Field XfaXpathConstructor$XdpPackage ConnectionSet>
		Datasets = new XfaXpathConstructor$XdpPackage("Datasets", 2);
	//   12   26:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   13   29:dup             
	//   14   30:ldc1            #35  <String "Datasets">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   17   36:putstatic       #37  <Field XfaXpathConstructor$XdpPackage Datasets>
		LocaleSet = new XfaXpathConstructor$XdpPackage("LocaleSet", 3);
	//   18   39:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   19   42:dup             
	//   20   43:ldc1            #38  <String "LocaleSet">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   23   49:putstatic       #40  <Field XfaXpathConstructor$XdpPackage LocaleSet>
		Pdf = new XfaXpathConstructor$XdpPackage("Pdf", 4);
	//   24   52:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   25   55:dup             
	//   26   56:ldc1            #41  <String "Pdf">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   29   62:putstatic       #43  <Field XfaXpathConstructor$XdpPackage Pdf>
		SourceSet = new XfaXpathConstructor$XdpPackage("SourceSet", 5);
	//   30   65:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "SourceSet">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   35   75:putstatic       #46  <Field XfaXpathConstructor$XdpPackage SourceSet>
		Stylesheet = new XfaXpathConstructor$XdpPackage("Stylesheet", 6);
	//   36   78:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   37   81:dup             
	//   38   82:ldc1            #47  <String "Stylesheet">
	//   39   84:bipush          6
	//   40   86:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   41   89:putstatic       #49  <Field XfaXpathConstructor$XdpPackage Stylesheet>
		Template = new XfaXpathConstructor$XdpPackage("Template", 7);
	//   42   92:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   43   95:dup             
	//   44   96:ldc1            #50  <String "Template">
	//   45   98:bipush          7
	//   46  100:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   47  103:putstatic       #52  <Field XfaXpathConstructor$XdpPackage Template>
		Xdc = new XfaXpathConstructor$XdpPackage("Xdc", 8);
	//   48  106:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   49  109:dup             
	//   50  110:ldc1            #53  <String "Xdc">
	//   51  112:bipush          8
	//   52  114:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   53  117:putstatic       #55  <Field XfaXpathConstructor$XdpPackage Xdc>
		Xfdf = new XfaXpathConstructor$XdpPackage("Xfdf", 9);
	//   54  120:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   55  123:dup             
	//   56  124:ldc1            #56  <String "Xfdf">
	//   57  126:bipush          9
	//   58  128:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   59  131:putstatic       #58  <Field XfaXpathConstructor$XdpPackage Xfdf>
		Xmpmeta = new XfaXpathConstructor$XdpPackage("Xmpmeta", 10);
	//   60  134:new             #2   <Class XfaXpathConstructor$XdpPackage>
	//   61  137:dup             
	//   62  138:ldc1            #59  <String "Xmpmeta">
	//   63  140:bipush          10
	//   64  142:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
	//   65  145:putstatic       #61  <Field XfaXpathConstructor$XdpPackage Xmpmeta>
		$VALUES = (new XfaXpathConstructor$XdpPackage[] {
			Config, ConnectionSet, Datasets, LocaleSet, Pdf, SourceSet, Stylesheet, Template, Xdc, Xfdf, 
			Xmpmeta
		});
	//   66  148:bipush          11
	//   67  150:anewarray       XfaXpathConstructor$XdpPackage[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #31  <Field XfaXpathConstructor$XdpPackage Config>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #34  <Field XfaXpathConstructor$XdpPackage ConnectionSet>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #37  <Field XfaXpathConstructor$XdpPackage Datasets>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #40  <Field XfaXpathConstructor$XdpPackage LocaleSet>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #43  <Field XfaXpathConstructor$XdpPackage Pdf>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #46  <Field XfaXpathConstructor$XdpPackage SourceSet>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #49  <Field XfaXpathConstructor$XdpPackage Stylesheet>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #52  <Field XfaXpathConstructor$XdpPackage Template>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #55  <Field XfaXpathConstructor$XdpPackage Xdc>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #58  <Field XfaXpathConstructor$XdpPackage Xfdf>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #61  <Field XfaXpathConstructor$XdpPackage Xmpmeta>
	//  111  223:aastore         
	//  112  224:putstatic       #63  <Field XfaXpathConstructor$XdpPackage[] $VALUES>
	//* 113  227:return          
	}

	private XfaXpathConstructor$XdpPackage(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
