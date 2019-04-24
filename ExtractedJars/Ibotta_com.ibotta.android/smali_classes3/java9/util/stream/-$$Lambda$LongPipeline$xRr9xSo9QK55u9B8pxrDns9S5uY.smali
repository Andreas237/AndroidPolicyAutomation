.class public final synthetic Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ToLongFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$xRr9xSo9QK55u9B8pxrDns9S5uY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, Ljava/lang/Long;

    invoke-static {p1}, Ljava9/util/stream/LongPipeline;->lambda$distinct$37(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method
