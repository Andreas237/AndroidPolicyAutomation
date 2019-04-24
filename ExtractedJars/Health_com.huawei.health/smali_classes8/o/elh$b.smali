.class public Lo/elh$b;
.super Lo/elh$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/graphics/drawable/Drawable;

.field protected d:Lo/eie;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/Path;

.field protected g:Lo/oa;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eib;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/eie;Lo/oa;)V
    .locals 1

    .line 336
    invoke-direct {p0}, Lo/elh$h;-><init>()V

    .line 341
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    .line 342
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    .line 337
    iput-object p1, p0, Lo/elh$b;->d:Lo/eie;

    .line 338
    iput-object p2, p0, Lo/elh$b;->g:Lo/oa;

    .line 339
    return-void
.end method

.method synthetic constructor <init>(Lo/eie;Lo/oa;Lo/elh$5;)V
    .locals 0

    .line 325
    invoke-direct {p0, p1, p2}, Lo/elh$b;-><init>(Lo/eie;Lo/oa;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 460
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 462
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eib;

    .line 463
    const/4 v0, 0x4

    new-array v8, v0, [F

    iget v0, v7, Lo/eib;->a:F

    const/4 v1, 0x0

    aput v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v8, v1

    iget v0, v7, Lo/eib;->b:F

    const/4 v1, 0x2

    aput v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 464
    iget-object v0, p0, Lo/elh$b;->d:Lo/eie;

    iget-object v1, p0, Lo/elh$b;->d:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getAxisFirstParty()Lo/eit;

    move-result-object v1

    invoke-virtual {v1}, Lo/eit;->P()Lo/eit$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v9

    .line 465
    invoke-virtual {v9, v8}, Lo/nv;->e([F)V

    .line 467
    iget-object v0, p0, Lo/elh$b;->g:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/elh$b;->d:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v10, v0

    .line 469
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    const/4 v1, 0x0

    aget v1, v8, v1

    iget-object v2, p0, Lo/elh$b;->g:Lo/oa;

    .line 470
    invoke-virtual {v2}, Lo/oa;->e()F

    move-result v2

    const/4 v3, 0x2

    aget v3, v8, v3

    int-to-float v4, v10

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 469
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 474
    goto :goto_0

    .line 475
    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)Z"
        }
    .end annotation

    .line 434
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    if-nez v0, :cond_1

    .line 435
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 438
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 439
    const/4 v0, 0x0

    return v0

    .line 442
    :cond_2
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 443
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eib;

    iget v0, v0, Lo/eib;->a:F

    iget-object v1, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eib;

    iget v1, v1, Lo/eib;->a:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 444
    const/4 v0, 0x0

    return v0

    .line 446
    :cond_3
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eib;

    iget v0, v0, Lo/eib;->b:F

    iget-object v1, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eib;

    iget v1, v1, Lo/eib;->b:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 447
    const/4 v0, 0x0

    return v0

    .line 442
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 451
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 0

    .line 356
    invoke-virtual {p0}, Lo/elh$b;->a()V

    .line 357
    return-void
.end method

.method public c(Landroid/graphics/Canvas;Lo/elg;Lo/ele$c;)V
    .locals 5

    .line 361
    iget-object v0, p0, Lo/elh$b;->g:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/elh$b;->d:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v3, v0

    .line 364
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 365
    iget-object v0, p0, Lo/elh$b;->g:Lo/oa;

    .line 366
    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lo/elh$b;->g:Lo/oa;

    .line 367
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/elh$b;->g:Lo/oa;

    .line 368
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 365
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 370
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 372
    iget v0, p0, Lo/elh$b;->b:I

    invoke-virtual {p3, p1, p2, v0}, Lo/ele$c;->c(Landroid/graphics/Canvas;Lo/elg;I)V

    .line 374
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 382
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v4

    .line 383
    iget-object v0, p0, Lo/elh$b;->g:Lo/oa;

    .line 384
    invoke-virtual {v0}, Lo/oa;->f()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lo/elh$b;->g:Lo/oa;

    .line 385
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, Lo/elh$b;->g:Lo/oa;

    .line 386
    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    float-to-int v2, v2

    .line 383
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 388
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 390
    iget v0, p0, Lo/elh$b;->a:I

    invoke-virtual {p3, p1, p2, v0}, Lo/ele$c;->c(Landroid/graphics/Canvas;Lo/elg;I)V

    .line 391
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lo/elh$b;->c:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/elh$b;->e:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p3, p1, p2, v0}, Lo/ele$c;->b(Landroid/graphics/Canvas;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 393
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 395
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 455
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 456
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 457
    return-void
.end method

.method public e()V
    .locals 1

    .line 346
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lo/elh$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 349
    :cond_0
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    if-eqz v0, :cond_1

    .line 350
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 352
    :cond_1
    return-void
.end method

.method public e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/ele$c;)V
    .locals 10

    .line 399
    iget-object v0, p0, Lo/elh$b;->g:Lo/oa;

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    iget-object v1, p0, Lo/elh$b;->d:Lo/eie;

    invoke-virtual {v1}, Lo/eie;->getXAxis()Lo/ln;

    move-result-object v1

    invoke-virtual {v1}, Lo/ln;->y()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v8, v0

    .line 402
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v9

    .line 403
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    iget-object v1, p0, Lo/elh$b;->g:Lo/oa;

    .line 404
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 405
    invoke-virtual {p4}, Lo/elg;->c()F

    move-result v2

    int-to-float v3, v8

    .line 403
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 407
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 409
    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    iget v5, p0, Lo/elh$b;->b:I

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;I)V

    .line 411
    invoke-virtual {p1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 418
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v9

    .line 419
    invoke-virtual {p2}, Lo/elg;->c()F

    move-result v0

    iget-object v1, p0, Lo/elh$b;->g:Lo/oa;

    .line 420
    invoke-virtual {v1}, Lo/oa;->e()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    .line 421
    invoke-virtual {p4}, Lo/elg;->c()F

    move-result v2

    int-to-float v3, v8

    .line 419
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 423
    iget-object v0, p0, Lo/elh$b;->f:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 425
    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    iget v5, p0, Lo/elh$b;->a:I

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;I)V

    .line 426
    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x2

    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lo/elh$b;->c:Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    iget-object v6, p0, Lo/elh$b;->e:Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 429
    invoke-virtual {p1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 431
    return-void
.end method
