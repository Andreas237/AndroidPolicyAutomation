.class Lo/dlz$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->e(Landroid/content/Context;D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:D

.field final synthetic c:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;D)V
    .locals 0

    .line 757
    iput-object p1, p0, Lo/dlz$10;->c:Lo/dlz;

    iput-wide p2, p0, Lo/dlz$10;->b:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 760
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 761
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 762
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 763
    iget-wide v0, p0, Lo/dlz$10;->b:D

    cmpl-double v0, v0, v6

    if-lez v0, :cond_0

    .line 764
    iget-object v0, p0, Lo/dlz$10;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_flag"

    const-string v3, "weight_gain"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 768
    :cond_0
    iget-object v0, p0, Lo/dlz$10;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_flag"

    const-string v3, "weight_loss"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 773
    :cond_1
    :goto_0
    return-void
.end method
