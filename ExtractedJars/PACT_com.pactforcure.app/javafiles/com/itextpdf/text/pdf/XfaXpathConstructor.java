// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.security.XpathConstructor;

public class XfaXpathConstructor
	implements XpathConstructor
{
	public static final class XdpPackage extends Enum
	{

		public static XdpPackage valueOf(String s)
		{
			return (XdpPackage)Enum.valueOf(com/itextpdf/text/pdf/XfaXpathConstructor$XdpPackage, s);
		//    0    0:ldc1            #2   <Class XfaXpathConstructor$XdpPackage>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class XfaXpathConstructor$XdpPackage>
		//    4    9:areturn         
		}

		public static XdpPackage[] values()
		{
			return (XdpPackage[])((XdpPackage []) ($VALUES)).clone();
		//    0    0:getstatic       #63  <Field XfaXpathConstructor$XdpPackage[] $VALUES>
		//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.itextpdf.text.pdf.XfaXpathConstructor$XdpPackage_3B_.clone()>
		//    2    6:checkcast       #74  <Class XfaXpathConstructor$XdpPackage[]>
		//    3    9:areturn         
		}

		private static final XdpPackage $VALUES[];
		public static final XdpPackage Config;
		public static final XdpPackage ConnectionSet;
		public static final XdpPackage Datasets;
		public static final XdpPackage LocaleSet;
		public static final XdpPackage Pdf;
		public static final XdpPackage SourceSet;
		public static final XdpPackage Stylesheet;
		public static final XdpPackage Template;
		public static final XdpPackage Xdc;
		public static final XdpPackage Xfdf;
		public static final XdpPackage Xmpmeta;

		static 
		{
			Config = new XdpPackage("Config", 0);
		//    0    0:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "Config">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//    5   10:putstatic       #31  <Field XfaXpathConstructor$XdpPackage Config>
			ConnectionSet = new XdpPackage("ConnectionSet", 1);
		//    6   13:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "ConnectionSet">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   11   23:putstatic       #34  <Field XfaXpathConstructor$XdpPackage ConnectionSet>
			Datasets = new XdpPackage("Datasets", 2);
		//   12   26:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   13   29:dup             
		//   14   30:ldc1            #35  <String "Datasets">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   17   36:putstatic       #37  <Field XfaXpathConstructor$XdpPackage Datasets>
			LocaleSet = new XdpPackage("LocaleSet", 3);
		//   18   39:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   19   42:dup             
		//   20   43:ldc1            #38  <String "LocaleSet">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   23   49:putstatic       #40  <Field XfaXpathConstructor$XdpPackage LocaleSet>
			Pdf = new XdpPackage("Pdf", 4);
		//   24   52:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   25   55:dup             
		//   26   56:ldc1            #41  <String "Pdf">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   29   62:putstatic       #43  <Field XfaXpathConstructor$XdpPackage Pdf>
			SourceSet = new XdpPackage("SourceSet", 5);
		//   30   65:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   31   68:dup             
		//   32   69:ldc1            #44  <String "SourceSet">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   35   75:putstatic       #46  <Field XfaXpathConstructor$XdpPackage SourceSet>
			Stylesheet = new XdpPackage("Stylesheet", 6);
		//   36   78:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   37   81:dup             
		//   38   82:ldc1            #47  <String "Stylesheet">
		//   39   84:bipush          6
		//   40   86:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   41   89:putstatic       #49  <Field XfaXpathConstructor$XdpPackage Stylesheet>
			Template = new XdpPackage("Template", 7);
		//   42   92:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   43   95:dup             
		//   44   96:ldc1            #50  <String "Template">
		//   45   98:bipush          7
		//   46  100:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   47  103:putstatic       #52  <Field XfaXpathConstructor$XdpPackage Template>
			Xdc = new XdpPackage("Xdc", 8);
		//   48  106:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   49  109:dup             
		//   50  110:ldc1            #53  <String "Xdc">
		//   51  112:bipush          8
		//   52  114:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   53  117:putstatic       #55  <Field XfaXpathConstructor$XdpPackage Xdc>
			Xfdf = new XdpPackage("Xfdf", 9);
		//   54  120:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   55  123:dup             
		//   56  124:ldc1            #56  <String "Xfdf">
		//   57  126:bipush          9
		//   58  128:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   59  131:putstatic       #58  <Field XfaXpathConstructor$XdpPackage Xfdf>
			Xmpmeta = new XdpPackage("Xmpmeta", 10);
		//   60  134:new             #2   <Class XfaXpathConstructor$XdpPackage>
		//   61  137:dup             
		//   62  138:ldc1            #59  <String "Xmpmeta">
		//   63  140:bipush          10
		//   64  142:invokespecial   #29  <Method void XfaXpathConstructor$XdpPackage(String, int)>
		//   65  145:putstatic       #61  <Field XfaXpathConstructor$XdpPackage Xmpmeta>
			$VALUES = (new XdpPackage[] {
				Config, ConnectionSet, Datasets, LocaleSet, Pdf, SourceSet, Stylesheet, Template, Xdc, Xfdf, 
				Xmpmeta
			});
		//   66  148:bipush          11
		//   67  150:anewarray       XdpPackage[]
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

		private XdpPackage(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #65  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public XfaXpathConstructor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		CONFIG = "config";
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <String "config">
	//    4    7:putfield        #32  <Field String CONFIG>
		CONNECTIONSET = "connectionSet";
	//    5   10:aload_0         
	//    6   11:ldc1            #34  <String "connectionSet">
	//    7   13:putfield        #36  <Field String CONNECTIONSET>
		DATASETS = "datasets";
	//    8   16:aload_0         
	//    9   17:ldc1            #38  <String "datasets">
	//   10   19:putfield        #40  <Field String DATASETS>
		LOCALESET = "localeSet";
	//   11   22:aload_0         
	//   12   23:ldc1            #42  <String "localeSet">
	//   13   25:putfield        #44  <Field String LOCALESET>
		PDF = "pdf";
	//   14   28:aload_0         
	//   15   29:ldc1            #46  <String "pdf">
	//   16   31:putfield        #48  <Field String PDF>
		SOURCESET = "sourceSet";
	//   17   34:aload_0         
	//   18   35:ldc1            #50  <String "sourceSet">
	//   19   37:putfield        #52  <Field String SOURCESET>
		STYLESHEET = "stylesheet";
	//   20   40:aload_0         
	//   21   41:ldc1            #54  <String "stylesheet">
	//   22   43:putfield        #56  <Field String STYLESHEET>
		TEMPLATE = "template";
	//   23   46:aload_0         
	//   24   47:ldc1            #58  <String "template">
	//   25   49:putfield        #60  <Field String TEMPLATE>
		XDC = "xdc";
	//   26   52:aload_0         
	//   27   53:ldc1            #62  <String "xdc">
	//   28   55:putfield        #64  <Field String XDC>
		XFDF = "xfdf";
	//   29   58:aload_0         
	//   30   59:ldc1            #66  <String "xfdf">
	//   31   61:putfield        #68  <Field String XFDF>
		XMPMETA = "xmpmeta";
	//   32   64:aload_0         
	//   33   65:ldc1            #70  <String "xmpmeta">
	//   34   67:putfield        #72  <Field String XMPMETA>
		xpathExpression = "";
	//   35   70:aload_0         
	//   36   71:ldc1            #74  <String "">
	//   37   73:putfield        #76  <Field String xpathExpression>
	//   38   76:return          
	}

	public XfaXpathConstructor(XdpPackage xdppackage)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		CONFIG = "config";
	//    2    4:aload_0         
	//    3    5:ldc1            #30  <String "config">
	//    4    7:putfield        #32  <Field String CONFIG>
		CONNECTIONSET = "connectionSet";
	//    5   10:aload_0         
	//    6   11:ldc1            #34  <String "connectionSet">
	//    7   13:putfield        #36  <Field String CONNECTIONSET>
		DATASETS = "datasets";
	//    8   16:aload_0         
	//    9   17:ldc1            #38  <String "datasets">
	//   10   19:putfield        #40  <Field String DATASETS>
		LOCALESET = "localeSet";
	//   11   22:aload_0         
	//   12   23:ldc1            #42  <String "localeSet">
	//   13   25:putfield        #44  <Field String LOCALESET>
		PDF = "pdf";
	//   14   28:aload_0         
	//   15   29:ldc1            #46  <String "pdf">
	//   16   31:putfield        #48  <Field String PDF>
		SOURCESET = "sourceSet";
	//   17   34:aload_0         
	//   18   35:ldc1            #50  <String "sourceSet">
	//   19   37:putfield        #52  <Field String SOURCESET>
		STYLESHEET = "stylesheet";
	//   20   40:aload_0         
	//   21   41:ldc1            #54  <String "stylesheet">
	//   22   43:putfield        #56  <Field String STYLESHEET>
		TEMPLATE = "template";
	//   23   46:aload_0         
	//   24   47:ldc1            #58  <String "template">
	//   25   49:putfield        #60  <Field String TEMPLATE>
		XDC = "xdc";
	//   26   52:aload_0         
	//   27   53:ldc1            #62  <String "xdc">
	//   28   55:putfield        #64  <Field String XDC>
		XFDF = "xfdf";
	//   29   58:aload_0         
	//   30   59:ldc1            #66  <String "xfdf">
	//   31   61:putfield        #68  <Field String XFDF>
		XMPMETA = "xmpmeta";
	//   32   64:aload_0         
	//   33   65:ldc1            #70  <String "xmpmeta">
	//   34   67:putfield        #72  <Field String XMPMETA>
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage = new int[XdpPackage.values().length];
			//    0    0:invokestatic    #18  <Method XfaXpathConstructor$XdpPackage[] XfaXpathConstructor$XdpPackage.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Config.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//    5   12:getstatic       #24  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Config>
			//    6   15:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  10   23:getstatic       #31  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.ConnectionSet>
			//*  11   26:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  15   34:getstatic       #34  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Datasets>
			//*  16   37:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  20   45:getstatic       #37  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.LocaleSet>
			//*  21   48:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  25   56:getstatic       #40  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Pdf>
			//*  26   59:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  30   67:getstatic       #43  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.SourceSet>
			//*  31   70:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  35   79:getstatic       #46  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Stylesheet>
			//*  36   82:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  40   91:getstatic       #49  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Template>
			//*  41   94:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  45  103:getstatic       #52  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Xdc>
			//*  46  106:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  50  115:getstatic       #55  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Xfdf>
			//*  51  118:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  52  121:bipush          10
			//*  53  123:iastore         
			//*  54  124:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
			//*  55  127:getstatic       #58  <Field XfaXpathConstructor$XdpPackage XfaXpathConstructor$XdpPackage.Xmpmeta>
			//*  56  130:invokevirtual   #28  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
			//*  57  133:bipush          11
			//*  58  135:iastore         
			//*  59  136:return          
			//*  60  137:astore_0        
			//*  61  138:return          
			//*  62  139:astore_0        
			//*  63  140:goto            124
			//*  64  143:astore_0        
			//*  65  144:goto            112
			//*  66  147:astore_0        
			//*  67  148:goto            100
			//*  68  151:astore_0        
			//*  69  152:goto            88
			//*  70  155:astore_0        
			//*  71  156:goto            76
			//*  72  159:astore_0        
			//*  73  160:goto            64
			//*  74  163:astore_0        
			//*  75  164:goto            53
			//*  76  167:astore_0        
			//*  77  168:goto            42
			//*  78  171:astore_0        
			//*  79  172:goto            31
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   80  175:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.ConnectionSet.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror9) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Datasets.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.LocaleSet.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Pdf.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.SourceSet.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Stylesheet.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Template.ordinal()] = 8;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Xdc.ordinal()] = 9;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Xfdf.ordinal()] = 10;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage[XdpPackage.Xmpmeta.ordinal()] = 11;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  81  176:goto            20
			}
		}

		_cls1..SwitchMap.com.itextpdf.text.pdf.XfaXpathConstructor.XdpPackage[xdppackage.ordinal()];
	//   35   70:getstatic       #82  <Field int[] XfaXpathConstructor$1.$SwitchMap$com$itextpdf$text$pdf$XfaXpathConstructor$XdpPackage>
	//   36   73:aload_1         
	//   37   74:invokevirtual   #86  <Method int XfaXpathConstructor$XdpPackage.ordinal()>
	//   38   77:iaload          
		JVM INSTR tableswitch 1 11: default 136
	//	               1 143
	//	               2 178
	//	               3 184
	//	               4 190
	//	               5 196
	//	               6 202
	//	               7 208
	//	               8 214
	//	               9 220
	//	               10 226
	//	               11 232;
	//   39   78:tableswitch     1 11: default 136
	//	               1 143
	//	               2 178
	//	               3 184
	//	               4 190
	//	               5 196
	//	               6 202
	//	               7 208
	//	               8 214
	//	               9 220
	//	               10 226
	//	               11 232
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
		xpathExpression = "";
	//   40  136:aload_0         
	//   41  137:ldc1            #74  <String "">
	//   42  139:putfield        #76  <Field String xpathExpression>
		return;
	//   43  142:return          
