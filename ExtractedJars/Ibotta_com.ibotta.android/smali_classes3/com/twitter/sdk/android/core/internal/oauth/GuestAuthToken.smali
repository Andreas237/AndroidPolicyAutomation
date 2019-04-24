.class public Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;
.super Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;
.source "GuestAuthToken.java"


# instance fields
.field private final guestToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "guest_token"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 74
    :cond_1
    invoke-super {p0, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 76
    :cond_2
    check-cast p1, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;

    .line 78
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    if-eqz p1, :cond_4

    :goto_0
    return v1

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public getAuthHeaders(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/TwitterAuthConfig;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 64
    invoke-super {p0, p1, p2, p3, p4}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->getAuthHeaders(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "x-guest-token"

    .line 66
    invoke-virtual {p0}, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->getGuestToken()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public getGuestToken()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 86
    invoke-super {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 87
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->guestToken:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public isExpired()Z
    .locals 6

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/GuestAuthToken;->createdAt:J

    const-wide/32 v4, 0xa4cb80

    add-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
