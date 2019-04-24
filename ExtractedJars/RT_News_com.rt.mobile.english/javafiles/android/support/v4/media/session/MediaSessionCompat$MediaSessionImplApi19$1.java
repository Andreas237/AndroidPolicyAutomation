// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.Rating;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompat$MediaSessionImplApi19$1
	implements android.media.r
{

	public void onMetadataUpdate(int i, Object obj)
	{
		if(i == 0x10000001 && (obj instanceof Rating))
	//*   0    0:iload_1         
	//*   1    1:ldc1            #27  <Int 0x10000001>
	//*   2    3:icmpne          26
	//*   3    6:aload_2         
	//*   4    7:instanceof      #29  <Class Rating>
	//*   5   10:ifeq            26
			postToHandler(19, ((Object) (RatingCompat.fromRating(obj))));
	//    6   13:aload_0         
	//    7   14:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi19 this$0>
	//    8   17:bipush          19
	//    9   19:aload_2         
	//   10   20:invokestatic    #35  <Method RatingCompat RatingCompat.fromRating(Object)>
	//   11   23:invokevirtual   #38  <Method void MediaSessionCompat$MediaSessionImplApi19.postToHandler(int, Object)>
	//   12   26:return          
	}

	final MediaSessionCompat.MediaSessionImplApi19 this$0;

	MediaSessionCompat$MediaSessionImplApi19$1()
	{
		this$0 = MediaSessionCompat.MediaSessionImplApi19.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaSessionCompat$MediaSessionImplApi19 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
