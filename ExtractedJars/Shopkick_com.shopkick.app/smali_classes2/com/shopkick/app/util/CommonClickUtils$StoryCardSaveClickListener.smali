.class public Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;
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
    name = "StoryCardSaveClickListener"
.end annotation


# instance fields
.field private storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/storycards/StoryCardDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    .line 140
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 145
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 146
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x34

    if-ne p1, v0, :cond_1

    .line 147
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->storyCardDataSource:Lcom/shopkick/app/storycards/StoryCardDataSource;

    iget-object v0, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->storyCardId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/util/CommonClickUtils$StoryCardSaveClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSaved:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/storycards/StoryCardDataSource;->toggleItemSaveState(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method
