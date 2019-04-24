.class public Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Landroid/widget/TextView;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->a:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->b:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->d()V

    return-void
.end method

.method private c()V
    .locals 2

    .line 89
    sget v0, Lcom/huawei/android/sns/R$id;->qr_result_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->b:Landroid/widget/TextView;

    .line 91
    sget v0, Lcom/huawei/android/sns/R$id;->btn_copy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->e:Landroid/widget/ImageView;

    .line 92
    sget v0, Lcom/huawei/android/sns/R$id;->btn_browser:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->d:Landroid/widget/ImageView;

    .line 94
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->d:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$1;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->e:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty$4;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->a:Z

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_next_group:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_next_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 116
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 3

    .line 69
    if-eqz p1, :cond_2

    .line 70
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 71
    if-nez v2, :cond_0

    .line 72
    return-void

    .line 74
    :cond_0
    const-string v0, "isUrl"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    const-string v0, "isUrl"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->a:Z

    .line 78
    :cond_1
    const-string v0, "qrContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 79
    const-string v0, "qrContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c:Ljava/lang/String;

    .line 82
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->a:Z

    return v0
.end method

.method private d()V
    .locals 4

    .line 122
    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/ClipboardManager;

    .line 123
    const-string v0, "label"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    .line 124
    invoke-virtual {v2, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 125
    sget v0, Lcom/huawei/android/sns/R$string;->sns_already_copied:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 126
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;)Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 55
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_qr_text_url:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->setContentView(I)V

    .line 58
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 59
    :catch_0
    move-exception v2

    .line 60
    const-string v0, "HealthQRTextUrlActivty"

    const-string v1, "QRTextUrlActivity get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;->c()V

    .line 63
    return-void
.end method
