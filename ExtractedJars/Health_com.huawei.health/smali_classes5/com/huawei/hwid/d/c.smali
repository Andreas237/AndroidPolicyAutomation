.class public final Lcom/huawei/hwid/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/Closeable;)V
    .locals 3

    .line 80
    if-eqz p0, :cond_0

    .line 82
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 83
    :catch_0
    move-exception v2

    .line 84
    const-string v0, "IOUtils"

    const-string v1, "An exception occurred while closing the \'Closeable\' object."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :cond_0
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/InputStream;)V
    .locals 0

    .line 62
    invoke-static {p0}, Lcom/huawei/hwid/d/c;->a(Ljava/io/Closeable;)V

    .line 63
    return-void
.end method

.method public static a(Ljava/io/OutputStream;)V
    .locals 0

    .line 71
    invoke-static {p0}, Lcom/huawei/hwid/d/c;->a(Ljava/io/Closeable;)V

    .line 72
    return-void
.end method
