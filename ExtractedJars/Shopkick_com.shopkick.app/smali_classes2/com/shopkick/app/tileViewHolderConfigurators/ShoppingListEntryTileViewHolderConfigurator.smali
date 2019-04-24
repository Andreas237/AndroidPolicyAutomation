.class public Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ShoppingListEntryTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;
    }
.end annotation


# instance fields
.field protected appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected dialog:Landroid/app/Dialog;

.field protected dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field protected shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field protected urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 58
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 59
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 60
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 61
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private updateComplete(Landroid/view/View;Z)V
    .locals 2

    const v0, 0x7f09076e

    .line 191
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 194
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    goto :goto_0

    .line 196
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    and-int/lit8 v1, v1, -0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    :cond_1
    :goto_0
    const v0, 0x7f0900fb

    .line 201
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 203
    invoke-virtual {p1, p2}, Landroid/view/View;->setSelected(Z)V

    :cond_2
    return-void
.end method


# virtual methods
.method public dismissDialog()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method protected generateQuantityString(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    .line 159
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    if-eqz v1, :cond_1

    .line 160
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->stringQuantity:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->stringQuantity:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 164
    :cond_0
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    if-eqz v1, :cond_1

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_1

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected getEntryDialogOptionList(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;",
            ">;"
        }
    .end annotation

    .line 208
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 211
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 213
    new-instance v1, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    const v3, 0x7f1106ad

    sget-object v4, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    invoke-direct {v1, v3, v4}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v1, v3, v5

    if-lez v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->unit:Ljava/lang/Integer;

    .line 218
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    .line 219
    new-instance v2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    const v3, 0x7f11069c

    sget-object v4, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->QUANTITY_PICKER:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->quantity:Lcom/shopkick/app/fetchers/api/skapi/Quantity;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/Quantity;->number:Ljava/lang/Double;

    invoke-direct {v2, v3, v4, p1}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;Ljava/lang/Double;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    :cond_0
    new-instance p1, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;

    const v1, 0x7f110697

    sget-object v2, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;->TEXT:Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;

    invoke-direct {p1, v1, v2}, Lcom/shopkick/app/shoppinglists/SLOptionsDialog$RowData;-><init>(ILcom/shopkick/app/shoppinglists/SLOptionsDialog$RowType;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01b1

    return v0
.end method

.method protected getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 2

    .line 138
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 139
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setShoppingListEntryId(Ljava/lang/String;)V

    .line 140
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 141
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 142
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->keywordId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordId(Ljava/lang/String;)V

    return-object v0
.end method

.method protected getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    .locals 2

    .line 148
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 149
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 150
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 151
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 152
    iput-boolean p1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    return-object v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 11

    .line 77
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 79
    instance-of v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-nez v0, :cond_0

    return-void

    .line 81
    :cond_0
    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 82
    iget-object v1, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    .line 83
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    invoke-direct {v2, p0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V

    const v3, 0x7f09076e

    .line 87
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->title:Ljava/lang/String;

    .line 89
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->generateQuantityString(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Ljava/lang/String;

    move-result-object v5

    .line 87
    invoke-virtual {p0, v3, v4, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->updateQuantity(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-ne v4, v7, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    invoke-direct {p0, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->updateComplete(Landroid/view/View;Z)V

    const v3, 0x7f0900fb

    .line 94
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v3

    .line 95
    iget-object v4, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v4

    const/16 v8, 0xe5

    .line 96
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 97
    iget-object v8, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/16 v9, 0x3e

    const/16 v10, 0x3d

    if-ne v8, v7, :cond_2

    move v7, v9

    goto :goto_1

    :cond_2
    move v7, v10

    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 99
    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v8

    invoke-virtual {v3, v4, v7, v8}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 100
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 101
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    invoke-virtual {v3, v4}, Lcom/shopkick/app/logging/UserEventImageView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 105
    invoke-virtual {v3, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f09069b

    .line 109
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 110
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->state:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x4

    if-ne v1, v5, :cond_3

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numDeals:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numDeals:Ljava/lang/Integer;

    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_3

    const v1, 0x7f0901d0

    .line 112
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numDeals:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    invoke-virtual {v3, v6}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setVisibility(I)V

    .line 116
    iget-object p2, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p2

    const/16 v1, 0xe4

    .line 117
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 119
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object v5

    invoke-virtual {v3, p2, v1, v5}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 121
    invoke-virtual {v3, v2}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    const/16 p2, 0x8

    .line 123
    invoke-virtual {v3, p2}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setVisibility(I)V

    .line 125
    :goto_2
    invoke-virtual {v3, v2}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090486

    .line 128
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object p2

    .line 129
    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    const/16 v1, 0xe7

    .line 130
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 132
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;->getStandardOptionalParams(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 134
    invoke-virtual {p2, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected updateQuantity(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 175
    invoke-static {p3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    invoke-virtual {p1}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v7, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;

    const-string v5, "..."

    const-string v6, "  "

    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/util/FrameConfigurator$MultilineEllipsisPreDrawListener;-><init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v0, v7}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0

    .line 184
    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
