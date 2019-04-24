.class public interface abstract Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;
.super Ljava/lang/Object;
.source "PixelDatabase.java"


# virtual methods
.method public abstract deleteEverything()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract deletePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findPixelsToTrack()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract getPixelRowCount()J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract release()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract savePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException;
        }
    .end annotation
.end method
