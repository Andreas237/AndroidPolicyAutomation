.class public final synthetic Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;->INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfLong$4KYYliI3XmcCfKgCInszUJ9IwLU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava9/util/stream/StreamSpliterators$SliceSpliterator$OfLong;->lambda$emptyConsumer$68(J)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/LongConsumer$-CC;->$default$andThen(Ljava9/util/function/LongConsumer;Ljava9/util/function/LongConsumer;)Ljava9/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method
