.class Lo/dez$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dez;


# direct methods
.method public constructor <init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 2419
    iput-object p1, p0, Lo/dez$d;->d:Lo/dez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2420
    iput-object p2, p0, Lo/dez$d;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2421
    iput-boolean p3, p0, Lo/dez$d;->a:Z

    .line 2422
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 2426
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v5

    .line 2427
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setHeartZoneConfig enter "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2428
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 2429
    if-nez v6, :cond_0

    .line 2430
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHeartZoneConfig deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2431
    return-void

    .line 2434
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2435
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHeartZoneConfig is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2436
    return-void

    .line 2439
    :cond_1
    iget-boolean v0, p0, Lo/dez$d;->a:Z

    if-eqz v0, :cond_2

    .line 2440
    iget-object v0, p0, Lo/dez$d;->d:Lo/dez;

    iget-object v1, p0, Lo/dez$d;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x13

    invoke-static {v0, v2, v1}, Lo/dez;->b(Lo/dez;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2442
    :cond_2
    iget-object v0, p0, Lo/dez$d;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2444
    :goto_0
    invoke-static {v5}, Lo/dfj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 2445
    return-void
.end method
