.class Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->i()V
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
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 98
    const-string v0, "RewardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error--mWorkoutDate is null ..show only one workout record --"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->b()V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->finish()V

    .line 102
    return-void
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity;Ljava/lang/Integer;)V

    .line 107
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 95
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/RewardActivity$2;->b(Ljava/lang/Integer;)V

    return-void
.end method
