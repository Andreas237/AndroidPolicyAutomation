.class Lo/eyy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyy;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eyy;


# direct methods
.method constructor <init>(Lo/eyy;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/eyy$3;->a:Lo/eyy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 115
    iget-object v0, p0, Lo/eyy$3;->a:Lo/eyy;

    invoke-static {v0}, Lo/eyy;->d(Lo/eyy;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    return-void

    .line 119
    :cond_0
    iget-object v0, p0, Lo/eyy$3;->a:Lo/eyy;

    invoke-static {v0}, Lo/eyy;->c(Lo/eyy;)Lo/eih;

    move-result-object v0

    invoke-virtual {v0}, Lo/eih;->ah()Z

    move-result v4

    .line 120
    const-string v0, "JumpTableChart"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChart.isAnimating:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    if-nez v4, :cond_1

    .line 122
    iget-object v0, p0, Lo/eyy$3;->a:Lo/eyy;

    invoke-static {v0}, Lo/eyy;->c(Lo/eyy;)Lo/eih;

    move-result-object v0

    new-instance v1, Lo/eyy$3$4;

    iget-object v2, p0, Lo/eyy$3;->a:Lo/eyy;

    invoke-static {v2}, Lo/eyy;->c(Lo/eyy;)Lo/eih;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lo/eyy$3$4;-><init>(Lo/eyy$3;Lo/eih;)V

    invoke-virtual {v0, v1}, Lo/eih;->b(Lo/eih$k;)V

    .line 128
    :cond_1
    return-void
.end method
