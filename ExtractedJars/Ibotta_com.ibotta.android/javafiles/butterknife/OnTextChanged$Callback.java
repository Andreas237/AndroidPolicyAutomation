// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;


// Referenced classes of package butterknife:
//			OnTextChanged

public static final class OnTextChanged$Callback extends Enum
{

	public static OnTextChanged$Callback valueOf(String s)
	{
		return (OnTextChanged$Callback)Enum.valueOf(butterknife/OnTextChanged$Callback, s);
	//    0    0:ldc1            #2   <Class OnTextChanged$Callback>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OnTextChanged$Callback>
	//    4    9:areturn         
	}

	public static OnTextChanged$Callback[] values()
	{
		return (OnTextChanged$Callback[])((OnTextChanged$Callback []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field OnTextChanged$Callback[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lbutterknife.OnTextChanged$Callback_3B_.clone()>
	//    2    6:checkcast       #51  <Class OnTextChanged$Callback[]>
	//    3    9:areturn         
	}

	private static final OnTextChanged$Callback $VALUES[];
	public static final OnTextChanged$Callback AFTER_TEXT_CHANGED;
	public static final OnTextChanged$Callback BEFORE_TEXT_CHANGED;
	public static final OnTextChanged$Callback TEXT_CHANGED;

	static 
	{
		TEXT_CHANGED = new OnTextChanged$Callback("TEXT_CHANGED", 0);
	//    0    0:new             #2   <Class OnTextChanged$Callback>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "TEXT_CHANGED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #30  <Method void OnTextChanged$Callback(String, int)>
	//    5   10:putstatic       #32  <Field OnTextChanged$Callback TEXT_CHANGED>
		BEFORE_TEXT_CHANGED = new OnTextChanged$Callback("BEFORE_TEXT_CHANGED", 1);
	//    6   13:new             #2   <Class OnTextChanged$Callback>
	//    7   16:dup             
	//    8   17:ldc1            #33  <String "BEFORE_TEXT_CHANGED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #30  <Method void OnTextChanged$Callback(String, int)>
	//   11   23:putstatic       #35  <Field OnTextChanged$Callback BEFORE_TEXT_CHANGED>
		AFTER_TEXT_CHANGED = new OnTextChanged$Callback("AFTER_TEXT_CHANGED", 2);
	//   12   26:new             #2   <Class OnTextChanged$Callback>
	//   13   29:dup             
	//   14   30:ldc1            #36  <String "AFTER_TEXT_CHANGED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #30  <Method void OnTextChanged$Callback(String, int)>
	//   17   36:putstatic       #38  <Field OnTextChanged$Callback AFTER_TEXT_CHANGED>
		$VALUES = (new OnTextChanged$Callback[] {
			TEXT_CHANGED, BEFORE_TEXT_CHANGED, AFTER_TEXT_CHANGED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       OnTextChanged$Callback[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #32  <Field OnTextChanged$Callback TEXT_CHANGED>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #35  <Field OnTextChanged$Callback BEFORE_TEXT_CHANGED>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #38  <Field OnTextChanged$Callback AFTER_TEXT_CHANGED>
	//   31   60:aastore         
	//   32   61:putstatic       #40  <Field OnTextChanged$Callback[] $VALUES>
	//*  33   64:return          
	}

	private OnTextChanged$Callback(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
