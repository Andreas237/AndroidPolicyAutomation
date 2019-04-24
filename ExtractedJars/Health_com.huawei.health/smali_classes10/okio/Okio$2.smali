.class final Lokio/Okio$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/Okio;->source(Ljava/io/InputStream;Lokio/Timeout;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$in:Ljava/io/InputStream;

.field final synthetic val$timeout:Lokio/Timeout;


# direct methods
.method constructor <init>(Lokio/Timeout;Ljava/io/InputStream;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lokio/Okio$2;->val$timeout:Lokio/Timeout;

    iput-object p2, p0, Lokio/Okio$2;->val$in:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    .line 147
    iget-object v0, p0, Lokio/Okio$2;->val$in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 148
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 134
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    .line 136
    :cond_1
    iget-object v0, p0, Lokio/Okio$2;->val$timeout:Lokio/Timeout;

    invoke-virtual {v0}, Lokio/Timeout;->throwIfReached()V

    .line 137
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lokio/Buffer;->writableSegment(I)Lokio/Segment;

    move-result-object v4

    .line 138
    iget v0, v4, Lokio/Segment;->limit:I

    rsub-int v0, v0, 0x800

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v5, v0

    .line 139
    iget-object v0, p0, Lokio/Okio$2;->val$in:Ljava/io/InputStream;

    iget-object v1, v4, Lokio/Segment;->data:[B

    iget v2, v4, Lokio/Segment;->limit:I

    invoke-virtual {v0, v1, v2, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    .line 140
    const/4 v0, -0x1

    if-ne v6, v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    .line 141
    :cond_2
    iget v0, v4, Lokio/Segment;->limit:I

    add-int/2addr v0, v6

    iput v0, v4, Lokio/Segment;->limit:I

    .line 142
    iget-wide v0, p1, Lokio/Buffer;->size:J

    int-to-long v2, v6

    add-long/2addr v0, v2

    iput-wide v0, p1, Lokio/Buffer;->size:J

    .line 143
    int-to-long v0, v6

    return-wide v0
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 151
    iget-object v0, p0, Lokio/Okio$2;->val$timeout:Lokio/Timeout;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokio/Okio$2;->val$in:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
