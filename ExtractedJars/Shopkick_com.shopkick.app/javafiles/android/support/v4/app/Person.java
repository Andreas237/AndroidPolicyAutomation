// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;

public class Person
{
	public static class Builder
	{

		public Person build()
		{
			return new Person(this);
		//    0    0:new             #6   <Class Person>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #48  <Method void Person(Person$Builder)>
		//    4    8:areturn         
		}

		public Builder setBot(boolean flag)
		{
			mIsBot = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #39  <Field boolean mIsBot>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setIcon(IconCompat iconcompat)
		{
			mIcon = iconcompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field IconCompat mIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setImportant(boolean flag)
		{
			mIsImportant = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #42  <Field boolean mIsImportant>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setKey(String s)
		{
			mKey = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field String mKey>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setName(CharSequence charsequence)
		{
			mName = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field CharSequence mName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUri(String s)
		{
			mUri = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field String mUri>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		IconCompat mIcon;
		boolean mIsBot;
		boolean mIsImportant;
		String mKey;
		CharSequence mName;
		String mUri;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}

		Builder(Person person)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mName = person.mName;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #26  <Field CharSequence Person.mName>
		//    5    9:putfield        #27  <Field CharSequence mName>
			mIcon = person.mIcon;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #29  <Field IconCompat Person.mIcon>
		//    9   17:putfield        #30  <Field IconCompat mIcon>
			mUri = person.mUri;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #32  <Field String Person.mUri>
		//   13   25:putfield        #33  <Field String mUri>
			mKey = person.mKey;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #35  <Field String Person.mKey>
		//   17   33:putfield        #36  <Field String mKey>
			mIsBot = person.mIsBot;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:getfield        #38  <Field boolean Person.mIsBot>
		//   21   41:putfield        #39  <Field boolean mIsBot>
			mIsImportant = person.mIsImportant;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:getfield        #41  <Field boolean Person.mIsImportant>
		//   25   49:putfield        #42  <Field boolean mIsImportant>
		//   26   52:return          
		}
	}


	Person(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mName = builder.mName;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #43  <Field CharSequence Person$Builder.mName>
	//    5    9:putfield        #44  <Field CharSequence mName>
		mIcon = builder.mIcon;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #46  <Field IconCompat Person$Builder.mIcon>
	//    9   17:putfield        #47  <Field IconCompat mIcon>
		mUri = builder.mUri;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #49  <Field String Person$Builder.mUri>
	//   13   25:putfield        #50  <Field String mUri>
		mKey = builder.mKey;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #52  <Field String Person$Builder.mKey>
	//   17   33:putfield        #53  <Field String mKey>
		mIsBot = builder.mIsBot;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #55  <Field boolean Person$Builder.mIsBot>
	//   21   41:putfield        #56  <Field boolean mIsBot>
		mIsImportant = builder.mIsImportant;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #58  <Field boolean Person$Builder.mIsImportant>
	//   25   49:putfield        #59  <Field boolean mIsImportant>
	//   26   52:return          
	}

	public static Person fromAndroidPerson(android.app.Person person)
	{
		Builder builder = (new Builder()).setName(person.getName());
	//    0    0:new             #6   <Class Person$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void Person$Builder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #76  <Method CharSequence android.app.Person.getName()>
	//    5   11:invokevirtual   #80  <Method Person$Builder Person$Builder.setName(CharSequence)>
	//    6   14:astore_2        
		IconCompat iconcompat;
		if(person.getIcon() != null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #84  <Method android.graphics.drawable.Icon android.app.Person.getIcon()>
	//*   9   19:ifnull          33
			iconcompat = IconCompat.createFromIcon(person.getIcon());
	//   10   22:aload_0         
	//   11   23:invokevirtual   #84  <Method android.graphics.drawable.Icon android.app.Person.getIcon()>
	//   12   26:invokestatic    #90  <Method IconCompat IconCompat.createFromIcon(android.graphics.drawable.Icon)>
	//   13   29:astore_1        
		else
	//*  14   30:goto            35
			iconcompat = null;
	//   15   33:aconst_null     
	//   16   34:astore_1        
		return builder.setIcon(iconcompat).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #94  <Method Person$Builder Person$Builder.setIcon(IconCompat)>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #98  <Method String android.app.Person.getUri()>
	//   22   44:invokevirtual   #102 <Method Person$Builder Person$Builder.setUri(String)>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #105 <Method String android.app.Person.getKey()>
	//   25   51:invokevirtual   #108 <Method Person$Builder Person$Builder.setKey(String)>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #111 <Method boolean android.app.Person.isBot()>
	//   28   58:invokevirtual   #115 <Method Person$Builder Person$Builder.setBot(boolean)>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #117 <Method boolean android.app.Person.isImportant()>
	//   31   65:invokevirtual   #120 <Method Person$Builder Person$Builder.setImportant(boolean)>
	//   32   68:invokevirtual   #124 <Method Person Person$Builder.build()>
	//   33   71:areturn         
	}

	public static Person fromBundle(Bundle bundle)
	{
		Object obj = ((Object) (bundle.getBundle("icon")));
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "icon">
	//    2    3:invokevirtual   #134 <Method Bundle Bundle.getBundle(String)>
	//    3    6:astore_1        
		Builder builder = (new Builder()).setName(bundle.getCharSequence("name"));
	//    4    7:new             #6   <Class Person$Builder>
	//    5   10:dup             
	//    6   11:invokespecial   #70  <Method void Person$Builder()>
	//    7   14:aload_0         
	//    8   15:ldc1            #23  <String "name">
	//    9   17:invokevirtual   #138 <Method CharSequence Bundle.getCharSequence(String)>
	//   10   20:invokevirtual   #80  <Method Person$Builder Person$Builder.setName(CharSequence)>
	//   11   23:astore_2        
		if(obj != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          36
			obj = ((Object) (IconCompat.createFromBundle(((Bundle) (obj)))));
	//   14   28:aload_1         
	//   15   29:invokestatic    #142 <Method IconCompat IconCompat.createFromBundle(Bundle)>
	//   16   32:astore_1        
		else
	//*  17   33:goto            38
			obj = null;
	//   18   36:aconst_null     
	//   19   37:astore_1        
		return builder.setIcon(((IconCompat) (obj))).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean("isBot")).setImportant(bundle.getBoolean("isImportant")).build();
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #94  <Method Person$Builder Person$Builder.setIcon(IconCompat)>
	//   23   43:aload_0         
	//   24   44:ldc1            #26  <String "uri">
	//   25   46:invokevirtual   #146 <Method String Bundle.getString(String)>
	//   26   49:invokevirtual   #102 <Method Person$Builder Person$Builder.setUri(String)>
	//   27   52:aload_0         
	//   28   53:ldc1            #20  <String "key">
	//   29   55:invokevirtual   #146 <Method String Bundle.getString(String)>
	//   30   58:invokevirtual   #108 <Method Person$Builder Person$Builder.setKey(String)>
	//   31   61:aload_0         
	//   32   62:ldc1            #14  <String "isBot">
	//   33   64:invokevirtual   #150 <Method boolean Bundle.getBoolean(String)>
	//   34   67:invokevirtual   #115 <Method Person$Builder Person$Builder.setBot(boolean)>
	//   35   70:aload_0         
	//   36   71:ldc1            #17  <String "isImportant">
	//   37   73:invokevirtual   #150 <Method boolean Bundle.getBoolean(String)>
	//   38   76:invokevirtual   #120 <Method Person$Builder Person$Builder.setImportant(boolean)>
	//   39   79:invokevirtual   #124 <Method Person Person$Builder.build()>
	//   40   82:areturn         
	}

	public IconCompat getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field IconCompat mIcon>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String mKey>
	//    2    4:areturn         
	}

	public CharSequence getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CharSequence mName>
	//    2    4:areturn         
	}

	public String getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String mUri>
	//    2    4:areturn         
	}

	public boolean isBot()
	{
		return mIsBot;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean mIsBot>
	//    2    4:ireturn         
	}

	public boolean isImportant()
	{
		return mIsImportant;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mIsImportant>
	//    2    4:ireturn         
	}

	public android.app.Person toAndroidPerson()
	{
		android.app.Builder builder = (new android.app.Builder()).setName(getName());
	//    0    0:new             #155 <Class android.app.Person$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #156 <Method void android.app.Person$Builder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #157 <Method CharSequence getName()>
	//    5   11:invokevirtual   #160 <Method android.app.Person$Builder android.app.Person$Builder.setName(CharSequence)>
	//    6   14:astore_2        
		android.graphics.drawable.Icon icon;
		if(getIcon() != null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #162 <Method IconCompat getIcon()>
	//*   9   19:ifnull          33
			icon = getIcon().toIcon();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #162 <Method IconCompat getIcon()>
	//   12   26:invokevirtual   #165 <Method android.graphics.drawable.Icon IconCompat.toIcon()>
	//   13   29:astore_1        
		else
	//*  14   30:goto            35
			icon = null;
	//   15   33:aconst_null     
	//   16   34:astore_1        
		return builder.setIcon(icon).setUri(getUri()).setKey(getKey()).setBot(isBot()).setImportant(isImportant()).build();
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #168 <Method android.app.Person$Builder android.app.Person$Builder.setIcon(android.graphics.drawable.Icon)>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #169 <Method String getUri()>
	//   22   44:invokevirtual   #172 <Method android.app.Person$Builder android.app.Person$Builder.setUri(String)>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #173 <Method String getKey()>
	//   25   51:invokevirtual   #175 <Method android.app.Person$Builder android.app.Person$Builder.setKey(String)>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #176 <Method boolean isBot()>
	//   28   58:invokevirtual   #179 <Method android.app.Person$Builder android.app.Person$Builder.setBot(boolean)>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #180 <Method boolean isImportant()>
	//   31   65:invokevirtual   #182 <Method android.app.Person$Builder android.app.Person$Builder.setImportant(boolean)>
	//   32   68:invokevirtual   #184 <Method android.app.Person android.app.Person$Builder.build()>
	//   33   71:areturn         
	}

	public Builder toBuilder()
	{
		return new Builder(this);
	//    0    0:new             #6   <Class Person$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #189 <Method void Person$Builder(Person)>
	//    4    8:areturn         
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #130 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putCharSequence("name", mName);
	//    4    8:aload_2         
	//    5    9:ldc1            #23  <String "name">
	//    6   11:aload_0         
	//    7   12:getfield        #44  <Field CharSequence mName>
	//    8   15:invokevirtual   #196 <Method void Bundle.putCharSequence(String, CharSequence)>
		Object obj = ((Object) (mIcon));
	//    9   18:aload_0         
	//   10   19:getfield        #47  <Field IconCompat mIcon>
	//   11   22:astore_1        
		if(obj != null)
	//*  12   23:aload_1         
	//*  13   24:ifnull          35
			obj = ((Object) (((IconCompat) (obj)).toBundle()));
	//   14   27:aload_1         
	//   15   28:invokevirtual   #198 <Method Bundle IconCompat.toBundle()>
	//   16   31:astore_1        
		else
	//*  17   32:goto            37
			obj = null;
	//   18   35:aconst_null     
	//   19   36:astore_1        
		bundle.putBundle("icon", ((Bundle) (obj)));
	//   20   37:aload_2         
	//   21   38:ldc1            #11  <String "icon">
	//   22   40:aload_1         
	//   23   41:invokevirtual   #202 <Method void Bundle.putBundle(String, Bundle)>
		bundle.putString("uri", mUri);
	//   24   44:aload_2         
	//   25   45:ldc1            #26  <String "uri">
	//   26   47:aload_0         
	//   27   48:getfield        #50  <Field String mUri>
	//   28   51:invokevirtual   #206 <Method void Bundle.putString(String, String)>
		bundle.putString("key", mKey);
	//   29   54:aload_2         
	//   30   55:ldc1            #20  <String "key">
	//   31   57:aload_0         
	//   32   58:getfield        #53  <Field String mKey>
	//   33   61:invokevirtual   #206 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("isBot", mIsBot);
	//   34   64:aload_2         
	//   35   65:ldc1            #14  <String "isBot">
	//   36   67:aload_0         
	//   37   68:getfield        #56  <Field boolean mIsBot>
	//   38   71:invokevirtual   #210 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("isImportant", mIsImportant);
	//   39   74:aload_2         
	//   40   75:ldc1            #17  <String "isImportant">
	//   41   77:aload_0         
	//   42   78:getfield        #59  <Field boolean mIsImportant>
	//   43   81:invokevirtual   #210 <Method void Bundle.putBoolean(String, boolean)>
		return bundle;
	//   44   84:aload_2         
	//   45   85:areturn         
	}

	private static final String ICON_KEY = "icon";
	private static final String IS_BOT_KEY = "isBot";
	private static final String IS_IMPORTANT_KEY = "isImportant";
	private static final String KEY_KEY = "key";
	private static final String NAME_KEY = "name";
	private static final String URI_KEY = "uri";
	IconCompat mIcon;
	boolean mIsBot;
	boolean mIsImportant;
	String mKey;
	CharSequence mName;
	String mUri;
}
