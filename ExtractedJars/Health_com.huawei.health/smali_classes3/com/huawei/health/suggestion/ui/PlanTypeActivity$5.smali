.class Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 179
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 181
    const/4 v0, 0x0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 187
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 176
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 191
    const-string v0, "Suggestion_PlanTypeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 193
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$5;->b:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->g(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 196
    return-void
.end method
