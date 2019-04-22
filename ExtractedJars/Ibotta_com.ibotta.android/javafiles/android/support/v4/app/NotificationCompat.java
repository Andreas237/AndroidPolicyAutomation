// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import java.lang.annotation.Annotation;
import java.text.NumberFormat;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatJellybean, RemoteInput, NotificationCompatBuilder, NotificationBuilderWithBuilderAccessor

public class NotificationCompat
{
	public static class Action
	{

		public PendingIntent getActionIntent()
		{
			return actionIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field PendingIntent actionIntent>
		//    2    4:areturn         
		}

		public boolean getAllowGeneratedReplies()
		{
			return mAllowGeneratedReplies;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field boolean mAllowGeneratedReplies>
		//    2    4:ireturn         
		}

		public RemoteInput[] getDataOnlyRemoteInputs()
		{
			return mDataOnlyRemoteInputs;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field RemoteInput[] mDataOnlyRemoteInputs>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public int getIcon()
		{
			return icon;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int icon>
		//    2    4:ireturn         
		}

		public RemoteInput[] getRemoteInputs()
		{
			return mRemoteInputs;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field RemoteInput[] mRemoteInputs>
		//    2    4:areturn         
		}

		public int getSemanticAction()
		{
			return mSemanticAction;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field int mSemanticAction>
		//    2    4:ireturn         
		}

		public boolean getShowsUserInterface()
		{
			return mShowsUserInterface;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field boolean mShowsUserInterface>
		//    2    4:ireturn         
		}

		public CharSequence getTitle()
		{
			return title;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field CharSequence title>
		//    2    4:areturn         
		}

		public PendingIntent actionIntent;
		public int icon;
		private boolean mAllowGeneratedReplies;
		private final RemoteInput mDataOnlyRemoteInputs[];
		final Bundle mExtras;
		private final RemoteInput mRemoteInputs[];
		private final int mSemanticAction;
		boolean mShowsUserInterface;
		public CharSequence title;

		Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag, 
				int j, boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			mShowsUserInterface = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #38  <Field boolean mShowsUserInterface>
			icon = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #40  <Field int icon>
			title = Builder.limitCharSequenceLength(charsequence);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokestatic    #46  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//   11   19:putfield        #48  <Field CharSequence title>
			actionIntent = pendingintent;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:putfield        #50  <Field PendingIntent actionIntent>
			if(bundle == null)
		//*  15   27:aload           4
		//*  16   29:ifnull          35
		//*  17   32:goto            44
				bundle = new Bundle();
		//   18   35:new             #52  <Class Bundle>
		//   19   38:dup             
		//   20   39:invokespecial   #53  <Method void Bundle()>
		//   21   42:astore          4
			mExtras = bundle;
		//   22   44:aload_0         
		//   23   45:aload           4
		//   24   47:putfield        #55  <Field Bundle mExtras>
			mRemoteInputs = aremoteinput;
		//   25   50:aload_0         
		//   26   51:aload           5
		//   27   53:putfield        #57  <Field RemoteInput[] mRemoteInputs>
			mDataOnlyRemoteInputs = aremoteinput1;
		//   28   56:aload_0         
		//   29   57:aload           6
		//   30   59:putfield        #59  <Field RemoteInput[] mDataOnlyRemoteInputs>
			mAllowGeneratedReplies = flag;
		//   31   62:aload_0         
		//   32   63:iload           7
		//   33   65:putfield        #61  <Field boolean mAllowGeneratedReplies>
			mSemanticAction = j;
		//   34   68:aload_0         
		//   35   69:iload           8
		//   36   71:putfield        #63  <Field int mSemanticAction>
			mShowsUserInterface = flag1;
		//   37   74:aload_0         
		//   38   75:iload           9
		//   39   77:putfield        #38  <Field boolean mShowsUserInterface>
		//   40   80:return          
		}
	}

	public static final class Action.Builder
	{

