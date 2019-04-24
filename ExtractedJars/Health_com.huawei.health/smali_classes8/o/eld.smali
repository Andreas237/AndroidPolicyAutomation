.class public Lo/eld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eld$b;
    }
.end annotation


# instance fields
.field protected a:Lo/elb;

.field protected b:Lo/eie;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/elg;>;"
        }
    .end annotation
.end field

.field protected e:Lo/eld$b;


# direct methods
.method public constructor <init>(Lo/eie;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eld;->c:Ljava/util/List;

    .line 31
    new-instance v0, Lo/eld$b;

    invoke-direct {v0}, Lo/eld$b;-><init>()V

    iput-object v0, p0, Lo/eld;->e:Lo/eld$b;

    .line 34
    iput-object p1, p0, Lo/eld;->b:Lo/eie;

    .line 35
    return-void
.end method

.method private a(Ljava/util/List;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/elg;>;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;"
        }
    .end annotation

    .line 262
    if-ltz p2, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p2

    if-le v1, v0, :cond_1

    :cond_0
    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 263
    :goto_0
    if-ltz p3, :cond_2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p3

    if-le v1, v0, :cond_3

    :cond_2
    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 264
    :goto_1
    if-nez v6, :cond_4

    if-eqz v7, :cond_5

    :cond_4
    const/4 v8, 0x1

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    .line 266
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eld;->b:Lo/eie;

    move-object v9, v0

    check-cast v9, Lo/eih;

    .line 267
    invoke-virtual {v9}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v10

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eld;->b:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getData()Lo/ma;

    move-result-object v11

    .line 269
    instance-of v0, v10, Lo/eka;

    if-eqz v0, :cond_6

    if-eqz v11, :cond_6

    .line 270
    invoke-virtual {v11}, Lo/ma;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 271
    invoke-virtual {v11}, Lo/ma;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_6

    .line 272
    invoke-virtual {v11}, Lo/ma;->h()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ekv;

    if-eqz v0, :cond_6

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eld;->b:Lo/eie;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {v0, v1}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v12

    .line 276
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v13

    .line 277
    const/4 v0, 0x4

    new-array v14, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v14, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v14, v1

    const/4 v0, 0x2

    aput v13, v14, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v14, v1

    .line 278
    invoke-virtual {v12, v14}, Lo/eim;->d([F)V

    .line 280
    const/4 v0, 0x2

    aget v0, v14, v0

    const/4 v1, 0x0

    aget v1, v14, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v13

    .line 281
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move v5, v13

    invoke-direct/range {v0 .. v5}, Lo/eld;->d(Ljava/util/List;IIFF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-result-object v0

    return-object v0

    .line 285
    :cond_6
    move/from16 v0, p4

    float-to-int v0, v0

    invoke-interface {v10, v0}, Lo/eih$h;->c(I)I

    move-result v12

    .line 286
    move/from16 v0, p4

    float-to-int v0, v0

    invoke-interface {v10, v0}, Lo/eih$h;->d(I)I

    move-result v13

    .line 288
    const/4 v14, 0x0

    .line 291
    if-eqz v8, :cond_a

    .line 292
    if-nez v6, :cond_7

    .line 293
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    goto :goto_3

    .line 294
    :cond_7
    if-nez v7, :cond_8

    .line 295
    move-object/from16 v0, p1

    move/from16 v1, p3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 298
    :cond_8
    :goto_3
    if-eqz v14, :cond_9

    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v12

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_9

    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v13

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_9

    .line 299
    return-object v14

    .line 302
    :cond_9
    const/4 v0, 0x0

    return-object v0

    .line 306
    :cond_a
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 307
    move-object/from16 v0, p1

    move/from16 v1, p3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 310
    if-eqz v15, :cond_b

    invoke-virtual {v15}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v12

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_b

    invoke-virtual {v15}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v13

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_b

    .line 311
    return-object v15

    .line 314
    :cond_b
    if-eqz v16, :cond_c

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v12

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_c

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    int-to-float v1, v13

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_c

    .line 315
    return-object v16

    .line 318
    :cond_c
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Ljava/util/List;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/elg;>;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;"
        }
    .end annotation

    .line 190
    iget-object v0, p0, Lo/eld;->a:Lo/elb;

    invoke-virtual {v0}, Lo/elb;->ak()F

    move-result v6

    .line 192
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v6, v5

    invoke-direct/range {v0 .. v5}, Lo/eld;->d(Ljava/util/List;IIFF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/util/List;IIFF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/elg;>;IIFF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;"
        }
    .end annotation

    .line 200
    if-ltz p2, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p2, v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 201
    :goto_0
    if-ltz p3, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p3, v0, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 202
    :goto_1
    if-nez v2, :cond_4

    if-eqz v3, :cond_5

    :cond_4
    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 204
    :goto_2
    if-eqz v4, :cond_a

    .line 206
    if-eqz v2, :cond_7

    if-nez v3, :cond_7

    .line 207
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 208
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    sub-float v0, v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 209
    cmpl-float v0, v6, p5

    if-ltz v0, :cond_6

    .line 210
    const/4 v0, 0x0

    return-object v0

    .line 212
    :cond_6
    return-object v5

    .line 215
    :cond_7
    if-nez v2, :cond_9

    if-eqz v3, :cond_9

    .line 216
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 217
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    sub-float v0, v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 218
    cmpl-float v0, v6, p5

    if-ltz v0, :cond_8

    .line 219
    const/4 v0, 0x0

    return-object v0

    .line 221
    :cond_8
    return-object v5

    .line 223
    :cond_9
    const/4 v0, 0x0

    return-object v0

    .line 231
    :cond_a
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    .line 232
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v6

    .line 233
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v6}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v1

    float-to-int v1, v1

    sub-int v7, v0, v1

    .line 236
    invoke-virtual {v6}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    sub-float v0, v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v8

    .line 237
    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    sub-float v0, v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 241
    int-to-float v0, v7

    cmpl-float v0, v0, p5

    if-lez v0, :cond_b

    cmpl-float v0, v8, p5

    if-ltz v0, :cond_b

    cmpl-float v0, v9, p5

    if-ltz v0, :cond_b

    .line 244
    const/4 v0, 0x0

    return-object v0

    .line 250
    :cond_b
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 251
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 253
    invoke-virtual {v10}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    sub-float v0, v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {v11}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    sub-float v1, v1, p4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_c

    .line 254
    return-object v10

    .line 256
    :cond_c
    return-object v11
.end method

.method private e(Lo/elb;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/elb;Ljava/util/List<Lo/elg;>;)V"
        }
    .end annotation

    .line 322
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 323
    const/4 v3, 0x0

    .line 324
    add-int/lit8 v0, v2, -0x1

    if-ltz v0, :cond_0

    add-int/lit8 v0, v2, -0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 325
    add-int/lit8 v0, v2, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/elg;

    .line 328
    :cond_0
    const/4 v4, 0x0

    .line 329
    add-int/lit8 v0, v2, 0x1

    if-ltz v0, :cond_1

    add-int/lit8 v0, v2, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 330
    add-int/lit8 v0, v2, 0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/elg;

    .line 333
    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/elg;

    .line 336
    if-eqz v3, :cond_2

    .line 337
    invoke-virtual {v3}, Lo/elg;->c()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v5}, Lo/elg;->c()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lo/elb;->e(II)Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/elg;->d(Z)V

    .line 340
    :cond_2
    if-eqz v4, :cond_3

    .line 341
    invoke-virtual {v5}, Lo/elg;->c()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v4}, Lo/elg;->c()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lo/elb;->e(II)Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/elg;->a(Z)V

    .line 322
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 344
    :cond_4
    return-void
