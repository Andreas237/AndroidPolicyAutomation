.class public abstract Lorg/jivesoftware/smack/debugger/AbstractDebugger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/debugger/SmackDebugger;


# static fields
.field private static printInterpreted:Z


# instance fields
.field private final connListener:Lorg/jivesoftware/smack/ConnectionListener;

.field private final connection:Lorg/jivesoftware/smack/XMPPConnection;

.field private final listener:Lorg/jivesoftware/smack/StanzaListener;

.field private reader:Lorg/jivesoftware/smack/util/ObservableReader;

.field private final readerListener:Lorg/jivesoftware/smack/util/ReaderListener;

.field private writer:Lorg/jivesoftware/smack/util/ObservableWriter;

.field private final writerListener:Lorg/jivesoftware/smack/util/WriterListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-boolean v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->printInterpreted:Z

    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 50
    new-instance v0, Lorg/jivesoftware/smack/util/ObservableReader;

    invoke-direct {v0, p3}, Lorg/jivesoftware/smack/util/ObservableReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    .line 51
    new-instance v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger$1;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/debugger/AbstractDebugger$1;-><init>(Lorg/jivesoftware/smack/debugger/AbstractDebugger;Lorg/jivesoftware/smack/XMPPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->readerListener:Lorg/jivesoftware/smack/util/ReaderListener;

    .line 57
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->readerListener:Lorg/jivesoftware/smack/util/ReaderListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/ObservableReader;->addReaderListener(Lorg/jivesoftware/smack/util/ReaderListener;)V

    .line 60
    new-instance v0, Lorg/jivesoftware/smack/util/ObservableWriter;

    invoke-direct {v0, p2}, Lorg/jivesoftware/smack/util/ObservableWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    .line 61
    new-instance v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger$5;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/debugger/AbstractDebugger$5;-><init>(Lorg/jivesoftware/smack/debugger/AbstractDebugger;Lorg/jivesoftware/smack/XMPPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writerListener:Lorg/jivesoftware/smack/util/WriterListener;

    .line 67
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writerListener:Lorg/jivesoftware/smack/util/WriterListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/ObservableWriter;->addWriterListener(Lorg/jivesoftware/smack/util/WriterListener;)V

    .line 72
    new-instance v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger$3;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/debugger/AbstractDebugger$3;-><init>(Lorg/jivesoftware/smack/debugger/AbstractDebugger;Lorg/jivesoftware/smack/XMPPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->listener:Lorg/jivesoftware/smack/StanzaListener;

    .line 81
    new-instance v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger$2;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/debugger/AbstractDebugger$2;-><init>(Lorg/jivesoftware/smack/debugger/AbstractDebugger;Lorg/jivesoftware/smack/XMPPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connListener:Lorg/jivesoftware/smack/ConnectionListener;

    .line 132
    return-void
.end method

.method static synthetic access$000()Z
    .locals 1

    .line 32
    sget-boolean v0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->printInterpreted:Z

    return v0
.end method


# virtual methods
.method public getReader()Ljava/io/Reader;
    .locals 1

    .line 176
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    return-object v0
.end method

.method public getReaderListener()Lorg/jivesoftware/smack/StanzaListener;
    .locals 1

    .line 186
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->listener:Lorg/jivesoftware/smack/StanzaListener;

    return-object v0
.end method

.method public getWriter()Ljava/io/Writer;
    .locals 1

    .line 181
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    return-object v0
.end method

.method public getWriterListener()Lorg/jivesoftware/smack/StanzaListener;
    .locals 1

    .line 191
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract log(Ljava/lang/String;)V
.end method

.method protected abstract log(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public newConnectionReader(Ljava/io/Reader;)Ljava/io/Reader;
    .locals 3

    .line 140
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->readerListener:Lorg/jivesoftware/smack/util/ReaderListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/ObservableReader;->removeReaderListener(Lorg/jivesoftware/smack/util/ReaderListener;)V

    .line 141
    new-instance v2, Lorg/jivesoftware/smack/util/ObservableReader;

    invoke-direct {v2, p1}, Lorg/jivesoftware/smack/util/ObservableReader;-><init>(Ljava/io/Reader;)V

    .line 142
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->readerListener:Lorg/jivesoftware/smack/util/ReaderListener;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/ObservableReader;->addReaderListener(Lorg/jivesoftware/smack/util/ReaderListener;)V

    .line 143
    iput-object v2, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    .line 144
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->reader:Lorg/jivesoftware/smack/util/ObservableReader;

    return-object v0
.end method

.method public newConnectionWriter(Ljava/io/Writer;)Ljava/io/Writer;
    .locals 3

    .line 149
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writerListener:Lorg/jivesoftware/smack/util/WriterListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/ObservableWriter;->removeWriterListener(Lorg/jivesoftware/smack/util/WriterListener;)V

    .line 150
    new-instance v2, Lorg/jivesoftware/smack/util/ObservableWriter;

    invoke-direct {v2, p1}, Lorg/jivesoftware/smack/util/ObservableWriter;-><init>(Ljava/io/Writer;)V

    .line 151
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writerListener:Lorg/jivesoftware/smack/util/WriterListener;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/ObservableWriter;->addWriterListener(Lorg/jivesoftware/smack/util/WriterListener;)V

    .line 152
    iput-object v2, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->writer:Lorg/jivesoftware/smack/util/ObservableWriter;

    return-object v0
.end method

.method public userHasLogged(Lo/fti;)V
    .locals 5

    .line 158
    invoke-interface {p1}, Lo/fti;->c()Lo/ftr;

    move-result-object v0

    invoke-virtual {v0}, Lo/ftr;->toString()Ljava/lang/String;

    move-result-object v2

    .line 159
    const-string v0, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "User logged ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 161
    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->getConnectionCounter()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-eqz v3, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 164
    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 166
    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Lo/fti;->e()Lo/ftp;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 168
    invoke-virtual {p0, v4}, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->log(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/debugger/AbstractDebugger;->connListener:Lorg/jivesoftware/smack/ConnectionListener;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/XMPPConnection;->addConnectionListener(Lorg/jivesoftware/smack/ConnectionListener;)V

    .line 172
    return-void
.end method
