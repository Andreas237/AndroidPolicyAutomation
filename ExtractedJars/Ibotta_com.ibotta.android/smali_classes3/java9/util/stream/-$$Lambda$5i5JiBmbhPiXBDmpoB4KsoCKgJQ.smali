.class public final synthetic Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongBinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$5i5JiBmbhPiXBDmpoB4KsoCKgJQ;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsLong(JJ)J
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ljava9/lang/Longs;->sum(JJ)J

    move-result-wide p1

    return-wide p1
.end method
