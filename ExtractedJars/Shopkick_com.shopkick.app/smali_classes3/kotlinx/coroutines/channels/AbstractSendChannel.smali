.class public abstract Lkotlinx/coroutines/channels/AbstractSendChannel;
.super Ljava/lang/Object;
.source "AbstractChannel.kt"

# interfaces
.implements Lkotlinx/coroutines/channels/SendChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;,
        Lkotlinx/coroutines/channels/AbstractSendChannel$SendConflatedDesc;,
        Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;,
        Lkotlinx/coroutines/channels/AbstractSendChannel$TryEnqueueSendDesc;,
        Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;,
        Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/channels/SendChannel<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractSendChannel\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1086:1\n300#2,7:1087\n159#2,4:1094\n159#2,4:1098\n159#2,4:1108\n171#2:1112\n84#2,3:1113\n172#2,6:1116\n159#2,4:1122\n300#2,7:1126\n176#3,6:1102\n677#4,6:1133\n*E\n*S KotlinDebug\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractSendChannel\n*L\n92#1,7:1087\n100#1,4:1094\n114#1,4:1098\n227#1,4:1108\n232#1:1112\n232#1,3:1113\n232#1,6:1116\n250#1,4:1122\n340#1,7:1126\n185#1,6:1102\n455#1,6:1133\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008 \u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0006WXYZ[\\B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u000f2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(H\u0004J\u0008\u0010)\u001a\u00020*H\u0002J!\u0010+\u001a\u000e\u0012\u0002\u0008\u00030,j\u0006\u0012\u0002\u0008\u0003`-2\u0006\u0010.\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010/J!\u00100\u001a\u000e\u0012\u0002\u0008\u00030,j\u0006\u0012\u0002\u0008\u0003`-2\u0006\u0010.\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010/J\u001b\u00101\u001a\u0008\u0012\u0004\u0012\u00028\u0000022\u0006\u0010.\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u00162\u0006\u00105\u001a\u000206H\u0002J\u0014\u00107\u001a\u00020\"2\n\u00108\u001a\u0006\u0012\u0002\u0008\u00030\tH\u0002J\"\u00109\u001a\u00020\"2\u0018\u0010:\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\"0;j\u0002`<H\u0016J\u0012\u0010=\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0013\u0010>\u001a\u00020\u000f2\u0006\u0010.\u001a\u00028\u0000\u00a2\u0006\u0002\u0010?J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010.\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010AJ!\u0010B\u001a\u00020\u00162\u0006\u0010.\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\u0008\u00030DH\u0014\u00a2\u0006\u0002\u0010EJ\u0016\u0010F\u001a\u00020\"2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0014JV\u0010G\u001a\u00020\"\"\u0004\u0008\u0001\u0010H2\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u0002HH0D2\u0006\u0010.\u001a\u00028\u00002(\u0010I\u001a$\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002HH0K\u0012\u0006\u0012\u0004\u0018\u00010\u00160JH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u0019\u00105\u001a\u00020\"2\u0006\u0010.\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001b\u0010N\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010O2\u0006\u0010.\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010PJ\u001b\u0010Q\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010O2\u0006\u0010.\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010PJ\u0019\u0010R\u001a\u00020\"2\u0006\u0010.\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u0010\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010OH\u0014J\n\u0010T\u001a\u0004\u0018\u00010UH\u0004J\u0008\u0010V\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\t8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\t8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0007\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006]"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/AbstractSendChannel;",
        "E",
        "Lkotlinx/coroutines/channels/SendChannel;",
        "()V",
        "bufferDebugString",
        "",
        "getBufferDebugString",
        "()Ljava/lang/String;",
        "closedForReceive",
        "Lkotlinx/coroutines/channels/Closed;",
        "getClosedForReceive",
        "()Lkotlinx/coroutines/channels/Closed;",
        "closedForSend",
        "getClosedForSend",
        "isBufferAlwaysFull",
        "",
        "()Z",
        "isBufferFull",
        "isClosedForSend",
        "isFull",
        "onCloseHandler",
        "Lkotlinx/atomicfu/AtomicRef;",
        "",
        "onSend",
        "Lkotlinx/coroutines/selects/SelectClause2;",
        "getOnSend",
        "()Lkotlinx/coroutines/selects/SelectClause2;",
        "queue",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;",
        "getQueue",
        "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;",
        "queueDebugStateString",
        "getQueueDebugStateString",
        "afterClose",
        "",
        "cause",
        "",
        "close",
        "conflatePreviousSendBuffered",
        "node",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;",
        "countQueueSize",
        "",
        "describeSendBuffered",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;",
        "Lkotlinx/coroutines/internal/AddLastDesc;",
        "element",
        "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;",
        "describeSendConflated",
        "describeTryOffer",
        "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;",
        "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;",
        "enqueueSend",
        "send",
        "Lkotlinx/coroutines/channels/SendElement;",
        "helpClose",
        "closed",
        "invokeOnClose",
        "handler",
        "Lkotlin/Function1;",
        "Lkotlinx/coroutines/channels/Handler;",
        "invokeOnCloseHandler",
        "offer",
        "(Ljava/lang/Object;)Z",
        "offerInternal",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "offerSelectInternal",
        "select",
        "Lkotlinx/coroutines/selects/SelectInstance;",
        "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;",
        "onClosed",
        "registerSelectSend",
        "R",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sendBuffered",
        "Lkotlinx/coroutines/channels/ReceiveOrClosed;",
        "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;",
        "sendConflated",
        "sendSuspend",
        "takeFirstReceiveOrPeekClosed",
        "takeFirstSendOrPeekClosed",
        "Lkotlinx/coroutines/channels/Send;",
        "toString",
        "SendBuffered",
        "SendBufferedDesc",
        "SendConflatedDesc",
        "SendSelect",
        "TryEnqueueSendDesc",
        "TryOfferDesc",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final onCloseHandler$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile onCloseHandler:Ljava/lang/Object;

