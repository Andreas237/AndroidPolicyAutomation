.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->onBackPressed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 401
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z

    .line 403
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCalibrated()   err_code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isCalibrated()   objData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 405
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z

    .line 406
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCalibrated()   err_code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isCalibrated()   false "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Ljava/lang/Class;)V

    goto :goto_1

    .line 411
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;->a:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Ljava/lang/Class;)V

    .line 413
    :goto_1
    return-void
.end method
