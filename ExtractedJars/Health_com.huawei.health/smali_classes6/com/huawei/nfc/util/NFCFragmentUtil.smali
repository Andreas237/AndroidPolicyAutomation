.class public Lcom/huawei/nfc/util/NFCFragmentUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NFC_SHOW_CARRERA:I = 0x2

.field public static final NFC_SHOW_NOT_SUPPORT:I = 0x0


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getNFCShowPlan(Landroid/content/Context;)I
    .locals 5

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {p0}, Lcom/huawei/nfc/util/NFCFragmentUtil;->isPhoneSupportNFC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    const-string v0, "getNFCShowPlan, The phone is not support nfc."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 46
    return v2

    .line 49
    :cond_0
    invoke-static {}, Lcom/huawei/wallet/utils/ProductConfigUtil;->b()[Ljava/lang/String;

    move-result-object v3

    .line 50
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    array-length v0, v3

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 52
    :cond_1
    const-string v0, "getNFCShowPlan, no product config exist."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 53
    return v2

    .line 57
    :cond_2
    const/4 v4, 0x0

    .line 58
    const-string v0, "01"

    const/4 v1, 0x0

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    const/4 v4, 0x1

    .line 63
    :cond_3
    if-nez v4, :cond_4

    .line 65
    const-string v0, "getNFCShowPlan, do not support ese."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 66
    return v2

    .line 69
    :cond_4
    array-length v0, v3

    const/4 v1, 0x4

    if-le v0, v1, :cond_5

    const-string v0, "01"

    const/4 v1, 0x3

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "02"

    const/4 v1, 0x4

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 71
    const-string v0, "getNFCShowPlan, config fits carrera."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 72
    const-string v0, "getNFCShowPlan, carrera show plan."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 73
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->enableNFCOffHostService(Landroid/content/Context;)V

    .line 74
    const/4 v2, 0x2

    .line 77
    :cond_5
    return v2
.end method

.method public static isPhoneSupportNFC(Landroid/content/Context;)Z
    .locals 2

    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.nfc"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isPhoneSupportShutdownSwipe()Z
    .locals 2

    .line 99
    const/4 v1, 0x0

    .line 115
    return v1
.end method
