.class public Lcom/usebutton/sdk/internal/InstallSheetActivity;
.super Lcom/usebutton/sdk/internal/base/BaseActivity;
.source "InstallSheetActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/InstallSheetController;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BaseActivity<",
        "Lcom/usebutton/sdk/internal/InstallSheetPresenter;",
        ">;",
        "Lcom/usebutton/sdk/internal/InstallSheetController;"
    }
.end annotation


# static fields
.field private static final EXTRA_APP_ICON_URL:Ljava/lang/String; = "app_icon_url"

.field private static final EXTRA_INSTALL_INTENT:Ljava/lang/String; = "install_intent"

.field private static final EXTRA_INSTALL_SHEET:Ljava/lang/String; = "install_sheet"

.field private static final EXTRA_PRIMARY_COLOR:Ljava/lang/String; = "primary_color"

.field private static final EXTRA_SOURCE_TOKEN:Ljava/lang/String; = "source_token"


# instance fields
.field private presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

.field private progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

.field private sourceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/InstallSheetActivity;)Lcom/usebutton/sdk/internal/InstallSheetPresenter;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/InstallSheetActivity;IILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(IILjava/lang/String;)V

    return-void
.end method

.method public static createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/InstallSheet;Landroid/content/Intent;ILcom/usebutton/sdk/internal/models/Asset;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 49
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/InstallSheetActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "install_sheet"

    .line 50
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "install_intent"

    .line 51
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "primary_color"

    .line 52
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "app_icon_url"

    .line 53
    invoke-virtual {p4}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string/jumbo p0, "source_token"

    .line 54
    invoke-virtual {v0, p0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private setText(IILjava/lang/String;)V
    .locals 0

    .line 218
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 219
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private setText(ILjava/lang/String;)V
    .locals 0

    .line 224
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 225
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private startLoadingAnimation()V
    .locals 3

    .line 104
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_background:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 105
    sget v1, Lcom/usebutton/sdk/R$id;->install_sheet_loading:I

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 106
    sget v2, Lcom/usebutton/sdk/R$anim;->btn_fade_in:I

    invoke-static {p0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 107
    sget v0, Lcom/usebutton/sdk/R$anim;->btn_slide_up:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 108
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->styleProgressBar()V

    return-void
.end method

.method private styleProgressBar()V
    .locals 4

    .line 115
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_progress_bar:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    .line 116
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "primary_color"

    .line 117
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/usebutton/sdk/R$color;->btn_blue:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 116
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 119
    iget-object v1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/views/ColorProgressBar;->setColor(I)V

    return-void
.end method


# virtual methods
.method public initAppButton()V
    .locals 2

    .line 146
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_app:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/InstallSheetActivity$4;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity$4;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initBackground()V
    .locals 2

    .line 124
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_background:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/InstallSheetActivity$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity$2;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initLoadingTimer(J)V
    .locals 2

    .line 91
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_web:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 92
    new-instance v1, Lcom/usebutton/sdk/internal/InstallSheetActivity$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity$1;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public initWebButton()V
    .locals 2

    .line 134
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_web:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 136
    new-instance v1, Lcom/usebutton/sdk/internal/InstallSheetActivity$3;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity$3;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 244
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:webview-install-sheet-dismissed"

    iget-object v2, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 60
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    sget p1, Lcom/usebutton/sdk/R$layout;->btn_activity_install_sheet:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setContentView(I)V

    .line 62
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->startLoadingAnimation()V

    .line 64
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "install_sheet"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/InstallSheet;

    .line 65
    new-instance v0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    invoke-static {}, Lcom/usebutton/sdk/internal/WebViewObserver;->getInstance()Lcom/usebutton/sdk/internal/WebViewObserver;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;-><init>(Lcom/usebutton/sdk/internal/models/InstallSheet;Lcom/usebutton/sdk/internal/WebViewObserver;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    .line 66
    iget-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    invoke-virtual {p0, p1, p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->attachPresenterToLifecycle(Lcom/usebutton/sdk/internal/base/BasePresenter;Lcom/usebutton/sdk/internal/base/BaseViewController;)V

    .line 67
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string/jumbo v0, "source_token"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    .line 68
    iget-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo p1, "unknown"

    :goto_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    .line 69
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    const-string v0, "btn:webview-install-sheet-displayed"

    iget-object v1, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "app_icon_url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 72
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$id;->install_sheet_app_icon:I

    .line 73
    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 72
    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/ImageLoader;->load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 79
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onStart()V

    .line 80
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->onStart()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 85
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onStop()V

    .line 86
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->presenter:Lcom/usebutton/sdk/internal/InstallSheetPresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->onStop()V

    return-void
.end method

.method public setAppAction(ILjava/lang/String;)V
    .locals 1

    .line 171
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_app:I

    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(IILjava/lang/String;)V

    return-void
.end method

.method public setAppSubtitle(ILjava/lang/String;)V
    .locals 1

    .line 166
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_app_subtitle_text:I

    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(IILjava/lang/String;)V

    return-void
.end method

.method public setAppTitle(ILjava/lang/String;)V
    .locals 1

    .line 161
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_app_title_text:I

    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(IILjava/lang/String;)V

    return-void
.end method

.method public setTitle(ILjava/lang/String;)V
    .locals 1

    .line 156
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_title_text:I

    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(IILjava/lang/String;)V

    return-void
.end method

.method public setWebAction(ILjava/lang/String;)V
    .locals 9

    .line 176
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_web:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 179
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$color;->btn_disabled:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 180
    new-instance v2, Landroid/animation/ArgbEvaluator;

    invoke-direct {v2}, Landroid/animation/ArgbEvaluator;-><init>()V

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    .line 181
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v4, v1

    invoke-static {v2, v4}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-wide/16 v6, 0xfa

    .line 182
    invoke-virtual {p1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 183
    new-instance v2, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;

    invoke-direct {v2, p0, p2}, Lcom/usebutton/sdk/internal/InstallSheetActivity$5;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 189
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 192
    invoke-virtual {v0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p1

    .line 193
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    const-string v2, "primary_color"

    .line 194
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v8, Lcom/usebutton/sdk/R$color;->btn_blue:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {p2, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 195
    new-instance v2, Landroid/animation/ArgbEvaluator;

    invoke-direct {v2}, Landroid/animation/ArgbEvaluator;-><init>()V

    new-array v3, v3, [Ljava/lang/Object;

    .line 196
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 197
    invoke-virtual {p1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 198
    new-instance p2, Lcom/usebutton/sdk/internal/InstallSheetActivity$6;

    invoke-direct {p2, p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity$6;-><init>(Lcom/usebutton/sdk/internal/InstallSheetActivity;Landroid/widget/Button;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 204
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public setWebAction(Ljava/lang/String;)V
    .locals 1

    .line 209
    sget v0, Lcom/usebutton/sdk/R$id;->install_sheet_button_web:I

    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setText(ILjava/lang/String;)V

    return-void
.end method

.method public setWebViewProgress(I)V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ColorProgressBar;->setProgress(I)V

    return-void
.end method

.method public shutdown()V
    .locals 3

    .line 237
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:webview-install-sheet-dismissed"

    iget-object v2, p0, Lcom/usebutton/sdk/internal/InstallSheetActivity;->sourceToken:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 238
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setResult(I)V

    .line 239
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->finish()V

    return-void
.end method

.method public startAttendedInstall()V
    .locals 2

    .line 230
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "install_intent"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 231
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->setResult(I)V

    .line 232
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->finish()V

    return-void
.end method
