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
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
		{
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		} else
		{
			PlaybackStateCompat$CustomAction playbackstatecompat$customaction = new PlaybackStateCompat$CustomAction(tion.getAction(obj), tion.getName(obj), tion.getIcon(obj), tion.getExtras(obj));
	//    7   14:new             #2   <Class PlaybackStateCompat$CustomAction>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokestatic    #86  <Method String PlaybackStateCompatApi21$CustomAction.getAction(Object)>
	//   11   22:aload_0         
	//   12   23:invokestatic    #90  <Method CharSequence PlaybackStateCompatApi21$CustomAction.getName(Object)>
	//   13   26:aload_0         
	//   14   27:invokestatic    #94  <Method int PlaybackStateCompatApi21$CustomAction.getIcon(Object)>
	//   15   30:aload_0         
	//   16   31:invokestatic    #98  <Method Bundle PlaybackStateCompatApi21$CustomAction.getExtras(Object)>
	//   17   34:invokespecial   #100 <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
	//   18   37:astore_1        
			playbackstatecompat$customaction.mCustomActionObj = obj;
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:putfield        #102 <Field Object mCustomActionObj>
			return playbackstatecompat$customaction;
	//   22   43:aload_1         
	//   23   44:areturn         
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
		if(mCustomActionObj != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field Object mCustomActionObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
		{
			return mCustomActionObj;
	//    6   15:aload_0         
	//    7   16:getfield        #102 <Field Object mCustomActionObj>
	//    8   19:areturn         
		} else
		{
			mCustomActionObj = tion.newInstance(mAction, mName, mIcon, mExtras);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #45  <Field String mAction>
	//   12   25:aload_0         
	//   13   26:getfield        #60  <Field CharSequence mName>
	//   14   29:aload_0         
	//   15   30:getfield        #66  <Field int mIcon>
	//   16   33:aload_0         
	//   17   34:getfield        #72  <Field Bundle mExtras>
	//   18   37:invokestatic    #109 <Method Object PlaybackStateCompatApi21$CustomAction.newInstance(String, CharSequence, int, Bundle)>
	//   19   40:putfield        #102 <Field Object mCustomActionObj>
			return mCustomActionObj;
	//   20   43:aload_0         
	//   21   44:getfield        #102 <Field Object mCustomActionObj>
	//   22   47:areturn         
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
		return (new StringBuilder()).append("Action:mName='").append(((Object) (mName))).append(", mIcon=").append(mIcon).append(", mExtras=").append(((Object) (mExtras))).toString();
	//    0    0:new             #113 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:ldc1            #116 <String "Action:mName='">
	//    4    9:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #60  <Field CharSequence mName>
	//    7   16:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #125 <String ", mIcon=">
	//    9   21:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #66  <Field int mIcon>
	//   12   28:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #130 <String ", mExtras=">
	//   14   33:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #72  <Field Bundle mExtras>
	//   17   40:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   19   46:areturn         
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
