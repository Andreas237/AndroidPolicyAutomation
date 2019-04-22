// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import java.util.*;

// Referenced classes of package com.digits.sdk.android:
//			CountryInfo

class CountryListAdapter extends ArrayAdapter
	implements SectionIndexer
{

	public CountryListAdapter(Context context)
	{
		super(context, R.layout.dgts__country_row, 0x1020014);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #21  <Field int R$layout.dgts__country_row>
	//    3    5:ldc1            #22  <Int 0x1020014>
	//    4    7:invokespecial   #25  <Method void ArrayAdapter(Context, int, int)>
	//    5   10:aload_0         
	//    6   11:new             #27  <Class LinkedHashMap>
	//    7   14:dup             
	//    8   15:invokespecial   #30  <Method void LinkedHashMap()>
	//    9   18:putfield        #32  <Field HashMap alphaIndex>
	//   10   21:aload_0         
	//   11   22:new             #27  <Class LinkedHashMap>
	//   12   25:dup             
	//   13   26:invokespecial   #30  <Method void LinkedHashMap()>
	//   14   29:putfield        #34  <Field HashMap countryPosition>
	//   15   32:return          
	}

	public int getPositionForCountry(String s)
	{
		s = ((String) ((Integer)countryPosition.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field HashMap countryPosition>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #45  <Class Integer>
	//    5   11:astore_1        
		if(s == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		else
			return ((Integer) (s)).intValue();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #49  <Method int Integer.intValue()>
	//   12   22:ireturn         
	}

	public int getPositionForSection(int i)
	{
		String as[] = sections;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String[] sections>
	//    2    4:astore_3        
		if(as == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(i <= 0)
	//*   7   11:iload_1         
	//*   8   12:ifgt            17
			return 0;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		int j = i;
	//   11   17:iload_1         
	//   12   18:istore_2        
		if(i >= as.length)
	//*  13   19:iload_1         
	//*  14   20:aload_3         
	//*  15   21:arraylength     
	//*  16   22:icmplt          30
			j = as.length - 1;
	//   17   25:aload_3         
	//   18   26:arraylength     
	//   19   27:iconst_1        
	//   20   28:isub            
	//   21   29:istore_2        
		return ((Integer)alphaIndex.get(((Object) (sections[j])))).intValue();
	//   22   30:aload_0         
	//   23   31:getfield        #32  <Field HashMap alphaIndex>
	//   24   34:aload_0         
	//   25   35:getfield        #53  <Field String[] sections>
	//   26   38:iload_2         
	//   27   39:aaload          
	//   28   40:invokevirtual   #43  <Method Object HashMap.get(Object)>
	//   29   43:checkcast       #45  <Class Integer>
	//   30   46:invokevirtual   #49  <Method int Integer.intValue()>
	//   31   49:ireturn         
	}

	public int getSectionForPosition(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object[] getSections()
	{
		return ((Object []) (sections));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String[] sections>
	//    2    4:areturn         
	}

	public void setData(List list)
	{
		list = ((List) (list.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #64  <Method Iterator List.iterator()>
	//    2    6:astore_1        
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		CountryInfo countryinfo;
		for(; ((Iterator) (list)).hasNext(); add(((Object) (countryinfo))))
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*   7   15:ifeq            99
		{
			countryinfo = (CountryInfo)((Iterator) (list)).next();
	//    8   18:aload_1         
	//    9   19:invokeinterface #74  <Method Object Iterator.next()>
	//   10   24:checkcast       #76  <Class CountryInfo>
	//   11   27:astore_3        
			String s = countryinfo.country.substring(0, 1).toUpperCase(Locale.getDefault());
	//   12   28:aload_3         
	//   13   29:getfield        #80  <Field String CountryInfo.country>
	//   14   32:iconst_0        
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #86  <Method String String.substring(int, int)>
	//   17   37:invokestatic    #92  <Method Locale Locale.getDefault()>
	//   18   40:invokevirtual   #96  <Method String String.toUpperCase(Locale)>
	//   19   43:astore          4
			if(!alphaIndex.containsKey(((Object) (s))))
	//*  20   45:aload_0         
	//*  21   46:getfield        #32  <Field HashMap alphaIndex>
	//*  22   49:aload           4
	//*  23   51:invokevirtual   #100 <Method boolean HashMap.containsKey(Object)>
	//*  24   54:ifne            71
				alphaIndex.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//   25   57:aload_0         
	//   26   58:getfield        #32  <Field HashMap alphaIndex>
	//   27   61:aload           4
	//   28   63:iload_2         
	//   29   64:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   30   67:invokevirtual   #108 <Method Object HashMap.put(Object, Object)>
	//   31   70:pop             
			countryPosition.put(((Object) (countryinfo.country)), ((Object) (Integer.valueOf(i))));
	//   32   71:aload_0         
	//   33   72:getfield        #34  <Field HashMap countryPosition>
	//   34   75:aload_3         
	//   35   76:getfield        #80  <Field String CountryInfo.country>
	//   36   79:iload_2         
	//   37   80:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   38   83:invokevirtual   #108 <Method Object HashMap.put(Object, Object)>
	//   39   86:pop             
			i++;
	//   40   87:iload_2         
	//   41   88:iconst_1        
	//   42   89:iadd            
	//   43   90:istore_2        
		}

	//   44   91:aload_0         
	//   45   92:aload_3         
	//   46   93:invokevirtual   #112 <Method void add(Object)>
	//*  47   96:goto            9
		sections = new String[alphaIndex.size()];
	//   48   99:aload_0         
	//   49  100:aload_0         
	//   50  101:getfield        #32  <Field HashMap alphaIndex>
	//   51  104:invokevirtual   #115 <Method int HashMap.size()>
	//   52  107:anewarray       String[]
	//   53  110:putfield        #53  <Field String[] sections>
		alphaIndex.keySet().toArray(((Object []) (sections)));
	//   54  113:aload_0         
	//   55  114:getfield        #32  <Field HashMap alphaIndex>
	//   56  117:invokevirtual   #119 <Method Set HashMap.keySet()>
	//   57  120:aload_0         
	//   58  121:getfield        #53  <Field String[] sections>
	//   59  124:invokeinterface #125 <Method Object[] Set.toArray(Object[])>
	//   60  129:pop             
		notifyDataSetChanged();
	//   61  130:aload_0         
	//   62  131:invokevirtual   #128 <Method void notifyDataSetChanged()>
	//   63  134:return          
	}

	private final HashMap alphaIndex = new LinkedHashMap();
	private final HashMap countryPosition = new LinkedHashMap();
	private String sections[];
}
