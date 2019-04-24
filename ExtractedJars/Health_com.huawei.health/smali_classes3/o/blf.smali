.class public Lo/blf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method private static b(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 78
    new-instance v0, Lo/blf$1;

    invoke-direct {v0, p1, p0}, Lo/blf$1;-><init>(Lcom/huawei/health/sns/model/user/User;Landroid/app/Activity;)V

    return-object v0
.end method

.method private static c(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 42
    new-instance v0, Lo/blf$2;

    invoke-direct {v0, p0, p1}, Lo/blf$2;-><init>(J)V

    return-object v0
.end method


# virtual methods
.method public d(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 73
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/blf;->b(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 74
    return-void
.end method

.method public e(J)V
    .locals 2

    .line 37
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/blf;->c(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 38
    return-void
.end method
