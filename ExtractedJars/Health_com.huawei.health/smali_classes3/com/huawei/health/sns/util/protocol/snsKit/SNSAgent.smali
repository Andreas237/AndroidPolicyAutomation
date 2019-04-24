.class public Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-class v0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 3

    .line 116
    new-instance v1, Lo/bqm;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lo/bqm;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 117
    sget-object v0, Lo/ayw;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 118
    invoke-virtual {v1}, Lo/bqm;->b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 119
    return-object v2
.end method

.method private static a(Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;Z)V
    .locals 4

    .line 124
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeTask, ActiveCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", TaskCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 127
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :cond_0
    if-eqz p1, :cond_1

    .line 132
    sget-object v0, Lo/bqw;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->c(Ljava/util/concurrent/Executor;)V

    goto :goto_0

    .line 136
    :cond_1
    sget-object v0, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->c(Ljava/util/concurrent/Executor;)V

    .line 138
    :goto_0
    return-void
.end method

.method public static b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 3

    .line 42
    new-instance v1, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 43
    invoke-static {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)V

    .line 44
    invoke-virtual {v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 45
    return-object v2
.end method

.method public static c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;
    .locals 2

    .line 27
    new-instance v1, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 28
    invoke-static {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)V

    .line 30
    iget-boolean v0, p0, Lcom/huawei/health/sns/server/SNSRequestBean;->isSerial:Z

    invoke-static {v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->a(Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;Z)V

    .line 31
    return-object v1
.end method

.method public static c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 3

    .line 86
    new-instance v1, Lo/bqo;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lo/bqo;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 87
    sget-object v0, Lo/ayw;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v1}, Lo/bqo;->b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 89
    return-object v2
.end method

.method public static c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqm;
    .locals 2

    .line 101
    new-instance v1, Lo/bqm;

    invoke-direct {v1, p0, p1}, Lo/bqm;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 102
    sget-object v0, Lo/ayw;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 104
    sget-object v0, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Lo/bqm;->c(Ljava/util/concurrent/Executor;)V

    .line 105
    return-object v1
.end method

.method private static d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)V
    .locals 2

    .line 148
    if-nez p0, :cond_0

    .line 150
    return-void

    .line 152
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getTarget()Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->SNSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    if-ne v0, v1, :cond_1

    .line 154
    sget-object v0, Lo/ayw;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 156
    :cond_1
    return-void
.end method

.method public static e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 3

    .line 56
    new-instance v1, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 57
    sget-object v0, Lo/ayw;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;->c()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 59
    return-object v2
.end method

.method public static e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqo;
    .locals 2

    .line 71
    new-instance v1, Lo/bqo;

    invoke-direct {v1, p0, p1}, Lo/bqo;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 72
    sget-object v0, Lo/ayw;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 74
    sget-object v0, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Lo/bqo;->c(Ljava/util/concurrent/Executor;)V

    .line 75
    return-object v1
.end method
