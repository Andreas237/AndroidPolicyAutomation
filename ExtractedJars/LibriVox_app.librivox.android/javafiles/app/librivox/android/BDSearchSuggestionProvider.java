// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package app.librivox.android;

import android.content.SearchRecentSuggestionsProvider;

public class BDSearchSuggestionProvider extends SearchRecentSuggestionsProvider
{

	public BDSearchSuggestionProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void SearchRecentSuggestionsProvider()>
		setupSuggestions("app.librivox.android.BDSearchSuggestionProvider", 1);
	//    2    4:aload_0         
	//    3    5:ldc1            #10  <String "app.librivox.android.BDSearchSuggestionProvider">
	//    4    7:iconst_1        
	//    5    8:invokevirtual   #14  <Method void setupSuggestions(String, int)>
	//    6   11:return          
	}
}
