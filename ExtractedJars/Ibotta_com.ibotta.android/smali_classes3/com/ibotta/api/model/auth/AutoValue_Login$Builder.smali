.class final Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;
.super Lcom/ibotta/api/model/auth/Login$Builder;
.source "AutoValue_Login.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/auth/AutoValue_Login;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private customerSocialAuthCode:Ljava/lang/String;

.field private customerSocialExpiration:Ljava/lang/Long;

.field private customerSocialIdentifier:Ljava/lang/String;

.field private customerSocialSecret:Ljava/lang/String;

.field private customerSocialToken:Ljava/lang/String;

.field private deviceUdid:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private password:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 163
    invoke-direct {p0}, Lcom/ibotta/api/model/auth/Login$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 185
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object p0

    .line 183
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/api/model/auth/Login;
    .locals 14

    const-string v0, ""

    .line 216
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    if-nez v1, :cond_0

    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 219
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialExpiration:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " customerSocialExpiration"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 222
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 225
    new-instance v0, Lcom/ibotta/api/model/auth/AutoValue_Login;

    iget-object v3, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->email:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->password:Ljava/lang/String;

    iget-object v5, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->deviceUdid:Ljava/lang/String;

    iget-object v6, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    iget-object v7, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialIdentifier:Ljava/lang/String;

    iget-object v8, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialToken:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialExpiration:Ljava/lang/Long;

    .line 233
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialAuthCode:Ljava/lang/String;

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/ibotta/api/model/auth/AutoValue_Login;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/ibotta/api/model/auth/AutoValue_Login$1;)V

    return-object v0

    .line 223
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public customerSocialAuthCode(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 210
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialAuthCode:Ljava/lang/String;

    return-object p0
.end method

.method public customerSocialExpiration(J)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0

    .line 205
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialExpiration:Ljava/lang/Long;

    return-object p0
.end method

.method public customerSocialIdentifier(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 190
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialIdentifier:Ljava/lang/String;

    return-object p0
.end method

.method public customerSocialSecret(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 200
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialSecret:Ljava/lang/String;

    return-object p0
.end method

.method public customerSocialToken(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 195
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->customerSocialToken:Ljava/lang/String;

    return-object p0
.end method

.method public deviceUdid(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 177
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->deviceUdid:Ljava/lang/String;

    return-object p0
.end method

.method public email(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 167
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method public password(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->password:Ljava/lang/String;

    return-object p0
.end method
