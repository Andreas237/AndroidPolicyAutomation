// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.*;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareOpenGraphObject, SharePhoto, ShareModelBuilder

public abstract class ShareOpenGraphValueContainer
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		public Builder putBoolean(String s, boolean flag)
		{
			bundle.putBoolean(s, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #29  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putBooleanArray(String s, boolean aflag[])
		{
			bundle.putBooleanArray(s, aflag);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #37  <Method void Bundle.putBooleanArray(String, boolean[])>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putDouble(String s, double d)
		{
			bundle.putDouble(s, d);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:dload_2         
		//    4    6:invokevirtual   #44  <Method void Bundle.putDouble(String, double)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putDoubleArray(String s, double ad[])
		{
			bundle.putDoubleArray(s, ad);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #50  <Method void Bundle.putDoubleArray(String, double[])>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putInt(String s, int i)
		{
			bundle.putInt(s, i);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #56  <Method void Bundle.putInt(String, int)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putIntArray(String s, int ai[])
		{
			bundle.putIntArray(s, ai);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #62  <Method void Bundle.putIntArray(String, int[])>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putLong(String s, long l)
		{
			bundle.putLong(s, l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #68  <Method void Bundle.putLong(String, long)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putLongArray(String s, long al[])
		{
			bundle.putLongArray(s, al);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #74  <Method void Bundle.putLongArray(String, long[])>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putObject(String s, ShareOpenGraphObject shareopengraphobject)
		{
			bundle.putParcelable(s, ((Parcelable) (shareopengraphobject)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #81  <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putObjectArrayList(String s, ArrayList arraylist)
		{
			bundle.putParcelableArrayList(s, arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #88  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putPhoto(String s, SharePhoto sharephoto)
		{
			bundle.putParcelable(s, ((Parcelable) (sharephoto)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #81  <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putPhotoArrayList(String s, ArrayList arraylist)
		{
			bundle.putParcelableArrayList(s, arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #88  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putString(String s, String s1)
		{
			bundle.putString(s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #99  <Method void Bundle.putString(String, String)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putStringArrayList(String s, ArrayList arraylist)
		{
			bundle.putStringArrayList(s, arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #103 <Method void Bundle.putStringArrayList(String, ArrayList)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareOpenGraphValueContainer)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareOpenGraphValueContainer>
		//    3    5:invokevirtual   #109 <Method ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer)>
		//    4    8:areturn         
		}

		public Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
		{
			if(shareopengraphvaluecontainer != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          15
				bundle.putAll(shareopengraphvaluecontainer.getBundle());
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field Bundle bundle>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #113 <Method Bundle ShareOpenGraphValueContainer.getBundle()>
		//    6   12:invokevirtual   #117 <Method void Bundle.putAll(Bundle)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private Bundle bundle;


/*
		static Bundle access$000(Builder builder)
		{
			return builder.bundle;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			bundle = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #18  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void Bundle()>
		//    6   12:putfield        #21  <Field Bundle bundle>
		//    7   15:return          
		}
	}


	ShareOpenGraphValueContainer(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		bundle = parcel.readBundle(((Class) (com/facebook/share/model/ShareOpenGraphValueContainer$Builder)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #9   <Class ShareOpenGraphValueContainer$Builder>
	//    5    8:invokevirtual   #23  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #29  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    7   14:putfield        #31  <Field Bundle bundle>
	//    8   17:return          
	}

	protected ShareOpenGraphValueContainer(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		bundle = (Bundle)builder.bundle.clone();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #37  <Method Bundle ShareOpenGraphValueContainer$Builder.access$000(ShareOpenGraphValueContainer$Builder)>
	//    5    9:invokevirtual   #43  <Method Object Bundle.clone()>
	//    6   12:checkcast       #39  <Class Bundle>
	//    7   15:putfield        #31  <Field Bundle bundle>
	//    8   18:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object get(String s)
	{
		return bundle.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public boolean getBoolean(String s, boolean flag)
	{
		return bundle.getBoolean(s, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #57  <Method boolean Bundle.getBoolean(String, boolean)>
	//    5    9:ireturn         
	}

	public boolean[] getBooleanArray(String s)
	{
		return bundle.getBooleanArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method boolean[] Bundle.getBooleanArray(String)>
	//    4    8:areturn         
	}

	public Bundle getBundle()
	{
		return (Bundle)bundle.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:invokevirtual   #43  <Method Object Bundle.clone()>
	//    3    7:checkcast       #39  <Class Bundle>
	//    4   10:areturn         
	}

	public double getDouble(String s, double d)
	{
		return bundle.getDouble(s, d);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #67  <Method double Bundle.getDouble(String, double)>
	//    5    9:dreturn         
	}

	public double[] getDoubleArray(String s)
	{
		return bundle.getDoubleArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method double[] Bundle.getDoubleArray(String)>
	//    4    8:areturn         
	}

	public int getInt(String s, int i)
	{
		return bundle.getInt(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #75  <Method int Bundle.getInt(String, int)>
	//    5    9:ireturn         
	}

	public int[] getIntArray(String s)
	{
		return bundle.getIntArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method int[] Bundle.getIntArray(String)>
	//    4    8:areturn         
	}

	public long getLong(String s, long l)
	{
		return bundle.getLong(s, l);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #83  <Method long Bundle.getLong(String, long)>
	//    5    9:lreturn         
	}

	public long[] getLongArray(String s)
	{
		return bundle.getLongArray(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method long[] Bundle.getLongArray(String)>
	//    4    8:areturn         
	}

	public ShareOpenGraphObject getObject(String s)
	{
		s = ((String) (bundle.get(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object Bundle.get(String)>
	//    4    8:astore_1        
		if(s instanceof ShareOpenGraphObject)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #91  <Class ShareOpenGraphObject>
	//*   7   13:ifeq            21
			return (ShareOpenGraphObject)s;
	//    8   16:aload_1         
	//    9   17:checkcast       #91  <Class ShareOpenGraphObject>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public ArrayList getObjectArrayList(String s)
	{
		Object obj = ((Object) (bundle.getParcelableArrayList(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method ArrayList Bundle.getParcelableArrayList(String)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		s = ((String) (new ArrayList()));
	//    9   15:new             #98  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #99  <Method void ArrayList()>
	//   12   22:astore_1        
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   13   23:aload_2         
	//   14   24:invokevirtual   #103 <Method Iterator ArrayList.iterator()>
	//   15   27:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   16   28:aload_2         
	//   17   29:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//   18   34:ifeq            66
			Parcelable parcelable = (Parcelable)((Iterator) (obj)).next();
	//   19   37:aload_2         
	//   20   38:invokeinterface #112 <Method Object Iterator.next()>
	//   21   43:checkcast       #114 <Class Parcelable>
	//   22   46:astore_3        
			if(parcelable instanceof ShareOpenGraphObject)
	//*  23   47:aload_3         
	//*  24   48:instanceof      #91  <Class ShareOpenGraphObject>
	//*  25   51:ifeq            28
				((ArrayList) (s)).add(((Object) ((ShareOpenGraphObject)parcelable)));
	//   26   54:aload_1         
	//   27   55:aload_3         
	//   28   56:checkcast       #91  <Class ShareOpenGraphObject>
	//   29   59:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   30   62:pop             
		} while(true);
	//   31   63:goto            28
		return ((ArrayList) (s));
	//   32   66:aload_1         
	//   33   67:areturn         
	}

	public SharePhoto getPhoto(String s)
	{
		s = ((String) (bundle.getParcelable(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method Parcelable Bundle.getParcelable(String)>
	//    4    8:astore_1        
		if(s instanceof SharePhoto)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #127 <Class SharePhoto>
	//*   7   13:ifeq            21
			return (SharePhoto)s;
	//    8   16:aload_1         
	//    9   17:checkcast       #127 <Class SharePhoto>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public ArrayList getPhotoArrayList(String s)
	{
		Object obj = ((Object) (bundle.getParcelableArrayList(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method ArrayList Bundle.getParcelableArrayList(String)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		s = ((String) (new ArrayList()));
	//    9   15:new             #98  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #99  <Method void ArrayList()>
	//   12   22:astore_1        
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   13   23:aload_2         
	//   14   24:invokevirtual   #103 <Method Iterator ArrayList.iterator()>
	//   15   27:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   16   28:aload_2         
	//   17   29:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//   18   34:ifeq            66
			Parcelable parcelable = (Parcelable)((Iterator) (obj)).next();
	//   19   37:aload_2         
	//   20   38:invokeinterface #112 <Method Object Iterator.next()>
	//   21   43:checkcast       #114 <Class Parcelable>
	//   22   46:astore_3        
			if(parcelable instanceof SharePhoto)
	//*  23   47:aload_3         
	//*  24   48:instanceof      #127 <Class SharePhoto>
	//*  25   51:ifeq            28
				((ArrayList) (s)).add(((Object) ((SharePhoto)parcelable)));
	//   26   54:aload_1         
	//   27   55:aload_3         
	//   28   56:checkcast       #127 <Class SharePhoto>
	//   29   59:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   30   62:pop             
		} while(true);
	//   31   63:goto            28
		return ((ArrayList) (s));
	//   32   66:aload_1         
	//   33   67:areturn         
	}

	public String getString(String s)
	{
		return bundle.getString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method String Bundle.getString(String)>
	//    4    8:areturn         
	}

	public ArrayList getStringArrayList(String s)
	{
		return bundle.getStringArrayList(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method ArrayList Bundle.getStringArrayList(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return bundle.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:invokevirtual   #141 <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(bundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Bundle bundle>
	//    3    5:invokevirtual   #148 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	private final Bundle bundle;
}
