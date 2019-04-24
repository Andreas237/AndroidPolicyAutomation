.class public Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$b;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;,
        Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ProgressBar;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/operation/view/CustomWebView;

.field private e:Landroid/webkit/WebView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:F

.field private i:Z

.field private k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

.field private l:F

.field private m:Z

.field private n:Z

.field private o:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

.field private p:Z

.field private q:Z

.field private r:Landroid/content/SharedPreferences;

.field private s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;

.field private t:Lo/bvb;

.field private u:Ljava/lang/Long;

.field private y:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;

.field private z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 68
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 69
    const-string v0, "StressGameMainActivity"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->h:F

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->l:F

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    .line 87
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->m:Z

    .line 90
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->q:Z

    .line 95
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    .line 158
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->y:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;

    .line 365
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 278
    invoke-static {p0}, Lo/bvb;->c(Landroid/app/Activity;)Lo/bvb;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->t:Lo/bvb;

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->t:Lo/bvb;

    sget v1, Lcom/huawei/ui/main/R$layout;->stress_game_main_back_dialog:I

    invoke-virtual {v0, v1}, Lo/bvb;->e(I)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->sug_stress_dialog_No:I

    new-instance v2, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 280
    invoke-virtual {v0, v1, v2}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->sug_coach_dialog_yes:I

    new-instance v2, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 294
    invoke-virtual {v0, v1, v2}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->t:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->a()Landroid/app/Dialog;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 362
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;II)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Ljava/lang/String;F)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    return p1
.end method

