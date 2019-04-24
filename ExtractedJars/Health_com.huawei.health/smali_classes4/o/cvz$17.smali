.class Lo/cvz$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->c(Lo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/duh;

.field final synthetic d:Lo/cvz;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 551
    iput-object p1, p0, Lo/cvz$17;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$17;->a:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 555
    const/4 v4, 0x0

    .line 556
    if-nez p2, :cond_1

    .line 557
    const/16 v0, 0x8

    if-ne v0, p1, :cond_0

    .line 558
    iget-object v0, p0, Lo/cvz$17;->a:Lo/duh;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 560
    :cond_0
    return-void

    .line 562
    :cond_1
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 563
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 564
    return-void

    .line 566
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 567
    const/4 v0, 0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 568
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 569
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 570
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    double-to-int v4, v0

    .line 573
    :cond_3
    iget-object v0, p0, Lo/cvz$17;->a:Lo/duh;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 574
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calorie="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    return-void
.end method
