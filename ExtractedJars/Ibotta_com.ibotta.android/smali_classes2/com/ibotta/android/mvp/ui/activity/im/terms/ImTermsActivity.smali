.class public Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ImTermsActivity.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;
.implements Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field bImTermsConnect:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09008d
    .end annotation
.end field

.field protected clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900f6
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field sImTermsShare:Landroid/widget/Switch;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e4
    .end annotation
.end field

.field tvImTermsShare:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09052f
    .end annotation
.end field

.field tvImTermsShareInfo:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090530
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImTermsActivity.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onBackPressed"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.terms.ImTermsActivity"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x44

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onConnectButtonTapped"

    const-string v3, "com.ibotta.android.mvp.ui.activity.im.terms.ImTermsActivity"

    const-string v4, "com.ibotta.android.mvp.ui.activity.im.terms.ImTermsViewEvents"

    const-string v5, "viewEvents"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method private initTermsShareInfo(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->tvImTermsShareInfo:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->getShareInfo()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initToolbar()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic lambda$bindViewEvents$0(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 94
    invoke-interface {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;->onSharedToggled(Z)V

    return-void
.end method

.method public static synthetic lambda$bindViewEvents$1(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;Landroid/view/View;)V
    .locals 0

    .line 97
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->onConnectButtonTapped(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V

    return-void
.end method

.method private loadParams()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "presenter_state"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;->setPersistedState(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->sImTermsShare:Landroid/widget/Switch;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$MGQhH1JsR5QxulZ3eKMfuz8u7zQ;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$MGQhH1JsR5QxulZ3eKMfuz8u7zQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->bImTermsConnect:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->bindViewEvents(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;
    .locals 1

    .line 40
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;

    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 42
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->imTermsModule(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;)Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/DaggerImTermsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;

    move-result-object p1

    return-object p1
.end method

.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;)V
    .locals 0

    .line 48
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_CANCEL:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 68
    :try_start_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onBackPressed()V

    const v1, 0x7f01001d

    const v2, 0x7f01001f

    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->overridePendingTransition(II)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
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

.method public onConnectButtonTapped(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_AGREE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 102
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;->onConnectButtonTapped()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0041

    .line 54
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->setContentView(I)V

    .line 55
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->loadParams()V

    return-void
.end method

.method public showGallery(I)V
    .locals 1

    .line 107
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    .line 108
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->initToolbar()V

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->initImDetailHeader(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->initTermsShareInfo(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;)V

    return-void
.end method
