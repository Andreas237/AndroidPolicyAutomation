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
	public static interface OnInflateListener
	{

		public abstract void onInflate(ViewStubCompat viewstubcompat, View view);
	}


	public ViewStubCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #26  <Method void ViewStubCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ViewStubCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void View(Context, AttributeSet, int)>
		mLayoutResource = 0;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #30  <Field int mLayoutResource>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ViewStubCompat, i, 0)));
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #36  <Field int[] android.support.v7.appcompat.R$styleable.ViewStubCompat>
	//   11   17:iload_3         
	//   12   18:iconst_0        
	//   13   19:invokevirtual   #42  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   14   22:astore_1        
		mInflatedId = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_inflatedId, -1);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:getstatic       #45  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_inflatedId>
	//   18   28:iconst_m1       
	//   19   29:invokevirtual   #51  <Method int TypedArray.getResourceId(int, int)>
	//   20   32:putfield        #53  <Field int mInflatedId>
		mLayoutResource = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_layout, 0);
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:getstatic       #56  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_layout>
	//   24   40:iconst_0        
	//   25   41:invokevirtual   #51  <Method int TypedArray.getResourceId(int, int)>
	//   26   44:putfield        #30  <Field int mLayoutResource>
		setId(((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ViewStubCompat_android_id, -1));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:getstatic       #59  <Field int android.support.v7.appcompat.R$styleable.ViewStubCompat_android_id>
	//   30   52:iconst_m1       
	//   31   53:invokevirtual   #51  <Method int TypedArray.getResourceId(int, int)>
	//   32   56:invokevirtual   #63  <Method void setId(int)>
		((TypedArray) (context)).recycle();
	//   33   59:aload_1         
	//   34   60:invokevirtual   #67  <Method void TypedArray.recycle()>
		setVisibility(8);
	//   35   63:aload_0         
	//   36   64:bipush          8
	//   37   66:invokevirtual   #70  <Method void setVisibility(int)>
		setWillNotDraw(true);
	//   38   69:aload_0         
	//   39   70:iconst_1        
	//   40   71:invokevirtual   #74  <Method void setWillNotDraw(boolean)>
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
	//    1    1:getfield        #53  <Field int mInflatedId>
	//    2    4:ireturn         
	}

	public LayoutInflater getLayoutInflater()
	{
		return mInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field LayoutInflater mInflater>
	//    2    4:areturn         
	}

	public int getLayoutResource()
	{
		return mLayoutResource;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mLayoutResource>
	//    2    4:ireturn         
	}

	public View inflate()
	{
		Object obj = ((Object) (getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method android.view.ViewParent getParent()>
	//    2    4:astore_2        
		if(obj != null && (obj instanceof ViewGroup))
	//*   3    5:aload_2         
	//*   4    6:ifnull          159
	//*   5    9:aload_2         
	//*   6   10:instanceof      #95  <Class ViewGroup>
	//*   7   13:ifeq            159
		{
			if(mLayoutResource != 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field int mLayoutResource>
	//*  10   20:ifeq            149
			{
				ViewGroup viewgroup = (ViewGroup)obj;
	//   11   23:aload_2         
	//   12   24:checkcast       #95  <Class ViewGroup>
	//   13   27:astore_3        
				if(mInflater != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #86  <Field LayoutInflater mInflater>
	//*  16   32:ifnull          43
					obj = ((Object) (mInflater));
	//   17   35:aload_0         
	//   18   36:getfield        #86  <Field LayoutInflater mInflater>
	//   19   39:astore_2        
				else
	//*  20   40:goto            51
					obj = ((Object) (LayoutInflater.from(getContext())));
	//   21   43:aload_0         
	//   22   44:invokevirtual   #99  <Method Context getContext()>
	//   23   47:invokestatic    #105 <Method LayoutInflater LayoutInflater.from(Context)>
	//   24   50:astore_2        
				obj = ((Object) (((LayoutInflater) (obj)).inflate(mLayoutResource, viewgroup, false)));
	//   25   51:aload_2         
	//   26   52:aload_0         
	//   27   53:getfield        #30  <Field int mLayoutResource>
	//   28   56:aload_3         
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #108 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   31   61:astore_2        
				if(mInflatedId != -1)
	//*  32   62:aload_0         
	//*  33   63:getfield        #53  <Field int mInflatedId>
	//*  34   66:iconst_m1       
	//*  35   67:icmpeq          78
					((View) (obj)).setId(mInflatedId);
	//   36   70:aload_2         
	//   37   71:aload_0         
	//   38   72:getfield        #53  <Field int mInflatedId>
	//   39   75:invokevirtual   #109 <Method void View.setId(int)>
				int i = viewgroup.indexOfChild(((View) (this)));
	//   40   78:aload_3         
	//   41   79:aload_0         
	//   42   80:invokevirtual   #113 <Method int ViewGroup.indexOfChild(View)>
	//   43   83:istore_1        
				viewgroup.removeViewInLayout(((View) (this)));
	//   44   84:aload_3         
	//   45   85:aload_0         
	//   46   86:invokevirtual   #117 <Method void ViewGroup.removeViewInLayout(View)>
				android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #121 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   49   93:astore          4
				if(layoutparams != null)
	//*  50   95:aload           4
	//*  51   97:ifnull          111
					viewgroup.addView(((View) (obj)), i, layoutparams);
	//   52  100:aload_3         
	//   53  101:aload_2         
	//   54  102:iload_1         
	//   55  103:aload           4
	//   56  105:invokevirtual   #125 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
				else
	//*  57  108:goto            117
					viewgroup.addView(((View) (obj)), i);
	//   58  111:aload_3         
	//   59  112:aload_2         
	//   60  113:iload_1         
	//   61  114:invokevirtual   #128 <Method void ViewGroup.addView(View, int)>
				mInflatedViewRef = new WeakReference(obj);
	//   62  117:aload_0         
	//   63  118:new             #130 <Class WeakReference>
	//   64  121:dup             
	//   65  122:aload_2         
	//   66  123:invokespecial   #133 <Method void WeakReference(Object)>
	//   67  126:putfield        #135 <Field WeakReference mInflatedViewRef>
				if(mInflateListener != null)
	//*  68  129:aload_0         
	//*  69  130:getfield        #137 <Field ViewStubCompat$OnInflateListener mInflateListener>
	//*  70  133:ifnull          147
					mInflateListener.onInflate(this, ((View) (obj)));
	//   71  136:aload_0         
	//   72  137:getfield        #137 <Field ViewStubCompat$OnInflateListener mInflateListener>
	//   73  140:aload_0         
	//   74  141:aload_2         
	//   75  142:invokeinterface #141 <Method void ViewStubCompat$OnInflateListener.onInflate(ViewStubCompat, View)>
				return ((View) (obj));
	//   76  147:aload_2         
	//   77  148:areturn         
			} else
			{
				throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
	//   78  149:new             #143 <Class IllegalArgumentException>
	//   79  152:dup             
	//   80  153:ldc1            #145 <String "ViewStub must have a valid layoutResource">
	//   81  155:invokespecial   #148 <Method void IllegalArgumentException(String)>
	//   82  158:athrow          
			}
		} else
		{
			throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
	//   83  159:new             #150 <Class IllegalStateException>
	//   84  162:dup             
	//   85  163:ldc1            #152 <String "ViewStub must have a non-null ViewGroup viewParent">
	//   86  165:invokespecial   #153 <Method void IllegalStateException(String)>
	//   87  168:athrow          
		}
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(0, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #158 <Method void setMeasuredDimension(int, int)>
	//    4    6:return          
	}

	public void setInflatedId(int i)
	{
		mInflatedId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int mInflatedId>
	//    3    5:return          
	}

	public void setLayoutInflater(LayoutInflater layoutinflater)
	{
		mInflater = layoutinflater;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field LayoutInflater mInflater>
	//    3    5:return          
	}

	public void setLayoutResource(int i)
	{
		mLayoutResource = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mLayoutResource>
	//    3    5:return          
	}

	public void setOnInflateListener(OnInflateListener oninflatelistener)
	{
		mInflateListener = oninflatelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field ViewStubCompat$OnInflateListener mInflateListener>
	//    3    5:return          
	}

	public void setVisibility(int i)
	{
		if(mInflatedViewRef != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field WeakReference mInflatedViewRef>
	//*   2    4:ifnull          38
		{
			View view = (View)mInflatedViewRef.get();
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field WeakReference mInflatedViewRef>
	//    5   11:invokevirtual   #168 <Method Object WeakReference.get()>
	//    6   14:checkcast       #4   <Class View>
	//    7   17:astore_2        
			if(view != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          28
			{
				view.setVisibility(i);
	//   10   22:aload_2         
	//   11   23:iload_1         
	//   12   24:invokevirtual   #169 <Method void View.setVisibility(int)>
				return;
	//   13   27:return          
			} else
			{
				throw new IllegalStateException("setVisibility called on un-referenced view");
	//   14   28:new             #150 <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc1            #171 <String "setVisibility called on un-referenced view">
	//   17   34:invokespecial   #153 <Method void IllegalStateException(String)>
	//   18   37:athrow          
			}
		}
		super.setVisibility(i);
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:invokespecial   #169 <Method void View.setVisibility(int)>
		if(i == 0 || i == 4)
	//*  22   43:iload_1         
	//*  23   44:ifeq            52
	//*  24   47:iload_1         
	//*  25   48:iconst_4        
	//*  26   49:icmpne          57
			inflate();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #173 <Method View inflate()>
	//   29   56:pop             
	//   30   57:return          
	}

	private OnInflateListener mInflateListener;
	private int mInflatedId;
	private WeakReference mInflatedViewRef;
	private LayoutInflater mInflater;
	private int mLayoutResource;
}