_L2:
		xdppackage = "config";
	//   44  143:ldc1            #30  <String "config">
	//   45  145:astore_1        
_L14:
		StringBuilder stringbuilder = new StringBuilder("/xdp:xdp/*[local-name()='");
	//   46  146:new             #88  <Class StringBuilder>
	//   47  149:dup             
	//   48  150:ldc1            #90  <String "/xdp:xdp/*[local-name()='">
	//   49  152:invokespecial   #93  <Method void StringBuilder(String)>
	//   50  155:astore_2        
		stringbuilder.append(((String) (xdppackage)));
	//   51  156:aload_2         
	//   52  157:aload_1         
	//   53  158:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   54  161:pop             
		stringbuilder.append("']");
	//   55  162:aload_2         
	//   56  163:ldc1            #99  <String "']">
	//   57  165:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   58  168:pop             
		xpathExpression = stringbuilder.toString();
	//   59  169:aload_0         
	//   60  170:aload_2         
	//   61  171:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   62  174:putfield        #76  <Field String xpathExpression>
		return;
	//   63  177:return          
_L3:
		xdppackage = "connectionSet";
	//   64  178:ldc1            #34  <String "connectionSet">
	//   65  180:astore_1        
		continue; /* Loop/switch isn't completed */
	//   66  181:goto            146
