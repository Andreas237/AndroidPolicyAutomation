.class public interface abstract Lcom/shopkick/app/location/ILocationCallback;
.super Ljava/lang/Object;
.source "ILocationCallback.java"


# static fields
.field public static final STATUS_CODE_GENERIC_ERROR:I = 0x1

.field public static final STATUS_CODE_GOOGLE_PLAY_SERVICES_ERROR:I = 0x2

.field public static final STATUS_CODE_NO_LOCATION_PERMISSION:I = 0x3

.field public static final STATUS_CODE_SUCCESS:I


# virtual methods
.method public abstract getLocationFailedClientLogEventType(I)Ljava/lang/Integer;
.end method

.method public abstract getLocationFailedErrorAlertMessageId(I)Ljava/lang/Integer;
.end method

.method public abstract onLocationFailed(I)V
.end method

.method public abstract onLocationReceived(Landroid/location/Location;)V
.end method
