// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$BigPictureStyle extends NotificationCompat.Style
{

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          68
		{
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(mBigContentTitle).bigPicture(mPicture)));
	//    3    8:new             #35  <Class android.app.Notification$BigPictureStyle>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokeinterface #41  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    7   18:invokespecial   #44  <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
	//    8   21:aload_0         
	//    9   22:getfield        #48  <Field CharSequence mBigContentTitle>
	//   10   25:invokevirtual   #52  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
	//   11   28:aload_0         
	//   12   29:getfield        #54  <Field Bitmap mPicture>
	//   13   32:invokevirtual   #58  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
	//   14   35:astore_1        
			if(mBigLargeIconSet)
	//*  15   36:aload_0         
	//*  16   37:getfield        #60  <Field boolean mBigLargeIconSet>
	//*  17   40:ifeq            52
				((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).bigLargeIcon(mBigLargeIcon);
	//   18   43:aload_1         
	//   19   44:aload_0         
	//   20   45:getfield        #62  <Field Bitmap mBigLargeIcon>
	//   21   48:invokevirtual   #65  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
	//   22   51:pop             
			if(mSummaryTextSet)
	//*  23   52:aload_0         
	//*  24   53:getfield        #68  <Field boolean mSummaryTextSet>
	//*  25   56:ifeq            68
				((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(mSummaryText);
	//   26   59:aload_1         
	//   27   60:aload_0         
	//   28   61:getfield        #71  <Field CharSequence mSummaryText>
	//   29   64:invokevirtual   #74  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
	//   30   67:pop             
		}
	//   31   68:return          
	}

	public NotificationCompat$BigPictureStyle bigLargeIcon(Bitmap bitmap)
	{
		mBigLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Bitmap mBigLargeIcon>
		mBigLargeIconSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #60  <Field boolean mBigLargeIconSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public NotificationCompat$BigPictureStyle bigPicture(Bitmap bitmap)
	{
		mPicture = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Bitmap mPicture>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$BigPictureStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #83  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #48  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigPictureStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #83  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #71  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #68  <Field boolean mSummaryTextSet>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private Bitmap mBigLargeIcon;
	private boolean mBigLargeIconSet;
	private Bitmap mPicture;

	public NotificationCompat$BigPictureStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void NotificationCompat$Style()>
	//    2    4:return          
	}

	public NotificationCompat$BigPictureStyle(NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void NotificationCompat$Style()>
		setBuilder(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #21  <Method void setBuilder(NotificationCompat$Builder)>
	//    5    9:return          
	}
}
