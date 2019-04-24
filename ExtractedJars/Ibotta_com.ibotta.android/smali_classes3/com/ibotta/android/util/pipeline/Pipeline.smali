.class public Lcom/ibotta/android/util/pipeline/Pipeline;
.super Ljava/lang/Object;
.source "Pipeline.java"

# interfaces
.implements Lcom/ibotta/android/util/pipeline/Pipe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/util/pipeline/Pipe<",
        "TI;TO;>;"
    }
.end annotation


# instance fields
.field private final pipes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/util/pipeline/Pipe;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>([Lcom/ibotta/android/util/pipeline/Pipe;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/pipeline/Pipeline;->pipes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public process(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)TO;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/util/pipeline/PipeProcessingException;
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/util/pipeline/Pipeline;->pipes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/util/pipeline/Pipe;

    .line 32
    :try_start_0
    invoke-interface {v1, p1}, Lcom/ibotta/android/util/pipeline/Pipe;->process(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/ibotta/android/util/pipeline/PipeProcessingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 37
    new-instance v0, Lcom/ibotta/android/util/pipeline/PipeProcessingException;

    const-string v1, "A Pipe failed during execution."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/util/pipeline/PipeProcessingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 35
    throw p1

    :cond_0
    return-object v1
.end method
