.class public Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/nfc/NfcAdapter;

.field private c:Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;


# direct methods
.method static synthetic a(Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->c:Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->e(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    .line 242
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 245
    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    invoke-static {p1}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->a(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v3

    .line 248
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 250
    const-string v0, "onNewIntent.number is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 251
    const/4 v0, 0x0

    return-object v0

    .line 255
    :cond_0
    const-string v0, "mCardIdentifyCallBack call back card info"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 256
    return-object v3

    .line 261
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 266
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 3

    .line 88
    const/4 v2, 0x0

    .line 89
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->b:Landroid/nfc/NfcAdapter;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->b:Landroid/nfc/NfcAdapter;

    invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v2

    .line 93
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nfc function final is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 94
    return v2
.end method
