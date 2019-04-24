.class public Lo/eiz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private d:Lo/eie;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lo/eie;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eiz;->a:Z

    .line 18
    new-instance v0, Lo/eiz$3;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/eiz$3;-><init>(Lo/eiz;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/eiz;->e:Landroid/os/Handler;

    .line 34
    iput-object p1, p0, Lo/eiz;->d:Lo/eie;

    .line 35
    return-void
.end method

.method static synthetic a(Lo/eiz;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lo/eiz;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 52
    iget-object v0, p0, Lo/eiz;->d:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->X()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 53
    :goto_0
    iget-boolean v0, p0, Lo/eiz;->a:Z

    if-eq v0, v1, :cond_1

    .line 54
    iput-boolean v1, p0, Lo/eiz;->a:Z

    .line 55
    iget-object v0, p0, Lo/eiz;->d:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->L()V

    .line 57
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 47
    iget-object v0, p0, Lo/eiz;->e:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 48
    invoke-direct {p0}, Lo/eiz;->d()V

    .line 49
    return-void
.end method

.method public b()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lo/eiz;->a:Z

    return v0
.end method

.method public e(J)V
    .locals 3

    .line 42
    iget-object v0, p0, Lo/eiz;->e:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 43
    iget-object v0, p0, Lo/eiz;->e:Landroid/os/Handler;

    invoke-virtual {v0, v2, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 44
    return-void
.end method
