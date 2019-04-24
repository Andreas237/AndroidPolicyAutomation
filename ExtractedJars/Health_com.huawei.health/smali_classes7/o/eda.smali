.class public final Lo/eda;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 220
    const-string v0, "RSA256"

    invoke-static {p0, p1, p2, v0}, Lo/eda;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 233
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    const-string v0, "publicKey is null or empty."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 236
    const/4 v0, 0x0

    return v0

    .line 239
    :cond_0
    const-string v2, "SHA256WithRSA"

    .line 242
    const-string v0, "RSA"

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v3

    .line 243
    invoke-static {p2}, Lcom/huawei/wallet/utils/crypto/Base64;->c(Ljava/lang/String;)[B

    move-result-object v4

    .line 244
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, v4}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v3, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v5

    .line 246
    invoke-static {v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v6

    .line 248
    invoke-virtual {v6, v5}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 249
    const-string v0, "utf-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/security/Signature;->update([B)V

    .line 251
    invoke-static {p1}, Lcom/huawei/wallet/utils/crypto/Base64;->c(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/security/Signature;->verify([B)Z
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_4

    move-result v7

    .line 252
    return v7

    .line 254
    :catch_0
    move-exception v3

    .line 256
    const-string v0, "NoSuchAlgorithmException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 273
    goto :goto_0

    .line 258
    :catch_1
    move-exception v3

    .line 260
    const-string v0, "InvalidKeySpecException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 273
    goto :goto_0

    .line 262
    :catch_2
    move-exception v3

    .line 264
    const-string v0, "InvalidKeyException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 273
    goto :goto_0

    .line 266
    :catch_3
    move-exception v3

    .line 268
    const-string v0, "SignatureException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 273
    goto :goto_0

    .line 270
    :catch_4
    move-exception v3

    .line 272
    const-string v0, "UnsupportedEncodingException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 275
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
