// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import com.itextpdf.text.io.StreamUtil;
import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;

// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			HyphenationTree, Hyphenation

public class Hyphenator
{

	public Hyphenator(String s, String s1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		hyphenTree = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field HyphenationTree hyphenTree>
		remainCharCount = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #37  <Field int remainCharCount>
		pushCharCount = 2;
	//    8   14:aload_0         
	//    9   15:iconst_2        
	//   10   16:putfield        #39  <Field int pushCharCount>
		hyphenTree = getHyphenationTree(s, s1);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokestatic    #43  <Method HyphenationTree getHyphenationTree(String, String)>
	//   15   25:putfield        #35  <Field HyphenationTree hyphenTree>
		remainCharCount = i;
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:putfield        #37  <Field int remainCharCount>
		pushCharCount = j;
	//   19   33:aload_0         
	//   20   34:iload           4
	//   21   36:putfield        #39  <Field int pushCharCount>
	//   22   39:return          
	}

	public static HyphenationTree getFileHyphenationTree(String s)
	{
		FileInputStream fileinputstream1;
		if(hyphenDir == null)
	//*   0    0:getstatic       #30  <Field String hyphenDir>
	//*   1    3:ifnonnull       8
			return null;
	//    2    6:aconst_null     
	//    3    7:areturn         
		FileInputStream fileinputstream = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		try
		{
			File file = new File(hyphenDir, (new StringBuilder()).append(s).append(".xml").toString());
	//    6   10:new             #49  <Class File>
	//    7   13:dup             
	//    8   14:getstatic       #30  <Field String hyphenDir>
	//    9   17:new             #51  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #52  <Method void StringBuilder()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:ldc1            #58  <String ".xml">
	//   15   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   17   36:invokespecial   #65  <Method void File(String, String)>
	//   18   39:astore_2        
			if(file.canRead())
	//*  19   40:aload_2         
	//*  20   41:invokevirtual   #69  <Method boolean File.canRead()>
	//*  21   44:ifeq            56
				fileinputstream = new FileInputStream(file);
	//   22   47:new             #71  <Class FileInputStream>
	//   23   50:dup             
	//   24   51:aload_2         
	//   25   52:invokespecial   #74  <Method void FileInputStream(File)>
	//   26   55:astore_1        
		}
	//*  27   56:aload_1         
	//*  28   57:astore_2        
	//*  29   58:aload_1         
	//*  30   59:ifnonnull       146
	//*  31   62:aload_1         
	//*  32   63:astore_2        
	//*  33   64:aload_0         
	//*  34   65:invokevirtual   #80  <Method int String.length()>
	//*  35   68:iconst_2        
	//*  36   69:icmple          146
	//*  37   72:new             #49  <Class File>
	//*  38   75:dup             
	//*  39   76:getstatic       #30  <Field String hyphenDir>
	//*  40   79:new             #51  <Class StringBuilder>
	//*  41   82:dup             
	//*  42   83:invokespecial   #52  <Method void StringBuilder()>
	//*  43   86:aload_0         
	//*  44   87:iconst_0        
	//*  45   88:iconst_2        
	//*  46   89:invokevirtual   #84  <Method String String.substring(int, int)>
	//*  47   92:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  48   95:ldc1            #58  <String ".xml">
	//*  49   97:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  50  100:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  51  103:invokespecial   #65  <Method void File(String, String)>
	//*  52  106:astore_0        
	//*  53  107:aload_1         
	//*  54  108:astore_2        
	//*  55  109:aload_0         
	//*  56  110:invokevirtual   #69  <Method boolean File.canRead()>
	//*  57  113:ifeq            146
	//*  58  116:new             #71  <Class FileInputStream>
	//*  59  119:dup             
	//*  60  120:aload_0         
	//*  61  121:invokespecial   #74  <Method void FileInputStream(File)>
	//*  62  124:astore_2        
	//*  63  125:goto            146
	//*  64  128:new             #86  <Class HyphenationTree>
	//*  65  131:dup             
	//*  66  132:invokespecial   #87  <Method void HyphenationTree()>
	//*  67  135:astore_0        
	//*  68  136:aload_0         
	//*  69  137:aload_2         
	//*  70  138:invokevirtual   #91  <Method void HyphenationTree.loadSimplePatterns(java.io.InputStream)>
	//*  71  141:aload_0         
	//*  72  142:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  73  143:astore_0        
		{
			return null;
	//   74  144:aconst_null     
	//   75  145:areturn         
		}
		fileinputstream1 = fileinputstream;
		if(fileinputstream != null) goto _L2; else goto _L1
_L1:
		fileinputstream1 = fileinputstream;
		if(s.length() <= 2) goto _L2; else goto _L3
_L3:
		s = ((String) (new File(hyphenDir, (new StringBuilder()).append(s.substring(0, 2)).append(".xml").toString())));
		fileinputstream1 = fileinputstream;
		if(((File) (s)).canRead())
			fileinputstream1 = new FileInputStream(((File) (s)));
		  goto _L2
_L5:
		s = ((String) (new HyphenationTree()));
		((HyphenationTree) (s)).loadSimplePatterns(((java.io.InputStream) (fileinputstream1)));
		return ((HyphenationTree) (s));
_L2:
		if(fileinputstream1 == null)
	//*  76  146:aload_2         
	//*  77  147:ifnonnull       128
			return null;
	//   78  150:aconst_null     
	//   79  151:areturn         
		if(true) goto _L5; else goto _L4
_L4:
	}