.field private final queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/channels/AbstractSendChannel;

    const-class v1, Ljava/lang/Object;

    const-string v2, "onCloseHandler"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;-><init>()V

    iput-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$enqueueSend(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/channels/SendElement;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/SendElement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 19
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->enqueueSend(Lkotlinx/coroutines/channels/SendElement;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$helpClose(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/channels/Closed;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/Closed;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->helpClose(Lkotlinx/coroutines/channels/Closed;)V

    return-void
.end method

.method public static final synthetic access$registerSelectSend(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/coroutines/channels/AbstractSendChannel;->registerSelectSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method private final countQueueSize()I
    .locals 4

    .line 455
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1133
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    const/4 v2, 0x0

    .line 1134
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    .line 1135
    instance-of v3, v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 1136
    :cond_0
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v1

    goto :goto_0

    :cond_1
    return v2

    .line 1133
    :cond_2
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final enqueueSend(Lkotlinx/coroutines/channels/SendElement;)Ljava/lang/Object;
    .locals 4

    .line 226
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->isBufferAlwaysFull()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 227
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1109
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 228
    instance-of v2, v1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-eqz v2, :cond_1

    return-object v1

    .line 1111
    :cond_1
    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-virtual {v1, v2, v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->addNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 1109
    :cond_2
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 232
    :cond_3
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1113
    new-instance v1, Lkotlinx/coroutines/channels/AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1;

    check-cast p1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {v1, p1, p1, p0}, Lkotlinx/coroutines/channels/AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/channels/AbstractSendChannel;)V

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;

    .line 1117
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 233
    instance-of v3, v2, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-eqz v3, :cond_4

    return-object v2

    .line 1119
    :cond_4
    invoke-virtual {v2, p1, v0, v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->tryCondAddNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_1

    :pswitch_1
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_5

    .line 236
    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->ENQUEUE_FAILED:Ljava/lang/Object;

    return-object p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return-object p1

    .line 1117
    :cond_6
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getQueueDebugStateString()Ljava/lang/String;
    .locals 3

    .line 437
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    .line 438
    iget-object v1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    if-ne v0, v1, :cond_0

    const-string v0, "EmptyQueue"

    return-object v0

    .line 440
    :cond_0
    instance-of v1, v0, Lkotlinx/coroutines/channels/Closed;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 441
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/channels/Receive;

    if-eqz v1, :cond_2

    const-string v1, "ReceiveQueued"

    goto :goto_0

    .line 442
    :cond_2
    instance-of v1, v0, Lkotlinx/coroutines/channels/Send;

    if-eqz v1, :cond_3

    const-string v1, "SendQueued"

    goto :goto_0

    .line 443
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UNEXPECTED:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 445
    :goto_0
    iget-object v2, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v2

    if-eq v2, v0, :cond_4

    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",queueSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->countQueueSize()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 448
    instance-of v0, v2, Lkotlinx/coroutines/channels/Closed;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",closedForSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    return-object v1
.end method

.method private final helpClose(Lkotlinx/coroutines/channels/Closed;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/Closed<",
            "*>;)V"
        }
    .end annotation

    .line 305
    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/channels/Closed;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    .line 307
    instance-of v1, v0, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    if-nez v1, :cond_2

    instance-of v1, v0, Lkotlinx/coroutines/channels/Receive;

    if-nez v1, :cond_0

    goto :goto_1

    .line 311
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->remove()Z

    move-result v1

    if-nez v1, :cond_1

    .line 314
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->helpRemove()V

    goto :goto_0

    .line 319
    :cond_1
    check-cast v0, Lkotlinx/coroutines/channels/Receive;

    .line 320
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/channels/Receive;->resumeReceiveClosed(Lkotlinx/coroutines/channels/Closed;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final invokeOnCloseHandler(Ljava/lang/Throwable;)V
    .locals 3

    .line 265
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 267
    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->HANDLER_INVOKED:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    sget-object v1, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Lkotlinx/coroutines/channels/AbstractChannelKt;->HANDLER_INVOKED:Ljava/lang/Object;

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 270
    invoke-static {v0, v1}, Lkotlin/jvm/internal/TypeIntrinsics;->beforeCheckcastToFunctionOfArity(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final registerSelectSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;TE;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lkotlinx/coroutines/channels/SendChannel<",
            "-TE;>;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 404
    :goto_0
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 405
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->isFull()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 406
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$TryEnqueueSendDesc;

    invoke-direct {v0, p0, p2, p1, p3}, Lkotlinx/coroutines/channels/AbstractSendChannel$TryEnqueueSendDesc;-><init>(Lkotlinx/coroutines/channels/AbstractSendChannel;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V

    .line 407
    check-cast v0, Lkotlinx/coroutines/internal/AtomicDesc;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/selects/SelectInstance;->performAtomicIfNotSelected(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 409
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->getALREADY_SELECTED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-void

    .line 410
    :cond_1
    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->ENQUEUE_FAILED:Ljava/lang/Object;

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 411
    :cond_2
    instance-of p1, v0, Lkotlinx/coroutines/channels/Closed;

    if-eqz p1, :cond_3

    check-cast v0, Lkotlinx/coroutines/channels/Closed;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    .line 412
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "performAtomicIfNotSelected(TryEnqueueSendDesc) returned "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    :cond_4
    return-void

    .line 415
    :cond_5
    invoke-virtual {p0, p2, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->offerSelectInternal(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;

    move-result-object v0

    .line 417
    invoke-static {}, Lkotlinx/coroutines/selects/SelectKt;->getALREADY_SELECTED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_6

    return-void

    .line 418
    :cond_6
    sget-object v1, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_FAILED:Ljava/lang/Object;

    if-ne v0, v1, :cond_7

    goto :goto_0

    .line 419
    :cond_7
    sget-object p2, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_SUCCESS:Ljava/lang/Object;

    if-ne v0, p2, :cond_8

    .line 420
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p3, p0, p1}, Lkotlinx/coroutines/intrinsics/UndispatchedKt;->startCoroutineUnintercepted(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    return-void

    .line 423
    :cond_8
    instance-of p1, v0, Lkotlinx/coroutines/channels/Closed;

    if-eqz p1, :cond_9

    check-cast v0, Lkotlinx/coroutines/channels/Closed;

    invoke-virtual {v0}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    .line 424
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "offerSelectInternal returned "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method


# virtual methods
.method protected afterClose(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public close(Ljava/lang/Throwable;)Z
    .locals 6
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 242
    new-instance v0, Lkotlinx/coroutines/channels/Closed;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/channels/Closed;-><init>(Ljava/lang/Throwable;)V

    .line 250
    iget-object v1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1123
    :cond_0
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 250
    instance-of v3, v2, Lkotlinx/coroutines/channels/Closed;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    if-nez v3, :cond_2

    move v1, v5

    goto :goto_1

    .line 1125
    :cond_2
    move-object v3, v0

    check-cast v3, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-virtual {v2, v3, v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->addNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v1, v4

    :goto_1
    if-nez v1, :cond_4

    .line 252
    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lkotlinx/coroutines/channels/Closed;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->helpClose(Lkotlinx/coroutines/channels/Closed;)V

    return v5

    :cond_3
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 256
    :cond_4
    invoke-direct {p0, v0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->helpClose(Lkotlinx/coroutines/channels/Closed;)V

    .line 257
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->invokeOnCloseHandler(Ljava/lang/Throwable;)V

    .line 259
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->onClosed(Lkotlinx/coroutines/channels/Closed;)V

    .line 260
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->afterClose(Ljava/lang/Throwable;)V

    return v4

    .line 1123
    :cond_5
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final conflatePreviousSendBuffered(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object p1

    .line 127
    instance-of v0, p1, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;->remove()Z

    :cond_1
    return-void
.end method

.method protected final describeSendBuffered(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 133
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;

    iget-object v1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;

    return-object v0
.end method

.method protected final describeSendConflated(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 148
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$SendConflatedDesc;

    iget-object v1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$SendConflatedDesc;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;

    return-object v0
.end method

.method protected final describeTryOffer(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 347
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;

    iget-object v1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-direct {v0, p1, v1}, Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V

    return-object v0
.end method

.method protected getBufferDebugString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    return-object v0
.end method

.method protected final getClosedForReceive()Lkotlinx/coroutines/channels/Closed;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/Closed<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 85
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/channels/Closed;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Lkotlinx/coroutines/channels/Closed;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->helpClose(Lkotlinx/coroutines/channels/Closed;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    return-object v0
.end method

.method protected final getClosedForSend()Lkotlinx/coroutines/channels/Closed;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/Closed<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 79
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/channels/Closed;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Lkotlinx/coroutines/channels/Closed;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->helpClose(Lkotlinx/coroutines/channels/Closed;)V

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    return-object v0
.end method

.method public final getOnSend()Lkotlinx/coroutines/selects/SelectClause2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/selects/SelectClause2<",
            "TE;",
            "Lkotlinx/coroutines/channels/SendChannel<",
            "TE;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 396
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$onSend$1;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/channels/AbstractSendChannel$onSend$1;-><init>(Lkotlinx/coroutines/channels/AbstractSendChannel;)V

    check-cast v0, Lkotlinx/coroutines/selects/SelectClause2;

    return-object v0
.end method

.method protected final getQueue()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    return-object v0
.end method

.method public invokeOnClose(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    sget-object v0, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 277
    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler:Ljava/lang/Object;

    .line 278
    sget-object v0, Lkotlinx/coroutines/channels/AbstractChannelKt;->HANDLER_INVOKED:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    .line 279
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Another handler was already registered and successfully invoked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 282
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Another handler was already registered: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 284
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->getClosedForSend()Lkotlinx/coroutines/channels/Closed;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 285
    sget-object v1, Lkotlinx/coroutines/channels/AbstractSendChannel;->onCloseHandler$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v2, Lkotlinx/coroutines/channels/AbstractChannelKt;->HANDLER_INVOKED:Ljava/lang/Object;

    invoke-virtual {v1, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 287
    iget-object v0, v0, Lkotlinx/coroutines/channels/Closed;->closeCause:Ljava/lang/Throwable;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method protected abstract isBufferAlwaysFull()Z
.end method

.method protected abstract isBufferFull()Z
.end method

.method public final isClosedForSend()Z
    .locals 1

    .line 163
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->getClosedForSend()Lkotlinx/coroutines/channels/Closed;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isFull()Z
    .locals 1

    .line 164
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->isBufferFull()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 174
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->offerInternal(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 176
    sget-object v0, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_SUCCESS:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 179
    :cond_0
    sget-object v0, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_FAILED:Ljava/lang/Object;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->getClosedForSend()Lkotlinx/coroutines/channels/Closed;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 180
    :cond_3
    instance-of v0, p1, Lkotlinx/coroutines/channels/Closed;

    if-eqz v0, :cond_4

    check-cast p1, Lkotlinx/coroutines/channels/Closed;

    invoke-virtual {p1}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    .line 181
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offerInternal returned "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method protected offerInternal(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->takeFirstReceiveOrPeekClosed()Lkotlinx/coroutines/channels/ReceiveOrClosed;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 50
    invoke-interface {v0, p1, v1}, Lkotlinx/coroutines/channels/ReceiveOrClosed;->tryResumeReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 52
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/ReceiveOrClosed;->completeResumeReceive(Ljava/lang/Object;)V

    .line 53
    invoke-interface {v0}, Lkotlinx/coroutines/channels/ReceiveOrClosed;->getOfferResult()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 49
    :cond_1
    sget-object p1, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_FAILED:Ljava/lang/Object;

    return-object p1
.end method

.method protected offerSelectInternal(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "select"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->describeTryOffer(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;

    move-result-object p1

    .line 66
    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/internal/AtomicDesc;

    invoke-interface {p2, v0}, Lkotlinx/coroutines/selects/SelectInstance;->performAtomicTrySelect(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    .line 68
    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    .line 69
    iget-object p1, p1, Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;->resumeToken:Ljava/lang/Object;

    if-nez p1, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-interface {p2, p1}, Lkotlinx/coroutines/channels/ReceiveOrClosed;->completeResumeReceive(Ljava/lang/Object;)V

    .line 70
    invoke-interface {p2}, Lkotlinx/coroutines/channels/ReceiveOrClosed;->getOfferResult()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected onClosed(Lkotlinx/coroutines/channels/Closed;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/channels/Closed;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/Closed<",
            "-TE;>;)V"
        }
    .end annotation

    const-string v0, "closed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 168
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 170
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/AbstractSendChannel;->sendSuspend(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final sendBuffered(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lkotlinx/coroutines/channels/ReceiveOrClosed<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 100
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    new-instance v1, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;

    invoke-direct {v1, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1095
    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 101
    instance-of v2, p1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    return-object p1

    .line 1097
    :cond_1
    invoke-virtual {p1, v1, v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->addNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1095
    :cond_2
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final sendConflated(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lkotlinx/coroutines/channels/ReceiveOrClosed<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 113
    new-instance v0, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;-><init>(Ljava/lang/Object;)V

    .line 114
    iget-object p1, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1099
    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 115
    instance-of v2, v1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-eqz v2, :cond_1

    check-cast v1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    return-object v1

    .line 1101
    :cond_1
    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->addNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 118
    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-virtual {p0, v0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->conflatePreviousSendBuffered(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V

    const/4 p1, 0x0

    return-object p1

    .line 1099
    :cond_2
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final synthetic sendSuspend(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1103
    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 1105
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    .line 186
    new-instance v2, Lkotlinx/coroutines/channels/SendElement;

    invoke-direct {v2, p1, v1}, Lkotlinx/coroutines/channels/SendElement;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V

    .line 188
    :goto_0
    invoke-static {p0, v2}, Lkotlinx/coroutines/channels/AbstractSendChannel;->access$enqueueSend(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/channels/SendElement;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    .line 191
    invoke-interface {v1}, Lkotlinx/coroutines/CancellableContinuation;->initCancellability()V

    .line 192
    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-static {v1, v2}, Lkotlinx/coroutines/CancellableContinuationKt;->removeOnCancellation(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V

    goto :goto_1

    .line 195
    :cond_0
    instance-of v4, v3, Lkotlinx/coroutines/channels/Closed;

    if-eqz v4, :cond_1

    .line 196
    check-cast v3, Lkotlinx/coroutines/channels/Closed;

    invoke-static {p0, v3}, Lkotlinx/coroutines/channels/AbstractSendChannel;->access$helpClose(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/channels/Closed;)V

    .line 197
    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {v3}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    .line 202
    :cond_1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/AbstractSendChannel;->offerInternal(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 204
    sget-object v4, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_SUCCESS:Ljava/lang/Object;

    if-ne v3, v4, :cond_2

    .line 205
    check-cast v1, Lkotlin/coroutines/Continuation;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    .line 208
    :cond_2
    sget-object v4, Lkotlinx/coroutines/channels/AbstractChannelKt;->OFFER_FAILED:Ljava/lang/Object;

    if-ne v3, v4, :cond_3

    goto :goto_0

    .line 209
    :cond_3
    instance-of p1, v3, Lkotlinx/coroutines/channels/Closed;

    if-eqz p1, :cond_5

    .line 210
    check-cast v3, Lkotlinx/coroutines/channels/Closed;

    invoke-static {p0, v3}, Lkotlinx/coroutines/channels/AbstractSendChannel;->access$helpClose(Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/channels/Closed;)V

    .line 211
    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {v3}, Lkotlinx/coroutines/channels/Closed;->getSendException()Ljava/lang/Throwable;

    move-result-object p1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1106
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object p1

    .line 1102
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_4

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_4
    return-object p1

    .line 214
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "offerInternal returned "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
.end method

.method protected takeFirstReceiveOrPeekClosed()Lkotlinx/coroutines/channels/ReceiveOrClosed;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/ReceiveOrClosed<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 340
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1127
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1128
    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_2

    .line 1129
    :cond_0
    instance-of v2, v1, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    if-nez v2, :cond_1

    goto :goto_2

    .line 1130
    :cond_1
    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    .line 340
    instance-of v2, v2, Lkotlinx/coroutines/channels/Closed;

    if-eqz v2, :cond_2

    goto :goto_1

    .line 1131
    :cond_2
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->remove()Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    move-object v3, v1

    .line 1126
    :goto_2
    check-cast v3, Lkotlinx/coroutines/channels/ReceiveOrClosed;

    return-object v3

    .line 1132
    :cond_3
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->helpDelete()V

    goto :goto_0

    .line 1127
    :cond_4
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final takeFirstSendOrPeekClosed()Lkotlinx/coroutines/channels/Send;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 92
    iget-object v0, p0, Lkotlinx/coroutines/channels/AbstractSendChannel;->queue:Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    .line 1088
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1089
    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_2

    .line 1090
    :cond_0
    instance-of v2, v1, Lkotlinx/coroutines/channels/Send;

    if-nez v2, :cond_1

    goto :goto_2

    .line 1091
    :cond_1
    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/channels/Send;

    .line 92
    instance-of v2, v2, Lkotlinx/coroutines/channels/Closed;

    if-eqz v2, :cond_2

    goto :goto_1

    .line 1092
    :cond_2
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->remove()Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    move-object v3, v1

    .line 1087
    :goto_2
    check-cast v3, Lkotlinx/coroutines/channels/Send;

    return-object v3

    .line 1093
    :cond_3
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->helpDelete()V

    goto :goto_0

    .line 1088
    :cond_4
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 433
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getHexAddress(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->getQueueDebugStateString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlinx/coroutines/channels/AbstractSendChannel;->getBufferDebugString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
