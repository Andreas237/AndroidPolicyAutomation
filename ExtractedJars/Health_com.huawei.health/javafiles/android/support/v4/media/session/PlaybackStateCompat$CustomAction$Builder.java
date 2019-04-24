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
