// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.UUID;

public class ContentProtection
{

	public ContentProtection(String s, UUID uuid1, com.google.android.exoplayer.drm.DrmInitData.SchemeInitData schemeinitdata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		schemeUriId = (String)Assertions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #23  <Class String>
	//    6   12:putfield        #25  <Field String schemeUriId>
		uuid = uuid1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #27  <Field UUID uuid>
		data = schemeinitdata;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #29  <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData data>
	//   13   25:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof ContentProtection))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ContentProtection>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((ContentProtection)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ContentProtection>
	//   12   20:astore_1        
		return schemeUriId.equals(((Object) (((ContentProtection) (obj)).schemeUriId))) && Util.areEqual(((Object) (uuid)), ((Object) (((ContentProtection) (obj)).uuid))) && Util.areEqual(((Object) (data)), ((Object) (((ContentProtection) (obj)).data)));
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field String schemeUriId>
	//   15   25:aload_1         
	//   16   26:getfield        #25  <Field String schemeUriId>
	//   17   29:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   18   32:ifeq            65
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field UUID uuid>
	//   21   39:aload_1         
	//   22   40:getfield        #27  <Field UUID uuid>
	//   23   43:invokestatic    #40  <Method boolean Util.areEqual(Object, Object)>
	//   24   46:ifeq            65
	//   25   49:aload_0         
	//   26   50:getfield        #29  <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData data>
	//   27   53:aload_1         
	//   28   54:getfield        #29  <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData data>
	//   29   57:invokestatic    #40  <Method boolean Util.areEqual(Object, Object)>
	//   30   60:ifeq            65
	//   31   63:iconst_1        
	//   32   64:ireturn         
	//   33   65:iconst_0        
	//   34   66:ireturn         
	}

	public int hashCode()
	{
		int k = schemeUriId.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String schemeUriId>
	//    2    4:invokevirtual   #44  <Method int String.hashCode()>
	//    3    7:istore_3        
		Object obj = ((Object) (uuid));
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field UUID uuid>
	//    6   12:astore          4
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		int i;
		if(obj != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          30
			i = ((UUID) (obj)).hashCode();
	//   11   21:aload           4
	//   12   23:invokevirtual   #47  <Method int UUID.hashCode()>
	//   13   26:istore_1        
		else
	//*  14   27:goto            32
			i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_1        
		obj = ((Object) (data));
	//   17   32:aload_0         
	//   18   33:getfield        #29  <Field com.google.android.exoplayer.drm.DrmInitData$SchemeInitData data>
	//   19   36:astore          4
		if(obj != null)
	//*  20   38:aload           4
	//*  21   40:ifnull          49
			j = ((com.google.android.exoplayer.drm.DrmInitData.SchemeInitData) (obj)).hashCode();
	//   22   43:aload           4
	//   23   45:invokevirtual   #50  <Method int com.google.android.exoplayer.drm.DrmInitData$SchemeInitData.hashCode()>
	//   24   48:istore_2        
		return (k * 37 + i) * 37 + j;
	//   25   49:iload_3         
	//   26   50:bipush          37
	//   27   52:imul            
	//   28   53:iload_1         
	//   29   54:iadd            
	//   30   55:bipush          37
	//   31   57:imul            
	//   32   58:iload_2         
	//   33   59:iadd            
	//   34   60:ireturn         
	}

	public final com.google.android.exoplayer.drm.DrmInitData.SchemeInitData data;
	public final String schemeUriId;
	public final UUID uuid;
}
