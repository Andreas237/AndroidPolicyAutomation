.class public Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;
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
    name = "OfferDetailsScreenOnClickListener"
.end annotation


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 241
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 246
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    return-void

    .line 251
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    instance-of v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/TileUtils;->serialize(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->toString()Ljava/lang/String;

    move-result-object v0

    .line 252
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v2, "tile_info"

    .line 253
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    const-class v0, Lcom/shopkick/app/products/OfferDetailsScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
