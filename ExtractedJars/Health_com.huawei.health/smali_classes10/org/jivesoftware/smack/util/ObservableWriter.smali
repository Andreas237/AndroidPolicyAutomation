.class public Lorg/jivesoftware/smack/util/ObservableWriter;
.super Ljava/io/Writer;
.source "SourceFile"


# static fields
.field private static final MAX_STRING_BUILDER_SIZE:I = 0x1000


# instance fields
.field final listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/jivesoftware/smack/util/WriterListener;>;"
        }
    .end annotation
.end field

.field private final stringBuilder:Ljava/lang/StringBuilder;

.field wrappedWriter:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->stringBuilder:Ljava/lang/StringBuilder;

    .line 38
    iput-object p1, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    .line 39
    return-void
.end method

.method private maybeNotifyListeners(Ljava/lang/String;)V
    .locals 2

    .line 85
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x1000

    if-le v0, v1, :cond_0

    .line 87
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ObservableWriter;->notifyListeners()V

    .line 89
    :cond_0
    return-void
.end method

.method private notifyListeners()V
    .locals 5

    .line 97
    const/4 v2, 0x0

    .line 98
    iget-object v3, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    monitor-enter v3

    .line 99
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [Lorg/jivesoftware/smack/util/WriterListener;

    .line 100
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 102
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->stringBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 103
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->stringBuilder:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 104
    const/4 v4, 0x0

    :goto_1
    array-length v0, v2

    if-ge v4, v0, :cond_0

    .line 105
    aget-object v0, v2, v4

    invoke-interface {v0, v3}, Lorg/jivesoftware/smack/util/WriterListener;->write(Ljava/lang/String;)V

    .line 104
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 107
    :cond_0
    return-void
.end method


# virtual methods
.method public addWriterListener(Lorg/jivesoftware/smack/util/WriterListener;)V
    .locals 3

    .line 116
    if-nez p1, :cond_0

    .line 117
    return-void

    .line 119
    :cond_0
    iget-object v1, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 120
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 121
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 124
    :goto_0
    return-void
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 57
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/ObservableWriter;->notifyListeners()V

    .line 51
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 52
    return-void
.end method

.method public removeWriterListener(Lorg/jivesoftware/smack/util/WriterListener;)V
    .locals 3

    .line 132
    iget-object v1, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    monitor-enter v1

    .line 133
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 135
    :goto_0
    return-void
.end method

.method public write(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(I)V

    .line 62
    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 74
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ObservableWriter;->maybeNotifyListeners(Ljava/lang/String;)V

    .line 75
    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 80
    add-int v0, p2, p3

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/ObservableWriter;->maybeNotifyListeners(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public write([C)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write([C)V

    .line 67
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([C)V

    .line 68
    invoke-direct {p0, v1}, Lorg/jivesoftware/smack/util/ObservableWriter;->maybeNotifyListeners(Ljava/lang/String;)V

    .line 69
    return-void
.end method

.method public write([CII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lorg/jivesoftware/smack/util/ObservableWriter;->wrappedWriter:Ljava/io/Writer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    .line 44
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 45
    invoke-direct {p0, v1}, Lorg/jivesoftware/smack/util/ObservableWriter;->maybeNotifyListeners(Ljava/lang/String;)V

    .line 46
    return-void
.end method
