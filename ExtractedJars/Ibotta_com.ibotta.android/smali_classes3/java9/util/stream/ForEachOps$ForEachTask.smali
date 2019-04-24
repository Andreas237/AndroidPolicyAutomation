.class final Ljava9/util/stream/ForEachOps$ForEachTask;
.super Ljava9/util/concurrent/CountedCompleter;
.source "ForEachOps.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/stream/ForEachOps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ForEachTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/concurrent/CountedCompleter<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final helper:Ljava9/util/stream/PipelineHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/PipelineHelper<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final sink:Ljava9/util/stream/Sink;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/Sink<",
            "TS;>;"
        }
    .end annotation
.end field

.field private spliterator:Ljava9/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/Spliterator<",
            "TS;>;"
        }
    .end annotation
.end field

.field private targetSize:J


# direct methods
.method constructor <init>(Ljava9/util/stream/ForEachOps$ForEachTask;Ljava9/util/Spliterator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/ForEachOps$ForEachTask<",
            "TS;TT;>;",
            "Ljava9/util/Spliterator<",
            "TS;>;)V"
        }
    .end annotation

    .line 274
    invoke-direct {p0, p1}, Ljava9/util/concurrent/CountedCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 275
    iput-object p2, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->spliterator:Ljava9/util/Spliterator;

    .line 276
    iget-object p2, p1, Ljava9/util/stream/ForEachOps$ForEachTask;->sink:Ljava9/util/stream/Sink;

    iput-object p2, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->sink:Ljava9/util/stream/Sink;

    .line 277
    iget-wide v0, p1, Ljava9/util/stream/ForEachOps$ForEachTask;->targetSize:J

    iput-wide v0, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->targetSize:J

    .line 278
    iget-object p1, p1, Ljava9/util/stream/ForEachOps$ForEachTask;->helper:Ljava9/util/stream/PipelineHelper;

    iput-object p1, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->helper:Ljava9/util/stream/PipelineHelper;

    return-void
.end method

.method constructor <init>(Ljava9/util/stream/PipelineHelper;Ljava9/util/Spliterator;Ljava9/util/stream/Sink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/stream/PipelineHelper<",
            "TT;>;",
            "Ljava9/util/Spliterator<",
            "TS;>;",
            "Ljava9/util/stream/Sink<",
            "TS;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 266
    invoke-direct {p0, v0}, Ljava9/util/concurrent/CountedCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 267
    iput-object p3, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->sink:Ljava9/util/stream/Sink;

    .line 268
    iput-object p1, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->helper:Ljava9/util/stream/PipelineHelper;

    .line 269
    iput-object p2, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->spliterator:Ljava9/util/Spliterator;

    const-wide/16 p1, 0x0

    .line 270
    iput-wide p1, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->targetSize:J

    return-void
.end method


# virtual methods
.method public compute()V
    .locals 12

    .line 283
    iget-object v0, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->spliterator:Ljava9/util/Spliterator;

    .line 284
    invoke-interface {v0}, Ljava9/util/Spliterator;->estimateSize()J

    move-result-wide v1

    .line 285
    iget-wide v3, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->targetSize:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 286
    invoke-static {v1, v2}, Ljava9/util/stream/AbstractTask;->suggestTargetSize(J)J

    move-result-wide v3

    iput-wide v3, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->targetSize:J

    .line 288
    :cond_0
    sget-object v5, Ljava9/util/stream/StreamOpFlag;->SHORT_CIRCUIT:Ljava9/util/stream/StreamOpFlag;

    iget-object v6, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->helper:Ljava9/util/stream/PipelineHelper;

    invoke-virtual {v6}, Ljava9/util/stream/PipelineHelper;->getStreamAndOpFlags()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava9/util/stream/StreamOpFlag;->isKnown(I)Z

    move-result v5

    const/4 v6, 0x0

    .line 290
    iget-object v7, p0, Ljava9/util/stream/ForEachOps$ForEachTask;->sink:Ljava9/util/stream/Sink;

    move-wide v8, v1

    move-object v1, v0

    move-object v0, p0

    :goto_0
    if-eqz v5, :cond_1

    .line 292
    invoke-interface {v7}, Ljava9/util/stream/Sink;->cancellationRequested()Z

    move-result v2

    if-nez v2, :cond_5

    :cond_1
    cmp-long v2, v8, v3

    if-lez v2, :cond_4

    .line 294
    invoke-interface {v1}, Ljava9/util/Spliterator;->trySplit()Ljava9/util/Spliterator;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 298
    :cond_2
    new-instance v8, Ljava9/util/stream/ForEachOps$ForEachTask;

    invoke-direct {v8, v0, v2}, Ljava9/util/stream/ForEachOps$ForEachTask;-><init>(Ljava9/util/stream/ForEachOps$ForEachTask;Ljava9/util/Spliterator;)V

    const/4 v9, 0x1

    .line 299
    invoke-virtual {v0, v9}, Ljava9/util/stream/ForEachOps$ForEachTask;->addToPendingCount(I)V

    if-eqz v6, :cond_3

    move-object v1, v2

    goto :goto_1

    :cond_3
    move-object v11, v8

    move-object v8, v0

    move-object v0, v11

    :goto_1
    xor-int/lit8 v6, v6, 0x1

    .line 311
    invoke-virtual {v0}, Ljava9/util/stream/ForEachOps$ForEachTask;->fork()Ljava9/util/concurrent/ForkJoinTask;

    .line 312
    invoke-interface {v1}, Ljava9/util/Spliterator;->estimateSize()J

    move-result-wide v9

    move-object v0, v8

    move-wide v8, v9

    goto :goto_0

    .line 295
    :cond_4
    :goto_2
    iget-object v2, v0, Ljava9/util/stream/ForEachOps$ForEachTask;->helper:Ljava9/util/stream/PipelineHelper;

    invoke-virtual {v2, v7, v1}, Ljava9/util/stream/PipelineHelper;->copyInto(Ljava9/util/stream/Sink;Ljava9/util/Spliterator;)V

    :cond_5
    const/4 v1, 0x0

    .line 314
    iput-object v1, v0, Ljava9/util/stream/ForEachOps$ForEachTask;->spliterator:Ljava9/util/Spliterator;

    .line 315
    invoke-virtual {v0}, Ljava9/util/stream/ForEachOps$ForEachTask;->propagateCompletion()V

    return-void
.end method
