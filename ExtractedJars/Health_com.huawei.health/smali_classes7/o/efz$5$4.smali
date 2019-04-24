.class Lo/efz$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efz$5;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/efz$5;

.field final synthetic d:F


# direct methods
.method constructor <init>(Lo/efz$5;F)V
    .locals 0

    .line 284
    iput-object p1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iput p2, p0, Lo/efz$5$4;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 288
    const v3, 0x3dcccccd    # 0.1f

    .line 289
    const v4, 0x3dcccccd    # 0.1f

    .line 290
    const/4 v5, 0x0

    .line 291
    const/4 v6, 0x0

    .line 292
    const/4 v7, 0x0

    .line 293
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->c(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 294
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->c(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v0, v0, Lo/efo;->e:F

    iget-object v1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v1, v1, Lo/efz$5;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->c(Lo/efz;)Lo/efo;

    move-result-object v1

    iget v1, v1, Lo/efo;->d:F

    iget-object v2, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v2, v2, Lo/efz$5;->a:Lo/efz;

    invoke-static {v2}, Lo/efz;->c(Lo/efz;)Lo/efo;

    move-result-object v2

    iget v2, v2, Lo/efo;->e:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/efz$5$4;->d:F

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    .line 296
    :cond_0
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->b(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 297
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->b(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v0, v0, Lo/efo;->e:F

    iget-object v1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v1, v1, Lo/efz$5;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->b(Lo/efz;)Lo/efo;

    move-result-object v1

    iget v1, v1, Lo/efo;->d:F

    iget-object v2, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v2, v2, Lo/efz$5;->a:Lo/efz;

    invoke-static {v2}, Lo/efz;->b(Lo/efz;)Lo/efo;

    move-result-object v2

    iget v2, v2, Lo/efo;->e:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/efz$5$4;->d:F

    mul-float/2addr v1, v2

    add-float v4, v0, v1

    .line 299
    :cond_1
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->i(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 300
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->i(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v0, v0, Lo/efo;->e:F

    iget-object v1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v1, v1, Lo/efz$5;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->i(Lo/efz;)Lo/efo;

    move-result-object v1

    iget v1, v1, Lo/efo;->d:F

    iget-object v2, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v2, v2, Lo/efz$5;->a:Lo/efz;

    invoke-static {v2}, Lo/efz;->i(Lo/efz;)Lo/efo;

    move-result-object v2

    iget v2, v2, Lo/efo;->e:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/efz$5$4;->d:F

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 302
    :cond_2
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->k(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 303
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->k(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v0, v0, Lo/efo;->e:F

    iget-object v1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v1, v1, Lo/efz$5;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->f(Lo/efz;)Lo/efo;

    move-result-object v1

    iget v1, v1, Lo/efo;->e:F

    iget-object v2, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v2, v2, Lo/efz$5;->a:Lo/efz;

    invoke-static {v2}, Lo/efz;->k(Lo/efz;)Lo/efo;

    move-result-object v2

    iget v2, v2, Lo/efo;->e:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/efz$5$4;->d:F

    mul-float/2addr v1, v2

    add-float v6, v0, v1

    .line 305
    :cond_3
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->f(Lo/efz;)Lo/efo;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 306
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->k(Lo/efz;)Lo/efo;

    move-result-object v0

    iget v0, v0, Lo/efo;->d:F

    iget-object v1, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v1, v1, Lo/efz$5;->a:Lo/efz;

    invoke-static {v1}, Lo/efz;->f(Lo/efz;)Lo/efo;

    move-result-object v1

    iget v1, v1, Lo/efo;->d:F

    iget-object v2, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v2, v2, Lo/efz$5;->a:Lo/efz;

    invoke-static {v2}, Lo/efz;->k(Lo/efz;)Lo/efo;

    move-result-object v2

    iget v2, v2, Lo/efo;->d:F

    sub-float/2addr v1, v2

    iget v2, p0, Lo/efz$5$4;->d:F

    mul-float/2addr v1, v2

    add-float v7, v0, v1

    .line 308
    :cond_4
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v3, v4, v1}, Lo/efw;->d(FFF)V

    .line 309
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->g(Lo/efz;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 310
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/efw;->d(F)V

    .line 311
    iget v0, p0, Lo/efz$5$4;->d:F

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v8

    .line 312
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr v1, v8

    invoke-virtual {v0, v1}, Lo/efw;->e(F)V

    .line 313
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    const/high16 v1, -0x3f400000    # -6.0f

    mul-float/2addr v1, v8

    invoke-virtual {v0, v1}, Lo/efw;->a(F)V

    .line 316
    :cond_5
    iget-object v0, p0, Lo/efz$5$4;->b:Lo/efz$5;

    iget-object v0, v0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    const/high16 v1, -0x3d600000    # -80.0f

    invoke-virtual {v0, v6, v7, v1}, Lo/efw;->e(FFF)V

    .line 317
    return-void
.end method
