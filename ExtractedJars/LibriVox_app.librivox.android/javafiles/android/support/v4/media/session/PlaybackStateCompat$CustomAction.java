// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//			bo, MediaSessionCompat, bq

public final class PlaybackStateCompat$CustomAction
	implements Parcelable
{

	public static PlaybackStateCompat$CustomAction a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          46
	//*   2    4:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            46
		{
			PlaybackStateCompat$CustomAction playbackstatecompat$customaction = new PlaybackStateCompat$CustomAction(bq.a(obj), bq.b(obj), bq.c(obj), bq.d(obj));
	//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokestatic    #85  <Method String bq.a(Object)>
	//   10   23:aload_0         
	//   11   24:invokestatic    #88  <Method CharSequence bq.b(Object)>
	//   12   27:aload_0         
	//   13   28:invokestatic    #91  <Method int bq.c(Object)>
	//   14   31:aload_0         
	//   15   32:invokestatic    #94  <Method Bundle bq.d(Object)>
	//   16   35:invokespecial   #96  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
	//   17   38:astore_1        
			playbackstatecompat$customaction.e = obj;
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:putfield        #98  <Field Object e>
			return playbackstatecompat$customaction;
	//   21   44:aload_1         
	//   22   45:areturn         
		} else
		{
			return null;
	//   23   46:aconst_null     
	//   24   47:areturn         
		}
	}

	public Object a()
	{
		if(e == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Object e>
	//*   2    4:ifnonnull       46
	//*   3    7:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            46
		{
			e = bq.a(a, b, c, d);
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #38  <Field String a>
	//   10   23:aload_0         
	//   11   24:getfield        #53  <Field CharSequence b>
	//   12   27:aload_0         
	//   13   28:getfield        #59  <Field int c>
	//   14   31:aload_0         
	//   15   32:getfield        #73  <Field Bundle d>
	//   16   35:invokestatic    #102 <Method Object bq.a(String, CharSequence, int, Bundle)>
	//   17   38:putfield        #98  <Field Object e>
			return e;
	//   18   41:aload_0         
	//   19   42:getfield        #98  <Field Object e>
	//   20   45:areturn         
		} else
		{
			return e;
	//   21   46:aload_0         
	//   22   47:getfield        #98  <Field Object e>
	//   23   50:areturn         
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #106 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Action:mName='");
	//    4    8:aload_1         
	//    5    9:ldc1            #109 <String "Action:mName='">
	//    6   11:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (b)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #53  <Field CharSequence b>
	//   11   20:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", mIcon=");
	//   13   24:aload_1         
	//   14   25:ldc1            #118 <String ", mIcon=">
	//   15   27:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(c);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #59  <Field int c>
	//   20   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mExtras=");
	//   22   40:aload_1         
	//   23   41:ldc1            #123 <String ", mExtras=">
	//   24   43:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (d)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #73  <Field Bundle d>
	//   29   52:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		return stringbuilder.toString();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   33   60:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field String a>
	//    3    5:invokevirtual   #131 <Method void Parcel.writeString(String)>
		TextUtils.writeToParcel(b, parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field CharSequence b>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokestatic    #134 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeInt(c);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field int c>
	//   12   22:invokevirtual   #138 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(d);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #73  <Field Bundle d>
	//   16   30:invokevirtual   #142 <Method void Parcel.writeBundle(Bundle)>
	//   17   33:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bo();
	private final String a;
	private final CharSequence b;
	private final int c;
	private final Bundle d;
	private Object e;

	static 
	{
	//    0    0:new             #22  <Class bo>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void bo()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	PlaybackStateCompat$CustomAction(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
	//    5    9:putfield        #38  <Field String a>
		b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #43  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #49  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #51  <Class CharSequence>
	//   11   25:putfield        #53  <Field CharSequence b>
		c = parcel.readInt();
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #57  <Method int Parcel.readInt()>
	//   15   33:putfield        #59  <Field int c>
		d = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:ldc1            #61  <Class MediaSessionCompat>
	//   19   40:invokevirtual   #67  <Method ClassLoader Class.getClassLoader()>
	//   20   43:invokevirtual   #71  <Method Bundle Parcel.readBundle(ClassLoader)>
	//   21   46:putfield        #73  <Field Bundle d>
	//   22   49:return          
	}

	PlaybackStateCompat$CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field String a>
		b = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field CharSequence b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #59  <Field int c>
		d = bundle;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #73  <Field Bundle d>
	//   14   25:return          
	}
}
