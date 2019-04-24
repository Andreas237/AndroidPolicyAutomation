.class final Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;
.super Ljava/io/InputStream;
.source "QueueFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/com/squareup/QueueFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ElementInputStream"
.end annotation


# instance fields
.field private position:I

.field private remaining:I

.field final synthetic this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;


# direct methods
.method private constructor <init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;)V
    .locals 1

    .line 464
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 465
    iget v0, p2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->position:I

    add-int/lit8 v0, v0, 0x4

    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->access$100(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I)I

    move-result p1

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    .line 466
    iget p1, p2, Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;->length:I

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;Lcom/usebutton/thirdparty/com/squareup/QueueFile$1;)V
    .locals 0

    .line 460
    invoke-direct {p0, p1, p2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;-><init>(Lcom/usebutton/thirdparty/com/squareup/QueueFile;Lcom/usebutton/thirdparty/com/squareup/QueueFile$Element;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 484
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget-object v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 486
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget-object v0, v0, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->raf:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    .line 487
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget v2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->access$100(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I)I

    move-result v1

    iput v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    .line 488
    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    return v0
.end method

.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    or-int v0, p2, p3

    if-ltz v0, :cond_2

    .line 470
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    .line 473
    iget v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le p3, v0, :cond_1

    move p3, v0

    .line 477
    :cond_1
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget v1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    invoke-static {v0, v1, p1, p2, p3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->access$200(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I[BII)V

    .line 478
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->this$0:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget p2, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    add-int/2addr p2, p3

    invoke-static {p1, p2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->access$100(Lcom/usebutton/thirdparty/com/squareup/QueueFile;I)I

    move-result p1

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->position:I

    .line 479
    iget p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    sub-int/2addr p1, p3

    iput p1, p0, Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementInputStream;->remaining:I

    return p3

    .line 471
    :cond_2
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method
