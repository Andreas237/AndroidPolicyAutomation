// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$BigTextStyle extends NotificationCompat.Style
{

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          52
		{
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(mBigContentTitle).bigText(mBigText)));
	//    3    8:new             #32  <Class android.app.Notification$BigTextStyle>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokeinterface #38  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    7   18:invokespecial   #41  <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//    8   21:aload_0         
	//    9   22:getfield        #44  <Field CharSequence mBigContentTitle>
	//   10   25:invokevirtual   #48  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//   11   28:aload_0         
	//   12   29:getfield        #50  <Field CharSequence mBigText>
	//   13   32:invokevirtual   #53  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   14   35:astore_1        
			if(mSummaryTextSet)
	//*  15   36:aload_0         
	//*  16   37:getfield        #57  <Field boolean mSummaryTextSet>
	//*  17   40:ifeq            52
				((android.app.Notification.BigTextStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(mSummaryText);
	//   18   43:aload_1         
	//   19   44:aload_0         
	//   20   45:getfield        #60  <Field CharSequence mSummaryText>
	//   21   48:invokevirtual   #63  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
	//   22   51:pop             
		}
	//   23   52:return          
	}

	public NotificationCompat$BigTextStyle bigText(CharSequence charsequence)
	{
		mBigText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #50  <Field CharSequence mBigText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigTextStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #44  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$BigTextStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #60  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #57  <Field boolean mSummaryTextSet>
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
