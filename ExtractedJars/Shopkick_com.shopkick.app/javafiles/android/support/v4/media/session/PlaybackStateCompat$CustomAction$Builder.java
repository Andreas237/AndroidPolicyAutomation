// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat

public static final class PlaybackStateCompat$CustomAction$Builder
{

	public PlaybackStateCompat.CustomAction build()
	{
		return new PlaybackStateCompat.CustomAction(mAction, mName, mIcon, mExtras);
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

	public PlaybackStateCompat$CustomAction$Builder setExtras(Bundle bundle)
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

	public PlaybackStateCompat$CustomAction$Builder(String s, CharSequence charsequence, int i)
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
