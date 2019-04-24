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
	public static final class Builder
	{

		public PlaybackStateCompat.CustomAction build()
		{
			return new PlaybackStateCompat.CustomAction(mAction, mName, mIcon, mExtras);
		//    0    0:new             #6   <Class PlaybackStateCompat$CustomAction>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #42  <Field String mAction>
		//    4    8:aload_0         
		//    5    9:getfield        #44  <Field CharSequence mName>
		//    6   12:aload_0         
		//    7   13:getfield        #46  <Field int mIcon>
		//    8   16:aload_0         
		//    9   17:getfield        #51  <Field Bundle mExtras>
		//   10   20:invokespecial   #54  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
		//   11   23:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Bundle mExtras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final String mAction;
		private Bundle mExtras;
		private final int mIcon;
		private final CharSequence mName;

		public Builder(String s, CharSequence charsequence, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   4    8:ifeq            21
				throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
		//    5   11:new             #31  <Class IllegalArgumentException>
		//    6   14:dup             
		//    7   15:ldc1            #33  <String "You must specify an action to build a CustomAction.">
		//    8   17:invokespecial   #36  <Method void IllegalArgumentException(String)>
		//    9   20:athrow          
			if(TextUtils.isEmpty(charsequence))
		//*  10   21:aload_2         
		//*  11   22:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  12   25:ifeq            38
				throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
		//   13   28:new             #31  <Class IllegalArgumentException>
		//   14   31:dup             
		//   15   32:ldc1            #38  <String "You must specify a name to build a CustomAction.">
		//   16   34:invokespecial   #36  <Method void IllegalArgumentException(String)>
		//   17   37:athrow          
			if(i == 0)
		//*  18   38:iload_3         
		//*  19   39:ifne            52
			{
				throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
		//   20   42:new             #31  <Class IllegalArgumentException>
		//   21   45:dup             
		//   22   46:ldc1            #40  <String "You must specify an icon resource id to build a CustomAction.">
		//   23   48:invokespecial   #36  <Method void IllegalArgumentException(String)>
		//   24   51:athrow          
			} else
			{
				mAction = s;
		//   25   52:aload_0         
		//   26   53:aload_1         
		//   27   54:putfield        #42  <Field String mAction>
				mName = charsequence;
		//   28   57:aload_0         
		//   29   58:aload_2         
		//   30   59:putfield        #44  <Field CharSequence mName>
				mIcon = i;
		//   31   62:aload_0         
		//   32   63:iload_3         
		//   33   64:putfield        #46  <Field int mIcon>
				return;
		//   34   67:return          
			}
		}
	}


	public static PlaybackStateCompat$CustomAction fromCustomAction(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          46
	//*   2    4:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            46
		{
			PlaybackStateCompat$CustomAction playbackstatecompat$customaction = new PlaybackStateCompat$CustomAction(tion.getAction(obj), tion.getName(obj), tion.getIcon(obj), tion.getExtras(obj));
	//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokestatic    #86  <Method String PlaybackStateCompatApi21$CustomAction.getAction(Object)>
	//   10   23:aload_0         
	//   11   24:invokestatic    #90  <Method CharSequence PlaybackStateCompatApi21$CustomAction.getName(Object)>
	//   12   27:aload_0         
	//   13   28:invokestatic    #94  <Method int PlaybackStateCompatApi21$CustomAction.getIcon(Object)>
	//   14   31:aload_0         
	//   15   32:invokestatic    #98  <Method Bundle PlaybackStateCompatApi21$CustomAction.getExtras(Object)>
	//   16   35:invokespecial   #100 <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
	//   17   38:astore_1        
			playbackstatecompat$customaction.mCustomActionObj = obj;
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:putfield        #102 <Field Object mCustomActionObj>
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

	public String getAction()
	{
		return mAction;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String mAction>
	//    2    4:areturn         
	}

	public Object getCustomAction()
	{
		if(mCustomActionObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field Object mCustomActionObj>
	//*   2    4:ifnonnull       46
	//*   3    7:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            46
		{
			mCustomActionObj = tion.newInstance(mAction, mName, mIcon, mExtras);
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #45  <Field String mAction>
	//   10   23:aload_0         
	//   11   24:getfield        #60  <Field CharSequence mName>
	//   12   27:aload_0         
	//   13   28:getfield        #66  <Field int mIcon>
	//   14   31:aload_0         
	//   15   32:getfield        #72  <Field Bundle mExtras>
	//   16   35:invokestatic    #109 <Method Object PlaybackStateCompatApi21$CustomAction.newInstance(String, CharSequence, int, Bundle)>
	//   17   38:putfield        #102 <Field Object mCustomActionObj>
			return mCustomActionObj;
	//   18   41:aload_0         
	//   19   42:getfield        #102 <Field Object mCustomActionObj>
	//   20   45:areturn         
		} else
		{
			return mCustomActionObj;
	//   21   46:aload_0         
	//   22   47:getfield        #102 <Field Object mCustomActionObj>
	//   23   50:areturn         
		}
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public int getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int mIcon>
	//    2    4:ireturn         
	}

	public CharSequence getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field CharSequence mName>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #113 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Action:mName='");
	//    4    8:aload_1         
	//    5    9:ldc1            #116 <String "Action:mName='">
	//    6   11:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mName)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #60  <Field CharSequence mName>
	//   11   20:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", mIcon=");
	//   13   24:aload_1         
	//   14   25:ldc1            #125 <String ", mIcon=">
	//   15   27:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mIcon);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #66  <Field int mIcon>
	//   20   36:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mExtras=");
	//   22   40:aload_1         
	//   23   41:ldc1            #130 <String ", mExtras=">
	//   24   43:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (mExtras)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #72  <Field Bundle mExtras>
	//   29   52:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		return stringbuilder.toString();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   33   60:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mAction);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field String mAction>
	//    3    5:invokevirtual   #138 <Method void Parcel.writeString(String)>
		TextUtils.writeToParcel(mName, parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field CharSequence mName>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokestatic    #141 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeInt(mIcon);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #66  <Field int mIcon>
	//   12   22:invokevirtual   #145 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mExtras);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #72  <Field Bundle mExtras>
	//   16   30:invokevirtual   #149 <Method void Parcel.writeBundle(Bundle)>
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
	//    2    4:invokespecial   #32  <Method void PlaybackStateCompat$CustomAction$1()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	PlaybackStateCompat$CustomAction(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mAction = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method String Parcel.readString()>
	//    5    9:putfield        #45  <Field String mAction>
		mName = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #50  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #56  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #58  <Class CharSequence>
	//   11   25:putfield        #60  <Field CharSequence mName>
		mIcon = parcel.readInt();
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:invokevirtual   #64  <Method int Parcel.readInt()>
	//   15   33:putfield        #66  <Field int mIcon>
		mExtras = parcel.readBundle();
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #70  <Method Bundle Parcel.readBundle()>
	//   19   41:putfield        #72  <Field Bundle mExtras>
	//   20   44:return          
	}

	PlaybackStateCompat$CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mAction = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field String mAction>
		mName = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field CharSequence mName>
		mIcon = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #66  <Field int mIcon>
		mExtras = bundle;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #72  <Field Bundle mExtras>
	//   14   25:return          
	}
}
