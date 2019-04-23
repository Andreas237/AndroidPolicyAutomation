// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

class PlaybackStateCompatApi21
{
	static final class CustomAction
	{

		public static String getAction(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getAction();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #19  <Method String android.media.session.PlaybackState$CustomAction.getAction()>
		//    3    7:areturn         
		}

		public static Bundle getExtras(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getExtras();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #24  <Method Bundle android.media.session.PlaybackState$CustomAction.getExtras()>
		//    3    7:areturn         
		}

		public static int getIcon(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getIcon();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #29  <Method int android.media.session.PlaybackState$CustomAction.getIcon()>
		//    3    7:ireturn         
		}

		public static CharSequence getName(Object obj)
		{
			return ((android.media.session.PlaybackState.CustomAction)obj).getName();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.PlaybackState$CustomAction>
		//    2    4:invokevirtual   #34  <Method CharSequence android.media.session.PlaybackState$CustomAction.getName()>
		//    3    7:areturn         
		}

		public static Object newInstance(String s, CharSequence charsequence, int i, Bundle bundle)
		{
			s = ((String) (new android.media.session.PlaybackState.CustomAction.Builder(s, charsequence, i)));
		//    0    0:new             #38  <Class android.media.session.PlaybackState$CustomAction$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #41  <Method void android.media.session.PlaybackState$CustomAction$Builder(String, CharSequence, int)>
		//    6   10:astore_0        
			((android.media.session.PlaybackState.CustomAction.Builder) (s)).setExtras(bundle);
		//    7   11:aload_0         
		//    8   12:aload_3         
		//    9   13:invokevirtual   #45  <Method android.media.session.PlaybackState$CustomAction$Builder android.media.session.PlaybackState$CustomAction$Builder.setExtras(Bundle)>
		//   10   16:pop             
			return ((Object) (((android.media.session.PlaybackState.CustomAction.Builder) (s)).build()));
		//   11   17:aload_0         
		//   12   18:invokevirtual   #49  <Method android.media.session.PlaybackState$CustomAction android.media.session.PlaybackState$CustomAction$Builder.build()>
		//   13   21:areturn         
		}

		private CustomAction()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private PlaybackStateCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static long getActions(Object obj)
	{
		return ((PlaybackState)obj).getActions();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #22  <Method long PlaybackState.getActions()>
	//    3    7:lreturn         
	}

	public static long getActiveQueueItemId(Object obj)
	{
		return ((PlaybackState)obj).getActiveQueueItemId();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #25  <Method long PlaybackState.getActiveQueueItemId()>
	//    3    7:lreturn         
	}

	public static long getBufferedPosition(Object obj)
	{
		return ((PlaybackState)obj).getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #28  <Method long PlaybackState.getBufferedPosition()>
	//    3    7:lreturn         
	}

	public static List getCustomActions(Object obj)
	{
		return ((PlaybackState)obj).getCustomActions();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #33  <Method List PlaybackState.getCustomActions()>
	//    3    7:areturn         
	}

	public static CharSequence getErrorMessage(Object obj)
	{
		return ((PlaybackState)obj).getErrorMessage();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #40  <Method CharSequence PlaybackState.getErrorMessage()>
	//    3    7:areturn         
	}

	public static long getLastPositionUpdateTime(Object obj)
	{
		return ((PlaybackState)obj).getLastPositionUpdateTime();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #43  <Method long PlaybackState.getLastPositionUpdateTime()>
	//    3    7:lreturn         
	}

	public static float getPlaybackSpeed(Object obj)
	{
		return ((PlaybackState)obj).getPlaybackSpeed();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #48  <Method float PlaybackState.getPlaybackSpeed()>
	//    3    7:freturn         
	}

	public static long getPosition(Object obj)
	{
		return ((PlaybackState)obj).getPosition();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #51  <Method long PlaybackState.getPosition()>
	//    3    7:lreturn         
	}

	public static int getState(Object obj)
	{
		return ((PlaybackState)obj).getState();
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class PlaybackState>
	//    2    4:invokevirtual   #56  <Method int PlaybackState.getState()>
	//    3    7:ireturn         
	}

	public static Object newInstance(int i, long l, long l1, float f, long l2, 
			CharSequence charsequence, long l3, List list, long l4)
	{
		android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
	//    0    0:new             #60  <Class android.media.session.PlaybackState$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void android.media.session.PlaybackState$Builder()>
	//    3    7:astore          14
		builder.setState(i, l, f, l3);
	//    4    9:aload           14
	//    5   11:iload_0         
	//    6   12:lload_1         
	//    7   13:fload           5
	//    8   15:lload           9
	//    9   17:invokevirtual   #65  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setState(int, long, float, long)>
	//   10   20:pop             
		builder.setBufferedPosition(l1);
	//   11   21:aload           14
	//   12   23:lload_3         
	//   13   24:invokevirtual   #69  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setBufferedPosition(long)>
	//   14   27:pop             
		builder.setActions(l2);
	//   15   28:aload           14
	//   16   30:lload           6
	//   17   32:invokevirtual   #72  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setActions(long)>
	//   18   35:pop             
		builder.setErrorMessage(charsequence);
	//   19   36:aload           14
	//   20   38:aload           8
	//   21   40:invokevirtual   #76  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setErrorMessage(CharSequence)>
	//   22   43:pop             
		for(charsequence = ((CharSequence) (list.iterator())); ((Iterator) (charsequence)).hasNext(); builder.addCustomAction((android.media.session.PlaybackState.CustomAction)((Iterator) (charsequence)).next()));
	//   23   44:aload           11
	//   24   46:invokeinterface #82  <Method Iterator List.iterator()>
	//   25   51:astore          8
	//   26   53:aload           8
	//   27   55:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            82
	//   29   63:aload           14
	//   30   65:aload           8
	//   31   67:invokeinterface #92  <Method Object Iterator.next()>
	//   32   72:checkcast       #94  <Class android.media.session.PlaybackState$CustomAction>
	//   33   75:invokevirtual   #98  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.addCustomAction(android.media.session.PlaybackState$CustomAction)>
	//   34   78:pop             
	//*  35   79:goto            53
		builder.setActiveQueueItemId(l4);
	//   36   82:aload           14
	//   37   84:lload           12
	//   38   86:invokevirtual   #101 <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setActiveQueueItemId(long)>
	//   39   89:pop             
		return ((Object) (builder.build()));
	//   40   90:aload           14
	//   41   92:invokevirtual   #105 <Method PlaybackState android.media.session.PlaybackState$Builder.build()>
	//   42   95:areturn         
	}
}
