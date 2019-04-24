.class Lo/czy$b$b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation
.end field

.field private b:F

.field private c:F

.field final synthetic d:Lo/czy$b$b;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/czy$a;Ljava/lang/Float;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/czy$b$b;)V
    .locals 1

    .line 310
    iput-object p1, p0, Lo/czy$b$b$b;->d:Lo/czy$b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 312
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    .line 314
    const/4 v0, 0x0

    iput v0, p0, Lo/czy$b$b$b;->c:F

    .line 315
    const/4 v0, 0x0

    iput v0, p0, Lo/czy$b$b$b;->b:F

    return-void
.end method

.method synthetic constructor <init>(Lo/czy$b$b;Lo/czy$4;)V
    .locals 0

    .line 310
    invoke-direct {p0, p1}, Lo/czy$b$b$b;-><init>(Lo/czy$b$b;)V

    return-void
.end method

.method static synthetic b(Lo/czy$b$b$b;)Ljava/util/Set;
    .locals 1

    .line 310
    invoke-direct {p0}, Lo/czy$b$b$b;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/util/Map$Entry<Lo/czy$a;Ljava/lang/Float;>;>;"
        }
    .end annotation

    .line 319
    iget-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 8

    .line 323
    const/4 v5, 0x0

    .line 324
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 325
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/czy$a;

    .line 328
    :cond_0
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    new-instance v1, Lo/czy$b$b$b$4;

    invoke-direct {v1, p0}, Lo/czy$b$b$b$4;-><init>(Lo/czy$b$b$b;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 367
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 368
    :cond_1
    return-void

    .line 370
    :cond_2
    iget-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 373
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v1, v0

    .line 375
    const-string v0, "TrackSimilarityIdentifier"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "make score begin,size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    const-string v0, "make score begin,base:"

    invoke-static {v0, v5}, Lo/czy;->e(Ljava/lang/String;Lo/czy$a;)V

    .line 378
    iget-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "make score["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 380
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 381
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/czy$a;

    .line 379
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;Lo/czy$a;)V

    .line 384
    const/4 v7, 0x1

    :goto_0
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_3

    .line 385
    iget-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    int-to-float v2, v7

    mul-float/2addr v2, v6

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "make score["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 388
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 389
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/czy$a;

    .line 387
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;Lo/czy$a;)V

    .line 384
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 392
    :cond_3
    iget-object v0, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "make score["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->e:Ljava/util/Map;

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    iget-object v3, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 394
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    .line 395
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/czy$a;

    .line 393
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;Lo/czy$a;)V

    .line 397
    const-string v0, "TrackSimilarityIdentifier"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "make score end,size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    return-void
.end method

.method public e(Lo/czy$a;)V
    .locals 2

    .line 401
    iget-object v0, p0, Lo/czy$b$b$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 402
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    iget v1, p0, Lo/czy$b$b$b;->c:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 403
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    iput v0, p0, Lo/czy$b$b$b;->c:F

    .line 405
    :cond_0
    invoke-virtual {p1}, Lo/czy$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    iget v1, p0, Lo/czy$b$b$b;->b:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 407
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v0

    iput v0, p0, Lo/czy$b$b$b;->b:F

    .line 409
    :cond_1
    return-void
.end method
