.class public final Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
.super Ljava/lang/Object;
.source "PwiOnboardingViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiOnboardingViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiOnboardingViewState.kt\ncom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder\n*L\n1#1,29:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;",
        "",
        "()V",
        "buttonText",
        "",
        "description",
        "lottieJson",
        "secureLockVisibility",
        "",
        "title",
        "build",
        "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
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
.field private buttonText:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private lottieJson:Ljava/lang/String;

.field private secureLockVisibility:I

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 19
    iput v0, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility:I

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    new-instance v6, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->lottieJson:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->description:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->buttonText:Ljava/lang/String;

    iget v5, p0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v6
.end method

.method public final buttonText(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final description(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final lottieJson(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->lottieJson:Ljava/lang/String;

    return-object v0
.end method

.method public final secureLockVisibility(I)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    iput p1, v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->secureLockVisibility:I

    return-object v0
.end method

.method public final title(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState$Builder;->title:Ljava/lang/String;

    return-object v0
.end method
