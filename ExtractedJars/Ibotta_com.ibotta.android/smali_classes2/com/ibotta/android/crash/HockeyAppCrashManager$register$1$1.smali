.class public final Lcom/ibotta/android/crash/HockeyAppCrashManager$register$1$1;
.super Lnet/hockeyapp/android/CrashManagerListener;
.source "HockeyAppCrashManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/crash/HockeyAppCrashManager;->register(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/ibotta/android/crash/HockeyAppCrashManager$register$1$1",
        "Lnet/hockeyapp/android/CrashManagerListener;",
        "shouldAutoUploadCrashes",
        "",
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
.method constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Lnet/hockeyapp/android/CrashManagerListener;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldAutoUploadCrashes()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
