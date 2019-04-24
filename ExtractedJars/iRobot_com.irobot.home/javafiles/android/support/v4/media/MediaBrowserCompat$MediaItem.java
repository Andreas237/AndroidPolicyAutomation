// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaDescriptionCompat

public static class MediaBrowserCompat$MediaItem
	implements Parcelable
{

	public static MediaBrowserCompat$MediaItem a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
	//*   2    4:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            36
		{
			int i = android.support.v4.media.a.c.a(obj);
	//    6   15:aload_0         
	//    7   16:invokestatic    #77  <Method int a$c.a(Object)>
	//    8   19:istore_1        
			return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.a(android.support.v4.media.a.c.b(obj)), i);
	//    9   20:new             #2   <Class MediaBrowserCompat$MediaItem>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokestatic    #80  <Method Object a$c.b(Object)>
	//   13   28:invokestatic    #83  <Method MediaDescriptionCompat MediaDescriptionCompat.a(Object)>
	//   14   31:iload_1         
	//   15   32:invokespecial   #85  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
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
	//*   2    4:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            66
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    6   15:new             #88  <Class ArrayList>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokeinterface #93  <Method int List.size()>
	//   10   25:invokespecial   #96  <Method void ArrayList(int)>
	//   11   28:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (a(((Iterator) (list)).next())))));
	//   12   29:aload_0         
	//   13   30:invokeinterface #100 <Method Iterator List.iterator()>
	//   14   35:astore_0        
	//   15   36:aload_0         
	//   16   37:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            64
	//   18   45:aload_1         
	//   19   46:aload_0         
	//   20   47:invokeinterface #110 <Method Object Iterator.next()>
	//   21   52:invokestatic    #112 <Method MediaBrowserCompat$MediaItem a(Object)>
	//   22   55:invokeinterface #116 <Method boolean List.add(Object)>
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
	//    0    0:new             #122 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #124 <String "MediaItem{">
	//    3    6:invokespecial   #125 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("mFlags=");
	//    5   10:aload_1         
	//    6   11:ldc1            #127 <String "mFlags=">
	//    7   13:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(a);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field int a>
	//   12   22:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", mDescription=");
	//   14   26:aload_1         
	//   15   27:ldc1            #136 <String ", mDescription=">
	//   16   29:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(((Object) (b)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #47  <Field MediaDescriptionCompat b>
	//   21   38:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
		stringbuilder.append('}');
	//   23   42:aload_1         
	//   24   43:bipush          125
	//   25   45:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int a>
	//    3    5:invokevirtual   #149 <Method void Parcel.writeInt(int)>
		b.writeToParcel(parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field MediaDescriptionCompat b>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #151 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaBrowserCompat.MediaItem a(Parcel parcel)
		{
			return new MediaBrowserCompat.MediaItem(parcel);
		//    0    0:new             #9   <Class MediaBrowserCompat$MediaItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MediaBrowserCompat$MediaItem(Parcel)>
		//    4    8:areturn         
		}

		public MediaBrowserCompat.MediaItem[] a(int i)
		{
			return new MediaBrowserCompat.MediaItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaBrowserCompat.MediaItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method MediaBrowserCompat$MediaItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method MediaBrowserCompat$MediaItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final int a;
	private final MediaDescriptionCompat b;

	static 
	{
	//    0    0:new             #11  <Class MediaBrowserCompat$MediaItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void MediaBrowserCompat$MediaItem$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaBrowserCompat$MediaItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method int Parcel.readInt()>
	//    5    9:putfield        #36  <Field int a>
		b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #39  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #45  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #38  <Class MediaDescriptionCompat>
	//   11   25:putfield        #47  <Field MediaDescriptionCompat b>
	//   12   28:return          
	}

	public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(mediadescriptioncompat == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("description cannot be null");
	//    4    8:new             #50  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #52  <String "description cannot be null">
	//    7   14:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.a()))))
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #58  <Method String MediaDescriptionCompat.a()>
	//*  11   22:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   25:ifeq            38
		{
			throw new IllegalArgumentException("description must have a non-empty media id");
	//   13   28:new             #50  <Class IllegalArgumentException>
	//   14   31:dup             
	//   15   32:ldc1            #66  <String "description must have a non-empty media id">
	//   16   34:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		} else
		{
			a = i;
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:putfield        #36  <Field int a>
			b = mediadescriptioncompat;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #47  <Field MediaDescriptionCompat b>
			return;
	//   24   48:return          
		}
	}
}
