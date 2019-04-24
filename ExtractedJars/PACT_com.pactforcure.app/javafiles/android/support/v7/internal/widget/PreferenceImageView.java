// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView
{

	public PreferenceImageView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void PreferenceImageView(Context, AttributeSet)>
	//    4    6:return          
	}

	public PreferenceImageView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #20  <Method void PreferenceImageView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public PreferenceImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #21  <Method void ImageView(Context, AttributeSet, int)>
		mMaxWidth = 0x7fffffff;
	//    5    7:aload_0         
	//    6    8:ldc1            #22  <Int 0x7fffffff>
	//    7   10:putfield        #24  <Field int mMaxWidth>
		mMaxHeight = 0x7fffffff;
	//    8   13:aload_0         
	//    9   14:ldc1            #22  <Int 0x7fffffff>
	//   10   16:putfield        #26  <Field int mMaxHeight>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.preference.R.styleable.PreferenceImageView, i, 0)));
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:getstatic       #32  <Field int[] android.support.v7.preference.R$styleable.PreferenceImageView>
	//   14   24:iload_3         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #38  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   17   29:astore_1        
		setMaxWidth(((TypedArray) (context)).getDimensionPixelSize(android.support.v7.preference.R.styleable.PreferenceImageView_maxWidth, 0x7fffffff));
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:getstatic       #41  <Field int android.support.v7.preference.R$styleable.PreferenceImageView_maxWidth>
	//   21   35:ldc1            #22  <Int 0x7fffffff>
	//   22   37:invokevirtual   #47  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   23   40:invokevirtual   #51  <Method void setMaxWidth(int)>
		setMaxHeight(((TypedArray) (context)).getDimensionPixelSize(android.support.v7.preference.R.styleable.PreferenceImageView_maxHeight, 0x7fffffff));
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:getstatic       #54  <Field int android.support.v7.preference.R$styleable.PreferenceImageView_maxHeight>
	//   27   48:ldc1            #22  <Int 0x7fffffff>
	//   28   50:invokevirtual   #47  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   29   53:invokevirtual   #57  <Method void setMaxHeight(int)>
		((TypedArray) (context)).recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #61  <Method void TypedArray.recycle()>
	//   32   60:return          
	}

	public int getMaxHeight()
	{
		return mMaxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mMaxHeight>
	//    2    4:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mMaxWidth>
	//    2    4:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		int k;
label0:
		{
			int l = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #72  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          4
			if(l != 0x80000000)
	//*   3    6:iload           4
	//*   4    8:ldc1            #73  <Int 0x80000000>
	//*   5   10:icmpeq          20
			{
				k = i;
	//    6   13:iload_1         
	//    7   14:istore_3        
				if(l != 0)
					break label0;
	//    8   15:iload           4
	//    9   17:ifne            63
			}
			int j1 = android.view.View.MeasureSpec.getSize(i);
	//   10   20:iload_1         
	//   11   21:invokestatic    #76  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   12   24:istore          5
			int l1 = getMaxWidth();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #78  <Method int getMaxWidth()>
	//   15   30:istore          6
			k = i;
	//   16   32:iload_1         
	//   17   33:istore_3        
			if(l1 == 0x7fffffff)
				break label0;
	//   18   34:iload           6
	//   19   36:ldc1            #22  <Int 0x7fffffff>
	//   20   38:icmpeq          63
			if(l1 >= j1)
	//*  21   41:iload           6
	//*  22   43:iload           5
	//*  23   45:icmplt          55
			{
				k = i;
	//   24   48:iload_1         
	//   25   49:istore_3        
				if(l != 0)
					break label0;
	//   26   50:iload           4
	//   27   52:ifne            63
			}
			k = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x80000000);
	//   28   55:iload           6
	//   29   57:ldc1            #73  <Int 0x80000000>
	//   30   59:invokestatic    #81  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   62:istore_3        
		}
label1:
		{
			int i1 = android.view.View.MeasureSpec.getMode(j);
	//   32   63:iload_2         
	//   33   64:invokestatic    #72  <Method int android.view.View$MeasureSpec.getMode(int)>
	//   34   67:istore          4
			if(i1 != 0x80000000)
	//*  35   69:iload           4
	//*  36   71:ldc1            #73  <Int 0x80000000>
	//*  37   73:icmpeq          83
			{
				i = j;
	//   38   76:iload_2         
	//   39   77:istore_1        
				if(i1 != 0)
					break label1;
	//   40   78:iload           4
	//   41   80:ifne            126
			}
			int k1 = android.view.View.MeasureSpec.getSize(j);
	//   42   83:iload_2         
	//   43   84:invokestatic    #76  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   44   87:istore          5
			int i2 = getMaxHeight();
	//   45   89:aload_0         
	//   46   90:invokevirtual   #83  <Method int getMaxHeight()>
	//   47   93:istore          6
			i = j;
	//   48   95:iload_2         
	//   49   96:istore_1        
			if(i2 == 0x7fffffff)
				break label1;
	//   50   97:iload           6
	//   51   99:ldc1            #22  <Int 0x7fffffff>
	//   52  101:icmpeq          126
			if(i2 >= k1)
	//*  53  104:iload           6
	//*  54  106:iload           5
	//*  55  108:icmplt          118
			{
				i = j;
	//   56  111:iload_2         
	//   57  112:istore_1        
				if(i1 != 0)
					break label1;
	//   58  113:iload           4
	//   59  115:ifne            126
			}
			i = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
	//   60  118:iload           6
	//   61  120:ldc1            #73  <Int 0x80000000>
	//   62  122:invokestatic    #81  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   63  125:istore_1        
		}
		super.onMeasure(k, i);
	//   64  126:aload_0         
	//   65  127:iload_3         
	//   66  128:iload_1         
	//   67  129:invokespecial   #85  <Method void ImageView.onMeasure(int, int)>
	//   68  132:return          
	}

	public void setMaxHeight(int i)
	{
		mMaxHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int mMaxHeight>
		super.setMaxHeight(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #86  <Method void ImageView.setMaxHeight(int)>
	//    6   10:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int mMaxWidth>
		super.setMaxWidth(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #87  <Method void ImageView.setMaxWidth(int)>
	//    6   10:return          
	}

	private int mMaxHeight;
	private int mMaxWidth;
}
