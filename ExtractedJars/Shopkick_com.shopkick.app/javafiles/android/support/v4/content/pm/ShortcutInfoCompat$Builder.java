// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.pm;

import android.content.*;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.content.pm:
//			ShortcutInfoCompat

public static class ShortcutInfoCompat$Builder
{

	public ShortcutInfoCompat build()
	{
		if(!TextUtils.isEmpty(mInfo.mLabel))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//*   2    4:getfield        #34  <Field CharSequence ShortcutInfoCompat.mLabel>
	//*   3    7:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifne            49
		{
			if(mInfo.mIntents != null && mInfo.mIntents.length != 0)
	//*   5   13:aload_0         
	//*   6   14:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//*   7   17:getfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
	//*   8   20:ifnull          39
	//*   9   23:aload_0         
	//*  10   24:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//*  11   27:getfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
	//*  12   30:arraylength     
	//*  13   31:ifeq            39
				return mInfo;
	//   14   34:aload_0         
	//   15   35:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//   16   38:areturn         
			else
				throw new IllegalArgumentException("Shortcut must have an intent");
	//   17   39:new             #46  <Class IllegalArgumentException>
	//   18   42:dup             
	//   19   43:ldc1            #48  <String "Shortcut must have an intent">
	//   20   45:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   21   48:athrow          
		} else
		{
			throw new IllegalArgumentException("Shortcut must have a non-empty label");
	//   22   49:new             #46  <Class IllegalArgumentException>
	//   23   52:dup             
	//   24   53:ldc1            #53  <String "Shortcut must have a non-empty label">
	//   25   55:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   26   58:athrow          
		}
	}

	public ShortcutInfoCompat$Builder setActivity(ComponentName componentname)
	{
		mInfo.mActivity = componentname;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #60  <Field ComponentName ShortcutInfoCompat.mActivity>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setAlwaysBadged()
	{
		mInfo.mIsAlwaysBadged = true;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:iconst_1        
	//    3    5:putfield        #66  <Field boolean ShortcutInfoCompat.mIsAlwaysBadged>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setDisabledMessage(CharSequence charsequence)
	{
		mInfo.mDisabledMessage = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #71  <Field CharSequence ShortcutInfoCompat.mDisabledMessage>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setIcon(IconCompat iconcompat)
	{
		mInfo.mIcon = iconcompat;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #77  <Field IconCompat ShortcutInfoCompat.mIcon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setIntent(Intent intent)
	{
		return setIntents(new Intent[] {
			intent
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       Intent[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:invokevirtual   #85  <Method ShortcutInfoCompat$Builder setIntents(Intent[])>
	//    8   12:areturn         
	}

	public ShortcutInfoCompat$Builder setIntents(Intent aintent[])
	{
		mInfo.mIntents = aintent;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #44  <Field Intent[] ShortcutInfoCompat.mIntents>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setLongLabel(CharSequence charsequence)
	{
		mInfo.mLongLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #89  <Field CharSequence ShortcutInfoCompat.mLongLabel>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ShortcutInfoCompat$Builder setShortLabel(CharSequence charsequence)
	{
		mInfo.mLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    2    4:aload_1         
	//    3    5:putfield        #34  <Field CharSequence ShortcutInfoCompat.mLabel>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final ShortcutInfoCompat mInfo = new ShortcutInfoCompat();

	public ShortcutInfoCompat$Builder(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ShortcutInfoCompat>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ShortcutInfoCompat()>
	//    6   12:putfield        #18  <Field ShortcutInfoCompat mInfo>
		ShortcutInfoCompat shortcutinfocompat = mInfo;
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field ShortcutInfoCompat mInfo>
	//    9   19:astore_3        
		shortcutinfocompat.mContext = context;
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:putfield        #22  <Field Context ShortcutInfoCompat.mContext>
		shortcutinfocompat.mId = s;
	//   13   25:aload_3         
	//   14   26:aload_2         
	//   15   27:putfield        #26  <Field String ShortcutInfoCompat.mId>
	//   16   30:return          
	}
}
