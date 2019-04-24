.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;>;"
    }
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 1

    .line 651
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 652
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 653
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;Landroid/os/Message;)V
    .locals 5

    .line 657
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    .line 658
    if-nez v4, :cond_0

    .line 659
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FitHistoryActivity weakReference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    return-void

    .line 663
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 665
    :pswitch_0
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHOW_NO_FITNESS_EXERCISE_DATA_LAYOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    .line 668
    goto :goto_0

    .line 670
    :pswitch_1
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_START_FITNESS_EXERCISE_HISTORY_LIST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    .line 673
    goto :goto_0

    .line 675
    :pswitch_2
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_DOWNLOAD_DATA_TIME_OUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    .line 677
    .line 681
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 647
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;Landroid/os/Message;)V

    return-void
.end method
