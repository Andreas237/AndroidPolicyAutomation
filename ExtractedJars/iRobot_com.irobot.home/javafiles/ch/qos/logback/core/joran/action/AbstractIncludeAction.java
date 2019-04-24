// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.*;
import java.net.*;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public abstract class AbstractIncludeAction extends Action
{

	public AbstractIncludeAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Action()>
	//    2    4:return          
	}

	private URL attributeToURL(String s)
	{
		Object obj;
		obj = ((Object) (new URL(s)));
	//    0    0:new             #34  <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #37  <Method void URL(String)>
	//    4    8:astore_2        
		((URL) (obj)).openStream().close();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #41  <Method InputStream URL.openStream()>
	//    7   13:invokevirtual   #46  <Method void InputStream.close()>
		return ((URL) (obj));
	//    8   16:aload_2         
	//    9   17:areturn         
		Object obj1;
		obj1;
	//   10   18:astore          4
		if(optional) goto _L2; else goto _L1
	//   11   20:aload_0         
	//   12   21:getfield        #48  <Field boolean optional>
	//   13   24:ifne            111
_L1:
		String s1;
		obj = ((Object) (new StringBuilder()));
	//   14   27:new             #50  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #51  <Method void StringBuilder()>
	//   17   34:astore_2        
		((StringBuilder) (obj)).append("URL [");
	//   18   35:aload_2         
	//   19   36:ldc1            #53  <String "URL [">
	//   20   38:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		((StringBuilder) (obj)).append(s);
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		s1 = "] cannot be opened.";
	//   26   48:ldc1            #59  <String "] cannot be opened.">
	//   27   50:astore_3        
		s = ((String) (obj1));
	//   28   51:aload           4
	//   29   53:astore_1        
_L3:
		((StringBuilder) (obj)).append(s1);
	//   30   54:aload_2         
	//   31   55:aload_3         
	//   32   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		handleError(((StringBuilder) (obj)).toString(), ((Exception) (s)));
	//   34   60:aload_0         
	//   35   61:aload_2         
	//   36   62:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   37   65:aload_1         
	//   38   66:invokevirtual   #67  <Method void handleError(String, Exception)>
		break; /* Loop/switch isn't completed */
	//   39   69:goto            111
		obj1;
	//   40   72:astore          4
		if(optional)
			break; /* Loop/switch isn't completed */
	//   41   74:aload_0         
	//   42   75:getfield        #48  <Field boolean optional>
	//   43   78:ifne            111
		obj = ((Object) (new StringBuilder()));
	//   44   81:new             #50  <Class StringBuilder>
	//   45   84:dup             
	//   46   85:invokespecial   #51  <Method void StringBuilder()>
	//   47   88:astore_2        
		((StringBuilder) (obj)).append("URL [");
	//   48   89:aload_2         
	//   49   90:ldc1            #53  <String "URL [">
	//   50   92:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
		((StringBuilder) (obj)).append(s);
	//   52   96:aload_2         
	//   53   97:aload_1         
	//   54   98:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
		s1 = "] is not well formed.";
	//   56  102:ldc1            #69  <String "] is not well formed.">
	//   57  104:astore_3        
		s = ((String) (obj1));
	//   58  105:aload           4
	//   59  107:astore_1        
		if(true) goto _L3; else goto _L2
	//   60  108:goto            54
_L2:
		return null;
	//   61  111:aconst_null     
	//   62  112:areturn         
	}

	private boolean checkAttributes(Attributes attributes)
	{
		int j;
		String s = attributes.getValue("file");
	//    0    0:aload_1         
	//    1    1:ldc1            #8   <String "file">
	//    2    3:invokeinterface #77  <Method String Attributes.getValue(String)>
	//    3    8:astore          4
		String s1 = attributes.getValue("url");
	//    4   10:aload_1         
	//    5   11:ldc1            #17  <String "url">
	//    6   13:invokeinterface #77  <Method String Attributes.getValue(String)>
	//    7   18:astore          5
		attributes = ((Attributes) (attributes.getValue("resource")));
	//    8   20:aload_1         
	//    9   21:ldc1            #14  <String "resource">
	//   10   23:invokeinterface #77  <Method String Attributes.getValue(String)>
	//   11   28:astore_1        
		if(!OptionHelper.isEmpty(s))
	//*  12   29:aload           4
	//*  13   31:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  14   34:ifne            42
			j = 1;
	//   15   37:iconst_1        
	//   16   38:istore_3        
		else
	//*  17   39:goto            44
			j = 0;
	//   18   42:iconst_0        
	//   19   43:istore_3        
		int i = j;
	//   20   44:iload_3         
	//   21   45:istore_2        
		if(!OptionHelper.isEmpty(s1))
	//*  22   46:aload           5
	//*  23   48:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  24   51:ifne            58
			i = j + 1;
	//   25   54:iload_3         
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore_2        
		j = i;
	//   29   58:iload_2         
	//   30   59:istore_3        
		if(!OptionHelper.isEmpty(((String) (attributes))))
	//*  31   60:aload_1         
	//*  32   61:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  33   64:ifne            71
			j = i + 1;
	//   34   67:iload_2         
	//   35   68:iconst_1        
	//   36   69:iadd            
	//   37   70:istore_3        
		if(j != 0) goto _L2; else goto _L1
	//   38   71:iload_3         
	//   39   72:ifne            115
_L1:
		Object aobj[];
		attributes = "One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.";
	//   40   75:ldc1            #85  <String "One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.">
	//   41   77:astore_1        
		aobj = new Object[3];
	//   42   78:iconst_3        
	//   43   79:anewarray       Object[]
	//   44   82:astore          4
		aobj[0] = "file";
	//   45   84:aload           4
	//   46   86:iconst_0        
	//   47   87:ldc1            #8   <String "file">
	//   48   89:aastore         
		aobj[1] = "resource";
	//   49   90:aload           4
	//   50   92:iconst_1        
	//   51   93:ldc1            #14  <String "resource">
	//   52   95:aastore         
		aobj[2] = "url";
	//   53   96:aload           4
	//   54   98:iconst_2        
	//   55   99:ldc1            #17  <String "url">
	//   56  101:aastore         
_L4:
		handleError(String.format(((String) (attributes)), aobj), ((Exception) (null)));
	//   57  102:aload_0         
	//   58  103:aload_1         
	//   59  104:aload           4
	//   60  106:invokestatic    #93  <Method String String.format(String, Object[])>
	//   61  109:aconst_null     
	//   62  110:invokevirtual   #67  <Method void handleError(String, Exception)>
		return false;
	//   63  113:iconst_0        
	//   64  114:ireturn         
_L2:
		if(j <= 1)
			break; /* Loop/switch isn't completed */
	//   65  115:iload_3         
	//   66  116:iconst_1        
	//   67  117:icmple          150
		attributes = "Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.";
	//   68  120:ldc1            #95  <String "Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.">
	//   69  122:astore_1        
		aobj = new Object[3];
	//   70  123:iconst_3        
	//   71  124:anewarray       Object[]
	//   72  127:astore          4
		aobj[0] = "file";
	//   73  129:aload           4
	//   74  131:iconst_0        
	//   75  132:ldc1            #8   <String "file">
	//   76  134:aastore         
		aobj[1] = "resource";
	//   77  135:aload           4
	//   78  137:iconst_1        
	//   79  138:ldc1            #14  <String "resource">
	//   80  140:aastore         
		aobj[2] = "url";
	//   81  141:aload           4
	//   82  143:iconst_2        
	//   83  144:ldc1            #17  <String "url">
	//   84  146:aastore         
		if(true) goto _L4; else goto _L3
	//   85  147:goto            102
_L3:
		if(j == 1)
	//*  86  150:iload_3         
	//*  87  151:iconst_1        
	//*  88  152:icmpne          157
		{
			return true;
	//   89  155:iconst_1        
	//   90  156:ireturn         
		} else
		{
			attributes = ((Attributes) (new StringBuilder()));
	//   91  157:new             #50  <Class StringBuilder>
	//   92  160:dup             
	//   93  161:invokespecial   #51  <Method void StringBuilder()>
	//   94  164:astore_1        
			((StringBuilder) (attributes)).append("Count value [");
	//   95  165:aload_1         
	//   96  166:ldc1            #97  <String "Count value [">
	//   97  168:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   98  171:pop             
			((StringBuilder) (attributes)).append(j);
	//   99  172:aload_1         
	//  100  173:iload_3         
	//  101  174:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//  102  177:pop             
			((StringBuilder) (attributes)).append("] is not expected");
	//  103  178:aload_1         
	//  104  179:ldc1            #102 <String "] is not expected">
	//  105  181:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  106  184:pop             
			throw new IllegalStateException(((StringBuilder) (attributes)).toString());
	//  107  185:new             #104 <Class IllegalStateException>
	//  108  188:dup             
	//  109  189:aload_1         
	//  110  190:invokevirtual   #63  <Method String StringBuilder.toString()>
	//  111  193:invokespecial   #105 <Method void IllegalStateException(String)>
	//  112  196:athrow          
		}
	}

	private URL filePathAsURL(String s)
	{
		File file = new File(s);
	//    0    0:new             #108 <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #109 <Method void File(String)>
	//    4    8:astore_2        
		if(file.exists() && file.isFile())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #113 <Method boolean File.exists()>
	//*   7   13:ifeq            45
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #116 <Method boolean File.isFile()>
	//*  10   20:ifne            26
	//*  11   23:goto            45
		{
			s = ((String) (file.toURI()));
	//   12   26:aload_2         
	//   13   27:invokevirtual   #120 <Method URI File.toURI()>
	//   14   30:astore_1        
			try
			{
				s = ((String) (((URI) (s)).toURL()));
	//   15   31:aload_1         
	//   16   32:invokevirtual   #126 <Method URL URI.toURL()>
	//   17   35:astore_1        
			}
	//*  18   36:aload_1         
	//*  19   37:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  20   38:astore_1        
			{
				((MalformedURLException) (s)).printStackTrace();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #129 <Method void MalformedURLException.printStackTrace()>
				return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
			}
			return ((URL) (s));
		}
		if(!optional)
	//*  25   45:aload_0         
	//*  26   46:getfield        #48  <Field boolean optional>
	//*  27   49:ifne            96
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   52:new             #50  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #51  <Method void StringBuilder()>
	//   31   59:astore_2        
			stringbuilder.append("File does not exist [");
	//   32   60:aload_2         
	//   33   61:ldc1            #131 <String "File does not exist [">
	//   34   63:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			stringbuilder.append(s);
	//   36   67:aload_2         
	//   37   68:aload_1         
	//   38   69:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   39   72:pop             
			stringbuilder.append("]");
	//   40   73:aload_2         
	//   41   74:ldc1            #133 <String "]">
	//   42   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
			handleError(stringbuilder.toString(), ((Exception) (new FileNotFoundException(s))));
	//   44   80:aload_0         
	//   45   81:aload_2         
	//   46   82:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   47   85:new             #135 <Class FileNotFoundException>
	//   48   88:dup             
	//   49   89:aload_1         
	//   50   90:invokespecial   #136 <Method void FileNotFoundException(String)>
	//   51   93:invokevirtual   #67  <Method void handleError(String, Exception)>
		}
		return null;
	//   52   96:aconst_null     
	//   53   97:areturn         
	}

	private URL getInputURL(InterpretationContext interpretationcontext, Attributes attributes)
	{
		String s = attributes.getValue("file");
	//    0    0:aload_2         
	//    1    1:ldc1            #8   <String "file">
	//    2    3:invokeinterface #77  <Method String Attributes.getValue(String)>
	//    3    8:astore_3        
		String s1 = attributes.getValue("url");
	//    4    9:aload_2         
	//    5   10:ldc1            #17  <String "url">
	//    6   12:invokeinterface #77  <Method String Attributes.getValue(String)>
	//    7   17:astore          4
		attributes = ((Attributes) (attributes.getValue("resource")));
	//    8   19:aload_2         
	//    9   20:ldc1            #14  <String "resource">
	//   10   22:invokeinterface #77  <Method String Attributes.getValue(String)>
	//   11   27:astore_2        
		if(!OptionHelper.isEmpty(s))
	//*  12   28:aload_3         
	//*  13   29:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  14   32:ifne            53
		{
			attributeInUse = interpretationcontext.subst(s);
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:aload_3         
	//   18   38:invokevirtual   #143 <Method String InterpretationContext.subst(String)>
	//   19   41:putfield        #145 <Field String attributeInUse>
			return filePathAsURL(attributeInUse);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #145 <Field String attributeInUse>
	//   23   49:invokespecial   #147 <Method URL filePathAsURL(String)>
	//   24   52:areturn         
		}
		if(!OptionHelper.isEmpty(s1))
	//*  25   53:aload           4
	//*  26   55:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  27   58:ifne            80
		{
			attributeInUse = interpretationcontext.subst(s1);
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:aload           4
	//   31   65:invokevirtual   #143 <Method String InterpretationContext.subst(String)>
	//   32   68:putfield        #145 <Field String attributeInUse>
			return attributeToURL(attributeInUse);
	//   33   71:aload_0         
	//   34   72:aload_0         
	//   35   73:getfield        #145 <Field String attributeInUse>
	//   36   76:invokespecial   #149 <Method URL attributeToURL(String)>
	//   37   79:areturn         
		}
		if(!OptionHelper.isEmpty(((String) (attributes))))
	//*  38   80:aload_2         
	//*  39   81:invokestatic    #83  <Method boolean OptionHelper.isEmpty(String)>
	//*  40   84:ifne            105
		{
			attributeInUse = interpretationcontext.subst(((String) (attributes)));
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:aload_2         
	//   44   90:invokevirtual   #143 <Method String InterpretationContext.subst(String)>
	//   45   93:putfield        #145 <Field String attributeInUse>
			return resourceAsURL(attributeInUse);
	//   46   96:aload_0         
	//   47   97:aload_0         
	//   48   98:getfield        #145 <Field String attributeInUse>
	//   49  101:invokespecial   #152 <Method URL resourceAsURL(String)>
	//   50  104:areturn         
		} else
		{
			throw new IllegalStateException("A URL stream should have been returned");
	//   51  105:new             #104 <Class IllegalStateException>
	//   52  108:dup             
	//   53  109:ldc1            #154 <String "A URL stream should have been returned">
	//   54  111:invokespecial   #105 <Method void IllegalStateException(String)>
	//   55  114:athrow          
		}
	}

	private URL resourceAsURL(String s)
	{
		Object obj = ((Object) (Loader.getResourceBySelfClassLoader(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #159 <Method URL Loader.getResourceBySelfClassLoader(String)>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       55
		{
			if(!optional)
	//*   5    9:aload_0         
	//*   6   10:getfield        #48  <Field boolean optional>
	//*   7   13:ifne            53
			{
				obj = ((Object) (new StringBuilder()));
	//    8   16:new             #50  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void StringBuilder()>
	//   11   23:astore_2        
				((StringBuilder) (obj)).append("Could not find resource corresponding to [");
	//   12   24:aload_2         
	//   13   25:ldc1            #161 <String "Could not find resource corresponding to [">
	//   14   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
				((StringBuilder) (obj)).append(s);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
				((StringBuilder) (obj)).append("]");
	//   20   37:aload_2         
	//   21   38:ldc1            #133 <String "]">
	//   22   40:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
				handleError(((StringBuilder) (obj)).toString(), ((Exception) (null)));
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   27   49:aconst_null     
	//   28   50:invokevirtual   #67  <Method void handleError(String, Exception)>
			}
			return null;
	//   29   53:aconst_null     
	//   30   54:areturn         
		} else
		{
			return ((URL) (obj));
	//   31   55:aload_2         
	//   32   56:areturn         
		}
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		attributeInUse = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #145 <Field String attributeInUse>
		optional = OptionHelper.toBoolean(attributes.getValue("optional"), false);
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:ldc1            #11  <String "optional">
	//    6    9:invokeinterface #77  <Method String Attributes.getValue(String)>
	//    7   14:iconst_0        
	//    8   15:invokestatic    #169 <Method boolean OptionHelper.toBoolean(String, boolean)>
	//    9   18:putfield        #48  <Field boolean optional>
		if(!checkAttributes(attributes))
	//*  10   21:aload_0         
	//*  11   22:aload_3         
	//*  12   23:invokespecial   #171 <Method boolean checkAttributes(Attributes)>
	//*  13   26:ifne            30
			return;
	//   14   29:return          
		s = ((String) (getInputURL(interpretationcontext, attributes)));
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:aload_3         
	//   18   33:invokespecial   #173 <Method URL getInputURL(InterpretationContext, Attributes)>
	//   19   36:astore_2        
		if(s != null)
	//*  20   37:aload_2         
	//*  21   38:ifnull          82
		{
			try
			{
				processInclude(interpretationcontext, ((URL) (s)));
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #177 <Method void processInclude(InterpretationContext, URL)>
				return;
	//   26   47:return          
			}
			// Misplaced declaration of an exception variable
			catch(InterpretationContext interpretationcontext)
	//*  27   48:astore_1        
			{
				s = ((String) (new StringBuilder()));
	//   28   49:new             #50  <Class StringBuilder>
	//   29   52:dup             
	//   30   53:invokespecial   #51  <Method void StringBuilder()>
	//   31   56:astore_2        
			}
			((StringBuilder) (s)).append("Error while parsing ");
	//   32   57:aload_2         
	//   33   58:ldc1            #179 <String "Error while parsing ">
	//   34   60:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
			((StringBuilder) (s)).append(attributeInUse);
	//   36   64:aload_2         
	//   37   65:aload_0         
	//   38   66:getfield        #145 <Field String attributeInUse>
	//   39   69:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   40   72:pop             
			handleError(((StringBuilder) (s)).toString(), ((Exception) (interpretationcontext)));
	//   41   73:aload_0         
	//   42   74:aload_2         
	//   43   75:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   44   78:aload_1         
	//   45   79:invokevirtual   #67  <Method void handleError(String, Exception)>
		}
		return;
	//   46   82:return          
	}

	protected void close(InputStream inputstream)
	{
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_8;
	//    0    0:aload_1         
	//    1    1:ifnull          8
		inputstream.close();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void InputStream.close()>
		return;
	//    4    8:return          
		inputstream;
	//    5    9:astore_1        
	//    6   10:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	protected String getAttributeInUse()
	{
		return attributeInUse;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field String attributeInUse>
	//    2    4:areturn         
	}

	public URL getUrl()
	{
		return urlInUse;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field URL urlInUse>
	//    2    4:areturn         
	}

	protected void handleError(String s, Exception exception)
	{
		addError(s, ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #190 <Method void addError(String, Throwable)>
	//    4    6:return          
	}

	protected boolean isOptional()
	{
		return optional;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean optional>
	//    2    4:ireturn         
	}

	protected abstract void processInclude(InterpretationContext interpretationcontext, URL url);

	private static final String FILE_ATTR = "file";
	private static final String OPTIONAL_ATTR = "optional";
	private static final String RESOURCE_ATTR = "resource";
	private static final String URL_ATTR = "url";
	private String attributeInUse;
	private boolean optional;
	private URL urlInUse;
}
