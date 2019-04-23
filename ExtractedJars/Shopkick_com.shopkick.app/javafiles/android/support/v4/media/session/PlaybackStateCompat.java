// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompatApi21, PlaybackStateCompatApi22

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
			if(customaction != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          17
			{
				mCustomActions.add(((Object) (customaction)));
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field List mCustomActions>
		//    4    8:aload_1         
		//    5    9:invokeinterface #83  <Method boolean List.add(Object)>
		//    6   14:pop             
				return this;
		//    7   15:aload_0         
		//    8   16:areturn         
			} else
			{
				throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
		//    9   17:new             #85  <Class IllegalArgumentException>
		//   10   20:dup             
		//   11   21:ldc1            #87  <String "You may not add a null CustomAction to PlaybackStateCompat.">
		//   12   23:invokespecial   #90  <Method void IllegalArgumentException(String)>
		//   13   26:athrow          
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
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          46
		//*   2    4:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            46
			{
				CustomAction customaction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
		//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:invokestatic    #94  <Method String PlaybackStateCompatApi21$CustomAction.getAction(Object)>
		//   10   23:aload_0         
		//   11   24:invokestatic    #98  <Method CharSequence PlaybackStateCompatApi21$CustomAction.getName(Object)>
		//   12   27:aload_0         
		//   13   28:invokestatic    #102 <Method int PlaybackStateCompatApi21$CustomAction.getIcon(Object)>
		//   14   31:aload_0         
		//   15   32:invokestatic    #106 <Method Bundle PlaybackStateCompatApi21$CustomAction.getExtras(Object)>
		//   16   35:invokespecial   #108 <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
		//   17   38:astore_1        
				customaction.mCustomActionObj = obj;
		//   18   39:aload_1         
		//   19   40:aload_0         
		//   20   41:putfield        #110 <Field Object mCustomActionObj>
				return customaction;
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
		//*   1    1:getfield        #110 <Field Object mCustomActionObj>
		//*   2    4:ifnonnull       46
		//*   3    7:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          21
		//*   5   12:icmpge          18
		//*   6   15:goto            46
			{
				mCustomActionObj = PlaybackStateCompatApi21.CustomAction.newInstance(mAction, mName, mIcon, mExtras);
		//    7   18:aload_0         
		//    8   19:aload_0         
		//    9   20:getfield        #45  <Field String mAction>
		//   10   23:aload_0         
		//   11   24:getfield        #60  <Field CharSequence mName>
		//   12   27:aload_0         
		//   13   28:getfield        #66  <Field int mIcon>
		//   14   31:aload_0         
		//   15   32:getfield        #80  <Field Bundle mExtras>
		//   16   35:invokestatic    #117 <Method Object PlaybackStateCompatApi21$CustomAction.newInstance(String, CharSequence, int, Bundle)>
		//   17   38:putfield        #110 <Field Object mCustomActionObj>
				return mCustomActionObj;
		//   18   41:aload_0         
		//   19   42:getfield        #110 <Field Object mCustomActionObj>
		//   20   45:areturn         
			} else
			{
				return mCustomActionObj;
		//   21   46:aload_0         
		//   22   47:getfield        #110 <Field Object mCustomActionObj>
		//   23   50:areturn         
			}
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field Bundle mExtras>
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
		//    0    0:new             #122 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #123 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Action:mName='");
		//    4    8:aload_1         
		//    5    9:ldc1            #125 <String "Action:mName='">
		//    6   11:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (mName)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #60  <Field CharSequence mName>
		//   11   20:invokevirtual   #132 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", mIcon=");
		//   13   24:aload_1         
		//   14   25:ldc1            #134 <String ", mIcon=">
		//   15   27:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mIcon);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #66  <Field int mIcon>
		//   20   36:invokevirtual   #137 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mExtras=");
		//   22   40:aload_1         
		//   23   41:ldc1            #139 <String ", mExtras=">
		//   24   43:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(((Object) (mExtras)));
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #80  <Field Bundle mExtras>
		//   29   52:invokevirtual   #132 <Method StringBuilder StringBuilder.append(Object)>
		//   30   55:pop             
			return stringbuilder.toString();
		//   31   56:aload_1         
		//   32   57:invokevirtual   #141 <Method String StringBuilder.toString()>
		//   33   60:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeString(mAction);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #45  <Field String mAction>
		//    3    5:invokevirtual   #147 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(mName, parcel, i);
		//    4    8:aload_0         
		//    5    9:getfield        #60  <Field CharSequence mName>
		//    6   12:aload_1         
		//    7   13:iload_2         
		//    8   14:invokestatic    #150 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeInt(mIcon);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #66  <Field int mIcon>
		//   12   22:invokevirtual   #154 <Method void Parcel.writeInt(int)>
			parcel.writeBundle(mExtras);
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #80  <Field Bundle mExtras>
		//   16   30:invokevirtual   #158 <Method void Parcel.writeBundle(Bundle)>
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
			mExtras = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
		//   16   36:aload_0         
		//   17   37:aload_1         
		//   18   38:ldc1            #68  <Class MediaSessionCompat>
		//   19   40:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
		//   20   43:invokevirtual   #78  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   21   46:putfield        #80  <Field Bundle mExtras>
		//   22   49:return          
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
		//   13   22:putfield        #80  <Field Bundle mExtras>
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
		//    3    5:getfield        #31  <Field String mAction>
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field CharSequence mName>
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field int mIcon>
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
			if(!TextUtils.isEmpty(((CharSequence) (s))))
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   4    8:ifne            58
			{
				if(!TextUtils.isEmpty(charsequence))
		//*   5   11:aload_2         
		//*   6   12:invokestatic    #29  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   7   15:ifne            48
				{
					if(i != 0)
		//*   8   18:iload_3         
		//*   9   19:ifeq            38
					{
						mAction = s;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #31  <Field String mAction>
						mName = charsequence;
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:putfield        #33  <Field CharSequence mName>
						mIcon = i;
		//   16   32:aload_0         
		//   17   33:iload_3         
		//   18   34:putfield        #35  <Field int mIcon>
						return;
		//   19   37:return          
					} else
					{
						throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
		//   20   38:new             #37  <Class IllegalArgumentException>
		//   21   41:dup             
		//   22   42:ldc1            #39  <String "You must specify an icon resource id to build a CustomAction.">
		//   23   44:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   24   47:athrow          
					}
				} else
				{
					throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
		//   25   48:new             #37  <Class IllegalArgumentException>
		//   26   51:dup             
		//   27   52:ldc1            #44  <String "You must specify a name to build a CustomAction.">
		//   28   54:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   29   57:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
		//   30   58:new             #37  <Class IllegalArgumentException>
		//   31   61:dup             
		//   32   62:ldc1            #46  <String "You must specify an action to build a CustomAction.">
		//   33   64:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   34   67:athrow          
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

	public static interface ShuffleMode
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
	//    1    1:invokespecial   #189 <Method void Object()>
		mState = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #191 <Field int mState>
		mPosition = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #193 <Field long mPosition>
		mBufferedPosition = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #195 <Field long mBufferedPosition>
		mSpeed = f;
	//   11   20:aload_0         
	//   12   21:fload           6
	//   13   23:putfield        #197 <Field float mSpeed>
		mActions = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #199 <Field long mActions>
		mErrorCode = j;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #201 <Field int mErrorCode>
		mErrorMessage = charsequence;
	//   20   38:aload_0         
	//   21   39:aload           10
	//   22   41:putfield        #203 <Field CharSequence mErrorMessage>
		mUpdateTime = l3;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #205 <Field long mUpdateTime>
		mCustomActions = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   26   50:aload_0         
	//   27   51:new             #207 <Class ArrayList>
	//   28   54:dup             
	//   29   55:aload           13
	//   30   57:invokespecial   #210 <Method void ArrayList(java.util.Collection)>
	//   31   60:putfield        #212 <Field List mCustomActions>
		mActiveItemId = l4;
	//   32   63:aload_0         
	//   33   64:lload           14
	//   34   66:putfield        #214 <Field long mActiveItemId>
		mExtras = bundle;
	//   35   69:aload_0         
	//   36   70:aload           16
	//   37   72:putfield        #216 <Field Bundle mExtras>
	//   38   75:return          
	}

	PlaybackStateCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method void Object()>
		mState = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #225 <Method int Parcel.readInt()>
	//    5    9:putfield        #191 <Field int mState>
		mPosition = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #229 <Method long Parcel.readLong()>
	//    9   17:putfield        #193 <Field long mPosition>
		mSpeed = parcel.readFloat();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #233 <Method float Parcel.readFloat()>
	//   13   25:putfield        #197 <Field float mSpeed>
		mUpdateTime = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #229 <Method long Parcel.readLong()>
	//   17   33:putfield        #205 <Field long mUpdateTime>
		mBufferedPosition = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #229 <Method long Parcel.readLong()>
	//   21   41:putfield        #195 <Field long mBufferedPosition>
		mActions = parcel.readLong();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #229 <Method long Parcel.readLong()>
	//   25   49:putfield        #199 <Field long mActions>
		mErrorMessage = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #238 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #244 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #246 <Class CharSequence>
	//   31   65:putfield        #203 <Field CharSequence mErrorMessage>
		mCustomActions = ((List) (parcel.createTypedArrayList(CustomAction.CREATOR)));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getstatic       #247 <Field android.os.Parcelable$Creator PlaybackStateCompat$CustomAction.CREATOR>
	//   35   73:invokevirtual   #251 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   36   76:putfield        #212 <Field List mCustomActions>
		mActiveItemId = parcel.readLong();
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #229 <Method long Parcel.readLong()>
	//   40   84:putfield        #214 <Field long mActiveItemId>
		mExtras = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:ldc1            #253 <Class MediaSessionCompat>
	//   44   91:invokevirtual   #259 <Method ClassLoader Class.getClassLoader()>
	//   45   94:invokevirtual   #263 <Method Bundle Parcel.readBundle(ClassLoader)>
	//   46   97:putfield        #216 <Field Bundle mExtras>
		mErrorCode = parcel.readInt();
	//   47  100:aload_0         
	//   48  101:aload_1         
	//   49  102:invokevirtual   #225 <Method int Parcel.readInt()>
	//   50  105:putfield        #201 <Field int mErrorCode>
	//   51  108:return          
	}

	public static PlaybackStateCompat fromPlaybackState(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          143
	//*   2    4:getstatic       #270 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          143
		{
			Object obj2 = ((Object) (PlaybackStateCompatApi21.getCustomActions(obj)));
	//    5   12:aload_0         
	//    6   13:invokestatic    #276 <Method List PlaybackStateCompatApi21.getCustomActions(Object)>
	//    7   16:astore_2        
			Object obj1;
			if(obj2 != null)
	//*   8   17:aload_2         
	//*   9   18:ifnull          73
			{
				obj1 = ((Object) (new ArrayList(((List) (obj2)).size())));
	//   10   21:new             #207 <Class ArrayList>
	//   11   24:dup             
	//   12   25:aload_2         
	//   13   26:invokeinterface #281 <Method int List.size()>
	//   14   31:invokespecial   #284 <Method void ArrayList(int)>
	//   15   34:astore_1        
				for(obj2 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(((Object) (CustomAction.fromCustomAction(((Iterator) (obj2)).next())))));
	//   16   35:aload_2         
	//   17   36:invokeinterface #288 <Method Iterator List.iterator()>
	//   18   41:astore_2        
	//   19   42:aload_2         
	//   20   43:invokeinterface #294 <Method boolean Iterator.hasNext()>
	//   21   48:ifeq            70
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:invokeinterface #298 <Method Object Iterator.next()>
	//   25   58:invokestatic    #302 <Method PlaybackStateCompat$CustomAction PlaybackStateCompat$CustomAction.fromCustomAction(Object)>
	//   26   61:invokeinterface #306 <Method boolean List.add(Object)>
	//   27   66:pop             
			} else
	//*  28   67:goto            42
	//*  29   70:goto            75
			{
				obj1 = null;
	//   30   73:aconst_null     
	//   31   74:astore_1        
			}
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  32   75:getstatic       #270 <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   78:bipush          22
	//*  34   80:icmplt          91
				obj2 = ((Object) (PlaybackStateCompatApi22.getExtras(obj)));
	//   35   83:aload_0         
	//   36   84:invokestatic    #312 <Method Bundle PlaybackStateCompatApi22.getExtras(Object)>
	//   37   87:astore_2        
			else
	//*  38   88:goto            93
				obj2 = null;
	//   39   91:aconst_null     
	//   40   92:astore_2        
			obj1 = ((Object) (new PlaybackStateCompat(PlaybackStateCompatApi21.getState(obj), PlaybackStateCompatApi21.getPosition(obj), PlaybackStateCompatApi21.getBufferedPosition(obj), PlaybackStateCompatApi21.getPlaybackSpeed(obj), PlaybackStateCompatApi21.getActions(obj), 0, PlaybackStateCompatApi21.getErrorMessage(obj), PlaybackStateCompatApi21.getLastPositionUpdateTime(obj), ((List) (obj1)), PlaybackStateCompatApi21.getActiveQueueItemId(obj), ((Bundle) (obj2)))));
	//   41   93:new             #2   <Class PlaybackStateCompat>
	//   42   96:dup             
	//   43   97:aload_0         
	//   44   98:invokestatic    #316 <Method int PlaybackStateCompatApi21.getState(Object)>
	//   45  101:aload_0         
	//   46  102:invokestatic    #320 <Method long PlaybackStateCompatApi21.getPosition(Object)>
	//   47  105:aload_0         
	//   48  106:invokestatic    #323 <Method long PlaybackStateCompatApi21.getBufferedPosition(Object)>
	//   49  109:aload_0         
	//   50  110:invokestatic    #327 <Method float PlaybackStateCompatApi21.getPlaybackSpeed(Object)>
	//   51  113:aload_0         
	//   52  114:invokestatic    #330 <Method long PlaybackStateCompatApi21.getActions(Object)>
	//   53  117:iconst_0        
	//   54  118:aload_0         
	//   55  119:invokestatic    #334 <Method CharSequence PlaybackStateCompatApi21.getErrorMessage(Object)>
	//   56  122:aload_0         
	//   57  123:invokestatic    #337 <Method long PlaybackStateCompatApi21.getLastPositionUpdateTime(Object)>
	//   58  126:aload_1         
	//   59  127:aload_0         
	//   60  128:invokestatic    #340 <Method long PlaybackStateCompatApi21.getActiveQueueItemId(Object)>
	//   61  131:aload_2         
	//   62  132:invokespecial   #342 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
	//   63  135:astore_1        
			obj1.mStateObj = obj;
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:putfield        #344 <Field Object mStateObj>
			return ((PlaybackStateCompat) (obj1));
	//   67  141:aload_1         
	//   68  142:areturn         
		} else
		{
			return null;
	//   69  143:aconst_null     
	//   70  144:areturn         
		}
	}

	public static int toKeyCode(long l)
	{
		if(l == 4L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #45  <Long 4L>
	//*   2    4:lcmp            
	//*   3    5:ifne            11
			return 126;
	//    4    8:bipush          126
	//    5   10:ireturn         
		if(l == 2L)
	//*   6   11:lload_0         
	//*   7   12:ldc2w           #42  <Long 2L>
	//*   8   15:lcmp            
	//*   9   16:ifne            22
			return 127;
	//   10   19:bipush          127
	//   11   21:ireturn         
		if(l == 32L)
	//*  12   22:lload_0         
	//*  13   23:ldc2w           #94  <Long 32L>
	//*  14   26:lcmp            
	//*  15   27:ifne            33
			return 87;
	//   16   30:bipush          87
	//   17   32:ireturn         
		if(l == 16L)
	//*  18   33:lload_0         
	//*  19   34:ldc2w           #97  <Long 16L>
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
	//*  31   54:ldc2w           #39  <Long 64L>
	//*  32   57:lcmp            
	//*  33   58:ifne            64
			return 90;
	//   34   61:bipush          90
	//   35   63:ireturn         
		if(l == 8L)
	//*  36   64:lload_0         
	//*  37   65:ldc2w           #72  <Long 8L>
	//*  38   68:lcmp            
	//*  39   69:ifne            75
			return 89;
	//   40   72:bipush          89
	//   41   74:ireturn         
		return l != 512L ? 0 : 85;
	//   42   75:lload_0         
	//   43   76:ldc2w           #57  <Long 512L>
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
	//    1    1:getfield        #199 <Field long mActions>
	//    2    4:lreturn         
	}

	public long getActiveQueueItemId()
	{
		return mActiveItemId;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field long mActiveItemId>
	//    2    4:lreturn         
	}

	public long getBufferedPosition()
	{
		return mBufferedPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field long mBufferedPosition>
	//    2    4:lreturn         
	}

	public long getCurrentPosition(Long long1)
	{
		long l1 = mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field long mPosition>
	//    2    4:lstore          5
		float f = mSpeed;
	//    3    6:aload_0         
	//    4    7:getfield        #197 <Field float mSpeed>
	//    5   10:fstore_2        
		long l;
		if(long1 != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          23
			l = long1.longValue();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #358 <Method long Long.longValue()>
	//   10   19:lstore_3        
		else
	//*  11   20:goto            32
			l = SystemClock.elapsedRealtime() - mUpdateTime;
	//   12   23:invokestatic    #363 <Method long SystemClock.elapsedRealtime()>
	//   13   26:aload_0         
	//   14   27:getfield        #205 <Field long mUpdateTime>
	//   15   30:lsub            
	//   16   31:lstore_3        
		return Math.max(0L, l1 + (long)(f * (float)l));
	//   17   32:lconst_0        
	//   18   33:lload           5
	//   19   35:fload_2         
	//   20   36:lload_3         
	//   21   37:l2f             
	//   22   38:fmul            
	//   23   39:f2l             
	//   24   40:ladd            
	//   25   41:invokestatic    #369 <Method long Math.max(long, long)>
	//   26   44:lreturn         
	}

	public List getCustomActions()
	{
		return mCustomActions;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field List mCustomActions>
	//    2    4:areturn         
	}

	public int getErrorCode()
	{
		return mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #201 <Field int mErrorCode>
	//    2    4:ireturn         
	}

	public CharSequence getErrorMessage()
	{
		return mErrorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field CharSequence mErrorMessage>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public long getLastPositionUpdateTime()
	{
		return mUpdateTime;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field long mUpdateTime>
	//    2    4:lreturn         
	}

	public float getPlaybackSpeed()
	{
		return mSpeed;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field float mSpeed>
	//    2    4:freturn         
	}

	public Object getPlaybackState()
	{
		if(mStateObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #344 <Field Object mStateObj>
	//*   2    4:ifnonnull       179
	//*   3    7:getstatic       #270 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmplt          179
		{
			Object obj = ((Object) (mCustomActions));
	//    6   15:aload_0         
	//    7   16:getfield        #212 <Field List mCustomActions>
	//    8   19:astore_1        
			if(obj != null)
	//*   9   20:aload_1         
	//*  10   21:ifnull          82
			{
				obj = ((Object) (new ArrayList(((List) (obj)).size())));
	//   11   24:new             #207 <Class ArrayList>
	//   12   27:dup             
	//   13   28:aload_1         
	//   14   29:invokeinterface #281 <Method int List.size()>
	//   15   34:invokespecial   #284 <Method void ArrayList(int)>
	//   16   37:astore_1        
				for(Iterator iterator = mCustomActions.iterator(); iterator.hasNext(); ((List) (obj)).add(((CustomAction)iterator.next()).getCustomAction()));
	//   17   38:aload_0         
	//   18   39:getfield        #212 <Field List mCustomActions>
	//   19   42:invokeinterface #288 <Method Iterator List.iterator()>
	//   20   47:astore_2        
	//   21   48:aload_2         
	//   22   49:invokeinterface #294 <Method boolean Iterator.hasNext()>
	//   23   54:ifeq            79
	//   24   57:aload_1         
	//   25   58:aload_2         
	//   26   59:invokeinterface #298 <Method Object Iterator.next()>
	//   27   64:checkcast       #16  <Class PlaybackStateCompat$CustomAction>
	//   28   67:invokevirtual   #380 <Method Object PlaybackStateCompat$CustomAction.getCustomAction()>
	//   29   70:invokeinterface #306 <Method boolean List.add(Object)>
	//   30   75:pop             
			} else
	//*  31   76:goto            48
	//*  32   79:goto            84
			{
				obj = null;
	//   33   82:aconst_null     
	//   34   83:astore_1        
			}
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  35   84:getstatic       #270 <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   87:bipush          22
	//*  37   89:icmplt          139
				mStateObj = PlaybackStateCompatApi22.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, ((List) (obj)), mActiveItemId, mExtras);
	//   38   92:aload_0         
	//   39   93:aload_0         
	//   40   94:getfield        #191 <Field int mState>
	//   41   97:aload_0         
	//   42   98:getfield        #193 <Field long mPosition>
	//   43  101:aload_0         
	//   44  102:getfield        #195 <Field long mBufferedPosition>
	//   45  105:aload_0         
	//   46  106:getfield        #197 <Field float mSpeed>
	//   47  109:aload_0         
	//   48  110:getfield        #199 <Field long mActions>
	//   49  113:aload_0         
	//   50  114:getfield        #203 <Field CharSequence mErrorMessage>
	//   51  117:aload_0         
	//   52  118:getfield        #205 <Field long mUpdateTime>
	//   53  121:aload_1         
	//   54  122:aload_0         
	//   55  123:getfield        #214 <Field long mActiveItemId>
	//   56  126:aload_0         
	//   57  127:getfield        #216 <Field Bundle mExtras>
	//   58  130:invokestatic    #384 <Method Object PlaybackStateCompatApi22.newInstance(int, long, long, float, long, CharSequence, long, List, long, Bundle)>
	//   59  133:putfield        #344 <Field Object mStateObj>
			else
	//*  60  136:goto            179
				mStateObj = PlaybackStateCompatApi21.newInstance(mState, mPosition, mBufferedPosition, mSpeed, mActions, mErrorMessage, mUpdateTime, ((List) (obj)), mActiveItemId);
	//   61  139:aload_0         
	//   62  140:aload_0         
	//   63  141:getfield        #191 <Field int mState>
	//   64  144:aload_0         
	//   65  145:getfield        #193 <Field long mPosition>
	//   66  148:aload_0         
	//   67  149:getfield        #195 <Field long mBufferedPosition>
	//   68  152:aload_0         
	//   69  153:getfield        #197 <Field float mSpeed>
	//   70  156:aload_0         
	//   71  157:getfield        #199 <Field long mActions>
	//   72  160:aload_0         
	//   73  161:getfield        #203 <Field CharSequence mErrorMessage>
	//   74  164:aload_0         
	//   75  165:getfield        #205 <Field long mUpdateTime>
	//   76  168:aload_1         
	//   77  169:aload_0         
	//   78  170:getfield        #214 <Field long mActiveItemId>
	//   79  173:invokestatic    #387 <Method Object PlaybackStateCompatApi21.newInstance(int, long, long, float, long, CharSequence, long, List, long)>
	//   80  176:putfield        #344 <Field Object mStateObj>
		}
		return mStateObj;
	//   81  179:aload_0         
	//   82  180:getfield        #344 <Field Object mStateObj>
	//   83  183:areturn         
	}

	public long getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field long mPosition>
	//    2    4:lreturn         
	}

	public int getState()
	{
		return mState;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int mState>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
	//    0    0:new             #391 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #393 <String "PlaybackState {">
	//    3    7:invokespecial   #396 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		stringbuilder.append("state=");
	//    5   11:aload_1         
	//    6   12:ldc2            #398 <String "state=">
	//    7   15:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(mState);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #191 <Field int mState>
	//   12   24:invokevirtual   #405 <Method StringBuilder StringBuilder.append(int)>
	//   13   27:pop             
		stringbuilder.append(", position=");
	//   14   28:aload_1         
	//   15   29:ldc2            #407 <String ", position=">
	//   16   32:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(mPosition);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #193 <Field long mPosition>
	//   21   41:invokevirtual   #410 <Method StringBuilder StringBuilder.append(long)>
	//   22   44:pop             
		stringbuilder.append(", buffered position=");
	//   23   45:aload_1         
	//   24   46:ldc2            #412 <String ", buffered position=">
	//   25   49:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(mBufferedPosition);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #195 <Field long mBufferedPosition>
	//   30   58:invokevirtual   #410 <Method StringBuilder StringBuilder.append(long)>
	//   31   61:pop             
		stringbuilder.append(", speed=");
	//   32   62:aload_1         
	//   33   63:ldc2            #414 <String ", speed=">
	//   34   66:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(mSpeed);
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:getfield        #197 <Field float mSpeed>
	//   39   75:invokevirtual   #417 <Method StringBuilder StringBuilder.append(float)>
	//   40   78:pop             
		stringbuilder.append(", updated=");
	//   41   79:aload_1         
	//   42   80:ldc2            #419 <String ", updated=">
	//   43   83:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
		stringbuilder.append(mUpdateTime);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #205 <Field long mUpdateTime>
	//   48   92:invokevirtual   #410 <Method StringBuilder StringBuilder.append(long)>
	//   49   95:pop             
		stringbuilder.append(", actions=");
	//   50   96:aload_1         
	//   51   97:ldc2            #421 <String ", actions=">
	//   52  100:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
		stringbuilder.append(mActions);
	//   54  104:aload_1         
	//   55  105:aload_0         
	//   56  106:getfield        #199 <Field long mActions>
	//   57  109:invokevirtual   #410 <Method StringBuilder StringBuilder.append(long)>
	//   58  112:pop             
		stringbuilder.append(", error code=");
	//   59  113:aload_1         
	//   60  114:ldc2            #423 <String ", error code=">
	//   61  117:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
		stringbuilder.append(mErrorCode);
	//   63  121:aload_1         
	//   64  122:aload_0         
	//   65  123:getfield        #201 <Field int mErrorCode>
	//   66  126:invokevirtual   #405 <Method StringBuilder StringBuilder.append(int)>
	//   67  129:pop             
		stringbuilder.append(", error message=");
	//   68  130:aload_1         
	//   69  131:ldc2            #425 <String ", error message=">
	//   70  134:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
		stringbuilder.append(mErrorMessage);
	//   72  138:aload_1         
	//   73  139:aload_0         
	//   74  140:getfield        #203 <Field CharSequence mErrorMessage>
	//   75  143:invokevirtual   #428 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   76  146:pop             
		stringbuilder.append(", custom actions=");
	//   77  147:aload_1         
	//   78  148:ldc2            #430 <String ", custom actions=">
	//   79  151:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   80  154:pop             
		stringbuilder.append(((Object) (mCustomActions)));
	//   81  155:aload_1         
	//   82  156:aload_0         
	//   83  157:getfield        #212 <Field List mCustomActions>
	//   84  160:invokevirtual   #433 <Method StringBuilder StringBuilder.append(Object)>
	//   85  163:pop             
		stringbuilder.append(", active item id=");
	//   86  164:aload_1         
	//   87  165:ldc2            #435 <String ", active item id=">
	//   88  168:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   89  171:pop             
		stringbuilder.append(mActiveItemId);
	//   90  172:aload_1         
	//   91  173:aload_0         
	//   92  174:getfield        #214 <Field long mActiveItemId>
	//   93  177:invokevirtual   #410 <Method StringBuilder StringBuilder.append(long)>
	//   94  180:pop             
		stringbuilder.append("}");
	//   95  181:aload_1         
	//   96  182:ldc2            #437 <String "}">
	//   97  185:invokevirtual   #402 <Method StringBuilder StringBuilder.append(String)>
	//   98  188:pop             
		return stringbuilder.toString();
	//   99  189:aload_1         
	//  100  190:invokevirtual   #439 <Method String StringBuilder.toString()>
	//  101  193:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mState);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #191 <Field int mState>
	//    3    5:invokevirtual   #444 <Method void Parcel.writeInt(int)>
		parcel.writeLong(mPosition);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #193 <Field long mPosition>
	//    7   13:invokevirtual   #448 <Method void Parcel.writeLong(long)>
		parcel.writeFloat(mSpeed);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #197 <Field float mSpeed>
	//   11   21:invokevirtual   #452 <Method void Parcel.writeFloat(float)>
		parcel.writeLong(mUpdateTime);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #205 <Field long mUpdateTime>
	//   15   29:invokevirtual   #448 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mBufferedPosition);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #195 <Field long mBufferedPosition>
	//   19   37:invokevirtual   #448 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mActions);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #199 <Field long mActions>
	//   23   45:invokevirtual   #448 <Method void Parcel.writeLong(long)>
		TextUtils.writeToParcel(mErrorMessage, parcel, i);
	//   24   48:aload_0         
	//   25   49:getfield        #203 <Field CharSequence mErrorMessage>
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokestatic    #455 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeTypedList(mCustomActions);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #212 <Field List mCustomActions>
	//   32   62:invokevirtual   #459 <Method void Parcel.writeTypedList(List)>
		parcel.writeLong(mActiveItemId);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #214 <Field long mActiveItemId>
	//   36   70:invokevirtual   #448 <Method void Parcel.writeLong(long)>
		parcel.writeBundle(mExtras);
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #216 <Field Bundle mExtras>
	//   40   78:invokevirtual   #463 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeInt(mErrorCode);
	//   41   81:aload_1         
	//   42   82:aload_0         
	//   43   83:getfield        #201 <Field int mErrorCode>
	//   44   86:invokevirtual   #444 <Method void Parcel.writeInt(int)>
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
	public static final long ACTION_SET_CAPTIONING_ENABLED = 0x100000L;
	public static final long ACTION_SET_RATING = 128L;
	public static final long ACTION_SET_REPEAT_MODE = 0x40000L;
	public static final long ACTION_SET_SHUFFLE_MODE = 0x200000L;
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
	public static final int REPEAT_MODE_GROUP = 3;
	public static final int REPEAT_MODE_INVALID = -1;
	public static final int REPEAT_MODE_NONE = 0;
	public static final int REPEAT_MODE_ONE = 1;
	public static final int SHUFFLE_MODE_ALL = 1;
	public static final int SHUFFLE_MODE_GROUP = 2;
	public static final int SHUFFLE_MODE_INVALID = -1;
	public static final int SHUFFLE_MODE_NONE = 0;
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
	//    2    4:invokespecial   #184 <Method void PlaybackStateCompat$1()>
	//    3    7:putstatic       #186 <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
