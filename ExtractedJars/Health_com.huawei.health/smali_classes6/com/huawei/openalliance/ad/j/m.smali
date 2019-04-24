.class public Lcom/huawei/openalliance/ad/j/m;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/i;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetJavaScriptEnabled"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/j/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/views/interfaces/h;>;Lcom/huawei/openalliance/ad/j/a/i<Lcom/huawei/openalliance/ad/views/interfaces/h;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/k/b/d;

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

.field private e:Z

.field private f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/j/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;Lcom/huawei/openalliance/ad/views/interfaces/h;)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/m;->e:Z

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-virtual {p0, p3}, Lcom/huawei/openalliance/ad/j/m;->a(Lcom/huawei/openalliance/ad/i/b;)V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/m;->a(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/h;)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/m;->e:Z

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/m;->a(Lcom/huawei/openalliance/ad/i/b;)V

    return-void
.end method

.method private a(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 4

    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v0, "http"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "intent"

    :try_start_1
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setDataAndTypeAndNormalize(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    goto :goto_0

    :cond_2
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v3, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_3
    :goto_0
    return-object v3

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "getIntent RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "getIntent Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/m;)Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->d:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    return-object v0
.end method

.method private a(Landroid/content/Intent;)Lcom/huawei/openalliance/ad/utils/c$a;
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v3, 0x0

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/utils/c$a;

    :cond_2
    return-object v3
.end method

.method private a(Landroid/webkit/WebView;Lcom/huawei/openalliance/ad/utils/c$a;Landroid/content/Intent;)V
    .locals 11

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_open_app_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_open_app_nomore_remind:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_open_app_tips:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/utils/c$a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_default_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_landing_page_open_app:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/m$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/m$2;-><init>(Lcom/huawei/openalliance/ad/j/m;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    new-instance v8, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-direct {v8, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v8, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_allow:I

    new-instance v1, Lcom/huawei/openalliance/ad/j/m$3;

    invoke-direct {v1, p0, p3, p2}, Lcom/huawei/openalliance/ad/j/m$3;-><init>(Lcom/huawei/openalliance/ad/j/m;Landroid/content/Intent;Lcom/huawei/openalliance/ad/utils/c$a;)V

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_reject:I

    new-instance v1, Lcom/huawei/openalliance/ad/j/m$4;

    invoke-direct {v1, p0, p2}, Lcom/huawei/openalliance/ad/j/m$4;-><init>(Lcom/huawei/openalliance/ad/j/m;Lcom/huawei/openalliance/ad/utils/c$a;)V

    invoke-virtual {v8, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v10

    instance-of v0, v10, Landroid/app/Activity;

    if-nez v0, :cond_1

    invoke-virtual {v9}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    :cond_1
    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/j/m$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/m$1;-><init>(Lcom/huawei/openalliance/ad/j/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/m;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/j/m;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/j/m;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    return-object v0
.end method

.method private b(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 2

    new-instance v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getLandingUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDetailUrl_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getShowId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getParamFromServer()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getMonitors()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMonitors(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getContentId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentId_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAdType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setAdType_(I)V

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setCtrlSwitchs(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getNoReportEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setNoReportEventList(Ljava/util/List;)V

    :cond_0
    return-object v1
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/j/m;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/m;->e:Z

    return v0
.end method


# virtual methods
.method a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;->onWebClose(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/k/b/d;->a(I)V

    :cond_1
    return-void
.end method

.method public a(Landroid/webkit/WebView;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-gt v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    :cond_2
    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/j/m;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V
    .locals 4

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m;->d:Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getAdType()I

    move-result v3

    invoke-static {v2, v3}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/j/m;->b(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    return-void
.end method

.method public a(Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 3

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/j/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/m$a;

    invoke-direct {v0, p2}, Lcom/huawei/openalliance/ad/j/m$a;-><init>(Landroid/webkit/WebView;)V

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;J)V

    :cond_2
    return-void
.end method

.method public a(Landroid/webkit/WebView;Landroid/net/Uri;)Z
    .locals 6

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/j/m;->a(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_0
    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/j/m;->a(Landroid/content/Intent;)Lcom/huawei/openalliance/ad/utils/c$a;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "shouldOverrideUrlLoading, queryIntentActivities failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :try_start_1
    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/utils/c$a;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/openalliance/ad/e/a/e;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "shouldOverrideUrlLoading, whilelist check failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v0, 0x1

    return v0

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/openalliance/ad/e/a/e;->e(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    :try_start_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->x()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0, p1, v3, v2}, Lcom/huawei/openalliance/ad/j/m;->a(Landroid/webkit/WebView;Lcom/huawei/openalliance/ad/utils/c$a;Landroid/content/Intent;)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "shouldOverrideUrlLoading error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/j/m;->a:Ljava/lang/String;

    const-string v1, "shouldOverrideUrlLoading error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;->onWebOpen()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/k/b/d;->e()V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->f:Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/listeners/IPPSWebEventCallback;->onWebloadFinish()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m;->b:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/k/b/d;->f()V

    :cond_1
    return-void
.end method
