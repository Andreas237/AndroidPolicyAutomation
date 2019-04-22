// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import io.fabric.sdk.android.services.concurrency.AsyncTask;

// Referenced classes of package com.digits.sdk.android:
//			PhoneNumberUtils, PhoneNumber

class PhoneNumberTask extends AsyncTask
{
	static interface Listener
	{

		public abstract void onLoadComplete(PhoneNumber phonenumber);
	}


	protected PhoneNumberTask(PhoneNumberUtils phonenumberutils, Listener listener1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AsyncTask()>
		if(phonenumberutils != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          25
		{
			listener = listener1;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #21  <Field PhoneNumberTask$Listener listener>
			phoneNumberUtils = phonenumberutils;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #23  <Field PhoneNumberUtils phoneNumberUtils>
			providedPhoneNumber = "";
	//   10   18:aload_0         
	//   11   19:ldc1            #25  <String "">
	//   12   21:putfield        #27  <Field String providedPhoneNumber>
			return;
	//   13   24:return          
		} else
		{
			throw new NullPointerException("phoneNumberUtils can't be null");
	//   14   25:new             #29  <Class NullPointerException>
	//   15   28:dup             
	//   16   29:ldc1            #31  <String "phoneNumberUtils can't be null">
	//   17   31:invokespecial   #34  <Method void NullPointerException(String)>
	//   18   34:athrow          
		}
	}

	protected PhoneNumberTask(PhoneNumberUtils phonenumberutils, String s, Listener listener1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AsyncTask()>
		if(phonenumberutils != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          24
		{
			listener = listener1;
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:putfield        #21  <Field PhoneNumberTask$Listener listener>
			phoneNumberUtils = phonenumberutils;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #23  <Field PhoneNumberUtils phoneNumberUtils>
			providedPhoneNumber = s;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #27  <Field String providedPhoneNumber>
			return;
	//   13   23:return          
		} else
		{
			throw new NullPointerException("phoneNumberUtils can't be null");
	//   14   24:new             #29  <Class NullPointerException>
	//   15   27:dup             
	//   16   28:ldc1            #31  <String "phoneNumberUtils can't be null">
	//   17   30:invokespecial   #34  <Method void NullPointerException(String)>
	//   18   33:athrow          
		}
	}

	protected transient PhoneNumber doInBackground(Void avoid[])
	{
		return phoneNumberUtils.getPhoneNumber(providedPhoneNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PhoneNumberUtils phoneNumberUtils>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field String providedPhoneNumber>
	//    4    8:invokevirtual   #44  <Method PhoneNumber PhoneNumberUtils.getPhoneNumber(String)>
	//    5   11:areturn         
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #47  <Class Void[]>
	//    3    5:invokevirtual   #49  <Method PhoneNumber doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(PhoneNumber phonenumber)
	{
		Listener listener1 = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PhoneNumberTask$Listener listener>
	//    2    4:astore_2        
		if(listener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			listener1.onLoadComplete(phonenumber);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #54  <Method void PhoneNumberTask$Listener.onLoadComplete(PhoneNumber)>
	//    8   16:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((PhoneNumber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #57  <Class PhoneNumber>
	//    3    5:invokevirtual   #59  <Method void onPostExecute(PhoneNumber)>
	//    4    8:return          
	}

	private final Listener listener;
	private final PhoneNumberUtils phoneNumberUtils;
	private final String providedPhoneNumber;
}
