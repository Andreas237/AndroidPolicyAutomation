.class public Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;
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
    name = "FlattenedLookbookTileClick"
.end annotation


# instance fields
.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 190
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_0

    goto :goto_0

    .line 199
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "story_cache_key"

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "story_cache_version"

    .line 201
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "story_id"

    .line 202
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    const/16 v1, 0x29

    .line 203
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/lookbooks/LookbookScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$FlattenedLookbookTileClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method