	public static String getHyphenDir()
	{
		return hyphenDir;
	//    0    0:getstatic       #30  <Field String hyphenDir>
	//    1    3:areturn         
	}

	public static HyphenationTree getHyphenationTree(String s, String s1)
	{
		String s3 = s;
	//    0    0:aload_0         
	//    1    1:astore_3        
		String s2 = s3;
	//    2    2:aload_3         
	//    3    3:astore_2        
		if(s1 != null)
	//*   4    4:aload_1         
	//*   5    5:ifnull          43
		{
			s2 = s3;
	//    6    8:aload_3         
	//    7    9:astore_2        
			if(!s1.equals("none"))
	//*   8   10:aload_1         
	//*   9   11:ldc1            #94  <String "none">
	//*  10   13:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  11   16:ifne            43
				s2 = (new StringBuilder()).append(s3).append("_").append(s1).toString();
	//   12   19:new             #51  <Class StringBuilder>
	//   13   22:dup             
	//   14   23:invokespecial   #52  <Method void StringBuilder()>
	//   15   26:aload_3         
	//   16   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:ldc1            #100 <String "_">
	//   18   32:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   22   42:astore_2        
		}
		if(hyphenTrees.containsKey(((Object) (s2))))
	//*  23   43:getstatic       #26  <Field Hashtable hyphenTrees>
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #103 <Method boolean Hashtable.containsKey(Object)>
	//*  26   50:ifeq            64
			return (HyphenationTree)hyphenTrees.get(((Object) (s2)));
	//   27   53:getstatic       #26  <Field Hashtable hyphenTrees>
	//   28   56:aload_2         
	//   29   57:invokevirtual   #107 <Method Object Hashtable.get(Object)>
	//   30   60:checkcast       #86  <Class HyphenationTree>
	//   31   63:areturn         
		if(hyphenTrees.containsKey(((Object) (s))))
	//*  32   64:getstatic       #26  <Field Hashtable hyphenTrees>
	//*  33   67:aload_0         
	//*  34   68:invokevirtual   #103 <Method boolean Hashtable.containsKey(Object)>
	//*  35   71:ifeq            85
			return (HyphenationTree)hyphenTrees.get(((Object) (s)));
	//   36   74:getstatic       #26  <Field Hashtable hyphenTrees>
	//   37   77:aload_0         
	//   38   78:invokevirtual   #107 <Method Object Hashtable.get(Object)>
	//   39   81:checkcast       #86  <Class HyphenationTree>
	//   40   84:areturn         
		s1 = ((String) (getResourceHyphenationTree(s2)));
	//   41   85:aload_2         
	//   42   86:invokestatic    #110 <Method HyphenationTree getResourceHyphenationTree(String)>
	//   43   89:astore_1        
		s = s1;
	//   44   90:aload_1         
	//   45   91:astore_0        
		if(s1 == null)
	//*  46   92:aload_1         
	//*  47   93:ifnonnull       101
			s = ((String) (getFileHyphenationTree(s2)));
	//   48   96:aload_2         
	//   49   97:invokestatic    #112 <Method HyphenationTree getFileHyphenationTree(String)>
	//   50  100:astore_0        
		if(s != null)
	//*  51  101:aload_0         
	//*  52  102:ifnull          114
			hyphenTrees.put(((Object) (s2)), ((Object) (s)));
	//   53  105:getstatic       #26  <Field Hashtable hyphenTrees>
	//   54  108:aload_2         
	//   55  109:aload_0         
	//   56  110:invokevirtual   #116 <Method Object Hashtable.put(Object, Object)>
	//   57  113:pop             
		return ((HyphenationTree) (s));
	//   58  114:aload_0         
	//   59  115:areturn         
	}