_L4:
		xdppackage = "datasets";
	//   67  184:ldc1            #38  <String "datasets">
	//   68  186:astore_1        
		continue; /* Loop/switch isn't completed */
	//   69  187:goto            146
_L5:
		xdppackage = "localeSet";
	//   70  190:ldc1            #42  <String "localeSet">
	//   71  192:astore_1        
		continue; /* Loop/switch isn't completed */
	//   72  193:goto            146
_L6:
		xdppackage = "pdf";
	//   73  196:ldc1            #46  <String "pdf">
	//   74  198:astore_1        
		continue; /* Loop/switch isn't completed */
	//   75  199:goto            146
_L7:
		xdppackage = "sourceSet";
	//   76  202:ldc1            #50  <String "sourceSet">
	//   77  204:astore_1        
		continue; /* Loop/switch isn't completed */
	//   78  205:goto            146
_L8:
		xdppackage = "stylesheet";
	//   79  208:ldc1            #54  <String "stylesheet">
	//   80  210:astore_1        
		continue; /* Loop/switch isn't completed */
	//   81  211:goto            146
_L9:
		xdppackage = "template";
	//   82  214:ldc1            #58  <String "template">
	//   83  216:astore_1        
		continue; /* Loop/switch isn't completed */
	//   84  217:goto            146
_L10:
		xdppackage = "xdc";
	//   85  220:ldc1            #62  <String "xdc">
	//   86  222:astore_1        
		continue; /* Loop/switch isn't completed */
	//   87  223:goto            146
_L11:
		xdppackage = "xfdf";
	//   88  226:ldc1            #66  <String "xfdf">
	//   89  228:astore_1        
		continue; /* Loop/switch isn't completed */
	//   90  229:goto            146
_L12:
		xdppackage = "xmpmeta";
	//   91  232:ldc1            #70  <String "xmpmeta">
	//   92  234:astore_1        
		if(true) goto _L14; else goto _L13
	//   93  235:goto            146
_L13:
	}

	public String getXpathExpression()
	{
		return xpathExpression;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String xpathExpression>
	//    2    4:areturn         
	}

	private final String CONFIG;
	private final String CONNECTIONSET;
	private final String DATASETS;
	private final String LOCALESET;
	private final String PDF;
	private final String SOURCESET;
	private final String STYLESHEET;
	private final String TEMPLATE;
	private final String XDC;
	private final String XFDF;
	private final String XMPMETA;
	private String xpathExpression;
}
