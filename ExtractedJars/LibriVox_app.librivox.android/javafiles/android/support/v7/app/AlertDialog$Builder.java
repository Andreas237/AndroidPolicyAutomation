// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//			AlertDialog

public class AlertDialog$Builder
{

	public AlertDialog create()
	{
		AlertDialog alertdialog = new AlertDialog(P.mContext, mTheme);
	//    0    0:new             #12  <Class AlertDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field AlertController$AlertParams P>
	//    4    8:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field int mTheme>
	//    7   15:invokespecial   #41  <Method void AlertDialog(Context, int)>
	//    8   18:astore_1        
		P.apply(alertdialog.mAlert);
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field AlertController$AlertParams P>
	//   11   23:aload_1         
	//   12   24:getfield        #45  <Field AlertController AlertDialog.mAlert>
	//   13   27:invokevirtual   #49  <Method void AlertController$AlertParams.apply(AlertController)>
		alertdialog.setCancelable(P.mCancelable);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #32  <Field AlertController$AlertParams P>
	//   17   35:getfield        #53  <Field boolean AlertController$AlertParams.mCancelable>
	//   18   38:invokevirtual   #57  <Method void AlertDialog.setCancelable(boolean)>
		if(P.mCancelable)
	//*  19   41:aload_0         
	//*  20   42:getfield        #32  <Field AlertController$AlertParams P>
	//*  21   45:getfield        #53  <Field boolean AlertController$AlertParams.mCancelable>
	//*  22   48:ifeq            56
			alertdialog.setCanceledOnTouchOutside(true);
	//   23   51:aload_1         
	//   24   52:iconst_1        
	//   25   53:invokevirtual   #60  <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
		alertdialog.setOnCancelListener(P.mOnCancelListener);
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #32  <Field AlertController$AlertParams P>
	//   29   61:getfield        #64  <Field android.content.DialogInterface$OnCancelListener AlertController$AlertParams.mOnCancelListener>
	//   30   64:invokevirtual   #68  <Method void AlertDialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		alertdialog.setOnDismissListener(P.mOnDismissListener);
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #32  <Field AlertController$AlertParams P>
	//   34   72:getfield        #72  <Field android.content.DialogInterface$OnDismissListener AlertController$AlertParams.mOnDismissListener>
	//   35   75:invokevirtual   #76  <Method void AlertDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		if(P.mOnKeyListener != null)
	//*  36   78:aload_0         
	//*  37   79:getfield        #32  <Field AlertController$AlertParams P>
	//*  38   82:getfield        #80  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
	//*  39   85:ifnull          99
			alertdialog.setOnKeyListener(P.mOnKeyListener);
	//   40   88:aload_1         
	//   41   89:aload_0         
	//   42   90:getfield        #32  <Field AlertController$AlertParams P>
	//   43   93:getfield        #80  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
	//   44   96:invokevirtual   #84  <Method void AlertDialog.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
		return alertdialog;
	//   45   99:aload_1         
	//   46  100:areturn         
	}

	public Context getContext()
	{
		return P.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    3    7:areturn         
	}

