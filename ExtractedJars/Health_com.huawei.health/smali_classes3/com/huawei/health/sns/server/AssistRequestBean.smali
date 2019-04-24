.class public abstract Lcom/huawei/health/sns/server/AssistRequestBean;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;
.source "SourceFile"


# static fields
.field public static final FOR_VERSION:Ljava/lang/String; = "0100"

.field public static final MODULE_ASSIST:Ljava/lang/String; = "/api/client"


# instance fields
.field public userID:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;-><init>()V

    .line 28
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/AssistRequestBean;->userID:Ljava/lang/Long;

    .line 35
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->MPSServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/AssistRequestBean;->setTarget(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;)V

    .line 36
    return-void
.end method


# virtual methods
.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/server/AssistRequestBean;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/AssistRequestBean;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "?version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/AssistRequestBean;->version:Ljava/lang/String;

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&userid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/AssistRequestBean;->userID:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&appversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 43
    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 41
    return-object v0
.end method
