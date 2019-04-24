.class final Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;
.super Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
.source "AutoValue_RefreshTokenResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private authenticationToken:Ljava/lang/String;

.field private authenticationTokenExpiration:Ljava/util/Date;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public authenticationToken(Ljava/lang/String;)Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 75
    iput-object p1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationToken:Ljava/lang/String;

    return-object p0

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authenticationToken"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public authenticationTokenExpiration(Ljava/util/Date;)Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 83
    iput-object p1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationTokenExpiration:Ljava/util/Date;

    return-object p0

    .line 81
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authenticationTokenExpiration"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/api/call/auth/RefreshTokenResponse;
    .locals 4

    const-string v0, ""

    .line 89
    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationToken:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authenticationToken"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationTokenExpiration:Ljava/util/Date;

    if-nez v1, :cond_1

    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authenticationTokenExpiration"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 95
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 98
    new-instance v0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;

    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;->authenticationTokenExpiration:Ljava/util/Date;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;-><init>(Ljava/lang/String;Ljava/util/Date;Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$1;)V

    return-object v0

    .line 96
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
