.class Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;
.super Ljava/lang/Object;
.source "GridModuleViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CategoryToClickListenerMapper"
.end annotation


# instance fields
.field private final adapterListener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private final module:Lcom/ibotta/api/model/base/Module;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->adapterListener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->module:Lcom/ibotta/api/model/base/Module;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$1;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public static synthetic lambda$map$0(Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;Lcom/ibotta/api/model/retailer/Category;Landroid/view/View;)V
    .locals 1

    .line 58
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->adapterListener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onCategoryClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/retailer/Category;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/api/model/retailer/Category;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 57
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;Lcom/ibotta/api/model/retailer/Category;)V

    return-object v0
.end method
