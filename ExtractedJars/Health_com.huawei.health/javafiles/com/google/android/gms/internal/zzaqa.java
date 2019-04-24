// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqe, zzaqb, zzaqc, zzaqd

public abstract class zzaqa
{
	public static class zza extends zzaqa
	{

		public Object zza(zzaqd zzaqd1)
		{
			return ((Object) (zzb(zzaqd1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #17  <Method Boolean zzb(zzaqd)>
		//    3    5:areturn         
		}

		public Boolean zzb(zzaqd zzaqd1)
		{
			boolean flag;
			try
			{
				flag = zzaqd1.getBooleanFlagValue(getKey(), ((Boolean)zzfr()).booleanValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #23  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #27  <Method Object zzfr()>
		//    5    9:checkcast       #29  <Class Boolean>
		//    6   12:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #37  <Method int getSource()>
		//    9   19:invokeinterface #43  <Method boolean zzaqd.getBooleanFlagValue(String, boolean, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #27  <Method Object zzfr()>
		//*  16   34:checkcast       #29  <Class Boolean>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzaqd zzaqd1)
			{
				return (Boolean)zzfr();
			}
			return Boolean.valueOf(flag);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public zza(int i, String s, Boolean boolean1)
		{
			super(i, s, ((Object) (boolean1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
		//    6    8:return          
		}
	}

	public static class zzb extends zzaqa
	{

		public Object zza(zzaqd zzaqd1)
		{
			return ((Object) (zzc(zzaqd1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method Integer zzc(zzaqd)>
		//    3    5:areturn         
		}

		public Integer zzc(zzaqd zzaqd1)
		{
			int i;
			try
			{
				i = zzaqd1.getIntFlagValue(getKey(), ((Integer)zzfr()).intValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfr()>
		//    5    9:checkcast       #30  <Class Integer>
		//    6   12:invokevirtual   #34  <Method int Integer.intValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #37  <Method int getSource()>
		//    9   19:invokeinterface #43  <Method int zzaqd.getIntFlagValue(String, int, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #47  <Method Integer Integer.valueOf(int)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #28  <Method Object zzfr()>
		//*  16   34:checkcast       #30  <Class Integer>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzaqd zzaqd1)
			{
				return (Integer)zzfr();
			}
			return Integer.valueOf(i);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public zzb(int i, String s, Integer integer)
		{
			super(i, s, ((Object) (integer)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
		//    6    8:return          
		}
	}

	public static class zzc extends zzaqa
	{

		public Object zza(zzaqd zzaqd1)
		{
			return ((Object) (zzd(zzaqd1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method Long zzd(zzaqd)>
		//    3    5:areturn         
		}

		public Long zzd(zzaqd zzaqd1)
		{
			long l;
			try
			{
				l = zzaqd1.getLongFlagValue(getKey(), ((Long)zzfr()).longValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfr()>
		//    5    9:checkcast       #30  <Class Long>
		//    6   12:invokevirtual   #34  <Method long Long.longValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #38  <Method int getSource()>
		//    9   19:invokeinterface #44  <Method long zzaqd.getLongFlagValue(String, long, int)>
		//   10   24:lstore_2        
			}
		//*  11   25:lload_2         
		//*  12   26:invokestatic    #48  <Method Long Long.valueOf(long)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #28  <Method Object zzfr()>
		//*  16   34:checkcast       #30  <Class Long>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzaqd zzaqd1)
			{
				return (Long)zzfr();
			}
			return Long.valueOf(l);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public zzc(int i, String s, Long long1)
		{
			super(i, s, ((Object) (long1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
		//    6    8:return          
		}
	}

	public static class zzd extends zzaqa
	{

		public Object zza(zzaqd zzaqd1)
		{
			return ((Object) (zze(zzaqd1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method String zze(zzaqd)>
		//    3    5:areturn         
		}

		public String zze(zzaqd zzaqd1)
		{
			try
			{
				zzaqd1 = ((zzaqd) (zzaqd1.getStringFlagValue(getKey(), (String)zzfr(), getSource())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfr()>
		//    5    9:checkcast       #30  <Class String>
		//    6   12:aload_0         
		//    7   13:invokevirtual   #34  <Method int getSource()>
		//    8   16:invokeinterface #40  <Method String zzaqd.getStringFlagValue(String, String, int)>
		//    9   21:astore_1        
			}
		//*  10   22:aload_1         
		//*  11   23:areturn         
		//*  12   24:aload_0         
		//*  13   25:invokevirtual   #28  <Method Object zzfr()>
		//*  14   28:checkcast       #30  <Class String>
		//*  15   31:areturn         
			// Misplaced declaration of an exception variable
			catch(zzaqd zzaqd1)
			{
				return (String)zzfr();
			}
			return ((String) (zzaqd1));
		//*  16   32:astore_1        
		//*  17   33:goto            24
		}

		public zzd(int i, String s, String s1)
		{
			super(i, s, ((Object) (s1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzaqa(int, String, Object, zzaqa$1)>
		//    6    8:return          
		}
	}


	private zzaqa(int i, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zzAW = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zzAW>
		zzAX = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field String zzAX>
		zzAY = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field Object zzAY>
		zzaqe.zzDE().zza(this);
	//   11   19:invokestatic    #43  <Method zzaqb zzaqe.zzDE()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #48  <Method void zzaqb.zza(zzaqa)>
	//   14   26:return          
	}


	public static zza zzb(int i, String s, Boolean boolean1)
	{
		return new zza(i, s, boolean1);
	//    0    0:new             #9   <Class zzaqa$zza>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #58  <Method void zzaqa$zza(int, String, Boolean)>
	//    6   10:areturn         
	}

	public static zzb zzb(int i, String s, int j)
	{
		return new zzb(i, s, Integer.valueOf(j));
	//    0    0:new             #12  <Class zzaqa$zzb>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #68  <Method void zzaqa$zzb(int, String, Integer)>
	//    7   13:areturn         
	}

	public static zzc zzb(int i, String s, long l)
	{
		return new zzc(i, s, Long.valueOf(l));
	//    0    0:new             #15  <Class zzaqa$zzc>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:invokestatic    #74  <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #77  <Method void zzaqa$zzc(int, String, Long)>
	//    7   13:areturn         
	}

	public static zzd zzc(int i, String s, String s1)
	{
		return new zzd(i, s, s1);
	//    0    0:new             #18  <Class zzaqa$zzd>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #81  <Method void zzaqa$zzd(int, String, String)>
	//    6   10:areturn         
	}

	public Object get()
	{
		return zzaqe.zzDF().zzb(this);
	//    0    0:invokestatic    #87  <Method zzaqc zzaqe.zzDF()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #92  <Method Object zzaqc.zzb(zzaqa)>
	//    3    7:areturn         
	}

	public String getKey()
	{
		return zzAX;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzAX>
	//    2    4:areturn         
	}

	public int getSource()
	{
		return zzAW;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzAW>
	//    2    4:ireturn         
	}

	protected abstract Object zza(zzaqd zzaqd);

	public Object zzfr()
	{
		return zzAY;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object zzAY>
	//    2    4:areturn         
	}

	private final int zzAW;
	private final String zzAX;
	private final Object zzAY;
}
