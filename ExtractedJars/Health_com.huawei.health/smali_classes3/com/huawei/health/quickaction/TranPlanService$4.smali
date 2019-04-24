.class Lcom/huawei/health/quickaction/TranPlanService$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/quickaction/TranPlanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/quickaction/TranPlanService;


# direct methods
.method constructor <init>(Lcom/huawei/health/quickaction/TranPlanService;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/quickaction/TranPlanService$4;->c:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 119
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 120
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 122
    :sswitch_0
    invoke-static {}, Lcom/huawei/health/quickaction/TranPlanService;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_PLAN_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$4;->c:Lcom/huawei/health/quickaction/TranPlanService;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0, v1}, Lcom/huawei/health/quickaction/TranPlanService;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 124
    goto :goto_0

    .line 126
    :sswitch_1
    invoke-static {}, Lcom/huawei/health/quickaction/TranPlanService;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_PLAN_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$4;->c:Lcom/huawei/health/quickaction/TranPlanService;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/quickaction/TranPlanService;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 128
    goto :goto_0

    .line 130
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService$4;->c:Lcom/huawei/health/quickaction/TranPlanService;

    invoke-static {v0}, Lcom/huawei/health/quickaction/TranPlanService;->d(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 131
    .line 135
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x6b -> :sswitch_2
    .end sparse-switch
.end method
