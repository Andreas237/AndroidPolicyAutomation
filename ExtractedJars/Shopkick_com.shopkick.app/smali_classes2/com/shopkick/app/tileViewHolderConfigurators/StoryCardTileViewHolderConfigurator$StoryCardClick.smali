.class Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;
.super Ljava/lang/Object;
.source "StoryCardTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "StoryCardClick"
.end annotation


# instance fields
.field private originScreen:Ljava/lang/Integer;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/Integer;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 153
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 154
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->originScreen:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 159
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "origin_screen"

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->originScreen:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "origin_element"

    .line 161
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 162
    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    return-void

    .line 168
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string/jumbo p1, "story_card_id"

    .line 169
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v2, Lcom/shopkick/app/storycards/StoryCardScreen;

    invoke-direct {p1, v1, v2, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoryCardTileViewHolderConfigurator$StoryCardClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
