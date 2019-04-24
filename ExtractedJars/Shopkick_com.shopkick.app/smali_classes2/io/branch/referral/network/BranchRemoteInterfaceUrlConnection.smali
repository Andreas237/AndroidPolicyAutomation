.class public Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;
.super Lio/branch/referral/network/BranchRemoteInterface;
.source "BranchRemoteInterfaceUrlConnection.java"


# static fields
.field private static final DEFAULT_TIMEOUT:I = 0xbb8


# instance fields
.field prefHelper:Lio/branch/referral/PrefHelper;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lio/branch/referral/network/BranchRemoteInterface;-><init>()V

    .line 35
    invoke-static {p1}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    return-void
.end method

.method private doRestfulGet(Ljava/lang/String;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation

    const/16 v0, -0x71

    const/4 v1, 0x0

    .line 53
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getTimeout()I

    move-result v2

    if-gtz v2, :cond_0

    const/16 v2, 0xbb8

    :cond_0
    const-string v3, "?"

    .line 57
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "&"

    goto :goto_0

    :cond_1
    const-string v3, "?"

    .line 58
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "retryNumber"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 59
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    :try_start_1
    invoke-virtual {v3, v2}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 62
    invoke-virtual {v3, v2}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 64
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v2

    const/16 v4, 0x1f4

    if-lt v2, v4, :cond_3

    .line 65
    iget-object v4, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    .line 66
    invoke-virtual {v4}, Lio/branch/referral/PrefHelper;->getRetryCount()I

    move-result v4
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ge p2, v4, :cond_3

    .line 68
    :try_start_2
    iget-object v1, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getRetryInterval()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 70
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 73
    invoke-direct {p0, p1, p2}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulGet(Ljava/lang/String;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1
    :try_end_3
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v3, :cond_2

    .line 109
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_2
    return-object p1

    :cond_3
    const/16 v4, 0xc8

    if-eq v2, v4, :cond_5

    .line 76
    :try_start_4
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 77
    new-instance v4, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {p0, v5}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->getResponseString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v3, :cond_4

    .line 109
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_4
    return-object v4

    .line 79
    :cond_5
    :try_start_5
    new-instance v4, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {p0, v5}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->getResponseString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/net/SocketException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v3, :cond_6

    .line 109
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_6
    return-object v4

    :catch_1
    :try_start_6
    const-string v4, "BranchSDK"

    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "A resource conflict occurred with this request "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    new-instance v4, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-direct {v4, v1, v2}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_6
    .catch Ljava/net/SocketException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v3, :cond_7

    .line 109
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_7
    return-object v4

    :catchall_0
    move-exception p1

    move-object v1, v3

    goto/16 :goto_6

    :catch_2
    move-exception p1

    move-object v1, v3

    goto :goto_2

    :catch_3
    move-object v1, v3

    goto :goto_3

    :catch_4
    move-exception p1

    move-object v1, v3

    goto :goto_5

    :catchall_1
    move-exception p1

    goto/16 :goto_6

    :catch_5
    move-exception p1

    .line 105
    :goto_2
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Branch connect exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;

    invoke-direct {p1, v0}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;-><init>(I)V

    throw p1

    .line 93
    :catch_6
    :goto_3
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getRetryCount()I

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-ge p2, v0, :cond_9

    .line 95
    :try_start_8
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getRetryInterval()I

    move-result v0

    int-to-long v2, v0

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_4

    :catch_7
    move-exception v0

    .line 97
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_4
    add-int/lit8 p2, p2, 0x1

    .line 100
    invoke-direct {p0, p1, p2}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulGet(Ljava/lang/String;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v1, :cond_8

    .line 109
    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_8
    return-object p1

    .line 102
    :cond_9
    :try_start_a
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;

    const/16 p2, -0x6f

    invoke-direct {p1, p2}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;-><init>(I)V

    throw p1

    :catch_8
    move-exception p1

    .line 88
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Http connect exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/SocketException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;

    invoke-direct {p1, v0}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;-><init>(I)V

    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_6
    if-eqz v1, :cond_a

    .line 109
    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_a
    throw p1
.end method

.method private doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getTimeout()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0xbb8

    :cond_0
    :try_start_0
    const-string v1, "retryNumber"

    .line 122
    invoke-virtual {p2, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 v1, 0x1f4

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 126
    :try_start_1
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 128
    :try_start_2
    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 129
    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 130
    invoke-virtual {v4, v2}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 131
    invoke-virtual {v4, v2}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    const-string v0, "Content-Type"

    const-string v5, "application/json"

    .line 132
    invoke-virtual {v4, v0, v5}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Accept"

    const-string v5, "application/json"

    .line 133
    invoke-virtual {v4, v0, v5}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "POST"

    .line 134
    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 136
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 138
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->flush()V

    .line 140
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->close()V

    .line 142
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    if-lt v0, v1, :cond_2

    .line 143
    iget-object v5, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    .line 144
    invoke-virtual {v5}, Lio/branch/referral/PrefHelper;->getRetryCount()I

    move-result v5
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ge p3, v5, :cond_2

    .line 146
    :try_start_3
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getRetryInterval()I

    move-result v0

    int-to-long v5, v0

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_9
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_0

    :catch_1
    move-exception v0

    .line 148
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    add-int/lit8 p3, p3, 0x1

    .line 151
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v4, :cond_1

    .line 202
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_1
    return-object p1

    :cond_2
    const/16 v5, 0xc8

    if-eq v0, v5, :cond_3

    .line 155
    :try_start_5
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 156
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v5

    goto :goto_1

    .line 158
    :cond_3
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 160
    :goto_1
    :try_start_6
    new-instance v6, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-direct {p0, v5}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->getResponseString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v0}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v5, :cond_4

    .line 168
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catch_2
    move-exception v0

    .line 171
    :try_start_8
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_8
    .catch Ljava/net/SocketTimeoutException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    .line 202
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_5
    return-object v6

    :catchall_0
    move-exception v0

    move-object v5, v3

    goto :goto_4

    :catch_3
    move-object v5, v3

    :catch_4
    :try_start_9
    const-string v6, "BranchSDK"

    .line 163
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "A resource conflict occurred with this request "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    new-instance v6, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-direct {v6, v3, v0}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v5, :cond_6

    .line 168
    :try_start_a
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_3

    :catch_5
    move-exception v0

    .line 171
    :try_start_b
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_b
    .catch Ljava/net/SocketTimeoutException; {:try_start_b .. :try_end_b} :catch_9
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :cond_6
    :goto_3
    if-eqz v4, :cond_7

    .line 202
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_7
    return-object v6

    :catchall_1
    move-exception v0

    :goto_4
    if-eqz v5, :cond_8

    .line 168
    :try_start_c
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_5

    :catch_6
    move-exception v5

    .line 171
    :try_start_d
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 172
    :cond_8
    :goto_5
    throw v0
    :try_end_d
    .catch Ljava/net/SocketTimeoutException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :catch_7
    move-exception p1

    goto :goto_6

    :catch_8
    move-exception p1

    move-object v3, v4

    goto :goto_7

    :catch_9
    move-object v3, v4

    goto :goto_8

    :catchall_2
    move-exception p1

    move-object v4, v3

    goto/16 :goto_a

    :catch_a
    move-exception p1

    move-object v4, v3

    .line 194
    :goto_6
    :try_start_e
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Exception: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xb

    if-lt p2, p3, :cond_9

    .line 196
    instance-of p1, p1, Landroid/os/NetworkOnMainThreadException;

    if-eqz p1, :cond_9

    const-string p1, "BranchSDK"

    const-string p2, "Branch Error: Don\'t call our synchronous methods on the main thread!!!"

    .line 197
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :cond_9
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    invoke-direct {p1, v3, v1}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;-><init>(Ljava/lang/String;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    if-eqz v4, :cond_a

    .line 202
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_a
    return-object p1

    :catchall_3
    move-exception p1

    goto :goto_a

    :catch_b
    move-exception p1

    .line 191
    :goto_7
    :try_start_f
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Http connect exception: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;

    const/16 p2, -0x71

    invoke-direct {p1, p2}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;-><init>(I)V

    throw p1

    .line 179
    :catch_c
    :goto_8
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getRetryCount()I

    move-result v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    if-ge p3, v0, :cond_c

    .line 181
    :try_start_10
    iget-object v0, p0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->prefHelper:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getRetryInterval()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_d
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    goto :goto_9

    :catch_d
    move-exception v0

    .line 183
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_9
    add-int/2addr p3, v2

    .line 186
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz v3, :cond_b

    .line 202
    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_b
    return-object p1

    .line 188
    :cond_c
    :try_start_12
    new-instance p1, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;

    const/16 p2, -0x6f

    invoke-direct {p1, p2}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;-><init>(I)V

    throw p1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :goto_a
    if-eqz v4, :cond_d

    .line 202
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_d
    throw p1
.end method

.method private getResponseString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    .line 211
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 213
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public doRestfulGet(Ljava/lang/String;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulGet(Ljava/lang/String;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1

    return-object p1
.end method

.method public doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;->doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;I)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1

    return-object p1
.end method
