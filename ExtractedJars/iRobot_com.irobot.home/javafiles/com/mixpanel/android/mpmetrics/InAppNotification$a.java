// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//			InAppNotification

public static class InAppNotification$a extends Enum
{

	public static InAppNotification$a valueOf(String s)
	{
		return (InAppNotification$a)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$a, s);
	//    0    0:ldc1            #2   <Class InAppNotification$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class InAppNotification$a>
	//    4    9:areturn         
	}

	public static InAppNotification$a[] values()
	{
		return (InAppNotification$a[])((InAppNotification$a []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field InAppNotification$a[] $VALUES>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.mixpanel.android.mpmetrics.InAppNotification$a_3B_.clone()>
	//    2    6:checkcast       #52  <Class InAppNotification$a[]>
	//    3    9:areturn         
	}

	private static final InAppNotification$a $VALUES[];
	public static final InAppNotification$a MINI;
	public static final InAppNotification$a TAKEOVER;
	public static final InAppNotification$a UNKNOWN;

	static 
	{
		UNKNOWN = ((InAppNotification$a) (new InAppNotification.a("UNKNOWN", 0) {

			public String toString()
			{
				return "*unknown_type*";
			//    0    0:ldc1            #17  <String "*unknown_type*">
			//    1    2:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
		}
));
	//    0    0:new             #10  <Class InAppNotification$a$1>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #27  <Method void InAppNotification$a$1(String, int)>
	//    5   10:putstatic       #29  <Field InAppNotification$a UNKNOWN>
		MINI = ((InAppNotification$a) (new InAppNotification.a("MINI", 1) {

			public String toString()
			{
				return "mini";
			//    0    0:ldc1            #17  <String "mini">
			//    1    2:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
		}
));
	//    6   13:new             #12  <Class InAppNotification$a$2>
	//    7   16:dup             
	//    8   17:ldc1            #30  <String "MINI">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #31  <Method void InAppNotification$a$2(String, int)>
	//   11   23:putstatic       #33  <Field InAppNotification$a MINI>
		TAKEOVER = ((InAppNotification$a) (new InAppNotification.a("TAKEOVER", 2) {

			public String toString()
			{
				return "takeover";
			//    0    0:ldc1            #17  <String "takeover">
			//    1    2:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
		}
));
	//   12   26:new             #14  <Class InAppNotification$a$3>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "TAKEOVER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #35  <Method void InAppNotification$a$3(String, int)>
	//   17   36:putstatic       #37  <Field InAppNotification$a TAKEOVER>
		$VALUES = (new InAppNotification$a[] {
			UNKNOWN, MINI, TAKEOVER
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       InAppNotification$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #29  <Field InAppNotification$a UNKNOWN>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #33  <Field InAppNotification$a MINI>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #37  <Field InAppNotification$a TAKEOVER>
	//   31   60:aastore         
	//   32   61:putstatic       #39  <Field InAppNotification$a[] $VALUES>
	//*  33   64:return          
	}

	private InAppNotification$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}

	InAppNotification$a(String s, int i, InAppNotification$1 inappnotification$1)
	{
		this(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void InAppNotification$a(String, int)>
	//    4    6:return          
	}
}
