// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.solver.widgets.Helper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Arrays;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout

public abstract class ConstraintHelper extends View
{

	public ConstraintHelper(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void View(Context)>
		mIds = new int[32];
	//    3    5:aload_0         
	//    4    6:bipush          32
	//    5    8:newarray        int[]
	//    6   10:putfield        #22  <Field int[] mIds>
		mCount = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #24  <Field int mCount>
		mHelperWidget = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #26  <Field Helper mHelperWidget>
		mUseViewMeasure = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #28  <Field boolean mUseViewMeasure>
		myContext = context;
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:putfield        #30  <Field Context myContext>
		init(((AttributeSet) (null)));
	//   19   33:aload_0         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #34  <Method void init(AttributeSet)>
	//   22   38:return          
	}

	public ConstraintHelper(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void View(Context, AttributeSet)>
		mIds = new int[32];
	//    4    6:aload_0         
	//    5    7:bipush          32
	//    6    9:newarray        int[]
	//    7   11:putfield        #22  <Field int[] mIds>
		mCount = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #24  <Field int mCount>
		mHelperWidget = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field Helper mHelperWidget>
		mUseViewMeasure = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #28  <Field boolean mUseViewMeasure>
		myContext = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #30  <Field Context myContext>
		init(attributeset);
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #34  <Method void init(AttributeSet)>
	//   23   39:return          
	}

	public ConstraintHelper(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #41  <Method void View(Context, AttributeSet, int)>
		mIds = new int[32];
	//    5    7:aload_0         
	//    6    8:bipush          32
	//    7   10:newarray        int[]
	//    8   12:putfield        #22  <Field int[] mIds>
		mCount = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #24  <Field int mCount>
		mHelperWidget = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #26  <Field Helper mHelperWidget>
		mUseViewMeasure = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #28  <Field boolean mUseViewMeasure>
		myContext = context;
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:putfield        #30  <Field Context myContext>
		init(attributeset);
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:invokevirtual   #34  <Method void init(AttributeSet)>
	//   24   40:return          
	}

