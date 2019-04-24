.class public Lcom/ibotta/android/view/ImConnectedAccountDialog;
.super Landroid/app/Dialog;
.source "ImConnectedAccountDialog.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/RetailerAdviceField;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field bViewOffers:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024d
    .end annotation
.end field

.field icavImage:Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090250
    .end annotation
.end field

.field protected imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field protected listener:Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;

.field private state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

.field tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09024f
    .end annotation
.end field

.field tvDisclaimer:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090519
    .end annotation
.end field

.field tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090251
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 55
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 43
    sget-object p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->EMPTY:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    iput-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->init()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "ImConnectedAccountDialog.java"

    const-class v1, Lcom/ibotta/android/view/ImConnectedAccountDialog;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onContactIbottaCare"

    const-string v3, "com.ibotta.android.view.ImConnectedAccountDialog"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x82

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private init()V
    .locals 1

    const/4 v0, 0x1

    .line 60
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c00d7

    .line 61
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->setContentView(I)V

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initDisclaimer(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V
    .locals 1

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDisclaimer:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDisclaimer:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private initRetailerButtonText(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V
    .locals 3

    .line 139
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 140
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110375

    .line 139
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->bViewOffers:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initRetailerDescription(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V
    .locals 6

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110376

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f110377

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v1, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 103
    iget-object v2, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v2, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getEndIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 105
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 107
    new-instance p1, Lcom/ibotta/android/views/base/text/LinkTextSpan;

    new-instance v3, Lcom/ibotta/android/view/-$$Lambda$_VLG0dNhadSe4CneAAZ6vrXZIq0;

    invoke-direct {v3, p0}, Lcom/ibotta/android/view/-$$Lambda$_VLG0dNhadSe4CneAAZ6vrXZIq0;-><init>(Lcom/ibotta/android/view/ImConnectedAccountDialog;)V

    invoke-direct {p1, v3}, Lcom/ibotta/android/views/base/text/LinkTextSpan;-><init>(Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;)V

    const/16 v3, 0x21

    .line 109
    invoke-virtual {v2, p1, v1, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 115
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f060027

    invoke-static {v4, v5}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-direct {p1, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 118
    invoke-virtual {v2, p1, v1, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 124
    iget-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvDescription:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method private initRetailerTitle(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V
    .locals 3

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110378

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setAnimation(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->icavImage:Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;->updateViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

    return-void
.end method


# virtual methods
.method public getRetailerIdForTracking()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onCloseButtonClick()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09024e
        }
    .end annotation

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->dismiss()V

    return-void
.end method

.method protected onConnectedButtonClick()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09024d
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->listener:Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;

    iget-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getRetailerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;->showGallery(I)V

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->dismiss()V

    return-void
.end method

.method public onContactIbottaCare()V
    .locals 3
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CHECK_FOR_REWARDS:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 130
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->listener:Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;

    invoke-interface {v1}, Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;->contactIbottaCare()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
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

.method public setup(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;)V
    .locals 0

    .line 69
    iput-object p2, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 70
    iput-object p3, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->listener:Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;

    .line 72
    iget-object p2, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    if-eq p2, p1, :cond_0

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->initRetailerTitle(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->initRetailerDescription(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->initRetailerButtonText(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->initDisclaimer(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;)V

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->getImConnectionViewState()Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->setAnimation(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

    .line 78
    iput-object p1, p0, Lcom/ibotta/android/view/ImConnectedAccountDialog;->state:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    :cond_0
    return-void
.end method
