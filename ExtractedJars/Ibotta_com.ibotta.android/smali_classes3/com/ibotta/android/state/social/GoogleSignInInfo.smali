.class public abstract Lcom/ibotta/android/state/social/GoogleSignInInfo;
.super Ljava/lang/Object;
.source "GoogleSignInInfo.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getAuthCode()Ljava/lang/String;
.end method

.method public abstract getEmail()Ljava/lang/String;
.end method

.method public abstract getExpiration()J
.end method

.method public abstract getFirstName()Ljava/lang/String;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getLastName()Ljava/lang/String;
.end method

.method public abstract getProfilePicUrl()Ljava/lang/String;
.end method
