.class Lo/env$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/env;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/env;


# direct methods
.method constructor <init>(Lo/env;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 464
    iput-object p1, p0, Lo/env$3;->e:Lo/env;

    iput-object p2, p0, Lo/env$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 466
    iget-object v0, p0, Lo/env$3;->e:Lo/env;

    invoke-virtual {v0}, Lo/env;->c()Ljava/util/List;

    move-result-object v4

    .line 467
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 468
    :cond_0
    const-string v0, "DeviceInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateWearDeviceList health no device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    new-instance v5, Lo/enw;

    invoke-direct {v5}, Lo/enw;-><init>()V

    .line 470
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v5}, Lo/enw;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/env$3$2;

    invoke-direct {v2, p0}, Lo/env$3$2;-><init>(Lo/env$3;)V

    invoke-virtual {v0, v1, v2}, Lo/akt;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 485
    goto :goto_0

    .line 486
    :cond_1
    iget-object v0, p0, Lo/env$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 488
    :goto_0
    return-void
.end method
