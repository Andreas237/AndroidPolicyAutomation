.class public final synthetic Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;->INSTANCE:Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/BiFunction<",
            "TT;TU;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiFunction$-CC;->$default$andThen(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava9/util/StringJoiner;

    check-cast p2, Ljava9/util/StringJoiner;

    invoke-virtual {p1, p2}, Ljava9/util/StringJoiner;->merge(Ljava9/util/StringJoiner;)Ljava9/util/StringJoiner;

    move-result-object p1

    return-object p1
.end method
