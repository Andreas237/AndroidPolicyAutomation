.class public final synthetic Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;

    invoke-direct {v0}, Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;-><init>()V

    sput-object v0, Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;->INSTANCE:Lcom/ibotta/api/helper/product/-$$Lambda$shdRqn5vzkwW22Ga8zG15IbM0wQ;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method
