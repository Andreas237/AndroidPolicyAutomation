.class public final Lcom/ibotta/android/account/bonus/BonusDetailReducer;
.super Ljava/lang/Object;
.source "BonusDetailReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/account/bonus/BonusDetailReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "questToolbarReducer",
        "Lcom/ibotta/android/account/bonus/QuestToolbarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/account/bonus/QuestToolbarReducer;)V",
        "relatedOffersTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "getRelatedOffersTitle",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "createBonusTitle",
        "bonusModel",
        "Lcom/ibotta/api/model/BonusModel;",
        "createQuestHeader",
        "Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;",
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
.field private final questToolbarReducer:Lcom/ibotta/android/account/bonus/QuestToolbarReducer;

.field private final relatedOffersTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/account/bonus/QuestToolbarReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/account/bonus/QuestToolbarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "titleBarReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questToolbarReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iput-object p2, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->questToolbarReducer:Lcom/ibotta/android/account/bonus/QuestToolbarReducer;

    .line 15
    iget-object p1, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    sget p2, Lcom/ibotta/android/reducers/R$string;->spotlight_related_offers_title:I

    invoke-static {p2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->relatedOffersTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public final createBonusTitle(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createQuestHeader(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->questToolbarReducer:Lcom/ibotta/android/account/bonus/QuestToolbarReducer;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->create(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final getRelatedOffersTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/account/bonus/BonusDetailReducer;->relatedOffersTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
