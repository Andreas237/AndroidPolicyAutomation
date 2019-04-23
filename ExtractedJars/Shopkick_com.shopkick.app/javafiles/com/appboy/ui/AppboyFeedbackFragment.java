// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.appboy.Appboy;
import com.appboy.support.*;

public class AppboyFeedbackFragment extends Fragment
{
	public static final class FeedbackResult extends Enum
	{

		public static FeedbackResult valueOf(String s)
		{
			return (FeedbackResult)Enum.valueOf(com/appboy/ui/AppboyFeedbackFragment$FeedbackResult, s);
		//    0    0:ldc1            #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    4    9:areturn         
		}

		public static FeedbackResult[] values()
		{
			return (FeedbackResult[])((FeedbackResult []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.appboy.ui.AppboyFeedbackFragment$FeedbackResult_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppboyFeedbackFragment$FeedbackResult[]>
		//    3    9:areturn         
		}

		private static final FeedbackResult $VALUES[];
		public static final FeedbackResult CANCELLED;
		public static final FeedbackResult SUBMITTED;

		static 
		{
			SUBMITTED = new FeedbackResult("SUBMITTED", 0);
		//    0    0:new             #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "SUBMITTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
		//    5   10:putstatic       #22  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
			CANCELLED = new FeedbackResult("CANCELLED", 1);
		//    6   13:new             #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "CANCELLED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
		//   11   23:putstatic       #25  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
			$VALUES = (new FeedbackResult[] {
				SUBMITTED, CANCELLED
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FeedbackResult[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
		//*  23   45:return          
		}

		private FeedbackResult(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface IFeedbackFinishedListener
	{

		public abstract String beforeFeedbackSubmitted(String s);

		public abstract void onFeedbackFinished(FeedbackResult feedbackresult);
	}


	public AppboyFeedbackFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Fragment()>
	//    2    4:return          
	}

	private void clearData()
	{
		mEmailEditText.setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field EditText mEmailEditText>
	//    2    4:ldc1            #88  <String "">
	//    3    6:invokevirtual   #94  <Method void EditText.setText(CharSequence)>
		mMessageEditText.setText("");
	//    4    9:aload_0         
	//    5   10:getfield        #83  <Field EditText mMessageEditText>
	//    6   13:ldc1            #88  <String "">
	//    7   15:invokevirtual   #94  <Method void EditText.setText(CharSequence)>
		mIsBugCheckBox.setChecked(false);
	//    8   18:aload_0         
	//    9   19:getfield        #79  <Field CheckBox mIsBugCheckBox>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #100 <Method void CheckBox.setChecked(boolean)>
		mErrorMessageShown = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #55  <Field boolean mErrorMessageShown>
		mEmailEditText.setError(((CharSequence) (null)));
	//   15   31:aload_0         
	//   16   32:getfield        #86  <Field EditText mEmailEditText>
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
		mMessageEditText.setError(((CharSequence) (null)));
	//   19   39:aload_0         
	//   20   40:getfield        #83  <Field EditText mMessageEditText>
	//   21   43:aconst_null     
	//   22   44:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
	//   23   47:return          
	}

	private void displayEmailTextError(int i)
	{
		if(getActivity() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #109 <Method android.support.v4.app.FragmentActivity getActivity()>
	//*   2    4:ifnull          23
		{
			mEmailEditText.setError(((CharSequence) (getResources().getString(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field EditText mEmailEditText>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #113 <Method Resources getResources()>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #119 <Method String Resources.getString(int)>
	//    9   19:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
			return;
	//   10   22:return          
		} else
		{
			AppboyLogger.w(TAG, "Activity is null. Cannot set feedback form email error message");
	//   11   23:getstatic       #47  <Field String TAG>
	//   12   26:ldc1            #121 <String "Activity is null. Cannot set feedback form email error message">
	//   13   28:invokestatic    #125 <Method int AppboyLogger.w(String, String)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	private void displayMessageTextError(int i)
	{
		if(getActivity() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #109 <Method android.support.v4.app.FragmentActivity getActivity()>
	//*   2    4:ifnull          23
		{
			mMessageEditText.setError(((CharSequence) (getResources().getString(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field EditText mMessageEditText>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #113 <Method Resources getResources()>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #119 <Method String Resources.getString(int)>
	//    9   19:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
			return;
	//   10   22:return          
		} else
		{
			AppboyLogger.w(TAG, "Activity is null. Cannot set feedback form message error.");
	//   11   23:getstatic       #47  <Field String TAG>
	//   12   26:ldc1            #128 <String "Activity is null. Cannot set feedback form message error.">
	//   13   28:invokestatic    #125 <Method int AppboyLogger.w(String, String)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	private boolean ensureSendButton()
	{
		return validatedMessage() & validatedEmail();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method boolean validatedMessage()>
	//    2    4:aload_0         
	//    3    5:invokespecial   #134 <Method boolean validatedEmail()>
	//    4    8:iand            
	//    5    9:ireturn         
	}

	private void hideSoftKeyboard()
	{
		android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    2    4:astore_1        
		((Activity) (fragmentactivity)).getWindow().setSoftInputMode(mOriginalSoftInputMode);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #140 <Method Window Activity.getWindow()>
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field int mOriginalSoftInputMode>
	//    7   13:invokevirtual   #147 <Method void Window.setSoftInputMode(int)>
		if(((Activity) (fragmentactivity)).getCurrentFocus() != null)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #151 <Method View Activity.getCurrentFocus()>
	//*  10   20:ifnull          44
			((InputMethodManager)((Activity) (fragmentactivity)).getSystemService("input_method")).hideSoftInputFromWindow(((Activity) (fragmentactivity)).getCurrentFocus().getWindowToken(), 0);
	//   11   23:aload_1         
	//   12   24:ldc1            #153 <String "input_method">
	//   13   26:invokevirtual   #157 <Method Object Activity.getSystemService(String)>
	//   14   29:checkcast       #159 <Class InputMethodManager>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #151 <Method View Activity.getCurrentFocus()>
	//   17   36:invokevirtual   #165 <Method android.os.IBinder View.getWindowToken()>
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #169 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   20   43:pop             
	//   21   44:return          
	}

	private boolean validatedEmail()
	{
		Editable editable = mEmailEditText.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field EditText mEmailEditText>
	//    2    4:invokevirtual   #173 <Method Editable EditText.getText()>
	//    3    7:astore_3        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		boolean flag1;
		if(editable != null && !StringUtils.isNullOrBlank(((Object) (mEmailEditText.getText())).toString()) && ValidationUtils.isValidEmailAddress(((Object) (mEmailEditText.getText())).toString()))
	//*   6   10:aload_3         
	//*   7   11:ifnull          51
	//*   8   14:aload_0         
	//*   9   15:getfield        #86  <Field EditText mEmailEditText>
	//*  10   18:invokevirtual   #173 <Method Editable EditText.getText()>
	//*  11   21:invokevirtual   #179 <Method String Object.toString()>
	//*  12   24:invokestatic    #185 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   27:ifne            51
	//*  14   30:aload_0         
	//*  15   31:getfield        #86  <Field EditText mEmailEditText>
	//*  16   34:invokevirtual   #173 <Method Editable EditText.getText()>
	//*  17   37:invokevirtual   #179 <Method String Object.toString()>
	//*  18   40:invokestatic    #190 <Method boolean ValidationUtils.isValidEmailAddress(String)>
	//*  19   43:ifeq            51
			flag1 = true;
	//   20   46:iconst_1        
	//   21   47:istore_2        
		else
	//*  22   48:goto            53
			flag1 = false;
	//   23   51:iconst_0        
	//   24   52:istore_2        
		if(mEmailEditText.getText() == null || !StringUtils.isNullOrBlank(((Object) (mEmailEditText.getText())).toString()))
	//*  25   53:aload_0         
	//*  26   54:getfield        #86  <Field EditText mEmailEditText>
	//*  27   57:invokevirtual   #173 <Method Editable EditText.getText()>
	//*  28   60:ifnull          82
	//*  29   63:aload_0         
	//*  30   64:getfield        #86  <Field EditText mEmailEditText>
	//*  31   67:invokevirtual   #173 <Method Editable EditText.getText()>
	//*  32   70:invokevirtual   #179 <Method String Object.toString()>
	//*  33   73:invokestatic    #185 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  34   76:ifeq            82
	//*  35   79:goto            84
			flag = false;
	//   36   82:iconst_0        
	//   37   83:istore_1        
		if(flag1)
	//*  38   84:iload_2         
	//*  39   85:ifeq            98
		{
			mEmailEditText.setError(((CharSequence) (null)));
	//   40   88:aload_0         
	//   41   89:getfield        #86  <Field EditText mEmailEditText>
	//   42   92:aconst_null     
	//   43   93:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
			return flag1;
	//   44   96:iload_2         
	//   45   97:ireturn         
		}
		if(flag)
	//*  46   98:iload_1         
	//*  47   99:ifeq            111
		{
			displayEmailTextError(R.string.com_appboy_feedback_form_empty_email);
	//   48  102:aload_0         
	//   49  103:getstatic       #195 <Field int R$string.com_appboy_feedback_form_empty_email>
	//   50  106:invokespecial   #197 <Method void displayEmailTextError(int)>
			return flag1;
	//   51  109:iload_2         
	//   52  110:ireturn         
		} else
		{
			displayEmailTextError(R.string.com_appboy_feedback_form_invalid_email);
	//   53  111:aload_0         
	//   54  112:getstatic       #200 <Field int R$string.com_appboy_feedback_form_invalid_email>
	//   55  115:invokespecial   #197 <Method void displayEmailTextError(int)>
			return flag1;
	//   56  118:iload_2         
	//   57  119:ireturn         
		}
	}

	private boolean validatedMessage()
	{
		boolean flag;
		if(mMessageEditText.getText() != null && !StringUtils.isNullOrBlank(((Object) (mMessageEditText.getText())).toString()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field EditText mMessageEditText>
	//*   2    4:invokevirtual   #173 <Method Editable EditText.getText()>
	//*   3    7:ifnull          31
	//*   4   10:aload_0         
	//*   5   11:getfield        #83  <Field EditText mMessageEditText>
	//*   6   14:invokevirtual   #173 <Method Editable EditText.getText()>
	//*   7   17:invokevirtual   #179 <Method String Object.toString()>
	//*   8   20:invokestatic    #185 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   9   23:ifne            31
			flag = true;
	//   10   26:iconst_1        
	//   11   27:istore_1        
		else
	//*  12   28:goto            33
			flag = false;
	//   13   31:iconst_0        
	//   14   32:istore_1        
		if(flag)
	//*  15   33:iload_1         
	//*  16   34:ifeq            47
		{
			mMessageEditText.setError(((CharSequence) (null)));
	//   17   37:aload_0         
	//   18   38:getfield        #83  <Field EditText mMessageEditText>
	//   19   41:aconst_null     
	//   20   42:invokevirtual   #103 <Method void EditText.setError(CharSequence)>
			return flag;
	//   21   45:iload_1         
	//   22   46:ireturn         
		} else
		{
			displayMessageTextError(R.string.com_appboy_feedback_form_invalid_message);
	//   23   47:aload_0         
	//   24   48:getstatic       #203 <Field int R$string.com_appboy_feedback_form_invalid_message>
	//   25   51:invokespecial   #205 <Method void displayMessageTextError(int)>
			return flag;
	//   26   54:iload_1         
	//   27   55:ireturn         
		}
	}

	public EditText getEmailEditText()
	{
		return mEmailEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field EditText mEmailEditText>
	//    2    4:areturn         
	}

	public EditText getMessageEditText()
	{
		return mMessageEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field EditText mMessageEditText>
	//    2    4:areturn         
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void Fragment.onAttach(Context)>
		mSendButtonWatcher = new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				if(mErrorMessageShown)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//*   2    4:invokestatic    #27  <Method boolean AppboyFeedbackFragment.access$000(AppboyFeedbackFragment)>
			//*   3    7:ifeq            18
					ensureSendButton();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//    6   14:invokestatic    #30  <Method boolean AppboyFeedbackFragment.access$100(AppboyFeedbackFragment)>
			//    7   17:pop             
			//    8   18:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int i, int j, int k)
			{
			//    0    0:return          
			}

			final AppboyFeedbackFragment this$0;

			
			{
				this$0 = AppboyFeedbackFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedbackFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    3    5:aload_0         
	//    4    6:new             #6   <Class AppboyFeedbackFragment$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #214 <Method void AppboyFeedbackFragment$1(AppboyFeedbackFragment)>
	//    8   14:putfield        #216 <Field TextWatcher mSendButtonWatcher>
		mCancelListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				hideSoftKeyboard();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//    2    4:invokestatic    #26  <Method void AppboyFeedbackFragment.access$200(AppboyFeedbackFragment)>
				if(mFeedbackFinishedListener != null)
			//*   3    7:aload_0         
			//*   4    8:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//*   5   11:invokestatic    #30  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//*   6   14:ifnull          32
					mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.CANCELLED);
			//    7   17:aload_0         
			//    8   18:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//    9   21:invokestatic    #30  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//   10   24:getstatic       #36  <Field AppboyFeedbackFragment$FeedbackResult AppboyFeedbackFragment$FeedbackResult.CANCELLED>
			//   11   27:invokeinterface #42  <Method void AppboyFeedbackFragment$IFeedbackFinishedListener.onFeedbackFinished(AppboyFeedbackFragment$FeedbackResult)>
				clearData();
			//   12   32:aload_0         
			//   13   33:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   14   36:invokestatic    #45  <Method void AppboyFeedbackFragment.access$400(AppboyFeedbackFragment)>
			//   15   39:return          
			}

			final AppboyFeedbackFragment this$0;

			
			{
				this$0 = AppboyFeedbackFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedbackFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    9   17:aload_0         
	//   10   18:new             #8   <Class AppboyFeedbackFragment$2>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #217 <Method void AppboyFeedbackFragment$2(AppboyFeedbackFragment)>
	//   14   26:putfield        #219 <Field android.view.View$OnClickListener mCancelListener>
		mSendListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(ensureSendButton())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//*   2    4:invokestatic    #27  <Method boolean AppboyFeedbackFragment.access$100(AppboyFeedbackFragment)>
			//*   3    7:ifeq            133
				{
					hideSoftKeyboard();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//    6   14:invokestatic    #30  <Method void AppboyFeedbackFragment.access$200(AppboyFeedbackFragment)>
					boolean flag = mIsBugCheckBox.isChecked();
			//    7   17:aload_0         
			//    8   18:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//    9   21:invokestatic    #34  <Method CheckBox AppboyFeedbackFragment.access$500(AppboyFeedbackFragment)>
			//   10   24:invokevirtual   #40  <Method boolean CheckBox.isChecked()>
			//   11   27:istore_2        
					String s = ((Object) (mMessageEditText.getText())).toString();
			//   12   28:aload_0         
			//   13   29:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   14   32:invokestatic    #44  <Method EditText AppboyFeedbackFragment.access$600(AppboyFeedbackFragment)>
			//   15   35:invokevirtual   #50  <Method Editable EditText.getText()>
			//   16   38:invokevirtual   #54  <Method String Object.toString()>
			//   17   41:astore_3        
					String s1 = ((Object) (mEmailEditText.getText())).toString();
			//   18   42:aload_0         
			//   19   43:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   20   46:invokestatic    #57  <Method EditText AppboyFeedbackFragment.access$700(AppboyFeedbackFragment)>
			//   21   49:invokevirtual   #50  <Method Editable EditText.getText()>
			//   22   52:invokevirtual   #54  <Method String Object.toString()>
			//   23   55:astore          4
					view = ((View) (s));
			//   24   57:aload_3         
			//   25   58:astore_1        
					if(mFeedbackFinishedListener != null)
			//*  26   59:aload_0         
			//*  27   60:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//*  28   63:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//*  29   66:ifnull          83
						view = ((View) (mFeedbackFinishedListener.beforeFeedbackSubmitted(s)));
			//   30   69:aload_0         
			//   31   70:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   32   73:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//   33   76:aload_3         
			//   34   77:invokeinterface #67  <Method String AppboyFeedbackFragment$IFeedbackFinishedListener.beforeFeedbackSubmitted(String)>
			//   35   82:astore_1        
					Appboy.getInstance(((Context) (getActivity()))).submitFeedback(s1, ((String) (view)), flag);
			//   36   83:aload_0         
			//   37   84:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   38   87:invokevirtual   #71  <Method android.support.v4.app.FragmentActivity AppboyFeedbackFragment.getActivity()>
			//   39   90:invokestatic    #77  <Method Appboy Appboy.getInstance(Context)>
			//   40   93:aload           4
			//   41   95:aload_1         
			//   42   96:iload_2         
			//   43   97:invokevirtual   #81  <Method void Appboy.submitFeedback(String, String, boolean)>
					if(mFeedbackFinishedListener != null)
			//*  44  100:aload_0         
			//*  45  101:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//*  46  104:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//*  47  107:ifnull          125
						mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.SUBMITTED);
			//   48  110:aload_0         
			//   49  111:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   50  114:invokestatic    #61  <Method AppboyFeedbackFragment$IFeedbackFinishedListener AppboyFeedbackFragment.access$300(AppboyFeedbackFragment)>
			//   51  117:getstatic       #87  <Field AppboyFeedbackFragment$FeedbackResult AppboyFeedbackFragment$FeedbackResult.SUBMITTED>
			//   52  120:invokeinterface #91  <Method void AppboyFeedbackFragment$IFeedbackFinishedListener.onFeedbackFinished(AppboyFeedbackFragment$FeedbackResult)>
					clearData();
			//   53  125:aload_0         
			//   54  126:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   55  129:invokestatic    #94  <Method void AppboyFeedbackFragment.access$400(AppboyFeedbackFragment)>
					return;
			//   56  132:return          
				} else
				{
					mErrorMessageShown = true;
			//   57  133:aload_0         
			//   58  134:getfield        #17  <Field AppboyFeedbackFragment this$0>
			//   59  137:iconst_1        
			//   60  138:invokestatic    #98  <Method boolean AppboyFeedbackFragment.access$002(AppboyFeedbackFragment, boolean)>
			//   61  141:pop             
					return;
			//   62  142:return          
				}
			}

			final AppboyFeedbackFragment this$0;

			
			{
				this$0 = AppboyFeedbackFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedbackFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   15   29:aload_0         
	//   16   30:new             #10  <Class AppboyFeedbackFragment$3>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #220 <Method void AppboyFeedbackFragment$3(AppboyFeedbackFragment)>
	//   20   38:putfield        #222 <Field android.view.View$OnClickListener mSendListener>
		setRetainInstance(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #225 <Method void setRetainInstance(boolean)>
	//   24   46:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(R.layout.com_appboy_feedback, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:getstatic       #232 <Field int R$layout.com_appboy_feedback>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #238 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    9:astore_1        
		mCancelButton = (Button)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_cancel);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getstatic       #243 <Field int R$id.com_appboy_feedback_cancel>
	//    9   15:invokevirtual   #247 <Method View View.findViewById(int)>
	//   10   18:checkcast       #249 <Class Button>
	//   11   21:putfield        #251 <Field Button mCancelButton>
		mSendButton = (Button)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_send);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #254 <Field int R$id.com_appboy_feedback_send>
	//   15   29:invokevirtual   #247 <Method View View.findViewById(int)>
	//   16   32:checkcast       #249 <Class Button>
	//   17   35:putfield        #256 <Field Button mSendButton>
		mIsBugCheckBox = (CheckBox)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_is_bug);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getstatic       #259 <Field int R$id.com_appboy_feedback_is_bug>
	//   21   43:invokevirtual   #247 <Method View View.findViewById(int)>
	//   22   46:checkcast       #96  <Class CheckBox>
	//   23   49:putfield        #79  <Field CheckBox mIsBugCheckBox>
		mMessageEditText = (EditText)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_message);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getstatic       #262 <Field int R$id.com_appboy_feedback_message>
	//   27   57:invokevirtual   #247 <Method View View.findViewById(int)>
	//   28   60:checkcast       #90  <Class EditText>
	//   29   63:putfield        #83  <Field EditText mMessageEditText>
		mEmailEditText = (EditText)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_email);
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:getstatic       #265 <Field int R$id.com_appboy_feedback_email>
	//   33   71:invokevirtual   #247 <Method View View.findViewById(int)>
	//   34   74:checkcast       #90  <Class EditText>
	//   35   77:putfield        #86  <Field EditText mEmailEditText>
		mMessageEditText.addTextChangedListener(mSendButtonWatcher);
	//   36   80:aload_0         
	//   37   81:getfield        #83  <Field EditText mMessageEditText>
	//   38   84:aload_0         
	//   39   85:getfield        #216 <Field TextWatcher mSendButtonWatcher>
	//   40   88:invokevirtual   #269 <Method void EditText.addTextChangedListener(TextWatcher)>
		mEmailEditText.addTextChangedListener(mSendButtonWatcher);
	//   41   91:aload_0         
	//   42   92:getfield        #86  <Field EditText mEmailEditText>
	//   43   95:aload_0         
	//   44   96:getfield        #216 <Field TextWatcher mSendButtonWatcher>
	//   45   99:invokevirtual   #269 <Method void EditText.addTextChangedListener(TextWatcher)>
		mCancelButton.setOnClickListener(mCancelListener);
	//   46  102:aload_0         
	//   47  103:getfield        #251 <Field Button mCancelButton>
	//   48  106:aload_0         
	//   49  107:getfield        #219 <Field android.view.View$OnClickListener mCancelListener>
	//   50  110:invokevirtual   #273 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mSendButton.setOnClickListener(mSendListener);
	//   51  113:aload_0         
	//   52  114:getfield        #256 <Field Button mSendButton>
	//   53  117:aload_0         
	//   54  118:getfield        #222 <Field android.view.View$OnClickListener mSendListener>
	//   55  121:invokevirtual   #273 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		return ((View) (layoutinflater));
	//   56  124:aload_1         
	//   57  125:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #276 <Method void Fragment.onDestroyView()>
		mMessageEditText.removeTextChangedListener(mSendButtonWatcher);
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field EditText mMessageEditText>
	//    4    8:aload_0         
	//    5    9:getfield        #216 <Field TextWatcher mSendButtonWatcher>
	//    6   12:invokevirtual   #279 <Method void EditText.removeTextChangedListener(TextWatcher)>
		mEmailEditText.removeTextChangedListener(mSendButtonWatcher);
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field EditText mEmailEditText>
	//    9   19:aload_0         
	//   10   20:getfield        #216 <Field TextWatcher mSendButtonWatcher>
	//   11   23:invokevirtual   #279 <Method void EditText.removeTextChangedListener(TextWatcher)>
	//   12   26:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void Fragment.onResume()>
		Appboy.getInstance(((Context) (getActivity()))).logFeedbackDisplayed();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #109 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    4    8:invokestatic    #288 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:invokevirtual   #291 <Method void Appboy.logFeedbackDisplayed()>
		android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #109 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    8   18:astore_1        
		Window window = ((Activity) (fragmentactivity)).getWindow();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #140 <Method Window Activity.getWindow()>
	//   11   23:astore_2        
		mOriginalSoftInputMode = window.getAttributes().softInputMode;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #295 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   15   29:getfield        #300 <Field int android.view.WindowManager$LayoutParams.softInputMode>
	//   16   32:putfield        #142 <Field int mOriginalSoftInputMode>
		window.setSoftInputMode(16);
	//   17   35:aload_2         
	//   18   36:bipush          16
	//   19   38:invokevirtual   #147 <Method void Window.setSoftInputMode(int)>
		Appboy.getInstance(((Context) (fragmentactivity))).logFeedbackDisplayed();
	//   20   41:aload_1         
	//   21   42:invokestatic    #288 <Method Appboy Appboy.getInstance(Context)>
	//   22   45:invokevirtual   #291 <Method void Appboy.logFeedbackDisplayed()>
	//   23   48:return          
	}

	public void setFeedbackFinishedListener(IFeedbackFinishedListener ifeedbackfinishedlistener)
	{
		mFeedbackFinishedListener = ifeedbackfinishedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field AppboyFeedbackFragment$IFeedbackFinishedListener mFeedbackFinishedListener>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyFeedbackFragment);
	private Button mCancelButton;
	private android.view.View.OnClickListener mCancelListener;
	private EditText mEmailEditText;
	private boolean mErrorMessageShown;
	private IFeedbackFinishedListener mFeedbackFinishedListener;
	private CheckBox mIsBugCheckBox;
	private EditText mMessageEditText;
	private int mOriginalSoftInputMode;
	private Button mSendButton;
	private TextWatcher mSendButtonWatcher;
	private android.view.View.OnClickListener mSendListener;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyFeedbackFragment>
	//    1    2:invokestatic    #45  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #47  <Field String TAG>
	//*   3    8:return          
	}


/*
	static boolean access$000(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mErrorMessageShown;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean mErrorMessageShown>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(AppboyFeedbackFragment appboyfeedbackfragment, boolean flag)
	{
		appboyfeedbackfragment.mErrorMessageShown = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean mErrorMessageShown>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$100(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.ensureSendButton();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method boolean ensureSendButton()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		appboyfeedbackfragment.hideSoftKeyboard();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void hideSoftKeyboard()>
		return;
	//    2    4:return          
	}

*/


/*
	static IFeedbackFinishedListener access$300(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mFeedbackFinishedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field AppboyFeedbackFragment$IFeedbackFinishedListener mFeedbackFinishedListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		appboyfeedbackfragment.clearData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void clearData()>
		return;
	//    2    4:return          
	}

*/


/*
	static CheckBox access$500(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mIsBugCheckBox;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field CheckBox mIsBugCheckBox>
	//    2    4:areturn         
	}

*/


/*
	static EditText access$600(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mMessageEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field EditText mMessageEditText>
	//    2    4:areturn         
	}

*/


/*
	static EditText access$700(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mEmailEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field EditText mEmailEditText>
	//    2    4:areturn         
	}

*/
}
