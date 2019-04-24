.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->bindWeightDevice()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

.field final synthetic val$cDevice:Lo/acp;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lo/acp;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->val$cDevice:Lo/acp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 177
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 172
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 4

    .line 212
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " send user auth command- user authentication is completed- the binding of fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 182
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 5

    .line 186
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStatusChanged > status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mIsBingTimeout: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, -0x2

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send user auth command- user authentication is completed, the binding of success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Z)V

    .line 192
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;->val$cDevice:Lo/acp;

    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1$1;

    invoke-direct {v4, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$1;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/acb;->e(Ljava/lang/String;Ljava/lang/String;Lo/acp;Lo/aby;)Z

    .line 208
    :cond_0
    return-void
.end method
