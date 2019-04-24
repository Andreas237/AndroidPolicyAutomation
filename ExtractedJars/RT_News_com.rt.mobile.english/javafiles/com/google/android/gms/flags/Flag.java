// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.flags:
//			Singletons, FlagRegistry, FlagValueProvider, zza, 
//			IFlagProvider

public abstract class Flag
{
	public static class BooleanFlag extends Flag
	{

		public Boolean get(IFlagProvider iflagprovider)
		{
			boolean flag;
			try
			{
				flag = iflagprovider.getBooleanFlagValue(((Flag)this).getKey(), ((Boolean)((Flag)this).getDefault()).booleanValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #20  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #24  <Method Object Flag.getDefault()>
		//    5    9:checkcast       #26  <Class Boolean>
		//    6   12:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #34  <Method int Flag.getSource()>
		//    9   19:invokeinterface #40  <Method boolean IFlagProvider.getBooleanFlagValue(String, boolean, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #24  <Method Object Flag.getDefault()>
		//*  16   34:checkcast       #26  <Class Boolean>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(IFlagProvider iflagprovider)
			{
				return (Boolean)((Flag)this).getDefault();
			}
			return Boolean.valueOf(flag);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public volatile Object get(IFlagProvider iflagprovider)
		{
			return ((Object) (get(iflagprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #47  <Method Boolean get(IFlagProvider)>
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
		//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class IntegerFlag extends Flag
	{

		public Integer get(IFlagProvider iflagprovider)
		{
			int i;
			try
			{
				i = iflagprovider.getIntFlagValue(((Flag)this).getKey(), ((Integer)((Flag)this).getDefault()).intValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #20  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #24  <Method Object Flag.getDefault()>
		//    5    9:checkcast       #26  <Class Integer>
		//    6   12:invokevirtual   #30  <Method int Integer.intValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #33  <Method int Flag.getSource()>
		//    9   19:invokeinterface #39  <Method int IFlagProvider.getIntFlagValue(String, int, int)>
		//   10   24:istore_2        
			}
		//*  11   25:iload_2         
		//*  12   26:invokestatic    #43  <Method Integer Integer.valueOf(int)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #24  <Method Object Flag.getDefault()>
		//*  16   34:checkcast       #26  <Class Integer>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(IFlagProvider iflagprovider)
			{
				return (Integer)((Flag)this).getDefault();
			}
			return Integer.valueOf(i);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public volatile Object get(IFlagProvider iflagprovider)
		{
			return ((Object) (get(iflagprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #46  <Method Integer get(IFlagProvider)>
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
		//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class LongFlag extends Flag
	{

		public Long get(IFlagProvider iflagprovider)
		{
			long l;
			try
			{
				l = iflagprovider.getLongFlagValue(((Flag)this).getKey(), ((Long)((Flag)this).getDefault()).longValue(), ((Flag)this).getSource());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #20  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #24  <Method Object Flag.getDefault()>
		//    5    9:checkcast       #26  <Class Long>
		//    6   12:invokevirtual   #30  <Method long Long.longValue()>
		//    7   15:aload_0         
		//    8   16:invokevirtual   #34  <Method int Flag.getSource()>
		//    9   19:invokeinterface #40  <Method long IFlagProvider.getLongFlagValue(String, long, int)>
		//   10   24:lstore_2        
			}
		//*  11   25:lload_2         
		//*  12   26:invokestatic    #44  <Method Long Long.valueOf(long)>
		//*  13   29:areturn         
		//*  14   30:aload_0         
		//*  15   31:invokevirtual   #24  <Method Object Flag.getDefault()>
		//*  16   34:checkcast       #26  <Class Long>
		//*  17   37:areturn         
			// Misplaced declaration of an exception variable
			catch(IFlagProvider iflagprovider)
			{
				return (Long)((Flag)this).getDefault();
			}
			return Long.valueOf(l);
		//*  18   38:astore_1        
		//*  19   39:goto            30
		}

		public volatile Object get(IFlagProvider iflagprovider)
		{
			return ((Object) (get(iflagprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #47  <Method Long get(IFlagProvider)>
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
		//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}

	public static class StringFlag extends Flag
	{

		public volatile Object get(IFlagProvider iflagprovider)
		{
			return ((Object) (get(iflagprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #17  <Method String get(IFlagProvider)>
		//    3    5:areturn         
		}

		public String get(IFlagProvider iflagprovider)
		{
			try
			{
				iflagprovider = ((IFlagProvider) (iflagprovider.getStringFlagValue(((Flag)this).getKey(), (String)((Flag)this).getDefault(), ((Flag)this).getSource())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #23  <Method String Flag.getKey()>
		//    3    5:aload_0         
		//    4    6:invokevirtual   #27  <Method Object Flag.getDefault()>
		//    5    9:checkcast       #29  <Class String>
		//    6   12:aload_0         
		//    7   13:invokevirtual   #33  <Method int Flag.getSource()>
		//    8   16:invokeinterface #39  <Method String IFlagProvider.getStringFlagValue(String, String, int)>
		//    9   21:astore_1        
			}
		//*  10   22:aload_1         
		//*  11   23:areturn         
		//*  12   24:aload_0         
		//*  13   25:invokevirtual   #27  <Method Object Flag.getDefault()>
		//*  14   28:checkcast       #29  <Class String>
		//*  15   31:areturn         
			// Misplaced declaration of an exception variable
			catch(IFlagProvider iflagprovider)
			{
				return (String)((Flag)this).getDefault();
			}
			return ((String) (iflagprovider));
		//*  16   32:astore_1        
		//*  17   33:goto            24
		}

		public StringFlag(int i, String s, String s1)
		{
			super(i, s, ((Object) (s1)), ((zza) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aconst_null     
		//    5    5:invokespecial   #11  <Method void Flag(int, String, Object, zza)>
		//    6    8:return          
		}
	}


	private Flag(int i, String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		zzacb = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int zzacb>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field String mKey>
		mDefaultValue = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field Object mDefaultValue>
		Singletons.flagRegistry().registerFlag(this);
	//   11   19:invokestatic    #41  <Method FlagRegistry Singletons.flagRegistry()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #47  <Method void FlagRegistry.registerFlag(Flag)>
	//   14   26:return          
	}

	Flag(int i, String s, Object obj, zza zza)
	{
		this(i, s, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #53  <Method void Flag(int, String, Object)>
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
	//    5    7:invokespecial   #58  <Method void Flag$BooleanFlag(int, String, Boolean)>
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
	//    5    7:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    6   10:invokespecial   #68  <Method void Flag$IntegerFlag(int, String, Integer)>
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
	//    5    7:invokestatic    #74  <Method Long Long.valueOf(long)>
	//    6   10:invokespecial   #77  <Method void Flag$LongFlag(int, String, Long)>
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
	//    5    7:invokespecial   #81  <Method void Flag$StringFlag(int, String, String)>
	//    6   10:areturn         
	}

	public static StringFlag defineClientExperimentId(int i, String s)
	{
		s = ((String) (define(i, s, ((String) (null)))));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #85  <Method Flag$StringFlag define(int, String, String)>
	//    4    6:astore_1        
		Singletons.flagRegistry().registerClientExperimentId(((StringFlag) (s)));
	//    5    7:invokestatic    #41  <Method FlagRegistry Singletons.flagRegistry()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #89  <Method void FlagRegistry.registerClientExperimentId(Flag$StringFlag)>
		return ((StringFlag) (s));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public static StringFlag defineServiceExperimentId(int i, String s)
	{
		s = ((String) (define(i, s, ((String) (null)))));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #85  <Method Flag$StringFlag define(int, String, String)>
	//    4    6:astore_1        
		Singletons.flagRegistry().registerServiceExperimentId(((StringFlag) (s)));
	//    5    7:invokestatic    #41  <Method FlagRegistry Singletons.flagRegistry()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #93  <Method void FlagRegistry.registerServiceExperimentId(Flag$StringFlag)>
		return ((StringFlag) (s));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public Object get()
	{
		return Singletons.flagValueProvider().getFlagValue(this);
	//    0    0:invokestatic    #99  <Method FlagValueProvider Singletons.flagValueProvider()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #105 <Method Object FlagValueProvider.getFlagValue(Flag)>
	//    3    7:areturn         
	}

	protected abstract Object get(IFlagProvider iflagprovider);

	public Object getDefault()
	{
		return mDefaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object mDefaultValue>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mKey>
	//    2    4:areturn         
	}

	public int getSource()
	{
		return zzacb;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzacb>
	//    2    4:ireturn         
	}

	private final Object mDefaultValue;
	private final String mKey;
	private final int zzacb;
}
