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
	//    1    1:invokespecial   #39  <Method void Object()>
		mMediaId = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method String Parcel.readString()>
	//    5    9:putfield        #47  <Field String mMediaId>
		mTitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #52  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #58  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #60  <Class CharSequence>
	//   11   25:putfield        #62  <Field CharSequence mTitle>
		mSubtitle = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   12   28:aload_0         
	//   13   29:getstatic       #52  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   14   32:aload_1         
	//   15   33:invokeinterface #58  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   16   38:checkcast       #60  <Class CharSequence>
	//   17   41:putfield        #64  <Field CharSequence mSubtitle>
		mDescription = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   18   44:aload_0         
	//   19   45:getstatic       #52  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   20   48:aload_1         
	//   21   49:invokeinterface #58  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   22   54:checkcast       #60  <Class CharSequence>
	//   23   57:putfield        #66  <Field CharSequence mDescription>
		mIcon = (Bitmap)parcel.readParcelable(((ClassLoader) (null)));
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:aconst_null     
	//   27   63:invokevirtual   #70  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   28   66:checkcast       #72  <Class Bitmap>
	//   29   69:putfield        #74  <Field Bitmap mIcon>
		mIconUri = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   30   72:aload_0         
	//   31   73:aload_1         
	//   32   74:aconst_null     
	//   33   75:invokevirtual   #70  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   34   78:checkcast       #76  <Class Uri>
	//   35   81:putfield        #78  <Field Uri mIconUri>
		mExtras = parcel.readBundle();
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #82  <Method Bundle Parcel.readBundle()>
	//   39   89:putfield        #84  <Field Bundle mExtras>
		mMediaUri = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:aconst_null     
	//   43   95:invokevirtual   #70  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   98:checkcast       #76  <Class Uri>
	//   45  101:putfield        #86  <Field Uri mMediaUri>
	//   46  104:return          
	}

	MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
			Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		mMediaId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field String mMediaId>
		mTitle = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #62  <Field CharSequence mTitle>
		mSubtitle = charsequence1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #64  <Field CharSequence mSubtitle>
		mDescription = charsequence2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #66  <Field CharSequence mDescription>
		mIcon = bitmap;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #74  <Field Bitmap mIcon>
		mIconUri = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #78  <Field Uri mIconUri>
		mExtras = bundle;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #84  <Field Bundle mExtras>
		mMediaUri = uri1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #86  <Field Uri mMediaUri>
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
	//    3    3:ifnull          197
	//    4    6:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//    5    9:bipush          21
	//    6   11:icmplt          197
				builder = new Builder();
	//    7   14:new             #10  <Class MediaDescriptionCompat$Builder>
	//    8   17:dup             
	//    9   18:invokespecial   #96  <Method void MediaDescriptionCompat$Builder()>
	//   10   21:astore          4
				builder.setMediaId(MediaDescriptionCompatApi21.getMediaId(obj));
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:invokestatic    #102 <Method String MediaDescriptionCompatApi21.getMediaId(Object)>
	//   14   29:invokevirtual   #106 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaId(String)>
	//   15   32:pop             
				builder.setTitle(MediaDescriptionCompatApi21.getTitle(obj));
	//   16   33:aload           4
	//   17   35:aload_0         
	//   18   36:invokestatic    #110 <Method CharSequence MediaDescriptionCompatApi21.getTitle(Object)>
	//   19   39:invokevirtual   #114 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setTitle(CharSequence)>
	//   20   42:pop             
				builder.setSubtitle(MediaDescriptionCompatApi21.getSubtitle(obj));
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:invokestatic    #117 <Method CharSequence MediaDescriptionCompatApi21.getSubtitle(Object)>
	//   24   49:invokevirtual   #120 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setSubtitle(CharSequence)>
	//   25   52:pop             
				builder.setDescription(MediaDescriptionCompatApi21.getDescription(obj));
	//   26   53:aload           4
	//   27   55:aload_0         
	//   28   56:invokestatic    #123 <Method CharSequence MediaDescriptionCompatApi21.getDescription(Object)>
	//   29   59:invokevirtual   #126 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setDescription(CharSequence)>
	//   30   62:pop             
				builder.setIconBitmap(MediaDescriptionCompatApi21.getIconBitmap(obj));
	//   31   63:aload           4
	//   32   65:aload_0         
	//   33   66:invokestatic    #130 <Method Bitmap MediaDescriptionCompatApi21.getIconBitmap(Object)>
	//   34   69:invokevirtual   #134 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconBitmap(Bitmap)>
	//   35   72:pop             
				builder.setIconUri(MediaDescriptionCompatApi21.getIconUri(obj));
	//   36   73:aload           4
	//   37   75:aload_0         
	//   38   76:invokestatic    #138 <Method Uri MediaDescriptionCompatApi21.getIconUri(Object)>
	//   39   79:invokevirtual   #142 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setIconUri(Uri)>
	//   40   82:pop             
				Bundle bundle1 = MediaDescriptionCompatApi21.getExtras(obj);
	//   41   83:aload_0         
	//   42   84:invokestatic    #146 <Method Bundle MediaDescriptionCompatApi21.getExtras(Object)>
	//   43   87:astore_3        
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
	//   50   98:ldc1            #148 <String "android.support.v4.media.description.MEDIA_URI">
	//   51  100:invokevirtual   #154 <Method Parcelable Bundle.getParcelable(String)>
	//   52  103:checkcast       #76  <Class Uri>
	//   53  106:astore_1        
				if(obj1 != null)
	//*  54  107:aload_1         
	//*  55  108:ifnull          143
				{
					if(bundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle1.size() == 2)
	//*  56  111:aload_3         
	//*  57  112:ldc1            #156 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//*  58  114:invokevirtual   #160 <Method boolean Bundle.containsKey(String)>
	//*  59  117:ifeq            131
	//*  60  120:aload_3         
	//*  61  121:invokevirtual   #164 <Method int Bundle.size()>
	//*  62  124:iconst_2        
	//*  63  125:icmpne          131
						break label1;
	//   64  128:goto            145
					bundle1.remove("android.support.v4.media.description.MEDIA_URI");
	//   65  131:aload_3         
	//   66  132:ldc1            #148 <String "android.support.v4.media.description.MEDIA_URI">
	//   67  134:invokevirtual   #168 <Method void Bundle.remove(String)>
					bundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
	//   68  137:aload_3         
	//   69  138:ldc1            #156 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   70  140:invokevirtual   #168 <Method void Bundle.remove(String)>
				}
				bundle = bundle1;
	//   71  143:aload_3         
	//   72  144:astore_2        
			}
			builder.setExtras(bundle);
	//   73  145:aload           4
	//   74  147:aload_2         
	//   75  148:invokevirtual   #172 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setExtras(Bundle)>
	//   76  151:pop             
			if(obj1 != null)
	//*  77  152:aload_1         
	//*  78  153:ifnull          166
				builder.setMediaUri(((Uri) (obj1)));
	//   79  156:aload           4
	//   80  158:aload_1         
	//   81  159:invokevirtual   #175 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   82  162:pop             
			else
	//*  83  163:goto            184
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  84  166:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*  85  169:bipush          23
	//*  86  171:icmplt          184
				builder.setMediaUri(MediaDescriptionCompatApi23.getMediaUri(obj));
	//   87  174:aload           4
	//   88  176:aload_0         
	//   89  177:invokestatic    #180 <Method Uri MediaDescriptionCompatApi23.getMediaUri(Object)>
	//   90  180:invokevirtual   #175 <Method MediaDescriptionCompat$Builder MediaDescriptionCompat$Builder.setMediaUri(Uri)>
	//   91  183:pop             
			obj1 = ((Object) (builder.build()));
	//   92  184:aload           4
	//   93  186:invokevirtual   #184 <Method MediaDescriptionCompat MediaDescriptionCompat$Builder.build()>
	//   94  189:astore_1        
			obj1.mDescriptionObj = obj;
	//   95  190:aload_1         
	//   96  191:aload_0         
	//   97  192:putfield        #186 <Field Object mDescriptionObj>
			return ((MediaDescriptionCompat) (obj1));
	//   98  195:aload_1         
	//   99  196:areturn         
		}
		return null;
	//  100  197:aconst_null     
	//  101  198:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getMediaDescription()
	{
		if(mDescriptionObj == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field Object mDescriptionObj>
	//*   2    4:ifnonnull       159
	//*   3    7:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            159
		{
			Object obj = MediaDescriptionCompatApi21.Builder.newInstance();
	//    7   18:invokestatic    #194 <Method Object MediaDescriptionCompatApi21$Builder.newInstance()>
	//    8   21:astore_3        
			MediaDescriptionCompatApi21.Builder.setMediaId(obj, mMediaId);
	//    9   22:aload_3         
	//   10   23:aload_0         
	//   11   24:getfield        #47  <Field String mMediaId>
	//   12   27:invokestatic    #197 <Method void MediaDescriptionCompatApi21$Builder.setMediaId(Object, String)>
			MediaDescriptionCompatApi21.Builder.setTitle(obj, mTitle);
	//   13   30:aload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #62  <Field CharSequence mTitle>
	//   16   35:invokestatic    #200 <Method void MediaDescriptionCompatApi21$Builder.setTitle(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setSubtitle(obj, mSubtitle);
	//   17   38:aload_3         
	//   18   39:aload_0         
	//   19   40:getfield        #64  <Field CharSequence mSubtitle>
	//   20   43:invokestatic    #202 <Method void MediaDescriptionCompatApi21$Builder.setSubtitle(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setDescription(obj, mDescription);
	//   21   46:aload_3         
	//   22   47:aload_0         
	//   23   48:getfield        #66  <Field CharSequence mDescription>
	//   24   51:invokestatic    #204 <Method void MediaDescriptionCompatApi21$Builder.setDescription(Object, CharSequence)>
			MediaDescriptionCompatApi21.Builder.setIconBitmap(obj, mIcon);
	//   25   54:aload_3         
	//   26   55:aload_0         
	//   27   56:getfield        #74  <Field Bitmap mIcon>
	//   28   59:invokestatic    #207 <Method void MediaDescriptionCompatApi21$Builder.setIconBitmap(Object, Bitmap)>
			MediaDescriptionCompatApi21.Builder.setIconUri(obj, mIconUri);
	//   29   62:aload_3         
	//   30   63:aload_0         
	//   31   64:getfield        #78  <Field Uri mIconUri>
	//   32   67:invokestatic    #210 <Method void MediaDescriptionCompatApi21$Builder.setIconUri(Object, Uri)>
			Bundle bundle1 = mExtras;
	//   33   70:aload_0         
	//   34   71:getfield        #84  <Field Bundle mExtras>
	//   35   74:astore_2        
			Bundle bundle = bundle1;
	//   36   75:aload_2         
	//   37   76:astore_1        
			if(android.os.Build.VERSION.SDK_INT < 23)
	//*  38   77:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   80:bipush          23
	//*  40   82:icmpge          125
			{
				bundle = bundle1;
	//   41   85:aload_2         
	//   42   86:astore_1        
				if(mMediaUri != null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #86  <Field Uri mMediaUri>
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
	//   50  100:new             #150 <Class Bundle>
	//   51  103:dup             
	//   52  104:invokespecial   #211 <Method void Bundle()>
	//   53  107:astore_1        
						bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
	//   54  108:aload_1         
	//   55  109:ldc1            #156 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   56  111:iconst_1        
	//   57  112:invokevirtual   #215 <Method void Bundle.putBoolean(String, boolean)>
					}
					bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", ((Parcelable) (mMediaUri)));
	//   58  115:aload_1         
	//   59  116:ldc1            #148 <String "android.support.v4.media.description.MEDIA_URI">
	//   60  118:aload_0         
	//   61  119:getfield        #86  <Field Uri mMediaUri>
	//   62  122:invokevirtual   #219 <Method void Bundle.putParcelable(String, Parcelable)>
				}
			}
			MediaDescriptionCompatApi21.Builder.setExtras(obj, bundle);
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:invokestatic    #222 <Method void MediaDescriptionCompatApi21$Builder.setExtras(Object, Bundle)>
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  66  130:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  133:bipush          23
	//*  68  135:icmplt          146
				MediaDescriptionCompatApi23.Builder.setMediaUri(obj, mMediaUri);
	//   69  138:aload_3         
	//   70  139:aload_0         
	//   71  140:getfield        #86  <Field Uri mMediaUri>
	//   72  143:invokestatic    #226 <Method void MediaDescriptionCompatApi23$Builder.setMediaUri(Object, Uri)>
			mDescriptionObj = MediaDescriptionCompatApi21.Builder.build(obj);
	//   73  146:aload_0         
	//   74  147:aload_3         
	//   75  148:invokestatic    #229 <Method Object MediaDescriptionCompatApi21$Builder.build(Object)>
	//   76  151:putfield        #186 <Field Object mDescriptionObj>
			return mDescriptionObj;
	//   77  154:aload_0         
	//   78  155:getfield        #186 <Field Object mDescriptionObj>
	//   79  158:areturn         
		} else
		{
			return mDescriptionObj;
	//   80  159:aload_0         
	//   81  160:getfield        #186 <Field Object mDescriptionObj>
	//   82  163:areturn         
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #232 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (mTitle)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field CharSequence mTitle>
	//    7   13:invokevirtual   #237 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(", ");
	//    9   17:aload_1         
	//   10   18:ldc1            #239 <String ", ">
	//   11   20:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (mSubtitle)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #64  <Field CharSequence mSubtitle>
	//   16   29:invokevirtual   #237 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(", ");
	//   18   33:aload_1         
	//   19   34:ldc1            #239 <String ", ">
	//   20   36:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(((Object) (mDescription)));
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #66  <Field CharSequence mDescription>
	//   25   45:invokevirtual   #237 <Method StringBuilder StringBuilder.append(Object)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #95  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          79
		{
			parcel.writeString(mMediaId);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #47  <Field String mMediaId>
	//    6   13:invokevirtual   #249 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(mTitle, parcel, i);
	//    7   16:aload_0         
	//    8   17:getfield        #62  <Field CharSequence mTitle>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokestatic    #252 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mSubtitle, parcel, i);
	//   12   25:aload_0         
	//   13   26:getfield        #64  <Field CharSequence mSubtitle>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokestatic    #252 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(mDescription, parcel, i);
	//   17   34:aload_0         
	//   18   35:getfield        #66  <Field CharSequence mDescription>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokestatic    #252 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeParcelable(((Parcelable) (mIcon)), i);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #74  <Field Bitmap mIcon>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #256 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeParcelable(((Parcelable) (mIconUri)), i);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #78  <Field Uri mIconUri>
	//   30   57:iload_2         
	//   31   58:invokevirtual   #256 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeBundle(mExtras);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #84  <Field Bundle mExtras>
	//   35   66:invokevirtual   #260 <Method void Parcel.writeBundle(Bundle)>
			parcel.writeParcelable(((Parcelable) (mMediaUri)), i);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #86  <Field Uri mMediaUri>
	//   39   74:iload_2         
	//   40   75:invokevirtual   #256 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//   41   78:return          
		} else
		{
			MediaDescriptionCompatApi21.writeToParcel(getMediaDescription(), parcel, i);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #262 <Method Object getMediaDescription()>
	//   44   83:aload_1         
	//   45   84:iload_2         
	//   46   85:invokestatic    #265 <Method void MediaDescriptionCompatApi21.writeToParcel(Object, Parcel, int)>
			return;
	//   47   88:return          
		}
	}

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
	//    2    4:invokespecial   #34  <Method void MediaDescriptionCompat$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
