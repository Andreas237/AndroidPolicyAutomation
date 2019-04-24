.class Lcom/tencent/open/yyb/AppbarActivity$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/yyb/AppbarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/String;Ljava/lang/Void;[B>;"
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/open/yyb/AppbarActivity$a;


# direct methods
.method public constructor <init>(Lcom/tencent/open/yyb/AppbarActivity$a;)V
    .locals 0

    .line 682
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 683
    iput-object p1, p0, Lcom/tencent/open/yyb/AppbarActivity$b;->a:Lcom/tencent/open/yyb/AppbarActivity$a;

    .line 684
    return-void
.end method


# virtual methods
.method protected a([B)V
    .locals 1

    .line 737
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 738
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$b;->a:Lcom/tencent/open/yyb/AppbarActivity$a;

    invoke-interface {v0, p1}, Lcom/tencent/open/yyb/AppbarActivity$a;->a([B)V

    .line 739
    return-void
.end method

.method protected varargs a([Ljava/lang/String;)[B
    .locals 8

    .line 688
    const/4 v2, 0x0

    .line 690
    :try_start_0
    new-instance v2, Ljava/net/URL;

    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 694
    goto :goto_0

    .line 691
    :catch_0
    move-exception v3

    .line 692
    invoke-virtual {v3}, Ljava/net/MalformedURLException;->printStackTrace()V

    .line 693
    const/4 v0, 0x0

    return-object v0

    .line 695
    :goto_0
    const/4 v3, 0x0

    .line 697
    :try_start_1
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 701
    goto :goto_1

    .line 698
    :catch_1
    move-exception v4

    .line 699
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 700
    const/4 v0, 0x0

    return-object v0

    .line 702
    :goto_1
    const/16 v0, 0x1388

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 704
    const-string v0, "GET"

    :try_start_2
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_2

    .line 708
    goto :goto_2

    .line 705
    :catch_2
    move-exception v4

    .line 706
    invoke-virtual {v4}, Ljava/net/ProtocolException;->printStackTrace()V

    .line 707
    const/4 v0, 0x0

    return-object v0

    .line 709
    :goto_2
    const/4 v4, 0x0

    .line 711
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v4

    .line 715
    goto :goto_3

    .line 712
    :catch_3
    move-exception v5

    .line 713
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 714
    const/4 v0, 0x0

    return-object v0

    .line 717
    :goto_3
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    .line 718
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 719
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 720
    const/4 v7, 0x0

    .line 721
    :goto_4
    invoke-virtual {v4, v6}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 722
    const/4 v0, 0x0

    invoke-virtual {v5, v6, v0, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_4

    .line 724
    :cond_0
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 725
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 726
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v0

    return-object v0

    .line 731
    :cond_1
    goto :goto_5

    .line 728
    :catch_4
    move-exception v5

    .line 730
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 732
    :goto_5
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 678
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity$b;->a([Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 678
    move-object v0, p1

    check-cast v0, [B

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity$b;->a([B)V

    return-void
.end method
