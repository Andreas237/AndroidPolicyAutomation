.class public Lo/cfc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:J

.field private d:J

.field private e:Lo/ceu;


# direct methods
.method public constructor <init>(Lo/ceu;J)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfc;->e:Lo/ceu;

    .line 28
    iput-object p1, p0, Lo/cfc;->e:Lo/ceu;

    .line 29
    invoke-direct {p0, p2, p3}, Lo/cfc;->d(J)V

    .line 30
    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lo/cfc;->d:J

    .line 32
    return-void
.end method

.method private d(J)V
    .locals 2

    .line 84
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 85
    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lo/cfc;->c:J

    goto :goto_0

    .line 87
    :cond_0
    iput-wide p1, p0, Lo/cfc;->c:J

    .line 89
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 4

    .line 48
    iget-wide v0, p0, Lo/cfc;->d:J

    iget-wide v2, p0, Lo/cfc;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 49
    invoke-virtual {p0, p1}, Lo/cfc;->e(Landroid/os/Bundle;)V

    .line 50
    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lo/cfc;->d:J

    goto :goto_0

    .line 53
    :cond_0
    iget-wide v0, p0, Lo/cfc;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cfc;->d:J

    .line 55
    :goto_0
    return-void
.end method

.method public e()Lo/ceu;
    .locals 1

    .line 100
    iget-object v0, p0, Lo/cfc;->e:Lo/ceu;

    return-object v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    .line 62
    iget-object v0, p0, Lo/cfc;->e:Lo/ceu;

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "Track_SportDataCallbackProxy"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, " report "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lo/cfc;->e:Lo/ceu;

    invoke-interface {v0, p1}, Lo/ceu;->a(Landroid/os/Bundle;)V

    goto :goto_0

    .line 66
    :cond_0
    const-string v0, "Track_SportDataCallbackProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report cb is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 4

    .line 71
    iget-object v0, p0, Lo/cfc;->e:Lo/ceu;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lo/cfc;->e:Lo/ceu;

    invoke-interface {v0, p1}, Lo/ceu;->d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "Track_SportDataCallbackProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSummary cb is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_0
    return-void
.end method
