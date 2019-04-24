.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ImLoginActivity.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/ImLoginAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected bImConnect:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09008b
    .end annotation
.end field

.field protected clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f6
    .end annotation
.end field

.field protected etImEmail:Landroid/support/design/widget/TextInputEditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c9
    .end annotation
.end field

.field protected etImPassword:Landroid/support/design/widget/TextInputEditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ca
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvDisclaimer:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090519
    .end annotation
.end field

.field protected tvLogin:Lcom/ibotta/android/views/base/text/LinkTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090544
    .end annotation
.end field

.field protected viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImLoginActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "createAccountAccountTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.login.ImLoginActivity"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x7a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initDisclaimer(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V
    .locals 1

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvDisclaimer:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvDisclaimer:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private initImConnectButton(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bImConnect:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->isConnectButtonEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method private initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method private initImLoginCreateAccountText(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvLogin:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V

    return-void
.end method

.method private initToolbar()V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic lambda$bindViewEvents$0(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;Landroid/view/View;)V
    .locals 0

    .line 167
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->onConnectButtonTapped()V

    return-void
.end method

.method private loadParams()V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "presenter_state"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->setPersistedState(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;)V
    .locals 3

    .line 131
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImEmail:Landroid/support/design/widget/TextInputEditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImPassword:Landroid/support/design/widget/TextInputEditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bImConnect:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$ImLoginActivity$IN-oqPiDF1rlY3-rfwvfnzj2x3g;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$ImLoginActivity$IN-oqPiDF1rlY3-rfwvfnzj2x3g;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 168
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvLogin:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$E3JQWVlRvRjlrdKrfoUl1upBPNc;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/-$$Lambda$E3JQWVlRvRjlrdKrfoUl1upBPNc;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 40
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;)V

    return-void
.end method

.method public cameFromCreate()Z
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isFromCreate()Z

    move-result v0

    return v0
.end method

.method public createAccountAccountTapped()V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_CREATE_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 122
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    if-nez v1, :cond_0

    .line 123
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "ViewEvents must be bound"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 126
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;->onCreateAccountLinkTapped()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :goto_0
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;
    .locals 1

    .line 56
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;

    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    invoke-direct {v0, p0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;Landroid/app/Activity;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 58
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->imLoginModule(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;

    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/DaggerImLoginComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 40
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;)V
    .locals 0

    .line 64
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 83
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onBackPressed()V

    const v0, 0x7f01001d

    const v1, 0x7f01001f

    .line 84
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 68
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0040

    .line 69
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->setContentView(I)V

    .line 70
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->loadParams()V

    return-void
.end method

.method public showAccountCreatedSemiModal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 201
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    const v1, 0x7f0801ee

    .line 202
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 203
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 204
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 205
    invoke-virtual {p1, p3}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 206
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    .line 208
    sget-object p2, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    invoke-virtual {p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showImAccountCreated(Ljava/lang/String;)V
    .locals 1

    .line 185
    new-instance v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;

    move-result-object p1

    .line 186
    sget-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->getNO_OP()Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessage;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)Lcom/ibotta/android/views/messages/alert/AlertMessage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessage;->show()V

    return-void
.end method

.method public showImConnect()V
    .locals 0

    .line 180
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->onBackPressed()V

    return-void
.end method

.method public showImTermsAndConditions(ILcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;)V
    .locals 1

    .line 173
    new-instance v0, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;-><init>(Landroid/content/Context;ILcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImTermsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 174
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f010021

    const p2, 0x7f01001c

    .line 175
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->initToolbar()V

    .line 90
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->initImConnectButton(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V

    .line 92
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->initImLoginCreateAccountText(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V

    .line 93
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->initDisclaimer(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 40
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;)V

    return-void
.end method
