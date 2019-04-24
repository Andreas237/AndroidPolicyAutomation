.class public Lcom/shopkick/app/rewards/RewardsListAdapter;
.super Lcom/shopkick/app/view/PagingListAdapter;
.source "RewardsListAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IImageControllerCallback2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;,
        Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;,
        Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;,
        Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final CELL_RESOURCE_IDS:[I

.field private static final PAYPAL_CARD_TITLE:Ljava/lang/String; = "paypal"

.field private static final REWARD_CELL_IDS:[I


# instance fields
.field private connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

.field private context:Landroid/content/Context;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private globalArchivedRewardsTextView:Lcom/shopkick/app/widget/SKTextView;

.field private hasMoreRewards:Z

.field private imageController:Lcom/shopkick/app/controllers/ListImageController2;

.field private listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

.field private numUsedRewards:I

.field private rewardRows:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;",
            ">;"
        }
    .end annotation
.end field

.field private rewardsScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardsScreen;",
            ">;"
        }
    .end annotation
.end field

.field seeUsedButton:Lcom/shopkick/app/widget/SKButton;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private usedRewards:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    .line 56
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    .line 57
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->REWARD_CELL_IDS:[I

    return-void

    :array_0
    .array-data 4
        0x7f090410
        0x7f0905ed
    .end array-data

    :array_1
    .array-data 4
        0x7f0905bc
        0x7f090764
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/rewards/RedeemedRewardsScreen;Lcom/shopkick/app/view/SKListView;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/fetchers/network/SKConnectivityManager;Lcom/shopkick/app/application/dialog/DialogsManager;ZLcom/shopkick/app/logging/UserEventListViewCoordinator;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/shopkick/app/view/PagingListAdapter;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    .line 83
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardsScreenRef:Ljava/lang/ref/WeakReference;

    .line 84
    new-instance p1, Lcom/shopkick/app/controllers/ListImageController2;

    invoke-direct {p1, p3, p0}, Lcom/shopkick/app/controllers/ListImageController2;-><init>(Landroid/widget/AbsListView;Lcom/shopkick/app/controllers/IImageControllerCallback2;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    .line 85
    iput-object p4, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 86
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    .line 87
    iput-object p5, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    .line 88
    iput-object p6, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 89
    iput-boolean p7, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->usedRewards:Z

    .line 90
    iput-object p8, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    .line 91
    iput-object p9, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 93
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->hasMoreRewards:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RewardsListAdapter;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardsScreenRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/application/dialog/DialogsManager;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/fetchers/network/SKConnectivityManager;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->connectivityManager:Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    return-object p0
.end method

.method static synthetic access$600()[I
    .locals 1

    .line 49
    sget-object v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    return-object v0
.end method

.method private constructRewardRows(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 426
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 427
    new-instance v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Lcom/shopkick/app/rewards/RewardsListAdapter$1;)V

    .line 428
    sget-object v4, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->normal:Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    iget v4, v4, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->value:I

    iput v4, v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    move v4, v0

    .line 429
    :goto_1
    sget-object v5, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v5, v5

    if-ge v4, v5, :cond_1

    add-int v5, v1, v4

    .line 431
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_0

    .line 432
    iget-object v6, v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    aput-object v5, v6, v4

    goto :goto_2

    .line 434
    :cond_0
    iget-object v5, v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    aput-object v3, v5, v4

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 437
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    sget-object v2, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v2, v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method private getCellViewForIndex(Landroid/view/View;I)Landroid/view/View;
    .locals 1

    .line 257
    sget-object v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    aget p2, v0, p2

    .line 258
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method private getNormal(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    .line 172
    iget-object v3, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v4, 0x7f0c0190

    move-object/from16 v5, p3

    .line 173
    invoke-virtual {v3, v4, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    move v4, v2

    .line 175
    :goto_0
    sget-object v5, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v5, v5

    if-ge v4, v5, :cond_1

    .line 176
    invoke-direct {v0, v3, v4}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getCellViewForIndex(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    .line 177
    new-instance v6, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {v6}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 178
    invoke-virtual {v6, v5}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 179
    new-instance v7, Lcom/shopkick/app/adapter/ViewDefaults;

    sget-object v8, Lcom/shopkick/app/rewards/RewardsListAdapter;->REWARD_CELL_IDS:[I

    invoke-direct {v7, v5, v8}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    .line 180
    invoke-virtual {v6, v7}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 181
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    .line 186
    :cond_1
    iget-object v4, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    move v5, v2

    .line 187
    :goto_1
    sget-object v6, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v6, v6

    if-ge v5, v6, :cond_6

    .line 188
    invoke-direct {v0, v3, v5}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getCellViewForIndex(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 189
    iget-object v7, v4, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    aget-object v7, v7, v5

    .line 190
    invoke-virtual {v6}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/adapter/ViewHolder;

    const v10, 0x7f090764

    const v12, 0x7f0906cc

    const/16 v13, 0x8

    if-eqz v7, :cond_5

    const/4 v14, -0x1

    .line 192
    invoke-virtual {v6, v14}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setBackgroundColor(I)V

    .line 194
    invoke-virtual {v8, v10}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v10

    .line 195
    iget-object v14, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDate:Ljava/lang/String;

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    invoke-virtual {v8, v12}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v10

    check-cast v10, Lcom/shopkick/app/widget/SKTextView;

    .line 200
    iget-object v14, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v14

    const-string v15, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v14, v15}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v14

    .line 201
    invoke-virtual {v10, v14}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 202
    invoke-virtual {v10, v13}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 203
    iget-object v14, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-static {v14}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v14

    const/4 v15, 0x4

    const v11, 0x7f080288

    if-nez v14, :cond_4

    iget-object v14, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    const-string v9, "paypal"

    invoke-virtual {v14, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 204
    iget-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-nez v9, :cond_2

    const v9, 0x7f080286

    .line 205
    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    .line 206
    iget-object v9, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    const v11, 0x7f110489

    invoke-virtual {v9, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 207
    invoke-virtual {v10, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    const v9, 0x7f0905bc

    goto :goto_2

    .line 208
    :cond_2
    iget-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v15, :cond_3

    const v9, 0x7f080285

    .line 209
    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    .line 210
    iget-object v9, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    const v11, 0x7f11048a

    invoke-virtual {v9, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 211
    invoke-virtual {v10, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    const v9, 0x7f0905bc

    goto :goto_2

    .line 213
    :cond_3
    invoke-virtual {v8, v12}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    invoke-virtual {v10, v11}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    const-string v9, ""

    .line 215
    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v9, 0x7f0905bc

    goto :goto_2

    .line 218
    :cond_4
    invoke-virtual {v8, v12}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    invoke-virtual {v9, v13}, Landroid/widget/TextView;->setVisibility(I)V

    .line 219
    invoke-virtual {v10, v11}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    const-string v9, ""

    .line 220
    invoke-virtual {v10, v9}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v9, 0x7f0905bc

    .line 223
    :goto_2
    invoke-virtual {v8, v9}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v8

    .line 224
    sget-object v9, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 225
    invoke-virtual {v8, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v9, 0x0

    .line 226
    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 227
    invoke-static {v8}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v9

    iget-object v10, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->giftCardTileImageUrl:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v9

    invoke-virtual {v9}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 229
    new-instance v8, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v9, 0x54

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 230
    sget-object v9, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v9, v9

    mul-int/2addr v9, v1

    add-int/2addr v9, v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 231
    iget-object v9, v7, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redeemedRewardId:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRewardId(Ljava/lang/String;)V

    .line 233
    new-instance v9, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v9}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 234
    iget-object v10, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    iput-object v10, v9, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    const/4 v10, 0x1

    .line 235
    iput-boolean v10, v9, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 236
    iput-object v3, v9, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 237
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iput-object v11, v9, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 239
    iget-object v11, v0, Lcom/shopkick/app/rewards/RewardsListAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v6, v8, v11, v9}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 240
    new-instance v8, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;

    invoke-direct {v8, v0, v7}, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardClick;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)V

    invoke-virtual {v6, v8}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    invoke-virtual {v6, v10}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setClickable(Z)V

    goto :goto_3

    .line 244
    :cond_5
    invoke-virtual {v8, v10}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setVisibility(I)V

    const v7, 0x7f0905bc

    .line 245
    invoke-virtual {v8, v7}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 246
    invoke-virtual {v8, v12}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    invoke-virtual {v7, v13}, Landroid/widget/TextView;->setVisibility(I)V

    .line 247
    invoke-virtual {v6, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setBackgroundColor(I)V

    .line 248
    invoke-virtual {v6, v9}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    invoke-virtual {v6, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setClickable(Z)V

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_6
    return-object v3
.end method

.method private getSeeUsedView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 264
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c01a7

    .line 265
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 266
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 267
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 268
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 270
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    :goto_0
    const v1, 0x7f090281

    .line 273
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->seeUsedButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f090043

    .line 274
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKTextView;

    iput-object p3, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->globalArchivedRewardsTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 276
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p3, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 277
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 279
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 280
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->listViewCoordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 281
    iput-object p2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 282
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->seeUsedButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p3, v2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 286
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->seeUsedButton:Lcom/shopkick/app/widget/SKButton;

    new-instance p3, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;

    iget v1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->numUsedRewards:I

    if-lez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-direct {p3, p0, v0}, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Z)V

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 288
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->globalArchivedRewardsTextView:Lcom/shopkick/app/widget/SKTextView;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->seeUsedButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz p1, :cond_2

    .line 289
    iget p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->numUsedRewards:I

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->updateArchivedRewardsTextView(I)V

    :cond_2
    return-object p2
.end method

.method private maybeShowSeeUsedRewardsRow()V
    .locals 2

    .line 442
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->usedRewards:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    .line 443
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    iget v0, v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    sget-object v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->see_used:Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    iget v1, v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->value:I

    if-eq v0, v1, :cond_1

    .line 444
    :cond_0
    new-instance v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Lcom/shopkick/app/rewards/RewardsListAdapter$1;)V

    .line 445
    sget-object v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->see_used:Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    iget v1, v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->value:I

    iput v1, v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    .line 446
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public cancelImageLoading()V
    .locals 0

    return-void
.end method

.method clearRewards()V
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    .line 420
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->hasMoreRewards:Z

    .line 421
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->notifyMayHaveMorePages()V

    .line 422
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public destroyAdapter()V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/ListImageController2;->cancelAll()V

    const/4 v0, 0x0

    .line 100
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 130
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v0, p1, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    iget p1, p1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    return p1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public getRowView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    .line 144
    iget v1, v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    sget-object v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->normal:Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    iget v2, v2, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->value:I

    if-ne v1, v2, :cond_0

    .line 145
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getNormal(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 146
    :cond_0
    iget v0, v0, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->rowType:I

    sget-object v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->see_used:Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    iget v1, v1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->value:I

    if-ne v0, v1, :cond_1

    .line 147
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getSeeUsedView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 150
    :cond_1
    :goto_0
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImages(I)V

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardsScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    if-eqz p1, :cond_2

    .line 153
    sget-object p3, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_2
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 105
    invoke-static {}, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;->values()[Lcom/shopkick/app/rewards/RewardsListAdapter$RewardsListTypes;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public loadImagesForPosition(ILandroid/view/View;Z)V
    .locals 4

    .line 381
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 386
    :goto_0
    sget-object v1, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 387
    iget-object v1, p1, Lcom/shopkick/app/rewards/RewardsListAdapter$RewardRowData;->info:[Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    aget-object v1, v1, v0

    .line 388
    sget-object v2, Lcom/shopkick/app/rewards/RewardsListAdapter;->CELL_RESOURCE_IDS:[I

    aget v2, v2, v0

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const v3, 0x7f0905bc

    .line 392
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    .line 394
    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->giftCardTileImageUrl:Ljava/lang/String;

    invoke-virtual {v3, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method public onNextPageRequested(I)V
    .locals 0

    .line 161
    iget-boolean p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->hasMoreRewards:Z

    if-eqz p1, :cond_1

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardsScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    if-nez p1, :cond_0

    return-void

    .line 164
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->fetchNextPage()V

    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->notifyNoMorePages()V

    :goto_0
    return-void
.end method

.method refreshWithRewards(Ljava/util/ArrayList;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->rewardRows:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 409
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->constructRewardRows(Ljava/util/ArrayList;)V

    .line 410
    iput-boolean p2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->hasMoreRewards:Z

    .line 411
    iget-boolean p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->hasMoreRewards:Z

    if-nez p1, :cond_1

    .line 412
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->maybeShowSeeUsedRewardsRow()V

    .line 413
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->notifyNoMorePages()V

    .line 414
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardsListAdapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method updateArchivedRewardsTextView(I)V
    .locals 7

    .line 296
    iput p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->numUsedRewards:I

    .line 297
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->globalArchivedRewardsTextView:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 298
    iget v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->numUsedRewards:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 299
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->globalArchivedRewardsTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->context:Landroid/content/Context;

    const v5, 0x7f1105fa

    new-array v6, v2, [Ljava/lang/Object;

    aput-object v0, v6, v1

    .line 300
    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 299
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 302
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter;->seeUsedButton:Lcom/shopkick/app/widget/SKButton;

    if-eqz v0, :cond_2

    .line 303
    new-instance v3, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;

    if-lez p1, :cond_1

    move v1, v2

    :cond_1
    invoke-direct {v3, p0, v1}, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;-><init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Z)V

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method
