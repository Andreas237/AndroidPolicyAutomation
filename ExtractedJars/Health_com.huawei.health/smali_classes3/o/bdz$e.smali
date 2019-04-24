.class Lo/bdz$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/WrapperListAdapter;
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field static final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bdz$a;>;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bdz$a;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bdz$a;>;"
        }
    .end annotation
.end field

.field private final d:Landroid/database/DataSetObservable;

.field e:Z

.field private f:I

.field private g:Z

.field private final h:Z

.field private final i:Landroid/widget/ListAdapter;

.field private k:I

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 351
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/bdz$e;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bdz$a;>;Ljava/util/ArrayList<Lo/bdz$a;>;Landroid/widget/ListAdapter;)V"
        }
    .end annotation

    .line 363
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 350
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Lo/bdz$e;->d:Landroid/database/DataSetObservable;

    .line 356
    const/4 v0, -0x1

    iput v0, p0, Lo/bdz$e;->f:I

    .line 357
    const/4 v0, 0x1

    iput v0, p0, Lo/bdz$e;->k:I

    .line 360
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdz$e;->g:Z

    .line 361
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdz$e;->n:Z

    .line 364
    iput-object p3, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    .line 365
    instance-of v0, p3, Landroid/widget/Filterable;

    iput-boolean v0, p0, Lo/bdz$e;->h:Z

    .line 367
    if-nez p2, :cond_0

    .line 368
    sget-object v0, Lo/bdz$e;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    goto :goto_0

    .line 370
    :cond_0
    iput-object p2, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    .line 373
    :goto_0
    if-nez p1, :cond_1

    .line 374
    sget-object v0, Lo/bdz$e;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    goto :goto_1

    .line 376
    :cond_1
    iput-object p1, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    .line 378
    :goto_1
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/bdz$e;->c(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/bdz$e;->c(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lo/bdz$e;->e:Z

    .line 379
    return-void
.end method

.method private b()I
    .locals 4

    .line 479
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lo/bdz$e;->k:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    iget v2, p0, Lo/bdz$e;->k:I

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private c(Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bdz$a;>;)Z"
        }
    .end annotation

    .line 423
    if-eqz p1, :cond_1

    .line 424
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bdz$a;

    .line 425
    invoke-static {v2}, Lo/bdz$a;->e(Lo/bdz$a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 426
    const/4 v0, 0x0

    return v0

    .line 428
    :cond_0
    goto :goto_0

    .line 430
    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .line 484
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/bdz$e;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(I)V
    .locals 1

    .line 382
    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    .line 383
    return-void

    .line 385
    :cond_0
    iget v0, p0, Lo/bdz$e;->k:I

    if-eq v0, p1, :cond_1

    .line 386
    iput p1, p0, Lo/bdz$e;->k:I

    .line 387
    invoke-virtual {p0}, Lo/bdz$e;->e()V

    .line 389
    :cond_1
    return-void
.end method

.method public c()I
    .locals 1

    .line 392
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    .line 401
    iget-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    .line 581
    iget-object v0, p0, Lo/bdz$e;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 582
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 405
    iput p1, p0, Lo/bdz$e;->f:I

    .line 406
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 435
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 436
    invoke-virtual {p0}, Lo/bdz$e;->d()I

    move-result v0

    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int/2addr v0, v1

    invoke-direct {p0}, Lo/bdz$e;->b()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    .line 438
    :cond_0
    invoke-virtual {p0}, Lo/bdz$e;->d()I

    move-result v0

    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .line 689
    iget-boolean v0, p0, Lo/bdz$e;->h:Z

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    return-object v0

    .line 692
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 6

    .line 494
    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v0

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int v2, v0, v1

    .line 495
    if-ge p1, v2, :cond_1

    .line 496
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    iget v1, p0, Lo/bdz$e;->k:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->d(Lo/bdz$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 499
    :cond_1
    sub-int v3, p1, v2

    .line 500
    const/4 v4, 0x0

    .line 501
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_3

    .line 502
    invoke-direct {p0}, Lo/bdz$e;->b()I

    move-result v4

    .line 503
    if-lt v4, v3, :cond_3

    .line 504
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 508
    :cond_3
    sub-int v5, v3, v4

    .line 509
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, v5, v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->d(Lo/bdz$a;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return-object v0
.end method

.method public getItemId(I)J
    .locals 5

    .line 514
    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v0

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int v2, v0, v1

    .line 515
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    if-lt p1, v2, :cond_0

    .line 516
    sub-int v3, p1, v2

    .line 517
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v4

    .line 518
    if-ge v3, v4, :cond_0

    .line 519
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0

    .line 522
    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 10

    .line 605
    const/4 v4, -0x2

    .line 606
    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v0

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int v5, v0, v1

    .line 608
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 609
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    goto :goto_0

    .line 611
    :cond_0
    const/4 v6, 0x0

    .line 614
    :goto_0
    iget-boolean v0, p0, Lo/bdz$e;->n:Z

    if-eqz v0, :cond_5

    .line 615
    if-ge p1, v5, :cond_4

    .line 616
    if-nez p1, :cond_2

    .line 617
    iget-boolean v0, p0, Lo/bdz$e;->g:Z

    if-eqz v0, :cond_1

    .line 618
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v6

    iget-object v1, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v4, v0, 0x1

    goto :goto_1

    .line 620
    :cond_1
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCacheFirstHeaderView is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 623
    :cond_2
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position != 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    :goto_1
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, p1, v0

    if-eqz v0, :cond_3

    .line 626
    iget v0, p0, Lo/bdz$e;->k:I

    div-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    add-int v4, v6, v0

    goto :goto_2

    .line 628
    :cond_3
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position % mNumColumns == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 631
    :cond_4
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position >= headersAndHoldsNumber"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 634
    :cond_5
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCacheFirstHeaderView is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    :goto_2
    sub-int v7, p1, v5

    .line 638
    const/4 v8, 0x0

    .line 639
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_8

    .line 640
    invoke-direct {p0}, Lo/bdz$e;->b()I

    move-result v8

    .line 641
    if-ltz v7, :cond_9

    if-ge v7, v8, :cond_9

    .line 642
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lt v0, v7, :cond_7

    .line 643
    iget-boolean v0, p0, Lo/bdz$e;->n:Z

    if-eqz v0, :cond_6

    .line 644
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v6

    add-int/lit8 v4, v0, 0x1

    goto :goto_3

    .line 646
    :cond_6
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCacheFirstHeaderView is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 649
    :cond_7
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, v7}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v4

    goto :goto_3

    .line 653
    :cond_8
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mListAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    :cond_9
    :goto_3
    iget-boolean v0, p0, Lo/bdz$e;->n:Z

    if-eqz v0, :cond_b

    .line 657
    sub-int v9, v7, v8

    .line 658
    invoke-virtual {p0}, Lo/bdz$e;->getCount()I

    move-result v0

    if-ge v9, v0, :cond_a

    if-ltz v9, :cond_a

    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, v9, v0

    if-eqz v0, :cond_a

    .line 659
    iget v0, p0, Lo/bdz$e;->k:I

    div-int v0, v9, v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    add-int v4, v0, v6

    goto :goto_4

    .line 661
    :cond_a
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCacheFirstHeaderView is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    :goto_4
    goto :goto_5

    .line 664
    :cond_b
    const-string v0, "GridViewWithFooter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCacheFirstHeaderView is false!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    :goto_5
    return v4
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 527
    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v0

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int v2, v0, v1

    .line 528
    if-ge p1, v2, :cond_2

    .line 529
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    iget v1, p0, Lo/bdz$e;->k:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->a(Lo/bdz$a;)Landroid/view/ViewGroup;

    move-result-object v3

    .line 530
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    .line 531
    return-object v3

    .line 533
    :cond_0
    if-nez p2, :cond_1

    .line 534
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 537
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 538
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 539
    return-object p2

    .line 543
    :cond_2
    sub-int v3, p1, v2

    .line 544
    const/4 v4, 0x0

    .line 545
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_5

    .line 546
    invoke-direct {p0}, Lo/bdz$e;->b()I

    move-result v4

    .line 547
    if-ge v3, v4, :cond_5

    .line 548
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 549
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3, p2, p3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 551
    :cond_3
    if-nez p2, :cond_4

    .line 552
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 554
    :cond_4
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 555
    iget v0, p0, Lo/bdz$e;->f:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 556
    return-object p2

    .line 561
    :cond_5
    sub-int v5, v3, v4

    .line 562
    invoke-virtual {p0}, Lo/bdz$e;->getCount()I

    move-result v0

    if-ge v5, v0, :cond_8

    .line 563
    iget-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    iget v1, p0, Lo/bdz$e;->k:I

    div-int v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->a(Lo/bdz$a;)Landroid/view/ViewGroup;

    move-result-object v6

    .line 564
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, p1, v0

    if-nez v0, :cond_6

    .line 565
    return-object v6

    .line 567
    :cond_6
    if-nez p2, :cond_7

    .line 568
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 571
    :cond_7
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 572
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 573
    return-object p2

    .line 576
    :cond_8
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw v0
.end method

.method public getViewTypeCount()I
    .locals 4

    .line 592
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-nez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v2

    .line 593
    :goto_0
    iget-boolean v0, p0, Lo/bdz$e;->n:Z

    if-eqz v0, :cond_2

    .line 594
    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int v3, v0, v1

    .line 595
    iget-boolean v0, p0, Lo/bdz$e;->g:Z

    if-eqz v0, :cond_1

    .line 596
    add-int/lit8 v3, v3, 0x1

    .line 598
    :cond_1
    add-int/2addr v2, v3

    .line 600
    :cond_2
    return v2
.end method

.method public getWrappedAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .line 586
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public hasStableIds()Z
    .locals 1

    .line 489
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 397
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEnabled(I)Z
    .locals 6

    .line 458
    invoke-virtual {p0}, Lo/bdz$e;->c()I

    move-result v0

    iget v1, p0, Lo/bdz$e;->k:I

    mul-int v2, v0, v1

    .line 459
    if-ge p1, v2, :cond_1

    .line 460
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/bdz$e;->a:Ljava/util/ArrayList;

    iget v1, p0, Lo/bdz$e;->k:I

    div-int v1, p1, v1

    .line 461
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->e(Lo/bdz$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 460
    :goto_0
    return v0

    .line 464
    :cond_1
    sub-int v3, p1, v2

    .line 465
    const/4 v4, 0x0

    .line 466
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_3

    .line 467
    invoke-direct {p0}, Lo/bdz$e;->b()I

    move-result v4

    .line 468
    if-ge v3, v4, :cond_3

    .line 469
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 473
    :cond_3
    sub-int v5, v3, v4

    .line 474
    iget v0, p0, Lo/bdz$e;->k:I

    rem-int v0, v5, v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/bdz$e;->b:Ljava/util/ArrayList;

    iget v1, p0, Lo/bdz$e;->k:I

    div-int v1, v5, v1

    .line 475
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bdz$a;

    invoke-static {v0}, Lo/bdz$a;->e(Lo/bdz$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 474
    :goto_2
    return v0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 680
    iget-object v0, p0, Lo/bdz$e;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V

    .line 681
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 682
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 684
    :cond_0
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 671
    iget-object v0, p0, Lo/bdz$e;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 672
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 673
    iget-object v0, p0, Lo/bdz$e;->i:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 675
    :cond_0
    return-void
.end method
