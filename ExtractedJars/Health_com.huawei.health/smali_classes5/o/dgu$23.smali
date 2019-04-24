.class Lo/dgu$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->c(Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:[D

.field final synthetic c:[J

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;Landroid/content/Context;[J[DLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 515
    iput-object p1, p0, Lo/dgu$23;->e:Lo/dgu;

    iput-object p2, p0, Lo/dgu$23;->a:Landroid/content/Context;

    iput-object p3, p0, Lo/dgu$23;->c:[J

    iput-object p4, p0, Lo/dgu$23;->b:[D

    iput-object p5, p0, Lo/dgu$23;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;)V"
        }
    .end annotation

    .line 518
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    :cond_0
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == clientList || clientList.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    return-void

    .line 522
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthClient;

    .line 523
    iget-object v0, p0, Lo/dgu$23;->e:Lo/dgu;

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthClient;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dgu;->e(Lo/dgu;Ljava/lang/String;)Ljava/lang/String;

    .line 524
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceUUID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dgu$23;->e:Lo/dgu;

    invoke-static {v3}, Lo/dgu;->a(Lo/dgu;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    iget-object v0, p0, Lo/dgu$23;->e:Lo/dgu;

    iget-object v1, p0, Lo/dgu$23;->a:Landroid/content/Context;

    iget-object v2, p0, Lo/dgu$23;->c:[J

    iget-object v3, p0, Lo/dgu$23;->b:[D

    iget-object v4, p0, Lo/dgu$23;->e:Lo/dgu;

    invoke-static {v4}, Lo/dgu;->a(Lo/dgu;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lo/dgu$23;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v4, 0x2

    invoke-static/range {v0 .. v6}, Lo/dgu;->c(Lo/dgu;Landroid/content/Context;[J[DILjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 527
    return-void
.end method
