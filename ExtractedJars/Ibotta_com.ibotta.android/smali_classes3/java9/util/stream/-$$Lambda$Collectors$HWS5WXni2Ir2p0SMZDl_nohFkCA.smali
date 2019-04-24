.class public final synthetic Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;

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

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Ljava9/util/stream/Collectors;->lambda$uniqKeysMapMerger$80(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
