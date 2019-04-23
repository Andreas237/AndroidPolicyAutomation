// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.*;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View
{

	public ViewStubCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #18  <Method void ViewStubCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ViewStubCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #20  <Method void View(Context, AttributeSet, int)>
		mLayoutResource = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #22  <Field int mLayoutResource>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ViewStubCompat, i, 0)));
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #28  <Field int[] android.support.v7.appcompat.R$styleable.ViewStubCompat>
	//   11   17:iload_3         
	//   12   18:iconst_0        
	//   13   19:invokevirtual   #34  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   14   22:astore_1        
		mInflatedId = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_inflatedId, -1);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:getstatic       #37  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_inflatedId>
	//   18   28:iconst_m1       
	//   19   29:invokevirtual   #43  <Method int TypedArray.getResourceId(int, int)>
	//   20   32:putfield        #45  <Field int mInflatedId>
		mLayoutResource = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_layout, 0);
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:getstatic       #48  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_layout>
	//   24   40:iconst_0        
	//   25   41:invokevirtual   #43  <Method int TypedArray.getResourceId(int, int)>
	//   26   44:putfield        #22  <Field int mLayoutResource>
		setId(((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_id, -1));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:getstatic       #51  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_id>
	//   30   52:iconst_m1       
	//   31   53:invokevirtual   #43  <Method int TypedArray.getResourceId(int, int)>
	//   32   56:invokevirtual   #55  <Method void setId(int)>
		((TypedArray) (context)).recycle();
	//   33   59:aload_1         
	//   34   60:invokevirtual   #59  <Method void TypedArray.recycle()>
		setVisibility(8);
	//   35   63:aload_0         
	//   36   64:bipush          8
	//   37   66:invokevirtual   #62  <Method void setVisibility(int)>
		setWillNotDraw(true);
	//   38   69:aload_0         
	//   39   70:iconst_1        
	//   40   71:invokevirtual   #66  <Method void setWillNotDraw(boolean)>
	//   41   74:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
	//    0    0:return          
	}

	public void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	public int getInflatedId()
	{
		return mInflatedId;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mInflatedId>
	//    2    4:ireturn         
	}

	public LayoutInflater getLayoutInflater()
	{
		return mInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field LayoutInflater mInflater>
	//    2    4:areturn         
	}

	public int getLayoutResource()
	{
		return mLayoutResource;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mLayoutResource>
	//    2    4:ireturn         
	}

	public View inflate()
	{
		Object obj = ((Object) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method android.view.ViewParent getParent()>
	//    2    4:astore_2        
		if(obj != null && (obj instanceof ViewGroup))
	//*   3    5:aload_2         
	//*   4    6:ifnull          154
	//*   5    9:aload_2         
	//*   6   10:instanceof      #88  <Class ViewGroup>
	//*   7   13:ifeq            154
		{
			if(mLayoutResource != 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #22  <Field int mLayoutResource>
	//*  10   20:ifeq            144
			{
				Object obj1 = ((Object) ((ViewGroup)obj));
	//   11   23:aload_2         
	//   12   24:checkcast       #88  <Class ViewGroup>
	//   13   27:astore_3        
				obj = ((Object) (mInflater));
	//   14   28:aload_0         
	//   15   29:getfield        #79  <Field LayoutInflater mInflater>
	//   16   32:astore_2        
				if(obj == null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          40
	//*  19   37:goto            48
					obj = ((Object) (LayoutInflater.from(getContext())));
	//   20   40:aload_0         
	//   21   41:invokevirtual   #92  <Method Context getContext()>
	//   22   44:invokestatic    #98  <Method LayoutInflater LayoutInflater.from(Context)>
	//   23   47:astore_2        
				obj = ((Object) (((LayoutInflater) (obj)).inflate(mLayoutResource, ((ViewGroup) (obj1)), false)));
	//   24   48:aload_2         
	//   25   49:aload_0         
	//   26   50:getfield        #22  <Field int mLayoutResource>
	//   27   53:aload_3         
	//   28   54:iconst_0        
	//   29   55:invokevirtual   #101 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   30   58:astore_2        
				int i = mInflatedId;
	//   31   59:aload_0         
	//   32   60:getfield        #45  <Field int mInflatedId>
	//   33   63:istore_1        
				if(i != -1)
	//*  34   64:iload_1         
	//*  35   65:iconst_m1       
	//*  36   66:icmpeq          74
					((View) (obj)).setId(i);
	//   37   69:aload_2         
	//   38   70:iload_1         
	//   39   71:invokevirtual   #102 <Method void View.setId(int)>
				i = ((ViewGroup) (obj1)).indexOfChild(((View) (this)));
	//   40   74:aload_3         
	//   41   75:aload_0         
	//   42   76:invokevirtual   #106 <Method int ViewGroup.indexOfChild(View)>
	//   43   79:istore_1        
				((ViewGroup) (obj1)).removeViewInLayout(((View) (this)));
	//   44   80:aload_3         
	//   45   81:aload_0         
	//   46   82:invokevirtual   #110 <Method void ViewGroup.removeViewInLayout(View)>
				android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//   47   85:aload_0         
	//   48   86:invokevirtual   #114 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   49   89:astore          4
				if(layoutparams != null)
	//*  50   91:aload           4
	//*  51   93:ifnull          107
					((ViewGroup) (obj1)).addView(((View) (obj)), i, layoutparams);
	//   52   96:aload_3         
	//   53   97:aload_2         
	//   54   98:iload_1         
	//   55   99:aload           4
	//   56  101:invokevirtual   #118 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
				else
	//*  57  104:goto            113
					((ViewGroup) (obj1)).addView(((View) (obj)), i);
	//   58  107:aload_3         
	//   59  108:aload_2         
	//   60  109:iload_1         
	//   61  110:invokevirtual   #121 <Method void ViewGroup.addView(View, int)>
				mInflatedViewRef = new WeakReference(obj);
	//   62  113:aload_0         
	//   63  114:new             #123 <Class WeakReference>
	//   64  117:dup             
	//   65  118:aload_2         
	//   66  119:invokespecial   #126 <Method void WeakReference(Object)>
	//   67  122:putfield        #128 <Field WeakReference mInflatedViewRef>
				obj1 = ((Object) (mInflateListener));
	//   68  125:aload_0         
	//   69  126:getfield        #130 <Field ViewStubCompat$OnInflateListener mInflateListener>
	//   70  129:astore_3        
				if(obj1 != null)
	//*  71  130:aload_3         
	//*  72  131:ifnull          142
					((OnInflateListener) (obj1)).onInflate(this, ((View) (obj)));
	//   73  134:aload_3         
	//   74  135:aload_0         
	//   75  136:aload_2         
	//   76  137:invokeinterface #136 <Method void ViewStubCompat$OnInflateListener.onInflate(ViewStubCompat, View)>
				return ((View) (obj));
	//   77  142:aload_2         
	//   78  143:areturn         
			} else
			{
				throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
	//   79  144:new             #138 <Class IllegalArgumentException>
	//   80  147:dup             
	//   81  148:ldc1            #140 <String "ViewStub must have a valid layoutResource">
	//   82  150:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//   83  153:athrow          
			}
		} else
		{
			throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
	//   84  154:new             #145 <Class IllegalStateException>
	//   85  157:dup             
	//   86  158:ldc1            #147 <String "ViewStub must have a non-null ViewGroup viewParent">
	//   87  160:invokespecial   #148 <Method void IllegalStateException(String)>
	//   88  163:athrow          
		}
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #153 <Method void setMeasuredDimension(int, int)>
	//    4    6:return          
	}

	public void setInflatedId(int i)
	{
		mInflatedId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mInflatedId>
	//    3    5:return          
	}

	public void setLayoutInflater(LayoutInflater layoutinflater)
	{
		mInflater = layoutinflater;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field LayoutInflater mInflater>
	//    3    5:return          
	}

	public void setLayoutResource(int i)
	{
		mLayoutResource = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int mLayoutResource>
	//    3    5:return          
	}

	public void setOnInflateListener(OnInflateListener oninflatelistener)
	{
		mInflateListener = oninflatelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field ViewStubCompat$OnInflateListener mInflateListener>
	//    3    5:return          
	}

	public void setVisibility(int i)
	{
		Object obj = ((Object) (mInflatedViewRef));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field WeakReference mInflatedViewRef>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          37
		{
			obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #163 <Method Object WeakReference.get()>
	//    7   13:checkcast       #4   <Class View>
	//    8   16:astore_2        
			if(obj != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          27
			{
				((View) (obj)).setVisibility(i);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #164 <Method void View.setVisibility(int)>
				return;
	//   14   26:return          
			} else
			{
				throw new IllegalStateException("setVisibility called on un-referenced view");
	//   15   27:new             #145 <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:ldc1            #166 <String "setVisibility called on un-referenced view">
	//   18   33:invokespecial   #148 <Method void IllegalStateException(String)>
	//   19   36:athrow          
			}
		}
		super.setVisibility(i);
	//   20   37:aload_0         
	//   21   38:iload_1         
	//   22   39:invokespecial   #164 <Method void View.setVisibility(int)>
		if(i == 0 || i == 4)
	//*  23   42:iload_1         
	//*  24   43:ifeq            51
	//*  25   46:iload_1         
	//*  26   47:iconst_4        
	//*  27   48:icmpne          56
			inflate();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #168 <Method View inflate()>
	//   30   55:pop             
	//   31   56:return          
	}

	private OnInflateListener mInflateListener;
	private int mInflatedId;
	private WeakReference mInflatedViewRef;
	private LayoutInflater mInflater;
	private int mLayoutResource;

	private class OnInflateListener
	{

		public abstract void onInflate(ViewStubCompat viewstubcompat, View view);
	}

}
