// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


public final class ImaSdkSettings
{

	public ImaSdkSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		numRedirects = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #23  <Field int numRedirects>
		onScreenDetection = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #25  <Field boolean onScreenDetection>
		autoPlayAdBreaks = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #27  <Field boolean autoPlayAdBreaks>
		language = "en";
	//   11   19:aload_0         
	//   12   20:ldc1            #29  <String "en">
	//   13   22:putfield        #31  <Field String language>
	//   14   25:return          
	}

	public boolean doesRestrictToCustomPlayer()
	{
		return restrictToCustomPlayer;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean restrictToCustomPlayer>
	//    2    4:ireturn         
	}

	public boolean getAutoPlayAdBreaks()
	{
		return autoPlayAdBreaks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean autoPlayAdBreaks>
	//    2    4:ireturn         
	}

	public String getLanguage()
	{
		return language;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String language>
	//    2    4:areturn         
	}

	public int getMaxRedirects()
	{
		return numRedirects;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int numRedirects>
	//    2    4:ireturn         
	}

	public String getPlayerType()
	{
		return playerType;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String playerType>
	//    2    4:areturn         
	}

	public String getPlayerVersion()
	{
		return playerVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String playerVersion>
	//    2    4:areturn         
	}

	public String getPpid()
	{
		return ppid;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String ppid>
	//    2    4:areturn         
	}

	public void setAutoPlayAdBreaks(boolean flag)
	{
		autoPlayAdBreaks = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean autoPlayAdBreaks>
	//    3    5:return          
	}

	public void setLanguage(String s)
	{
		language = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String language>
	//    3    5:return          
	}

	public void setMaxRedirects(int i)
	{
		numRedirects = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int numRedirects>
	//    3    5:return          
	}

	public void setPlayerType(String s)
	{
		playerType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String playerType>
	//    3    5:return          
	}

	public void setPlayerVersion(String s)
	{
		playerVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String playerVersion>
	//    3    5:return          
	}

	public void setPpid(String s)
	{
		ppid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String ppid>
	//    3    5:return          
	}

	public void setRestrictToCustomPlayer(boolean flag)
	{
		restrictToCustomPlayer = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean restrictToCustomPlayer>
	//    3    5:return          
	}

	public String toString()
	{
		String s = ppid;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String ppid>
	//    2    4:astore          5
		int i = numRedirects;
	//    3    6:aload_0         
	//    4    7:getfield        #23  <Field int numRedirects>
	//    5   10:istore_1        
		String s1 = playerType;
	//    6   11:aload_0         
	//    7   12:getfield        #44  <Field String playerType>
	//    8   15:astore          6
		String s2 = playerVersion;
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field String playerVersion>
	//   11   21:astore          7
		boolean flag = onScreenDetection;
	//   12   23:aload_0         
	//   13   24:getfield        #25  <Field boolean onScreenDetection>
	//   14   27:istore_2        
		String s3 = language;
	//   15   28:aload_0         
	//   16   29:getfield        #31  <Field String language>
	//   17   32:astore          8
		boolean flag1 = restrictToCustomPlayer;
	//   18   34:aload_0         
	//   19   35:getfield        #36  <Field boolean restrictToCustomPlayer>
	//   20   38:istore_3        
		boolean flag2 = autoPlayAdBreaks;
	//   21   39:aload_0         
	//   22   40:getfield        #27  <Field boolean autoPlayAdBreaks>
	//   23   43:istore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 161 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//   24   45:new             #63  <Class StringBuilder>
	//   25   48:dup             
	//   26   49:aload           5
	//   27   51:invokestatic    #69  <Method String String.valueOf(Object)>
	//   28   54:invokevirtual   #72  <Method int String.length()>
	//   29   57:sipush          161
	//   30   60:iadd            
	//   31   61:aload           6
	//   32   63:invokestatic    #69  <Method String String.valueOf(Object)>
	//   33   66:invokevirtual   #72  <Method int String.length()>
	//   34   69:iadd            
	//   35   70:aload           7
	//   36   72:invokestatic    #69  <Method String String.valueOf(Object)>
	//   37   75:invokevirtual   #72  <Method int String.length()>
	//   38   78:iadd            
	//   39   79:aload           8
	//   40   81:invokestatic    #69  <Method String String.valueOf(Object)>
	//   41   84:invokevirtual   #72  <Method int String.length()>
	//   42   87:iadd            
	//   43   88:invokespecial   #74  <Method void StringBuilder(int)>
	//   44   91:astore          9
		stringbuilder.append("ImaSdkSettings [ppid=");
	//   45   93:aload           9
	//   46   95:ldc1            #76  <String "ImaSdkSettings [ppid=">
	//   47   97:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		stringbuilder.append(s);
	//   49  101:aload           9
	//   50  103:aload           5
	//   51  105:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
		stringbuilder.append(", numRedirects=");
	//   53  109:aload           9
	//   54  111:ldc1            #82  <String ", numRedirects=">
	//   55  113:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
		stringbuilder.append(i);
	//   57  117:aload           9
	//   58  119:iload_1         
	//   59  120:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   60  123:pop             
		stringbuilder.append(", playerType=");
	//   61  124:aload           9
	//   62  126:ldc1            #87  <String ", playerType=">
	//   63  128:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   64  131:pop             
		stringbuilder.append(s1);
	//   65  132:aload           9
	//   66  134:aload           6
	//   67  136:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   68  139:pop             
		stringbuilder.append(", playerVersion=");
	//   69  140:aload           9
	//   70  142:ldc1            #89  <String ", playerVersion=">
	//   71  144:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   72  147:pop             
		stringbuilder.append(s2);
	//   73  148:aload           9
	//   74  150:aload           7
	//   75  152:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
		stringbuilder.append(", onScreenDetection=");
	//   77  156:aload           9
	//   78  158:ldc1            #91  <String ", onScreenDetection=">
	//   79  160:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
		stringbuilder.append(flag);
	//   81  164:aload           9
	//   82  166:iload_2         
	//   83  167:invokevirtual   #94  <Method StringBuilder StringBuilder.append(boolean)>
	//   84  170:pop             
		stringbuilder.append(", language=");
	//   85  171:aload           9
	//   86  173:ldc1            #96  <String ", language=">
	//   87  175:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   88  178:pop             
		stringbuilder.append(s3);
	//   89  179:aload           9
	//   90  181:aload           8
	//   91  183:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   92  186:pop             
		stringbuilder.append(", restrictToCustom=");
	//   93  187:aload           9
	//   94  189:ldc1            #98  <String ", restrictToCustom=">
	//   95  191:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   96  194:pop             
		stringbuilder.append(flag1);
	//   97  195:aload           9
	//   98  197:iload_3         
	//   99  198:invokevirtual   #94  <Method StringBuilder StringBuilder.append(boolean)>
	//  100  201:pop             
		stringbuilder.append(", autoPlayAdBreaks=");
	//  101  202:aload           9
	//  102  204:ldc1            #100 <String ", autoPlayAdBreaks=">
	//  103  206:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  104  209:pop             
		stringbuilder.append(flag2);
	//  105  210:aload           9
	//  106  212:iload           4
	//  107  214:invokevirtual   #94  <Method StringBuilder StringBuilder.append(boolean)>
	//  108  217:pop             
		stringbuilder.append("]");
	//  109  218:aload           9
	//  110  220:ldc1            #102 <String "]">
	//  111  222:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  112  225:pop             
		return stringbuilder.toString();
	//  113  226:aload           9
	//  114  228:invokevirtual   #104 <Method String StringBuilder.toString()>
	//  115  231:areturn         
	}

	public static final int DEFAULT_MAX_REDIRECTS = 4;
	private boolean autoPlayAdBreaks;
	private transient String language;
	private int numRedirects;
	private boolean onScreenDetection;
	private String playerType;
	private String playerVersion;
	private String ppid;
	private transient boolean restrictToCustomPlayer;
}
