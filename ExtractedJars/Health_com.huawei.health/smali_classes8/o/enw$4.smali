.class Lo/enw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lo/enw;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/enw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;)V
    .locals 0

    .line 364
    iput-object p1, p0, Lo/enw$4;->c:Lo/enw;

    iput-object p2, p0, Lo/enw$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p3, p0, Lo/enw$4;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 367
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->c()Ljava/util/List;

    move-result-object v4

    .line 368
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 369
    iget-object v0, p0, Lo/enw$4;->c:Lo/enw;

    invoke-virtual {v0, v4}, Lo/enw;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 370
    iget-object v0, p0, Lo/enw$4;->c:Lo/enw;

    invoke-virtual {v0, v4}, Lo/enw;->d(Ljava/util/List;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 371
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 372
    iget-object v0, p0, Lo/enw$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 373
    iget-object v0, p0, Lo/enw$4;->c:Lo/enw;

    iget-object v1, p0, Lo/enw$4;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lo/enw;->e(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V

    goto :goto_0

    .line 375
    :cond_0
    iget-object v0, p0, Lo/enw$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 377
    :goto_0
    goto :goto_1

    .line 378
    :cond_1
    iget-object v0, p0, Lo/enw$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 381
    :cond_2
    iget-object v0, p0, Lo/enw$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 382
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    :goto_1
    return-void
.end method
