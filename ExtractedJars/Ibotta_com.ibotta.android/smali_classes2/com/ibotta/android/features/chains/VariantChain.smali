.class public final Lcom/ibotta/android/features/chains/VariantChain;
.super Ljava/lang/Object;
.source "VariantChain.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVariantChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariantChain.kt\ncom/ibotta/android/features/chains/VariantChain\n*L\n1#1,46:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0000J\u001a\u0010\r\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\u0010\u0010\u0012\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0011\u0018\u00010\u0010J\u0008\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/features/chains/VariantChain;",
        "",
        "testName",
        "",
        "ruleEvaluator",
        "Lcom/ibotta/android/features/evaluator/RuleEvaluator;",
        "variantSelector",
        "Lcom/ibotta/android/features/selector/VariantSelector;",
        "processingMessage",
        "(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V",
        "nextVariantChain",
        "addChain",
        "variantChain",
        "logSelectedVariant",
        "",
        "selectedVariant",
        "Ljava/lang/Class;",
        "Lcom/ibotta/android/features/Variant;",
        "selectVariant",
        "shouldProcess",
        "",
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
.field private nextVariantChain:Lcom/ibotta/android/features/chains/VariantChain;

.field private final processingMessage:Ljava/lang/String;

.field private final ruleEvaluator:Lcom/ibotta/android/features/evaluator/RuleEvaluator;

.field private final testName:Ljava/lang/String;

.field private final variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/features/evaluator/RuleEvaluator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/features/selector/VariantSelector;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "testName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ruleEvaluator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variantSelector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processingMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/features/chains/VariantChain;->testName:Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/features/chains/VariantChain;->ruleEvaluator:Lcom/ibotta/android/features/evaluator/RuleEvaluator;

    iput-object p3, p0, Lcom/ibotta/android/features/chains/VariantChain;->variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;

    iput-object p4, p0, Lcom/ibotta/android/features/chains/VariantChain;->processingMessage:Ljava/lang/String;

    return-void
.end method

.method private final logSelectedVariant(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/Variant;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "empty"

    :goto_0
    const-string v0, "VariantChain - test: %-20s variant: %-36s because %s"

    const/4 v1, 0x3

    .line 37
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 38
    iget-object v3, p0, Lcom/ibotta/android/features/chains/VariantChain;->testName:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    iget-object v2, p0, Lcom/ibotta/android/features/chains/VariantChain;->processingMessage:Ljava/lang/String;

    aput-object v2, v1, p1

    .line 37
    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final shouldProcess()Z
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/features/chains/VariantChain;->ruleEvaluator:Lcom/ibotta/android/features/evaluator/RuleEvaluator;

    invoke-interface {v0}, Lcom/ibotta/android/features/evaluator/RuleEvaluator;->isRuleAppeased()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;
    .locals 1
    .param p1    # Lcom/ibotta/android/features/chains/VariantChain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "variantChain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/features/chains/VariantChain;->nextVariantChain:Lcom/ibotta/android/features/chains/VariantChain;

    return-object p1
.end method

.method public final selectVariant()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/Variant;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/features/chains/VariantChain;->shouldProcess()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/features/chains/VariantChain;->variantSelector:Lcom/ibotta/android/features/selector/VariantSelector;

    invoke-interface {v0}, Lcom/ibotta/android/features/selector/VariantSelector;->selectVariant()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/features/chains/VariantChain;->logSelectedVariant(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/features/chains/VariantChain;->nextVariantChain:Lcom/ibotta/android/features/chains/VariantChain;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/features/chains/VariantChain;->selectVariant()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
