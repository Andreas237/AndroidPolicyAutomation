.class Lo/dgt$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgt;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lo/dgt$2;->a:Lo/dgt;

    iput-object p2, p0, Lo/dgt$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 30

    .line 218
    move-object/from16 v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 219
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 220
    :cond_0
    return-void

    .line 223
    :cond_1
    const/16 v0, 0x4e22

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 224
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 226
    const/16 v0, 0x4e23

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 227
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .line 229
    const/16 v0, 0x4e24

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 230
    move-object v10, v9

    check-cast v10, Ljava/util/List;

    .line 232
    const/16 v0, 0x4e25

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 233
    move-object v12, v11

    check-cast v12, Ljava/util/List;

    .line 235
    const/16 v0, 0x55f3

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 236
    move-object v14, v13

    check-cast v14, Ljava/util/List;

    .line 238
    const/16 v0, 0x55f1

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 239
    move-object/from16 v16, v15

    check-cast v16, Ljava/util/List;

    .line 241
    const/16 v0, 0x55f2

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 242
    move-object/from16 v18, v17

    check-cast v18, Ljava/util/List;

    .line 245
    const/16 v0, 0x5658

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 246
    move-object/from16 v20, v19

    check-cast v20, Ljava/util/List;

    .line 249
    const/16 v0, 0x5657

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 250
    move-object/from16 v22, v21

    check-cast v22, Ljava/util/List;

    .line 253
    const/16 v0, 0x5655

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v23

    .line 254
    move-object/from16 v24, v23

    check-cast v24, Ljava/util/List;

    .line 257
    const/16 v0, 0x5656

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v25

    .line 258
    move-object/from16 v26, v25

    check-cast v26, Ljava/util/List;

    .line 261
    const/16 v0, 0x5659

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v27

    .line 262
    move-object/from16 v28, v27

    check-cast v28, Ljava/util/List;

    .line 264
    new-instance v29, Ljava/util/ArrayList;

    invoke-direct/range {v29 .. v29}, Ljava/util/ArrayList;-><init>()V

    .line 265
    move-object/from16 v0, v29

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    move-object/from16 v0, v29

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    move-object/from16 v0, v29

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    move-object/from16 v0, v29

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_2

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_2
    const/4 v0, 0x0

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_3

    .line 272
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_3
    const/4 v0, 0x0

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_4

    .line 273
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_4
    const/4 v0, 0x0

    move-object/from16 v1, v28

    if-eq v0, v1, :cond_6

    .line 274
    invoke-interface/range {v28 .. v28}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 275
    :cond_5
    invoke-static {}, Lo/dgt;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodayDetailSegentDat get core sleep."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    move-object/from16 v0, v29

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    move-object/from16 v0, v29

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    move-object/from16 v0, v29

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    move-object/from16 v0, v29

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    move-object/from16 v0, v29

    move-object/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 282
    :cond_6
    move-object/from16 v0, v29

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    move-object/from16 v0, v29

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    move-object/from16 v0, v29

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgt$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    move-object/from16 v2, v29

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 288
    return-void
.end method