.method private b()V
    .locals 10

    .line 506
    sget v0, Lcom/huawei/ui/main/R$id;->load_url_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a:Landroid/widget/ProgressBar;

    .line 507
    sget v0, Lcom/huawei/ui/main/R$id;->web_stress:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    .line 508
    sget v0, Lcom/huawei/ui/main/R$id;->stress_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b:Landroid/widget/RelativeLayout;

    .line 509
    sget v0, Lcom/huawei/ui/main/R$id;->stress_titlebar_iv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g:Landroid/widget/ImageView;

    .line 510
    sget v0, Lcom/huawei/ui/main/R$id;->stress_titlebar_title_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f:Landroid/widget/TextView;

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v6

    .line 514
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 516
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Landroid/webkit/WebChromeClient;

    invoke-direct {v1}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 518
    new-instance v7, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$b;

    const/4 v0, 0x0

    invoke-direct {v7, p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    const-string v1, "android"

    invoke-virtual {v0, v7, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    new-instance v0, Lcom/huawei/operation/view/CustomWebView;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a:Landroid/widget/ProgressBar;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;

    move-object v1, p0

    const/16 v5, 0xbba

    invoke-direct/range {v0 .. v5}, Lcom/huawei/operation/view/CustomWebView;-><init>(Landroid/content/Context;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->d:Lcom/huawei/operation/view/CustomWebView;

    .line 526
    const-string v8, "file:///android_asset/stressGame/html/twoVideoPlay_old.html"

    .line 527
    invoke-static {}, Lo/exd;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7279\u6b8a\u624b\u673a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const-string v8, "file:///android_asset/stressGame/html/twoVideoPlay.html"

    .line 531
    :cond_0
    new-instance v9, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$10;

    invoke-direct {v9, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$10;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView() url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->d:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v9}, Lcom/huawei/operation/view/CustomWebView;->setMyWebviewClientImpl(Lcom/huawei/operation/view/WebViewClientImpl;)V

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->d:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, v8}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_biofeedback_game:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    return-void
.end method

.method private b(Ljava/lang/String;F)V
    .locals 3

    .line 208
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MeasureEnd"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MeasureEnd"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 213
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 221
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    return p1
.end method

.method private c()V
    .locals 6

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " \u72b6\u6001\u503c= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v4, "MeasureEnd"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " H5\u8fd4\u56de\u503c= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v4, "stress_game_result_data"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v1, "stress_game_result_data"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u751f\u7269\u53cd\u9988\u6e38\u620f\u89c6\u9891\u81ea\u52a8\u64ad\u653e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    const-string v0, "pageInitFinish"

    const-string v1, "true"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    const-string v1, "javascript:(function() { var videos = document.getElementsByTagName(\'video\'); for(var i=0;i<videos.length;i++){videos[i].play();}})();javascript:(function() { var audio = document.getElementsByTagName(\'audio\'); for(var i=0;i<audio.length;i++){audio[i].play();}})()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 600
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u663e\u793a\u7ed3\u679c\u754c\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v3, "stress_game_result_data"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    const-string v0, "resultData"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v2, "stress_game_result_data"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    :goto_0
    return-void
.end method

.method private c(II)V
    .locals 3

    .line 726
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 727
    const-string v0, "stress_game_status"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    const-string v0, "halfway_out"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    sget-object v0, Lo/dae;->fs:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 730
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 238
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    return p1
.end method

.method private d()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 445
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->h()V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "stress_game_result_data"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MeasureEnd"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 448
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g()V

    .line 449
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 450
    const-string v0, "STRESSGAME_STARTTIME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 451
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->startActivity(Landroid/content/Intent;)V

    .line 452
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->finish()V

    .line 453
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->overridePendingTransition(II)V

    .line 454
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g()V

    return-void
.end method

.method private e()V
    .locals 5

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 616
    const/4 v0, 0x1

    invoke-virtual {p0, v4, p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 617
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    .line 618
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->q:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e:Landroid/webkit/WebView;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StressGameMainActivity.isCloseMesure "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " StressGameMainActivity.isStopTimer"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 630
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    if-nez v0, :cond_0

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Activity onDestroy \u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    .line 636
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    if-nez v0, :cond_1

    .line 637
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    .line 638
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Activity onDestroy \u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    .line 641
    :cond_1
    invoke-virtual {p0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_0

    .line 643
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u542f\u540estressGameMainActivity.stressGameBindService \u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)F
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->l:F

    return v0
.end method

.method private h()V
    .locals 3

    .line 711
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 712
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    sget-object v0, Lo/dae;->ft:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 714
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 737
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 738
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 739
    const-string v0, "dwelltime"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    sget-object v0, Lo/dae;->fu:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 742
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)F
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->h:F

    return v0
.end method

.method private k()V
    .locals 4

    .line 695
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 696
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 697
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 698
    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 700
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 701
    const/16 v3, 0x1006

    .line 703
    invoke-virtual {v2, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 705
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->s:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$d;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Landroid/content/SharedPreferences;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->q:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->d()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lo/bvb;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->t:Lo/bvb;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 243
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 245
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->requestWindowFeature(I)Z

    .line 248
    const/16 v5, 0x400

    .line 250
    invoke-virtual {v4, v5, v5}, Landroid/view/Window;->setFlags(II)V

    .line 251
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 252
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_stress_game_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->setContentView(I)V

    .line 253
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "STRESSGAME_STARTTIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STRESSGAME_STARTTIME = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->u:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const-string v0, "sleep_shared_pref_smart_msg"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    .line 256
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b()V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->r:Landroid/content/SharedPreferences;

    const-string v1, "stress_game_result_data"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 258
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e()V

    .line 260
    :cond_0
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 622
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 623
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 650
    const/4 v0, 0x4

    if-ne v0, p1, :cond_4

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onKeyDown() \u8fd4\u56de\u952e\u88ab\u70b9\u51fb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isMesureing:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    if-eqz v0, :cond_0

    .line 654
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a()V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->t:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->d()Lo/bvb;

    goto/16 :goto_1

    .line 657
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isMesureing finish():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 664
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    if-nez v0, :cond_1

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 666
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p:Z

    .line 671
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    if-nez v0, :cond_3

    .line 672
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->n:Z

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " \u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    goto :goto_0

    .line 677
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u542f\u540estressGameMainActivity.stressGameBindService \u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g()V

    .line 680
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(II)V

    .line 681
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i()V

    .line 682
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->finish()V

    .line 683
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->overridePendingTransition(II)V

    .line 685
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 687
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 2

    .line 499
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 501
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i:Z

    if-eqz v0, :cond_0

    .line 502
    const-string v0, "measureEnd"

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Ljava/lang/String;F)V

    .line 504
    :cond_0
    return-void
.end method

.method protected onRestart()V
    .locals 0

    .line 269
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 270
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 492
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 493
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k()V

    .line 494
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->setRequestedOrientation(I)V

    .line 495
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 424
    move-object v0, p2

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->o:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->o:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$d;->e()Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStressGameBindCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->y:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$c;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(Lo/exb;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->z:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(Lo/eww;)V

    .line 430
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->m:Z

    .line 431
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 435
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->m:Z

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceDisconnected() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    return-void
.end method

.method protected onStart()V
    .locals 0

    .line 264
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 265
    return-void
.end method

.method protected onStop()V
    .locals 0

    .line 274
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 275
    return-void
.end method
