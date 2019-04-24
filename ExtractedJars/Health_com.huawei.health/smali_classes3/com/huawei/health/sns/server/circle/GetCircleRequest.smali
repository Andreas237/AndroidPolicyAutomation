.class public Lcom/huawei/health/sns/server/circle/GetCircleRequest;
.super Lcom/huawei/health/sns/server/CircleRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/get_circles"


# instance fields
.field private language_:Ljava/lang/String;

.field private origin_user_id_:J

.field private user_id_:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/server/CircleRequestBean;-><init>()V

    .line 19
    const-string v0, "/get_circles"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->method:Ljava/lang/String;

    .line 20
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->module:Ljava/lang/String;

    .line 21
    iput-wide p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->user_id_:J

    .line 22
    iput-wide p3, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->origin_user_id_:J

    .line 23
    new-instance v0, Lo/bax;

    invoke-direct {v0}, Lo/bax;-><init>()V

    invoke-virtual {v0}, Lo/bax;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->language_:Ljava/lang/String;

    .line 24
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->version:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 69
    new-instance v0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/circle/GetCircleResponse;-><init>()V

    return-object v0
.end method

.method public getLanguage_()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->language_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    const-string v0, "GetCircleRequest, "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    const-string v0, "lang:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->language_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOrigin_user_id_()J
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->origin_user_id_:J

    return-wide v0
.end method

.method public getUser_id_()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->user_id_:J

    return-wide v0
.end method

.method public setLanguage_(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->language_:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setOrigin_user_id_(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->origin_user_id_:J

    .line 41
    return-void
.end method

.method public setUser_id_(J)V
    .locals 0

    .line 32
    iput-wide p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleRequest;->user_id_:J

    .line 33
    return-void
.end method
