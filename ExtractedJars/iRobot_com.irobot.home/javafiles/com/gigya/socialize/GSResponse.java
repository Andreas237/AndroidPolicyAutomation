// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.gigya.socialize:
//			GSLogger, GSObject, GSArray

public class GSResponse
{

	public GSResponse(String s, GSObject gsobject, int i, GSLogger gslogger)
	{
		this(s, gsobject, i, getErrorMessage(i), gslogger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload_3         
	//    5    5:invokestatic    #57  <Method String getErrorMessage(int)>
	//    6    8:aload           4
	//    7   10:invokespecial   #60  <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//    8   13:return          
	}

	public GSResponse(String s, GSObject gsobject, int i, String s1, GSLogger gslogger)
	{
		this(s, gsobject, i, s1, ((String) (null)), gslogger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aload           5
	//    7    9:invokespecial   #63  <Method void GSResponse(String, GSObject, int, String, String, GSLogger)>
	//    8   12:return          
	}

	public GSResponse(String s, GSObject gsobject, int i, String s1, String s2, GSLogger gslogger)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
			errorCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #66  <Field int errorCode>
			errorMessage = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String errorMessage>
			errorDetails = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String errorDetails>
			responseText = "";
	//   11   19:aload_0         
	//   12   20:ldc1            #72  <String "">
	//   13   22:putfield        #74  <Field String responseText>
			data = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #76  <Field GSObject data>
			headers = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #78  <Field Map headers>
			logger = new GSLogger();
	//   20   35:aload_0         
	//   21   36:new             #80  <Class GSLogger>
	//   22   39:dup             
	//   23   40:invokespecial   #81  <Method void GSLogger()>
	//   24   43:putfield        #83  <Field GSLogger logger>
			logger.write(((Object) (gslogger)));
	//   25   46:aload_0         
	//   26   47:getfield        #83  <Field GSLogger logger>
	//   27   50:aload           6
	//   28   52:invokevirtual   #87  <Method void GSLogger.write(Object)>
			if(s1 != null)
	//*  29   55:aload           4
	//*  30   57:ifnull          72
			{
				gslogger = ((GSLogger) (s1));
	//   31   60:aload           4
	//   32   62:astore          6
				if(s1.length() != 0)
					break label0;
	//   33   64:aload           4
	//   34   66:invokevirtual   #93  <Method int String.length()>
	//   35   69:ifne            78
			}
			gslogger = ((GSLogger) (getErrorMessage(i)));
	//   36   72:iload_3         
	//   37   73:invokestatic    #57  <Method String getErrorMessage(int)>
	//   38   76:astore          6
		}
		s1 = "json";
	//   39   78:ldc1            #95  <String "json">
	//   40   80:astore          4
		if(gsobject != null)
	//*  41   82:aload_2         
	//*  42   83:ifnull          99
			s1 = gsobject.getString("format", "json").toLowerCase();
	//   43   86:aload_2         
	//   44   87:ldc1            #97  <String "format">
	//   45   89:ldc1            #95  <String "json">
	//   46   91:invokevirtual   #103 <Method String GSObject.getString(String, String)>
	//   47   94:invokevirtual   #107 <Method String String.toLowerCase()>
	//   48   97:astore          4
		if(s1.equals("xml"))
	//*  49   99:aload           4
	//*  50  101:ldc1            #109 <String "xml">
	//*  51  103:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  52  106:ifeq            121
			responseText = getErrorResponseXML(s, gsobject, i, ((String) (gslogger)));
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:aload_2         
	//   56  112:iload_3         
	//   57  113:aload           6
	//   58  115:invokestatic    #117 <Method String getErrorResponseXML(String, GSObject, int, String)>
	//   59  118:putfield        #74  <Field String responseText>
		if(gsobject != null && i != 0)
	//*  60  121:aload_2         
	//*  61  122:ifnull          136
	//*  62  125:iload_3         
	//*  63  126:ifeq            136
			gsobject.put("errorCode", i);
	//   64  129:aload_2         
	//   65  130:ldc1            #118 <String "errorCode">
	//   66  132:iload_3         
	//   67  133:invokevirtual   #121 <Method void GSObject.put(String, int)>
		data = gsobject;
	//   68  136:aload_0         
	//   69  137:aload_2         
	//   70  138:putfield        #76  <Field GSObject data>
		errorCode = i;
	//   71  141:aload_0         
	//   72  142:iload_3         
	//   73  143:putfield        #66  <Field int errorCode>
		errorMessage = ((String) (gslogger));
	//   74  146:aload_0         
	//   75  147:aload           6
	//   76  149:putfield        #68  <Field String errorMessage>
		errorDetails = s2;
	//   77  152:aload_0         
	//   78  153:aload           5
	//   79  155:putfield        #70  <Field String errorDetails>
	//   80  158:return          
	}

