.class public final synthetic Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjIntConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;->INSTANCE:Ljava9/util/stream/-$$Lambda$w3zTZrzgrxBG49rqZaJHZkTAI_w;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Ljava9/util/IntSummaryStatistics;

    invoke-virtual {p1, p2}, Ljava9/util/IntSummaryStatistics;->accept(I)V

    return-void
.end method
