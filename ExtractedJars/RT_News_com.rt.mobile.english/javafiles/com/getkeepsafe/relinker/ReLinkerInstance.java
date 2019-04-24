// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.elf.ElfParser;
import java.io.*;
import java.util.*;

// Referenced classes of package com.getkeepsafe.relinker:
//			SystemLibraryLoader, ApkLibraryInstaller, TextUtils, MissingLibraryException

public class ReLinkerInstance
{

	protected ReLinkerInstance()
	{
		this(((ReLinker.LibraryLoader) (new SystemLibraryLoader())), ((ReLinker.LibraryInstaller) (new ApkLibraryInstaller())));
	//    0    0:aload_0         
	//    1    1:new             #28  <Class SystemLibraryLoader>
	//    2    4:dup             
	//    3    5:invokespecial   #30  <Method void SystemLibraryLoader()>
	//    4    8:new             #32  <Class ApkLibraryInstaller>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void ApkLibraryInstaller()>
	//    7   15:invokespecial   #36  <Method void ReLinkerInstance(ReLinker$LibraryLoader, ReLinker$LibraryInstaller)>
	//    8   18:return          
	}

	protected ReLinkerInstance(ReLinker.LibraryLoader libraryloader, ReLinker.LibraryInstaller libraryinstaller)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		loadedLibraries = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #40  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void HashSet()>
	//    6   12:putfield        #43  <Field Set loadedLibraries>
		if(libraryloader == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("Cannot pass null library loader");
	//    9   19:new             #45  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #47  <String "Cannot pass null library loader">
	//   12   25:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		if(libraryinstaller == null)
	//*  14   29:aload_2         
	//*  15   30:ifnonnull       43
		{
			throw new IllegalArgumentException("Cannot pass null library installer");
	//   16   33:new             #45  <Class IllegalArgumentException>
	//   17   36:dup             
	//   18   37:ldc1            #52  <String "Cannot pass null library installer">
	//   19   39:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   20   42:athrow          
		} else
		{
			libraryLoader = libraryloader;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
			libraryInstaller = libraryinstaller;
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:putfield        #56  <Field ReLinker$LibraryInstaller libraryInstaller>
			return;
	//   27   53:return          
		}
	}

