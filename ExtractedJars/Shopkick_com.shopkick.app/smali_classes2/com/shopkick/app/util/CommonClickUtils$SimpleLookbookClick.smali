.class public Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;
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
    name = "SimpleLookbookClick"
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

.field private dispatcherRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ")V"
        }
    .end annotation

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 328
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->dispatcherRef:Ljava/lang/ref/WeakReference;

    .line 329
    iput-object p3, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 334
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "origin_element"

    const/16 v1, 0x7e

    .line 335
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->dispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/url/URLDispatcher;

    .line 337
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 338
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    goto :goto_0

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_2

    .line 342
    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 343
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$SimpleLookbookClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->lookbookTileImageSize:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const-string/jumbo v2, "story_cache_key"

    .line 344
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "story_cache_version"

    .line 345
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "story_id"

    .line 346
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    const-class v1, Lcom/shopkick/app/lookbooks/BrandedLookbookScreen;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const-string/jumbo v2, "story_cache_key"

    .line 349
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "story_cache_version"

    .line 350
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "story_id"

    .line 351
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    const-class v1, Lcom/shopkick/app/lookbooks/LookbookScreen;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method
