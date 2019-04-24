.class public final Lcom/ibotta/android/crash/NoOpCrashManager;
.super Lcom/ibotta/android/crash/CrashManager;
.source "NoOpCrashManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/ibotta/android/crash/NoOpCrashManager;",
        "Lcom/ibotta/android/crash/CrashManager;",
        "()V",
        "ibotta-crash_release"
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
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, v0}, Lcom/ibotta/android/crash/CrashManager;-><init>(Lcom/ibotta/android/crash/CrashKeys;Ljava/util/Set;)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/ibotta/android/crash/NoOpCrashManager;->register(Landroid/content/Context;)V

    return-void
.end method
