.class public Lcom/shopkick/app/rewards/RewardPickerAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "RewardPickerAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IImageControllerCallback2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;
    }
.end annotation


# instance fields
.field private childIds:[I

.field private context:Landroid/content/Context;

.field private imageController:Lcom/shopkick/app/controllers/ListImageController2;

.field private listView:Landroid/widget/ListView;

.field private rewardPickerScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardPickerScreen;",
            ">;"
        }
    .end annotation
.end field

.field private rewards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;"
        }
    .end annotation
.end field

.field private selectedRewardId:Ljava/lang/String;

.field private selectedRewardView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;Lcom/shopkick/app/rewards/RewardPickerScreen;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    const/4 v0, 0x4

    .line 39
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->childIds:[I

    .line 44
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->context:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->listView:Landroid/widget/ListView;

    .line 46
    new-instance p1, Lcom/shopkick/app/controllers/ListImageController2;

    invoke-direct {p1, p2, p0}, Lcom/shopkick/app/controllers/ListImageController2;-><init>(Landroid/widget/AbsListView;Lcom/shopkick/app/controllers/IImageControllerCallback2;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    .line 47
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewardPickerScreenRef:Ljava/lang/ref/WeakReference;

    return-void

    :array_0
    .array-data 4
        0x7f0905cb
        0x7f090384
        0x7f0903e7
        0x7f0900fb
    .end array-data
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardPickerAdapter;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->handleRewardClick(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private getLeftReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getRightReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private handleRewardClick(Ljava/lang/String;Landroid/view/View;)V
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardView:Landroid/view/View;

    const v1, 0x7f0900fb

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0800d7

    .line 216
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 218
    :cond_0
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0800d5

    .line 219
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 221
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    .line 222
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardView:Landroid/view/View;

    return-void
.end method

.method private populateCell(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V
    .locals 5

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/adapter/ViewHolder;

    if-nez v0, :cond_0

    .line 127
    new-instance v0, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {v0}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 128
    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 129
    new-instance v1, Lcom/shopkick/app/adapter/ViewDefaults;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->childIds:[I

    invoke-direct {v1, p1, v2}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    .line 130
    invoke-virtual {v0, v1}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 131
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/adapter/ViewHolder;->resetViewDefaults()V

    :goto_0
    const v1, 0x7f0900fb

    if-eqz p2, :cond_3

    .line 137
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v2, :cond_1

    const v2, 0x7f0905cb

    .line 138
    invoke-virtual {v0, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v2

    .line 139
    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_1
    const v2, 0x7f090384

    .line 142
    invoke-virtual {v0, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    .line 143
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->kickAmountView:Lcom/shopkick/app/fetchers/api/skapi/View;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f0903e7

    .line 145
    invoke-virtual {v0, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    const v3, 0x7f11019c

    .line 146
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 148
    invoke-virtual {v0, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    .line 149
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardView:Landroid/view/View;

    const v1, 0x7f0800d5

    .line 152
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 154
    :cond_2
    new-instance v0, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    invoke-direct {v0, p2, p0}, Lcom/shopkick/app/rewards/RewardPickerAdapter$RewardClick;-><init>(Ljava/lang/String;Lcom/shopkick/app/rewards/RewardPickerAdapter;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 156
    :cond_3
    invoke-virtual {v0, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    const/16 v0, 0x8

    .line 157
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p2, 0x0

    .line 158
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public cancelImageLoading()V
    .locals 4

    const/4 v0, 0x0

    .line 194
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->listView:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    const v2, 0x7f0905d7

    .line 197
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0905cb

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 198
    invoke-static {v1, v2}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    const v2, 0x7f0905d9

    .line 199
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 200
    invoke-static {v1, v2}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    return-void
.end method

.method public destroyAdapter()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {v0}, Lcom/shopkick/app/controllers/ListImageController2;->cancelAll()V

    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 62
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 70
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getSelectedRewardId()Ljava/lang/String;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    return-object v0
.end method

.method public getSelectedRewardName()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 275
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 276
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    if-eqz v0, :cond_1

    .line 278
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 284
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reward picked doesn\'t match any reward in the reward mall."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    if-nez p2, :cond_0

    const p2, 0x7f0c018c

    const/4 v1, 0x0

    .line 107
    invoke-virtual {v0, p2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const p3, 0x7f0905d7

    .line 110
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 111
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getLeftReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->populateCell(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    const p3, 0x7f0905d9

    .line 112
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 113
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getRightReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->populateCell(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;)V

    .line 115
    iget-object p3, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImages(I)V

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewardPickerScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardPickerScreen;

    if-eqz p1, :cond_1

    .line 118
    sget-object p3, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/rewards/RewardPickerScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_1
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public loadImagesForPosition(ILandroid/view/View;Z)V
    .locals 4

    if-nez p2, :cond_0

    return-void

    .line 177
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getLeftReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object v0

    const v1, 0x7f0905d7

    .line 178
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0905cb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 179
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 180
    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 183
    :cond_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardPickerAdapter;->getRightReward(I)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    const v0, 0x7f0905d9

    .line 184
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz p1, :cond_2

    .line 185
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 186
    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    return-void
.end method

.method public setRewards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;",
            ">;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    return-void
.end method

.method public setSelectedRewardId(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 246
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    .line 248
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 249
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    :cond_1
    if-eqz v1, :cond_4

    .line 258
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 259
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 261
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_3

    .line 262
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->rewards:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 263
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    goto :goto_0

    .line 265
    :cond_3
    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardPickerAdapter;->selectedRewardId:Ljava/lang/String;

    :cond_4
    :goto_0
    return-void
.end method
