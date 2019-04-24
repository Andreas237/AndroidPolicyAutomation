.class public Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;
.super Ljava/lang/Object;
.source "ShoppingListCategoryTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClearAllClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 89
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic lambda$onClick$74(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->clearCompletedShoppingList(Ljava/lang/String;)V

    .line 116
    invoke-static {p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 95
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;

    .line 96
    iget-object v0, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 98
    iget-object v1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getCompletedShoppingListEntries(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 102
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 105
    :cond_1
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v4, 0x110

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 106
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumSelections(Ljava/lang/Integer;)V

    .line 107
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v3}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    const v3, 0x7f11068e

    .line 112
    invoke-virtual {v1, v3}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f110691

    .line 113
    invoke-virtual {v1, v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener$vNeBajDL-d4KNEU1XOdouBxjs9M;

    invoke-direct {v5, p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener$vNeBajDL-d4KNEU1XOdouBxjs9M;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ClearAllClickListener;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V

    const v6, 0x7f110690

    .line 118
    invoke-virtual {v1, v6}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v8, 0x0

    move v1, p1

    .line 110
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void

    :cond_2
    :goto_0
    return-void
.end method
