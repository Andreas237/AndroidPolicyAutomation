.class public final Lcom/ibotta/android/pwi/PwiOnboardingReducer;
.super Ljava/lang/Object;
.source "PwiOnboardingReducer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
        "",
        "res",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "getRes",
        "()Landroid/content/res/Resources;",
        "create",
        "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
        "type",
        "Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;",
        "Type",
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
.field private final res:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "res"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;
    .locals 3
    .param p1    # Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Lcom/ibotta/android/pwi/PwiOnboardingReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/16 v0, 0x8

    packed-switch p1, :pswitch_data_0

    .line 40
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 34
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    invoke-direct {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;-><init>()V

    const-string v0, "onboarding3_get_started.json"

    .line 35
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->lottieJson(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_3_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "res.getString(R.string.pwi_onboarding_3_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_3_description:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "res.getString(R.string.p\u2026onboarding_3_description)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_3_button_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "res.getString(R.string.p\u2026onboarding_3_button_text)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility(I)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->build()Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object p1

    goto/16 :goto_0

    .line 26
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    invoke-direct {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;-><init>()V

    const-string v1, "onboarding2_how_it_works.json"

    .line 27
    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->lottieJson(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 28
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_2_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.pwi_onboarding_2_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 29
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_2_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.p\u2026onboarding_2_description)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_2_button_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.p\u2026onboarding_2_button_text)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 31
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility(I)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->build()Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object p1

    goto :goto_0

    .line 18
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    invoke-direct {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;-><init>()V

    const-string v1, "onboarding1_introducing_pwi.json"

    .line 19
    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->lottieJson(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 20
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_1_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.pwi_onboarding_1_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 21
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_1_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.p\u2026onboarding_1_description)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 22
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_onboarding_1_button_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.p\u2026onboarding_1_button_text)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 23
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility(I)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->build()Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getRes()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->res:Landroid/content/res/Resources;

    return-object v0
.end method
