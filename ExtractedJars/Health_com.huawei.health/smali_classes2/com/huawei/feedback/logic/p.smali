.class public Lcom/huawei/feedback/logic/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "sendFeedbackScore"


# instance fields
.field private b:Lcom/huawei/feedback/bean/f;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/bean/f;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/huawei/feedback/logic/p;->b:Lcom/huawei/feedback/bean/f;

    .line 25
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 35
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/b/a;->a()V

    .line 38
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    new-instance v6, Ljava/net/URL;

    const-string v0, "http://iservice.vmall.com:8081/osg/feedbackAction!addAnswerScore.htm"

    invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 42
    const-string v0, "POST"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 44
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 45
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 47
    const-string v0, "Connection"

    const-string v1, "close"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const v0, 0x1d4c0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 53
    const v0, 0x1d4c0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 55
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->connect()V

    .line 57
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 59
    const-string v0, "questionId"

    iget-object v1, p0, Lcom/huawei/feedback/logic/p;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 60
    const-string v0, "sendFeedbackScore"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "feedbackInfo.getQuestionId()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/logic/p;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "score"

    iget-object v1, p0, Lcom/huawei/feedback/logic/p;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/f;->A()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 65
    invoke-static {v3}, Lcom/huawei/feedback/logic/s;->a(Ljava/io/DataOutputStream;)I

    .line 67
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    .line 73
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 74
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 75
    const/16 v0, 0x400

    new-array v9, v0, [B

    .line 76
    const/4 v10, 0x0

    .line 78
    :goto_0
    invoke-virtual {v4, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    .line 79
    const/4 v0, -0x1

    if-ne v0, v10, :cond_0

    .line 81
    const-string v0, "sendFeedbackScore"

    const-string v1, "read over"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    goto :goto_1

    .line 84
    :cond_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    const/4 v2, 0x0

    invoke-direct {v0, v9, v2, v10, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 88
    :goto_1
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 98
    const-string v0, "sendFeedbackScore"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 99
    const-string v0, "sendFeedbackScore"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 100
    goto :goto_2

    .line 89
    :catch_0
    move-exception v6

    .line 90
    const-string v0, "sendFeedbackScore"

    const-string v1, "RuntimeException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    const-string v0, "sendFeedbackScore"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 99
    const-string v0, "sendFeedbackScore"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 100
    goto :goto_2

    .line 92
    :catch_1
    move-exception v6

    .line 94
    const-string v0, "sendFeedbackScore"

    const-string v1, "ConnectTimeoutException ..."

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    const-string v0, "sendFeedbackScore"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 99
    const-string v0, "sendFeedbackScore"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 100
    goto :goto_2

    .line 95
    :catch_2
    move-exception v6

    .line 96
    const-string v0, "sendFeedbackScore"

    const-string v1, "connect unkown Exception ..."

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    const-string v0, "sendFeedbackScore"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 99
    const-string v0, "sendFeedbackScore"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 100
    goto :goto_2

    .line 98
    :catchall_0
    move-exception v11

    const-string v0, "sendFeedbackScore"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 99
    const-string v0, "sendFeedbackScore"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    throw v11

    .line 102
    :goto_2
    new-instance v6, Lcom/huawei/feedback/logic/h;

    invoke-direct {v6}, Lcom/huawei/feedback/logic/h;-><init>()V

    .line 103
    invoke-virtual {v6, v5}, Lcom/huawei/feedback/logic/h;->a(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    invoke-virtual {v6}, Lcom/huawei/feedback/logic/h;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 106
    const-string v0, "sendFeedbackScore"

    const-string v1, "handler SUCCESS"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 109
    :cond_1
    const-string v0, "sendFeedbackScore"

    const-string v1, "handler FAIL"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_3
    return-void
.end method
