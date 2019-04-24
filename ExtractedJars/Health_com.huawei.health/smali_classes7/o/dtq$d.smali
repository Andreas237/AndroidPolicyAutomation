.class Lo/dtq$d;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dtq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Lo/dto;

.field private d:Ljava/lang/String;

.field private e:Ljavax/net/ssl/HttpsURLConnection;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/HttpsURLConnection;Ljava/lang/String;Lo/dto;)V
    .locals 0

    .line 228
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 230
    iput-object p1, p0, Lo/dtq$d;->e:Ljavax/net/ssl/HttpsURLConnection;

    .line 231
    iput-object p2, p0, Lo/dtq$d;->d:Ljava/lang/String;

    .line 232
    iput-object p3, p0, Lo/dtq$d;->b:Lo/dto;

    .line 233
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 237
    const/4 v3, 0x0

    .line 238
    const/4 v4, -0x1

    .line 240
    :try_start_0
    iget-object v0, p0, Lo/dtq$d;->e:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v4

    .line 241
    const-string v0, "PLGACHIEVE_Https"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download-->responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_1

    .line 243
    iget-object v0, p0, Lo/dtq$d;->e:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    .line 244
    iget-object v0, p0, Lo/dtq$d;->d:Ljava/lang/String;

    invoke-static {v3, v0}, Lo/dtp;->d(Ljava/io/InputStream;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 245
    const/4 v0, 0x1

    if-ne v0, v5, :cond_0

    const/16 v4, 0xc8

    goto :goto_0

    :cond_0
    const/4 v4, -0x1

    .line 246
    :goto_0
    goto :goto_1

    .line 247
    :cond_1
    const/4 v4, -0x1

    .line 253
    :goto_1
    if-eqz v3, :cond_3

    .line 255
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 258
    goto/16 :goto_3

    .line 256
    :catch_0
    move-exception v5

    .line 257
    const-string v0, "PLGACHIEVE_Https"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download e6="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    goto :goto_3

    .line 249
    :catch_1
    move-exception v5

    .line 250
    const-string v0, "PLGACHIEVE_Https"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download e4="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    const/4 v4, -0x1

    .line 253
    if-eqz v3, :cond_3

    .line 255
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 258
    goto :goto_3

    .line 256
    :catch_2
    move-exception v5

    .line 257
    const-string v0, "PLGACHIEVE_Https"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download e6="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    goto :goto_3

    .line 253
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_2

    .line 255
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 258
    goto :goto_2

    .line 256
    :catch_3
    move-exception v7

    .line 257
    const-string v0, "PLGACHIEVE_Https"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download e6="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :cond_2
    :goto_2
    throw v6

    .line 261
    :cond_3
    :goto_3
    iget-object v0, p0, Lo/dtq$d;->b:Lo/dto;

    if-eqz v0, :cond_4

    .line 262
    iget-object v0, p0, Lo/dtq$d;->b:Lo/dto;

    const/4 v1, 0x0

    invoke-interface {v0, v4, v1}, Lo/dto;->a(ILjava/lang/String;)V

    .line 264
    :cond_4
    return-void
.end method
