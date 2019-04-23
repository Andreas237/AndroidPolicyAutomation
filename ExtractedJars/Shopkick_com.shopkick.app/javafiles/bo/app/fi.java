// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.util.Base64;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package bo.app:
//			fb, dl, bu

public abstract class fi
	implements fb
{

	protected fi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		c = dl.c();
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method long dl.c()>
	//    4    8:putfield        #34  <Field long c>
		b = c / 1000L;
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field long c>
	//    8   16:ldc2w           #35  <Long 1000L>
	//    9   19:ldiv            
	//   10   20:putfield        #38  <Field long b>
	//   11   23:return          
	}

	protected fi(bu bu)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void fi()>
		d = bu;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field bu d>
	//    5    9:return          
	}

	protected String a(String s)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #51  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		String s1;
		try
		{
			s1 = (new String(Base64.decode(s, 0))).split("_")[0];
	//    5    9:new             #53  <Class String>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokestatic    #59  <Method byte[] Base64.decode(String, int)>
	//   10   18:invokespecial   #62  <Method void String(byte[])>
	//   11   21:ldc1            #64  <String "_">
	//   12   23:invokevirtual   #68  <Method String[] String.split(String)>
	//   13   26:iconst_0        
	//   14   27:aaload          
	//   15   28:astore_2        
		}
	//*  16   29:aload_2         
	//*  17   30:areturn         
		catch(Exception exception)
	//*  18   31:astore_2        
		{
			String s2 = a;
	//   19   32:getstatic       #23  <Field String a>
	//   20   35:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   21   36:new             #70  <Class StringBuilder>
	//   22   39:dup             
	//   23   40:invokespecial   #71  <Method void StringBuilder()>
	//   24   43:astore          4
			stringbuilder.append("Unexpected error decoding Base64 encoded campaign Id ");
	//   25   45:aload           4
	//   26   47:ldc1            #73  <String "Unexpected error decoding Base64 encoded campaign Id ">
	//   27   49:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(s);
	//   29   53:aload           4
	//   30   55:aload_1         
	//   31   56:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			AppboyLogger.e(s2, stringbuilder.toString(), ((Throwable) (exception)));
	//   33   60:aload_3         
	//   34   61:aload           4
	//   35   63:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   36   66:aload_2         
	//   37   67:invokestatic    #85  <Method int AppboyLogger.e(String, String, Throwable)>
	//   38   70:pop             
			return null;
	//   39   71:aconst_null     
	//   40   72:areturn         
		}
		return s1;
	}

	public long c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field long b>
	//    2    4:lreturn         
	}

	public long d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long c>
	//    2    4:lreturn         
	}

	public bu e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field bu d>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/fi);
	private long b;
	private long c;
	private bu d;

	static 
	{
	//    0    0:ldc1            #2   <Class fi>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
