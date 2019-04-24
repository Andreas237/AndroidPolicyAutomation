// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//			zzapr, zzapo, zzapp, zzapq

public abstract class zzapn
{
	public static class zza extends zzapn
	{

		public Object zza(zzapq zzapq1)
		{
			return ((Object) (zzb(zzapq1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #17  <Method Boolean zzb(zzapq)>
		//    3    5:areturn         
		}

		public Boolean zzb(zzapq zzapq1)
		{
			boolean flag;
			try
			{
				flag = zzapq1.getBooleanFlagValue(getKey(), ((Boolean)zzfm()).booleanValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #23  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #27  <Method Object zzfm()>
		//    5    9:checkcast       #29  <Class Boolean>
		//    6   12:invokevirtual   #33  <Method boolean Boolean.booleanValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #37  <Method int getSource()>
		//    9   19:invokeinterface #43  <Method boolean zzapq.getBooleanFlagValue(String, boolean, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #47  <Method Boolean Boolean.valueOf(boolean)>
		//*  13   29:areturn         
			// Misplaced declaration of an exception variable
			catch(zzapq zzapq1)
		//*  14   30:astore_1        
			{
				return (Boolean)zzfm();
		//   15   31:aload_0         
		//   16   32:invokevirtual   #27  <Method Object zzfm()>
		//   17   35:checkcast       #29  <Class Boolean>
		//   18   38:areturn         
			}
			return Boolean.valueOf(flag);
		}

		public zza(int i, String s, Boolean boolean1)
		{
			super(i, s, ((Object) (boolean1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
		//    6    8:return          
		}
	}

	public static class zzb extends zzapn
	{

		public Object zza(zzapq zzapq1)
		{
			return ((Object) (zzc(zzapq1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method Integer zzc(zzapq)>
		//    3    5:areturn         
		}

		public Integer zzc(zzapq zzapq1)
		{
			int i;
			try
			{
				i = zzapq1.getIntFlagValue(getKey(), ((Integer)zzfm()).intValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfm()>
		//    5    9:checkcast       #30  <Class Integer>
		//    6   12:invokevirtual   #34  <Method int Integer.intValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #37  <Method int getSource()>
		//    9   19:invokeinterface #43  <Method int zzapq.getIntFlagValue(String, int, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #47  <Method Integer Integer.valueOf(int)>
		//*  13   29:areturn         
			// Misplaced declaration of an exception variable
			catch(zzapq zzapq1)
		//*  14   30:astore_1        
			{
				return (Integer)zzfm();
		//   15   31:aload_0         
		//   16   32:invokevirtual   #28  <Method Object zzfm()>
		//   17   35:checkcast       #30  <Class Integer>
		//   18   38:areturn         
			}
			return Integer.valueOf(i);
		}

		public zzb(int i, String s, Integer integer)
		{
			super(i, s, ((Object) (integer)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
		//    6    8:return          
		}
	}

	public static class zzc extends zzapn
	{

		public Object zza(zzapq zzapq1)
		{
			return ((Object) (zzd(zzapq1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method Long zzd(zzapq)>
		//    3    5:areturn         
		}

		public Long zzd(zzapq zzapq1)
		{
			long l;
			try
			{
				l = zzapq1.getLongFlagValue(getKey(), ((Long)zzfm()).longValue(), getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfm()>
		//    5    9:checkcast       #30  <Class Long>
		//    6   12:invokevirtual   #34  <Method long Long.longValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #38  <Method int getSource()>
		//    9   19:invokeinterface #44  <Method long zzapq.getLongFlagValue(String, long, int)>
		//   10   24:lstore_2        
			}
		//*  11   25:lload_2         
		//*  12   26:invokestatic    #48  <Method Long Long.valueOf(long)>
		//*  13   29:areturn         
			// Misplaced declaration of an exception variable
			catch(zzapq zzapq1)
		//*  14   30:astore_1        
			{
				return (Long)zzfm();
		//   15   31:aload_0         
		//   16   32:invokevirtual   #28  <Method Object zzfm()>
		//   17   35:checkcast       #30  <Class Long>
		//   18   38:areturn         
			}
			return Long.valueOf(l);
		}

		public zzc(int i, String s, Long long1)
		{
			super(i, s, ((Object) (long1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
		//    6    8:return          
		}
	}

	public static class zzd extends zzapn
	{

		public Object zza(zzapq zzapq1)
		{
			return ((Object) (zze(zzapq1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #18  <Method String zze(zzapq)>
		//    3    5:areturn         
		}

		public String zze(zzapq zzapq1)
		{
			try
			{
				zzapq1 = ((zzapq) (zzapq1.getStringFlagValue(getKey(), (String)zzfm(), getSource())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #24  <Method String getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #28  <Method Object zzfm()>
		//    5    9:checkcast       #30  <Class String>
		//    6   12:aload_0         
		//    7   13:invokevirtual   #34  <Method int getSource()>
		//    8   16:invokeinterface #40  <Method String zzapq.getStringFlagValue(String, String, int)>
		//    9   21:astore_1        
			}
		//*  10   22:aload_1         
		//*  11   23:areturn         
			// Misplaced declaration of an exception variable
			catch(zzapq zzapq1)
		//*  12   24:astore_1        
			{
				return (String)zzfm();
		//   13   25:aload_0         
		//   14   26:invokevirtual   #28  <Method Object zzfm()>
		//   15   29:checkcast       #30  <Class String>
		//   16   32:areturn         
			}
			return ((String) (zzapq1));
		}

		public zzd(int i, String s, String s1)
		{
			super(i, s, ((Object) (s1)), ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void zzapn(int, String, Object, zzapn$1)>
		//    6    8:return          
		}
	}


	private zzapn(int i, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zzAG = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zzAG>
		zzAH = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field String zzAH>
		zzAI = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field Object zzAI>
		zzapr.zzCQ().zza(this);
	//   11   19:invokestatic    #43  <Method zzapo zzapr.zzCQ()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #48  <Method void zzapo.zza(zzapn)>
	//   14   26:return          
	}


	public static zza zzb(int i, String s, Boolean boolean1)
	{
		return new zza(i, s, boolean1);
	//    0    0:new             #9   <Class zzapn$zza>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #58  <Method void zzapn$zza(int, String, Boolean)>
	//    6   10:areturn         
	}

	public static zzb zzb(int i, String s, int j)
	{
		return new zzb(i, s, Integer.valueOf(j));
	//    0    0:new             #12  <Class zzapn$zzb>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #68  <Method void zzapn$zzb(int, String, Integer)>
	//    7   13:areturn         
	}

	public static zzc zzb(int i, String s, long l)
	{
		return new zzc(i, s, Long.valueOf(l));
	//    0    0:new             #15  <Class zzapn$zzc>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:invokestatic    #74  <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #77  <Method void zzapn$zzc(int, String, Long)>
	//    7   13:areturn         
	}

	public static zzd zzc(int i, String s, String s1)
	{
		return new zzd(i, s, s1);
	//    0    0:new             #18  <Class zzapn$zzd>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #81  <Method void zzapn$zzd(int, String, String)>
	//    6   10:areturn         
	}

	public Object get()
	{
		return zzapr.zzCR().zzb(this);
	//    0    0:invokestatic    #87  <Method zzapp zzapr.zzCR()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #92  <Method Object zzapp.zzb(zzapn)>
	//    3    7:areturn         
	}

	public String getKey()
	{
		return zzAH;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzAH>
	//    2    4:areturn         
	}

	public int getSource()
	{
		return zzAG;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzAG>
	//    2    4:ireturn         
	}

	protected abstract Object zza(zzapq zzapq);

	public Object zzfm()
	{
		return zzAI;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object zzAI>
	//    2    4:areturn         
	}

	private final int zzAG;
	private final String zzAH;
	private final Object zzAI;
}
