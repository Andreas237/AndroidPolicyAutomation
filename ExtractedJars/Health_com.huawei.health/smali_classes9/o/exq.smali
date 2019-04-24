.class public Lo/exq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/exo;

.field private b:I

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Landroid/content/Context;

.field private f:I

.field private g:I

.field private h:I

.field private i:Lo/exm;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exq;->a:Lo/exo;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exq;->c:Ljava/util/List;

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->d:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->b:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->f:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->h:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->g:I

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exq;->i:Lo/exm;

    .line 54
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/exq;->e:Landroid/content/Context;

    .line 55
    iget-object v0, p0, Lo/exq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/exq;->a:Lo/exo;

    .line 57
    new-instance v0, Lo/exm;

    invoke-direct {v0}, Lo/exm;-><init>()V

    iput-object v0, p0, Lo/exq;->i:Lo/exm;

    .line 58
    return-void
.end method

.method static synthetic a(Lo/exq;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/exq;->b:I

    return p1
.end method

.method static synthetic a(Lo/exq;)Lo/exm;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/exq;->i:Lo/exm;

    return-object v0
.end method

.method static synthetic b(Lo/exq;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/exq;->k:I

    return v0
.end method

.method static synthetic b(Lo/exq;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/exq;->k:I

    return p1
.end method

.method static synthetic c(Lo/exq;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/exq;->f:I

    return v0
.end method

.method static synthetic c(Lo/exq;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/exq;->g:I

    return p1
.end method

.method static synthetic d(Lo/exq;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/exq;->g:I

    return v0
.end method

.method static synthetic d(Lo/exq;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/exq;->f:I

    return p1
.end method

.method static synthetic e(Lo/exq;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/exq;->h:I

    return v0
.end method

.method static synthetic e(Lo/exq;I)I
    .locals 0

    .line 27
    iput p1, p0, Lo/exq;->h:I

    return p1
.end method

.method static synthetic e(Lo/exq;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/exq;->c:Ljava/util/List;

    return-object p1
.end method

.method private f()V
    .locals 1

    .line 317
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->b:I

    .line 318
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->f:I

    .line 319
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->h:I

    .line 320
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->k:I

    .line 321
    const/4 v0, 0x0

    iput v0, p0, Lo/exq;->g:I

    .line 322
    return-void
.end method

.method private g()V
    .locals 5

    .line 325
    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 326
    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 327
    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 328
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 329
    new-instance v4, Lo/eux;

    invoke-direct {v4}, Lo/eux;-><init>()V

    .line 330
    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 333
    :cond_0
    return-void
.end method

.method static synthetic i(Lo/exq;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/exq;->b:I

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 340
    iget v0, p0, Lo/exq;->f:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 348
    iget v0, p0, Lo/exq;->h:I

    return v0
.end method

.method public b(JLo/exn$d;ILo/egg;)V
    .locals 7

    .line 189
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter requestSportDetailHistogramByType queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-direct {p0}, Lo/exq;->g()V

    .line 191
    const/4 v6, -0x1

    .line 192
    const/4 v0, 0x4

    if-ne v0, p4, :cond_0

    .line 193
    const/4 v6, 0x3

    .line 196
    :cond_0
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 197
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    move-wide v1, p1

    move v3, v6

    move-object v4, p3

    new-instance v5, Lo/exq$1;

    invoke-direct {v5, p0, p3, p5}, Lo/exq$1;-><init>(Lo/exq;Lo/exn$d;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/exo;->b(JILo/exn$d;Lo/egg;)V

    .line 226
    :cond_1
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave requestSportDetailHistogramByType queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void
.end method

.method public c()I
    .locals 1

    .line 364
    iget v0, p0, Lo/exq;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 356
    iget v0, p0, Lo/exq;->k:I

    return v0
.end method

.method public d(JLo/exn$d;ILo/egg;)V
    .locals 7

    .line 139
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter requestSportDetailHistogramData queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-direct {p0}, Lo/exq;->g()V

    .line 141
    const/4 v6, -0x1

    .line 142
    const/4 v0, 0x1

    if-ne v0, p4, :cond_0

    .line 143
    const/4 v6, 0x1

    goto :goto_0

    .line 145
    :cond_0
    const/4 v0, 0x3

    if-ne v0, p4, :cond_1

    .line 146
    const/4 v6, 0x3

    goto :goto_0

    .line 149
    :cond_1
    const/4 v6, 0x2

    .line 152
    :goto_0
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 153
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    move-wide v1, p1

    move v3, v6

    move-object v4, p3

    new-instance v5, Lo/exq$4;

    invoke-direct {v5, p0, p5}, Lo/exq$4;-><init>(Lo/exq;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/exo;->e(JILo/exn$d;Lo/egg;)V

    .line 176
    :cond_2
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave requestSportDetailHistogramData queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    return-void
.end method

.method public e()I
    .locals 1

    .line 372
    iget v0, p0, Lo/exq;->b:I

    return v0
.end method

.method public e(JLo/exn$d;ILo/egg;)V
    .locals 8

    .line 237
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter requestSportDetailTotalData queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 240
    const/4 v6, -0x1

    .line 241
    const/4 v0, 0x1

    if-ne v0, p4, :cond_0

    .line 242
    const/4 v6, 0x1

    goto :goto_0

    .line 244
    :cond_0
    const/4 v0, 0x3

    if-ne v0, p4, :cond_1

    .line 245
    const/4 v6, 0x3

    goto :goto_0

    .line 247
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p4, :cond_2

    .line 248
    const/4 v6, 0x5

    goto :goto_0

    .line 251
    :cond_2
    const/4 v6, 0x2

    .line 254
    :goto_0
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSportDetailTotalData transDatatype = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    move v7, v6

    .line 258
    invoke-direct {p0}, Lo/exq;->f()V

    .line 259
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    move-wide v1, p1

    move v3, v6

    move-object v4, p3

    new-instance v5, Lo/exq$5;

    invoke-direct {v5, p0, v7, p5}, Lo/exq$5;-><init>(Lo/exq;ILo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/exo;->e(JILo/exn$d;Lo/egg;)V

    .line 313
    :cond_3
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave requestSportDetailTotalData queryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-void
.end method

.method public e(Lo/egg;)V
    .locals 4

    .line 406
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestStepSportGoal ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 408
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    new-instance v1, Lo/exq$2;

    invoke-direct {v1, p0, p1}, Lo/exq$2;-><init>(Lo/exq;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/exo;->a(Lo/egg;)V

    .line 418
    :cond_0
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestStepSportGoal ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    return-void
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/eux;>;"
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lo/exq;->c:Ljava/util/List;

    return-object v0
.end method

.method public k()I
    .locals 3

    .line 395
    const/4 v2, 0x0

    .line 396
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 397
    iget-object v0, p0, Lo/exq;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->k()I

    move-result v2

    .line 399
    :cond_0
    return v2
.end method