	protected GSResponse(String s, String s1, GSLogger gslogger)
	{
label0:
		{
label1:
			{
				super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
				errorCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #66  <Field int errorCode>
				errorMessage = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #68  <Field String errorMessage>
				errorDetails = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #70  <Field String errorDetails>
				responseText = "";
	//   11   19:aload_0         
	//   12   20:ldc1            #72  <String "">
	//   13   22:putfield        #74  <Field String responseText>
				data = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #76  <Field GSObject data>
				headers = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #78  <Field Map headers>
				logger = new GSLogger();
	//   20   35:aload_0         
	//   21   36:new             #80  <Class GSLogger>
	//   22   39:dup             
	//   23   40:invokespecial   #81  <Method void GSLogger()>
	//   24   43:putfield        #83  <Field GSLogger logger>
				logger.write(((Object) (gslogger)));
	//   25   46:aload_0         
	//   26   47:getfield        #83  <Field GSLogger logger>
	//   27   50:aload_3         
	//   28   51:invokevirtual   #87  <Method void GSLogger.write(Object)>
				responseText = s1.trim();
	//   29   54:aload_0         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #127 <Method String String.trim()>
	//   32   59:putfield        #74  <Field String responseText>
				if(s1 == null)
					break label0;
	//   33   62:aload_2         
	//   34   63:ifnull          235
				if(s1.length() == 0)
	//*  35   66:aload_2         
	//*  36   67:invokevirtual   #93  <Method int String.length()>
	//*  37   70:ifne            74
					return;
	//   38   73:return          
				if(s1.startsWith("{"))
	//*  39   74:aload_2         
	//*  40   75:ldc1            #129 <String "{">
	//*  41   77:invokevirtual   #133 <Method boolean String.startsWith(String)>
	//*  42   80:ifeq            156
				{
					try
					{
						data = new GSObject(s1);
	//   43   83:aload_0         
	//   44   84:new             #99  <Class GSObject>
	//   45   87:dup             
	//   46   88:aload_2         
	//   47   89:invokespecial   #136 <Method void GSObject(String)>
	//   48   92:putfield        #76  <Field GSObject data>
						errorCode = data.getInt("errorCode", 0);
	//   49   95:aload_0         
	//   50   96:aload_0         
	//   51   97:getfield        #76  <Field GSObject data>
	//   52  100:ldc1            #118 <String "errorCode">
	//   53  102:iconst_0        
	//   54  103:invokevirtual   #140 <Method int GSObject.getInt(String, int)>
	//   55  106:putfield        #66  <Field int errorCode>
						errorMessage = data.getString("errorMessage", ((String) (null)));
	//   56  109:aload_0         
	//   57  110:aload_0         
	//   58  111:getfield        #76  <Field GSObject data>
	//   59  114:ldc1            #141 <String "errorMessage">
	//   60  116:aconst_null     
	//   61  117:invokevirtual   #103 <Method String GSObject.getString(String, String)>
	//   62  120:putfield        #68  <Field String errorMessage>
						errorDetails = data.getString("errorDetails", ((String) (null)));
	//   63  123:aload_0         
	//   64  124:aload_0         
	//   65  125:getfield        #76  <Field GSObject data>
	//   66  128:ldc1            #142 <String "errorDetails">
	//   67  130:aconst_null     
	//   68  131:invokevirtual   #103 <Method String GSObject.getString(String, String)>
	//   69  134:putfield        #70  <Field String errorDetails>
						break label1;
	//   70  137:goto            193
					}
					// Misplaced declaration of an exception variable
					catch(String s)
	//*  71  140:astore_1        
					{
						errorCode = 500;
	//   72  141:aload_0         
	//   73  142:sipush          500
	//   74  145:putfield        #66  <Field int errorCode>
						s = ((Exception) (s)).getMessage();
	//   75  148:aload_1         
	//   76  149:invokevirtual   #145 <Method String Exception.getMessage()>
	//   77  152:astore_1        
					}
				} else
	//*  78  153:goto            188
				{
					s = getStringBetween(s1, "<errorCode>", "</errorCode>");
	//   79  156:aload_0         
	//   80  157:aload_2         
	//   81  158:ldc1            #147 <String "<errorCode>">
	//   82  160:ldc1            #149 <String "</errorCode>">
	//   83  162:invokespecial   #153 <Method String getStringBetween(String, String, String)>
	//   84  165:astore_1        
					if(s == null)
						break label1;
	//   85  166:aload_1         
	//   86  167:ifnull          193
					errorCode = Integer.parseInt(s);
	//   87  170:aload_0         
	//   88  171:aload_1         
	//   89  172:invokestatic    #157 <Method int Integer.parseInt(String)>
	//   90  175:putfield        #66  <Field int errorCode>
					s = getStringBetween(s1, "<errorMessage>", "</errorMessage>");
	//   91  178:aload_0         
	//   92  179:aload_2         
	//   93  180:ldc1            #159 <String "<errorMessage>">
	//   94  182:ldc1            #161 <String "</errorMessage>">
	//   95  184:invokespecial   #153 <Method String getStringBetween(String, String, String)>
	//   96  187:astore_1        
				}
				errorMessage = s;
	//   97  188:aload_0         
	//   98  189:aload_1         
	//   99  190:putfield        #68  <Field String errorMessage>
			}
			logger.write("errorCode", ((Object) (Integer.valueOf(errorCode))));
	//  100  193:aload_0         
	//  101  194:getfield        #83  <Field GSLogger logger>
	//  102  197:ldc1            #118 <String "errorCode">
	//  103  199:aload_0         
	//  104  200:getfield        #66  <Field int errorCode>
	//  105  203:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  106  206:invokevirtual   #164 <Method void GSLogger.write(String, Object)>
			logger.write("errorMessage", ((Object) (errorMessage)));
	//  107  209:aload_0         
	//  108  210:getfield        #83  <Field GSLogger logger>
	//  109  213:ldc1            #141 <String "errorMessage">
	//  110  215:aload_0         
	//  111  216:getfield        #68  <Field String errorMessage>
	//  112  219:invokevirtual   #164 <Method void GSLogger.write(String, Object)>
			logger.write("errorDetails", ((Object) (errorDetails)));
	//  113  222:aload_0         
	//  114  223:getfield        #83  <Field GSLogger logger>
	//  115  226:ldc1            #142 <String "errorDetails">
	//  116  228:aload_0         
	//  117  229:getfield        #70  <Field String errorDetails>
	//  118  232:invokevirtual   #164 <Method void GSLogger.write(String, Object)>
		}
	//  119  235:return          
	}

