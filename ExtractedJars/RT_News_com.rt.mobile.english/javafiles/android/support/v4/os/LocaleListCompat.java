// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.LocaleList;
import java.util.Locale;

// Referenced classes of package android.support.v4.os:
//			LocaleHelper, LocaleListInterface, LocaleListHelper

public final class LocaleListCompat
{
	static class LocaleListCompatApi24Impl
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

		LocaleListCompatApi24Impl()
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

	static class LocaleListCompatBaseImpl
		implements LocaleListInterface
	{

		public boolean equals(Object obj)
		{
			return mLocaleList.equals(((LocaleListCompat)obj).unwrap());
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:aload_1         
		//    3    5:checkcast       #8   <Class LocaleListCompat>
		//    4    8:invokevirtual   #31  <Method Object LocaleListCompat.unwrap()>
		//    5   11:invokevirtual   #33  <Method boolean LocaleListHelper.equals(Object)>
		//    6   14:ireturn         
		}

		public Locale get(int i)
		{
			return mLocaleList.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #37  <Method Locale LocaleListHelper.get(int)>
		//    4    8:areturn         
		}

		public Locale getFirstMatch(String as[])
		{
			if(mLocaleList != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//*   2    4:ifnull          16
				return mLocaleList.getFirstMatch(as);
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #42  <Method Locale LocaleListHelper.getFirstMatch(String[])>
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
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return mLocaleList.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:invokevirtual   #48  <Method int LocaleListHelper.hashCode()>
		//    3    7:ireturn         
		}

		public int indexOf(Locale locale)
		{
			return mLocaleList.indexOf(locale);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #56  <Method int LocaleListHelper.indexOf(Locale)>
		//    4    8:ireturn         
		}

		public boolean isEmpty()
		{
			return mLocaleList.isEmpty();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:invokevirtual   #60  <Method boolean LocaleListHelper.isEmpty()>
		//    3    7:ireturn         
		}

		public transient void setLocaleList(Locale alocale[])
		{
			mLocaleList = new LocaleListHelper(alocale);
		//    0    0:aload_0         
		//    1    1:new             #17  <Class LocaleListHelper>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #22  <Method void LocaleListHelper(Locale[])>
		//    5    9:putfield        #24  <Field LocaleListHelper mLocaleList>
		//    6   12:return          
		}

		public int size()
		{
			return mLocaleList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:invokevirtual   #68  <Method int LocaleListHelper.size()>
		//    3    7:ireturn         
		}

		public String toLanguageTags()
		{
			return mLocaleList.toLanguageTags();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:invokevirtual   #72  <Method String LocaleListHelper.toLanguageTags()>
		//    3    7:areturn         
		}

		public String toString()
		{
			return mLocaleList.toString();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LocaleListHelper mLocaleList>
		//    2    4:invokevirtual   #75  <Method String LocaleListHelper.toString()>
		//    3    7:areturn         
		}

		private LocaleListHelper mLocaleList;

		LocaleListCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			mLocaleList = new LocaleListHelper(new Locale[0]);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class LocaleListHelper>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:anewarray       Locale[]
		//    7   13:invokespecial   #22  <Method void LocaleListHelper(Locale[])>
		//    8   16:putfield        #24  <Field LocaleListHelper mLocaleList>
		//    9   19:return          
		}
	}


