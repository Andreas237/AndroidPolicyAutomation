// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;

// Referenced classes of package com.github.mikephil.charting.animation:
//			Easing, EasingFunction

public class ChartAnimator
{

	public ChartAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mPhaseY = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #18  <Field float mPhaseY>
		mPhaseX = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #20  <Field float mPhaseX>
	//    8   14:return          
	}

	public ChartAnimator(android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mPhaseY = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #18  <Field float mPhaseY>
		mPhaseX = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #20  <Field float mPhaseX>
		mListener = animatorupdatelistener;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   11   19:return          
	}

	public void animateX(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #34  <String "phaseX">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_2        
			objectanimator.setDuration(i);
	//   18   27:aload_2         
	//   19   28:iload_1         
	//   20   29:i2l             
	//   21   30:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   33:pop             
			objectanimator.addUpdateListener(mListener);
	//   23   34:aload_2         
	//   24   35:aload_0         
	//   25   36:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   26   39:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   27   42:aload_2         
	//   28   43:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   29   46:return          
		}
	}

	public void animateX(int i, Easing.EasingOption easingoption)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #34  <String "phaseX">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_3        
			objectanimator.setInterpolator(((android.animation.TimeInterpolator) (Easing.getEasingFunctionFromOption(easingoption))));
	//   18   27:aload_3         
	//   19   28:aload_2         
	//   20   29:invokestatic    #57  <Method EasingFunction Easing.getEasingFunctionFromOption(Easing$EasingOption)>
	//   21   32:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
			objectanimator.setDuration(i);
	//   22   35:aload_3         
	//   23   36:iload_1         
	//   24   37:i2l             
	//   25   38:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   26   41:pop             
			objectanimator.addUpdateListener(mListener);
	//   27   42:aload_3         
	//   28   43:aload_0         
	//   29   44:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   30   47:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   31   50:aload_3         
	//   32   51:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   33   54:return          
		}
	}

	public void animateX(int i, EasingFunction easingfunction)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #34  <String "phaseX">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_3        
			objectanimator.setInterpolator(((android.animation.TimeInterpolator) (easingfunction)));
	//   18   27:aload_3         
	//   19   28:aload_2         
	//   20   29:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
			objectanimator.setDuration(i);
	//   21   32:aload_3         
	//   22   33:iload_1         
	//   23   34:i2l             
	//   24   35:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   25   38:pop             
			objectanimator.addUpdateListener(mListener);
	//   26   39:aload_3         
	//   27   40:aload_0         
	//   28   41:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   29   44:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   30   47:aload_3         
	//   31   48:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   32   51:return          
		}
	}

	public void animateXY(int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
			0.0F, 1.0F
		});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_3        
		objectanimator.setDuration(j);
	//   18   27:aload_3         
	//   19   28:iload_2         
	//   20   29:i2l             
	//   21   30:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   33:pop             
		ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
			0.0F, 1.0F
		});
	//   23   34:aload_0         
	//   24   35:ldc1            #34  <String "phaseX">
	//   25   37:iconst_2        
	//   26   38:newarray        float[]
	//   27   40:dup             
	//   28   41:iconst_0        
	//   29   42:fconst_0        
	//   30   43:fastore         
	//   31   44:dup             
	//   32   45:iconst_1        
	//   33   46:fconst_1        
	//   34   47:fastore         
	//   35   48:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   36   51:astore          4
		objectanimator1.setDuration(i);
	//   37   53:aload           4
	//   38   55:iload_1         
	//   39   56:i2l             
	//   40   57:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   41   60:pop             
		if(i > j)
	//*  42   61:iload_1         
	//*  43   62:iload_2         
	//*  44   63:icmple          85
			objectanimator1.addUpdateListener(mListener);
	//   45   66:aload           4
	//   46   68:aload_0         
	//   47   69:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   48   72:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		else
	//*  49   75:aload           4
	//*  50   77:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  51   80:aload_3         
	//*  52   81:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  53   84:return          
			objectanimator.addUpdateListener(mListener);
	//   54   85:aload_3         
	//   55   86:aload_0         
	//   56   87:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   57   90:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		objectanimator1.start();
		objectanimator.start();
	//*  58   93:goto            75
	}

	public void animateXY(int i, int j, Easing.EasingOption easingoption, Easing.EasingOption easingoption1)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
			0.0F, 1.0F
		});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore          5
		objectanimator.setInterpolator(((android.animation.TimeInterpolator) (Easing.getEasingFunctionFromOption(easingoption1))));
	//   18   28:aload           5
	//   19   30:aload           4
	//   20   32:invokestatic    #57  <Method EasingFunction Easing.getEasingFunctionFromOption(Easing$EasingOption)>
	//   21   35:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		objectanimator.setDuration(j);
	//   22   38:aload           5
	//   23   40:iload_2         
	//   24   41:i2l             
	//   25   42:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   26   45:pop             
		easingoption1 = ((Easing.EasingOption) (ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
			0.0F, 1.0F
		})));
	//   27   46:aload_0         
	//   28   47:ldc1            #34  <String "phaseX">
	//   29   49:iconst_2        
	//   30   50:newarray        float[]
	//   31   52:dup             
	//   32   53:iconst_0        
	//   33   54:fconst_0        
	//   34   55:fastore         
	//   35   56:dup             
	//   36   57:iconst_1        
	//   37   58:fconst_1        
	//   38   59:fastore         
	//   39   60:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   40   63:astore          4
		((ObjectAnimator) (easingoption1)).setInterpolator(((android.animation.TimeInterpolator) (Easing.getEasingFunctionFromOption(easingoption))));
	//   41   65:aload           4
	//   42   67:aload_3         
	//   43   68:invokestatic    #57  <Method EasingFunction Easing.getEasingFunctionFromOption(Easing$EasingOption)>
	//   44   71:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		((ObjectAnimator) (easingoption1)).setDuration(i);
	//   45   74:aload           4
	//   46   76:iload_1         
	//   47   77:i2l             
	//   48   78:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   49   81:pop             
		if(i > j)
	//*  50   82:iload_1         
	//*  51   83:iload_2         
	//*  52   84:icmple          107
			((ObjectAnimator) (easingoption1)).addUpdateListener(mListener);
	//   53   87:aload           4
	//   54   89:aload_0         
	//   55   90:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   56   93:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		else
	//*  57   96:aload           4
	//*  58   98:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  59  101:aload           5
	//*  60  103:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  61  106:return          
			objectanimator.addUpdateListener(mListener);
	//   62  107:aload           5
	//   63  109:aload_0         
	//   64  110:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   65  113:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		((ObjectAnimator) (easingoption1)).start();
		objectanimator.start();
	//*  66  116:goto            96
	}

	public void animateXY(int i, int j, EasingFunction easingfunction, EasingFunction easingfunction1)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
			0.0F, 1.0F
		});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore          5
		objectanimator.setInterpolator(((android.animation.TimeInterpolator) (easingfunction1)));
	//   18   28:aload           5
	//   19   30:aload           4
	//   20   32:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		objectanimator.setDuration(j);
	//   21   35:aload           5
	//   22   37:iload_2         
	//   23   38:i2l             
	//   24   39:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   25   42:pop             
		easingfunction1 = ((EasingFunction) (ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
			0.0F, 1.0F
		})));
	//   26   43:aload_0         
	//   27   44:ldc1            #34  <String "phaseX">
	//   28   46:iconst_2        
	//   29   47:newarray        float[]
	//   30   49:dup             
	//   31   50:iconst_0        
	//   32   51:fconst_0        
	//   33   52:fastore         
	//   34   53:dup             
	//   35   54:iconst_1        
	//   36   55:fconst_1        
	//   37   56:fastore         
	//   38   57:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   39   60:astore          4
		((ObjectAnimator) (easingfunction1)).setInterpolator(((android.animation.TimeInterpolator) (easingfunction)));
	//   40   62:aload           4
	//   41   64:aload_3         
	//   42   65:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		((ObjectAnimator) (easingfunction1)).setDuration(i);
	//   43   68:aload           4
	//   44   70:iload_1         
	//   45   71:i2l             
	//   46   72:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   47   75:pop             
		if(i > j)
	//*  48   76:iload_1         
	//*  49   77:iload_2         
	//*  50   78:icmple          101
			((ObjectAnimator) (easingfunction1)).addUpdateListener(mListener);
	//   51   81:aload           4
	//   52   83:aload_0         
	//   53   84:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   54   87:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		else
	//*  55   90:aload           4
	//*  56   92:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  57   95:aload           5
	//*  58   97:invokevirtual   #50  <Method void ObjectAnimator.start()>
	//*  59  100:return          
			objectanimator.addUpdateListener(mListener);
	//   60  101:aload           5
	//   61  103:aload_0         
	//   62  104:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   63  107:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		((ObjectAnimator) (easingfunction1)).start();
		objectanimator.start();
	//*  64  110:goto            90
	}

	public void animateY(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_2        
			objectanimator.setDuration(i);
	//   18   27:aload_2         
	//   19   28:iload_1         
	//   20   29:i2l             
	//   21   30:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   33:pop             
			objectanimator.addUpdateListener(mListener);
	//   23   34:aload_2         
	//   24   35:aload_0         
	//   25   36:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   26   39:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   27   42:aload_2         
	//   28   43:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   29   46:return          
		}
	}

	public void animateY(int i, Easing.EasingOption easingoption)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_3        
			objectanimator.setInterpolator(((android.animation.TimeInterpolator) (Easing.getEasingFunctionFromOption(easingoption))));
	//   18   27:aload_3         
	//   19   28:aload_2         
	//   20   29:invokestatic    #57  <Method EasingFunction Easing.getEasingFunctionFromOption(Easing$EasingOption)>
	//   21   32:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
			objectanimator.setDuration(i);
	//   22   35:aload_3         
	//   23   36:iload_1         
	//   24   37:i2l             
	//   25   38:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   26   41:pop             
			objectanimator.addUpdateListener(mListener);
	//   27   42:aload_3         
	//   28   43:aload_0         
	//   29   44:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   30   47:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   31   50:aload_3         
	//   32   51:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   33   54:return          
		}
	}

	public void animateY(int i, EasingFunction easingfunction)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseY", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #66  <String "phaseY">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #40  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_3        
			objectanimator.setInterpolator(((android.animation.TimeInterpolator) (easingfunction)));
	//   18   27:aload_3         
	//   19   28:aload_2         
	//   20   29:invokevirtual   #61  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
			objectanimator.setDuration(i);
	//   21   32:aload_3         
	//   22   33:iload_1         
	//   23   34:i2l             
	//   24   35:invokevirtual   #44  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   25   38:pop             
			objectanimator.addUpdateListener(mListener);
	//   26   39:aload_3         
	//   27   40:aload_0         
	//   28   41:getfield        #24  <Field android.animation.ValueAnimator$AnimatorUpdateListener mListener>
	//   29   44:invokevirtual   #47  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   30   47:aload_3         
	//   31   48:invokevirtual   #50  <Method void ObjectAnimator.start()>
			return;
	//   32   51:return          
		}
	}

	public float getPhaseX()
	{
		return mPhaseX;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float mPhaseX>
	//    2    4:freturn         
	}

	public float getPhaseY()
	{
		return mPhaseY;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float mPhaseY>
	//    2    4:freturn         
	}

	public void setPhaseX(float f)
	{
		mPhaseX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float mPhaseX>
	//    3    5:return          
	}

	public void setPhaseY(float f)
	{
		mPhaseY = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #18  <Field float mPhaseY>
	//    3    5:return          
	}

	private android.animation.ValueAnimator.AnimatorUpdateListener mListener;
	protected float mPhaseX;
	protected float mPhaseY;
}
