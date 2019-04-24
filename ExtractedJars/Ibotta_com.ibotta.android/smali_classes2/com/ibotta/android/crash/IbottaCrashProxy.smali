.class public final Lcom/ibotta/android/crash/IbottaCrashProxy;
.super Ljava/lang/Object;
.source "IbottaCrashProxy.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/crash/IbottaCrashProxy;",
        "",
        "()V",
        "IbottaCrashManager",
        "Lcom/ibotta/android/crash/CrashManager;",
        "delegate",
        "",
        "cm",
        "ibotta-crash_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/crash/IbottaCrashProxy;

.field public static IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 3
    new-instance v0, Lcom/ibotta/android/crash/IbottaCrashProxy;

    invoke-direct {v0}, Lcom/ibotta/android/crash/IbottaCrashProxy;-><init>()V

    sput-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->INSTANCE:Lcom/ibotta/android/crash/IbottaCrashProxy;

    .line 4
    new-instance v0, Lcom/ibotta/android/crash/NoOpCrashManager;

    invoke-direct {v0}, Lcom/ibotta/android/crash/NoOpCrashManager;-><init>()V

    check-cast v0, Lcom/ibotta/android/crash/CrashManager;

    sput-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final delegate(Lcom/ibotta/android/crash/CrashManager;)V
    .locals 1
    .param p0    # Lcom/ibotta/android/crash/CrashManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "cm"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sput-object p0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    return-void
.end method
