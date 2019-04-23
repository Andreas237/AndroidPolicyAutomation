// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.media.*;
import com.google.android.exoplayer.util.Assertions;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			ExoMediaDrm, FrameworkMediaCrypto, ExoMediaCrypto

public final class FrameworkMediaDrm
	implements ExoMediaDrm
{

	public FrameworkMediaDrm(UUID uuid)
		throws UnsupportedSchemeException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mediaDrm = new MediaDrm((UUID)Assertions.checkNotNull(((Object) (uuid))));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class MediaDrm>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #33  <Method Object Assertions.checkNotNull(Object)>
	//    7   13:checkcast       #35  <Class UUID>
	//    8   16:invokespecial   #37  <Method void MediaDrm(UUID)>
	//    9   19:putfield        #39  <Field MediaDrm mediaDrm>
	//   10   22:return          
	}

	public void closeSession(byte abyte0[])
	{
		mediaDrm.closeSession(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void MediaDrm.closeSession(byte[])>
	//    4    8:return          
	}

	public volatile ExoMediaCrypto createMediaCrypto(UUID uuid, byte abyte0[])
		throws MediaCryptoException
	{
		return ((ExoMediaCrypto) (createMediaCrypto(uuid, abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #52  <Method FrameworkMediaCrypto createMediaCrypto(UUID, byte[])>
	//    4    6:areturn         
	}

	public FrameworkMediaCrypto createMediaCrypto(UUID uuid, byte abyte0[])
		throws MediaCryptoException
	{
		return new FrameworkMediaCrypto(new MediaCrypto(uuid, abyte0));
	//    0    0:new             #54  <Class FrameworkMediaCrypto>
	//    1    3:dup             
	//    2    4:new             #56  <Class MediaCrypto>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #59  <Method void MediaCrypto(UUID, byte[])>
	//    7   13:invokespecial   #62  <Method void FrameworkMediaCrypto(MediaCrypto)>
	//    8   16:areturn         
	}

	public ExoMediaDrm.KeyRequest getKeyRequest(byte abyte0[], byte abyte1[], String s, int i, HashMap hashmap)
		throws NotProvisionedException
	{
		return new ExoMediaDrm.KeyRequest() {

			public byte[] getData()
			{
				return request.getData();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.media.MediaDrm$KeyRequest val$request>
			//    2    4:invokevirtual   #31  <Method byte[] android.media.MediaDrm$KeyRequest.getData()>
			//    3    7:areturn         
			}

			public String getDefaultUrl()
			{
				return request.getDefaultUrl();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.media.MediaDrm$KeyRequest val$request>
			//    2    4:invokevirtual   #35  <Method String android.media.MediaDrm$KeyRequest.getDefaultUrl()>
			//    3    7:areturn         
			}

			final FrameworkMediaDrm this$0;
			final android.media.MediaDrm.KeyRequest val$request;

			
			{
				this$0 = FrameworkMediaDrm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
				request = keyrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.media.MediaDrm$KeyRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #11  <Class FrameworkMediaDrm$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field MediaDrm mediaDrm>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:iload           4
	//    9   14:aload           5
	//   10   16:invokevirtual   #69  <Method android.media.MediaDrm$KeyRequest MediaDrm.getKeyRequest(byte[], byte[], String, int, HashMap)>
	//   11   19:invokespecial   #72  <Method void FrameworkMediaDrm$2(FrameworkMediaDrm, android.media.MediaDrm$KeyRequest)>
	//   12   22:areturn         
	}

	public byte[] getPropertyByteArray(String s)
	{
		return mediaDrm.getPropertyByteArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method byte[] MediaDrm.getPropertyByteArray(String)>
	//    4    8:areturn         
	}

	public String getPropertyString(String s)
	{
		return mediaDrm.getPropertyString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method String MediaDrm.getPropertyString(String)>
	//    4    8:areturn         
	}

	public ExoMediaDrm.ProvisionRequest getProvisionRequest()
	{
		return new ExoMediaDrm.ProvisionRequest() {

			public byte[] getData()
			{
				return provisionRequest.getData();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
			//    2    4:invokevirtual   #31  <Method byte[] android.media.MediaDrm$ProvisionRequest.getData()>
			//    3    7:areturn         
			}

			public String getDefaultUrl()
			{
				return provisionRequest.getDefaultUrl();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
			//    2    4:invokevirtual   #35  <Method String android.media.MediaDrm$ProvisionRequest.getDefaultUrl()>
			//    3    7:areturn         
			}

			final FrameworkMediaDrm this$0;
			final android.media.MediaDrm.ProvisionRequest val$provisionRequest;

			
			{
				this$0 = FrameworkMediaDrm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
				provisionRequest = provisionrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.media.MediaDrm$ProvisionRequest val$provisionRequest>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #13  <Class FrameworkMediaDrm$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field MediaDrm mediaDrm>
	//    5    9:invokevirtual   #87  <Method android.media.MediaDrm$ProvisionRequest MediaDrm.getProvisionRequest()>
	//    6   12:invokespecial   #90  <Method void FrameworkMediaDrm$3(FrameworkMediaDrm, android.media.MediaDrm$ProvisionRequest)>
	//    7   15:areturn         
	}

	public byte[] openSession()
		throws NotProvisionedException, ResourceBusyException
	{
		return mediaDrm.openSession();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:invokevirtual   #96  <Method byte[] MediaDrm.openSession()>
	//    3    7:areturn         
	}

	public byte[] provideKeyResponse(byte abyte0[], byte abyte1[])
		throws NotProvisionedException, DeniedByServerException
	{
		return mediaDrm.provideKeyResponse(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #102 <Method byte[] MediaDrm.provideKeyResponse(byte[], byte[])>
	//    5    9:areturn         
	}

	public void provideProvisionResponse(byte abyte0[])
		throws DeniedByServerException
	{
		mediaDrm.provideProvisionResponse(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method void MediaDrm.provideProvisionResponse(byte[])>
	//    4    8:return          
	}

	public Map queryKeyStatus(byte abyte0[])
	{
		return ((Map) (mediaDrm.queryKeyStatus(abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method HashMap MediaDrm.queryKeyStatus(byte[])>
	//    4    8:areturn         
	}

	public void release()
	{
		mediaDrm.release();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:invokevirtual   #114 <Method void MediaDrm.release()>
	//    3    7:return          
	}

	public void restoreKeys(byte abyte0[], byte abyte1[])
	{
		mediaDrm.restoreKeys(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #118 <Method void MediaDrm.restoreKeys(byte[], byte[])>
	//    5    9:return          
	}

	public void setOnEventListener(final ExoMediaDrm.OnEventListener listener)
	{
		MediaDrm mediadrm = mediaDrm;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:astore_2        
		if(listener == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			listener = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            24
			listener = ((ExoMediaDrm.OnEventListener) (new android.media.MediaDrm.OnEventListener() {

				public void onEvent(MediaDrm mediadrm1, byte abyte0[], int i, int j, byte abyte1[])
				{
					listener.onEvent(((ExoMediaDrm) (FrameworkMediaDrm.this)), abyte0, i, j, abyte1);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field FrameworkMediaDrm this$0>
				//    4    8:aload_2         
				//    5    9:iload_3         
				//    6   10:iload           4
				//    7   12:aload           5
				//    8   14:invokeinterface #32  <Method void ExoMediaDrm$OnEventListener.onEvent(ExoMediaDrm, byte[], int, int, byte[])>
				//    9   19:return          
				}

				final FrameworkMediaDrm this$0;
				final ExoMediaDrm.OnEventListener val$listener;

			
			{
				this$0 = FrameworkMediaDrm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
				listener = oneventlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//    8   14:new             #9   <Class FrameworkMediaDrm$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #123 <Method void FrameworkMediaDrm$1(FrameworkMediaDrm, ExoMediaDrm$OnEventListener)>
	//   13   23:astore_1        
		mediadrm.setOnEventListener(((android.media.MediaDrm.OnEventListener) (listener)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #126 <Method void MediaDrm.setOnEventListener(android.media.MediaDrm$OnEventListener)>
	//   17   29:return          
	}

	public void setPropertyByteArray(String s, byte abyte0[])
	{
		mediaDrm.setPropertyByteArray(s, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #131 <Method void MediaDrm.setPropertyByteArray(String, byte[])>
	//    5    9:return          
	}

	public void setPropertyString(String s, String s1)
	{
		mediaDrm.setPropertyString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaDrm mediaDrm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #135 <Method void MediaDrm.setPropertyString(String, String)>
	//    5    9:return          
	}

	private final MediaDrm mediaDrm;
}
