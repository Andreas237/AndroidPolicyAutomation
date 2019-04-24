// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static class NotificationCompat$BigPictureStyle extends NotificationCompat.Style
{

	public NotificationCompat$BigPictureStyle bigLargeIcon(Bitmap bitmap)
	{
		mBigLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Bitmap mBigLargeIcon>
		mBigLargeIconSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #27  <Field boolean mBigLargeIconSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public NotificationCompat$BigPictureStyle bigPicture(Bitmap bitmap)
	{
		mPicture = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Bitmap mPicture>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$BigPictureStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #42  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigPictureStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #46  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #49  <Field boolean mSummaryTextSet>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	Bitmap mBigLargeIcon;
	boolean mBigLargeIconSet;
	Bitmap mPicture;

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
