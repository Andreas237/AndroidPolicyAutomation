.class public final synthetic Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ToDoubleFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$_S7RfXI85McAcSrQhz6lIdhCNHk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsDouble(Ljava/lang/Object;)D
    .locals 2

    check-cast p1, Ljava/lang/Double;

    invoke-static {p1}, Ljava9/util/stream/DoublePipeline;->lambda$distinct$49(Ljava/lang/Double;)D

    move-result-wide v0

    return-wide v0
.end method
