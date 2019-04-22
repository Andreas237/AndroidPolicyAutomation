// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat

public static final class PlaybackStateCompat$CustomAction
	implements Parcelable
{

	public static PlaybackStateCompat$CustomAction fromCustomAction(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          46
	//*   2    4:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            46
		{
			PlaybackStateCompat$CustomAction playbackstatecompat$customaction = new PlaybackStateCompat$CustomAction(tion.getAction(obj), tion.getName(obj), tion.getIcon(obj), tion.getExtras(obj));
	//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokestatic    #83  <Method String PlaybackStateCompatApi21$CustomAction.getAction(Object)>
	//   10   23:aload_0         
	//   11   24:invokestatic    #87  <Method CharSequence PlaybackStateCompatApi21$CustomAction.getName(Object)>
	//   12   27:aload_0         
	//   13   28:invokestatic    #91  <Method int PlaybackStateCompatApi21$CustomAction.getIcon(Object)>
	//   14   31:aload_0         
	//   15   32:invokestatic    #95  <Method Bundle PlaybackStateCompatApi21$CustomAction.getExtras(Object)>
	//   16   35:invokespecial   #97  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
	//   17   38:astore_1        
			playbackstatecompat$customaction.mCustomActionObj = obj;
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:putfield        #99  <Field Object mCustomActionObj>
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

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #103 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Action:mName='");
	//    4    8:aload_1         
	//    5    9:ldc1            #106 <String "Action:mName='">
	//    6   11:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mName)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #57  <Field CharSequence mName>
	//   11   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", mIcon=");
	//   13   24:aload_1         
	//   14   25:ldc1            #115 <String ", mIcon=">
	//   15   27:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mIcon);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #63  <Field int mIcon>
	//   20   36:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mExtras=");
	//   22   40:aload_1         
	//   23   41:ldc1            #120 <String ", mExtras=">
	//   24   43:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (mExtras)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #69  <Field Bundle mExtras>
	//   29   52:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		return stringbuilder.toString();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   33   60:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mAction);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field String mAction>
	//    3    5:invokevirtual   #128 <Method void Parcel.writeString(String)>
		TextUtils.writeToParcel(mName, parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field CharSequence mName>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokestatic    #131 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeInt(mIcon);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #63  <Field int mIcon>
	//   12   22:invokevirtual   #135 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mExtras);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #69  <Field Bundle mExtras>
	//   16   30:invokevirtual   #139 <Method void Parcel.writeBundle(Bundle)>
	//   17   33:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PlaybackStateCompat.CustomAction createFromParcel(Parcel parcel)
		{
			return new PlaybackStateCompat.CustomAction(parcel);
		//    0    0:new             #9   <Class PlaybackStateCompat$CustomAction>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void PlaybackStateCompat$CustomAction(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method PlaybackStateCompat$CustomAction createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public PlaybackStateCompat.CustomAction[] newArray(int i)
		{
			return new PlaybackStateCompat.CustomAction[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PlaybackStateCompat.CustomAction[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method PlaybackStateCompat$CustomAction[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String mAction;
	private Object mCustomActionObj;
	private final Bundle mExtras;
	private final int mIcon;
	private final CharSequence mName;

	static 
	{
	//    0    0:new             #11  <Class PlaybackStateCompat$CustomAction$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void PlaybackStateCompat$CustomAction$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	PlaybackStateCompat$CustomAction(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mAction = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method String Parcel.readString()>
	//    5    9:putfield        #42  <Field String mAction>
		mName = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #47  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #55  <Class CharSequence>
	//   11   25:putfield        #57  <Field CharSequence mName>
		mIcon = parcel.readInt();
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #61  <Method int Parcel.readInt()>
	//   15   33:putfield        #63  <Field int mIcon>
		mExtras = parcel.readBundle();
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #67  <Method Bundle Parcel.readBundle()>
	//   19   41:putfield        #69  <Field Bundle mExtras>
	//   20   44:return          
	}

	PlaybackStateCompat$CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mAction = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field String mAction>
		mName = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #57  <Field CharSequence mName>
		mIcon = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #63  <Field int mIcon>
		mExtras = bundle;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #69  <Field Bundle mExtras>
	//   14   25:return          
	}
}
