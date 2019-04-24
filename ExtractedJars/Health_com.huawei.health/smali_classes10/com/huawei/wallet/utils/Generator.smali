.class public final Lcom/huawei/wallet/utils/Generator;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 6

    .line 19
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 21
    const v0, 0x989680

    invoke-virtual {v4, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    const v1, 0x989680

    add-int/2addr v0, v1

    const v1, 0x989680

    rem-int v5, v0, v1

    .line 22
    const v0, 0xf4240

    if-ge v5, v0, :cond_0

    .line 24
    const v0, 0xf4240

    add-int/2addr v5, v0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    const-string v2, "yyyyMMddHHmmssSSS"

    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/TimeUtil;->d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
