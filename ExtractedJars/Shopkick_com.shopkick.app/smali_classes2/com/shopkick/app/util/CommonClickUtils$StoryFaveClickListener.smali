.class public Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;
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
    name = "StoryFaveClickListener"
.end annotation


# instance fields
.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/stories/StoriesDataSource;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 175
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryFaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->toggleItemSaveState(Ljava/lang/String;Z)V

    return-void
.end method
