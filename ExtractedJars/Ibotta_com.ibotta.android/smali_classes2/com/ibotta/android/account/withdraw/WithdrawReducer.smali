.class public final Lcom/ibotta/android/account/withdraw/WithdrawReducer;
.super Ljava/lang/Object;
.source "WithdrawReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/account/withdraw/WithdrawReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;)V",
        "cashOutTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "getCashOutTitle",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "createGiftCardTitle",
        "isFeaturedGiftCards",
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
.field private final cashOutTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "titleBarReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 8
    iget-object p1, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    sget v0, Lcom/ibotta/android/reducers/R$string;->withdraw_cash_options:I

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->cashOutTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public final createGiftCardTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 10
    iget-object p1, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    sget v0, Lcom/ibotta/android/reducers/R$string;->withdraw_featured_gift_cards:I

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    sget v0, Lcom/ibotta/android/reducers/R$string;->withdraw_gift_cards:I

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getCashOutTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/ibotta/android/account/withdraw/WithdrawReducer;->cashOutTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