	public AlertDialog$Builder setAdapter(ListAdapter listadapter, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mAdapter = listadapter;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #92  <Field ListAdapter AlertController$AlertParams.mAdapter>
		tparams.mOnClickListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setCancelable(boolean flag)
	{
		P.mCancelable = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:iload_1         
	//    3    5:putfield        #53  <Field boolean AlertController$AlertParams.mCancelable>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setCursor(Cursor cursor, android.content.ickListener icklistener, String s)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mCursor = cursor;
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:putfield        #103 <Field Cursor AlertController$AlertParams.mCursor>
		tparams.mLabelColumn = s;
	//    6   12:aload           4
	//    7   14:aload_3         
	//    8   15:putfield        #107 <Field String AlertController$AlertParams.mLabelColumn>
		tparams.mOnClickListener = icklistener;
	//    9   18:aload           4
	//   10   20:aload_2         
	//   11   21:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public AlertDialog$Builder setCustomTitle(View view)
	{
		P.mCustomTitleView = view;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #113 <Field View AlertController$AlertParams.mCustomTitleView>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setIcon(int i)
	{
		P.mIconId = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:iload_1         
	//    3    5:putfield        #118 <Field int AlertController$AlertParams.mIconId>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setIcon(Drawable drawable)
	{
		P.mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #123 <Field Drawable AlertController$AlertParams.mIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setIconAttribute(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #126 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void TypedValue()>
	//    3    7:astore_2        
		P.mContext.getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field AlertController$AlertParams P>
	//    6   12:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    7   15:invokevirtual   #133 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    8   18:iload_1         
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #139 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   12   24:pop             
		P.mIconId = typedvalue.resourceId;
	//   13   25:aload_0         
	//   14   26:getfield        #32  <Field AlertController$AlertParams P>
	//   15   29:aload_2         
	//   16   30:getfield        #142 <Field int TypedValue.resourceId>
	//   17   33:putfield        #118 <Field int AlertController$AlertParams.mIconId>
		return this;
	//   18   36:aload_0         
	//   19   37:areturn         
	}

	public AlertDialog$Builder setInverseBackgroundForced(boolean flag)
	{
		P.mForceInverseBackground = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:iload_1         
	//    3    5:putfield        #147 <Field boolean AlertController$AlertParams.mForceInverseBackground>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setItems(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mItems = tparams.mContext.getResources().getTextArray(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:invokevirtual   #154 <Method Resources Context.getResources()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #160 <Method CharSequence[] Resources.getTextArray(int)>
	//    9   17:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		P.mOnClickListener = icklistener;
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field AlertController$AlertParams P>
	//   12   24:aload_2         
	//   13   25:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public AlertDialog$Builder setItems(CharSequence acharsequence[], android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mItems = acharsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		tparams.mOnClickListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setMessage(int i)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mMessage = tparams.mContext.getText(i);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #170 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #174 <Field CharSequence AlertController$AlertParams.mMessage>
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public AlertDialog$Builder setMessage(CharSequence charsequence)
	{
		P.mMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #174 <Field CharSequence AlertController$AlertParams.mMessage>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setMultiChoiceItems(int i, boolean aflag[], android.content.ltiChoiceClickListener ltichoiceclicklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mItems = tparams.mContext.getResources().getTextArray(i);
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   13:invokevirtual   #154 <Method Resources Context.getResources()>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #160 <Method CharSequence[] Resources.getTextArray(int)>
	//    9   20:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		tparams = P;
	//   10   23:aload_0         
	//   11   24:getfield        #32  <Field AlertController$AlertParams P>
	//   12   27:astore          4
		tparams.mOnCheckboxClickListener = ltichoiceclicklistener;
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:putfield        #181 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
		tparams.mCheckedItems = aflag;
	//   16   35:aload           4
	//   17   37:aload_2         
	//   18   38:putfield        #185 <Field boolean[] AlertController$AlertParams.mCheckedItems>
		tparams.mIsMultiChoice = true;
	//   19   41:aload           4
	//   20   43:iconst_1        
	//   21   44:putfield        #188 <Field boolean AlertController$AlertParams.mIsMultiChoice>
		return this;
	//   22   47:aload_0         
	//   23   48:areturn         
	}

	public AlertDialog$Builder setMultiChoiceItems(Cursor cursor, String s, String s1, android.content.ltiChoiceClickListener ltichoiceclicklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          5
		tparams.mCursor = cursor;
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:putfield        #103 <Field Cursor AlertController$AlertParams.mCursor>
		tparams.mOnCheckboxClickListener = ltichoiceclicklistener;
	//    6   12:aload           5
	//    7   14:aload           4
	//    8   16:putfield        #181 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
		tparams.mIsCheckedColumn = s;
	//    9   19:aload           5
	//   10   21:aload_2         
	//   11   22:putfield        #192 <Field String AlertController$AlertParams.mIsCheckedColumn>
		tparams.mLabelColumn = s1;
	//   12   25:aload           5
	//   13   27:aload_3         
	//   14   28:putfield        #107 <Field String AlertController$AlertParams.mLabelColumn>
		tparams.mIsMultiChoice = true;
	//   15   31:aload           5
	//   16   33:iconst_1        
	//   17   34:putfield        #188 <Field boolean AlertController$AlertParams.mIsMultiChoice>
		return this;
	//   18   37:aload_0         
	//   19   38:areturn         
	}

	public AlertDialog$Builder setMultiChoiceItems(CharSequence acharsequence[], boolean aflag[], android.content.ltiChoiceClickListener ltichoiceclicklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mItems = acharsequence;
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		tparams.mOnCheckboxClickListener = ltichoiceclicklistener;
	//    6   12:aload           4
	//    7   14:aload_3         
	//    8   15:putfield        #181 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
		tparams.mCheckedItems = aflag;
	//    9   18:aload           4
	//   10   20:aload_2         
	//   11   21:putfield        #185 <Field boolean[] AlertController$AlertParams.mCheckedItems>
		tparams.mIsMultiChoice = true;
	//   12   24:aload           4
	//   13   26:iconst_1        
	//   14   27:putfield        #188 <Field boolean AlertController$AlertParams.mIsMultiChoice>
		return this;
	//   15   30:aload_0         
	//   16   31:areturn         
	}

	public AlertDialog$Builder setNegativeButton(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNegativeButtonText = tparams.mContext.getText(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #170 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #197 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
		P.mNegativeButtonListener = icklistener;
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field AlertController$AlertParams P>
	//   11   21:aload_2         
	//   12   22:putfield        #200 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public AlertDialog$Builder setNegativeButton(CharSequence charsequence, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNegativeButtonText = charsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #197 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
		tparams.mNegativeButtonListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #200 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setNegativeButtonIcon(Drawable drawable)
	{
		P.mNegativeButtonIcon = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #205 <Field Drawable AlertController$AlertParams.mNegativeButtonIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setNeutralButton(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNeutralButtonText = tparams.mContext.getText(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #170 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #209 <Field CharSequence AlertController$AlertParams.mNeutralButtonText>
		P.mNeutralButtonListener = icklistener;
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field AlertController$AlertParams P>
	//   11   21:aload_2         
	//   12   22:putfield        #212 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNeutralButtonListener>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public AlertDialog$Builder setNeutralButton(CharSequence charsequence, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mNeutralButtonText = charsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #209 <Field CharSequence AlertController$AlertParams.mNeutralButtonText>
		tparams.mNeutralButtonListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #212 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNeutralButtonListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setNeutralButtonIcon(Drawable drawable)
	{
		P.mNeutralButtonIcon = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #216 <Field Drawable AlertController$AlertParams.mNeutralButtonIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setOnCancelListener(android.content.ncelListener ncellistener)
	{
		P.mOnCancelListener = ncellistener;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #64  <Field android.content.DialogInterface$OnCancelListener AlertController$AlertParams.mOnCancelListener>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setOnDismissListener(android.content.smissListener smisslistener)
	{
		P.mOnDismissListener = smisslistener;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #72  <Field android.content.DialogInterface$OnDismissListener AlertController$AlertParams.mOnDismissListener>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setOnItemSelectedListener(android.widget.lectedListener lectedlistener)
	{
		P.mOnItemSelectedListener = lectedlistener;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #224 <Field android.widget.AdapterView$OnItemSelectedListener AlertController$AlertParams.mOnItemSelectedListener>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setOnKeyListener(android.content.yListener ylistener)
	{
		P.mOnKeyListener = ylistener;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #80  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setPositiveButton(int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mPositiveButtonText = tparams.mContext.getText(i);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #170 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #229 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
		P.mPositiveButtonListener = icklistener;
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field AlertController$AlertParams P>
	//   11   21:aload_2         
	//   12   22:putfield        #232 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
		return this;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public AlertDialog$Builder setPositiveButton(CharSequence charsequence, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_3        
		tparams.mPositiveButtonText = charsequence;
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:putfield        #229 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
		tparams.mPositiveButtonListener = icklistener;
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:putfield        #232 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public AlertDialog$Builder setPositiveButtonIcon(Drawable drawable)
	{
		P.mPositiveButtonIcon = drawable;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #236 <Field Drawable AlertController$AlertParams.mPositiveButtonIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setRecycleOnMeasureEnabled(boolean flag)
	{
		P.mRecycleOnMeasure = flag;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:iload_1         
	//    3    5:putfield        #240 <Field boolean AlertController$AlertParams.mRecycleOnMeasure>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setSingleChoiceItems(int i, int j, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mItems = tparams.mContext.getResources().getTextArray(i);
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   13:invokevirtual   #154 <Method Resources Context.getResources()>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #160 <Method CharSequence[] Resources.getTextArray(int)>
	//    9   20:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		tparams = P;
	//   10   23:aload_0         
	//   11   24:getfield        #32  <Field AlertController$AlertParams P>
	//   12   27:astore          4
		tparams.mOnClickListener = icklistener;
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		tparams.mCheckedItem = j;
	//   16   35:aload           4
	//   17   37:iload_2         
	//   18   38:putfield        #245 <Field int AlertController$AlertParams.mCheckedItem>
		tparams.mIsSingleChoice = true;
	//   19   41:aload           4
	//   20   43:iconst_1        
	//   21   44:putfield        #248 <Field boolean AlertController$AlertParams.mIsSingleChoice>
		return this;
	//   22   47:aload_0         
	//   23   48:areturn         
	}

	public AlertDialog$Builder setSingleChoiceItems(Cursor cursor, int i, String s, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          5
		tparams.mCursor = cursor;
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:putfield        #103 <Field Cursor AlertController$AlertParams.mCursor>
		tparams.mOnClickListener = icklistener;
	//    6   12:aload           5
	//    7   14:aload           4
	//    8   16:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		tparams.mCheckedItem = i;
	//    9   19:aload           5
	//   10   21:iload_2         
	//   11   22:putfield        #245 <Field int AlertController$AlertParams.mCheckedItem>
		tparams.mLabelColumn = s;
	//   12   25:aload           5
	//   13   27:aload_3         
	//   14   28:putfield        #107 <Field String AlertController$AlertParams.mLabelColumn>
		tparams.mIsSingleChoice = true;
	//   15   31:aload           5
	//   16   33:iconst_1        
	//   17   34:putfield        #248 <Field boolean AlertController$AlertParams.mIsSingleChoice>
		return this;
	//   18   37:aload_0         
	//   19   38:areturn         
	}

	public AlertDialog$Builder setSingleChoiceItems(ListAdapter listadapter, int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mAdapter = listadapter;
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:putfield        #92  <Field ListAdapter AlertController$AlertParams.mAdapter>
		tparams.mOnClickListener = icklistener;
	//    6   12:aload           4
	//    7   14:aload_3         
	//    8   15:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		tparams.mCheckedItem = i;
	//    9   18:aload           4
	//   10   20:iload_2         
	//   11   21:putfield        #245 <Field int AlertController$AlertParams.mCheckedItem>
		tparams.mIsSingleChoice = true;
	//   12   24:aload           4
	//   13   26:iconst_1        
	//   14   27:putfield        #248 <Field boolean AlertController$AlertParams.mIsSingleChoice>
		return this;
	//   15   30:aload_0         
	//   16   31:areturn         
	}

	public AlertDialog$Builder setSingleChoiceItems(CharSequence acharsequence[], int i, android.content.ickListener icklistener)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          4
		tparams.mItems = acharsequence;
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:putfield        #164 <Field CharSequence[] AlertController$AlertParams.mItems>
		tparams.mOnClickListener = icklistener;
	//    6   12:aload           4
	//    7   14:aload_3         
	//    8   15:putfield        #96  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
		tparams.mCheckedItem = i;
	//    9   18:aload           4
	//   10   20:iload_2         
	//   11   21:putfield        #245 <Field int AlertController$AlertParams.mCheckedItem>
		tparams.mIsSingleChoice = true;
	//   12   24:aload           4
	//   13   26:iconst_1        
	//   14   27:putfield        #248 <Field boolean AlertController$AlertParams.mIsSingleChoice>
		return this;
	//   15   30:aload_0         
	//   16   31:areturn         
	}

	public AlertDialog$Builder setTitle(int i)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mTitle = tparams.mContext.getText(i);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #40  <Field Context AlertController$AlertParams.mContext>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #170 <Method CharSequence Context.getText(int)>
	//    8   14:putfield        #255 <Field CharSequence AlertController$AlertParams.mTitle>
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public AlertDialog$Builder setTitle(CharSequence charsequence)
	{
		P.mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:aload_1         
	//    3    5:putfield        #255 <Field CharSequence AlertController$AlertParams.mTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AlertDialog$Builder setView(int i)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mView = null;
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:putfield        #259 <Field View AlertController$AlertParams.mView>
		tparams.mViewLayoutResId = i;
	//    6   10:aload_2         
	//    7   11:iload_1         
	//    8   12:putfield        #262 <Field int AlertController$AlertParams.mViewLayoutResId>
		tparams.mViewSpacingSpecified = false;
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:putfield        #265 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
		return this;
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public AlertDialog$Builder setView(View view)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore_2        
		tparams.mView = view;
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:putfield        #259 <Field View AlertController$AlertParams.mView>
		tparams.mViewLayoutResId = 0;
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:putfield        #262 <Field int AlertController$AlertParams.mViewLayoutResId>
		tparams.mViewSpacingSpecified = false;
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:putfield        #265 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
		return this;
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public AlertDialog$Builder setView(View view, int i, int j, int k, int l)
	{
		tParams tparams = P;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field AlertController$AlertParams P>
	//    2    4:astore          6
		tparams.mView = view;
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:putfield        #259 <Field View AlertController$AlertParams.mView>
		tparams.mViewLayoutResId = 0;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:putfield        #262 <Field int AlertController$AlertParams.mViewLayoutResId>
		tparams.mViewSpacingSpecified = true;
	//    9   18:aload           6
	//   10   20:iconst_1        
	//   11   21:putfield        #265 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
		tparams.mViewSpacingLeft = i;
	//   12   24:aload           6
	//   13   26:iload_2         
	//   14   27:putfield        #269 <Field int AlertController$AlertParams.mViewSpacingLeft>
		tparams.mViewSpacingTop = j;
	//   15   30:aload           6
	//   16   32:iload_3         
	//   17   33:putfield        #272 <Field int AlertController$AlertParams.mViewSpacingTop>
		tparams.mViewSpacingRight = k;
	//   18   36:aload           6
	//   19   38:iload           4
	//   20   40:putfield        #275 <Field int AlertController$AlertParams.mViewSpacingRight>
		tparams.mViewSpacingBottom = l;
	//   21   43:aload           6
	//   22   45:iload           5
	//   23   47:putfield        #278 <Field int AlertController$AlertParams.mViewSpacingBottom>
		return this;
	//   24   50:aload_0         
	//   25   51:areturn         
	}

	public AlertDialog show()
	{
		AlertDialog alertdialog = create();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method AlertDialog create()>
	//    2    4:astore_1        
		alertdialog.show();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #283 <Method void AlertDialog.show()>
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
	//    4    4:invokestatic    #16  <Method int AlertDialog.resolveDialogTheme(Context, int)>
	//    5    7:invokespecial   #19  <Method void AlertDialog$Builder(Context, int)>
	//    6   10:return          
	}

	public AlertDialog$Builder(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		P = new tParams(((Context) (new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)))));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class AlertController$AlertParams>
	//    4    8:dup             
	//    5    9:new             #27  <Class ContextThemeWrapper>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #16  <Method int AlertDialog.resolveDialogTheme(Context, int)>
	//   11   19:invokespecial   #28  <Method void ContextThemeWrapper(Context, int)>
	//   12   22:invokespecial   #30  <Method void AlertController$AlertParams(Context)>
	//   13   25:putfield        #32  <Field AlertController$AlertParams P>
		mTheme = i;
	//   14   28:aload_0         
	//   15   29:iload_2         
	//   16   30:putfield        #34  <Field int mTheme>
	//   17   33:return          
	}
}