	private LocaleListCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static transient LocaleListCompat create(Locale alocale[])
	{
		LocaleListCompat localelistcompat = new LocaleListCompat();
	//    0    0:new             #2   <Class LocaleListCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void LocaleListCompat()>
	//    3    7:astore_1        
		localelistcompat.setLocaleListArray(alocale);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #40  <Method void setLocaleListArray(Locale[])>
		return localelistcompat;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static LocaleListCompat forLanguageTags(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          86
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #50  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            86
		{
			String as[] = s.split(",");
	//    6   14:aload_0         
	//    7   15:ldc1            #52  <String ",">
	//    8   17:invokevirtual   #56  <Method String[] String.split(String)>
	//    9   20:astore_3        
			Locale alocale[] = new Locale[as.length];
	//   10   21:aload_3         
	//   11   22:arraylength     
	//   12   23:anewarray       Locale[]
	//   13   26:astore_2        
			for(int i = 0; i < alocale.length; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_1        
	//*  16   29:iload_1         
	//*  17   30:aload_2         
	//*  18   31:arraylength     
	//*  19   32:icmpge          71
			{
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  20   35:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   38:bipush          21
	//*  22   40:icmplt          53
					s = ((String) (Locale.forLanguageTag(as[i])));
	//   23   43:aload_3         
	//   24   44:iload_1         
	//   25   45:aaload          
	//   26   46:invokestatic    #62  <Method Locale Locale.forLanguageTag(String)>
	//   27   49:astore_0        
				else
	//*  28   50:goto            60
					s = ((String) (LocaleHelper.forLanguageTag(as[i])));
	//   29   53:aload_3         
	//   30   54:iload_1         
	//   31   55:aaload          
	//   32   56:invokestatic    #65  <Method Locale LocaleHelper.forLanguageTag(String)>
	//   33   59:astore_0        
				alocale[i] = ((Locale) (s));
	//   34   60:aload_2         
	//   35   61:iload_1         
	//   36   62:aload_0         
	//   37   63:aastore         
			}

	//   38   64:iload_1         
	//   39   65:iconst_1        
	//   40   66:iadd            
	//   41   67:istore_1        
	//*  42   68:goto            29
			s = ((String) (new LocaleListCompat()));
	//   43   71:new             #2   <Class LocaleListCompat>
	//   44   74:dup             
	//   45   75:invokespecial   #19  <Method void LocaleListCompat()>
	//   46   78:astore_0        
			((LocaleListCompat) (s)).setLocaleListArray(alocale);
	//   47   79:aload_0         
	//   48   80:aload_2         
	//   49   81:invokespecial   #40  <Method void setLocaleListArray(Locale[])>
			return ((LocaleListCompat) (s));
	//   50   84:aload_0         
	//   51   85:areturn         
		} else
		{
			return getEmptyLocaleList();
	//   52   86:invokestatic    #69  <Method LocaleListCompat getEmptyLocaleList()>
	//   53   89:areturn         
		}
	}

	public static LocaleListCompat getAdjustedDefault()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          15
			return wrap(((Object) (LocaleList.getAdjustedDefault())));
	//    3    8:invokestatic    #80  <Method LocaleList LocaleList.getAdjustedDefault()>
	//    4   11:invokestatic    #84  <Method LocaleListCompat wrap(Object)>
	//    5   14:areturn         
		else
			return create(new Locale[] {
				Locale.getDefault()
			});
	//    6   15:iconst_1        
	//    7   16:anewarray       Locale[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:invokestatic    #88  <Method Locale Locale.getDefault()>
	//   11   24:aastore         
	//   12   25:invokestatic    #90  <Method LocaleListCompat create(Locale[])>
	//   13   28:areturn         
	}

	public static LocaleListCompat getDefault()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          15
			return wrap(((Object) (LocaleList.getDefault())));
	//    3    8:invokestatic    #92  <Method LocaleList LocaleList.getDefault()>
	//    4   11:invokestatic    #84  <Method LocaleListCompat wrap(Object)>
	//    5   14:areturn         
		else
			return create(new Locale[] {
				Locale.getDefault()
			});
	//    6   15:iconst_1        
	//    7   16:anewarray       Locale[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:invokestatic    #88  <Method Locale Locale.getDefault()>
	//   11   24:aastore         
	//   12   25:invokestatic    #90  <Method LocaleListCompat create(Locale[])>
	//   13   28:areturn         
	}

	public static LocaleListCompat getEmptyLocaleList()
	{
		return sEmptyLocaleList;
	//    0    0:getstatic       #21  <Field LocaleListCompat sEmptyLocaleList>
	//    1    3:areturn         
	}

