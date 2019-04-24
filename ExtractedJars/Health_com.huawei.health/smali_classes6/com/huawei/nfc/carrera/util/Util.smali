.class public Lcom/huawei/nfc/carrera/util/Util;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CHAOS_UUID:Ljava/lang/String; = "chaos_uuid"

.field public static final SECTION_1:Ljava/lang/String; = "5c"

.field public static final SECTION_4:Ljava/lang/String; = "58"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static aesDecryptString(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 56
    invoke-static {p1}, Lcom/huawei/nfc/carrera/util/Util;->getUUIDky(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/Util;->getStringDecryptAES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static aesEncryptString(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 105
    invoke-static {p1}, Lcom/huawei/nfc/carrera/util/Util;->getUUIDky(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/Util;->getStringEncryptAES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAESKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 116
    invoke-static {p0}, Lcom/huawei/nfc/carrera/util/Util;->isNullorEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 118
    :cond_0
    const-string v0, "key is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 119
    return-object p0

    .line 123
    :cond_1
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStringDecryptAES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 88
    invoke-static {p1}, Lcom/huawei/nfc/carrera/util/Util;->getAESKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    :cond_0
    const-string v0, "aesKey is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/wallet/utils/crypto/AES;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStringEncryptAES(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 69
    invoke-static {p1}, Lcom/huawei/nfc/carrera/util/Util;->getAESKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    :cond_0
    const-string v0, "aesKey is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/wallet/utils/crypto/AES;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getUUIDky(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 138
    invoke-static {p0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "chaos_uuid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 139
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-static {}, Lcom/huawei/wallet/utils/device/PhoneDeviceUtil;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 144
    invoke-static {p0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "chaos_uuid"

    invoke-virtual {v0, v1, v3}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 147
    :cond_0
    const/4 v0, 0x5

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "5c"

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "c5"

    .line 148
    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6A"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "58"

    .line 149
    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/util/Util;->recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isNull(Ljava/lang/Object;)Z
    .locals 1

    .line 35
    if-nez p0, :cond_0

    .line 36
    const/4 v0, 0x1

    return v0

    .line 37
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isNullorEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 43
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 45
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static recycleLeftMoveBit(Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    .line 162
    const/4 v3, 0x0

    .line 163
    if-eqz p0, :cond_0

    const/16 v0, 0x8

    if-lt p1, v0, :cond_1

    .line 165
    :cond_0
    return-object p0

    .line 168
    :cond_1
    const/4 v4, 0x0

    .line 169
    invoke-static {p0}, Lcom/huawei/wallet/utils/crypto/AES;->e(Ljava/lang/String;)[B

    move-result-object v4

    .line 171
    if-nez v4, :cond_2

    .line 173
    return-object p0

    .line 176
    :cond_2
    array-length v5, v4

    .line 177
    new-array v6, v5, [B

    .line 178
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_3

    .line 184
    aget-byte v0, v4, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, p1

    aget-byte v1, v4, v7

    and-int/lit16 v1, v1, 0xff

    rsub-int/lit8 v2, p1, 0x8

    ushr-int/2addr v1, v2

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    .line 178
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 186
    :cond_3
    invoke-static {v6}, Lcom/huawei/wallet/utils/crypto/AES;->a([B)Ljava/lang/String;

    move-result-object v3

    .line 188
    return-object v3
.end method
