// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.widget:
//			AppCompatPopupWindow

static final class AppCompatPopupWindow$1
	implements android.view.llChangedListener
{

	public void onScrollChanged()
	{
		WeakReference weakreference = (WeakReference)val$fieldAnchor.get(((Object) (val$popup)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Field val$fieldAnchor>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field PopupWindow val$popup>
	//    4    8:invokevirtual   #38  <Method Object Field.get(Object)>
	//    5   11:checkcast       #40  <Class WeakReference>
	//    6   14:astore_1        
		if(weakreference == null)
			break MISSING_BLOCK_LABEL_38;
	//    7   15:aload_1         
	//    8   16:ifnull          38
		if(weakreference.get() == null)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #43  <Method Object WeakReference.get()>
	//*  11   23:ifnonnull       27
			return;
	//   12   26:return          
		try
		{
			val$originalListener.onScrollChanged();
	//   13   27:aload_0         
	//   14   28:getfield        #25  <Field android.view.ViewTreeObserver$OnScrollChangedListener val$originalListener>
	//   15   31:invokeinterface #45  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
			return;
	//   16   36:return          
		}
		catch(IllegalAccessException illegalaccessexception) { }
	//   17   37:astore_1        
	//   18   38:return          
	}

	final Field val$fieldAnchor;
	final android.view.llChangedListener val$originalListener;
	final PopupWindow val$popup;

	AppCompatPopupWindow$1(Field field, PopupWindow popupwindow, android.view.llChangedListener llchangedlistener)
	{
		val$fieldAnchor = field;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Field val$fieldAnchor>
		val$popup = popupwindow;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field PopupWindow val$popup>
		val$originalListener = llchangedlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field android.view.ViewTreeObserver$OnScrollChangedListener val$originalListener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
