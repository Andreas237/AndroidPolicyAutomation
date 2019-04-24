// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat

static class MediaSessionCompat$MediaSessionImplApi19 extends MediaSessionCompat$MediaSessionImplApi18
{

	android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
	{
		android.media.RemoteControlClient.MetadataEditor metadataeditor = super.buildRccMetadata(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method android.media.RemoteControlClient$MetadataEditor MediaSessionCompat$MediaSessionImplApi18.buildRccMetadata(Bundle)>
	//    3    5:astore          4
		long l;
		if(mState == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #25  <Field PlaybackStateCompat mState>
	//*   6   11:ifnonnull       19
			l = 0L;
	//    7   14:lconst_0        
	//    8   15:lstore_2        
		else
	//*   9   16:goto            27
			l = mState.getActions();
	//   10   19:aload_0         
	//   11   20:getfield        #25  <Field PlaybackStateCompat mState>
	//   12   23:invokevirtual   #31  <Method long PlaybackStateCompat.getActions()>
	//   13   26:lstore_2        
		if((l & 128L) != 0L)
	//*  14   27:lload_2         
	//*  15   28:ldc2w           #32  <Long 128L>
	//*  16   31:land            
	//*  17   32:lconst_0        
	//*  18   33:lcmp            
	//*  19   34:ifeq            44
			metadataeditor.addEditableKey(0x10000001);
	//   20   37:aload           4
	//   21   39:ldc1            #34  <Int 0x10000001>
	//   22   41:invokevirtual   #40  <Method void android.media.RemoteControlClient$MetadataEditor.addEditableKey(int)>
		if(bundle == null)
	//*  23   44:aload_1         
	//*  24   45:ifnonnull       51
			return metadataeditor;
	//   25   48:aload           4
	//   26   50:areturn         
		if(bundle.containsKey("android.media.metadata.YEAR"))
	//*  27   51:aload_1         
	//*  28   52:ldc1            #42  <String "android.media.metadata.YEAR">
	//*  29   54:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
	//*  30   57:ifeq            74
			metadataeditor.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
	//   31   60:aload           4
	//   32   62:bipush          8
	//   33   64:aload_1         
	//   34   65:ldc1            #42  <String "android.media.metadata.YEAR">
	//   35   67:invokevirtual   #52  <Method long Bundle.getLong(String)>
	//   36   70:invokevirtual   #56  <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//   37   73:pop             
		if(bundle.containsKey("android.media.metadata.RATING"))
	//*  38   74:aload_1         
	//*  39   75:ldc1            #58  <String "android.media.metadata.RATING">
	//*  40   77:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
	//*  41   80:ifeq            97
			((MediaMetadataEditor) (metadataeditor)).putObject(101, ((Object) (bundle.getParcelable("android.media.metadata.RATING"))));
	//   42   83:aload           4
	//   43   85:bipush          101
	//   44   87:aload_1         
	//   45   88:ldc1            #58  <String "android.media.metadata.RATING">
	//   46   90:invokevirtual   #62  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   47   93:invokevirtual   #68  <Method MediaMetadataEditor MediaMetadataEditor.putObject(int, Object)>
	//   48   96:pop             
		if(bundle.containsKey("android.media.metadata.USER_RATING"))
	//*  49   97:aload_1         
	//*  50   98:ldc1            #70  <String "android.media.metadata.USER_RATING">
	//*  51  100:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
	//*  52  103:ifeq            120
			((MediaMetadataEditor) (metadataeditor)).putObject(0x10000001, ((Object) (bundle.getParcelable("android.media.metadata.USER_RATING"))));
	//   53  106:aload           4
	//   54  108:ldc1            #34  <Int 0x10000001>
	//   55  110:aload_1         
	//   56  111:ldc1            #70  <String "android.media.metadata.USER_RATING">
	//   57  113:invokevirtual   #62  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   58  116:invokevirtual   #68  <Method MediaMetadataEditor MediaMetadataEditor.putObject(int, Object)>
	//   59  119:pop             
		return metadataeditor;
	//   60  120:aload           4
	//   61  122:areturn         
	}

	int getRccTransportControlFlagsFromActions(long l)
	{
		int j = super.getRccTransportControlFlagsFromActions(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #74  <Method int MediaSessionCompat$MediaSessionImplApi18.getRccTransportControlFlagsFromActions(long)>
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		if((l & 128L) != 0L)
	//*   6   10:lload_1         
	//*   7   11:ldc2w           #32  <Long 128L>
	//*   8   14:land            
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifeq            27
			i = j | 0x200;
	//   12   20:iload           4
	//   13   22:sipush          512
	//   14   25:ior             
	//   15   26:istore_3        
		return i;
	//   16   27:iload_3         
	//   17   28:ireturn         
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		super.setCallback(callback, handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void MediaSessionCompat$MediaSessionImplApi18.setCallback(MediaSessionCompat$Callback, Handler)>
		if(callback == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       19
		{
			mRcc.setMetadataUpdateListener(((android.media.ner) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field RemoteControlClient mRcc>
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #88  <Method void RemoteControlClient.setMetadataUpdateListener(android.media.RemoteControlClient$OnMetadataUpdateListener)>
			return;
	//   10   18:return          
		} else
		{
			callback = ((MediaSessionCompat.Callback) (new android.media.RemoteControlClient.OnMetadataUpdateListener() {

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
));
	//   11   19:new             #9   <Class MediaSessionCompat$MediaSessionImplApi19$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #91  <Method void MediaSessionCompat$MediaSessionImplApi19$1(MediaSessionCompat$MediaSessionImplApi19)>
	//   15   27:astore_1        
			mRcc.setMetadataUpdateListener(((android.media.ner) (callback)));
	//   16   28:aload_0         
	//   17   29:getfield        #82  <Field RemoteControlClient mRcc>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #88  <Method void RemoteControlClient.setMetadataUpdateListener(android.media.RemoteControlClient$OnMetadataUpdateListener)>
			return;
	//   20   36:return          
		}
	}

	MediaSessionCompat$MediaSessionImplApi19(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
		super(context, s, componentname, pendingintent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #16  <Method void MediaSessionCompat$MediaSessionImplApi18(Context, String, ComponentName, PendingIntent)>
	//    6    9:return          
	}
}
