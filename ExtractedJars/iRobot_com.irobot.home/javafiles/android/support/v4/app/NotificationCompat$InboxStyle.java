// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$InboxStyle extends NotificationCompat.Style
{

	public NotificationCompat$InboxStyle addLine(CharSequence charsequence)
	{
		mTexts.add(((Object) (NotificationCompat.Builder.limitCharSequenceLength(charsequence))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList mTexts>
	//    2    4:aload_1         
	//    3    5:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    4    8:invokevirtual   #36  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          28
			NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mTexts);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #48  <Field CharSequence mBigContentTitle>
	//    6   13:aload_0         
	//    7   14:getfield        #52  <Field boolean mSummaryTextSet>
	//    8   17:aload_0         
	//    9   18:getfield        #55  <Field CharSequence mSummaryText>
	//   10   21:aload_0         
	//   11   22:getfield        #19  <Field ArrayList mTexts>
	//   12   25:invokestatic    #61  <Method void NotificationCompatJellybean.addInboxStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, ArrayList)>
	//   13   28:return          
	}

	public NotificationCompat$InboxStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #48  <Field CharSequence mBigContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$InboxStyle setSummaryText(CharSequence charsequence)
	{
		mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #55  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #52  <Field boolean mSummaryTextSet>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private ArrayList mTexts;

	public NotificationCompat$InboxStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
		mTexts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList mTexts>
	//    7   15:return          
	}

	public NotificationCompat$InboxStyle(NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
		mTexts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList mTexts>
		setBuilder(builder);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #24  <Method void setBuilder(NotificationCompat$Builder)>
	//   10   20:return          
	}
}
