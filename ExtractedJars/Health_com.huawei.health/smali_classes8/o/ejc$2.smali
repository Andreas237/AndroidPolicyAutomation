.class Lo/ejc$2;
.super Lo/eih$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ejc;->a(Landroid/view/MotionEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eih;

.field final synthetic d:Lo/ejc;


# direct methods
.method constructor <init>(Lo/ejc;Lo/eih;Lo/eih;)V
    .locals 1

    .line 216
    iput-object p1, p0, Lo/ejc$2;->d:Lo/ejc;

    iput-object p3, p0, Lo/ejc$2;->c:Lo/eih;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p2}, Lo/eih$k;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 218
    invoke-super {p0}, Lo/eih$k;->e()V

    .line 219
    iget-object v0, p0, Lo/ejc$2;->c:Lo/eih;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/eih;->b(I)V

    .line 220
    iget-object v0, p0, Lo/ejc$2;->d:Lo/ejc;

    invoke-static {v0}, Lo/ejc;->b(Lo/ejc;)Lo/eie;

    move-result-object v0

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->an()V

    .line 221
    return-void
.end method
