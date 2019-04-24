// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.Channel;

final class zzcq
	implements com.google.android.gms.wearable.ChannelApi.ChannelListener
{

	zzcq(String s, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzaiJ = (String)zzac.zzw(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #23  <Class String>
	//    6   12:putfield        #25  <Field String zzaiJ>
		zzbUQ = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzac.zzw(((Object) (channellistener)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #21  <Method Object zzac.zzw(Object)>
	//   10   20:checkcast       #6   <Class com.google.android.gms.wearable.ChannelApi$ChannelListener>
	//   11   23:putfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//   12   26:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzcq))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzcq>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzcq)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzcq>
	//   12   20:astore_1        
		return ((Object) (zzbUQ)).equals(((Object) (((zzcq) (obj)).zzbUQ))) && zzaiJ.equals(((Object) (((zzcq) (obj)).zzaiJ)));
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//   15   25:aload_1         
	//   16   26:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//   17   29:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field String zzaiJ>
	//   21   39:aload_1         
	//   22   40:getfield        #25  <Field String zzaiJ>
	//   23   43:invokevirtual   #33  <Method boolean String.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public int hashCode()
	{
		return zzaiJ.hashCode() * 31 + ((Object) (zzbUQ)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String zzaiJ>
	//    2    4:invokevirtual   #37  <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//    7   14:invokevirtual   #38  <Method int Object.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public void onChannelClosed(Channel channel, int i, int j)
	{
		zzbUQ.onChannelClosed(channel, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #42  <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onChannelClosed(Channel, int, int)>
	//    6   12:return          
	}

	public void onChannelOpened(Channel channel)
	{
		zzbUQ.onChannelOpened(channel);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onChannelOpened(Channel)>
	//    4   10:return          
	}

	public void onInputClosed(Channel channel, int i, int j)
	{
		zzbUQ.onInputClosed(channel, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #49  <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onInputClosed(Channel, int, int)>
	//    6   12:return          
	}

	public void onOutputClosed(Channel channel, int i, int j)
	{
		zzbUQ.onOutputClosed(channel, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbUQ>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #52  <Method void com.google.android.gms.wearable.ChannelApi$ChannelListener.onOutputClosed(Channel, int, int)>
	//    6   12:return          
	}

	private final String zzaiJ;
	private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzbUQ;
}
