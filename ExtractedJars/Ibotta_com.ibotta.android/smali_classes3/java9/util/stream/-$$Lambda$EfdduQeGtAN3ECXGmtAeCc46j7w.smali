.class public final synthetic Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BiConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;->INSTANCE:Ljava9/util/stream/-$$Lambda$EfdduQeGtAN3ECXGmtAeCc46j7w;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava9/util/LongSummaryStatistics;

    check-cast p2, Ljava9/util/LongSummaryStatistics;

    invoke-virtual {p1, p2}, Ljava9/util/LongSummaryStatistics;->combine(Ljava9/util/LongSummaryStatistics;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/BiConsumer;)Ljava9/util/function/BiConsumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/BiConsumer<",
            "-TT;-TU;>;)",
            "Ljava9/util/function/BiConsumer<",
            "TT;TU;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiConsumer$-CC;->$default$andThen(Ljava9/util/function/BiConsumer;Ljava9/util/function/BiConsumer;)Ljava9/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
