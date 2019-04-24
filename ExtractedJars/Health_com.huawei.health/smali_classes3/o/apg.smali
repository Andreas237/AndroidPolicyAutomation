.class public final Lo/apg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/apg;


# instance fields
.field private a:Lo/aql;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lo/apg;->c:Lo/apg;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apg;->a:Lo/aql;

    .line 41
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 42
    new-instance v0, Lo/aql;

    invoke-direct {v0, v1}, Lo/aql;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/apg;->a:Lo/aql;

    .line 43
    return-void
.end method

.method public static declared-synchronized b()Lo/apg;
    .locals 3

    const-class v1, Lo/apg;

    monitor-enter v1

    .line 53
    :try_start_0
    sget-object v0, Lo/apg;->c:Lo/apg;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Lo/apg;

    invoke-direct {v0}, Lo/apg;-><init>()V

    sput-object v0, Lo/apg;->c:Lo/apg;

    .line 57
    :cond_0
    sget-object v0, Lo/apg;->c:Lo/apg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public c(J)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/apg;->a:Lo/aql;

    invoke-virtual {v0, p1, p2}, Lo/aql;->e(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c(Lcom/huawei/health/sns/model/chat/Assistant;)Z
    .locals 5

    monitor-enter p0

    .line 96
    if-nez p1, :cond_0

    .line 98
    const-string v0, "AssistantManager"

    const-string v1, "insertOrUpdateAssistant assistant = null."

    :try_start_0
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 101
    :cond_0
    const/4 v2, 0x0

    .line 102
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v3

    .line 103
    if-eqz v3, :cond_2

    .line 105
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserType(I)V

    .line 107
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 109
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setNickName(Ljava/lang/String;)V

    .line 111
    :cond_1
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axa;->g(Lcom/huawei/health/sns/model/user/User;)Z

    .line 112
    iget-object v0, p0, Lo/apg;->a:Lo/aql;

    invoke-virtual {v0, p1}, Lo/aql;->b(Lcom/huawei/health/sns/model/chat/Assistant;)Z

    move-result v2

    goto :goto_0

    .line 117
    :cond_2
    new-instance v4, Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Lcom/huawei/health/sns/model/user/User;-><init>(J)V

    .line 118
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 120
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 122
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 124
    :cond_3
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axa;->g(Lcom/huawei/health/sns/model/user/User;)Z

    .line 125
    iget-object v0, p0, Lo/apg;->a:Lo/aql;

    invoke-virtual {v0, p1}, Lo/aql;->d(Lcom/huawei/health/sns/model/chat/Assistant;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    .line 127
    :goto_0
    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d(J)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 2

    .line 80
    iget-object v0, p0, Lo/apg;->a:Lo/aql;

    invoke-virtual {v0, p1, p2}, Lo/aql;->e(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Assistant;->isAlreadyFriend()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_0
    return-object v1
.end method

.method public e(Ljava/lang/String;)J
    .locals 2

    .line 196
    iget-object v0, p0, Lo/apg;->a:Lo/aql;

    invoke-virtual {v0, p1}, Lo/aql;->d(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e(Lo/axs;I)Ljava/lang/CharSequence;
    .locals 5

    .line 160
    if-nez p1, :cond_0

    .line 162
    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    invoke-virtual {p1}, Lo/axs;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 166
    invoke-virtual {p1}, Lo/axs;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 168
    :cond_1
    invoke-virtual {p1}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v2

    .line 169
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 171
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/axq;

    .line 172
    if-eqz v3, :cond_4

    .line 174
    const/4 v0, 0x6

    if-eq p2, v0, :cond_2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    .line 176
    :cond_2
    invoke-virtual {v3}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 178
    :cond_3
    const/4 v0, 0x7

    if-ne p2, v0, :cond_4

    .line 180
    invoke-virtual {v3}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v4

    .line 181
    invoke-static {v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    return-object v0

    .line 185
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 3

    .line 138
    const/4 v2, 0x1

    .line 139
    if-nez p1, :cond_0

    .line 141
    return v2

    .line 143
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getReceiveArticlePushStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 145
    const/4 v0, 0x0

    return v0

    .line 147
    :cond_1
    return v2
.end method
