// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.util.zzp;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzg

public final class MapStyleOptions extends zza
{

	public MapStyleOptions(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzbpA = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field String zzbpA>
	//    5    9:return          
	}

	public static MapStyleOptions loadRawResourceStyle(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		context = ((Context) (context.getResources().openRawResource(i)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #50  <Method java.io.InputStream Resources.openRawResource(int)>
	//    4    8:astore_0        
		try
		{
			context = ((Context) (new MapStyleOptions(new String(zzp.zzj(((java.io.InputStream) (context))), "UTF-8"))));
	//    5    9:new             #2   <Class MapStyleOptions>
	//    6   12:dup             
	//    7   13:new             #52  <Class String>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokestatic    #58  <Method byte[] zzp.zzj(java.io.InputStream)>
	//   11   21:ldc1            #60  <String "UTF-8">
	//   12   23:invokespecial   #63  <Method void String(byte[], String)>
	//   13   26:invokespecial   #65  <Method void MapStyleOptions(String)>
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
	//   19   34:invokestatic    #69  <Method String String.valueOf(Object)>
	//   20   37:astore_0        
			throw new android.content.res.Resources.NotFoundException((new StringBuilder(String.valueOf(((Object) (context))).length() + 37)).append("Failed to read resource ").append(i).append(": ").append(((String) (context))).toString());
	//   21   38:new             #36  <Class android.content.res.Resources$NotFoundException>
	//   22   41:dup             
	//   23   42:new             #71  <Class StringBuilder>
	//   24   45:dup             
	//   25   46:aload_0         
	//   26   47:invokestatic    #69  <Method String String.valueOf(Object)>
	//   27   50:invokevirtual   #75  <Method int String.length()>
	//   28   53:bipush          37
	//   29   55:iadd            
	//   30   56:invokespecial   #78  <Method void StringBuilder(int)>
	//   31   59:ldc1            #80  <String "Failed to read resource ">
	//   32   61:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:iload_1         
	//   34   65:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   35   68:ldc1            #89  <String ": ">
	//   36   70:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   40   80:invokespecial   #93  <Method void android.content.res.Resources$NotFoundException(String)>
	//   41   83:athrow          
		}
		return ((MapStyleOptions) (context));
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzg.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #100 <Method void com.google.android.gms.maps.model.zzg.zza(MapStyleOptions, Parcel, int)>
	//    4    6:return          
	}

	public String zzJL()
	{
		return zzbpA;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String zzbpA>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	private static final String TAG = ((Class) (com/google/android/gms/maps/model/MapStyleOptions)).getSimpleName();
	private String zzbpA;

	static 
	{
	//    0    0:ldc1            #2   <Class MapStyleOptions>
	//    1    2:invokevirtual   #18  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #20  <Field String TAG>
	//    3    8:new             #22  <Class zzg>
	//    4   11:dup             
	//    5   12:invokespecial   #25  <Method void zzg()>
	//    6   15:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   18:return          
	}
}
