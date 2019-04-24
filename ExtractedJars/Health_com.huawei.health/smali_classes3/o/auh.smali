.class public final Lo/auh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aue;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    return-void
.end method

.method private b(Lo/aud;)V
    .locals 5

    .line 69
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 71
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v3

    .line 72
    if-nez v3, :cond_0

    .line 74
    const-string v0, "AssistantLoginRequest"

    const-string v1, "doAssistantRequest accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 76
    return-void

    .line 78
    :cond_0
    invoke-static {v3}, Lo/aug;->b(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 81
    return-void

    .line 84
    :cond_1
    invoke-static {v3}, Lo/aug;->c(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 86
    const v0, 0x14ffb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 87
    return-void

    .line 90
    :cond_2
    new-instance v4, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;

    invoke-virtual {v3}, Lo/axr;->e()I

    move-result v0

    .line 91
    invoke-virtual {v3}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v0, v1, v2}, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v0, Lo/auh$4;

    invoke-direct {v0, p0, p1}, Lo/auh$4;-><init>(Lo/auh;Lo/aud;)V

    invoke-static {v4, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqo;

    .line 124
    goto :goto_0

    .line 127
    :cond_3
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 128
    const-string v0, "AssistantLoginRequest"

    const-string v1, "RequestUtil: has not login hwaccount!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/aud;)V
    .locals 0

    .line 136
    return-void
.end method

.method public c(Lo/aud;)V
    .locals 4

    .line 41
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    const-string v0, "AssistantLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-void

    .line 45
    :cond_0
    if-nez p1, :cond_1

    .line 47
    return-void

    .line 51
    :cond_1
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayv;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 53
    invoke-interface {p1}, Lo/aud;->a()V

    .line 54
    const-string v0, "AssistantLoginRequest"

    const-string v1, "has login assistant server session valid"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_2
    invoke-direct {p0, p1}, Lo/auh;->b(Lo/aud;)V

    .line 60
    :goto_0
    return-void
.end method