	private void loadLibraryInternal(Context context, String s, String s1)
	{
		if(loadedLibraries.contains(((Object) (s))) && !force)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Set loadedLibraries>
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #72  <Method boolean Set.contains(Object)>
	//*   4   10:ifeq            35
	//*   5   13:aload_0         
	//*   6   14:getfield        #74  <Field boolean force>
	//*   7   17:ifne            35
		{
			log("%s already loaded previously!", new Object[] {
				s
			});
	//    8   20:aload_0         
	//    9   21:ldc1            #76  <String "%s already loaded previously!">
	//   10   23:iconst_1        
	//   11   24:anewarray       Object[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:aload_2         
	//   15   30:aastore         
	//   16   31:invokevirtual   #80  <Method void log(String, Object[])>
			return;
	//   17   34:return          
		}
		try
		{
			libraryLoader.loadLibrary(s);
	//   18   35:aload_0         
	//   19   36:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//   20   39:aload_2         
	//   21   40:invokeinterface #85  <Method void ReLinker$LibraryLoader.loadLibrary(String)>
			loadedLibraries.add(((Object) (s)));
	//   22   45:aload_0         
	//   23   46:getfield        #43  <Field Set loadedLibraries>
	//   24   49:aload_2         
	//   25   50:invokeinterface #88  <Method boolean Set.add(Object)>
	//   26   55:pop             
			log("%s (%s) was loaded normally!", new Object[] {
				s, s1
			});
	//   27   56:aload_0         
	//   28   57:ldc1            #90  <String "%s (%s) was loaded normally!">
	//   29   59:iconst_2        
	//   30   60:anewarray       Object[]
	//   31   63:dup             
	//   32   64:iconst_0        
	//   33   65:aload_2         
	//   34   66:aastore         
	//   35   67:dup             
	//   36   68:iconst_1        
	//   37   69:aload_3         
	//   38   70:aastore         
	//   39   71:invokevirtual   #80  <Method void log(String, Object[])>
			return;
	//   40   74:return          
		}
		catch(UnsatisfiedLinkError unsatisfiedlinkerror)
	//*  41   75:astore          4
		{
			log("Loading the library normally failed: %s", new Object[] {
				Log.getStackTraceString(((Throwable) (unsatisfiedlinkerror)))
			});
	//   42   77:aload_0         
	//   43   78:ldc1            #92  <String "Loading the library normally failed: %s">
	//   44   80:iconst_1        
	//   45   81:anewarray       Object[]
	//   46   84:dup             
	//   47   85:iconst_0        
	//   48   86:aload           4
	//   49   88:invokestatic    #98  <Method String Log.getStackTraceString(Throwable)>
	//   50   91:aastore         
	//   51   92:invokevirtual   #80  <Method void log(String, Object[])>
		}
		log("%s (%s) was not loaded normally, re-linking...", new Object[] {
			s, s1
		});
	//   52   95:aload_0         
	//   53   96:ldc1            #100 <String "%s (%s) was not loaded normally, re-linking...">
	//   54   98:iconst_2        
	//   55   99:anewarray       Object[]
	//   56  102:dup             
	//   57  103:iconst_0        
	//   58  104:aload_2         
	//   59  105:aastore         
	//   60  106:dup             
	//   61  107:iconst_1        
	//   62  108:aload_3         
	//   63  109:aastore         
	//   64  110:invokevirtual   #80  <Method void log(String, Object[])>
		File file = getWorkaroundLibFile(context, s, s1);
	//   65  113:aload_0         
	//   66  114:aload_1         
	//   67  115:aload_2         
	//   68  116:aload_3         
	//   69  117:invokevirtual   #104 <Method File getWorkaroundLibFile(Context, String, String)>
	//   70  120:astore          4
		if(!file.exists() || force)
	//*  71  122:aload           4
	//*  72  124:invokevirtual   #110 <Method boolean File.exists()>
	//*  73  127:ifeq            137
	//*  74  130:aload_0         
	//*  75  131:getfield        #74  <Field boolean force>
	//*  76  134:ifeq            201
		{
			if(force)
	//*  77  137:aload_0         
	//*  78  138:getfield        #74  <Field boolean force>
	//*  79  141:ifeq            162
				log("Forcing a re-link of %s (%s)...", new Object[] {
					s, s1
				});
	//   80  144:aload_0         
	//   81  145:ldc1            #112 <String "Forcing a re-link of %s (%s)...">
	//   82  147:iconst_2        
	//   83  148:anewarray       Object[]
	//   84  151:dup             
	//   85  152:iconst_0        
	//   86  153:aload_2         
	//   87  154:aastore         
	//   88  155:dup             
	//   89  156:iconst_1        
	//   90  157:aload_3         
	//   91  158:aastore         
	//   92  159:invokevirtual   #80  <Method void log(String, Object[])>
			cleanupOldLibFiles(context, s, s1);
	//   93  162:aload_0         
	//   94  163:aload_1         
	//   95  164:aload_2         
	//   96  165:aload_3         
	//   97  166:invokevirtual   #115 <Method void cleanupOldLibFiles(Context, String, String)>
			libraryInstaller.installLibrary(context, libraryLoader.supportedAbis(), libraryLoader.mapLibraryName(s), file, this);
	//   98  169:aload_0         
	//   99  170:getfield        #56  <Field ReLinker$LibraryInstaller libraryInstaller>
	//  100  173:aload_1         
	//  101  174:aload_0         
	//  102  175:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//  103  178:invokeinterface #119 <Method String[] ReLinker$LibraryLoader.supportedAbis()>
	//  104  183:aload_0         
	//  105  184:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//  106  187:aload_2         
	//  107  188:invokeinterface #123 <Method String ReLinker$LibraryLoader.mapLibraryName(String)>
	//  108  193:aload           4
	//  109  195:aload_0         
	//  110  196:invokeinterface #129 <Method void ReLinker$LibraryInstaller.installLibrary(Context, String[], String, File, ReLinkerInstance)>
		}
		try
		{
			if(recursive)
	//* 111  201:aload_0         
	//* 112  202:getfield        #131 <Field boolean recursive>
	//* 113  205:ifeq            268
			{
				String s2;
				for(Iterator iterator = (new ElfParser(file)).parseNeededDependencies().iterator(); iterator.hasNext(); loadLibrary(context, libraryLoader.unmapLibraryName(s2)))
	//* 114  208:new             #133 <Class ElfParser>
	//* 115  211:dup             
	//* 116  212:aload           4
	//* 117  214:invokespecial   #136 <Method void ElfParser(File)>
	//* 118  217:invokevirtual   #140 <Method List ElfParser.parseNeededDependencies()>
	//* 119  220:invokeinterface #146 <Method Iterator List.iterator()>
	//* 120  225:astore          5
	//* 121  227:aload           5
	//* 122  229:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//* 123  234:ifeq            268
					s2 = (String)iterator.next();
	//  124  237:aload           5
	//  125  239:invokeinterface #155 <Method Object Iterator.next()>
	//  126  244:checkcast       #157 <Class String>
	//  127  247:astore          6

	//  128  249:aload_0         
	//  129  250:aload_1         
	//  130  251:aload_0         
	//  131  252:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//  132  255:aload           6
	//  133  257:invokeinterface #160 <Method String ReLinker$LibraryLoader.unmapLibraryName(String)>
	//  134  262:invokevirtual   #163 <Method void loadLibrary(Context, String)>
			}
		}
	//* 135  265:goto            227
	//* 136  268:aload_0         
	//* 137  269:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//* 138  272:aload           4
	//* 139  274:invokevirtual   #167 <Method String File.getAbsolutePath()>
	//* 140  277:invokeinterface #170 <Method void ReLinker$LibraryLoader.loadPath(String)>
	//* 141  282:aload_0         
	//* 142  283:getfield        #43  <Field Set loadedLibraries>
	//* 143  286:aload_2         
	//* 144  287:invokeinterface #88  <Method boolean Set.add(Object)>
	//* 145  292:pop             
	//* 146  293:aload_0         
	//* 147  294:ldc1            #172 <String "%s (%s) was re-linked!">
	//* 148  296:iconst_2        
	//* 149  297:anewarray       Object[]
	//* 150  300:dup             
	//* 151  301:iconst_0        
	//* 152  302:aload_2         
	//* 153  303:aastore         
	//* 154  304:dup             
	//* 155  305:iconst_1        
	//* 156  306:aload_3         
	//* 157  307:aastore         
	//* 158  308:invokevirtual   #80  <Method void log(String, Object[])>
	//* 159  311:return          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  160  312:astore_1        
		libraryLoader.loadPath(file.getAbsolutePath());
		loadedLibraries.add(((Object) (s)));
		log("%s (%s) was re-linked!", new Object[] {
			s, s1
		});
	//* 161  313:goto            268
	}

