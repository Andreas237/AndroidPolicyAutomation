.class public Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;
.super Ljava/lang/Object;
.source "ImageSaveAsyncRequest.java"


# instance fields
.field private final imageSaveAsyncTask:Lcom/ibotta/android/async/image/ImageSaveAsyncTask;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/async/image/ImageSaveAsyncTask;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;->imageSaveAsyncTask:Lcom/ibotta/android/async/image/ImageSaveAsyncTask;

    return-void
.end method


# virtual methods
.method public disconnect()V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/async/image/ImageSaveAsyncRequest;->imageSaveAsyncTask:Lcom/ibotta/android/async/image/ImageSaveAsyncTask;

    invoke-virtual {v0}, Lcom/ibotta/android/async/image/ImageSaveAsyncTask;->disconnect()V

    return-void
.end method
