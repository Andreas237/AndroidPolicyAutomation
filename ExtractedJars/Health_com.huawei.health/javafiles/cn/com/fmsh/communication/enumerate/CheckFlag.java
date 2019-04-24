// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.enumerate;


public final class CheckFlag extends Enum
{

	private CheckFlag(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #16  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CheckFlag valueOf(String s)
	{
		return (CheckFlag)Enum.valueOf(cn/com/fmsh/communication/enumerate/CheckFlag, s);
	//    0    0:ldc1            #2   <Class CheckFlag>
	//    1    2:aload_0         
	//    2    3:invokestatic    #21  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CheckFlag>
	//    4    9:areturn         
	}

	public static CheckFlag[] values()
	{
		CheckFlag acheckflag[] = ENUM$VALUES;
	//    0    0:getstatic       #11  <Field CheckFlag[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = acheckflag.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		CheckFlag acheckflag1[] = new CheckFlag[i];
	//    5    7:iload_0         
	//    6    8:anewarray       CheckFlag[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (acheckflag)), 0, ((Object) (acheckflag1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #29  <Method void System.arraycopy(Object, int, Object, int, int)>
		return acheckflag1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	private static final CheckFlag ENUM$VALUES[] = new CheckFlag[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       CheckFlag[]
	//    2    4:putstatic       #11  <Field CheckFlag[] ENUM$VALUES>
	//*   3    7:return          
	}
}
