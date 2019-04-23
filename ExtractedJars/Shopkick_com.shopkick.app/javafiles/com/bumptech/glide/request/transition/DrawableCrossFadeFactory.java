// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, DrawableCrossFadeTransition, NoTransition, Transition

public class DrawableCrossFadeFactory
	implements TransitionFactory
{
	public static class Builder
	{

		public DrawableCrossFadeFactory build()
		{
			return new DrawableCrossFadeFactory(durationMillis, isCrossFadeEnabled);
		//    0    0:new             #6   <Class DrawableCrossFadeFactory>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field int durationMillis>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field boolean isCrossFadeEnabled>
		//    6   12:invokespecial   #30  <Method void DrawableCrossFadeFactory(int, boolean)>
		//    7   15:areturn         
		}

		public Builder setCrossFadeEnabled(boolean flag)
		{
			isCrossFadeEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field boolean isCrossFadeEnabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static final int DEFAULT_DURATION_MS = 300;
		private final int durationMillis;
		private boolean isCrossFadeEnabled;

		public Builder()
		{
			this(300);
		//    0    0:aload_0         
		//    1    1:sipush          300
		//    2    4:invokespecial   #18  <Method void DrawableCrossFadeFactory$Builder(int)>
		//    3    7:return          
		}

		public Builder(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			durationMillis = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #23  <Field int durationMillis>
		//    5    9:return          
		}
	}


	protected DrawableCrossFadeFactory(int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		duration = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int duration>
		isCrossFadeEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field boolean isCrossFadeEnabled>
	//    8   14:return          
	}

	private Transition getResourceTransition()
	{
		if(resourceTransition == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field DrawableCrossFadeTransition resourceTransition>
	//*   2    4:ifnonnull       26
			resourceTransition = new DrawableCrossFadeTransition(duration, isCrossFadeEnabled);
	//    3    7:aload_0         
	//    4    8:new             #32  <Class DrawableCrossFadeTransition>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field int duration>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field boolean isCrossFadeEnabled>
	//   10   20:invokespecial   #34  <Method void DrawableCrossFadeTransition(int, boolean)>
	//   11   23:putfield        #30  <Field DrawableCrossFadeTransition resourceTransition>
		return ((Transition) (resourceTransition));
	//   12   26:aload_0         
	//   13   27:getfield        #30  <Field DrawableCrossFadeTransition resourceTransition>
	//   14   30:areturn         
	}

	public Transition build(DataSource datasource, boolean flag)
	{
		if(datasource == DataSource.MEMORY_CACHE)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #44  <Field DataSource DataSource.MEMORY_CACHE>
	//*   2    4:if_acmpne       11
			return NoTransition.get();
	//    3    7:invokestatic    #49  <Method Transition NoTransition.get()>
	//    4   10:areturn         
		else
			return getResourceTransition();
	//    5   11:aload_0         
	//    6   12:invokespecial   #51  <Method Transition getResourceTransition()>
	//    7   15:areturn         
	}

	private final int duration;
	private final boolean isCrossFadeEnabled;
	private DrawableCrossFadeTransition resourceTransition;
}
