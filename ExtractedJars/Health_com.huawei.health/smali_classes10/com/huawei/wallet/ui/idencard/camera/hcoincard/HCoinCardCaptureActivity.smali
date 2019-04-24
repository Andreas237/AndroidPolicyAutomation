.class public Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field static final a:[J


# instance fields
.field private g:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->a:[J

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x46
        0xa
        0x28
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)V
    .locals 0

    .line 31
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method private b(J)V
    .locals 2

    .line 152
    const-string v0, "CardIOActivity.nextActivity()"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 154
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;-><init>(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 175
    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;Lexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object p1
.end method

.method static synthetic k(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 77
    sget v0, Lcom/huawei/base/R$layout;->hcoincard_reco_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->setContentView(I)V

    .line 78
    sget v0, Lcom/huawei/base/R$id;->input_by_user:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->g:Landroid/widget/TextView;

    .line 79
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->g:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$1;-><init>(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    return-void
.end method

.method public a(Ljava/lang/Object;J)V
    .locals 5

    .line 105
    const-string v0, "processDetections"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 106
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lexocr/base/ExBaseCardInfo;

    if-nez v0, :cond_1

    .line 108
    :cond_0
    return-void

    .line 110
    :cond_1
    move-object v3, p1

    check-cast v3, Lexocr/base/ExBaseCardInfo;

    .line 113
    const-string v0, "vibrator"

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Vibrator;

    .line 114
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->a:[J

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame Time : 10=="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 129
    goto :goto_0

    .line 117
    :catch_0
    move-exception v4

    .line 119
    const-string v0, "System services not available to Activities before onCreate() "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 129
    goto :goto_0

    .line 121
    :catch_1
    move-exception v4

    .line 123
    const-string v0, "Exception while cast to vibrate: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 129
    goto :goto_0

    .line 125
    :catch_2
    move-exception v4

    .line 127
    const-string v0, "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application\'s manifest."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 131
    :goto_0
    invoke-virtual {v3}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 133
    iput-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    .line 134
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 135
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 137
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 139
    :cond_2
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->e(Landroid/graphics/Bitmap;)V

    .line 140
    invoke-direct {p0, p2, p3}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b(J)V

    .line 142
    :cond_3
    return-void
.end method

.method public b()V
    .locals 0

    .line 93
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->b()V

    .line 94
    return-void
.end method

.method public c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
    .locals 1

    .line 185
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivityHandler;

    invoke-direct {v0, p1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivityHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 56
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c()V

    .line 57
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_add_hcoincard:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->d(I)V

    .line 58
    return-void
.end method

.method public d()Landroid/os/Handler;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 44
    invoke-super {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lexocr/exocrengine/EXOCREngine;->a(Landroid/content/Context;)Z

    .line 47
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 48
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 49
    const-string v0, "event_callback_id"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->d:Ljava/lang/String;

    .line 51
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 69
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->onDestroy()V

    .line 71
    invoke-static {}, Lexocr/exocrengine/EXOCREngine;->d()I

    .line 72
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 63
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->onPause()V

    .line 64
    return-void
.end method
