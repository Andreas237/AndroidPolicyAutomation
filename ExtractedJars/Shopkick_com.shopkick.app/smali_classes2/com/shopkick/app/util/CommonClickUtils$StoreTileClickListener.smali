.class public Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StoreTileClickListener"
.end annotation


# instance fields
.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 264
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 265
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 270
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_0

    goto :goto_0

    .line 274
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "origin_element"

    const/16 v1, 0x62

    .line 276
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "location_id"

    .line 277
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "location_name"

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "chain_id"

    .line 279
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/util/Affiliate;->isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    const-string v1, "is_online_store"

    .line 282
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 285
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method
