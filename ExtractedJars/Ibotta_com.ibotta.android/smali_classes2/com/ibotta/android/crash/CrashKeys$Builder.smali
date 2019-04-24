.class public final Lcom/ibotta/android/crash/CrashKeys$Builder;
.super Ljava/lang/Object;
.source "CrashKeys.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/crash/CrashKeys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrashKeys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashKeys.kt\ncom/ibotta/android/crash/CrashKeys$Builder\n*L\n1#1,23:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/crash/CrashKeys$Builder;",
        "",
        "()V",
        "crashKeys",
        "Lcom/ibotta/android/crash/CrashKeys;",
        "build",
        "key",
        "keyType",
        "Lcom/ibotta/android/crash/CrashKeyType;",
        "value",
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


# instance fields
.field private final crashKeys:Lcom/ibotta/android/crash/CrashKeys;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lcom/ibotta/android/crash/CrashKeys;

    invoke-direct {v0}, Lcom/ibotta/android/crash/CrashKeys;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/crash/CrashKeys$Builder;->crashKeys:Lcom/ibotta/android/crash/CrashKeys;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/crash/CrashKeys;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/crash/CrashKeys$Builder;->crashKeys:Lcom/ibotta/android/crash/CrashKeys;

    return-object v0
.end method

.method public final key(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)Lcom/ibotta/android/crash/CrashKeys$Builder;
    .locals 2
    .param p1    # Lcom/ibotta/android/crash/CrashKeyType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "keyType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/crash/CrashKeys$Builder;

    iget-object v1, v0, Lcom/ibotta/android/crash/CrashKeys$Builder;->crashKeys:Lcom/ibotta/android/crash/CrashKeys;

    invoke-static {v1, p1, p2}, Lcom/ibotta/android/crash/CrashKeys;->access$addKey(Lcom/ibotta/android/crash/CrashKeys;Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)V

    return-object v0
.end method
