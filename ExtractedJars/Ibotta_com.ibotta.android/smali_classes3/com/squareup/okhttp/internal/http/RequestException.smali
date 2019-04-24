.class public final Lcom/squareup/okhttp/internal/http/RequestException;
.super Ljava/lang/Exception;
.source "RequestException.java"


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getCause()Ljava/io/IOException;
    .locals 1

    .line 32
    invoke-super {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/RequestException;->getCause()Ljava/io/IOException;

    move-result-object v0

    return-object v0
.end method
