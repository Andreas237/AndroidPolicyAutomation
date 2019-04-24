.class public Lo/apr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(J)V
    .locals 1

    .line 86
    new-instance v0, Lo/apr$1;

    invoke-direct {v0, p0, p1}, Lo/apr$1;-><init>(J)V

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 99
    return-void
.end method

.method public static a(JZ)V
    .locals 2

    .line 111
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lo/apr;->b(JZ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 112
    return-void
.end method

.method private static b(JZ)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 123
    new-instance v0, Lo/apr$2;

    invoke-direct {v0, p0, p1, p2}, Lo/apr$2;-><init>(JZ)V

    return-object v0
.end method

.method public static c(JZZ)Lcom/huawei/health/sns/model/group/Group;
    .locals 2

    .line 31
    invoke-static {p0, p1, p2}, Lo/apr;->d(JZ)V

    .line 32
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 35
    if-nez p3, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    if-nez v0, :cond_1

    .line 38
    :cond_0
    invoke-static {p0, p1}, Lo/apr;->a(J)V

    .line 40
    :cond_1
    return-object v1
.end method

.method public static d(J)V
    .locals 7

    .line 143
    new-instance v6, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 144
    move-object v0, v6

    move-wide v1, p0

    const/4 v3, 0x2

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 145
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    .line 146
    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 145
    const/16 v2, 0x25

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v6, v3}, Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V

    .line 147
    return-void
.end method

.method private static d(JZ)V
    .locals 1

    .line 52
    new-instance v0, Lo/apr$5;

    invoke-direct {v0, p0, p1, p2}, Lo/apr$5;-><init>(JZ)V

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 76
    return-void
.end method
