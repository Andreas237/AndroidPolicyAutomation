.class public Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaverImpl;
.super Ljava/lang/Object;
.source "WindfallReceiptImageSaverImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final QUALITY:I = 0x1e


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public save(Lcom/microblink/BitmapResult;Ljava/io/File;Lcom/ibotta/android/async/image/ImageSaveAsyncListener;)Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;
    .locals 7

    .line 17
    new-instance v6, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;

    .line 18
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x1e

    move-object v0, v6

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILjava/io/File;Lcom/ibotta/android/async/image/ImageSaveAsyncListener;)V

    .line 19
    new-instance p1, Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;

    invoke-direct {p1, v6}, Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;-><init>(Lcom/ibotta/android/async/image/ImageSaveAsyncTask;)V

    const/4 p2, 0x0

    .line 21
    new-array p2, p2, [Ljava/lang/Void;

    instance-of p3, v6, Landroid/os/AsyncTask;

    if-nez p3, :cond_0

    invoke-virtual {v6, p2}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v6, Landroid/os/AsyncTask;

    invoke-static {v6, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-object p1
.end method
