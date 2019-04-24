.class public abstract Lcom/ibotta/android/state/user/auth/ApiAuth;
.super Ljava/lang/Object;
.source "ApiAuth.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 7
    invoke-static {}, Lcom/ibotta/android/state/user/auth/ApiAuth;->builder()Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    const-string v1, ""

    .line 8
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    const-string v1, ""

    .line 9
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authRefreshToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authTokenExpiration(J)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->build()Lcom/ibotta/android/state/user/auth/ApiAuth;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/user/auth/ApiAuth;->EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    .locals 1

    .line 19
    new-instance v0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getAuthRefreshToken()Ljava/lang/String;
.end method

.method public abstract getAuthToken()Ljava/lang/String;
.end method

.method public abstract getAuthTokenExpiration()J
.end method

.method public abstract toBuilder()Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.end method
