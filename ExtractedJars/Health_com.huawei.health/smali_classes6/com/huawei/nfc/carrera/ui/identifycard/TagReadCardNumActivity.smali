.class public Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;
.super Lcom/huawei/pay/ui/baseactivity/BaseActivity;
.source "SourceFile"


# static fields
.field public static final EXTRA_READ_RESULT_CARD_NUMBER:Ljava/lang/String; = "nfc_tag_read_card_result_card_number"

.field public static final EXTRA_READ_RESULT_VALIDITY:Ljava/lang/String; = "nfc_tag_read_card_result_validity"


# instance fields
.field private final TAG:Ljava/lang/String;

.field intentFilter:[Landroid/content/IntentFilter;

.field private nfcAdapter:Landroid/nfc/NfcAdapter;

.field private nfcReadCardNumberImageCard:Landroid/widget/ImageView;

.field private nfcReadCardNumberImagePhone:Landroid/widget/ImageView;

.field pendingIntent:Landroid/app/PendingIntent;

.field techList:[[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;-><init>()V

    .line 40
    const-string v0, "CardReaderActivity"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->TAG:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->pendingIntent:Landroid/app/PendingIntent;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->intentFilter:[Landroid/content/IntentFilter;

    .line 56
    const/4 v0, 0x0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->techList:[[Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showReadCardAnimationBack()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showReadCardAnimation()V

    return-void
.end method

.method private completed(Ljava/lang/String;)V
    .locals 3

    .line 196
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 197
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lo/dtj;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 198
    const-string v0, "nfc_tag_read_card_result_card_number"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->setResult(ILandroid/content/Intent;)V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->finish()V

    .line 201
    return-void
.end method

.method private readCardNumber(Landroid/content/Intent;)V
    .locals 3

    .line 148
    invoke-static {p1}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->a(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    .line 149
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 151
    const-string v0, "CardReaderActivity"

    const-string v1, "onNewIntent.number is null"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 155
    :cond_0
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->completed(Ljava/lang/String;)V

    .line 157
    :goto_0
    return-void
.end method

.method private showReadCardAnimation()V
    .locals 15

    .line 209
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 211
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x42500000    # 52.0f

    const/4 v2, 0x0

    const/high16 v3, -0x3e600000    # -20.0f

    invoke-direct {v10, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 213
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3f866666    # 1.05f

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f866666    # 1.05f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v11, v0

    .line 216
    invoke-virtual {v9, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 217
    invoke-virtual {v9, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 218
    const-wide/16 v0, 0x1f4

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 219
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 221
    new-instance v0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V

    invoke-virtual {v10, v0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 246
    new-instance v12, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 248
    new-instance v13, Landroid/view/animation/TranslateAnimation;

    const/4 v0, 0x0

    const/high16 v1, -0x3e000000    # -32.0f

    const/4 v2, 0x0

    const/high16 v3, 0x41000000    # 8.0f

    invoke-direct {v13, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 250
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3f733333    # 0.95f

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f733333    # 0.95f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v14, v0

    .line 253
    invoke-virtual {v12, v13}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 254
    invoke-virtual {v12, v14}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 255
    const-wide/16 v0, 0x1f4

    invoke-virtual {v12, v0, v1}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 256
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImageCard:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImagePhone:Landroid/widget/ImageView;

    invoke-virtual {v0, v12}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 260
    return-void
.end method

.method private showReadCardAnimationBack()V
    .locals 15

    .line 268
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 269
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/high16 v0, 0x42500000    # 52.0f

    const/4 v1, 0x0

    const/high16 v2, -0x3e600000    # -20.0f

    const/4 v3, 0x0

    invoke-direct {v10, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 270
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const v1, 0x3f866666    # 1.05f

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3f866666    # 1.05f

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v11, v0

    .line 273
    invoke-virtual {v9, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 274
    invoke-virtual {v9, v11}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 275
    const-wide/16 v0, 0x1f4

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/AnimationSet;->setStartOffset(J)V

    .line 276
    const-wide/16 v0, 0x1f4

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 277
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 279
    new-instance v0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;)V

    invoke-virtual {v10, v0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 304
    new-instance v12, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 305
    new-instance v13, Landroid/view/animation/TranslateAnimation;

    const/high16 v0, -0x3e000000    # -32.0f

    const/4 v1, 0x0

    const/high16 v2, 0x41000000    # 8.0f

    const/4 v3, 0x0

    invoke-direct {v13, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 306
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const v1, 0x3f733333    # 0.95f

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3f733333    # 0.95f

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    move-object v14, v0

    .line 309
    invoke-virtual {v12, v13}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 310
    invoke-virtual {v12, v14}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 311
    const-wide/16 v0, 0x1f4

    invoke-virtual {v12, v0, v1}, Landroid/view/animation/AnimationSet;->setStartOffset(J)V

    .line 312
    const-wide/16 v0, 0x1f4

    invoke-virtual {v12, v0, v1}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 313
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 315
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImageCard:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImagePhone:Landroid/widget/ImageView;

    invoke-virtual {v0, v12}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 317
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 61
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->setRequestedOrientation(I)V

    .line 63
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_tag_read_card_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->setContentView(I)V

    .line 64
    sget v0, Lcom/huawei/wallet/R$string;->nfc_read_card_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showHead(I)V

    .line 65
    sget v0, Lcom/huawei/wallet/R$id;->nfc_read_card_number_image_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImageCard:Landroid/widget/ImageView;

    .line 66
    sget v0, Lcom/huawei/wallet/R$id;->nfc_read_card_number_image_phone:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcReadCardNumberImagePhone:Landroid/widget/ImageView;

    .line 68
    const-string v0, "CardReaderActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v0, Landroid/content/Intent;

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    .line 77
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->pendingIntent:Landroid/app/PendingIntent;

    .line 85
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 88
    const-string v0, "*/*"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addDataType(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/IntentFilter$MalformedMimeTypeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 90
    :catch_0
    move-exception v5

    .line 92
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

    .line 95
    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/IntentFilter;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->intentFilter:[Landroid/content/IntentFilter;

    .line 127
    const/4 v0, 0x1

    new-array v0, v0, [[Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-class v2, Landroid/nfc/tech/IsoDep;

    .line 129
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->techList:[[Ljava/lang/String;

    .line 131
    invoke-static {p0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    .line 132
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 137
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 138
    const-string v0, "CardReaderActivity"

    const-string v1, "onNewIntent"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 140
    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->readCardNumber(Landroid/content/Intent;)V

    .line 144
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 162
    invoke-super {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onPause()V

    .line 164
    const-string v0, "CardReaderActivity"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    invoke-virtual {v0, p0}, Landroid/nfc/NfcAdapter;->disableForegroundDispatch(Landroid/app/Activity;)V

    .line 172
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 177
    invoke-super {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onResume()V

    .line 179
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->showReadCardAnimation()V

    .line 181
    const-string v0, "CardReaderActivity"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->nfcAdapter:Landroid/nfc/NfcAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->pendingIntent:Landroid/app/PendingIntent;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->intentFilter:[Landroid/content/IntentFilter;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/identifycard/TagReadCardNumActivity;->techList:[[Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2, v3}, Landroid/nfc/NfcAdapter;->enableForegroundDispatch(Landroid/app/Activity;Landroid/app/PendingIntent;[Landroid/content/IntentFilter;[[Ljava/lang/String;)V

    .line 190
    :cond_0
    return-void
.end method
