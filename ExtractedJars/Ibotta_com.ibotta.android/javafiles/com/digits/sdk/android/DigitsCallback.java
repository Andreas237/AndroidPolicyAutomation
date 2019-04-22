// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterException;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.ref.WeakReference;

// Referenced classes of package com.digits.sdk.android:
//			DigitsController, DigitsException

public abstract class DigitsCallback extends Callback
{

	DigitsCallback(Context context1, DigitsController digitscontroller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Callback()>
		context = new WeakReference(((Object) (context1)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
	//    7   13:putfield        #22  <Field WeakReference context>
		controller = digitscontroller;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #24  <Field DigitsController controller>
	//   11   21:return          
	}

	public void failure(TwitterException twitterexception)
	{
		DigitsException digitsexception = DigitsException.create(controller.getErrors(), twitterexception);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DigitsController controller>
	//    2    4:invokeinterface #33  <Method ErrorCodes DigitsController.getErrors()>
	//    3    9:aload_1         
	//    4   10:invokestatic    #39  <Method DigitsException DigitsException.create(ErrorCodes, TwitterException)>
	//    5   13:astore_2        
		Logger logger = Fabric.getLogger();
	//    6   14:invokestatic    #45  <Method Logger Fabric.getLogger()>
	//    7   17:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #47  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #48  <Method void StringBuilder()>
	//   11   25:astore          4
		stringbuilder.append("HTTP Error: ");
	//   12   27:aload           4
	//   13   29:ldc1            #50  <String "HTTP Error: ">
	//   14   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
		stringbuilder.append(twitterexception.getMessage());
	//   16   35:aload           4
	//   17   37:aload_1         
	//   18   38:invokevirtual   #60  <Method String TwitterException.getMessage()>
	//   19   41:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(", API Error: ");
	//   21   45:aload           4
	//   22   47:ldc1            #62  <String ", API Error: ">
	//   23   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
		stringbuilder.append("");
	//   25   53:aload           4
	//   26   55:ldc1            #64  <String "">
	//   27   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
		stringbuilder.append(digitsexception.getErrorCode());
	//   29   61:aload           4
	//   30   63:aload_2         
	//   31   64:invokevirtual   #68  <Method int DigitsException.getErrorCode()>
	//   32   67:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   33   70:pop             
		stringbuilder.append(", User Message: ");
	//   34   71:aload           4
	//   35   73:ldc1            #73  <String ", User Message: ">
	//   36   75:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
		stringbuilder.append(digitsexception.getMessage());
	//   38   79:aload           4
	//   39   81:aload_2         
	//   40   82:invokevirtual   #74  <Method String DigitsException.getMessage()>
	//   41   85:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
		logger.e("Digits", stringbuilder.toString());
	//   43   89:aload_3         
	//   44   90:ldc1            #76  <String "Digits">
	//   45   92:aload           4
	//   46   94:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   47   97:invokeinterface #85  <Method void Logger.e(String, String)>
		controller.handleError((Context)context.get(), digitsexception);
	//   48  102:aload_0         
	//   49  103:getfield        #24  <Field DigitsController controller>
	//   50  106:aload_0         
	//   51  107:getfield        #22  <Field WeakReference context>
	//   52  110:invokevirtual   #89  <Method Object WeakReference.get()>
	//   53  113:checkcast       #91  <Class Context>
	//   54  116:aload_2         
	//   55  117:invokeinterface #95  <Method void DigitsController.handleError(Context, DigitsException)>
	//   56  122:return          
	}

	private final WeakReference context;
	final DigitsController controller;
}
