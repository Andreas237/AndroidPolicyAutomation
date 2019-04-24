.class public Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bct;
.implements Lo/bcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;,
        Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;,
        Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;,
        Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;,
        Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;
    }
.end annotation


# instance fields
.field private A:Landroid/app/AlertDialog;

.field private B:Lcom/huawei/health/sns/model/chat/Assistant;

.field private C:Lo/bcs;

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private I:Landroid/content/BroadcastReceiver;

.field private f:Ljava/lang/String;

.field private g:Landroid/webkit/WebView;

.field private h:Landroid/widget/ProgressBar;

.field private j:Ljava/lang/String;

.field private k:Landroid/widget/FrameLayout;

.field private l:Landroid/app/ActionBar;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Z

.field private p:Ljava/lang/String;

.field private q:Landroid/view/View;

.field private r:Lo/bcu;

.field private s:Landroid/view/View;

.field private t:J

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Lo/bcv$c;

.field private x:Z

.field private y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

.field private z:Lo/bdb;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->o:Z

    .line 121
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n:Ljava/lang/String;

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m:Z

    .line 201
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t:J

    .line 221
    new-instance v0, Lo/bcv$c;

    invoke-direct {v0}, Lo/bcv$c;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->w:Lo/bcv$c;

    .line 226
    new-instance v0, Lo/bdb;

    invoke-direct {v0}, Lo/bdb;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->z:Lo/bdb;

    .line 233
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->x:Z

    .line 238
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->D:Z

    .line 268
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->I:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1170
    return-void
.end method