	private void setLocaleList(LocaleList localelist)
	{
		int j = localelist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method int LocaleList.size()>
	//    2    4:istore_3        
		if(j > 0)
	//*   3    5:iload_3         
	//*   4    6:ifle            48
		{
			Locale alocale[] = new Locale[j];
	//    5    9:iload_3         
	//    6   10:anewarray       Locale[]
	//    7   13:astore          4
			for(int i = 0; i < j; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_2        
	//*  10   17:iload_2         
	//*  11   18:iload_3         
	//*  12   19:icmpge          38
				alocale[i] = localelist.get(i);
	//   13   22:aload           4
	//   14   24:iload_2         
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #105 <Method Locale LocaleList.get(int)>
	//   18   30:aastore         

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            17
			IMPL.setLocaleList(alocale);
	//   24   38:getstatic       #30  <Field LocaleListInterface IMPL>
	//   25   41:aload           4
	//   26   43:invokeinterface #109 <Method void LocaleListInterface.setLocaleList(Locale[])>
		}
	//   27   48:return          
	}

	private transient void setLocaleListArray(Locale alocale[])
	{
		IMPL.setLocaleList(alocale);
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #109 <Method void LocaleListInterface.setLocaleList(Locale[])>
	//    3    9:return          
	}

	public static LocaleListCompat wrap(Object obj)
	{
		LocaleListCompat localelistcompat = new LocaleListCompat();
	//    0    0:new             #2   <Class LocaleListCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void LocaleListCompat()>
	//    3    7:astore_1        
		if(obj instanceof LocaleList)
	//*   4    8:aload_0         
	//*   5    9:instanceof      #77  <Class LocaleList>
	//*   6   12:ifeq            23
			localelistcompat.setLocaleList((LocaleList)obj);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:checkcast       #77  <Class LocaleList>
	//   10   20:invokespecial   #111 <Method void setLocaleList(LocaleList)>
		return localelistcompat;
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public boolean equals(Object obj)
	{
		return IMPL.equals(obj);
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #115 <Method boolean LocaleListInterface.equals(Object)>
	//    3    9:ireturn         
	}

	public Locale get(int i)
	{
		return IMPL.get(i);
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:iload_1         
	//    2    4:invokeinterface #116 <Method Locale LocaleListInterface.get(int)>
	//    3    9:areturn         
	}

	public Locale getFirstMatch(String as[])
	{
		return IMPL.getFirstMatch(as);
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #120 <Method Locale LocaleListInterface.getFirstMatch(String[])>
	//    3    9:areturn         
	}

	public int hashCode()
	{
		return IMPL.hashCode();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #123 <Method int LocaleListInterface.hashCode()>
	//    2    8:ireturn         
	}

	public int indexOf(Locale locale)
	{
		return IMPL.indexOf(locale);
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #131 <Method int LocaleListInterface.indexOf(Locale)>
	//    3    9:ireturn         
	}

	public boolean isEmpty()
	{
		return IMPL.isEmpty();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #132 <Method boolean LocaleListInterface.isEmpty()>
	//    2    8:ireturn         
	}

	public int size()
	{
		return IMPL.size();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #135 <Method int LocaleListInterface.size()>
	//    2    8:ireturn         
	}

	public String toLanguageTags()
	{
		return IMPL.toLanguageTags();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #139 <Method String LocaleListInterface.toLanguageTags()>
	//    2    8:areturn         
	}

	public String toString()
	{
		return IMPL.toString();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #142 <Method String LocaleListInterface.toString()>
	//    2    8:areturn         
	}

	public Object unwrap()
	{
		return IMPL.getLocaleList();
	//    0    0:getstatic       #30  <Field LocaleListInterface IMPL>
	//    1    3:invokeinterface #147 <Method Object LocaleListInterface.getLocaleList()>
	//    2    8:areturn         
	}

	static final LocaleListInterface IMPL;
	private static final LocaleListCompat sEmptyLocaleList = new LocaleListCompat();

	static 
	{
	//    0    0:new             #2   <Class LocaleListCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void LocaleListCompat()>
	//    3    7:putstatic       #21  <Field LocaleListCompat sEmptyLocaleList>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   4   10:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          24
	//*   6   15:icmplt          29
			IMPL = ((LocaleListInterface) (new LocaleListCompatApi24Impl()));
	//    7   18:new             #6   <Class LocaleListCompat$LocaleListCompatApi24Impl>
	//    8   21:dup             
	//    9   22:invokespecial   #28  <Method void LocaleListCompat$LocaleListCompatApi24Impl()>
	//   10   25:putstatic       #30  <Field LocaleListInterface IMPL>
	//   11   28:return          
		else
			IMPL = ((LocaleListInterface) (new LocaleListCompatBaseImpl()));
	//   12   29:new             #9   <Class LocaleListCompat$LocaleListCompatBaseImpl>
	//   13   32:dup             
	//   14   33:invokespecial   #31  <Method void LocaleListCompat$LocaleListCompatBaseImpl()>
	//   15   36:putstatic       #30  <Field LocaleListInterface IMPL>
	//*  16   39:return          
	}
}
