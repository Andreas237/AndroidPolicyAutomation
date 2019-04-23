// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.support.v4.graphics.drawable.IconCompat;

// Referenced classes of package android.support.v4.app:
//			Person

public static class Person$Builder
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

	public Person$Builder setBot(boolean flag)
	{
		mIsBot = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mIsBot>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Person$Builder setIcon(IconCompat iconcompat)
	{
		mIcon = iconcompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field IconCompat mIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Person$Builder setImportant(boolean flag)
	{
		mIsImportant = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field boolean mIsImportant>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Person$Builder setKey(String s)
	{
		mKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field String mKey>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Person$Builder setName(CharSequence charsequence)
	{
		mName = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field CharSequence mName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Person$Builder setUri(String s)
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

	public Person$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	Person$Builder(Person person)
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
