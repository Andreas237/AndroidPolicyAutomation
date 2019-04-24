.class public final synthetic Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongBinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;->INSTANCE:Ljava9/util/stream/-$$Lambda$gzN9y6RZ8zzcyRZvdGgmfDAKmqU;

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

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method
