.class public Lcom/huawei/openalliance/ad/activity/PPSActivity;
.super Landroid/app/Activity;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/a$a;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/views/PPSWebView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

.field private f:Landroid/app/ActionBar;

.field private g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

.field private h:Landroid/content/ClipboardManager;

.field private i:Lcom/huawei/openalliance/ad/e/a/e;

.field private j:Ljava/lang/Boolean;

.field private k:Landroid/widget/PopupMenu;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/activity/PPSActivity;)Lcom/huawei/openalliance/ad/views/AppDownloadButton;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    if-nez v0, :cond_0

    new-instance v0, Landroid/widget/PopupMenu;

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ag;->d(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x800005

    invoke-direct {v0, v1, p1, v2}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$menu;->menu:I

    iget-object v2, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    invoke-virtual {v2}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    new-instance v1, Lcom/huawei/openalliance/ad/activity/PPSActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$2;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->k:Landroid/widget/PopupMenu;

    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/activity/PPSActivity;Lcom/huawei/openalliance/ad/download/app/AppStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Lcom/huawei/openalliance/ad/download/app/AppStatus;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/download/app/AppStatus;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOADING:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->PAUSE:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPermissions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPermissions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private a(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_menu_item_refresh:I

    if-ne v1, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g()V

    const/4 v0, 0x1

    return v0

    :cond_0
    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_menu_item_copy_link:I

    if-ne v1, v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f()V

    const/4 v0, 0x1

    return v0

    :cond_1
    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_menu_item_open_in_browser:I

    if-ne v1, v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e()V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/activity/PPSActivity;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/activity/PPSActivity;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->i:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method private b()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->setRequestedOrientation(I)V

    :cond_0
    return-void
.end method

.method private c()Z
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->c()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->isShowPageTitle()Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_detail:I

    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, " "

    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/huawei/openalliance/ad/activity/PPSActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$1;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/android/app/ActionBarEx;->setStartIcon(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private e()V
    .locals 5

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const v0, 0x10008000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v3}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v2

    const-string v0, "text"

    invoke-static {v0, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->h:Landroid/content/ClipboardManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->h:Landroid/content/ClipboardManager;

    invoke-virtual {v0, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_link_already_copied:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->loadPage()V

    return-void
.end method

.method private h()V
    .locals 9

    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSWebView;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->j()Z

    move-result v5

    move-object v1, p0

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/views/PPSWebView;-><init>(Landroid/content/Context;Landroid/app/ActionBar;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;Lcom/huawei/openalliance/ad/views/a$a;Z)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_landing_webview_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_landing_download_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->b:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_landing_cancel_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_landing_permission_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_landing_download_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v7

    if-nez v7, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->c()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_cancel_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_permission_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_cancel_btn_emui8:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_permission_btn_emui8:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAdLandingPageData(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    new-instance v1, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAppDownloadButtonStyle(Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    new-instance v1, Lcom/huawei/openalliance/ad/activity/PPSActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$3;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setOnDownloadStatusChangedListener(Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    new-instance v1, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;

    invoke-direct {v1, p0, v7}, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setButtonTextWatcher(Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/openalliance/ad/activity/PPSActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$5;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;

    invoke-direct {v1, p0, v7}, Lcom/huawei/openalliance/ad/activity/PPSActivity$6;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->e:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;

    move-result-object v8

    invoke-direct {p0, v8}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Lcom/huawei/openalliance/ad/download/app/AppStatus;)V

    :goto_1
    return-void
.end method

.method private i()Z
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private j()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->j:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/activity/PPSActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$7;-><init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->j:Ljava/lang/Boolean;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/huawei/openalliance/ad/R$style;->HiAdThemeNoActionBar:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->setTheme(I)V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->b()V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ad_landing_page_data"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "PPSActivity"

    const-string v1, "fail to get contentRecord, class cast exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "PPSActivity"

    const-string v1, "fail to get contentRecord"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->g:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const-string v0, "PPSActivity"

    const-string v1, "content record null, don\'t show ad detail web page"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->finish()V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->i:Lcom/huawei/openalliance/ad/e/a/e;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->d()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->hide()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->f:Landroid/app/ActionBar;

    :cond_3
    :goto_1
    sget v0, Lcom/huawei/openalliance/ad/R$layout;->hiad_activity_landing_page:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->setContentView(I)V

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->h:Landroid/content/ClipboardManager;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->h()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->loadPage()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$menu;->menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onMenuBtnClick(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Landroid/view/View;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->onPause()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->onResume()V

    :cond_0
    return-void
.end method
