// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$BigPictureStyle extends NotificationCompat.Style
{

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          36
			NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mPicture, mBigLargeIcon, mBigLargeIconSet);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field CharSequence mBigContentTitle>
	//    6   13:aload_0         
	//    7   14:getfield        #36  <Field boolean mSummaryTextSet>
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field CharSequence mSummaryText>
	//   10   21:aload_0         
	//   11   22:getfield        #41  <Field Bitmap mPicture>
	//   12   25:aload_0         
	//   13   26:getfield        #43  <Field Bitmap mBigLargeIcon>
	//   14   29:aload_0         
	//   15   30:getfield        #45  <Field boolean mBigLargeIconSet>
	//   16   33:invokestatic    #51  <Method void NotificationCompatJellybean.addBigPictureStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, Bitmap, Bitmap, boolean)>
	//   17   36:return          
	}

	public NotificationCompat$BigPictureStyle bigLargeIcon(Bitmap bitmap)
	{
		mBigLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field Bitmap mBigLargeIcon>
		mBigLargeIconSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #45  <Field boolean mBigLargeIconSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public NotificationCompat$BigPictureStyle bigPicture(Bitmap bitmap)
	{
		mPicture = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Bitmap mPicture>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$BigPictureStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #62  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #33  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigPictureStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #62  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #39  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #36  <Field boolean mSummaryTextSet>
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
