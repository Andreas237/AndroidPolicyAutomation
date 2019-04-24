.class Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 155
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DistanceMonthDetailFragment mLeftArrowIV onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment$4;->a:Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/distance/DistanceMonthDetailFragment;->d()V

    .line 157
    return-void
.end method
