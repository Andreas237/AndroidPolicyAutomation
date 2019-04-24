// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$BigTextStyle extends NotificationCompat.Style
{

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          28
			NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mBigText);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #29  <Field CharSequence mBigContentTitle>
	//    6   13:aload_0         
	//    7   14:getfield        #33  <Field boolean mSummaryTextSet>
	//    8   17:aload_0         
	//    9   18:getfield        #36  <Field CharSequence mSummaryText>
	//   10   21:aload_0         
	//   11   22:getfield        #38  <Field CharSequence mBigText>
	//   12   25:invokestatic    #44  <Method void NotificationCompatJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, CharSequence)>
	//   13   28:return          
	}

	public NotificationCompat$BigTextStyle bigText(CharSequence charsequence)
	{
		mBigText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #38  <Field CharSequence mBigText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigTextStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #29  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigTextStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #36  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #33  <Field boolean mSummaryTextSet>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private CharSequence mBigText;

	public NotificationCompat$BigTextStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
	//    2    4:return          
	}

	public NotificationCompat$BigTextStyle(NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
		setBuilder(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #18  <Method void setBuilder(NotificationCompat$Builder)>
	//    5    9:return          
	}
}
