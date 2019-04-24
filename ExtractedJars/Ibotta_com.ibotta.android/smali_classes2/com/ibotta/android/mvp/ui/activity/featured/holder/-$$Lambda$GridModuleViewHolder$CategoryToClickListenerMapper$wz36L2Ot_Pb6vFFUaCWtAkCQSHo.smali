.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;

.field private final synthetic f$1:Lcom/ibotta/api/model/retailer/Category;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;->f$0:Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;->f$1:Lcom/ibotta/api/model/retailer/Category;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;->f$0:Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$GridModuleViewHolder$CategoryToClickListenerMapper$wz36L2Ot_Pb6vFFUaCWtAkCQSHo;->f$1:Lcom/ibotta/api/model/retailer/Category;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->lambda$map$0(Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;Lcom/ibotta/api/model/retailer/Category;Landroid/view/View;)V

    return-void
.end method
