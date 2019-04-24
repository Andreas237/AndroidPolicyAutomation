// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

class PlaybackStateCompatApi22
{

	PlaybackStateCompatApi22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Bundle getExtras(Object obj)
	{
		return ((PlaybackState)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class PlaybackState>
	//    2    4:invokevirtual   #19  <Method Bundle PlaybackState.getExtras()>
	//    3    7:areturn         
	}

	public static Object newInstance(int i, long l, long l1, float f, long l2, 
			CharSequence charsequence, long l3, List list, long l4, Bundle bundle)
	{
		android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
	//    0    0:new             #23  <Class android.media.session.PlaybackState$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void android.media.session.PlaybackState$Builder()>
	//    3    7:astore          15
		builder.setState(i, l, f, l3);
	//    4    9:aload           15
	//    5   11:iload_0         
	//    6   12:lload_1         
	//    7   13:fload           5
	//    8   15:lload           9
	//    9   17:invokevirtual   #28  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setState(int, long, float, long)>
	//   10   20:pop             
		builder.setBufferedPosition(l1);
	//   11   21:aload           15
	//   12   23:lload_3         
	//   13   24:invokevirtual   #32  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setBufferedPosition(long)>
	//   14   27:pop             
		builder.setActions(l2);
	//   15   28:aload           15
	//   16   30:lload           6
	//   17   32:invokevirtual   #35  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setActions(long)>
	//   18   35:pop             
		builder.setErrorMessage(charsequence);
	//   19   36:aload           15
	//   20   38:aload           8
	//   21   40:invokevirtual   #39  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setErrorMessage(CharSequence)>
	//   22   43:pop             
		for(charsequence = ((CharSequence) (list.iterator())); ((Iterator) (charsequence)).hasNext(); builder.addCustomAction((android.media.session.PlaybackState.CustomAction)((Iterator) (charsequence)).next()));
	//   23   44:aload           11
	//   24   46:invokeinterface #45  <Method Iterator List.iterator()>
	//   25   51:astore          8
	//   26   53:aload           8
	//   27   55:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            82
	//   29   63:aload           15
	//   30   65:aload           8
	//   31   67:invokeinterface #55  <Method Object Iterator.next()>
	//   32   72:checkcast       #57  <Class android.media.session.PlaybackState$CustomAction>
	//   33   75:invokevirtual   #61  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.addCustomAction(android.media.session.PlaybackState$CustomAction)>
	//   34   78:pop             
	//*  35   79:goto            53
		builder.setActiveQueueItemId(l4);
	//   36   82:aload           15
	//   37   84:lload           12
	//   38   86:invokevirtual   #64  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setActiveQueueItemId(long)>
	//   39   89:pop             
		builder.setExtras(bundle);
	//   40   90:aload           15
	//   41   92:aload           14
	//   42   94:invokevirtual   #68  <Method android.media.session.PlaybackState$Builder android.media.session.PlaybackState$Builder.setExtras(Bundle)>
	//   43   97:pop             
		return ((Object) (builder.build()));
	//   44   98:aload           15
	//   45  100:invokevirtual   #72  <Method PlaybackState android.media.session.PlaybackState$Builder.build()>
	//   46  103:areturn         
	}
}
