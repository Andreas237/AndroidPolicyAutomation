// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//			WebImageCreator

public final class WebImage extends AbstractSafeParcelable
{

	WebImage(int i, Uri uri, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int zzal>
		zzpu = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field Uri zzpu>
		zzps = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #47  <Field int zzps>
		zzpt = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #49  <Field int zzpt>
	//   14   25:return          
	}

	public WebImage(Uri uri)
		throws IllegalArgumentException
	{
		this(uri, 0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #57  <Method void WebImage(Uri, int, int)>
	//    5    7:return          
	}

	public WebImage(Uri uri, int i, int j)
		throws IllegalArgumentException
	{
		this(1, uri, i, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #60  <Method void WebImage(int, Uri, int, int)>
		if(uri == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       22
			throw new IllegalArgumentException("url cannot be null");
	//    8   12:new             #54  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #62  <String "url cannot be null">
	//   11   18:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   12   21:athrow          
		if(i >= 0 && j >= 0)
	//*  13   22:iload_2         
	//*  14   23:iflt            34
	//*  15   26:iload_3         
	//*  16   27:ifge            33
	//*  17   30:goto            34
			return;
	//   18   33:return          
		else
			throw new IllegalArgumentException("width and height must not be negative");
	//   19   34:new             #54  <Class IllegalArgumentException>
	//   20   37:dup             
	//   21   38:ldc1            #67  <String "width and height must not be negative">
	//   22   40:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   23   43:athrow          
	}

	public WebImage(JSONObject jsonobject)
		throws IllegalArgumentException
	{
		this(zza(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method Uri zza(JSONObject)>
	//    3    5:aload_1         
	//    4    6:ldc1            #74  <String "width">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #80  <Method int JSONObject.optInt(String, int)>
	//    7   12:aload_1         
	//    8   13:ldc1            #82  <String "height">
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #80  <Method int JSONObject.optInt(String, int)>
	//   11   19:invokespecial   #57  <Method void WebImage(Uri, int, int)>
	//   12   22:return          
	}

	private static Uri zza(JSONObject jsonobject)
	{
		if(!jsonobject.has("url"))
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_0         
	//    1    1:ldc1            #86  <String "url">
	//    2    3:invokevirtual   #90  <Method boolean JSONObject.has(String)>
	//    3    6:ifeq            21
		jsonobject = ((JSONObject) (Uri.parse(jsonobject.getString("url"))));
	//    4    9:aload_0         
	//    5   10:ldc1            #86  <String "url">
	//    6   12:invokevirtual   #94  <Method String JSONObject.getString(String)>
	//    7   15:invokestatic    #100 <Method Uri Uri.parse(String)>
	//    8   18:astore_0        
		return ((Uri) (jsonobject));
	//    9   19:aload_0         
	//   10   20:areturn         
_L2:
		return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		jsonobject;
	//   13   23:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  14   24:goto            21
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          63
		{
			if(!(obj instanceof WebImage))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class WebImage>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((WebImage)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class WebImage>
	//   14   24:astore_1        
			if(Objects.equal(((Object) (zzpu)), ((Object) (((WebImage) (obj)).zzpu))) && zzps == ((WebImage) (obj)).zzps && zzpt == ((WebImage) (obj)).zzpt)
	//*  15   25:aload_0         
	//*  16   26:getfield        #45  <Field Uri zzpu>
	//*  17   29:aload_1         
	//*  18   30:getfield        #45  <Field Uri zzpu>
	//*  19   33:invokestatic    #108 <Method boolean Objects.equal(Object, Object)>
	//*  20   36:ifeq            63
	//*  21   39:aload_0         
	//*  22   40:getfield        #47  <Field int zzps>
	//*  23   43:aload_1         
	//*  24   44:getfield        #47  <Field int zzps>
	//*  25   47:icmpne          63
	//*  26   50:aload_0         
	//*  27   51:getfield        #49  <Field int zzpt>
	//*  28   54:aload_1         
	//*  29   55:getfield        #49  <Field int zzpt>
	//*  30   58:icmpne          63
				return true;
	//   31   61:iconst_1        
	//   32   62:ireturn         
		}
		return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
	}

	public final int getHeight()
	{
		return zzpt;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int zzpt>
	//    2    4:ireturn         
	}

	public final Uri getUrl()
	{
		return zzpu;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Uri zzpu>
	//    2    4:areturn         
	}

	public final int getWidth()
	{
		return zzps;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int zzps>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzpu, Integer.valueOf(zzps), Integer.valueOf(zzpt)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #45  <Field Uri zzpu>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #47  <Field int zzps>
	//   11   17:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #49  <Field int zzpt>
	//   17   27:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   18   30:aastore         
	//   19   31:invokestatic    #122 <Method int Objects.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #76  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("url", ((Object) (zzpu.toString())));
	//    4    8:aload_1         
	//    5    9:ldc1            #86  <String "url">
	//    6   11:aload_0         
	//    7   12:getfield        #45  <Field Uri zzpu>
	//    8   15:invokevirtual   #129 <Method String Uri.toString()>
	//    9   18:invokevirtual   #133 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
			jsonobject.put("width", zzps);
	//   11   22:aload_1         
	//   12   23:ldc1            #74  <String "width">
	//   13   25:aload_0         
	//   14   26:getfield        #47  <Field int zzps>
	//   15   29:invokevirtual   #136 <Method JSONObject JSONObject.put(String, int)>
	//   16   32:pop             
			jsonobject.put("height", zzpt);
	//   17   33:aload_1         
	//   18   34:ldc1            #82  <String "height">
	//   19   36:aload_0         
	//   20   37:getfield        #49  <Field int zzpt>
	//   21   40:invokevirtual   #136 <Method JSONObject JSONObject.put(String, int)>
	//   22   43:pop             
		}
	//*  23   44:aload_1         
	//*  24   45:areturn         
		catch(JSONException jsonexception)
	//*  25   46:astore_2        
		{
			return jsonobject;
	//   26   47:aload_1         
	//   27   48:areturn         
		}
		return jsonobject;
	}

	public final String toString()
	{
		return String.format(Locale.US, "Image %dx%d %s", new Object[] {
			Integer.valueOf(zzps), Integer.valueOf(zzpt), zzpu.toString()
		});
	//    0    0:getstatic       #142 <Field Locale Locale.US>
	//    1    3:ldc1            #144 <String "Image %dx%d %s">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #47  <Field int zzps>
	//    8   15:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #49  <Field int zzpt>
	//   14   25:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #45  <Field Uri zzpu>
	//   20   35:invokevirtual   #129 <Method String Uri.toString()>
	//   21   38:aastore         
	//   22   39:invokestatic    #150 <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #158 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field int zzal>
	//    7   11:invokestatic    #162 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (getUrl())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #164 <Method Uri getUrl()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #168 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getWidth());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #170 <Method int getWidth()>
	//   19   31:invokestatic    #162 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 4, getHeight());
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #172 <Method int getHeight()>
	//   24   40:invokestatic    #162 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #175 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new WebImageCreator();
	private final int zzal;
	private final int zzps;
	private final int zzpt;
	private final Uri zzpu;

	static 
	{
	//    0    0:new             #31  <Class WebImageCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void WebImageCreator()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
