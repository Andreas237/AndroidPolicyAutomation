// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import java.util.List;
import java.util.Set;

public class l
	implements AdsRenderingSettings
{

	public l()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		a = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #33  <Field int a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #35  <Field List b>
		e = -1D;
	//    8   14:aload_0         
	//    9   15:ldc2w           #36  <Double -1D>
	//   10   18:putfield        #39  <Field double e>
		f = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #41  <Field int f>
		g = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #43  <Field boolean g>
	//   17   31:return          
	}

	public int getBitrateKbps()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int a>
	//    2    4:ireturn         
	}

	public boolean getEnablePreloading()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean d>
	//    2    4:ireturn         
	}

	public List getMimeTypes()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List b>
	//    2    4:areturn         
	}

	public boolean isRenderCompanions()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean g>
	//    2    4:ireturn         
	}

	public void setBitrateKbps(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int a>
	//    3    5:return          
	}

	public void setEnablePreloading(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean d>
	//    3    5:return          
	}

	public void setMimeTypes(List list)
	{
		b = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field List b>
	//    3    5:return          
	}

	public void setPlayAdsAfterTime(double d1)
	{
		e = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #39  <Field double e>
	//    3    5:return          
	}

	public void setRenderCompanions(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean g>
	//    3    5:return          
	}

	public void setUiElements(Set set)
	{
		c = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field Set c>
	//    3    5:return          
	}

	public String toString()
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int a>
	//    2    4:istore_3        
		String s = String.valueOf(((Object) (b)));
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field List b>
	//    5    9:invokestatic    #78  <Method String String.valueOf(Object)>
	//    6   12:astore          5
		String s1 = String.valueOf(((Object) (c)));
	//    7   14:aload_0         
	//    8   15:getfield        #69  <Field Set c>
	//    9   18:invokestatic    #78  <Method String String.valueOf(Object)>
	//   10   21:astore          6
		boolean flag = d;
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field boolean d>
	//   13   27:istore          4
		double d1 = e;
	//   14   29:aload_0         
	//   15   30:getfield        #39  <Field double e>
	//   16   33:dstore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 134 + String.valueOf(((Object) (s1))).length());
	//   17   34:new             #80  <Class StringBuilder>
	//   18   37:dup             
	//   19   38:aload           5
	//   20   40:invokestatic    #78  <Method String String.valueOf(Object)>
	//   21   43:invokevirtual   #83  <Method int String.length()>
	//   22   46:sipush          134
	//   23   49:iadd            
	//   24   50:aload           6
	//   25   52:invokestatic    #78  <Method String String.valueOf(Object)>
	//   26   55:invokevirtual   #83  <Method int String.length()>
	//   27   58:iadd            
	//   28   59:invokespecial   #85  <Method void StringBuilder(int)>
	//   29   62:astore          7
		stringbuilder.append("AdsRenderingSettings [bitrate=");
	//   30   64:aload           7
	//   31   66:ldc1            #87  <String "AdsRenderingSettings [bitrate=">
	//   32   68:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
		stringbuilder.append(i);
	//   34   72:aload           7
	//   35   74:iload_3         
	//   36   75:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   37   78:pop             
		stringbuilder.append(", mimeTypes=");
	//   38   79:aload           7
	//   39   81:ldc1            #96  <String ", mimeTypes=">
	//   40   83:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   41   86:pop             
		stringbuilder.append(s);
	//   42   87:aload           7
	//   43   89:aload           5
	//   44   91:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   45   94:pop             
		stringbuilder.append(", uiElements=");
	//   46   95:aload           7
	//   47   97:ldc1            #98  <String ", uiElements=">
	//   48   99:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
		stringbuilder.append(s1);
	//   50  103:aload           7
	//   51  105:aload           6
	//   52  107:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   53  110:pop             
		stringbuilder.append(", enablePreloading=");
	//   54  111:aload           7
	//   55  113:ldc1            #100 <String ", enablePreloading=">
	//   56  115:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   57  118:pop             
		stringbuilder.append(flag);
	//   58  119:aload           7
	//   59  121:iload           4
	//   60  123:invokevirtual   #103 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  126:pop             
		stringbuilder.append(", playAdsAfterTime=");
	//   62  127:aload           7
	//   63  129:ldc1            #105 <String ", playAdsAfterTime=">
	//   64  131:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   65  134:pop             
		stringbuilder.append(d1);
	//   66  135:aload           7
	//   67  137:dload_1         
	//   68  138:invokevirtual   #108 <Method StringBuilder StringBuilder.append(double)>
	//   69  141:pop             
		stringbuilder.append("]");
	//   70  142:aload           7
	//   71  144:ldc1            #110 <String "]">
	//   72  146:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   73  149:pop             
		return stringbuilder.toString();
	//   74  150:aload           7
	//   75  152:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   76  155:areturn         
	}

	private int a;
	private List b;
	private Set c;
	private boolean d;
	private double e;
	private int f;
	private boolean g;
}
