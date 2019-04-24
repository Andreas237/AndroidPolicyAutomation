// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpt, zzon

public final class zzoj extends zzpt
{

	public zzoj(String s, List list, Integer integer, Integer integer1, Integer integer2, int i, int j, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void zzpt()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void ArrayList()>
	//    6   12:putfield        #50  <Field List zzbhf>
	//    7   15:aload_0         
	//    8   16:new             #47  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void ArrayList()>
	//   11   23:putfield        #52  <Field List zzbhg>
		zzbhe = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #54  <Field String zzbhe>
		if(list != null)
	//*  15   31:aload_2         
	//*  16   32:ifnull          92
		{
			for(int k = 0; k < list.size(); k++)
	//*  17   35:iconst_0        
	//*  18   36:istore          9
	//*  19   38:iload           9
	//*  20   40:aload_2         
	//*  21   41:invokeinterface #60  <Method int List.size()>
	//*  22   46:icmpge          92
			{
				s = ((String) ((zzon)list.get(k)));
	//   23   49:aload_2         
	//   24   50:iload           9
	//   25   52:invokeinterface #64  <Method Object List.get(int)>
	//   26   57:checkcast       #66  <Class zzon>
	//   27   60:astore_1        
				zzbhf.add(((Object) (s)));
	//   28   61:aload_0         
	//   29   62:getfield        #50  <Field List zzbhf>
	//   30   65:aload_1         
	//   31   66:invokeinterface #70  <Method boolean List.add(Object)>
	//   32   71:pop             
				zzbhg.add(((Object) (s)));
	//   33   72:aload_0         
	//   34   73:getfield        #52  <Field List zzbhg>
	//   35   76:aload_1         
	//   36   77:invokeinterface #70  <Method boolean List.add(Object)>
	//   37   82:pop             
			}

	//   38   83:iload           9
	//   39   85:iconst_1        
	//   40   86:iadd            
	//   41   87:istore          9
		}
	//*  42   89:goto            38
		int l;
		if(integer != null)
	//*  43   92:aload_3         
	//*  44   93:ifnull          105
			l = integer.intValue();
	//   45   96:aload_3         
	//   46   97:invokevirtual   #75  <Method int Integer.intValue()>
	//   47  100:istore          9
		else
	//*  48  102:goto            110
			l = zzbhc;
	//   49  105:getstatic       #38  <Field int zzbhc>
	//   50  108:istore          9
		zzbhh = l;
	//   51  110:aload_0         
	//   52  111:iload           9
	//   53  113:putfield        #77  <Field int zzbhh>
		if(integer1 != null)
	//*  54  116:aload           4
	//*  55  118:ifnull          131
			l = integer1.intValue();
	//   56  121:aload           4
	//   57  123:invokevirtual   #75  <Method int Integer.intValue()>
	//   58  126:istore          9
		else
	//*  59  128:goto            136
			l = zzbhd;
	//   60  131:getstatic       #40  <Field int zzbhd>
	//   61  134:istore          9
		mTextColor = l;
	//   62  136:aload_0         
	//   63  137:iload           9
	//   64  139:putfield        #79  <Field int mTextColor>
		if(integer2 != null)
	//*  65  142:aload           5
	//*  66  144:ifnull          157
			l = integer2.intValue();
	//   67  147:aload           5
	//   68  149:invokevirtual   #75  <Method int Integer.intValue()>
	//   69  152:istore          9
		else
	//*  70  154:goto            161
			l = 12;
	//   71  157:bipush          12
	//   72  159:istore          9
		zzbhi = l;
	//   73  161:aload_0         
	//   74  162:iload           9
	//   75  164:putfield        #81  <Field int zzbhi>
		zzbhj = i;
	//   76  167:aload_0         
	//   77  168:iload           6
	//   78  170:putfield        #83  <Field int zzbhj>
		zzbhk = j;
	//   79  173:aload_0         
	//   80  174:iload           7
	//   81  176:putfield        #85  <Field int zzbhk>
		zzbhl = flag;
	//   82  179:aload_0         
	//   83  180:iload           8
	//   84  182:putfield        #87  <Field boolean zzbhl>
	//   85  185:return          
	}

	public final int getBackgroundColor()
	{
		return zzbhh;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int zzbhh>
	//    2    4:ireturn         
	}

	public final String getText()
	{
		return zzbhe;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String zzbhe>
	//    2    4:areturn         
	}

	public final int getTextColor()
	{
		return mTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int mTextColor>
	//    2    4:ireturn         
	}

	public final int getTextSize()
	{
		return zzbhi;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int zzbhi>
	//    2    4:ireturn         
	}

	public final List zzjr()
	{
		return zzbhg;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field List zzbhg>
	//    2    4:areturn         
	}

	public final List zzjs()
	{
		return zzbhf;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field List zzbhf>
	//    2    4:areturn         
	}

	public final int zzjt()
	{
		return zzbhj;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzbhj>
	//    2    4:ireturn         
	}

	public final int zzju()
	{
		return zzbhk;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int zzbhk>
	//    2    4:ireturn         
	}

	public final boolean zzjv()
	{
		return zzbhl;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean zzbhl>
	//    2    4:ireturn         
	}

	private static final int zzbha;
	private static final int zzbhb;
	private static final int zzbhc;
	private static final int zzbhd;
	private final int mTextColor;
	private final String zzbhe;
	private final List zzbhf = new ArrayList();
	private final List zzbhg = new ArrayList();
	private final int zzbhh;
	private final int zzbhi;
	private final int zzbhj;
	private final int zzbhk;
	private final boolean zzbhl;

	static 
	{
		zzbha = Color.rgb(12, 174, 206);
	//    0    0:bipush          12
	//    1    2:sipush          174
	//    2    5:sipush          206
	//    3    8:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//    4   11:putstatic       #34  <Field int zzbha>
		int i = Color.rgb(204, 204, 204);
	//    5   14:sipush          204
	//    6   17:sipush          204
	//    7   20:sipush          204
	//    8   23:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//    9   26:istore_0        
		zzbhb = i;
	//   10   27:iload_0         
	//   11   28:putstatic       #36  <Field int zzbhb>
		zzbhc = i;
	//   12   31:iload_0         
	//   13   32:putstatic       #38  <Field int zzbhc>
		zzbhd = zzbha;
	//   14   35:getstatic       #34  <Field int zzbha>
	//   15   38:putstatic       #40  <Field int zzbhd>
	//*  16   41:return          
	}
}
