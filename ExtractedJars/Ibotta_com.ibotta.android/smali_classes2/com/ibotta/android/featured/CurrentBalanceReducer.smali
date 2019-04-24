.class public final Lcom/ibotta/android/featured/CurrentBalanceReducer;
.super Ljava/lang/Object;
.source "CurrentBalanceReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/featured/CurrentBalanceReducer;",
        "",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "(Lcom/ibotta/android/util/Formatting;)V",
        "create",
        "Lcom/ibotta/android/views/featured/CurrentBalanceViewState;",
        "balance",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final formatting:Lcom/ibotta/android/util/Formatting;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "formatting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/featured/CurrentBalanceReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public final create(D)Lcom/ibotta/android/views/featured/CurrentBalanceViewState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    new-instance v0, Lcom/ibotta/android/views/featured/CurrentBalanceViewState;

    iget-object v1, p0, Lcom/ibotta/android/featured/CurrentBalanceReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/featured/CurrentBalanceViewState;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
