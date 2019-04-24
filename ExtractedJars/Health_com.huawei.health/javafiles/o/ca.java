// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Type;
import org.json.JSONObject;

// Referenced classes of package o:
//			bt, bs, bh

public final class ca extends bt
{

	public ca(Type type, byte abyte0[])
	{
		super(type, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void bt(Type, byte[])>
	//    4    6:return          
	}

	public final Object d()
	{
		int i;
		Object obj;
		try
		{
			obj = ((Object) (new String(e)));
	//    0    0:new             #15  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field byte[] e>
	//    4    8:invokespecial   #22  <Method void String(byte[])>
	//    5   11:astore_2        
			(new StringBuilder("threadid = ")).append(Thread.currentThread().getId()).append("; rpc response:  ").append(((String) (obj)));
	//    6   12:new             #24  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "threadid = ">
	//    9   18:invokespecial   #29  <Method void StringBuilder(String)>
	//   10   21:invokestatic    #35  <Method Thread Thread.currentThread()>
	//   11   24:invokevirtual   #39  <Method long Thread.getId()>
	//   12   27:invokevirtual   #43  <Method StringBuilder StringBuilder.append(long)>
	//   13   30:ldc1            #45  <String "; rpc response:  ">
	//   14   32:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_2         
	//   16   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			obj = ((Object) (new JSONObject(((String) (obj)))));
	//   18   40:new             #50  <Class JSONObject>
	//   19   43:dup             
	//   20   44:aload_2         
	//   21   45:invokespecial   #51  <Method void JSONObject(String)>
	//   22   48:astore_2        
			i = ((JSONObject) (obj)).getInt("resultStatus");
	//   23   49:aload_2         
	//   24   50:ldc1            #53  <String "resultStatus">
	//   25   52:invokevirtual   #57  <Method int JSONObject.getInt(String)>
	//   26   55:istore_1        
		}
	//*  27   56:iload_1         
	//*  28   57:sipush          1000
	//*  29   60:icmpeq          81
	//*  30   63:new             #59  <Class bs>
	//*  31   66:dup             
	//*  32   67:iload_1         
	//*  33   68:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//*  34   71:aload_2         
	//*  35   72:ldc1            #67  <String "tips">
	//*  36   74:invokevirtual   #71  <Method String JSONObject.optString(String)>
	//*  37   77:invokespecial   #74  <Method void bs(Integer, String)>
	//*  38   80:athrow          
	//*  39   81:aload_0         
	//*  40   82:getfield        #78  <Field Type c>
	//*  41   85:ldc1            #15  <Class String>
	//*  42   87:if_acmpne       97
	//*  43   90:aload_2         
	//*  44   91:ldc1            #80  <String "result">
	//*  45   93:invokevirtual   #71  <Method String JSONObject.optString(String)>
	//*  46   96:areturn         
	//*  47   97:aload_2         
	//*  48   98:ldc1            #80  <String "result">
	//*  49  100:invokevirtual   #71  <Method String JSONObject.optString(String)>
	//*  50  103:aload_0         
	//*  51  104:getfield        #78  <Field Type c>
	//*  52  107:invokestatic    #85  <Method Object bh.e(String, Type)>
	//*  53  110:astore_2        
	//*  54  111:aload_2         
	//*  55  112:areturn         
		catch(Object obj1)
	//*  56  113:astore_2        
		{
			if((new StringBuilder("response  =")).append(new String(e)).append(":").append(obj1).toString() == null)
	//*  57  114:new             #24  <Class StringBuilder>
	//*  58  117:dup             
	//*  59  118:ldc1            #87  <String "response  =">
	//*  60  120:invokespecial   #29  <Method void StringBuilder(String)>
	//*  61  123:new             #15  <Class String>
	//*  62  126:dup             
	//*  63  127:aload_0         
	//*  64  128:getfield        #19  <Field byte[] e>
	//*  65  131:invokespecial   #22  <Method void String(byte[])>
	//*  66  134:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//*  67  137:ldc1            #89  <String ":">
	//*  68  139:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//*  69  142:aload_2         
	//*  70  143:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//*  71  146:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  72  149:ifnonnull       158
				obj1 = "";
	//   73  152:ldc1            #98  <String "">
	//   74  154:astore_2        
			else
	//*  75  155:goto            163
				obj1 = ((Object) (((Exception) (obj1)).getMessage()));
	//   76  158:aload_2         
	//   77  159:invokevirtual   #101 <Method String Exception.getMessage()>
	//   78  162:astore_2        
			throw new bs(Integer.valueOf(10), ((String) (obj1)));
	//   79  163:new             #59  <Class bs>
	//   80  166:dup             
	//   81  167:bipush          10
	//   82  169:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   83  172:aload_2         
	//   84  173:invokespecial   #74  <Method void bs(Integer, String)>
	//   85  176:athrow          
		}
		if(i == 1000)
			break MISSING_BLOCK_LABEL_81;
		throw new bs(Integer.valueOf(i), ((JSONObject) (obj)).optString("tips"));
		if(c == java/lang/String)
			return ((Object) (((JSONObject) (obj)).optString("result")));
		obj = bh.e(((JSONObject) (obj)).optString("result"), c);
		return obj;
	}
}
