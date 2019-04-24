.class public final synthetic Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$He8DreDVV-YU4UFANc8wwM_HAU8;

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

    invoke-static {}, Ljava9/util/stream/DoublePipeline;->lambda$sum$50()[D

    move-result-object v0

    return-object v0
.end method
