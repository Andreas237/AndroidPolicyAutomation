.class Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

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

    .line 98
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 6

    .line 81
    move-object v4, p1

    .line 82
    move-object v5, p2

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;Lo/acl;Lo/afz;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 91
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$300()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " activity is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_0
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 6

    .line 123
    move-object v4, p1

    .line 124
    move v5, p2

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;Lo/acl;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 133
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$300()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " activity is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_0
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 103
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 6

    .line 107
    move-object v4, p1

    .line 108
    move v5, p2

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$2;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;Lo/acl;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 117
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$300()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " activity is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_0
    return-void
.end method
