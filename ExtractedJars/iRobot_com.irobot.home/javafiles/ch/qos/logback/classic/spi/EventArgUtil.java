// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;


public class EventArgUtil
{

	public EventArgUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object[] arrangeArguments(Object aobj[])
	{
		return aobj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public static final Throwable extractThrowable(Object aobj[])
	{
		if(aobj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          30
		{
			if(aobj.length == 0)
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
				return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
			aobj = ((Object []) (aobj[aobj.length - 1]));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:iconst_1        
	//   11   15:isub            
	//   12   16:aaload          
	//   13   17:astore_0        
			if(aobj instanceof Throwable)
	//*  14   18:aload_0         
	//*  15   19:instanceof      #15  <Class Throwable>
	//*  16   22:ifeq            30
				return (Throwable)aobj;
	//   17   25:aload_0         
	//   18   26:checkcast       #15  <Class Throwable>
	//   19   29:areturn         
		}
		return null;
	//   20   30:aconst_null     
	//   21   31:areturn         
	}

	public static boolean successfulExtraction(Throwable throwable)
	{
		return throwable != null;
	//    0    0:aload_0         
	//    1    1:ifnull          6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public static Object[] trimmedCopy(Object aobj[])
	{
		if(aobj != null && aobj.length != 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          32
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            32
		{
			int i = aobj.length - 1;
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:istore_1        
			Object aobj1[] = new Object[i];
	//   11   17:iload_1         
	//   12   18:anewarray       Object[]
	//   13   21:astore_2        
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:aload_2         
	//   17   25:iconst_0        
	//   18   26:iload_1         
	//   19   27:invokestatic    #24  <Method void System.arraycopy(Object, int, Object, int, int)>
			return aobj1;
	//   20   30:aload_2         
	//   21   31:areturn         
		} else
		{
			throw new IllegalStateException("non-sensical empty or null argument array");
	//   22   32:new             #26  <Class IllegalStateException>
	//   23   35:dup             
	//   24   36:ldc1            #28  <String "non-sensical empty or null argument array">
	//   25   38:invokespecial   #31  <Method void IllegalStateException(String)>
	//   26   41:athrow          
		}
	}
}
