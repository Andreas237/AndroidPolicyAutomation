.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 515
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 533
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 519
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 523
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i:Lo/bvk;

    invoke-virtual {v0, p1}, Lo/bvk;->a(I)I

    move-result v1

    .line 524
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 525
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;I)I

    .line 526
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    .line 528
    :cond_0
    return-void
.end method
