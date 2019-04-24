.class public abstract Lo/eii;
.super Lo/lw;
.source "SourceFile"

# interfaces
.implements Lo/ejl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eii$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<EntryT:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>Lo/lw<TEntryT;>;Lo/ejl<TEntryT;>;"
    }
.end annotation


# instance fields
.field private q:Lo/eii$e;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TEntryT;>;"
        }
    .end annotation
.end field

.field private u:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TEntryT;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2}, Lo/lw;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eii;->t:Ljava/util/List;

    .line 40
    new-instance v0, Lo/eii$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/eii$e;-><init>(Lo/eii$1;)V

    iput-object v0, p0, Lo/eii;->q:Lo/eii$e;

    .line 494
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eii;->u:Z

    .line 44
    return-void
.end method

.method static synthetic e(Lo/eii;)Lo/eii$e;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eii;->q:Lo/eii$e;

    return-object v0
.end method


# virtual methods
.method protected abstract M()V
.end method

.method public P()Z
    .locals 1

    .line 73
    iget-object v0, p0, Lo/eii;->q:Lo/eii$e;

    invoke-virtual {v0}, Lo/eii$e;->a()Z

    move-result v0

    return v0
.end method

.method public a(FF)F
    .locals 4

    .line 392
    const v1, -0x800001

    .line 394
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 395
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-ltz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, p2

    if-gtz v0, :cond_0

    .line 396
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 397
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v1

    .line 400
    :cond_0
    goto :goto_0

    .line 401
    :cond_1
    return v1
.end method

.method public a(Lo/eih;)F
    .locals 7

    .line 454
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v1

    .line 455
    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v2

    .line 457
    const/4 v3, 0x0

    .line 458
    const/4 v4, 0x0

    .line 460
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 461
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    .line 462
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    add-float/2addr v3, v0

    .line 463
    add-int/lit8 v4, v4, 0x1

    .line 465
    :cond_0
    goto :goto_0

    .line 467
    :cond_1
    if-nez v4, :cond_2

    .line 469
    const/4 v0, 0x0

    return v0

    .line 472
    :cond_2
    int-to-float v0, v4

    div-float v5, v3, v0

    .line 474
    return v5
.end method

.method public a(Z)V
    .locals 0

    .line 501
    iput-boolean p1, p0, Lo/eii;->u:Z

    .line 502
    return-void
.end method

.method public aa()Z
    .locals 1

    .line 497
    iget-boolean v0, p0, Lo/eii;->u:Z

    return v0
.end method

.method public ab()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TEntryT;>;"
        }
    .end annotation

    .line 278
    iget-object v0, p0, Lo/eii;->t:Ljava/util/List;

    return-object v0
.end method

.method public b(Lo/eih;FF)F
    .locals 1

    .line 448
    invoke-virtual {p1, p0, p2, p3}, Lo/eih;->e(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method protected abstract b(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLo/ejp;)TEntryT;"
        }
    .end annotation
.end method

.method public c(Lo/eih;)F
    .locals 6

    .line 285
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v1

    .line 286
    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v2

    .line 288
    const v3, -0x800001

    .line 290
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 291
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    .line 292
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    .line 293
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v3

    .line 296
    :cond_0
    goto :goto_0

    .line 297
    :cond_1
    return v3
.end method

