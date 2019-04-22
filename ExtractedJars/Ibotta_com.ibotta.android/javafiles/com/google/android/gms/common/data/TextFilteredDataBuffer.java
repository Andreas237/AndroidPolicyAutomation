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
	//*   7   13:iflt            42
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #32  <Field ArrayList zzob>
	//*  11   21:invokevirtual   #87  <Method int ArrayList.size()>
	//*  12   24:icmpge          42
		{
			return ((Integer)zzob.get(i)).intValue();
	//   13   27:aload_0         
	//   14   28:getfield        #32  <Field ArrayList zzob>
	//   15   31:iload_1         
	//   16   32:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   17   35:checkcast       #93  <Class Integer>
	//   18   38:invokevirtual   #96  <Method int Integer.intValue()>
	//   19   41:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   20   42:new             #51  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:bipush          53
	//   23   48:invokespecial   #99  <Method void StringBuilder(int)>
	//   24   51:astore_2        
			stringbuilder.append("Position ");
	//   25   52:aload_2         
	//   26   53:ldc1            #101 <String "Position ">
	//   27   55:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(i);
	//   29   59:aload_2         
	//   30   60:iload_1         
	//   31   61:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   32   64:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   33   65:aload_2         
	//   34   66:ldc1            #109 <String " is out of bounds for this buffer">
	//   35   68:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   37   72:new             #111 <Class IllegalArgumentException>
	//   38   75:dup             
	//   39   76:aload_2         
	//   40   77:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   41   80:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   42   83:athrow          
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
	//*  12   22:ifne            189
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
			s = ((String) (zzoc));
	//   35   71:aload_0         
	//   36   72:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   37   75:astore_3        
			boolean flag = s instanceof EntityBuffer;
	//   38   76:aload_3         
	//   39   77:instanceof      #163 <Class EntityBuffer>
	//   40   80:istore          7
			int i = 0;
	//   41   82:iconst_0        
	//   42   83:istore          4
			for(int k = ((AbstractDataBuffer) (s)).getCount(); i < k; i++)
	//*  43   85:aload_3         
	//*  44   86:invokevirtual   #164 <Method int AbstractDataBuffer.getCount()>
	//*  45   89:istore          6
	//*  46   91:iload           4
	//*  47   93:iload           6
	//*  48   95:icmpge          188
			{
				int j;
				if(flag)
	//*  49   98:iload           7
	//*  50  100:ifeq            120
					j = ((EntityBuffer)zzoc).zzi(i);
	//   51  103:aload_0         
	//   52  104:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   53  107:checkcast       #163 <Class EntityBuffer>
	//   54  110:iload           4
	//   55  112:invokevirtual   #167 <Method int EntityBuffer.zzi(int)>
	//   56  115:istore          5
				else
	//*  57  117:goto            124
					j = i;
	//   58  120:iload           4
	//   59  122:istore          5
				s = ((DataHolder) (context)).getString(((String) (stringfilter)), j, ((DataHolder) (context)).getWindowIndex(j));
	//   60  124:aload_1         
	//   61  125:aload_2         
	//   62  126:iload           5
	//   63  128:aload_1         
	//   64  129:iload           5
	//   65  131:invokevirtual   #172 <Method int DataHolder.getWindowIndex(int)>
	//   66  134:invokevirtual   #176 <Method String DataHolder.getString(String, int, int)>
	//   67  137:astore_3        
				if(!TextUtils.isEmpty(((CharSequence) (s))) && zzoq.matches(zzh(s), zzop))
	//*  68  138:aload_3         
	//*  69  139:invokestatic    #84  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  142:ifne            179
	//*  71  145:aload_0         
	//*  72  146:getfield        #133 <Field TextFilterable$StringFilter zzoq>
	//*  73  149:aload_0         
	//*  74  150:aload_3         
	//*  75  151:invokespecial   #152 <Method String zzh(String)>
	//*  76  154:aload_0         
	//*  77  155:getfield        #78  <Field String zzop>
	//*  78  158:invokeinterface #182 <Method boolean TextFilterable$StringFilter.matches(String, String)>
	//*  79  163:ifeq            179
					zzob.add(((Object) (Integer.valueOf(i))));
	//   80  166:aload_0         
	//   81  167:getfield        #32  <Field ArrayList zzob>
	//   82  170:iload           4
	//   83  172:invokestatic    #186 <Method Integer Integer.valueOf(int)>
	//   84  175:invokevirtual   #190 <Method boolean ArrayList.add(Object)>
	//   85  178:pop             
			}

	//   86  179:iload           4
	//   87  181:iconst_1        
	//   88  182:iadd            
	//   89  183:istore          4
	//*  90  185:goto            91
			return;
	//   91  188:return          
		} else
		{
			zzob.clear();
	//   92  189:aload_0         
	//   93  190:getfield        #32  <Field ArrayList zzob>
	//   94  193:invokevirtual   #155 <Method void ArrayList.clear()>
			return;
	//   95  196:return          
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
