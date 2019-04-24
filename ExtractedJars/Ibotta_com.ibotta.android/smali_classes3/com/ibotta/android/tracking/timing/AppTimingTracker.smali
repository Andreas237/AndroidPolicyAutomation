.class public interface abstract Lcom/ibotta/android/tracking/timing/AppTimingTracker;
.super Ljava/lang/Object;
.source "AppTimingTracker.java"


# static fields
.field public static final ATTR_CACHED_OBJECT_NAME:Ljava/lang/String; = "cached_object_name"

.field public static final ATTR_RETAILER_ID:Ljava/lang/String; = "retailer_id"

.field public static final ATTR_TIME:Ljava/lang/String; = "time"

.field public static final EVENT_NAME_TIME_TO_LOAD_FEATURED_DATA:Ljava/lang/String; = "time_to_load_featured_data"

.field public static final EVENT_NAME_TIME_TO_LOAD_GALLERY:Ljava/lang/String; = "time_to_load_gallery"

.field public static final EVENT_NAME_TIME_TO_LOGIN:Ljava/lang/String; = "time_to_login"

.field public static final EVENT_NAME_TIME_TO_PROCESS_RECEIPT_IMAGE:Ljava/lang/String; = "time_to_process_receipt_image"

.field public static final EVENT_NAME_TIME_TO_READ_DISK_CACHE:Ljava/lang/String; = "time_to_read_disk_cache"

.field public static final EVENT_NAME_TIME_TO_UNLOCK:Ljava/lang/String; = "time_to_unlock"

.field public static final EVENT_NAME_TIME_TO_UPLOAD_RECEIPT:Ljava/lang/String; = "time_to_upload_receipt"

.field public static final EVENT_NAME_TIME_TO_WRITE_DISK_CACHE:Ljava/lang/String; = "time_to_write_disk_cache"

.field public static final EVENT_TYPE_TIMING:Ljava/lang/String; = "timing"


# virtual methods
.method public abstract trackTimeToLoadFeaturedData(J)V
.end method

.method public abstract trackTimeToLoadGallery(JI)V
.end method

.method public abstract trackTimeToLogin(J)V
.end method

.method public abstract trackTimeToProcessReceiptImage(J)V
.end method

.method public abstract trackTimeToReadDiskCache(Ljava/lang/String;J)V
.end method

.method public abstract trackTimeToUnlock(J)V
.end method

.method public abstract trackTimeToUploadReceipt(J)V
.end method

.method public abstract trackTimeToWriteDiskCache(Ljava/lang/String;J)V
.end method
