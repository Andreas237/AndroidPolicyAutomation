.class final Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;
.super Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.source "AutoValue_ApiAuth.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private authRefreshToken:Ljava/lang/String;

.field private authToken:Ljava/lang/String;

.field private authTokenExpiration:Ljava/lang/Long;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/state/user/auth/ApiAuth;)V
    .locals 2

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;-><init>()V

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authToken:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthRefreshToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authRefreshToken:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthTokenExpiration()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authTokenExpiration:Ljava/lang/Long;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/state/user/auth/ApiAuth;Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$1;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;-><init>(Lcom/ibotta/android/state/user/auth/ApiAuth;)V

    return-void
.end method


# virtual methods
.method public authRefreshToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authRefreshToken:Ljava/lang/String;

    return-object p0

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authRefreshToken"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public authToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 92
    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authToken:Ljava/lang/String;

    return-object p0

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authToken"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public authTokenExpiration(J)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    .locals 0

    .line 105
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authTokenExpiration:Ljava/lang/Long;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/state/user/auth/ApiAuth;
    .locals 8

    const-string v0, ""

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authToken:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authToken"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 114
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authRefreshToken:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authRefreshToken"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authTokenExpiration:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authTokenExpiration"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 120
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 123
    new-instance v0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;

    iget-object v3, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authToken:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authRefreshToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;->authTokenExpiration:Ljava/lang/Long;

    .line 126
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$1;)V

    return-object v0

    .line 121
    :cond_3
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
