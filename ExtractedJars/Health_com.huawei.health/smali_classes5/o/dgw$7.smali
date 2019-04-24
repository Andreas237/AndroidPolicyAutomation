.class Lo/dgw$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw;->c(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic h:Lo/dgw;


# direct methods
.method constructor <init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JIII)V
    .locals 0

    .line 478
    iput-object p1, p0, Lo/dgw$7;->h:Lo/dgw;

    iput-object p2, p0, Lo/dgw$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-wide p3, p0, Lo/dgw$7;->e:J

    iput p5, p0, Lo/dgw$7;->b:I

    iput p6, p0, Lo/dgw$7;->d:I

    iput p7, p0, Lo/dgw$7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 481
    iget-object v0, p0, Lo/dgw$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 482
    return-void

    .line 486
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 487
    :cond_1
    iget-object v0, p0, Lo/dgw$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 488
    return-void

    .line 491
    :cond_2
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 492
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    .line 493
    move-object/from16 v0, p1

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 495
    iget-object v0, p0, Lo/dgw$7;->h:Lo/dgw;

    move-object v2, v8

    iget-wide v3, p0, Lo/dgw$7;->e:J

    iget v5, p0, Lo/dgw$7;->b:I

    iget v6, p0, Lo/dgw$7;->d:I

    iget v7, p0, Lo/dgw$7;->c:I

    const/4 v1, 0x4

    invoke-static/range {v0 .. v7}, Lo/dgw;->e(Lo/dgw;ILjava/util/List;JIII)Ljava/util/List;

    move-result-object v11

    .line 496
    iget-object v0, p0, Lo/dgw$7;->h:Lo/dgw;

    move-object v2, v9

    iget-wide v3, p0, Lo/dgw$7;->e:J

    iget v5, p0, Lo/dgw$7;->b:I

    iget v6, p0, Lo/dgw$7;->d:I

    iget v7, p0, Lo/dgw$7;->c:I

    const/4 v1, 0x5

    invoke-static/range {v0 .. v7}, Lo/dgw;->e(Lo/dgw;ILjava/util/List;JIII)Ljava/util/List;

    move-result-object v12

    .line 497
    iget-object v0, p0, Lo/dgw$7;->h:Lo/dgw;

    move-object v2, v10

    iget-wide v3, p0, Lo/dgw$7;->e:J

    iget v5, p0, Lo/dgw$7;->b:I

    iget v6, p0, Lo/dgw$7;->d:I

    iget v7, p0, Lo/dgw$7;->c:I

    const/4 v1, 0x3

    invoke-static/range {v0 .. v7}, Lo/dgw;->e(Lo/dgw;ILjava/util/List;JIII)Ljava/util/List;

    move-result-object v13

    .line 499
    iget-object v0, p0, Lo/dgw$7;->h:Lo/dgw;

    iget v1, p0, Lo/dgw$7;->d:I

    invoke-static {v0, v1, v11, v12, v13}, Lo/dgw;->a(Lo/dgw;ILjava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    .line 500
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 501
    iget-object v0, p0, Lo/dgw$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v14}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 505
    :cond_3
    iget-object v0, p0, Lo/dgw$7;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 507
    :goto_0
    return-void
.end method
