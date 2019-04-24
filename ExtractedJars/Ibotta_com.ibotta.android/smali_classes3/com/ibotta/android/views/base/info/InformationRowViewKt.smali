.class public final Lcom/ibotta/android/views/base/info/InformationRowViewKt;
.super Ljava/lang/Object;
.source "InformationRowView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "misspelledThresholdSet",
        "",
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final misspelledThresholdSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    sget-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->WEAK:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->MEDIUM:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/views/base/info/InformationRowViewKt;->misspelledThresholdSet:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$getMisspelledThresholdSet$p()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lcom/ibotta/android/views/base/info/InformationRowViewKt;->misspelledThresholdSet:Ljava/util/Set;

    return-object v0
.end method
