.class public Lo/bqr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqq;
    .locals 2

    .line 33
    new-instance v1, Lo/bqq;

    invoke-direct {v1, p0, p1}, Lo/bqq;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 34
    sget-object v0, Lo/ayw;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 36
    sget-object v0, Lo/bqw;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Lo/bqq;->c(Ljava/util/concurrent/Executor;)V

    .line 37
    return-object v1
.end method

.method public static d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 2

    .line 19
    new-instance v1, Lo/bqq;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lo/bqq;-><init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V

    .line 20
    sget-object v0, Lo/ayw;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->setUrl(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v1}, Lo/bqq;->b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method
