.class public Lo/atq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    .line 54
    invoke-direct {p0, p1}, Lo/atq;->d(Landroid/os/Handler;)V

    .line 55
    return-void
.end method

.method static synthetic a(Lo/atq;III)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lo/atq;->d(III)V

    return-void
.end method

.method static synthetic b(Lo/atq;JLjava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lo/atq;->e(JLjava/lang/String;)V

    return-void
.end method

.method private d(III)V
    .locals 2

    .line 218
    iget-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/atq;->c:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 222
    :cond_0
    return-void
.end method

.method private d(Landroid/os/Handler;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/atq;->c:Landroid/os/Handler;

    .line 45
    return-void
.end method

.method static synthetic d(Lo/atq;III)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lo/atq;->e(III)V

    return-void
.end method

.method static synthetic e(Lo/atq;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private e(III)V
    .locals 2

    .line 203
    iget-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/atq;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/atq;->c:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 207
    :cond_0
    return-void
.end method

.method private e(JLjava/lang/String;)V
    .locals 2

    .line 232
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 233
    if-eqz v1, :cond_0

    .line 235
    invoke-virtual {v1, p1, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 236
    invoke-virtual {v1, p3}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 238
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/atc;->c(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 240
    :cond_0
    return-void
.end method


# virtual methods
.method public c(IJLjava/lang/String;)V
    .locals 6

    .line 135
    new-instance v0, Lo/atq$4;

    move-object v1, p0

    move-wide v2, p2

    move-object v4, p4

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/atq$4;-><init>(Lo/atq;JLjava/lang/String;I)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 194
    return-void
.end method

.method public d(JJLjava/lang/String;)V
    .locals 7

    .line 66
    new-instance v0, Lo/atq$3;

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p5

    move-wide v5, p3

    invoke-direct/range {v0 .. v6}, Lo/atq$3;-><init>(Lo/atq;JLjava/lang/String;J)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 124
    return-void
.end method
