.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;)V
    .locals 0

    .line 668
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 671
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;I)V

    .line 672
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->b()V

    .line 673
    return-void
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 2

    .line 676
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 683
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 668
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity$7;->d(Ljava/lang/Integer;)V

    return-void
.end method
