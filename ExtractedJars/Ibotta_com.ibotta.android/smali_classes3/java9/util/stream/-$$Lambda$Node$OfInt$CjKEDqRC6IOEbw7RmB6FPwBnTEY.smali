.class public final synthetic Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;->INSTANCE:Ljava9/util/stream/-$$Lambda$Node$OfInt$CjKEDqRC6IOEbw7RmB6FPwBnTEY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 0

    invoke-static {p1}, Ljava9/util/stream/Node$OfInt$-CC;->lambda$truncate$58(I)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/IntConsumer;)Ljava9/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/IntConsumer$-CC;->$default$andThen(Ljava9/util/function/IntConsumer;Ljava9/util/function/IntConsumer;)Ljava9/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
