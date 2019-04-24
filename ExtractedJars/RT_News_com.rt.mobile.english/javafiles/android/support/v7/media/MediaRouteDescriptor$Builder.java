// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteDescriptor

public static final class MediaRouteDescriptor$Builder
{

	public MediaRouteDescriptor$Builder addControlFilter(IntentFilter intentfilter)
	{
		if(intentfilter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("filter must not be null");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #67  <String "filter must not be null">
	//    5   10:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(mControlFilters == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #53  <Field ArrayList mControlFilters>
	//*   9   18:ifnonnull       32
			mControlFilters = new ArrayList();
	//   10   21:aload_0         
	//   11   22:new             #48  <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #68  <Method void ArrayList()>
	//   14   29:putfield        #53  <Field ArrayList mControlFilters>
		if(!mControlFilters.contains(((Object) (intentfilter))))
	//*  15   32:aload_0         
	//*  16   33:getfield        #53  <Field ArrayList mControlFilters>
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #72  <Method boolean ArrayList.contains(Object)>
	//*  19   40:ifne            52
			mControlFilters.add(((Object) (intentfilter)));
	//   20   43:aload_0         
	//   21   44:getfield        #53  <Field ArrayList mControlFilters>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   24   51:pop             
		return this;
	//   25   52:aload_0         
	//   26   53:areturn         
	}

	public MediaRouteDescriptor$Builder addControlFilters(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("filters must not be null");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #79  <String "filters must not be null">
	//    5   10:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!collection.isEmpty())
	//*   7   14:aload_1         
	//*   8   15:invokeinterface #82  <Method boolean Collection.isEmpty()>
	//*   9   20:ifne            56
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addControlFilter((IntentFilter)((Iterator) (collection)).next()));
	//   10   23:aload_1         
	//   11   24:invokeinterface #86  <Method Iterator Collection.iterator()>
	//   12   29:astore_1        
	//   13   30:aload_1         
	//   14   31:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            56
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:invokeinterface #95  <Method Object Iterator.next()>
	//   19   46:checkcast       #97  <Class IntentFilter>
	//   20   49:invokevirtual   #99  <Method MediaRouteDescriptor$Builder addControlFilter(IntentFilter)>
	//   21   52:pop             
	//*  22   53:goto            30
		return this;
	//   23   56:aload_0         
	//   24   57:areturn         
	}

	public MediaRouteDescriptor$Builder addGroupMemberId(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #111 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("groupMemberId must not be empty");
	//    3    7:new             #21  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #113 <String "groupMemberId must not be empty">
	//    6   13:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(mGroupMemberIds == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #115 <Field ArrayList mGroupMemberIds>
	//*  10   21:ifnonnull       35
			mGroupMemberIds = new ArrayList();
	//   11   24:aload_0         
	//   12   25:new             #48  <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #68  <Method void ArrayList()>
	//   15   32:putfield        #115 <Field ArrayList mGroupMemberIds>
		if(!mGroupMemberIds.contains(((Object) (s))))
	//*  16   35:aload_0         
	//*  17   36:getfield        #115 <Field ArrayList mGroupMemberIds>
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #72  <Method boolean ArrayList.contains(Object)>
	//*  20   43:ifne            55
			mGroupMemberIds.add(((Object) (s)));
	//   21   46:aload_0         
	//   22   47:getfield        #115 <Field ArrayList mGroupMemberIds>
	//   23   50:aload_1         
	//   24   51:invokevirtual   #75  <Method boolean ArrayList.add(Object)>
	//   25   54:pop             
		return this;
	//   26   55:aload_0         
	//   27   56:areturn         
	}

