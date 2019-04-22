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
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

public class AppboyFeedbackFragment extends Fragment
	implements TraceFieldInterface
{
	public static final class FeedbackResult extends Enum
	{

		public static FeedbackResult valueOf(String s)
		{
			return (FeedbackResult)Enum.valueOf(com/appboy/ui/AppboyFeedbackFragment$FeedbackResult, s);
		//    0    0:ldc1            #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    4    9:areturn         
		}

		public static FeedbackResult[] values()
		{
			return (FeedbackResult[])((FeedbackResult []) ($VALUES)).clone();
		//    0    0:getstatic       #28  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.ui.AppboyFeedbackFragment$FeedbackResult_3B_.clone()>
		//    2    6:checkcast       #39  <Class AppboyFeedbackFragment$FeedbackResult[]>
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
		//    2    4:ldc1            #17  <String "SUBMITTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
		//    5   10:putstatic       #23  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
			CANCELLED = new FeedbackResult("CANCELLED", 1);
		//    6   13:new             #2   <Class AppboyFeedbackFragment$FeedbackResult>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "CANCELLED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
		//   11   23:putstatic       #26  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
			$VALUES = (new FeedbackResult[] {
				SUBMITTED, CANCELLED
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FeedbackResult[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #23  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
		//*  23   45:return          
		}

		private FeedbackResult(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
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
	//    1    1:invokespecial   #57  <Method void Fragment()>
	//    2    4:return          
	}

	private void clearData()
	{
		mEmailEditText.setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field EditText mEmailEditText>
	//    2    4:ldc1            #94  <String "">
	//    3    6:invokevirtual   #100 <Method void EditText.setText(CharSequence)>
		mMessageEditText.setText("");
	//    4    9:aload_0         
	//    5   10:getfield        #89  <Field EditText mMessageEditText>
	//    6   13:ldc1            #94  <String "">
	//    7   15:invokevirtual   #100 <Method void EditText.setText(CharSequence)>
		mIsBugCheckBox.setChecked(false);
	//    8   18:aload_0         
	//    9   19:getfield        #85  <Field CheckBox mIsBugCheckBox>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #106 <Method void CheckBox.setChecked(boolean)>
		mErrorMessageShown = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #61  <Field boolean mErrorMessageShown>
		mEmailEditText.setError(((CharSequence) (null)));
	//   15   31:aload_0         
	//   16   32:getfield        #92  <Field EditText mEmailEditText>
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
		mMessageEditText.setError(((CharSequence) (null)));
	//   19   39:aload_0         
	//   20   40:getfield        #89  <Field EditText mMessageEditText>
	//   21   43:aconst_null     
	//   22   44:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
	//   23   47:return          
	}

	private void displayEmailTextError(int i)
	{
		if(getActivity() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method android.support.v4.app.FragmentActivity getActivity()>
	//*   2    4:ifnull          23
		{
			mEmailEditText.setError(((CharSequence) (getResources().getString(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field EditText mEmailEditText>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #119 <Method Resources getResources()>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #125 <Method String Resources.getString(int)>
	//    9   19:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
			return;
	//   10   22:return          
		} else
		{
			AppboyLogger.w(TAG, "Activity is null. Cannot set feedback form email error message");
	//   11   23:getstatic       #53  <Field String TAG>
	//   12   26:ldc1            #127 <String "Activity is null. Cannot set feedback form email error message">
	//   13   28:invokestatic    #131 <Method int AppboyLogger.w(String, String)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	private void displayMessageTextError(int i)
	{
		if(getActivity() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method android.support.v4.app.FragmentActivity getActivity()>
	//*   2    4:ifnull          23
		{
			mMessageEditText.setError(((CharSequence) (getResources().getString(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field EditText mMessageEditText>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #119 <Method Resources getResources()>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #125 <Method String Resources.getString(int)>
	//    9   19:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
			return;
	//   10   22:return          
		} else
		{
			AppboyLogger.w(TAG, "Activity is null. Cannot set feedback form message error.");
	//   11   23:getstatic       #53  <Field String TAG>
	//   12   26:ldc1            #134 <String "Activity is null. Cannot set feedback form message error.">
	//   13   28:invokestatic    #131 <Method int AppboyLogger.w(String, String)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	private boolean ensureSendButton()
	{
		return validatedMessage() & validatedEmail();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method boolean validatedMessage()>
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method boolean validatedEmail()>
	//    4    8:iand            
	//    5    9:ireturn         
	}

	private void hideSoftKeyboard()
	{
		android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    2    4:astore_1        
		((Activity) (fragmentactivity)).getWindow().setSoftInputMode(mOriginalSoftInputMode);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #146 <Method Window Activity.getWindow()>
	//    5    9:aload_0         
	//    6   10:getfield        #148 <Field int mOriginalSoftInputMode>
	//    7   13:invokevirtual   #153 <Method void Window.setSoftInputMode(int)>
		if(((Activity) (fragmentactivity)).getCurrentFocus() != null)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #157 <Method View Activity.getCurrentFocus()>
	//*  10   20:ifnull          44
			((InputMethodManager)((Activity) (fragmentactivity)).getSystemService("input_method")).hideSoftInputFromWindow(((Activity) (fragmentactivity)).getCurrentFocus().getWindowToken(), 0);
	//   11   23:aload_1         
	//   12   24:ldc1            #159 <String "input_method">
	//   13   26:invokevirtual   #163 <Method Object Activity.getSystemService(String)>
	//   14   29:checkcast       #165 <Class InputMethodManager>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #157 <Method View Activity.getCurrentFocus()>
	//   17   36:invokevirtual   #171 <Method android.os.IBinder View.getWindowToken()>
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #175 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   20   43:pop             
	//   21   44:return          
	}

	private boolean validatedEmail()
	{
		Editable editable = mEmailEditText.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field EditText mEmailEditText>
	//    2    4:invokevirtual   #179 <Method Editable EditText.getText()>
	//    3    7:astore_3        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		boolean flag1;
		if(editable != null && !StringUtils.isNullOrBlank(((Object) (mEmailEditText.getText())).toString()) && ValidationUtils.isValidEmailAddress(((Object) (mEmailEditText.getText())).toString()))
	//*   6   10:aload_3         
	//*   7   11:ifnull          51
	//*   8   14:aload_0         
	//*   9   15:getfield        #92  <Field EditText mEmailEditText>
	//*  10   18:invokevirtual   #179 <Method Editable EditText.getText()>
	//*  11   21:invokevirtual   #185 <Method String Object.toString()>
	//*  12   24:invokestatic    #191 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   27:ifne            51
	//*  14   30:aload_0         
	//*  15   31:getfield        #92  <Field EditText mEmailEditText>
	//*  16   34:invokevirtual   #179 <Method Editable EditText.getText()>
	//*  17   37:invokevirtual   #185 <Method String Object.toString()>
	//*  18   40:invokestatic    #196 <Method boolean ValidationUtils.isValidEmailAddress(String)>
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
	//*  26   54:getfield        #92  <Field EditText mEmailEditText>
	//*  27   57:invokevirtual   #179 <Method Editable EditText.getText()>
	//*  28   60:ifnull          82
	//*  29   63:aload_0         
	//*  30   64:getfield        #92  <Field EditText mEmailEditText>
	//*  31   67:invokevirtual   #179 <Method Editable EditText.getText()>
	//*  32   70:invokevirtual   #185 <Method String Object.toString()>
	//*  33   73:invokestatic    #191 <Method boolean StringUtils.isNullOrBlank(String)>
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
	//   41   89:getfield        #92  <Field EditText mEmailEditText>
	//   42   92:aconst_null     
	//   43   93:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
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
	//   49  103:getstatic       #201 <Field int R$string.com_appboy_feedback_form_empty_email>
	//   50  106:invokespecial   #203 <Method void displayEmailTextError(int)>
			return flag1;
	//   51  109:iload_2         
	//   52  110:ireturn         
		} else
		{
			displayEmailTextError(R.string.com_appboy_feedback_form_invalid_email);
	//   53  111:aload_0         
	//   54  112:getstatic       #206 <Field int R$string.com_appboy_feedback_form_invalid_email>
	//   55  115:invokespecial   #203 <Method void displayEmailTextError(int)>
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
	//*   1    1:getfield        #89  <Field EditText mMessageEditText>
	//*   2    4:invokevirtual   #179 <Method Editable EditText.getText()>
	//*   3    7:ifnull          31
	//*   4   10:aload_0         
	//*   5   11:getfield        #89  <Field EditText mMessageEditText>
	//*   6   14:invokevirtual   #179 <Method Editable EditText.getText()>
	//*   7   17:invokevirtual   #185 <Method String Object.toString()>
	//*   8   20:invokestatic    #191 <Method boolean StringUtils.isNullOrBlank(String)>
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
	//   18   38:getfield        #89  <Field EditText mMessageEditText>
	//   19   41:aconst_null     
	//   20   42:invokevirtual   #109 <Method void EditText.setError(CharSequence)>
			return flag;
	//   21   45:iload_1         
	//   22   46:ireturn         
		} else
		{
			displayMessageTextError(R.string.com_appboy_feedback_form_invalid_message);
	//   23   47:aload_0         
	//   24   48:getstatic       #209 <Field int R$string.com_appboy_feedback_form_invalid_message>
	//   25   51:invokespecial   #211 <Method void displayMessageTextError(int)>
			return flag;
	//   26   54:iload_1         
	//   27   55:ireturn         
		}
	}

	public EditText getEmailEditText()
	{
		return mEmailEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field EditText mEmailEditText>
	//    2    4:areturn         
	}

	public EditText getMessageEditText()
	{
		return mMessageEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field EditText mMessageEditText>
	//    2    4:areturn         
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #218 <Method void Fragment.onAttach(Context)>
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
	//    4    6:new             #8   <Class AppboyFeedbackFragment$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #220 <Method void AppboyFeedbackFragment$1(AppboyFeedbackFragment)>
	//    8   14:putfield        #222 <Field TextWatcher mSendButtonWatcher>
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
	//   10   18:new             #10  <Class AppboyFeedbackFragment$2>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #223 <Method void AppboyFeedbackFragment$2(AppboyFeedbackFragment)>
	//   14   26:putfield        #225 <Field android.view.View$OnClickListener mCancelListener>
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
	//   16   30:new             #12  <Class AppboyFeedbackFragment$3>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #226 <Method void AppboyFeedbackFragment$3(AppboyFeedbackFragment)>
	//   20   38:putfield        #228 <Field android.view.View$OnClickListener mSendListener>
		setRetainInstance(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokevirtual   #231 <Method void setRetainInstance(boolean)>
	//   24   46:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyFeedbackFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field Trace _nr_trace>
	//    2    4:ldc1            #239 <String "AppboyFeedbackFragment#onCreateView">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #245 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyFeedbackFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #239 <String "AppboyFeedbackFragment#onCreateView">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #245 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(R.layout.com_appboy_feedback, viewgroup, false)));
	//   10   20:aload_1         
	//   11   21:getstatic       #250 <Field int R$layout.com_appboy_feedback>
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #256 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   15   29:astore_1        
		mCancelButton = (Button)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_cancel);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getstatic       #261 <Field int R$id.com_appboy_feedback_cancel>
	//   19   35:invokevirtual   #265 <Method View View.findViewById(int)>
	//   20   38:checkcast       #267 <Class Button>
	//   21   41:putfield        #269 <Field Button mCancelButton>
		mSendButton = (Button)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_send);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getstatic       #272 <Field int R$id.com_appboy_feedback_send>
	//   25   49:invokevirtual   #265 <Method View View.findViewById(int)>
	//   26   52:checkcast       #267 <Class Button>
	//   27   55:putfield        #274 <Field Button mSendButton>
		mIsBugCheckBox = (CheckBox)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_is_bug);
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:getstatic       #277 <Field int R$id.com_appboy_feedback_is_bug>
	//   31   63:invokevirtual   #265 <Method View View.findViewById(int)>
	//   32   66:checkcast       #102 <Class CheckBox>
	//   33   69:putfield        #85  <Field CheckBox mIsBugCheckBox>
		mMessageEditText = (EditText)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_message);
	//   34   72:aload_0         
	//   35   73:aload_1         
	//   36   74:getstatic       #280 <Field int R$id.com_appboy_feedback_message>
	//   37   77:invokevirtual   #265 <Method View View.findViewById(int)>
	//   38   80:checkcast       #96  <Class EditText>
	//   39   83:putfield        #89  <Field EditText mMessageEditText>
		mEmailEditText = (EditText)((View) (layoutinflater)).findViewById(R.id.com_appboy_feedback_email);
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:getstatic       #283 <Field int R$id.com_appboy_feedback_email>
	//   43   91:invokevirtual   #265 <Method View View.findViewById(int)>
	//   44   94:checkcast       #96  <Class EditText>
	//   45   97:putfield        #92  <Field EditText mEmailEditText>
		mMessageEditText.addTextChangedListener(mSendButtonWatcher);
	//   46  100:aload_0         
	//   47  101:getfield        #89  <Field EditText mMessageEditText>
	//   48  104:aload_0         
	//   49  105:getfield        #222 <Field TextWatcher mSendButtonWatcher>
	//   50  108:invokevirtual   #287 <Method void EditText.addTextChangedListener(TextWatcher)>
		mEmailEditText.addTextChangedListener(mSendButtonWatcher);
	//   51  111:aload_0         
	//   52  112:getfield        #92  <Field EditText mEmailEditText>
	//   53  115:aload_0         
	//   54  116:getfield        #222 <Field TextWatcher mSendButtonWatcher>
	//   55  119:invokevirtual   #287 <Method void EditText.addTextChangedListener(TextWatcher)>
		viewgroup = ((ViewGroup) (mCancelButton));
	//   56  122:aload_0         
	//   57  123:getfield        #269 <Field Button mCancelButton>
	//   58  126:astore_2        
		bundle = ((Bundle) (mCancelListener));
	//   59  127:aload_0         
	//   60  128:getfield        #225 <Field android.view.View$OnClickListener mCancelListener>
	//   61  131:astore_3        
		if(!(viewgroup instanceof View))
	//*  62  132:aload_2         
	//*  63  133:instanceof      #167 <Class View>
	//*  64  136:ifne            147
			((Button) (viewgroup)).setOnClickListener(((android.view.View.OnClickListener) (bundle)));
	//   65  139:aload_2         
	//   66  140:aload_3         
	//   67  141:invokevirtual   #291 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  68  144:goto            155
			ViewInstrumentation.setOnClickListener((View)viewgroup, ((android.view.View.OnClickListener) (bundle)));
	//   69  147:aload_2         
	//   70  148:checkcast       #167 <Class View>
	//   71  151:aload_3         
	//   72  152:invokestatic    #296 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		viewgroup = ((ViewGroup) (mSendButton));
	//   73  155:aload_0         
	//   74  156:getfield        #274 <Field Button mSendButton>
	//   75  159:astore_2        
		bundle = ((Bundle) (mSendListener));
	//   76  160:aload_0         
	//   77  161:getfield        #228 <Field android.view.View$OnClickListener mSendListener>
	//   78  164:astore_3        
		if(!(viewgroup instanceof View))
	//*  79  165:aload_2         
	//*  80  166:instanceof      #167 <Class View>
	//*  81  169:ifne            180
			((Button) (viewgroup)).setOnClickListener(((android.view.View.OnClickListener) (bundle)));
	//   82  172:aload_2         
	//   83  173:aload_3         
	//   84  174:invokevirtual   #291 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  85  177:goto            188
			ViewInstrumentation.setOnClickListener((View)viewgroup, ((android.view.View.OnClickListener) (bundle)));
	//   86  180:aload_2         
	//   87  181:checkcast       #167 <Class View>
	//   88  184:aload_3         
	//   89  185:invokestatic    #296 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		TraceMachine.exitMethod();
	//   90  188:invokestatic    #299 <Method void TraceMachine.exitMethod()>
		return ((View) (layoutinflater));
	//   91  191:aload_1         
	//   92  192:areturn         
		bundle;
	//   93  193:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//*  94  194:goto            13
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void Fragment.onDestroyView()>
		mMessageEditText.removeTextChangedListener(mSendButtonWatcher);
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field EditText mMessageEditText>
	//    4    8:aload_0         
	//    5    9:getfield        #222 <Field TextWatcher mSendButtonWatcher>
	//    6   12:invokevirtual   #305 <Method void EditText.removeTextChangedListener(TextWatcher)>
		mEmailEditText.removeTextChangedListener(mSendButtonWatcher);
	//    7   15:aload_0         
	//    8   16:getfield        #92  <Field EditText mEmailEditText>
	//    9   19:aload_0         
	//   10   20:getfield        #222 <Field TextWatcher mSendButtonWatcher>
	//   11   23:invokevirtual   #305 <Method void EditText.removeTextChangedListener(TextWatcher)>
	//   12   26:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #308 <Method void Fragment.onResume()>
		Appboy.getInstance(((Context) (getActivity()))).logFeedbackDisplayed();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    4    8:invokestatic    #314 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:invokevirtual   #317 <Method void Appboy.logFeedbackDisplayed()>
		android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #115 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    8   18:astore_1        
		Window window = ((Activity) (fragmentactivity)).getWindow();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #146 <Method Window Activity.getWindow()>
	//   11   23:astore_2        
		mOriginalSoftInputMode = window.getAttributes().softInputMode;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #321 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   15   29:getfield        #326 <Field int android.view.WindowManager$LayoutParams.softInputMode>
	//   16   32:putfield        #148 <Field int mOriginalSoftInputMode>
		window.setSoftInputMode(16);
	//   17   35:aload_2         
	//   18   36:bipush          16
	//   19   38:invokevirtual   #153 <Method void Window.setSoftInputMode(int)>
		Appboy.getInstance(((Context) (fragmentactivity))).logFeedbackDisplayed();
	//   20   41:aload_1         
	//   21   42:invokestatic    #314 <Method Appboy Appboy.getInstance(Context)>
	//   22   45:invokevirtual   #317 <Method void Appboy.logFeedbackDisplayed()>
	//   23   48:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method void Fragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #334 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #338 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #341 <Method void Fragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #334 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #344 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void setFeedbackFinishedListener(IFeedbackFinishedListener ifeedbackfinishedlistener)
	{
		mFeedbackFinishedListener = ifeedbackfinishedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field AppboyFeedbackFragment$IFeedbackFinishedListener mFeedbackFinishedListener>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyFeedbackFragment);
	public Trace _nr_trace;
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
	//    1    2:invokestatic    #51  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #53  <Field String TAG>
	//*   3    8:return          
	}


/*
	static boolean access$000(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mErrorMessageShown;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mErrorMessageShown>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(AppboyFeedbackFragment appboyfeedbackfragment, boolean flag)
	{
		appboyfeedbackfragment.mErrorMessageShown = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean mErrorMessageShown>
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
	//    1    1:invokespecial   #68  <Method boolean ensureSendButton()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		appboyfeedbackfragment.hideSoftKeyboard();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void hideSoftKeyboard()>
		return;
	//    2    4:return          
	}

*/


/*
	static IFeedbackFinishedListener access$300(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mFeedbackFinishedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AppboyFeedbackFragment$IFeedbackFinishedListener mFeedbackFinishedListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		appboyfeedbackfragment.clearData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void clearData()>
		return;
	//    2    4:return          
	}

*/


/*
	static CheckBox access$500(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mIsBugCheckBox;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field CheckBox mIsBugCheckBox>
	//    2    4:areturn         
	}

*/


/*
	static EditText access$600(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mMessageEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field EditText mMessageEditText>
	//    2    4:areturn         
	}

*/


/*
	static EditText access$700(AppboyFeedbackFragment appboyfeedbackfragment)
	{
		return appboyfeedbackfragment.mEmailEditText;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field EditText mEmailEditText>
	//    2    4:areturn         
	}

*/
}
