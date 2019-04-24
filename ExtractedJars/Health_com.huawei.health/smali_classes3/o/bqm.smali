.class public Lo/bqm;
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

    sput-object v0, Lo/bqm;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/bqm;->c:I

    .line 41
    return-void
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z
    .locals 3

    .line 51
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;

    if-eqz v0, :cond_0

    .line 53
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;

    .line 54
    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->getErrcode_()I

    move-result v0

    const/16 v1, 0x3ea

    if-ne v1, v0, :cond_0

    .line 57
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ayu;->a(Z)V

    .line 58
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 11

    .line 67
    move-object v3, p1

    .line 69
    invoke-direct {p0, v3}, Lo/bqm;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 71
    sget-object v4, Lo/bqm;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 74
    :try_start_0
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayu;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 76
    const-string v0, "CircleTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, begin reLogin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqm;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v5

    .line 78
    if-nez v5, :cond_0

    .line 80
    const-string v0, "CircleTaskEx"

    const-string v1, "accountInfo is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v4

    return-object v3

    .line 85
    :cond_0
    :try_start_1
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v5}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    const-string v0, "CircleTaskEx"

    const-string v1, "is not Available"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit v4

    return-object v3

    .line 91
    :cond_1
    :try_start_2
    new-instance v0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;

    invoke-direct {v0, v5}, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;-><init>(Lo/axr;)V

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v6

    .line 92
    instance-of v0, v6, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    if-eqz v0, :cond_4

    .line 94
    move-object v7, v6

    check-cast v7, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    .line 96
    invoke-virtual {v7}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 98
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    iget v1, v7, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->session_expire_:I

    invoke-virtual {v0, v1}, Lo/ayu;->c(I)V

    .line 99
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayu;->a(Z)V

    .line 100
    const-string v0, "CircleTaskEx"

    const-string v1, "session invalid, reLogin success."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :cond_2
    iget v0, v6, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3eb

    if-ne v0, v1, :cond_3

    .line 108
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.android.sns.action.login.account"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v9

    .line 110
    invoke-static {v9}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 112
    :cond_3
    const-string v0, "CircleTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, reLogin failed, errcode_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    :cond_4
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 117
    :goto_1
    iget v0, p0, Lo/bqm;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/bqm;->c:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_5

    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayu;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 119
    const-string v0, "CircleTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry request.current retry time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/bqm;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    invoke-virtual {p0}, Lo/bqm;->e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 123
    :cond_5
    return-object v3
.end method
