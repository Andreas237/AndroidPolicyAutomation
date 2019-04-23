// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;


public final class Target
{

	Target()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		mSaturationTargets = new float[3];
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:putfield        #91  <Field float[] mSaturationTargets>
		mLightnessTargets = new float[3];
	//    6   11:aload_0         
	//    7   12:iconst_3        
	//    8   13:newarray        float[]
	//    9   15:putfield        #93  <Field float[] mLightnessTargets>
		mWeights = new float[3];
	//   10   18:aload_0         
	//   11   19:iconst_3        
	//   12   20:newarray        float[]
	//   13   22:putfield        #95  <Field float[] mWeights>
		mIsExclusive = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #97  <Field boolean mIsExclusive>
		setTargetDefaultValues(mSaturationTargets);
	//   17   30:aload_0         
	//   18   31:getfield        #91  <Field float[] mSaturationTargets>
	//   19   34:invokestatic    #101 <Method void setTargetDefaultValues(float[])>
		setTargetDefaultValues(mLightnessTargets);
	//   20   37:aload_0         
	//   21   38:getfield        #93  <Field float[] mLightnessTargets>
	//   22   41:invokestatic    #101 <Method void setTargetDefaultValues(float[])>
		setDefaultWeights();
	//   23   44:aload_0         
	//   24   45:invokespecial   #104 <Method void setDefaultWeights()>
	//   25   48:return          
	}

	Target(Target target)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		mSaturationTargets = new float[3];
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:putfield        #91  <Field float[] mSaturationTargets>
		mLightnessTargets = new float[3];
	//    6   11:aload_0         
	//    7   12:iconst_3        
	//    8   13:newarray        float[]
	//    9   15:putfield        #93  <Field float[] mLightnessTargets>
		mWeights = new float[3];
	//   10   18:aload_0         
	//   11   19:iconst_3        
	//   12   20:newarray        float[]
	//   13   22:putfield        #95  <Field float[] mWeights>
		mIsExclusive = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #97  <Field boolean mIsExclusive>
		float af[] = target.mSaturationTargets;
	//   17   30:aload_1         
	//   18   31:getfield        #91  <Field float[] mSaturationTargets>
	//   19   34:astore_2        
		float af1[] = mSaturationTargets;
	//   20   35:aload_0         
	//   21   36:getfield        #91  <Field float[] mSaturationTargets>
	//   22   39:astore_3        
		System.arraycopy(((Object) (af)), 0, ((Object) (af1)), 0, af1.length);
	//   23   40:aload_2         
	//   24   41:iconst_0        
	//   25   42:aload_3         
	//   26   43:iconst_0        
	//   27   44:aload_3         
	//   28   45:arraylength     
	//   29   46:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
		af = target.mLightnessTargets;
	//   30   49:aload_1         
	//   31   50:getfield        #93  <Field float[] mLightnessTargets>
	//   32   53:astore_2        
		af1 = mLightnessTargets;
	//   33   54:aload_0         
	//   34   55:getfield        #93  <Field float[] mLightnessTargets>
	//   35   58:astore_3        
		System.arraycopy(((Object) (af)), 0, ((Object) (af1)), 0, af1.length);
	//   36   59:aload_2         
	//   37   60:iconst_0        
	//   38   61:aload_3         
	//   39   62:iconst_0        
	//   40   63:aload_3         
	//   41   64:arraylength     
	//   42   65:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
		target = ((Target) (target.mWeights));
	//   43   68:aload_1         
	//   44   69:getfield        #95  <Field float[] mWeights>
	//   45   72:astore_1        
		af = mWeights;
	//   46   73:aload_0         
	//   47   74:getfield        #95  <Field float[] mWeights>
	//   48   77:astore_2        
		System.arraycopy(((Object) (target)), 0, ((Object) (af)), 0, af.length);
	//   49   78:aload_1         
	//   50   79:iconst_0        
	//   51   80:aload_2         
	//   52   81:iconst_0        
	//   53   82:aload_2         
	//   54   83:arraylength     
	//   55   84:invokestatic    #110 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   56   87:return          
	}

	private static void setDefaultDarkLightnessValues(Target target)
	{
		target = ((Target) (target.mLightnessTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:astore_0        
		target[1] = 0.26F;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:ldc1            #35  <Float 0.26F>
	//    6    9:fastore         
		target[2] = 0.45F;
	//    7   10:aload_0         
	//    8   11:iconst_2        
	//    9   12:ldc1            #22  <Float 0.45F>
	//   10   14:fastore         
	//   11   15:return          
	}

	private static void setDefaultLightLightnessValues(Target target)
	{
		target = ((Target) (target.mLightnessTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:astore_0        
		target[0] = 0.55F;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:ldc1            #28  <Float 0.55F>
	//    6    9:fastore         
		target[1] = 0.74F;
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:ldc1            #37  <Float 0.74F>
	//   10   14:fastore         
	//   11   15:return          
	}

	private static void setDefaultMutedSaturationValues(Target target)
	{
		target = ((Target) (target.mSaturationTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float[] mSaturationTargets>
	//    2    4:astore_0        
		target[1] = 0.3F;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:ldc1            #30  <Float 0.3F>
	//    6    9:fastore         
		target[2] = 0.4F;
	//    7   10:aload_0         
	//    8   11:iconst_2        
	//    9   12:ldc1            #24  <Float 0.4F>
	//   10   14:fastore         
	//   11   15:return          
	}

	private static void setDefaultNormalLightnessValues(Target target)
	{
		target = ((Target) (target.mLightnessTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:astore_0        
		target[0] = 0.3F;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:ldc1            #30  <Float 0.3F>
	//    6    9:fastore         
		target[1] = 0.5F;
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:ldc1            #40  <Float 0.5F>
	//   10   14:fastore         
		target[2] = 0.7F;
	//   11   15:aload_0         
	//   12   16:iconst_2        
	//   13   17:ldc1            #26  <Float 0.7F>
	//   14   19:fastore         
	//   15   20:return          
	}

	private static void setDefaultVibrantSaturationValues(Target target)
	{
		target = ((Target) (target.mSaturationTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float[] mSaturationTargets>
	//    2    4:astore_0        
		target[0] = 0.35F;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:ldc1            #32  <Float 0.35F>
	//    6    9:fastore         
		target[1] = 1.0F;
	//    7   10:aload_0         
	//    8   11:iconst_1        
	//    9   12:fconst_1        
	//   10   13:fastore         
	//   11   14:return          
	}

	private void setDefaultWeights()
	{
		float af[] = mWeights;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field float[] mWeights>
	//    2    4:astore_1        
		af[0] = 0.24F;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:ldc1            #47  <Float 0.24F>
	//    6    9:fastore         
		af[1] = 0.52F;
	//    7   10:aload_1         
	//    8   11:iconst_1        
	//    9   12:ldc1            #45  <Float 0.52F>
	//   10   14:fastore         
		af[2] = 0.24F;
	//   11   15:aload_1         
	//   12   16:iconst_2        
	//   13   17:ldc1            #47  <Float 0.24F>
	//   14   19:fastore         
	//   15   20:return          
	}

	private static void setTargetDefaultValues(float af[])
	{
		af[0] = 0.0F;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:fconst_0        
	//    3    3:fastore         
		af[1] = 0.5F;
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:ldc1            #40  <Float 0.5F>
	//    7    8:fastore         
		af[2] = 1.0F;
	//    8    9:aload_0         
	//    9   10:iconst_2        
	//   10   11:fconst_1        
	//   11   12:fastore         
	//   12   13:return          
	}

	public float getLightnessWeight()
	{
		return mWeights[1];
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field float[] mWeights>
	//    2    4:iconst_1        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getMaximumLightness()
	{
		return mLightnessTargets[2];
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:iconst_2        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getMaximumSaturation()
	{
		return mSaturationTargets[2];
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float[] mSaturationTargets>
	//    2    4:iconst_2        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getMinimumLightness()
	{
		return mLightnessTargets[0];
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getMinimumSaturation()
	{
		return mSaturationTargets[0];
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float[] mSaturationTargets>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getPopulationWeight()
	{
		return mWeights[2];
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field float[] mWeights>
	//    2    4:iconst_2        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getSaturationWeight()
	{
		return mWeights[0];
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field float[] mWeights>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getTargetLightness()
	{
		return mLightnessTargets[1];
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float[] mLightnessTargets>
	//    2    4:iconst_1        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getTargetSaturation()
	{
		return mSaturationTargets[1];
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field float[] mSaturationTargets>
	//    2    4:iconst_1        
	//    3    5:faload          
	//    4    6:freturn         
	}

	public boolean isExclusive()
	{
		return mIsExclusive;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean mIsExclusive>
	//    2    4:ireturn         
	}

	void normalizeWeights()
	{
		int k = mWeights.length;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field float[] mWeights>
	//    2    4:arraylength     
	//    3    5:istore          6
		boolean flag = false;
	//    4    7:iconst_0        
	//    5    8:istore          5
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore          4
		float f;
		float f1;
		for(f = 0.0F; i < k; f = f1)
	//*   8   13:fconst_0        
	//*   9   14:fstore_1        
	//*  10   15:iload           4
	//*  11   17:iload           6
	//*  12   19:icmpge          53
		{
			float f2 = mWeights[i];
	//   13   22:aload_0         
	//   14   23:getfield        #95  <Field float[] mWeights>
	//   15   26:iload           4
	//   16   28:faload          
	//   17   29:fstore_3        
			f1 = f;
	//   18   30:fload_1         
	//   19   31:fstore_2        
			if(f2 > 0.0F)
	//*  20   32:fload_3         
	//*  21   33:fconst_0        
	//*  22   34:fcmpl           
	//*  23   35:ifle            42
				f1 = f + f2;
	//   24   38:fload_1         
	//   25   39:fload_3         
	//   26   40:fadd            
	//   27   41:fstore_2        
			i++;
	//   28   42:iload           4
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore          4
		}

	//   32   48:fload_2         
	//   33   49:fstore_1        
	//*  34   50:goto            15
		if(f != 0.0F)
	//*  35   53:fload_1         
	//*  36   54:fconst_0        
	//*  37   55:fcmpl           
	//*  38   56:ifeq            114
		{
			int l = mWeights.length;
	//   39   59:aload_0         
	//   40   60:getfield        #95  <Field float[] mWeights>
	//   41   63:arraylength     
	//   42   64:istore          6
			for(int j = ((int) (flag)); j < l; j++)
	//*  43   66:iload           5
	//*  44   68:istore          4
	//*  45   70:iload           4
	//*  46   72:iload           6
	//*  47   74:icmpge          114
			{
				float af[] = mWeights;
	//   48   77:aload_0         
	//   49   78:getfield        #95  <Field float[] mWeights>
	//   50   81:astore          7
				if(af[j] > 0.0F)
	//*  51   83:aload           7
	//*  52   85:iload           4
	//*  53   87:faload          
	//*  54   88:fconst_0        
	//*  55   89:fcmpl           
	//*  56   90:ifle            105
					af[j] = af[j] / f;
	//   57   93:aload           7
	//   58   95:iload           4
	//   59   97:aload           7
	//   60   99:iload           4
	//   61  101:faload          
	//   62  102:fload_1         
	//   63  103:fdiv            
	//   64  104:fastore         
			}

	//   65  105:iload           4
	//   66  107:iconst_1        
	//   67  108:iadd            
	//   68  109:istore          4
		}
	//*  69  111:goto            70
	//   70  114:return          
	}

	public static final Target DARK_MUTED;
	public static final Target DARK_VIBRANT;
	static final int INDEX_MAX = 2;
	static final int INDEX_MIN = 0;
	static final int INDEX_TARGET = 1;
	static final int INDEX_WEIGHT_LUMA = 1;
	static final int INDEX_WEIGHT_POP = 2;
	static final int INDEX_WEIGHT_SAT = 0;
	public static final Target LIGHT_MUTED;
	public static final Target LIGHT_VIBRANT;
	private static final float MAX_DARK_LUMA = 0.45F;
	private static final float MAX_MUTED_SATURATION = 0.4F;
	private static final float MAX_NORMAL_LUMA = 0.7F;
	private static final float MIN_LIGHT_LUMA = 0.55F;
	private static final float MIN_NORMAL_LUMA = 0.3F;
	private static final float MIN_VIBRANT_SATURATION = 0.35F;
	public static final Target MUTED;
	private static final float TARGET_DARK_LUMA = 0.26F;
	private static final float TARGET_LIGHT_LUMA = 0.74F;
	private static final float TARGET_MUTED_SATURATION = 0.3F;
	private static final float TARGET_NORMAL_LUMA = 0.5F;
	private static final float TARGET_VIBRANT_SATURATION = 1F;
	public static final Target VIBRANT;
	private static final float WEIGHT_LUMA = 0.52F;
	private static final float WEIGHT_POPULATION = 0.24F;
	private static final float WEIGHT_SATURATION = 0.24F;
	boolean mIsExclusive;
	final float mLightnessTargets[];
	final float mSaturationTargets[];
	final float mWeights[];

	static 
	{
		LIGHT_VIBRANT = new Target();
	//    0    0:new             #2   <Class Target>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void Target()>
	//    3    7:putstatic       #61  <Field Target LIGHT_VIBRANT>
		setDefaultLightLightnessValues(LIGHT_VIBRANT);
	//    4   10:getstatic       #61  <Field Target LIGHT_VIBRANT>
	//    5   13:invokestatic    #65  <Method void setDefaultLightLightnessValues(Target)>
		setDefaultVibrantSaturationValues(LIGHT_VIBRANT);
	//    6   16:getstatic       #61  <Field Target LIGHT_VIBRANT>
	//    7   19:invokestatic    #68  <Method void setDefaultVibrantSaturationValues(Target)>
		VIBRANT = new Target();
	//    8   22:new             #2   <Class Target>
	//    9   25:dup             
	//   10   26:invokespecial   #59  <Method void Target()>
	//   11   29:putstatic       #70  <Field Target VIBRANT>
		setDefaultNormalLightnessValues(VIBRANT);
	//   12   32:getstatic       #70  <Field Target VIBRANT>
	//   13   35:invokestatic    #73  <Method void setDefaultNormalLightnessValues(Target)>
		setDefaultVibrantSaturationValues(VIBRANT);
	//   14   38:getstatic       #70  <Field Target VIBRANT>
	//   15   41:invokestatic    #68  <Method void setDefaultVibrantSaturationValues(Target)>
		DARK_VIBRANT = new Target();
	//   16   44:new             #2   <Class Target>
	//   17   47:dup             
	//   18   48:invokespecial   #59  <Method void Target()>
	//   19   51:putstatic       #75  <Field Target DARK_VIBRANT>
		setDefaultDarkLightnessValues(DARK_VIBRANT);
	//   20   54:getstatic       #75  <Field Target DARK_VIBRANT>
	//   21   57:invokestatic    #78  <Method void setDefaultDarkLightnessValues(Target)>
		setDefaultVibrantSaturationValues(DARK_VIBRANT);
	//   22   60:getstatic       #75  <Field Target DARK_VIBRANT>
	//   23   63:invokestatic    #68  <Method void setDefaultVibrantSaturationValues(Target)>
		LIGHT_MUTED = new Target();
	//   24   66:new             #2   <Class Target>
	//   25   69:dup             
	//   26   70:invokespecial   #59  <Method void Target()>
	//   27   73:putstatic       #80  <Field Target LIGHT_MUTED>
		setDefaultLightLightnessValues(LIGHT_MUTED);
	//   28   76:getstatic       #80  <Field Target LIGHT_MUTED>
	//   29   79:invokestatic    #65  <Method void setDefaultLightLightnessValues(Target)>
		setDefaultMutedSaturationValues(LIGHT_MUTED);
	//   30   82:getstatic       #80  <Field Target LIGHT_MUTED>
	//   31   85:invokestatic    #83  <Method void setDefaultMutedSaturationValues(Target)>
		MUTED = new Target();
	//   32   88:new             #2   <Class Target>
	//   33   91:dup             
	//   34   92:invokespecial   #59  <Method void Target()>
	//   35   95:putstatic       #85  <Field Target MUTED>
		setDefaultNormalLightnessValues(MUTED);
	//   36   98:getstatic       #85  <Field Target MUTED>
	//   37  101:invokestatic    #73  <Method void setDefaultNormalLightnessValues(Target)>
		setDefaultMutedSaturationValues(MUTED);
	//   38  104:getstatic       #85  <Field Target MUTED>
	//   39  107:invokestatic    #83  <Method void setDefaultMutedSaturationValues(Target)>
		DARK_MUTED = new Target();
	//   40  110:new             #2   <Class Target>
	//   41  113:dup             
	//   42  114:invokespecial   #59  <Method void Target()>
	//   43  117:putstatic       #87  <Field Target DARK_MUTED>
		setDefaultDarkLightnessValues(DARK_MUTED);
	//   44  120:getstatic       #87  <Field Target DARK_MUTED>
	//   45  123:invokestatic    #78  <Method void setDefaultDarkLightnessValues(Target)>
		setDefaultMutedSaturationValues(DARK_MUTED);
	//   46  126:getstatic       #87  <Field Target DARK_MUTED>
	//   47  129:invokestatic    #83  <Method void setDefaultMutedSaturationValues(Target)>
	//*  48  132:return          
	}
}
