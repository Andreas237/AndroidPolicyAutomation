// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;


// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			PhoneNumberMatcher

private static final class PhoneNumberMatcher$State extends Enum
{

	public static PhoneNumberMatcher$State valueOf(String s)
	{
		return (PhoneNumberMatcher$State)Enum.valueOf(io/michaelrocks/libphonenumber/android/PhoneNumberMatcher$State, s);
	//    0    0:ldc1            #2   <Class PhoneNumberMatcher$State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PhoneNumberMatcher$State>
	//    4    9:areturn         
	}

	public static PhoneNumberMatcher$State[] values()
	{
		return (PhoneNumberMatcher$State[])((PhoneNumberMatcher$State []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field PhoneNumberMatcher$State[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lio.michaelrocks.libphonenumber.android.PhoneNumberMatcher$State_3B_.clone()>
	//    2    6:checkcast       #42  <Class PhoneNumberMatcher$State[]>
	//    3    9:areturn         
	}

	private static final PhoneNumberMatcher$State $VALUES[];
	public static final PhoneNumberMatcher$State DONE;
	public static final PhoneNumberMatcher$State NOT_READY;
	public static final PhoneNumberMatcher$State READY;

	static 
	{
		NOT_READY = new PhoneNumberMatcher$State("NOT_READY", 0);
	//    0    0:new             #2   <Class PhoneNumberMatcher$State>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NOT_READY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
	//    5   10:putstatic       #23  <Field PhoneNumberMatcher$State NOT_READY>
		READY = new PhoneNumberMatcher$State("READY", 1);
	//    6   13:new             #2   <Class PhoneNumberMatcher$State>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "READY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
	//   11   23:putstatic       #26  <Field PhoneNumberMatcher$State READY>
		DONE = new PhoneNumberMatcher$State("DONE", 2);
	//   12   26:new             #2   <Class PhoneNumberMatcher$State>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "DONE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PhoneNumberMatcher$State(String, int)>
	//   17   36:putstatic       #29  <Field PhoneNumberMatcher$State DONE>
		$VALUES = (new PhoneNumberMatcher$State[] {
			NOT_READY, READY, DONE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       PhoneNumberMatcher$State[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field PhoneNumberMatcher$State NOT_READY>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field PhoneNumberMatcher$State READY>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field PhoneNumberMatcher$State DONE>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field PhoneNumberMatcher$State[] $VALUES>
	//*  33   64:return          
	}

	private PhoneNumberMatcher$State(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
