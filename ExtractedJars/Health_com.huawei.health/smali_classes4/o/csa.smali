.class public Lo/csa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;III)Lo/cob;
    .locals 2

    .line 22
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->b(I)I

    move-result v1

    .line 23
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p2, p3, v1}, Lo/cqd;->c(III)Lo/cob;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;IIDIJ)I
    .locals 6

    .line 27
    invoke-static {p6, p7}, Lo/cnk;->a(J)I

    move-result v4

    .line 28
    invoke-static {p0, p1, v4, p2}, Lo/csa;->c(Landroid/content/Context;III)Lo/cob;

    move-result-object v5

    .line 29
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 30
    const/4 v0, 0x1

    if-ne v0, p5, :cond_0

    invoke-virtual {v5}, Lo/cob;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v5}, Lo/cob;->d()D

    move-result-wide v0

    cmpl-double v0, p3, v0

    if-lez v0, :cond_0

    .line 31
    const-string v0, "Debug_HiSportStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getSyncStatus is SYNC_NONE! type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", date = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_0
    return p5
.end method
