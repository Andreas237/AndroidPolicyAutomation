// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;


// Referenced classes of package android.support.v7.graphics:
//			Target

public static final class Target$Builder
{

	public Target build()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:areturn         
	}

	public Target$Builder setExclusive(boolean flag)
	{
		mTarget.mIsExclusive = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:iload_1         
	//    3    5:putfield        #31  <Field boolean Target.mIsExclusive>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Target$Builder setLightnessWeight(float f)
	{
		mTarget.mWeights[1] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #41  <Field float[] Target.mWeights>
	//    3    7:iconst_1        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setMaximumLightness(float f)
	{
		mTarget.mLightnessTargets[2] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #48  <Field float[] Target.mLightnessTargets>
	//    3    7:iconst_2        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setMaximumSaturation(float f)
	{
		mTarget.mSaturationTargets[2] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #52  <Field float[] Target.mSaturationTargets>
	//    3    7:iconst_2        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setMinimumLightness(float f)
	{
		mTarget.mLightnessTargets[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #48  <Field float[] Target.mLightnessTargets>
	//    3    7:iconst_0        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setMinimumSaturation(float f)
	{
		mTarget.mSaturationTargets[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #52  <Field float[] Target.mSaturationTargets>
	//    3    7:iconst_0        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setPopulationWeight(float f)
	{
		mTarget.mWeights[2] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #41  <Field float[] Target.mWeights>
	//    3    7:iconst_2        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setSaturationWeight(float f)
	{
		mTarget.mWeights[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #41  <Field float[] Target.mWeights>
	//    3    7:iconst_0        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setTargetLightness(float f)
	{
		mTarget.mLightnessTargets[1] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #48  <Field float[] Target.mLightnessTargets>
	//    3    7:iconst_1        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Target$Builder setTargetSaturation(float f)
	{
		mTarget.mSaturationTargets[1] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Target mTarget>
	//    2    4:getfield        #52  <Field float[] Target.mSaturationTargets>
	//    3    7:iconst_1        
	//    4    8:fload_1         
	//    5    9:fastore         
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private final Target mTarget;

	public Target$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mTarget = new Target();
	//    2    4:aload_0         
	//    3    5:new             #6   <Class Target>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void Target()>
	//    6   12:putfield        #16  <Field Target mTarget>
	//    7   15:return          
	}

	public Target$Builder(Target target)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mTarget = new Target(target);
	//    2    4:aload_0         
	//    3    5:new             #6   <Class Target>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void Target(Target)>
	//    7   13:putfield        #16  <Field Target mTarget>
	//    8   16:return          
	}
}
