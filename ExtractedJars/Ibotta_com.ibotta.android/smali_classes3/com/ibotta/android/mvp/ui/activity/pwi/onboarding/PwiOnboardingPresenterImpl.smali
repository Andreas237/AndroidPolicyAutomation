.class public Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "PwiOnboardingPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;
.implements Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiOnboardingAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;",
        "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final onboardingReducer:Lcom/ibotta/android/pwi/PwiOnboardingReducer;

.field private onboardingViewStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/pwi/PwiOnboardingReducer;Lcom/ibotta/android/state/pwi/PwiUserState;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingReducer:Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiOnboardingPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onCloseTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.onboarding.PwiOnboardingPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onPageChanged"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.onboarding.PwiOnboardingPresenterImpl"

    const-string v4, "int"

    const-string v5, "position"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x4d

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "onboardingCompleted"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.onboarding.PwiOnboardingPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x5b

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private createViewStates()V
    .locals 3

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingReducer:Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    sget-object v2, Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;->INTRO:Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->create(Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingReducer:Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    sget-object v2, Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;->HOW_IT_WORKS:Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->create(Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingReducer:Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    sget-object v2, Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;->GETTING_STARTED:Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/pwi/PwiOnboardingReducer;->create(Lcom/ibotta/android/pwi/PwiOnboardingReducer$Type;)Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private exitPwiHomeFlow()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->finishWithResult(I)V

    return-void
.end method

.method private onboardingCompleted()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_CLOSE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 91
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->onOnboardingCompleted()V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->finish()V

    return-void
.end method


# virtual methods
.method public currentPageIndex()I
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->getPagerPosition()I

    move-result v0

    return v0
.end method

.method public getActivityClass()Ljava/lang/Class;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public isFirstOnboarding()Z
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->pwiUserState:Lcom/ibotta/android/state/pwi/PwiUserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/pwi/PwiUserState;->hasCompletedOnboarding()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onBackTapped()V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->getPagerPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 68
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->navigatePagerTo(I)V

    goto :goto_0

    .line 70
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->exitPwiHomeFlow()V

    :goto_0
    return-void
.end method

.method public onButtonTapped()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->getPagerPosition()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 82
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->navigatePagerTo(I)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingCompleted()V

    :goto_0
    return-void
.end method

.method public onCloseTapped()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_CLOSE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 61
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->finish()V

    return-void
.end method

.method public onPageChanged(I)V
    .locals 1
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_NEXT:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/Conversions;->intObject(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p1

    .line 77
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 54
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onResume()V

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->onboardingViewStates:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;->setPagerData(Ljava/util/List;)V

    return-void
.end method

.method public onViewsBound()V
    .locals 0

    .line 41
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onViewsBound()V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenterImpl;->createViewStates()V

    return-void
.end method
