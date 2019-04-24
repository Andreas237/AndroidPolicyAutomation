.class public final synthetic Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjLongConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;->INSTANCE:Ljava9/util/stream/-$$Lambda$LongPipeline$t8CDn_O5o1MoXN75laOICQULPvs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;J)V
    .locals 0

    check-cast p1, [J

    invoke-static {p1, p2, p3}, Ljava9/util/stream/LongPipeline;->lambda$average$39([JJ)V

    return-void
.end method
