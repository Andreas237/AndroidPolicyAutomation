.class public Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/proxy/ProxySocketConnection;


# instance fields
.field private final proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/proxy/ProxyInfo;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    .line 39
    return-void
.end method

.method private static fill(Ljava/io/InputStream;[BI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 323
    const/4 v3, 0x0

    .line 324
    :goto_0
    if-ge v3, p2, :cond_1

    .line 326
    sub-int v0, p2, v3

    invoke-virtual {p0, p1, v3, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    .line 327
    if-gtz v4, :cond_0

    .line 329
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v2, "stream is closed"

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 332
    :cond_0
    add-int/2addr v3, v4

    .line 333
    goto :goto_0

    .line 334
    :cond_1
    return-void
.end method


# virtual methods
.method public connect(Ljava/net/Socket;Ljava/lang/String;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyAddress()Ljava/lang/String;

    move-result-object v6

    .line 47
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyPort()I

    move-result v7

    .line 48
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyUsername()Ljava/lang/String;

    move-result-object v8

    .line 49
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyPassword()Ljava/lang/String;

    move-result-object v9

    .line 53
    :try_start_0
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, v6, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    move-object/from16 v1, p1

    move/from16 v2, p4

    invoke-virtual {v1, v0, v2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 54
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 55
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    .line 57
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 59
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 60
    const/4 v11, 0x0

    .line 83
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x5

    const/4 v0, 0x0

    aput-byte v1, v10, v0

    .line 85
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x2

    const/4 v0, 0x1

    aput-byte v1, v10, v0

    .line 86
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x2

    aput-byte v1, v10, v0

    .line 87
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x2

    const/4 v0, 0x3

    aput-byte v1, v10, v0

    .line 89
    const/4 v0, 0x0

    invoke-virtual {v5, v10, v0, v11}, Ljava/io/OutputStream;->write([BII)V

    .line 102
    const/4 v0, 0x2

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v0, 0x1

    aget-byte v0, v10, v0

    and-int/lit16 v0, v0, 0xff

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 108
    :sswitch_0
    const/4 v12, 0x1

    .line 109
    goto/16 :goto_0

    .line 111
    :sswitch_1
    if-eqz v8, :cond_1

    if-nez v9, :cond_0

    .line 113
    goto/16 :goto_0

    .line 135
    :cond_0
    const/4 v11, 0x0

    .line 136
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x1

    const/4 v0, 0x0

    aput-byte v1, v10, v0

    .line 137
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    int-to-byte v1, v1

    const/4 v0, 0x1

    aput-byte v1, v10, v0

    .line 138
    const-string v0, "UTF-8"

    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v13

    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    .line 139
    const/4 v1, 0x0

    invoke-static {v13, v1, v10, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v11, v0, 0x2

    .line 142
    const-string v0, "UTF-8"

    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v14

    .line 143
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    array-length v1, v14

    int-to-byte v1, v1

    aput-byte v1, v10, v0

    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    .line 144
    const/4 v1, 0x0

    invoke-static {v14, v1, v10, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v11, v0

    .line 148
    const/4 v0, 0x0

    invoke-virtual {v5, v10, v0, v11}, Ljava/io/OutputStream;->write([BII)V

    .line 165
    const/4 v0, 0x2

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 166
    const/4 v0, 0x1

    aget-byte v0, v10, v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    if-nez v0, :cond_1

    .line 168
    const/4 v12, 0x1

    .line 174
    :cond_1
    :goto_0
    if-nez v12, :cond_2

    .line 178
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 183
    goto :goto_1

    .line 180
    :catch_0
    move-exception v13

    .line 182
    const-string v0, "Socks5ProxySocketConnection"

    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :goto_1
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v2, "fail in SOCKS5 proxy"

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 214
    :cond_2
    const/4 v11, 0x0

    .line 215
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x5

    const/4 v0, 0x0

    aput-byte v1, v10, v0

    .line 216
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x1

    const/4 v0, 0x1

    aput-byte v1, v10, v0

    .line 217
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x2

    aput-byte v1, v10, v0

    .line 219
    const-string v0, "UTF-8"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v13

    .line 220
    array-length v14, v13

    .line 221
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x3

    const/4 v0, 0x3

    aput-byte v1, v10, v0

    .line 222
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    int-to-byte v1, v14

    const/4 v0, 0x4

    aput-byte v1, v10, v0

    .line 223
    const/4 v0, 0x0

    invoke-static {v13, v0, v10, v11, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 224
    add-int/lit8 v11, v14, 0x5

    .line 225
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    ushr-int/lit8 v1, p3, 0x8

    int-to-byte v1, v1

    aput-byte v1, v10, v0

    .line 226
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    move/from16 v1, p3

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v10, v0

    .line 228
    const/4 v0, 0x0

    invoke-virtual {v5, v10, v0, v11}, Ljava/io/OutputStream;->write([BII)V

    .line 266
    const/4 v0, 0x4

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 268
    const/4 v0, 0x1

    aget-byte v0, v10, v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v0, :cond_3

    .line 272
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 277
    goto :goto_2

    .line 274
    :catch_1
    move-exception v15

    .line 276
    const-string v0, "Socks5ProxySocketConnection"

    :try_start_4
    invoke-virtual {v15}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    :goto_2
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS5:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "server returns "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v3, v10, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 282
    :cond_3
    const/4 v0, 0x3

    aget-byte v0, v10, v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto :goto_3

    .line 286
    :pswitch_0
    const/4 v0, 0x6

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 287
    goto :goto_3

    .line 290
    :pswitch_1
    const/4 v0, 0x1

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 292
    const/4 v0, 0x0

    aget-byte v0, v10, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v0, v0, 0x2

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V

    .line 293
    goto :goto_3

    .line 296
    :pswitch_2
    const/16 v0, 0x12

    invoke-static {v4, v10, v0}, Lorg/jivesoftware/smack/proxy/Socks5ProxySocketConnection;->fill(Ljava/io/InputStream;[BI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 297
    .line 317
    :goto_3
    :pswitch_3
    goto :goto_5

    .line 301
    :catch_2
    move-exception v10

    .line 303
    throw v10

    .line 305
    :catch_3
    move-exception v10

    .line 309
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 314
    goto :goto_4

    .line 311
    :catch_4
    move-exception v11

    .line 313
    const-string v0, "Socks5ProxySocketConnection"

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    :goto_4
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v10}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 318
    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