	private void addID(String s)
	{
		Exception exception;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(myContext == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field Context myContext>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		s = s.trim();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #51  <Method String String.trim()>
	//    9   17:astore_1        
		int j;
		try
		{
			j = ((Class) (android/support/constraint/R$id)).getField(s).getInt(((Object) (null)));
	//   10   18:ldc1            #53  <Class R$id>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #59  <Method Field Class.getField(String)>
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #65  <Method int Field.getInt(Object)>
	//   15   28:istore_3        
		}
	//*  16   29:goto            34
	//*  17   32:iconst_0        
	//*  18   33:istore_3        
	//*  19   34:iload_3         
	//*  20   35:istore_2        
	//*  21   36:iload_3         
	//*  22   37:ifne            61
	//*  23   40:aload_0         
	//*  24   41:getfield        #30  <Field Context myContext>
	//*  25   44:invokevirtual   #71  <Method Resources Context.getResources()>
	//*  26   47:aload_1         
	//*  27   48:ldc1            #73  <String "id">
	//*  28   50:aload_0         
	//*  29   51:getfield        #30  <Field Context myContext>
	//*  30   54:invokevirtual   #76  <Method String Context.getPackageName()>
	//*  31   57:invokevirtual   #82  <Method int Resources.getIdentifier(String, String, String)>
	//*  32   60:istore_2        
	//*  33   61:iload_2         
	//*  34   62:istore_3        
	//*  35   63:iload_2         
	//*  36   64:ifne            128
	//*  37   67:iload_2         
	//*  38   68:istore_3        
	//*  39   69:aload_0         
	//*  40   70:invokevirtual   #86  <Method boolean isInEditMode()>
	//*  41   73:ifeq            128
	//*  42   76:iload_2         
	//*  43   77:istore_3        
	//*  44   78:aload_0         
	//*  45   79:invokevirtual   #90  <Method android.view.ViewParent getParent()>
	//*  46   82:instanceof      #92  <Class ConstraintLayout>
	//*  47   85:ifeq            128
	//*  48   88:aload_0         
	//*  49   89:invokevirtual   #90  <Method android.view.ViewParent getParent()>
	//*  50   92:checkcast       #92  <Class ConstraintLayout>
	//*  51   95:iconst_0        
	//*  52   96:aload_1         
	//*  53   97:invokevirtual   #96  <Method Object ConstraintLayout.getDesignInformation(int, Object)>
	//*  54  100:astore          4
	//*  55  102:iload_2         
	//*  56  103:istore_3        
	//*  57  104:aload           4
	//*  58  106:ifnull          128
	//*  59  109:iload_2         
	//*  60  110:istore_3        
	//*  61  111:aload           4
	//*  62  113:instanceof      #98  <Class Integer>
	//*  63  116:ifeq            128
	//*  64  119:aload           4
	//*  65  121:checkcast       #98  <Class Integer>
	//*  66  124:invokevirtual   #102 <Method int Integer.intValue()>
	//*  67  127:istore_3        
	//*  68  128:iload_3         
	//*  69  129:ifeq            139
	//*  70  132:aload_0         
	//*  71  133:iload_3         
	//*  72  134:aconst_null     
	//*  73  135:invokevirtual   #106 <Method void setTag(int, Object)>
	//*  74  138:return          
	//*  75  139:new             #108 <Class StringBuilder>
	//*  76  142:dup             
	//*  77  143:invokespecial   #111 <Method void StringBuilder()>
	//*  78  146:astore          4
	//*  79  148:aload           4
	//*  80  150:ldc1            #113 <String "Could not find id of \"">
	//*  81  152:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  82  155:pop             
	//*  83  156:aload           4
	//*  84  158:aload_1         
	//*  85  159:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  86  162:pop             
	//*  87  163:aload           4
	//*  88  165:ldc1            #119 <String "\"">
	//*  89  167:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  90  170:pop             
	//*  91  171:ldc1            #121 <String "ConstraintHelper">
	//*  92  173:aload           4
	//*  93  175:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  94  178:invokestatic    #130 <Method int Log.w(String, String)>
	//*  95  181:pop             
	//*  96  182:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			j = 0;
		}
		int i = j;
		if(j == 0)
			i = myContext.getResources().getIdentifier(s, "id", myContext.getPackageName());
		j = i;
		if(i == 0)
		{
			j = i;
			if(isInEditMode())
			{
				j = i;
				if(getParent() instanceof ConstraintLayout)
				{
					Object obj = ((ConstraintLayout)getParent()).getDesignInformation(0, ((Object) (s)));
					j = i;
					if(obj != null)
					{
						j = i;
						if(obj instanceof Integer)
							j = ((Integer)obj).intValue();
					}
				}
			}
		}
		if(j != 0)
		{
			setTag(j, ((Object) (null)));
			return;
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Could not find id of \"");
			stringbuilder.append(s);
			stringbuilder.append("\"");
			Log.w("ConstraintHelper", stringbuilder.toString());
			return;
		}
	//*  97  183:astore          4
	//*  98  185:goto            32
	}

	private void setIds(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			int j = s.indexOf(',', i);
	//    5    7:aload_1         
	//    6    8:bipush          44
	//    7   10:iload_2         
	//    8   11:invokevirtual   #135 <Method int String.indexOf(int, int)>
	//    9   14:istore_3        
			if(j == -1)
	//*  10   15:iload_3         
	//*  11   16:iconst_m1       
	//*  12   17:icmpne          30
			{
				addID(s.substring(i));
	//   13   20:aload_0         
	//   14   21:aload_1         
	//   15   22:iload_2         
	//   16   23:invokevirtual   #139 <Method String String.substring(int)>
	//   17   26:invokespecial   #141 <Method void addID(String)>
				return;
	//   18   29:return          
			}
			addID(s.substring(i, j));
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:iload_2         
	//   22   33:iload_3         
	//   23   34:invokevirtual   #144 <Method String String.substring(int, int)>
	//   24   37:invokespecial   #141 <Method void addID(String)>
			i = j + 1;
	//   25   40:iload_3         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
		} while(true);
	//   29   44:goto            7
	}

	public int[] getReferencedIds()
	{
		return Arrays.copyOf(mIds, mCount);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int[] mIds>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int mCount>
	//    4    8:invokestatic    #152 <Method int[] Arrays.copyOf(int[], int)>
	//    5   11:areturn         
	}

	protected void init(AttributeSet attributeset)
	{
		if(attributeset != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          68
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, R.styleable.ConstraintLayout_Layout)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #156 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:getstatic       #161 <Field int[] R$styleable.ConstraintLayout_Layout>
	//    6   12:invokevirtual   #165 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    7   15:astore_1        
			int j = ((TypedArray) (attributeset)).getIndexCount();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #170 <Method int TypedArray.getIndexCount()>
	//   10   20:istore_3        
			for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          68
			{
				int k = ((TypedArray) (attributeset)).getIndex(i);
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #174 <Method int TypedArray.getIndex(int)>
	//   19   33:istore          4
				if(k == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids)
	//*  20   35:iload           4
	//*  21   37:getstatic       #177 <Field int R$styleable.ConstraintLayout_Layout_constraint_referenced_ids>
	//*  22   40:icmpne          61
				{
					mReferenceIds = ((TypedArray) (attributeset)).getString(k);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:iload           4
	//   26   47:invokevirtual   #180 <Method String TypedArray.getString(int)>
	//   27   50:putfield        #182 <Field String mReferenceIds>
					setIds(mReferenceIds);
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:getfield        #182 <Field String mReferenceIds>
	//   31   58:invokespecial   #184 <Method void setIds(String)>
				}
			}

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
		}
	//*  36   65:goto            23
	//   37   68:return          
	}

	public void onDraw(Canvas canvas)
	{
	//    0    0:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(mUseViewMeasure)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mUseViewMeasure>
	//*   2    4:ifeq            14
		{
			super.onMeasure(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #190 <Method void View.onMeasure(int, int)>
			return;
	//    7   13:return          
		} else
		{
			setMeasuredDimension(0, 0);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #193 <Method void setMeasuredDimension(int, int)>
			return;
	//   12   20:return          
		}
	}

	public void setReferencedIds(int ai[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		mCount = 0;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #24  <Field int mCount>
		for(; i < ai.length; i++)
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:arraylength     
	//*   8   10:icmpge          28
			setTag(ai[i], ((Object) (null)));
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:iload_2         
	//   12   16:iaload          
	//   13   17:aconst_null     
	//   14   18:invokevirtual   #106 <Method void setTag(int, Object)>

	//   15   21:iload_2         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_2        
	//*  19   25:goto            7
	//   20   28:return          
	}

	public void setTag(int i, Object obj)
	{
		int j = mCount;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mCount>
	//    2    4:istore_3        
		obj = ((Object) (mIds));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int[] mIds>
	//    5    9:astore_2        
		if(j + 1 > obj.length)
	//*   6   10:iload_3         
	//*   7   11:iconst_1        
	//*   8   12:iadd            
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmple          30
			mIds = Arrays.copyOf(((int []) (obj)), obj.length * 2);
	//   12   18:aload_0         
	//   13   19:aload_2         
	//   14   20:aload_2         
	//   15   21:arraylength     
	//   16   22:iconst_2        
	//   17   23:imul            
	//   18   24:invokestatic    #152 <Method int[] Arrays.copyOf(int[], int)>
	//   19   27:putfield        #22  <Field int[] mIds>
		obj = ((Object) (mIds));
	//   20   30:aload_0         
	//   21   31:getfield        #22  <Field int[] mIds>
	//   22   34:astore_2        
		j = mCount;
	//   23   35:aload_0         
	//   24   36:getfield        #24  <Field int mCount>
	//   25   39:istore_3        
		obj[j] = i;
	//   26   40:aload_2         
	//   27   41:iload_3         
	//   28   42:iload_1         
	//   29   43:iastore         
		mCount = j + 1;
	//   30   44:aload_0         
	//   31   45:iload_3         
	//   32   46:iconst_1        
	//   33   47:iadd            
	//   34   48:putfield        #24  <Field int mCount>
	//   35   51:return          
	}

	public void updatePostLayout(ConstraintLayout constraintlayout)
	{
	//    0    0:return          
	}

	public void updatePostMeasure(ConstraintLayout constraintlayout)
	{
	//    0    0:return          
	}

	public void updatePreLayout(ConstraintLayout constraintlayout)
	{
		if(isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #86  <Method boolean isInEditMode()>
	//*   2    4:ifeq            15
			setIds(mReferenceIds);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #182 <Field String mReferenceIds>
	//    6   12:invokespecial   #184 <Method void setIds(String)>
		Helper helper = mHelperWidget;
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field Helper mHelperWidget>
	//    9   19:astore_3        
		if(helper == null)
	//*  10   20:aload_3         
	//*  11   21:ifnonnull       25
			return;
	//   12   24:return          
		helper.removeAllIds();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #204 <Method void Helper.removeAllIds()>
		for(int i = 0; i < mCount; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_2        
	//*  17   31:iload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #24  <Field int mCount>
	//*  20   36:icmpge          73
		{
			View view = constraintlayout.findViewById(mIds[i]);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #22  <Field int[] mIds>
	//   24   44:iload_2         
	//   25   45:iaload          
	//   26   46:invokevirtual   #208 <Method View ConstraintLayout.findViewById(int)>
	//   27   49:astore_3        
			if(view != null)
	//*  28   50:aload_3         
	//*  29   51:ifnull          66
				mHelperWidget.add(constraintlayout.getViewWidget(view));
	//   30   54:aload_0         
	//   31   55:getfield        #26  <Field Helper mHelperWidget>
	//   32   58:aload_1         
	//   33   59:aload_3         
	//   34   60:invokevirtual   #212 <Method android.support.constraint.solver.widgets.ConstraintWidget ConstraintLayout.getViewWidget(View)>
	//   35   63:invokevirtual   #216 <Method void Helper.add(android.support.constraint.solver.widgets.ConstraintWidget)>
		}

	//   36   66:iload_2         
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:istore_2        
	//*  40   70:goto            31
	//   41   73:return          
	}

	public void validateParams()
	{
		if(mHelperWidget == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Helper mHelperWidget>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #221 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    6   12:astore_1        
		if(layoutparams instanceof ConstraintLayout.LayoutParams)
	//*   7   13:aload_1         
	//*   8   14:instanceof      #223 <Class ConstraintLayout$LayoutParams>
	//*   9   17:ifeq            31
			((ConstraintLayout.LayoutParams)layoutparams).widget = ((android.support.constraint.solver.widgets.ConstraintWidget) (mHelperWidget));
	//   10   20:aload_1         
	//   11   21:checkcast       #223 <Class ConstraintLayout$LayoutParams>
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field Helper mHelperWidget>
	//   14   28:putfield        #227 <Field android.support.constraint.solver.widgets.ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   15   31:return          
	}

	protected int mCount;
	protected Helper mHelperWidget;
	protected int mIds[];
	private String mReferenceIds;
	protected boolean mUseViewMeasure;
	protected Context myContext;
}
