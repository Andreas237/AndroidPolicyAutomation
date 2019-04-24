.class public Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.source "SourceFile"


# static fields
.field static final a:[J


# instance fields
.field private g:Lo/emr;

.field private k:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->a:[J

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

    .line 32
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)V
    .locals 0

    .line 32
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;Lexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object p1
.end method

.method private d(J)V
    .locals 2

    .line 169
    const-string v0, "CardIOActivity.nextActivity()"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 171
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;-><init>(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 211
    return-void
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 84
    sget v0, Lcom/huawei/base/R$layout;->card_reco_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->setContentView(I)V

    .line 85
    sget v0, Lcom/huawei/base/R$id;->input_by_user:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->k:Landroid/widget/TextView;

    .line 86
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->k:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$1;-><init>(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    return-void
.end method

.method public a(Ljava/lang/Object;J)V
    .locals 5

    .line 118
    const-string v0, "processDetections"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 119
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lexocr/base/ExBaseCardInfo;

    if-nez v0, :cond_1

    .line 121
    :cond_0
    return-void

    .line 123
    :cond_1
    move-object v3, p1

    check-cast v3, Lexocr/base/ExBaseCardInfo;

    .line 126
    const-string v0, "vibrator"

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Vibrator;

    .line 127
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->a:[J

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 128
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
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_3

    .line 146
    goto :goto_0

    .line 130
    :catch_0
    move-exception v4

    .line 132
    const-string v0, "System services not available to Activities before onCreate() "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 146
    goto :goto_0

    .line 134
    :catch_1
    move-exception v4

    .line 136
    const-string v0, "Exception while cast to vibrate: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 146
    goto :goto_0

    .line 138
    :catch_2
    move-exception v4

    .line 140
    const-string v0, "Could not activate vibration feedback. Please add <uses-permission android:name=\"android.permission.VIBRATE\" /> to your application\'s manifest."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 146
    goto :goto_0

    .line 143
    :catch_3
    move-exception v4

    .line 145
    const-string v0, "onCardDetected() error: no class def found error"

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 148
    :goto_0
    invoke-virtual {v3}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 150
    iput-object v3, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    .line 151
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->a()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 152
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 154
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 156
    :cond_2
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b:Lexocr/base/ExBaseCardInfo;

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d(Landroid/graphics/Bitmap;)V

    .line 157
    invoke-direct {p0, p2, p3}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d(J)V

    .line 159
    :cond_3
    return-void
.end method

.method public b()V
    .locals 0

    .line 100
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->b()V

    .line 101
    return-void
.end method

.method public c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
    .locals 1

    .line 106
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivityHandler;

    invoke-direct {v0, p1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivityHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 69
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c()V

    .line 70
    sget v0, Lcom/huawei/base/R$id;->card_reco_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->g:Lo/emr;

    .line 71
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->g:Lo/emr;

    sget v1, Lcom/huawei/base/R$string;->wallet_camera_add_bankcard:I

    invoke-virtual {p0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 73
    return-void
.end method

.method public d()Landroid/os/Handler;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 216
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 56
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 57
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 59
    const-string v0, "event_callback_id"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d:Ljava/lang/String;

    .line 63
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 78
    invoke-super {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->onPause()V

    .line 79
    return-void
.end method
