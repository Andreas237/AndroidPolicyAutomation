.class public final Lcom/ibotta/android/util/SemverFactory;
.super Ljava/lang/Object;
.source "SemverFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/util/SemverFactory;",
        "",
        "()V",
        "create",
        "Lcom/vdurmont/semver4j/Semver;",
        "semVerStr",
        "",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 16
    :try_start_0
    new-instance v0, Lcom/vdurmont/semver4j/Semver;

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->LOOSE:Lcom/vdurmont/semver4j/Semver$SemverType;

    invoke-direct {v0, p1, v1}, Lcom/vdurmont/semver4j/Semver;-><init>(Ljava/lang/String;Lcom/vdurmont/semver4j/Semver$SemverType;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse semantic version"

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 20
    invoke-static {v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
