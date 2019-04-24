.class public Lorg/apache/commons/io/LineIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Iterator<Ljava/lang/String;>;Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field private final bufferedReader:Ljava/io/BufferedReader;

.field private cachedLine:Ljava/lang/String;

.field private finished:Z


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/LineIterator;->finished:Z

    .line 68
    if-nez p1, :cond_0

    .line 69
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Reader must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_0
    instance-of v0, p1, Ljava/io/BufferedReader;

    if-eqz v0, :cond_1

    .line 72
    move-object v0, p1

    check-cast v0, Ljava/io/BufferedReader;

    iput-object v0, p0, Lorg/apache/commons/io/LineIterator;->bufferedReader:Ljava/io/BufferedReader;

    goto :goto_0

    .line 74
    :cond_1
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lorg/apache/commons/io/LineIterator;->bufferedReader:Ljava/io/BufferedReader;

    .line 76
    :goto_0
    return-void
.end method

.method public static closeQuietly(Lorg/apache/commons/io/LineIterator;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 192
    if-eqz p0, :cond_0

    .line 193
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    :cond_0
    goto :goto_0

    .line 195
    :catch_0
    move-exception v0

    .line 198
    :goto_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/io/LineIterator;->finished:Z

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/io/LineIterator;->cachedLine:Ljava/lang/String;

    .line 165
    iget-object v0, p0, Lorg/apache/commons/io/LineIterator;->bufferedReader:Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lorg/apache/commons/io/LineIterator;->bufferedReader:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 168
    :cond_0
    return-void
.end method

.method public hasNext()Z
    .locals 3

    .line 89
    iget-object v0, p0, Lorg/apache/commons/io/LineIterator;->cachedLine:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 90
    const/4 v0, 0x1

    return v0

    .line 91
    :cond_0
    iget-boolean v0, p0, Lorg/apache/commons/io/LineIterator;->finished:Z

    if-eqz v0, :cond_1

    .line 92
    const/4 v0, 0x0

    return v0

    .line 96
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/io/LineIterator;->bufferedReader:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 97
    if-nez v1, :cond_2

    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/io/LineIterator;->finished:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_2
    :try_start_1
    invoke-virtual {p0, v1}, Lorg/apache/commons/io/LineIterator;->isValidLine(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    iput-object v1, p0, Lorg/apache/commons/io/LineIterator;->cachedLine:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_3
    goto :goto_0

    .line 105
    :catch_0
    move-exception v1

    .line 107
    :try_start_2
    invoke-virtual {p0}, Lorg/apache/commons/io/LineIterator;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 110
    goto :goto_1

    .line 108
    :catch_1
    move-exception v2

    .line 109
    invoke-virtual {v1, v2}, Ljava/io/IOException;->addSuppressed(Ljava/lang/Throwable;)V

    .line 111
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method protected isValidLine(Ljava/lang/String;)Z
    .locals 1

    .line 123
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lorg/apache/commons/io/LineIterator;->next()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/lang/String;
    .locals 1

    .line 134
    invoke-virtual {p0}, Lorg/apache/commons/io/LineIterator;->nextLine()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public nextLine()Ljava/lang/String;
    .locals 3

    .line 144
    invoke-virtual {p0}, Lorg/apache/commons/io/LineIterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "No more lines"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_0
    iget-object v2, p0, Lorg/apache/commons/io/LineIterator;->cachedLine:Ljava/lang/String;

    .line 148
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/io/LineIterator;->cachedLine:Ljava/lang/String;

    .line 149
    return-object v2
.end method

.method public remove()V
    .locals 2

    .line 177
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Remove unsupported on LineIterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
