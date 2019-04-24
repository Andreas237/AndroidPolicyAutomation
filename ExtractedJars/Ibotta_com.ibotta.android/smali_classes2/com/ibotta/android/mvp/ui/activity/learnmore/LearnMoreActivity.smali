.class public Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "LearnMoreActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;"
    }
.end annotation


# instance fields
.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f1103c3

    .line 96
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->setTitle(I)V

    return-void
.end method

.method static synthetic lambda$setRetailerParcel$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\r\n"

    const-string v1, "<br/>"

    .line 106
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2

    .line 43
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 44
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 39
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;
    .locals 1

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;)V

    .line 53
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;->learnMoreModule(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreModule;)Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/DaggerLearnMoreComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;)V
    .locals 0

    .line 59
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0044

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 71
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->initTitle()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 86
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2

    .line 104
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/learnmore/-$$Lambda$sW60_sLg9uK7DorUmiu-lM-JX8E;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/learnmore/-$$Lambda$sW60_sLg9uK7DorUmiu-lM-JX8E;

    .line 105
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/learnmore/-$$Lambda$LearnMoreActivity$lcjPiUXSry81liUH_78w6JLB8rk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/learnmore/-$$Lambda$LearnMoreActivity$lcjPiUXSry81liUH_78w6JLB8rk;

    .line 106
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const-string v0, ""

    .line 107
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->tvMessage:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;->tvMessage:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public showSubmittedJobLoading()V
    .locals 0

    return-void
.end method
