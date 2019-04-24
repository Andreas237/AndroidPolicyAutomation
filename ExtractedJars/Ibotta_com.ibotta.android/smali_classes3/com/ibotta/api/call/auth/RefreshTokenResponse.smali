.class public abstract Lcom/ibotta/api/call/auth/RefreshTokenResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "RefreshTokenResponse.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/api/call/auth/RefreshTokenResponse;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getAuthenticationToken()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token"
    .end annotation
.end method

.method public abstract getAuthenticationTokenExpiration()Ljava/util/Date;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token_expiration"
    .end annotation
.end method