		public Action.Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				mExtras.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #55  <Field Bundle mExtras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #76  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Action build()
		{
			RemoteInput aremoteinput[] = ((RemoteInput []) (new ArrayList()));
		//    0    0:new             #57  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #79  <Method void ArrayList()>
		//    3    7:astore_1        
			RemoteInput aremoteinput1[] = ((RemoteInput []) (new ArrayList()));
		//    4    8:new             #57  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #79  <Method void ArrayList()>
		//    7   15:astore_2        
			Object obj = ((Object) (mRemoteInputs));
		//    8   16:aload_0         
		//    9   17:getfield        #68  <Field ArrayList mRemoteInputs>
		//   10   20:astore_3        
			if(obj != null)
		//*  11   21:aload_3         
		//*  12   22:ifnull          82
				for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
		//*  13   25:aload_3         
		//*  14   26:invokevirtual   #83  <Method Iterator ArrayList.iterator()>
		//*  15   29:astore_3        
		//*  16   30:aload_3         
		//*  17   31:invokeinterface #89  <Method boolean Iterator.hasNext()>
		//*  18   36:ifeq            82
				{
					RemoteInput remoteinput = (RemoteInput)((Iterator) (obj)).next();
		//   19   39:aload_3         
		//   20   40:invokeinterface #93  <Method Object Iterator.next()>
		//   21   45:checkcast       #95  <Class RemoteInput>
		//   22   48:astore          4
					if(remoteinput.isDataOnly())
		//*  23   50:aload           4
		//*  24   52:invokevirtual   #98  <Method boolean RemoteInput.isDataOnly()>
		//*  25   55:ifeq            70
						((List) (aremoteinput)).add(((Object) (remoteinput)));
		//   26   58:aload_1         
		//   27   59:aload           4
		//   28   61:invokeinterface #104 <Method boolean List.add(Object)>
		//   29   66:pop             
					else
		//*  30   67:goto            30
						((List) (aremoteinput1)).add(((Object) (remoteinput)));
		//   31   70:aload_2         
		//   32   71:aload           4
		//   33   73:invokeinterface #104 <Method boolean List.add(Object)>
		//   34   78:pop             
				}

		//*  35   79:goto            30
			if(((List) (aremoteinput)).isEmpty())
		//*  36   82:aload_1         
		//*  37   83:invokeinterface #107 <Method boolean List.isEmpty()>
		//*  38   88:ifeq            96
				aremoteinput = null;
		//   39   91:aconst_null     
		//   40   92:astore_1        
			else
		//*  41   93:goto            115
				aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
		//   42   96:aload_1         
		//   43   97:aload_1         
		//   44   98:invokeinterface #111 <Method int List.size()>
		//   45  103:anewarray       RemoteInput[]
		//   46  106:invokeinterface #115 <Method Object[] List.toArray(Object[])>
		//   47  111:checkcast       #117 <Class RemoteInput[]>
		//   48  114:astore_1        
			if(((List) (aremoteinput1)).isEmpty())
		//*  49  115:aload_2         
		//*  50  116:invokeinterface #107 <Method boolean List.isEmpty()>
		//*  51  121:ifeq            129
				aremoteinput1 = null;
		//   52  124:aconst_null     
		//   53  125:astore_2        
			else
		//*  54  126:goto            148
				aremoteinput1 = (RemoteInput[])((List) (aremoteinput1)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput1)).size()])));
		//   55  129:aload_2         
		//   56  130:aload_2         
		//   57  131:invokeinterface #111 <Method int List.size()>
		//   58  136:anewarray       RemoteInput[]
		//   59  139:invokeinterface #115 <Method Object[] List.toArray(Object[])>
		//   60  144:checkcast       #117 <Class RemoteInput[]>
		//   61  147:astore_2        
			return new Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies, mSemanticAction, mShowsUserInterface);
		//   62  148:new             #6   <Class NotificationCompat$Action>
		//   63  151:dup             
		//   64  152:aload_0         
		//   65  153:getfield        #43  <Field int mIcon>
		//   66  156:aload_0         
		//   67  157:getfield        #51  <Field CharSequence mTitle>
		//   68  160:aload_0         
		//   69  161:getfield        #53  <Field PendingIntent mIntent>
		//   70  164:aload_0         
		//   71  165:getfield        #55  <Field Bundle mExtras>
		//   72  168:aload_2         
		//   73  169:aload_1         
		//   74  170:aload_0         
		//   75  171:getfield        #39  <Field boolean mAllowGeneratedReplies>
		//   76  174:aload_0         
		//   77  175:getfield        #70  <Field int mSemanticAction>
		//   78  178:aload_0         
		//   79  179:getfield        #41  <Field boolean mShowsUserInterface>
		//   80  182:invokespecial   #120 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
		//   81  185:areturn         
		}

		private boolean mAllowGeneratedReplies;
		private final Bundle mExtras;
		private final int mIcon;
		private final PendingIntent mIntent;
		private ArrayList mRemoteInputs;
		private int mSemanticAction;
		private boolean mShowsUserInterface;
		private final CharSequence mTitle;

		public Action.Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), true, 0, true);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:new             #29  <Class Bundle>
		//    5    7:dup             
		//    6    8:invokespecial   #32  <Method void Bundle()>
		//    7   11:aconst_null     
		//    8   12:iconst_1        
		//    9   13:iconst_0        
		//   10   14:iconst_1        
		//   11   15:invokespecial   #35  <Method void NotificationCompat$Action$Builder(int, CharSequence, PendingIntent, Bundle, RemoteInput[], boolean, int, boolean)>
		//   12   18:return          
		}

		private Action.Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag, int j, 
				boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
			mAllowGeneratedReplies = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #39  <Field boolean mAllowGeneratedReplies>
			mShowsUserInterface = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #41  <Field boolean mShowsUserInterface>
			mIcon = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #43  <Field int mIcon>
			mTitle = Builder.limitCharSequenceLength(charsequence);
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:invokestatic    #49  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//   14   24:putfield        #51  <Field CharSequence mTitle>
			mIntent = pendingintent;
		//   15   27:aload_0         
		//   16   28:aload_3         
		//   17   29:putfield        #53  <Field PendingIntent mIntent>
			mExtras = bundle;
		//   18   32:aload_0         
		//   19   33:aload           4
		//   20   35:putfield        #55  <Field Bundle mExtras>
			if(aremoteinput == null)
		//*  21   38:aload           5
		//*  22   40:ifnonnull       48
				charsequence = null;
		//   23   43:aconst_null     
		//   24   44:astore_2        
			else
		//*  25   45:goto            61
				charsequence = ((CharSequence) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (aremoteinput))))))));
		//   26   48:new             #57  <Class ArrayList>
		//   27   51:dup             
		//   28   52:aload           5
		//   29   54:invokestatic    #63  <Method List Arrays.asList(Object[])>
		//   30   57:invokespecial   #66  <Method void ArrayList(java.util.Collection)>
		//   31   60:astore_2        
			mRemoteInputs = ((ArrayList) (charsequence));
		//   32   61:aload_0         
		//   33   62:aload_2         
		//   34   63:putfield        #68  <Field ArrayList mRemoteInputs>
			mAllowGeneratedReplies = flag;
		//   35   66:aload_0         
		//   36   67:iload           6
		//   37   69:putfield        #39  <Field boolean mAllowGeneratedReplies>
			mSemanticAction = j;
		//   38   72:aload_0         
		//   39   73:iload           7
		//   40   75:putfield        #70  <Field int mSemanticAction>
			mShowsUserInterface = flag1;
		//   41   78:aload_0         
		//   42   79:iload           8
		//   43   81:putfield        #41  <Field boolean mShowsUserInterface>
		//   44   84:return          
		}
	}

	public static interface Action.Extender
	{

		public abstract Action.Builder extend(Action.Builder builder);
	}

	public static interface Action.SemanticAction
		extends Annotation
	{
	}

	public static interface BadgeIconType
		extends Annotation
	{
	}

	public static class BigPictureStyle extends Style
	{

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          16
		//*   2    5:icmplt          68
			{
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(mBigContentTitle).bigPicture(mPicture)));
		//    3    8:new             #31  <Class android.app.Notification$BigPictureStyle>
		//    4   11:dup             
		//    5   12:aload_1         
		//    6   13:invokeinterface #37  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//    7   18:invokespecial   #40  <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
		//    8   21:aload_0         
		//    9   22:getfield        #44  <Field CharSequence mBigContentTitle>
		//   10   25:invokevirtual   #48  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
		//   11   28:aload_0         
		//   12   29:getfield        #50  <Field Bitmap mPicture>
		//   13   32:invokevirtual   #54  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
		//   14   35:astore_1        
				if(mBigLargeIconSet)
		//*  15   36:aload_0         
		//*  16   37:getfield        #56  <Field boolean mBigLargeIconSet>
		//*  17   40:ifeq            52
					((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).bigLargeIcon(mBigLargeIcon);
		//   18   43:aload_1         
		//   19   44:aload_0         
		//   20   45:getfield        #58  <Field Bitmap mBigLargeIcon>
		//   21   48:invokevirtual   #61  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
		//   22   51:pop             
				if(mSummaryTextSet)
		//*  23   52:aload_0         
		//*  24   53:getfield        #64  <Field boolean mSummaryTextSet>
		//*  25   56:ifeq            68
					((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(mSummaryText);
		//   26   59:aload_1         
		//   27   60:aload_0         
		//   28   61:getfield        #67  <Field CharSequence mSummaryText>
		//   29   64:invokevirtual   #70  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
		//   30   67:pop             
			}
		//   31   68:return          
		}

		public BigPictureStyle bigPicture(Bitmap bitmap)
		{
			mPicture = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #50  <Field Bitmap mPicture>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public BigPictureStyle setBigContentTitle(CharSequence charsequence)
		{
			mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #79  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #44  <Field CharSequence mBigContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigPictureStyle setSummaryText(CharSequence charsequence)
		{
			mSummaryText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #79  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #67  <Field CharSequence mSummaryText>
			mSummaryTextSet = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #64  <Field boolean mSummaryTextSet>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private Bitmap mBigLargeIcon;
		private boolean mBigLargeIconSet;
		private Bitmap mPicture;

		public BigPictureStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}
	}

	public static class BigTextStyle extends Style
	{

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          16
		//*   2    5:icmplt          52
			{
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(mBigContentTitle).bigText(mBigText)));
		//    3    8:new             #28  <Class android.app.Notification$BigTextStyle>
		//    4   11:dup             
		//    5   12:aload_1         
		//    6   13:invokeinterface #34  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//    7   18:invokespecial   #37  <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
		//    8   21:aload_0         
		//    9   22:getfield        #40  <Field CharSequence mBigContentTitle>
		//   10   25:invokevirtual   #44  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
		//   11   28:aload_0         
		//   12   29:getfield        #46  <Field CharSequence mBigText>
		//   13   32:invokevirtual   #49  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
		//   14   35:astore_1        
				if(mSummaryTextSet)
		//*  15   36:aload_0         
		//*  16   37:getfield        #53  <Field boolean mSummaryTextSet>
		//*  17   40:ifeq            52
					((android.app.Notification.BigTextStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(mSummaryText);
		//   18   43:aload_1         
		//   19   44:aload_0         
		//   20   45:getfield        #56  <Field CharSequence mSummaryText>
		//   21   48:invokevirtual   #59  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
		//   22   51:pop             
			}
		//   23   52:return          
		}

		public BigTextStyle bigText(CharSequence charsequence)
		{
			mBigText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #67  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #46  <Field CharSequence mBigText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigTextStyle setBigContentTitle(CharSequence charsequence)
		{
			mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #67  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #40  <Field CharSequence mBigContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigTextStyle setSummaryText(CharSequence charsequence)
		{
			mSummaryText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #67  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #56  <Field CharSequence mSummaryText>
			mSummaryTextSet = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #53  <Field boolean mSummaryTextSet>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private CharSequence mBigText;

		public BigTextStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}
	}

	public static class Builder
	{

		protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
		{
			if(charsequence == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return charsequence;
		//    2    4:aload_0         
		//    3    5:areturn         
			CharSequence charsequence1 = charsequence;
		//    4    6:aload_0         
		//    5    7:astore_1        
			if(charsequence.length() > 5120)
		//*   6    8:aload_0         
		//*   7    9:invokeinterface #133 <Method int CharSequence.length()>
		//*   8   14:sipush          5120
		//*   9   17:icmple          31
				charsequence1 = charsequence.subSequence(0, 5120);
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:sipush          5120
		//   13   25:invokeinterface #137 <Method CharSequence CharSequence.subSequence(int, int)>
		//   14   30:astore_1        
			return charsequence1;
		//   15   31:aload_1         
		//   16   32:areturn         
		}

		private Bitmap reduceLargeIconSize(Bitmap bitmap)
		{
			if(bitmap != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          121
			{
				if(android.os.Build.VERSION.SDK_INT >= 27)
		//*   2    4:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          27
		//*   4    9:icmplt          14
					return bitmap;
		//    5   12:aload_1         
		//    6   13:areturn         
				Resources resources = mContext.getResources();
		//    7   14:aload_0         
		//    8   15:getfield        #106 <Field Context mContext>
		//    9   18:invokevirtual   #150 <Method Resources Context.getResources()>
		//   10   21:astore          6
				int i = resources.getDimensionPixelSize(android.support.compat.R.dimen.compat_notification_large_icon_max_width);
		//   11   23:aload           6
		//   12   25:getstatic       #155 <Field int android.support.compat.R$dimen.compat_notification_large_icon_max_width>
		//   13   28:invokevirtual   #161 <Method int Resources.getDimensionPixelSize(int)>
		//   14   31:istore          4
				int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.compat_notification_large_icon_max_height);
		//   15   33:aload           6
		//   16   35:getstatic       #164 <Field int android.support.compat.R$dimen.compat_notification_large_icon_max_height>
		//   17   38:invokevirtual   #161 <Method int Resources.getDimensionPixelSize(int)>
		//   18   41:istore          5
				if(bitmap.getWidth() <= i && bitmap.getHeight() <= j)
		//*  19   43:aload_1         
		//*  20   44:invokevirtual   #169 <Method int Bitmap.getWidth()>
		//*  21   47:iload           4
		//*  22   49:icmpgt          63
		//*  23   52:aload_1         
		//*  24   53:invokevirtual   #172 <Method int Bitmap.getHeight()>
		//*  25   56:iload           5
		//*  26   58:icmpgt          63
				{
					return bitmap;
		//   27   61:aload_1         
		//   28   62:areturn         
				} else
				{
					double d = Math.min((double)i / (double)Math.max(1, bitmap.getWidth()), (double)j / (double)Math.max(1, bitmap.getHeight()));
		//   29   63:iload           4
		//   30   65:i2d             
		//   31   66:iconst_1        
		//   32   67:aload_1         
		//   33   68:invokevirtual   #169 <Method int Bitmap.getWidth()>
		//   34   71:invokestatic    #178 <Method int Math.max(int, int)>
		//   35   74:i2d             
		//   36   75:ddiv            
		//   37   76:iload           5
		//   38   78:i2d             
		//   39   79:iconst_1        
		//   40   80:aload_1         
		//   41   81:invokevirtual   #172 <Method int Bitmap.getHeight()>
		//   42   84:invokestatic    #178 <Method int Math.max(int, int)>
		//   43   87:i2d             
		//   44   88:ddiv            
		//   45   89:invokestatic    #182 <Method double Math.min(double, double)>
		//   46   92:dstore_2        
					return Bitmap.createScaledBitmap(bitmap, (int)Math.ceil((double)bitmap.getWidth() * d), (int)Math.ceil((double)bitmap.getHeight() * d), true);
		//   47   93:aload_1         
		//   48   94:aload_1         
		//   49   95:invokevirtual   #169 <Method int Bitmap.getWidth()>
		//   50   98:i2d             
		//   51   99:dload_2         
		//   52  100:dmul            
		//   53  101:invokestatic    #186 <Method double Math.ceil(double)>
		//   54  104:d2i             
		//   55  105:aload_1         
		//   56  106:invokevirtual   #172 <Method int Bitmap.getHeight()>
		//   57  109:i2d             
		//   58  110:dload_2         
		//   59  111:dmul            
		//   60  112:invokestatic    #186 <Method double Math.ceil(double)>
		//   61  115:d2i             
		//   62  116:iconst_1        
		//   63  117:invokestatic    #190 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
		//   64  120:areturn         
				}
			} else
			{
				return bitmap;
		//   65  121:aload_1         
		//   66  122:areturn         
			}
		}

		private void setFlag(int i, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            20
			{
				Notification notification = mNotification;
		//    2    4:aload_0         
		//    3    5:getfield        #104 <Field Notification mNotification>
		//    4    8:astore_3        
				notification.flags = i | notification.flags;
		//    5    9:aload_3         
		//    6   10:iload_1         
		//    7   11:aload_3         
		//    8   12:getfield        #195 <Field int Notification.flags>
		//    9   15:ior             
		//   10   16:putfield        #195 <Field int Notification.flags>
				return;
		//   11   19:return          
			} else
			{
				Notification notification1 = mNotification;
		//   12   20:aload_0         
		//   13   21:getfield        #104 <Field Notification mNotification>
		//   14   24:astore_3        
				notification1.flags = i & notification1.flags;
		//   15   25:aload_3         
		//   16   26:iload_1         
		//   17   27:aload_3         
		//   18   28:getfield        #195 <Field int Notification.flags>
		//   19   31:iand            
		//   20   32:putfield        #195 <Field int Notification.flags>
				return;
		//   21   35:return          
			}
		}

		public Builder addAction(Action action)
		{
			mActions.add(((Object) (action)));
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field ArrayList mActions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Notification build()
		{
			return (new NotificationCompatBuilder(this)).build();
		//    0    0:new             #205 <Class NotificationCompatBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #208 <Method void NotificationCompatBuilder(NotificationCompat$Builder)>
		//    4    8:invokevirtual   #210 <Method Notification NotificationCompatBuilder.build()>
		//    5   11:areturn         
		}

		public RemoteViews getBigContentView()
		{
			return mBigContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #214 <Field RemoteViews mBigContentView>
		//    2    4:areturn         
		}

		public int getColor()
		{
			return mColor;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field int mColor>
		//    2    4:ireturn         
		}

		public RemoteViews getContentView()
		{
			return mContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #219 <Field RemoteViews mContentView>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			if(mExtras == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #223 <Field Bundle mExtras>
		//*   2    4:ifnonnull       18
				mExtras = new Bundle();
		//    3    7:aload_0         
		//    4    8:new             #225 <Class Bundle>
		//    5   11:dup             
		//    6   12:invokespecial   #226 <Method void Bundle()>
		//    7   15:putfield        #223 <Field Bundle mExtras>
			return mExtras;
		//    8   18:aload_0         
		//    9   19:getfield        #223 <Field Bundle mExtras>
		//   10   22:areturn         
		}

		public RemoteViews getHeadsUpContentView()
		{
			return mHeadsUpContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #229 <Field RemoteViews mHeadsUpContentView>
		//    2    4:areturn         
		}

		public int getPriority()
		{
			return mPriority;
		//    0    0:aload_0         
		//    1    1:getfield        #122 <Field int mPriority>
		//    2    4:ireturn         
		}

		public long getWhenIfShowing()
		{
			if(mShowWhen)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field boolean mShowWhen>
		//*   2    4:ifeq            15
				return mNotification.when;
		//    3    7:aload_0         
		//    4    8:getfield        #104 <Field Notification mNotification>
		//    5   11:getfield        #117 <Field long Notification.when>
		//    6   14:lreturn         
			else
				return 0L;
		//    7   15:lconst_0        
		//    8   16:lreturn         
		}

		public Builder setAutoCancel(boolean flag)
		{
			setFlag(16, flag);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:iload_1         
		//    3    4:invokespecial   #235 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public Builder setCategory(String s)
		{
			mCategory = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #239 <Field String mCategory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setChannelId(String s)
		{
			mChannelId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #108 <Field String mChannelId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setColor(int i)
		{
			mColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #93  <Field int mColor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentIntent(PendingIntent pendingintent)
		{
			mContentIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #247 <Field PendingIntent mContentIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentText(CharSequence charsequence)
		{
			mContentText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #253 <Field CharSequence mContentText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentTitle(CharSequence charsequence)
		{
			mContentTitle = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #256 <Field CharSequence mContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setCustomBigContentView(RemoteViews remoteviews)
		{
			mBigContentView = remoteviews;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #214 <Field RemoteViews mBigContentView>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDefaults(int i)
		{
			Notification notification = mNotification;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:astore_2        
			notification.defaults = i;
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:putfield        #262 <Field int Notification.defaults>
			if((i & 4) != 0)
		//*   6   10:iload_1         
		//*   7   11:iconst_4        
		//*   8   12:iand            
		//*   9   13:ifeq            26
				notification.flags = notification.flags | 1;
		//   10   16:aload_2         
		//   11   17:aload_2         
		//   12   18:getfield        #195 <Field int Notification.flags>
		//   13   21:iconst_1        
		//   14   22:ior             
		//   15   23:putfield        #195 <Field int Notification.flags>
			return this;
		//   16   26:aload_0         
		//   17   27:areturn         
		}

		public Builder setDeleteIntent(PendingIntent pendingintent)
		{
			mNotification.deleteIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #266 <Field PendingIntent Notification.deleteIntent>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setLargeIcon(Bitmap bitmap)
		{
			mLargeIcon = reduceLargeIconSize(bitmap);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:invokespecial   #270 <Method Bitmap reduceLargeIconSize(Bitmap)>
		//    4    6:putfield        #272 <Field Bitmap mLargeIcon>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setLocalOnly(boolean flag)
		{
			mLocalOnly = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #91  <Field boolean mLocalOnly>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setNumber(int i)
		{
			mNumber = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #276 <Field int mNumber>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setOnlyAlertOnce(boolean flag)
		{
			setFlag(8, flag);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:iload_1         
		//    3    4:invokespecial   #235 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public Builder setPriority(int i)
		{
			mPriority = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #122 <Field int mPriority>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPublicVersion(Notification notification)
		{
			mPublicVersion = notification;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #282 <Field Notification mPublicVersion>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShowWhen(boolean flag)
		{
			mShowWhen = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #89  <Field boolean mShowWhen>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSmallIcon(int i)
		{
			mNotification.icon = i;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:iload_1         
		//    3    5:putfield        #287 <Field int Notification.icon>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setSound(Uri uri)
		{
			Notification notification = mNotification;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:astore_2        
			notification.sound = uri;
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:putfield        #293 <Field Uri Notification.sound>
			notification.audioStreamType = -1;
		//    6   10:aload_2         
		//    7   11:iconst_m1       
		//    8   12:putfield        #120 <Field int Notification.audioStreamType>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   9   15:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
		//*  10   18:bipush          21
		//*  11   20:icmplt          48
				mNotification.audioAttributes = (new android.media.AudioAttributes.Builder()).setContentType(4).setUsage(5).build();
		//   12   23:aload_0         
		//   13   24:getfield        #104 <Field Notification mNotification>
		//   14   27:new             #295 <Class android.media.AudioAttributes$Builder>
		//   15   30:dup             
		//   16   31:invokespecial   #296 <Method void android.media.AudioAttributes$Builder()>
		//   17   34:iconst_4        
		//   18   35:invokevirtual   #300 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
		//   19   38:iconst_5        
		//   20   39:invokevirtual   #303 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
		//   21   42:invokevirtual   #306 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
		//   22   45:putfield        #310 <Field android.media.AudioAttributes Notification.audioAttributes>
			return this;
		//   23   48:aload_0         
		//   24   49:areturn         
		}

		public Builder setStyle(Style style)
		{
			if(mStyle != style)
		//*   0    0:aload_0         
		//*   1    1:getfield        #314 <Field NotificationCompat$Style mStyle>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       27
			{
				mStyle = style;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #314 <Field NotificationCompat$Style mStyle>
				style = mStyle;
		//    7   13:aload_0         
		//    8   14:getfield        #314 <Field NotificationCompat$Style mStyle>
		//    9   17:astore_1        
				if(style != null)
		//*  10   18:aload_1         
		//*  11   19:ifnull          27
					style.setBuilder(this);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:invokevirtual   #319 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
			}
			return this;
		//   15   27:aload_0         
		//   16   28:areturn         
		}

		public Builder setSubText(CharSequence charsequence)
		{
			mSubText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #322 <Field CharSequence mSubText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setTicker(CharSequence charsequence)
		{
			mNotification.tickerText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    4    8:putfield        #326 <Field CharSequence Notification.tickerText>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder setVibrate(long al[])
		{
			mNotification.vibrate = al;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #332 <Field long[] Notification.vibrate>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setVisibility(int i)
		{
			mVisibility = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #95  <Field int mVisibility>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWhen(long l)
		{
			mNotification.when = l;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field Notification mNotification>
		//    2    4:lload_1         
		//    3    5:putfield        #117 <Field long Notification.when>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public ArrayList mActions;
		int mBadgeIcon;
		RemoteViews mBigContentView;
		String mCategory;
		String mChannelId;
		int mColor;
		boolean mColorized;
		boolean mColorizedSet;
		CharSequence mContentInfo;
		PendingIntent mContentIntent;
		CharSequence mContentText;
		CharSequence mContentTitle;
		RemoteViews mContentView;
		public Context mContext;
		Bundle mExtras;
		PendingIntent mFullScreenIntent;
		int mGroupAlertBehavior;
		String mGroupKey;
		boolean mGroupSummary;
		RemoteViews mHeadsUpContentView;
		ArrayList mInvisibleActions;
		Bitmap mLargeIcon;
		boolean mLocalOnly;
		Notification mNotification;
		int mNumber;
		public ArrayList mPeople;
		int mPriority;
		int mProgress;
		boolean mProgressIndeterminate;
		int mProgressMax;
		Notification mPublicVersion;
		CharSequence mRemoteInputHistory[];
		String mShortcutId;
		boolean mShowWhen;
		String mSortKey;
		Style mStyle;
		CharSequence mSubText;
		RemoteViews mTickerView;
		long mTimeout;
		boolean mUseChronometer;
		int mVisibility;

		public Builder(Context context)
		{
			this(context, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #74  <Method void NotificationCompat$Builder(Context, String)>
		//    4    6:return          
		}

		public Builder(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #80  <Method void Object()>
			mActions = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #82  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #83  <Method void ArrayList()>
		//    6   12:putfield        #85  <Field ArrayList mActions>
			mInvisibleActions = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #82  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #83  <Method void ArrayList()>
		//   11   23:putfield        #87  <Field ArrayList mInvisibleActions>
			mShowWhen = true;
		//   12   26:aload_0         
		//   13   27:iconst_1        
		//   14   28:putfield        #89  <Field boolean mShowWhen>
			mLocalOnly = false;
		//   15   31:aload_0         
		//   16   32:iconst_0        
		//   17   33:putfield        #91  <Field boolean mLocalOnly>
			mColor = 0;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #93  <Field int mColor>
			mVisibility = 0;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #95  <Field int mVisibility>
			mBadgeIcon = 0;
		//   24   46:aload_0         
		//   25   47:iconst_0        
		//   26   48:putfield        #97  <Field int mBadgeIcon>
			mGroupAlertBehavior = 0;
		//   27   51:aload_0         
		//   28   52:iconst_0        
		//   29   53:putfield        #99  <Field int mGroupAlertBehavior>
			mNotification = new Notification();
		//   30   56:aload_0         
		//   31   57:new             #101 <Class Notification>
		//   32   60:dup             
		//   33   61:invokespecial   #102 <Method void Notification()>
		//   34   64:putfield        #104 <Field Notification mNotification>
			mContext = context;
		//   35   67:aload_0         
		//   36   68:aload_1         
		//   37   69:putfield        #106 <Field Context mContext>
			mChannelId = s;
		//   38   72:aload_0         
		//   39   73:aload_2         
		//   40   74:putfield        #108 <Field String mChannelId>
			mNotification.when = System.currentTimeMillis();
		//   41   77:aload_0         
		//   42   78:getfield        #104 <Field Notification mNotification>
		//   43   81:invokestatic    #114 <Method long System.currentTimeMillis()>
		//   44   84:putfield        #117 <Field long Notification.when>
			mNotification.audioStreamType = -1;
		//   45   87:aload_0         
		//   46   88:getfield        #104 <Field Notification mNotification>
		//   47   91:iconst_m1       
		//   48   92:putfield        #120 <Field int Notification.audioStreamType>
			mPriority = 0;
		//   49   95:aload_0         
		//   50   96:iconst_0        
		//   51   97:putfield        #122 <Field int mPriority>
			mPeople = new ArrayList();
		//   52  100:aload_0         
		//   53  101:new             #82  <Class ArrayList>
		//   54  104:dup             
		//   55  105:invokespecial   #83  <Method void ArrayList()>
		//   56  108:putfield        #124 <Field ArrayList mPeople>
		//   57  111:return          
		}
	}

	public static class DecoratedCustomViewStyle extends Style
	{

		private RemoteViews createRemoteViews(RemoteViews remoteviews, boolean flag)
		{
			boolean flag1;
			boolean flag2;
			RemoteViews remoteviews1;
label0:
			{
				int i = android.support.compat.R.layout.notification_template_custom_big;
		//    0    0:getstatic       #20  <Field int android.support.compat.R$layout.notification_template_custom_big>
		//    1    3:istore_3        
				boolean flag3 = true;
		//    2    4:iconst_1        
		//    3    5:istore          6
				flag2 = false;
		//    4    7:iconst_0        
		//    5    8:istore          5
				remoteviews1 = applyStandardTemplate(true, i, false);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:iload_3         
		//    9   13:iconst_0        
		//   10   14:invokevirtual   #24  <Method RemoteViews applyStandardTemplate(boolean, int, boolean)>
		//   11   17:astore          8
				remoteviews1.removeAllViews(android.support.compat.R.id.actions);
		//   12   19:aload           8
		//   13   21:getstatic       #29  <Field int android.support.compat.R$id.actions>
		//   14   24:invokevirtual   #35  <Method void RemoteViews.removeAllViews(int)>
				if(flag && mBuilder.mActions != null)
		//*  15   27:iload_2         
		//*  16   28:ifeq            111
		//*  17   31:aload_0         
		//*  18   32:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//*  19   35:getfield        #45  <Field ArrayList NotificationCompat$Builder.mActions>
		//*  20   38:ifnull          111
				{
					int k = Math.min(mBuilder.mActions.size(), 3);
		//   21   41:aload_0         
		//   22   42:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   23   45:getfield        #45  <Field ArrayList NotificationCompat$Builder.mActions>
		//   24   48:invokevirtual   #51  <Method int ArrayList.size()>
		//   25   51:iconst_3        
		//   26   52:invokestatic    #57  <Method int Math.min(int, int)>
		//   27   55:istore          7
					if(k > 0)
		//*  28   57:iload           7
		//*  29   59:ifle            111
					{
						int j = 0;
		//   30   62:iconst_0        
		//   31   63:istore_3        
						do
						{
							flag1 = flag3;
		//   32   64:iload           6
		//   33   66:istore          4
							if(j >= k)
								break;
		//   34   68:iload_3         
		//   35   69:iload           7
		//   36   71:icmpge          114
							RemoteViews remoteviews2 = generateActionButton((Action)mBuilder.mActions.get(j));
		//   37   74:aload_0         
		//   38   75:aload_0         
		//   39   76:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   40   79:getfield        #45  <Field ArrayList NotificationCompat$Builder.mActions>
		//   41   82:iload_3         
		//   42   83:invokevirtual   #61  <Method Object ArrayList.get(int)>
		//   43   86:checkcast       #63  <Class NotificationCompat$Action>
		//   44   89:invokespecial   #67  <Method RemoteViews generateActionButton(NotificationCompat$Action)>
		//   45   92:astore          9
							remoteviews1.addView(android.support.compat.R.id.actions, remoteviews2);
		//   46   94:aload           8
		//   47   96:getstatic       #29  <Field int android.support.compat.R$id.actions>
		//   48   99:aload           9
		//   49  101:invokevirtual   #71  <Method void RemoteViews.addView(int, RemoteViews)>
							j++;
		//   50  104:iload_3         
		//   51  105:iconst_1        
		//   52  106:iadd            
		//   53  107:istore_3        
						} while(true);
		//   54  108:goto            64
						break label0;
					}
				}
				flag1 = false;
		//   55  111:iconst_0        
		//   56  112:istore          4
			}
			byte byte0;
			if(flag1)
		//*  57  114:iload           4
		//*  58  116:ifeq            125
				byte0 = ((byte) (flag2));
		//   59  119:iload           5
		//   60  121:istore_3        
			else
		//*  61  122:goto            128
				byte0 = 8;
		//   62  125:bipush          8
		//   63  127:istore_3        
			remoteviews1.setViewVisibility(android.support.compat.R.id.actions, ((int) (byte0)));
		//   64  128:aload           8
		//   65  130:getstatic       #29  <Field int android.support.compat.R$id.actions>
		//   66  133:iload_3         
		//   67  134:invokevirtual   #75  <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews1.setViewVisibility(android.support.compat.R.id.action_divider, ((int) (byte0)));
		//   68  137:aload           8
		//   69  139:getstatic       #78  <Field int android.support.compat.R$id.action_divider>
		//   70  142:iload_3         
		//   71  143:invokevirtual   #75  <Method void RemoteViews.setViewVisibility(int, int)>
			buildIntoRemoteViews(remoteviews1, remoteviews);
		//   72  146:aload_0         
		//   73  147:aload           8
		//   74  149:aload_1         
		//   75  150:invokevirtual   #82  <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
			return remoteviews1;
		//   76  153:aload           8
		//   77  155:areturn         
		}

		private RemoteViews generateActionButton(Action action)
		{
			boolean flag;
			if(action.actionIntent == null)
		//*   0    0:aload_1         
		//*   1    1:getfield        #86  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//*   2    4:ifnonnull       12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_2        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_2        
			Object obj = ((Object) (mBuilder.mContext.getPackageName()));
		//    8   14:aload_0         
		//    9   15:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   10   18:getfield        #90  <Field Context NotificationCompat$Builder.mContext>
		//   11   21:invokevirtual   #96  <Method String Context.getPackageName()>
		//   12   24:astore          4
			int i;
			if(flag)
		//*  13   26:iload_2         
		//*  14   27:ifeq            37
				i = android.support.compat.R.layout.notification_action_tombstone;
		//   15   30:getstatic       #99  <Field int android.support.compat.R$layout.notification_action_tombstone>
		//   16   33:istore_3        
			else
		//*  17   34:goto            41
				i = android.support.compat.R.layout.notification_action;
		//   18   37:getstatic       #102 <Field int android.support.compat.R$layout.notification_action>
		//   19   40:istore_3        
			obj = ((Object) (new RemoteViews(((String) (obj)), i)));
		//   20   41:new             #31  <Class RemoteViews>
		//   21   44:dup             
		//   22   45:aload           4
		//   23   47:iload_3         
		//   24   48:invokespecial   #105 <Method void RemoteViews(String, int)>
		//   25   51:astore          4
			((RemoteViews) (obj)).setImageViewBitmap(android.support.compat.R.id.action_image, createColoredBitmap(action.getIcon(), mBuilder.mContext.getResources().getColor(android.support.compat.R.color.notification_action_color_filter)));
		//   26   53:aload           4
		//   27   55:getstatic       #108 <Field int android.support.compat.R$id.action_image>
		//   28   58:aload_0         
		//   29   59:aload_1         
		//   30   60:invokevirtual   #111 <Method int NotificationCompat$Action.getIcon()>
		//   31   63:aload_0         
		//   32   64:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   33   67:getfield        #90  <Field Context NotificationCompat$Builder.mContext>
		//   34   70:invokevirtual   #115 <Method Resources Context.getResources()>
		//   35   73:getstatic       #120 <Field int android.support.compat.R$color.notification_action_color_filter>
		//   36   76:invokevirtual   #126 <Method int Resources.getColor(int)>
		//   37   79:invokevirtual   #130 <Method Bitmap createColoredBitmap(int, int)>
		//   38   82:invokevirtual   #134 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			((RemoteViews) (obj)).setTextViewText(android.support.compat.R.id.action_text, action.title);
		//   39   85:aload           4
		//   40   87:getstatic       #137 <Field int android.support.compat.R$id.action_text>
		//   41   90:aload_1         
		//   42   91:getfield        #141 <Field CharSequence NotificationCompat$Action.title>
		//   43   94:invokevirtual   #145 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(!flag)
		//*  44   97:iload_2         
		//*  45   98:ifne            113
				((RemoteViews) (obj)).setOnClickPendingIntent(android.support.compat.R.id.action_container, action.actionIntent);
		//   46  101:aload           4
		//   47  103:getstatic       #148 <Field int android.support.compat.R$id.action_container>
		//   48  106:aload_1         
		//   49  107:getfield        #86  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//   50  110:invokevirtual   #152 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			if(android.os.Build.VERSION.SDK_INT >= 15)
		//*  51  113:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*  52  116:bipush          15
		//*  53  118:icmplt          133
				((RemoteViews) (obj)).setContentDescription(android.support.compat.R.id.action_container, action.title);
		//   54  121:aload           4
		//   55  123:getstatic       #148 <Field int android.support.compat.R$id.action_container>
		//   56  126:aload_1         
		//   57  127:getfield        #141 <Field CharSequence NotificationCompat$Action.title>
		//   58  130:invokevirtual   #160 <Method void RemoteViews.setContentDescription(int, CharSequence)>
			return ((RemoteViews) (obj));
		//   59  133:aload           4
		//   60  135:areturn         
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          25
				notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (new android.app.Notification.DecoratedCustomViewStyle())));
		//    3    8:aload_1         
		//    4    9:invokeinterface #172 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//    5   14:new             #174 <Class android.app.Notification$DecoratedCustomViewStyle>
		//    6   17:dup             
		//    7   18:invokespecial   #175 <Method void android.app.Notification$DecoratedCustomViewStyle()>
		//    8   21:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
		//    9   24:pop             
		//   10   25:return          
		}

		public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getBigContentView()));
		//    5   10:aload_0         
		//    6   11:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//    7   14:invokevirtual   #188 <Method RemoteViews NotificationCompat$Builder.getBigContentView()>
		//    8   17:astore_1        
			if(notificationbuilderwithbuilderaccessor == null)
		//*   9   18:aload_1         
		//*  10   19:ifnull          25
		//*  11   22:goto            33
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
		//   12   25:aload_0         
		//   13   26:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   14   29:invokevirtual   #191 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   15   32:astore_1        
			if(notificationbuilderwithbuilderaccessor == null)
		//*  16   33:aload_1         
		//*  17   34:ifnonnull       39
				return null;
		//   18   37:aconst_null     
		//   19   38:areturn         
			else
				return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
		//   20   39:aload_0         
		//   21   40:aload_1         
		//   22   41:iconst_1        
		//   23   42:invokespecial   #193 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   24   45:areturn         
		}

		public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			if(mBuilder.getContentView() == null)
		//*   5   10:aload_0         
		//*   6   11:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//*   7   14:invokevirtual   #191 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//*   8   17:ifnonnull       22
				return null;
		//    9   20:aconst_null     
		//   10   21:areturn         
			else
				return createRemoteViews(mBuilder.getContentView(), false);
		//   11   22:aload_0         
		//   12   23:aload_0         
		//   13   24:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   14   27:invokevirtual   #191 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   15   30:iconst_0        
		//   16   31:invokespecial   #193 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   17   34:areturn         
		}

		public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			RemoteViews remoteviews = mBuilder.getHeadsUpContentView();
		//    5   10:aload_0         
		//    6   11:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//    7   14:invokevirtual   #198 <Method RemoteViews NotificationCompat$Builder.getHeadsUpContentView()>
		//    8   17:astore_2        
			if(remoteviews != null)
		//*   9   18:aload_2         
		//*  10   19:ifnull          27
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (remoteviews));
		//   11   22:aload_2         
		//   12   23:astore_1        
			else
		//*  13   24:goto            35
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
		//   14   27:aload_0         
		//   15   28:getfield        #39  <Field NotificationCompat$Builder mBuilder>
		//   16   31:invokevirtual   #191 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   17   34:astore_1        
			if(remoteviews == null)
		//*  18   35:aload_2         
		//*  19   36:ifnonnull       41
				return null;
		//   20   39:aconst_null     
		//   21   40:areturn         
			else
				return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
		//   22   41:aload_0         
		//   23   42:aload_1         
		//   24   43:iconst_1        
		//   25   44:invokespecial   #193 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   26   47:areturn         
		}

		public DecoratedCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}
	}

	public static interface Extender
	{

		public abstract Builder extend(Builder builder);
	}

	public static interface GroupAlertBehavior
		extends Annotation
	{
	}

	public static interface NotificationVisibility
		extends Annotation
	{
	}

	public static interface StreamType
		extends Annotation
	{
	}

	public static abstract class Style
	{

		private int calculateTopPadding()
		{
			Resources resources = mBuilder.mContext.getResources();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
		//    4   10:astore          4
			int i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad);
		//    5   12:aload           4
		//    6   14:getstatic       #47  <Field int android.support.compat.R$dimen.notification_top_pad>
		//    7   17:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//    8   20:istore_2        
			int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_top_pad_large_text);
		//    9   21:aload           4
		//   10   23:getstatic       #56  <Field int android.support.compat.R$dimen.notification_top_pad_large_text>
		//   11   26:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//   12   29:istore_3        
			float f = (constrain(resources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
		//   13   30:aload           4
		//   14   32:invokevirtual   #60  <Method Configuration Resources.getConfiguration()>
		//   15   35:getfield        #66  <Field float Configuration.fontScale>
		//   16   38:fconst_1        
		//   17   39:ldc1            #67  <Float 1.3F>
		//   18   41:invokestatic    #71  <Method float constrain(float, float, float)>
		//   19   44:fconst_1        
		//   20   45:fsub            
		//   21   46:ldc1            #72  <Float 0.3F>
		//   22   48:fdiv            
		//   23   49:fstore_1        
			return Math.round((1.0F - f) * (float)i + f * (float)j);
		//   24   50:fconst_1        
		//   25   51:fload_1         
		//   26   52:fsub            
		//   27   53:iload_2         
		//   28   54:i2f             
		//   29   55:fmul            
		//   30   56:fload_1         
		//   31   57:iload_3         
		//   32   58:i2f             
		//   33   59:fmul            
		//   34   60:fadd            
		//   35   61:invokestatic    #78  <Method int Math.round(float)>
		//   36   64:ireturn         
		}

		private static float constrain(float f, float f1, float f2)
		{
			if(f < f1)
		//*   0    0:fload_0         
		//*   1    1:fload_1         
		//*   2    2:fcmpg           
		//*   3    3:ifge            8
				return f1;
		//    4    6:fload_1         
		//    5    7:freturn         
			f1 = f;
		//    6    8:fload_0         
		//    7    9:fstore_1        
			if(f > f2)
		//*   8   10:fload_0         
		//*   9   11:fload_2         
		//*  10   12:fcmpl           
		//*  11   13:ifle            18
				f1 = f2;
		//   12   16:fload_2         
		//   13   17:fstore_1        
			return f1;
		//   14   18:fload_1         
		//   15   19:freturn         
		}

		private Bitmap createColoredBitmap(int i, int j, int k)
		{
			Drawable drawable = mBuilder.mContext.getResources().getDrawable(i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
		//    4   10:iload_1         
		//    5   11:invokevirtual   #84  <Method Drawable Resources.getDrawable(int)>
		//    6   14:astore          5
			if(k == 0)
		//*   7   16:iload_3         
		//*   8   17:ifne            29
				i = drawable.getIntrinsicWidth();
		//    9   20:aload           5
		//   10   22:invokevirtual   #89  <Method int Drawable.getIntrinsicWidth()>
		//   11   25:istore_1        
			else
		//*  12   26:goto            31
				i = k;
		//   13   29:iload_3         
		//   14   30:istore_1        
			int l = k;
		//   15   31:iload_3         
		//   16   32:istore          4
			if(k == 0)
		//*  17   34:iload_3         
		//*  18   35:ifne            45
				l = drawable.getIntrinsicHeight();
		//   19   38:aload           5
		//   20   40:invokevirtual   #92  <Method int Drawable.getIntrinsicHeight()>
		//   21   43:istore          4
			Bitmap bitmap = Bitmap.createBitmap(i, l, android.graphics.Bitmap.Config.ARGB_8888);
		//   22   45:iload_1         
		//   23   46:iload           4
		//   24   48:getstatic       #98  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//   25   51:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   26   54:astore          6
			drawable.setBounds(0, 0, i, l);
		//   27   56:aload           5
		//   28   58:iconst_0        
		//   29   59:iconst_0        
		//   30   60:iload_1         
		//   31   61:iload           4
		//   32   63:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
			if(j != 0)
		//*  33   66:iload_2         
		//*  34   67:ifeq            89
				drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
		//   35   70:aload           5
		//   36   72:invokevirtual   #112 <Method Drawable Drawable.mutate()>
		//   37   75:new             #114 <Class PorterDuffColorFilter>
		//   38   78:dup             
		//   39   79:iload_2         
		//   40   80:getstatic       #120 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
		//   41   83:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
		//   42   86:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			drawable.draw(new Canvas(bitmap));
		//   43   89:aload           5
		//   44   91:new             #129 <Class Canvas>
		//   45   94:dup             
		//   46   95:aload           6
		//   47   97:invokespecial   #132 <Method void Canvas(Bitmap)>
		//   48  100:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
			return bitmap;
		//   49  103:aload           6
		//   50  105:areturn         
		}

		private Bitmap createIconWithBackground(int i, int j, int k, int l)
		{
			int j1 = android.support.compat.R.drawable.notification_icon_background;
		//    0    0:getstatic       #143 <Field int android.support.compat.R$drawable.notification_icon_background>
		//    1    3:istore          6
			int i1 = l;
		//    2    5:iload           4
		//    3    7:istore          5
			if(l == 0)
		//*   4    9:iload           4
		//*   5   11:ifne            17
				i1 = 0;
		//    6   14:iconst_0        
		//    7   15:istore          5
			Bitmap bitmap = createColoredBitmap(j1, i1, j);
		//    8   17:aload_0         
		//    9   18:iload           6
		//   10   20:iload           5
		//   11   22:iload_2         
		//   12   23:invokespecial   #145 <Method Bitmap createColoredBitmap(int, int, int)>
		//   13   26:astore          7
			Canvas canvas = new Canvas(bitmap);
		//   14   28:new             #129 <Class Canvas>
		//   15   31:dup             
		//   16   32:aload           7
		//   17   34:invokespecial   #132 <Method void Canvas(Bitmap)>
		//   18   37:astore          8
			Drawable drawable = mBuilder.mContext.getResources().getDrawable(i).mutate();
		//   19   39:aload_0         
		//   20   40:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//   21   43:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
		//   22   46:invokevirtual   #41  <Method Resources Context.getResources()>
		//   23   49:iload_1         
		//   24   50:invokevirtual   #84  <Method Drawable Resources.getDrawable(int)>
		//   25   53:invokevirtual   #112 <Method Drawable Drawable.mutate()>
		//   26   56:astore          9
			drawable.setFilterBitmap(true);
		//   27   58:aload           9
		//   28   60:iconst_1        
		//   29   61:invokevirtual   #149 <Method void Drawable.setFilterBitmap(boolean)>
			i = (j - k) / 2;
		//   30   64:iload_2         
		//   31   65:iload_3         
		//   32   66:isub            
		//   33   67:iconst_2        
		//   34   68:idiv            
		//   35   69:istore_1        
			j = k + i;
		//   36   70:iload_3         
		//   37   71:iload_1         
		//   38   72:iadd            
		//   39   73:istore_2        
			drawable.setBounds(i, i, j, j);
		//   40   74:aload           9
		//   41   76:iload_1         
		//   42   77:iload_1         
		//   43   78:iload_2         
		//   44   79:iload_2         
		//   45   80:invokevirtual   #108 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP))));
		//   46   83:aload           9
		//   47   85:new             #114 <Class PorterDuffColorFilter>
		//   48   88:dup             
		//   49   89:iconst_m1       
		//   50   90:getstatic       #152 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
		//   51   93:invokespecial   #123 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
		//   52   96:invokevirtual   #127 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			drawable.draw(canvas);
		//   53   99:aload           9
		//   54  101:aload           8
		//   55  103:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
			return bitmap;
		//   56  106:aload           7
		//   57  108:areturn         
		}

		private void hideNormalContent(RemoteViews remoteviews)
		{
			remoteviews.setViewVisibility(android.support.compat.R.id.title, 8);
		//    0    0:aload_1         
		//    1    1:getstatic       #159 <Field int android.support.compat.R$id.title>
		//    2    4:bipush          8
		//    3    6:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
		//    4    9:aload_1         
		//    5   10:getstatic       #168 <Field int android.support.compat.R$id.text2>
		//    6   13:bipush          8
		//    7   15:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.compat.R.id.text, 8);
		//    8   18:aload_1         
		//    9   19:getstatic       #171 <Field int android.support.compat.R$id.text>
		//   10   22:bipush          8
		//   11   24:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
		//   12   27:return          
		}

		public void addCompatExtras(Bundle bundle)
		{
		//    0    0:return          
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
		//    0    0:return          
		}

		public RemoteViews applyStandardTemplate(boolean flag, int i, boolean flag1)
		{
			boolean flag2;
			int i1;
			boolean flag3;
			Resources resources;
			RemoteViews remoteviews;
label0:
			{
				resources = mBuilder.mContext.getResources();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #41  <Method Resources Context.getResources()>
		//    4   10:astore          8
				remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
		//    5   12:new             #161 <Class RemoteViews>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//    9   20:getfield        #35  <Field Context NotificationCompat$Builder.mContext>
		//   10   23:invokevirtual   #182 <Method String Context.getPackageName()>
		//   11   26:iload_2         
		//   12   27:invokespecial   #185 <Method void RemoteViews(String, int)>
		//   13   30:astore          9
				i = mBuilder.getPriority();
		//   14   32:aload_0         
		//   15   33:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//   16   36:invokevirtual   #188 <Method int NotificationCompat$Builder.getPriority()>
		//   17   39:istore_2        
				flag3 = false;
		//   18   40:iconst_0        
		//   19   41:istore          7
				if(i < -1)
		//*  20   43:iload_2         
		//*  21   44:iconst_m1       
		//*  22   45:icmpge          53
					i = 1;
		//   23   48:iconst_1        
		//   24   49:istore_2        
				else
		//*  25   50:goto            55
					i = 0;
		//   26   53:iconst_0        
		//   27   54:istore_2        
				if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
		//*  28   55:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//*  29   58:bipush          16
		//*  30   60:icmplt          130
		//*  31   63:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//*  32   66:bipush          21
		//*  33   68:icmpge          130
					if(i != 0)
		//*  34   71:iload_2         
		//*  35   72:ifeq            104
					{
						remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg_low);
		//   36   75:aload           9
		//   37   77:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
		//   38   80:ldc1            #198 <String "setBackgroundResource">
		//   39   82:getstatic       #201 <Field int android.support.compat.R$drawable.notification_bg_low>
		//   40   85:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
						remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_low_bg);
		//   41   88:aload           9
		//   42   90:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//   43   93:ldc1            #198 <String "setBackgroundResource">
		//   44   95:getstatic       #211 <Field int android.support.compat.R$drawable.notification_template_icon_low_bg>
		//   45   98:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
					} else
		//*  46  101:goto            130
					{
						remoteviews.setInt(android.support.compat.R.id.notification_background, "setBackgroundResource", android.support.compat.R.drawable.notification_bg);
		//   47  104:aload           9
		//   48  106:getstatic       #196 <Field int android.support.compat.R$id.notification_background>
		//   49  109:ldc1            #198 <String "setBackgroundResource">
		//   50  111:getstatic       #214 <Field int android.support.compat.R$drawable.notification_bg>
		//   51  114:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
						remoteviews.setInt(android.support.compat.R.id.icon, "setBackgroundResource", android.support.compat.R.drawable.notification_template_icon_bg);
		//   52  117:aload           9
		//   53  119:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//   54  122:ldc1            #198 <String "setBackgroundResource">
		//   55  124:getstatic       #217 <Field int android.support.compat.R$drawable.notification_template_icon_bg>
		//   56  127:invokevirtual   #205 <Method void RemoteViews.setInt(int, String, int)>
					}
				if(mBuilder.mLargeIcon != null)
		//*  57  130:aload_0         
		//*  58  131:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//*  59  134:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//*  60  137:ifnull          307
				{
					if(android.os.Build.VERSION.SDK_INT >= 16)
		//*  61  140:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//*  62  143:bipush          16
		//*  63  145:icmplt          175
					{
						remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
		//   64  148:aload           9
		//   65  150:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//   66  153:iconst_0        
		//   67  154:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
						remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, mBuilder.mLargeIcon);
		//   68  157:aload           9
		//   69  159:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//   70  162:aload_0         
		//   71  163:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//   72  166:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   73  169:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					} else
		//*  74  172:goto            185
					{
						remoteviews.setViewVisibility(android.support.compat.R.id.icon, 8);
		//   75  175:aload           9
		//   76  177:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//   77  180:bipush          8
		//   78  182:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					}
					if(flag && mBuilder.mNotification.icon != 0)
		//*  79  185:iload_1         
		//*  80  186:ifeq            435
		//*  81  189:aload_0         
		//*  82  190:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//*  83  193:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//*  84  196:getfield        #232 <Field int Notification.icon>
		//*  85  199:ifeq            435
					{
						i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_right_icon_size);
		//   86  202:aload           8
		//   87  204:getstatic       #235 <Field int android.support.compat.R$dimen.notification_right_icon_size>
		//   88  207:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//   89  210:istore_2        
						int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_background_padding);
		//   90  211:aload           8
		//   91  213:getstatic       #238 <Field int android.support.compat.R$dimen.notification_small_icon_background_padding>
		//   92  216:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//   93  219:istore          5
						if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  94  221:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//*  95  224:bipush          21
		//*  96  226:icmplt          272
						{
							Bitmap bitmap = createIconWithBackground(mBuilder.mNotification.icon, i, i - j * 2, mBuilder.getColor());
		//   97  229:aload_0         
		//   98  230:aload_0         
		//   99  231:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  100  234:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//  101  237:getfield        #232 <Field int Notification.icon>
		//  102  240:iload_2         
		//  103  241:iload_2         
		//  104  242:iload           5
		//  105  244:iconst_2        
		//  106  245:imul            
		//  107  246:isub            
		//  108  247:aload_0         
		//  109  248:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  110  251:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
		//  111  254:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
		//  112  257:astore          10
							remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, bitmap);
		//  113  259:aload           9
		//  114  261:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
		//  115  264:aload           10
		//  116  266:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
						} else
		//* 117  269:goto            295
						{
							remoteviews.setImageViewBitmap(android.support.compat.R.id.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
		//  118  272:aload           9
		//  119  274:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
		//  120  277:aload_0         
		//  121  278:aload_0         
		//  122  279:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  123  282:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//  124  285:getfield        #232 <Field int Notification.icon>
		//  125  288:iconst_m1       
		//  126  289:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
		//  127  292:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
						}
						remoteviews.setViewVisibility(android.support.compat.R.id.right_icon, 0);
		//  128  295:aload           9
		//  129  297:getstatic       #246 <Field int android.support.compat.R$id.right_icon>
		//  130  300:iconst_0        
		//  131  301:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					}
				} else
		//* 132  304:goto            435
				if(flag && mBuilder.mNotification.icon != 0)
		//* 133  307:iload_1         
		//* 134  308:ifeq            435
		//* 135  311:aload_0         
		//* 136  312:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 137  315:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//* 138  318:getfield        #232 <Field int Notification.icon>
		//* 139  321:ifeq            435
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.icon, 0);
		//  140  324:aload           9
		//  141  326:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//  142  329:iconst_0        
		//  143  330:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					if(android.os.Build.VERSION.SDK_INT >= 21)
		//* 144  333:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//* 145  336:bipush          21
		//* 146  338:icmplt          412
					{
						i = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_large_icon_width);
		//  147  341:aload           8
		//  148  343:getstatic       #252 <Field int android.support.compat.R$dimen.notification_large_icon_width>
		//  149  346:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//  150  349:istore_2        
						int k = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_big_circle_margin);
		//  151  350:aload           8
		//  152  352:getstatic       #255 <Field int android.support.compat.R$dimen.notification_big_circle_margin>
		//  153  355:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//  154  358:istore          5
						int l = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_small_icon_size_as_large);
		//  155  360:aload           8
		//  156  362:getstatic       #258 <Field int android.support.compat.R$dimen.notification_small_icon_size_as_large>
		//  157  365:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//  158  368:istore          6
						Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i - k, l, mBuilder.getColor());
		//  159  370:aload_0         
		//  160  371:aload_0         
		//  161  372:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  162  375:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//  163  378:getfield        #232 <Field int Notification.icon>
		//  164  381:iload_2         
		//  165  382:iload           5
		//  166  384:isub            
		//  167  385:iload           6
		//  168  387:aload_0         
		//  169  388:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  170  391:invokevirtual   #241 <Method int NotificationCompat$Builder.getColor()>
		//  171  394:invokespecial   #243 <Method Bitmap createIconWithBackground(int, int, int, int)>
		//  172  397:astore          10
						remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, bitmap1);
		//  173  399:aload           9
		//  174  401:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//  175  404:aload           10
		//  176  406:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					} else
		//* 177  409:goto            435
					{
						remoteviews.setImageViewBitmap(android.support.compat.R.id.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
		//  178  412:aload           9
		//  179  414:getstatic       #208 <Field int android.support.compat.R$id.icon>
		//  180  417:aload_0         
		//  181  418:aload_0         
		//  182  419:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  183  422:getfield        #229 <Field Notification NotificationCompat$Builder.mNotification>
		//  184  425:getfield        #232 <Field int Notification.icon>
		//  185  428:iconst_m1       
		//  186  429:invokevirtual   #249 <Method Bitmap createColoredBitmap(int, int)>
		//  187  432:invokevirtual   #225 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					}
				}
				if(mBuilder.mContentTitle != null)
		//* 188  435:aload_0         
		//* 189  436:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 190  439:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//* 191  442:ifnull          460
					remoteviews.setTextViewText(android.support.compat.R.id.title, mBuilder.mContentTitle);
		//  192  445:aload           9
		//  193  447:getstatic       #159 <Field int android.support.compat.R$id.title>
		//  194  450:aload_0         
		//  195  451:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  196  454:getfield        #261 <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//  197  457:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				if(mBuilder.mContentText != null)
		//* 198  460:aload_0         
		//* 199  461:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 200  464:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
		//* 201  467:ifnull          491
				{
					remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mContentText);
		//  202  470:aload           9
		//  203  472:getstatic       #171 <Field int android.support.compat.R$id.text>
		//  204  475:aload_0         
		//  205  476:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  206  479:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
		//  207  482:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					flag2 = true;
		//  208  485:iconst_1        
		//  209  486:istore          5
				} else
		//* 210  488:goto            494
				{
					flag2 = false;
		//  211  491:iconst_0        
		//  212  492:istore          5
				}
				if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
		//* 213  494:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//* 214  497:bipush          21
		//* 215  499:icmpge          517
		//* 216  502:aload_0         
		//* 217  503:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 218  506:getfield        #221 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//* 219  509:ifnull          517
					i = 1;
		//  220  512:iconst_1        
		//  221  513:istore_2        
				else
		//* 222  514:goto            519
					i = 0;
		//  223  517:iconst_0        
		//  224  518:istore_2        
				if(mBuilder.mContentInfo != null)
		//* 225  519:aload_0         
		//* 226  520:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 227  523:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//* 228  526:ifnull          561
				{
					remoteviews.setTextViewText(android.support.compat.R.id.info, mBuilder.mContentInfo);
		//  229  529:aload           9
		//  230  531:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  231  534:aload_0         
		//  232  535:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  233  538:getfield        #271 <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//  234  541:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
		//  235  544:aload           9
		//  236  546:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  237  549:iconst_0        
		//  238  550:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					flag2 = true;
		//  239  553:iconst_1        
		//  240  554:istore          5
					i = 1;
		//  241  556:iconst_1        
		//  242  557:istore_2        
				} else
		//* 243  558:goto            663
				if(mBuilder.mNumber > 0)
		//* 244  561:aload_0         
		//* 245  562:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 246  565:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
		//* 247  568:ifle            653
				{
					i = resources.getInteger(android.support.compat.R.integer.status_bar_notification_info_maxnum);
		//  248  571:aload           8
		//  249  573:getstatic       #282 <Field int android.support.compat.R$integer.status_bar_notification_info_maxnum>
		//  250  576:invokevirtual   #285 <Method int Resources.getInteger(int)>
		//  251  579:istore_2        
					if(mBuilder.mNumber > i)
		//* 252  580:aload_0         
		//* 253  581:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 254  584:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
		//* 255  587:iload_2         
		//* 256  588:icmple          610
					{
						remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (resources.getString(android.support.compat.R.string.status_bar_notification_info_overflow))));
		//  257  591:aload           9
		//  258  593:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  259  596:aload           8
		//  260  598:getstatic       #290 <Field int android.support.compat.R$string.status_bar_notification_info_overflow>
		//  261  601:invokevirtual   #294 <Method String Resources.getString(int)>
		//  262  604:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					} else
		//* 263  607:goto            636
					{
						NumberFormat numberformat = NumberFormat.getIntegerInstance();
		//  264  610:invokestatic    #300 <Method NumberFormat NumberFormat.getIntegerInstance()>
		//  265  613:astore          10
						remoteviews.setTextViewText(android.support.compat.R.id.info, ((CharSequence) (numberformat.format(mBuilder.mNumber))));
		//  266  615:aload           9
		//  267  617:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  268  620:aload           10
		//  269  622:aload_0         
		//  270  623:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  271  626:getfield        #277 <Field int NotificationCompat$Builder.mNumber>
		//  272  629:i2l             
		//  273  630:invokevirtual   #304 <Method String NumberFormat.format(long)>
		//  274  633:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					}
					remoteviews.setViewVisibility(android.support.compat.R.id.info, 0);
		//  275  636:aload           9
		//  276  638:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  277  641:iconst_0        
		//  278  642:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					flag2 = true;
		//  279  645:iconst_1        
		//  280  646:istore          5
					i = 1;
		//  281  648:iconst_1        
		//  282  649:istore_2        
				} else
		//* 283  650:goto            663
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.info, 8);
		//  284  653:aload           9
		//  285  655:getstatic       #274 <Field int android.support.compat.R$id.info>
		//  286  658:bipush          8
		//  287  660:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				}
				if(mBuilder.mSubText != null && android.os.Build.VERSION.SDK_INT >= 16)
		//* 288  663:aload_0         
		//* 289  664:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 290  667:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
		//* 291  670:ifnull          746
		//* 292  673:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//* 293  676:bipush          16
		//* 294  678:icmplt          746
				{
					remoteviews.setTextViewText(android.support.compat.R.id.text, mBuilder.mSubText);
		//  295  681:aload           9
		//  296  683:getstatic       #171 <Field int android.support.compat.R$id.text>
		//  297  686:aload_0         
		//  298  687:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  299  690:getfield        #307 <Field CharSequence NotificationCompat$Builder.mSubText>
		//  300  693:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					if(mBuilder.mContentText != null)
		//* 301  696:aload_0         
		//* 302  697:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 303  700:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
		//* 304  703:ifnull          736
					{
						remoteviews.setTextViewText(android.support.compat.R.id.text2, mBuilder.mContentText);
		//  305  706:aload           9
		//  306  708:getstatic       #168 <Field int android.support.compat.R$id.text2>
		//  307  711:aload_0         
		//  308  712:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  309  715:getfield        #268 <Field CharSequence NotificationCompat$Builder.mContentText>
		//  310  718:invokevirtual   #265 <Method void RemoteViews.setTextViewText(int, CharSequence)>
						remoteviews.setViewVisibility(android.support.compat.R.id.text2, 0);
		//  311  721:aload           9
		//  312  723:getstatic       #168 <Field int android.support.compat.R$id.text2>
		//  313  726:iconst_0        
		//  314  727:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
						i1 = 1;
		//  315  730:iconst_1        
		//  316  731:istore          6
						break label0;
		//  317  733:goto            749
					}
					remoteviews.setViewVisibility(android.support.compat.R.id.text2, 8);
		//  318  736:aload           9
		//  319  738:getstatic       #168 <Field int android.support.compat.R$id.text2>
		//  320  741:bipush          8
		//  321  743:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
				}
				i1 = 0;
		//  322  746:iconst_0        
		//  323  747:istore          6
			}
			if(i1 && android.os.Build.VERSION.SDK_INT >= 16)
		//* 324  749:iload           6
		//* 325  751:ifeq            800
		//* 326  754:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//* 327  757:bipush          16
		//* 328  759:icmplt          800
			{
				if(flag1)
		//* 329  762:iload_3         
		//* 330  763:ifeq            788
				{
					float f = resources.getDimensionPixelSize(android.support.compat.R.dimen.notification_subtext_size);
		//  331  766:aload           8
		//  332  768:getstatic       #310 <Field int android.support.compat.R$dimen.notification_subtext_size>
		//  333  771:invokevirtual   #53  <Method int Resources.getDimensionPixelSize(int)>
		//  334  774:i2f             
		//  335  775:fstore          4
					remoteviews.setTextViewTextSize(android.support.compat.R.id.text, 0, f);
		//  336  777:aload           9
		//  337  779:getstatic       #171 <Field int android.support.compat.R$id.text>
		//  338  782:iconst_0        
		//  339  783:fload           4
		//  340  785:invokevirtual   #314 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
				}
				remoteviews.setViewPadding(android.support.compat.R.id.line1, 0, 0, 0, 0);
		//  341  788:aload           9
		//  342  790:getstatic       #317 <Field int android.support.compat.R$id.line1>
		//  343  793:iconst_0        
		//  344  794:iconst_0        
		//  345  795:iconst_0        
		//  346  796:iconst_0        
		//  347  797:invokevirtual   #321 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
			}
			if(mBuilder.getWhenIfShowing() != 0L)
		//* 348  800:aload_0         
		//* 349  801:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 350  804:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//* 351  807:lconst_0        
		//* 352  808:lcmp            
		//* 353  809:ifeq            909
			{
				if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
		//* 354  812:aload_0         
		//* 355  813:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//* 356  816:getfield        #328 <Field boolean NotificationCompat$Builder.mUseChronometer>
		//* 357  819:ifeq            880
		//* 358  822:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//* 359  825:bipush          16
		//* 360  827:icmplt          880
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.chronometer, 0);
		//  361  830:aload           9
		//  362  832:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
		//  363  835:iconst_0        
		//  364  836:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setLong(android.support.compat.R.id.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
		//  365  839:aload           9
		//  366  841:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
		//  367  844:ldc2            #333 <String "setBase">
		//  368  847:aload_0         
		//  369  848:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  370  851:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//  371  854:invokestatic    #338 <Method long SystemClock.elapsedRealtime()>
		//  372  857:invokestatic    #343 <Method long System.currentTimeMillis()>
		//  373  860:lsub            
		//  374  861:ladd            
		//  375  862:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
					remoteviews.setBoolean(android.support.compat.R.id.chronometer, "setStarted", true);
		//  376  865:aload           9
		//  377  867:getstatic       #331 <Field int android.support.compat.R$id.chronometer>
		//  378  870:ldc2            #349 <String "setStarted">
		//  379  873:iconst_1        
		//  380  874:invokevirtual   #353 <Method void RemoteViews.setBoolean(int, String, boolean)>
				} else
		//* 381  877:goto            907
				{
					remoteviews.setViewVisibility(android.support.compat.R.id.time, 0);
		//  382  880:aload           9
		//  383  882:getstatic       #356 <Field int android.support.compat.R$id.time>
		//  384  885:iconst_0        
		//  385  886:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setLong(android.support.compat.R.id.time, "setTime", mBuilder.getWhenIfShowing());
		//  386  889:aload           9
		//  387  891:getstatic       #356 <Field int android.support.compat.R$id.time>
		//  388  894:ldc2            #358 <String "setTime">
		//  389  897:aload_0         
		//  390  898:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//  391  901:invokevirtual   #325 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//  392  904:invokevirtual   #347 <Method void RemoteViews.setLong(int, String, long)>
				}
				i = 1;
		//  393  907:iconst_1        
		//  394  908:istore_2        
			}
			i1 = android.support.compat.R.id.right_side;
		//  395  909:getstatic       #361 <Field int android.support.compat.R$id.right_side>
		//  396  912:istore          6
			if(i != 0)
		//* 397  914:iload_2         
		//* 398  915:ifeq            923
				i = 0;
		//  399  918:iconst_0        
		//  400  919:istore_2        
			else
		//* 401  920:goto            926
				i = 8;
		//  402  923:bipush          8
		//  403  925:istore_2        
			remoteviews.setViewVisibility(i1, i);
		//  404  926:aload           9
		//  405  928:iload           6
		//  406  930:iload_2         
		//  407  931:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			i1 = android.support.compat.R.id.line3;
		//  408  934:getstatic       #364 <Field int android.support.compat.R$id.line3>
		//  409  937:istore          6
			if(flag2)
		//* 410  939:iload           5
		//* 411  941:ifeq            950
				i = ((int) (flag3));
		//  412  944:iload           7
		//  413  946:istore_2        
			else
		//* 414  947:goto            953
				i = 8;
		//  415  950:bipush          8
		//  416  952:istore_2        
			remoteviews.setViewVisibility(i1, i);
		//  417  953:aload           9
		//  418  955:iload           6
		//  419  957:iload_2         
		//  420  958:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			return remoteviews;
		//  421  961:aload           9
		//  422  963:areturn         
		}

		public void buildIntoRemoteViews(RemoteViews remoteviews, RemoteViews remoteviews1)
		{
			hideNormalContent(remoteviews);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #368 <Method void hideNormalContent(RemoteViews)>
			remoteviews.removeAllViews(android.support.compat.R.id.notification_main_column);
		//    3    5:aload_1         
		//    4    6:getstatic       #371 <Field int android.support.compat.R$id.notification_main_column>
		//    5    9:invokevirtual   #375 <Method void RemoteViews.removeAllViews(int)>
			remoteviews.addView(android.support.compat.R.id.notification_main_column, remoteviews1.clone());
		//    6   12:aload_1         
		//    7   13:getstatic       #371 <Field int android.support.compat.R$id.notification_main_column>
		//    8   16:aload_2         
		//    9   17:invokevirtual   #379 <Method RemoteViews RemoteViews.clone()>
		//   10   20:invokevirtual   #383 <Method void RemoteViews.addView(int, RemoteViews)>
			remoteviews.setViewVisibility(android.support.compat.R.id.notification_main_column, 0);
		//   11   23:aload_1         
		//   12   24:getstatic       #371 <Field int android.support.compat.R$id.notification_main_column>
		//   13   27:iconst_0        
		//   14   28:invokevirtual   #165 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  15   31:getstatic       #193 <Field int android.os.Build$VERSION.SDK_INT>
		//*  16   34:bipush          21
		//*  17   36:icmplt          53
				remoteviews.setViewPadding(android.support.compat.R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
		//   18   39:aload_1         
		//   19   40:getstatic       #386 <Field int android.support.compat.R$id.notification_main_column_container>
		//   20   43:iconst_0        
		//   21   44:aload_0         
		//   22   45:invokespecial   #388 <Method int calculateTopPadding()>
		//   23   48:iconst_0        
		//   24   49:iconst_0        
		//   25   50:invokevirtual   #321 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		//   26   53:return          
		}

		public Bitmap createColoredBitmap(int i, int j)
		{
			return createColoredBitmap(i, j, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:invokespecial   #145 <Method Bitmap createColoredBitmap(int, int, int)>
		//    5    7:areturn         
		}

		public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void setBuilder(Builder builder)
		{
			if(mBuilder != builder)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       28
			{
				mBuilder = builder;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #29  <Field NotificationCompat$Builder mBuilder>
				builder = mBuilder;
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field NotificationCompat$Builder mBuilder>
		//    9   17:astore_1        
				if(builder != null)
		//*  10   18:aload_1         
		//*  11   19:ifnull          28
					builder.setStyle(this);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:invokevirtual   #398 <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
		//   15   27:pop             
			}
		//   16   28:return          
		}

		CharSequence mBigContentTitle;
		protected Builder mBuilder;
		CharSequence mSummaryText;
		boolean mSummaryTextSet;

		public Style()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mSummaryTextSet = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #24  <Field boolean mSummaryTextSet>
		//    5    9:return          
		}
	}


	public static Bundle getExtras(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #53  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return notification.extras;
	//    3    8:aload_0         
	//    4    9:getfield        #59  <Field Bundle Notification.extras>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   13:getstatic       #53  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          16
	//*   8   18:icmplt          26
			return NotificationCompatJellybean.getExtras(notification);
	//    9   21:aload_0         
	//   10   22:invokestatic    #63  <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}
}
