.class final Lcom/ibotta/api/model/auth/AutoValue_Login;
.super Lcom/ibotta/api/model/auth/Login;
.source "AutoValue_Login.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;
    }
.end annotation


# instance fields
.field private final authType:Lcom/ibotta/api/model/auth/AuthType;

.field private final customerSocialAuthCode:Ljava/lang/String;

.field private final customerSocialExpiration:J

.field private final customerSocialIdentifier:Ljava/lang/String;

.field private final customerSocialSecret:Ljava/lang/String;

.field private final customerSocialToken:Ljava/lang/String;

.field private final deviceUdid:Ljava/lang/String;

.field private final email:Ljava/lang/String;

.field private final password:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0}, Lcom/ibotta/api/model/auth/Login;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->email:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->password:Ljava/lang/String;

    .line 33
    iput-object p3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->deviceUdid:Ljava/lang/String;

    .line 34
    iput-object p4, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 35
    iput-object p5, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialIdentifier:Ljava/lang/String;

    .line 36
    iput-object p6, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialToken:Ljava/lang/String;

    .line 37
    iput-object p7, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialSecret:Ljava/lang/String;

    .line 38
    iput-wide p8, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialExpiration:J

    .line 39
    iput-object p10, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialAuthCode:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/ibotta/api/model/auth/AutoValue_Login$1;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p10}, Lcom/ibotta/api/model/auth/AutoValue_Login;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 114
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/auth/Login;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    .line 115
    check-cast p1, Lcom/ibotta/api/model/auth/Login;

    .line 116
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->email:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_0
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->password:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 117
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getPassword()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getPassword()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_1
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->deviceUdid:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 118
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getDeviceUdid()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getDeviceUdid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_2
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 119
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialIdentifier:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 120
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_3
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialToken:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 121
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_4
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialSecret:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 122
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialSecret()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_5
    iget-wide v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialExpiration:J

    .line 123
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialExpiration()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialAuthCode:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 124
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialAuthCode()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getCustomerSocialAuthCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    return v0

    :cond_9
    return v2
.end method

.method public getAuthType()Lcom/ibotta/api/model/auth/AuthType;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object v0
.end method

.method public getCustomerSocialAuthCode()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialAuthCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialExpiration()J
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialExpiration:J

    return-wide v0
.end method

.method public getCustomerSocialIdentifier()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialSecret()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialToken:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceUdid()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->deviceUdid:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->password:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 7

    .line 133
    iget-object v0, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->email:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 135
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->password:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 137
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->deviceUdid:Ljava/lang/String;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 139
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v3}, Lcom/ibotta/api/model/auth/AuthType;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 141
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialIdentifier:Ljava/lang/String;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 143
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialToken:Ljava/lang/String;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 145
    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialSecret:Ljava/lang/String;

    if-nez v3, :cond_5

    const/4 v3, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 147
    iget-wide v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialExpiration:J

    const/16 v5, 0x20

    ushr-long v5, v3, v5

    xor-long/2addr v3, v5

    long-to-int v4, v3

    xor-int/2addr v0, v4

    mul-int v0, v0, v2

    .line 149
    iget-object v2, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialAuthCode:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Login{email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", password="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->password:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceUdid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->deviceUdid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerSocialIdentifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customerSocialToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customerSocialSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialSecret:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customerSocialExpiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialExpiration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", customerSocialAuthCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login;->customerSocialAuthCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
