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

public final class MediaRouteDescriptor
{
	public static final class Builder
	{

		public Builder addControlFilter(IntentFilter intentfilter)
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

		public Builder addControlFilters(Collection collection)
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

		public Builder addGroupMemberId(String s)
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

		public Builder addGroupMemberIds(Collection collection)
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

		public Builder setCanDisconnect(boolean flag)
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

		public Builder setConnecting(boolean flag)
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

		public Builder setConnectionState(int i)
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

		public Builder setDescription(String s)
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

		public Builder setDeviceType(int i)
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

		public Builder setEnabled(boolean flag)
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

		public Builder setExtras(Bundle bundle)
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

		public Builder setIconUri(Uri uri)
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

		public Builder setId(String s)
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

		public Builder setMaxClientVersion(int i)
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

		public Builder setMinClientVersion(int i)
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

		public Builder setName(String s)
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

		public Builder setPlaybackStream(int i)
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

		public Builder setPlaybackType(int i)
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

		public Builder setPresentationDisplayId(int i)
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

		public Builder setSettingsActivity(IntentSender intentsender)
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

		public Builder setVolume(int i)
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

		public Builder setVolumeHandling(int i)
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

		public Builder setVolumeMax(int i)
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

		public Builder(MediaRouteDescriptor mediaroutedescriptor)
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

		public Builder(String s, String s1)
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


	MediaRouteDescriptor(Bundle bundle, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #83  <Field Bundle mBundle>
		mControlFilters = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #85  <Field List mControlFilters>
	//    8   14:return          
	}

