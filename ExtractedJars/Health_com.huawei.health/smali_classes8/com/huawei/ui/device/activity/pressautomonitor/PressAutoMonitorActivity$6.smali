.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;I)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    iput p2, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 277
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 278
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

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z

    .line 280
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCalibrated() =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z

    .line 283
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

    const-string v3, "  isCalibrated()   false"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :goto_0
    iget v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->e:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 289
    const/4 v4, 0x1

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->g(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Lo/enz;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Lo/enz;)Lo/enz;

    .line 293
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->g(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Lo/enz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enz;->b(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->g(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;->b:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/enz;->c(Z)V

    .line 295
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 296
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->fv:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 300
    :cond_2
    return-void
.end method
