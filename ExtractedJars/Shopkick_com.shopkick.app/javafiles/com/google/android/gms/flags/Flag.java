// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Singletons, FlagRegistry, zzb, zza, 
//			zzc

public abstract class Flag
{
	public static class BooleanFlag extends Flag
	{

		private final Boolean zzb(zzc zzc1)
		{
			boolean flag;
			try
			{
				flag = zzc1.getBooleanFlagValue(((Flag)this).getKey(), ((Boolean)((Flag)this).zzb()).booleanValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #21  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #24  <Method Object Flag.zzb()>
		//    5    9:checkcast       #26  <Class Boolean>
		//    6   12:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #34  <Method int Flag.getSource()>
		//    9   19:invokeinterface #40  <Method boolean zzc.getBooleanFlagValue(String, boolean, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #24  <Method Object Flag.zzb()>
		//*  16   34:checkcast       #26  <Class Boolean>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzc zzc1)
			{
				return (Boolean)((Flag)this).zzb();
			}
			return Boolean.valueOf(flag);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public final Object zza(zzc zzc1)
		{
			return ((Object) (zzb(zzc1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method Boolean zzb(zzc)>
		//    3    5:areturn         
		}

		public BooleanFlag(int i, String s, Boolean boolean1)
		{
			super(i, s, ((Object) (boolean1)), ((zza) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #12  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class IntegerFlag extends Flag
	{

		private final Integer zzc(zzc zzc1)
		{
			int i;
			try
			{
				i = zzc1.getIntFlagValue(((Flag)this).getKey(), ((Integer)((Flag)this).zzb()).intValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
		//    5    9:checkcast       #28  <Class Integer>
		//    6   12:invokevirtual   #32  <Method int Integer.intValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #35  <Method int Flag.getSource()>
		//    9   19:invokeinterface #41  <Method int zzc.getIntFlagValue(String, int, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #45  <Method Integer Integer.valueOf(int)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #26  <Method Object Flag.zzb()>
		//*  16   34:checkcast       #28  <Class Integer>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzc zzc1)
			{
				return (Integer)((Flag)this).zzb();
			}
			return Integer.valueOf(i);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public final Object zza(zzc zzc1)
		{
			return ((Object) (zzc(zzc1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method Integer zzc(zzc)>
		//    3    5:areturn         
		}

		public IntegerFlag(int i, String s, Integer integer)
		{
			super(i, s, ((Object) (integer)), ((zza) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class LongFlag extends Flag
	{

		private final Long zzd(zzc zzc1)
		{
			long l;
			try
			{
				l = zzc1.getLongFlagValue(((Flag)this).getKey(), ((Long)((Flag)this).zzb()).longValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
		//    5    9:checkcast       #28  <Class Long>
		//    6   12:invokevirtual   #32  <Method long Long.longValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #36  <Method int Flag.getSource()>
		//    9   19:invokeinterface #42  <Method long zzc.getLongFlagValue(String, long, int)>
		//   10   24:lstore_2        
			}
		//*  11   25:lload_2         
		//*  12   26:invokestatic    #46  <Method Long Long.valueOf(long)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #26  <Method Object Flag.zzb()>
		//*  16   34:checkcast       #28  <Class Long>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(zzc zzc1)
			{
				return (Long)((Flag)this).zzb();
			}
			return Long.valueOf(l);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public final Object zza(zzc zzc1)
		{
			return ((Object) (zzd(zzc1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #50  <Method Long zzd(zzc)>
		//    3    5:areturn         
		}

		public LongFlag(int i, String s, Long long1)
		{
			super(i, s, ((Object) (long1)), ((zza) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class StringFlag extends Flag
	{

		private final String zze(zzc zzc1)
		{
			try
			{
				zzc1 = ((zzc) (zzc1.getStringFlagValue(((Flag)this).getKey(), (String)((Flag)this).zzb(), ((Flag)this).getSource())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #22  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #26  <Method Object Flag.zzb()>
		//    5    9:checkcast       #28  <Class String>
		//    6   12:aload_0         
		//    7   13:invokevirtual   #32  <Method int Flag.getSource()>
		//    8   16:invokeinterface #38  <Method String zzc.getStringFlagValue(String, String, int)>
		//    9   21:astore_1        
			}
		//*  10   22:aload_1         
		//*  11   23:areturn         
		//*  12   24:aload_0         
		//*  13   25:invokevirtual   #26  <Method Object Flag.zzb()>
		//*  14   28:checkcast       #28  <Class String>
		//*  15   31:areturn         
			// Misplaced declaration of an exception variable
			catch(zzc zzc1)
			{
				return (String)((Flag)this).zzb();
			}
			return ((String) (zzc1));
		//*  16   32:astore_1        
		//*  17   33:goto            24
		}

		public final Object zza(zzc zzc1)
		{
			return ((Object) (zze(zzc1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method String zze(zzc)>
		//    3    5:areturn         
		}

		public StringFlag(int i, String s, String s1)
		{
			super(i, s, ((Object) (s1)), ((zza) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #13  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}


	private Flag(int i, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zze = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zze>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field String mKey>
		zzf = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field Object zzf>
		Singletons.flagRegistry().zza(this);
	//   11   19:invokestatic    #43  <Method FlagRegistry Singletons.flagRegistry()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #49  <Method void FlagRegistry.zza(Flag)>
	//   14   26:return          
	}

	Flag(int i, String s, Object obj, zza zza1)
	{
		this(i, s, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #55  <Method void Flag(int, String, Object)>
	//    5    7:return          
	}

	public static BooleanFlag define(int i, String s, Boolean boolean1)
	{
		return new BooleanFlag(i, s, boolean1);
	//    0    0:new             #7   <Class Flag$BooleanFlag>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #60  <Method void Flag$BooleanFlag(int, String, Boolean)>
	//    6   10:areturn         
	}

	public static IntegerFlag define(int i, String s, int j)
	{
		return new IntegerFlag(i, s, Integer.valueOf(j));
	//    0    0:new             #10  <Class Flag$IntegerFlag>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #69  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #72  <Method void Flag$IntegerFlag(int, String, Integer)>
	//    7   13:areturn         
	}

	public static LongFlag define(int i, String s, long l)
	{
		return new LongFlag(i, s, Long.valueOf(l));
	//    0    0:new             #13  <Class Flag$LongFlag>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:invokestatic    #78  <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #81  <Method void Flag$LongFlag(int, String, Long)>
	//    7   13:areturn         
	}

	public static StringFlag define(int i, String s, String s1)
	{
		return new StringFlag(i, s, s1);
	//    0    0:new             #16  <Class Flag$StringFlag>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #85  <Method void Flag$StringFlag(int, String, String)>
	//    6   10:areturn         
	}

	public Object get()
	{
		return Singletons.zzd().zzb(this);
	//    0    0:invokestatic    #91  <Method zzb Singletons.zzd()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #97  <Method Object zzb.zzb(Flag)>
	//    3    7:areturn         
	}

	public final String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mKey>
	//    2    4:areturn         
	}

	public final int getSource()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zze>
	//    2    4:ireturn         
	}

	protected abstract Object zza(zzc zzc);

	public final Object zzb()
	{
		return zzf;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object zzf>
	//    2    4:areturn         
	}

	private final String mKey;
	private final int zze;
	private final Object zzf;
}
