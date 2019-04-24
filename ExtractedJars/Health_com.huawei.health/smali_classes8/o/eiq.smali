.class public Lo/eiq;
.super Lo/nu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eiq$e;,
        Lo/eiq$b;,
        Lo/eiq$d;,
        Lo/eiq$a;
    }
.end annotation


# static fields
.field private static final p:Lo/eiq$e;


# instance fields
.field private q:Landroid/content/Context;

.field private r:Z

.field private s:Z

.field private t:Lo/eie;

.field private u:Lo/eiq$d;

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lo/eiq$e;

    invoke-direct {v0}, Lo/eiq$e;-><init>()V

    sput-object v0, Lo/eiq;->p:Lo/eiq$e;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/ln;Lo/nv;)V
    .locals 1

    .line 43
    invoke-direct {p0, p3, p4, p5}, Lo/nu;-><init>(Lo/oa;Lo/ln;Lo/nv;)V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eiq;->q:Landroid/content/Context;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eiq;->t:Lo/eie;

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eiq;->s:Z

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eiq;->r:Z

    .line 311
    sget-object v0, Lo/eiq$d;->a:Lo/eiq$d;

    iput-object v0, p0, Lo/eiq;->u:Lo/eiq$d;

    .line 632
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eiq;->z:F

    .line 635
    const v0, -0x800001

    iput v0, p0, Lo/eiq;->y:F

    .line 44
    iput-object p1, p0, Lo/eiq;->q:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lo/eiq;->t:Lo/eie;

    .line 46
    return-void
.end method

.method private a(F)Z
    .locals 1

    .line 607
    iget-object v0, p0, Lo/eiq;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 608
    iget v0, p0, Lo/eiq;->z:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 610
    :cond_1
    iget v0, p0, Lo/eiq;->z:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private d(FLjava/lang/String;Landroid/graphics/Paint;)F
    .locals 13

    .line 199
    iget v0, p0, Lo/eiq;->y:F

    const v1, -0x800001

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 200
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0

    .line 204
    :cond_0
    const/high16 v4, 0x430c0000    # 140.0f

    .line 206
    const/high16 v5, 0x42480000    # 50.0f

    .line 209
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 211
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    move-object/from16 v1, p3

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2, v0, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 214
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    sub-float v7, p1, v0

    .line 215
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    add-float v8, p1, v0

    .line 217
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 220
    new-instance v0, Lo/eiq$a;

    const v1, -0x800001

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    new-instance v0, Lo/eiq$a;

    const/high16 v1, -0x3bf40000    # -560.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x42480000    # 50.0f

    const/high16 v3, 0x41000000    # 8.0f

    div-float/2addr v2, v3

    const/high16 v1, -0x3d200000    # -112.0f

    const/high16 v2, 0x40c80000    # 6.25f

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    new-instance v0, Lo/eiq$a;

    const/high16 v1, -0x3c2e0000    # -420.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43160000    # 150.0f

    const/high16 v3, 0x41000000    # 8.0f

    div-float/2addr v2, v3

    const/high16 v1, -0x3d580000    # -84.0f

    const/high16 v2, 0x41960000    # 18.75f

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    new-instance v0, Lo/eiq$a;

    const/high16 v1, -0x3c740000    # -280.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43960000    # 300.0f

    const/high16 v3, 0x41100000    # 9.0f

    div-float/2addr v2, v3

    const/high16 v1, -0x3da00000    # -56.0f

    const v2, 0x42055555

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    new-instance v0, Lo/eiq$a;

    const/high16 v1, -0x3cf40000    # -140.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43c80000    # 400.0f

    const/high16 v3, 0x41100000    # 9.0f

    div-float/2addr v2, v3

    const/high16 v1, -0x3e200000    # -28.0f

    const v2, 0x4231c71c

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    new-instance v0, Lo/eiq$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v5}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    new-instance v0, Lo/eiq$a;

    const/high16 v1, 0x430c0000    # 140.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43c80000    # 400.0f

    const/high16 v3, 0x41100000    # 9.0f

    div-float/2addr v2, v3

    const/high16 v1, 0x41e00000    # 28.0f

    const v2, 0x4231c71c

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    new-instance v0, Lo/eiq$a;

    const/high16 v1, 0x438c0000    # 280.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43960000    # 300.0f

    const/high16 v3, 0x41100000    # 9.0f

    div-float/2addr v2, v3

    const/high16 v1, 0x42600000    # 56.0f

    const v2, 0x42055555

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    new-instance v0, Lo/eiq$a;

    const/high16 v1, 0x43d20000    # 420.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43160000    # 150.0f

    const/high16 v3, 0x41000000    # 8.0f

    div-float/2addr v2, v3

    const/high16 v1, 0x42a80000    # 84.0f

    const/high16 v2, 0x41960000    # 18.75f

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    new-instance v0, Lo/eiq$a;

    const/high16 v1, 0x440c0000    # 560.0f

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x42480000    # 50.0f

    const/high16 v3, 0x41000000    # 8.0f

    div-float/2addr v2, v3

    const/high16 v1, 0x42e00000    # 112.0f

    const/high16 v2, 0x40c80000    # 6.25f

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    new-instance v0, Lo/eiq$a;

    const/4 v1, 0x0

    invoke-direct {v0, v4, v1}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    new-instance v0, Lo/eiq$a;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/eiq$a;-><init>(FF)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    iget v0, p0, Lo/eiq;->y:F

    sub-float v0, v7, v0

    iget v1, p0, Lo/eiq;->y:F

    sub-float v1, v8, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 236
    const/4 v0, 0x0

    invoke-direct {p0, v9, v0}, Lo/eiq;->d(Ljava/util/List;F)F

    move-result v10

    goto :goto_0

    .line 238
    :cond_1
    iget v0, p0, Lo/eiq;->y:F

    sub-float v0, v7, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-direct {p0, v9, v0}, Lo/eiq;->d(Ljava/util/List;F)F

    move-result v11

    .line 239
    iget v0, p0, Lo/eiq;->y:F

    sub-float v0, v8, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-direct {p0, v9, v0}, Lo/eiq;->d(Ljava/util/List;F)F

    move-result v12

    .line 242
    cmpl-float v0, v11, v12

    if-ltz v0, :cond_2

    .line 243
    move v10, v11

    goto :goto_0

    .line 245
    :cond_2
    move v10, v12

    .line 249
    :goto_0
    return v10
