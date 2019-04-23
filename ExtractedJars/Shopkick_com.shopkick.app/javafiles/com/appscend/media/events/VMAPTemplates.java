// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.appscend.media.events:
//			APSVastAdBreak

public class VMAPTemplates
{

	public VMAPTemplates()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	public static String getVMAPForAdBreakArrayList(ArrayList arraylist)
	{
		String s = "";
	//    0    0:ldc1            #52  <String "">
	//    1    2:astore_1        
		for(Iterator iterator = arraylist.iterator(); iterator.hasNext();)
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #58  <Method Iterator ArrayList.iterator()>
	//*   4    7:astore_2        
	//*   5    8:aload_2         
	//*   6    9:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   7   14:ifeq            276
		{
			Object obj = ((Object) ((APSVastAdBreak)iterator.next()));
	//    8   17:aload_2         
	//    9   18:invokeinterface #68  <Method Object Iterator.next()>
	//   10   23:checkcast       #70  <Class APSVastAdBreak>
	//   11   26:astore_3        
			arraylist = "";
	//   12   27:ldc1            #52  <String "">
	//   13   29:astore_0        
			Iterator iterator1 = ((APSVastAdBreak) (obj)).sources.iterator();
	//   14   30:aload_3         
	//   15   31:getfield        #74  <Field ArrayList APSVastAdBreak.sources>
	//   16   34:invokevirtual   #58  <Method Iterator ArrayList.iterator()>
	//   17   37:astore          4
			do
			{
				if(!iterator1.hasNext())
					break;
	//   18   39:aload           4
	//   19   41:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   20   46:ifeq            116
				Object obj1 = iterator1.next();
	//   21   49:aload           4
	//   22   51:invokeinterface #68  <Method Object Iterator.next()>
	//   23   56:astore          5
				if(obj1 instanceof String)
	//*  24   58:aload           5
	//*  25   60:instanceof      #76  <Class String>
	//*  26   63:ifne            69
	//*  27   66:goto            39
				{
					obj1 = ((Object) (" <vmap:AdTagURI templateType=\"vast3\"> <![CDATA[--!--APPSCEND-PLAYER-TEMPLATE_URI--!--]]> </vmap:AdTagURI>".replace("--!--APPSCEND-PLAYER-TEMPLATE_URI--!--", ((CharSequence) ((String)obj1)))));
	//   28   69:ldc1            #19  <String " <vmap:AdTagURI templateType=\"vast3\"> <![CDATA[--!--APPSCEND-PLAYER-TEMPLATE_URI--!--]]> </vmap:AdTagURI>">
	//   29   71:ldc1            #40  <String "--!--APPSCEND-PLAYER-TEMPLATE_URI--!--">
	//   30   73:aload           5
	//   31   75:checkcast       #76  <Class String>
	//   32   78:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   33   81:astore          5
					StringBuilder stringbuilder = new StringBuilder();
	//   34   83:new             #82  <Class StringBuilder>
	//   35   86:dup             
	//   36   87:invokespecial   #83  <Method void StringBuilder()>
	//   37   90:astore          6
					stringbuilder.append(((String) (arraylist)));
	//   38   92:aload           6
	//   39   94:aload_0         
	//   40   95:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   41   98:pop             
					stringbuilder.append(((String) (obj1)));
	//   42   99:aload           6
	//   43  101:aload           5
	//   44  103:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   45  106:pop             
					arraylist = ((ArrayList) (stringbuilder.toString()));
	//   46  107:aload           6
	//   47  109:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   48  112:astore_0        
				}
			} while(true);
	//   49  113:goto            39
			arraylist = ((ArrayList) (" <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>".replace("--!--AD-TAG-URI-TEMPLATE--!--", ((CharSequence) (arraylist)))));
	//   50  116:ldc1            #13  <String " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>">
	//   51  118:ldc1            #16  <String "--!--AD-TAG-URI-TEMPLATE--!--">
	//   52  120:aload_0         
	//   53  121:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   54  124:astore_0        
			static class _cls1
			{

				static final int $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[];

				static 
				{
					$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions = new int[APSVastAdBreak.APSVASTConfigurationOptions.values().length];
				//    0    0:invokestatic    #18  <Method APSVastAdBreak$APSVASTConfigurationOptions[] APSVastAdBreak$APSVASTConfigurationOptions.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//    5   12:getstatic       #24  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
				//    6   15:invokevirtual   #28  <Method int APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  10   23:getstatic       #31  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
				//*  11   26:invokevirtual   #28  <Method int APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  15   34:getstatic       #34  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
				//*  16   37:invokevirtual   #28  <Method int APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  20   45:getstatic       #37  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
				//*  21   48:invokevirtual   #28  <Method int APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   25   54:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[APSVastAdBreak.APSVASTConfigurationOptions.APSVASTMidContent.ordinal()] = 2;
					}
				//*  26   55:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   27   58:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPostContent.ordinal()] = 3;
					}
				//*  28   59:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   29   62:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[APSVastAdBreak.APSVASTConfigurationOptions.APSVASTNonLinear.ordinal()] = 4;
					}
				//*  30   63:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			switch(_cls1..SwitchMap.com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions[((APSVastAdBreak) (obj)).type.ordinal()])
	//*  55  125:getstatic       #95  <Field int[] VMAPTemplates$1.$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
	//*  56  128:aload_3         
	//*  57  129:getfield        #99  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
	//*  58  132:invokevirtual   #105 <Method int APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
	//*  59  135:iaload          
			{
	//*  60  136:tableswitch     1 4: default 168
	//	               1 232
	//	               2 211
	//	               3 192
	//	               4 171
	//*  61  168:goto            248
			case 4: // '\004'
				arraylist = ((ArrayList) (((String) (arraylist)).replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "nonlinear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", ((CharSequence) (((APSVastAdBreak) (obj)).adOffset)))));
	//   62  171:aload_0         
	//   63  172:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   64  174:ldc1            #25  <String "nonlinear">
	//   65  176:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   66  179:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   67  181:aload_3         
	//   68  182:getfield        #108 <Field String APSVastAdBreak.adOffset>
	//   69  185:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   70  188:astore_0        
				break;

	//*  71  189:goto            248
			case 3: // '\003'
				arraylist = ((ArrayList) (((String) (arraylist)).replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", "end")));
	//   72  192:aload_0         
	//   73  193:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   74  195:ldc1            #110 <String "linear">
	//   75  197:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   76  200:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   77  202:ldc1            #112 <String "end">
	//   78  204:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   79  207:astore_0        
				break;

	//*  80  208:goto            248
			case 2: // '\002'
				arraylist = ((ArrayList) (((String) (arraylist)).replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", ((CharSequence) (((APSVastAdBreak) (obj)).adOffset)))));
	//   81  211:aload_0         
	//   82  212:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   83  214:ldc1            #110 <String "linear">
	//   84  216:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   85  219:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   86  221:aload_3         
	//   87  222:getfield        #108 <Field String APSVastAdBreak.adOffset>
	//   88  225:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   89  228:astore_0        
				break;

	//*  90  229:goto            248
			case 1: // '\001'
				arraylist = ((ArrayList) (((String) (arraylist)).replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", "start")));
	//   91  232:aload_0         
	//   92  233:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   93  235:ldc1            #110 <String "linear">
	//   94  237:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   95  240:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   96  242:ldc1            #114 <String "start">
	//   97  244:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   98  247:astore_0        
				break;
			}
			obj = ((Object) (new StringBuilder()));
	//   99  248:new             #82  <Class StringBuilder>
	//  100  251:dup             
	//  101  252:invokespecial   #83  <Method void StringBuilder()>
	//  102  255:astore_3        
			((StringBuilder) (obj)).append(s);
	//  103  256:aload_3         
	//  104  257:aload_1         
	//  105  258:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  106  261:pop             
			((StringBuilder) (obj)).append(((String) (arraylist)));
	//  107  262:aload_3         
	//  108  263:aload_0         
	//  109  264:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  110  267:pop             
			s = ((StringBuilder) (obj)).toString();
	//  111  268:aload_3         
	//  112  269:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  113  272:astore_1        
		}

	//* 114  273:goto            8
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><VMAP xmlns:vmap=\"http://www.iab.net/vmap-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" xmlns:psns=\"http://microsoft.com/namespace/playersequencer/iabExtensions.xsd\" version=\"1.0\">--!--AD-BREAK-TEMPLATE--!-- </VMAP>".replace("--!--AD-BREAK-TEMPLATE--!--", ((CharSequence) (s)));
	//  115  276:ldc1            #43  <String "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><VMAP xmlns:vmap=\"http://www.iab.net/vmap-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" xmlns:psns=\"http://microsoft.com/namespace/playersequencer/iabExtensions.xsd\" version=\"1.0\">--!--AD-BREAK-TEMPLATE--!-- </VMAP>">
	//  116  278:ldc1            #10  <String "--!--AD-BREAK-TEMPLATE--!--">
	//  117  280:aload_1         
	//  118  281:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//  119  284:areturn         
	}

	public static String getVMAPForVAST(String s, String s1, String s2)
	{
label0:
		{
label1:
			{
				if(s == null || s1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          163
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
					break label0;
	//    4    8:goto            163
				String s3 = " <vmap:AdTagURI templateType=\"vast3\"> <![CDATA[--!--APPSCEND-PLAYER-TEMPLATE_URI--!--]]> </vmap:AdTagURI>".replace("--!--APPSCEND-PLAYER-TEMPLATE_URI--!--", ((CharSequence) (s)));
	//    5   11:ldc1            #19  <String " <vmap:AdTagURI templateType=\"vast3\"> <![CDATA[--!--APPSCEND-PLAYER-TEMPLATE_URI--!--]]> </vmap:AdTagURI>">
	//    6   13:ldc1            #40  <String "--!--APPSCEND-PLAYER-TEMPLATE_URI--!--">
	//    7   15:aload_0         
	//    8   16:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//    9   19:astore_3        
				if(s1.equals("preroll"))
	//*  10   20:aload_1         
	//*  11   21:ldc1            #34  <String "preroll">
	//*  12   23:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  13   26:ifeq            49
					s = " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>".replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", "start");
	//   14   29:ldc1            #13  <String " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>">
	//   15   31:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   16   33:ldc1            #110 <String "linear">
	//   17   35:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   18   38:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   19   40:ldc1            #114 <String "start">
	//   20   42:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   21   45:astore_0        
				else
	//*  22   46:goto            145
				if(s1.equals("postroll"))
	//*  23   49:aload_1         
	//*  24   50:ldc1            #31  <String "postroll">
	//*  25   52:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  26   55:ifeq            78
					s = " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>".replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", "end");
	//   27   58:ldc1            #13  <String " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>">
	//   28   60:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   29   62:ldc1            #110 <String "linear">
	//   30   64:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   31   67:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   32   69:ldc1            #112 <String "end">
	//   33   71:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   34   74:astore_0        
				else
	//*  35   75:goto            145
				if(s1.equals("midroll"))
	//*  36   78:aload_1         
	//*  37   79:ldc1            #22  <String "midroll">
	//*  38   81:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  39   84:ifeq            113
				{
					if(s2 == null)
	//*  40   87:aload_2         
	//*  41   88:ifnonnull       94
						return "";
	//   42   91:ldc1            #52  <String "">
	//   43   93:areturn         
					s = " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>".replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "linear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", ((CharSequence) (s2)));
	//   44   94:ldc1            #13  <String " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>">
	//   45   96:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   46   98:ldc1            #110 <String "linear">
	//   47  100:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   48  103:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   49  105:aload_2         
	//   50  106:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   51  109:astore_0        
				} else
	//*  52  110:goto            145
				{
					if(!s1.equals("nonlinear"))
						break label1;
	//   53  113:aload_1         
	//   54  114:ldc1            #25  <String "nonlinear">
	//   55  116:invokevirtual   #122 <Method boolean String.equals(Object)>
	//   56  119:ifeq            160
					if(s2 == null)
	//*  57  122:aload_2         
	//*  58  123:ifnonnull       129
						return "";
	//   59  126:ldc1            #52  <String "">
	//   60  128:areturn         
					s = " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>".replace("--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--", "nonlinear").replace("--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--", ((CharSequence) (s2)));
	//   61  129:ldc1            #13  <String " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>">
	//   62  131:ldc1            #37  <String "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--">
	//   63  133:ldc1            #25  <String "nonlinear">
	//   64  135:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   65  138:ldc1            #28  <String "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--">
	//   66  140:aload_2         
	//   67  141:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   68  144:astore_0        
				}
				return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><VMAP xmlns:vmap=\"http://www.iab.net/vmap-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" xmlns:psns=\"http://microsoft.com/namespace/playersequencer/iabExtensions.xsd\" version=\"1.0\">--!--AD-BREAK-TEMPLATE--!-- </VMAP>".replace("--!--AD-BREAK-TEMPLATE--!--", ((CharSequence) (s.replace("--!--AD-TAG-URI-TEMPLATE--!--", ((CharSequence) (s3))))));
	//   69  145:ldc1            #43  <String "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><VMAP xmlns:vmap=\"http://www.iab.net/vmap-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" xmlns:psns=\"http://microsoft.com/namespace/playersequencer/iabExtensions.xsd\" version=\"1.0\">--!--AD-BREAK-TEMPLATE--!-- </VMAP>">
	//   70  147:ldc1            #10  <String "--!--AD-BREAK-TEMPLATE--!--">
	//   71  149:aload_0         
	//   72  150:ldc1            #16  <String "--!--AD-TAG-URI-TEMPLATE--!--">
	//   73  152:aload_3         
	//   74  153:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   75  156:invokevirtual   #80  <Method String String.replace(CharSequence, CharSequence)>
	//   76  159:areturn         
			}
			return "";
	//   77  160:ldc1            #52  <String "">
	//   78  162:areturn         
		}
		return "";
	//   79  163:ldc1            #52  <String "">
	//   80  165:areturn         
	}

	private static final String AD_BREAK_PLACEHOLDER = "--!--AD-BREAK-TEMPLATE--!--";
	public static final String AD_BREAK_TEMPLATE = " <vmap:AdBreak breakType=\"--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--\" breakId=\"appscend\" timeOffset=\"--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--\"> <vmap:AdSource allowMultipleAds=\"true\" followRedirects=\"true\" id=\"1\">--!--AD-TAG-URI-TEMPLATE--!-- </vmap:AdSource> </vmap:AdBreak>";
	private static final String AD_TAG_URI_PLACEHOLDER = "--!--AD-TAG-URI-TEMPLATE--!--";
	public static final String AD_TAG_URI_TEMPLATE = " <vmap:AdTagURI templateType=\"vast3\"> <![CDATA[--!--APPSCEND-PLAYER-TEMPLATE_URI--!--]]> </vmap:AdTagURI>";
	public static final String MIDROLL = "midroll";
	public static final String NONLINEAR = "nonlinear";
	public static final String OFFSET_PLACEHOLDER = "--!--APPSCEND-PLAYER-TEMPLATE_OFFSET--!--";
	public static final String POSTROLL = "postroll";
	public static final String PREROLL = "preroll";
	public static final String TYPE_PLACEHOLDER = "--!--APPSCEND-PLAYER-TEMPLATE_TYPE--!--";
	public static final String URI_PLACEHOLDER = "--!--APPSCEND-PLAYER-TEMPLATE_URI--!--";
	public static final String VMAP_TEMPLATE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><VMAP xmlns:vmap=\"http://www.iab.net/vmap-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" xmlns:psns=\"http://microsoft.com/namespace/playersequencer/iabExtensions.xsd\" version=\"1.0\">--!--AD-BREAK-TEMPLATE--!-- </VMAP>";
}
