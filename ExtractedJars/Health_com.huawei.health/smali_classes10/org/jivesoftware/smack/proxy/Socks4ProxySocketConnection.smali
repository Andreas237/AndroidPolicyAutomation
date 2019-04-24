.class public Lorg/jivesoftware/smack/proxy/Socks4ProxySocketConnection;
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
    iput-object p1, p0, Lorg/jivesoftware/smack/proxy/Socks4ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    .line 39
    return-void
.end method


# virtual methods
.method public connect(Ljava/net/Socket;Ljava/lang/String;II)V
    .locals 17
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

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks4ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyAddress()Ljava/lang/String;

    move-result-object v6

    .line 47
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks4ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyPort()I

    move-result v7

    .line 48
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/proxy/Socks4ProxySocketConnection;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/proxy/ProxyInfo;->getProxyUsername()Ljava/lang/String;

    move-result-object v8

    .line 52
    :try_start_0
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, v6, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    move-object/from16 v1, p1

    move/from16 v2, p4

    invoke-virtual {v1, v0, v2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 53
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 54
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    .line 55
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 57
    const/16 v0, 0x400

    new-array v9, v0, [B

    .line 58
    const/4 v10, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x4

    const/4 v0, 0x0

    aput-byte v1, v9, v0

    .line 80
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x1

    const/4 v0, 0x1

    aput-byte v1, v9, v0

    .line 82
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    ushr-int/lit8 v1, p3, 0x8

    int-to-byte v1, v1

    const/4 v0, 0x2

    aput-byte v1, v9, v0

    .line 83
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    move/from16 v1, p3

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v0, 0x3

    aput-byte v1, v9, v0

    .line 85
    invoke-static {v6}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v11

    .line 86
    invoke-virtual {v11}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v12

    .line 87
    const/4 v13, 0x0

    :goto_0
    array-length v0, v12

    if-ge v13, v0, :cond_0

    .line 89
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    aget-byte v1, v12, v13

    aput-byte v1, v9, v0

    .line 87
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 92
    :cond_0
    if-eqz v8, :cond_1

    .line 94
    const-string v0, "UTF-8"

    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v13

    .line 95
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v13, v1, v9, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v10, v0

    .line 98
    :cond_1
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    aput-byte v1, v9, v0

    .line 99
    const/4 v0, 0x0

    invoke-virtual {v5, v9, v0, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 128
    const/4 v13, 0x6

    .line 129
    const/4 v14, 0x0

    .line 130
    :goto_1
    if-ge v14, v13, :cond_3

    .line 132
    rsub-int/lit8 v0, v14, 0x6

    invoke-virtual {v4, v9, v14, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v15

    .line 133
    if-gtz v15, :cond_2

    .line 135
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    const-string v2, "stream is closed"

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_2
    add-int/2addr v14, v15

    .line 139
    goto :goto_1

    .line 140
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, v9, v0

    if-eqz v0, :cond_4

    .line 142
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "server returns VN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget-byte v3, v9, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_4
    const/4 v0, 0x1

    aget-byte v0, v9, v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_5

    .line 149
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 153
    goto :goto_2

    .line 151
    :catch_0
    move-exception v15

    .line 154
    :goto_2
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProxySOCKS4: server returns CD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    aget-byte v1, v9, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 155
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    invoke-direct {v0, v1, v15}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 157
    :cond_5
    const/4 v0, 0x2

    new-array v15, v0, [B

    .line 158
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {v4, v15, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v16

    .line 159
    move/from16 v0, v16

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 160
    new-instance v0, Ljava/io/IOException;

    const-string v1, "file is unusually small"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 177
    :cond_6
    goto :goto_4

    .line 163
    :catch_1
    move-exception v9

    .line 165
    throw v9

    .line 167
    :catch_2
    move-exception v9

    .line 171
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 175
    goto :goto_3

    .line 173
    :catch_3
    move-exception v10

    .line 176
    :goto_3
    new-instance v0, Lorg/jivesoftware/smack/proxy/ProxyException;

    sget-object v1, Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;->SOCKS4:Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;

    invoke-virtual {v9}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/proxy/ProxyException;-><init>(Lorg/jivesoftware/smack/proxy/ProxyInfo$ProxyType;Ljava/lang/String;)V

    throw v0

    .line 178
    :goto_4
    return-void
.end method