.end method

.method private d(Ljava/util/List;F)F
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eiq$a;>;F)F"
        }
    .end annotation

    .line 281
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v3

    .line 282
    const/4 v4, 0x0

    .line 283
    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eiq$a;

    .line 285
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 286
    goto :goto_1

    .line 289
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eiq$a;

    .line 291
    const/4 v7, 0x0

    .line 293
    iget v0, v5, Lo/eiq$a;->b:F

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    iget v0, v6, Lo/eiq$a;->b:F

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_1

    .line 294
    const/4 v7, 0x1

    .line 296
    :cond_1
    if-nez v7, :cond_2

    .line 297
    goto :goto_0

    .line 300
    :cond_2
    iget v0, v6, Lo/eiq$a;->d:F

    iget v1, v5, Lo/eiq$a;->d:F

    sub-float/2addr v0, v1

    iget v1, v6, Lo/eiq$a;->b:F

    iget v2, v5, Lo/eiq$a;->b:F

    sub-float/2addr v1, v2

    div-float v8, v0, v1

    .line 301
    iget v0, v5, Lo/eiq$a;->b:F

    sub-float v0, p2, v0

    mul-float/2addr v0, v8

    iget v1, v5, Lo/eiq$a;->d:F

    add-float v4, v0, v1

    .line 302
    goto :goto_0

    .line 304
    :cond_3
    :goto_1
    return v4
.end method

