.class public Lo/bqo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/Object;


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/bqo;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/bqo;->c:I

    .line 41
    return-void
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z
    .locals 3

    .line 51
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;

    if-eqz v0, :cond_0

    .line 54
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;

    .line 55
    iget v0, v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;->errcode_:I

    const/16 v1, 0x3ea

    if-ne v1, v0, :cond_0

    .line 58
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ayv;->a(Z)V

    .line 59
    const/4 v0, 0x1

    return v0

    .line 62
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 12

    .line 68
    move-object v4, p1

    .line 70
    invoke-direct {p0, v4}, Lo/bqo;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 72
    sget-object v5, Lo/bqo;->e:Ljava/lang/Object;

    monitor-enter v5

    .line 75
    :try_start_0
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayv;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 77
    const-string v0, "AssistantTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, begin reLogin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqo;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v6

    .line 79
    if-nez v6, :cond_0

    .line 81
    const-string v0, "AssistantTaskEx"

    const-string v1, "accountInfo is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit v5

    return-object v4

    .line 85
    :cond_0
    :try_start_1
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v6}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    const-string v0, "AssistantTaskEx"

    const-string v1, "is not Available"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit v5

    return-object v4

    .line 91
    :cond_1
    :try_start_2
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;

    .line 92
    invoke-virtual {v6}, Lo/axr;->e()I

    move-result v1

    invoke-virtual {v6}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v7

    .line 93
    instance-of v0, v7, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;

    if-eqz v0, :cond_4

    .line 95
    move-object v8, v7

    check-cast v8, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;

    .line 97
    iget v0, v8, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;->errcode_:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 99
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    iget v1, v8, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;->session_expire_:I

    invoke-virtual {v0, v1}, Lo/ayv;->c(I)V

    .line 100
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayv;->a(Z)V

    .line 101
    const-string v0, "AssistantTaskEx"

    const-string v1, "session invalid, reLogin success."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 106
    :cond_2
    iget v0, v7, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3eb

    if-ne v0, v1, :cond_3

    .line 109
    new-instance v9, Landroid/content/Intent;

    const-string v0, "com.huawei.android.sns.action.login.account"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 110
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v10

    .line 111
    invoke-static {v10}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 113
    :cond_3
    const-string v0, "AssistantTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, reLogin failed, errcode_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v8, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;->errcode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    :cond_4
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v11

    monitor-exit v5

    throw v11

    .line 119
    :goto_1
    iget v0, p0, Lo/bqo;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/bqo;->c:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_5

    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayv;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 121
    const-string v0, "AssistantTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry request.current retry time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/bqo;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0}, Lo/bqo;->e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 125
    :cond_5
    return-object v4
.end method
