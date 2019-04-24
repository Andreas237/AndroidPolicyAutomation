.class public interface abstract Lcom/ibotta/android/util/pipeline/PipelineFactory;
.super Ljava/lang/Object;
.source "PipelineFactory.java"


# virtual methods
.method public abstract createProductImageResizePipeline(Ljava/io/File;I)Lcom/ibotta/android/util/pipeline/Pipeline;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "I)",
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract createReceiptImagePipeline(Ljava/io/File;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Lcom/ibotta/android/util/pipeline/Pipeline;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;",
            ")",
            "Lcom/ibotta/android/util/pipeline/Pipeline<",
            "Ljava/io/ByteArrayOutputStream;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method
