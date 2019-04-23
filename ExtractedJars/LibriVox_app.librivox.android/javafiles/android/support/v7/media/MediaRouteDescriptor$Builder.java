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

public final class MediaRouteDescriptor$Builder
{

	public MediaRouteDescriptor$Builder addControlFilter(IntentFilter intentfilter)
	{
		if(intentfilter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			if(mControlFilters == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field ArrayList mControlFilters>
	//*   4    8:ifnonnull       22
				mControlFilters = new ArrayList();
	//    5   11:aload_0         
	//    6   12:new             #38  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #63  <Method void ArrayList()>
	//    9   19:putfield        #43  <Field ArrayList mControlFilters>
			if(!mControlFilters.contains(((Object) (intentfilter))))
	//*  10   22:aload_0         
	//*  11   23:getfield        #43  <Field ArrayList mControlFilters>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #67  <Method boolean ArrayList.contains(Object)>
	//*  14   30:ifne            42
				mControlFilters.add(((Object) (intentfilter)));
	//   15   33:aload_0         
	//   16   34:getfield        #43  <Field ArrayList mControlFilters>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
	//   19   41:pop             
			return this;
	//   20   42:aload_0         
	//   21   43:areturn         
		} else
		{
			throw new IllegalArgumentException("filter must not be null");
	//   22   44:new             #45  <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:ldc1            #72  <String "filter must not be null">
	//   25   50:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
		}
	}

	public MediaRouteDescriptor$Builder addControlFilters(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
		{
			if(!collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #77  <Method boolean Collection.isEmpty()>
	//*   4   10:ifne            46
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addControlFilter((IntentFilter)((Iterator) (collection)).next()));
	//    5   13:aload_1         
	//    6   14:invokeinterface #81  <Method Iterator Collection.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            46
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #90  <Method Object Iterator.next()>
	//   14   36:checkcast       #92  <Class IntentFilter>
	//   15   39:invokevirtual   #94  <Method MediaRouteDescriptor$Builder addControlFilter(IntentFilter)>
	//   16   42:pop             
	//*  17   43:goto            20
			return this;
	//   18   46:aload_0         
	//   19   47:areturn         
		} else
		{
			throw new IllegalArgumentException("filters must not be null");
	//   20   48:new             #45  <Class IllegalArgumentException>
	//   21   51:dup             
	//   22   52:ldc1            #96  <String "filters must not be null">
	//   23   54:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   24   57:athrow          
		}
	}

	public MediaRouteDescriptor$Builder addGroupMemberId(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            47
		{
			if(mGroupMemberIds == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #104 <Field ArrayList mGroupMemberIds>
	//*   5   11:ifnonnull       25
				mGroupMemberIds = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #38  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #63  <Method void ArrayList()>
	//   10   22:putfield        #104 <Field ArrayList mGroupMemberIds>
			if(!mGroupMemberIds.contains(((Object) (s))))
	//*  11   25:aload_0         
	//*  12   26:getfield        #104 <Field ArrayList mGroupMemberIds>
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #67  <Method boolean ArrayList.contains(Object)>
	//*  15   33:ifne            45
				mGroupMemberIds.add(((Object) (s)));
	//   16   36:aload_0         
	//   17   37:getfield        #104 <Field ArrayList mGroupMemberIds>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #70  <Method boolean ArrayList.add(Object)>
	//   20   44:pop             
			return this;
	//   21   45:aload_0         
	//   22   46:areturn         
		} else
		{
			throw new IllegalArgumentException("groupMemberId must not be empty");
	//   23   47:new             #45  <Class IllegalArgumentException>
	//   24   50:dup             
	//   25   51:ldc1            #106 <String "groupMemberId must not be empty">
	//   26   53:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   27   56:athrow          
		}
	}

	public MediaRouteDescriptor$Builder addGroupMemberIds(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
		{
			if(!collection.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #77  <Method boolean Collection.isEmpty()>
	//*   4   10:ifne            46
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); addGroupMemberId((String)((Iterator) (collection)).next()));
	//    5   13:aload_1         
	//    6   14:invokeinterface #81  <Method Iterator Collection.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            46
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #90  <Method Object Iterator.next()>
	//   14   36:checkcast       #109 <Class String>
	//   15   39:invokevirtual   #111 <Method MediaRouteDescriptor$Builder addGroupMemberId(String)>
	//   16   42:pop             
	//*  17   43:goto            20
			return this;
	//   18   46:aload_0         
	//   19   47:areturn         
		} else
		{
			throw new IllegalArgumentException("groupMemberIds must not be null");
	//   20   48:new             #45  <Class IllegalArgumentException>
	//   21   51:dup             
	//   22   52:ldc1            #113 <String "groupMemberIds must not be null">
	//   23   54:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   24   57:athrow          
		}
	}

	public MediaRouteDescriptor build()
	{
		ArrayList arraylist = mControlFilters;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ArrayList mControlFilters>
	//    2    4:astore_1        
		if(arraylist != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			mBundle.putParcelableArrayList("controlFilters", arraylist);
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Bundle mBundle>
	//    7   13:ldc1            #117 <String "controlFilters">
	//    8   15:aload_1         
	//    9   16:invokevirtual   #121 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		arraylist = mGroupMemberIds;
	//   10   19:aload_0         
	//   11   20:getfield        #104 <Field ArrayList mGroupMemberIds>
	//   12   23:astore_1        
		if(arraylist != null)
	//*  13   24:aload_1         
	//*  14   25:ifnull          38
			mBundle.putStringArrayList("groupMemberIds", arraylist);
	//   15   28:aload_0         
	//   16   29:getfield        #24  <Field Bundle mBundle>
	//   17   32:ldc1            #123 <String "groupMemberIds">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #126 <Method void Bundle.putStringArrayList(String, ArrayList)>
		return new MediaRouteDescriptor(mBundle, ((List) (mControlFilters)));
	//   20   38:new             #18  <Class MediaRouteDescriptor>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:getfield        #24  <Field Bundle mBundle>
	//   24   46:aload_0         
	//   25   47:getfield        #43  <Field ArrayList mControlFilters>
	//   26   50:invokespecial   #129 <Method void MediaRouteDescriptor(Bundle, List)>
	//   27   53:areturn         
	}

	public MediaRouteDescriptor$Builder setCanDisconnect(boolean flag)
	{
		mBundle.putBoolean("canDisconnect", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #133 <String "canDisconnect">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #137 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setConnecting(boolean flag)
	{
		mBundle.putBoolean("connecting", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #141 <String "connecting">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #137 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setConnectionState(int i)
	{
		mBundle.putInt("connectionState", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #146 <String "connectionState">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setDescription(String s)
	{
		mBundle.putString("status", s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #153 <String "status">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #156 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setDeviceType(int i)
	{
		mBundle.putInt("deviceType", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #159 <String "deviceType">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setEnabled(boolean flag)
	{
		mBundle.putBoolean("enabled", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #162 <String "enabled">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #137 <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setExtras(Bundle bundle)
	{
		mBundle.putBundle("extras", bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #166 <String "extras">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #170 <Method void Bundle.putBundle(String, Bundle)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setIconUri(Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
		{
			mBundle.putString("iconUri", uri.toString());
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Bundle mBundle>
	//    4    8:ldc1            #174 <String "iconUri">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #180 <Method String Uri.toString()>
	//    7   14:invokevirtual   #156 <Method void Bundle.putString(String, String)>
			return this;
	//    8   17:aload_0         
	//    9   18:areturn         
		} else
		{
			throw new IllegalArgumentException("iconUri must not be null");
	//   10   19:new             #45  <Class IllegalArgumentException>
	//   11   22:dup             
	//   12   23:ldc1            #182 <String "iconUri must not be null">
	//   13   25:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		}
	}

	public MediaRouteDescriptor$Builder setId(String s)
	{
		mBundle.putString("id", s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #184 <String "id">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #156 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setMaxClientVersion(int i)
	{
		mBundle.putInt("maxClientVersion", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #187 <String "maxClientVersion">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setMinClientVersion(int i)
	{
		mBundle.putInt("minClientVersion", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #190 <String "minClientVersion">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setName(String s)
	{
		mBundle.putString("name", s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #192 <String "name">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #156 <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPlaybackStream(int i)
	{
		mBundle.putInt("playbackStream", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #195 <String "playbackStream">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPlaybackType(int i)
	{
		mBundle.putInt("playbackType", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #198 <String "playbackType">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setPresentationDisplayId(int i)
	{
		mBundle.putInt("presentationDisplayId", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #201 <String "presentationDisplayId">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setSettingsActivity(IntentSender intentsender)
	{
		mBundle.putParcelable("settingsIntent", ((android.os.Parcelable) (intentsender)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #205 <String "settingsIntent">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #209 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolume(int i)
	{
		mBundle.putInt("volume", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #212 <String "volume">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolumeHandling(int i)
	{
		mBundle.putInt("volumeHandling", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #215 <String "volumeHandling">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaRouteDescriptor$Builder setVolumeMax(int i)
	{
		mBundle.putInt("volumeMax", i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Bundle mBundle>
	//    2    4:ldc1            #218 <String "volumeMax">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #150 <Method void Bundle.putInt(String, int)>
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
	//    1    1:invokespecial   #14  <Method void Object()>
		if(mediaroutedescriptor != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          55
		{
			mBundle = new Bundle(mediaroutedescriptor.mBundle);
	//    4    8:aload_0         
	//    5    9:new             #16  <Class Bundle>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:getfield        #20  <Field Bundle MediaRouteDescriptor.mBundle>
	//    9   17:invokespecial   #23  <Method void Bundle(Bundle)>
	//   10   20:putfield        #24  <Field Bundle mBundle>
			mediaroutedescriptor.ensureControlFilters();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #27  <Method void MediaRouteDescriptor.ensureControlFilters()>
			if(!mediaroutedescriptor.mControlFilters.isEmpty())
	//*  13   27:aload_1         
	//*  14   28:getfield        #30  <Field List MediaRouteDescriptor.mControlFilters>
	//*  15   31:invokeinterface #36  <Method boolean List.isEmpty()>
	//*  16   36:ifne            54
				mControlFilters = new ArrayList(((Collection) (mediaroutedescriptor.mControlFilters)));
	//   17   39:aload_0         
	//   18   40:new             #38  <Class ArrayList>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:getfield        #30  <Field List MediaRouteDescriptor.mControlFilters>
	//   22   48:invokespecial   #41  <Method void ArrayList(Collection)>
	//   23   51:putfield        #43  <Field ArrayList mControlFilters>
			return;
	//   24   54:return          
		} else
		{
			throw new IllegalArgumentException("descriptor must not be null");
	//   25   55:new             #45  <Class IllegalArgumentException>
	//   26   58:dup             
	//   27   59:ldc1            #47  <String "descriptor must not be null">
	//   28   61:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   29   64:athrow          
		}
	}

	public MediaRouteDescriptor$Builder(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void Bundle()>
	//    6   12:putfield        #24  <Field Bundle mBundle>
		setId(s);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #57  <Method MediaRouteDescriptor$Builder setId(String)>
	//   10   20:pop             
		setName(s1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #60  <Method MediaRouteDescriptor$Builder setName(String)>
	//   14   26:pop             
	//   15   27:return          
	}
}
