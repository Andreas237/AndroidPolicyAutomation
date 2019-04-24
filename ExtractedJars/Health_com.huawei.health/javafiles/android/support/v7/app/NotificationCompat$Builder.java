// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;

// Referenced classes of package android.support.v7.app:
//			NotificationCompat

public static class NotificationCompat$Builder extends android.support.v4.app.NotificationCompat$Builder
{

	public android.support.v4.app.xtender getExtender()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          17
			return ((android.support.v4.app.xtender) (new ender(((NotificationCompat._cls1) (null)))));
	//    3    8:new             #26  <Class NotificationCompat$Api24Extender>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:invokespecial   #29  <Method void NotificationCompat$Api24Extender(NotificationCompat$1)>
	//    7   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   17:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          21
	//*  10   22:icmplt          33
			return ((android.support.v4.app.xtender) (new Extender()));
	//   11   25:new             #31  <Class NotificationCompat$LollipopExtender>
	//   12   28:dup             
	//   13   29:invokespecial   #34  <Method void NotificationCompat$LollipopExtender()>
	//   14   32:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  15   33:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   36:bipush          16
	//*  17   38:icmplt          49
			return ((android.support.v4.app.xtender) (new nExtender()));
	//   18   41:new             #36  <Class NotificationCompat$JellybeanExtender>
	//   19   44:dup             
	//   20   45:invokespecial   #37  <Method void NotificationCompat$JellybeanExtender()>
	//   21   48:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  22   49:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   52:bipush          14
	//*  24   54:icmplt          65
			return ((android.support.v4.app.xtender) (new SandwichExtender()));
	//   25   57:new             #39  <Class NotificationCompat$IceCreamSandwichExtender>
	//   26   60:dup             
	//   27   61:invokespecial   #40  <Method void NotificationCompat$IceCreamSandwichExtender()>
	//   28   64:areturn         
		else
			return super.getExtender();
	//   29   65:aload_0         
	//   30   66:invokespecial   #42  <Method android.support.v4.app.NotificationCompat$BuilderExtender android.support.v4.app.NotificationCompat$Builder.getExtender()>
	//   31   69:areturn         
	}

	public CharSequence resolveText()
	{
		if(mStyle instanceof android.support.v4.app.gStyle)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
	//*   2    4:instanceof      #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//*   3    7:ifeq            48
		{
			android.support.v4.app.gStyle gstyle = (android.support.v4.app.gStyle)mStyle;
	//    4   10:aload_0         
	//    5   11:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
	//    6   14:checkcast       #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//    7   17:astore_1        
			android.support.v4.app.gStyle.Message message = NotificationCompat.access$000(gstyle);
	//    8   18:aload_1         
	//    9   19:invokestatic    #55  <Method android.support.v4.app.NotificationCompat$MessagingStyle$Message NotificationCompat.access$000(android.support.v4.app.NotificationCompat$MessagingStyle)>
	//   10   22:astore_2        
			CharSequence charsequence = gstyle.getConversationTitle();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #58  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getConversationTitle()>
	//   13   27:astore_3        
			if(message != null)
	//*  14   28:aload_2         
	//*  15   29:ifnull          48
				if(charsequence != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          43
					return NotificationCompat.access$100(((android.support.v4.app.NotificationCompat$Builder) (this)), gstyle, message);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokestatic    #62  <Method CharSequence NotificationCompat.access$100(android.support.v4.app.NotificationCompat$Builder, android.support.v4.app.NotificationCompat$MessagingStyle, android.support.v4.app.NotificationCompat$MessagingStyle$Message)>
	//   22   42:areturn         
				else
					return message.getText();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #67  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getText()>
	//   25   47:areturn         
		}
		return super.resolveText();
	//   26   48:aload_0         
	//   27   49:invokespecial   #69  <Method CharSequence android.support.v4.app.NotificationCompat$Builder.resolveText()>
	//   28   52:areturn         
	}

	public CharSequence resolveTitle()
	{
		if(mStyle instanceof android.support.v4.app.gStyle)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
	//*   2    4:instanceof      #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//*   3    7:ifeq            47
		{
			Object obj = ((Object) ((android.support.v4.app.gStyle)mStyle));
	//    4   10:aload_0         
	//    5   11:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
	//    6   14:checkcast       #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//    7   17:astore_2        
			android.support.v4.app.gStyle.Message message = NotificationCompat.access$000(((android.support.v4.app.gStyle) (obj)));
	//    8   18:aload_2         
	//    9   19:invokestatic    #55  <Method android.support.v4.app.NotificationCompat$MessagingStyle$Message NotificationCompat.access$000(android.support.v4.app.NotificationCompat$MessagingStyle)>
	//   10   22:astore_1        
			obj = ((Object) (((android.support.v4.app.gStyle) (obj)).getConversationTitle()));
	//   11   23:aload_2         
	//   12   24:invokevirtual   #58  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getConversationTitle()>
	//   13   27:astore_2        
			if(obj != null || message != null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       36
	//*  16   32:aload_1         
	//*  17   33:ifnull          47
				if(obj != null)
	//*  18   36:aload_2         
	//*  19   37:ifnull          42
					return ((CharSequence) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
				else
					return message.getSender();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #73  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
	//   24   46:areturn         
		}
		return super.resolveTitle();
	//   25   47:aload_0         
	//   26   48:invokespecial   #75  <Method CharSequence android.support.v4.app.NotificationCompat$Builder.resolveTitle()>
	//   27   51:areturn         
	}

	public NotificationCompat$Builder(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//    3    5:return          
	}
}
