.class final Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;
.super Ljava/lang/Object;
.source "SegmentHandler.kt"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/binary/SegmentHandler;->getSegment(Lokhttp3/HttpUrl;Ljava/util/Map;)Lio/streamroot/dna/core/binary/SegmentResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSegmentHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentHandler.kt\nio/streamroot/dna/core/binary/SegmentHandler$getSegment$1\n*L\n1#1,63:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "binaryData",
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        "onReceiveValue"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $data:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic $lock:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->$data:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->$lock:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Lio/streamroot/dna/core/binary/store/BinaryData;)V
    .locals 2
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->$data:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lio/streamroot/dna/core/binary/SegmentHandler;->access$getDummyBinaryData$cp()Lio/streamroot/dna/core/binary/store/BinaryData;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    iget-object p1, p0, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->$lock:Ljava/lang/Object;

    monitor-enter p1

    .line 36
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->$lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 37
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/binary/SegmentHandler$getSegment$1;->onReceiveValue(Lio/streamroot/dna/core/binary/store/BinaryData;)V

    return-void
.end method
