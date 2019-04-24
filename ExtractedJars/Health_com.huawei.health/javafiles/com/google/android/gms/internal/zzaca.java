// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


public abstract class zzaca
{
	static interface zza
	{
	}


	protected zzaca(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzaDE = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field Object zzaDE>
		zzAX = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #51  <Field String zzAX>
		zzAY = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #53  <Field Object zzAY>
	//   11   19:return          
	}

	public static zzaca zzB(String s, String s1)
	{
		return ((zzaca) (new zzaca(s, s1) {

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzaca(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #15  <Class zzaca$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void zzaca$5(String, String)>
	//    5    9:areturn         
	}

	public static zzaca zza(String s, Float float1)
	{
		return ((zzaca) (new zzaca(s, float1) {

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzaca(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #13  <Class zzaca$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void zzaca$4(String, Float)>
	//    5    9:areturn         
	}

	public static zzaca zza(String s, Integer integer)
	{
		return ((zzaca) (new zzaca(s, integer) {

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzaca(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #11  <Class zzaca$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #70  <Method void zzaca$3(String, Integer)>
	//    5    9:areturn         
	}

	public static zzaca zza(String s, Long long1)
	{
		return ((zzaca) (new zzaca(s, long1) {

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzaca(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #9   <Class zzaca$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #75  <Method void zzaca$2(String, Long)>
	//    5    9:areturn         
	}

	public static zzaca zzj(String s, boolean flag)
	{
		return ((zzaca) (new zzaca(s, Boolean.valueOf(flag)) {

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzaca(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #7   <Class zzaca$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #87  <Method void zzaca$1(String, Boolean)>
	//    6   12:areturn         
	}

	private static String READ_PERMISSION = "com.google.android.providers.gsf.permission.READ_GSERVICES";
	private static zza zzaDC = null;
	private static int zzaDD = 0;
	private static final Object zztX = new Object();
	protected final String zzAX;
	protected final Object zzAY;
	private Object zzaDE;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void Object()>
	//    3    7:putstatic       #37  <Field Object zztX>
	//    4   10:aconst_null     
	//    5   11:putstatic       #39  <Field zzaca$zza zzaDC>
	//    6   14:iconst_0        
	//    7   15:putstatic       #41  <Field int zzaDD>
	//    8   18:ldc1            #43  <String "com.google.android.providers.gsf.permission.READ_GSERVICES">
	//    9   20:putstatic       #45  <Field String READ_PERMISSION>
	//*  10   23:return          
	}
}
