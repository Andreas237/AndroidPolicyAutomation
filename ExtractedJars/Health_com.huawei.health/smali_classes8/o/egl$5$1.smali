.class Lo/egl$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egl$5;->a(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/egl$5;


# direct methods
.method constructor <init>(Lo/egl$5;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lo/egl$5$1;->e:Lo/egl$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 8

    .line 228
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->k:Lo/egl;

    invoke-static {v0}, Lo/egl;->b(Lo/egl;)Lo/ekj;

    move-result-object v0

    invoke-virtual {v0}, Lo/ekj;->c()F

    move-result v5

    .line 232
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->k:Lo/egl;

    iget-object v1, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v1, v1, Lo/egl$5;->c:Lo/eih;

    iget-object v2, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v2, v2, Lo/egl$5;->a:Lo/eih;

    invoke-static {v0, v1, v2}, Lo/egl;->a(Lo/egl;Lo/eih;Lo/eih;)V

    .line 234
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->a:Lo/eih;

    iget-object v1, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-wide v1, v1, Lo/egl$5;->d:J

    const-wide/32 v3, 0xea60

    div-long/2addr v1, v3

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/eih;->e(I)Z

    move-result v6

    .line 237
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->a:Lo/eih;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eih;->b(IZ)V

    .line 251
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-nez v0, :cond_0

    .line 253
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->k:Lo/egl;

    iget-object v1, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v1, v1, Lo/egl$5;->b:Lo/egl$c;

    invoke-static {v0, v1}, Lo/egl;->c(Lo/egl;Lo/egl$c;)Lo/egl$c;

    .line 266
    :cond_0
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->k:Lo/egl;

    iget-object v1, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v1, v1, Lo/egl$5;->e:Lo/egl$c;

    iget-object v2, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v2, v2, Lo/egl$5;->b:Lo/egl$c;

    invoke-static {v0, v1, v2, v5}, Lo/egl;->d(Lo/egl;Lo/egl$c;Lo/egl$c;F)V

    .line 267
    if-nez v6, :cond_1

    .line 268
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->a:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getTranslationX()F

    move-result v7

    .line 269
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->a:Lo/eih;

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v7

    invoke-virtual {v0, v1}, Lo/eih;->setTranslationX(F)V

    .line 270
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->a:Lo/eih;

    invoke-virtual {v0, v7}, Lo/eih;->setTranslationX(F)V

    .line 271
    iget-object v0, p0, Lo/egl$5$1;->e:Lo/egl$5;

    iget-object v0, v0, Lo/egl$5;->h:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 272
    return-void

    .line 274
    :cond_1
    return-void
.end method
