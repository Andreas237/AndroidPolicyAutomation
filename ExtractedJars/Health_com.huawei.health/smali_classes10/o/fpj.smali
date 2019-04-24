.class public Lo/fpj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fov;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fpj$1;,
        Lo/fpj$a;,
        Lo/fpj$e;,
        Lo/fpj$d;
    }
.end annotation


# static fields
.field static final c:Ljava/lang/ThreadGroup;

.field public static final e:Lo/fty;


# instance fields
.field private a:Ljava/net/DatagramSocket;

.field private final b:Ljava/net/InetSocketAddress;

.field private volatile d:Z

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Thread;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Thread;>;"
        }
    .end annotation
.end field

.field private h:Lo/fpg;

.field private final i:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Lo/fpd;>;"
        }
    .end annotation
.end field

.field private volatile k:Lo/foz;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 62
    const-class v0, Lo/fpj;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fpj;->e:Lo/fty;

    .line 66
    new-instance v0, Ljava/lang/ThreadGroup;

    const-string v1, "Californium/Elements"

    invoke-direct {v0, v1}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/fpj;->c:Ljava/lang/ThreadGroup;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 107
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/fpj;-><init>(Ljava/net/InetSocketAddress;)V

    .line 108
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 2

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lo/fpj;->p:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/fpj;->m:I

    .line 94
    const/4 v0, 0x1

    iput v0, p0, Lo/fpj;->l:I

    .line 95
    const/4 v0, 0x1

    iput v0, p0, Lo/fpj;->o:I

    .line 97
    const/16 v0, 0x800

    iput v0, p0, Lo/fpj;->n:I

    .line 117
    if-nez p1, :cond_0

    .line 118
    new-instance v0, Ljava/net/InetSocketAddress;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    iput-object v0, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    goto :goto_0

    .line 120
    :cond_0
    iput-object p1, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    .line 122
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fpj;->d:Z

    .line 125
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/fpj;->i:Ljava/util/concurrent/BlockingQueue;

    .line 126
    return-void
.end method

.method static synthetic a(Lo/fpj;)I
    .locals 1

    .line 60
    iget v0, p0, Lo/fpj;->n:I

    return v0
.end method

.method static synthetic b(Lo/fpj;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/fpj;->i:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

.method static synthetic c(Lo/fpj;)Lo/fpg;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/fpj;->h:Lo/fpg;

    return-object v0
.end method

.method static synthetic d(Lo/fpj;)Ljava/net/DatagramSocket;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    return-object v0
.end method

.method static synthetic e(Lo/fpj;)Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lo/fpj;->d:Z

    return v0
.end method

.method static synthetic k(Lo/fpj;)Lo/foz;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/fpj;->k:Lo/foz;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 4

    monitor-enter p0

    .line 189
    :try_start_0
    iget-boolean v0, p0, Lo/fpj;->d:Z

    if-nez v0, :cond_0

    .line 190
    monitor-exit p0

    return-void

    .line 192
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fpj;->d:Z

    .line 194
    iget-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 195
    iget-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Thread;

    .line 196
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 197
    goto :goto_0

    .line 198
    :cond_1
    iget-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    .line 201
    :cond_2
    iget-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 202
    iget-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Thread;

    .line 203
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 204
    goto :goto_1

    .line 205
    :cond_3
    iget-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    .line 208
    :cond_4
    iget-object v0, p0, Lo/fpj;->i:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 210
    iget-object v0, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object v2

    .line 211
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_5

    .line 212
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 213
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    .line 216
    :cond_5
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "UDPConnector on [{}] has stopped."

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public a(I)V
    .locals 0

    .line 349
    iput p1, p0, Lo/fpj;->p:I

    .line 350
    return-void
.end method

.method public b()Ljava/net/InetSocketAddress;
    .locals 3

    .line 244
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    return-object v0

    .line 245
    :cond_0
    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v1, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->getLocalPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 357
    iput p1, p0, Lo/fpj;->m:I

    .line 358
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 390
    const-string v0, "UDP"

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 381
    iput p1, p0, Lo/fpj;->n:I

    .line 382
    return-void
.end method

.method public c(Lo/fpd;)V
    .locals 2

    .line 226
    if-nez p1, :cond_0

    .line 227
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Message must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 229
    :cond_0
    iget-object v0, p0, Lo/fpj;->i:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 231
    return-void
.end method

.method public c(Lo/fpg;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lo/fpj;->h:Lo/fpg;

    .line 236
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 373
    iput p1, p0, Lo/fpj;->l:I

    .line 374
    return-void
.end method

.method public d(Lo/foz;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/fpj;->k:Lo/foz;

    .line 241
    return-void
.end method

.method public declared-synchronized e()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 131
    :try_start_0
    iget-boolean v0, p0, Lo/fpj;->d:Z

    if-eqz v0, :cond_0

    .line 132
    monitor-exit p0

    return-void

    .line 136
    :cond_0
    new-instance v0, Ljava/net/DatagramSocket;

    iget-object v1, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    iget-object v2, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/net/DatagramSocket;-><init>(ILjava/net/InetAddress;)V

    iput-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    .line 138
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fpj;->d:Z

    .line 140
    iget v0, p0, Lo/fpj;->p:I

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    iget v1, p0, Lo/fpj;->p:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setReceiveBufferSize(I)V

    .line 143
    :cond_1
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getReceiveBufferSize()I

    move-result v0

    iput v0, p0, Lo/fpj;->p:I

    .line 145
    iget v0, p0, Lo/fpj;->m:I

    if-eqz v0, :cond_2

    .line 146
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    iget v1, p0, Lo/fpj;->m:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setSendBufferSize(I)V

    .line 148
    :cond_2
    iget-object v0, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getSendBufferSize()I

    move-result v0

    iput v0, p0, Lo/fpj;->m:I

    .line 151
    sget-object v0, Lo/fpj;->e:Lo/fty;

    const-string v1, "UDPConnector starts up {} sender threads and {} receiver threads"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lo/fpj;->l:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fpj;->o:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    .line 155
    const/4 v5, 0x0

    :goto_0
    iget v0, p0, Lo/fpj;->o:I

    if-ge v5, v0, :cond_3

    .line 156
    iget-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    new-instance v1, Lo/fpj$e;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UDP-Receiver-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lo/fpj$e;-><init>(Lo/fpj;Ljava/lang/String;Lo/fpj$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 159
    :cond_3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    .line 160
    const/4 v5, 0x0

    :goto_1
    iget v0, p0, Lo/fpj;->l:I

    if-ge v5, v0, :cond_4

    .line 161
    iget-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    new-instance v1, Lo/fpj$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UDP-Sender-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fpj;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Lo/fpj$a;-><init>(Lo/fpj;Ljava/lang/String;Lo/fpj$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 164
    :cond_4
    iget-object v0, p0, Lo/fpj;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Thread;

    .line 165
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 166
    goto :goto_2

    .line 167
    :cond_5
    iget-object v0, p0, Lo/fpj;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Thread;

    .line 168
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 169
    goto :goto_3

    .line 178
    :cond_6
    sget-object v0, Lo/fpj;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UDPConnector listening on "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/fpj;->a:Ljava/net/DatagramSocket;

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recv buf = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fpj;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", send buf = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fpj;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recv packet size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fpj;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 183
    sget-object v0, Lo/fpj;->e:Lo/fty;

    invoke-interface {v0, v5}, Lo/fty;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    :cond_7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5
.end method

.method public e(I)V
    .locals 0

    .line 365
    iput p1, p0, Lo/fpj;->o:I

    .line 366
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 395
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lo/fpj;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fpj;->b()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
