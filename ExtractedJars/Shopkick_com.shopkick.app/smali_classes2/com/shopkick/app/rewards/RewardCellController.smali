.class public Lcom/shopkick/app/rewards/RewardCellController;
.super Ljava/lang/Object;
.source "RewardCellController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final AFFORDABLE_REWARD_TYPES:[I


# instance fields
.field private almostThereIndex:I

.field private childIds:[I

.field private context:Landroid/content/Context;

.field private inflater:Landroid/view/LayoutInflater;

.field private keepEarningIndex:I

.field private parentScreen:Lcom/shopkick/app/screens/AppScreen;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private rewardIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

.field private viewBuilder:Lcom/shopkick/app/util/ViewBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    .line 31
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shopkick/app/rewards/RewardCellController;->AFFORDABLE_REWARD_TYPES:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x3
        0x2
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/rewards/RewardsMallListAdapter;Lcom/shopkick/app/util/ViewBuilder;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/points/ProfilePoints;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 45
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->childIds:[I

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardCellController;->context:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardCellController;->inflater:Landroid/view/LayoutInflater;

    .line 62
    iput-object p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->parentScreen:Lcom/shopkick/app/screens/AppScreen;

    .line 63
    iput-object p5, p0, Lcom/shopkick/app/rewards/RewardCellController;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 64
    iput-object p6, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    .line 66
    iput-object p7, p0, Lcom/shopkick/app/rewards/RewardCellController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0905cb
        0x7f0905c0
        0x7f0905c3
        0x7f0905de
        0x7f0905dc
        0x7f0901a1
        0x7f0905cd
        0x7f0901a2
    .end array-data
.end method

.method private getThumbnailUrlFromOffset(Landroid/widget/ImageView;IZ)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p2

    .line 83
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 84
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method

.method private isRewardAffordable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z
    .locals 2

    .line 116
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/rewards/RewardCellController;->isRewardTypeAffordable(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 120
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return v1

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lt v0, p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private isRewardTypeAffordable(I)Z
    .locals 5

    .line 135
    sget-object v0, Lcom/shopkick/app/rewards/RewardCellController;->AFFORDABLE_REWARD_TYPES:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    if-ne p1, v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private populateBlankCell(Landroid/widget/FrameLayout;)V
    .locals 1

    const v0, 0x7f0905c0

    .line 264
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    .line 265
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 0

    return-void
.end method

.method public fetchImages(ILandroid/view/View;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 98
    :cond_0
    sget v0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    mul-int/2addr p1, v0

    const v0, 0x7f090410

    .line 99
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0905cb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 100
    invoke-direct {p0, v0, p1, p3}, Lcom/shopkick/app/rewards/RewardCellController;->getThumbnailUrlFromOffset(Landroid/widget/ImageView;IZ)V

    const v0, 0x7f0905ed

    .line 101
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    add-int/lit8 p1, p1, 0x1

    .line 102
    invoke-direct {p0, p2, p1, p3}, Lcom/shopkick/app/rewards/RewardCellController;->getThumbnailUrlFromOffset(Landroid/widget/ImageView;IZ)V

    return-void
.end method

.method public getView(Landroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 275
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardCellController;->inflater:Landroid/view/LayoutInflater;

    const v1, 0x7f0c018d

    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 277
    new-instance p2, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p2}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 278
    invoke-virtual {p2, p1}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 279
    new-instance v1, Lcom/shopkick/app/adapter/ViewDefaults;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardCellController;->childIds:[I

    invoke-direct {v1, p1, v2}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    invoke-virtual {p2, v1}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 280
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/adapter/ViewHolder;

    .line 283
    invoke-virtual {p2}, Lcom/shopkick/app/adapter/ViewHolder;->resetViewDefaults()V

    :goto_0
    const v1, 0x7f0901a1

    .line 287
    invoke-virtual {p2, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0905cd

    .line 288
    invoke-virtual {p2, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f0901a2

    .line 289
    invoke-virtual {p2, v3}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 293
    sget v4, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    mul-int/2addr v4, p3

    .line 294
    iget-object v5, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const v6, 0x7f090410

    .line 295
    invoke-virtual {p2, v6}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v5, :cond_1

    .line 298
    iget-object v5, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v9, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v5, v9}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v5

    .line 299
    invoke-virtual {p0, v6, v5, v4}, Lcom/shopkick/app/rewards/RewardCellController;->populateRewardCell(Landroid/widget/FrameLayout;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;I)V

    .line 300
    invoke-virtual {v6, v8}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    goto :goto_1

    .line 302
    :cond_1
    invoke-virtual {v6, v7}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 303
    invoke-virtual {v6, v0}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 307
    :goto_1
    iget v5, p0, Lcom/shopkick/app/rewards/RewardCellController;->almostThereIndex:I

    if-ne v4, v5, :cond_2

    .line 308
    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const v1, 0x7f080206

    .line 309
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v1, 0x7f1105fc

    .line 310
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 311
    :cond_2
    iget v5, p0, Lcom/shopkick/app/rewards/RewardCellController;->keepEarningIndex:I

    if-ne v4, v5, :cond_3

    .line 312
    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const v1, 0x7f1105fd

    .line 313
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    :cond_3
    if-nez v4, :cond_4

    .line 315
    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const v1, 0x7f080207

    .line 316
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v1, 0x7f110601

    .line 317
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    :cond_4
    const/16 v2, 0x8

    .line 319
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 323
    :goto_2
    sget v1, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    mul-int/2addr p3, v1

    add-int/2addr p3, v8

    const v1, 0x7f0905ed

    .line 324
    invoke-virtual {p2, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    .line 325
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 326
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p3, v2, :cond_5

    if-eqz v1, :cond_5

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    .line 328
    invoke-virtual {p0, p2, v0, p3}, Lcom/shopkick/app/rewards/RewardCellController;->populateRewardCell(Landroid/widget/FrameLayout;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;I)V

    .line 329
    invoke-virtual {p2, v8}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    goto :goto_3

    .line 331
    :cond_5
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RewardCellController;->populateBlankCell(Landroid/widget/FrameLayout;)V

    .line 332
    invoke-virtual {p2, v7}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 333
    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    :goto_3
    return-object p1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->getDetailsLoading()Z

    move-result v0

    if-nez v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsMallListAdapter:Lcom/shopkick/app/rewards/RewardsMallListAdapter;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->setDetailsLoading(Z)V

    .line 348
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ltz p1, :cond_0

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 351
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "reward_id"

    .line 352
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardCellController;->parentScreen:Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 354
    const-class v1, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/screens/AppScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public populateRewardCell(Landroid/widget/FrameLayout;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;I)V
    .locals 10

    .line 148
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 149
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-eq p3, v2, :cond_0

    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    .line 150
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ne p3, v1, :cond_a

    .line 151
    :cond_0
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->kickAmountView:Lcom/shopkick/app/fetchers/api/skapi/View;

    const/4 v3, 0x0

    if-eqz p3, :cond_8

    const v4, 0x7f0905c4

    .line 154
    invoke-virtual {p1, v4}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0905bf

    .line 155
    invoke-virtual {p1, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 157
    invoke-static {p2}, Lcom/shopkick/app/rewards/RewardsDataController;->getRewardCostInKicks(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)I

    move-result v6

    const v7, 0x7fffffff

    const/4 v8, 0x1

    if-eq v6, v7, :cond_1

    .line 161
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    goto :goto_0

    .line 164
    :cond_1
    iget-object v6, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    const-string v7, "+"

    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 165
    iget-object v6, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    iget-object v7, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v8

    invoke-virtual {v6, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    move v6, v8

    goto :goto_1

    :cond_2
    :goto_0
    move v6, v3

    .line 169
    :goto_1
    iget-object v7, p0, Lcom/shopkick/app/rewards/RewardCellController;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v9, 0x7f0f000e

    .line 170
    invoke-virtual {v7, v9, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v7

    .line 169
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v7, :cond_3

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_3

    .line 174
    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-le v7, v8, :cond_3

    move v6, v8

    :cond_3
    if-eqz v6, :cond_4

    .line 198
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "+"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    .line 201
    :cond_4
    iget-object v6, p0, Lcom/shopkick/app/rewards/RewardCellController;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    invoke-virtual {v6, v4, p3}, Lcom/shopkick/app/util/ViewBuilder;->populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;)Z

    .line 202
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->context:Landroid/content/Context;

    .line 204
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v6, 0x7f0600c6

    invoke-virtual {p3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    .line 202
    invoke-virtual {p0, v4, v5, p3}, Lcom/shopkick/app/rewards/RewardCellController;->setAffordableRewardText(Landroid/widget/TextView;Landroid/widget/TextView;I)V

    .line 205
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ne p3, v2, :cond_5

    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RewardCellController;->isRewardAffordable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 207
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->context:Landroid/content/Context;

    .line 209
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060120

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    .line 207
    invoke-virtual {p0, v4, v5, p3}, Lcom/shopkick/app/rewards/RewardCellController;->setAffordableRewardText(Landroid/widget/TextView;Landroid/widget/TextView;I)V

    goto :goto_3

    .line 210
    :cond_5
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ne p3, v1, :cond_8

    .line 211
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 212
    invoke-virtual {p3}, Lcom/shopkick/app/rewards/RewardsDataController;->getGroupRewardIdsMapping()Ljava/util/HashMap;

    move-result-object p3

    if-eqz p3, :cond_8

    .line 215
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    if-eqz v1, :cond_6

    .line 216
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;->groupType:Ljava/lang/String;

    goto :goto_2

    :cond_6
    move-object v1, v0

    :goto_2
    if-eqz v1, :cond_8

    .line 220
    invoke-virtual {p3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    if-eqz p3, :cond_8

    .line 222
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_7
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 223
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 225
    invoke-direct {p0, v1}, Lcom/shopkick/app/rewards/RewardCellController;->isRewardAffordable(Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 226
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->context:Landroid/content/Context;

    .line 228
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060135

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    .line 226
    invoke-virtual {p0, v4, v5, p3}, Lcom/shopkick/app/rewards/RewardCellController;->setAffordableRewardText(Landroid/widget/TextView;Landroid/widget/TextView;I)V

    .line 239
    :cond_8
    :goto_3
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p3, p3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->teaserView:Lcom/shopkick/app/fetchers/api/skapi/View;

    const v1, 0x7f0905de

    .line 240
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz p3, :cond_9

    .line 242
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardCellController;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    invoke-virtual {v2, v1, p3}, Lcom/shopkick/app/util/ViewBuilder;->populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;)Z

    .line 243
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    :cond_9
    const/16 p3, 0x8

    .line 245
    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_4
    const p3, 0x7f0905cb

    .line 248
    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    const v1, 0x7f06015d

    .line 249
    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 250
    invoke-static {p3}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p3, 0x7f0905c0

    .line 252
    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    const p3, 0x7f0905dc

    .line 253
    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 256
    :cond_a
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->elementType:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x7

    if-eq p2, p3, :cond_b

    .line 257
    invoke-virtual {p1, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    .line 259
    :cond_b
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_5
    return-void
.end method

.method public setAffordableRewardText(Landroid/widget/TextView;Landroid/widget/TextView;I)V
    .locals 0

    .line 108
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setData(Ljava/util/ArrayList;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;II)V"
        }
    .end annotation

    .line 70
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardCellController;->rewardIds:Ljava/util/ArrayList;

    .line 71
    iput p2, p0, Lcom/shopkick/app/rewards/RewardCellController;->almostThereIndex:I

    .line 72
    iput p3, p0, Lcom/shopkick/app/rewards/RewardCellController;->keepEarningIndex:I

    return-void
.end method
