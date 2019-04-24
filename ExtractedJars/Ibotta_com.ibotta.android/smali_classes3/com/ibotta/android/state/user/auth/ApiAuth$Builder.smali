.class public abstract Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.super Ljava/lang/Object;
.source "ApiAuth.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/user/auth/ApiAuth;
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
.method public abstract authRefreshToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.end method

.method public abstract authToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.end method

.method public abstract authTokenExpiration(J)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/state/user/auth/ApiAuth;
.end method
