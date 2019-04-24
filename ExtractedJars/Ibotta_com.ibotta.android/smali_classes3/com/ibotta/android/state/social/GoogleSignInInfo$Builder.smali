.class public abstract Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.super Ljava/lang/Object;
.source "GoogleSignInInfo.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/social/GoogleSignInInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract authCode(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/state/social/GoogleSignInInfo;
.end method

.method public abstract email(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract expiration(J)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract firstName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract id(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract lastName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method

.method public abstract profilePicUrl(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;
.end method
