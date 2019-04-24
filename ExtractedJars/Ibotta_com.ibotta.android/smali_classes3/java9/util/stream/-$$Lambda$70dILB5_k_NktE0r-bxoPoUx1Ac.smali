.class public final synthetic Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntBinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;->INSTANCE:Ljava9/util/stream/-$$Lambda$70dILB5_k_NktE0r-bxoPoUx1Ac;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsInt(II)I
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method