.end method


# virtual methods
.method public a(F)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-virtual {p0, v0, p1}, Lo/eld;->b(Ljava/util/List;F)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .line 44
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eld;->a:Lo/elb;

    .line 46
    return-void
.end method

.method protected b(Ljava/util/List;F)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/elg;>;F)Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lo/eld;->a:Lo/elb;

    invoke-virtual {v0}, Lo/elb;->am()Z

    move-result v2

    .line 107
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 112
    :goto_0
    if-gt v4, v5, :cond_3

    .line 113
    add-int v0, v5, v4

    div-int/lit8 v6, v0, 0x2

    .line 115
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/elg;

    .line 118
    invoke-virtual {v7}, Lo/elg;->c()F

    move-result v0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    .line 119
    :goto_1
    if-lez v6, :cond_0

    add-int/lit8 v0, v6, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->c()F

    move-result v0

    cmpl-float v0, v0, p2

    if-nez v0, :cond_0

    .line 120
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 122
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    .line 125
    :goto_2
    if-ge v6, v5, :cond_3

    .line 126
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/elg;

    .line 127
    invoke-virtual {v7}, Lo/elg;->c()F

    move-result v0

    cmpl-float v0, v0, p2

    if-nez v0, :cond_3

    .line 128
    invoke-virtual {v7}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 136
    :cond_1
    invoke-virtual {v7}, Lo/elg;->c()F

    move-result v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_2

    .line 137
    add-int/lit8 v4, v6, 0x1

    goto :goto_3

    .line 139
    :cond_2
    add-int/lit8 v5, v6, -0x1

    .line 141
    :goto_3
    goto/16 :goto_0

    .line 142
    :cond_3
    if-le v4, v5, :cond_10

    .line 145
    if-ltz v4, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le v4, v0, :cond_5

    :cond_4
    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    .line 146
    :goto_4
    if-ltz v5, :cond_6

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le v5, v0, :cond_7

    :cond_6
    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    .line 147
    :goto_5
    if-nez v6, :cond_8

    if-eqz v7, :cond_9

    :cond_8
    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    .line 149
    :goto_6
    if-eqz v2, :cond_b

    .line 150
    invoke-direct {p0, p1, v4, v5, p2}, Lo/eld;->d(Ljava/util/List;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-result-object v9

    .line 151
    if-nez v9, :cond_a

    .line 152
    return-object v3

    .line 154
    :cond_a
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    return-object v3

    .line 158
    :cond_b
    iget-object v0, p0, Lo/eld;->b:Lo/eie;

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->Z()Lo/eih$c;

    move-result-object v0

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_d

    .line 160
    invoke-direct {p0, p1, v4, v5, p2}, Lo/eld;->a(Ljava/util/List;IIF)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-result-object v9

    .line 161
    if-nez v9, :cond_c

    .line 162
    return-object v3

    .line 164
    :cond_c
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    return-object v3

    .line 169
    :cond_d
    if-eqz v8, :cond_e

    .line 170
    return-object v3

    .line 175
    :cond_e
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 176
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/elg;

    invoke-virtual {v0}, Lo/elg;->b()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 178
    invoke-virtual {v9}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    sub-float/2addr v1, p2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_f

    .line 179
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 181
    :cond_f
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    :cond_10
    :goto_7
    return-object v3
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/elg;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    return-object v0
.end method

.method public d()Lo/eie;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/eld;->b:Lo/eie;

    return-object v0
.end method

.method public e(Lo/elb;)V
    .locals 5

    .line 51
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget-object v1, p0, Lo/eld;->b:Lo/eie;

    invoke-virtual {v0, v1, p1}, Lo/eld$b;->d(Lo/mn;Lo/elb;)V

    .line 53
    iput-object p1, p0, Lo/eld;->a:Lo/elb;

    .line 56
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 63
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->c:I

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->c:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, Lo/elb;->C()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 64
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->c:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lo/elb;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 65
    new-instance v3, Lo/elg;

    invoke-direct {v3, v2}, Lo/elg;-><init>(Lcom/github/mikephil/charting/data/Entry;)V

    .line 66
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_0
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v3, v0, Lo/eld$b;->c:I

    :goto_0
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->d:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->d:I

    iget-object v1, p0, Lo/eld;->e:Lo/eld$b;

    iget v1, v1, Lo/eld$b;->c:I

    add-int/2addr v0, v1

    if-ge v3, v0, :cond_1

    .line 72
    invoke-virtual {p1, v3}, Lo/elb;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 73
    new-instance v4, Lo/elg;

    invoke-direct {v4, v2}, Lo/elg;-><init>(Lcom/github/mikephil/charting/data/Entry;)V

    .line 74
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 79
    :cond_1
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->a:I

    if-ltz v0, :cond_2

    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->a:I

    invoke-virtual {p1}, Lo/elb;->C()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 80
    iget-object v0, p0, Lo/eld;->e:Lo/eld$b;

    iget v0, v0, Lo/eld$b;->a:I

    invoke-virtual {p1, v0}, Lo/elb;->f(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    new-instance v3, Lo/elg;

    invoke-direct {v3, v2}, Lo/elg;-><init>(Lcom/github/mikephil/charting/data/Entry;)V

    .line 83
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_2
    iget-object v0, p0, Lo/eld;->c:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lo/eld;->e(Lo/elb;Ljava/util/List;)V

    .line 89
    return-void
.end method
