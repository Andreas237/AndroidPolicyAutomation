.class Lo/ejc$3;
.super Lo/eih$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ejc;->d(Landroid/view/MotionEvent;FZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ejc;


# direct methods
.method constructor <init>(Lo/ejc;Lo/eih;)V
    .locals 1

    .line 330
    iput-object p1, p0, Lo/ejc$3;->b:Lo/ejc;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p2}, Lo/eih$k;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 334
    invoke-super {p0}, Lo/eih$k;->e()V

    .line 335
    iget-object v0, p0, Lo/ejc$3;->b:Lo/ejc;

    invoke-static {v0}, Lo/ejc;->e(Lo/ejc;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 336
    iget-object v0, p0, Lo/ejc$3;->b:Lo/ejc;

    invoke-static {v0}, Lo/ejc;->b(Lo/ejc;)Lo/eie;

    move-result-object v0

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->an()V

    .line 337
    return-void
.end method
