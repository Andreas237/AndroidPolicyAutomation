.class Lo/akt$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/exercise/modle/IExerciseAdviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 683
    iput-object p1, p0, Lo/akt$6;->b:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 727
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->f()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 728
    return-object v1
.end method

.method public getDeviceCapability()Lorg/json/JSONObject;
    .locals 2

    .line 711
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->i()Lorg/json/JSONObject;

    move-result-object v1

    .line 712
    return-object v1
.end method

.method public getDeviceETEState(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 691
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 692
    return-void
.end method

.method public getDeviceFitnessPlanParamter(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 701
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 702
    return-void
.end method

.method public pushFitnessPlan(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 706
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 707
    return-void
.end method

.method public registerConnectionStatusChangeNotification(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 696
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 697
    return-void
.end method

.method public registerServiceConnectedListener(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 686
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 687
    return-void
.end method

.method public setMetricUnit(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 722
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->k(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 723
    return-void
.end method

.method public setRunPlanReminderSwitch(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 717
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->e(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 718
    return-void
.end method
