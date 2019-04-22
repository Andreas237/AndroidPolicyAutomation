// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

static abstract class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable extends ColorDrawable
{

	void highlightView(View view)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_2        
		if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #38  <Class android.view.ViewGroup$MarginLayoutParams>
	//*   5    9:ifeq            64
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//    6   12:aload_2         
	//    7   13:checkcast       #38  <Class android.view.ViewGroup$MarginLayoutParams>
	//    8   16:astore_2        
			mMargins.left = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field Rect mMargins>
	//   11   21:aload_2         
	//   12   22:getfield        #42  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:putfield        #45  <Field int Rect.left>
			mMargins.top = ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin;
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field Rect mMargins>
	//   16   32:aload_2         
	//   17   33:getfield        #48  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   18   36:putfield        #51  <Field int Rect.top>
			mMargins.right = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
	//   19   39:aload_0         
	//   20   40:getfield        #22  <Field Rect mMargins>
	//   21   43:aload_2         
	//   22   44:getfield        #54  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   23   47:putfield        #57  <Field int Rect.right>
			mMargins.bottom = ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
	//   24   50:aload_0         
	//   25   51:getfield        #22  <Field Rect mMargins>
	//   26   54:aload_2         
	//   27   55:getfield        #60  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   28   58:putfield        #63  <Field int Rect.bottom>
		} else
	//*  29   61:goto            89
		{
			Rect rect = mMargins;
	//   30   64:aload_0         
	//   31   65:getfield        #22  <Field Rect mMargins>
	//   32   68:astore_2        
			rect.left = 0;
	//   33   69:aload_2         
	//   34   70:iconst_0        
	//   35   71:putfield        #45  <Field int Rect.left>
			rect.top = 0;
	//   36   74:aload_2         
	//   37   75:iconst_0        
	//   38   76:putfield        #51  <Field int Rect.top>
			rect.right = 0;
	//   39   79:aload_2         
	//   40   80:iconst_0        
	//   41   81:putfield        #57  <Field int Rect.right>
			rect.bottom = 0;
	//   42   84:aload_2         
	//   43   85:iconst_0        
	//   44   86:putfield        #63  <Field int Rect.bottom>
		}
		mPaddings.left = view.getPaddingLeft();
	//   45   89:aload_0         
	//   46   90:getfield        #24  <Field Rect mPaddings>
	//   47   93:aload_1         
	//   48   94:invokevirtual   #67  <Method int View.getPaddingLeft()>
	//   49   97:putfield        #45  <Field int Rect.left>
		mPaddings.top = view.getPaddingTop();
	//   50  100:aload_0         
	//   51  101:getfield        #24  <Field Rect mPaddings>
	//   52  104:aload_1         
	//   53  105:invokevirtual   #70  <Method int View.getPaddingTop()>
	//   54  108:putfield        #51  <Field int Rect.top>
		mPaddings.right = view.getPaddingRight();
	//   55  111:aload_0         
	//   56  112:getfield        #24  <Field Rect mPaddings>
	//   57  115:aload_1         
	//   58  116:invokevirtual   #73  <Method int View.getPaddingRight()>
	//   59  119:putfield        #57  <Field int Rect.right>
		mPaddings.bottom = view.getPaddingBottom();
	//   60  122:aload_0         
	//   61  123:getfield        #24  <Field Rect mPaddings>
	//   62  126:aload_1         
	//   63  127:invokevirtual   #76  <Method int View.getPaddingBottom()>
	//   64  130:putfield        #63  <Field int Rect.bottom>
	//   65  133:return          
	}

	protected final Rect mMargins;
	protected final Rect mPaddings;

	public ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ColorDrawable()>
		mMargins = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Rect()>
	//    6   12:putfield        #22  <Field Rect mMargins>
		mPaddings = new Rect();
	//    7   15:aload_0         
	//    8   16:new             #19  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #20  <Method void Rect()>
	//   11   23:putfield        #24  <Field Rect mPaddings>
	//   12   26:return          
	}

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #28  <Method void ColorDrawable(int)>
		mMargins = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #19  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #20  <Method void Rect()>
	//    7   13:putfield        #22  <Field Rect mMargins>
		mPaddings = new Rect();
	//    8   16:aload_0         
	//    9   17:new             #19  <Class Rect>
	//   10   20:dup             
	//   11   21:invokespecial   #20  <Method void Rect()>
	//   12   24:putfield        #24  <Field Rect mPaddings>
	//   13   27:return          
	}
}
