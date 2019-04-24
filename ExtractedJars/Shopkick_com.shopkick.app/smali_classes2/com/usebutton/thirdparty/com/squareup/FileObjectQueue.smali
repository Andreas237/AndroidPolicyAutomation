.class public Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;
.super Ljava/lang/Object;
.source "FileObjectQueue.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;,
        Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

.field private final converter:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final file:Ljava/io/File;

.field private listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter<",
            "TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    invoke-direct {v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    .line 39
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    .line 40
    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->converter:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    .line 41
    new-instance p2, Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-direct {p2, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;-><init>(Ljava/io/File;)V

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;)Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->converter:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    return-object p0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;->reset()V

    .line 51
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->converter:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    invoke-interface {v0, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;->toStream(Ljava/lang/Object;Ljava/io/OutputStream;)V

    .line 52
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    invoke-virtual {v1}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;->getArray()[B

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->bytes:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;

    invoke-virtual {v3}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;->size()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->add([BII)V

    .line 53
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    invoke-interface {v0, p0, p1}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onAdd(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 55
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v2, "Failed to add entry."

    invoke-direct {v0, v2, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v0
.end method

.method public asList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 95
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->peek(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 4

    .line 122
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 124
    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v3, "Failed to close."

    invoke-direct {v1, v3, v0, v2}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v1
.end method

.method public peek()Ljava/lang/Object;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 62
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->peek()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_0
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->converter:Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;

    invoke-interface {v1, v0}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$Converter;->from([B)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 66
    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v3, "Failed to peek."

    invoke-direct {v1, v3, v0, v2}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v1
.end method

.method public peek(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 77
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    new-instance v2, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$1;-><init>(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;Ljava/util/List;I)V

    invoke-virtual {v1, v2}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;)I

    .line 88
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 90
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v2, "Failed to peek."

    invoke-direct {v0, v2, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v0
.end method

.method public final remove()V
    .locals 4

    .line 100
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->remove()V

    .line 101
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    invoke-interface {v0, p0}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onRemove(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 103
    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v3, "Failed to remove."

    invoke-direct {v1, v3, v0, v2}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v1
.end method

.method public final remove(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0, p1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->remove(I)V

    .line 110
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 112
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    invoke-interface {v1, p0}, Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;->onRemove(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 116
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v2, "Failed to remove."

    invoke-direct {v0, v2, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v0
.end method

.method public setListener(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 131
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    new-instance v1, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$2;-><init>(Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->forEach(Lcom/usebutton/thirdparty/com/squareup/QueueFile$ElementVisitor;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 141
    new-instance v0, Lcom/usebutton/thirdparty/com/squareup/FileException;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->file:Ljava/io/File;

    const-string v2, "Unable to iterate over QueueFile contents."

    invoke-direct {v0, v2, p1, v1}, Lcom/usebutton/thirdparty/com/squareup/FileException;-><init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V

    throw v0

    .line 144
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->listener:Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;

    return-void
.end method

.method public size()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;->queueFile:Lcom/usebutton/thirdparty/com/squareup/QueueFile;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/squareup/QueueFile;->size()I

    move-result v0

    return v0
.end method
