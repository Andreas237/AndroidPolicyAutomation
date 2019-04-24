.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;
.super Ljava/lang/Object;
.source "ReceiptImageProcessorPipelineImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private final bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

.field private cameraOrientation:I

.field private final guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

.field private previewSize:Landroid/hardware/Camera$Size;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private processingStartTime:J

.field private final receiptFilename:Ljava/lang/String;

.field private final storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/BitmapUtil;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/pipeline/PipelineFactory;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 47
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    .line 48
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 49
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    .line 50
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->receiptFilename:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;Ljava/io/File;Z)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->onImageProcessingFinished(Ljava/io/File;Z)V

    return-void
.end method

.method private getReceiptCaptureDetails()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;
    .locals 15

    .line 105
    new-instance v0, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;

    invoke-direct {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;-><init>()V

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->guideController:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->setEdgeDistances(Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;)V

    .line 108
    invoke-virtual {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->getReceiptPercDistFromLeft()D

    move-result-wide v1

    .line 109
    invoke-virtual {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->getReceiptPercDistFromRight()D

    move-result-wide v3

    .line 110
    invoke-virtual {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->getReceiptPercDistFromTop()D

    move-result-wide v5

    .line 111
    invoke-virtual {v0}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->getReceiptPercDistFromBottom()D

    move-result-wide v7

    add-double v9, v1, v3

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    sub-double v9, v11, v9

    add-double v13, v5, v7

    sub-double/2addr v11, v13

    .line 116
    sget-object v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->EMPTY:Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    invoke-virtual {v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;->toBuilder()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    iget v13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->cameraOrientation:I

    .line 117
    invoke-virtual {v0, v13}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->orientation(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 118
    iget-object v13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->previewSize:Landroid/hardware/Camera$Size;

    const/4 v14, 0x0

    if-eqz v13, :cond_0

    iget v13, v13, Landroid/hardware/Camera$Size;->width:I

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    invoke-virtual {v0, v13}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->previewWidth(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 119
    iget-object v13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->previewSize:Landroid/hardware/Camera$Size;

    if-eqz v13, :cond_1

    iget v14, v13, Landroid/hardware/Camera$Size;->height:I

    :cond_1
    invoke-virtual {v0, v14}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->previewHeight(I)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 120
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromLeft(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 121
    invoke-virtual {v0, v3, v4}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromRight(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 122
    invoke-virtual {v0, v5, v6}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromTop(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 123
    invoke-virtual {v0, v7, v8}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptPercDistFromBottom(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 124
    invoke-virtual {v0, v9, v10}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptSizeWidthPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 125
    invoke-virtual {v0, v11, v12}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->receiptSizeHeightPerc(D)Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails$Builder;->build()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    move-result-object v0

    return-object v0
.end method

.method private notifyProcessingStarted()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processingStartTime:J

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;

    if-eqz v0, :cond_0

    .line 159
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;->onProcessingStarted()V

    :cond_0
    return-void
.end method

.method private onImageProcessingFinished(Ljava/io/File;Z)V
    .locals 6

    .line 143
    iget-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processingStartTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processingStartTime:J

    sub-long/2addr v0, v4

    .line 145
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    invoke-interface {v4, v0, v1}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToProcessReceiptImage(J)V

    .line 148
    :cond_0
    iput-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processingStartTime:J

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;

    if-eqz v0, :cond_1

    .line 151
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;->onProcessingFinished(Ljava/io/File;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 132
    invoke-virtual {v0, v1}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->cancel(Z)Z

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    :cond_0
    return-void
.end method

.method public hasProcessedImages()Z
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onImageProcessingFinished(Landroid/os/Message;)V
    .locals 0

    return-void
.end method

.method public processImage([B)V
    .locals 5

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {v0, v1}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->cancel(Z)Z

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->getReceiptImages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 81
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->receiptFilename:Ljava/lang/String;

    new-array v4, v1, [Ljava/lang/Object;

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->startNewWorkingFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 83
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->bitmapUtil:Lcom/ibotta/android/util/BitmapUtil;

    invoke-virtual {v2, p1}, Lcom/ibotta/android/util/BitmapUtil;->toByteArrayOutputStream([B)Ljava/io/ByteArrayOutputStream;

    move-result-object p1

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->getReceiptCaptureDetails()Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;

    move-result-object v2

    .line 86
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->pipelineFactory:Lcom/ibotta/android/util/pipeline/PipelineFactory;

    invoke-interface {v3, v0, v2}, Lcom/ibotta/android/util/pipeline/PipelineFactory;->createReceiptImagePipeline(Ljava/io/File;Lcom/ibotta/android/util/pipeline/receipt/ReceiptCaptureDetails;)Lcom/ibotta/android/util/pipeline/Pipeline;

    move-result-object v0

    .line 89
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;Lcom/ibotta/android/util/pipeline/Pipeline;Ljava/io/ByteArrayOutputStream;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->processReceiptImageTask:Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;

    new-array v0, v1, [Ljava/lang/Void;

    instance-of v1, p1, Landroid/os/AsyncTask;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/async/receipt/ReceiptProcessingAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/os/AsyncTask;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 99
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->notifyProcessingStarted()V

    return-void
.end method

.method public setCameraOrientation(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->cameraOrientation:I

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorListener;

    return-void
.end method

.method public setPreviewSize(Landroid/hardware/Camera$Size;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessorPipelineImpl;->previewSize:Landroid/hardware/Camera$Size;

    return-void
.end method
