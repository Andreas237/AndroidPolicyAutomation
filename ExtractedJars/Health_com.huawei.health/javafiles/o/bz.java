// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package o:
//			bx, bk, bs

public final class bz extends bx
{

	public bz(int i, String s, Object obj)
	{
		super(s, obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #13  <Method void bx(String, Object)>
		d = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #15  <Field int d>
	//    7   11:return          
	}

	public final byte[] a()
	{
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #22  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ArrayList()>
	//    3    7:astore_2        
		if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #27  <Field Object b>
	//*   6   12:ifnull          36
			arraylist.add(((Object) (new BasicNameValuePair("extParam", bk.c(b)))));
	//    7   15:aload_2         
	//    8   16:new             #29  <Class BasicNameValuePair>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "extParam">
	//   11   22:aload_0         
	//   12   23:getfield        #27  <Field Object b>
	//   13   26:invokestatic    #37  <Method String bk.c(Object)>
	//   14   29:invokespecial   #40  <Method void BasicNameValuePair(String, String)>
	//   15   32:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
	//   16   35:pop             
		arraylist.add(((Object) (new BasicNameValuePair("operationType", a))));
	//   17   36:aload_2         
	//   18   37:new             #29  <Class BasicNameValuePair>
	//   19   40:dup             
	//   20   41:ldc1            #46  <String "operationType">
	//   21   43:aload_0         
	//   22   44:getfield        #49  <Field String a>
	//   23   47:invokespecial   #40  <Method void BasicNameValuePair(String, String)>
	//   24   50:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
	//   25   53:pop             
		arraylist.add(((Object) (new BasicNameValuePair("id", (new StringBuilder()).append(d).toString()))));
	//   26   54:aload_2         
	//   27   55:new             #29  <Class BasicNameValuePair>
	//   28   58:dup             
	//   29   59:ldc1            #51  <String "id">
	//   30   61:new             #53  <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #54  <Method void StringBuilder()>
	//   33   68:aload_0         
	//   34   69:getfield        #15  <Field int d>
	//   35   72:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   36   75:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   37   78:invokespecial   #40  <Method void BasicNameValuePair(String, String)>
	//   38   81:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
	//   39   84:pop             
		(new StringBuilder("mParams is:")).append(e);
	//   40   85:new             #53  <Class StringBuilder>
	//   41   88:dup             
	//   42   89:ldc1            #64  <String "mParams is:">
	//   43   91:invokespecial   #67  <Method void StringBuilder(String)>
	//   44   94:aload_0         
	//   45   95:getfield        #70  <Field Object e>
	//   46   98:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//   47  101:pop             
		String s;
		if(e == null)
	//*  48  102:aload_0         
	//*  49  103:getfield        #70  <Field Object e>
	//*  50  106:ifnonnull       115
		{
			s = "[]";
	//   51  109:ldc1            #75  <String "[]">
	//   52  111:astore_1        
			break MISSING_BLOCK_LABEL_123;
	//   53  112:goto            123
		}
		s = bk.c(e);
	//   54  115:aload_0         
	//   55  116:getfield        #70  <Field Object e>
	//   56  119:invokestatic    #37  <Method String bk.c(Object)>
	//   57  122:astore_1        
		byte abyte0[];
		arraylist.add(((Object) (new BasicNameValuePair("requestData", s))));
	//   58  123:aload_2         
	//   59  124:new             #29  <Class BasicNameValuePair>
	//   60  127:dup             
	//   61  128:ldc1            #77  <String "requestData">
	//   62  130:aload_1         
	//   63  131:invokespecial   #40  <Method void BasicNameValuePair(String, String)>
	//   64  134:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
	//   65  137:pop             
		abyte0 = URLEncodedUtils.format(((java.util.List) (arraylist)), "utf-8").getBytes();
	//   66  138:aload_2         
	//   67  139:ldc1            #79  <String "utf-8">
	//   68  141:invokestatic    #85  <Method String URLEncodedUtils.format(java.util.List, String)>
	//   69  144:invokevirtual   #90  <Method byte[] String.getBytes()>
	//   70  147:astore_1        
		return abyte0;
	//   71  148:aload_1         
	//   72  149:areturn         
		Exception exception;
		exception;
	//   73  150:astore_2        
		String s1;
		if((new StringBuilder("request  =")).append(e).append(":").append(((Object) (exception))).toString() == null)
	//*  74  151:new             #53  <Class StringBuilder>
	//*  75  154:dup             
	//*  76  155:ldc1            #92  <String "request  =">
	//*  77  157:invokespecial   #67  <Method void StringBuilder(String)>
	//*  78  160:aload_0         
	//*  79  161:getfield        #70  <Field Object e>
	//*  80  164:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//*  81  167:ldc1            #94  <String ":">
	//*  82  169:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//*  83  172:aload_2         
	//*  84  173:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//*  85  176:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  86  179:ifnonnull       188
			s1 = "";
	//   87  182:ldc1            #99  <String "">
	//   88  184:astore_1        
		else
	//*  89  185:goto            193
			s1 = exception.getMessage();
	//   90  188:aload_2         
	//   91  189:invokevirtual   #102 <Method String Exception.getMessage()>
	//   92  192:astore_1        
		throw new bs(Integer.valueOf(9), s1, ((Throwable) (exception)));
	//   93  193:new             #104 <Class bs>
	//   94  196:dup             
	//   95  197:bipush          9
	//   96  199:invokestatic    #110 <Method Integer Integer.valueOf(int)>
	//   97  202:aload_1         
	//   98  203:aload_2         
	//   99  204:invokespecial   #113 <Method void bs(Integer, String, Throwable)>
	//  100  207:athrow          
	}

	public final void c(Object obj)
	{
		b = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Object b>
	//    3    5:return          
	}

	private Object b;
	private int d;
}
