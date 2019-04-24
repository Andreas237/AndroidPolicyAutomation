.class public Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ThirdAuthToken"
.end annotation


# instance fields
.field private createTime:J

.field private expireTime:J

.field private huid:J

.field private lastModifyTime:J

.field private openId:Ljava/lang/String;

.field private scope:Ljava/lang/String;

.field private sessionId:Ljava/lang/String;

.field private thirdAccountType:I

.field private thirdToken:Ljava/lang/String;

.field private thirdTokenType:Ljava/lang/String;

.field private valid:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->huid:J

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdAccountType:I

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->openId:Ljava/lang/String;

    .line 43
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdTokenType:Ljava/lang/String;

    .line 44
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdToken:Ljava/lang/String;

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->scope:Ljava/lang/String;

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->sessionId:Ljava/lang/String;

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->lastModifyTime:J

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->expireTime:J

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->createTime:J

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->valid:Z

    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 133
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->createTime:J

    return-wide v0
.end method

.method public getExpireTime()J
    .locals 2

    .line 129
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->expireTime:J

    return-wide v0
.end method

.method public getHuid()J
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->huid:J

    return-wide v0
.end method

.method public getLastModifyTime()J
    .locals 2

    .line 125
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->lastModifyTime:J

    return-wide v0
.end method

.method public getOpenId()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->openId:Ljava/lang/String;

    return-object v0
.end method

.method public getScope()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->scope:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAccountType()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdAccountType:I

    return v0
.end method

.method public getThirdToken()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdToken:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdTokenType()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdTokenType:Ljava/lang/String;

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->valid:Z

    return v0
.end method

.method public setCreateTime(I)V
    .locals 2

    .line 113
    int-to-long v0, p1

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->createTime:J

    .line 114
    return-void
.end method

.method public setExpireTime(I)V
    .locals 2

    .line 109
    int-to-long v0, p1

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->expireTime:J

    .line 110
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->huid:J

    .line 78
    return-void
.end method

.method public setLastModifyTime(I)V
    .locals 2

    .line 105
    int-to-long v0, p1

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->lastModifyTime:J

    .line 106
    return-void
.end method

.method public setOpenId(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->openId:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setScope(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->scope:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setSessionId(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->sessionId:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setThirdAccountType(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdAccountType:I

    .line 82
    return-void
.end method

.method public setThirdToken(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdToken:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setThirdTokenType(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->thirdTokenType:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setValid(Z)V
    .locals 0

    .line 117
    iput-boolean p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->valid:Z

    .line 118
    return-void
.end method
