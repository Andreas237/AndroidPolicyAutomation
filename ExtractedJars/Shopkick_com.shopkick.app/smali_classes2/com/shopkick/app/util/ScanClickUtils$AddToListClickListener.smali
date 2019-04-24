.class public Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ScanClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AddToListClickListener"
.end annotation


# instance fields
.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 271
    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 272
    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 278
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/16 p1, 0x46

    goto :goto_0

    :cond_0
    const/16 p1, 0x41

    .line 285
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xd8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 286
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 287
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 291
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->displayTaxonomyNodeId:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v2, v3}, Lcom/shopkick/app/shoppinglists/ListAddController;->addProductOrScanListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
