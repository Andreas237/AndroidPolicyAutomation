.class public Lcom/huawei/wallet/logic/tlv/TlvParserUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;)Ljava/lang/String;
    .locals 7

    .line 18
    const-string v0, "00B2010C00"

    const-string v1, "57"

    invoke-static {p0, v0, v1}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->b(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 19
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 21
    return-object v2

    .line 24
    :cond_0
    sget-object v3, Lcom/huawei/wallet/logic/tlv/TlvConstant;->e:[Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 26
    const-string v0, "5A"

    invoke-static {p0, v6, v0}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->b(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 29
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    return-object v2
.end method

.method private static a(Ljava/lang/String;C)Ljava/lang/String;
    .locals 3

    .line 119
    add-int/lit8 v0, p1, 0x20

    int-to-char v1, v0

    .line 121
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 122
    const/4 v0, -0x1

    if-ne v0, v2, :cond_0

    .line 124
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 127
    :cond_0
    const/4 v0, -0x1

    if-ne v0, v2, :cond_1

    .line 129
    return-object p0

    .line 133
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 38
    const/4 v3, 0x0

    .line 39
    const-string v0, "android.nfc.extra.TAG"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/nfc/Tag;

    .line 40
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    const/4 v5, 0x0

    .line 47
    :try_start_0
    invoke-static {v4}, Landroid/nfc/tech/IsoDep;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/IsoDep;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 48
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 50
    const/4 v6, 0x0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 105
    :try_start_1
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 111
    :cond_1
    goto :goto_0

    .line 108
    :catch_0
    move-exception v7

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 50
    :goto_0
    return-object v6

    .line 53
    :cond_2
    :try_start_2
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->connect()V

    .line 55
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvConstant;->d:[B

    invoke-static {v0}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->a([B)[B

    move-result-object v6

    .line 56
    invoke-virtual {v5, v6}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    move-result-object v7

    .line 59
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-static {v7}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "9000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 61
    :cond_3
    const-string v0, "ppse not exist."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    const/4 v8, 0x0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 105
    :try_start_3
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 111
    :cond_4
    goto :goto_1

    .line 108
    :catch_1
    move-exception v9

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 62
    :goto_1
    return-object v8

    .line 65
    :cond_5
    const-string v0, "4F"

    :try_start_4
    invoke-static {v7, v0}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->e([BLjava/lang/String;)[B

    move-result-object v8

    .line 66
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    array-length v0, v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v0, :cond_8

    .line 68
    :cond_6
    const/4 v9, 0x0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    .line 105
    :try_start_5
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 111
    :cond_7
    goto :goto_2

    .line 108
    :catch_2
    move-exception v10

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 68
    :goto_2
    return-object v9

    .line 71
    :cond_8
    :try_start_6
    invoke-static {v8}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->a([B)[B

    move-result-object v9

    .line 73
    invoke-virtual {v5, v9}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    .line 75
    invoke-static {p1}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->c(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    move-result-object v10

    .line 77
    move-object/from16 v0, p2

    invoke-static {v10, v0}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->d([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 79
    const/4 v0, 0x0

    if-eq v0, v11, :cond_a

    .line 81
    const-string v0, "57"

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 83
    const/16 v0, 0x44

    invoke-static {v11, v0}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->a(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto :goto_3

    .line 87
    :cond_9
    const/16 v0, 0x46

    invoke-static {v11, v0}, Lcom/huawei/wallet/logic/tlv/TlvParserUtil;->a(Ljava/lang/String;C)Ljava/lang/String;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    move-object v3, v0

    .line 103
    :cond_a
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    .line 105
    :try_start_7
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 111
    :cond_b
    goto/16 :goto_5

    .line 108
    :catch_3
    move-exception v6

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    goto/16 :goto_5

    .line 91
    :catch_4
    move-exception v6

    .line 93
    const-string v0, "CardReaderActivity"

    :try_start_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_c

    .line 105
    :try_start_9
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 111
    :cond_c
    goto/16 :goto_5

    .line 108
    :catch_5
    move-exception v6

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    goto/16 :goto_5

    .line 95
    :catch_6
    move-exception v6

    .line 97
    const-string v0, "CardReaderActivity"

    :try_start_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_d

    .line 105
    :try_start_b
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    .line 111
    :cond_d
    goto :goto_5

    .line 108
    :catch_7
    move-exception v6

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    goto :goto_5

    .line 101
    :catchall_0
    move-exception v12

    .line 103
    const/4 v0, 0x0

    if-eq v0, v5, :cond_e

    .line 105
    :try_start_c
    invoke-virtual {v5}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8

    .line 111
    :cond_e
    goto :goto_4

    .line 108
    :catch_8
    move-exception v13

    .line 110
    const-string v0, "CardReaderActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    :goto_4
    throw v12

    .line 114
    :goto_5
    return-object v3
.end method

.method public static d([BLjava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 145
    move-object v2, p0

    .line 146
    new-instance v3, Lcom/huawei/wallet/logic/tlv/TlvParser;

    invoke-direct {v3}, Lcom/huawei/wallet/logic/tlv/TlvParser;-><init>()V

    .line 147
    array-length v0, v2

    const/4 v1, 0x0

    invoke-virtual {v3, v2, v1, v0}, Lcom/huawei/wallet/logic/tlv/TlvParser;->c([BII)Lcom/huawei/wallet/logic/tlv/Tlvs;

    move-result-object v4

    .line 149
    new-instance v5, Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-direct {v5, p1}, Lcom/huawei/wallet/logic/tlv/TlvTag;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {v4, v5}, Lcom/huawei/wallet/logic/tlv/Tlvs;->d(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v6

    .line 151
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 153
    invoke-virtual {v6}, Lcom/huawei/wallet/logic/tlv/Tlv;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 157
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e([BLjava/lang/String;)[B
    .locals 7

    .line 169
    move-object v2, p0

    .line 170
    new-instance v3, Lcom/huawei/wallet/logic/tlv/TlvParser;

    invoke-direct {v3}, Lcom/huawei/wallet/logic/tlv/TlvParser;-><init>()V

    .line 171
    array-length v0, v2

    const/4 v1, 0x0

    invoke-virtual {v3, v2, v1, v0}, Lcom/huawei/wallet/logic/tlv/TlvParser;->c([BII)Lcom/huawei/wallet/logic/tlv/Tlvs;

    move-result-object v4

    .line 173
    new-instance v5, Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-direct {v5, p1}, Lcom/huawei/wallet/logic/tlv/TlvTag;-><init>(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v4, v5}, Lcom/huawei/wallet/logic/tlv/Tlvs;->d(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v6

    .line 175
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 177
    invoke-virtual {v6}, Lcom/huawei/wallet/logic/tlv/Tlv;->e()[B

    move-result-object v0

    return-object v0

    .line 181
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
