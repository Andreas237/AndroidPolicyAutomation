// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompatApi21, PlaybackStateCompatApi22

public final class PlaybackStateCompat
	implements Parcelable
{
	public static interface Actions
		extends Annotation
	{
	}

	public static final class Builder
	{

		public Builder addCustomAction(CustomAction customaction)
		{
			if(customaction == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
			{
				throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
		//    2    4:new             #81  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #83  <String "You may not add a null CustomAction to PlaybackStateCompat.">
		//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			} else
			{
				mCustomActions.add(((Object) (customaction)));
		//    7   14:aload_0         
		//    8   15:getfield        #34  <Field List mCustomActions>
		//    9   18:aload_1         
		//   10   19:invokeinterface #90  <Method boolean List.add(Object)>
		//   11   24:pop             
				return this;
		//   12   25:aload_0         
		//   13   26:areturn         
			}
		}

		public Builder addCustomAction(String s, String s1, int i)
		{
			return addCustomAction(new CustomAction(s, ((CharSequence) (s1)), i, ((Bundle) (null))));
		//    0    0:aload_0         
		//    1    1:new             #93  <Class PlaybackStateCompat$CustomAction>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:iload_3         
		//    6    8:aconst_null     
		//    7    9:invokespecial   #96  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
		//    8   12:invokevirtual   #98  <Method PlaybackStateCompat$Builder addCustomAction(PlaybackStateCompat$CustomAction)>
		//    9   15:areturn         
		}

		public PlaybackStateCompat build()
		{
			return new PlaybackStateCompat(mState, mPosition, mBufferedPosition, mRate, mActions, mErrorCode, mErrorMessage, mUpdateTime, mCustomActions, mActiveItemId, mExtras);
		//    0    0:new             #6   <Class PlaybackStateCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #43  <Field int mState>
		//    4    8:aload_0         
		//    5    9:getfield        #46  <Field long mPosition>
		//    6   12:aload_0         
		//    7   13:getfield        #57  <Field long mBufferedPosition>
		//    8   16:aload_0         
		//    9   17:getfield        #51  <Field float mRate>
		//   10   20:aload_0         
		//   11   21:getfield        #60  <Field long mActions>
		//   12   24:aload_0         
		//   13   25:getfield        #63  <Field int mErrorCode>
		//   14   28:aload_0         
		//   15   29:getfield        #66  <Field CharSequence mErrorMessage>
		//   16   32:aload_0         
		//   17   33:getfield        #54  <Field long mUpdateTime>
		//   18   36:aload_0         
		//   19   37:getfield        #34  <Field List mCustomActions>
		//   20   40:aload_0         
		//   21   41:getfield        #38  <Field long mActiveItemId>
		//   22   44:aload_0         
		//   23   45:getfield        #77  <Field Bundle mExtras>
		//   24   48:invokespecial   #103 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
		//   25   51:areturn         
		}

		public Builder setActions(long l)
		{
			mActions = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #60  <Field long mActions>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setActiveQueueItemId(long l)
		{
			mActiveItemId = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #38  <Field long mActiveItemId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBufferedPosition(long l)
		{
			mBufferedPosition = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #57  <Field long mBufferedPosition>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setErrorMessage(int i, CharSequence charsequence)
		{
			mErrorCode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #63  <Field int mErrorCode>
			mErrorMessage = charsequence;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #66  <Field CharSequence mErrorMessage>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public Builder setErrorMessage(CharSequence charsequence)
		{
			mErrorMessage = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field CharSequence mErrorMessage>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field Bundle mExtras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setState(int i, long l, float f)
		{
			return setState(i, l, f, SystemClock.elapsedRealtime());
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:lload_2         
		//    3    3:fload           4
		//    4    5:invokestatic    #120 <Method long SystemClock.elapsedRealtime()>
		//    5    8:invokevirtual   #123 <Method PlaybackStateCompat$Builder setState(int, long, float, long)>
		//    6   11:areturn         
		}

		public Builder setState(int i, long l, float f, long l1)
		{
			mState = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #43  <Field int mState>
			mPosition = l;
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:putfield        #46  <Field long mPosition>
			mUpdateTime = l1;
		//    6   10:aload_0         
		//    7   11:lload           5
		//    8   13:putfield        #54  <Field long mUpdateTime>
			mRate = f;
		//    9   16:aload_0         
		//   10   17:fload           4
		//   11   19:putfield        #51  <Field float mRate>
			return this;
		//   12   22:aload_0         
		//   13   23:areturn         
		}

		private long mActions;
		private long mActiveItemId;
		private long mBufferedPosition;
		private final List mCustomActions;
		private int mErrorCode;
		private CharSequence mErrorMessage;
		private Bundle mExtras;
		private long mPosition;
		private float mRate;
		private int mState;
		private long mUpdateTime;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			mCustomActions = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #31  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #32  <Method void ArrayList()>
		//    6   12:putfield        #34  <Field List mCustomActions>
			mActiveItemId = -1L;
		//    7   15:aload_0         
		//    8   16:ldc2w           #35  <Long -1L>
		//    9   19:putfield        #38  <Field long mActiveItemId>
		//   10   22:return          
		}

		public Builder(PlaybackStateCompat playbackstatecompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			mCustomActions = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #31  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #32  <Method void ArrayList()>
		//    6   12:putfield        #34  <Field List mCustomActions>
			mActiveItemId = -1L;
		//    7   15:aload_0         
		//    8   16:ldc2w           #35  <Long -1L>
		//    9   19:putfield        #38  <Field long mActiveItemId>
			mState = playbackstatecompat.mState;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:getfield        #42  <Field int PlaybackStateCompat.mState>
		//   13   27:putfield        #43  <Field int mState>
			mPosition = playbackstatecompat.mPosition;
		//   14   30:aload_0         
		//   15   31:aload_1         
		//   16   32:getfield        #45  <Field long PlaybackStateCompat.mPosition>
		//   17   35:putfield        #46  <Field long mPosition>
			mRate = playbackstatecompat.mSpeed;
		//   18   38:aload_0         
		//   19   39:aload_1         
		//   20   40:getfield        #49  <Field float PlaybackStateCompat.mSpeed>
		//   21   43:putfield        #51  <Field float mRate>
			mUpdateTime = playbackstatecompat.mUpdateTime;
		//   22   46:aload_0         
		//   23   47:aload_1         
		//   24   48:getfield        #53  <Field long PlaybackStateCompat.mUpdateTime>
		//   25   51:putfield        #54  <Field long mUpdateTime>
			mBufferedPosition = playbackstatecompat.mBufferedPosition;
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:getfield        #56  <Field long PlaybackStateCompat.mBufferedPosition>
		//   29   59:putfield        #57  <Field long mBufferedPosition>
			mActions = playbackstatecompat.mActions;
		//   30   62:aload_0         
		//   31   63:aload_1         
		//   32   64:getfield        #59  <Field long PlaybackStateCompat.mActions>
		//   33   67:putfield        #60  <Field long mActions>
			mErrorCode = playbackstatecompat.mErrorCode;
		//   34   70:aload_0         
		//   35   71:aload_1         
		//   36   72:getfield        #62  <Field int PlaybackStateCompat.mErrorCode>
		//   37   75:putfield        #63  <Field int mErrorCode>
			mErrorMessage = playbackstatecompat.mErrorMessage;
		//   38   78:aload_0         
		//   39   79:aload_1         
		//   40   80:getfield        #65  <Field CharSequence PlaybackStateCompat.mErrorMessage>
		//   41   83:putfield        #66  <Field CharSequence mErrorMessage>
			if(playbackstatecompat.mCustomActions != null)
		//*  42   86:aload_1         
		//*  43   87:getfield        #67  <Field List PlaybackStateCompat.mCustomActions>
		//*  44   90:ifnull          107
				mCustomActions.addAll(((java.util.Collection) (playbackstatecompat.mCustomActions)));
		//   45   93:aload_0         
		//   46   94:getfield        #34  <Field List mCustomActions>
		//   47   97:aload_1         
		//   48   98:getfield        #67  <Field List PlaybackStateCompat.mCustomActions>
		//   49  101:invokeinterface #73  <Method boolean List.addAll(java.util.Collection)>
		//   50  106:pop             
			mActiveItemId = playbackstatecompat.mActiveItemId;
		//   51  107:aload_0         
		//   52  108:aload_1         
		//   53  109:getfield        #74  <Field long PlaybackStateCompat.mActiveItemId>
		//   54  112:putfield        #38  <Field long mActiveItemId>
			mExtras = playbackstatecompat.mExtras;
		//   55  115:aload_0         
		//   56  116:aload_1         
		//   57  117:getfield        #76  <Field Bundle PlaybackStateCompat.mExtras>
		//   58  120:putfield        #77  <Field Bundle mExtras>
		//   59  123:return          
		}
	}

	public static final class CustomAction
		implements Parcelable
	{

		public static CustomAction fromCustomAction(Object obj)
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
				CustomAction customaction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
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
				customaction.mCustomActionObj = obj;
		//   19   38:aload_1         
		//   20   39:aload_0         
		//   21   40:putfield        #102 <Field Object mCustomActionObj>
				return customaction;
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
				mCustomActionObj = PlaybackStateCompatApi21.CustomAction.newInstance(mAction, mName, mIcon, mExtras);
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

			public CustomAction createFromParcel(Parcel parcel)
			{
				return new CustomAction(parcel);
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

			public CustomAction[] newArray(int i)
			{
				return new CustomAction[i];
			//    0    0:iload_1         
			//    1    1:anewarray       CustomAction[]
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

		CustomAction(Parcel parcel)
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

		CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
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

	public static final class CustomAction.Builder
	{

		public CustomAction build()
		{
			return new CustomAction(mAction, mName, mIcon, mExtras);
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

		public CustomAction.Builder setExtras(Bundle bundle)
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

		public CustomAction.Builder(String s, CharSequence charsequence, int i)
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

	public static interface ErrorCode
		extends Annotation
	{
	}

	public static interface MediaKeyAction
		extends Annotation
	{
	}

	public static interface RepeatMode
		extends Annotation
	{
	}

	public static interface State
		extends Annotation
	{
	}


	PlaybackStateCompat(int i, long l, long l1, float f, long l2, int j, CharSequence charsequence, long l3, List list, long l4, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void Object()>
		mState = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #174 <Field int mState>
		mPosition = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #176 <Field long mPosition>
		mBufferedPosition = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #178 <Field long mBufferedPosition>
		mSpeed = f;
	//   11   20:aload_0         
	//   12   21:fload           6
	//   13   23:putfield        #180 <Field float mSpeed>
		mActions = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #182 <Field long mActions>
		mErrorCode = j;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #184 <Field int mErrorCode>
		mErrorMessage = charsequence;
	//   20   38:aload_0         
	//   21   39:aload           10
	//   22   41:putfield        #186 <Field CharSequence mErrorMessage>
		mUpdateTime = l3;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #188 <Field long mUpdateTime>
		mCustomActions = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   26   50:aload_0         
	//   27   51:new             #190 <Class ArrayList>
	//   28   54:dup             
	//   29   55:aload           13
	//   30   57:invokespecial   #193 <Method void ArrayList(java.util.Collection)>
	//   31   60:putfield        #195 <Field List mCustomActions>
		mActiveItemId = l4;
	//   32   63:aload_0         
	//   33   64:lload           14
	//   34   66:putfield        #197 <Field long mActiveItemId>
		mExtras = bundle;
	//   35   69:aload_0         
	//   36   70:aload           16
	//   37   72:putfield        #199 <Field Bundle mExtras>
	//   38   75:return          
	}

	PlaybackStateCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #172 <Method void Object()>
		mState = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #208 <Method int Parcel.readInt()>
	//    5    9:putfield        #174 <Field int mState>
		mPosition = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #212 <Method long Parcel.readLong()>
	//    9   17:putfield        #176 <Field long mPosition>
		mSpeed = parcel.readFloat();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #216 <Method float Parcel.readFloat()>
	//   13   25:putfield        #180 <Field float mSpeed>
		mUpdateTime = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #212 <Method long Parcel.readLong()>
	//   17   33:putfield        #188 <Field long mUpdateTime>
		mBufferedPosition = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #212 <Method long Parcel.readLong()>
	//   21   41:putfield        #178 <Field long mBufferedPosition>
		mActions = parcel.readLong();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #212 <Method long Parcel.readLong()>
	//   25   49:putfield        #182 <Field long mActions>
		mErrorMessage = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #221 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #227 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #229 <Class CharSequence>
	//   31   65:putfield        #186 <Field CharSequence mErrorMessage>
		mCustomActions = ((List) (parcel.createTypedArrayList(CustomAction.CREATOR)));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getstatic       #230 <Field android.os.Parcelable$Creator PlaybackStateCompat$CustomAction.CREATOR>
	//   35   73:invokevirtual   #234 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   36   76:putfield        #195 <Field List mCustomActions>
		mActiveItemId = parcel.readLong();
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #212 <Method long Parcel.readLong()>
	//   40   84:putfield        #197 <Field long mActiveItemId>
		mExtras = parcel.readBundle();
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokevirtual   #238 <Method Bundle Parcel.readBundle()>
	//   44   92:putfield        #199 <Field Bundle mExtras>
		mErrorCode = parcel.readInt();
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:invokevirtual   #208 <Method int Parcel.readInt()>
	//   48  100:putfield        #184 <Field int mErrorCode>
	//   49  103:return          
	}

	public static PlaybackStateCompat fromPlaybackState(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		Object obj2 = ((Object) (PlaybackStateCompatApi21.getCustomActions(obj)));
	//    7   14:aload_0         
	//    8   15:invokestatic    #251 <Method List PlaybackStateCompatApi21.getCustomActions(Object)>
	//    9   18:astore_3        
		Object obj1 = null;
	//   10   19:aconst_null     
	//   11   20:astore_1        
		if(obj2 != null)
	//*  12   21:aload_3         
	//*  13   22:ifnull          76
		{
			ArrayList arraylist = new ArrayList(((List) (obj2)).size());
	//   14   25:new             #190 <Class ArrayList>
	//   15   28:dup             
	//   16   29:aload_3         
	//   17   30:invokeinterface #256 <Method int List.size()>
	//   18   35:invokespecial   #259 <Method void ArrayList(int)>
	//   19   38:astore_2        
			obj2 = ((Object) (((List) (obj2)).iterator()));
	//   20   39:aload_3         
	//   21   40:invokeinterface #263 <Method Iterator List.iterator()>
	//   22   45:astore_3        
			do
			{
				obj1 = ((Object) (arraylist));
	//   23   46:aload_2         
	//   24   47:astore_1        
				if(!((Iterator) (obj2)).hasNext())
					break;
	//   25   48:aload_3         
	//   26   49:invokeinterface #269 <Method boolean Iterator.hasNext()>
	//   27   54:ifeq            76
				((List) (arraylist)).add(((Object) (CustomAction.fromCustomAction(((Iterator) (obj2)).next()))));
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokeinterface #273 <Method Object Iterator.next()>
	//   31   64:invokestatic    #277 <Method PlaybackStateCompat$CustomAction PlaybackStateCompat$CustomAction.fromCustomAction(Object)>
	//   32   67:invokeinterface #281 <Method boolean List.add(Object)>
	//   33   72:pop             
			} while(true);
	//   34   73:goto            46
		}
		Bundle bundle;
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  35   76:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   79:bipush          22
	//*  37   81:icmplt          92
			bundle = PlaybackStateCompatApi22.getExtras(obj);
	//   38   84:aload_0         
	//   39   85:invokestatic    #287 <Method Bundle PlaybackStateCompatApi22.getExtras(Object)>
	//   40   88:astore_2        
		else
	//*  41   89:goto            94
			bundle = null;
	//   42   92:aconst_null     
	//   43   93:astore_2        
		obj1 = ((Object) (new PlaybackStateCompat(PlaybackStateCompatApi21.getState(obj), PlaybackStateCompatApi21.getPosition(obj), PlaybackStateCompatApi21.getBufferedPosition(obj), PlaybackStateCompatApi21.getPlaybackSpeed(obj), PlaybackStateCompatApi21.getActions(obj), 0, PlaybackStateCompatApi21.getErrorMessage(obj), PlaybackStateCompatApi21.getLastPositionUpdateTime(obj), ((List) (obj1)), PlaybackStateCompatApi21.getActiveQueueItemId(obj), bundle)));
	//   44   94:new             #2   <Class PlaybackStateCompat>
	//   45   97:dup             
	//   46   98:aload_0         
	//   47   99:invokestatic    #291 <Method int PlaybackStateCompatApi21.getState(Object)>
	//   48  102:aload_0         
	//   49  103:invokestatic    #295 <Method long PlaybackStateCompatApi21.getPosition(Object)>
	//   50  106:aload_0         
	//   51  107:invokestatic    #298 <Method long PlaybackStateCompatApi21.getBufferedPosition(Object)>
	//   52  110:aload_0         
	//   53  111:invokestatic    #302 <Method float PlaybackStateCompatApi21.getPlaybackSpeed(Object)>
	//   54  114:aload_0         
	//   55  115:invokestatic    #305 <Method long PlaybackStateCompatApi21.getActions(Object)>
	//   56  118:iconst_0        
	//   57  119:aload_0         
	//   58  120:invokestatic    #309 <Method CharSequence PlaybackStateCompatApi21.getErrorMessage(Object)>
	//   59  123:aload_0         
	//   60  124:invokestatic    #312 <Method long PlaybackStateCompatApi21.getLastPositionUpdateTime(Object)>
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:invokestatic    #315 <Method long PlaybackStateCompatApi21.getActiveQueueItemId(Object)>
	//   64  132:aload_2         
	//   65  133:invokespecial   #317 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
	//   66  136:astore_1        
		obj1.mStateObj = obj;
	//   67  137:aload_1         
	//   68  138:aload_0         
	//   69  139:putfield        #319 <Field Object mStateObj>
		return ((PlaybackStateCompat) (obj1));
	//   70  142:aload_1         
	//   71  143:areturn         
	}

	public static int toKeyCode(long l)
	{
		if(l == 4L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #42  <Long 4L>
	//*   2    4:lcmp            
	//*   3    5:ifne            11
			return 126;
	//    4    8:bipush          126
	//    5   10:ireturn         
		if(l == 2L)
	//*   6   11:lload_0         
	//*   7   12:ldc2w           #39  <Long 2L>
	//*   8   15:lcmp            
	//*   9   16:ifne            22
			return 127;
	//   10   19:bipush          127
	//   11   21:ireturn         
		if(l == 32L)
	//*  12   22:lload_0         
	//*  13   23:ldc2w           #84  <Long 32L>
	//*  14   26:lcmp            
	//*  15   27:ifne            33
			return 87;
	//   16   30:bipush          87
	//   17   32:ireturn         
		if(l == 16L)
	//*  18   33:lload_0         
	//*  19   34:ldc2w           #87  <Long 16L>
	//*  20   37:lcmp            
	//*  21   38:ifne            44
			return 88;
	//   22   41:bipush          88
	//   23   43:ireturn         
		if(l == 1L)
	//*  24   44:lload_0         
	//*  25   45:lconst_1        
	//*  26   46:lcmp            
	//*  27   47:ifne            53
			return 86;
	//   28   50:bipush          86
	//   29   52:ireturn         
		if(l == 64L)
	//*  30   53:lload_0         
	//*  31   54:ldc2w           #36  <Long 64L>
	//*  32   57:lcmp            
	//*  33   58:ifne            64
			return 90;
	//   34   61:bipush          90
	//   35   63:ireturn         
		if(l == 8L)
	//*  36   64:lload_0         
	//*  37   65:ldc2w           #69  <Long 8L>
	//*  38   68:lcmp            
	//*  39   69:ifne            75
			return 89;
	//   40   72:bipush          89
	//   41   74:ireturn         
		return l != 512L ? 0 : 85;
	//   42   75:lload_0         
	//   43   76:ldc2w           #54  <Long 512L>
	//   44   79:lcmp            
	//   45   80:ifne            86
	//   46   83:bipush          85
	//   47   85:ireturn         
	//   48   86:iconst_0        
	//   49   87:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long getActions()
	{
		return mActions;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field long mActions>
	//    2    4:lreturn         
	}

	public long getActiveQueueItemId()
	{
		return mActiveItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field long mActiveItemId>
	//    2    4:lreturn         
	}

	public long getBufferedPosition()
	{
		return mBufferedPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field long mBufferedPosition>
	//    2    4:lreturn         
	}

	public List getCustomActions()
	{
		return mCustomActions;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field List mCustomActions>
	//    2    4:areturn         
	}

	public int getErrorCode()
	{
		return mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field int mErrorCode>
	//    2    4:ireturn         
	}

	public CharSequence getErrorMessage()
	{
		return mErrorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field CharSequence mErrorMessage>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public long getLastPositionUpdateTime()
	{
		return mUpdateTime;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field long mUpdateTime>
	//    2    4:lreturn         
	}

	public float getPlaybackSpeed()
	{
		return mSpeed;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field float mSpeed>
	//    2    4:freturn         
	}

	public Object getPlaybackState()
	{
		if(mStateObj != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #319 <Field Object mStateObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
			return mStateObj;
	//    6   15:aload_0         
	//    7   16:getfield        #319 <Field Object mStateObj>
	//    8   19:areturn         
		ArrayList arraylist = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
		if(mCustomActions != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #195 <Field List mCustomActions>
	//*  13   26:ifnull          89
		{
			ArrayList arraylist1 = new ArrayList(mCustomActions.size());
	//   14   29:new             #190 <Class ArrayList>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #195 <Field List mCustomActions>
	//   18   37:invokeinterface #256 <Method int List.size()>
	//   19   42:invokespecial   #259 <Method void ArrayList(int)>
	//   20   45:astore_2        
			Iterator iterator = mCustomActions.iterator();
	//   21   46:aload_0         
	//   22   47:getfield        #195 <Field List mCustomActions>
	//   23   50:invokeinterface #263 <Method Iterator List.iterator()>
	//   24   55:astore_3        
			do
			{
				arraylist = arraylist1;
	//   25   56:aload_2         
	//   26   57:astore_1        
				if(!iterator.hasNext())
					break;
	//   27   58:aload_3         
	//   28   59:invokeinterface #269 <Method boolean Iterator.hasNext()>
	//   29   64:ifeq            89
				((List) (arraylist1)).add(((CustomAction)iterator.next()).getCustomAction());
	//   30   67:aload_2         
	//   31   68:aload_3         
	//   32   69:invokeinterface #273 <Method Object Iterator.next()>
	//   33   74:checkcast       #16  <Class PlaybackStateCompat$CustomAction>
	//   34   77:invokevirtual   #332 <Method Object PlaybackStateCompat$CustomAction.getCustomAction()>
	//   35   80:invokeinterface #281 <Method boolean List.add(Object)>
	//   36   85:pop             
			} while(true);
	//   37   86:goto            56
		}
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  38   89:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   92:bipush          22
	//*  40   94:icmplt          144
			mStateObj = PlaybackStateCompatApi22.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, ((List) (arraylist)), mActiveItemId, mExtras);
	//   41   97:aload_0         
	//   42   98:aload_0         
	//   43   99:getfield        #174 <Field int mState>
	//   44  102:aload_0         
	//   45  103:getfield        #176 <Field long mPosition>
	//   46  106:aload_0         
	//   47  107:getfield        #178 <Field long mBufferedPosition>
	//   48  110:aload_0         
	//   49  111:getfield        #180 <Field float mSpeed>
	//   50  114:aload_0         
	//   51  115:getfield        #182 <Field long mActions>
	//   52  118:aload_0         
	//   53  119:getfield        #186 <Field CharSequence mErrorMessage>
	//   54  122:aload_0         
	//   55  123:getfield        #188 <Field long mUpdateTime>
	//   56  126:aload_1         
	//   57  127:aload_0         
	//   58  128:getfield        #197 <Field long mActiveItemId>
	//   59  131:aload_0         
	//   60  132:getfield        #199 <Field Bundle mExtras>
	//   61  135:invokestatic    #336 <Method Object PlaybackStateCompatApi22.newInstance(int, long, long, float, long, CharSequence, long, List, long, Bundle)>
	//   62  138:putfield        #319 <Field Object mStateObj>
		else
	//*  63  141:goto            184
			mStateObj = PlaybackStateCompatApi21.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, ((List) (arraylist)), mActiveItemId);
	//   64  144:aload_0         
	//   65  145:aload_0         
	//   66  146:getfield        #174 <Field int mState>
	//   67  149:aload_0         
	//   68  150:getfield        #176 <Field long mPosition>
	//   69  153:aload_0         
	//   70  154:getfield        #178 <Field long mBufferedPosition>
	//   71  157:aload_0         
	//   72  158:getfield        #180 <Field float mSpeed>
	//   73  161:aload_0         
	//   74  162:getfield        #182 <Field long mActions>
	//   75  165:aload_0         
	//   76  166:getfield        #186 <Field CharSequence mErrorMessage>
	//   77  169:aload_0         
	//   78  170:getfield        #188 <Field long mUpdateTime>
	//   79  173:aload_1         
	//   80  174:aload_0         
	//   81  175:getfield        #197 <Field long mActiveItemId>
	//   82  178:invokestatic    #339 <Method Object PlaybackStateCompatApi21.newInstance(int, long, long, float, long, CharSequence, long, List, long)>
	//   83  181:putfield        #319 <Field Object mStateObj>
		return mStateObj;
	//   84  184:aload_0         
	//   85  185:getfield        #319 <Field Object mStateObj>
	//   86  188:areturn         
	}

	public long getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field long mPosition>
	//    2    4:lreturn         
	}

	public int getState()
	{
		return mState;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field int mState>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
	//    0    0:new             #343 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #345 <String "PlaybackState {">
	//    3    7:invokespecial   #348 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		stringbuilder.append("state=").append(mState);
	//    5   11:aload_1         
	//    6   12:ldc2            #350 <String "state=">
	//    7   15:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #174 <Field int mState>
	//   10   22:invokevirtual   #357 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:pop             
		stringbuilder.append(", position=").append(mPosition);
	//   12   26:aload_1         
	//   13   27:ldc2            #359 <String ", position=">
	//   14   30:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:getfield        #176 <Field long mPosition>
	//   17   37:invokevirtual   #362 <Method StringBuilder StringBuilder.append(long)>
	//   18   40:pop             
		stringbuilder.append(", buffered position=").append(mBufferedPosition);
	//   19   41:aload_1         
	//   20   42:ldc2            #364 <String ", buffered position=">
	//   21   45:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:aload_0         
	//   23   49:getfield        #178 <Field long mBufferedPosition>
	//   24   52:invokevirtual   #362 <Method StringBuilder StringBuilder.append(long)>
	//   25   55:pop             
		stringbuilder.append(", speed=").append(mSpeed);
	//   26   56:aload_1         
	//   27   57:ldc2            #366 <String ", speed=">
	//   28   60:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:aload_0         
	//   30   64:getfield        #180 <Field float mSpeed>
	//   31   67:invokevirtual   #369 <Method StringBuilder StringBuilder.append(float)>
	//   32   70:pop             
		stringbuilder.append(", updated=").append(mUpdateTime);
	//   33   71:aload_1         
	//   34   72:ldc2            #371 <String ", updated=">
	//   35   75:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:aload_0         
	//   37   79:getfield        #188 <Field long mUpdateTime>
	//   38   82:invokevirtual   #362 <Method StringBuilder StringBuilder.append(long)>
	//   39   85:pop             
		stringbuilder.append(", actions=").append(mActions);
	//   40   86:aload_1         
	//   41   87:ldc2            #373 <String ", actions=">
	//   42   90:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   43   93:aload_0         
	//   44   94:getfield        #182 <Field long mActions>
	//   45   97:invokevirtual   #362 <Method StringBuilder StringBuilder.append(long)>
	//   46  100:pop             
		stringbuilder.append(", error code=").append(mErrorCode);
	//   47  101:aload_1         
	//   48  102:ldc2            #375 <String ", error code=">
	//   49  105:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:aload_0         
	//   51  109:getfield        #184 <Field int mErrorCode>
	//   52  112:invokevirtual   #357 <Method StringBuilder StringBuilder.append(int)>
	//   53  115:pop             
		stringbuilder.append(", error message=").append(mErrorMessage);
	//   54  116:aload_1         
	//   55  117:ldc2            #377 <String ", error message=">
	//   56  120:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   57  123:aload_0         
	//   58  124:getfield        #186 <Field CharSequence mErrorMessage>
	//   59  127:invokevirtual   #380 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   60  130:pop             
		stringbuilder.append(", custom actions=").append(((Object) (mCustomActions)));
	//   61  131:aload_1         
	//   62  132:ldc2            #382 <String ", custom actions=">
	//   63  135:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   64  138:aload_0         
	//   65  139:getfield        #195 <Field List mCustomActions>
	//   66  142:invokevirtual   #385 <Method StringBuilder StringBuilder.append(Object)>
	//   67  145:pop             
		stringbuilder.append(", active item id=").append(mActiveItemId);
	//   68  146:aload_1         
	//   69  147:ldc2            #387 <String ", active item id=">
	//   70  150:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   71  153:aload_0         
	//   72  154:getfield        #197 <Field long mActiveItemId>
	//   73  157:invokevirtual   #362 <Method StringBuilder StringBuilder.append(long)>
	//   74  160:pop             
		stringbuilder.append("}");
	//   75  161:aload_1         
	//   76  162:ldc2            #389 <String "}">
	//   77  165:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   78  168:pop             
		return stringbuilder.toString();
	//   79  169:aload_1         
	//   80  170:invokevirtual   #391 <Method String StringBuilder.toString()>
	//   81  173:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mState);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #174 <Field int mState>
	//    3    5:invokevirtual   #396 <Method void Parcel.writeInt(int)>
		parcel.writeLong(mPosition);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #176 <Field long mPosition>
	//    7   13:invokevirtual   #400 <Method void Parcel.writeLong(long)>
		parcel.writeFloat(mSpeed);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #180 <Field float mSpeed>
	//   11   21:invokevirtual   #404 <Method void Parcel.writeFloat(float)>
		parcel.writeLong(mUpdateTime);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #188 <Field long mUpdateTime>
	//   15   29:invokevirtual   #400 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mBufferedPosition);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #178 <Field long mBufferedPosition>
	//   19   37:invokevirtual   #400 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mActions);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #182 <Field long mActions>
	//   23   45:invokevirtual   #400 <Method void Parcel.writeLong(long)>
		TextUtils.writeToParcel(mErrorMessage, parcel, i);
	//   24   48:aload_0         
	//   25   49:getfield        #186 <Field CharSequence mErrorMessage>
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokestatic    #407 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeTypedList(mCustomActions);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #195 <Field List mCustomActions>
	//   32   62:invokevirtual   #411 <Method void Parcel.writeTypedList(List)>
		parcel.writeLong(mActiveItemId);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #197 <Field long mActiveItemId>
	//   36   70:invokevirtual   #400 <Method void Parcel.writeLong(long)>
		parcel.writeBundle(mExtras);
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #199 <Field Bundle mExtras>
	//   40   78:invokevirtual   #415 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeInt(mErrorCode);
	//   41   81:aload_1         
	//   42   82:aload_0         
	//   43   83:getfield        #184 <Field int mErrorCode>
	//   44   86:invokevirtual   #396 <Method void Parcel.writeInt(int)>
	//   45   89:return          
	}

	public static final long ACTION_FAST_FORWARD = 64L;
	public static final long ACTION_PAUSE = 2L;
	public static final long ACTION_PLAY = 4L;
	public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
	public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
	public static final long ACTION_PLAY_FROM_URI = 8192L;
	public static final long ACTION_PLAY_PAUSE = 512L;
	public static final long ACTION_PREPARE = 16384L;
	public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
	public static final long ACTION_PREPARE_FROM_SEARCH = 0x10000L;
	public static final long ACTION_PREPARE_FROM_URI = 0x20000L;
	public static final long ACTION_REWIND = 8L;
	public static final long ACTION_SEEK_TO = 256L;
	public static final long ACTION_SET_RATING = 128L;
	public static final long ACTION_SET_REPEAT_MODE = 0x40000L;
	public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 0x80000L;
	public static final long ACTION_SKIP_TO_NEXT = 32L;
	public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
	public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
	public static final long ACTION_STOP = 1L;
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PlaybackStateCompat createFromParcel(Parcel parcel)
		{
			return new PlaybackStateCompat(parcel);
		//    0    0:new             #9   <Class PlaybackStateCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PlaybackStateCompat(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method PlaybackStateCompat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public PlaybackStateCompat[] newArray(int i)
		{
			return new PlaybackStateCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PlaybackStateCompat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method PlaybackStateCompat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final int ERROR_CODE_ACTION_ABORTED = 10;
	public static final int ERROR_CODE_APP_ERROR = 1;
	public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
	public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
	public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
	public static final int ERROR_CODE_END_OF_QUEUE = 11;
	public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
	public static final int ERROR_CODE_NOT_SUPPORTED = 2;
	public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
	public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
	public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
	public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
	private static final int KEYCODE_MEDIA_PAUSE = 127;
	private static final int KEYCODE_MEDIA_PLAY = 126;
	public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
	public static final int REPEAT_MODE_ALL = 2;
	public static final int REPEAT_MODE_NONE = 0;
	public static final int REPEAT_MODE_ONE = 1;
	public static final int STATE_BUFFERING = 6;
	public static final int STATE_CONNECTING = 8;
	public static final int STATE_ERROR = 7;
	public static final int STATE_FAST_FORWARDING = 4;
	public static final int STATE_NONE = 0;
	public static final int STATE_PAUSED = 2;
	public static final int STATE_PLAYING = 3;
	public static final int STATE_REWINDING = 5;
	public static final int STATE_SKIPPING_TO_NEXT = 10;
	public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
	public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
	public static final int STATE_STOPPED = 1;
	final long mActions;
	final long mActiveItemId;
	final long mBufferedPosition;
	List mCustomActions;
	final int mErrorCode;
	final CharSequence mErrorMessage;
	final Bundle mExtras;
	final long mPosition;
	final float mSpeed;
	final int mState;
	private Object mStateObj;
	final long mUpdateTime;

	static 
	{
	//    0    0:new             #8   <Class PlaybackStateCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #167 <Method void PlaybackStateCompat$1()>
	//    3    7:putstatic       #169 <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
