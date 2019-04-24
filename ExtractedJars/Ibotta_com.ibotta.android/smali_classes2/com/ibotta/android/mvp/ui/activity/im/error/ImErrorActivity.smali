.class public Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ImErrorActivity.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bImGetHelp:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09008c
    .end annotation
.end field

.field protected bImTryAgain:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09008e
    .end annotation
.end field

.field protected clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f6
    .end annotation
.end field

.field protected imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvImErrorMoreInfo:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09052e
    .end annotation
.end field

.field protected viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImErrorActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onGetHelpClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.error.ImErrorActivity"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x87

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method private initMoreInfo()V
    .locals 7

    const v0, 0x7f110385

    .line 85
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110386

    .line 86
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 87
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v2, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 88
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v3, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getEndIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 90
    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 92
    new-instance v0, Lcom/ibotta/android/views/base/text/LinkTextSpan;

    new-instance v4, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$ghNUrt8Sihx-f3bxNa1uY3s5_1I;

    invoke-direct {v4, p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$ghNUrt8Sihx-f3bxNa1uY3s5_1I;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V

    invoke-direct {v0, v4}, Lcom/ibotta/android/views/base/text/LinkTextSpan;-><init>(Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;)V

    const/16 v4, 0x21

    .line 99
    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 105
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060027

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v0, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 107
    invoke-virtual {v3, v0, v2, v1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->tvImErrorMoreInfo:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->tvImErrorMoreInfo:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method private initToolbar()V
    .locals 2

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic lambda$bindViewEvents$1(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;Landroid/view/View;)V
    .locals 0

    .line 129
    invoke-interface {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;->onTryAgainButtonTapped()V

    return-void
.end method

.method public static synthetic lambda$bindViewEvents$2(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;Landroid/view/View;)V
    .locals 0

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->onGetHelpClicked()V

    return-void
.end method

.method public static synthetic lambda$initMoreInfo$0(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;

    if-nez v0, :cond_0

    .line 94
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "ViewEvents must be bound"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;->onSwitchBackToReceiptSubmissionTapped()V

    return-void
.end method

.method private loadParams()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "presenter_state"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;->setPersistedState(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;)V
    .locals 2

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImTryAgain:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$TePC0OUVsRYFQRzyTXM-eTA1Xq0;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$TePC0OUVsRYFQRzyTXM-eTA1Xq0;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 130
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bImGetHelp:Landroid/widget/Button;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$T3lR9waQxfzzVqMQPcm6aa3qlLQ;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/-$$Lambda$ImErrorActivity$T3lR9waQxfzzVqMQPcm6aa3qlLQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;
    .locals 1

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    invoke-direct {v0, p0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;-><init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 53
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->imErrorModule(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;)Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;)V
    .locals 0

    .line 59
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c003f

    .line 65
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->setContentView(I)V

    .line 66
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->loadParams()V

    return-void
.end method

.method public onGetHelpClicked()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CONNECTION_ISSUE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 135
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;

    if-eqz v1, :cond_0

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->viewEvents:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;->onGetHelpButtonTapped()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :cond_0
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

.method public showGallery(I)V
    .locals 1

    .line 154
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    .line 155
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 158
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showIbottaCareWebView()V
    .locals 2

    .line 163
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 164
    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getLoyaltyCardLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 166
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showLogin(I)V
    .locals 1

    .line 147
    new-instance v0, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImLoginIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 148
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->startActivity(Landroid/content/Intent;)V

    const p1, 0x7f010021

    const v0, 0x7f01001c

    .line 149
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->initToolbar()V

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->initMoreInfo()V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;)V

    return-void
.end method
