.class Lo/dlf$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlf$4;


# direct methods
.method constructor <init>(Lo/dlf$4;)V
    .locals 0

    .line 540
    iput-object p1, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 543
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 544
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 545
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    .line 546
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 547
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doWeightChange starttime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget-object v0, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    iget-object v0, v0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0, v5, v6, v7, v8}, Lo/dlz;->d(DJ)V

    .line 550
    :cond_0
    iget-object v0, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    iget-object v0, v0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->d()V

    .line 551
    iget-object v0, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    iget-object v0, v0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->b()V

    .line 552
    iget-object v0, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    iget-object v0, v0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->a()V

    .line 553
    iget-object v0, p0, Lo/dlf$4$3;->c:Lo/dlf$4;

    iget-object v0, v0, Lo/dlf$4;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dlz;->c(Z)V

    .line 554
    return-void
.end method
