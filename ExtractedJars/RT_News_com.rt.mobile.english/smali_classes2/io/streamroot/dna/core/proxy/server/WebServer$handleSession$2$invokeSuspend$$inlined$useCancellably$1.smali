.class public final Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ClosableExtension.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClosableExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClosableExtension.kt\nio/streamroot/dna/core/utils/ClosableExtensionKt$useCancellably$2$1\n*L\n1#1,21:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u000c\u0008\u0000\u0010\u0002\u0018\u0001*\u0004\u0018\u00010\u0003\"\u0004\u0008\u0001\u0010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Ljava/io/Closeable;",
        "R",
        "it",
        "",
        "invoke",
        "io/streamroot/dna/core/utils/ClosableExtensionKt$useCancellably$2$1",
        "io/streamroot/dna/core/proxy/server/WebServer$handleSession$2$useCancellably$$inlined$suspendCancellableCoroutine$lambda$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $receiver$0$inlined:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $this_useCancellably$inlined:Ljava/io/Closeable;

.field final synthetic this$0:Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;


# direct methods
.method public constructor <init>(Ljava/io/Closeable;Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;->$this_useCancellably$inlined:Ljava/io/Closeable;

    iput-object p2, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;->this$0:Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2;

    iput-object p3, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;->$receiver$0$inlined:Lkotlinx/coroutines/CoroutineScope;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 10
    iget-object p1, p0, Lio/streamroot/dna/core/proxy/server/WebServer$handleSession$2$invokeSuspend$$inlined$useCancellably$1;->$this_useCancellably$inlined:Ljava/io/Closeable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method
