// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class GlobalOptions
{

	public GlobalOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Option>
	//    4    8:dup             
	//    5    9:ldc1            #18  <String "h">
	//    6   11:ldc1            #20  <String "help">
	//    7   13:iconst_0        
	//    8   14:ldc1            #22  <String "Print this help">
	//    9   16:invokespecial   #25  <Method void Option(String, String, boolean, String)>
	//   10   19:putfield        #27  <Field Option optionHelp>
	//   11   22:aload_0         
	//   12   23:new             #16  <Class Option>
	//   13   26:dup             
	//   14   27:ldc1            #29  <String "l">
	//   15   29:ldc1            #31  <String "list">
	//   16   31:iconst_0        
	//   17   32:ldc1            #33  <String "List available plugins">
	//   18   34:invokespecial   #25  <Method void Option(String, String, boolean, String)>
	//   19   37:putfield        #35  <Field Option optionListPlugins>
	//   20   40:aload_0         
	//   21   41:new             #16  <Class Option>
	//   22   44:dup             
	//   23   45:ldc1            #37  <String "p">
	//   24   47:ldc1            #39  <String "process">
	//   25   49:iconst_1        
	//   26   50:ldc1            #41  <String "Specify target process">
	//   27   52:invokespecial   #25  <Method void Option(String, String, boolean, String)>
	//   28   55:putfield        #43  <Field Option optionProcess>
	//   29   58:aload_0         
	//   30   59:new             #45  <Class Options>
	//   31   62:dup             
	//   32   63:invokespecial   #46  <Method void Options()>
	//   33   66:putfield        #48  <Field Options options>
		options.addOption(optionHelp);
	//   34   69:aload_0         
	//   35   70:getfield        #48  <Field Options options>
	//   36   73:aload_0         
	//   37   74:getfield        #27  <Field Option optionHelp>
	//   38   77:invokevirtual   #52  <Method Options Options.addOption(Option)>
	//   39   80:pop             
		options.addOption(optionListPlugins);
	//   40   81:aload_0         
	//   41   82:getfield        #48  <Field Options options>
	//   42   85:aload_0         
	//   43   86:getfield        #35  <Field Option optionListPlugins>
	//   44   89:invokevirtual   #52  <Method Options Options.addOption(Option)>
	//   45   92:pop             
		options.addOption(optionProcess);
	//   46   93:aload_0         
	//   47   94:getfield        #48  <Field Options options>
	//   48   97:aload_0         
	//   49   98:getfield        #43  <Field Option optionProcess>
	//   50  101:invokevirtual   #52  <Method Options Options.addOption(Option)>
	//   51  104:pop             
	//   52  105:return          
	}

	public final Option optionHelp = new Option("h", "help", false, "Print this help");
	public final Option optionListPlugins = new Option("l", "list", false, "List available plugins");
	public final Option optionProcess = new Option("p", "process", true, "Specify target process");
	public final Options options = new Options();
}
