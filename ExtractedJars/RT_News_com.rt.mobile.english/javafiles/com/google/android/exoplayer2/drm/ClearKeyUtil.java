// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.json.*;

final class ClearKeyUtil
{

	private ClearKeyUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] adjustRequestData(byte abyte0[])
	{
		if(Util.SDK_INT >= 27)
	//*   0    0:getstatic       #21  <Field int Util.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          10
			return abyte0;
	//    3    8:aload_0         
	//    4    9:areturn         
		else
			return Util.getUtf8Bytes(base64ToBase64Url(Util.fromUtf8Bytes(abyte0)));
	//    5   10:aload_0         
	//    6   11:invokestatic    #25  <Method String Util.fromUtf8Bytes(byte[])>
	//    7   14:invokestatic    #29  <Method String base64ToBase64Url(String)>
	//    8   17:invokestatic    #33  <Method byte[] Util.getUtf8Bytes(String)>
	//    9   20:areturn         
	}

	public static byte[] adjustResponseData(byte abyte0[])
	{
		if(Util.SDK_INT >= 27)
	//*   0    0:getstatic       #21  <Field int Util.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          10
			return abyte0;
	//    3    8:aload_0         
	//    4    9:areturn         
		int i;
		StringBuilder stringbuilder;
		byte abyte1[];
		Object obj;
		JSONObject jsonobject;
		try
		{
			obj = ((Object) (new JSONObject(Util.fromUtf8Bytes(abyte0))));
	//    5   10:new             #38  <Class JSONObject>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:invokestatic    #25  <Method String Util.fromUtf8Bytes(byte[])>
	//    9   18:invokespecial   #41  <Method void JSONObject(String)>
	//   10   21:astore_3        
			stringbuilder = new StringBuilder("{\"keys\":[");
	//   11   22:new             #43  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:ldc1            #45  <String "{\"keys\":[">
	//   14   28:invokespecial   #46  <Method void StringBuilder(String)>
	//   15   31:astore_2        
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("keys")));
	//   16   32:aload_3         
	//   17   33:ldc1            #48  <String "keys">
	//   18   35:invokevirtual   #52  <Method JSONArray JSONObject.getJSONArray(String)>
	//   19   38:astore_3        
		}
	//*  20   39:iconst_0        
	//*  21   40:istore_1        
	//*  22   41:iload_1         
	//*  23   42:aload_3         
	//*  24   43:invokevirtual   #58  <Method int JSONArray.length()>
	//*  25   46:icmpge          144
	//*  26   49:iload_1         
	//*  27   50:ifeq            60
	//*  28   53:aload_2         
	//*  29   54:ldc1            #60  <String ",">
	//*  30   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  31   59:pop             
	//*  32   60:aload_3         
	//*  33   61:iload_1         
	//*  34   62:invokevirtual   #68  <Method JSONObject JSONArray.getJSONObject(int)>
	//*  35   65:astore          4
	//*  36   67:aload_2         
	//*  37   68:ldc1            #70  <String "{\"k\":\"">
	//*  38   70:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  39   73:pop             
	//*  40   74:aload_2         
	//*  41   75:aload           4
	//*  42   77:ldc1            #72  <String "k">
	//*  43   79:invokevirtual   #75  <Method String JSONObject.getString(String)>
	//*  44   82:invokestatic    #78  <Method String base64UrlToBase64(String)>
	//*  45   85:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  46   88:pop             
	//*  47   89:aload_2         
	//*  48   90:ldc1            #80  <String "\",\"kid\":\"">
	//*  49   92:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  50   95:pop             
	//*  51   96:aload_2         
	//*  52   97:aload           4
	//*  53   99:ldc1            #82  <String "kid">
	//*  54  101:invokevirtual   #75  <Method String JSONObject.getString(String)>
	//*  55  104:invokestatic    #78  <Method String base64UrlToBase64(String)>
	//*  56  107:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  57  110:pop             
	//*  58  111:aload_2         
	//*  59  112:ldc1            #84  <String "\",\"kty\":\"">
	//*  60  114:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  61  117:pop             
	//*  62  118:aload_2         
	//*  63  119:aload           4
	//*  64  121:ldc1            #86  <String "kty">
	//*  65  123:invokevirtual   #75  <Method String JSONObject.getString(String)>
	//*  66  126:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  67  129:pop             
	//*  68  130:aload_2         
	//*  69  131:ldc1            #88  <String "\"}">
	//*  70  133:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  71  136:pop             
	//*  72  137:iload_1         
	//*  73  138:iconst_1        
	//*  74  139:iadd            
	//*  75  140:istore_1        
	//*  76  141:goto            41
	//*  77  144:aload_2         
	//*  78  145:ldc1            #90  <String "]}">
	//*  79  147:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  80  150:pop             
	//*  81  151:aload_2         
	//*  82  152:invokevirtual   #94  <Method String StringBuilder.toString()>
	//*  83  155:invokestatic    #33  <Method byte[] Util.getUtf8Bytes(String)>
	//*  84  158:astore_2        
	//*  85  159:aload_2         
	//*  86  160:areturn         
		catch(JSONException jsonexception)
	//*  87  161:astore_2        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   88  162:new             #43  <Class StringBuilder>
	//   89  165:dup             
	//   90  166:invokespecial   #95  <Method void StringBuilder()>
	//   91  169:astore_3        
			stringbuilder1.append("Failed to adjust response data: ");
	//   92  170:aload_3         
	//   93  171:ldc1            #97  <String "Failed to adjust response data: ">
	//   94  173:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   95  176:pop             
			stringbuilder1.append(Util.fromUtf8Bytes(abyte0));
	//   96  177:aload_3         
	//   97  178:aload_0         
	//   98  179:invokestatic    #25  <Method String Util.fromUtf8Bytes(byte[])>
	//   99  182:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//  100  185:pop             
			Log.e("ClearKeyUtil", stringbuilder1.toString(), ((Throwable) (jsonexception)));
	//  101  186:ldc1            #8   <String "ClearKeyUtil">
	//  102  188:aload_3         
	//  103  189:invokevirtual   #94  <Method String StringBuilder.toString()>
	//  104  192:aload_2         
	//  105  193:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//  106  196:pop             
			return abyte0;
	//  107  197:aload_0         
	//  108  198:areturn         
		}
		i = 0;
		if(i >= ((JSONArray) (obj)).length())
			break; /* Loop/switch isn't completed */
		if(i == 0)
			break MISSING_BLOCK_LABEL_60;
		stringbuilder.append(",");
		jsonobject = ((JSONArray) (obj)).getJSONObject(i);
		stringbuilder.append("{\"k\":\"");
		stringbuilder.append(base64UrlToBase64(jsonobject.getString("k")));
		stringbuilder.append("\",\"kid\":\"");
		stringbuilder.append(base64UrlToBase64(jsonobject.getString("kid")));
		stringbuilder.append("\",\"kty\":\"");
		stringbuilder.append(jsonobject.getString("kty"));
		stringbuilder.append("\"}");
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_41;
_L1:
		stringbuilder.append("]}");
		abyte1 = Util.getUtf8Bytes(stringbuilder.toString());
		return abyte1;
	}

	private static String base64ToBase64Url(String s)
	{
		return s.replace('+', '-').replace('/', '_');
	//    0    0:aload_0         
	//    1    1:bipush          43
	//    2    3:bipush          45
	//    3    5:invokevirtual   #109 <Method String String.replace(char, char)>
	//    4    8:bipush          47
	//    5   10:bipush          95
	//    6   12:invokevirtual   #109 <Method String String.replace(char, char)>
	//    7   15:areturn         
	}

	private static String base64UrlToBase64(String s)
	{
		return s.replace('-', '+').replace('_', '/');
	//    0    0:aload_0         
	//    1    1:bipush          45
	//    2    3:bipush          43
	//    3    5:invokevirtual   #109 <Method String String.replace(char, char)>
	//    4    8:bipush          95
	//    5   10:bipush          47
	//    6   12:invokevirtual   #109 <Method String String.replace(char, char)>
	//    7   15:areturn         
	}

	private static final String TAG = "ClearKeyUtil";
}
