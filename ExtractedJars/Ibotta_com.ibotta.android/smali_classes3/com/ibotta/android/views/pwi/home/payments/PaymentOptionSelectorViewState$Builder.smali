.class public final Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;
.super Ljava/lang/Object;
.source "PaymentOptionSelectorViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentOptionSelectorViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionSelectorViewState.kt\ncom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder\n*L\n1#1,19:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0003\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;",
        "",
        "()V",
        "paymentOptions",
        "",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "build",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;",
        "value",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private paymentOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;->paymentOptions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;->paymentOptions:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final paymentOptions(Ljava/util/List;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
            ">;)",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState$Builder;->paymentOptions:Ljava/util/List;

    return-object v0
.end method
