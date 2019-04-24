.class public final Lcom/ibotta/android/account/teamwork/TeamworkReducer;
.super Ljava/lang/Object;
.source "TeamworkReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/account/teamwork/TeamworkReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;)V",
        "teamworkLevelsTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "getTeamworkLevelsTitle",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "createBonusDetailTitle",
        "bonusModel",
        "Lcom/ibotta/api/model/BonusModel;",
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
.field private final teamworkLevelsTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
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

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 9
    iget-object p1, p0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    sget v0, Lcom/ibotta/android/reducers/R$string;->common_teamwork_levels:I

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->teamworkLevelsTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public final createBonusDetailTitle(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object p1

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

.method public final getTeamworkLevelsTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/account/teamwork/TeamworkReducer;->teamworkLevelsTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
