.class public final Lcom/ibotta/android/crash/CrashKeys;
.super Ljava/lang/Object;
.source "CrashKeys.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/crash/CrashKeys$Builder;,
        Lcom/ibotta/android/crash/CrashKeys$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrashKeys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashKeys.kt\ncom/ibotta/android/crash/CrashKeys\n*L\n1#1,23:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\u000c\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ibotta/android/crash/CrashKeys;",
        "",
        "()V",
        "keys",
        "Ljava/util/HashMap;",
        "",
        "addKey",
        "",
        "key",
        "Lcom/ibotta/android/crash/CrashKeyType;",
        "value",
        "getKeyValue",
        "Builder",
        "Companion",
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
.field public static final Companion:Lcom/ibotta/android/crash/CrashKeys$Companion;


# instance fields
.field private final keys:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/crash/CrashKeys$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/crash/CrashKeys$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/crash/CrashKeys;->Companion:Lcom/ibotta/android/crash/CrashKeys$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/crash/CrashKeys;->keys:Ljava/util/HashMap;

    return-void
.end method

.method public static final synthetic access$addKey(Lcom/ibotta/android/crash/CrashKeys;Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/crash/CrashKeys;->addKey(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)V

    return-void
.end method

.method private final addKey(Lcom/ibotta/android/crash/CrashKeyType;Ljava/lang/String;)V
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/android/crash/CrashKeys;->keys:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lcom/ibotta/android/crash/CrashKeyType;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getKeyValue(Lcom/ibotta/android/crash/CrashKeyType;)Ljava/lang/String;
    .locals 1
    .param p1    # Lcom/ibotta/android/crash/CrashKeyType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/ibotta/android/crash/CrashKeys;->keys:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/ibotta/android/crash/CrashKeyType;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
