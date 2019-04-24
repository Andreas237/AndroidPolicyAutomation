.class public Lo/fgp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 11

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/16 v0, 0xc8

    iput v0, p0, Lo/fgp;->c:I

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/fgp;->d:I

    .line 41
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 42
    return-void

    .line 45
    :cond_0
    invoke-direct {p0, p1}, Lo/fgp;->e(Lorg/apache/http/HttpResponse;)V

    .line 47
    invoke-virtual {p0}, Lo/fgp;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lo/fgp;->b()I

    move-result v0

    const/16 v1, 0x12e

    if-ne v0, v1, :cond_5

    .line 48
    :cond_1
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 51
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v5

    .line 52
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v6

    .line 53
    if-eqz v6, :cond_2

    invoke-interface {v6}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gzip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v5, v0

    .line 57
    :cond_2
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    const-string v2, "UTF-8"

    invoke-direct {v1, v5, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v4, v0

    .line 58
    new-instance v7, Ljava/lang/StringBuffer;

    const/16 v0, 0x400

    invoke-direct {v7, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 60
    :goto_0
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    .line 61
    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fgp;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    if-eqz v4, :cond_5

    .line 71
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    goto/16 :goto_2

    .line 72
    :catch_0
    move-exception v6

    .line 73
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    goto/16 :goto_2

    .line 64
    :catch_1
    move-exception v6

    .line 65
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    if-eqz v4, :cond_5

    .line 71
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 74
    goto/16 :goto_2

    .line 72
    :catch_2
    move-exception v6

    .line 73
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    goto :goto_2

    .line 66
    :catch_3
    move-exception v6

    .line 67
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    if-eqz v4, :cond_5

    .line 71
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 74
    goto :goto_2

    .line 72
    :catch_4
    move-exception v6

    .line 73
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v9

    if-eqz v4, :cond_4

    .line 71
    :try_start_6
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 74
    goto :goto_1

    .line 72
    :catch_5
    move-exception v10

    .line 73
    const-string v0, "AgreementResponse"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgreementResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :cond_4
    :goto_1
    throw v9

    .line 78
    :cond_5
    :goto_2
    return-void
.end method

.method private e(Lorg/apache/http/HttpResponse;)V
    .locals 9

    .line 81
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    .line 82
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    .line 83
    invoke-interface {v6}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v7

    .line 84
    invoke-interface {v6}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v8

    .line 85
    if-nez v7, :cond_0

    if-nez v8, :cond_0

    .line 86
    goto :goto_2

    .line 88
    :cond_0
    if-nez v7, :cond_1

    .line 90
    const-string v0, "\\s+"

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fgp;->d(I)V

    goto :goto_1

    .line 91
    :cond_1
    const-string v0, "NSP_STATUS"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/fgp;->a(I)V

    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0, v7, v8}, Lo/fgp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 99
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/fgp;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .line 128
    iput p1, p0, Lo/fgp;->d:I

    .line 129
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 133
    iget-object v0, p0, Lo/fgp;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 134
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lo/fgp;->a:Ljava/util/Map;

    .line 135
    :cond_0
    iget-object v0, p0, Lo/fgp;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    return-void
.end method

.method public final b()I
    .locals 1

    .line 113
    iget v0, p0, Lo/fgp;->c:I

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lo/fgp;->e:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public final d(I)V
    .locals 0

    .line 118
    iput p1, p0, Lo/fgp;->c:I

    .line 119
    return-void
.end method
