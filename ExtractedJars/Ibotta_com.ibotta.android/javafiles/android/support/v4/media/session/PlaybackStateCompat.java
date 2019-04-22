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

	public static final class CustomAction
		implements Parcelable
	{

		public static CustomAction fromCustomAction(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          46
		//*   2    4:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            46
			{
				CustomAction customaction = new CustomAction(PlaybackStateCompatApi21.CustomAction.getAction(obj), PlaybackStateCompatApi21.CustomAction.getName(obj), PlaybackStateCompatApi21.CustomAction.getIcon(obj), PlaybackStateCompatApi21.CustomAction.getExtras(obj));
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
				customaction.mCustomActionObj = obj;
		//   18   39:aload_1         
		//   19   40:aload_0         
		//   20   41:putfield        #99  <Field Object mCustomActionObj>
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
		//    2    4:invokespecial   #29  <Method void PlaybackStateCompat$CustomAction$1()>
		//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		CustomAction(Parcel parcel)
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

		CustomAction(String s, CharSequence charsequence, int i, Bundle bundle)
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
	//    1    1:invokespecial   #64  <Method void Object()>
		mState = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #66  <Field int mState>
		mPosition = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #68  <Field long mPosition>
		mBufferedPosition = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #70  <Field long mBufferedPosition>
		mSpeed = f;
	//   11   20:aload_0         
	//   12   21:fload           6
	//   13   23:putfield        #72  <Field float mSpeed>
		mActions = l2;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #74  <Field long mActions>
		mErrorCode = j;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #76  <Field int mErrorCode>
		mErrorMessage = charsequence;
	//   20   38:aload_0         
	//   21   39:aload           10
	//   22   41:putfield        #78  <Field CharSequence mErrorMessage>
		mUpdateTime = l3;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #80  <Field long mUpdateTime>
		mCustomActions = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   26   50:aload_0         
	//   27   51:new             #82  <Class ArrayList>
	//   28   54:dup             
	//   29   55:aload           13
	//   30   57:invokespecial   #85  <Method void ArrayList(java.util.Collection)>
	//   31   60:putfield        #87  <Field List mCustomActions>
		mActiveItemId = l4;
	//   32   63:aload_0         
	//   33   64:lload           14
	//   34   66:putfield        #89  <Field long mActiveItemId>
		mExtras = bundle;
	//   35   69:aload_0         
	//   36   70:aload           16
	//   37   72:putfield        #91  <Field Bundle mExtras>
	//   38   75:return          
	}

	PlaybackStateCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		mState = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #100 <Method int Parcel.readInt()>
	//    5    9:putfield        #66  <Field int mState>
		mPosition = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #104 <Method long Parcel.readLong()>
	//    9   17:putfield        #68  <Field long mPosition>
		mSpeed = parcel.readFloat();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #108 <Method float Parcel.readFloat()>
	//   13   25:putfield        #72  <Field float mSpeed>
		mUpdateTime = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #104 <Method long Parcel.readLong()>
	//   17   33:putfield        #80  <Field long mUpdateTime>
		mBufferedPosition = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #104 <Method long Parcel.readLong()>
	//   21   41:putfield        #70  <Field long mBufferedPosition>
		mActions = parcel.readLong();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #104 <Method long Parcel.readLong()>
	//   25   49:putfield        #74  <Field long mActions>
		mErrorMessage = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #113 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #119 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #121 <Class CharSequence>
	//   31   65:putfield        #78  <Field CharSequence mErrorMessage>
		mCustomActions = ((List) (parcel.createTypedArrayList(CustomAction.CREATOR)));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getstatic       #122 <Field android.os.Parcelable$Creator PlaybackStateCompat$CustomAction.CREATOR>
	//   35   73:invokevirtual   #126 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   36   76:putfield        #87  <Field List mCustomActions>
		mActiveItemId = parcel.readLong();
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #104 <Method long Parcel.readLong()>
	//   40   84:putfield        #89  <Field long mActiveItemId>
		mExtras = parcel.readBundle();
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokevirtual   #130 <Method Bundle Parcel.readBundle()>
	//   44   92:putfield        #91  <Field Bundle mExtras>
		mErrorCode = parcel.readInt();
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:invokevirtual   #100 <Method int Parcel.readInt()>
	//   48  100:putfield        #76  <Field int mErrorCode>
	//   49  103:return          
	}

	public static PlaybackStateCompat fromPlaybackState(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          143
	//*   2    4:getstatic       #137 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          143
		{
			Object obj2 = ((Object) (PlaybackStateCompatApi21.getCustomActions(obj)));
	//    5   12:aload_0         
	//    6   13:invokestatic    #143 <Method List PlaybackStateCompatApi21.getCustomActions(Object)>
	//    7   16:astore_2        
			Object obj1;
			if(obj2 != null)
	//*   8   17:aload_2         
	//*   9   18:ifnull          73
			{
				obj1 = ((Object) (new ArrayList(((List) (obj2)).size())));
	//   10   21:new             #82  <Class ArrayList>
	//   11   24:dup             
	//   12   25:aload_2         
	//   13   26:invokeinterface #148 <Method int List.size()>
	//   14   31:invokespecial   #151 <Method void ArrayList(int)>
	//   15   34:astore_1        
				for(obj2 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(((Object) (CustomAction.fromCustomAction(((Iterator) (obj2)).next())))));
	//   16   35:aload_2         
	//   17   36:invokeinterface #155 <Method Iterator List.iterator()>
	//   18   41:astore_2        
	//   19   42:aload_2         
	//   20   43:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//   21   48:ifeq            70
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:invokeinterface #165 <Method Object Iterator.next()>
	//   25   58:invokestatic    #169 <Method PlaybackStateCompat$CustomAction PlaybackStateCompat$CustomAction.fromCustomAction(Object)>
	//   26   61:invokeinterface #173 <Method boolean List.add(Object)>
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
	//*  32   75:getstatic       #137 <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   78:bipush          22
	//*  34   80:icmplt          91
				obj2 = ((Object) (PlaybackStateCompatApi22.getExtras(obj)));
	//   35   83:aload_0         
	//   36   84:invokestatic    #179 <Method Bundle PlaybackStateCompatApi22.getExtras(Object)>
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
	//   44   98:invokestatic    #183 <Method int PlaybackStateCompatApi21.getState(Object)>
	//   45  101:aload_0         
	//   46  102:invokestatic    #187 <Method long PlaybackStateCompatApi21.getPosition(Object)>
	//   47  105:aload_0         
	//   48  106:invokestatic    #190 <Method long PlaybackStateCompatApi21.getBufferedPosition(Object)>
	//   49  109:aload_0         
	//   50  110:invokestatic    #194 <Method float PlaybackStateCompatApi21.getPlaybackSpeed(Object)>
	//   51  113:aload_0         
	//   52  114:invokestatic    #197 <Method long PlaybackStateCompatApi21.getActions(Object)>
	//   53  117:iconst_0        
	//   54  118:aload_0         
	//   55  119:invokestatic    #201 <Method CharSequence PlaybackStateCompatApi21.getErrorMessage(Object)>
	//   56  122:aload_0         
	//   57  123:invokestatic    #204 <Method long PlaybackStateCompatApi21.getLastPositionUpdateTime(Object)>
	//   58  126:aload_1         
	//   59  127:aload_0         
	//   60  128:invokestatic    #207 <Method long PlaybackStateCompatApi21.getActiveQueueItemId(Object)>
	//   61  131:aload_2         
	//   62  132:invokespecial   #209 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
	//   63  135:astore_1        
			obj1.mStateObj = obj;
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:putfield        #211 <Field Object mStateObj>
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

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
	//    0    0:new             #216 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #218 <String "PlaybackState {">
	//    3    6:invokespecial   #221 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("state=");
	//    5   10:aload_1         
	//    6   11:ldc1            #223 <String "state=">
	//    7   13:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(mState);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #66  <Field int mState>
	//   12   22:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", position=");
	//   14   26:aload_1         
	//   15   27:ldc1            #232 <String ", position=">
	//   16   29:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(mPosition);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #68  <Field long mPosition>
	//   21   38:invokevirtual   #235 <Method StringBuilder StringBuilder.append(long)>
	//   22   41:pop             
		stringbuilder.append(", buffered position=");
	//   23   42:aload_1         
	//   24   43:ldc1            #237 <String ", buffered position=">
	//   25   45:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(mBufferedPosition);
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #70  <Field long mBufferedPosition>
	//   30   54:invokevirtual   #235 <Method StringBuilder StringBuilder.append(long)>
	//   31   57:pop             
		stringbuilder.append(", speed=");
	//   32   58:aload_1         
	//   33   59:ldc1            #239 <String ", speed=">
	//   34   61:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		stringbuilder.append(mSpeed);
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:getfield        #72  <Field float mSpeed>
	//   39   70:invokevirtual   #242 <Method StringBuilder StringBuilder.append(float)>
	//   40   73:pop             
		stringbuilder.append(", updated=");
	//   41   74:aload_1         
	//   42   75:ldc1            #244 <String ", updated=">
	//   43   77:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		stringbuilder.append(mUpdateTime);
	//   45   81:aload_1         
	//   46   82:aload_0         
	//   47   83:getfield        #80  <Field long mUpdateTime>
	//   48   86:invokevirtual   #235 <Method StringBuilder StringBuilder.append(long)>
	//   49   89:pop             
		stringbuilder.append(", actions=");
	//   50   90:aload_1         
	//   51   91:ldc1            #246 <String ", actions=">
	//   52   93:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		stringbuilder.append(mActions);
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:getfield        #74  <Field long mActions>
	//   57  102:invokevirtual   #235 <Method StringBuilder StringBuilder.append(long)>
	//   58  105:pop             
		stringbuilder.append(", error code=");
	//   59  106:aload_1         
	//   60  107:ldc1            #248 <String ", error code=">
	//   61  109:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
		stringbuilder.append(mErrorCode);
	//   63  113:aload_1         
	//   64  114:aload_0         
	//   65  115:getfield        #76  <Field int mErrorCode>
	//   66  118:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   67  121:pop             
		stringbuilder.append(", error message=");
	//   68  122:aload_1         
	//   69  123:ldc1            #250 <String ", error message=">
	//   70  125:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   71  128:pop             
		stringbuilder.append(mErrorMessage);
	//   72  129:aload_1         
	//   73  130:aload_0         
	//   74  131:getfield        #78  <Field CharSequence mErrorMessage>
	//   75  134:invokevirtual   #253 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   76  137:pop             
		stringbuilder.append(", custom actions=");
	//   77  138:aload_1         
	//   78  139:ldc1            #255 <String ", custom actions=">
	//   79  141:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   80  144:pop             
		stringbuilder.append(((Object) (mCustomActions)));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:getfield        #87  <Field List mCustomActions>
	//   84  150:invokevirtual   #258 <Method StringBuilder StringBuilder.append(Object)>
	//   85  153:pop             
		stringbuilder.append(", active item id=");
	//   86  154:aload_1         
	//   87  155:ldc2            #260 <String ", active item id=">
	//   88  158:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   89  161:pop             
		stringbuilder.append(mActiveItemId);
	//   90  162:aload_1         
	//   91  163:aload_0         
	//   92  164:getfield        #89  <Field long mActiveItemId>
	//   93  167:invokevirtual   #235 <Method StringBuilder StringBuilder.append(long)>
	//   94  170:pop             
		stringbuilder.append("}");
	//   95  171:aload_1         
	//   96  172:ldc2            #262 <String "}">
	//   97  175:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   98  178:pop             
		return stringbuilder.toString();
	//   99  179:aload_1         
	//  100  180:invokevirtual   #264 <Method String StringBuilder.toString()>
	//  101  183:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mState);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field int mState>
	//    3    5:invokevirtual   #269 <Method void Parcel.writeInt(int)>
		parcel.writeLong(mPosition);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field long mPosition>
	//    7   13:invokevirtual   #273 <Method void Parcel.writeLong(long)>
		parcel.writeFloat(mSpeed);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field float mSpeed>
	//   11   21:invokevirtual   #277 <Method void Parcel.writeFloat(float)>
		parcel.writeLong(mUpdateTime);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field long mUpdateTime>
	//   15   29:invokevirtual   #273 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mBufferedPosition);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #70  <Field long mBufferedPosition>
	//   19   37:invokevirtual   #273 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mActions);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #74  <Field long mActions>
	//   23   45:invokevirtual   #273 <Method void Parcel.writeLong(long)>
		TextUtils.writeToParcel(mErrorMessage, parcel, i);
	//   24   48:aload_0         
	//   25   49:getfield        #78  <Field CharSequence mErrorMessage>
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokestatic    #280 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeTypedList(mCustomActions);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #87  <Field List mCustomActions>
	//   32   62:invokevirtual   #284 <Method void Parcel.writeTypedList(List)>
		parcel.writeLong(mActiveItemId);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #89  <Field long mActiveItemId>
	//   36   70:invokevirtual   #273 <Method void Parcel.writeLong(long)>
		parcel.writeBundle(mExtras);
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #91  <Field Bundle mExtras>
	//   40   78:invokevirtual   #288 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeInt(mErrorCode);
	//   41   81:aload_1         
	//   42   82:aload_0         
	//   43   83:getfield        #76  <Field int mErrorCode>
	//   44   86:invokevirtual   #269 <Method void Parcel.writeInt(int)>
	//   45   89:return          
	}

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
	//    2    4:invokespecial   #59  <Method void PlaybackStateCompat$1()>
	//    3    7:putstatic       #61  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
