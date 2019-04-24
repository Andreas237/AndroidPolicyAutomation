.class Lo/efz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efz;


# direct methods
.method constructor <init>(Lo/efz;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lo/efz$5;->a:Lo/efz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 279
    iget-object v0, p0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    if-nez v0, :cond_0

    .line 280
    return-void

    .line 282
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 283
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " updateValue="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    new-instance v1, Lo/efz$5$4;

    invoke-direct {v1, p0, v3}, Lo/efz$5$4;-><init>(Lo/efz$5;F)V

    invoke-virtual {v0, v1}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 319
    iget-object v0, p0, Lo/efz$5;->a:Lo/efz;

    invoke-static {v0}, Lo/efz;->e(Lo/efz;)Lo/efw;

    move-result-object v0

    invoke-virtual {v0}, Lo/efw;->k()V

    .line 320
    return-void
.end method
