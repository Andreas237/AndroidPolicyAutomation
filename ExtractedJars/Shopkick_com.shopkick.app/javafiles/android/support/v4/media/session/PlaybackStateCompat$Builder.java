// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat

public static final class PlaybackStateCompat$Builder
{

	public PlaybackStateCompat$Builder addCustomAction(tion tion)
	{
		if(tion != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
		{
			mCustomActions.add(((Object) (tion)));
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

	public PlaybackStateCompat$Builder addCustomAction(String s, String s1, int i)
	{
		return addCustomAction(new tion(s, ((CharSequence) (s1)), i, ((Bundle) (null))));
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

	public PlaybackStateCompat$Builder setActions(long l)
	{
		mActions = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #60  <Field long mActions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaybackStateCompat$Builder setActiveQueueItemId(long l)
	{
		mActiveItemId = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #38  <Field long mActiveItemId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaybackStateCompat$Builder setBufferedPosition(long l)
	{
		mBufferedPosition = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #57  <Field long mBufferedPosition>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaybackStateCompat$Builder setErrorMessage(int i, CharSequence charsequence)
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

	public PlaybackStateCompat$Builder setErrorMessage(CharSequence charsequence)
	{
		mErrorMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field CharSequence mErrorMessage>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaybackStateCompat$Builder setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field Bundle mExtras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaybackStateCompat$Builder setState(int i, long l, float f)
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

	public PlaybackStateCompat$Builder setState(int i, long l, float f, long l1)
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

	public PlaybackStateCompat$Builder()
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

	public PlaybackStateCompat$Builder(PlaybackStateCompat playbackstatecompat)
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
