.class public final synthetic Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/DoubleFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;->INSTANCE:Ljava9/util/stream/-$$Lambda$wBsJk7U_oyO7eQfhGXsaXL04T28;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(D)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
