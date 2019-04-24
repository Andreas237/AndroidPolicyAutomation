.class public final synthetic Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;->INSTANCE:Ljava9/util/stream/-$$Lambda$StreamSpliterators$SliceSpliterator$OfRef$NCo6XQNozAw8Vk6C8FC-XyRCTRU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Ljava9/util/stream/StreamSpliterators$SliceSpliterator$OfRef;->lambda$tryAdvance$65(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
