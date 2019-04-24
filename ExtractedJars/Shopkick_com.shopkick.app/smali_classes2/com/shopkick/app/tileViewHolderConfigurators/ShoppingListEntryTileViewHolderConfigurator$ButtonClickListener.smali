.class public Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;
.super Ljava/lang/Object;
.source "ShoppingListEntryTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ButtonClickListener"
.end annotation


# instance fields
.field protected configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field protected quantity:Ljava/lang/Double;

.field protected shoppingListEntryRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;"
        }
    .end annotation
.end field

.field protected shoppingListId:Ljava/lang/String;

.field protected viewHolderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V
    .locals 1

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListEntryRef:Ljava/lang/ref/WeakReference;

    .line 247
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    .line 248
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 249
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListIdFromEntry(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 0

    .line 234
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->onDialogItemClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V

    return-void
.end method

.method public static synthetic lambda$onDialogItemClick$255(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/ref/WeakReference;)V
    .locals 3

    .line 390
    iget-object v0, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->deleteShoppingListEntry(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    invoke-virtual {p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    const/16 v0, 0xeb

    .line 394
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 v0, 0x4

    .line 395
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 396
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 398
    invoke-static {p3}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private onDialogItemClick(Landroid/view/View;Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;Ljava/util/HashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 335
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    if-nez p1, :cond_0

    return-void

    .line 339
    :cond_0
    iget-object p3, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListEntryRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz p3, :cond_7

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 344
    :cond_1
    iget-object v1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-static {v1, p3}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result p3

    if-nez p3, :cond_2

    return-void

    .line 346
    :cond_2
    iget p3, p2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->resId:I

    const v1, 0x7f110697

    const/16 v2, 0xea

    if-eq p3, v1, :cond_6

    const v1, 0x7f11069c

    if-eq p3, v1, :cond_4

    const p2, 0x7f1106ad

    if-eq p3, p2, :cond_3

    goto/16 :goto_1

    .line 361
    :cond_3
    invoke-virtual {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    .line 362
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/16 p3, 0x40

    .line 363
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 364
    iget-object p3, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 366
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string p3, "current_shopping_list_id"

    .line 367
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p2, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo p3, "shopping_list_entry_id"

    .line 368
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    new-instance p3, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/shoppinglists/SelectShoppingListScreen;

    invoke-direct {p3, v0, v1, p2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 373
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p3}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    goto :goto_1

    .line 349
    :cond_4
    invoke-virtual {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p3

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->quantity:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object v2, p2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    const/16 v0, 0xe9

    goto :goto_0

    :cond_5
    const/16 v0, 0xe8

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/4 v0, 0x4

    .line 352
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 353
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 355
    iget-object p1, p2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;->rowStatus:Ljava/lang/Double;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->quantity:Ljava/lang/Double;

    goto :goto_1

    .line 379
    :cond_6
    invoke-virtual {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    .line 380
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const/16 p3, 0x41

    .line 381
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 382
    iget-object p3, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 385
    iget-object v1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object p2, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p3, 0x7f110696

    .line 387
    invoke-virtual {p2, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object p2, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p3, 0x7f110693

    .line 388
    invoke-virtual {p2, p3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;

    invoke-direct {v6, p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    const p2, 0x7f110692

    .line 400
    invoke-virtual {p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v9, 0x0

    .line 385
    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_1
    return-void

    :cond_7
    :goto_2
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListEntryRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    .line 256
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_9

    if-eqz v1, :cond_9

    if-eqz v2, :cond_9

    .line 258
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 261
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f0900fb

    if-eq v2, v3, :cond_6

    const v4, 0x7f090104

    if-eq v2, v4, :cond_6

    const v3, 0x7f090486

    const/4 v4, 0x0

    if-eq v2, v3, :cond_3

    const p1, 0x7f09069b

    if-eq v2, p1, :cond_1

    goto/16 :goto_1

    .line 263
    :cond_1
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;

    invoke-direct {p1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 267
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v3, "taxonomy_keyword_id"

    .line 268
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    if-eqz v3, :cond_2

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    const-string/jumbo v3, "taxonomy_keyword_ids"

    const-string v4, ","

    .line 271
    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordIds:Ljava/util/List;

    .line 272
    invoke-static {v4, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    .line 271
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v3, "entry_name"

    .line 274
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "shopping_list_id"

    .line 275
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "shopping_list_entry_id"

    .line 276
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    iget-object v0, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    goto :goto_1

    .line 283
    :cond_3
    iget-object v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v3, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {v2, v3}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result v2

    if-nez v2, :cond_4

    return-void

    .line 286
    :cond_4
    invoke-virtual {v1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getEntryDialogOptionList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/util/ArrayList;

    move-result-object v2

    .line 289
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    if-eqz v3, :cond_5

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    goto :goto_0

    :cond_5
    move-object v0, v4

    :goto_0
    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->quantity:Ljava/lang/Double;

    .line 291
    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dismissDialog()V

    .line 292
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;

    invoke-direct {v0, p0, p1, v2, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/HashMap;)V

    iput-object v0, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    .line 314
    iget-object p1, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_1

    .line 319
    :cond_6
    iget-object v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v4, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-static {v2, v4}, Lcom/shopkick/app/shoppinglists/SLUtils;->isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z

    move-result v2

    if-nez v2, :cond_7

    return-void

    .line 322
    :cond_7
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 324
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    .line 325
    iget-object v1, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 326
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->shoppingListId:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->toggleShoppingListEntryCompletion(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_8
    :goto_1
    return-void

    :cond_9
    :goto_2
    return-void
.end method
