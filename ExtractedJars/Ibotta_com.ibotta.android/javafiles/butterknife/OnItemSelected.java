// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import java.lang.annotation.Annotation;

public interface OnItemSelected
	extends Annotation
{
	public static final class Callback extends Enum
	{

		public static Callback valueOf(String s)
		{
			return (Callback)Enum.valueOf(butterknife/OnItemSelected$Callback, s);
		//    0    0:ldc1            #2   <Class OnItemSelected$Callback>
		//    1    2:aload_0         
		//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class OnItemSelected$Callback>
		//    4    9:areturn         
		}

		public static Callback[] values()
		{
			return (Callback[])((Callback []) ($VALUES)).clone();
		//    0    0:getstatic       #36  <Field OnItemSelected$Callback[] $VALUES>
		//    1    3:invokevirtual   #51  <Method Object _5B_Lbutterknife.OnItemSelected$Callback_3B_.clone()>
		//    2    6:checkcast       #47  <Class OnItemSelected$Callback[]>
		//    3    9:areturn         
		}

		private static final Callback $VALUES[];
		public static final Callback ITEM_SELECTED;
		public static final Callback NOTHING_SELECTED;

		static 
		{
			ITEM_SELECTED = new Callback("ITEM_SELECTED", 0);
		//    0    0:new             #2   <Class OnItemSelected$Callback>
		//    1    3:dup             
		//    2    4:ldc1            #25  <String "ITEM_SELECTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #29  <Method void OnItemSelected$Callback(String, int)>
		//    5   10:putstatic       #31  <Field OnItemSelected$Callback ITEM_SELECTED>
			NOTHING_SELECTED = new Callback("NOTHING_SELECTED", 1);
		//    6   13:new             #2   <Class OnItemSelected$Callback>
		//    7   16:dup             
		//    8   17:ldc1            #32  <String "NOTHING_SELECTED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #29  <Method void OnItemSelected$Callback(String, int)>
		//   11   23:putstatic       #34  <Field OnItemSelected$Callback NOTHING_SELECTED>
			$VALUES = (new Callback[] {
				ITEM_SELECTED, NOTHING_SELECTED
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Callback[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #31  <Field OnItemSelected$Callback ITEM_SELECTED>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #34  <Field OnItemSelected$Callback NOTHING_SELECTED>
		//   21   41:aastore         
		//   22   42:putstatic       #36  <Field OnItemSelected$Callback[] $VALUES>
		//*  23   45:return          
		}

		private Callback(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #38  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Callback callback();

	public abstract int[] value();
}
