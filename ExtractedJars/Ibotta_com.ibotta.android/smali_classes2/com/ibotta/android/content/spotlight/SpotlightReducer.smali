.class public final Lcom/ibotta/android/content/spotlight/SpotlightReducer;
.super Ljava/lang/Object;
.source "SpotlightReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rJ\u0012\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001a\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/content/spotlight/SpotlightReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;)V",
        "availableAtWithoutStoreTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "getAvailableAtWithoutStoreTitle",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "cantFindItSuccessTitle",
        "getCantFindItSuccessTitle",
        "createTitle",
        "type",
        "Lcom/ibotta/android/content/spotlight/VariantType;",
        "res",
        "",
        "title",
        "",
        "iconUrl",
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
.field private final availableAtWithoutStoreTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cantFindItSuccessTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
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

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 15
    sget p1, Lcom/ibotta/android/reducers/R$string;->spotlight_cant_find_success_title:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->cantFindItSuccessTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 16
    sget p1, Lcom/ibotta/android/reducers/R$string;->spotlight_available_at_title_without_store:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->availableAtWithoutStoreTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method

.method private final createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final createTitle(Lcom/ibotta/android/content/spotlight/VariantType;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/content/spotlight/VariantType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget-object v0, Lcom/ibotta/android/content/spotlight/SpotlightReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/content/spotlight/VariantType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 21
    sget p1, Lcom/ibotta/android/reducers/R$string;->spotlight_related_offers_title:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    goto :goto_0

    .line 20
    :pswitch_0
    sget p1, Lcom/ibotta/android/reducers/R$string;->spotlight_also_viewed_title:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    goto :goto_0

    .line 19
    :pswitch_1
    sget p1, Lcom/ibotta/android/reducers/R$string;->spotlight_also_bought_title:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createTitle(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createTitle(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 27
    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-static {p2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p2

    .line 26
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final getAvailableAtWithoutStoreTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->availableAtWithoutStoreTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public final getCantFindItSuccessTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->cantFindItSuccessTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
