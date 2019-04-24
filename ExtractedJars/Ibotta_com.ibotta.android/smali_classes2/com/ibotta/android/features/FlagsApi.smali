.class public interface abstract Lcom/ibotta/android/features/FlagsApi;
.super Ljava/lang/Object;
.source "FlagsApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/features/FlagsApi;",
        "",
        "initUser",
        "",
        "flagsUser",
        "Lcom/ibotta/android/features/FlagsUser;",
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
.method public abstract initUser(Lcom/ibotta/android/features/FlagsUser;)V
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation
.end method
