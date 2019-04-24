// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			al, at, ad, av, 
//			ah, ax, af

public class ak
{

	public static at a(Class class1)
	{
		return a.a(class1);
	//    0    0:getstatic       #34  <Field al a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #45  <Method at al.a(Class)>
	//    3    7:areturn         
	}

	public static av a(ad ad)
	{
		return a.a(ad);
	//    0    0:getstatic       #34  <Field al a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method av al.a(ad)>
	//    3    7:areturn         
	}

	public static ax a(ah ah)
	{
		return a.a(ah);
	//    0    0:getstatic       #34  <Field al a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #51  <Method ax al.a(ah)>
	//    3    7:areturn         
	}

	public static String a(af af)
	{
		return a.a(af);
	//    0    0:getstatic       #34  <Field al a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #54  <Method String al.a(af)>
	//    3    7:areturn         
	}

	private static final al a;
	private static final at b[] = new at[0];

	static 
	{
		Object obj;
		try
		{
			obj = ((Object) ((al)Class.forName("truenet.kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance()));
	//    0    0:ldc1            #20  <String "truenet.kotlin.reflect.jvm.internal.ReflectionFactoryImpl">
	//    1    2:invokestatic    #26  <Method Class Class.forName(String)>
	//    2    5:invokevirtual   #30  <Method Object Class.newInstance()>
	//    3    8:checkcast       #32  <Class al>
	//    4   11:astore_0        
		}
	//*   5   12:aload_0         
	//*   6   13:ifnull          52
	//*   7   16:aload_0         
	//*   8   17:putstatic       #34  <Field al a>
	//*   9   20:iconst_0        
	//*  10   21:anewarray       at[]
	//*  11   24:putstatic       #38  <Field at[] b>
	//*  12   27:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  13   28:astore_0        
		{
			obj = null;
	//   14   29:aconst_null     
	//   15   30:astore_0        
		}
	//*  16   31:goto            12
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   34:astore_0        
		{
			obj = null;
	//   18   35:aconst_null     
	//   19   36:astore_0        
		}
	//*  20   37:goto            12
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  21   40:astore_0        
		{
			obj = null;
	//   22   41:aconst_null     
	//   23   42:astore_0        
		}
	//*  24   43:goto            12
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  25   46:astore_0        
		{
			obj = null;
	//   26   47:aconst_null     
	//   27   48:astore_0        
		}
		if(obj == null)
	//*  28   49:goto            12
			obj = ((Object) (new al()));
	//   29   52:new             #32  <Class al>
	//   30   55:dup             
	//   31   56:invokespecial   #41  <Method void al()>
	//   32   59:astore_0        
		a = ((al) (obj));
	//*  33   60:goto            16
	}
}
