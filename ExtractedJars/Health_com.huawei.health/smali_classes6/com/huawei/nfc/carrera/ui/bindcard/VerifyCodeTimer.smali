.class public Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field private static final HANDLER_TAG_COUNT_DOWN:I = 0x0

.field private static final TOTAL_TIME_SEC:I = 0x78


# instance fields
.field private final getVerifyCodeButton:Landroid/widget/TextView;

.field private final mContext:Landroid/content/Context;

.field private final mVerifyTip:Landroid/widget/TextView;

.field private remainTime:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 51
    const/16 v0, 0x78

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mContext:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    .line 57
    iput-object p3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mVerifyTip:Landroid/widget/TextView;

    .line 58
    return-void
.end method

.method private countDown()V
    .locals 6

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_count_down_seconds:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$color;->button_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 89
    const/4 v0, 0x0

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->sendEmptyMessageDelayed(IJ)Z

    .line 90
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 95
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 96
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    .line 98
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 100
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->stopTimer()V

    goto :goto_0

    .line 104
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->countDown()V

    .line 106
    :goto_0
    return-void
.end method

.method public startTimer()V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 66
    const/16 v0, 0x78

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->remainTime:I

    .line 67
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->countDown()V

    .line 68
    return-void
.end method

.method public stopTimer()V
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mVerifyTip:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_verify_phone_tip:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_get_verify_code:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$color;->button_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->getVerifyCodeButton:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 79
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/VerifyCodeTimer;->removeMessages(I)V

    .line 80
    return-void
.end method
