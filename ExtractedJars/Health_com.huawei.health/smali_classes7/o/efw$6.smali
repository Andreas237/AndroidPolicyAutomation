.class Lo/efw$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/efw;


# direct methods
.method constructor <init>(Lo/efw;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 318
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->d(Lo/efw;)F

    move-result v0

    float-to-int v0, v0

    div-int/lit16 v0, v0, 0x168

    mul-int/lit16 v4, v0, 0x168

    .line 319
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->d(Lo/efw;)F

    move-result v0

    float-to-int v0, v0

    rem-int/lit16 v5, v0, 0x168

    .line 321
    if-ltz v5, :cond_0

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_0

    .line 322
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    int-to-float v1, v4

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    goto/16 :goto_0

    .line 323
    :cond_0
    const/16 v0, 0x5a

    if-le v5, v0, :cond_1

    const/16 v0, 0x10e

    if-ge v5, v0, :cond_1

    .line 324
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    add-int/lit16 v1, v4, 0xb4

    int-to-float v1, v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    goto/16 :goto_0

    .line 325
    :cond_1
    const/16 v0, 0x10e

    if-lt v5, v0, :cond_2

    const/16 v0, 0x168

    if-gt v5, v0, :cond_2

    .line 326
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    add-int/lit16 v1, v4, 0x168

    int-to-float v1, v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    goto/16 :goto_0

    .line 327
    :cond_2
    const/16 v0, -0x5a

    if-lt v5, v0, :cond_3

    if-gez v5, :cond_3

    .line 328
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    int-to-float v1, v4

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    goto :goto_0

    .line 329
    :cond_3
    const/16 v0, -0x5a

    if-ge v5, v0, :cond_4

    const/16 v0, -0x10e

    if-le v5, v0, :cond_4

    .line 330
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    add-int/lit16 v1, v4, -0xb4

    int-to-float v1, v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    goto :goto_0

    .line 331
    :cond_4
    const/16 v0, -0x10e

    if-gt v5, v0, :cond_5

    const/16 v0, -0x168

    if-lt v5, v0, :cond_5

    .line 332
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    add-int/lit16 v1, v4, -0x168

    int-to-float v1, v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->d(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->e(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->b(Lo/efw;F)F

    .line 333
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->a(Lo/efw;)F

    move-result v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->b(Lo/efw;)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->e(Lo/efw;F)F

    .line 334
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->c(Lo/efw;)F

    move-result v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->h(Lo/efw;)F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->f(Lo/efw;)F

    move-result v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->a(Lo/efw;F)F

    .line 335
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->b(Lo/efw;)F

    move-result v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->i(Lo/efw;)F

    move-result v2

    iget-object v3, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v3}, Lo/efw;->g(Lo/efw;)F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/efw;->d(Lo/efw;F)F

    .line 336
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->g(Lo/efw;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->b(Lo/efw;)F

    move-result v1

    iget-object v2, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v2}, Lo/efw;->k(Lo/efw;)F

    move-result v2

    add-float/2addr v1, v2

    mul-float v6, v0, v1

    .line 337
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->d(Lo/efw;)F

    move-result v1

    add-float/2addr v1, v6

    invoke-static {v0, v1}, Lo/efw;->c(Lo/efw;F)F

    .line 338
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->d(Lo/efw;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_6

    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->i(Lo/efw;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    .line 339
    :cond_6
    return-void

    .line 341
    :cond_7
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->d(Lo/efw;)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/efw;->d(F)V

    .line 342
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-virtual {v0}, Lo/efw;->k()V

    .line 344
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->k(Lo/efw;)F

    move-result v1

    invoke-static {v0, v1}, Lo/efw;->k(Lo/efw;F)F

    .line 345
    iget-object v0, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v0}, Lo/efw;->l(Lo/efw;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/efw$6;->b:Lo/efw;

    invoke-static {v1}, Lo/efw;->o(Lo/efw;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 346
    return-void
.end method