	public static String getErrorMessage(int i)
	{
		if(errorMsgDic.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:getstatic       #32  <Field TreeMap errorMsgDic>
	//*   1    3:iload_0         
	//*   2    4:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//*   3    7:invokevirtual   #167 <Method boolean TreeMap.containsKey(Object)>
	//*   4   10:ifeq            33
		{
			String s = (String)errorMsgDic.get(((Object) (Integer.valueOf(i))));
	//    5   13:getstatic       #32  <Field TreeMap errorMsgDic>
	//    6   16:iload_0         
	//    7   17:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    8   20:invokevirtual   #171 <Method Object TreeMap.get(Object)>
	//    9   23:checkcast       #89  <Class String>
	//   10   26:astore_1        
			if(s != null)
	//*  11   27:aload_1         
	//*  12   28:ifnull          33
				return s;
	//   13   31:aload_1         
	//   14   32:areturn         
		}
		return "";
	//   15   33:ldc1            #72  <String "">
	//   16   35:areturn         
	}

	private static String getErrorResponseXML(String s, GSObject gsobject, int i, String s1)
	{
		gsobject = ((GSObject) (new StringBuilder()));
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (gsobject)).append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
	//    4    8:aload_1         
	//    5    9:ldc1            #176 <String "<?xml version=\"1.0\" encoding=\"utf-8\"?>">
	//    6   11:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #173 <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #174 <Method void StringBuilder()>
	//   11   22:astore          4
		stringbuilder.append("<");
	//   12   24:aload           4
	//   13   26:ldc1            #182 <String "<">
	//   14   28:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(s);
	//   16   32:aload           4
	//   17   34:aload_0         
	//   18   35:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append("Response xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:com:gigya:api http://socialize-api.gigya.com/schema\" xmlns=\"urn:com:gigya:api\">");
	//   20   39:aload           4
	//   21   41:ldc1            #184 <String "Response xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:com:gigya:api http://socialize-api.gigya.com/schema\" xmlns=\"urn:com:gigya:api\">">
	//   22   43:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		((StringBuilder) (gsobject)).append(stringbuilder.toString());
	//   24   47:aload_1         
	//   25   48:aload           4
	//   26   50:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   27   53:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder = new StringBuilder();
	//   29   57:new             #173 <Class StringBuilder>
	//   30   60:dup             
	//   31   61:invokespecial   #174 <Method void StringBuilder()>
	//   32   64:astore          4
		stringbuilder.append("<errorCode>");
	//   33   66:aload           4
	//   34   68:ldc1            #147 <String "<errorCode>">
	//   35   70:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
		stringbuilder.append(i);
	//   37   74:aload           4
	//   38   76:iload_2         
	//   39   77:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//   40   80:pop             
		stringbuilder.append("</errorCode>");
	//   41   81:aload           4
	//   42   83:ldc1            #149 <String "</errorCode>">
	//   43   85:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
		((StringBuilder) (gsobject)).append(stringbuilder.toString());
	//   45   89:aload_1         
	//   46   90:aload           4
	//   47   92:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   48   95:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
		stringbuilder = new StringBuilder();
	//   50   99:new             #173 <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #174 <Method void StringBuilder()>
	//   53  106:astore          4
		stringbuilder.append("<errorMessage>");
	//   54  108:aload           4
	//   55  110:ldc1            #159 <String "<errorMessage>">
	//   56  112:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
		stringbuilder.append(s1);
	//   58  116:aload           4
	//   59  118:aload_3         
	//   60  119:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   61  122:pop             
		stringbuilder.append("</errorMessager>");
	//   62  123:aload           4
	//   63  125:ldc1            #192 <String "</errorMessager>">
	//   64  127:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   65  130:pop             
		((StringBuilder) (gsobject)).append(stringbuilder.toString());
	//   66  131:aload_1         
	//   67  132:aload           4
	//   68  134:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   69  137:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   70  140:pop             
		s1 = ((String) (new StringBuilder()));
	//   71  141:new             #173 <Class StringBuilder>
	//   72  144:dup             
	//   73  145:invokespecial   #174 <Method void StringBuilder()>
	//   74  148:astore_3        
		((StringBuilder) (s1)).append("</");
	//   75  149:aload_3         
	//   76  150:ldc1            #194 <String "</">
	//   77  152:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   78  155:pop             
		((StringBuilder) (s1)).append(s);
	//   79  156:aload_3         
	//   80  157:aload_0         
	//   81  158:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   82  161:pop             
		((StringBuilder) (s1)).append("Response>");
	//   83  162:aload_3         
	//   84  163:ldc1            #196 <String "Response>">
	//   85  165:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   86  168:pop             
		((StringBuilder) (gsobject)).append(((StringBuilder) (s1)).toString());
	//   87  169:aload_1         
	//   88  170:aload_3         
	//   89  171:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   90  174:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   91  177:pop             
		return ((StringBuilder) (gsobject)).toString();
	//   92  178:aload_1         
	//   93  179:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   94  182:areturn         
	}

