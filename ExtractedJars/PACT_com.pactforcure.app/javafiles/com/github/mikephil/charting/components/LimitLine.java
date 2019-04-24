// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.utils.Utils;

// Referenced classes of package com.github.mikephil.charting.components:
//			ComponentBase

public class LimitLine extends ComponentBase
{
	public static final class LimitLabelPosition extends Enum
	{

		public static LimitLabelPosition valueOf(String s)
		{
			return (LimitLabelPosition)Enum.valueOf(com/github/mikephil/charting/components/LimitLine$LimitLabelPosition, s);
		//    0    0:ldc1            #2   <Class LimitLine$LimitLabelPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LimitLine$LimitLabelPosition>
		//    4    9:areturn         
		}

		public static LimitLabelPosition[] values()
		{
			return (LimitLabelPosition[])((LimitLabelPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field LimitLine$LimitLabelPosition[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.github.mikephil.charting.components.LimitLine$LimitLabelPosition_3B_.clone()>
		//    2    6:checkcast       #46  <Class LimitLine$LimitLabelPosition[]>
		//    3    9:areturn         
		}

		private static final LimitLabelPosition $VALUES[];
		public static final LimitLabelPosition LEFT_BOTTOM;
		public static final LimitLabelPosition LEFT_TOP;
		public static final LimitLabelPosition RIGHT_BOTTOM;
		public static final LimitLabelPosition RIGHT_TOP;

		static 
		{
			LEFT_TOP = new LimitLabelPosition("LEFT_TOP", 0);
		//    0    0:new             #2   <Class LimitLine$LimitLabelPosition>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LEFT_TOP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
		//    5   10:putstatic       #24  <Field LimitLine$LimitLabelPosition LEFT_TOP>
			LEFT_BOTTOM = new LimitLabelPosition("LEFT_BOTTOM", 1);
		//    6   13:new             #2   <Class LimitLine$LimitLabelPosition>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "LEFT_BOTTOM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
		//   11   23:putstatic       #27  <Field LimitLine$LimitLabelPosition LEFT_BOTTOM>
			RIGHT_TOP = new LimitLabelPosition("RIGHT_TOP", 2);
		//   12   26:new             #2   <Class LimitLine$LimitLabelPosition>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "RIGHT_TOP">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
		//   17   36:putstatic       #30  <Field LimitLine$LimitLabelPosition RIGHT_TOP>
			RIGHT_BOTTOM = new LimitLabelPosition("RIGHT_BOTTOM", 3);
		//   18   39:new             #2   <Class LimitLine$LimitLabelPosition>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "RIGHT_BOTTOM">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
		//   23   49:putstatic       #33  <Field LimitLine$LimitLabelPosition RIGHT_BOTTOM>
			$VALUES = (new LimitLabelPosition[] {
				LEFT_TOP, LEFT_BOTTOM, RIGHT_TOP, RIGHT_BOTTOM
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       LimitLabelPosition[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field LimitLine$LimitLabelPosition LEFT_TOP>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field LimitLine$LimitLabelPosition LEFT_BOTTOM>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field LimitLine$LimitLabelPosition RIGHT_TOP>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field LimitLine$LimitLabelPosition RIGHT_BOTTOM>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field LimitLine$LimitLabelPosition[] $VALUES>
		//*  43   83:return          
		}

		private LimitLabelPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public LimitLine(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ComponentBase()>
		mLimit = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #27  <Field float mLimit>
		mLineWidth = 2.0F;
	//    5    9:aload_0         
	//    6   10:fconst_2        
	//    7   11:putfield        #29  <Field float mLineWidth>
		mLineColor = Color.rgb(237, 91, 91);
	//    8   14:aload_0         
	//    9   15:sipush          237
	//   10   18:bipush          91
	//   11   20:bipush          91
	//   12   22:invokestatic    #35  <Method int Color.rgb(int, int, int)>
	//   13   25:putfield        #37  <Field int mLineColor>
		mTextStyle = android.graphics.Paint.Style.FILL_AND_STROKE;
	//   14   28:aload_0         
	//   15   29:getstatic       #42  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//   16   32:putfield        #44  <Field android.graphics.Paint$Style mTextStyle>
		mLabel = "";
	//   17   35:aload_0         
	//   18   36:ldc1            #46  <String "">
	//   19   38:putfield        #48  <Field String mLabel>
		mDashPathEffect = null;
	//   20   41:aload_0         
	//   21   42:aconst_null     
	//   22   43:putfield        #50  <Field DashPathEffect mDashPathEffect>
		mLabelPosition = LimitLabelPosition.RIGHT_TOP;
	//   23   46:aload_0         
	//   24   47:getstatic       #53  <Field LimitLine$LimitLabelPosition LimitLine$LimitLabelPosition.RIGHT_TOP>
	//   25   50:putfield        #55  <Field LimitLine$LimitLabelPosition mLabelPosition>
		mLimit = f;
	//   26   53:aload_0         
	//   27   54:fload_1         
	//   28   55:putfield        #27  <Field float mLimit>
	//   29   58:return          
	}

	public LimitLine(float f, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void ComponentBase()>
		mLimit = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #27  <Field float mLimit>
		mLineWidth = 2.0F;
	//    5    9:aload_0         
	//    6   10:fconst_2        
	//    7   11:putfield        #29  <Field float mLineWidth>
		mLineColor = Color.rgb(237, 91, 91);
	//    8   14:aload_0         
	//    9   15:sipush          237
	//   10   18:bipush          91
	//   11   20:bipush          91
	//   12   22:invokestatic    #35  <Method int Color.rgb(int, int, int)>
	//   13   25:putfield        #37  <Field int mLineColor>
		mTextStyle = android.graphics.Paint.Style.FILL_AND_STROKE;
	//   14   28:aload_0         
	//   15   29:getstatic       #42  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//   16   32:putfield        #44  <Field android.graphics.Paint$Style mTextStyle>
		mLabel = "";
	//   17   35:aload_0         
	//   18   36:ldc1            #46  <String "">
	//   19   38:putfield        #48  <Field String mLabel>
		mDashPathEffect = null;
	//   20   41:aload_0         
	//   21   42:aconst_null     
	//   22   43:putfield        #50  <Field DashPathEffect mDashPathEffect>
		mLabelPosition = LimitLabelPosition.RIGHT_TOP;
	//   23   46:aload_0         
	//   24   47:getstatic       #53  <Field LimitLine$LimitLabelPosition LimitLine$LimitLabelPosition.RIGHT_TOP>
	//   25   50:putfield        #55  <Field LimitLine$LimitLabelPosition mLabelPosition>
		mLimit = f;
	//   26   53:aload_0         
	//   27   54:fload_1         
	//   28   55:putfield        #27  <Field float mLimit>
		mLabel = s;
	//   29   58:aload_0         
	//   30   59:aload_2         
	//   31   60:putfield        #48  <Field String mLabel>
	//   32   63:return          
	}

	public void disableDashedLine()
	{
		mDashPathEffect = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #50  <Field DashPathEffect mDashPathEffect>
	//    3    5:return          
	}

	public void enableDashedLine(float f, float f1, float f2)
	{
		mDashPathEffect = new DashPathEffect(new float[] {
			f, f1
		}, f2);
	//    0    0:aload_0         
	//    1    1:new             #62  <Class DashPathEffect>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:fload_1         
	//    8   11:fastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:fastore         
	//   13   16:fload_3         
	//   14   17:invokespecial   #65  <Method void DashPathEffect(float[], float)>
	//   15   20:putfield        #50  <Field DashPathEffect mDashPathEffect>
	//   16   23:return          
	}

	public DashPathEffect getDashPathEffect()
	{
		return mDashPathEffect;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DashPathEffect mDashPathEffect>
	//    2    4:areturn         
	}

	public String getLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String mLabel>
	//    2    4:areturn         
	}

	public LimitLabelPosition getLabelPosition()
	{
		return mLabelPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LimitLine$LimitLabelPosition mLabelPosition>
	//    2    4:areturn         
	}

	public float getLimit()
	{
		return mLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float mLimit>
	//    2    4:freturn         
	}

	public int getLineColor()
	{
		return mLineColor;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mLineColor>
	//    2    4:ireturn         
	}

	public float getLineWidth()
	{
		return mLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float mLineWidth>
	//    2    4:freturn         
	}

	public android.graphics.Paint.Style getTextStyle()
	{
		return mTextStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field android.graphics.Paint$Style mTextStyle>
	//    2    4:areturn         
	}

	public boolean isDashedLineEnabled()
	{
		return mDashPathEffect != null;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DashPathEffect mDashPathEffect>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public void setLabel(String s)
	{
		mLabel = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String mLabel>
	//    3    5:return          
	}

	public void setLabelPosition(LimitLabelPosition limitlabelposition)
	{
		mLabelPosition = limitlabelposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field LimitLine$LimitLabelPosition mLabelPosition>
	//    3    5:return          
	}

	public void setLineColor(int i)
	{
		mLineColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int mLineColor>
	//    3    5:return          
	}

	public void setLineWidth(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.2F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #88  <Float 0.2F>
	//*   4    5:fcmpg           
	//*   5    6:ifge            12
			f1 = 0.2F;
	//    6    9:ldc1            #88  <Float 0.2F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 > 12F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #89  <Float 12F>
	//*  12   17:fcmpl           
	//*  13   18:ifle            24
			f = 12F;
	//   14   21:ldc1            #89  <Float 12F>
	//   15   23:fstore_1        
		mLineWidth = Utils.convertDpToPixel(f);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:invokestatic    #95  <Method float Utils.convertDpToPixel(float)>
	//   19   29:putfield        #29  <Field float mLineWidth>
	//   20   32:return          
	}

	public void setTextStyle(android.graphics.Paint.Style style)
	{
		mTextStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field android.graphics.Paint$Style mTextStyle>
	//    3    5:return          
	}

	private DashPathEffect mDashPathEffect;
	private String mLabel;
	private LimitLabelPosition mLabelPosition;
	private float mLimit;
	private int mLineColor;
	private float mLineWidth;
	private android.graphics.Paint.Style mTextStyle;
}
