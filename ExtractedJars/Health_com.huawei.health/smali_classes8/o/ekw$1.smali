.class Lo/ekw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eja$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekw;


# direct methods
.method constructor <init>(Lo/ekw;)V
    .locals 0

    .line 728
    iput-object p1, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(F)V
    .locals 7

    .line 732
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "width:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-virtual {v3}, Lo/ekw;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    const-string v0, "HwHealthLineChart"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContext ? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-static {v3}, Lo/ekw;->c(Lo/ekw;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    iget-object v0, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-static {v0}, Lo/ekw;->c(Lo/ekw;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 735
    const/high16 v0, 0x40400000    # 3.0f

    mul-float v5, v0, v4

    .line 736
    iget-object v0, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    div-float/2addr v0, v5

    float-to-int v6, v0

    .line 738
    iget-object v0, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-static {v0, v6}, Lo/ekw;->e(Lo/ekw;I)V

    .line 739
    iget-object v0, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->h()V

    .line 740
    iget-object v0, p0, Lo/ekw$1;->a:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->invalidate()V

    .line 741
    return-void
.end method
