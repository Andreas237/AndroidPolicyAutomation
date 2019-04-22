// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//			SafeParcelable

public final class SafeParcelableSerializer
{

	public SafeParcelableSerializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static SafeParcelable deserializeFromBytes(byte abyte0[], android.os.Parcelable.Creator creator)
	{
		Preconditions.checkNotNull(((Object) (creator)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Parcel parcel = Parcel.obtain();
	//    3    5:invokestatic    #24  <Method Parcel Parcel.obtain()>
	//    4    8:astore_2        
		parcel.unmarshall(abyte0, 0, abyte0.length);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokevirtual   #28  <Method void Parcel.unmarshall(byte[], int, int)>
		parcel.setDataPosition(0);
	//   11   17:aload_2         
	//   12   18:iconst_0        
	//   13   19:invokevirtual   #32  <Method void Parcel.setDataPosition(int)>
		abyte0 = ((byte []) ((SafeParcelable)creator.createFromParcel(parcel)));
	//   14   22:aload_1         
	//   15   23:aload_2         
	//   16   24:invokeinterface #38  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   29:checkcast       #40  <Class SafeParcelable>
	//   18   32:astore_0        
		parcel.recycle();
	//   19   33:aload_2         
	//   20   34:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((SafeParcelable) (abyte0));
	//   21   37:aload_0         
	//   22   38:areturn         
	}

	public static SafeParcelable deserializeFromIntentExtra(Intent intent, String s, android.os.Parcelable.Creator creator)
	{
		intent = ((Intent) (intent.getByteArrayExtra(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method byte[] Intent.getByteArrayExtra(String)>
	//    3    5:astore_0        
		if(intent == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return deserializeFromBytes(((byte []) (intent)), creator);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokestatic    #55  <Method SafeParcelable deserializeFromBytes(byte[], android.os.Parcelable$Creator)>
	//   11   17:areturn         
	}

	public static SafeParcelable deserializeFromString(String s, android.os.Parcelable.Creator creator)
	{
		return deserializeFromBytes(Base64Utils.decodeUrlSafe(s), creator);
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method byte[] Base64Utils.decodeUrlSafe(String)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #55  <Method SafeParcelable deserializeFromBytes(byte[], android.os.Parcelable$Creator)>
	//    4    8:areturn         
	}

	public static ArrayList deserializeIterableFromBundle(Bundle bundle, String s, android.os.Parcelable.Creator creator)
	{
		s = ((String) ((ArrayList)bundle.getSerializable(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #72  <Method java.io.Serializable Bundle.getSerializable(String)>
	//    3    5:checkcast       #74  <Class ArrayList>
	//    4    8:astore_1        
		if(s == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		bundle = ((Bundle) (new ArrayList(((ArrayList) (s)).size())));
	//    9   15:new             #74  <Class ArrayList>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokevirtual   #78  <Method int ArrayList.size()>
	//   13   23:invokespecial   #80  <Method void ArrayList(int)>
	//   14   26:astore_0        
		s = ((String) ((ArrayList)s));
	//   15   27:aload_1         
	//   16   28:checkcast       #74  <Class ArrayList>
	//   17   31:astore_1        
		int j = ((ArrayList) (s)).size();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #78  <Method int ArrayList.size()>
	//   20   36:istore          4
		for(int i = 0; i < j;)
	//*  21   38:iconst_0        
	//*  22   39:istore_3        
	//*  23   40:iload_3         
	//*  24   41:iload           4
	//*  25   43:icmpge          74
		{
			Object obj = ((ArrayList) (s)).get(i);
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:invokevirtual   #84  <Method Object ArrayList.get(int)>
	//   29   51:astore          5
			i++;
	//   30   53:iload_3         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_3        
			((ArrayList) (bundle)).add(((Object) (deserializeFromBytes((byte[])obj, creator))));
	//   34   57:aload_0         
	//   35   58:aload           5
	//   36   60:checkcast       #86  <Class byte[]>
	//   37   63:aload_2         
	//   38   64:invokestatic    #55  <Method SafeParcelable deserializeFromBytes(byte[], android.os.Parcelable$Creator)>
	//   39   67:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   40   70:pop             
		}

	//*  41   71:goto            40
		return ((ArrayList) (bundle));
	//   42   74:aload_0         
	//   43   75:areturn         
	}

	public static ArrayList deserializeIterableFromIntentExtra(Intent intent, String s, android.os.Parcelable.Creator creator)
	{
		s = ((String) ((ArrayList)intent.getSerializableExtra(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    5:checkcast       #74  <Class ArrayList>
	//    4    8:astore_1        
		if(s == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		intent = ((Intent) (new ArrayList(((ArrayList) (s)).size())));
	//    9   15:new             #74  <Class ArrayList>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokevirtual   #78  <Method int ArrayList.size()>
	//   13   23:invokespecial   #80  <Method void ArrayList(int)>
	//   14   26:astore_0        
		s = ((String) ((ArrayList)s));
	//   15   27:aload_1         
	//   16   28:checkcast       #74  <Class ArrayList>
	//   17   31:astore_1        
		int j = ((ArrayList) (s)).size();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #78  <Method int ArrayList.size()>
	//   20   36:istore          4
		for(int i = 0; i < j;)
	//*  21   38:iconst_0        
	//*  22   39:istore_3        
	//*  23   40:iload_3         
	//*  24   41:iload           4
	//*  25   43:icmpge          74
		{
			Object obj = ((ArrayList) (s)).get(i);
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:invokevirtual   #84  <Method Object ArrayList.get(int)>
	//   29   51:astore          5
			i++;
	//   30   53:iload_3         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_3        
			((ArrayList) (intent)).add(((Object) (deserializeFromBytes((byte[])obj, creator))));
	//   34   57:aload_0         
	//   35   58:aload           5
	//   36   60:checkcast       #86  <Class byte[]>
	//   37   63:aload_2         
	//   38   64:invokestatic    #55  <Method SafeParcelable deserializeFromBytes(byte[], android.os.Parcelable$Creator)>
	//   39   67:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   40   70:pop             
		}

	//*  41   71:goto            40
		return ((ArrayList) (intent));
	//   42   74:aload_0         
	//   43   75:areturn         
	}

	public static void serializeIterableToBundle(Iterable iterable, Bundle bundle, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #74  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void ArrayList()>
	//    3    7:astore_3        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist.add(((Object) (serializeToBytes((SafeParcelable)((Iterator) (iterable)).next())))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #106 <Method Iterator Iterable.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            44
	//   10   24:aload_3         
	//   11   25:aload_0         
	//   12   26:invokeinterface #116 <Method Object Iterator.next()>
	//   13   31:checkcast       #40  <Class SafeParcelable>
	//   14   34:invokestatic    #120 <Method byte[] serializeToBytes(SafeParcelable)>
	//   15   37:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   16   40:pop             
	//*  17   41:goto            15
		bundle.putSerializable(s, ((java.io.Serializable) (arraylist)));
	//   18   44:aload_1         
	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokevirtual   #124 <Method void Bundle.putSerializable(String, java.io.Serializable)>
	//   22   50:return          
	}

	public static void serializeIterableToIntentExtra(Iterable iterable, Intent intent, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #74  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void ArrayList()>
	//    3    7:astore_3        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist.add(((Object) (serializeToBytes((SafeParcelable)((Iterator) (iterable)).next())))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #106 <Method Iterator Iterable.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            44
	//   10   24:aload_3         
	//   11   25:aload_0         
	//   12   26:invokeinterface #116 <Method Object Iterator.next()>
	//   13   31:checkcast       #40  <Class SafeParcelable>
	//   14   34:invokestatic    #120 <Method byte[] serializeToBytes(SafeParcelable)>
	//   15   37:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   16   40:pop             
	//*  17   41:goto            15
		intent.putExtra(s, ((java.io.Serializable) (arraylist)));
	//   18   44:aload_1         
	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokevirtual   #131 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   22   50:pop             
	//   23   51:return          
	}

	public static byte[] serializeToBytes(SafeParcelable safeparcelable)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #24  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		safeparcelable.writeToParcel(parcel, 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokeinterface #136 <Method void SafeParcelable.writeToParcel(Parcel, int)>
		safeparcelable = ((SafeParcelable) (parcel.marshall()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #140 <Method byte[] Parcel.marshall()>
	//    8   16:astore_0        
		parcel.recycle();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #43  <Method void Parcel.recycle()>
		return ((byte []) (safeparcelable));
	//   11   21:aload_0         
	//   12   22:areturn         
	}

	public static void serializeToIntentExtra(SafeParcelable safeparcelable, Intent intent, String s)
	{
		intent.putExtra(s, serializeToBytes(safeparcelable));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:invokestatic    #120 <Method byte[] serializeToBytes(SafeParcelable)>
	//    4    6:invokevirtual   #146 <Method Intent Intent.putExtra(String, byte[])>
	//    5    9:pop             
	//    6   10:return          
	}

	public static String serializeToString(SafeParcelable safeparcelable)
	{
		return Base64Utils.encodeUrlSafe(serializeToBytes(safeparcelable));
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method byte[] serializeToBytes(SafeParcelable)>
	//    2    4:invokestatic    #153 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//    3    7:areturn         
	}
}
