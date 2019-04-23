// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzg

public final class MapStyleOptions extends AbstractSafeParcelable
{

	public MapStyleOptions(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		zzdk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String zzdk>
	//    5    9:return          
	}

	public static MapStyleOptions loadRawResourceStyle(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		context = ((Context) (context.getResources().openRawResource(i)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #59  <Method java.io.InputStream Resources.openRawResource(int)>
	//    4    8:astore_0        
		try
		{
			context = ((Context) (new MapStyleOptions(new String(IOUtils.readInputStreamFully(((java.io.InputStream) (context))), "UTF-8"))));
	//    5    9:new             #2   <Class MapStyleOptions>
	//    6   12:dup             
	//    7   13:new             #61  <Class String>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokestatic    #67  <Method byte[] IOUtils.readInputStreamFully(java.io.InputStream)>
	//   11   21:ldc1            #69  <String "UTF-8">
	//   12   23:invokespecial   #72  <Method void String(byte[], String)>
	//   13   26:invokespecial   #74  <Method void MapStyleOptions(String)>
	//   14   29:astore_0        
		}
	//*  15   30:aload_0         
	//*  16   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  17   32:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (context)))));
	//   18   33:aload_0         
	//   19   34:invokestatic    #78  <Method String String.valueOf(Object)>
	//   20   37:astore_0        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (context))).length() + 37);
	//   21   38:new             #80  <Class StringBuilder>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:invokestatic    #78  <Method String String.valueOf(Object)>
	//   25   46:invokevirtual   #84  <Method int String.length()>
	//   26   49:bipush          37
	//   27   51:iadd            
	//   28   52:invokespecial   #87  <Method void StringBuilder(int)>
	//   29   55:astore_2        
			stringbuilder.append("Failed to read resource ");
	//   30   56:aload_2         
	//   31   57:ldc1            #89  <String "Failed to read resource ">
	//   32   59:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
			stringbuilder.append(i);
	//   34   63:aload_2         
	//   35   64:iload_1         
	//   36   65:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   37   68:pop             
			stringbuilder.append(": ");
	//   38   69:aload_2         
	//   39   70:ldc1            #98  <String ": ">
	//   40   72:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
			stringbuilder.append(((String) (context)));
	//   42   76:aload_2         
	//   43   77:aload_0         
	//   44   78:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   45   81:pop             
			throw new android.content.res.Resources.NotFoundException(stringbuilder.toString());
	//   46   82:new             #45  <Class android.content.res.Resources$NotFoundException>
	//   47   85:dup             
	//   48   86:aload_2         
	//   49   87:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   50   90:invokespecial   #103 <Method void android.content.res.Resources$NotFoundException(String)>
	//   51   93:athrow          
		}
		return ((MapStyleOptions) (context));
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #112 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzdk, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field String zzdk>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #116 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #119 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	private static final String TAG = "MapStyleOptions";
	private String zzdk;

	static 
	{
	//    0    0:new             #27  <Class zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzg()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
