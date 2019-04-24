.class final Lo/dnj$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnj;->f(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 574
    iput-object p1, p0, Lo/dnj$10;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 577
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateBloodSugarLabel onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    const-string v4, "BloodSugar_0"

    .line 579
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 580
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 581
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateBloodSugarLabel, objData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 583
    :cond_0
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 584
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateBloodSugarLabel, objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, " datas.size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 586
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 587
    invoke-static {}, Lo/dnj;->h()[Lo/dnp;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    .line 588
    int-to-double v0, v6

    invoke-virtual {v10, v0, v1}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 589
    int-to-double v0, v6

    invoke-virtual {v10, v0, v1}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v4

    .line 590
    goto :goto_1

    .line 587
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 596
    :cond_2
    :goto_1
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateBloodSugarLabel, bloodSugarLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lo/dnj$10;->e:Landroid/content/Context;

    const-string v1, "health_blood_sugar_group_up"

    invoke-static {v0, v1, v4}, Lo/dnj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    return-void
.end method
