.class Lo/ekw$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekw$4;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekw$4;


# direct methods
.method constructor <init>(Lo/ekw$4;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 422
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "width:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v3, v3, Lo/ekw$4;->c:Lo/ekw;

    invoke-virtual {v3}, Lo/ekw;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContext ? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v3, v3, Lo/ekw$4;->c:Lo/ekw;

    invoke-static {v3}, Lo/ekw;->c(Lo/ekw;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iget-object v0, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v0, v0, Lo/ekw$4;->c:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->c(Lo/ekw;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 426
    const/high16 v0, 0x40400000    # 3.0f

    mul-float v5, v0, v4

    .line 427
    iget-object v0, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v0, v0, Lo/ekw$4;->c:Lo/ekw;

    iget-object v1, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v1, v1, Lo/ekw$4;->c:Lo/ekw;

    invoke-virtual {v1}, Lo/ekw;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v5

    float-to-int v1, v1

    invoke-static {v0, v1}, Lo/ekw;->a(Lo/ekw;I)I

    .line 428
    iget-object v0, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v0, v0, Lo/ekw$4;->c:Lo/ekw;

    iget-object v1, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v1, v1, Lo/ekw$4;->c:Lo/ekw;

    invoke-static {v1}, Lo/ekw;->k(Lo/ekw;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ekw;->k(I)V

    .line 430
    iget-object v0, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v0, v0, Lo/ekw$4;->c:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lo/ekw$4$2;->a:Lo/ekw$4;

    iget-object v1, v1, Lo/ekw$4;->c:Lo/ekw;

    invoke-static {v1}, Lo/ekw;->f(Lo/ekw;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 431
    return-void
.end method
