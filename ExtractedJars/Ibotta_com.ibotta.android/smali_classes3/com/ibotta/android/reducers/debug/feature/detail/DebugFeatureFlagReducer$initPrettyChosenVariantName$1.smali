.class final Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;
.super Ljava/lang/Object;
.source "DebugFeatureFlagReducer.kt"

# interfaces
.implements Ljava9/util/function/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;->initPrettyChosenVariantName(Lcom/ibotta/android/features/TestConfig;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava9/util/function/Function<",
        "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/ibotta/android/state/app/featureflag/FeatureFlag;",
        "kotlin.jvm.PlatformType",
        "apply"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;

    invoke-direct {v0}, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;->INSTANCE:Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer$initPrettyChosenVariantName$1;->apply(Lcom/ibotta/android/state/app/featureflag/FeatureFlag;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Lcom/ibotta/android/state/app/featureflag/FeatureFlag;)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "it"

    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getControlFriendlyName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
