// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.*;
import android.telephony.SmsMessage;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmsBroadcastReceiver extends BroadcastReceiver
{

	SmsBroadcastReceiver(EditText edittext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BroadcastReceiver()>
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String ":\\s(\\d{6}).*Digits by Twitter">
	//    4    7:invokestatic    #22  <Method Pattern Pattern.compile(String)>
	//    5   10:putfield        #24  <Field Pattern patternConfirmationCode>
		editTextWeakReference = new WeakReference(((Object) (edittext)));
	//    6   13:aload_0         
	//    7   14:new             #26  <Class WeakReference>
	//    8   17:dup             
	//    9   18:aload_1         
	//   10   19:invokespecial   #29  <Method void WeakReference(Object)>
	//   11   22:putfield        #31  <Field WeakReference editTextWeakReference>
	//   12   25:return          
	}

	String getConfirmationCode(SmsMessage smsmessage)
	{
		smsmessage = ((SmsMessage) (smsmessage.getDisplayMessageBody()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method String SmsMessage.getDisplayMessageBody()>
	//    2    4:astore_1        
		if(smsmessage != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			smsmessage = ((SmsMessage) (patternConfirmationCode.matcher(((CharSequence) (smsmessage)))));
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Pattern patternConfirmationCode>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #44  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   17:astore_1        
			if(((Matcher) (smsmessage)).find())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #50  <Method boolean Matcher.find()>
	//*  12   22:ifeq            31
				return ((Matcher) (smsmessage)).group(1);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #54  <Method String Matcher.group(int)>
	//   16   30:areturn         
		}
		return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
	}

	String getConfirmationCode(SmsMessage asmsmessage[])
	{
		int j = asmsmessage.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          34
		{
			String s = getConfirmationCode(asmsmessage[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokevirtual   #57  <Method String getConfirmationCode(SmsMessage)>
	//   13   17:astore          4
			if(s != null)
	//*  14   19:aload           4
	//*  15   21:ifnull          27
				return s;
	//   16   24:aload           4
	//   17   26:areturn         
		}

	//   18   27:iload_2         
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:istore_2        
	//*  22   31:goto            5
		return null;
	//   23   34:aconst_null     
	//   24   35:areturn         
	}

	SmsMessage[] getMessagesFromIntent(Intent intent)
	{
		intent = ((Intent) ((Object[])intent.getSerializableExtra("pdus")));
	//    0    0:aload_1         
	//    1    1:ldc1            #61  <String "pdus">
	//    2    3:invokevirtual   #67  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    6:checkcast       #69  <Class Object[]>
	//    4    9:astore_1        
		int j = intent.length;
	//    5   10:aload_1         
	//    6   11:arraylength     
	//    7   12:istore_3        
		SmsMessage asmsmessage[] = new SmsMessage[j];
	//    8   13:iload_3         
	//    9   14:anewarray       SmsMessage[]
	//   10   17:astore          4
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:iload_3         
	//*  15   23:icmpge          46
			asmsmessage[i] = SmsMessage.createFromPdu((byte[])intent[i]);
	//   16   26:aload           4
	//   17   28:iload_2         
	//   18   29:aload_1         
	//   19   30:iload_2         
	//   20   31:aaload          
	//   21   32:checkcast       #71  <Class byte[]>
	//   22   35:invokestatic    #75  <Method SmsMessage SmsMessage.createFromPdu(byte[])>
	//   23   38:aastore         

	//   24   39:iload_2         
	//   25   40:iconst_1        
	//   26   41:iadd            
	//   27   42:istore_2        
	//*  28   43:goto            21
		return asmsmessage;
	//   29   46:aload           4
	//   30   48:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (getConfirmationCode(getMessagesFromIntent(intent))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #79  <Method SmsMessage[] getMessagesFromIntent(Intent)>
	//    4    6:invokevirtual   #81  <Method String getConfirmationCode(SmsMessage[])>
	//    5    9:astore_1        
		if(context != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          42
		{
			intent = ((Intent) ((EditText)editTextWeakReference.get()));
	//    8   14:aload_0         
	//    9   15:getfield        #31  <Field WeakReference editTextWeakReference>
	//   10   18:invokevirtual   #85  <Method Object WeakReference.get()>
	//   11   21:checkcast       #87  <Class EditText>
	//   12   24:astore_2        
			if(intent != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          42
			{
				((EditText) (intent)).setText(((CharSequence) (context)));
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #91  <Method void EditText.setText(CharSequence)>
				((EditText) (intent)).setSelection(((String) (context)).length());
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #97  <Method int String.length()>
	//   21   39:invokevirtual   #101 <Method void EditText.setSelection(int)>
			}
		}
	//   22   42:return          
	}

	final WeakReference editTextWeakReference;
	final Pattern patternConfirmationCode = Pattern.compile(":\\s(\\d{6}).*Digits by Twitter");
}
