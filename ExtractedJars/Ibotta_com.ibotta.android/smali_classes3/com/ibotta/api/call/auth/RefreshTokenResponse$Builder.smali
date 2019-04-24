.class public abstract Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
.super Ljava/lang/Object;
.source "RefreshTokenResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/auth/RefreshTokenResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract authenticationToken(Ljava/lang/String;)Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token"
    .end annotation
.end method

.method public abstract authenticationTokenExpiration(Ljava/util/Date;)Lcom/ibotta/api/call/auth/RefreshTokenResponse$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token_expiration"
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/api/call/auth/RefreshTokenResponse;
.end method
