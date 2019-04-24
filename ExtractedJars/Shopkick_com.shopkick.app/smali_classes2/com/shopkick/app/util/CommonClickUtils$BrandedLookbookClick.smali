.class public Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;
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
    name = "BrandedLookbookClick"
.end annotation


# instance fields
.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 239
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_0

    goto :goto_0

    .line 247
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    const-string/jumbo v1, "story_cache_key"

    .line 249
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "story_cache_version"

    .line 250
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "story_id"

    .line 251
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    const/16 v1, 0xa2

    .line 252
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 255
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$BrandedLookbookClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method
