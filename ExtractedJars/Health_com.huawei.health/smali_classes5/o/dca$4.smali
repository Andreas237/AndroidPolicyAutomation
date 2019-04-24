.class Lo/dca$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dca;->d(IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Lo/dca;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dca;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 813
    iput-object p1, p0, Lo/dca$4;->d:Lo/dca;

    iput-object p2, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-boolean p3, p0, Lo/dca$4;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4

    .line 827
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure() err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",err_msg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNormalSync:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca$4;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->e(Lo/dca;)V

    .line 829
    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;I)V

    .line 830
    iget-boolean v0, p0, Lo/dca$4;->c:Z

    if-eqz v0, :cond_0

    .line 831
    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    invoke-virtual {v0, p1}, Lo/dca;->e(I)V

    .line 833
    :cond_0
    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->b(Lo/dca;Z)Z

    .line 834
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 835
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 837
    :cond_1
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 4

    .line 840
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 841
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onProgress() progress = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 842
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x4e20

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 844
    :cond_0
    invoke-static {p1}, Lo/dca;->d(I)V

    .line 845
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 4

    .line 816
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on Success() suc_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",suc_msg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 817
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 818
    iget-object v0, p0, Lo/dca$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 820
    :cond_0
    iget-boolean v0, p0, Lo/dca$4;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 821
    iget-object v0, p0, Lo/dca$4;->d:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/dca$c;->sendEmptyMessage(I)Z

    .line 823
    :cond_1
    return-void
.end method
