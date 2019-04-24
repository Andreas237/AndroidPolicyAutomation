// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class Version
	implements Comparable, Serializable
{

	public Version(int i, int j, int k, String s)
	{
		this(i, j, k, s, ((String) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #29  <Method void Version(int, int, int, String, String, String)>
	//    8   11:return          
	}

	public Version(int i, int j, int k, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_majorVersion = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #39  <Field int _majorVersion>
		_minorVersion = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #41  <Field int _minorVersion>
		_patchLevel = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #43  <Field int _patchLevel>
		_snapshotInfo = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #45  <Field String _snapshotInfo>
		s = s1;
	//   14   25:aload           5
	//   15   27:astore          4
		if(s1 == null)
	//*  16   29:aload           5
	//*  17   31:ifnonnull       38
			s = "";
	//   18   34:ldc1            #47  <String "">
	//   19   36:astore          4
		_groupId = s;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #49  <Field String _groupId>
		s = s2;
	//   23   44:aload           6
	//   24   46:astore          4
		if(s2 == null)
	//*  25   48:aload           6
	//*  26   50:ifnonnull       57
			s = "";
	//   27   53:ldc1            #47  <String "">
	//   28   55:astore          4
		_artifactId = s;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #51  <Field String _artifactId>
	//   32   63:return          
	}

	public static Version unknownVersion()
	{
		return UNKNOWN_VERSION;
	//    0    0:getstatic       #31  <Field Version UNKNOWN_VERSION>
	//    1    3:areturn         
	}

	public int compareTo(Version version)
	{
		if(version == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		int j = _groupId.compareTo(version._groupId);
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field String _groupId>
	//    7   11:aload_1         
	//    8   12:getfield        #49  <Field String _groupId>
	//    9   15:invokevirtual   #60  <Method int String.compareTo(String)>
	//   10   18:istore_3        
		int i = j;
	//   11   19:iload_3         
	//   12   20:istore_2        
		if(j == 0)
	//*  13   21:iload_3         
	//*  14   22:ifne            85
		{
			int k = _artifactId.compareTo(version._artifactId);
	//   15   25:aload_0         
	//   16   26:getfield        #51  <Field String _artifactId>
	//   17   29:aload_1         
	//   18   30:getfield        #51  <Field String _artifactId>
	//   19   33:invokevirtual   #60  <Method int String.compareTo(String)>
	//   20   36:istore_3        
			i = k;
	//   21   37:iload_3         
	//   22   38:istore_2        
			if(k == 0)
	//*  23   39:iload_3         
	//*  24   40:ifne            85
			{
				int l = _majorVersion - version._majorVersion;
	//   25   43:aload_0         
	//   26   44:getfield        #39  <Field int _majorVersion>
	//   27   47:aload_1         
	//   28   48:getfield        #39  <Field int _majorVersion>
	//   29   51:isub            
	//   30   52:istore_3        
				i = l;
	//   31   53:iload_3         
	//   32   54:istore_2        
				if(l == 0)
	//*  33   55:iload_3         
	//*  34   56:ifne            85
				{
					int i1 = _minorVersion - version._minorVersion;
	//   35   59:aload_0         
	//   36   60:getfield        #41  <Field int _minorVersion>
	//   37   63:aload_1         
	//   38   64:getfield        #41  <Field int _minorVersion>
	//   39   67:isub            
	//   40   68:istore_3        
					i = i1;
	//   41   69:iload_3         
	//   42   70:istore_2        
					if(i1 == 0)
	//*  43   71:iload_3         
	//*  44   72:ifne            85
						i = _patchLevel - version._patchLevel;
	//   45   75:aload_0         
	//   46   76:getfield        #43  <Field int _patchLevel>
	//   47   79:aload_1         
	//   48   80:getfield        #43  <Field int _patchLevel>
	//   49   83:isub            
	//   50   84:istore_2        
				}
			}
		}
		return i;
	//   51   85:iload_2         
	//   52   86:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Version)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Version>
	//    3    5:invokevirtual   #63  <Method int compareTo(Version)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #69  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #69  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((Version)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class Version>
	//   18   30:astore_1        
		return ((Version) (obj))._majorVersion == _majorVersion && ((Version) (obj))._minorVersion == _minorVersion && ((Version) (obj))._patchLevel == _patchLevel && ((Version) (obj))._artifactId.equals(((Object) (_artifactId))) && ((Version) (obj))._groupId.equals(((Object) (_groupId)));
	//   19   31:aload_1         
	//   20   32:getfield        #39  <Field int _majorVersion>
	//   21   35:aload_0         
	//   22   36:getfield        #39  <Field int _majorVersion>
	//   23   39:icmpne          94
	//   24   42:aload_1         
	//   25   43:getfield        #41  <Field int _minorVersion>
	//   26   46:aload_0         
	//   27   47:getfield        #41  <Field int _minorVersion>
	//   28   50:icmpne          94
	//   29   53:aload_1         
	//   30   54:getfield        #43  <Field int _patchLevel>
	//   31   57:aload_0         
	//   32   58:getfield        #43  <Field int _patchLevel>
	//   33   61:icmpne          94
	//   34   64:aload_1         
	//   35   65:getfield        #51  <Field String _artifactId>
	//   36   68:aload_0         
	//   37   69:getfield        #51  <Field String _artifactId>
	//   38   72:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   39   75:ifeq            94
	//   40   78:aload_1         
	//   41   79:getfield        #49  <Field String _groupId>
	//   42   82:aload_0         
	//   43   83:getfield        #49  <Field String _groupId>
	//   44   86:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   45   89:ifeq            94
	//   46   92:iconst_1        
	//   47   93:ireturn         
	//   48   94:iconst_0        
	//   49   95:ireturn         
	}

	public String getArtifactId()
	{
		return _artifactId;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String _artifactId>
	//    2    4:areturn         
	}

	public String getGroupId()
	{
		return _groupId;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String _groupId>
	//    2    4:areturn         
	}

	public int getMajorVersion()
	{
		return _majorVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int _majorVersion>
	//    2    4:ireturn         
	}

	public int getMinorVersion()
	{
		return _minorVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int _minorVersion>
	//    2    4:ireturn         
	}

	public int getPatchLevel()
	{
		return _patchLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int _patchLevel>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return _artifactId.hashCode() ^ ((_groupId.hashCode() + _majorVersion) - _minorVersion) + _patchLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String _artifactId>
	//    2    4:invokevirtual   #81  <Method int String.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field String _groupId>
	//    5   11:invokevirtual   #81  <Method int String.hashCode()>
	//    6   14:aload_0         
	//    7   15:getfield        #39  <Field int _majorVersion>
	//    8   18:iadd            
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field int _minorVersion>
	//   11   23:isub            
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field int _patchLevel>
	//   14   28:iadd            
	//   15   29:ixor            
	//   16   30:ireturn         
	}

	public boolean isSnapshot()
	{
		return _snapshotInfo != null && _snapshotInfo.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String _snapshotInfo>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field String _snapshotInfo>
	//    5   11:invokevirtual   #86  <Method int String.length()>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isUknownVersion()
	{
		return isUnknownVersion();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method boolean isUnknownVersion()>
	//    2    4:ireturn         
	}

	public boolean isUnknownVersion()
	{
		return this == UNKNOWN_VERSION;
	//    0    0:aload_0         
	//    1    1:getstatic       #31  <Field Version UNKNOWN_VERSION>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toFullString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_groupId);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field String _groupId>
	//    7   13:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append('/');
	//    9   17:aload_1         
	//   10   18:bipush          47
	//   11   20:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		stringbuilder.append(_artifactId);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #51  <Field String _artifactId>
	//   16   29:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append('/');
	//   18   33:aload_1         
	//   19   34:bipush          47
	//   20   36:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
		stringbuilder.append(toString());
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:invokevirtual   #104 <Method String toString()>
	//   25   45:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_majorVersion);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field int _majorVersion>
	//    7   13:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append('.');
	//    9   17:aload_1         
	//   10   18:bipush          46
	//   11   20:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   12   23:pop             
		stringbuilder.append(_minorVersion);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #41  <Field int _minorVersion>
	//   16   29:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		stringbuilder.append('.');
	//   18   33:aload_1         
	//   19   34:bipush          46
	//   20   36:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
		stringbuilder.append(_patchLevel);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #43  <Field int _patchLevel>
	//   25   45:invokevirtual   #108 <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
		if(isSnapshot())
	//*  27   49:aload_0         
	//*  28   50:invokevirtual   #110 <Method boolean isSnapshot()>
	//*  29   53:ifeq            72
		{
			stringbuilder.append('-');
	//   30   56:aload_1         
	//   31   57:bipush          45
	//   32   59:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   33   62:pop             
			stringbuilder.append(_snapshotInfo);
	//   34   63:aload_1         
	//   35   64:aload_0         
	//   36   65:getfield        #45  <Field String _snapshotInfo>
	//   37   68:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
		}
		return stringbuilder.toString();
	//   39   72:aload_1         
	//   40   73:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   41   76:areturn         
	}

	private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, ((String) (null)), ((String) (null)), ((String) (null)));
	private static final long serialVersionUID = 1L;
	protected final String _artifactId;
	protected final String _groupId;
	protected final int _majorVersion;
	protected final int _minorVersion;
	protected final int _patchLevel;
	protected final String _snapshotInfo;

	static 
	{
	//    0    0:new             #2   <Class Version>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:invokespecial   #29  <Method void Version(int, int, int, String, String, String)>
	//    9   13:putstatic       #31  <Field Version UNKNOWN_VERSION>
	//*  10   16:return          
	}
}