	public MediaRouteDescriptor$Builder addGroupMemberIds(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("groupMemberIds must not be null");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #119 <String "groupMemberIds must not be null">
	//    5   10:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!collection.isEmpty())
	//*   7   14:aload_1         
	//*   8   15:invokeinterface #82  <Method boolean Collection.isEmpty()>
	//*   9   20:ifne            56
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addGroupMemberId((String)((Iterator) (collection)).next()));
	//   10   23:aload_1         
	//   11   24:invokeinterface #86  <Method Iterator Collection.iterator()>
	//   12   29:astore_1        
	//   13   30:aload_1         
	//   14   31:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            56
	//   16   39:aload_0         
	//   17   40:aload_1         
	//   18   41:invokeinterface #95  <Method Object Iterator.next()>
	//   19   46:checkcast       #121 <Class String>
	//   20   49:invokevirtual   #123 <Method MediaRouteDescriptor$Builder addGroupMemberId(String)>
	//   21   52:pop             
	//*  22   53:goto            30
		return this;
	//   23   56:aload_0         
	//   24   57:areturn         
	}

	public MediaRouteDescriptor build()
	{
		if(mControlFilters != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ArrayList mControlFilters>
	//*   2    4:ifnull          20
			mBundle.putParcelableArrayList("controlFilters", mControlFilters);
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field Bundle mBundle>
	//    5   11:ldc1            #128 <String "controlFilters">
	//    6   13:aload_0         
	//    7   14:getfield        #53  <Field ArrayList mControlFilters>
	//    8   17:invokevirtual   #132 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		if(mGroupMemberIds != null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #115 <Field ArrayList mGroupMemberIds>
	//*  11   24:ifnull          40
			mBundle.putStringArrayList("groupMemberIds", mGroupMemberIds);
	//   12   27:aload_0         
	//   13   28:getfield        #34  <Field Bundle mBundle>
	//   14   31:ldc1            #134 <String "groupMemberIds">
	//   15   33:aload_0         
	//   16   34:getfield        #115 <Field ArrayList mGroupMemberIds>
	//   17   37:invokevirtual   #137 <Method void Bundle.putStringArrayList(String, ArrayList)>
		return new MediaRouteDescriptor(mBundle, ((List) (mControlFilters)));
	//   18   40:new             #6   <Class MediaRouteDescriptor>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:getfield        #34  <Field Bundle mBundle>
	//   22   48:aload_0         
	//   23   49:getfield        #53  <Field ArrayList mControlFilters>
	//   24   52:invokespecial   #140 <Method void MediaRouteDescriptor(Bundle, List)>
	//   25   55:areturn         
	}

	public MediaRouteDescriptor$Builder setCanDisconnect(boolean flag)
	{
		mBundle.putBoolean("canDisconnect", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #144 <String "canDisconnect">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #148 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setConnecting(boolean flag)
	{
		mBundle.putBoolean("connecting", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #152 <String "connecting">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #148 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setConnectionState(int i)
	{
		mBundle.putInt("connectionState", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #157 <String "connectionState">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setDescription(String s)
	{
		mBundle.putString("status", s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #164 <String "status">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #167 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setDeviceType(int i)
	{
		mBundle.putInt("deviceType", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #170 <String "deviceType">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setEnabled(boolean flag)
	{
		mBundle.putBoolean("enabled", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #173 <String "enabled">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #148 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setExtras(Bundle bundle)
	{
		mBundle.putBundle("extras", bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #177 <String "extras">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #181 <Method void Bundle.putBundle(String, Bundle)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setIconUri(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("iconUri must not be null");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #185 <String "iconUri must not be null">
	//    5   10:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			mBundle.putString("iconUri", uri.toString());
	//    7   14:aload_0         
	//    8   15:getfield        #34  <Field Bundle mBundle>
	//    9   18:ldc1            #187 <String "iconUri">
	//   10   20:aload_1         
	//   11   21:invokevirtual   #193 <Method String Uri.toString()>
	//   12   24:invokevirtual   #167 <Method void Bundle.putString(String, String)>
			return this;
	//   13   27:aload_0         
	//   14   28:areturn         
		}
	}

	public MediaRouteDescriptor$Builder setId(String s)
	{
		mBundle.putString("id", s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #195 <String "id">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #167 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setMaxClientVersion(int i)
	{
		mBundle.putInt("maxClientVersion", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #198 <String "maxClientVersion">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setMinClientVersion(int i)
	{
		mBundle.putInt("minClientVersion", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #201 <String "minClientVersion">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setName(String s)
	{
		mBundle.putString("name", s);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #203 <String "name">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #167 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPlaybackStream(int i)
	{
		mBundle.putInt("playbackStream", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #206 <String "playbackStream">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPlaybackType(int i)
	{
		mBundle.putInt("playbackType", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #209 <String "playbackType">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPresentationDisplayId(int i)
	{
		mBundle.putInt("presentationDisplayId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #212 <String "presentationDisplayId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setSettingsActivity(IntentSender intentsender)
	{
		mBundle.putParcelable("settingsIntent", ((android.os.Parcelable) (intentsender)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #216 <String "settingsIntent">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #220 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolume(int i)
	{
		mBundle.putInt("volume", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #223 <String "volume">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolumeHandling(int i)
	{
		mBundle.putInt("volumeHandling", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #226 <String "volumeHandling">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolumeMax(int i)
	{
		mBundle.putInt("volumeMax", i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Bundle mBundle>
	//    2    4:ldc1            #229 <String "volumeMax">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #161 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	private final Bundle mBundle;
	private ArrayList mControlFilters;
	private ArrayList mGroupMemberIds;

	public MediaRouteDescriptor$Builder(MediaRouteDescriptor mediaroutedescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(mediaroutedescriptor == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("descriptor must not be null");
	//    4    8:new             #21  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #23  <String "descriptor must not be null">
	//    7   14:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		mBundle = new Bundle(mediaroutedescriptor.mBundle);
	//    9   18:aload_0         
	//   10   19:new             #28  <Class Bundle>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:getfield        #30  <Field Bundle MediaRouteDescriptor.mBundle>
	//   14   27:invokespecial   #33  <Method void Bundle(Bundle)>
	//   15   30:putfield        #34  <Field Bundle mBundle>
		mediaroutedescriptor.ensureControlFilters();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #37  <Method void MediaRouteDescriptor.ensureControlFilters()>
		if(!mediaroutedescriptor.mControlFilters.isEmpty())
	//*  18   37:aload_1         
	//*  19   38:getfield        #40  <Field List MediaRouteDescriptor.mControlFilters>
	//*  20   41:invokeinterface #46  <Method boolean List.isEmpty()>
	//*  21   46:ifne            64
			mControlFilters = new ArrayList(((Collection) (mediaroutedescriptor.mControlFilters)));
	//   22   49:aload_0         
	//   23   50:new             #48  <Class ArrayList>
	//   24   53:dup             
	//   25   54:aload_1         
	//   26   55:getfield        #40  <Field List MediaRouteDescriptor.mControlFilters>
	//   27   58:invokespecial   #51  <Method void ArrayList(Collection)>
	//   28   61:putfield        #53  <Field ArrayList mControlFilters>
	//   29   64:return          
	}

	public MediaRouteDescriptor$Builder(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void Bundle()>
	//    6   12:putfield        #34  <Field Bundle mBundle>
		setId(s);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #60  <Method MediaRouteDescriptor$Builder setId(String)>
	//   10   20:pop             
		setName(s1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #63  <Method MediaRouteDescriptor$Builder setName(String)>
	//   14   26:pop             
	//   15   27:return          
	}
}
