.class public final Lcom/ibotta/android/account/bonus/BonusPickerReducer;
.super Ljava/lang/Object;
.source "BonusPickerReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ibotta/android/account/bonus/BonusPickerReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;)V",
        "createTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "isFeaturedBonusesTitle",
        "",
        "titleRes",
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

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/account/bonus/BonusPickerReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private final createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/account/bonus/BonusPickerReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final createTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 10
    sget p1, Lcom/ibotta/android/reducers/R$string;->common_featured:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 11
    sget p1, Lcom/ibotta/android/reducers/R$string;->bonuses_available:I

    .line 9
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/account/bonus/BonusPickerReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
