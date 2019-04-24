// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.common.data:
//			FilteredDataBuffer, TextFilterable, DataBuffer, AbstractDataBuffer, 
//			EntityBuffer, DataHolder

public final class TextFilteredDataBuffer extends FilteredDataBuffer
	implements TextFilterable
{

	public TextFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer, String s)
	{
		super(((DataBuffer) (abstractdatabuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void FilteredDataBuffer(DataBuffer)>
	//    3    5:aload_0         
	//    4    6:new             #27  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #30  <Method void ArrayList()>
	//    7   13:putfield        #32  <Field ArrayList zzob>
		zzoc = abstractdatabuffer;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #34  <Field AbstractDataBuffer zzoc>
		zzoo = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #36  <Field String zzoo>
	//   14   26:return          
	}

	private final String zzh(String s)
	{
		s = s.toLowerCase(zzor);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field Locale zzor>
	//    3    5:invokevirtual   #49  <Method String String.toLowerCase(Locale)>
	//    4    8:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #51  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #52  <Method void StringBuilder()>
	//    8   16:astore          4
		int j = s.length();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #56  <Method int String.length()>
	//   11   22:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:iload_3         
	//*  16   27:icmpge          59
			if(!Character.isIdentifierIgnorable(s.charAt(i)))
	//*  17   30:aload_1         
	//*  18   31:iload_2         
	//*  19   32:invokevirtual   #60  <Method char String.charAt(int)>
	//*  20   35:invokestatic    #66  <Method boolean Character.isIdentifierIgnorable(char)>
	//*  21   38:ifne            52
				stringbuilder.append(s.charAt(i));
	//   22   41:aload           4
	//   23   43:aload_1         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #60  <Method char String.charAt(int)>
	//   26   48:invokevirtual   #70  <Method StringBuilder StringBuilder.append(char)>
	//   27   51:pop             

	//   28   52:iload_2         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_2        
	//*  32   56:goto            25
		return stringbuilder.toString();
	//   33   59:aload           4
	//   34   61:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   35   64:areturn         
	}

	public final int computeRealPosition(int i)
	{
		if(TextUtils.isEmpty(((CharSequence) (zzop))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field String zzop>
	//*   2    4:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            12
			return i;
	//    4   10:iload_1         
	//    5   11:ireturn         
		if(i >= 0 && i < zzob.size())
	//*   6   12:iload_1         
	//*   7   13:iflt            45
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #32  <Field ArrayList zzob>
	//*  11   21:invokevirtual   #87  <Method int ArrayList.size()>
	//*  12   24:icmplt          30
	//*  13   27:goto            45
		{
			return ((Integer)zzob.get(i)).intValue();
	//   14   30:aload_0         
	//   15   31:getfield        #32  <Field ArrayList zzob>
	//   16   34:iload_1         
	//   17   35:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   18   38:checkcast       #93  <Class Integer>
	//   19   41:invokevirtual   #96  <Method int Integer.intValue()>
	//   20   44:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   21   45:new             #51  <Class StringBuilder>
	//   22   48:dup             
	//   23   49:bipush          53
	//   24   51:invokespecial   #99  <Method void StringBuilder(int)>
	//   25   54:astore_2        
			stringbuilder.append("Position ");
	//   26   55:aload_2         
	//   27   56:ldc1            #101 <String "Position ">
	//   28   58:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(i);
	//   30   62:aload_2         
	//   31   63:iload_1         
	//   32   64:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   33   67:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   34   68:aload_2         
	//   35   69:ldc1            #109 <String " is out of bounds for this buffer">
	//   36   71:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   38   75:new             #111 <Class IllegalArgumentException>
	//   39   78:dup             
	//   40   79:aload_2         
	//   41   80:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   42   83:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   43   86:athrow          
		}
	}

	public final int getCount()
	{
		if(TextUtils.isEmpty(((CharSequence) (zzop))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field String zzop>
	//*   2    4:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            20
			return mDataBuffer.getCount();
	//    4   10:aload_0         
	//    5   11:getfield        #119 <Field DataBuffer mDataBuffer>
	//    6   14:invokeinterface #123 <Method int DataBuffer.getCount()>
	//    7   19:ireturn         
		else
			return zzob.size();
	//    8   20:aload_0         
	//    9   21:getfield        #32  <Field ArrayList zzob>
	//   10   24:invokevirtual   #87  <Method int ArrayList.size()>
	//   11   27:ireturn         
	}

	public final void setFilterTerm(Context context, TextFilterable.StringFilter stringfilter, String s)
	{
		Preconditions.checkNotNull(((Object) (stringfilter)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #131 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zzop = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #78  <Field String zzop>
		zzoq = stringfilter;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #133 <Field TextFilterable$StringFilter zzoq>
		if(!TextUtils.isEmpty(((CharSequence) (zzop))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #78  <Field String zzop>
	//*  11   19:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   22:ifne            190
		{
			zzor = context.getResources().getConfiguration().locale;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #139 <Method Resources Context.getResources()>
	//   16   30:invokevirtual   #145 <Method Configuration Resources.getConfiguration()>
	//   17   33:getfield        #150 <Field Locale Configuration.locale>
	//   18   36:putfield        #43  <Field Locale zzor>
			zzop = zzh(zzop);
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field String zzop>
	//   23   45:invokespecial   #152 <Method String zzh(String)>
	//   24   48:putfield        #78  <Field String zzop>
			zzob.clear();
	//   25   51:aload_0         
	//   26   52:getfield        #32  <Field ArrayList zzob>
	//   27   55:invokevirtual   #155 <Method void ArrayList.clear()>
			context = ((Context) (zzoc.mDataHolder));
	//   28   58:aload_0         
	//   29   59:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   30   62:getfield        #161 <Field DataHolder AbstractDataBuffer.mDataHolder>
	//   31   65:astore_1        
			stringfilter = ((TextFilterable.StringFilter) (zzoo));
	//   32   66:aload_0         
	//   33   67:getfield        #36  <Field String zzoo>
	//   34   70:astore_2        
			boolean flag = zzoc instanceof EntityBuffer;
	//   35   71:aload_0         
	//   36   72:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   37   75:instanceof      #163 <Class EntityBuffer>
	//   38   78:istore          7
			int i = 0;
	//   39   80:iconst_0        
	//   40   81:istore          4
			for(int k = zzoc.getCount(); i < k; i++)
	//*  41   83:aload_0         
	//*  42   84:getfield        #34  <Field AbstractDataBuffer zzoc>
	//*  43   87:invokevirtual   #164 <Method int AbstractDataBuffer.getCount()>
	//*  44   90:istore          6
	//*  45   92:iload           4
	//*  46   94:iload           6
	//*  47   96:icmpge          189
			{
				int j;
				if(flag)
	//*  48   99:iload           7
	//*  49  101:ifeq            121
					j = ((EntityBuffer)zzoc).zzi(i);
	//   50  104:aload_0         
	//   51  105:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   52  108:checkcast       #163 <Class EntityBuffer>
	//   53  111:iload           4
	//   54  113:invokevirtual   #167 <Method int EntityBuffer.zzi(int)>
	//   55  116:istore          5
				else
	//*  56  118:goto            125
					j = i;
	//   57  121:iload           4
	//   58  123:istore          5
				s = ((DataHolder) (context)).getString(((String) (stringfilter)), j, ((DataHolder) (context)).getWindowIndex(j));
	//   59  125:aload_1         
	//   60  126:aload_2         
	//   61  127:iload           5
	//   62  129:aload_1         
	//   63  130:iload           5
	//   64  132:invokevirtual   #172 <Method int DataHolder.getWindowIndex(int)>
	//   65  135:invokevirtual   #176 <Method String DataHolder.getString(String, int, int)>
	//   66  138:astore_3        
				if(!TextUtils.isEmpty(((CharSequence) (s))) && zzoq.matches(zzh(s), zzop))
	//*  67  139:aload_3         
	//*  68  140:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  69  143:ifne            180
	//*  70  146:aload_0         
	//*  71  147:getfield        #133 <Field TextFilterable$StringFilter zzoq>
	//*  72  150:aload_0         
	//*  73  151:aload_3         
	//*  74  152:invokespecial   #152 <Method String zzh(String)>
	//*  75  155:aload_0         
	//*  76  156:getfield        #78  <Field String zzop>
	//*  77  159:invokeinterface #182 <Method boolean TextFilterable$StringFilter.matches(String, String)>
	//*  78  164:ifeq            180
					zzob.add(((Object) (Integer.valueOf(i))));
	//   79  167:aload_0         
	//   80  168:getfield        #32  <Field ArrayList zzob>
	//   81  171:iload           4
	//   82  173:invokestatic    #186 <Method Integer Integer.valueOf(int)>
	//   83  176:invokevirtual   #190 <Method boolean ArrayList.add(Object)>
	//   84  179:pop             
			}

	//   85  180:iload           4
	//   86  182:iconst_1        
	//   87  183:iadd            
	//   88  184:istore          4
	//*  89  186:goto            92
			return;
	//   90  189:return          
		} else
		{
			zzob.clear();
	//   91  190:aload_0         
	//   92  191:getfield        #32  <Field ArrayList zzob>
	//   93  194:invokevirtual   #155 <Method void ArrayList.clear()>
			return;
	//   94  197:return          
		}
	}

	public final void setFilterTerm(Context context, String s)
	{
		setFilterTerm(context, CONTAINS, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #195 <Field TextFilterable$StringFilter CONTAINS>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #197 <Method void setFilterTerm(Context, TextFilterable$StringFilter, String)>
	//    5    9:return          
	}

	private final ArrayList zzob = new ArrayList();
	private AbstractDataBuffer zzoc;
	private final String zzoo;
	private String zzop;
	private TextFilterable.StringFilter zzoq;
	private Locale zzor;
}
