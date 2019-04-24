.class public abstract Lcom/ibotta/api/model/auth/Login;
.super Ljava/lang/Object;
.source "Login.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/auth/Login$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/auth/Login$Builder;
    .locals 3

    .line 23
    new-instance v0, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;-><init>()V

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/AutoValue_Login$Builder;->authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialExpiration(J)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getAuthType()Lcom/ibotta/api/model/auth/AuthType;
.end method

.method public abstract getCustomerSocialAuthCode()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCustomerSocialExpiration()J
.end method

.method public abstract getCustomerSocialIdentifier()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCustomerSocialSecret()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCustomerSocialToken()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDeviceUdid()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEmail()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPassword()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