	public static MediaRouteDescriptor fromBundle(Bundle bundle)
	{
		MediaRouteDescriptor mediaroutedescriptor = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(bundle != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          16
			mediaroutedescriptor = new MediaRouteDescriptor(bundle, ((List) (null)));
	//    4    6:new             #2   <Class MediaRouteDescriptor>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #92  <Method void MediaRouteDescriptor(Bundle, List)>
	//    9   15:astore_1        
		return mediaroutedescriptor;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public boolean canDisconnectAndKeepPlaying()
	{
		return mBundle.getBoolean("canDisconnect", false);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #11  <String "canDisconnect">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #102 <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	void ensureControlFilters()
	{
		if(mControlFilters == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field List mControlFilters>
	//*   2    4:ifnonnull       34
		{
			mControlFilters = ((List) (mBundle.getParcelableArrayList("controlFilters")));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field Bundle mBundle>
	//    6   12:ldc1            #20  <String "controlFilters">
	//    7   14:invokevirtual   #107 <Method ArrayList Bundle.getParcelableArrayList(String)>
	//    8   17:putfield        #85  <Field List mControlFilters>
			if(mControlFilters == null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #85  <Field List mControlFilters>
	//*  11   24:ifnonnull       34
				mControlFilters = Collections.emptyList();
	//   12   27:aload_0         
	//   13   28:invokestatic    #113 <Method List Collections.emptyList()>
	//   14   31:putfield        #85  <Field List mControlFilters>
		}
	//   15   34:return          
	}

	public int getConnectionState()
	{
		return mBundle.getInt("connectionState", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #17  <String "connectionState">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public List getControlFilters()
	{
		ensureControlFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method void ensureControlFilters()>
		return mControlFilters;
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field List mControlFilters>
	//    4    8:areturn         
	}

	public String getDescription()
	{
		return mBundle.getString("status");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #23  <String "status">
	//    3    6:invokevirtual   #129 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getDeviceType()
	{
		return mBundle.getInt("deviceType");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #26  <String "deviceType">
	//    3    6:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public Bundle getExtras()
	{
		return mBundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #32  <String "extras">
	//    3    6:invokevirtual   #138 <Method Bundle Bundle.getBundle(String)>
	//    4    9:areturn         
	}

	public List getGroupMemberIds()
	{
		return ((List) (mBundle.getStringArrayList("groupMemberIds")));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #35  <String "groupMemberIds">
	//    3    6:invokevirtual   #146 <Method ArrayList Bundle.getStringArrayList(String)>
	//    4    9:areturn         
	}

	public Uri getIconUri()
	{
		String s = mBundle.getString("iconUri");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #38  <String "iconUri">
	//    3    6:invokevirtual   #129 <Method String Bundle.getString(String)>
	//    4    9:astore_1        
		if(s == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return Uri.parse(s);
	//    9   16:aload_1         
	//   10   17:invokestatic    #156 <Method Uri Uri.parse(String)>
	//   11   20:areturn         
	}

	public String getId()
	{
		return mBundle.getString("id");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #41  <String "id">
	//    3    6:invokevirtual   #129 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getMaxClientVersion()
	{
		return mBundle.getInt("maxClientVersion", 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #44  <String "maxClientVersion">
	//    3    6:ldc1            #159 <Int 0x7fffffff>
	//    4    8:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   11:ireturn         
	}

	public int getMinClientVersion()
	{
		return mBundle.getInt("minClientVersion", 1);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #47  <String "minClientVersion">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public String getName()
	{
		return mBundle.getString("name");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #50  <String "name">
	//    3    6:invokevirtual   #129 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getPlaybackStream()
	{
		return mBundle.getInt("playbackStream", -1);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #53  <String "playbackStream">
	//    3    6:iconst_m1       
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getPlaybackType()
	{
		return mBundle.getInt("playbackType", 1);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #56  <String "playbackType">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getPresentationDisplayId()
	{
		return mBundle.getInt("presentationDisplayId", -1);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #59  <String "presentationDisplayId">
	//    3    6:iconst_m1       
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public IntentSender getSettingsActivity()
	{
		return (IntentSender)mBundle.getParcelable("settingsIntent");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #62  <String "settingsIntent">
	//    3    6:invokevirtual   #170 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    4    9:checkcast       #172 <Class IntentSender>
	//    5   12:areturn         
	}

	public int getVolume()
	{
		return mBundle.getInt("volume");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #65  <String "volume">
	//    3    6:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public int getVolumeHandling()
	{
		return mBundle.getInt("volumeHandling", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #68  <String "volumeHandling">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #119 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getVolumeMax()
	{
		return mBundle.getInt("volumeMax");
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #71  <String "volumeMax">
	//    3    6:invokevirtual   #133 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public boolean isConnecting()
	{
		return mBundle.getBoolean("connecting", false);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #14  <String "connecting">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #102 <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	public boolean isEnabled()
	{
		return mBundle.getBoolean("enabled", true);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Bundle mBundle>
	//    2    4:ldc1            #29  <String "enabled">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #102 <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	public boolean isValid()
	{
		ensureControlFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method void ensureControlFilters()>
		return !TextUtils.isEmpty(((CharSequence) (getId()))) && !TextUtils.isEmpty(((CharSequence) (getName()))) && !mControlFilters.contains(((Object) (null)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #182 <Method String getId()>
	//    4    8:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5   11:ifne            42
	//    6   14:aload_0         
	//    7   15:invokevirtual   #190 <Method String getName()>
	//    8   18:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   21:ifne            42
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field List mControlFilters>
	//   12   28:aconst_null     
	//   13   29:invokeinterface #196 <Method boolean List.contains(Object)>
	//   14   34:ifeq            40
	//   15   37:goto            42
	//   16   40:iconst_1        
	//   17   41:ireturn         
	//   18   42:iconst_0        
	//   19   43:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #199 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouteDescriptor{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #202 <String "MediaRouteDescriptor{ ">
	//    6   11:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("id=");
	//    8   15:aload_1         
	//    9   16:ldc1            #208 <String "id=">
	//   10   18:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(getId());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #182 <Method String getId()>
	//   15   27:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(", groupMemberIds=");
	//   17   31:aload_1         
	//   18   32:ldc1            #210 <String ", groupMemberIds=">
	//   19   34:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (getGroupMemberIds())));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #212 <Method List getGroupMemberIds()>
	//   24   43:invokevirtual   #215 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", name=");
	//   26   47:aload_1         
	//   27   48:ldc1            #217 <String ", name=">
	//   28   50:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(getName());
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:invokevirtual   #190 <Method String getName()>
	//   33   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(", description=");
	//   35   63:aload_1         
	//   36   64:ldc1            #219 <String ", description=">
	//   37   66:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		stringbuilder.append(getDescription());
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:invokevirtual   #221 <Method String getDescription()>
	//   42   75:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(", iconUri=");
	//   44   79:aload_1         
	//   45   80:ldc1            #223 <String ", iconUri=">
	//   46   82:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
		stringbuilder.append(((Object) (getIconUri())));
	//   48   86:aload_1         
	//   49   87:aload_0         
	//   50   88:invokevirtual   #225 <Method Uri getIconUri()>
	//   51   91:invokevirtual   #215 <Method StringBuilder StringBuilder.append(Object)>
	//   52   94:pop             
		stringbuilder.append(", isEnabled=");
	//   53   95:aload_1         
	//   54   96:ldc1            #227 <String ", isEnabled=">
	//   55   98:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   56  101:pop             
		stringbuilder.append(isEnabled());
	//   57  102:aload_1         
	//   58  103:aload_0         
	//   59  104:invokevirtual   #229 <Method boolean isEnabled()>
	//   60  107:invokevirtual   #232 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  110:pop             
		stringbuilder.append(", isConnecting=");
	//   62  111:aload_1         
	//   63  112:ldc1            #234 <String ", isConnecting=">
	//   64  114:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   65  117:pop             
		stringbuilder.append(isConnecting());
	//   66  118:aload_1         
	//   67  119:aload_0         
	//   68  120:invokevirtual   #236 <Method boolean isConnecting()>
	//   69  123:invokevirtual   #232 <Method StringBuilder StringBuilder.append(boolean)>
	//   70  126:pop             
		stringbuilder.append(", connectionState=");
	//   71  127:aload_1         
	//   72  128:ldc1            #238 <String ", connectionState=">
	//   73  130:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   74  133:pop             
		stringbuilder.append(getConnectionState());
	//   75  134:aload_1         
	//   76  135:aload_0         
	//   77  136:invokevirtual   #240 <Method int getConnectionState()>
	//   78  139:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//   79  142:pop             
		stringbuilder.append(", controlFilters=");
	//   80  143:aload_1         
	//   81  144:ldc1            #245 <String ", controlFilters=">
	//   82  146:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   83  149:pop             
		stringbuilder.append(Arrays.toString(getControlFilters().toArray()));
	//   84  150:aload_1         
	//   85  151:aload_0         
	//   86  152:invokevirtual   #247 <Method List getControlFilters()>
	//   87  155:invokeinterface #251 <Method Object[] List.toArray()>
	//   88  160:invokestatic    #256 <Method String Arrays.toString(Object[])>
	//   89  163:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   90  166:pop             
		stringbuilder.append(", playbackType=");
	//   91  167:aload_1         
	//   92  168:ldc2            #258 <String ", playbackType=">
	//   93  171:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   94  174:pop             
		stringbuilder.append(getPlaybackType());
	//   95  175:aload_1         
	//   96  176:aload_0         
	//   97  177:invokevirtual   #260 <Method int getPlaybackType()>
	//   98  180:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//   99  183:pop             
		stringbuilder.append(", playbackStream=");
	//  100  184:aload_1         
	//  101  185:ldc2            #262 <String ", playbackStream=">
	//  102  188:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  103  191:pop             
		stringbuilder.append(getPlaybackStream());
	//  104  192:aload_1         
	//  105  193:aload_0         
	//  106  194:invokevirtual   #264 <Method int getPlaybackStream()>
	//  107  197:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  108  200:pop             
		stringbuilder.append(", deviceType=");
	//  109  201:aload_1         
	//  110  202:ldc2            #266 <String ", deviceType=">
	//  111  205:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  112  208:pop             
		stringbuilder.append(getDeviceType());
	//  113  209:aload_1         
	//  114  210:aload_0         
	//  115  211:invokevirtual   #268 <Method int getDeviceType()>
	//  116  214:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  117  217:pop             
		stringbuilder.append(", volume=");
	//  118  218:aload_1         
	//  119  219:ldc2            #270 <String ", volume=">
	//  120  222:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  121  225:pop             
		stringbuilder.append(getVolume());
	//  122  226:aload_1         
	//  123  227:aload_0         
	//  124  228:invokevirtual   #272 <Method int getVolume()>
	//  125  231:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  126  234:pop             
		stringbuilder.append(", volumeMax=");
	//  127  235:aload_1         
	//  128  236:ldc2            #274 <String ", volumeMax=">
	//  129  239:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  130  242:pop             
		stringbuilder.append(getVolumeMax());
	//  131  243:aload_1         
	//  132  244:aload_0         
	//  133  245:invokevirtual   #276 <Method int getVolumeMax()>
	//  134  248:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  135  251:pop             
		stringbuilder.append(", volumeHandling=");
	//  136  252:aload_1         
	//  137  253:ldc2            #278 <String ", volumeHandling=">
	//  138  256:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  139  259:pop             
		stringbuilder.append(getVolumeHandling());
	//  140  260:aload_1         
	//  141  261:aload_0         
	//  142  262:invokevirtual   #280 <Method int getVolumeHandling()>
	//  143  265:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  144  268:pop             
		stringbuilder.append(", presentationDisplayId=");
	//  145  269:aload_1         
	//  146  270:ldc2            #282 <String ", presentationDisplayId=">
	//  147  273:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  148  276:pop             
		stringbuilder.append(getPresentationDisplayId());
	//  149  277:aload_1         
	//  150  278:aload_0         
	//  151  279:invokevirtual   #284 <Method int getPresentationDisplayId()>
	//  152  282:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  153  285:pop             
		stringbuilder.append(", extras=");
	//  154  286:aload_1         
	//  155  287:ldc2            #286 <String ", extras=">
	//  156  290:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  157  293:pop             
		stringbuilder.append(((Object) (getExtras())));
	//  158  294:aload_1         
	//  159  295:aload_0         
	//  160  296:invokevirtual   #288 <Method Bundle getExtras()>
	//  161  299:invokevirtual   #215 <Method StringBuilder StringBuilder.append(Object)>
	//  162  302:pop             
		stringbuilder.append(", isValid=");
	//  163  303:aload_1         
	//  164  304:ldc2            #290 <String ", isValid=">
	//  165  307:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  166  310:pop             
		stringbuilder.append(isValid());
	//  167  311:aload_1         
	//  168  312:aload_0         
	//  169  313:invokevirtual   #292 <Method boolean isValid()>
	//  170  316:invokevirtual   #232 <Method StringBuilder StringBuilder.append(boolean)>
	//  171  319:pop             
		stringbuilder.append(", minClientVersion=");
	//  172  320:aload_1         
	//  173  321:ldc2            #294 <String ", minClientVersion=">
	//  174  324:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  175  327:pop             
		stringbuilder.append(getMinClientVersion());
	//  176  328:aload_1         
	//  177  329:aload_0         
	//  178  330:invokevirtual   #296 <Method int getMinClientVersion()>
	//  179  333:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  180  336:pop             
		stringbuilder.append(", maxClientVersion=");
	//  181  337:aload_1         
	//  182  338:ldc2            #298 <String ", maxClientVersion=">
	//  183  341:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  184  344:pop             
		stringbuilder.append(getMaxClientVersion());
	//  185  345:aload_1         
	//  186  346:aload_0         
	//  187  347:invokevirtual   #300 <Method int getMaxClientVersion()>
	//  188  350:invokevirtual   #243 <Method StringBuilder StringBuilder.append(int)>
	//  189  353:pop             
		stringbuilder.append(" }");
	//  190  354:aload_1         
	//  191  355:ldc2            #302 <String " }">
	//  192  358:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  193  361:pop             
		return stringbuilder.toString();
	//  194  362:aload_1         
	//  195  363:invokevirtual   #304 <Method String StringBuilder.toString()>
	//  196  366:areturn         
	}

	static final String KEY_CAN_DISCONNECT = "canDisconnect";
	static final String KEY_CONNECTING = "connecting";
	static final String KEY_CONNECTION_STATE = "connectionState";
	static final String KEY_CONTROL_FILTERS = "controlFilters";
	static final String KEY_DESCRIPTION = "status";
	static final String KEY_DEVICE_TYPE = "deviceType";
	static final String KEY_ENABLED = "enabled";
	static final String KEY_EXTRAS = "extras";
	static final String KEY_GROUP_MEMBER_IDS = "groupMemberIds";
	static final String KEY_ICON_URI = "iconUri";
	static final String KEY_ID = "id";
	static final String KEY_MAX_CLIENT_VERSION = "maxClientVersion";
	static final String KEY_MIN_CLIENT_VERSION = "minClientVersion";
	static final String KEY_NAME = "name";
	static final String KEY_PLAYBACK_STREAM = "playbackStream";
	static final String KEY_PLAYBACK_TYPE = "playbackType";
	static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
	static final String KEY_SETTINGS_INTENT = "settingsIntent";
	static final String KEY_VOLUME = "volume";
	static final String KEY_VOLUME_HANDLING = "volumeHandling";
	static final String KEY_VOLUME_MAX = "volumeMax";
	final Bundle mBundle;
	List mControlFilters;
}
