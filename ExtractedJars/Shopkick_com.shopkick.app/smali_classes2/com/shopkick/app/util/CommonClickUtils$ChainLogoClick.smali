.class public Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;
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
    name = "ChainLogoClick"
.end annotation


# instance fields
.field private isOnlineStore:Z

.field private tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 453
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 454
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 p1, 0x0

    .line 455
    iput-boolean p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->isOnlineStore:Z

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    .line 458
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 459
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 460
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 461
    iput-boolean p3, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->isOnlineStore:Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 466
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "chain_id"

    .line 467
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    iget-boolean v0, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->isOnlineStore:Z

    if-eqz v0, :cond_0

    const-string v0, "is_online_store"

    const-string v1, "1"

    .line 469
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, "origin_element"

    const/16 v1, 0xbc

    .line 471
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 475
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$ChainLogoClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
