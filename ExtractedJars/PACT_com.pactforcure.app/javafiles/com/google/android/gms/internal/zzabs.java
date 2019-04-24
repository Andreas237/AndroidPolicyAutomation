// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzabs
{
	private static interface zza
	{

		public abstract Long getLong(String s, Long long1);

		public abstract String getString(String s, String s1);

		public abstract Boolean zza(String s, Boolean boolean1);

		public abstract Float zzb(String s, Float float1);

		public abstract Integer zzb(String s, Integer integer);
	}


	protected zzabs(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzaCf = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field Object zzaCf>
		zzAH = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #51  <Field String zzAH>
		zzAI = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #53  <Field Object zzAI>
	//   11   19:return          
	}

	public static zzabs zzA(String s, String s1)
	{
		return ((zzabs) (new zzabs(s, s1) {

			protected Object zzdd(String s2)
			{
				return ((Object) (zzdi(s2)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #20  <Method String zzdi(String)>
			//    3    5:areturn         
			}

			protected String zzdi(String s2)
			{
				s2 = zzAH;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field String zzAH>
			//    2    4:astore_1        
				s2 = (String)zzAI;
			//    3    5:aload_0         
			//    4    6:getfield        #28  <Field Object zzAI>
			//    5    9:checkcast       #30  <Class String>
			//    6   12:astore_1        
				throw new NullPointerException();
			//    7   13:new             #32  <Class NullPointerException>
			//    8   16:dup             
			//    9   17:invokespecial   #35  <Method void NullPointerException()>
			//   10   20:athrow          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #15  <Class zzabs$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void zzabs$5(String, String)>
	//    5    9:areturn         
	}

	public static zzabs zza(String s, Float float1)
	{
		return ((zzabs) (new zzabs(s, float1) {

			protected Object zzdd(String s1)
			{
				return ((Object) (zzdh(s1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #20  <Method Float zzdh(String)>
			//    3    5:areturn         
			}

			protected Float zzdh(String s1)
			{
				s1 = zzAH;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field String zzAH>
			//    2    4:astore_1        
				s1 = ((String) ((Float)zzAI));
			//    3    5:aload_0         
			//    4    6:getfield        #28  <Field Object zzAI>
			//    5    9:checkcast       #30  <Class Float>
			//    6   12:astore_1        
				throw new NullPointerException();
			//    7   13:new             #32  <Class NullPointerException>
			//    8   16:dup             
			//    9   17:invokespecial   #35  <Method void NullPointerException()>
			//   10   20:athrow          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #13  <Class zzabs$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void zzabs$4(String, Float)>
	//    5    9:areturn         
	}

	public static zzabs zza(String s, Integer integer)
	{
		return ((zzabs) (new zzabs(s, integer) {

			protected Object zzdd(String s1)
			{
				return ((Object) (zzdg(s1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #20  <Method Integer zzdg(String)>
			//    3    5:areturn         
			}

			protected Integer zzdg(String s1)
			{
				s1 = zzAH;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field String zzAH>
			//    2    4:astore_1        
				s1 = ((String) ((Integer)zzAI));
			//    3    5:aload_0         
			//    4    6:getfield        #28  <Field Object zzAI>
			//    5    9:checkcast       #30  <Class Integer>
			//    6   12:astore_1        
				throw new NullPointerException();
			//    7   13:new             #32  <Class NullPointerException>
			//    8   16:dup             
			//    9   17:invokespecial   #35  <Method void NullPointerException()>
			//   10   20:athrow          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #11  <Class zzabs$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #70  <Method void zzabs$3(String, Integer)>
	//    5    9:areturn         
	}

	public static zzabs zza(String s, Long long1)
	{
		return ((zzabs) (new zzabs(s, long1) {

			protected Object zzdd(String s1)
			{
				return ((Object) (zzdf(s1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #20  <Method Long zzdf(String)>
			//    3    5:areturn         
			}

			protected Long zzdf(String s1)
			{
				s1 = zzAH;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field String zzAH>
			//    2    4:astore_1        
				s1 = ((String) ((Long)zzAI));
			//    3    5:aload_0         
			//    4    6:getfield        #28  <Field Object zzAI>
			//    5    9:checkcast       #30  <Class Long>
			//    6   12:astore_1        
				throw new NullPointerException();
			//    7   13:new             #32  <Class NullPointerException>
			//    8   16:dup             
			//    9   17:invokespecial   #35  <Method void NullPointerException()>
			//   10   20:athrow          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #9   <Class zzabs$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #75  <Method void zzabs$2(String, Long)>
	//    5    9:areturn         
	}

	public static zzabs zzj(String s, boolean flag)
	{
		return ((zzabs) (new zzabs(s, Boolean.valueOf(flag)) {

			protected Object zzdd(String s1)
			{
				return ((Object) (zzde(s1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #20  <Method Boolean zzde(String)>
			//    3    5:areturn         
			}

			protected Boolean zzde(String s1)
			{
				s1 = zzAH;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field String zzAH>
			//    2    4:astore_1        
				s1 = ((String) ((Boolean)zzAI));
			//    3    5:aload_0         
			//    4    6:getfield        #28  <Field Object zzAI>
			//    5    9:checkcast       #30  <Class Boolean>
			//    6   12:astore_1        
				throw new NullPointerException();
			//    7   13:new             #32  <Class NullPointerException>
			//    8   16:dup             
			//    9   17:invokespecial   #35  <Method void NullPointerException()>
			//   10   20:athrow          
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void zzabs(String, Object)>
			//    4    6:return          
			}
		}
));
	//    0    0:new             #7   <Class zzabs$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #87  <Method void zzabs$1(String, Boolean)>
	//    6   12:areturn         
	}

	public final Object get()
	{
		Object obj = zzdd(zzAH);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field String zzAH>
	//    3    5:invokevirtual   #96  <Method Object zzdd(String)>
	//    4    8:astore_3        
		return obj;
	//    5    9:aload_3         
	//    6   10:areturn         
		Object obj1;
		obj1;
	//    7   11:astore_3        
		long l = Binder.clearCallingIdentity();
	//    8   12:invokestatic    #102 <Method long Binder.clearCallingIdentity()>
	//    9   15:lstore_1        
		obj1 = zzdd(zzAH);
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #51  <Field String zzAH>
	//   13   21:invokevirtual   #96  <Method Object zzdd(String)>
	//   14   24:astore_3        
		Binder.restoreCallingIdentity(l);
	//   15   25:lload_1         
	//   16   26:invokestatic    #106 <Method void Binder.restoreCallingIdentity(long)>
		return obj1;
	//   17   29:aload_3         
	//   18   30:areturn         
		obj1;
	//   19   31:astore_3        
		Binder.restoreCallingIdentity(l);
	//   20   32:lload_1         
	//   21   33:invokestatic    #106 <Method void Binder.restoreCallingIdentity(long)>
		throw obj1;
	//   22   36:aload_3         
	//   23   37:athrow          
	}

	protected abstract Object zzdd(String s);

	private static String READ_PERMISSION = "com.google.android.providers.gsf.permission.READ_GSERVICES";
	private static zza zzaCd = null;
	private static int zzaCe = 0;
	private static final Object zztU = new Object();
	protected final String zzAH;
	protected final Object zzAI;
	private Object zzaCf;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void Object()>
	//    3    7:putstatic       #37  <Field Object zztU>
	//    4   10:aconst_null     
	//    5   11:putstatic       #39  <Field zzabs$zza zzaCd>
	//    6   14:iconst_0        
	//    7   15:putstatic       #41  <Field int zzaCe>
	//    8   18:ldc1            #43  <String "com.google.android.providers.gsf.permission.READ_GSERVICES">
	//    9   20:putstatic       #45  <Field String READ_PERMISSION>
	//*  10   23:return          
	}
}
