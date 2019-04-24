// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionManager

public static final class DefaultDrmSessionManager$MissingSchemeDataException extends Exception
{

	private DefaultDrmSessionManager$MissingSchemeDataException(UUID uuid)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #11  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Media does not support uuid: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #16  <String "Media does not support uuid: ">
	//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (uuid)));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		super(stringbuilder.toString());
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #27  <Method String StringBuilder.toString()>
	//   15   26:invokespecial   #30  <Method void Exception(String)>
	//   16   29:return          
	}

	DefaultDrmSessionManager$MissingSchemeDataException(UUID uuid, DefaultDrmSessionManager._cls1 _pcls1)
	{
		this(uuid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void DefaultDrmSessionManager$MissingSchemeDataException(UUID)>
	//    3    5:return          
	}
}
