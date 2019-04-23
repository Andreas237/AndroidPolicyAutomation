// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.session.MediaSessionCompat;
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
	//    1    1:invokespecial   #80  <Method void Object()>
		mMediaId = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #86  <Method String Parcel.readString()>
	//    5    9:putfield        #88  <Field String mMediaId>
		mTitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #93  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #99  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #101 <Class CharSequence>
	//   11   25:putfield        #103 <Field CharSequence mTitle>
		mSubtitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   12   28:aload_0         
	//   13   29:getstatic       #93  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   14   32:aload_1         
	//   15   33:invokeinterface #99  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   16   38:checkcast       #101 <Class CharSequence>
	//   17   41:putfield        #105 <Field CharSequence mSubtitle>
		mDescription = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   18   44:aload_0         
	//   19   45:getstatic       #93  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   20   48:aload_1         
	//   21   49:invokeinterface #99  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   22   54:checkcast       #101 <Class CharSequence>
	//   23   57:putfield        #107 <Field CharSequence mDescription>
		ClassLoader classloader = ((Object)this).getClass().getClassLoader();
	//   24   60:aload_0         
	//   25   61:invokevirtual   #111 <Method Class Object.getClass()>
	//   26   64:invokevirtual   #117 <Method ClassLoader Class.getClassLoader()>
	//   27   67:astore_2        
		mIcon = (Bitmap)parcel.readParcelable(classloader);
	//   28   68:aload_0         
	//   29   69:aload_1         
	//   30   70:aload_2         
	//   31   71:invokevirtual   #121 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   32   74:checkcast       #123 <Class Bitmap>
	//   33   77:putfield        #125 <Field Bitmap mIcon>
		mIconUri = (Uri)parcel.readParcelable(classloader);
	//   34   80:aload_0         
	//   35   81:aload_1         
	//   36   82:aload_2         
	//   37   83:invokevirtual   #121 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   38   86:checkcast       #127 <Class Uri>
	//   39   89:putfield        #129 <Field Uri mIconUri>
		mExtras = parcel.readBundle(classloader);
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:aload_2         
	//   43   95:invokevirtual   #133 <Method Bundle Parcel.readBundle(ClassLoader)>
	//   44   98:putfield        #135 <Field Bundle mExtras>
		mMediaUri = (Uri)parcel.readParcelable(classloader);
	//   45  101:aload_0         
	//   46  102:aload_1         
	//   47  103:aload_2         
	//   48  104:invokevirtual   #121 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   49  107:checkcast       #127 <Class Uri>
	//   50  110:putfield        #137 <Field Uri mMediaUri>
	//   51  113:return          
	}

	MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
			Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		mMediaId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #88  <Field String mMediaId>
		mTitle = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #103 <Field CharSequence mTitle>
		mSubtitle = charsequence1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #105 <Field CharSequence mSubtitle>
		mDescription = charsequence2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #107 <Field CharSequence mDescription>
		mIcon = bitmap;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #125 <Field Bitmap mIcon>
		mIconUri = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #129 <Field Uri mIconUri>
		mExtras = bundle;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #135 <Field Bundle mExtras>
		mMediaUri = uri1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #137 <Field Uri mMediaUri>
	//   26   49:return          
	}

	public static MediaDescriptionCompat fromMediaDescription(Object obj)
	{
label0:
		{
			Object obj1;
			Bundle bundle;
			Builder builder;
label1:
			{
				bundle = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
				if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
					break label0;
	//    2    2:aload_0         
	//    3    3:ifnull          201
	//    4    6:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//    5    9:bipush          21
	//    6   11:icmplt          201
				builder = new Builder();
	//    7   14:new             #10  <Class MediaDescriptionCompat$Builder>
	//    8   17:dup             
	//    9   18:invokespecial   #147 <Method void MediaDescriptionCompat$Builder()>
	//   10   21:astore          4
				builder.setMediaId(MediaDescriptionCompatApi21.getMediaId(obj));
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:invokestatic    #153 <Method String MediaDescriptionCompatApi21.getMediaId(Object)>
	//   14   29:invokevirtual   #157 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//   15   32:pop             
				builder.setTitle(MediaDescriptionCompatApi21.getTitle(obj));
	//   16   33:aload           4
	//   17   35:aload_0         
	//   18   36:invokestatic    #161 <Method CharSequence MediaDescriptionCompatApi21.getTitle(Object)>
	//   19   39:invokevirtual   #165 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//   20   42:pop             
				builder.setSubtitle(MediaDescriptionCompatApi21.getSubtitle(obj));
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:invokestatic    #168 <Method CharSequence MediaDescriptionCompatApi21.getSubtitle(Object)>
	//   24   49:invokevirtual   #171 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//   25   52:pop             
				builder.setDescription(MediaDescriptionCompatApi21.getDescription(obj));
	//   26   53:aload           4
	//   27   55:aload_0         
	//   28   56:invokestatic    #174 <Method CharSequence MediaDescriptionCompatApi21.getDescription(Object)>
	//   29   59:invokevirtual   #177 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//   30   62:pop             
				builder.setIconBitmap(MediaDescriptionCompatApi21.getIconBitmap(obj));
	//   31   63:aload           4
	//   32   65:aload_0         
	//   33   66:invokestatic    #181 <Method Bitmap MediaDescriptionCompatApi21.getIconBitmap(Object)>
	//   34   69:invokevirtual   #185 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//   35   72:pop             
				builder.setIconUri(MediaDescriptionCompatApi21.getIconUri(obj));
	//   36   73:aload           4
	//   37   75:aload_0         
	//   38   76:invokestatic    #189 <Method Uri MediaDescriptionCompatApi21.getIconUri(Object)>
	//   39   79:invokevirtual   #193 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//   40   82:pop             
				Bundle bundle1 = MediaDescriptionCompatApi21.getExtras(obj);
	//   41   83:aload_0         
	//   42   84:invokestatic    #197 <Method Bundle MediaDescriptionCompatApi21.getExtras(Object)>
	//   43   87:astore_3        
				if(bundle1 != null)
	//*  44   88:aload_3         
	//*  45   89:ifnull          109
				{
					MediaSessionCompat.ensureClassLoader(bundle1);
	//   46   92:aload_3         
	//   47   93:invokestatic    #203 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
					obj1 = ((Object) ((Uri)bundle1.getParcelable("android.support.v4.media.description.MEDIA_URI")));
	//   48   96:aload_3         
	//   49   97:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   50   99:invokevirtual   #209 <Method Parcelable Bundle.getParcelable(String)>
	//   51  102:checkcast       #127 <Class Uri>
	//   52  105:astore_1        
				} else
	//*  53  106:goto            111
				{
					obj1 = null;
	//   54  109:aconst_null     
	//   55  110:astore_1        
				}
				if(obj1 != null)
	//*  56  111:aload_1         
	//*  57  112:ifnull          147
				{
					if(bundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle1.size() == 2)
	//*  58  115:aload_3         
	//*  59  116:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//*  60  118:invokevirtual   #213 <Method boolean Bundle.containsKey(String)>
	//*  61  121:ifeq            135
	//*  62  124:aload_3         
	//*  63  125:invokevirtual   #217 <Method int Bundle.size()>
	//*  64  128:iconst_2        
	//*  65  129:icmpne          135
						break label1;
	//   66  132:goto            149
					bundle1.remove("android.support.v4.media.description.MEDIA_URI");
	//   67  135:aload_3         
	//   68  136:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   69  138:invokevirtual   #221 <Method void Bundle.remove(String)>
					bundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
	//   70  141:aload_3         
	//   71  142:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   72  144:invokevirtual   #221 <Method void Bundle.remove(String)>
				}
				bundle = bundle1;
	//   73  147:aload_3         
	//   74  148:astore_2        
			}
			builder.setExtras(bundle);
	//   75  149:aload           4
	//   76  151:aload_2         
	//   77  152:invokevirtual   #225 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//   78  155:pop             
			if(obj1 != null)
	//*  79  156:aload_1         
	//*  80  157:ifnull          170
				builder.setMediaUri(((Uri) (obj1)));
	//   81  160:aload           4
	//   82  162:aload_1         
	//   83  163:invokevirtual   #228 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   84  166:pop             
			else
	//*  85  167:goto            188
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  86  170:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//*  87  173:bipush          23
	//*  88  175:icmplt          188
				builder.setMediaUri(MediaDescriptionCompatApi23.getMediaUri(obj));
	//   89  178:aload           4
	//   90  180:aload_0         
	//   91  181:invokestatic    #233 <Method Uri MediaDescriptionCompatApi23.getMediaUri(Object)>
	//   92  184:invokevirtual   #228 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   93  187:pop             
			obj1 = ((Object) (builder.build()));
	//   94  188:aload           4
	//   95  190:invokevirtual   #237 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//   96  193:astore_1        
			obj1.mDescriptionObj = obj;
	//   97  194:aload_1         
	//   98  195:aload_0         
	//   99  196:putfield        #239 <Field Object mDescriptionObj>
			return ((MediaDescriptionCompat) (obj1));
	//  100  199:aload_1         
	//  101  200:areturn         
		}
		return null;
	//  102  201:aconst_null     
	//  103  202:areturn         
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
	//    1    1:getfield        #107 <Field CharSequence mDescription>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public Bitmap getIconBitmap()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Bitmap mIcon>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Uri mIconUri>
	//    2    4:areturn         
	}

	public Object getMediaDescription()
	{
		if(mDescriptionObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #239 <Field Object mDescriptionObj>
	//*   2    4:ifnonnull       159
	//*   3    7:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            159
		{
			Object obj = MediaDescriptionCompatApi21.Builder.newInstance();
	//    7   18:invokestatic    #253 <Method Object MediaDescriptionCompatApi21$Builder.newInstance()>
	//    8   21:astore_3        
			MediaDescriptionCompatApi21.Builder.setMediaId(obj, mMediaId);
	//    9   22:aload_3         
	//   10   23:aload_0         
	//   11   24:getfield        #88  <Field String mMediaId>
	//   12   27:invokestatic    #256 <Method void MediaDescriptionCompatApi21$Builder.setMediaId(Object, String)>
			MediaDescriptionCompatApi21.Builder.setTitle(obj, mTitle);
	//   13   30:aload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #103 <Field CharSequence mTitle>
	//   16   35:invokestatic    #259 <Method void MediaDescriptionCompatApi21$Builder.setTitle(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setSubtitle(obj, mSubtitle);
	//   17   38:aload_3         
	//   18   39:aload_0         
	//   19   40:getfield        #105 <Field CharSequence mSubtitle>
	//   20   43:invokestatic    #261 <Method void MediaDescriptionCompatApi21$Builder.setSubtitle(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setDescription(obj, mDescription);
	//   21   46:aload_3         
	//   22   47:aload_0         
	//   23   48:getfield        #107 <Field CharSequence mDescription>
	//   24   51:invokestatic    #263 <Method void MediaDescriptionCompatApi21$Builder.setDescription(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setIconBitmap(obj, mIcon);
	//   25   54:aload_3         
	//   26   55:aload_0         
	//   27   56:getfield        #125 <Field Bitmap mIcon>
	//   28   59:invokestatic    #266 <Method void MediaDescriptionCompatApi21$Builder.setIconBitmap(Object, Bitmap)>
			MediaDescriptionCompatApi21.Builder.setIconUri(obj, mIconUri);
	//   29   62:aload_3         
	//   30   63:aload_0         
	//   31   64:getfield        #129 <Field Uri mIconUri>
	//   32   67:invokestatic    #269 <Method void MediaDescriptionCompatApi21$Builder.setIconUri(Object, Uri)>
			Bundle bundle1 = mExtras;
	//   33   70:aload_0         
	//   34   71:getfield        #135 <Field Bundle mExtras>
	//   35   74:astore_2        
			Bundle bundle = bundle1;
	//   36   75:aload_2         
	//   37   76:astore_1        
			if(android.os.Build.VERSION.SDK_INT < 23)
	//*  38   77:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   80:bipush          23
	//*  40   82:icmpge          125
			{
				bundle = bundle1;
	//   41   85:aload_2         
	//   42   86:astore_1        
				if(mMediaUri != null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #137 <Field Uri mMediaUri>
	//*  45   91:ifnull          125
				{
					bundle = bundle1;
	//   46   94:aload_2         
	//   47   95:astore_1        
					if(bundle1 == null)
	//*  48   96:aload_2         
	//*  49   97:ifnonnull       115
					{
						bundle = new Bundle();
	//   50  100:new             #205 <Class Bundle>
	//   51  103:dup             
	//   52  104:invokespecial   #270 <Method void Bundle()>
	//   53  107:astore_1        
						bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
	//   54  108:aload_1         
	//   55  109:ldc1            #47  <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   56  111:iconst_1        
	//   57  112:invokevirtual   #274 <Method void Bundle.putBoolean(String, boolean)>
					}
					bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", ((Parcelable) (mMediaUri)));
	//   58  115:aload_1         
	//   59  116:ldc1            #40  <String "android.support.v4.media.description.MEDIA_URI">
	//   60  118:aload_0         
	//   61  119:getfield        #137 <Field Uri mMediaUri>
	//   62  122:invokevirtual   #278 <Method void Bundle.putParcelable(String, Parcelable)>
				}
			}
			MediaDescriptionCompatApi21.Builder.setExtras(obj, bundle);
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:invokestatic    #281 <Method void MediaDescriptionCompatApi21$Builder.setExtras(Object, Bundle)>
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  66  130:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  133:bipush          23
	//*  68  135:icmplt          146
				MediaDescriptionCompatApi23.Builder.setMediaUri(obj, mMediaUri);
	//   69  138:aload_3         
	//   70  139:aload_0         
	//   71  140:getfield        #137 <Field Uri mMediaUri>
	//   72  143:invokestatic    #285 <Method void MediaDescriptionCompatApi23$Builder.setMediaUri(Object, Uri)>
			mDescriptionObj = MediaDescriptionCompatApi21.Builder.build(obj);
	//   73  146:aload_0         
	//   74  147:aload_3         
	//   75  148:invokestatic    #288 <Method Object MediaDescriptionCompatApi21$Builder.build(Object)>
	//   76  151:putfield        #239 <Field Object mDescriptionObj>
			return mDescriptionObj;
	//   77  154:aload_0         
	//   78  155:getfield        #239 <Field Object mDescriptionObj>
	//   79  158:areturn         
		} else
		{
			return mDescriptionObj;
	//   80  159:aload_0         
	//   81  160:getfield        #239 <Field Object mDescriptionObj>
	//   82  163:areturn         
		}
	}

	public String getMediaId()
	{
		return mMediaId;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String mMediaId>
	//    2    4:areturn         
	}

	public Uri getMediaUri()
	{
		return mMediaUri;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Uri mMediaUri>
	//    2    4:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CharSequence mSubtitle>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #291 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #292 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (mTitle)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #103 <Field CharSequence mTitle>
	//    7   13:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(", ");
	//    9   17:aload_1         
	//   10   18:ldc2            #298 <String ", ">
	//   11   21:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(((Object) (mSubtitle)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #105 <Field CharSequence mSubtitle>
	//   16   30:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
	//   17   33:pop             
		stringbuilder.append(", ");
	//   18   34:aload_1         
	//   19   35:ldc2            #298 <String ", ">
	//   20   38:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(((Object) (mDescription)));
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #107 <Field CharSequence mDescription>
	//   25   47:invokevirtual   #296 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
		return stringbuilder.toString();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #303 <Method String StringBuilder.toString()>
	//   29   55:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #146 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          79
		{
			parcel.writeString(mMediaId);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #88  <Field String mMediaId>
	//    6   13:invokevirtual   #308 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(mTitle, parcel, i);
	//    7   16:aload_0         
	//    8   17:getfield        #103 <Field CharSequence mTitle>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokestatic    #311 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mSubtitle, parcel, i);
	//   12   25:aload_0         
	//   13   26:getfield        #105 <Field CharSequence mSubtitle>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokestatic    #311 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mDescription, parcel, i);
	//   17   34:aload_0         
	//   18   35:getfield        #107 <Field CharSequence mDescription>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokestatic    #311 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeParcelable(((Parcelable) (mIcon)), i);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #125 <Field Bitmap mIcon>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #315 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeParcelable(((Parcelable) (mIconUri)), i);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #129 <Field Uri mIconUri>
	//   30   57:iload_2         
	//   31   58:invokevirtual   #315 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeBundle(mExtras);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #135 <Field Bundle mExtras>
	//   35   66:invokevirtual   #318 <Method void Parcel.writeBundle(Bundle)>
			parcel.writeParcelable(((Parcelable) (mMediaUri)), i);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #137 <Field Uri mMediaUri>
	//   39   74:iload_2         
	//   40   75:invokevirtual   #315 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//   41   78:return          
		} else
		{
			MediaDescriptionCompatApi21.writeToParcel(getMediaDescription(), parcel, i);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #320 <Method Object getMediaDescription()>
	//   44   83:aload_1         
	//   45   84:iload_2         
	//   46   85:invokestatic    #323 <Method void MediaDescriptionCompatApi21.writeToParcel(Object, Parcel, int)>
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
	public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
	public static final long STATUS_DOWNLOADED = 2L;
	public static final long STATUS_DOWNLOADING = 1L;
	public static final long STATUS_NOT_DOWNLOADED = 0L;
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
	//    2    4:invokespecial   #75  <Method void MediaDescriptionCompat$1()>
	//    3    7:putstatic       #77  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
