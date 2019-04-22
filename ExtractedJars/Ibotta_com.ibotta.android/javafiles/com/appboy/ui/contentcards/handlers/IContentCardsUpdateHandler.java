// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.handlers;

import com.appboy.events.ContentCardsUpdatedEvent;
import java.util.List;

public interface IContentCardsUpdateHandler
{

	public abstract List handleCardUpdate(ContentCardsUpdatedEvent contentcardsupdatedevent);
}
