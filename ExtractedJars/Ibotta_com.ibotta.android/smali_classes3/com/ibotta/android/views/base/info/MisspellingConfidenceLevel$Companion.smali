.class public final Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;
.super Ljava/lang/Object;
.source "MispellingConfidenceLevel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMispellingConfidenceLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MispellingConfidenceLevel.kt\ncom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,15:1\n1093#2,2:16\n*E\n*S KotlinDebug\n*F\n+ 1 MispellingConfidenceLevel.kt\ncom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion\n*L\n12#1,2:16\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;",
        "",
        "()V",
        "fromValue",
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
        "confidenceLevel",
        "",
        "ibotta-views_release"
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

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromValue(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "confidenceLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->values()[Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    move-result-object v0

    .line 16
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 12
    invoke-virtual {v3}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    sget-object v3, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->EXACT:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    :goto_2
    return-object v3
.end method
