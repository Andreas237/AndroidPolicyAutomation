// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static abstract class NotificationCompat$Style
{

	public void addCompatExtras(Bundle bundle)
	{
	//    0    0:return          
	}

	public Notification build()
	{
		Notification notification = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(mBuilder != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #32  <Field NotificationCompat$Builder mBuilder>
	//*   4    6:ifnull          17
			notification = mBuilder.build();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field NotificationCompat$Builder mBuilder>
	//    7   13:invokevirtual   #36  <Method Notification NotificationCompat$Builder.build()>
	//    8   16:astore_1        
		return notification;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	protected void restoreFromCompatExtras(Bundle bundle)
	{
	//    0    0:return          
	}

	public void setBuilder(r r)
	{
		if(mBuilder != r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field NotificationCompat$Builder mBuilder>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       29
		{
			mBuilder = r;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #32  <Field NotificationCompat$Builder mBuilder>
			if(mBuilder != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #32  <Field NotificationCompat$Builder mBuilder>
	//*   9   17:ifnull          29
				mBuilder.setStyle(this);
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field NotificationCompat$Builder mBuilder>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #43  <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	CharSequence mBigContentTitle;
	r mBuilder;
	CharSequence mSummaryText;
	boolean mSummaryTextSet;

	public NotificationCompat$Style()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mSummaryTextSet = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean mSummaryTextSet>
	//    5    9:return          
	}
}
