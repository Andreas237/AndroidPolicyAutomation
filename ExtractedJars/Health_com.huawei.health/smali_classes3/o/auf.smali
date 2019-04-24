.class public final Lo/auf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aue;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    return-void
.end method

.method private b(Lo/aud;)V
    .locals 4

    .line 70
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v2

    .line 73
    if-nez v2, :cond_0

    .line 75
    const-string v0, "CircleLoginRequest"

    const-string v1, "doCircleRequest accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 77
    return-void

    .line 79
    :cond_0
    invoke-static {v2}, Lo/aug;->b(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 82
    return-void

    .line 85
    :cond_1
    invoke-static {v2}, Lo/aug;->c(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const v0, 0x14ffb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 88
    return-void

    .line 91
    :cond_2
    new-instance v3, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;

    invoke-direct {v3, v2}, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;-><init>(Lo/axr;)V

    .line 92
    new-instance v0, Lo/auf$4;

    invoke-direct {v0, p0, p1}, Lo/auf$4;-><init>(Lo/auf;Lo/aud;)V

    invoke-static {v3, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqm;

    .line 123
    goto :goto_0

    .line 126
    :cond_3
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 127
    const-string v0, "CircleLoginRequest"

    const-string v1, "RequestUtil:doCircleRequest() has not login hwaccount!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/aud;)V
    .locals 0

    .line 135
    return-void
.end method

.method public c(Lo/aud;)V
    .locals 4

    .line 42
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "CircleLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void

    .line 46
    :cond_0
    if-nez p1, :cond_1

    .line 48
    return-void

    .line 52
    :cond_1
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayu;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    invoke-interface {p1}, Lo/aud;->a()V

    .line 55
    const-string v0, "CircleLoginRequest"

    const-string v1, "has login Circle server session valid"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 59
    :cond_2
    invoke-direct {p0, p1}, Lo/auf;->b(Lo/aud;)V

    .line 61
    :goto_0
    return-void
.end method
