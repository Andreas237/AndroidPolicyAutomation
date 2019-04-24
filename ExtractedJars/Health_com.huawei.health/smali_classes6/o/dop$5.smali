.class Lo/dop$5;
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
.field final synthetic d:Lo/dop;


# direct methods
.method constructor <init>(Lo/dop;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/dop$5;->d:Lo/dop;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 5

    .line 72
    iget-object v0, p0, Lo/dop$5;->d:Lo/dop;

    invoke-static {v0}, Lo/dop;->a(Lo/dop;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 73
    iget-object v0, p0, Lo/dop$5;->d:Lo/dop;

    invoke-static {v0}, Lo/dop;->d(Lo/dop;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_INIT_FINISH,mInited.set(true)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 75
    if-nez v4, :cond_0

    .line 76
    iget-object v0, p0, Lo/dop$5;->d:Lo/dop;

    invoke-static {v0}, Lo/dop;->b(Lo/dop;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 78
    :cond_0
    return-void
.end method
