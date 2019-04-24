.class Lo/dlu$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu$3;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic e:Lo/dlu$3;


# direct methods
.method constructor <init>(Lo/dlu$3;I)V
    .locals 0

    .line 250
    iput-object p1, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iput p2, p0, Lo/dlu$3$5;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 253
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 254
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 256
    :cond_0
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService datas == null || datas.size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iget-object v0, v0, Lo/dlu$3;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 258
    return-void

    .line 260
    :cond_1
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService has datas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const-wide/16 v5, 0x0

    .line 262
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 263
    const-string v0, "bloodpressure_systolic"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    add-double/2addr v5, v0

    .line 264
    goto :goto_0

    .line 265
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    div-double v0, v5, v0

    double-to-int v7, v0

    .line 266
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService avgData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iget-object v0, v0, Lo/dlu$3;->b:Lo/dlu;

    iget-object v1, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iget-object v1, v1, Lo/dlu$3;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dlu;->c(Lo/dlu;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 268
    const/4 v9, 0x0

    .line 269
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 270
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v7, v0, :cond_3

    iget v0, p0, Lo/dlu$3$5;->c:I

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget v0, p0, Lo/dlu$3$5;->c:I

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 271
    const/4 v9, 0x1

    .line 269
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 274
    :cond_4
    if-eqz v9, :cond_5

    .line 275
    iget-object v0, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iget-object v0, v0, Lo/dlu$3;->e:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_2

    .line 277
    :cond_5
    iget-object v0, p0, Lo/dlu$3$5;->e:Lo/dlu$3;

    iget-object v0, v0, Lo/dlu$3;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 280
    :goto_2
    return-void
.end method
