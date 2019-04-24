.class public interface abstract Lcom/ibotta/android/features/FlagsInitializer;
.super Ljava/lang/Object;
.source "FlagsInitializer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0008\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/features/FlagsInitializer;",
        "",
        "initUser",
        "",
        "flagsUser",
        "Lcom/ibotta/android/features/FlagsUser;",
        "isInitialized",
        "reInitUser",
        "userIsInitialized",
        "ibotta-features-kotlin_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract initUser(Lcom/ibotta/android/features/FlagsUser;)Z
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract isInitialized()Z
.end method

.method public abstract reInitUser(Lcom/ibotta/android/features/FlagsUser;)Z
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract userIsInitialized(Lcom/ibotta/android/features/FlagsUser;)Z
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
