.class public final synthetic Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;->INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfDouble$0BIW1NQgNaZ26G52SEejx3mRQOs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava9/util/stream/StreamSpliterators$SliceSpliterator$OfDouble;->lambda$emptyConsumer$69(D)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleConsumer$-CC;->$default$andThen(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    return-object p1
.end method
