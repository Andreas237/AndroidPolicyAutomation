// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.exception;


// Referenced classes of package cn.com.fmsh.tsm.business.exception:
//			BusinessException

static final class BusinessException$ErrorMessage$ErrorType extends Enum
{

	public static BusinessException$ErrorMessage$ErrorType valueOf(String s)
	{
		return (BusinessException$ErrorMessage$ErrorType)Enum.valueOf(cn/com/fmsh/tsm/business/exception/BusinessException$ErrorMessage$ErrorType, s);
	//    0    0:ldc1            #2   <Class BusinessException$ErrorMessage$ErrorType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #37  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BusinessException$ErrorMessage$ErrorType>
	//    4    9:areturn         
	}

	public static BusinessException$ErrorMessage$ErrorType[] values()
	{
		BusinessException$ErrorMessage$ErrorType abusinessexception$errormessage$errortype[] = ENUM$VALUES;
	//    0    0:getstatic       #30  <Field BusinessException$ErrorMessage$ErrorType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = abusinessexception$errormessage$errortype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		BusinessException$ErrorMessage$ErrorType abusinessexception$errormessage$errortype1[] = new BusinessException$ErrorMessage$ErrorType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       BusinessException$ErrorMessage$ErrorType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (abusinessexception$errormessage$errortype)), 0, ((Object) (abusinessexception$errormessage$errortype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abusinessexception$errormessage$errortype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	private static final BusinessException$ErrorMessage$ErrorType ENUM$VALUES[];
	public static final BusinessException$ErrorMessage$ErrorType local;
	public static final BusinessException$ErrorMessage$ErrorType remote;

	static 
	{
		local = new BusinessException$ErrorMessage$ErrorType("local", 0);
	//    0    0:new             #2   <Class BusinessException$ErrorMessage$ErrorType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "local">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void BusinessException$ErrorMessage$ErrorType(String, int)>
	//    5   10:putstatic       #25  <Field BusinessException$ErrorMessage$ErrorType local>
		remote = new BusinessException$ErrorMessage$ErrorType("remote", 1);
	//    6   13:new             #2   <Class BusinessException$ErrorMessage$ErrorType>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "remote">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void BusinessException$ErrorMessage$ErrorType(String, int)>
	//   11   23:putstatic       #28  <Field BusinessException$ErrorMessage$ErrorType remote>
		ENUM$VALUES = (new BusinessException$ErrorMessage$ErrorType[] {
			local, remote
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       BusinessException$ErrorMessage$ErrorType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #25  <Field BusinessException$ErrorMessage$ErrorType local>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #28  <Field BusinessException$ErrorMessage$ErrorType remote>
	//   21   41:aastore         
	//   22   42:putstatic       #30  <Field BusinessException$ErrorMessage$ErrorType[] ENUM$VALUES>
	//*  23   45:return          
	}

	private BusinessException$ErrorMessage$ErrorType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #32  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