	public static HyphenationTree getResourceHyphenationTree(String s)
	{
		java.io.InputStream inputstream;
		java.io.InputStream inputstream1;
		try
		{
			inputstream1 = StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/pdf/hyphenation/hyph/").append(s).append(".xml").toString());
	//    0    0:new             #51  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void StringBuilder()>
	//    3    7:ldc1            #8   <String "com/itextpdf/text/pdf/hyphenation/hyph/">
	//    4    9:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:ldc1            #58  <String ".xml">
	//    8   18:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #122 <Method java.io.InputStream StreamUtil.getResourceStream(String)>
	//   11   27:astore_2        
		}
	//*  12   28:aload_2         
	//*  13   29:astore_1        
	//*  14   30:aload_2         
	//*  15   31:ifnonnull       98
	//*  16   34:aload_2         
	//*  17   35:astore_1        
	//*  18   36:aload_0         
	//*  19   37:invokevirtual   #80  <Method int String.length()>
	//*  20   40:iconst_2        
	//*  21   41:icmple          98
	//*  22   44:new             #51  <Class StringBuilder>
	//*  23   47:dup             
	//*  24   48:invokespecial   #52  <Method void StringBuilder()>
	//*  25   51:ldc1            #8   <String "com/itextpdf/text/pdf/hyphenation/hyph/">
	//*  26   53:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  27   56:aload_0         
	//*  28   57:iconst_0        
	//*  29   58:iconst_2        
	//*  30   59:invokevirtual   #84  <Method String String.substring(int, int)>
	//*  31   62:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  32   65:ldc1            #58  <String ".xml">
	//*  33   67:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  34   70:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  35   73:invokestatic    #122 <Method java.io.InputStream StreamUtil.getResourceStream(String)>
	//*  36   76:astore_1        
	//*  37   77:goto            98
	//*  38   80:new             #86  <Class HyphenationTree>
	//*  39   83:dup             
	//*  40   84:invokespecial   #87  <Method void HyphenationTree()>
	//*  41   87:astore_0        
	//*  42   88:aload_0         
	//*  43   89:aload_1         
	//*  44   90:invokevirtual   #91  <Method void HyphenationTree.loadSimplePatterns(java.io.InputStream)>
	//*  45   93:aload_0         
	//*  46   94:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  47   95:astore_0        
		{
			return null;
	//   48   96:aconst_null     
	//   49   97:areturn         
		}
		inputstream = inputstream1;
		if(inputstream1 != null) goto _L2; else goto _L1
_L1:
		inputstream = inputstream1;
		if(s.length() > 2)
			inputstream = StreamUtil.getResourceStream((new StringBuilder()).append("com/itextpdf/text/pdf/hyphenation/hyph/").append(s.substring(0, 2)).append(".xml").toString());
		  goto _L2
_L4:
		s = ((String) (new HyphenationTree()));
		((HyphenationTree) (s)).loadSimplePatterns(inputstream);
		return ((HyphenationTree) (s));
_L2:
		if(inputstream == null)
	//*  50   98:aload_1         
	//*  51   99:ifnonnull       80
			return null;
	//   52  102:aconst_null     
	//   53  103:areturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static Hyphenation hyphenate(String s, String s1, String s2, int i, int j)
	{
		s = ((String) (getHyphenationTree(s, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method HyphenationTree getHyphenationTree(String, String)>
	//    3    5:astore_0        
		if(s == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ((HyphenationTree) (s)).hyphenate(s2, i, j);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:iload           4
	//   12   17:invokevirtual   #127 <Method Hyphenation HyphenationTree.hyphenate(String, int, int)>
	//   13   20:areturn         
	}

	public static Hyphenation hyphenate(String s, String s1, char ac[], int i, int j, int k, int l)
	{
		s = ((String) (getHyphenationTree(s, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method HyphenationTree getHyphenationTree(String, String)>
	//    3    5:astore_0        
		if(s == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ((HyphenationTree) (s)).hyphenate(ac, i, j, k, l);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:iload           4
	//   12   17:iload           5
	//   13   19:iload           6
	//   14   21:invokevirtual   #131 <Method Hyphenation HyphenationTree.hyphenate(char[], int, int, int, int)>
	//   15   24:areturn         
	}

	public static void setHyphenDir(String s)
	{
		hyphenDir = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #30  <Field String hyphenDir>
	//    2    4:return          
	}

	public Hyphenation hyphenate(String s)
	{
		if(hyphenTree == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field HyphenationTree hyphenTree>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return hyphenTree.hyphenate(s, remainCharCount, pushCharCount);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field HyphenationTree hyphenTree>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field int remainCharCount>
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field int pushCharCount>
	//   12   22:invokevirtual   #127 <Method Hyphenation HyphenationTree.hyphenate(String, int, int)>
	//   13   25:areturn         
	}

	public Hyphenation hyphenate(char ac[], int i, int j)
	{
		if(hyphenTree == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field HyphenationTree hyphenTree>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return hyphenTree.hyphenate(ac, i, j, remainCharCount, pushCharCount);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field HyphenationTree hyphenTree>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field int remainCharCount>
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field int pushCharCount>
	//   14   24:invokevirtual   #131 <Method Hyphenation HyphenationTree.hyphenate(char[], int, int, int, int)>
	//   15   27:areturn         
	}

	public void setLanguage(String s, String s1)
	{
		hyphenTree = getHyphenationTree(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #43  <Method HyphenationTree getHyphenationTree(String, String)>
	//    4    6:putfield        #35  <Field HyphenationTree hyphenTree>
	//    5    9:return          
	}

	public void setMinPushCharCount(int i)
	{
		pushCharCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int pushCharCount>
	//    3    5:return          
	}

	public void setMinRemainCharCount(int i)
	{
		remainCharCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int remainCharCount>
	//    3    5:return          
	}

	private static final String defaultHyphLocation = "com/itextpdf/text/pdf/hyphenation/hyph/";
	private static String hyphenDir = "";
	private static Hashtable hyphenTrees = new Hashtable();
	private HyphenationTree hyphenTree;
	private int pushCharCount;
	private int remainCharCount;

	static 
	{
	//    0    0:new             #21  <Class Hashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Hashtable()>
	//    3    7:putstatic       #26  <Field Hashtable hyphenTrees>
	//    4   10:ldc1            #28  <String "">
	//    5   12:putstatic       #30  <Field String hyphenDir>
	//*   6   15:return          
	}
}
