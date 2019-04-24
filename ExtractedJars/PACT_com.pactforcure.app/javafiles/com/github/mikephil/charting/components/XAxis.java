// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import com.github.mikephil.charting.formatter.DefaultXAxisValueFormatter;
import com.github.mikephil.charting.formatter.XAxisValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.components:
//			AxisBase

public class XAxis extends AxisBase
{
	public static final class XAxisPosition extends Enum
	{

		public static XAxisPosition valueOf(String s)
		{
			return (XAxisPosition)Enum.valueOf(com/github/mikephil/charting/components/XAxis$XAxisPosition, s);
		//    0    0:ldc1            #2   <Class XAxis$XAxisPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class XAxis$XAxisPosition>
		//    4    9:areturn         
		}

		public static XAxisPosition[] values()
		{
			return (XAxisPosition[])((XAxisPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field XAxis$XAxisPosition[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.components.XAxis$XAxisPosition_3B_.clone()>
		//    2    6:checkcast       #50  <Class XAxis$XAxisPosition[]>
		//    3    9:areturn         
		}

		private static final XAxisPosition $VALUES[];
		public static final XAxisPosition BOTH_SIDED;
		public static final XAxisPosition BOTTOM;
		public static final XAxisPosition BOTTOM_INSIDE;
		public static final XAxisPosition TOP;
		public static final XAxisPosition TOP_INSIDE;

		static 
		{
			TOP = new XAxisPosition("TOP", 0);
		//    0    0:new             #2   <Class XAxis$XAxisPosition>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "TOP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
		//    5   10:putstatic       #25  <Field XAxis$XAxisPosition TOP>
			BOTTOM = new XAxisPosition("BOTTOM", 1);
		//    6   13:new             #2   <Class XAxis$XAxisPosition>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "BOTTOM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
		//   11   23:putstatic       #28  <Field XAxis$XAxisPosition BOTTOM>
			BOTH_SIDED = new XAxisPosition("BOTH_SIDED", 2);
		//   12   26:new             #2   <Class XAxis$XAxisPosition>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "BOTH_SIDED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
		//   17   36:putstatic       #31  <Field XAxis$XAxisPosition BOTH_SIDED>
			TOP_INSIDE = new XAxisPosition("TOP_INSIDE", 3);
		//   18   39:new             #2   <Class XAxis$XAxisPosition>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "TOP_INSIDE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
		//   23   49:putstatic       #34  <Field XAxis$XAxisPosition TOP_INSIDE>
			BOTTOM_INSIDE = new XAxisPosition("BOTTOM_INSIDE", 4);
		//   24   52:new             #2   <Class XAxis$XAxisPosition>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "BOTTOM_INSIDE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void XAxis$XAxisPosition(String, int)>
		//   29   62:putstatic       #37  <Field XAxis$XAxisPosition BOTTOM_INSIDE>
			$VALUES = (new XAxisPosition[] {
				TOP, BOTTOM, BOTH_SIDED, TOP_INSIDE, BOTTOM_INSIDE
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       XAxisPosition[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field XAxis$XAxisPosition TOP>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field XAxis$XAxisPosition BOTTOM>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field XAxis$XAxisPosition BOTH_SIDED>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field XAxis$XAxisPosition TOP_INSIDE>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field XAxis$XAxisPosition BOTTOM_INSIDE>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field XAxis$XAxisPosition[] $VALUES>
		//*  53  102:return          
		}

		private XAxisPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public XAxis()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AxisBase()>
		mValues = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mValues>
		mLabelWidth = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #37  <Field int mLabelWidth>
		mLabelHeight = 1;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #39  <Field int mLabelHeight>
		mLabelRotatedWidth = 1;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #41  <Field int mLabelRotatedWidth>
		mLabelRotatedHeight = 1;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #43  <Field int mLabelRotatedHeight>
		mLabelRotationAngle = 0.0F;
	//   19   35:aload_0         
	//   20   36:fconst_0        
	//   21   37:putfield        #45  <Field float mLabelRotationAngle>
		mSpaceBetweenLabels = 4;
	//   22   40:aload_0         
	//   23   41:iconst_4        
	//   24   42:putfield        #47  <Field int mSpaceBetweenLabels>
		mAxisLabelModulus = 1;
	//   25   45:aload_0         
	//   26   46:iconst_1        
	//   27   47:putfield        #49  <Field int mAxisLabelModulus>
		mIsAxisModulusCustom = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #51  <Field boolean mIsAxisModulusCustom>
		mAvoidFirstLastClipping = false;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #53  <Field boolean mAvoidFirstLastClipping>
		mXAxisValueFormatter = ((XAxisValueFormatter) (new DefaultXAxisValueFormatter()));
	//   34   60:aload_0         
	//   35   61:new             #55  <Class DefaultXAxisValueFormatter>
	//   36   64:dup             
	//   37   65:invokespecial   #56  <Method void DefaultXAxisValueFormatter()>
	//   38   68:putfield        #58  <Field XAxisValueFormatter mXAxisValueFormatter>
		mPosition = XAxisPosition.TOP;
	//   39   71:aload_0         
	//   40   72:getstatic       #61  <Field XAxis$XAxisPosition XAxis$XAxisPosition.TOP>
	//   41   75:putfield        #63  <Field XAxis$XAxisPosition mPosition>
		mYOffset = Utils.convertDpToPixel(4F);
	//   42   78:aload_0         
	//   43   79:ldc1            #64  <Float 4F>
	//   44   81:invokestatic    #70  <Method float Utils.convertDpToPixel(float)>
	//   45   84:putfield        #73  <Field float mYOffset>
	//   46   87:return          
	}

	public float getLabelRotationAngle()
	{
		return mLabelRotationAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float mLabelRotationAngle>
	//    2    4:freturn         
	}

	public String getLongestLabel()
	{
		String s = "";
	//    0    0:ldc1            #80  <String "">
	//    1    2:astore_2        
		for(int i = 0; i < mValues.size();)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #35  <Field List mValues>
	//*   7   10:invokeinterface #86  <Method int List.size()>
	//*   8   15:icmpge          59
		{
			String s2 = (String)mValues.get(i);
	//    9   18:aload_0         
	//   10   19:getfield        #35  <Field List mValues>
	//   11   22:iload_1         
	//   12   23:invokeinterface #90  <Method Object List.get(int)>
	//   13   28:checkcast       #92  <Class String>
	//   14   31:astore          4
			String s1 = s;
	//   15   33:aload_2         
	//   16   34:astore_3        
			if(s.length() < s2.length())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #95  <Method int String.length()>
	//*  19   39:aload           4
	//*  20   41:invokevirtual   #95  <Method int String.length()>
	//*  21   44:icmpge          50
				s1 = s2;
	//   22   47:aload           4
	//   23   49:astore_3        
			i++;
	//   24   50:iload_1         
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:istore_1        
			s = s1;
	//   28   54:aload_3         
	//   29   55:astore_2        
		}

	//*  30   56:goto            5
		return s;
	//   31   59:aload_2         
	//   32   60:areturn         
	}

	public XAxisPosition getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field XAxis$XAxisPosition mPosition>
	//    2    4:areturn         
	}

	public int getSpaceBetweenLabels()
	{
		return mSpaceBetweenLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mSpaceBetweenLabels>
	//    2    4:ireturn         
	}

	public XAxisValueFormatter getValueFormatter()
	{
		return mXAxisValueFormatter;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field XAxisValueFormatter mXAxisValueFormatter>
	//    2    4:areturn         
	}

	public List getValues()
	{
		return mValues;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:areturn         
	}

	public boolean isAvoidFirstLastClippingEnabled()
	{
		return mAvoidFirstLastClipping;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean mAvoidFirstLastClipping>
	//    2    4:ireturn         
	}

	public boolean isAxisModulusCustom()
	{
		return mIsAxisModulusCustom;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean mIsAxisModulusCustom>
	//    2    4:ireturn         
	}

	public void resetLabelsToSkip()
	{
		mIsAxisModulusCustom = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #51  <Field boolean mIsAxisModulusCustom>
	//    3    5:return          
	}

	public void setAvoidFirstLastClipping(boolean flag)
	{
		mAvoidFirstLastClipping = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean mAvoidFirstLastClipping>
	//    3    5:return          
	}

	public void setLabelRotationAngle(float f)
	{
		mLabelRotationAngle = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #45  <Field float mLabelRotationAngle>
	//    3    5:return          
	}

	public void setLabelsToSkip(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		mIsAxisModulusCustom = true;
	//    6    8:aload_0         
	//    7    9:iconst_1        
	//    8   10:putfield        #51  <Field boolean mIsAxisModulusCustom>
		mAxisLabelModulus = j + 1;
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:putfield        #49  <Field int mAxisLabelModulus>
	//   14   20:return          
	}

	public void setPosition(XAxisPosition xaxisposition)
	{
		mPosition = xaxisposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field XAxis$XAxisPosition mPosition>
	//    3    5:return          
	}

	public void setSpaceBetweenLabels(int i)
	{
		mSpaceBetweenLabels = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int mSpaceBetweenLabels>
	//    3    5:return          
	}

	public void setValueFormatter(XAxisValueFormatter xaxisvalueformatter)
	{
		if(xaxisvalueformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			mXAxisValueFormatter = ((XAxisValueFormatter) (new DefaultXAxisValueFormatter()));
	//    2    4:aload_0         
	//    3    5:new             #55  <Class DefaultXAxisValueFormatter>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void DefaultXAxisValueFormatter()>
	//    6   12:putfield        #58  <Field XAxisValueFormatter mXAxisValueFormatter>
			return;
	//    7   15:return          
		} else
		{
			mXAxisValueFormatter = xaxisvalueformatter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #58  <Field XAxisValueFormatter mXAxisValueFormatter>
			return;
	//   11   21:return          
		}
	}

	public void setValues(List list)
	{
		mValues = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field List mValues>
	//    3    5:return          
	}

	private boolean mAvoidFirstLastClipping;
	public int mAxisLabelModulus;
	private boolean mIsAxisModulusCustom;
	public int mLabelHeight;
	public int mLabelRotatedHeight;
	public int mLabelRotatedWidth;
	protected float mLabelRotationAngle;
	public int mLabelWidth;
	private XAxisPosition mPosition;
	private int mSpaceBetweenLabels;
	protected List mValues;
	protected XAxisValueFormatter mXAxisValueFormatter;
}
