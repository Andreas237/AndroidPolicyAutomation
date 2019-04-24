.class public Lo/aml;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/content/Intent;

.field private d:Landroid/os/Handler;

.field private e:Landroid/os/HandlerThread;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lo/aml;->a:Landroid/content/Context;

    .line 28
    invoke-direct {p0}, Lo/aml;->c()V

    .line 29
    return-void
.end method

.method private a()V
    .locals 2

    .line 79
    iget-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    .line 86
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/aml;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lo/aml;->a()V

    return-void
.end method

.method static synthetic c(Lo/aml;)Landroid/content/Context;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/aml;->a:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 32
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "delayHelper"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    .line 33
    iget-object v0, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 34
    new-instance v0, Lo/aml$1;

    iget-object v1, p0, Lo/aml;->e:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/aml$1;-><init>(Lo/aml;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    .line 61
    return-void
.end method

.method static synthetic d(Lo/aml;)Landroid/content/Intent;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/aml;->b:Landroid/content/Intent;

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 72
    iget-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 73
    iput p1, v3, Landroid/os/Message;->arg1:I

    .line 74
    iget-object v0, p0, Lo/aml;->d:Landroid/os/Handler;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 75
    return-void
.end method

.method static synthetic d(Lo/aml;I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lo/aml;->d(I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 1

    .line 64
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    iput-object p1, p0, Lo/aml;->b:Landroid/content/Intent;

    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/aml;->d(I)V

    .line 68
    :cond_0
    return-void
.end method
