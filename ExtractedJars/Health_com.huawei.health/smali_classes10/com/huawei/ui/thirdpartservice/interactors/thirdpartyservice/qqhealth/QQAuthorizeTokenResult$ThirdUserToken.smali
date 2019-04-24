.class public Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ThirdUserToken"
.end annotation


# instance fields
.field private expireTime:I

.field private huid:J

.field private lastModifyTime:Ljava/lang/String;

.field private sessionId:Ljava/lang/String;

.field private thirdAccessToken:Ljava/lang/String;

.field private thirdAccount:Ljava/lang/String;

.field private thirdAccountType:I

.field private valid:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->huid:J

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->lastModifyTime:Ljava/lang/String;

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->valid:Z

    return-void
.end method


# virtual methods
.method public getExpireTime()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->expireTime:I

    return v0
.end method

.method public getHuid()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->huid:J

    return-wide v0
.end method

.method public getLastModifyTime()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->lastModifyTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAccessToken()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAccount()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAccountType()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccountType:I

    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->valid:Z

    return v0
.end method

.method public setExpireTime(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->expireTime:I

    .line 49
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->huid:J

    .line 57
    return-void
.end method

.method public setLastModifyTime(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->lastModifyTime:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setSessionId(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->sessionId:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setThirdAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccessToken:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setThirdAccount(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccount:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setThirdAccountType(I)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->thirdAccountType:I

    .line 97
    return-void
.end method

.method public setValid(Z)V
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->valid:Z

    .line 105
    return-void
.end method
