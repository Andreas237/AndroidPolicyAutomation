.class public final synthetic Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;->INSTANCE:Ljava9/util/stream/-$$Lambda$Ecl_QJ8VOcUt9gEx1vGKij2myms;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(J)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Ljava9/util/stream/Nodes;->intBuilder(J)Ljava9/util/stream/Node$Builder$OfInt;

    move-result-object p1

    return-object p1
.end method
