.class Lcom/huawei/health/quickaction/TranPlanService$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/quickaction/TranPlanService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/Plan;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/quickaction/TranPlanService;


# direct methods
.method constructor <init>(Lcom/huawei/health/quickaction/TranPlanService;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/health/quickaction/TranPlanService$2;->b:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 98
    invoke-static {}, Lcom/huawei/health/quickaction/TranPlanService;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "plan errorCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorInfo ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$2;->b:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-static {v0}, Lcom/huawei/health/quickaction/TranPlanService;->a(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 100
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 5

    .line 104
    if-eqz p1, :cond_0

    .line 105
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$2;->b:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-static {v0}, Lcom/huawei/health/quickaction/TranPlanService;->a(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 106
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$2;->b:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-static {v0}, Lcom/huawei/health/quickaction/TranPlanService;->a(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 107
    goto :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$2;->b:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-static {v0}, Lcom/huawei/health/quickaction/TranPlanService;->a(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 111
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 95
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lcom/huawei/health/quickaction/TranPlanService$2;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method
