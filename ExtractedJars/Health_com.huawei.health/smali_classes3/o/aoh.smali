.class public Lo/aoh;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private a:J

.field private b:Landroid/os/Handler;

.field private c:I

.field private d:Landroid/os/Handler;

.field private e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 30
    const/4 v0, 0x3

    iput v0, p0, Lo/aoh;->c:I

    .line 35
    return-void
.end method

.method static synthetic a(Lo/aoh;)Landroid/os/Handler;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/aoh;->b:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lo/aoh;)I
    .locals 1

    .line 16
    iget v0, p0, Lo/aoh;->c:I

    return v0
.end method

.method static synthetic c(Lo/aoh;)I
    .locals 1

    .line 16
    iget v0, p0, Lo/aoh;->e:I

    return v0
.end method

.method static synthetic d(Lo/aoh;)Landroid/os/Handler;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/aoh;->d:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lo/aoh;)J
    .locals 2

    .line 16
    iget-wide v0, p0, Lo/aoh;->a:J

    return-wide v0
.end method

.method static synthetic i(Lo/aoh;)I
    .locals 2

    .line 16
    iget v0, p0, Lo/aoh;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/aoh;->e:I

    return v0
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/aoh;->d:Landroid/os/Handler;

    .line 43
    return-void
.end method

.method public e(J)V
    .locals 3

    .line 142
    iput-wide p1, p0, Lo/aoh;->a:J

    .line 143
    iget-object v0, p0, Lo/aoh;->b:Landroid/os/Handler;

    const/16 v1, 0x6e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 144
    iget-object v0, p0, Lo/aoh;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 145
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 56
    const-string v0, "HealthGroupHandlerThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start handleMessage!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 61
    :sswitch_0
    new-instance v4, Lo/aoj;

    invoke-direct {v4}, Lo/aoj;-><init>()V

    .line 62
    iget-wide v0, p0, Lo/aoh;->a:J

    invoke-virtual {v4, v0, v1}, Lo/aoj;->d(J)V

    .line 63
    new-instance v0, Lo/aoh$4;

    invoke-direct {v0, p0}, Lo/aoh$4;-><init>(Lo/aoh;)V

    invoke-static {v4, v0}, Lo/aoc;->d(Lo/aoj;Lo/aol;)V

    .line 87
    goto :goto_0

    .line 93
    :sswitch_1
    new-instance v4, Lo/aoj;

    invoke-direct {v4}, Lo/aoj;-><init>()V

    .line 94
    iget-wide v0, p0, Lo/aoh;->a:J

    invoke-virtual {v4, v0, v1}, Lo/aoj;->d(J)V

    .line 95
    new-instance v0, Lo/aoh$5;

    invoke-direct {v0, p0}, Lo/aoh$5;-><init>(Lo/aoh;)V

    invoke-static {v4, v0}, Lo/aoc;->e(Lo/aoj;Lo/aol;)V

    .line 119
    .line 125
    :goto_0
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x6e -> :sswitch_1
    .end sparse-switch
.end method

.method protected onLooperPrepared()V
    .locals 2

    .line 51
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lo/aoh;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lo/aoh;->b:Landroid/os/Handler;

    .line 52
    return-void
.end method
