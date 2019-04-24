.class Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "ReceiptKicksHeaderV2ViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

.field final synthetic val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 95
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xa8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 96
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 97
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iget-object v2, v2, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;)Lcom/shopkick/app/cpg/LocationDataSource;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocation(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v2, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->goToReceiptScanScreen(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->showLocationSelectorDialog(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 113
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;->val$tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {p1, v0, v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->goToReceiptScanScreen(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_2
    :goto_0
    return-void
.end method
