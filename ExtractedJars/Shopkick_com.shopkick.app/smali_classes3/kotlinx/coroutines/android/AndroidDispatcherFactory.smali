.class public final Lkotlinx/coroutines/android/AndroidDispatcherFactory;
.super Ljava/lang/Object;
.source "HandlerDispatcher.kt"

# interfaces
.implements Lkotlinx/coroutines/internal/MainDispatcherFactory;


# annotations
.annotation build Landroid/support/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlinx/coroutines/android/AndroidDispatcherFactory;",
        "Lkotlinx/coroutines/internal/MainDispatcherFactory;",
        "()V",
        "loadPriority",
        "",
        "getLoadPriority",
        "()I",
        "createDispatcher",
        "Lkotlinx/coroutines/MainCoroutineDispatcher;",
        "Companion",
        "kotlinx-coroutines-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlinx/coroutines/android/AndroidDispatcherFactory;->Companion:Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getDispatcher()Lkotlinx/coroutines/MainCoroutineDispatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/android/AndroidDispatcherFactory;->Companion:Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;

    invoke-virtual {v0}, Lkotlinx/coroutines/android/AndroidDispatcherFactory$Companion;->getDispatcher()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public createDispatcher()Lkotlinx/coroutines/MainCoroutineDispatcher;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 41
    sget-object v0, Lkotlinx/coroutines/android/HandlerDispatcherKt;->Main:Lkotlinx/coroutines/android/HandlerDispatcher;

    check-cast v0, Lkotlinx/coroutines/MainCoroutineDispatcher;

    return-object v0
.end method

.method public getLoadPriority()I
    .locals 1

    const v0, 0x7fffffff

    return v0
.end method
