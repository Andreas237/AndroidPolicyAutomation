.class Lcom/tencent/open/b/g$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/b/g;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/tencent/open/b/g;


# direct methods
.method constructor <init>(Lcom/tencent/open/b/g;Landroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/tencent/open/b/g$6;->e:Lcom/tencent/open/b/g;

    iput-object p2, p0, Lcom/tencent/open/b/g$6;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/tencent/open/b/g$6;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/tencent/open/b/g$6;->c:Z

    iput-object p5, p0, Lcom/tencent/open/b/g$6;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 736
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/b/g$6;->a:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 737
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->httpRequest, params is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 738
    return-void

    .line 741
    :cond_0
    const/4 v3, 0x0

    .line 742
    :try_start_1
    invoke-static {}, Lcom/tencent/open/b/e;->a()I

    move-result v4

    .line 743
    if-nez v4, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    move v4, v0

    .line 745
    const-string v0, "openSDK_LOG.ReportManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->httpRequest, retryCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    const/4 v5, 0x0

    .line 748
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/b/g$6;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/tencent/open/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;

    move-result-object v6

    .line 749
    const/4 v7, 0x0

    .line 750
    iget-object v0, p0, Lcom/tencent/open/b/g$6;->a:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/tencent/open/utils/HttpUtils;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v8

    .line 751
    iget-boolean v0, p0, Lcom/tencent/open/b/g$6;->c:Z

    if-eqz v0, :cond_2

    .line 752
    invoke-static {v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 755
    :cond_2
    iget-object v0, p0, Lcom/tencent/open/b/g$6;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 756
    new-instance v9, Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/tencent/open/b/g$6;->b:Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 757
    invoke-virtual {v9, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 758
    new-instance v7, Lorg/apache/http/client/methods/HttpGet;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 759
    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/tencent/open/b/g$6;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 760
    new-instance v9, Lorg/apache/http/client/methods/HttpPost;

    iget-object v0, p0, Lcom/tencent/open/b/g$6;->b:Ljava/lang/String;

    invoke-direct {v9, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 761
    invoke-static {v8}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v10

    .line 762
    new-instance v11, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v11, v10}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 763
    invoke-virtual {v9, v11}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 764
    move-object v7, v9

    .line 765
    goto :goto_1

    .line 766
    :cond_4
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->httpRequest unkonw request method return."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 767
    return-void

    .line 770
    :goto_1
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    :try_start_2
    invoke-interface {v7, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 771
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-interface {v7, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 774
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 776
    :try_start_3
    invoke-interface {v6, v7}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v9

    .line 777
    invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v10

    .line 778
    invoke-interface {v10}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v11

    .line 780
    const-string v0, "openSDK_LOG.ReportManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->httpRequest, statusCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 781
    const/16 v0, 0xc8

    if-eq v11, v0, :cond_6

    .line 782
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest : HttpStatuscode != 200"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 784
    :cond_6
    const/4 v5, 0x1

    .line 785
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest Thread success"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 787
    :goto_2
    goto :goto_4

    .line 788
    :catch_0
    move-exception v9

    .line 789
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest ConnectTimeoutException"

    :try_start_4
    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    goto :goto_3

    .line 790
    :catch_1
    move-exception v9

    .line 791
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest SocketTimeoutException"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    goto :goto_3

    .line 792
    :catch_2
    move-exception v9

    .line 793
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest Exception"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    goto :goto_4

    .line 796
    :goto_3
    if-lt v3, v4, :cond_5

    .line 798
    :goto_4
    const/4 v0, 0x1

    if-ne v5, v0, :cond_7

    .line 799
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest Thread request success"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 801
    :cond_7
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->ReportCenter httpRequest Thread request failed"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 805
    :goto_5
    goto :goto_6

    .line 803
    :catch_3
    move-exception v3

    .line 804
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->httpRequest, exception in serial executor."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    :goto_6
    return-void
.end method
