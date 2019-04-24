.class public Lo/eih$n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field final synthetic c:Lo/eih$n;

.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>(Lo/eih$n;)V
    .locals 1

    .line 313
    iput-object p1, p0, Lo/eih$n$a;->c:Lo/eih$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 302
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->b:I

    .line 303
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->a:I

    .line 307
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->h:I

    .line 308
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->f:I

    .line 311
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eih$n$a;->g:Z

    .line 314
    return-void
.end method

.method static synthetic a(Lo/eih$n$a;)I
    .locals 1

    .line 300
    iget v0, p0, Lo/eih$n$a;->h:I

    return v0
.end method

.method static synthetic c(Lo/eih$n$a;)I
    .locals 1

    .line 300
    iget v0, p0, Lo/eih$n$a;->f:I

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 354
    iget v0, p0, Lo/eih$n$a;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 343
    iget-boolean v0, p0, Lo/eih$n$a;->g:Z

    if-eqz v0, :cond_0

    .line 344
    iget v0, p0, Lo/eih$n$a;->a:I

    return v0

    .line 346
    :cond_0
    iget v0, p0, Lo/eih$n$a;->b:I

    return v0
.end method

.method public b(II)V
    .locals 3

    .line 321
    iput p1, p0, Lo/eih$n$a;->e:I

    .line 322
    iput p2, p0, Lo/eih$n$a;->b:I

    .line 323
    iget v0, p0, Lo/eih$n$a;->e:I

    iget v1, p0, Lo/eih$n$a;->b:I

    iget v2, p0, Lo/eih$n$a;->e:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x4

    sub-int/2addr v0, v1

    iput v0, p0, Lo/eih$n$a;->d:I

    .line 324
    iget v0, p0, Lo/eih$n$a;->b:I

    iget v1, p0, Lo/eih$n$a;->b:I

    iget v2, p0, Lo/eih$n$a;->e:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    iput v0, p0, Lo/eih$n$a;->a:I

    .line 325
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 317
    iput-boolean p1, p0, Lo/eih$n$a;->g:Z

    .line 318
    return-void
.end method

.method public c()V
    .locals 1

    .line 380
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n$a;->e:I

    .line 381
    return-void
.end method

.method public c(II)Z
    .locals 3

    .line 359
    iget-object v0, p0, Lo/eih$n$a;->c:Lo/eih$n;

    invoke-static {v0}, Lo/eih$n;->b(Lo/eih$n;)Lo/eih;

    move-result-object v0

    iget-boolean v0, v0, Lo/eih;->au:Z

    if-nez v0, :cond_0

    .line 360
    iget-object v0, p0, Lo/eih$n$a;->c:Lo/eih$n;

    invoke-static {v0}, Lo/eih$n;->b(Lo/eih$n;)Lo/eih;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/eih;->au:Z

    .line 361
    const/4 v0, 0x1

    return v0

    .line 364
    :cond_0
    iget-boolean v0, p0, Lo/eih$n$a;->g:Z

    if-nez v0, :cond_2

    .line 367
    iget v0, p0, Lo/eih$n$a;->e:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Lo/eih$n$a;->b:I

    if-ne v0, p2, :cond_1

    .line 368
    const/4 v0, 0x0

    return v0

    .line 370
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 373
    :cond_2
    iget v0, p0, Lo/eih$n$a;->e:I

    iget v1, p0, Lo/eih$n$a;->b:I

    iget v2, p0, Lo/eih$n$a;->e:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    if-lt p1, v0, :cond_3

    iget v0, p0, Lo/eih$n$a;->b:I

    iget v1, p0, Lo/eih$n$a;->b:I

    iget v2, p0, Lo/eih$n$a;->e:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    if-le p2, v0, :cond_4

    .line 374
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 376
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    .line 335
    iget-boolean v0, p0, Lo/eih$n$a;->g:Z

    if-eqz v0, :cond_0

    .line 336
    iget v0, p0, Lo/eih$n$a;->d:I

    return v0

    .line 338
    :cond_0
    iget v0, p0, Lo/eih$n$a;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 350
    iget v0, p0, Lo/eih$n$a;->e:I

    return v0
.end method

.method public e(II)V
    .locals 0

    .line 329
    iput p1, p0, Lo/eih$n$a;->h:I

    .line 330
    iput p2, p0, Lo/eih$n$a;->f:I

    .line 331
    return-void
.end method
