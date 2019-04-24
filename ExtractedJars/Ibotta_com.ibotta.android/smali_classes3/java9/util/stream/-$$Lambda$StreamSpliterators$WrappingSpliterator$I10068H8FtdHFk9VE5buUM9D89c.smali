.class public final synthetic Ljava9/util/stream/-$$Lambda$StreamSpliterators$WrappingSpliterator$I10068H8FtdHFk9VE5buUM9D89c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BooleanSupplier;


# instance fields
.field private final synthetic f$0:Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$WrappingSpliterator$I10068H8FtdHFk9VE5buUM9D89c;->f$0:Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 1

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$WrappingSpliterator$I10068H8FtdHFk9VE5buUM9D89c;->f$0:Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;

    invoke-static {v0}, Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;->lambda$initPartialTraversalState$61(Ljava9/util/stream/StreamSpliterators$WrappingSpliterator;)Z

    move-result v0

    return v0
.end method
