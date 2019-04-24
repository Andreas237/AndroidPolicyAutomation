.class public final Lcom/ibotta/android/account/bonus/QuestToolbarReducer;
.super Ljava/lang/Object;
.source "QuestToolbarReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQuestToolbarReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestToolbarReducer.kt\ncom/ibotta/android/account/bonus/QuestToolbarReducer\n*L\n1#1,36:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u0012\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/account/bonus/QuestToolbarReducer;",
        "",
        "appConfig",
        "Lcom/ibotta/android/state/app/config/AppConfig;",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;",
        "bonusModel",
        "Lcom/ibotta/api/model/BonusModel;",
        "getSubtitle",
        "",
        "getTitle",
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
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/state/app/config/AppConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatting"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iput-object p2, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    iput-object p3, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getSubtitle(Lcom/ibotta/api/model/BonusModel;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v0, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getQuestsConfig()Lcom/ibotta/android/state/app/config/quests/QuestsConfig;

    move-result-object v0

    const-string v1, "appConfig.questsConfig"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->getBonusDetail()Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    move-result-object v0

    const-string v1, "appConfig.questsConfig.bonusDetail"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;->getStep1Subtitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, "appConfig.questsConfig.bonusDetail.step1Subtitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "java.lang.String.format(format, *args)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method private final getTitle(Lcom/ibotta/api/model/BonusModel;)Ljava/lang/String;
    .locals 6

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    .line 26
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getAmount()F

    move-result p1

    float-to-double v2, p1

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    const-string p1, ""

    cmpg-double v4, v2, v0

    if-eqz v4, :cond_1

    .line 29
    iget-object p1, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->amount_additional_cash_back:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v5, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(R.st\u2026currencyLeadZero(amount))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;
    .locals 3
    .param p1    # Lcom/ibotta/api/model/BonusModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;

    if-eqz p1, :cond_0

    .line 22
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/ibotta/api/model/QuestModel;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->getTitle(Lcom/ibotta/api/model/BonusModel;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1}, Lcom/ibotta/android/account/bonus/QuestToolbarReducer;->getSubtitle(Lcom/ibotta/api/model/BonusModel;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-direct {v0, v1, v2, p1}, Lcom/ibotta/android/views/account/bonus/QuestToolbarViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
