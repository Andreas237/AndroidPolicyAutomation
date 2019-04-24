.class public Lcom/huawei/hwid/core/encrypt/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 38
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "DA15F35E"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "2994807A3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "248CCA91412"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "562."

    .line 39
    invoke-static {v1}, Lcom/huawei/hwid/core/d/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 40
    const-string v3, ""

    .line 42
    :try_start_0
    invoke-static {v2}, Lcom/huawei/hwid/core/d/b;->d(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/huawei/hwid/core/encrypt/AES128_ECB_HEX;->decode(Ljava/lang/String;[BI)[B

    move-result-object v4

    .line 43
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 44
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v3, v0

    .line 45
    const/4 v0, 0x0

    invoke-static {v4, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_5

    .line 46
    return-object v3

    .line 60
    :cond_0
    goto :goto_0

    .line 48
    :catch_0
    move-exception v4

    .line 49
    const-string v0, "HwIDEncrypter"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 50
    :catch_1
    move-exception v4

    .line 51
    const-string v0, "HwIDEncrypter"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 52
    :catch_2
    move-exception v4

    .line 53
    const-string v0, "HwIDEncrypter"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 54
    :catch_3
    move-exception v4

    .line 55
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 56
    :catch_4
    move-exception v4

    .line 57
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 58
    :catch_5
    move-exception v4

    .line 59
    const-string v0, "HwIDEncrypter"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 66
    :cond_1
    return-object v3
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 132
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "DA15F35E"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "2994807A3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "248CCA91412"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "562."

    .line 133
    invoke-static {v1}, Lcom/huawei/hwid/core/d/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 134
    const/4 v3, 0x0

    .line 136
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->d(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v2}, Lcom/huawei/hwid/core/d/b;->b(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/encrypt/c;->a([B[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v0

    move-object v3, v0

    .line 149
    goto :goto_0

    .line 137
    :catch_0
    move-exception v4

    .line 138
    const-string v0, "HwIDEncrypter"

    const-string v1, "InvalidKeyException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    goto :goto_0

    .line 139
    :catch_1
    move-exception v4

    .line 140
    const-string v0, "HwIDEncrypter"

    const-string v1, "BadPaddingException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    goto :goto_0

    .line 141
    :catch_2
    move-exception v4

    .line 142
    const-string v0, "HwIDEncrypter"

    const-string v1, "IllegalBlockSizeException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    goto :goto_0

    .line 143
    :catch_3
    move-exception v4

    .line 144
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchAlgorithmException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    goto :goto_0

    .line 145
    :catch_4
    move-exception v4

    .line 146
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchPaddingException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    goto :goto_0

    .line 147
    :catch_5
    move-exception v4

    .line 148
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchPaddingException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :goto_0
    return-object v3
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .line 78
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/a;->a(Landroid/content/Context;)V

    .line 79
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 88
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hwidsdk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/hwid/core/encrypt/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 91
    :cond_0
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 103
    const-string v0, "encryptversion"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 104
    const/4 v3, 0x3

    .line 106
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 109
    goto :goto_0

    .line 107
    :catch_0
    move-exception v4

    .line 108
    const-string v0, "HwIDEncrypter"

    const-string v1, "get version of encrypted is null, use GRADE_VERSION_KEYSTORE directory"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_0
    const/4 v4, 0x0

    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x3

    if-lt v3, v0, :cond_0

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hwidsdk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/hwid/core/encrypt/f;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 115
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_1
    return-object v4
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 162
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "DA15F35E"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "2994807A3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "248CCA91412"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "562."

    .line 163
    invoke-static {v1}, Lcom/huawei/hwid/core/d/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 164
    const-string v3, ""

    .line 166
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 167
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 168
    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_6

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    return-object v3

    .line 171
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    aget-object v5, v4, v0

    .line 172
    const/4 v0, 0x1

    aget-object p1, v4, v0

    .line 173
    invoke-static {v2}, Lcom/huawei/hwid/core/d/b;->d(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p1, v5, v0}, Lcom/huawei/hwid/core/encrypt/c;->a(Ljava/lang/String;Ljava/lang/String;[B)[B

    move-result-object v6

    .line 174
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 175
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v3, v0

    .line 176
    const/4 v0, 0x0

    invoke-static {v6, v0}, Ljava/util/Arrays;->fill([BB)V
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_6

    .line 192
    :cond_2
    goto :goto_0

    .line 178
    :catch_0
    move-exception v4

    .line 179
    const-string v0, "HwIDEncrypter"

    const-string v1, "InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 180
    :catch_1
    move-exception v4

    .line 181
    const-string v0, "HwIDEncrypter"

    const-string v1, "BadPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 182
    :catch_2
    move-exception v4

    .line 183
    const-string v0, "HwIDEncrypter"

    const-string v1, "IllegalBlockSizeException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 184
    :catch_3
    move-exception v4

    .line 185
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 186
    :catch_4
    move-exception v4

    .line 187
    const-string v0, "HwIDEncrypter"

    const-string v1, "NoSuchPaddingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 188
    :catch_5
    move-exception v4

    .line 189
    const-string v0, "HwIDEncrypter"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 190
    :catch_6
    move-exception v4

    .line 191
    const-string v0, "HwIDEncrypter"

    const-string v1, "InvalidAlgorithmParameterException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :goto_0
    return-object v3
.end method
