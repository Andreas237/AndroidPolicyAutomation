// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			FrameworkMediaDrm

class FrameworkMediaDrm$2
	implements android.media.ChangeListener
{

	public void onKeyStatusChange(MediaDrm mediadrm, byte abyte0[], List list, boolean flag)
	{
		mediadrm = ((MediaDrm) (new ArrayList()));
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ArrayList()>
	//    3    7:astore_1        
		android.media.MediaDrm.KeyStatus keystatus;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (mediadrm)).add(((Object) (new eyStatus(keystatus.getStatusCode(), keystatus.getKeyId())))))
	//*   4    8:aload_3         
	//*   5    9:invokeinterface #37  <Method Iterator List.iterator()>
	//*   6   14:astore_3        
	//*   7   15:aload_3         
	//*   8   16:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            62
			keystatus = (android.media.MediaDrm.KeyStatus)((Iterator) (list)).next();
	//   10   24:aload_3         
	//   11   25:invokeinterface #47  <Method Object Iterator.next()>
	//   12   30:checkcast       #49  <Class android.media.MediaDrm$KeyStatus>
	//   13   33:astore          5

	//   14   35:aload_1         
	//   15   36:new             #51  <Class ExoMediaDrm$DefaultKeyStatus>
	//   16   39:dup             
	//   17   40:aload           5
	//   18   42:invokevirtual   #55  <Method int android.media.MediaDrm$KeyStatus.getStatusCode()>
	//   19   45:aload           5
	//   20   47:invokevirtual   #59  <Method byte[] android.media.MediaDrm$KeyStatus.getKeyId()>
	//   21   50:invokespecial   #62  <Method void ExoMediaDrm$DefaultKeyStatus(int, byte[])>
	//   22   53:invokeinterface #66  <Method boolean List.add(Object)>
	//   23   58:pop             
	//*  24   59:goto            15
		val$listener.onKeyStatusChange(((ExoMediaDrm) (FrameworkMediaDrm.this)), abyte0, ((List) (mediadrm)), flag);
	//   25   62:aload_0         
	//   26   63:getfield        #21  <Field ExoMediaDrm$OnKeyStatusChangeListener val$listener>
	//   27   66:aload_0         
	//   28   67:getfield        #19  <Field FrameworkMediaDrm this$0>
	//   29   70:aload_2         
	//   30   71:aload_1         
	//   31   72:iload           4
	//   32   74:invokeinterface #71  <Method void ExoMediaDrm$OnKeyStatusChangeListener.onKeyStatusChange(ExoMediaDrm, byte[], List, boolean)>
	//   33   79:return          
	}

	final FrameworkMediaDrm this$0;
	final tusChangeListener val$listener;

	FrameworkMediaDrm$2()
	{
		this$0 = final_frameworkmediadrm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
		val$listener = tusChangeListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ExoMediaDrm$OnKeyStatusChangeListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
