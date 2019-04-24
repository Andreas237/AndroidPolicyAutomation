.class public Lcom/tencent/open/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Iterable<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/a/g;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/a/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/a/g;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/tencent/open/a/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/tencent/open/a/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)I
    .locals 2

    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 54
    iget-object v0, p0, Lcom/tencent/open/a/g;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 56
    iget-object v0, p0, Lcom/tencent/open/a/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    return v0
.end method

.method public a(Ljava/io/Writer;[C)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    array-length v0, p2

    if-nez v0, :cond_1

    .line 75
    :cond_0
    return-void

    .line 78
    :cond_1
    const/4 v1, 0x0

    .line 79
    const/4 v2, 0x0

    .line 80
    const/4 v3, 0x0

    .line 82
    const/4 v4, 0x0

    .line 84
    array-length v5, p2

    .line 85
    move v6, v5

    .line 86
    const/4 v7, 0x0

    .line 88
    invoke-virtual {p0}, Lcom/tencent/open/a/g;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    .line 93
    move v1, v2

    .line 96
    :cond_2
    :goto_1
    if-lez v1, :cond_4

    .line 99
    if-le v6, v1, :cond_3

    move v4, v1

    goto :goto_2

    :cond_3
    move v4, v6

    .line 101
    :goto_2
    add-int v0, v3, v4

    invoke-virtual {v9, v3, v0, p2, v7}, Ljava/lang/String;->getChars(II[CI)V

    .line 103
    sub-int/2addr v6, v4

    .line 104
    add-int/2addr v7, v4

    .line 106
    sub-int/2addr v1, v4

    .line 107
    add-int/2addr v3, v4

    .line 109
    if-nez v6, :cond_2

    .line 111
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v5}, Ljava/io/Writer;->write([CII)V

    .line 113
    const/4 v7, 0x0

    .line 114
    move v6, v5

    goto :goto_1

    :cond_4
    goto :goto_0

    .line 121
    :cond_5
    if-lez v7, :cond_6

    .line 123
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v7}, Ljava/io/Writer;->write([CII)V

    .line 127
    :cond_6
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    .line 128
    return-void
.end method

.method public b()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/tencent/open/a/g;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 147
    iget-object v0, p0, Lcom/tencent/open/a/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 148
    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Ljava/lang/String;>;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/tencent/open/a/g;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