.method public c(Lo/eih;FF)F
    .locals 1

    .line 444
    invoke-virtual {p1, p0, p2, p3}, Lo/eih;->d(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method public c(Lo/eih;Lo/ejv;)F
    .locals 7

    .line 506
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v1

    .line 507
    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v2

    .line 509
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 511
    invoke-virtual {p0}, Lo/eii;->ab()Ljava/util/List;

    move-result-object v4

    .line 513
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 514
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    .line 515
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 517
    :cond_0
    goto :goto_0

    .line 518
    :cond_1
    invoke-interface {p2, v3}, Lo/ejv;->d(Ljava/util/List;)F

    move-result v0

    return v0
.end method

.method public c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V
    .locals 12

    .line 83
    invoke-virtual {p0}, Lo/eii;->ab()Ljava/util/List;

    move-result-object v10

    .line 85
    new-instance v11, Lo/eii$1;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v1, p9

    invoke-direct {v11, p0, v0, v1}, Lo/eii$1;-><init>(Lo/eii;Landroid/os/Handler;Lo/eih$g;)V

    .line 101
    new-instance v0, Lo/eii$5;

    move-object v1, p0

    move-object/from16 v2, p7

    move v3, p2

    move-object v4, v11

    move-object/from16 v5, p6

    move-object/from16 v6, p10

    move-object v7, p1

    move v8, p3

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lo/eii$5;-><init>(Lo/eii;Lo/eic;ILo/ekh;Lo/eih;Lo/ejk;Landroid/content/Context;ILo/ehe$a;)V

    invoke-virtual {v11, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 147
    new-instance v0, Lo/eii$2;

    move-object v1, p0

    move-object v2, v11

    move-object/from16 v3, p6

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lo/eii$2;-><init>(Lo/eii;Lo/ekh;Lo/eih;II)V

    invoke-virtual {v11, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 188
    new-instance v0, Lo/eii$4;

    move-object/from16 v1, p6

    invoke-direct {v0, p0, v1, v11, v10}, Lo/eii$4;-><init>(Lo/eii;Lo/eih;Lo/ekh;Ljava/util/List;)V

    invoke-virtual {v11, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 218
    invoke-virtual {v11}, Lo/ekh;->d()V

    .line 219
    return-void
.end method

.method public d(FF)F
    .locals 4

    .line 407
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 409
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 410
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-ltz v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, p2

    if-gtz v0, :cond_0

    .line 411
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 412
    invoke-virtual {v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v1

    .line 415
    :cond_0
    goto :goto_0

    .line 416
    :cond_1
    return v1
.end method

.method public d(Lo/eih;)F
    .locals 6

    .line 302
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v1

    .line 303
    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v2

    .line 305
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 307
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 308
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    .line 309
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_0

    .line 310
    invoke-virtual {v5}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v3

    .line 313
    :cond_0
    goto :goto_0

    .line 314
    :cond_1
    return v3
.end method

.method public e(Lo/eih;Lo/eih$e;)F
    .locals 7

    .line 479
    invoke-virtual {p1}, Lo/eih;->Y()F

    move-result v2

    .line 480
    invoke-virtual {p1}, Lo/eih;->ag()F

    move-result v3

    .line 482
    const/4 v4, 0x0

    .line 484
    iget-object v0, p0, Lo/eii;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 485
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    .line 486
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-interface {p2, v1}, Lo/eih$e;->d(I)F

    move-result v1

    mul-float/2addr v0, v1

    add-float/2addr v4, v0

    .line 488
    :cond_0
    goto :goto_0

    .line 490
    :cond_1
    return v4
.end method

.method protected e(Ljava/util/List;Ljava/util/Map;IILo/eih;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TEntryT;>;Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;IILo/eih;)V"
        }
    .end annotation

    .line 224
    const v3, -0x7fffffff

    .line 229
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 230
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 232
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 233
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/ejp;

    .line 234
    const-wide/32 v0, 0xea60

    div-long v0, v7, v0

    long-to-int v10, v0

    .line 235
    instance-of v0, p0, Lo/ehs;

    if-eqz v0, :cond_0

    .line 236
    move-object v0, p0

    check-cast v0, Lo/ehs;

    invoke-virtual {v0, v10}, Lo/ehs;->i(I)I

    move-result v10

    .line 240
    :cond_0
    int-to-float v0, v10

    invoke-virtual {p0, v0, v9}, Lo/eii;->b(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    move v11, v10

    .line 244
    instance-of v0, p0, Lo/ehs;

    if-eqz v0, :cond_1

    .line 245
    invoke-static {v9}, Lo/eko;->d(Lo/ejp;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 246
    invoke-static {v9}, Lo/eko;->c(Lo/ejp;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 248
    goto :goto_0

    .line 250
    :cond_1
    if-le v11, v3, :cond_2

    if-lt v11, p3, :cond_2

    move/from16 v0, p4

    if-gt v11, v0, :cond_2

    .line 251
    move v3, v11

    .line 253
    :cond_2
    goto/16 :goto_0

    .line 256
    :cond_3
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 258
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 259
    invoke-interface {p1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 261
    if-eqz p5, :cond_6

    .line 262
    const v0, -0x7fffffff

    if-eq v3, v0, :cond_4

    invoke-virtual/range {p5 .. p5}, Lo/eih;->K()Z

    move-result v0

    if-nez v0, :cond_4

    .line 264
    int-to-float v0, v3

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lo/eih;->b(FZ)V

    goto :goto_1

    .line 265
    :cond_4
    const v0, -0x7fffffff

    if-ne v3, v0, :cond_5

    invoke-virtual/range {p5 .. p5}, Lo/eih;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 267
    invoke-virtual/range {p5 .. p5}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    .line 268
    invoke-virtual/range {p5 .. p5}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->h()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 267
    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lo/eih;->e(FZ)V

    .line 271
    :cond_5
    :goto_1
    invoke-virtual/range {p5 .. p5}, Lo/eih;->c()V

    .line 273
    invoke-virtual {p0}, Lo/eii;->M()V

    .line 275
    :cond_6
    return-void
.end method
