.class public abstract Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"


# static fields
.field public static final REQUEST_CODE_NFC_TAG:I = 0x1

.field private static final TAG:Ljava/lang/String;


# instance fields
.field intentFilter:[Landroid/content/IntentFilter;

.field private nfcAdapter:Landroid/nfc/NfcAdapter;

.field pendingIntent:Landroid/app/PendingIntent;

.field techList:[[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->pendingIntent:Landroid/app/PendingIntent;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->intentFilter:[Landroid/content/IntentFilter;

    .line 34
    const/4 v0, 0x0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->techList:[[Ljava/lang/String;

    return-void
.end method

.method private init()V
    .locals 6

    .line 56
    new-instance v0, Landroid/content/Intent;

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    .line 56
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->pendingIntent:Landroid/app/PendingIntent;

    .line 64
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 67
    const-string v0, "*/*"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addDataType(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentFilter$MalformedMimeTypeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 69
    :catch_0
    move-exception v5

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fail : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 74
    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/IntentFilter;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->intentFilter:[Landroid/content/IntentFilter;

    .line 106
    const/4 v0, 0x1

    new-array v0, v0, [[Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-class v2, Landroid/nfc/tech/IsoDep;

    .line 108
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->techList:[[Ljava/lang/String;

    .line 110
    invoke-static {p0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    .line 111
    return-void
.end method

.method private readCardNumber(Landroid/content/Intent;)V
    .locals 3

    .line 127
    invoke-static {p1}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->a(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    .line 128
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 130
    sget-object v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->TAG:Ljava/lang/String;

    const-string v1, "onNewIntent.number is null"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    return-void

    .line 134
    :cond_0
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->getBankNumber(Ljava/lang/String;)V

    .line 135
    return-void
.end method


# virtual methods
.method protected abstract getBankNumber(Ljava/lang/String;)V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 39
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->setRequestedOrientation(I)V

    .line 41
    sget v0, Lcom/huawei/wallet/R$string;->nfc_input_card_num_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->setTitle(I)V

    .line 42
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->init()V

    .line 45
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 172
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 174
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->setResult(I)V

    .line 176
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 116
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 117
    sget-object v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->TAG:Ljava/lang/String;

    const-string v1, "onNewIntent"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 119
    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->readCardNumber(Landroid/content/Intent;)V

    .line 123
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 156
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onPause()V

    .line 158
    sget-object v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->TAG:Ljava/lang/String;

    const-string v1, "onPause"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    invoke-virtual {v0, p0}, Landroid/nfc/NfcAdapter;->disableForegroundDispatch(Landroid/app/Activity;)V

    .line 166
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 140
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onResume()V

    .line 142
    sget-object v0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->TAG:Ljava/lang/String;

    const-string v1, "onResume"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->pendingIntent:Landroid/app/PendingIntent;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->intentFilter:[Landroid/content/IntentFilter;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/identifycard/CardReaderBaseActivity;->techList:[[Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2, v3}, Landroid/nfc/NfcAdapter;->enableForegroundDispatch(Landroid/app/Activity;Landroid/app/PendingIntent;[Landroid/content/IntentFilter;[[Ljava/lang/String;)V

    .line 151
    :cond_0
    return-void
.end method
