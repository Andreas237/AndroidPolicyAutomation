.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->handleMessage(Landroid/os/Message;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 186
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 187
    const-string v0, "NoDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user click adjust button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 189
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    const-string v0, "havedevice"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    sget-object v0, Lo/dae;->fi:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 192
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1$5;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;->finish()V

    .line 197
    :cond_0
    return-void
.end method
