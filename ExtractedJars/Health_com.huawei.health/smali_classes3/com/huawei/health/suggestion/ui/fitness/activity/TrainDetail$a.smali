.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;>;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 1

    .line 2599
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 2595
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->e:Z

    .line 2597
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    .line 2600
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    .line 2601
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 2606
    const-string v0, "TrainDetail"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "down fail-- errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2608
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2609
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2610
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onFailure null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2611
    return-void

    .line 2614
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2615
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2616
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2617
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2618
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 2620
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2621
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bvb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvb;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2622
    invoke-static {v4, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/lang/String;)V

    .line 2626
    :cond_1
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwh;->a()F

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 2627
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 2628
    return-void
.end method

.method public c(JJ)V
    .locals 7

    .line 2633
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2634
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 2635
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onProgress null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2636
    return-void

    .line 2640
    :cond_0
    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2642
    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v0

    long-to-float v1, p1

    long-to-float v2, p3

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v1

    add-float/2addr v0, v1

    const v1, 0x3a83126f    # 0.001f

    sub-float v6, v0, v1

    .line 2643
    const-string v0, "TrainDetail"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onProgress--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "---contentLength--"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "-----"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2644
    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bwh;->setProgress(F)V

    .line 2646
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_1

    .line 2647
    const v6, 0x3727c5ac    # 1.0E-5f

    .line 2649
    :cond_1
    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v1, v6

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2650
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 2594
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->d(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 2666
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "down success--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2668
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2669
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2670
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback onSuccess null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2671
    return-void

    .line 2674
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback  mIsForeGround "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2675
    iget-boolean v0, v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d:Z

    if-eqz v0, :cond_2

    .line 2676
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2677
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aa(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    goto :goto_0

    .line 2679
    :cond_1
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V

    goto :goto_0

    .line 2682
    :cond_2
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2683
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 2684
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2685
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2686
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2688
    :goto_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 2689
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 2690
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 2691
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvp;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lo/bvp;

    .line 2692
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bsp;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->e(Ljava/lang/String;Ljava/lang/String;I)V

    .line 2694
    return-void
.end method

.method public e()Z
    .locals 5

    .line 2656
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2657
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2658
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadUICallback isCanceled null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2659
    const/4 v0, 0x1

    return v0

    .line 2661
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->e:Z

    return v0
.end method
