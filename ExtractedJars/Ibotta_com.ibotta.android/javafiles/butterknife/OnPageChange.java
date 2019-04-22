// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import java.lang.annotation.Annotation;

public interface OnPageChange
	extends Annotation
{
	public static final class Callback extends Enum
	{

		public static Callback valueOf(String s)
		{
			return (Callback)Enum.valueOf(butterknife/OnPageChange$Callback, s);
		//    0    0:ldc1            #2   <Class OnPageChange$Callback>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class OnPageChange$Callback>
		//    4    9:areturn         
		}

		public static Callback[] values()
		{
			return (Callback[])((Callback []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field OnPageChange$Callback[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lbutterknife.OnPageChange$Callback_3B_.clone()>
		//    2    6:checkcast       #50  <Class OnPageChange$Callback[]>
		//    3    9:areturn         
		}

		private static final Callback $VALUES[];
		public static final Callback PAGE_SCROLLED;
		public static final Callback PAGE_SCROLL_STATE_CHANGED;
		public static final Callback PAGE_SELECTED;

		static 
		{
			PAGE_SELECTED = new Callback("PAGE_SELECTED", 0);
		//    0    0:new             #2   <Class OnPageChange$Callback>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "PAGE_SELECTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void OnPageChange$Callback(String, int)>
		//    5   10:putstatic       #31  <Field OnPageChange$Callback PAGE_SELECTED>
			PAGE_SCROLLED = new Callback("PAGE_SCROLLED", 1);
		//    6   13:new             #2   <Class OnPageChange$Callback>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "PAGE_SCROLLED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void OnPageChange$Callback(String, int)>
		//   11   23:putstatic       #34  <Field OnPageChange$Callback PAGE_SCROLLED>
			PAGE_SCROLL_STATE_CHANGED = new Callback("PAGE_SCROLL_STATE_CHANGED", 2);
		//   12   26:new             #2   <Class OnPageChange$Callback>
		//   13   29:dup             
		//   14   30:ldc1            #35  <String "PAGE_SCROLL_STATE_CHANGED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #29  <Method void OnPageChange$Callback(String, int)>
		//   17   36:putstatic       #37  <Field OnPageChange$Callback PAGE_SCROLL_STATE_CHANGED>
			$VALUES = (new Callback[] {
				PAGE_SELECTED, PAGE_SCROLLED, PAGE_SCROLL_STATE_CHANGED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Callback[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #31  <Field OnPageChange$Callback PAGE_SELECTED>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #34  <Field OnPageChange$Callback PAGE_SCROLLED>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #37  <Field OnPageChange$Callback PAGE_SCROLL_STATE_CHANGED>
		//   31   60:aastore         
		//   32   61:putstatic       #39  <Field OnPageChange$Callback[] $VALUES>
		//*  33   64:return          
		}

		private Callback(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Callback callback();

	public abstract int[] value();
}
