// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			u, MediaDescriptionCompat, ae

public class MediaBrowserCompat$MediaItem
	implements Parcelable
{

	public static MediaBrowserCompat$MediaItem a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
	//*   2    4:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            36
		{
			int i = ae.a(obj);
	//    6   15:aload_0         
	//    7   16:invokestatic    #73  <Method int ae.a(Object)>
	//    8   19:istore_1        
			return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.a(ae.b(obj)), i);
	//    9   20:new             #2   <Class MediaBrowserCompat$MediaItem>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokestatic    #76  <Method Object ae.b(Object)>
	//   13   28:invokestatic    #79  <Method MediaDescriptionCompat MediaDescriptionCompat.a(Object)>
	//   14   31:iload_1         
	//   15   32:invokespecial   #81  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
	//   16   35:areturn         
		} else
		{
			return null;
	//   17   36:aconst_null     
	//   18   37:areturn         
		}
	}

	public static List a(List list)
	{
		if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
	//*   2    4:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            66
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    6   15:new             #84  <Class ArrayList>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokeinterface #89  <Method int List.size()>
	//   10   25:invokespecial   #92  <Method void ArrayList(int)>
	//   11   28:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (a(((Iterator) (list)).next())))));
	//   12   29:aload_0         
	//   13   30:invokeinterface #96  <Method Iterator List.iterator()>
	//   14   35:astore_0        
	//   15   36:aload_0         
	//   16   37:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            64
	//   18   45:aload_1         
	//   19   46:aload_0         
	//   20   47:invokeinterface #106 <Method Object Iterator.next()>
	//   21   52:invokestatic    #108 <Method MediaBrowserCompat$MediaItem a(Object)>
	//   22   55:invokeinterface #112 <Method boolean List.add(Object)>
	//   23   60:pop             
	//*  24   61:goto            36
			return ((List) (arraylist));
	//   25   64:aload_1         
	//   26   65:areturn         
		} else
		{
			return null;
	//   27   66:aconst_null     
	//   28   67:areturn         
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("MediaItem{");
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "MediaItem{">
	//    3    6:invokespecial   #119 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("mFlags=");
	//    5   10:aload_1         
	//    6   11:ldc1            #121 <String "mFlags=">
	//    7   13:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(a);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field int a>
	//   12   22:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", mDescription=");
	//   14   26:aload_1         
	//   15   27:ldc1            #130 <String ", mDescription=">
	//   16   29:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(((Object) (b)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #43  <Field MediaDescriptionCompat b>
	//   21   38:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
		stringbuilder.append('}');
	//   23   42:aload_1         
	//   24   43:bipush          125
	//   25   45:invokevirtual   #136 <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field int a>
	//    3    5:invokevirtual   #143 <Method void Parcel.writeInt(int)>
		b.writeToParcel(parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field MediaDescriptionCompat b>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #145 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new u();
	private final int a;
	private final MediaDescriptionCompat b;

	static 
	{
	//    0    0:new             #16  <Class u>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void u()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaBrowserCompat$MediaItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method int Parcel.readInt()>
	//    5    9:putfield        #32  <Field int a>
		b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #35  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #41  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #34  <Class MediaDescriptionCompat>
	//   11   25:putfield        #43  <Field MediaDescriptionCompat b>
	//   12   28:return          
	}

	public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(mediadescriptioncompat != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          39
		{
			if(!TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.a()))))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #47  <Method String MediaDescriptionCompat.a()>
	//*   6   12:invokestatic    #53  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifne            29
			{
				a = i;
	//    8   18:aload_0         
	//    9   19:iload_2         
	//   10   20:putfield        #32  <Field int a>
				b = mediadescriptioncompat;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #43  <Field MediaDescriptionCompat b>
				return;
	//   14   28:return          
			} else
			{
				throw new IllegalArgumentException("description must have a non-empty media id");
	//   15   29:new             #55  <Class IllegalArgumentException>
	//   16   32:dup             
	//   17   33:ldc1            #57  <String "description must have a non-empty media id">
	//   18   35:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   19   38:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("description cannot be null");
	//   20   39:new             #55  <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:ldc1            #62  <String "description cannot be null">
	//   23   45:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		}
	}
}