.method private a(Landroid/view/MenuItem;I)V
    .locals 5

    .line 843
    const/4 v4, 0x0

    .line 844
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 846
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 848
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->w:Lo/bcv$c;

    .line 849
    invoke-virtual {v0, p2}, Lo/bcv$c;->c(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 848
    :goto_1
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 850
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 7

    .line 1450
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v4

    .line 1451
    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v5

    .line 1453
    int-to-double v0, v4

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    sub-int v1, v4, v5

    sub-int v6, v0, v1

    .line 1454
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v6, v1, v2}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 1455
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 2

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->I:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 331
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 333
    :cond_0
    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 3

    .line 1581
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1583
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1585
    invoke-direct {p0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1589
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1592
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->x()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/webkit/WebView;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Landroid/webkit/WebView;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;J)J
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t:J

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->B:Lcom/huawei/health/sns/model/chat/Assistant;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 319
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 320
    const-string v0, "action_unfollow_success"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 321
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 322
    return-void
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1137
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/os/Message;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/Object;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->i(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 981
    if-nez p1, :cond_0

    .line 983
    const-string v0, "browser"

    const-string v1, "url is null, open failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    return-void

    .line 987
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 988
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 989
    const-string v0, "com.android.browser"

    invoke-static {p0, v3, v0}, Lo/bnx;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Z

    .line 990
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 1252
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    move-object v4, p3

    move-object v5, v7

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1253
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->A:Landroid/app/AlertDialog;

    return-object p1
.end method

.method private static d(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1305
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setDrawingCacheEnabled(Z)V

    .line 1306
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 1308
    const v0, 0x3e4ccccd    # 0.2f

    const v1, 0x3e4ccccd    # 0.2f

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1309
    invoke-virtual {p0}, Landroid/webkit/WebView;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v8

    .line 1310
    const/4 v9, 0x0

    .line 1311
    if-eqz v8, :cond_0

    .line 1313
    move-object v0, v8

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 1314
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    .line 1313
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 1316
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setDrawingCacheEnabled(Z)V

    .line 1317
    return-object v9
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->u:Ljava/lang/String;

    return-object p1
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1108
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;ILjava/lang/String;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b(ILjava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 6

    .line 1559
    instance-of v0, p1, [I

    if-nez v0, :cond_0

    .line 1561
    return-void

    .line 1564
    :cond_0
    move-object v0, p1

    check-cast v0, [I

    move-object v1, v0

    check-cast v1, [I

    .line 1565
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget v5, v2, v4

    .line 1567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->w:Lo/bcv$c;

    invoke-virtual {v0, v5}, Lo/bcv$c;->a(I)V

    .line 1565
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1570
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->invalidateOptionsMenu()V

    .line 1571
    return-void
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 5

    .line 349
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 351
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 354
    :cond_1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    .line 356
    if-nez v3, :cond_2

    .line 358
    const-string v0, "browser"

    const-string v1, "host is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    const/4 v0, 0x0

    return v0

    .line 363
    :cond_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 366
    const-string v0, ".huawei.com"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, ".vmall.com"

    .line 367
    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v4, 0x1

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    .line 368
    :goto_0
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    return v4
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v:Ljava/lang/String;

    return-object p1
.end method

.method private static e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 1268
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method private e()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 381
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->l:Landroid/app/ActionBar;

    .line 383
    sget v0, Lcom/huawei/android/sns/R$id;->wv_Holder:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->k:Landroid/widget/FrameLayout;

    .line 386
    sget v0, Lcom/huawei/android/sns/R$id;->wvProgressbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h:Landroid/widget/ProgressBar;

    .line 389
    sget v0, Lcom/huawei/android/sns/R$id;->webView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    .line 390
    sget v0, Lcom/huawei/android/sns/R$id;->wv_security_warn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q:Landroid/view/View;

    .line 391
    sget v0, Lcom/huawei/android/sns/R$id;->wv_load_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s:Landroid/view/View;

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$2;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 414
    invoke-virtual {v3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v4

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " HuaweiMessager/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/brg;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 417
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 419
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 420
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 422
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 423
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 425
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 426
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 428
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 429
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 431
    sget-object v0, Landroid/webkit/WebSettings$TextSize;->NORMAL:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 433
    new-instance v0, Lo/bcs;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lo/bcs;-><init>(Landroid/content/Context;Lo/bct;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->C:Lo/bcs;

    .line 436
    const-string v0, "browser"

    const-string v1, "add js bridge"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->C:Lo/bcs;

    const-string v2, "hwmp"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lo/bcx;

    invoke-direct {v1, p0}, Lo/bcx;-><init>(Lo/bcw;)V

    const-string v2, "hwop"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 447
    :cond_0
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "api level "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " can\'t add interface."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const-string v1, "searchBoxJavaBridge_"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const-string v1, "accessibilityTraversal"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 455
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->wv_ic_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/View;)V

    .line 456
    sget v0, Lcom/huawei/android/sns/R$id;->wv_ic_load_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/View;)V

    .line 457
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g()V

    .line 458
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 2

    .line 571
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 572
    if-eqz v1, :cond_0

    .line 574
    const-string v0, "bundleKeyAssistant"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Assistant;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->B:Lcom/huawei/health/sns/model/chat/Assistant;

    .line 576
    :cond_0
    return-void
.end method

.method private e(Landroid/webkit/WebView;)V
    .locals 3

    .line 1501
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1503
    return-void

    .line 1507
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 1509
    const-string v0, "window.addEventListener(\'load\', clearErrorPage, false);function clearErrorPage() { document.body.innerHTML=\"\";};"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 1513
    :cond_1
    const-string v0, "javascript:window.addEventListener(\'load\', clearErrorPage, false);function clearErrorPage() { document.body.innerHTML=\"\";};"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1517
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t()V

    .line 1520
    sget v0, Lcom/huawei/android/sns/R$string;->sns_webview_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->i(Ljava/lang/String;)V

    .line 1523
    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 1524
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a([I)V

    .line 1527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1528
    return-void

    :array_0
    .array-data 4
        0x2
        0x5
    .end array-data
.end method

.method private e(Ljava/lang/String;)V
    .locals 7

    .line 1217
    const-string v3, ""

    .line 1218
    const-string v4, ""

    .line 1219
    const-string v5, ""

    .line 1222
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1224
    const-string v0, "title"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1226
    const-string v0, "icon"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1228
    const-string v0, "abstract"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 1236
    goto :goto_0

    .line 1230
    :catch_0
    move-exception v6

    .line 1232
    const-string v0, "browser"

    const-string v1, "parseValue error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1235
    return-void

    .line 1238
    :goto_0
    invoke-direct {p0, v3, v4, v5}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1239
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->F:Ljava/lang/String;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 462
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 463
    if-nez v3, :cond_0

    .line 465
    const-string v0, "browser"

    const-string v1, "actionbar not found."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    return-void

    .line 469
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 472
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 473
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    .line 478
    :cond_1
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$3;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 491
    :goto_0
    const-string v0, " "

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 492
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p()Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0
.end method

.method private h()Z
    .locals 1

    .line 950
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 952
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 953
    const/4 v0, 0x1

    return v0

    .line 956
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->E:Ljava/lang/String;

    return-object v0
.end method

.method private i(Ljava/lang/String;)V
    .locals 1

    .line 1545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->l:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 1547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->l:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 1549
    :cond_0
    return-void
.end method

.method private k()V
    .locals 9

    .line 499
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 500
    if-nez v4, :cond_0

    .line 502
    return-void

    .line 505
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 506
    if-nez v5, :cond_1

    .line 508
    return-void

    .line 512
    :cond_1
    const-string v0, "mp_click"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->o:Z

    .line 514
    const-string v0, "mp_userId"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n:Ljava/lang/String;

    .line 516
    const-string v0, "mp_isFromSDK"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m:Z

    .line 518
    const-string v0, "mp_app_package"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->j:Ljava/lang/String;

    .line 519
    const-string v0, "mp_app_require_version"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->E:Ljava/lang/String;

    .line 520
    const-string v0, "mp_app_id"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->F:Ljava/lang/String;

    .line 523
    const-string v0, "url"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 527
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 531
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->r:Lo/bcu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bcu;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 533
    const-string v0, "browser"

    const-string v1, "special url open app, finish me."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->finish()V

    .line 535
    return-void

    .line 539
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 540
    const-string v0, "http://"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "https://"

    .line 541
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "file://"

    .line 542
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v7, 0x1

    goto :goto_0

    :cond_5
    const/4 v7, 0x0

    .line 544
    :goto_0
    if-nez v7, :cond_6

    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    .line 551
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 555
    :try_start_0
    new-instance v0, Lo/arj;

    invoke-direct {v0}, Lo/arj;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    invoke-virtual {v0, v1, v2, v3}, Lo/arj;->a(JLandroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 560
    goto :goto_1

    .line 557
    :catch_0
    move-exception v8

    .line 559
    const-string v0, "browser"

    const-string v1, "mpUserId NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    :cond_7
    :goto_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lo/bcs;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->C:Lo/bcs;

    return-object v0
.end method

.method private l()V
    .locals 6

    .line 1189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->C:Lo/bcs;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/bcs;->a(ILo/bcy;)V

    .line 1190
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "javascript:var info=\"\";try{ info=hwGetPageInfo(); }catch(e){};var data=JSON.stringify(info);window.hwmp.callback(%d, data)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1194
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1190
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1195
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1196
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)J
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t:J

    return-wide v0
.end method

.method private m()V
    .locals 4

    .line 964
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 966
    const-string v0, "browser"

    const-string v1, "url is null, copy failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 967
    return-void

    .line 971
    :cond_0
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/ClipboardManager;

    .line 972
    const-string v0, "sns_url"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    .line 973
    invoke-virtual {v2, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 974
    return-void
.end method

.method private n()Landroid/webkit/WebResourceResponse;
    .locals 4

    .line 1339
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1341
    const/4 v0, 0x0

    return-object v0

    .line 1347
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "sns_security_info.html"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 1348
    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 1350
    :catch_0
    move-exception v3

    .line 1353
    const-string v0, "browser"

    const-string v1, "get default page failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1356
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Z
    .locals 1

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v()Z

    move-result v0

    return v0
.end method

.method private o()V
    .locals 3

    .line 1203
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1204
    const-string v0, "complain_category_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1205
    const-string v0, "complain_url_title"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1206
    const-string v0, "complain_url"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1207
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 1208
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s()V

    return-void
.end method

.method private p()Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 1367
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1370
    const/4 v0, 0x0

    return-object v0

    .line 1374
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->D:Z

    if-eqz v0, :cond_1

    .line 1376
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n()Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0

    .line 1379
    :cond_1
    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v:Ljava/lang/String;

    .line 1382
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v:Ljava/lang/String;

    .line 1385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->z:Lo/bdb;

    invoke-virtual {v0, v1}, Lo/bdb;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1394
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$5;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1403
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n()Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0

    .line 1407
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lo/bcv$c;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->w:Lo/bcv$c;

    return-object v0
.end method

.method private q()V
    .locals 1

    .line 1470
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->x:Z

    .line 1471
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->D:Z

    .line 1472
    return-void
.end method

.method private r()V
    .locals 2

    .line 1425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    .line 1430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1431
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->D:Z

    .line 1432
    return-void
.end method

.method static synthetic s(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/app/AlertDialog;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->A:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private s()V
    .locals 2

    .line 1415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1418
    return-void
.end method

.method static synthetic t(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    return-object v0
.end method

.method private t()V
    .locals 2

    .line 1439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->s:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1442
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->x:Z

    .line 1443
    return-void
.end method

.method private u()V
    .locals 3

    .line 1480
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1482
    return-void

    .line 1484
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->r()V

    .line 1486
    sget v0, Lcom/huawei/android/sns/R$string;->sns_webview_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->i(Ljava/lang/String;)V

    .line 1488
    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 1489
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a([I)V

    .line 1492
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1493
    return-void

    :array_0
    .array-data 4
        0x2
        0x5
    .end array-data
.end method

.method static synthetic u(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->u()V

    return-void
.end method

.method private v()Z
    .locals 1

    .line 1536
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->x:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->D:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private x()V
    .locals 4

    .line 1684
    const-string v3, "var images = document.getElementsByTagName(\"img\");window.hwmp.clearImageList();var position=-1;for (var j = 0; j < images.length; j++) {var shouldShow = true;var parent = images[j].parentNode;while(1) {var name = parent.tagName;if(name == \"BODY\") {break;}if(name == \"A\") {shouldShow = false;break;}parent = parent.parentNode;}if(shouldShow) {var url = images[j].getAttribute(\"src\");if(url == null){continue;}window.hwmp.addImageList(url);position++;images[j].pos = position;images[j].onclick = function() {var pos = this.pos;window.hwmp.openImage(pos);}}}"

    .line 1691
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1695
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lo/bcr;
    .locals 3

    .line 1030
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    .line 1031
    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1033
    :cond_0
    const-string v0, "browser"

    const-string v1, "param error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1034
    const/4 v0, 0x0

    return-object v0

    .line 1038
    :cond_1
    const/4 v2, 0x0

    .line 1062
    return-object v2
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 585
    iput-object p1, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 587
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 588
    return-void
.end method

.method a([I)V
    .locals 4

    .line 1327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 1328
    iput-object p1, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1331
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 999
    if-eqz p1, :cond_0

    const-string v0, "[0-9]+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1001
    :cond_0
    const-string v0, "browser"

    const-string v1, "invalid assistant id."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1002
    return-void

    .line 1008
    :cond_1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 1014
    goto :goto_0

    .line 1010
    :catch_0
    move-exception v4

    .line 1012
    const-string v0, "browser"

    const-string v1, "parse uid error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1013
    return-void

    .line 1017
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m:Z

    invoke-static {p0, v2, v3, v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Landroid/app/Activity;JZ)V

    .line 1019
    return-void
.end method

.method public d()V
    .locals 1

    .line 338
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d:Landroid/view/View;

    .line 339
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 937
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 939
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 941
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 797
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 798
    sget v0, Lcom/huawei/android/sns/R$id;->wv_ic_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/View;)V

    .line 799
    sget v0, Lcom/huawei/android/sns/R$id;->wv_ic_load_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/View;)V

    .line 800
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 287
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 289
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->y:Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    .line 291
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->setContentView(I)V

    .line 294
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e()V

    .line 297
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c()V

    .line 299
    new-instance v0, Lo/bcu;

    invoke-direct {v0, p0}, Lo/bcu;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->r:Lo/bcu;

    .line 302
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->k()V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->v:Ljava/lang/String;

    .line 308
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->q()V

    .line 312
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 805
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_webview_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 806
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 2

    .line 907
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 909
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->A:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 911
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->A:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 912
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->A:Landroid/app/AlertDialog;

    .line 916
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 918
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->k:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 921
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 925
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 928
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->b()V

    .line 929
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    .line 930
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 856
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 858
    const v0, 0x102002c

    if-ne v1, v0, :cond_0

    .line 861
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->finish()V

    goto :goto_0

    .line 863
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_copy_link:I

    if-ne v1, v0, :cond_1

    .line 866
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->m()V

    goto :goto_0

    .line 868
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_open_in_browser:I

    if-ne v1, v0, :cond_2

    .line 871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->p:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 873
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_share:I

    if-ne v1, v0, :cond_3

    .line 876
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->l()V

    goto :goto_0

    .line 878
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_complain:I

    if-ne v1, v0, :cond_4

    .line 881
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->o()V

    .line 884
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 1

    .line 891
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPause()V

    .line 893
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 894
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .line 812
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->w:Lo/bcv$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bcv$c;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 815
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/view/Menu;->setGroupVisible(IZ)V

    goto :goto_0

    .line 820
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_share:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 821
    if-eqz v2, :cond_1

    .line 823
    const/4 v0, 0x2

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/MenuItem;I)V

    .line 825
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->menu_wv_complain:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 826
    if-eqz v2, :cond_2

    .line 828
    const/4 v0, 0x5

    invoke-direct {p0, v2, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/view/MenuItem;I)V

    .line 832
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 1

    .line 899
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 901
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 902
    return-void
.end method
