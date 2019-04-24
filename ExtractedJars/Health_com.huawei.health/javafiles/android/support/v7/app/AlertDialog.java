// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog, AlertController

public class AlertDialog extends AppCompatDialog
	implements DialogInterface
{
	public static class Builder
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

		public Builder setAdapter(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mAdapter = listadapter;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #97  <Field ListAdapter AlertController$AlertParams.mAdapter>
			P.mOnClickListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_2         
		//    7   13:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setCancelable(boolean flag)
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

		public Builder setCursor(Cursor cursor, android.content.DialogInterface.OnClickListener onclicklistener, String s)
		{
			P.mCursor = cursor;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #108 <Field Cursor AlertController$AlertParams.mCursor>
			P.mLabelColumn = s;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_3         
		//    7   13:putfield        #112 <Field String AlertController$AlertParams.mLabelColumn>
			P.mOnClickListener = onclicklistener;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:aload_2         
		//   11   21:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			return this;
		//   12   24:aload_0         
		//   13   25:areturn         
		}

		public Builder setCustomTitle(View view)
		{
			P.mCustomTitleView = view;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #119 <Field View AlertController$AlertParams.mCustomTitleView>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setIcon(int i)
		{
			P.mIconId = i;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:iload_1         
		//    3    5:putfield        #125 <Field int AlertController$AlertParams.mIconId>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setIcon(Drawable drawable)
		{
			P.mIcon = drawable;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #130 <Field Drawable AlertController$AlertParams.mIcon>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setIconAttribute(int i)
		{
			TypedValue typedvalue = new TypedValue();
		//    0    0:new             #134 <Class TypedValue>
		//    1    3:dup             
		//    2    4:invokespecial   #135 <Method void TypedValue()>
		//    3    7:astore_2        
			P.mContext.getTheme().resolveAttribute(i, typedvalue, true);
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    7   15:invokevirtual   #141 <Method android.content.res.Resources$Theme Context.getTheme()>
		//    8   18:iload_1         
		//    9   19:aload_2         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #147 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
		//   12   24:pop             
			P.mIconId = typedvalue.resourceId;
		//   13   25:aload_0         
		//   14   26:getfield        #36  <Field AlertController$AlertParams P>
		//   15   29:aload_2         
		//   16   30:getfield        #150 <Field int TypedValue.resourceId>
		//   17   33:putfield        #125 <Field int AlertController$AlertParams.mIconId>
			return this;
		//   18   36:aload_0         
		//   19   37:areturn         
		}

		public Builder setInverseBackgroundForced(boolean flag)
		{
			P.mForceInverseBackground = flag;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:iload_1         
		//    3    5:putfield        #155 <Field boolean AlertController$AlertParams.mForceInverseBackground>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setItems(int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mItems = P.mContext.getResources().getTextArray(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:invokevirtual   #163 <Method Resources Context.getResources()>
		//    6   14:iload_1         
		//    7   15:invokevirtual   #169 <Method CharSequence[] Resources.getTextArray(int)>
		//    8   18:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnClickListener = onclicklistener;
		//    9   21:aload_0         
		//   10   22:getfield        #36  <Field AlertController$AlertParams P>
		//   11   25:aload_2         
		//   12   26:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			return this;
		//   13   29:aload_0         
		//   14   30:areturn         
		}

		public Builder setItems(CharSequence acharsequence[], android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mItems = acharsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnClickListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_2         
		//    7   13:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setMessage(int i)
		{
			P.mMessage = P.mContext.getText(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #180 <Method CharSequence Context.getText(int)>
		//    7   15:putfield        #184 <Field CharSequence AlertController$AlertParams.mMessage>
			return this;
		//    8   18:aload_0         
		//    9   19:areturn         
		}

		public Builder setMessage(CharSequence charsequence)
		{
			P.mMessage = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #184 <Field CharSequence AlertController$AlertParams.mMessage>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setMultiChoiceItems(int i, boolean aflag[], android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
		{
			P.mItems = P.mContext.getResources().getTextArray(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:invokevirtual   #163 <Method Resources Context.getResources()>
		//    6   14:iload_1         
		//    7   15:invokevirtual   #169 <Method CharSequence[] Resources.getTextArray(int)>
		//    8   18:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnCheckboxClickListener = onmultichoiceclicklistener;
		//    9   21:aload_0         
		//   10   22:getfield        #36  <Field AlertController$AlertParams P>
		//   11   25:aload_3         
		//   12   26:putfield        #191 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
			P.mCheckedItems = aflag;
		//   13   29:aload_0         
		//   14   30:getfield        #36  <Field AlertController$AlertParams P>
		//   15   33:aload_2         
		//   16   34:putfield        #195 <Field boolean[] AlertController$AlertParams.mCheckedItems>
			P.mIsMultiChoice = true;
		//   17   37:aload_0         
		//   18   38:getfield        #36  <Field AlertController$AlertParams P>
		//   19   41:iconst_1        
		//   20   42:putfield        #198 <Field boolean AlertController$AlertParams.mIsMultiChoice>
			return this;
		//   21   45:aload_0         
		//   22   46:areturn         
		}

		public Builder setMultiChoiceItems(Cursor cursor, String s, String s1, android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
		{
			P.mCursor = cursor;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #108 <Field Cursor AlertController$AlertParams.mCursor>
			P.mOnCheckboxClickListener = onmultichoiceclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload           4
		//    7   14:putfield        #191 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
			P.mIsCheckedColumn = s;
		//    8   17:aload_0         
		//    9   18:getfield        #36  <Field AlertController$AlertParams P>
		//   10   21:aload_2         
		//   11   22:putfield        #202 <Field String AlertController$AlertParams.mIsCheckedColumn>
			P.mLabelColumn = s1;
		//   12   25:aload_0         
		//   13   26:getfield        #36  <Field AlertController$AlertParams P>
		//   14   29:aload_3         
		//   15   30:putfield        #112 <Field String AlertController$AlertParams.mLabelColumn>
			P.mIsMultiChoice = true;
		//   16   33:aload_0         
		//   17   34:getfield        #36  <Field AlertController$AlertParams P>
		//   18   37:iconst_1        
		//   19   38:putfield        #198 <Field boolean AlertController$AlertParams.mIsMultiChoice>
			return this;
		//   20   41:aload_0         
		//   21   42:areturn         
		}

		public Builder setMultiChoiceItems(CharSequence acharsequence[], boolean aflag[], android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
		{
			P.mItems = acharsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnCheckboxClickListener = onmultichoiceclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_3         
		//    7   13:putfield        #191 <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
			P.mCheckedItems = aflag;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:aload_2         
		//   11   21:putfield        #195 <Field boolean[] AlertController$AlertParams.mCheckedItems>
			P.mIsMultiChoice = true;
		//   12   24:aload_0         
		//   13   25:getfield        #36  <Field AlertController$AlertParams P>
		//   14   28:iconst_1        
		//   15   29:putfield        #198 <Field boolean AlertController$AlertParams.mIsMultiChoice>
			return this;
		//   16   32:aload_0         
		//   17   33:areturn         
		}

		public Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mNegativeButtonText = P.mContext.getText(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #180 <Method CharSequence Context.getText(int)>
		//    7   15:putfield        #207 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
			P.mNegativeButtonListener = onclicklistener;
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field AlertController$AlertParams P>
		//   10   22:aload_2         
		//   11   23:putfield        #210 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder setNegativeButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mNegativeButtonText = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #207 <Field CharSequence AlertController$AlertParams.mNegativeButtonText>
			P.mNegativeButtonListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_2         
		//    7   13:putfield        #210 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNegativeButtonListener>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setNeutralButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mNeutralButtonText = P.mContext.getText(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #180 <Method CharSequence Context.getText(int)>
		//    7   15:putfield        #215 <Field CharSequence AlertController$AlertParams.mNeutralButtonText>
			P.mNeutralButtonListener = onclicklistener;
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field AlertController$AlertParams P>
		//   10   22:aload_2         
		//   11   23:putfield        #218 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNeutralButtonListener>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder setNeutralButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mNeutralButtonText = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #215 <Field CharSequence AlertController$AlertParams.mNeutralButtonText>
			P.mNeutralButtonListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_2         
		//    7   13:putfield        #218 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mNeutralButtonListener>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
		{
			P.mOnCancelListener = oncancellistener;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #68  <Field android.content.DialogInterface$OnCancelListener AlertController$AlertParams.mOnCancelListener>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener ondismisslistener)
		{
			P.mOnDismissListener = ondismisslistener;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #76  <Field android.content.DialogInterface$OnDismissListener AlertController$AlertParams.mOnDismissListener>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
		{
			P.mOnItemSelectedListener = onitemselectedlistener;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #226 <Field android.widget.AdapterView$OnItemSelectedListener AlertController$AlertParams.mOnItemSelectedListener>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onkeylistener)
		{
			P.mOnKeyListener = onkeylistener;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #84  <Field android.content.DialogInterface$OnKeyListener AlertController$AlertParams.mOnKeyListener>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mPositiveButtonText = P.mContext.getText(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #180 <Method CharSequence Context.getText(int)>
		//    7   15:putfield        #231 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
			P.mPositiveButtonListener = onclicklistener;
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field AlertController$AlertParams P>
		//   10   22:aload_2         
		//   11   23:putfield        #234 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
			return this;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public Builder setPositiveButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mPositiveButtonText = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #231 <Field CharSequence AlertController$AlertParams.mPositiveButtonText>
			P.mPositiveButtonListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_2         
		//    7   13:putfield        #234 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mPositiveButtonListener>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setRecycleOnMeasureEnabled(boolean flag)
		{
			P.mRecycleOnMeasure = flag;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:iload_1         
		//    3    5:putfield        #242 <Field boolean AlertController$AlertParams.mRecycleOnMeasure>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setSingleChoiceItems(int i, int j, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mItems = P.mContext.getResources().getTextArray(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:invokevirtual   #163 <Method Resources Context.getResources()>
		//    6   14:iload_1         
		//    7   15:invokevirtual   #169 <Method CharSequence[] Resources.getTextArray(int)>
		//    8   18:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnClickListener = onclicklistener;
		//    9   21:aload_0         
		//   10   22:getfield        #36  <Field AlertController$AlertParams P>
		//   11   25:aload_3         
		//   12   26:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			P.mCheckedItem = j;
		//   13   29:aload_0         
		//   14   30:getfield        #36  <Field AlertController$AlertParams P>
		//   15   33:iload_2         
		//   16   34:putfield        #247 <Field int AlertController$AlertParams.mCheckedItem>
			P.mIsSingleChoice = true;
		//   17   37:aload_0         
		//   18   38:getfield        #36  <Field AlertController$AlertParams P>
		//   19   41:iconst_1        
		//   20   42:putfield        #250 <Field boolean AlertController$AlertParams.mIsSingleChoice>
			return this;
		//   21   45:aload_0         
		//   22   46:areturn         
		}

		public Builder setSingleChoiceItems(Cursor cursor, int i, String s, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mCursor = cursor;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #108 <Field Cursor AlertController$AlertParams.mCursor>
			P.mOnClickListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload           4
		//    7   14:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			P.mCheckedItem = i;
		//    8   17:aload_0         
		//    9   18:getfield        #36  <Field AlertController$AlertParams P>
		//   10   21:iload_2         
		//   11   22:putfield        #247 <Field int AlertController$AlertParams.mCheckedItem>
			P.mLabelColumn = s;
		//   12   25:aload_0         
		//   13   26:getfield        #36  <Field AlertController$AlertParams P>
		//   14   29:aload_3         
		//   15   30:putfield        #112 <Field String AlertController$AlertParams.mLabelColumn>
			P.mIsSingleChoice = true;
		//   16   33:aload_0         
		//   17   34:getfield        #36  <Field AlertController$AlertParams P>
		//   18   37:iconst_1        
		//   19   38:putfield        #250 <Field boolean AlertController$AlertParams.mIsSingleChoice>
			return this;
		//   20   41:aload_0         
		//   21   42:areturn         
		}

		public Builder setSingleChoiceItems(ListAdapter listadapter, int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mAdapter = listadapter;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #97  <Field ListAdapter AlertController$AlertParams.mAdapter>
			P.mOnClickListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_3         
		//    7   13:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			P.mCheckedItem = i;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:iload_2         
		//   11   21:putfield        #247 <Field int AlertController$AlertParams.mCheckedItem>
			P.mIsSingleChoice = true;
		//   12   24:aload_0         
		//   13   25:getfield        #36  <Field AlertController$AlertParams P>
		//   14   28:iconst_1        
		//   15   29:putfield        #250 <Field boolean AlertController$AlertParams.mIsSingleChoice>
			return this;
		//   16   32:aload_0         
		//   17   33:areturn         
		}

		public Builder setSingleChoiceItems(CharSequence acharsequence[], int i, android.content.DialogInterface.OnClickListener onclicklistener)
		{
			P.mItems = acharsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #173 <Field CharSequence[] AlertController$AlertParams.mItems>
			P.mOnClickListener = onclicklistener;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:aload_3         
		//    7   13:putfield        #101 <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
			P.mCheckedItem = i;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:iload_2         
		//   11   21:putfield        #247 <Field int AlertController$AlertParams.mCheckedItem>
			P.mIsSingleChoice = true;
		//   12   24:aload_0         
		//   13   25:getfield        #36  <Field AlertController$AlertParams P>
		//   14   28:iconst_1        
		//   15   29:putfield        #250 <Field boolean AlertController$AlertParams.mIsSingleChoice>
			return this;
		//   16   32:aload_0         
		//   17   33:areturn         
		}

		public Builder setTitle(int i)
		{
			P.mTitle = P.mContext.getText(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field AlertController$AlertParams P>
		//    4    8:getfield        #44  <Field Context AlertController$AlertParams.mContext>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #180 <Method CharSequence Context.getText(int)>
		//    7   15:putfield        #257 <Field CharSequence AlertController$AlertParams.mTitle>
			return this;
		//    8   18:aload_0         
		//    9   19:areturn         
		}

		public Builder setTitle(CharSequence charsequence)
		{
			P.mTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #257 <Field CharSequence AlertController$AlertParams.mTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setView(int i)
		{
			P.mView = null;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aconst_null     
		//    3    5:putfield        #261 <Field View AlertController$AlertParams.mView>
			P.mViewLayoutResId = i;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:iload_1         
		//    7   13:putfield        #264 <Field int AlertController$AlertParams.mViewLayoutResId>
			P.mViewSpacingSpecified = false;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:iconst_0        
		//   11   21:putfield        #267 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
			return this;
		//   12   24:aload_0         
		//   13   25:areturn         
		}

		public Builder setView(View view)
		{
			P.mView = view;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #261 <Field View AlertController$AlertParams.mView>
			P.mViewLayoutResId = 0;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:iconst_0        
		//    7   13:putfield        #264 <Field int AlertController$AlertParams.mViewLayoutResId>
			P.mViewSpacingSpecified = false;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:iconst_0        
		//   11   21:putfield        #267 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
			return this;
		//   12   24:aload_0         
		//   13   25:areturn         
		}

		public Builder setView(View view, int i, int j, int k, int l)
		{
			P.mView = view;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field AlertController$AlertParams P>
		//    2    4:aload_1         
		//    3    5:putfield        #261 <Field View AlertController$AlertParams.mView>
			P.mViewLayoutResId = 0;
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field AlertController$AlertParams P>
		//    6   12:iconst_0        
		//    7   13:putfield        #264 <Field int AlertController$AlertParams.mViewLayoutResId>
			P.mViewSpacingSpecified = true;
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field AlertController$AlertParams P>
		//   10   20:iconst_1        
		//   11   21:putfield        #267 <Field boolean AlertController$AlertParams.mViewSpacingSpecified>
			P.mViewSpacingLeft = i;
		//   12   24:aload_0         
		//   13   25:getfield        #36  <Field AlertController$AlertParams P>
		//   14   28:iload_2         
		//   15   29:putfield        #271 <Field int AlertController$AlertParams.mViewSpacingLeft>
			P.mViewSpacingTop = j;
		//   16   32:aload_0         
		//   17   33:getfield        #36  <Field AlertController$AlertParams P>
		//   18   36:iload_3         
		//   19   37:putfield        #274 <Field int AlertController$AlertParams.mViewSpacingTop>
			P.mViewSpacingRight = k;
		//   20   40:aload_0         
		//   21   41:getfield        #36  <Field AlertController$AlertParams P>
		//   22   44:iload           4
		//   23   46:putfield        #277 <Field int AlertController$AlertParams.mViewSpacingRight>
			P.mViewSpacingBottom = l;
		//   24   49:aload_0         
		//   25   50:getfield        #36  <Field AlertController$AlertParams P>
		//   26   53:iload           5
		//   27   55:putfield        #280 <Field int AlertController$AlertParams.mViewSpacingBottom>
			return this;
		//   28   58:aload_0         
		//   29   59:areturn         
		}

		public AlertDialog show()
		{
			AlertDialog alertdialog = create();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #283 <Method AlertDialog create()>
		//    2    4:astore_1        
			alertdialog.show();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #285 <Method void AlertDialog.show()>
			return alertdialog;
		//    5    9:aload_1         
		//    6   10:areturn         
		}

		private final AlertController.AlertParams P;
		private final int mTheme;

		public Builder(Context context)
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

		public Builder(Context context, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			P = new AlertController.AlertParams(((Context) (new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)))));
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


	protected AlertDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #22  <Method void AlertDialog(Context, int)>
	//    4    6:return          
	}

	protected AlertDialog(Context context, int i)
	{
		super(context, resolveDialogTheme(context, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #29  <Method int resolveDialogTheme(Context, int)>
	//    5    7:invokespecial   #30  <Method void AppCompatDialog(Context, int)>
		mAlert = new AlertController(getContext(), ((AppCompatDialog) (this)), getWindow());
	//    6   10:aload_0         
	//    7   11:new             #32  <Class AlertController>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokevirtual   #36  <Method Context getContext()>
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #40  <Method android.view.Window getWindow()>
	//   14   24:invokespecial   #43  <Method void AlertController(Context, AppCompatDialog, android.view.Window)>
	//   15   27:putfield        #45  <Field AlertController mAlert>
	//   16   30:return          
	}

	protected AlertDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #22  <Method void AlertDialog(Context, int)>
		setCancelable(flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #51  <Method void setCancelable(boolean)>
		setOnCancelListener(oncancellistener);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #55  <Method void setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   10   16:return          
	}

	static int resolveDialogTheme(Context context, int i)
	{
		if(i >= 0x1000000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #56  <Int 0x1000000>
	//*   2    3:icmplt          8
		{
			return i;
	//    3    6:iload_1         
	//    4    7:ireturn         
		} else
		{
			TypedValue typedvalue = new TypedValue();
	//    5    8:new             #58  <Class TypedValue>
	//    6   11:dup             
	//    7   12:invokespecial   #61  <Method void TypedValue()>
	//    8   15:astore_2        
			context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.alertDialogTheme, typedvalue, true);
	//    9   16:aload_0         
	//   10   17:invokevirtual   #67  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   11   20:getstatic       #72  <Field int android.support.v7.appcompat.R$attr.alertDialogTheme>
	//   12   23:aload_2         
	//   13   24:iconst_1        
	//   14   25:invokevirtual   #78  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   15   28:pop             
			return typedvalue.resourceId;
	//   16   29:aload_2         
	//   17   30:getfield        #81  <Field int TypedValue.resourceId>
	//   18   33:ireturn         
		}
	}

	public Button getButton(int i)
	{
		return mAlert.getButton(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #85  <Method Button AlertController.getButton(int)>
	//    4    8:areturn         
	}

	public ListView getListView()
	{
		return mAlert.getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:invokevirtual   #89  <Method ListView AlertController.getListView()>
	//    3    7:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method void AppCompatDialog.onCreate(Bundle)>
		mAlert.installContent();
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field AlertController mAlert>
	//    5    9:invokevirtual   #96  <Method void AlertController.installContent()>
	//    6   12:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(mAlert.onKeyDown(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AlertController mAlert>
	//*   2    4:iload_1         
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #100 <Method boolean AlertController.onKeyDown(int, KeyEvent)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		else
			return super.onKeyDown(i, keyevent);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #101 <Method boolean AppCompatDialog.onKeyDown(int, KeyEvent)>
	//   12   20:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(mAlert.onKeyUp(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AlertController mAlert>
	//*   2    4:iload_1         
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #104 <Method boolean AlertController.onKeyUp(int, KeyEvent)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		else
			return super.onKeyUp(i, keyevent);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #105 <Method boolean AppCompatDialog.onKeyUp(int, KeyEvent)>
	//   12   20:ireturn         
	}

	public void setButton(int i, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
	{
		mAlert.setButton(i, charsequence, onclicklistener, ((Message) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #110 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
	//    7   11:return          
	}

	public void setButton(int i, CharSequence charsequence, Message message)
	{
		mAlert.setButton(i, charsequence, ((android.content.DialogInterface.OnClickListener) (null)), message);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:aload_3         
	//    6    8:invokevirtual   #110 <Method void AlertController.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
	//    7   11:return          
	}

	void setButtonPanelLayoutHint(int i)
	{
		mAlert.setButtonPanelLayoutHint(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void AlertController.setButtonPanelLayoutHint(int)>
	//    4    8:return          
	}

	public void setCustomTitle(View view)
	{
		mAlert.setCustomTitle(view);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method void AlertController.setCustomTitle(View)>
	//    4    8:return          
	}

	public void setIcon(int i)
	{
		mAlert.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #122 <Method void AlertController.setIcon(int)>
	//    4    8:return          
	}

	public void setIcon(Drawable drawable)
	{
		mAlert.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method void AlertController.setIcon(Drawable)>
	//    4    8:return          
	}

	public void setIconAttribute(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #58  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void TypedValue()>
	//    3    7:astore_2        
		getContext().getTheme().resolveAttribute(i, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #36  <Method Context getContext()>
	//    6   12:invokevirtual   #67  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #78  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		mAlert.setIcon(typedvalue.resourceId);
	//   12   22:aload_0         
	//   13   23:getfield        #45  <Field AlertController mAlert>
	//   14   26:aload_2         
	//   15   27:getfield        #81  <Field int TypedValue.resourceId>
	//   16   30:invokevirtual   #122 <Method void AlertController.setIcon(int)>
	//   17   33:return          
	}

	public void setMessage(CharSequence charsequence)
	{
		mAlert.setMessage(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void AlertController.setMessage(CharSequence)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		super.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method void AppCompatDialog.setTitle(CharSequence)>
		mAlert.setTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field AlertController mAlert>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #134 <Method void AlertController.setTitle(CharSequence)>
	//    7   13:return          
	}

	public void setView(View view)
	{
		mAlert.setView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #137 <Method void AlertController.setView(View)>
	//    4    8:return          
	}

	public void setView(View view, int i, int j, int k, int l)
	{
		mAlert.setView(view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AlertController mAlert>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #140 <Method void AlertController.setView(View, int, int, int, int)>
	//    8   14:return          
	}

	static final int LAYOUT_HINT_NONE = 0;
	static final int LAYOUT_HINT_SIDE = 1;
	final AlertController mAlert;
}
