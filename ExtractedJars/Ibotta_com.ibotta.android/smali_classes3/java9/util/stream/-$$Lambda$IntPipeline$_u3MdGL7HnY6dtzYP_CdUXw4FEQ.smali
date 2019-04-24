.class public final synthetic Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ToIntFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$IntPipeline$_u3MdGL7HnY6dtzYP_CdUXw4FEQ;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava9/util/stream/IntPipeline;->lambda$distinct$42(Ljava/lang/Integer;)I

    move-result p1

    return p1
.end method
