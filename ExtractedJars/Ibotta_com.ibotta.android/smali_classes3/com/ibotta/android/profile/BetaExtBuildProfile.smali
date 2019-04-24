.class public final Lcom/ibotta/android/profile/BetaExtBuildProfile;
.super Lcom/ibotta/android/profile/BetaBuildProfile;
.source "BetaExtBuildProfile.kt"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/profile/BetaExtBuildProfile;",
        "Lcom/ibotta/android/profile/BetaBuildProfile;",
        "context",
        "Landroid/content/Context;",
        "profileDebugStateCallback",
        "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
        "(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V",
        "buildType",
        "Lcom/ibotta/android/profile/BuildType;",
        "getBuildType",
        "()Lcom/ibotta/android/profile/BuildType;",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final buildType:Lcom/ibotta/android/profile/BuildType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/profile/ProfileDebugStateCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileDebugStateCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/profile/BetaBuildProfile;-><init>(Landroid/content/Context;Lcom/ibotta/android/profile/ProfileDebugStateCallback;)V

    .line 14
    sget-object p1, Lcom/ibotta/android/profile/BuildType;->BETA_EXT:Lcom/ibotta/android/profile/BuildType;

    iput-object p1, p0, Lcom/ibotta/android/profile/BetaExtBuildProfile;->buildType:Lcom/ibotta/android/profile/BuildType;

    return-void
.end method


# virtual methods
.method public getBuildType()Lcom/ibotta/android/profile/BuildType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/profile/BetaExtBuildProfile;->buildType:Lcom/ibotta/android/profile/BuildType;

    return-object v0
.end method
