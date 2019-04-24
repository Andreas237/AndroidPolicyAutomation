.class public final synthetic Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntBinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;->INSTANCE:Ljava9/util/stream/-$$Lambda$LShNaV6KH86Mn-SI2nutk8xnTnY;

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

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method
