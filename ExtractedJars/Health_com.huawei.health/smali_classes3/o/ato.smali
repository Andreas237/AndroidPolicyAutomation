.class public Lo/ato;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ato;->a:Landroid/os/Handler;

    .line 71
    invoke-direct {p0, p1}, Lo/ato;->a(Landroid/os/Handler;)V

    .line 72
    return-void
.end method

.method private a(Landroid/os/Handler;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/ato;->a:Landroid/os/Handler;

    .line 57
    return-void
.end method

.method static synthetic d(Lo/ato;III)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lo/ato;->e(III)V

    return-void
.end method

.method private e(III)V
    .locals 2

    .line 151
    iget-object v0, p0, Lo/ato;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/ato;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/ato;->a:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 155
    :cond_0
    return-void
.end method


# virtual methods
.method public c(JJ)V
    .locals 6

    .line 92
    new-instance v0, Lo/ato$3;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lo/ato$3;-><init>(Lo/ato;JJ)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 140
    return-void
.end method
