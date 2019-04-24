.class Lo/dde$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahg$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dde;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;)V
    .locals 0

    .line 4437
    iput-object p1, p0, Lo/dde$9;->c:Lo/dde;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1

    .line 4494
    invoke-static {p1}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(I)I
    .locals 1

    .line 4474
    invoke-static {p1}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->b()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    .line 4479
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->m()V

    .line 4480
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 4441
    const/4 v4, 0x0

    .line 4443
    :try_start_0
    iget-object v0, p0, Lo/dde$9;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->c()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 4447
    goto :goto_0

    .line 4444
    :catch_0
    move-exception v5

    .line 4445
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4448
    :goto_0
    return-object v4
.end method

.method public c(I)Z
    .locals 1

    .line 4489
    invoke-static {p1}, Lo/dda;->i(I)Z

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 1

    .line 4469
    invoke-static {p1}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->i()I

    move-result v0

    return v0
.end method

.method public d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 4463
    iget-object v0, p0, Lo/dde$9;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 4454
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWearDeviceList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4455
    iget-object v0, p0, Lo/dde$9;->c:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->d(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4458
    goto :goto_0

    .line 4456
    :catch_0
    move-exception v4

    .line 4457
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4459
    :goto_0
    return-void
.end method

.method public e(I)Z
    .locals 1

    .line 4499
    invoke-static {p1}, Lo/dda;->f(I)Z

    move-result v0

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1

    .line 4504
    invoke-static {p1}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
