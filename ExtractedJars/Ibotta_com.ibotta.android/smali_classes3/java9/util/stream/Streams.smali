.class final Ljava9/util/stream/Streams;
.super Ljava/lang/Object;
.source "Streams.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/stream/Streams$ConcatSpliterator;,
        Ljava9/util/stream/Streams$DoubleStreamBuilderImpl;,
        Ljava9/util/stream/Streams$LongStreamBuilderImpl;,
        Ljava9/util/stream/Streams$IntStreamBuilderImpl;,
        Ljava9/util/stream/Streams$StreamBuilderImpl;,
        Ljava9/util/stream/Streams$AbstractStreamBuilderImpl;,
        Ljava9/util/stream/Streams$RangeLongSpliterator;,
        Ljava9/util/stream/Streams$RangeIntSpliterator;
    }
.end annotation


# direct methods
.method static composeWithExceptions(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    .line 839
    new-instance v0, Ljava9/util/stream/Streams$1;

    invoke-direct {v0, p0, p1}, Ljava9/util/stream/Streams$1;-><init>(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-object v0
.end method

.method static composedClose(Ljava9/util/stream/BaseStream;Ljava9/util/stream/BaseStream;)Ljava/lang/Runnable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/BaseStream<",
            "**>;",
            "Ljava9/util/stream/BaseStream<",
            "**>;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    .line 871
    new-instance v0, Ljava9/util/stream/Streams$2;

    invoke-direct {v0, p0, p1}, Ljava9/util/stream/Streams$2;-><init>(Ljava9/util/stream/BaseStream;Ljava9/util/stream/BaseStream;)V

    return-object v0
.end method
