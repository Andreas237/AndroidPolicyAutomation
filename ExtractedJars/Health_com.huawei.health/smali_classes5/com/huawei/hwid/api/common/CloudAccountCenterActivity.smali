.class public Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;,
        Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;,
        Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/webkit/WebView;

.field private c:Landroid/widget/ProgressBar;

.field private d:Landroid/app/ActionBar;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:I

.field private n:I

.field private o:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<*>;"
        }
    .end annotation
.end field

.field private p:Landroid/net/Uri;

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Landroid/app/AlertDialog;

.field private t:Z

.field private u:Lcom/huawei/cloudservice/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 70
    const-string v0, "; phoneservice; cversion=hwid_advanced 2.6.1.301; Version=12000"

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->f:Ljava/lang/String;

    .line 72
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->g:Ljava/lang/String;

    .line 73
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->h:Ljava/lang/String;

    .line 74
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->i:Ljava/lang/String;

    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->t:Z

    .line 91
    new-instance v0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->u:Lcom/huawei/cloudservice/a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)I
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->q:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private a(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 657
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->n:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/vermanager/d;->b(I)Ljava/lang/String;

    move-result-object v3

    .line 658
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->n:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/vermanager/d;->c(I)Ljava/lang/String;

    move-result-object v4

    .line 659
    invoke-static {v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 660
    invoke-static {v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 662
    new-instance v5, Ljava/lang/StringBuffer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v1

    iget v2, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->n:I

    invoke-virtual {v1, v2}, Lcom/huawei/hwid/vermanager/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&cversion=hwid_advanced "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "2.6.1.301"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 665
    :try_start_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 666
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 668
    const-string v0, "&loginUrl="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&deviceID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&deviceType="

    .line 669
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&reqClientType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&service="

    .line 670
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&loginChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&lang="

    .line 671
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 676
    goto :goto_0

    .line 672
    :catch_0
    move-exception v6

    .line 673
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 676
    goto :goto_0

    .line 674
    :catch_1
    move-exception v6

    .line 675
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 677
    :goto_0
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/lang/String;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 469
    if-nez p1, :cond_0

    .line 470
    const-string v0, ""

    return-object v0

    .line 472
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 473
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    move-result-object v2

    .line 474
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 475
    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 474
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 477
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/lang/String;
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->e:Ljava/lang/String;

    return-object p1
.end method

.method private a(I)V
    .locals 2

    .line 343
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->a(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    .line 344
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    if-nez v0, :cond_0

    .line 345
    return-void

    .line 347
    :cond_0
    const-string v0, "CloudActivity"

    const-string v1, "dialog cancel mTmpPicUri "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    iput p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->q:I

    .line 349
    new-instance v0, Lcom/huawei/hwid/api/common/c;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwid/api/common/c;-><init>(Landroid/app/Activity;Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/c;->show()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->s:Landroid/app/AlertDialog;

    .line 350
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->s:Landroid/app/AlertDialog;

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$3;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 357
    return-void
.end method

.method private a(Landroid/net/Uri;)V
    .locals 4

    .line 366
    const-string v0, "CloudActivity"

    const-string v1, "RESULTCODE"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    if-eqz v0, :cond_3

    .line 369
    :try_start_0
    iget v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->q:I

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_0

    .line 370
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_1

    .line 371
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->q:I

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_2

    .line 372
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    if-nez p1, :cond_1

    const/4 v1, 0x0

    new-array v1, v1, [Landroid/net/Uri;

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/net/Uri;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    :goto_0
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    :cond_2
    :goto_1
    goto :goto_2

    .line 374
    :catch_0
    move-exception v3

    .line 375
    const-string v0, "CloudActivity"

    const-string v1, "Exception e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    .line 379
    :cond_3
    return-void
.end method

.method private a(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 381
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    .line 382
    const/16 v0, 0x3e9

    iput v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->q:I

    .line 383
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 384
    const/16 v0, 0x3e9

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(I)V

    .line 386
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/net/Uri;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 264
    :cond_0
    return-void
.end method

.method private a(Landroid/app/Activity;[Ljava/lang/String;I)Z
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 447
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    array-length v0, p2

    if-nez v0, :cond_1

    .line 448
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 450
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 451
    move-object v3, p2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    .line 452
    invoke-virtual {p1, v6}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 453
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 456
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 457
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p1, v0, p3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 458
    const/4 v0, 0x0

    return v0

    .line 460
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private a(Z)Z
    .locals 2

    .line 430
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->o:Landroid/webkit/ValueCallback;

    if-nez v0, :cond_0

    .line 431
    const/4 v0, 0x0

    return v0

    .line 432
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    if-nez v0, :cond_2

    .line 433
    :cond_1
    const-string v0, "CloudActivity"

    const-string v1, "onReceiveValue = null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/net/Uri;)V

    .line 435
    const/4 v0, 0x0

    return v0

    .line 437
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static a([I)Z
    .locals 5

    .line 513
    if-eqz p0, :cond_0

    array-length v0, p0

    if-gtz v0, :cond_1

    .line 514
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 516
    :cond_1
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    .line 517
    if-eqz v4, :cond_2

    .line 518
    const/4 v0, 0x0

    return v0

    .line 516
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 521
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 681
    new-instance v2, Ljava/lang/StringBuffer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwid/vermanager/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&cversion=hwid_advanced "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "2.6.1.301"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 686
    :try_start_0
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 687
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 688
    const-string v0, "&reqClientType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&loginChannel="

    .line 689
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&lang="

    .line 690
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 695
    goto :goto_0

    .line 691
    :catch_0
    move-exception v3

    .line 692
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 695
    goto :goto_0

    .line 693
    :catch_1
    move-exception v3

    .line 694
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 696
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 139
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    .line 140
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    if-eqz v0, :cond_1

    .line 141
    sget-boolean v0, Lcom/huawei/hwid/core/d/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "com.huawei.android.app.ActionBarEx"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$2;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/android/app/ActionBarEx;->setStartIcon(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    goto :goto_0

    .line 152
    :catch_0
    move-exception v4

    .line 153
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 154
    goto :goto_0

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 162
    :cond_1
    :goto_0
    const-string v0, "wvProgressbar"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c:Landroid/widget/ProgressBar;

    .line 165
    const-string v0, "webView"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    .line 166
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 167
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->u:Lcom/huawei/cloudservice/a;

    invoke-static {p0, v1}, Lcom/huawei/hwid/vermanager/c;->a(Landroid/content/Context;Lcom/huawei/cloudservice/a;)Landroid/webkit/WebViewClient;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    const-string v2, "webLoader"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    .line 171
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 173
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 174
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 175
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 177
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 178
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 179
    invoke-virtual {v4}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v5

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    const-string v1, "searchBoxJavaBridge_"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    const-string v1, "accessibilityTraversal"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 189
    :cond_2
    return-void
.end method

.method private b(Landroid/net/Uri;)V
    .locals 4

    .line 408
    const-string v0, "CloudActivity"

    const-string v1, "startCompressPic"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    new-instance v2, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    .line 410
    new-instance v3, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;

    invoke-direct {v3, p1}, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;-><init>(Landroid/net/Uri;)V

    .line 411
    new-instance v0, Lcom/huawei/hwid/usecase/CompressPictureCase;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/usecase/CompressPictureCase;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    invoke-virtual {v2, v0, v3, v1}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 423
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(I)Z
    .locals 3

    .line 359
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, p0, v0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/app/Activity;[Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    const/4 v0, 0x1

    return v0

    .line 363
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)Z
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(I)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->r:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 6

    .line 215
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 216
    if-nez v2, :cond_0

    .line 217
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->finish()V

    .line 218
    return-void

    .line 221
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 222
    if-nez v3, :cond_1

    .line 223
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->finish()V

    .line 224
    return-void

    .line 229
    :cond_1
    const-string v0, "com.huawei.hwid.ACTION_ACCOUNT_FIND_PWD_CLOUD"

    const-string v1, "key_enter_center"

    :try_start_0
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->t:Z

    .line 230
    const-string v0, "key_app_id_to_web"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->g:Ljava/lang/String;

    .line 231
    const-string v0, "key_user_account_to_web"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->h:Ljava/lang/String;

    .line 232
    const-string v0, "key_service_token_to_web"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->i:Ljava/lang/String;

    .line 233
    const-string v0, "deviceId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->j:Ljava/lang/String;

    .line 234
    const-string v0, "deviceType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->k:Ljava/lang/String;

    .line 235
    const-string v0, "siteId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->n:I

    .line 236
    const-string v0, "reqClientType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->l:I

    .line 237
    const-string v0, "loginChannel"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->m:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    goto :goto_1

    .line 238
    :catch_0
    move-exception v4

    .line 239
    const-string v0, "CloudActivity"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->t:Z

    if-eqz v0, :cond_3

    invoke-direct {p0, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    invoke-direct {p0, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    .line 242
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 243
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->finish()V

    .line 244
    return-void

    .line 247
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 248
    const-string v0, "http://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "https://"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    .line 250
    :goto_3
    if-nez v5, :cond_7

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    .line 255
    :cond_7
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(I)V

    return-void
.end method

.method private d()V
    .locals 10

    .line 540
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_4

    .line 541
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 542
    :goto_0
    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 544
    :goto_1
    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    .line 545
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "hwid_string_permission_and"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 546
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "hwid_string_permission_storage"

    invoke-static {p0, v4}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 547
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "hwid_string_permission_camera"

    invoke-static {p0, v4}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 545
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 548
    :cond_2
    if-eqz v5, :cond_3

    .line 549
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "hwid_string_permission_show"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 550
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "hwid_string_permission_storage"

    invoke-static {p0, v4}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 549
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 552
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "hwid_string_permission_show"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 553
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v4, "hwid_string_permission_camera"

    invoke-static {p0, v4}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 552
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 556
    .line 558
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "hwid_string_permission_use_appeal"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 556
    invoke-static {p0, v7, v0}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog$Builder;

    move-result-object v8

    .line 559
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 560
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    .line 561
    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    .line 564
    :cond_4
    return-void
.end method

.method private e()Z
    .locals 3

    .line 623
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 624
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    .line 625
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 626
    const-string v0, "index.html"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "wapLogin.html"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 627
    :cond_0
    const-string v0, "CloudActivity"

    const-string v1, "can not go back"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    const/4 v0, 0x0

    return v0

    .line 631
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 632
    const/4 v0, 0x1

    return v0

    .line 635
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private f()V
    .locals 3

    .line 649
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->t:Z

    if-eqz v0, :cond_0

    .line 650
    const-string v0, "CloudActivity"

    const-string v1, "autoLogin"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:autoLogin(\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 652
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 654
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 5

    .line 486
    const/4 v2, 0x0

    .line 487
    const/4 v3, 0x0

    .line 489
    const-string v0, "android.app.Activity"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 490
    const-string v0, "isInMultiWindowMode"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 491
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    move-result v0

    move v2, v0

    .line 506
    goto :goto_0

    .line 492
    :catch_0
    move-exception v4

    .line 493
    const-string v0, "CloudActivity"

    const-string v1, "ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 494
    :catch_1
    move-exception v4

    .line 495
    const-string v0, "CloudActivity"

    const-string v1, "NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 496
    :catch_2
    move-exception v4

    .line 497
    const-string v0, "CloudActivity"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 498
    :catch_3
    move-exception v4

    .line 499
    const-string v0, "CloudActivity"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 500
    :catch_4
    move-exception v4

    .line 501
    const-string v0, "CloudActivity"

    const-string v1, "InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 502
    :catch_5
    move-exception v4

    .line 503
    const-string v0, "CloudActivity"

    const-string v1, "RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    goto :goto_0

    .line 504
    :catch_6
    move-exception v4

    .line 505
    const-string v0, "CloudActivity"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    :goto_0
    return v2
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 389
    const-string v0, "CloudActivity"

    const-string v1, "onActivityResult"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 391
    const/16 v0, 0x3ec

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3eb

    if-ne p1, v0, :cond_3

    .line 392
    :cond_0
    const/16 v0, 0x3ec

    if-ne p1, v0, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 393
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    .line 395
    :cond_1
    const/4 v0, -0x1

    if-ne v0, p2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 396
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->p:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Landroid/net/Uri;)V

    .line 400
    :cond_3
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 605
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 606
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 609
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 613
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 615
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 115
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 117
    const-string v0, "cs_webview"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->setContentView(I)V

    .line 120
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c()V

    .line 122
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b()V

    .line 124
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->e:Ljava/lang/String;

    .line 127
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Ljava/lang/String;)V

    .line 130
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 575
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 578
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 583
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 584
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 587
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    .line 588
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->s:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 589
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->s:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 590
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->s:Landroid/app/AlertDialog;

    .line 592
    :cond_1
    new-instance v2, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$a;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;)V

    .line 593
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 595
    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 567
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 568
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 569
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 571
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 528
    const/16 v0, 0x3e9

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_2

    .line 529
    :cond_0
    invoke-static {p3}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a([I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 531
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(I)V

    goto :goto_0

    .line 534
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->d()V

    .line 535
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Landroid/net/Uri;)V

    .line 538
    :cond_2
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 642
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 643
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 646
    :cond_0
    return-void
.end method
