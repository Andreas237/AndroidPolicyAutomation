.class Lo/enw$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/enw$3;


# direct methods
.method constructor <init>(Lo/enw$3;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lo/enw$3$5;->c:Lo/enw$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 332
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceListFromWear onResponse err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-wide v2, v2, Lo/enw$3;->a:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 334
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceListFromWear outtime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-wide v5, v5, Lo/enw$3;->a:J

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 336
    return-void

    .line 338
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 339
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 340
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lo/enw$3$5$2;

    invoke-direct {v1, p0}, Lo/enw$3$5$2;-><init>(Lo/enw$3$5;)V

    .line 341
    invoke-virtual {v1}, Lo/enw$3$5$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 340
    invoke-virtual {v7, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 342
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 343
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->d:Lo/enw;

    invoke-virtual {v0, v8}, Lo/enw;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 344
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->d:Lo/enw;

    invoke-virtual {v0, v8}, Lo/enw;->d(Ljava/util/List;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 345
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 346
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->d:Lo/enw;

    iget-object v1, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v1, v1, Lo/enw$3;->c:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v9, v2}, Lo/enw;->e(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V

    goto :goto_0

    .line 349
    :cond_1
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 351
    :goto_0
    goto :goto_1

    .line 353
    :cond_2
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lo/enw$3$5;->c:Lo/enw$3;

    iget-object v0, v0, Lo/enw$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 359
    :cond_3
    :goto_1
    return-void
.end method
