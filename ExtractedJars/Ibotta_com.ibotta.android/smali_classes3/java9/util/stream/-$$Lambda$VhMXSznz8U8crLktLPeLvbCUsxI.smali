.class public final synthetic Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjDoubleConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;->INSTANCE:Ljava9/util/stream/-$$Lambda$VhMXSznz8U8crLktLPeLvbCUsxI;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;D)V
    .locals 0

    check-cast p1, Ljava9/util/DoubleSummaryStatistics;

    invoke-virtual {p1, p2, p3}, Ljava9/util/DoubleSummaryStatistics;->accept(D)V

    return-void
.end method
