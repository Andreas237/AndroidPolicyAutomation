// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompatApi21, MediaDescriptionCompatApi23

public final class MediaDescriptionCompat
	implements Parcelable
{
	public static final class Builder
	{

		public MediaDescriptionCompat build()
		{
			return new MediaDescriptionCompat(mMediaId, mTitle, mSubtitle, mDescription, mIcon, mIconUri, mExtras, mMediaUri);
		//    0    0:new             #6   <Class MediaDescriptionCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field String mMediaId>
		//    4    8:aload_0         
		//    5    9:getfield        #31  <Field CharSequence mTitle>
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field CharSequence mSubtitle>
		//    8   16:aload_0         
		//    9   17:getfield        #35  <Field CharSequence mDescription>
		//   10   20:aload_0         
		//   11   21:getfield        #37  <Field Bitmap mIcon>
		//   12   24:aload_0         
		//   13   25:getfield        #39  <Field Uri mIconUri>
		//   14   28:aload_0         
		//   15   29:getfield        #41  <Field Bundle mExtras>
		//   16   32:aload_0         
		//   17   33:getfield        #43  <Field Uri mMediaUri>
		//   18   36:invokespecial   #46  <Method void MediaDescriptionCompat(String, CharSequence, CharSequence, CharSequence, Bitmap, Uri, Bundle, Uri)>
		//   19   39:areturn         
		}

		public Builder setDescription(CharSequence charsequence)
		{
			mDescription = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field CharSequence mDescription>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field Bundle mExtras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIconBitmap(Bitmap bitmap)
		{
			mIcon = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field Bitmap mIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIconUri(Uri uri)
		{
			mIconUri = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field Uri mIconUri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMediaId(String s)
		{
			mMediaId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field String mMediaId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMediaUri(Uri uri)
		{
			mMediaUri = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field Uri mMediaUri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSubtitle(CharSequence charsequence)
		{
			mSubtitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field CharSequence mSubtitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTitle(CharSequence charsequence)
		{
			mTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field CharSequence mTitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private CharSequence mDescription;
		private Bundle mExtras;
		private Bitmap mIcon;
		private Uri mIconUri;
		private String mMediaId;
		private Uri mMediaUri;
		private CharSequence mSubtitle;
		private CharSequence mTitle;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaDescriptionCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Object()>
		mMediaId = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method String Parcel.readString()>
	//    5    9:putfield        #82  <Field String mMediaId>
		mTitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #87  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #93  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #95  <Class CharSequence>
	//   11   25:putfield        #97  <Field CharSequence mTitle>
		mSubtitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   12   28:aload_0         
	//   13   29:getstatic       #87  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   14   32:aload_1         
	//   15   33:invokeinterface #93  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   16   38:checkcast       #95  <Class CharSequence>
	//   17   41:putfield        #99  <Field CharSequence mSubtitle>
		mDescription = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   18   44:aload_0         
	//   19   45:getstatic       #87  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   20   48:aload_1         
	//   21   49:invokeinterface #93  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   22   54:checkcast       #95  <Class CharSequence>
	//   23   57:putfield        #101 <Field CharSequence mDescription>
		mIcon = (Bitmap)parcel.readParcelable(((ClassLoader) (null)));
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:aconst_null     
	//   27   63:invokevirtual   #105 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   28   66:checkcast       #107 <Class Bitmap>
	//   29   69:putfield        #109 <Field Bitmap mIcon>
		mIconUri = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   30   72:aload_0         
	//   31   73:aload_1         
	//   32   74:aconst_null     
	//   33   75:invokevirtual   #105 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   34   78:checkcast       #111 <Class Uri>
	//   35   81:putfield        #113 <Field Uri mIconUri>
		mExtras = parcel.readBundle();
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #117 <Method Bundle Parcel.readBundle()>
	//   39   89:putfield        #119 <Field Bundle mExtras>
		mMediaUri = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:aconst_null     
	//   43   95:invokevirtual   #105 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   98:checkcast       #111 <Class Uri>
	//   45  101:putfield        #121 <Field Uri mMediaUri>
	//   46  104:return          
	}

	MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
			Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Object()>
		mMediaId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #82  <Field String mMediaId>
		mTitle = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #97  <Field CharSequence mTitle>
		mSubtitle = charsequence1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #99  <Field CharSequence mSubtitle>
		mDescription = charsequence2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #101 <Field CharSequence mDescription>
		mIcon = bitmap;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #109 <Field Bitmap mIcon>
		mIconUri = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #113 <Field Uri mIconUri>
		mExtras = bundle;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #119 <Field Bundle mExtras>
		mMediaUri = uri1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #121 <Field Uri mMediaUri>
	//   26   49:return          
	}

	public static MediaDescriptionCompat fromMediaDescription(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		Builder builder = new Builder();
	//    7   14:new             #10  <Class MediaDescriptionCompat$Builder>
	//    8   17:dup             
	//    9   18:invokespecial   #131 <Method void MediaDescriptionCompat$Builder()>
	//   10   21:astore          4
		builder.setMediaId(MediaDescriptionCompatApi21.getMediaId(obj));
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:invokestatic    #137 <Method String MediaDescriptionCompatApi21.getMediaId(Object)>
	//   14   29:invokevirtual   #141 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//   15   32:pop             
		builder.setTitle(MediaDescriptionCompatApi21.getTitle(obj));
	//   16   33:aload           4
	//   17   35:aload_0         
	//   18   36:invokestatic    #145 <Method CharSequence MediaDescriptionCompatApi21.getTitle(Object)>
	//   19   39:invokevirtual   #149 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//   20   42:pop             
		builder.setSubtitle(MediaDescriptionCompatApi21.getSubtitle(obj));
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:invokestatic    #152 <Method CharSequence MediaDescriptionCompatApi21.getSubtitle(Object)>
	//   24   49:invokevirtual   #155 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//   25   52:pop             
		builder.setDescription(MediaDescriptionCompatApi21.getDescription(obj));
	//   26   53:aload           4
	//   27   55:aload_0         
	//   28   56:invokestatic    #158 <Method CharSequence MediaDescriptionCompatApi21.getDescription(Object)>
	//   29   59:invokevirtual   #161 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//   30   62:pop             
		builder.setIconBitmap(MediaDescriptionCompatApi21.getIconBitmap(obj));
	//   31   63:aload           4
	//   32   65:aload_0         
	//   33   66:invokestatic    #165 <Method Bitmap MediaDescriptionCompatApi21.getIconBitmap(Object)>
	//   34   69:invokevirtual   #169 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//   35   72:pop             
		builder.setIconUri(MediaDescriptionCompatApi21.getIconUri(obj));
	//   36   73:aload           4
	//   37   75:aload_0         
	//   38   76:invokestatic    #173 <Method Uri MediaDescriptionCompatApi21.getIconUri(Object)>
	//   39   79:invokevirtual   #177 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//   40   82:pop             
		Bundle bundle1 = MediaDescriptionCompatApi21.getExtras(obj);
	//   41   83:aload_0         
	//   42   84:invokestatic    #181 <Method Bundle MediaDescriptionCompatApi21.getExtras(Object)>
	//   43   87:astore_3        
		Object obj1;
		if(bundle1 == null)
	//*  44   88:aload_3         
	//*  45   89:ifnonnull       97
			obj1 = null;
	//   46   92:aconst_null     
	//   47   93:astore_1        
		else
	//*  48   94:goto            107
			obj1 = ((Object) ((Uri)bundle1.getParcelable("android.support.v4.media.description.MEDIA_URI")));
	//   49   97:aload_3         
	//   50   98:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   51  100:invokevirtual   #187 <Method Parcelable Bundle.getParcelable(String)>
	//   52  103:checkcast       #111 <Class Uri>
	//   53  106:astore_1        
		Bundle bundle = bundle1;
	//   54  107:aload_3         
	//   55  108:astore_2        
		if(obj1 != null)
	//*  56  109:aload_1         
	//*  57  110:ifnull          149
			if(bundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle1.size() == 2)
	//*  58  113:aload_3         
	//*  59  114:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//*  60  116:invokevirtual   #191 <Method boolean Bundle.containsKey(String)>
	//*  61  119:ifeq            135
	//*  62  122:aload_3         
	//*  63  123:invokevirtual   #195 <Method int Bundle.size()>
	//*  64  126:iconst_2        
	//*  65  127:icmpne          135
			{
				bundle = null;
	//   66  130:aconst_null     
	//   67  131:astore_2        
			} else
	//*  68  132:goto            149
			{
				bundle1.remove("android.support.v4.media.description.MEDIA_URI");
	//   69  135:aload_3         
	//   70  136:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   71  138:invokevirtual   #199 <Method void Bundle.remove(String)>
				bundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
	//   72  141:aload_3         
	//   73  142:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   74  144:invokevirtual   #199 <Method void Bundle.remove(String)>
				bundle = bundle1;
	//   75  147:aload_3         
	//   76  148:astore_2        
			}
		builder.setExtras(bundle);
	//   77  149:aload           4
	//   78  151:aload_2         
	//   79  152:invokevirtual   #203 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//   80  155:pop             
		if(obj1 != null)
	//*  81  156:aload_1         
	//*  82  157:ifnull          170
			builder.setMediaUri(((Uri) (obj1)));
	//   83  160:aload           4
	//   84  162:aload_1         
	//   85  163:invokevirtual   #206 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   86  166:pop             
		else
	//*  87  167:goto            188
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  88  170:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*  89  173:bipush          23
	//*  90  175:icmplt          188
			builder.setMediaUri(MediaDescriptionCompatApi23.getMediaUri(obj));
	//   91  178:aload           4
	//   92  180:aload_0         
	//   93  181:invokestatic    #211 <Method Uri MediaDescriptionCompatApi23.getMediaUri(Object)>
	//   94  184:invokevirtual   #206 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   95  187:pop             
		obj1 = ((Object) (builder.build()));
	//   96  188:aload           4
	//   97  190:invokevirtual   #215 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//   98  193:astore_1        
		obj1.mDescriptionObj = obj;
	//   99  194:aload_1         
	//  100  195:aload_0         
	//  101  196:putfield        #217 <Field Object mDescriptionObj>
		return ((MediaDescriptionCompat) (obj1));
	//  102  199:aload_1         
	//  103  200:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field CharSequence mDescription>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public Bitmap getIconBitmap()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Bitmap mIcon>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Uri mIconUri>
	//    2    4:areturn         
	}

	public Object getMediaDescription()
	{
		if(mDescriptionObj != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field Object mDescriptionObj>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
			return mDescriptionObj;
	//    6   15:aload_0         
	//    7   16:getfield        #217 <Field Object mDescriptionObj>
	//    8   19:areturn         
		Object obj = MediaDescriptionCompatApi21.Builder.newInstance();
	//    9   20:invokestatic    #230 <Method Object MediaDescriptionCompatApi21$Builder.newInstance()>
	//   10   23:astore_3        
		MediaDescriptionCompatApi21.Builder.setMediaId(obj, mMediaId);
	//   11   24:aload_3         
	//   12   25:aload_0         
	//   13   26:getfield        #82  <Field String mMediaId>
	//   14   29:invokestatic    #233 <Method void MediaDescriptionCompatApi21$Builder.setMediaId(Object, String)>
		MediaDescriptionCompatApi21.Builder.setTitle(obj, mTitle);
	//   15   32:aload_3         
	//   16   33:aload_0         
	//   17   34:getfield        #97  <Field CharSequence mTitle>
	//   18   37:invokestatic    #236 <Method void MediaDescriptionCompatApi21$Builder.setTitle(Object, CharSequence)>
		MediaDescriptionCompatApi21.Builder.setSubtitle(obj, mSubtitle);
	//   19   40:aload_3         
	//   20   41:aload_0         
	//   21   42:getfield        #99  <Field CharSequence mSubtitle>
	//   22   45:invokestatic    #238 <Method void MediaDescriptionCompatApi21$Builder.setSubtitle(Object, CharSequence)>
		MediaDescriptionCompatApi21.Builder.setDescription(obj, mDescription);
	//   23   48:aload_3         
	//   24   49:aload_0         
	//   25   50:getfield        #101 <Field CharSequence mDescription>
	//   26   53:invokestatic    #240 <Method void MediaDescriptionCompatApi21$Builder.setDescription(Object, CharSequence)>
		MediaDescriptionCompatApi21.Builder.setIconBitmap(obj, mIcon);
	//   27   56:aload_3         
	//   28   57:aload_0         
	//   29   58:getfield        #109 <Field Bitmap mIcon>
	//   30   61:invokestatic    #243 <Method void MediaDescriptionCompatApi21$Builder.setIconBitmap(Object, Bitmap)>
		MediaDescriptionCompatApi21.Builder.setIconUri(obj, mIconUri);
	//   31   64:aload_3         
	//   32   65:aload_0         
	//   33   66:getfield        #113 <Field Uri mIconUri>
	//   34   69:invokestatic    #246 <Method void MediaDescriptionCompatApi21$Builder.setIconUri(Object, Uri)>
		Bundle bundle1 = mExtras;
	//   35   72:aload_0         
	//   36   73:getfield        #119 <Field Bundle mExtras>
	//   37   76:astore_2        
		Bundle bundle = bundle1;
	//   38   77:aload_2         
	//   39   78:astore_1        
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  40   79:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   82:bipush          23
	//*  42   84:icmpge          127
		{
			bundle = bundle1;
	//   43   87:aload_2         
	//   44   88:astore_1        
			if(mMediaUri != null)
	//*  45   89:aload_0         
	//*  46   90:getfield        #121 <Field Uri mMediaUri>
	//*  47   93:ifnull          127
			{
				bundle = bundle1;
	//   48   96:aload_2         
	//   49   97:astore_1        
				if(bundle1 == null)
	//*  50   98:aload_2         
	//*  51   99:ifnonnull       117
				{
					bundle = new Bundle();
	//   52  102:new             #183 <Class Bundle>
	//   53  105:dup             
	//   54  106:invokespecial   #247 <Method void Bundle()>
	//   55  109:astore_1        
					bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
	//   56  110:aload_1         
	//   57  111:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   58  113:iconst_1        
	//   59  114:invokevirtual   #251 <Method void Bundle.putBoolean(String, boolean)>
				}
				bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", ((Parcelable) (mMediaUri)));
	//   60  117:aload_1         
	//   61  118:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   62  120:aload_0         
	//   63  121:getfield        #121 <Field Uri mMediaUri>
	//   64  124:invokevirtual   #255 <Method void Bundle.putParcelable(String, Parcelable)>
			}
		}
		MediaDescriptionCompatApi21.Builder.setExtras(obj, bundle);
	//   65  127:aload_3         
	//   66  128:aload_1         
	//   67  129:invokestatic    #258 <Method void MediaDescriptionCompatApi21$Builder.setExtras(Object, Bundle)>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  68  132:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*  69  135:bipush          23
	//*  70  137:icmplt          148
			MediaDescriptionCompatApi23.Builder.setMediaUri(obj, mMediaUri);
	//   71  140:aload_3         
	//   72  141:aload_0         
	//   73  142:getfield        #121 <Field Uri mMediaUri>
	//   74  145:invokestatic    #262 <Method void MediaDescriptionCompatApi23$Builder.setMediaUri(Object, Uri)>
		mDescriptionObj = MediaDescriptionCompatApi21.Builder.build(obj);
	//   75  148:aload_0         
	//   76  149:aload_3         
	//   77  150:invokestatic    #265 <Method Object MediaDescriptionCompatApi21$Builder.build(Object)>
	//   78  153:putfield        #217 <Field Object mDescriptionObj>
		return mDescriptionObj;
	//   79  156:aload_0         
	//   80  157:getfield        #217 <Field Object mDescriptionObj>
	//   81  160:areturn         
	}

	public String getMediaId()
	{
		return mMediaId;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String mMediaId>
	//    2    4:areturn         
	}

	public Uri getMediaUri()
	{
		return mMediaUri;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Uri mMediaUri>
	//    2    4:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CharSequence mSubtitle>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object) (mTitle))).append(", ").append(((Object) (mSubtitle))).append(", ").append(((Object) (mDescription))).toString();
	//    0    0:new             #268 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #269 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field CharSequence mTitle>
	//    5   11:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//    6   14:ldc2            #275 <String ", ">
	//    7   17:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #99  <Field CharSequence mSubtitle>
	//   10   24:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   11   27:ldc2            #275 <String ", ">
	//   12   30:invokevirtual   #278 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:aload_0         
	//   14   34:getfield        #101 <Field CharSequence mDescription>
	//   15   37:invokevirtual   #273 <Method StringBuilder StringBuilder.append(Object)>
	//   16   40:invokevirtual   #280 <Method String StringBuilder.toString()>
	//   17   43:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #130 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          79
		{
			parcel.writeString(mMediaId);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #82  <Field String mMediaId>
	//    6   13:invokevirtual   #285 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(mTitle, parcel, i);
	//    7   16:aload_0         
	//    8   17:getfield        #97  <Field CharSequence mTitle>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokestatic    #288 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mSubtitle, parcel, i);
	//   12   25:aload_0         
	//   13   26:getfield        #99  <Field CharSequence mSubtitle>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokestatic    #288 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mDescription, parcel, i);
	//   17   34:aload_0         
	//   18   35:getfield        #101 <Field CharSequence mDescription>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokestatic    #288 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeParcelable(((Parcelable) (mIcon)), i);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #109 <Field Bitmap mIcon>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #292 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeParcelable(((Parcelable) (mIconUri)), i);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #113 <Field Uri mIconUri>
	//   30   57:iload_2         
	//   31   58:invokevirtual   #292 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeBundle(mExtras);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #119 <Field Bundle mExtras>
	//   35   66:invokevirtual   #296 <Method void Parcel.writeBundle(Bundle)>
			parcel.writeParcelable(((Parcelable) (mMediaUri)), i);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #121 <Field Uri mMediaUri>
	//   39   74:iload_2         
	//   40   75:invokevirtual   #292 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//   41   78:return          
		} else
		{
			MediaDescriptionCompatApi21.writeToParcel(getMediaDescription(), parcel, i);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #298 <Method Object getMediaDescription()>
	//   44   83:aload_1         
	//   45   84:iload_2         
	//   46   85:invokestatic    #301 <Method void MediaDescriptionCompatApi21.writeToParcel(Object, Parcel, int)>
			return;
	//   47   88:return          
		}
	}

	public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
	public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
	public static final long BT_FOLDER_TYPE_GENRES = 4L;
	public static final long BT_FOLDER_TYPE_MIXED = 0L;
	public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
	public static final long BT_FOLDER_TYPE_TITLES = 1L;
	public static final long BT_FOLDER_TYPE_YEARS = 6L;
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaDescriptionCompat createFromParcel(Parcel parcel)
		{
			if(android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmpge          17
				return new MediaDescriptionCompat(parcel);
		//    3    8:new             #9   <Class MediaDescriptionCompat>
		//    4   11:dup             
		//    5   12:aload_1         
		//    6   13:invokespecial   #25  <Method void MediaDescriptionCompat(Parcel)>
		//    7   16:areturn         
			else
				return MediaDescriptionCompat.fromMediaDescription(MediaDescriptionCompatApi21.fromParcel(parcel));
		//    8   17:aload_1         
		//    9   18:invokestatic    #31  <Method Object MediaDescriptionCompatApi21.fromParcel(Parcel)>
		//   10   21:invokestatic    #35  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
		//   11   24:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #37  <Method MediaDescriptionCompat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaDescriptionCompat[] newArray(int i)
		{
			return new MediaDescriptionCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaDescriptionCompat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #42  <Method MediaDescriptionCompat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
	public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
	public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
	private final CharSequence mDescription;
	private Object mDescriptionObj;
	private final Bundle mExtras;
	private final Bitmap mIcon;
	private final Uri mIconUri;
	private final String mMediaId;
	private final Uri mMediaUri;
	private final CharSequence mSubtitle;
	private final CharSequence mTitle;

	static 
	{
	//    0    0:new             #8   <Class MediaDescriptionCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void MediaDescriptionCompat$1()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
