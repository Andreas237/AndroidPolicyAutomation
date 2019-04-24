.class public Lcom/shopkick/app/rewards/RewardsMallListAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "RewardsMallListAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IImageControllerCallback2;


# static fields
.field public static NUM_COLS:I = 0x2


# instance fields
.field private detailsLoading:Z

.field private imageController:Lcom/shopkick/app/controllers/ListImageController2;

.field private listView:Landroid/widget/ListView;

.field private nonFeaturedRewardIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

.field rewardControllerView:Landroid/view/View;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private rewardsMallScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardsMallScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;Lcom/shopkick/app/rewards/RewardsMallScreen;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/util/ViewBuilder;Lcom/shopkick/app/points/ProfilePoints;)V
    .locals 9

    .line 40
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->detailsLoading:Z

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 42
    iput-object p4, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 43
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->listView:Landroid/widget/ListView;

    .line 44
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsMallScreenRef:Ljava/lang/ref/WeakReference;

    .line 45
    new-instance v0, Lcom/shopkick/app/controllers/ListImageController2;

    invoke-direct {v0, p2, p0}, Lcom/shopkick/app/controllers/ListImageController2;-><init>(Landroid/widget/AbsListView;Lcom/shopkick/app/controllers/IImageControllerCallback2;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    .line 46
    new-instance p2, Lcom/shopkick/app/rewards/RewardCellController;

    move-object v1, p2

    move-object v2, p1

    move-object v4, p3

    move-object v5, p0

    move-object v6, p5

    move-object v7, p4

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/rewards/RewardCellController;-><init>(Landroid/content/Context;Landroid/view/LayoutInflater;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/rewards/RewardsMallListAdapter;Lcom/shopkick/app/util/ViewBuilder;Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/points/ProfilePoints;)V

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

    return-void
.end method


# virtual methods
.method public cancelImageLoading()V
    .locals 0

    return-void
.end method

.method public destroyAdapter()V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardCellController;->destroy()V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/ListImageController2;->cancelAll()V

    return-void
.end method

.method public getCount()I
    .locals 3

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget v1, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    div-int/2addr v0, v1

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sget v2, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->NUM_COLS:I

    rem-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getDetailsLoading()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->detailsLoading:Z

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

    invoke-virtual {v0, p2, p3, p1}, Lcom/shopkick/app/rewards/RewardCellController;->getView(Landroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardControllerView:Landroid/view/View;

    .line 100
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImages(I)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardControllerView:Landroid/view/View;

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsMallScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/rewards/RewardsMallScreen;

    if-eqz p2, :cond_0

    .line 104
    sget-object p3, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/rewards/RewardsMallScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_0
    return-object p1
.end method

.method public loadImagesForPosition(ILandroid/view/View;Z)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/rewards/RewardCellController;->fetchImages(ILandroid/view/View;Z)V

    return-void
.end method

.method public setDetailsLoading(Z)V
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->detailsLoading:Z

    return-void
.end method

.method public updateData()V
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getNonFeaturedRewardIds()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getAlmostThereIndex()I

    move-result v0

    .line 70
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v1}, Lcom/shopkick/app/rewards/RewardsDataController;->getKeepEarningIndex()I

    move-result v1

    .line 71
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardCellController:Lcom/shopkick/app/rewards/RewardCellController;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->nonFeaturedRewardIds:Ljava/util/ArrayList;

    invoke-virtual {v2, v3, v0, v1}, Lcom/shopkick/app/rewards/RewardCellController;->setData(Ljava/util/ArrayList;II)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsMallListAdapter;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->fetchCommunityReward()V

    return-void
.end method
