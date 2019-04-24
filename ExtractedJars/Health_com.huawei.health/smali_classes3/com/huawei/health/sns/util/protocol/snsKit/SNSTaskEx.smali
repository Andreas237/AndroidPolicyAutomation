.class public Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;
.super Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/Object;


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->c:I

    .line 53
    return-void
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z
    .locals 2

    .line 63
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    if-nez v0, :cond_0

    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_0

    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_0

    .line 69
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/azc;->a(Z)V

    .line 70
    const/4 v0, 0x1

    return v0

    .line 72
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 184
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    if-eqz v0, :cond_0

    .line 186
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 188
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 190
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    .line 191
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 193
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    .line 194
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getSessionValidTime_()I

    move-result v1

    .line 193
    invoke-virtual {v0, v1}, Lo/azc;->c(I)V

    .line 195
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/azc;->a(Z)V

    .line 196
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getGrpLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bcm;->a(I)V

    .line 198
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isSnsServerLogin"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 203
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 2

    .line 158
    if-eqz p1, :cond_0

    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    .line 161
    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getTarget()Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    if-ne v0, v1, :cond_0

    .line 164
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->k()V

    .line 166
    :cond_0
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z
    .locals 1

    .line 171
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    if-eqz v0, :cond_0

    .line 173
    const/4 v0, 0x1

    return v0

    .line 177
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 15

    .line 78
    move-object/from16 v6, p1

    .line 80
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 82
    sget-object v7, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->e:Ljava/lang/Object;

    monitor-enter v7

    .line 85
    :try_start_0
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->a()Z

    move-result v0

    if-nez v0, :cond_6

    .line 87
    const-string v0, "SNSTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, begin reLogin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v8

    .line 89
    if-nez v8, :cond_0

    .line 91
    const-string v0, "SNSTaskEx"

    const-string v1, "accountInfo is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit v7

    return-object v6

    .line 96
    :cond_0
    :try_start_1
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v8}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    const-string v0, "SNSTaskEx"

    const-string v1, "is not Available"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    monitor-exit v7

    return-object v6

    .line 101
    :cond_1
    :try_start_2
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->e()Ljava/lang/String;

    move-result-object v9

    .line 103
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    invoke-virtual {v8}, Lo/axr;->e()I

    move-result v1

    .line 104
    invoke-virtual {v8}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v3

    move-object v4, v9

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    .line 106
    invoke-static {v10}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v11

    .line 107
    iget v0, v11, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 109
    instance-of v0, v11, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    if-eqz v0, :cond_6

    .line 111
    iget v0, v11, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    .line 113
    move-object v12, v11

    check-cast v12, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    .line 114
    invoke-virtual {v12}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 116
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    .line 117
    invoke-virtual {v12}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getSessionValidTime_()I

    move-result v1

    .line 116
    invoke-virtual {v0, v1}, Lo/azc;->c(I)V

    .line 118
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/azc;->a(Z)V

    .line 119
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getGrpLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bcm;->a(I)V

    .line 120
    const-string v0, "SNSTaskEx"

    const-string v1, "session invalid, reLogin success."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_2
    goto :goto_0

    .line 128
    :cond_3
    iget v0, v11, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3ec

    if-ne v0, v1, :cond_4

    .line 131
    new-instance v12, Landroid/content/Intent;

    const-string v0, "com.huawei.android.sns.action.login.account"

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 132
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v13

    .line 133
    invoke-static {v13}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 135
    :cond_4
    const-string v0, "SNSTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session invalid, reLogin failed, resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v11, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 141
    :cond_5
    const-string v0, "SNSTaskEx"

    const-string v1, "session invalid, reLogin failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    :cond_6
    :goto_0
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v14

    monitor-exit v7

    throw v14

    .line 146
    :goto_1
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->c:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_7

    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 148
    const-string v0, "SNSTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry request.current retry time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v6

    .line 152
    :cond_7
    return-object v6
.end method

.method protected e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z
    .locals 6

    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    if-eqz v0, :cond_1

    .line 213
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;

    .line 214
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isPushTokenReportSucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v5

    .line 216
    invoke-virtual {v4}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->getPushToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v5, :cond_1

    .line 218
    :cond_0
    const/4 v3, 0x1

    .line 219
    const-string v0, "SNSTaskEx"

    const-string v1, "isLoginSuccBeforeDoLogin:true"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    :cond_1
    return v3
.end method
