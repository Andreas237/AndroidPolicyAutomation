.class public final Lcom/huawei/nfc/carrera/util/NfcUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final BUILD_TIME:J = 0x582d2b40L

.field public static final SELECT_DEFAULT_CARD_EMULATION_SE:I = 0x1

.field public static final SELECT_DEFAULT_CARD_EMULATION_UICC:I = -0x1

.field public static final SELECT_DEFAULT_CARD_EMULATION_UNKNOWN:I = 0x0


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableNFC(Landroid/content/Context;)Z
    .locals 5

    .line 190
    :try_start_0
    invoke-static {p0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v3

    .line 192
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 194
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "enable"

    const/4 v2, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 199
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    return v0

    .line 202
    :catch_0
    move-exception v3

    .line 204
    const-string v0, "enabledNFC NoSuchMethodException."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 217
    goto :goto_0

    .line 206
    :catch_1
    move-exception v3

    .line 208
    const-string v0, "enabledNFC IllegalAccessException."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 217
    goto :goto_0

    .line 210
    :catch_2
    move-exception v3

    .line 212
    const-string v0, "enabledNFC IllegalArgumentException."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 217
    goto :goto_0

    .line 214
    :catch_3
    move-exception v3

    .line 216
    const-string v0, "enabledNFC InvocationTargetException."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 219
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static enableNFCOffHostService(Landroid/content/Context;)V
    .locals 0

    .line 302
    return-void
.end method

.method public static hasFieldOffBroadcast()Z
    .locals 3

    .line 306
    invoke-static {}, Lcom/huawei/wallet/utils/device/PhoneDeviceUtil;->b()Ljava/lang/String;

    move-result-object v2

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hasFieldOffBroadcast, deviceType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 308
    const-string v0, "CRR"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 310
    const/4 v0, 0x0

    return v0

    .line 314
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static isCurrentDefaultPayService(Landroid/content/Context;)Z
    .locals 1

    .line 282
    const/4 v0, 0x0

    return v0
.end method

.method public static isDevicesNeedPowerOn()Z
    .locals 7

    .line 258
    invoke-static {}, Lcom/huawei/wallet/utils/device/PhoneDeviceUtil;->b()Ljava/lang/String;

    move-result-object v4

    .line 260
    sget-wide v0, Landroid/os/Build;->TIME:J

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isDevicesNeedPowerOn, deviceType and build time : deviceType  is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",build time is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 263
    const-string v0, "KNT"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "FRD"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 265
    :cond_0
    const-wide/32 v0, 0x582d2b40

    cmp-long v0, v5, v0

    if-ltz v0, :cond_1

    .line 267
    const/4 v0, 0x1

    return v0

    .line 271
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 276
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static isEnabledNFC(Landroid/content/Context;)Z
    .locals 3

    .line 46
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 48
    const/4 v0, 0x0

    return v0

    .line 51
    :cond_0
    const-string v0, "nfc"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/nfc/NfcManager;

    .line 52
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 54
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_1
    invoke-virtual {v1}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 61
    const/4 v0, 0x1

    return v0

    .line 64
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isMatchPayCondition(Landroid/content/Context;)Z
    .locals 2

    .line 159
    invoke-static {p0}, Lcom/huawei/nfc/util/NFCFragmentUtil;->getNFCShowPlan(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 161
    const-string v0, "isMatchPayCondition not CARRERA plan"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 162
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_0
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 167
    const-string v0, "isMatchPayCondition nfc not support or not enabled"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 168
    const/4 v0, 0x0

    return v0

    .line 171
    :cond_1
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isSelectSE(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    .line 173
    const-string v0, "isMatchPayCondition not select SE"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 174
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_2
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isCurrentDefaultPayService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 179
    const-string v0, "isMatchPayCondition huawei pay not default pay service"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 180
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public static isSelectSE(Landroid/content/Context;)I
    .locals 1

    .line 75
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->selectOrCheckSE(Landroid/content/Context;Z)I

    move-result v0

    return v0
.end method

.method public static isSupportNFCSwipe(Landroid/content/Context;)Z
    .locals 5

    .line 228
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v2

    .line 231
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isCurrentDefaultPayService(Landroid/content/Context;)Z

    move-result v3

    .line 233
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isSelectSE(Landroid/content/Context;)I

    move-result v4

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isNFCOpen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,isDefaultPayService: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,isSelectSE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 237
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    if-ne v0, v4, :cond_0

    .line 239
    const-string v0, "NFCSwipe isSupported"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 240
    const/4 v0, 0x1

    return v0

    .line 243
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static selectOrCheckSE(Landroid/content/Context;Z)I
    .locals 9

    .line 98
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x2

    .line 103
    const-string v0, "com.huawei.android.nfc.NfcAdapterCustEx"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 104
    if-eqz p1, :cond_1

    .line 106
    const-string v0, "getSelectedCardEmulation"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/content/Context;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 108
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 110
    const/4 v0, 0x2

    if-ne v0, v8, :cond_0

    .line 112
    const/4 v4, 0x1

    goto :goto_0

    .line 116
    :cond_0
    const/4 v4, -0x1

    .line 118
    :goto_0
    goto :goto_1

    .line 121
    :cond_1
    const-string v0, "selectCardEmulation"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/content/Context;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 123
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    .line 124
    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 123
    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 147
    :goto_1
    goto :goto_2

    .line 128
    :catch_0
    move-exception v6

    .line 130
    const-string v0, "isSelectSE ClassNotFoundException"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    goto :goto_2

    .line 132
    :catch_1
    move-exception v6

    .line 134
    const-string v0, "isSelectSE NoSuchMethodException"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    goto :goto_2

    .line 136
    :catch_2
    move-exception v6

    .line 138
    const-string v0, "isSelectSE IllegalAccessException"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    goto :goto_2

    .line 140
    :catch_3
    move-exception v6

    .line 142
    const-string v0, "isSelectSE IllegalArgumentException"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    goto :goto_2

    .line 144
    :catch_4
    move-exception v6

    .line 146
    const-string v0, "isSelectSE InvocationTargetException"

    invoke-static {v0, v6}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    :goto_2
    return v4
.end method

.method public static selectSE(Landroid/content/Context;)V
    .locals 1

    .line 86
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->selectOrCheckSE(Landroid/content/Context;Z)I

    .line 87
    return-void
.end method

.method public static setDefaultPayService(Landroid/app/Activity;)V
    .locals 1

    .line 292
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 294
    return-void

    .line 297
    :cond_0
    return-void
.end method
