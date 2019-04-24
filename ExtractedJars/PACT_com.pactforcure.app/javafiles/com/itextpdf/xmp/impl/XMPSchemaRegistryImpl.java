// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.AliasOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPAliasInfo;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.itextpdf.xmp.impl:
//			ParameterAsserts, XMPNodeUtils, Utils

public final class XMPSchemaRegistryImpl
	implements XMPSchemaRegistry, XMPConst
{

	public XMPSchemaRegistryImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		namespaceToPrefixMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field Map namespaceToPrefixMap>
		prefixToNamespaceMap = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #24  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #25  <Method void HashMap()>
	//   11   23:putfield        #29  <Field Map prefixToNamespaceMap>
		aliasMap = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #24  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #25  <Method void HashMap()>
	//   16   34:putfield        #31  <Field Map aliasMap>
		p = Pattern.compile("[/*?\\[\\]]");
	//   17   37:aload_0         
	//   18   38:ldc1            #33  <String "[/*?\\[\\]]">
	//   19   40:invokestatic    #39  <Method Pattern Pattern.compile(String)>
	//   20   43:putfield        #41  <Field Pattern p>
		try
		{
			registerStandardNamespaces();
	//   21   46:aload_0         
	//   22   47:invokespecial   #44  <Method void registerStandardNamespaces()>
			registerStandardAliases();
	//   23   50:aload_0         
	//   24   51:invokespecial   #47  <Method void registerStandardAliases()>
			return;
	//   25   54:return          
		}
		catch(XMPException xmpexception)
	//*  26   55:astore_1        
		{
			throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
	//   27   56:new             #49  <Class RuntimeException>
	//   28   59:dup             
	//   29   60:ldc1            #51  <String "The XMPSchemaRegistry cannot be initialized!">
	//   30   62:invokespecial   #54  <Method void RuntimeException(String)>
	//   31   65:athrow          
		}
	}

	private void registerStandardAliases()
		throws XMPException
	{
		AliasOptions aliasoptions = (new AliasOptions()).setArrayOrdered(true);
	//    0    0:new             #57  <Class AliasOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void AliasOptions()>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #62  <Method AliasOptions AliasOptions.setArrayOrdered(boolean)>
	//    5   11:astore_1        
		AliasOptions aliasoptions1 = (new AliasOptions()).setArrayAltText(true);
	//    6   12:new             #57  <Class AliasOptions>
	//    7   15:dup             
	//    8   16:invokespecial   #58  <Method void AliasOptions()>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #65  <Method AliasOptions AliasOptions.setArrayAltText(boolean)>
	//   11   23:astore_2        
		registerAlias("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aliasoptions);
	//   12   24:aload_0         
	//   13   25:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   14   27:ldc1            #69  <String "Author">
	//   15   29:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   16   31:ldc1            #73  <String "creator">
	//   17   33:aload_1         
	//   18   34:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", ((AliasOptions) (null)));
	//   19   37:aload_0         
	//   20   38:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   21   40:ldc1            #79  <String "Authors">
	//   22   42:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   23   44:ldc1            #73  <String "creator">
	//   24   46:aconst_null     
	//   25   47:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", ((AliasOptions) (null)));
	//   26   50:aload_0         
	//   27   51:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   28   53:ldc1            #81  <String "Description">
	//   29   55:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   30   57:ldc1            #83  <String "description">
	//   31   59:aconst_null     
	//   32   60:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", ((AliasOptions) (null)));
	//   33   63:aload_0         
	//   34   64:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   35   66:ldc1            #85  <String "Format">
	//   36   68:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   37   70:ldc1            #87  <String "format">
	//   38   72:aconst_null     
	//   39   73:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", ((AliasOptions) (null)));
	//   40   76:aload_0         
	//   41   77:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   42   79:ldc1            #89  <String "Keywords">
	//   43   81:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   44   83:ldc1            #91  <String "subject">
	//   45   85:aconst_null     
	//   46   86:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", ((AliasOptions) (null)));
	//   47   89:aload_0         
	//   48   90:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   49   92:ldc1            #93  <String "Locale">
	//   50   94:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   51   96:ldc1            #95  <String "language">
	//   52   98:aconst_null     
	//   53   99:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", ((AliasOptions) (null)));
	//   54  102:aload_0         
	//   55  103:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   56  105:ldc1            #97  <String "Title">
	//   57  107:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   58  109:ldc1            #99  <String "title">
	//   59  111:aconst_null     
	//   60  112:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", ((AliasOptions) (null)));
	//   61  115:aload_0         
	//   62  116:ldc1            #101 <String "http://ns.adobe.com/xap/1.0/rights/">
	//   63  118:ldc1            #103 <String "Copyright">
	//   64  120:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   65  122:ldc1            #105 <String "rights">
	//   66  124:aconst_null     
	//   67  125:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aliasoptions);
	//   68  128:aload_0         
	//   69  129:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   70  131:ldc1            #69  <String "Author">
	//   71  133:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   72  135:ldc1            #73  <String "creator">
	//   73  137:aload_1         
	//   74  138:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", ((AliasOptions) (null)));
	//   75  141:aload_0         
	//   76  142:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   77  144:ldc1            #109 <String "BaseURL">
	//   78  146:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   79  148:ldc1            #109 <String "BaseURL">
	//   80  150:aconst_null     
	//   81  151:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", ((AliasOptions) (null)));
	//   82  154:aload_0         
	//   83  155:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   84  157:ldc1            #111 <String "CreationDate">
	//   85  159:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   86  161:ldc1            #113 <String "CreateDate">
	//   87  163:aconst_null     
	//   88  164:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", ((AliasOptions) (null)));
	//   89  167:aload_0         
	//   90  168:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   91  170:ldc1            #115 <String "Creator">
	//   92  172:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   93  174:ldc1            #117 <String "CreatorTool">
	//   94  176:aconst_null     
	//   95  177:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", ((AliasOptions) (null)));
	//   96  180:aload_0         
	//   97  181:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   98  183:ldc1            #119 <String "ModDate">
	//   99  185:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  100  187:ldc1            #121 <String "ModifyDate">
	//  101  189:aconst_null     
	//  102  190:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", aliasoptions1);
	//  103  193:aload_0         
	//  104  194:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//  105  196:ldc1            #123 <String "Subject">
	//  106  198:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  107  200:ldc1            #83  <String "description">
	//  108  202:aload_2         
	//  109  203:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", aliasoptions1);
	//  110  206:aload_0         
	//  111  207:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//  112  209:ldc1            #97  <String "Title">
	//  113  211:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  114  213:ldc1            #99  <String "title">
	//  115  215:aload_2         
	//  116  216:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aliasoptions);
	//  117  219:aload_0         
	//  118  220:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  119  222:ldc1            #69  <String "Author">
	//  120  224:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  121  226:ldc1            #73  <String "creator">
	//  122  228:aload_1         
	//  123  229:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", aliasoptions1);
	//  124  232:aload_0         
	//  125  233:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  126  235:ldc1            #127 <String "Caption">
	//  127  237:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  128  239:ldc1            #83  <String "description">
	//  129  241:aload_2         
	//  130  242:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aliasoptions1);
	//  131  245:aload_0         
	//  132  246:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  133  248:ldc1            #103 <String "Copyright">
	//  134  250:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  135  252:ldc1            #105 <String "rights">
	//  136  254:aload_2         
	//  137  255:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", ((AliasOptions) (null)));
	//  138  258:aload_0         
	//  139  259:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  140  261:ldc1            #89  <String "Keywords">
	//  141  263:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  142  265:ldc1            #91  <String "subject">
	//  143  267:aconst_null     
	//  144  268:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", ((AliasOptions) (null)));
	//  145  271:aload_0         
	//  146  272:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  147  274:ldc1            #129 <String "Marked">
	//  148  276:ldc1            #101 <String "http://ns.adobe.com/xap/1.0/rights/">
	//  149  278:ldc1            #129 <String "Marked">
	//  150  280:aconst_null     
	//  151  281:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", aliasoptions1);
	//  152  284:aload_0         
	//  153  285:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  154  287:ldc1            #97  <String "Title">
	//  155  289:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  156  291:ldc1            #99  <String "title">
	//  157  293:aload_2         
	//  158  294:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", ((AliasOptions) (null)));
	//  159  297:aload_0         
	//  160  298:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  161  300:ldc1            #131 <String "WebStatement">
	//  162  302:ldc1            #101 <String "http://ns.adobe.com/xap/1.0/rights/">
	//  163  304:ldc1            #131 <String "WebStatement">
	//  164  306:aconst_null     
	//  165  307:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", aliasoptions);
	//  166  310:aload_0         
	//  167  311:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  168  313:ldc1            #135 <String "Artist">
	//  169  315:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  170  317:ldc1            #73  <String "creator">
	//  171  319:aload_1         
	//  172  320:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", ((AliasOptions) (null)));
	//  173  323:aload_0         
	//  174  324:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  175  326:ldc1            #103 <String "Copyright">
	//  176  328:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  177  330:ldc1            #105 <String "rights">
	//  178  332:aconst_null     
	//  179  333:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", ((AliasOptions) (null)));
	//  180  336:aload_0         
	//  181  337:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  182  339:ldc1            #137 <String "DateTime">
	//  183  341:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  184  343:ldc1            #121 <String "ModifyDate">
	//  185  345:aconst_null     
	//  186  346:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", ((AliasOptions) (null)));
	//  187  349:aload_0         
	//  188  350:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  189  352:ldc1            #139 <String "ImageDescription">
	//  190  354:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  191  356:ldc1            #83  <String "description">
	//  192  358:aconst_null     
	//  193  359:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", ((AliasOptions) (null)));
	//  194  362:aload_0         
	//  195  363:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  196  365:ldc1            #141 <String "Software">
	//  197  367:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  198  369:ldc1            #117 <String "CreatorTool">
	//  199  371:aconst_null     
	//  200  372:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aliasoptions);
	//  201  375:aload_0         
	//  202  376:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  203  378:ldc1            #69  <String "Author">
	//  204  380:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  205  382:ldc1            #73  <String "creator">
	//  206  384:aload_1         
	//  207  385:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aliasoptions1);
	//  208  388:aload_0         
	//  209  389:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  210  391:ldc1            #103 <String "Copyright">
	//  211  393:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  212  395:ldc1            #105 <String "rights">
	//  213  397:aload_2         
	//  214  398:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", ((AliasOptions) (null)));
	//  215  401:aload_0         
	//  216  402:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  217  404:ldc1            #145 <String "CreationTime">
	//  218  406:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  219  408:ldc1            #113 <String "CreateDate">
	//  220  410:aconst_null     
	//  221  411:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", aliasoptions1);
	//  222  414:aload_0         
	//  223  415:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  224  417:ldc1            #81  <String "Description">
	//  225  419:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  226  421:ldc1            #83  <String "description">
	//  227  423:aload_2         
	//  228  424:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", ((AliasOptions) (null)));
	//  229  427:aload_0         
	//  230  428:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  231  430:ldc1            #147 <String "ModificationTime">
	//  232  432:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  233  434:ldc1            #121 <String "ModifyDate">
	//  234  436:aconst_null     
	//  235  437:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", ((AliasOptions) (null)));
	//  236  440:aload_0         
	//  237  441:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  238  443:ldc1            #141 <String "Software">
	//  239  445:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//  240  447:ldc1            #117 <String "CreatorTool">
	//  241  449:aconst_null     
	//  242  450:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
		registerAlias("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", aliasoptions1);
	//  243  453:aload_0         
	//  244  454:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  245  456:ldc1            #97  <String "Title">
	//  246  458:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//  247  460:ldc1            #99  <String "title">
	//  248  462:aload_2         
	//  249  463:invokevirtual   #77  <Method void registerAlias(String, String, String, String, AliasOptions)>
	//  250  466:return          
	}

	private void registerStandardNamespaces()
		throws XMPException
	{
		registerNamespace("http://www.w3.org/XML/1998/namespace", "xml");
	//    0    0:aload_0         
	//    1    1:ldc1            #150 <String "http://www.w3.org/XML/1998/namespace">
	//    2    3:ldc1            #152 <String "xml">
	//    3    5:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//    4    8:pop             
		registerNamespace("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
	//    5    9:aload_0         
	//    6   10:ldc1            #158 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//    7   12:ldc1            #160 <String "rdf">
	//    8   14:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//    9   17:pop             
		registerNamespace("http://purl.org/dc/elements/1.1/", "dc");
	//   10   18:aload_0         
	//   11   19:ldc1            #71  <String "http://purl.org/dc/elements/1.1/">
	//   12   21:ldc1            #162 <String "dc">
	//   13   23:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   14   26:pop             
		registerNamespace("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
	//   15   27:aload_0         
	//   16   28:ldc1            #164 <String "http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/">
	//   17   30:ldc1            #166 <String "Iptc4xmpCore">
	//   18   32:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   19   35:pop             
		registerNamespace("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
	//   20   36:aload_0         
	//   21   37:ldc1            #168 <String "http://iptc.org/std/Iptc4xmpExt/2008-02-29/">
	//   22   39:ldc1            #170 <String "Iptc4xmpExt">
	//   23   41:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   24   44:pop             
		registerNamespace("http://ns.adobe.com/DICOM/", "DICOM");
	//   25   45:aload_0         
	//   26   46:ldc1            #172 <String "http://ns.adobe.com/DICOM/">
	//   27   48:ldc1            #174 <String "DICOM">
	//   28   50:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   29   53:pop             
		registerNamespace("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
	//   30   54:aload_0         
	//   31   55:ldc1            #176 <String "http://ns.useplus.org/ldf/xmp/1.0/">
	//   32   57:ldc1            #178 <String "plus">
	//   33   59:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   34   62:pop             
		registerNamespace("adobe:ns:meta/", "x");
	//   35   63:aload_0         
	//   36   64:ldc1            #180 <String "adobe:ns:meta/">
	//   37   66:ldc1            #182 <String "x">
	//   38   68:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   39   71:pop             
		registerNamespace("http://ns.adobe.com/iX/1.0/", "iX");
	//   40   72:aload_0         
	//   41   73:ldc1            #184 <String "http://ns.adobe.com/iX/1.0/">
	//   42   75:ldc1            #186 <String "iX">
	//   43   77:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   44   80:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/", "xmp");
	//   45   81:aload_0         
	//   46   82:ldc1            #67  <String "http://ns.adobe.com/xap/1.0/">
	//   47   84:ldc1            #188 <String "xmp">
	//   48   86:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   49   89:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
	//   50   90:aload_0         
	//   51   91:ldc1            #101 <String "http://ns.adobe.com/xap/1.0/rights/">
	//   52   93:ldc1            #190 <String "xmpRights">
	//   53   95:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   54   98:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
	//   55   99:aload_0         
	//   56  100:ldc1            #192 <String "http://ns.adobe.com/xap/1.0/mm/">
	//   57  102:ldc1            #194 <String "xmpMM">
	//   58  104:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   59  107:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
	//   60  108:aload_0         
	//   61  109:ldc1            #196 <String "http://ns.adobe.com/xap/1.0/bj/">
	//   62  111:ldc1            #198 <String "xmpBJ">
	//   63  113:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   64  116:pop             
		registerNamespace("http://ns.adobe.com/xmp/note/", "xmpNote");
	//   65  117:aload_0         
	//   66  118:ldc1            #200 <String "http://ns.adobe.com/xmp/note/">
	//   67  120:ldc1            #202 <String "xmpNote">
	//   68  122:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   69  125:pop             
		registerNamespace("http://ns.adobe.com/pdf/1.3/", "pdf");
	//   70  126:aload_0         
	//   71  127:ldc1            #107 <String "http://ns.adobe.com/pdf/1.3/">
	//   72  129:ldc1            #204 <String "pdf">
	//   73  131:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   74  134:pop             
		registerNamespace("http://ns.adobe.com/pdfx/1.3/", "pdfx");
	//   75  135:aload_0         
	//   76  136:ldc1            #206 <String "http://ns.adobe.com/pdfx/1.3/">
	//   77  138:ldc1            #208 <String "pdfx">
	//   78  140:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   79  143:pop             
		registerNamespace("http://www.npes.org/pdfx/ns/id/", "pdfxid");
	//   80  144:aload_0         
	//   81  145:ldc1            #210 <String "http://www.npes.org/pdfx/ns/id/">
	//   82  147:ldc1            #212 <String "pdfxid">
	//   83  149:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   84  152:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
	//   85  153:aload_0         
	//   86  154:ldc1            #214 <String "http://www.aiim.org/pdfa/ns/schema#">
	//   87  156:ldc1            #216 <String "pdfaSchema">
	//   88  158:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   89  161:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
	//   90  162:aload_0         
	//   91  163:ldc1            #218 <String "http://www.aiim.org/pdfa/ns/property#">
	//   92  165:ldc1            #220 <String "pdfaProperty">
	//   93  167:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   94  170:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
	//   95  171:aload_0         
	//   96  172:ldc1            #222 <String "http://www.aiim.org/pdfa/ns/type#">
	//   97  174:ldc1            #224 <String "pdfaType">
	//   98  176:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//   99  179:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
	//  100  180:aload_0         
	//  101  181:ldc1            #226 <String "http://www.aiim.org/pdfa/ns/field#">
	//  102  183:ldc1            #228 <String "pdfaField">
	//  103  185:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  104  188:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
	//  105  189:aload_0         
	//  106  190:ldc1            #230 <String "http://www.aiim.org/pdfa/ns/id/">
	//  107  192:ldc1            #232 <String "pdfaid">
	//  108  194:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  109  197:pop             
		registerNamespace("http://www.aiim.org/pdfua/ns/id/", "pdfuaid");
	//  110  198:aload_0         
	//  111  199:ldc1            #234 <String "http://www.aiim.org/pdfua/ns/id/">
	//  112  201:ldc1            #236 <String "pdfuaid">
	//  113  203:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  114  206:pop             
		registerNamespace("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
	//  115  207:aload_0         
	//  116  208:ldc1            #238 <String "http://www.aiim.org/pdfa/ns/extension/">
	//  117  210:ldc1            #240 <String "pdfaExtension">
	//  118  212:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  119  215:pop             
		registerNamespace("http://ns.adobe.com/photoshop/1.0/", "photoshop");
	//  120  216:aload_0         
	//  121  217:ldc1            #125 <String "http://ns.adobe.com/photoshop/1.0/">
	//  122  219:ldc1            #242 <String "photoshop">
	//  123  221:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  124  224:pop             
		registerNamespace("http://ns.adobe.com/album/1.0/", "album");
	//  125  225:aload_0         
	//  126  226:ldc1            #244 <String "http://ns.adobe.com/album/1.0/">
	//  127  228:ldc1            #246 <String "album">
	//  128  230:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  129  233:pop             
		registerNamespace("http://ns.adobe.com/exif/1.0/", "exif");
	//  130  234:aload_0         
	//  131  235:ldc1            #248 <String "http://ns.adobe.com/exif/1.0/">
	//  132  237:ldc1            #250 <String "exif">
	//  133  239:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  134  242:pop             
		registerNamespace("http://cipa.jp/exif/1.0/", "exifEX");
	//  135  243:aload_0         
	//  136  244:ldc1            #252 <String "http://cipa.jp/exif/1.0/">
	//  137  246:ldc1            #254 <String "exifEX">
	//  138  248:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  139  251:pop             
		registerNamespace("http://ns.adobe.com/exif/1.0/aux/", "aux");
	//  140  252:aload_0         
	//  141  253:ldc2            #256 <String "http://ns.adobe.com/exif/1.0/aux/">
	//  142  256:ldc2            #258 <String "aux">
	//  143  259:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  144  262:pop             
		registerNamespace("http://ns.adobe.com/tiff/1.0/", "tiff");
	//  145  263:aload_0         
	//  146  264:ldc1            #133 <String "http://ns.adobe.com/tiff/1.0/">
	//  147  266:ldc2            #260 <String "tiff">
	//  148  269:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  149  272:pop             
		registerNamespace("http://ns.adobe.com/png/1.0/", "png");
	//  150  273:aload_0         
	//  151  274:ldc1            #143 <String "http://ns.adobe.com/png/1.0/">
	//  152  276:ldc2            #262 <String "png">
	//  153  279:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  154  282:pop             
		registerNamespace("http://ns.adobe.com/jpeg/1.0/", "jpeg");
	//  155  283:aload_0         
	//  156  284:ldc2            #264 <String "http://ns.adobe.com/jpeg/1.0/">
	//  157  287:ldc2            #266 <String "jpeg">
	//  158  290:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  159  293:pop             
		registerNamespace("http://ns.adobe.com/jp2k/1.0/", "jp2k");
	//  160  294:aload_0         
	//  161  295:ldc2            #268 <String "http://ns.adobe.com/jp2k/1.0/">
	//  162  298:ldc2            #270 <String "jp2k">
	//  163  301:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  164  304:pop             
		registerNamespace("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
	//  165  305:aload_0         
	//  166  306:ldc2            #272 <String "http://ns.adobe.com/camera-raw-settings/1.0/">
	//  167  309:ldc2            #274 <String "crs">
	//  168  312:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  169  315:pop             
		registerNamespace("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
	//  170  316:aload_0         
	//  171  317:ldc2            #276 <String "http://ns.adobe.com/StockPhoto/1.0/">
	//  172  320:ldc2            #278 <String "bmsp">
	//  173  323:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  174  326:pop             
		registerNamespace("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
	//  175  327:aload_0         
	//  176  328:ldc2            #280 <String "http://ns.adobe.com/creatorAtom/1.0/">
	//  177  331:ldc2            #282 <String "creatorAtom">
	//  178  334:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  179  337:pop             
		registerNamespace("http://ns.adobe.com/asf/1.0/", "asf");
	//  180  338:aload_0         
	//  181  339:ldc2            #284 <String "http://ns.adobe.com/asf/1.0/">
	//  182  342:ldc2            #286 <String "asf">
	//  183  345:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  184  348:pop             
		registerNamespace("http://ns.adobe.com/xmp/wav/1.0/", "wav");
	//  185  349:aload_0         
	//  186  350:ldc2            #288 <String "http://ns.adobe.com/xmp/wav/1.0/">
	//  187  353:ldc2            #290 <String "wav">
	//  188  356:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  189  359:pop             
		registerNamespace("http://ns.adobe.com/bwf/bext/1.0/", "bext");
	//  190  360:aload_0         
	//  191  361:ldc2            #292 <String "http://ns.adobe.com/bwf/bext/1.0/">
	//  192  364:ldc2            #294 <String "bext">
	//  193  367:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  194  370:pop             
		registerNamespace("http://ns.adobe.com/riff/info/", "riffinfo");
	//  195  371:aload_0         
	//  196  372:ldc2            #296 <String "http://ns.adobe.com/riff/info/">
	//  197  375:ldc2            #298 <String "riffinfo">
	//  198  378:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  199  381:pop             
		registerNamespace("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
	//  200  382:aload_0         
	//  201  383:ldc2            #300 <String "http://ns.adobe.com/xmp/1.0/Script/">
	//  202  386:ldc2            #302 <String "xmpScript">
	//  203  389:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  204  392:pop             
		registerNamespace("http://ns.adobe.com/TransformXMP/", "txmp");
	//  205  393:aload_0         
	//  206  394:ldc2            #304 <String "http://ns.adobe.com/TransformXMP/">
	//  207  397:ldc2            #306 <String "txmp">
	//  208  400:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  209  403:pop             
		registerNamespace("http://ns.adobe.com/swf/1.0/", "swf");
	//  210  404:aload_0         
	//  211  405:ldc2            #308 <String "http://ns.adobe.com/swf/1.0/">
	//  212  408:ldc2            #310 <String "swf">
	//  213  411:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  214  414:pop             
		registerNamespace("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
	//  215  415:aload_0         
	//  216  416:ldc2            #312 <String "http://ns.adobe.com/xmp/1.0/DynamicMedia/">
	//  217  419:ldc2            #314 <String "xmpDM">
	//  218  422:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  219  425:pop             
		registerNamespace("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
	//  220  426:aload_0         
	//  221  427:ldc2            #316 <String "http://ns.adobe.com/xmp/transient/1.0/">
	//  222  430:ldc2            #318 <String "xmpx">
	//  223  433:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  224  436:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/t/", "xmpT");
	//  225  437:aload_0         
	//  226  438:ldc2            #320 <String "http://ns.adobe.com/xap/1.0/t/">
	//  227  441:ldc2            #322 <String "xmpT">
	//  228  444:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  229  447:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
	//  230  448:aload_0         
	//  231  449:ldc2            #324 <String "http://ns.adobe.com/xap/1.0/t/pg/">
	//  232  452:ldc2            #326 <String "xmpTPg">
	//  233  455:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  234  458:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/g/", "xmpG");
	//  235  459:aload_0         
	//  236  460:ldc2            #328 <String "http://ns.adobe.com/xap/1.0/g/">
	//  237  463:ldc2            #330 <String "xmpG">
	//  238  466:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  239  469:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
	//  240  470:aload_0         
	//  241  471:ldc2            #332 <String "http://ns.adobe.com/xap/1.0/g/img/">
	//  242  474:ldc2            #334 <String "xmpGImg">
	//  243  477:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  244  480:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
	//  245  481:aload_0         
	//  246  482:ldc2            #336 <String "http://ns.adobe.com/xap/1.0/sType/Font#">
	//  247  485:ldc2            #338 <String "stFnt">
	//  248  488:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  249  491:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
	//  250  492:aload_0         
	//  251  493:ldc2            #340 <String "http://ns.adobe.com/xap/1.0/sType/Dimensions#">
	//  252  496:ldc2            #342 <String "stDim">
	//  253  499:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  254  502:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
	//  255  503:aload_0         
	//  256  504:ldc2            #344 <String "http://ns.adobe.com/xap/1.0/sType/ResourceEvent#">
	//  257  507:ldc2            #346 <String "stEvt">
	//  258  510:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  259  513:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
	//  260  514:aload_0         
	//  261  515:ldc2            #348 <String "http://ns.adobe.com/xap/1.0/sType/ResourceRef#">
	//  262  518:ldc2            #350 <String "stRef">
	//  263  521:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  264  524:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
	//  265  525:aload_0         
	//  266  526:ldc2            #352 <String "http://ns.adobe.com/xap/1.0/sType/Version#">
	//  267  529:ldc2            #354 <String "stVer">
	//  268  532:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  269  535:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
	//  270  536:aload_0         
	//  271  537:ldc2            #356 <String "http://ns.adobe.com/xap/1.0/sType/Job#">
	//  272  540:ldc2            #358 <String "stJob">
	//  273  543:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  274  546:pop             
		registerNamespace("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
	//  275  547:aload_0         
	//  276  548:ldc2            #360 <String "http://ns.adobe.com/xap/1.0/sType/ManifestItem#">
	//  277  551:ldc2            #362 <String "stMfs">
	//  278  554:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  279  557:pop             
		registerNamespace("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
	//  280  558:aload_0         
	//  281  559:ldc2            #364 <String "http://ns.adobe.com/xmp/Identifier/qual/1.0/">
	//  282  562:ldc2            #366 <String "xmpidq">
	//  283  565:invokevirtual   #156 <Method String registerNamespace(String, String)>
	//  284  568:pop             
	//  285  569:return          
	}

	public void deleteNamespace(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1 = getNamespacePrefix(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #371 <Method String getNamespacePrefix(String)>
	//    5    7:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_34;
	//    6    8:aload_2         
	//    7    9:ifnull          34
		namespaceToPrefixMap.remove(((Object) (s)));
	//    8   12:aload_0         
	//    9   13:getfield        #27  <Field Map namespaceToPrefixMap>
	//   10   16:aload_1         
	//   11   17:invokeinterface #377 <Method Object Map.remove(Object)>
	//   12   22:pop             
		prefixToNamespaceMap.remove(((Object) (s1)));
	//   13   23:aload_0         
	//   14   24:getfield        #29  <Field Map prefixToNamespaceMap>
	//   15   27:aload_2         
	//   16   28:invokeinterface #377 <Method Object Map.remove(Object)>
	//   17   33:pop             
		this;
	//   18   34:aload_0         
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		s;
	//   21   37:astore_1        
	//*  22   38:aload_0         
		throw s;
	//   23   39:monitorexit     
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public XMPAliasInfo findAlias(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((XMPAliasInfo)aliasMap.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field Map aliasMap>
	//    4    6:aload_1         
	//    5    7:invokeinterface #382 <Method Object Map.get(Object)>
	//    6   12:checkcast       #384 <Class XMPAliasInfo>
	//    7   15:astore_1        
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return ((XMPAliasInfo) (s));
	//   10   18:aload_1         
	//   11   19:areturn         
		s;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw s;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public XMPAliasInfo[] findAliases(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist;
		s = getNamespacePrefix(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #371 <Method String getNamespacePrefix(String)>
	//    5    7:astore_1        
		arraylist = new ArrayList();
	//    6    8:new             #388 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #389 <Method void ArrayList()>
	//    9   15:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_85;
	//   10   16:aload_1         
	//   11   17:ifnull          85
		Iterator iterator = aliasMap.keySet().iterator();
	//   12   20:aload_0         
	//   13   21:getfield        #31  <Field Map aliasMap>
	//   14   24:invokeinterface #393 <Method Set Map.keySet()>
	//   15   29:invokeinterface #399 <Method Iterator Set.iterator()>
	//   16   34:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   17   35:aload_3         
	//   18   36:invokeinterface #405 <Method boolean Iterator.hasNext()>
	//   19   41:ifeq            85
			String s1 = (String)iterator.next();
	//   20   44:aload_3         
	//   21   45:invokeinterface #409 <Method Object Iterator.next()>
	//   22   50:checkcast       #411 <Class String>
	//   23   53:astore          4
			if(s1.startsWith(s))
	//*  24   55:aload           4
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #415 <Method boolean String.startsWith(String)>
	//*  27   61:ifeq            35
				((List) (arraylist)).add(((Object) (findAlias(s1))));
	//   28   64:aload_2         
	//   29   65:aload_0         
	//   30   66:aload           4
	//   31   68:invokevirtual   #417 <Method XMPAliasInfo findAlias(String)>
	//   32   71:invokeinterface #423 <Method boolean List.add(Object)>
	//   33   76:pop             
		} while(true);
	//   34   77:goto            35
		break MISSING_BLOCK_LABEL_85;
		s;
	//   35   80:astore_1        
	//*  36   81:aload_0         
		throw s;
	//   37   82:monitorexit     
	//   38   83:aload_1         
	//   39   84:athrow          
		s = ((String) ((XMPAliasInfo[])(XMPAliasInfo[])((List) (arraylist)).toArray(((Object []) (new XMPAliasInfo[((List) (arraylist)).size()])))));
	//   40   85:aload_2         
	//   41   86:aload_2         
	//   42   87:invokeinterface #427 <Method int List.size()>
	//   43   92:anewarray       XMPAliasInfo[]
	//   44   95:invokeinterface #431 <Method Object[] List.toArray(Object[])>
	//   45  100:checkcast       #433 <Class XMPAliasInfo[]>
	//   46  103:checkcast       #433 <Class XMPAliasInfo[]>
	//   47  106:astore_1        
		this;
	//   48  107:aload_0         
		JVM INSTR monitorexit ;
	//   49  108:monitorexit     
		return ((XMPAliasInfo []) (s));
	//   50  109:aload_1         
	//   51  110:areturn         
	}

	public Map getAliases()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = Collections.unmodifiableMap(((Map) (new TreeMap(aliasMap))));
	//    2    2:new             #437 <Class TreeMap>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Map aliasMap>
	//    6   10:invokespecial   #440 <Method void TreeMap(Map)>
	//    7   13:invokestatic    #446 <Method Map Collections.unmodifiableMap(Map)>
	//    8   16:astore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return map;
	//   11   19:aload_1         
	//   12   20:areturn         
		Exception exception;
		exception;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public String getNamespacePrefix(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = (String)namespaceToPrefixMap.get(((Object) (s)));
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field Map namespaceToPrefixMap>
	//    4    6:aload_1         
	//    5    7:invokeinterface #382 <Method Object Map.get(Object)>
	//    6   12:checkcast       #411 <Class String>
	//    7   15:astore_1        
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return s;
	//   10   18:aload_1         
	//   11   19:areturn         
		s;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw s;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public String getNamespaceURI(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		s1 = s;
	//    2    2:aload_1         
	//    3    3:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_41;
	//    4    4:aload_1         
	//    5    5:ifnull          41
		s1 = s;
	//    6    8:aload_1         
	//    7    9:astore_2        
		if(!s.endsWith(":"))
	//*   8   10:aload_1         
	//*   9   11:ldc2            #449 <String ":">
	//*  10   14:invokevirtual   #452 <Method boolean String.endsWith(String)>
	//*  11   17:ifne            41
			s1 = (new StringBuilder()).append(s).append(":").toString();
	//   12   20:new             #454 <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #455 <Method void StringBuilder()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   17   31:ldc2            #449 <String ":">
	//   18   34:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   20   40:astore_2        
		s = (String)prefixToNamespaceMap.get(((Object) (s1)));
	//   21   41:aload_0         
	//   22   42:getfield        #29  <Field Map prefixToNamespaceMap>
	//   23   45:aload_2         
	//   24   46:invokeinterface #382 <Method Object Map.get(Object)>
	//   25   51:checkcast       #411 <Class String>
	//   26   54:astore_1        
		this;
	//   27   55:aload_0         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return s;
	//   29   57:aload_1         
	//   30   58:areturn         
		s;
	//   31   59:astore_1        
	//*  32   60:aload_0         
		throw s;
	//   33   61:monitorexit     
	//   34   62:aload_1         
	//   35   63:athrow          
	}

	public Map getNamespaces()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = Collections.unmodifiableMap(((Map) (new TreeMap(namespaceToPrefixMap))));
	//    2    2:new             #437 <Class TreeMap>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field Map namespaceToPrefixMap>
	//    6   10:invokespecial   #440 <Method void TreeMap(Map)>
	//    7   13:invokestatic    #446 <Method Map Collections.unmodifiableMap(Map)>
	//    8   16:astore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return map;
	//   11   19:aload_1         
	//   12   20:areturn         
		Exception exception;
		exception;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public Map getPrefixes()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = Collections.unmodifiableMap(((Map) (new TreeMap(prefixToNamespaceMap))));
	//    2    2:new             #437 <Class TreeMap>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field Map prefixToNamespaceMap>
	//    6   10:invokespecial   #440 <Method void TreeMap(Map)>
	//    7   13:invokestatic    #446 <Method Map Collections.unmodifiableMap(Map)>
	//    8   16:astore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return map;
	//   11   19:aload_1         
	//   12   20:areturn         
		Exception exception;
		exception;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	void registerAlias(final String actualPrefix, String s, final String actualNS, final String actualProp, final AliasOptions aliasOpts)
		throws XMPException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ParameterAsserts.assertSchemaNS(actualPrefix);
	//    2    2:aload_1         
	//    3    3:invokestatic    #470 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s);
	//    4    6:aload_2         
	//    5    7:invokestatic    #473 <Method void ParameterAsserts.assertPropName(String)>
		ParameterAsserts.assertSchemaNS(actualNS);
	//    6   10:aload_3         
	//    7   11:invokestatic    #470 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(actualProp);
	//    8   14:aload           4
	//    9   16:invokestatic    #473 <Method void ParameterAsserts.assertPropName(String)>
		if(aliasOpts == null)
			break MISSING_BLOCK_LABEL_92;
	//   10   19:aload           5
	//   11   21:ifnull          92
		aliasOpts = new AliasOptions(XMPNodeUtils.verifySetOptions(aliasOpts.toPropertyOptions(), ((Object) (null))).getOptions());
	//   12   24:new             #57  <Class AliasOptions>
	//   13   27:dup             
	//   14   28:aload           5
	//   15   30:invokevirtual   #477 <Method PropertyOptions AliasOptions.toPropertyOptions()>
	//   16   33:aconst_null     
	//   17   34:invokestatic    #483 <Method PropertyOptions XMPNodeUtils.verifySetOptions(PropertyOptions, Object)>
	//   18   37:invokevirtual   #488 <Method int PropertyOptions.getOptions()>
	//   19   40:invokespecial   #491 <Method void AliasOptions(int)>
	//   20   43:astore          5
_L1:
		if(p.matcher(((CharSequence) (s))).find() || p.matcher(((CharSequence) (actualProp))).find())
	//*  21   45:aload_0         
	//*  22   46:getfield        #41  <Field Pattern p>
	//*  23   49:aload_2         
	//*  24   50:invokevirtual   #495 <Method Matcher Pattern.matcher(CharSequence)>
	//*  25   53:invokevirtual   #500 <Method boolean Matcher.find()>
	//*  26   56:ifne            74
	//*  27   59:aload_0         
	//*  28   60:getfield        #41  <Field Pattern p>
	//*  29   63:aload           4
	//*  30   65:invokevirtual   #495 <Method Matcher Pattern.matcher(CharSequence)>
	//*  31   68:invokevirtual   #500 <Method boolean Matcher.find()>
	//*  32   71:ifeq            104
			throw new XMPException("Alias and actual property names must be simple", 102);
	//   33   74:new             #20  <Class XMPException>
	//   34   77:dup             
	//   35   78:ldc2            #502 <String "Alias and actual property names must be simple">
	//   36   81:bipush          102
	//   37   83:invokespecial   #505 <Method void XMPException(String, int)>
	//   38   86:athrow          
		break MISSING_BLOCK_LABEL_104;
		actualPrefix;
	//   39   87:astore_1        
		this;
	//   40   88:aload_0         
		JVM INSTR monitorexit ;
	//   41   89:monitorexit     
		throw actualPrefix;
	//   42   90:aload_1         
	//   43   91:athrow          
		aliasOpts = new AliasOptions();
	//   44   92:new             #57  <Class AliasOptions>
	//   45   95:dup             
	//   46   96:invokespecial   #58  <Method void AliasOptions()>
	//   47   99:astore          5
		  goto _L1
	//*  48  101:goto            45
		String s1;
		s1 = getNamespacePrefix(actualPrefix);
	//   49  104:aload_0         
	//   50  105:aload_1         
	//   51  106:invokevirtual   #371 <Method String getNamespacePrefix(String)>
	//   52  109:astore          6
		actualPrefix = getNamespacePrefix(actualNS);
	//   53  111:aload_0         
	//   54  112:aload_3         
	//   55  113:invokevirtual   #371 <Method String getNamespacePrefix(String)>
	//   56  116:astore_1        
		if(s1 != null)
			break MISSING_BLOCK_LABEL_135;
	//   57  117:aload           6
	//   58  119:ifnonnull       135
		throw new XMPException("Alias namespace is not registered", 101);
	//   59  122:new             #20  <Class XMPException>
	//   60  125:dup             
	//   61  126:ldc2            #507 <String "Alias namespace is not registered">
	//   62  129:bipush          101
	//   63  131:invokespecial   #505 <Method void XMPException(String, int)>
	//   64  134:athrow          
		if(actualPrefix != null)
			break MISSING_BLOCK_LABEL_152;
	//   65  135:aload_1         
	//   66  136:ifnonnull       152
		throw new XMPException("Actual namespace is not registered", 101);
	//   67  139:new             #20  <Class XMPException>
	//   68  142:dup             
	//   69  143:ldc2            #509 <String "Actual namespace is not registered">
	//   70  146:bipush          101
	//   71  148:invokespecial   #505 <Method void XMPException(String, int)>
	//   72  151:athrow          
		s = (new StringBuilder()).append(s1).append(s).toString();
	//   73  152:new             #454 <Class StringBuilder>
	//   74  155:dup             
	//   75  156:invokespecial   #455 <Method void StringBuilder()>
	//   76  159:aload           6
	//   77  161:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:aload_2         
	//   79  165:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   80  168:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   81  171:astore_2        
		if(aliasMap.containsKey(((Object) (s))))
	//*  82  172:aload_0         
	//*  83  173:getfield        #31  <Field Map aliasMap>
	//*  84  176:aload_2         
	//*  85  177:invokeinterface #512 <Method boolean Map.containsKey(Object)>
	//*  86  182:ifeq            197
			throw new XMPException("Alias is already existing", 4);
	//   87  185:new             #20  <Class XMPException>
	//   88  188:dup             
	//   89  189:ldc2            #514 <String "Alias is already existing">
	//   90  192:iconst_4        
	//   91  193:invokespecial   #505 <Method void XMPException(String, int)>
	//   92  196:athrow          
		if(aliasMap.containsKey(((Object) ((new StringBuilder()).append(actualPrefix).append(actualProp).toString()))))
	//*  93  197:aload_0         
	//*  94  198:getfield        #31  <Field Map aliasMap>
	//*  95  201:new             #454 <Class StringBuilder>
	//*  96  204:dup             
	//*  97  205:invokespecial   #455 <Method void StringBuilder()>
	//*  98  208:aload_1         
	//*  99  209:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//* 100  212:aload           4
	//* 101  214:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//* 102  217:invokevirtual   #463 <Method String StringBuilder.toString()>
	//* 103  220:invokeinterface #512 <Method boolean Map.containsKey(Object)>
	//* 104  225:ifeq            240
			throw new XMPException("Actual property is already an alias, use the base property", 4);
	//  105  228:new             #20  <Class XMPException>
	//  106  231:dup             
	//  107  232:ldc2            #516 <String "Actual property is already an alias, use the base property">
	//  108  235:iconst_4        
	//  109  236:invokespecial   #505 <Method void XMPException(String, int)>
	//  110  239:athrow          
		actualPrefix = ((String) (new XMPAliasInfo() {

			public AliasOptions getAliasForm()
			{
				return aliasOpts;
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field AliasOptions val$aliasOpts>
			//    2    4:areturn         
			}

			public String getNamespace()
			{
				return actualNS;
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field String val$actualNS>
			//    2    4:areturn         
			}

			public String getPrefix()
			{
				return actualPrefix;
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field String val$actualPrefix>
			//    2    4:areturn         
			}

			public String getPropName()
			{
				return actualProp;
			//    0    0:aload_0         
			//    1    1:getfield        #29  <Field String val$actualProp>
			//    2    4:areturn         
			}

			public String toString()
			{
				return (new StringBuilder()).append(actualPrefix).append(actualProp).append(" NS(").append(actualNS).append("), FORM (").append(((Object) (getAliasForm()))).append(")").toString();
			//    0    0:new             #44  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #45  <Method void StringBuilder()>
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field String val$actualPrefix>
			//    5   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//    6   14:aload_0         
			//    7   15:getfield        #29  <Field String val$actualProp>
			//    8   18:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//    9   21:ldc1            #51  <String " NS(">
			//   10   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   11   26:aload_0         
			//   12   27:getfield        #25  <Field String val$actualNS>
			//   13   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   14   33:ldc1            #53  <String "), FORM (">
			//   15   35:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   16   38:aload_0         
			//   17   39:invokevirtual   #55  <Method AliasOptions getAliasForm()>
			//   18   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
			//   19   45:ldc1            #60  <String ")">
			//   20   47:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   21   50:invokevirtual   #62  <Method String StringBuilder.toString()>
			//   22   53:areturn         
			}

			final XMPSchemaRegistryImpl this$0;
			final String val$actualNS;
			final String val$actualPrefix;
			final String val$actualProp;
			final AliasOptions val$aliasOpts;

			
			{
				this$0 = XMPSchemaRegistryImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field XMPSchemaRegistryImpl this$0>
				actualNS = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$actualNS>
				actualPrefix = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$actualPrefix>
				actualProp = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field String val$actualProp>
				aliasOpts = aliasoptions;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #31  <Field AliasOptions val$aliasOpts>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void Object()>
			//   17   31:return          
			}
		}
));
	//  111  240:new             #10  <Class XMPSchemaRegistryImpl$1>
	//  112  243:dup             
	//  113  244:aload_0         
	//  114  245:aload_3         
	//  115  246:aload_1         
	//  116  247:aload           4
	//  117  249:aload           5
	//  118  251:invokespecial   #519 <Method void XMPSchemaRegistryImpl$1(XMPSchemaRegistryImpl, String, String, String, AliasOptions)>
	//  119  254:astore_1        
		aliasMap.put(((Object) (s)), ((Object) (actualPrefix)));
	//  120  255:aload_0         
	//  121  256:getfield        #31  <Field Map aliasMap>
	//  122  259:aload_2         
	//  123  260:aload_1         
	//  124  261:invokeinterface #523 <Method Object Map.put(Object, Object)>
	//  125  266:pop             
		this;
	//  126  267:aload_0         
		JVM INSTR monitorexit ;
	//  127  268:monitorexit     
	//  128  269:return          
	}

	public String registerNamespace(String s, String s1)
		throws XMPException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ParameterAsserts.assertSchemaNS(s);
	//    2    2:aload_1         
	//    3    3:invokestatic    #470 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPrefix(s1);
	//    4    6:aload_2         
	//    5    7:invokestatic    #526 <Method void ParameterAsserts.assertPrefix(String)>
		String s2 = s1;
	//    6   10:aload_2         
	//    7   11:astore          4
		if(s1.charAt(s1.length() - 1) != ':')
	//*   8   13:aload_2         
	//*   9   14:aload_2         
	//*  10   15:invokevirtual   #529 <Method int String.length()>
	//*  11   18:iconst_1        
	//*  12   19:isub            
	//*  13   20:invokevirtual   #533 <Method char String.charAt(int)>
	//*  14   23:bipush          58
	//*  15   25:icmpeq          49
			s2 = (new StringBuilder()).append(s1).append(':').toString();
	//   16   28:new             #454 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #455 <Method void StringBuilder()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:bipush          58
	//   22   41:invokevirtual   #536 <Method StringBuilder StringBuilder.append(char)>
	//   23   44:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   24   47:astore          4
		if(!Utils.isXMLNameNS(s2.substring(0, s2.length() - 1)))
	//*  25   49:aload           4
	//*  26   51:iconst_0        
	//*  27   52:aload           4
	//*  28   54:invokevirtual   #529 <Method int String.length()>
	//*  29   57:iconst_1        
	//*  30   58:isub            
	//*  31   59:invokevirtual   #540 <Method String String.substring(int, int)>
	//*  32   62:invokestatic    #545 <Method boolean Utils.isXMLNameNS(String)>
	//*  33   65:ifne            87
			throw new XMPException("The prefix is a bad XML name", 201);
	//   34   68:new             #20  <Class XMPException>
	//   35   71:dup             
	//   36   72:ldc2            #547 <String "The prefix is a bad XML name">
	//   37   75:sipush          201
	//   38   78:invokespecial   #505 <Method void XMPException(String, int)>
	//   39   81:athrow          
		break MISSING_BLOCK_LABEL_87;
		s;
	//   40   82:astore_1        
		this;
	//   41   83:aload_0         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		throw s;
	//   43   85:aload_1         
	//   44   86:athrow          
		String s3;
		s1 = (String)namespaceToPrefixMap.get(((Object) (s)));
	//   45   87:aload_0         
	//   46   88:getfield        #27  <Field Map namespaceToPrefixMap>
	//   47   91:aload_1         
	//   48   92:invokeinterface #382 <Method Object Map.get(Object)>
	//   49   97:checkcast       #411 <Class String>
	//   50  100:astore_2        
		s3 = (String)prefixToNamespaceMap.get(((Object) (s2)));
	//   51  101:aload_0         
	//   52  102:getfield        #29  <Field Map prefixToNamespaceMap>
	//   53  105:aload           4
	//   54  107:invokeinterface #382 <Method Object Map.get(Object)>
	//   55  112:checkcast       #411 <Class String>
	//   56  115:astore          5
		if(s1 == null) goto _L2; else goto _L1
	//   57  117:aload_2         
	//   58  118:ifnull          127
_L1:
		s = s1;
	//   59  121:aload_2         
	//   60  122:astore_1        
_L7:
		this;
	//   61  123:aload_0         
		JVM INSTR monitorexit ;
	//   62  124:monitorexit     
		return s;
	//   63  125:aload_1         
	//   64  126:areturn         
_L2:
		s1 = s2;
	//   65  127:aload           4
	//   66  129:astore_2        
		if(s3 == null) goto _L4; else goto _L3
	//   67  130:aload           5
	//   68  132:ifnull          203
_L3:
		int i;
		s1 = s2;
	//   69  135:aload           4
	//   70  137:astore_2        
		i = 1;
	//   71  138:iconst_1        
	//   72  139:istore_3        
_L5:
		if(!prefixToNamespaceMap.containsKey(((Object) (s1))))
			break; /* Loop/switch isn't completed */
	//   73  140:aload_0         
	//   74  141:getfield        #29  <Field Map prefixToNamespaceMap>
	//   75  144:aload_2         
	//   76  145:invokeinterface #512 <Method boolean Map.containsKey(Object)>
	//   77  150:ifeq            232
		s1 = (new StringBuilder()).append(s2.substring(0, s2.length() - 1)).append("_").append(i).append("_:").toString();
	//   78  153:new             #454 <Class StringBuilder>
	//   79  156:dup             
	//   80  157:invokespecial   #455 <Method void StringBuilder()>
	//   81  160:aload           4
	//   82  162:iconst_0        
	//   83  163:aload           4
	//   84  165:invokevirtual   #529 <Method int String.length()>
	//   85  168:iconst_1        
	//   86  169:isub            
	//   87  170:invokevirtual   #540 <Method String String.substring(int, int)>
	//   88  173:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   89  176:ldc2            #549 <String "_">
	//   90  179:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   91  182:iload_3         
	//   92  183:invokevirtual   #552 <Method StringBuilder StringBuilder.append(int)>
	//   93  186:ldc2            #554 <String "_:">
	//   94  189:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   95  192:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   96  195:astore_2        
		i++;
	//   97  196:iload_3         
	//   98  197:iconst_1        
	//   99  198:iadd            
	//  100  199:istore_3        
		if(true) goto _L5; else goto _L4
	//  101  200:goto            140
_L4:
		prefixToNamespaceMap.put(((Object) (s1)), ((Object) (s)));
	//  102  203:aload_0         
	//  103  204:getfield        #29  <Field Map prefixToNamespaceMap>
	//  104  207:aload_2         
	//  105  208:aload_1         
	//  106  209:invokeinterface #523 <Method Object Map.put(Object, Object)>
	//  107  214:pop             
		namespaceToPrefixMap.put(((Object) (s)), ((Object) (s1)));
	//  108  215:aload_0         
	//  109  216:getfield        #27  <Field Map namespaceToPrefixMap>
	//  110  219:aload_1         
	//  111  220:aload_2         
	//  112  221:invokeinterface #523 <Method Object Map.put(Object, Object)>
	//  113  226:pop             
		s = s1;
	//  114  227:aload_2         
	//  115  228:astore_1        
		if(true) goto _L7; else goto _L6
	//  116  229:goto            123
_L6:
	//* 117  232:goto            203
	}

	public XMPAliasInfo resolveAlias(String s, String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = getNamespacePrefix(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #371 <Method String getNamespacePrefix(String)>
	//    5    7:astore_1        
		if(s != null) goto _L2; else goto _L1
	//    6    8:aload_1         
	//    7    9:ifnonnull       18
_L1:
		s = null;
	//    8   12:aconst_null     
	//    9   13:astore_1        
_L4:
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return ((XMPAliasInfo) (s));
	//   12   16:aload_1         
	//   13   17:areturn         
_L2:
		s = ((String) ((XMPAliasInfo)aliasMap.get(((Object) ((new StringBuilder()).append(s).append(s1).toString())))));
	//   14   18:aload_0         
	//   15   19:getfield        #31  <Field Map aliasMap>
	//   16   22:new             #454 <Class StringBuilder>
	//   17   25:dup             
	//   18   26:invokespecial   #455 <Method void StringBuilder()>
	//   19   29:aload_1         
	//   20   30:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   21   33:aload_2         
	//   22   34:invokevirtual   #459 <Method StringBuilder StringBuilder.append(String)>
	//   23   37:invokevirtual   #463 <Method String StringBuilder.toString()>
	//   24   40:invokeinterface #382 <Method Object Map.get(Object)>
	//   25   45:checkcast       #384 <Class XMPAliasInfo>
	//   26   48:astore_1        
		if(true) goto _L4; else goto _L3
	//   27   49:goto            14
_L3:
		s;
	//   28   52:astore_1        
	//*  29   53:aload_0         
		throw s;
	//   30   54:monitorexit     
	//   31   55:aload_1         
	//   32   56:athrow          
	}

	private Map aliasMap;
	private Map namespaceToPrefixMap;
	private Pattern p;
	private Map prefixToNamespaceMap;
}
