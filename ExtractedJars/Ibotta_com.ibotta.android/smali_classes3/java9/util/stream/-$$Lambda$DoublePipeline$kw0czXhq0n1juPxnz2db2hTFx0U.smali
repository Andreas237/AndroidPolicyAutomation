.class public final synthetic Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjDoubleConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;->INSTANCE:Ljava9/util/stream/-$$Lambda$DoublePipeline$kw0czXhq0n1juPxnz2db2hTFx0U;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;D)V
    .locals 0

    check-cast p1, [D

    invoke-static {p1, p2, p3}, Ljava9/util/stream/DoublePipeline;->lambda$average$54([DD)V

    return-void
.end method
