.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/lang/String;)V
    .locals 0

    .line 576
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->e:Ljava/lang/String;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 579
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;Ljava/lang/String;)V

    .line 581
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 576
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->e(Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 585
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$5;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 593
    return-void
.end method
