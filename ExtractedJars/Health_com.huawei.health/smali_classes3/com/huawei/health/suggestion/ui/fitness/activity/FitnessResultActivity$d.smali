.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V
    .locals 1

    .line 638
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 639
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 640
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 643
    const-string v0, "FitnessResultActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ".errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    .line 645
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 646
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 647
    iget-object v0, v4, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 650
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 9

    .line 654
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    .line 655
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 656
    iget-object v0, v7, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 657
    iget-object v0, v7, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 659
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_train_times:I

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    move-object v8, v0

    check-cast v8, Lo/efy;

    .line 660
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 661
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_finish_times:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 664
    :cond_1
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 636
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$d;->d(Ljava/lang/Integer;)V

    return-void
.end method
