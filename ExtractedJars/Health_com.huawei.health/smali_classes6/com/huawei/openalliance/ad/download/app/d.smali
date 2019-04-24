.class public Lcom/huawei/openalliance/ad/download/app/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/download/app/d$a;
    }
.end annotation


# static fields
.field private static a:Landroid/os/CountDownTimer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    return-void
.end method

.method static synthetic a(Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;
    .locals 0

    sput-object p0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    return-object p0
.end method

.method private static a(Landroid/app/AlertDialog;ILcom/huawei/openalliance/ad/download/app/d$a;)V
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/download/app/d$4;

    int-to-long v1, p1

    const-wide/16 v3, 0x3e8

    move-object v5, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/huawei/openalliance/ad/download/app/d$4;-><init>(JJLandroid/app/AlertDialog;Lcom/huawei/openalliance/ad/download/app/d$a;)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/d;->a:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/d$a;)V
    .locals 10

    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-direct {v6, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPopUpAfterInstall()I

    move-result v7

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_app_installed:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const/4 v8, 0x0

    const/4 v0, -0x1

    if-eq v0, v7, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$plurals;->hiad_dismiss_dilaog:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/text/NumberFormat;->getIntegerInstance()Ljava/text/NumberFormat;

    move-result-object v3

    int-to-long v4, v7

    invoke-virtual {v3, v4, v5}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v7, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v8, 0x1

    goto :goto_0

    :catch_0
    move-exception v9

    const-string v0, "AppOpenDialog"

    const-string v1, "get resource error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v9

    const-string v0, "AppOpenDialog"

    const-string v1, "get resource error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_open:I

    new-instance v1, Lcom/huawei/openalliance/ad/download/app/d$1;

    invoke-direct {v1, p2}, Lcom/huawei/openalliance/ad/download/app/d$1;-><init>(Lcom/huawei/openalliance/ad/download/app/d$a;)V

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_dismiss:I

    new-instance v1, Lcom/huawei/openalliance/ad/download/app/d$2;

    invoke-direct {v1, p2}, Lcom/huawei/openalliance/ad/download/app/d$2;-><init>(Lcom/huawei/openalliance/ad/download/app/d$a;)V

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_1

    :cond_1
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_close:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :goto_1
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    invoke-virtual {v9}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7f6

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v9}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    :cond_3
    :goto_2
    const-string v0, "AppOpenDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show, time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v8, :cond_4

    mul-int/lit16 v0, v7, 0x3e8

    invoke-static {v9, v0, p2}, Lcom/huawei/openalliance/ad/download/app/d;->a(Landroid/app/AlertDialog;ILcom/huawei/openalliance/ad/download/app/d$a;)V

    :cond_4
    new-instance v0, Lcom/huawei/openalliance/ad/download/app/d$3;

    invoke-direct {v0, p2}, Lcom/huawei/openalliance/ad/download/app/d$3;-><init>(Lcom/huawei/openalliance/ad/download/app/d$a;)V

    invoke-virtual {v9, v0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
