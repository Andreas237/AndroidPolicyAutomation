.class public abstract Lcom/huawei/health/sns/server/CircleRequestBean;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;
.source "SourceFile"


# static fields
.field public static final FOR_VERSION:Ljava/lang/String; = "0100"

.field public static final MODULE_CIRCLE:Ljava/lang/String; = "/api/client"


# instance fields
.field public userID:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;-><init>()V

    .line 22
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/CircleRequestBean;->userID:Ljava/lang/Long;

    .line 29
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->CISServer:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/CircleRequestBean;->setTarget(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;)V

    .line 30
    return-void
.end method


# virtual methods
.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/server/CircleRequestBean;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/CircleRequestBean;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/CircleRequestBean;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "?version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/CircleRequestBean;->version:Ljava/lang/String;

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&userid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/CircleRequestBean;->userID:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&appversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 38
    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    return-object v0
.end method
