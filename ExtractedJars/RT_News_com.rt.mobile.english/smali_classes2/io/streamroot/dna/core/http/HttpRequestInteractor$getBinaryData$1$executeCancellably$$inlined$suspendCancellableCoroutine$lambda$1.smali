.class public final Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$executeCancellably$$inlined$suspendCancellableCoroutine$lambda$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CallExtension.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/utils/CallExtensionKt;->executeCancellably(Lokhttp3/Call;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nCallExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallExtension.kt\nio/streamroot/dna/core/utils/CallExtensionKt$executeCancellably$2$1\n*L\n1#1,13:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke",
        "io/streamroot/dna/core/utils/CallExtensionKt$executeCancellably$2$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $block$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $this_executeCancellably$inlined:Lokhttp3/Call;


# direct methods
.method public constructor <init>(Lokhttp3/Call;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$executeCancellably$$inlined$suspendCancellableCoroutine$lambda$1;->$this_executeCancellably$inlined:Lokhttp3/Call;

    iput-object p2, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$executeCancellably$$inlined$suspendCancellableCoroutine$lambda$1;->$block$inlined:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$executeCancellably$$inlined$suspendCancellableCoroutine$lambda$1;->invoke(Ljava/lang/Throwable;)V

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
    iget-object p1, p0, Lio/streamroot/dna/core/http/HttpRequestInteractor$getBinaryData$1$executeCancellably$$inlined$suspendCancellableCoroutine$lambda$1;->$this_executeCancellably$inlined:Lokhttp3/Call;

    invoke-interface {p1}, Lokhttp3/Call;->cancel()V

    return-void
.end method
