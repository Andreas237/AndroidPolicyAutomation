.class public final Lcom/ibotta/android/features/FlagsApiImpl;
.super Ljava/lang/Object;
.source "FlagsApi.kt"

# interfaces
.implements Lcom/ibotta/android/features/FlagsApi;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/features/FlagsApiImpl;",
        "Lcom/ibotta/android/features/FlagsApi;",
        "flagsInitializer",
        "Lcom/ibotta/android/features/FlagsInitializer;",
        "(Lcom/ibotta/android/features/FlagsInitializer;)V",
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


# instance fields
.field private final flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/FlagsInitializer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/features/FlagsInitializer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flagsInitializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/features/FlagsApiImpl;->flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;

    return-void
.end method


# virtual methods
.method public initUser(Lcom/ibotta/android/features/FlagsUser;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/features/FlagsUser;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "flagsUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/features/FlagsApiImpl;->flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;

    invoke-interface {v0, p1}, Lcom/ibotta/android/features/FlagsInitializer;->userIsInitialized(Lcom/ibotta/android/features/FlagsUser;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/features/FlagsApiImpl;->flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;

    invoke-interface {v0}, Lcom/ibotta/android/features/FlagsInitializer;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/features/FlagsApiImpl;->flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;

    invoke-interface {v0, p1}, Lcom/ibotta/android/features/FlagsInitializer;->reInitUser(Lcom/ibotta/android/features/FlagsUser;)Z

    goto :goto_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/features/FlagsApiImpl;->flagsInitializer:Lcom/ibotta/android/features/FlagsInitializer;

    invoke-interface {v0, p1}, Lcom/ibotta/android/features/FlagsInitializer;->initUser(Lcom/ibotta/android/features/FlagsUser;)Z

    :goto_0
    return-void
.end method
