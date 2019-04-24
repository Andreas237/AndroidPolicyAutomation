.class public Lo/aaw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/io/OutputStream;)V
    .locals 0

    .line 82
    invoke-static {p0}, Lo/aaw;->d(Ljava/io/Closeable;)V

    .line 83
    return-void
.end method

.method public static d(Ljava/io/Closeable;)V
    .locals 3

    .line 92
    if-eqz p0, :cond_0

    .line 96
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_0

    .line 98
    :catch_0
    move-exception v2

    .line 100
    const-string v0, "closeQuietly IOException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 103
    :cond_0
    :goto_0
    return-void
.end method

.method public static e(Ljava/io/InputStream;)V
    .locals 0

    .line 72
    invoke-static {p0}, Lo/aaw;->d(Ljava/io/Closeable;)V

    .line 73
    return-void
.end method
