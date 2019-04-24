.class public Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;
.super Lcom/twitter/sdk/android/core/AuthToken;
.source "OAuth2Token.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final accessToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "access_token"
    .end annotation
.end field

.field private final tokenType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "token_type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token$1;

    invoke-direct {v0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token$1;-><init>()V

    sput-object v0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/AuthToken;-><init>()V

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token$1;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/AuthToken;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 112
    :cond_1
    check-cast p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;

    .line 114
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 116
    :cond_3
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    if-eqz p1, :cond_5

    :goto_1
    return v1

    :cond_5
    return v0

    :cond_6
    :goto_2
    return v1
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    return-object v0
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

    .line 90
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 91
    invoke-static {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Service;->getAuthorizationHeader(Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Authorization"

    .line 92
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public getTokenType()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 124
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 125
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public isExpired()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 103
    iget-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->tokenType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 104
    iget-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth2Token;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