	protected void cleanupOldLibFiles(Context context, String s, String s1)
	{
		File file = getWorkaroundLibDir(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method File getWorkaroundLibDir(Context)>
	//    3    5:astore          6
		context = ((Context) (getWorkaroundLibFile(context, s, s1)));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #104 <Method File getWorkaroundLibFile(Context, String, String)>
	//    9   14:astore_1        
		s = ((String) (file.listFiles(new FilenameFilter() {

			public boolean accept(File file1, String s2)
			{
				return s2.startsWith(mappedLibraryName);
			//    0    0:aload_2         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field String val$mappedLibraryName>
			//    3    5:invokevirtual   #33  <Method boolean String.startsWith(String)>
			//    4    8:ireturn         
			}

			final ReLinkerInstance this$0;
			final String val$mappedLibraryName;

			
			{
				this$0 = ReLinkerInstance.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ReLinkerInstance this$0>
				mappedLibraryName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$mappedLibraryName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
)));
	//   10   15:aload           6
	//   11   17:new             #8   <Class ReLinkerInstance$2>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//   16   26:aload_2         
	//   17   27:invokeinterface #123 <Method String ReLinker$LibraryLoader.mapLibraryName(String)>
	//   18   32:invokespecial   #179 <Method void ReLinkerInstance$2(ReLinkerInstance, String)>
	//   19   35:invokevirtual   #183 <Method File[] File.listFiles(FilenameFilter)>
	//   20   38:astore_2        
		if(s == null)
	//*  21   39:aload_2         
	//*  22   40:ifnonnull       44
			return;
	//   23   43:return          
		int j = s.length;
	//   24   44:aload_2         
	//   25   45:arraylength     
	//   26   46:istore          5
		for(int i = 0; i < j; i++)
	//*  27   48:iconst_0        
	//*  28   49:istore          4
	//*  29   51:iload           4
	//*  30   53:iload           5
	//*  31   55:icmpge          98
		{
			s1 = ((String) (s[i]));
	//   32   58:aload_2         
	//   33   59:iload           4
	//   34   61:aaload          
	//   35   62:astore_3        
			if(force || !((File) (s1)).getAbsolutePath().equals(((Object) (((File) (context)).getAbsolutePath()))))
	//*  36   63:aload_0         
	//*  37   64:getfield        #74  <Field boolean force>
	//*  38   67:ifne            84
	//*  39   70:aload_3         
	//*  40   71:invokevirtual   #167 <Method String File.getAbsolutePath()>
	//*  41   74:aload_1         
	//*  42   75:invokevirtual   #167 <Method String File.getAbsolutePath()>
	//*  43   78:invokevirtual   #186 <Method boolean String.equals(Object)>
	//*  44   81:ifne            89
				((File) (s1)).delete();
	//   45   84:aload_3         
	//   46   85:invokevirtual   #189 <Method boolean File.delete()>
	//   47   88:pop             
		}

	//   48   89:iload           4
	//   49   91:iconst_1        
	//   50   92:iadd            
	//   51   93:istore          4
	//*  52   95:goto            51
	//   53   98:return          
	}

	public ReLinkerInstance force()
	{
		force = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #74  <Field boolean force>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected File getWorkaroundLibDir(Context context)
	{
		return context.getDir("lib", 0);
	//    0    0:aload_1         
	//    1    1:ldc1            #12  <String "lib">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #196 <Method File Context.getDir(String, int)>
	//    4    7:areturn         
	}

	protected File getWorkaroundLibFile(Context context, String s, String s1)
	{
		s = libraryLoader.mapLibraryName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ReLinker$LibraryLoader libraryLoader>
	//    2    4:aload_2         
	//    3    5:invokeinterface #123 <Method String ReLinker$LibraryLoader.mapLibraryName(String)>
	//    4   10:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   5   11:aload_3         
	//*   6   12:invokestatic    #202 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifeq            32
		{
			return new File(getWorkaroundLibDir(context), s);
	//    8   18:new             #106 <Class File>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #176 <Method File getWorkaroundLibDir(Context)>
	//   13   27:aload_2         
	//   14   28:invokespecial   #205 <Method void File(File, String)>
	//   15   31:areturn         
		} else
		{
			context = ((Context) (getWorkaroundLibDir(context)));
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #176 <Method File getWorkaroundLibDir(Context)>
	//   19   37:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #207 <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #208 <Method void StringBuilder()>
	//   23   45:astore          4
			stringbuilder.append(s);
	//   24   47:aload           4
	//   25   49:aload_2         
	//   26   50:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			stringbuilder.append(".");
	//   28   54:aload           4
	//   29   56:ldc1            #214 <String ".">
	//   30   58:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			stringbuilder.append(s1);
	//   32   62:aload           4
	//   33   64:aload_3         
	//   34   65:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			return new File(((File) (context)), stringbuilder.toString());
	//   36   69:new             #106 <Class File>
	//   37   72:dup             
	//   38   73:aload_1         
	//   39   74:aload           4
	//   40   76:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   41   79:invokespecial   #205 <Method void File(File, String)>
	//   42   82:areturn         
		}
	}

	public void loadLibrary(Context context, String s)
	{
		loadLibrary(context, s, ((String) (null)), ((ReLinker.LoadListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #220 <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    6    8:return          
	}

	public void loadLibrary(Context context, String s, ReLinker.LoadListener loadlistener)
	{
		loadLibrary(context, s, ((String) (null)), loadlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokevirtual   #220 <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    6    8:return          
	}

	public void loadLibrary(Context context, String s, String s1)
	{
		loadLibrary(context, s, s1, ((ReLinker.LoadListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #220 <Method void loadLibrary(Context, String, String, ReLinker$LoadListener)>
	//    6    8:return          
	}

	public void loadLibrary(final Context context, final String library, final String version, final ReLinker.LoadListener listener)
	{
		if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Given context is null");
	//    2    4:new             #45  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #223 <String "Given context is null">
	//    5   10:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(TextUtils.isEmpty(((CharSequence) (library))))
	//*   7   14:aload_2         
	//*   8   15:invokestatic    #202 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   18:ifeq            31
			throw new IllegalArgumentException("Given library is either null or empty");
	//   10   21:new             #45  <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #225 <String "Given library is either null or empty">
	//   13   27:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		log("Beginning load of %s...", new Object[] {
			library
		});
	//   15   31:aload_0         
	//   16   32:ldc1            #227 <String "Beginning load of %s...">
	//   17   34:iconst_1        
	//   18   35:anewarray       Object[]
	//   19   38:dup             
	//   20   39:iconst_0        
	//   21   40:aload_2         
	//   22   41:aastore         
	//   23   42:invokevirtual   #80  <Method void log(String, Object[])>
		if(listener == null)
	//*  24   45:aload           4
	//*  25   47:ifnonnull       58
		{
			loadLibraryInternal(context, library, version);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:aload_3         
	//   30   54:invokespecial   #62  <Method void loadLibraryInternal(Context, String, String)>
			return;
	//   31   57:return          
		} else
		{
			(new Thread(new Runnable() {

				public void run()
				{
					try
					{
						loadLibraryInternal(context, library, version);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ReLinkerInstance this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field Context val$context>
				//    4    8:aload_0         
				//    5    9:getfield        #28  <Field String val$library>
				//    6   12:aload_0         
				//    7   13:getfield        #30  <Field String val$version>
				//    8   16:invokestatic    #45  <Method void ReLinkerInstance.access$000(ReLinkerInstance, Context, String, String)>
						listener.success();
				//    9   19:aload_0         
				//   10   20:getfield        #32  <Field ReLinker$LoadListener val$listener>
				//   11   23:invokeinterface #50  <Method void ReLinker$LoadListener.success()>
						return;
				//   12   28:return          
					}
				//*  13   29:astore_1        
				//*  14   30:aload_0         
				//*  15   31:getfield        #32  <Field ReLinker$LoadListener val$listener>
				//*  16   34:aload_1         
				//*  17   35:invokeinterface #54  <Method void ReLinker$LoadListener.failure(Throwable)>
				//*  18   40:return          
					catch(UnsatisfiedLinkError unsatisfiedlinkerror)
				//*  19   41:astore_1        
					{
						listener.failure(((Throwable) (unsatisfiedlinkerror)));
				//   20   42:aload_0         
				//   21   43:getfield        #32  <Field ReLinker$LoadListener val$listener>
				//   22   46:aload_1         
				//   23   47:invokeinterface #54  <Method void ReLinker$LoadListener.failure(Throwable)>
					}
					catch(MissingLibraryException missinglibraryexception)
					{
						listener.failure(((Throwable) (missinglibraryexception)));
						return;
					}
				//   24   52:return          
				}

				final ReLinkerInstance this$0;
				final Context val$context;
				final String val$library;
				final ReLinker.LoadListener val$listener;
				final String val$version;

			
			{
				this$0 = ReLinkerInstance.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field ReLinkerInstance this$0>
				context = context1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Context val$context>
				library = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$library>
				version = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field String val$version>
				listener = loadlistener;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field ReLinker$LoadListener val$listener>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #35  <Method void Object()>
			//   17   31:return          
			}
			}
)).start();
	//   32   58:new             #229 <Class Thread>
	//   33   61:dup             
	//   34   62:new             #6   <Class ReLinkerInstance$1>
	//   35   65:dup             
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:aload_2         
	//   39   69:aload_3         
	//   40   70:aload           4
	//   41   72:invokespecial   #232 <Method void ReLinkerInstance$1(ReLinkerInstance, Context, String, String, ReLinker$LoadListener)>
	//   42   75:invokespecial   #235 <Method void Thread(Runnable)>
	//   43   78:invokevirtual   #238 <Method void Thread.start()>
			return;
	//   44   81:return          
		}
	}

	public ReLinkerInstance log(ReLinker.Logger logger1)
	{
		logger = logger1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #241 <Field ReLinker$Logger logger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void log(String s)
	{
		if(logger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #241 <Field ReLinker$Logger logger>
	//*   2    4:ifnull          17
			logger.log(s);
	//    3    7:aload_0         
	//    4    8:getfield        #241 <Field ReLinker$Logger logger>
	//    5   11:aload_1         
	//    6   12:invokeinterface #245 <Method void ReLinker$Logger.log(String)>
	//    7   17:return          
	}

	public transient void log(String s, Object aobj[])
	{
		log(String.format(Locale.US, s, aobj));
	//    0    0:aload_0         
	//    1    1:getstatic       #251 <Field Locale Locale.US>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #255 <Method String String.format(Locale, String, Object[])>
	//    5    9:invokevirtual   #256 <Method void log(String)>
	//    6   12:return          
	}

	public ReLinkerInstance recursively()
	{
		recursive = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #131 <Field boolean recursive>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final String LIB_DIR = "lib";
	protected boolean force;
	protected final ReLinker.LibraryInstaller libraryInstaller;
	protected final ReLinker.LibraryLoader libraryLoader;
	protected final Set loadedLibraries;
	protected ReLinker.Logger logger;
	protected boolean recursive;


/*
	static void access$000(ReLinkerInstance relinkerinstance, Context context, String s, String s1)
	{
		relinkerinstance.loadLibraryInternal(context, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #62  <Method void loadLibraryInternal(Context, String, String)>
		return;
	//    5    7:return          
	}

*/
}
