.class public final Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializerKt;
.super Ljava/lang/Object;
.source "LaunchDarklyInitializer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "SYSTEM",
        "",
        "TIMEOUT_SECONDS",
        "",
        "mapFlagsUserToLaunchDarklyUser",
        "Lcom/launchdarkly/android/LDUser;",
        "kotlin.jvm.PlatformType",
        "flagsUser",
        "Lcom/ibotta/android/features/FlagsUser;",
        "ibotta-features-kotlin_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final SYSTEM:Ljava/lang/String; = "android"

.field private static final TIMEOUT_SECONDS:J = 0x5L


# direct methods
.method public static final synthetic access$mapFlagsUserToLaunchDarklyUser(Lcom/ibotta/android/features/FlagsUser;)Lcom/launchdarkly/android/LDUser;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ibotta/android/features/launchdarkly/LaunchDarklyInitializerKt;->mapFlagsUserToLaunchDarklyUser(Lcom/ibotta/android/features/FlagsUser;)Lcom/launchdarkly/android/LDUser;

    move-result-object p0

    return-object p0
.end method

.method private static final mapFlagsUserToLaunchDarklyUser(Lcom/ibotta/android/features/FlagsUser;)Lcom/launchdarkly/android/LDUser;
    .locals 3

    .line 22
    new-instance v0, Lcom/launchdarkly/android/LDUser$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/features/FlagsUser;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/launchdarkly/android/LDUser$Builder;-><init>(Ljava/lang/String;)V

    const-string v1, "notRegistered"

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/features/FlagsUser;->isRegisteredUser()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object v0

    const-string v1, "system"

    const-string v2, "android"

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object v0

    const-string v1, "employeeTester"

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/features/FlagsUser;->isEmployeeTester()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object v0

    const-string v1, "appVersion"

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/features/FlagsUser;->getAppVersion()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lcom/launchdarkly/android/LDUser$Builder;->custom(Ljava/lang/String;Ljava/lang/String;)Lcom/launchdarkly/android/LDUser$Builder;

    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lcom/launchdarkly/android/LDUser$Builder;->build()Lcom/launchdarkly/android/LDUser;

    move-result-object p0

    return-object p0
.end method
