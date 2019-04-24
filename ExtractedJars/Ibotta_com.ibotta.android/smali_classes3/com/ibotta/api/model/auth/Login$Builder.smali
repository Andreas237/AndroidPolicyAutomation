.class public abstract Lcom/ibotta/api/model/auth/Login$Builder;
.super Ljava/lang/Object;
.source "Login.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/auth/Login;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract build()Lcom/ibotta/api/model/auth/Login;
.end method

.method public abstract customerSocialAuthCode(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract customerSocialExpiration(J)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract customerSocialIdentifier(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract customerSocialSecret(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract customerSocialToken(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract deviceUdid(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract email(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method

.method public abstract password(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;
.end method
