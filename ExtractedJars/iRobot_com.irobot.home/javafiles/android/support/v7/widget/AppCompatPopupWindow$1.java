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
		WeakReference weakreference;
		try
		{
			weakreference = (WeakReference)a.get(((Object) (b)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Field a>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field PopupWindow b>
	//    4    8:invokevirtual   #37  <Method Object Field.get(Object)>
	//    5   11:checkcast       #39  <Class WeakReference>
	//    6   14:astore_1        
		}
	//*   7   15:aload_1         
	//*   8   16:ifnull          37
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #42  <Method Object WeakReference.get()>
	//*  11   23:ifnonnull       27
	//*  12   26:return          
	//*  13   27:aload_0         
	//*  14   28:getfield        #24  <Field android.view.ViewTreeObserver$OnScrollChangedListener c>
	//*  15   31:invokeinterface #44  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
	//*  16   36:return          
	//*  17   37:return          
		catch(IllegalAccessException illegalaccessexception)
	//*  18   38:astore_1        
		{
			return;
	//   19   39:return          
		}
		if(weakreference == null)
			break MISSING_BLOCK_LABEL_37;
		if(weakreference.get() == null)
			return;
		c.onScrollChanged();
		return;
	}

	final Field a;
	final PopupWindow b;
	final android.view.llChangedListener c;

	AppCompatPopupWindow$1(Field field, PopupWindow popupwindow, android.view.llChangedListener llchangedlistener)
	{
		a = field;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Field a>
		b = popupwindow;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field PopupWindow b>
		c = llchangedlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field android.view.ViewTreeObserver$OnScrollChangedListener c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