.method private e(FLjava/lang/String;Landroid/graphics/Paint;)F
    .locals 3

    .line 253
    invoke-direct {p0, p1, p2, p3}, Lo/eiq;->d(FLjava/lang/String;Landroid/graphics/Paint;)F

    move-result v1

    .line 254
    iget-object v0, p0, Lo/eiq;->t:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->G()Lo/ehi;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehi;->k()F

    move-result v2

    .line 255
    add-float v0, v1, v2

    return v0
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;FFLo/nz;ZFF)V
    .locals 16

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    .line 556
    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eih$u;

    .line 558
    move-object/from16 v0, p0

    iget v0, v0, Lo/eiq;->z:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 559
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lo/eiq;->z:F

    .line 562
    :cond_0
    const/4 v8, 0x0

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    move/from16 v1, p6

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v0, v2}, Lo/eih$u;->c(FLo/ln;Z)Ljava/lang/String;

    move-result-object v9

    .line 566
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 567
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v9}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float v10, v0, v1

    .line 569
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 571
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eiq;->a(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 572
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v9}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v10

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_0

    .line 574
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move/from16 v3, p2

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v9}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v10

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 576
    :goto_0
    const/4 v8, 0x1

    .line 582
    :cond_2
    if-nez v8, :cond_5

    if-eqz p5, :cond_5

    .line 584
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    move/from16 v1, p6

    const/4 v2, 0x1

    invoke-virtual {v7, v1, v0, v2}, Lo/eih$u;->c(FLo/ln;Z)Ljava/lang/String;

    move-result-object v10

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v10}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float v11, v0, v1

    .line 587
    const/16 v12, 0x2d0

    .line 588
    const/high16 v0, 0x44340000    # 720.0f

    sub-float v13, p6, v0

    .line 589
    const/high16 v0, 0x44340000    # 720.0f

    add-float v14, p6, v0

    .line 590
    const/4 v0, 0x4

    new-array v15, v0, [F

    const/4 v0, 0x0

    aput v13, v15, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v15, v1

    const/4 v0, 0x2

    aput v14, v15, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v15, v1

    .line 591
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->e:Lo/nv;

    invoke-virtual {v0, v15}, Lo/nv;->e([F)V

    .line 592
    move/from16 v0, p6

    invoke-virtual {v7, v0}, Lo/eih$u;->b(F)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 594
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eiq;->a(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 595
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_1

    .line 597
    :cond_3
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move/from16 v3, p2

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_1

    .line 601
    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 604
    :cond_5
    :goto_1
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;FLo/nz;)V
    .locals 22

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->C()F

    move-result v8

    .line 321
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->b()Z

    move-result v9

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    mul-int/lit8 v0, v0, 0x2

    new-array v10, v0, [F

    .line 325
    const/4 v11, 0x0

    :goto_0
    array-length v0, v10

    if-ge v11, v0, :cond_1

    .line 328
    if-eqz v9, :cond_0

    .line 329
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    iget-object v0, v0, Lo/ln;->c:[F

    div-int/lit8 v1, v11, 0x2

    aget v0, v0, v1

    aput v0, v10, v11

    goto :goto_1

    .line 332
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    iget-object v0, v0, Lo/ln;->a:[F

    div-int/lit8 v1, v11, 0x2

    aget v0, v0, v1

    aput v0, v10, v11

    .line 325
    :goto_1
    add-int/lit8 v11, v11, 0x2

    goto :goto_0

    .line 336
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->e:Lo/nv;

    invoke-virtual {v0, v10}, Lo/nv;->e([F)V

    .line 338
    const/4 v11, 0x1

    .line 340
    const/4 v12, 0x0

    .line 341
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 342
    const-string v14, ""

    .line 343
    sget-object v15, Lo/eiq;->p:Lo/eiq$e;

    .line 345
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 346
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 348
    const/16 v18, 0x0

    :goto_2
    array-length v0, v10

    move/from16 v1, v18

    if-ge v1, v0, :cond_7

    .line 350
    aget v19, v10, v18

    .line 352
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->l:Lo/oa;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/oa;->c(F)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eiq;->i:Lo/ln;

    iget-object v1, v1, Lo/ln;->a:[F

    div-int/lit8 v2, v18, 0x2

    aget v1, v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/eiq;->i:Lo/ln;

    invoke-interface {v0, v1, v2}, Lo/mf;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v20

    .line 356
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->D()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 362
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x2

    move/from16 v1, v18

    if-ne v1, v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    iget v0, v0, Lo/ln;->d:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 363
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v1, v0

    move/from16 v21, v1

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->b()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    cmpl-float v0, v21, v0

    if-lez v0, :cond_2

    add-float v0, v19, v21

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eiq;->l:Lo/oa;

    .line 366
    invoke-virtual {v1}, Lo/oa;->o()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 367
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v21, v0

    sub-float v19, v19, v0

    .line 370
    :cond_2
    goto :goto_3

    :cond_3
    if-nez v18, :cond_4

    .line 372
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v1, v0

    move/from16 v21, v1

    .line 373
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v21, v0

    add-float v19, v19, v0

    .line 378
    :cond_4
    :goto_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/eiq;->y:F

    sub-float v0, v19, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v13

    if-gez v0, :cond_5

    .line 379
    move-object/from16 v0, p0

    iget v0, v0, Lo/eiq;->y:F

    sub-float v0, v0, v19

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v13

    .line 380
    move/from16 v12, v19

    .line 381
    move-object/from16 v14, v20

    .line 382
    new-instance v0, Lo/eiq$e;

    move-object/from16 v1, p1

    move/from16 v2, v19

    move/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move-object/from16 v6, p0

    iget-object v6, v6, Lo/eiq;->i:Lo/ln;

    iget-object v6, v6, Lo/ln;->a:[F

    div-int/lit8 v7, v18, 0x2

    aget v6, v6, v7

    move v7, v8

    invoke-direct/range {v0 .. v7}, Lo/eiq$e;-><init>(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    move-object v15, v0

    .line 385
    :cond_5
    new-instance v0, Lo/eiq$b;

    move-object/from16 v1, p0

    move/from16 v2, v19

    move/from16 v3, p2

    move-object/from16 v4, v20

    invoke-virtual {v1, v2, v3, v4}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    move/from16 v3, v19

    move-object/from16 v5, p3

    move v6, v8

    invoke-direct/range {v0 .. v6}, Lo/eiq$b;-><init>(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 388
    new-instance v0, Lo/eiq$e;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eiq;->i:Lo/ln;

    iget-object v1, v1, Lo/ln;->a:[F

    div-int/lit8 v2, v18, 0x2

    aget v6, v1, v2

    move-object/from16 v1, p1

    move/from16 v2, v19

    move/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move v7, v8

    invoke-direct/range {v0 .. v7}, Lo/eiq$e;-><init>(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    const/4 v11, 0x0

    .line 348
    :cond_6
    add-int/lit8 v18, v18, 0x2

    goto/16 :goto_2

    .line 394
    :cond_7
    const/16 v18, 0x0

    .line 396
    move-object/from16 v0, p0

    iget v0, v0, Lo/eiq;->y:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_8

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->t:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->R()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 398
    const/16 v18, 0x1

    .line 401
    :cond_8
    if-eqz v18, :cond_9

    .line 402
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v14

    move v3, v12

    move-object/from16 v4, p0

    move/from16 v5, p2

    invoke-virtual {v4, v12, v5, v14}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v5, p3

    move v6, v8

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->d(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 404
    sget-object v0, Lo/eiq;->p:Lo/eiq$e;

    if-eq v15, v0, :cond_9

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v19

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v20

    .line 408
    const-string v0, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v21

    .line 409
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 412
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v15, Lo/eiq$e;->a:F

    iget v3, v15, Lo/eiq$e;->b:F

    iget-object v4, v15, Lo/eiq$e;->e:Lo/nz;

    iget-boolean v5, v15, Lo/eiq$e;->d:Z

    iget v6, v15, Lo/eiq$e;->f:F

    iget v7, v15, Lo/eiq$e;->g:F

    invoke-virtual/range {v0 .. v7}, Lo/eiq;->e(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    .line 414
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 415
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 419
    :cond_9
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/eiq$b;

    .line 421
    if-eqz v18, :cond_a

    move-object/from16 v0, v20

    iget v0, v0, Lo/eiq$b;->d:F

    .line 422
    invoke-static {v0, v12}, Lo/ekl;->a(FF)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v0, v20

    iget v0, v0, Lo/eiq$b;->a:F

    .line 423
    move-object/from16 v1, p0

    move/from16 v2, p2

    invoke-virtual {v1, v12, v2, v14}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v1

    invoke-static {v0, v1}, Lo/ekl;->a(FF)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 424
    goto :goto_4

    .line 426
    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    iget-object v1, v1, Lo/eiq$b;->c:Landroid/graphics/Canvas;

    move-object/from16 v2, v20

    iget-object v2, v2, Lo/eiq$b;->e:Ljava/lang/String;

    move-object/from16 v3, v20

    iget v3, v3, Lo/eiq$b;->d:F

    move-object/from16 v4, v20

    iget v4, v4, Lo/eiq$b;->a:F

    move-object/from16 v5, v20

    iget-object v5, v5, Lo/eiq$b;->b:Lo/nz;

    move-object/from16 v6, v20

    iget v6, v6, Lo/eiq$b;->g:F

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 427
    goto :goto_4

    .line 431
    :cond_b
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_5
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/eiq$e;

    .line 433
    if-eqz v18, :cond_c

    move-object/from16 v0, v20

    iget v0, v0, Lo/eiq$e;->a:F

    .line 434
    invoke-static {v0, v12}, Lo/ekl;->a(FF)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 435
    goto :goto_5

    .line 437
    :cond_c
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    iget-object v1, v1, Lo/eiq$e;->c:Landroid/graphics/Canvas;

    move-object/from16 v2, v20

    iget v2, v2, Lo/eiq$e;->a:F

    move-object/from16 v3, v20

    iget v3, v3, Lo/eiq$e;->b:F

    move-object/from16 v4, v20

    iget-object v4, v4, Lo/eiq$e;->e:Lo/nz;

    move-object/from16 v5, v20

    iget-boolean v5, v5, Lo/eiq$e;->d:Z

    move-object/from16 v6, v20

    iget v6, v6, Lo/eiq$e;->f:F

    move-object/from16 v7, v20

    iget v7, v7, Lo/eiq$e;->g:F

    invoke-virtual/range {v0 .. v7}, Lo/eiq;->e(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    .line 442
    goto :goto_5

    .line 445
    :cond_d
    return-void
.end method

.method public a(Lo/eiq$d;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lo/eiq;->u:Lo/eiq$d;

    .line 309
    return-void
.end method

.method public b(F)V
    .locals 0

    .line 638
    iput p1, p0, Lo/eiq;->y:F

    .line 639
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 127
    iput-boolean p1, p0, Lo/eiq;->s:Z

    .line 128
    return-void
.end method

.method public c()Lo/eiq$d;
    .locals 1

    .line 259
    iget-object v0, p0, Lo/eiq;->u:Lo/eiq$d;

    return-object v0
.end method

.method protected c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V
    .locals 7

    .line 176
    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    iget-object v4, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object v5, p5

    move v6, p6

    invoke-static/range {v0 .. v6}, Lo/oc;->d(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;Lo/nz;F)V

    .line 178
    return-void
.end method

.method protected d(FF)V
    .locals 15

    .line 50
    iget-boolean v0, p0, Lo/eiq;->r:Z

    if-nez v0, :cond_0

    .line 51
    move/from16 v0, p1

    move/from16 v1, p2

    invoke-super {p0, v0, v1}, Lo/nu;->d(FF)V

    .line 52
    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    const/4 v1, 0x0

    iput v1, v0, Lo/lh;->e:I

    .line 57
    const/16 p1, 0x0

    .line 59
    sub-float v0, p2, p1

    const/high16 v1, 0x42700000    # 60.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 60
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    const/4 v1, 0x1

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    iput-object v1, v0, Lo/lh;->a:[F

    .line 61
    invoke-virtual {p0}, Lo/eiq;->d()V

    .line 62
    return-void

    .line 65
    :cond_1
    const/high16 v0, 0x42700000    # 60.0f

    div-float v4, p2, v0

    .line 67
    sub-float v0, p2, p1

    const/high16 v1, 0x43960000    # 300.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    .line 68
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    float-to-double v1, v4

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/lh;->d:I

    .line 69
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    iget-object v1, p0, Lo/eiq;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 70
    const/4 v5, 0x0

    :goto_0
    float-to-double v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    if-gt v5, v0, :cond_2

    .line 71
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    mul-int/lit8 v1, v5, 0x3c

    int-to-float v1, v1

    aput v1, v0, v5

    .line 70
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {p0}, Lo/eiq;->d()V

    .line 74
    return-void

    .line 77
    :cond_3
    const/high16 v0, 0x40a00000    # 5.0f

    div-float v0, v4, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 78
    int-to-float v0, v5

    const/high16 v1, 0x40a00000    # 5.0f

    div-float v6, v0, v1

    .line 79
    float-to-double v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v7, v0

    .line 80
    float-to-double v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    .line 82
    mul-int/lit8 v9, v7, 0x5

    .line 83
    mul-int/lit8 v10, v8, 0x5

    .line 85
    float-to-double v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    int-to-double v2, v9

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v11, v0

    .line 86
    float-to-double v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    int-to-double v2, v10

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 90
    add-int/lit8 v0, v11, -0x6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v1, v12, -0x6

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gt v0, v1, :cond_4

    .line 91
    move v13, v9

    goto :goto_1

    .line 93
    :cond_4
    move v13, v10

    .line 96
    :goto_1
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    int-to-float v1, v13

    div-float v1, v4, v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/lh;->d:I

    .line 97
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    iget-object v1, p0, Lo/eiq;->c:Lo/lh;

    iget v1, v1, Lo/lh;->d:I

    new-array v1, v1, [F

    iput-object v1, v0, Lo/lh;->a:[F

    .line 98
    const/4 v14, 0x0

    :goto_2
    int-to-float v0, v13

    div-float v0, v4, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    if-gt v14, v0, :cond_5

    .line 99
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    iget-object v0, v0, Lo/lh;->a:[F

    mul-int v1, v14, v13

    mul-int/lit8 v1, v1, 0x3c

    int-to-float v1, v1

    aput v1, v0, v14

    .line 98
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 101
    :cond_5
    invoke-virtual {p0}, Lo/eiq;->d()V

    .line 102
    return-void

    nop

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method protected d(Landroid/graphics/Canvas;FFLo/nz;ZFF)V
    .locals 16

    .line 503
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v7

    .line 505
    move-object/from16 v0, p0

    iget v0, v0, Lo/eiq;->z:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 506
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lo/eiq;->z:F

    .line 509
    :cond_0
    const/4 v8, 0x0

    .line 511
    move-object v0, v7

    check-cast v0, Lo/eih$q;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eiq;->i:Lo/ln;

    move/from16 v2, p6

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/eih$q;->a(FLo/lh;Z)Ljava/lang/String;

    move-result-object v9

    .line 513
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 514
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v9}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float v10, v0, v1

    .line 516
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 518
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eiq;->a(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v9}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v10

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_0

    .line 521
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move/from16 v3, p2

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v9}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v10

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 523
    :goto_0
    const/4 v8, 0x1

    .line 529
    :cond_2
    if-nez v8, :cond_5

    if-eqz p5, :cond_5

    .line 531
    move-object v0, v7

    check-cast v0, Lo/eih$q;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/eiq;->i:Lo/ln;

    move/from16 v2, p6

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lo/eih$q;->a(FLo/lh;Z)Ljava/lang/String;

    move-result-object v10

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v10}, Lo/oc;->e(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float v11, v0, v1

    .line 534
    const/16 v12, 0x2d0

    .line 535
    const/high16 v0, 0x44340000    # 720.0f

    sub-float v13, p6, v0

    .line 536
    const/high16 v0, 0x44340000    # 720.0f

    add-float v14, p6, v0

    .line 537
    const/4 v0, 0x4

    new-array v15, v0, [F

    const/4 v0, 0x0

    aput v13, v15, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v15, v1

    const/4 v0, 0x2

    aput v14, v15, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v15, v1

    .line 538
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/eiq;->e:Lo/nv;

    invoke-virtual {v0, v15}, Lo/nv;->e([F)V

    .line 539
    move-object v0, v7

    check-cast v0, Lo/eih$q;

    move/from16 v1, p6

    invoke-virtual {v0, v1}, Lo/eih$q;->a(F)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 541
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v1}, Lo/eiq;->a(F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 542
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_1

    .line 544
    :cond_3
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move/from16 v3, p2

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_1

    .line 548
    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move-object/from16 v3, p0

    iget v3, v3, Lo/eiq;->z:F

    move-object/from16 v4, p0

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual {v4, v5, v6, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    sub-float/2addr v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 551
    :cond_5
    :goto_1
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;FLo/nz;)V
    .locals 2

    .line 106
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    instance-of v0, v0, Lo/eio;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    check-cast v0, Lo/eio;

    invoke-virtual {v0}, Lo/eio;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lo/eiq;->c:Lo/lh;

    iget v0, v0, Lo/lh;->u:F

    iget-object v1, p0, Lo/eiq;->c:Lo/lh;

    iget v1, v1, Lo/lh;->q:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iget-boolean v0, p0, Lo/eiq;->s:Z

    if-eqz v0, :cond_1

    .line 116
    invoke-virtual {p0, p1, p2, p3}, Lo/eiq;->e(Landroid/graphics/Canvas;FLo/nz;)V

    .line 117
    return-void

    .line 119
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lo/eiq;->a(Landroid/graphics/Canvas;FLo/nz;)V

    .line 120
    return-void
.end method

.method protected d(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V
    .locals 10

    .line 185
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v7

    .line 186
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v8

    .line 187
    const-string v0, "sans-serif-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v9

    .line 188
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 189
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 191
    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    iget-object v4, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    move-object v5, p5

    move/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lo/oc;->d(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;Lo/nz;F)V

    .line 193
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 194
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 195
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 131
    iput-boolean p1, p0, Lo/eiq;->r:Z

    .line 132
    return-void
.end method

.method protected e(FFLjava/lang/String;)F
    .locals 4

    .line 617
    move v2, p2

    .line 619
    iget-object v0, p0, Lo/eiq;->u:Lo/eiq$d;

    sget-object v1, Lo/eiq$d;->a:Lo/eiq$d;

    if-ne v0, v1, :cond_0

    .line 620
    iget-object v0, p0, Lo/eiq;->t:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->G()Lo/ehi;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehi;->h()F

    move-result v3

    .line 622
    add-float v2, p2, v3

    .line 623
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/eiq;->u:Lo/eiq$d;

    sget-object v1, Lo/eiq$d;->b:Lo/eiq$d;

    if-ne v0, v1, :cond_1

    .line 625
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-direct {p0, p1, p3, v0}, Lo/eiq;->e(FLjava/lang/String;Landroid/graphics/Paint;)F

    move-result v0

    sub-float v0, p2, v0

    iget-object v1, p0, Lo/eiq;->i:Lo/ln;

    iget v1, v1, Lo/ln;->I:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40200000    # 2.5f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    sub-float v2, v0, v1

    .line 628
    :cond_1
    :goto_0
    return v2
.end method

.method protected e(Landroid/graphics/Canvas;FFLo/nz;ZFF)V
    .locals 2

    .line 490
    iget-object v0, p0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->r()Lo/mf;

    move-result-object v1

    .line 491
    instance-of v0, p0, Lo/eil;

    if-nez v0, :cond_0

    .line 492
    return-void

    .line 494
    :cond_0
    instance-of v0, v1, Lo/eih$q;

    if-eqz v0, :cond_1

    .line 495
    invoke-virtual/range {p0 .. p7}, Lo/eiq;->d(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    goto :goto_0

    .line 496
    :cond_1
    instance-of v0, v1, Lo/eih$u;

    if-eqz v0, :cond_2

    .line 497
    invoke-virtual/range {p0 .. p7}, Lo/eiq;->a(Landroid/graphics/Canvas;FFLo/nz;ZFF)V

    .line 499
    :cond_2
    :goto_0
    return-void
.end method

.method protected e(Landroid/graphics/Canvas;FLo/nz;)V
    .locals 15

    .line 138
    iget-object v0, p0, Lo/eiq;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v0

    iget v7, v0, Landroid/graphics/RectF;->left:F

    .line 139
    iget-object v0, p0, Lo/eiq;->l:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v0

    iget v8, v0, Landroid/graphics/RectF;->right:F

    .line 140
    iget-object v0, p0, Lo/eiq;->i:Lo/ln;

    invoke-virtual {v0}, Lo/ln;->C()F

    move-result v9

    .line 143
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 145
    const-string v11, "--"

    .line 147
    iget-object v0, p0, Lo/eiq;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    .line 148
    if-eqz v12, :cond_0

    .line 149
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_detail_chart_less_1:I

    invoke-virtual {v12, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 153
    :cond_0
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v10}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v13, v0

    .line 154
    iget-object v0, p0, Lo/eiq;->a:Landroid/graphics/Paint;

    invoke-static {v0, v11}, Lo/oc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v14, v0

    .line 156
    iget-object v0, p0, Lo/eiq;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v13, v0

    add-float/2addr v7, v0

    .line 159
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v14, v0

    sub-float/2addr v8, v0

    .line 160
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move v3, v7

    move/from16 v4, p2

    invoke-virtual {p0, v7, v4, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v5, p3

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 161
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v11

    move v3, v8

    move/from16 v4, p2

    invoke-virtual {p0, v8, v4, v11}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v5, p3

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    goto :goto_0

    .line 163
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v13, v0

    sub-float/2addr v8, v0

    .line 164
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v14, v0

    add-float/2addr v7, v0

    .line 165
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move v3, v8

    move/from16 v4, p2

    invoke-virtual {p0, v8, v4, v10}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v5, p3

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 166
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v11

    move v3, v7

    move/from16 v4, p2

    invoke-virtual {p0, v7, v4, v11}, Lo/eiq;->e(FFLjava/lang/String;)F

    move-result v4

    move-object/from16 v5, p3

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/eiq;->c(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V

    .line 168
    :goto_0
    return-void
.end method
