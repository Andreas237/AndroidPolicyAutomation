.class public final Lcom/ibotta/android/crash/CrashKeys$Companion;
.super Ljava/lang/Object;
.source "CrashKeys.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/crash/CrashKeys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/ibotta/android/crash/CrashKeys$Companion;",
        "",
        "()V",
        "builder",
        "Lcom/ibotta/android/crash/CrashKeys$Builder;",
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
.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/crash/CrashKeys$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final builder()Lcom/ibotta/android/crash/CrashKeys$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/crash/CrashKeys$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/crash/CrashKeys$Builder;-><init>()V

    return-object v0
.end method