	private String getStringBetween(String s, String s1, String s2)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          60
		{
			if(s.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #93  <Method int String.length()>
	//*   4    8:ifne            13
				return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
			int i = s.indexOf(s1);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #199 <Method int String.indexOf(String)>
	//   10   18:istore          4
			int j = s.indexOf(s2);
	//   11   20:aload_1         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #199 <Method int String.indexOf(String)>
	//   14   25:istore          5
			if(i != -1)
	//*  15   27:iload           4
	//*  16   29:iconst_m1       
	//*  17   30:icmpeq          60
				if(j == -1)
	//*  18   33:iload           5
	//*  19   35:iconst_m1       
	//*  20   36:icmpne          41
					return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
				else
					return s.subSequence(i + s1.length(), j).toString();
	//   23   41:aload_1         
	//   24   42:iload           4
	//   25   44:aload_2         
	//   26   45:invokevirtual   #93  <Method int String.length()>
	//   27   48:iadd            
	//   28   49:iload           5
	//   29   51:invokevirtual   #203 <Method CharSequence String.subSequence(int, int)>
	//   30   54:invokeinterface #206 <Method String CharSequence.toString()>
	//   31   59:areturn         
		}
		return null;
	//   32   60:aconst_null     
	//   33   61:areturn         
	}

