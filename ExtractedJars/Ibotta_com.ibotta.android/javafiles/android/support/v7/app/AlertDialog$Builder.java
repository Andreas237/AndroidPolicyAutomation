// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//			AlertDialog

public static class AlertDialog$Builder
{

	public AlertDialog create()
	{
		AlertDialog alertdialog = new AlertDialog(P.mContext, mTheme);
	//    0    0:new             #6   <Class AlertDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field AlertController$AlertParams P>
	//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field int mTheme>
	//    7   15:invokespecial   #45  <Method void AlertDialog(Context, int)>
	//    8   18:astore_1        
		P.apply(alertdialog.mAlert);
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field AlertController$AlertParams P>
	//   11   23:aload_1         
	//   12   24:getfield        #49  <Field AlertController AlertDialog.mAlert>
	//   13   27:invokevirtual   #53  <Method void AlertController$AlertParams.apply(AlertController)>
		alertdialog.setCancelable(P.mCancelable);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #36  <Field AlertController$AlertParams P>
	//   17   35:getfield        #57  <Field boolean AlertController$AlertParams.mCancelable>
	//   18   38:invokevirtual   #61  <Method void AlertDialog.setCancelable(boolean)>
		if(P.mCancelable)
	//*  19   41:aload_0         
	//*  20   42:getfield        #36  <Field AlertController$AlertParams P>
	//*  21   45:getfield        #57  <Field boolean AlertController$AlertParams.mCancelable>
	//*  22   48:ifeq            56
			alertdialog.setCanceledOnTouchOutside(true);
	//   23   51:aload_1         
	//   24   52:iconst_1        
	//   25   53:invokevirtual   #64  <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
		alertdialog.setOnCancelListener(P.mOnCancelListener);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #36  <Field AlertController$AlertParams P>
	//   29   61:getfield        #68  <Field android.content.DialogInterface$OnCancelListener AlertController$AlertParams.mOnCancelListener>
	//   30   64:invokevirtual   #72  <Method void AlertDialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		alertdialog.setOnDismissListener(P.mOnDismissListener);
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #36  <Field AlertController$AlertParams P>
	//   34   72:getfield        #76  <Field android.content.DialogInterface$OnDismissListener AlertController$AlertParams.mOnDismissListener>
	//   35   75:invokevirtual   #80  <Method void AlertDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		if(P.mOnKeyListener != null)
	//*  36   78:aload_0         
	//*  37   79:getfield        #36  <Field AlertController$AlertParams P>
	//*  38   82:getfield        #84  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
	//*  39   85:ifnull          99
			alertdialog.setOnKeyListener(P.mOnKeyListener);
	//   40   88:aload_1         
	//   41   89:aload_0         
	//   42   90:getfield        #36  <Field AlertController$AlertParams P>
	//   43   93:getfield        #84  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
	//   44   96:invokevirtual   #88  <Method void AlertDialog.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
		return alertdialog;
	//   45   99:aload_1         
	//   46  100:areturn         
	}

	public Context getContext()
	{
		return P.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    3    7:areturn         
	}

	public AlertDialog$Builder setAdapter(ListAdapter listadapter, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mAdapter = listadapter;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #97  <Field ListAdapter AlertController$AlertParams.mAdapter>
		tparams.mOnClickListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setCancelable(boolean flag)
	{
		P.mCancelable = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:iload_1         
	//    3    5:putfield        #57  <Field boolean AlertController$AlertParams.mCancelable>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setCustomTitle(View view)
	{
		P.mCustomTitleView = view;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #109 <Field View AlertController$AlertParams.mCustomTitleView>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setIcon(Drawable drawable)
	{
		P.mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #115 <Field Drawable AlertController$AlertParams.mIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setItems(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mItems = tparams.mContext.getResources().getTextArray(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    6   10:invokevirtual   #124 <Method Resources Context.getResources()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #130 <Method CharSequence[] Resources.getTextArray(int)>
	//    9   17:putfield        #134 <Field CharSequence[] AlertController$AlertParams.mItems>
		P.mOnClickListener = icklistener;
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field AlertController$AlertParams P>
	//   12   24:aload_2         
	//   13   25:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public AlertDialog$Builder setMessage(int i)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mMessage = tparams.mContext.getText(i);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #141 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #145 <Field CharSequence AlertController$AlertParams.mMessage>
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public AlertDialog$Builder setMessage(CharSequence charsequence)
	{
		P.mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #145 <Field CharSequence AlertController$AlertParams.mMessage>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setNegativeButton(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNegativeButtonText = tparams.mContext.getText(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #141 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #150 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
		P.mNegativeButtonListener = icklistener;
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field AlertController$AlertParams P>
	//   11   21:aload_2         
	//   12   22:putfield        #153 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public AlertDialog$Builder setNegativeButton(CharSequence charsequence, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNegativeButtonText = charsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #150 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
		tparams.mNegativeButtonListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #153 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setOnKeyListener(android.content.yListener ylistener)
	{
		P.mOnKeyListener = ylistener;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #84  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setPositiveButton(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mPositiveButtonText = tparams.mContext.getText(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #141 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #159 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
		P.mPositiveButtonListener = icklistener;
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field AlertController$AlertParams P>
	//   11   21:aload_2         
	//   12   22:putfield        #162 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public AlertDialog$Builder setPositiveButton(CharSequence charsequence, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mPositiveButtonText = charsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #159 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
		tparams.mPositiveButtonListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #162 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setTitle(int i)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mTitle = tparams.mContext.getText(i);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #44  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #141 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #166 <Field CharSequence AlertController$AlertParams.mTitle>
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public AlertDialog$Builder setTitle(CharSequence charsequence)
	{
		P.mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #166 <Field CharSequence AlertController$AlertParams.mTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog show()
	{
		AlertDialog alertdialog = create();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method AlertDialog create()>
	//    2    4:astore_1        
		alertdialog.show();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #171 <Method void AlertDialog.show()>
		return alertdialog;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	private final tParams P;
	private final int mTheme;

	public AlertDialog$Builder(Context context)
	{
		this(context, AlertDialog.resolveDialogTheme(context, 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #18  <Method int AlertDialog.resolveDialogTheme(Context, int)>
	//    5    7:invokespecial   #21  <Method void AlertDialog$Builder(Context, int)>
	//    6   10:return          
	}

	public AlertDialog$Builder(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		P = new tParams(((Context) (new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)))));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class AlertController$AlertParams>
	//    4    8:dup             
	//    5    9:new             #31  <Class ContextThemeWrapper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #18  <Method int AlertDialog.resolveDialogTheme(Context, int)>
	//   11   19:invokespecial   #32  <Method void ContextThemeWrapper(Context, int)>
	//   12   22:invokespecial   #34  <Method void AlertController$AlertParams(Context)>
	//   13   25:putfield        #36  <Field AlertController$AlertParams P>
		mTheme = i;
	//   14   28:aload_0         
	//   15   29:iload_2         
	//   16   30:putfield        #38  <Field int mTheme>
	//   17   33:return          
	}
}
