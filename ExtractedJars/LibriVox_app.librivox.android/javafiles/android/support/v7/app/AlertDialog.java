// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog, AlertController

public class AlertDialog extends AppCompatDialog
	implements DialogInterface
{

	protected AlertDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void AlertDialog(Context, int)>
	//    4    6:return          
	}

	protected AlertDialog(Context context, int i)
	{
		super(context, resolveDialogTheme(context, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #23  <Method int resolveDialogTheme(Context, int)>
	//    5    7:invokespecial   #24  <Method void AppCompatDialog(Context, int)>
		mAlert = new AlertController(getContext(), ((AppCompatDialog) (this)), getWindow());
	//    6   10:aload_0         
	//    7   11:new             #26  <Class AlertController>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokevirtual   #30  <Method Context getContext()>
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #34  <Method android.view.Window getWindow()>
	//   14   24:invokespecial   #37  <Method void AlertController(Context, AppCompatDialog, android.view.Window)>
	//   15   27:putfield        #39  <Field AlertController mAlert>
	//   16   30:return          
	}

	protected AlertDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #18  <Method void AlertDialog(Context, int)>
		setCancelable(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #44  <Method void setCancelable(boolean)>
		setOnCancelListener(oncancellistener);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #48  <Method void setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   10   16:return          
	}

	static int resolveDialogTheme(Context context, int i)
	{
		if((i >>> 24 & 0xff) >= 1)
	//*   0    0:iload_1         
	//*   1    1:bipush          24
	//*   2    3:iushr           
	//*   3    4:sipush          255
	//*   4    7:iand            
	//*   5    8:iconst_1        
	//*   6    9:icmplt          14
		{
			return i;
	//    7   12:iload_1         
	//    8   13:ireturn         
		} else
		{
			TypedValue typedvalue = new TypedValue();
	//    9   14:new             #50  <Class TypedValue>
	//   10   17:dup             
	//   11   18:invokespecial   #53  <Method void TypedValue()>
	//   12   21:astore_2        
			context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogTheme, typedvalue, true);
	//   13   22:aload_0         
	//   14   23:invokevirtual   #59  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   15   26:getstatic       #64  <Field int android.support.v7.appcompat.R$attr.alertDialogTheme>
	//   16   29:aload_2         
	//   17   30:iconst_1        
	//   18   31:invokevirtual   #70  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   19   34:pop             
			return typedvalue.resourceId;
	//   20   35:aload_2         
	//   21   36:getfield        #73  <Field int TypedValue.resourceId>
	//   22   39:ireturn         
		}
	}

	public Button getButton(int i)
	{
		return mAlert.getButton(i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #77  <Method Button AlertController.getButton(int)>
	//    4    8:areturn         
	}

	public ListView getListView()
	{
		return mAlert.getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:invokevirtual   #81  <Method ListView AlertController.getListView()>
	//    3    7:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void AppCompatDialog.onCreate(Bundle)>
		mAlert.installContent();
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field AlertController mAlert>
	//    5    9:invokevirtual   #88  <Method void AlertController.installContent()>
	//    6   12:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(mAlert.onKeyDown(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AlertController mAlert>
	//*   2    4:iload_1         
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #92  <Method boolean AlertController.onKeyDown(int, KeyEvent)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		else
			return super.onKeyDown(i, keyevent);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #93  <Method boolean AppCompatDialog.onKeyDown(int, KeyEvent)>
	//   12   20:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(mAlert.onKeyUp(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AlertController mAlert>
	//*   2    4:iload_1         
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #96  <Method boolean AlertController.onKeyUp(int, KeyEvent)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		else
			return super.onKeyUp(i, keyevent);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #97  <Method boolean AppCompatDialog.onKeyUp(int, KeyEvent)>
	//   12   20:ireturn         
	}

	public void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
	{
		mAlert.setButton(i, charsequence, onclicklistener, ((Message) (null)), ((Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #102 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
	//    8   12:return          
	}

	public void setButton(int i, CharSequence charsequence, Drawable drawable, android.content.DialogInterface.OnClickListener onclicklistener)
	{
		mAlert.setButton(i, charsequence, onclicklistener, ((Message) (null)), drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload           4
	//    5    8:aconst_null     
	//    6    9:aload_3         
	//    7   10:invokevirtual   #102 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
	//    8   13:return          
	}

	public void setButton(int i, CharSequence charsequence, Message message)
	{
		mAlert.setButton(i, charsequence, ((android.content.DialogInterface.OnClickListener) (null)), message, ((Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #102 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message, Drawable)>
	//    8   12:return          
	}

	void setButtonPanelLayoutHint(int i)
	{
		mAlert.setButtonPanelLayoutHint(i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method void AlertController.setButtonPanelLayoutHint(int)>
	//    4    8:return          
	}

	public void setCustomTitle(View view)
	{
		mAlert.setCustomTitle(view);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method void AlertController.setCustomTitle(View)>
	//    4    8:return          
	}

	public void setIcon(int i)
	{
		mAlert.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void AlertController.setIcon(int)>
	//    4    8:return          
	}

	public void setIcon(Drawable drawable)
	{
		mAlert.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method void AlertController.setIcon(Drawable)>
	//    4    8:return          
	}

	public void setIconAttribute(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #50  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void TypedValue()>
	//    3    7:astore_2        
		getContext().getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #30  <Method Context getContext()>
	//    6   12:invokevirtual   #59  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #70  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		mAlert.setIcon(typedvalue.resourceId);
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field AlertController mAlert>
	//   14   26:aload_2         
	//   15   27:getfield        #73  <Field int TypedValue.resourceId>
	//   16   30:invokevirtual   #115 <Method void AlertController.setIcon(int)>
	//   17   33:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mAlert.setMessage(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method void AlertController.setMessage(CharSequence)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		super.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void AppCompatDialog.setTitle(CharSequence)>
		mAlert.setTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field AlertController mAlert>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #127 <Method void AlertController.setTitle(CharSequence)>
	//    7   13:return          
	}

	public void setView(View view)
	{
		mAlert.setView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void AlertController.setView(View)>
	//    4    8:return          
	}

	public void setView(View view, int i, int j, int k, int l)
	{
		mAlert.setView(view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #133 <Method void AlertController.setView(View, int, int, int, int)>
	//    8   14:return          
	}

	static final int LAYOUT_HINT_NONE = 0;
	static final int LAYOUT_HINT_SIDE = 1;
	final AlertController mAlert;
}
