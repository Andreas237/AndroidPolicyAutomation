.class Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;
.super Lokhttp3/internal/http/Http1xStream$AbstractSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "UnknownLengthSource"
.end annotation


# instance fields
.field private inputExhausted:Z

.field final synthetic this$0:Lokhttp3/internal/http/Http1xStream;


# direct methods
.method private constructor <init>(Lokhttp3/internal/http/Http1xStream;)V
    .locals 1

    .line 467
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lokhttp3/internal/http/Http1xStream$AbstractSource;-><init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V
    .locals 0

    .line 467
    invoke-direct {p0, p1}, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;-><init>(Lokhttp3/internal/http/Http1xStream;)V

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

    .line 486
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->closed:Z

    if-eqz v0, :cond_0

    return-void

    .line 487
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->inputExhausted:Z

    if-nez v0, :cond_1

    .line 488
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->endOfInput(Z)V

    .line 490
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->closed:Z

    .line 491
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 472
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

    .line 473
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->closed:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 474
    :cond_1
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->inputExhausted:Z

    if-eqz v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    .line 476
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$600(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSource;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide v3

    .line 477
    const-wide/16 v0, -0x1

    cmp-long v0, v3, v0

    if-nez v0, :cond_3

    .line 478
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->inputExhausted:Z

    .line 479
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lokhttp3/internal/http/Http1xStream$UnknownLengthSource;->endOfInput(Z)V

    .line 480
    const-wide/16 v0, -0x1

    return-wide v0

    .line 482
    :cond_3
    return-wide v3
.end method
