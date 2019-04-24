// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class AdDetails
	implements Parcelable, Serializable
{

	public AdDetails()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		rating = 5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #58  <Float 5F>
	//    4    7:putfield        #60  <Field float rating>
		belowMinCPM = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #62  <Field boolean belowMinCPM>
	//    8   15:return          
	}

	public AdDetails(Parcel parcel)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #57  <Method void Object()>
		rating = 5F;
	//    4    7:aload_0         
	//    5    8:ldc1            #58  <Float 5F>
	//    6   10:putfield        #60  <Field float rating>
		belowMinCPM = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #62  <Field boolean belowMinCPM>
		adId = parcel.readString();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #69  <Method String Parcel.readString()>
	//   13   23:putfield        #71  <Field String adId>
		clickUrl = parcel.readString();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #69  <Method String Parcel.readString()>
	//   17   31:putfield        #73  <Field String clickUrl>
		trackingUrl = parcel.readString();
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #69  <Method String Parcel.readString()>
	//   21   39:putfield        #75  <Field String trackingUrl>
		trackingClickUrl = parcel.readString();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #69  <Method String Parcel.readString()>
	//   25   47:putfield        #77  <Field String trackingClickUrl>
		closeUrl = parcel.readString();
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #69  <Method String Parcel.readString()>
	//   29   55:putfield        #79  <Field String closeUrl>
		title = parcel.readString();
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #69  <Method String Parcel.readString()>
	//   33   63:putfield        #81  <Field String title>
		description = parcel.readString();
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #69  <Method String Parcel.readString()>
	//   37   71:putfield        #83  <Field String description>
		imageUrl = parcel.readString();
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #69  <Method String Parcel.readString()>
	//   41   79:putfield        #85  <Field String imageUrl>
		secondaryImageUrl = parcel.readString();
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokevirtual   #69  <Method String Parcel.readString()>
	//   45   87:putfield        #87  <Field String secondaryImageUrl>
		rating = parcel.readFloat();
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokevirtual   #91  <Method float Parcel.readFloat()>
	//   49   95:putfield        #60  <Field float rating>
		int i = parcel.readInt();
	//   50   98:aload_1         
	//   51   99:invokevirtual   #95  <Method int Parcel.readInt()>
	//   52  102:istore_2        
		int j = parcel.readInt();
	//   53  103:aload_1         
	//   54  104:invokevirtual   #95  <Method int Parcel.readInt()>
	//   55  107:istore_3        
		smartRedirect = false;
	//   56  108:aload_0         
	//   57  109:iconst_0        
	//   58  110:putfield        #97  <Field boolean smartRedirect>
		if(i == 1)
	//*  59  113:iload_2         
	//*  60  114:iconst_1        
	//*  61  115:icmpne          123
			smartRedirect = true;
	//   62  118:aload_0         
	//   63  119:iconst_1        
	//   64  120:putfield        #97  <Field boolean smartRedirect>
		startappBrowserEnabled = true;
	//   65  123:aload_0         
	//   66  124:iconst_1        
	//   67  125:putfield        #99  <Field boolean startappBrowserEnabled>
		if(j == 0)
	//*  68  128:iload_3         
	//*  69  129:ifne            137
			startappBrowserEnabled = false;
	//   70  132:aload_0         
	//   71  133:iconst_0        
	//   72  134:putfield        #99  <Field boolean startappBrowserEnabled>
		template = parcel.readString();
	//   73  137:aload_0         
	//   74  138:aload_1         
	//   75  139:invokevirtual   #69  <Method String Parcel.readString()>
	//   76  142:putfield        #101 <Field String template>
		packageName = parcel.readString();
	//   77  145:aload_0         
	//   78  146:aload_1         
	//   79  147:invokevirtual   #69  <Method String Parcel.readString()>
	//   80  150:putfield        #103 <Field String packageName>
		appPresencePackage = parcel.readString();
	//   81  153:aload_0         
	//   82  154:aload_1         
	//   83  155:invokevirtual   #69  <Method String Parcel.readString()>
	//   84  158:putfield        #105 <Field String appPresencePackage>
		intentPackageName = parcel.readString();
	//   85  161:aload_0         
	//   86  162:aload_1         
	//   87  163:invokevirtual   #69  <Method String Parcel.readString()>
	//   88  166:putfield        #107 <Field String intentPackageName>
		intentDetails = parcel.readString();
	//   89  169:aload_0         
	//   90  170:aload_1         
	//   91  171:invokevirtual   #69  <Method String Parcel.readString()>
	//   92  174:putfield        #109 <Field String intentDetails>
		minAppVersion = parcel.readInt();
	//   93  177:aload_0         
	//   94  178:aload_1         
	//   95  179:invokevirtual   #95  <Method int Parcel.readInt()>
	//   96  182:putfield        #111 <Field int minAppVersion>
		installs = parcel.readString();
	//   97  185:aload_0         
	//   98  186:aload_1         
	//   99  187:invokevirtual   #69  <Method String Parcel.readString()>
	//  100  190:putfield        #113 <Field String installs>
		category = parcel.readString();
	//  101  193:aload_0         
	//  102  194:aload_1         
	//  103  195:invokevirtual   #69  <Method String Parcel.readString()>
	//  104  198:putfield        #115 <Field String category>
		i = parcel.readInt();
	//  105  201:aload_1         
	//  106  202:invokevirtual   #95  <Method int Parcel.readInt()>
	//  107  205:istore_2        
		app = false;
	//  108  206:aload_0         
	//  109  207:iconst_0        
	//  110  208:putfield        #117 <Field boolean app>
		if(i == 1)
	//* 111  211:iload_2         
	//* 112  212:iconst_1        
	//* 113  213:icmpne          221
			app = true;
	//  114  216:aload_0         
	//  115  217:iconst_1        
	//  116  218:putfield        #117 <Field boolean app>
		i = parcel.readInt();
	//  117  221:aload_1         
	//  118  222:invokevirtual   #95  <Method int Parcel.readInt()>
	//  119  225:istore_2        
		belowMinCPM = false;
	//  120  226:aload_0         
	//  121  227:iconst_0        
	//  122  228:putfield        #62  <Field boolean belowMinCPM>
		if(i == 1)
	//* 123  231:iload_2         
	//* 124  232:iconst_1        
	//* 125  233:icmpne          241
			belowMinCPM = true;
	//  126  236:aload_0         
	//  127  237:iconst_1        
	//  128  238:putfield        #62  <Field boolean belowMinCPM>
		ttl = Long.valueOf(parcel.readLong());
	//  129  241:aload_0         
	//  130  242:aload_1         
	//  131  243:invokevirtual   #121 <Method long Parcel.readLong()>
	//  132  246:invokestatic    #127 <Method Long Long.valueOf(long)>
	//  133  249:putfield        #129 <Field Long ttl>
		if(ttl.longValue() == -1L)
	//* 134  252:aload_0         
	//* 135  253:getfield        #129 <Field Long ttl>
	//* 136  256:invokevirtual   #132 <Method long Long.longValue()>
	//* 137  259:ldc2w           #133 <Long -1L>
	//* 138  262:lcmp            
	//* 139  263:ifne            271
			ttl = null;
	//  140  266:aload_0         
	//  141  267:aconst_null     
	//  142  268:putfield        #129 <Field Long ttl>
		delayImpressionInSeconds = Long.valueOf(parcel.readLong());
	//  143  271:aload_0         
	//  144  272:aload_1         
	//  145  273:invokevirtual   #121 <Method long Parcel.readLong()>
	//  146  276:invokestatic    #127 <Method Long Long.valueOf(long)>
	//  147  279:putfield        #136 <Field Long delayImpressionInSeconds>
		if(delayImpressionInSeconds.longValue() == -1L)
	//* 148  282:aload_0         
	//* 149  283:getfield        #136 <Field Long delayImpressionInSeconds>
	//* 150  286:invokevirtual   #132 <Method long Long.longValue()>
	//* 151  289:ldc2w           #133 <Long -1L>
	//* 152  292:lcmp            
	//* 153  293:ifne            301
			delayImpressionInSeconds = null;
	//  154  296:aload_0         
	//  155  297:aconst_null     
	//  156  298:putfield        #136 <Field Long delayImpressionInSeconds>
		i = parcel.readInt();
	//  157  301:aload_1         
	//  158  302:invokevirtual   #95  <Method int Parcel.readInt()>
	//  159  305:istore_2        
		if(i == 0)
	//* 160  306:iload_2         
	//* 161  307:ifne            316
		{
			sendRedirectHops = null;
	//  162  310:aload_0         
	//  163  311:aconst_null     
	//  164  312:putfield        #138 <Field Boolean sendRedirectHops>
			return;
	//  165  315:return          
		}
		if(i != 1)
	//* 166  316:iload_2         
	//* 167  317:iconst_1        
	//* 168  318:icmpne          331
	//* 169  321:aload_0         
	//* 170  322:iload           4
	//* 171  324:invokestatic    #143 <Method Boolean Boolean.valueOf(boolean)>
	//* 172  327:putfield        #138 <Field Boolean sendRedirectHops>
	//* 173  330:return          
			flag = false;
	//  174  331:iconst_0        
	//  175  332:istore          4
		sendRedirectHops = Boolean.valueOf(flag);
	//* 176  334:goto            321
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getAdId()
	{
		return adId;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String adId>
	//    2    4:areturn         
	}

	public String getAppPresencePackage()
	{
		return appPresencePackage;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String appPresencePackage>
	//    2    4:areturn         
	}

	public String getCategory()
	{
		return category;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String category>
	//    2    4:areturn         
	}

	public String getClickUrl()
	{
		return clickUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String clickUrl>
	//    2    4:areturn         
	}

	public Long getDelayImpressionInSeconds()
	{
		return delayImpressionInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field Long delayImpressionInSeconds>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String description>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String imageUrl>
	//    2    4:areturn         
	}

	public String getInstalls()
	{
		return installs;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String installs>
	//    2    4:areturn         
	}

	public String getIntentDetails()
	{
		return intentDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String intentDetails>
	//    2    4:areturn         
	}

	public String getIntentPackageName()
	{
		return intentPackageName;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String intentPackageName>
	//    2    4:areturn         
	}

	public boolean getIsBelowMinCPM()
	{
		return belowMinCPM;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean belowMinCPM>
	//    2    4:ireturn         
	}

	public int getMinAppVersion()
	{
		return minAppVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field int minAppVersion>
	//    2    4:ireturn         
	}

	public String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String packageName>
	//    2    4:areturn         
	}

	public float getRating()
	{
		return rating;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float rating>
	//    2    4:freturn         
	}

	public String getSecondaryImageUrl()
	{
		return secondaryImageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String secondaryImageUrl>
	//    2    4:areturn         
	}

	public String getTemplate()
	{
		return template;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String template>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String title>
	//    2    4:areturn         
	}

	public String getTrackingClickUrl()
	{
		return trackingClickUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String trackingClickUrl>
	//    2    4:areturn         
	}

	public String getTrackingCloseUrl()
	{
		return closeUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String closeUrl>
	//    2    4:areturn         
	}

	public String getTrackingUrl()
	{
		return trackingUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String trackingUrl>
	//    2    4:areturn         
	}

	public Long getTtl()
	{
		return ttl;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Long ttl>
	//    2    4:areturn         
	}

	public boolean isApp()
	{
		return app;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean app>
	//    2    4:ireturn         
	}

	public boolean isCPE()
	{
		return intentPackageName != null;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String intentPackageName>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isSmartRedirect()
	{
		return smartRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean smartRedirect>
	//    2    4:ireturn         
	}

	public boolean isStartappBrowserEnabled()
	{
		return startappBrowserEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean startappBrowserEnabled>
	//    2    4:ireturn         
	}

	public void setMinAppVersion(int i)
	{
		minAppVersion = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field int minAppVersion>
	//    3    5:return          
	}

	public void setStartappBrowserEnabled(boolean flag)
	{
		startappBrowserEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean startappBrowserEnabled>
	//    3    5:return          
	}

	public Boolean shouldSendRedirectHops()
	{
		return sendRedirectHops;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Boolean sendRedirectHops>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("AdDetails [adId=").append(adId).append(", clickUrl=").append(clickUrl).append(", trackingUrl=").append(trackingUrl).append(", trackingClickUrl=").append(trackingClickUrl).append(", closeUrl=").append(closeUrl).append(", title=").append(title).append(", description=").append(description).append(", imageUrl=").append(imageUrl).append(", secondaryImageUrl=").append(secondaryImageUrl).append(", rating=").append(rating).append(", smartRedirect=").append(smartRedirect).append(", template=").append(template).append(", packageName=").append(packageName).append(", appPresencePackage=").append(appPresencePackage).append(", intentDetails=").append(intentDetails).append(", intentPackageName=").append(intentPackageName).append(", minAppVersion=").append(minAppVersion).append(", startappBrowserEnabled=").append(startappBrowserEnabled).append(", ttl=").append(((Object) (ttl))).append(", app=").append(app).append(", belowMinCPM=").append(belowMinCPM).append(", installs=").append(installs).append(", category=").append(category).append(", delayImpressionInSeconds=").append(((Object) (delayImpressionInSeconds))).append(", sendRedirectHops=").append(((Object) (sendRedirectHops))).append("]").toString();
	//    0    0:new             #180 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #181 <Method void StringBuilder()>
	//    3    7:ldc1            #183 <String "AdDetails [adId=">
	//    4    9:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #71  <Field String adId>
	//    7   16:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #189 <String ", clickUrl=">
	//    9   21:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #73  <Field String clickUrl>
	//   12   28:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #191 <String ", trackingUrl=">
	//   14   33:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #75  <Field String trackingUrl>
	//   17   40:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #193 <String ", trackingClickUrl=">
	//   19   45:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #77  <Field String trackingClickUrl>
	//   22   52:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:ldc1            #195 <String ", closeUrl=">
	//   24   57:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #79  <Field String closeUrl>
	//   27   64:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   28   67:ldc1            #197 <String ", title=">
	//   29   69:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #81  <Field String title>
	//   32   76:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:ldc1            #199 <String ", description=">
	//   34   81:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #83  <Field String description>
	//   37   88:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   38   91:ldc1            #201 <String ", imageUrl=">
	//   39   93:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #85  <Field String imageUrl>
	//   42  100:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   43  103:ldc1            #203 <String ", secondaryImageUrl=">
	//   44  105:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   45  108:aload_0         
	//   46  109:getfield        #87  <Field String secondaryImageUrl>
	//   47  112:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:ldc1            #205 <String ", rating=">
	//   49  117:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:aload_0         
	//   51  121:getfield        #60  <Field float rating>
	//   52  124:invokevirtual   #208 <Method StringBuilder StringBuilder.append(float)>
	//   53  127:ldc1            #210 <String ", smartRedirect=">
	//   54  129:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   55  132:aload_0         
	//   56  133:getfield        #97  <Field boolean smartRedirect>
	//   57  136:invokevirtual   #213 <Method StringBuilder StringBuilder.append(boolean)>
	//   58  139:ldc1            #215 <String ", template=">
	//   59  141:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   60  144:aload_0         
	//   61  145:getfield        #101 <Field String template>
	//   62  148:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   63  151:ldc1            #217 <String ", packageName=">
	//   64  153:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   65  156:aload_0         
	//   66  157:getfield        #103 <Field String packageName>
	//   67  160:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   68  163:ldc1            #219 <String ", appPresencePackage=">
	//   69  165:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   70  168:aload_0         
	//   71  169:getfield        #105 <Field String appPresencePackage>
	//   72  172:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   73  175:ldc1            #221 <String ", intentDetails=">
	//   74  177:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   75  180:aload_0         
	//   76  181:getfield        #109 <Field String intentDetails>
	//   77  184:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   78  187:ldc1            #223 <String ", intentPackageName=">
	//   79  189:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   80  192:aload_0         
	//   81  193:getfield        #107 <Field String intentPackageName>
	//   82  196:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   83  199:ldc1            #225 <String ", minAppVersion=">
	//   84  201:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   85  204:aload_0         
	//   86  205:getfield        #111 <Field int minAppVersion>
	//   87  208:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   88  211:ldc1            #230 <String ", startappBrowserEnabled=">
	//   89  213:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   90  216:aload_0         
	//   91  217:getfield        #99  <Field boolean startappBrowserEnabled>
	//   92  220:invokevirtual   #213 <Method StringBuilder StringBuilder.append(boolean)>
	//   93  223:ldc1            #232 <String ", ttl=">
	//   94  225:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//   95  228:aload_0         
	//   96  229:getfield        #129 <Field Long ttl>
	//   97  232:invokevirtual   #235 <Method StringBuilder StringBuilder.append(Object)>
	//   98  235:ldc1            #237 <String ", app=">
	//   99  237:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  100  240:aload_0         
	//  101  241:getfield        #117 <Field boolean app>
	//  102  244:invokevirtual   #213 <Method StringBuilder StringBuilder.append(boolean)>
	//  103  247:ldc1            #239 <String ", belowMinCPM=">
	//  104  249:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  105  252:aload_0         
	//  106  253:getfield        #62  <Field boolean belowMinCPM>
	//  107  256:invokevirtual   #213 <Method StringBuilder StringBuilder.append(boolean)>
	//  108  259:ldc1            #241 <String ", installs=">
	//  109  261:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  110  264:aload_0         
	//  111  265:getfield        #113 <Field String installs>
	//  112  268:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  113  271:ldc1            #243 <String ", category=">
	//  114  273:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  115  276:aload_0         
	//  116  277:getfield        #115 <Field String category>
	//  117  280:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  118  283:ldc1            #245 <String ", delayImpressionInSeconds=">
	//  119  285:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  120  288:aload_0         
	//  121  289:getfield        #136 <Field Long delayImpressionInSeconds>
	//  122  292:invokevirtual   #235 <Method StringBuilder StringBuilder.append(Object)>
	//  123  295:ldc1            #247 <String ", sendRedirectHops=">
	//  124  297:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  125  300:aload_0         
	//  126  301:getfield        #138 <Field Boolean sendRedirectHops>
	//  127  304:invokevirtual   #235 <Method StringBuilder StringBuilder.append(Object)>
	//  128  307:ldc1            #249 <String "]">
	//  129  309:invokevirtual   #187 <Method StringBuilder StringBuilder.append(String)>
	//  130  312:invokevirtual   #251 <Method String StringBuilder.toString()>
	//  131  315:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		parcel.writeString(adId);
	//    2    3:aload_1         
	//    3    4:aload_0         
	//    4    5:getfield        #71  <Field String adId>
	//    5    8:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(clickUrl);
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #73  <Field String clickUrl>
	//    9   16:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(trackingUrl);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #75  <Field String trackingUrl>
	//   13   24:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(trackingClickUrl);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #77  <Field String trackingClickUrl>
	//   17   32:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(closeUrl);
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:getfield        #79  <Field String closeUrl>
	//   21   40:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(title);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #81  <Field String title>
	//   25   48:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//   26   51:aload_1         
	//   27   52:aload_0         
	//   28   53:getfield        #83  <Field String description>
	//   29   56:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(imageUrl);
	//   30   59:aload_1         
	//   31   60:aload_0         
	//   32   61:getfield        #85  <Field String imageUrl>
	//   33   64:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeString(secondaryImageUrl);
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:getfield        #87  <Field String secondaryImageUrl>
	//   37   72:invokevirtual   #257 <Method void Parcel.writeString(String)>
		parcel.writeFloat(rating);
	//   38   75:aload_1         
	//   39   76:aload_0         
	//   40   77:getfield        #60  <Field float rating>
	//   41   80:invokevirtual   #261 <Method void Parcel.writeFloat(float)>
		int j;
		if(smartRedirect)
	//*  42   83:aload_0         
	//*  43   84:getfield        #97  <Field boolean smartRedirect>
	//*  44   87:ifeq            311
			i = 1;
	//   45   90:iconst_1        
	//   46   91:istore_2        
		else
	//*  47   92:aload_0         
	//*  48   93:getfield        #99  <Field boolean startappBrowserEnabled>
	//*  49   96:ifne            306
	//*  50   99:iconst_0        
	//*  51  100:istore_3        
	//*  52  101:aload_1         
	//*  53  102:iload_2         
	//*  54  103:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//*  55  106:aload_1         
	//*  56  107:iload_3         
	//*  57  108:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//*  58  111:aload_1         
	//*  59  112:aload_0         
	//*  60  113:getfield        #101 <Field String template>
	//*  61  116:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  62  119:aload_1         
	//*  63  120:aload_0         
	//*  64  121:getfield        #103 <Field String packageName>
	//*  65  124:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  66  127:aload_1         
	//*  67  128:aload_0         
	//*  68  129:getfield        #105 <Field String appPresencePackage>
	//*  69  132:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  70  135:aload_1         
	//*  71  136:aload_0         
	//*  72  137:getfield        #107 <Field String intentPackageName>
	//*  73  140:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  74  143:aload_1         
	//*  75  144:aload_0         
	//*  76  145:getfield        #109 <Field String intentDetails>
	//*  77  148:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  78  151:aload_1         
	//*  79  152:aload_0         
	//*  80  153:getfield        #111 <Field int minAppVersion>
	//*  81  156:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//*  82  159:aload_1         
	//*  83  160:aload_0         
	//*  84  161:getfield        #113 <Field String installs>
	//*  85  164:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  86  167:aload_1         
	//*  87  168:aload_0         
	//*  88  169:getfield        #115 <Field String category>
	//*  89  172:invokevirtual   #257 <Method void Parcel.writeString(String)>
	//*  90  175:aload_0         
	//*  91  176:getfield        #117 <Field boolean app>
	//*  92  179:ifeq            301
	//*  93  182:iconst_1        
	//*  94  183:istore_2        
	//*  95  184:aload_1         
	//*  96  185:iload_2         
	//*  97  186:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//*  98  189:aload_0         
	//*  99  190:getfield        #62  <Field boolean belowMinCPM>
	//* 100  193:ifeq            296
	//* 101  196:iconst_1        
	//* 102  197:istore_2        
	//* 103  198:aload_1         
	//* 104  199:iload_2         
	//* 105  200:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//* 106  203:aload_0         
	//* 107  204:getfield        #129 <Field Long ttl>
	//* 108  207:ifnull          252
	//* 109  210:aload_1         
	//* 110  211:aload_0         
	//* 111  212:getfield        #129 <Field Long ttl>
	//* 112  215:invokevirtual   #132 <Method long Long.longValue()>
	//* 113  218:invokevirtual   #268 <Method void Parcel.writeLong(long)>
	//* 114  221:aload_0         
	//* 115  222:getfield        #136 <Field Long delayImpressionInSeconds>
	//* 116  225:ifnull          262
	//* 117  228:aload_1         
	//* 118  229:aload_0         
	//* 119  230:getfield        #136 <Field Long delayImpressionInSeconds>
	//* 120  233:invokevirtual   #132 <Method long Long.longValue()>
	//* 121  236:invokevirtual   #268 <Method void Parcel.writeLong(long)>
	//* 122  239:aload_0         
	//* 123  240:getfield        #138 <Field Boolean sendRedirectHops>
	//* 124  243:ifnonnull       272
	//* 125  246:aload_1         
	//* 126  247:iconst_0        
	//* 127  248:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//* 128  251:return          
	//* 129  252:aload_1         
	//* 130  253:ldc2w           #133 <Long -1L>
	//* 131  256:invokevirtual   #268 <Method void Parcel.writeLong(long)>
	//* 132  259:goto            221
	//* 133  262:aload_1         
	//* 134  263:ldc2w           #133 <Long -1L>
	//* 135  266:invokevirtual   #268 <Method void Parcel.writeLong(long)>
	//* 136  269:goto            239
	//* 137  272:aload_0         
	//* 138  273:getfield        #138 <Field Boolean sendRedirectHops>
	//* 139  276:invokevirtual   #271 <Method boolean Boolean.booleanValue()>
	//* 140  279:ifeq            291
	//* 141  282:iload           4
	//* 142  284:istore_2        
	//* 143  285:aload_1         
	//* 144  286:iload_2         
	//* 145  287:invokevirtual   #264 <Method void Parcel.writeInt(int)>
	//* 146  290:return          
	//* 147  291:iconst_m1       
	//* 148  292:istore_2        
	//* 149  293:goto            285
	//* 150  296:iconst_0        
	//* 151  297:istore_2        
	//* 152  298:goto            198
	//* 153  301:iconst_0        
	//* 154  302:istore_2        
	//* 155  303:goto            184
	//* 156  306:iconst_1        
	//* 157  307:istore_3        
	//* 158  308:goto            101
			i = 0;
	//  159  311:iconst_0        
	//  160  312:istore_2        
		if(!startappBrowserEnabled)
			j = 0;
		else
			j = 1;
		parcel.writeInt(i);
		parcel.writeInt(j);
		parcel.writeString(template);
		parcel.writeString(packageName);
		parcel.writeString(appPresencePackage);
		parcel.writeString(intentPackageName);
		parcel.writeString(intentDetails);
		parcel.writeInt(minAppVersion);
		parcel.writeString(installs);
		parcel.writeString(category);
		if(app)
			i = 1;
		else
			i = 0;
		parcel.writeInt(i);
		if(belowMinCPM)
			i = 1;
		else
			i = 0;
		parcel.writeInt(i);
		if(ttl != null)
			parcel.writeLong(ttl.longValue());
		else
			parcel.writeLong(-1L);
		if(delayImpressionInSeconds != null)
			parcel.writeLong(delayImpressionInSeconds.longValue());
		else
			parcel.writeLong(-1L);
		if(sendRedirectHops == null)
		{
			parcel.writeInt(0);
			return;
		}
		if(sendRedirectHops.booleanValue())
			i = ((int) (flag));
		else
			i = -1;
		parcel.writeInt(i);
	//* 161  313:goto            92
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public AdDetails createFromParcel(Parcel parcel)
		{
			return new AdDetails(parcel);
		//    0    0:new             #9   <Class AdDetails>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void AdDetails(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method AdDetails createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public AdDetails[] newArray(int i)
		{
			return new AdDetails[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AdDetails[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method AdDetails[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final long serialVersionUID = 1L;
	private String adId;
	private boolean app;
	private String appPresencePackage;
	private boolean belowMinCPM;
	private String category;
	private String clickUrl;
	private String closeUrl;
	private Long delayImpressionInSeconds;
	private String description;
	private String imageUrl;
	private String installs;
	private String intentDetails;
	private String intentPackageName;
	private int minAppVersion;
	private String packageName;
	private float rating;
	private String secondaryImageUrl;
	private Boolean sendRedirectHops;
	private boolean smartRedirect;
	private boolean startappBrowserEnabled;
	private String template;
	private String title;
	private String trackingClickUrl;
	private String trackingUrl;
	private Long ttl;

	static 
	{
	//    0    0:new             #10  <Class AdDetails$1>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void AdDetails$1()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
