// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.LocaleList;
import java.util.Locale;

// Referenced classes of package android.support.v4.os:
//			LocaleListInterface, LocaleListCompat

static class LocaleListCompat$LocaleListCompatApi24Impl
	implements LocaleListInterface
{

	public boolean equals(Object obj)
	{
		return mLocaleList.equals(((LocaleListCompat)obj).unwrap());
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:aload_1         
	//    3    5:checkcast       #8   <Class LocaleListCompat>
	//    4    8:invokevirtual   #34  <Method Object LocaleListCompat.unwrap()>
	//    5   11:invokevirtual   #36  <Method boolean LocaleList.equals(Object)>
	//    6   14:ireturn         
	}

	public Locale get(int i)
	{
		return mLocaleList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #40  <Method Locale LocaleList.get(int)>
	//    4    8:areturn         
	}

	public Locale getFirstMatch(String as[])
	{
		if(mLocaleList != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field LocaleList mLocaleList>
	//*   2    4:ifnull          16
			return mLocaleList.getFirstMatch(as);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field LocaleList mLocaleList>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method Locale LocaleList.getFirstMatch(String[])>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public Object getLocaleList()
	{
		return ((Object) (mLocaleList));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return mLocaleList.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:invokevirtual   #51  <Method int LocaleList.hashCode()>
	//    3    7:ireturn         
	}

	public int indexOf(Locale locale)
	{
		return mLocaleList.indexOf(locale);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method int LocaleList.indexOf(Locale)>
	//    4    8:ireturn         
	}

	public boolean isEmpty()
	{
		return mLocaleList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:invokevirtual   #63  <Method boolean LocaleList.isEmpty()>
	//    3    7:ireturn         
	}

	public transient void setLocaleList(Locale alocale[])
	{
		mLocaleList = new LocaleList(alocale);
	//    0    0:aload_0         
	//    1    1:new             #20  <Class LocaleList>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #25  <Method void LocaleList(Locale[])>
	//    5    9:putfield        #27  <Field LocaleList mLocaleList>
	//    6   12:return          
	}

	public int size()
	{
		return mLocaleList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:invokevirtual   #71  <Method int LocaleList.size()>
	//    3    7:ireturn         
	}

	public String toLanguageTags()
	{
		return mLocaleList.toLanguageTags();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:invokevirtual   #75  <Method String LocaleList.toLanguageTags()>
	//    3    7:areturn         
	}

	public String toString()
	{
		return mLocaleList.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LocaleList mLocaleList>
	//    2    4:invokevirtual   #78  <Method String LocaleList.toString()>
	//    3    7:areturn         
	}

	private LocaleList mLocaleList;

	LocaleListCompat$LocaleListCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mLocaleList = new LocaleList(new Locale[0]);
	//    2    4:aload_0         
	//    3    5:new             #20  <Class LocaleList>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:anewarray       Locale[]
	//    7   13:invokespecial   #25  <Method void LocaleList(Locale[])>
	//    8   16:putfield        #27  <Field LocaleList mLocaleList>
	//    9   19:return          
	}
}
