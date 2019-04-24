.class Lo/dea$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dea;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dea;


# direct methods
.method constructor <init>(Lo/dea;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lo/dea$4;->d:Lo/dea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 306
    iget-object v0, p0, Lo/dea$4;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->e(Lo/dea;)Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 308
    :try_start_0
    iget-object v0, p0, Lo/dea$4;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->d(Lo/dea;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;)I

    .line 309
    iget-object v0, p0, Lo/dea$4;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 310
    iget-object v0, p0, Lo/dea$4;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->d(Lo/dea;)Landroid/content/Context;

    move-result-object v0

    .line 311
    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 312
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 310
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 313
    goto :goto_0

    .line 316
    :cond_0
    iget-object v0, p0, Lo/dea$4;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 317
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "update has device db info with 0."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 318
    const/4 v0, 0x0

    invoke-static {v0}, Lo/ddq;->a(Z)V

    goto :goto_1

    .line 320
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "update has device db info with 1."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v0, 0x1

    invoke-static {v0}, Lo/ddq;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 326
    :goto_2
    return-void
.end method
