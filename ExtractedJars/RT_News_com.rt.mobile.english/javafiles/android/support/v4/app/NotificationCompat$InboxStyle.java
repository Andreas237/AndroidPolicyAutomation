// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

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
	//*   0    0:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          79
		{
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(mBigContentTitle)));
	//    3    8:new             #50  <Class android.app.Notification$InboxStyle>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:invokeinterface #56  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    7   18:invokespecial   #59  <Method void android.app.Notification$InboxStyle(android.app.Notification$Builder)>
	//    8   21:aload_0         
	//    9   22:getfield        #63  <Field CharSequence mBigContentTitle>
	//   10   25:invokevirtual   #67  <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setBigContentTitle(CharSequence)>
	//   11   28:astore_1        
			if(mSummaryTextSet)
	//*  12   29:aload_0         
	//*  13   30:getfield        #71  <Field boolean mSummaryTextSet>
	//*  14   33:ifeq            45
				((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(mSummaryText);
	//   15   36:aload_1         
	//   16   37:aload_0         
	//   17   38:getfield        #74  <Field CharSequence mSummaryText>
	//   18   41:invokevirtual   #77  <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setSummaryText(CharSequence)>
	//   19   44:pop             
			for(Iterator iterator = mTexts.iterator(); iterator.hasNext(); ((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).addLine((CharSequence)iterator.next()));
	//   20   45:aload_0         
	//   21   46:getfield        #19  <Field ArrayList mTexts>
	//   22   49:invokevirtual   #81  <Method Iterator ArrayList.iterator()>
	//   23   52:astore_2        
	//   24   53:aload_2         
	//   25   54:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            79
	//   27   62:aload_1         
	//   28   63:aload_2         
	//   29   64:invokeinterface #91  <Method Object Iterator.next()>
	//   30   69:checkcast       #93  <Class CharSequence>
	//   31   72:invokevirtual   #95  <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.addLine(CharSequence)>
	//   32   75:pop             
		}
	//*  33   76:goto            53
	//   34   79:return          
	}

	public NotificationCompat$InboxStyle setBigContentTitle(CharSequence charsequence)
	{
		mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #63  <Field CharSequence mBigContentTitle>
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
	//    3    5:putfield        #74  <Field CharSequence mSummaryText>
		mSummaryTextSet = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #71  <Field boolean mSummaryTextSet>
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