	public GSArray getArray(String s, GSArray gsarray)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return gsarray;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return data.getArray(s, gsarray);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #210 <Method GSArray GSObject.getArray(String, GSArray)>
	//   10   18:areturn         
	}

	public boolean getBool(String s, boolean flag)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return flag;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return data.getBool(s, flag);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #214 <Method boolean GSObject.getBool(String, boolean)>
	//   10   18:ireturn         
	}

	public GSObject getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field GSObject data>
	//    2    4:areturn         
	}

	public double getDouble(String s, double d)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return d;
	//    3    7:dload_2         
	//    4    8:dreturn         
		else
			return data.getDouble(s, d);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:dload_2         
	//    9   15:invokevirtual   #220 <Method double GSObject.getDouble(String, double)>
	//   10   18:dreturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int errorCode>
	//    2    4:ireturn         
	}

	public String getErrorDetails()
	{
		return errorDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String errorDetails>
	//    2    4:areturn         
	}

	public String getErrorMessage()
	{
		return errorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String errorMessage>
	//    2    4:areturn         
	}

	public Map getHeaders()
	{
		return headers;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Map headers>
	//    2    4:areturn         
	}

	public int getInt(String s, int i)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return i;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return data.getInt(s, i);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #140 <Method int GSObject.getInt(String, int)>
	//   10   18:ireturn         
	}

	public String getLog()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("*********** GSResponse Log ***********\n");
	//    4    8:aload_1         
	//    5    9:ldc1            #8   <String "*********** GSResponse Log ***********\n">
	//    6   11:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(logger.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #83  <Field GSLogger logger>
	//   11   20:invokevirtual   #228 <Method String GSLogger.toString()>
	//   12   23:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	public long getLong(String s, long l)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return l;
	//    3    7:lload_2         
	//    4    8:lreturn         
		else
			return data.getLong(s, l);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokevirtual   #232 <Method long GSObject.getLong(String, long)>
	//   10   18:lreturn         
	}

	public GSObject getObject(String s, GSObject gsobject)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return gsobject;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return data.getObject(s, gsobject);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #236 <Method GSObject GSObject.getObject(String, GSObject)>
	//   10   18:areturn         
	}

	public String getResponseText()
	{
		return responseText;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String responseText>
	//    2    4:areturn         
	}

	public String getString(String s, String s1)
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field GSObject data>
	//*   2    4:ifnonnull       9
			return s1;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return data.getString(s, s1);
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field GSObject data>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #103 <Method String GSObject.getString(String, String)>
	//   10   18:areturn         
	}

	public boolean hasData()
	{
		return data != null;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field GSObject data>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\terrorCode:");
	//    4    8:aload_1         
	//    5    9:ldc1            #241 <String "\terrorCode:">
	//    6   11:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(errorCode);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #66  <Field int errorCode>
	//   11   20:invokevirtual   #190 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append("\n\terrorMessage:");
	//   13   24:aload_1         
	//   14   25:ldc1            #243 <String "\n\terrorMessage:">
	//   15   27:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(errorMessage);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #68  <Field String errorMessage>
	//   20   36:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("\n\terrorDetails:");
	//   22   40:aload_1         
	//   23   41:ldc1            #245 <String "\n\terrorDetails:">
	//   24   43:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(errorDetails);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #70  <Field String errorDetails>
	//   29   52:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append("\n\tdata:");
	//   31   56:aload_1         
	//   32   57:ldc1            #247 <String "\n\tdata:">
	//   33   59:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (data)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #76  <Field GSObject data>
	//   38   68:invokevirtual   #250 <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		return stringbuilder.toString();
	//   40   72:aload_1         
	//   41   73:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   42   76:areturn         
	}

	private static final String LOG_HEADER = "*********** GSResponse Log ***********\n";
	private static TreeMap errorMsgDic;
	private GSObject data;
	private int errorCode;
	private String errorDetails;
	private String errorMessage;
	protected Map headers;
	private GSLogger logger;
	private String responseText;

	static 
	{
		errorMsgDic = new TreeMap();
	//    0    0:new             #27  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void TreeMap()>
	//    3    7:putstatic       #32  <Field TreeMap errorMsgDic>
		errorMsgDic.put(((Object) (Integer.valueOf(0x7a13a))), "No Internet Connection");
	//    4   10:getstatic       #32  <Field TreeMap errorMsgDic>
	//    5   13:ldc1            #33  <Int 0x7a13a>
	//    6   15:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    7   18:ldc1            #41  <String "No Internet Connection">
	//    8   20:invokevirtual   #45  <Method Object TreeMap.put(Object, Object)>
	//    9   23:pop             
		errorMsgDic.put(((Object) (Integer.valueOf(0x61a82))), "Required parameter is missing");
	//   10   24:getstatic       #32  <Field TreeMap errorMsgDic>
	//   11   27:ldc1            #46  <Int 0x61a82>
	//   12   29:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   13   32:ldc1            #48  <String "Required parameter is missing">
	//   14   34:invokevirtual   #45  <Method Object TreeMap.put(Object, Object)>
	//   15   37:pop             
		errorMsgDic.put(((Object) (Integer.valueOf(0x62638))), "Invalid or missing session");
	//   16   38:getstatic       #32  <Field TreeMap errorMsgDic>
	//   17   41:ldc1            #49  <Int 0x62638>
	//   18   43:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   19   46:ldc1            #51  <String "Invalid or missing session">
	//   20   48:invokevirtual   #45  <Method Object TreeMap.put(Object, Object)>
	//   21   51:pop             
	//*  22   52:return          
	}
}
