// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.*;

public final class MediaRouteDescriptor
{

	MediaRouteDescriptor(Bundle bundle, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #79  <Field Bundle mBundle>
		mControlFilters = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #81  <Field List mControlFilters>
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
	//    8   12:invokespecial   #86  <Method void MediaRouteDescriptor(Bundle, List)>
	//    9   15:astore_1        
		return mediaroutedescriptor;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public boolean canDisconnectAndKeepPlaying()
	{
		return mBundle.getBoolean("canDisconnect", false);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #8   <String "canDisconnect">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #96  <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	void ensureControlFilters()
	{
		if(mControlFilters == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field List mControlFilters>
	//*   2    4:ifnonnull       34
		{
			mControlFilters = ((List) (mBundle.getParcelableArrayList("controlFilters")));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field Bundle mBundle>
	//    6   12:ldc1            #17  <String "controlFilters">
	//    7   14:invokevirtual   #101 <Method java.util.ArrayList Bundle.getParcelableArrayList(String)>
	//    8   17:putfield        #81  <Field List mControlFilters>
			if(mControlFilters == null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #81  <Field List mControlFilters>
	//*  11   24:ifnonnull       34
				mControlFilters = Collections.emptyList();
	//   12   27:aload_0         
	//   13   28:invokestatic    #107 <Method List Collections.emptyList()>
	//   14   31:putfield        #81  <Field List mControlFilters>
		}
	//   15   34:return          
	}

	public int getConnectionState()
	{
		return mBundle.getInt("connectionState", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #14  <String "connectionState">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public List getControlFilters()
	{
		ensureControlFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method void ensureControlFilters()>
		return mControlFilters;
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field List mControlFilters>
	//    4    8:areturn         
	}

	public String getDescription()
	{
		return mBundle.getString("status");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #20  <String "status">
	//    3    6:invokevirtual   #122 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getDeviceType()
	{
		return mBundle.getInt("deviceType");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #23  <String "deviceType">
	//    3    6:invokevirtual   #126 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public Bundle getExtras()
	{
		return mBundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #29  <String "extras">
	//    3    6:invokevirtual   #131 <Method Bundle Bundle.getBundle(String)>
	//    4    9:areturn         
	}

	public List getGroupMemberIds()
	{
		return ((List) (mBundle.getStringArrayList("groupMemberIds")));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #32  <String "groupMemberIds">
	//    3    6:invokevirtual   #135 <Method java.util.ArrayList Bundle.getStringArrayList(String)>
	//    4    9:areturn         
	}

	public Uri getIconUri()
	{
		String s = mBundle.getString("iconUri");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #35  <String "iconUri">
	//    3    6:invokevirtual   #122 <Method String Bundle.getString(String)>
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
	//   10   17:invokestatic    #143 <Method Uri Uri.parse(String)>
	//   11   20:areturn         
	}

	public String getId()
	{
		return mBundle.getString("id");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #38  <String "id">
	//    3    6:invokevirtual   #122 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getMaxClientVersion()
	{
		return mBundle.getInt("maxClientVersion", 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #41  <String "maxClientVersion">
	//    3    6:ldc1            #146 <Int 0x7fffffff>
	//    4    8:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   11:ireturn         
	}

	public int getMinClientVersion()
	{
		return mBundle.getInt("minClientVersion", 1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #44  <String "minClientVersion">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public String getName()
	{
		return mBundle.getString("name");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #47  <String "name">
	//    3    6:invokevirtual   #122 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public int getPlaybackStream()
	{
		return mBundle.getInt("playbackStream", -1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #50  <String "playbackStream">
	//    3    6:iconst_m1       
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getPlaybackType()
	{
		return mBundle.getInt("playbackType", 1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #53  <String "playbackType">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getPresentationDisplayId()
	{
		return mBundle.getInt("presentationDisplayId", -1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #56  <String "presentationDisplayId">
	//    3    6:iconst_m1       
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public IntentSender getSettingsActivity()
	{
		return (IntentSender)mBundle.getParcelable("settingsIntent");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #59  <String "settingsIntent">
	//    3    6:invokevirtual   #157 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    4    9:checkcast       #159 <Class IntentSender>
	//    5   12:areturn         
	}

	public int getVolume()
	{
		return mBundle.getInt("volume");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #62  <String "volume">
	//    3    6:invokevirtual   #126 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public int getVolumeHandling()
	{
		return mBundle.getInt("volumeHandling", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #65  <String "volumeHandling">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #113 <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public int getVolumeMax()
	{
		return mBundle.getInt("volumeMax");
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #68  <String "volumeMax">
	//    3    6:invokevirtual   #126 <Method int Bundle.getInt(String)>
	//    4    9:ireturn         
	}

	public boolean isConnecting()
	{
		return mBundle.getBoolean("connecting", false);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #11  <String "connecting">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #96  <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	public boolean isEnabled()
	{
		return mBundle.getBoolean("enabled", true);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Bundle mBundle>
	//    2    4:ldc1            #26  <String "enabled">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #96  <Method boolean Bundle.getBoolean(String, boolean)>
	//    5   10:ireturn         
	}

	public boolean isValid()
	{
		ensureControlFilters();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method void ensureControlFilters()>
		return !TextUtils.isEmpty(((CharSequence) (getId()))) && !TextUtils.isEmpty(((CharSequence) (getName()))) && !mControlFilters.contains(((Object) (null)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #169 <Method String getId()>
	//    4    8:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5   11:ifne            42
	//    6   14:aload_0         
	//    7   15:invokevirtual   #177 <Method String getName()>
	//    8   18:invokestatic    #175 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   21:ifne            42
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field List mControlFilters>
	//   12   28:aconst_null     
	//   13   29:invokeinterface #183 <Method boolean List.contains(Object)>
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
	//    0    0:new             #186 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouteDescriptor{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #189 <String "MediaRouteDescriptor{ ">
	//    6   11:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("id=");
	//    8   15:aload_1         
	//    9   16:ldc1            #195 <String "id=">
	//   10   18:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(getId());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #169 <Method String getId()>
	//   15   27:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(", groupMemberIds=");
	//   17   31:aload_1         
	//   18   32:ldc1            #197 <String ", groupMemberIds=">
	//   19   34:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (getGroupMemberIds())));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #199 <Method List getGroupMemberIds()>
	//   24   43:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", name=");
	//   26   47:aload_1         
	//   27   48:ldc1            #204 <String ", name=">
	//   28   50:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(getName());
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:invokevirtual   #177 <Method String getName()>
	//   33   59:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(", description=");
	//   35   63:aload_1         
	//   36   64:ldc1            #206 <String ", description=">
	//   37   66:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		stringbuilder.append(getDescription());
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:invokevirtual   #208 <Method String getDescription()>
	//   42   75:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(", iconUri=");
	//   44   79:aload_1         
	//   45   80:ldc1            #210 <String ", iconUri=">
	//   46   82:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
		stringbuilder.append(((Object) (getIconUri())));
	//   48   86:aload_1         
	//   49   87:aload_0         
	//   50   88:invokevirtual   #212 <Method Uri getIconUri()>
	//   51   91:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   52   94:pop             
		stringbuilder.append(", isEnabled=");
	//   53   95:aload_1         
	//   54   96:ldc1            #214 <String ", isEnabled=">
	//   55   98:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   56  101:pop             
		stringbuilder.append(isEnabled());
	//   57  102:aload_1         
	//   58  103:aload_0         
	//   59  104:invokevirtual   #216 <Method boolean isEnabled()>
	//   60  107:invokevirtual   #219 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  110:pop             
		stringbuilder.append(", isConnecting=");
	//   62  111:aload_1         
	//   63  112:ldc1            #221 <String ", isConnecting=">
	//   64  114:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   65  117:pop             
		stringbuilder.append(isConnecting());
	//   66  118:aload_1         
	//   67  119:aload_0         
	//   68  120:invokevirtual   #223 <Method boolean isConnecting()>
	//   69  123:invokevirtual   #219 <Method StringBuilder StringBuilder.append(boolean)>
	//   70  126:pop             
		stringbuilder.append(", connectionState=");
	//   71  127:aload_1         
	//   72  128:ldc1            #225 <String ", connectionState=">
	//   73  130:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   74  133:pop             
		stringbuilder.append(getConnectionState());
	//   75  134:aload_1         
	//   76  135:aload_0         
	//   77  136:invokevirtual   #227 <Method int getConnectionState()>
	//   78  139:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   79  142:pop             
		stringbuilder.append(", controlFilters=");
	//   80  143:aload_1         
	//   81  144:ldc1            #232 <String ", controlFilters=">
	//   82  146:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   83  149:pop             
		stringbuilder.append(Arrays.toString(getControlFilters().toArray()));
	//   84  150:aload_1         
	//   85  151:aload_0         
	//   86  152:invokevirtual   #234 <Method List getControlFilters()>
	//   87  155:invokeinterface #238 <Method Object[] List.toArray()>
	//   88  160:invokestatic    #243 <Method String Arrays.toString(Object[])>
	//   89  163:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   90  166:pop             
		stringbuilder.append(", playbackType=");
	//   91  167:aload_1         
	//   92  168:ldc1            #245 <String ", playbackType=">
	//   93  170:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   94  173:pop             
		stringbuilder.append(getPlaybackType());
	//   95  174:aload_1         
	//   96  175:aload_0         
	//   97  176:invokevirtual   #247 <Method int getPlaybackType()>
	//   98  179:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//   99  182:pop             
		stringbuilder.append(", playbackStream=");
	//  100  183:aload_1         
	//  101  184:ldc1            #249 <String ", playbackStream=">
	//  102  186:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  103  189:pop             
		stringbuilder.append(getPlaybackStream());
	//  104  190:aload_1         
	//  105  191:aload_0         
	//  106  192:invokevirtual   #251 <Method int getPlaybackStream()>
	//  107  195:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  108  198:pop             
		stringbuilder.append(", deviceType=");
	//  109  199:aload_1         
	//  110  200:ldc1            #253 <String ", deviceType=">
	//  111  202:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  112  205:pop             
		stringbuilder.append(getDeviceType());
	//  113  206:aload_1         
	//  114  207:aload_0         
	//  115  208:invokevirtual   #255 <Method int getDeviceType()>
	//  116  211:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  117  214:pop             
		stringbuilder.append(", volume=");
	//  118  215:aload_1         
	//  119  216:ldc2            #257 <String ", volume=">
	//  120  219:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  121  222:pop             
		stringbuilder.append(getVolume());
	//  122  223:aload_1         
	//  123  224:aload_0         
	//  124  225:invokevirtual   #259 <Method int getVolume()>
	//  125  228:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  126  231:pop             
		stringbuilder.append(", volumeMax=");
	//  127  232:aload_1         
	//  128  233:ldc2            #261 <String ", volumeMax=">
	//  129  236:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  130  239:pop             
		stringbuilder.append(getVolumeMax());
	//  131  240:aload_1         
	//  132  241:aload_0         
	//  133  242:invokevirtual   #263 <Method int getVolumeMax()>
	//  134  245:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  135  248:pop             
		stringbuilder.append(", volumeHandling=");
	//  136  249:aload_1         
	//  137  250:ldc2            #265 <String ", volumeHandling=">
	//  138  253:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  139  256:pop             
		stringbuilder.append(getVolumeHandling());
	//  140  257:aload_1         
	//  141  258:aload_0         
	//  142  259:invokevirtual   #267 <Method int getVolumeHandling()>
	//  143  262:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  144  265:pop             
		stringbuilder.append(", presentationDisplayId=");
	//  145  266:aload_1         
	//  146  267:ldc2            #269 <String ", presentationDisplayId=">
	//  147  270:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  148  273:pop             
		stringbuilder.append(getPresentationDisplayId());
	//  149  274:aload_1         
	//  150  275:aload_0         
	//  151  276:invokevirtual   #271 <Method int getPresentationDisplayId()>
	//  152  279:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  153  282:pop             
		stringbuilder.append(", extras=");
	//  154  283:aload_1         
	//  155  284:ldc2            #273 <String ", extras=">
	//  156  287:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  157  290:pop             
		stringbuilder.append(((Object) (getExtras())));
	//  158  291:aload_1         
	//  159  292:aload_0         
	//  160  293:invokevirtual   #275 <Method Bundle getExtras()>
	//  161  296:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//  162  299:pop             
		stringbuilder.append(", isValid=");
	//  163  300:aload_1         
	//  164  301:ldc2            #277 <String ", isValid=">
	//  165  304:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  166  307:pop             
		stringbuilder.append(isValid());
	//  167  308:aload_1         
	//  168  309:aload_0         
	//  169  310:invokevirtual   #279 <Method boolean isValid()>
	//  170  313:invokevirtual   #219 <Method StringBuilder StringBuilder.append(boolean)>
	//  171  316:pop             
		stringbuilder.append(", minClientVersion=");
	//  172  317:aload_1         
	//  173  318:ldc2            #281 <String ", minClientVersion=">
	//  174  321:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  175  324:pop             
		stringbuilder.append(getMinClientVersion());
	//  176  325:aload_1         
	//  177  326:aload_0         
	//  178  327:invokevirtual   #283 <Method int getMinClientVersion()>
	//  179  330:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  180  333:pop             
		stringbuilder.append(", maxClientVersion=");
	//  181  334:aload_1         
	//  182  335:ldc2            #285 <String ", maxClientVersion=">
	//  183  338:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  184  341:pop             
		stringbuilder.append(getMaxClientVersion());
	//  185  342:aload_1         
	//  186  343:aload_0         
	//  187  344:invokevirtual   #287 <Method int getMaxClientVersion()>
	//  188  347:invokevirtual   #230 <Method StringBuilder StringBuilder.append(int)>
	//  189  350:pop             
		stringbuilder.append(" }");
	//  190  351:aload_1         
	//  191  352:ldc2            #289 <String " }">
	//  192  355:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  193  358:pop             
		return stringbuilder.toString();
	//  194  359:aload_1         
	//  195  360:invokevirtual   #291 <Method String StringBuilder.toString()>
	//  196  363:areturn         
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
