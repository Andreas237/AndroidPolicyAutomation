.class Lo/dop$2;
.super Lo/dot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dop;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dop;


# direct methods
.method constructor <init>(Lo/dop;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/dop$2;->a:Lo/dop;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 4

    .line 63
    iget-object v0, p0, Lo/dop$2;->a:Lo/dop;

    invoke-static {v0}, Lo/dop;->a(Lo/dop;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 64
    iget-object v0, p0, Lo/dop$2;->a:Lo/dop;

    invoke-static {v0}, Lo/dop;->d(Lo/dop;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_DESTROY,mInited.set(false)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lo/dop$2;->a:Lo/dop;

    invoke-static {v0}, Lo/dop;->e(Lo/dop;)Lo/dnx;

    move-result-object v0

    invoke-interface {v0}, Lo/dnx;->c()V

    .line 66
    iget-object v0, p0, Lo/dop$2;->a:Lo/dop;

    invoke-virtual {v0}, Lo/dop;->b()V

    .line 67
    return-void
.end method
