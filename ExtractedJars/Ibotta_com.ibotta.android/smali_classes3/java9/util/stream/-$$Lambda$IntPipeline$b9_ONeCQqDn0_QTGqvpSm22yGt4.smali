.class public final synthetic Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjIntConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;->INSTANCE:Ljava9/util/stream/-$$Lambda$IntPipeline$b9_ONeCQqDn0_QTGqvpSm22yGt4;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, [J

    invoke-static {p1, p2}, Ljava9/util/stream/IntPipeline;->lambda$average$44([JI)V

    return-void
.end method
