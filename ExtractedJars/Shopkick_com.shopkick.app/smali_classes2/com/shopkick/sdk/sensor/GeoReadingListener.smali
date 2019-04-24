.class public interface abstract Lcom/shopkick/sdk/sensor/GeoReadingListener;
.super Ljava/lang/Object;
.source "GeoReadingListener.java"


# static fields
.field public static final TRANSITION_DWELL:I = 0x4

.field public static final TRANSITION_ENTER:I = 0x1

.field public static final TRANSITION_EXIT:I = 0x2


# virtual methods
.method public abstract onReadingChanged(Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;Lcom/shopkick/sdk/sensor/GeoFence;Landroid/location/Location;I)V
    .param p1    # Lcom/shopkick/sdk/sensor/GeoFenceSensorImplementation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/sdk/sensor/GeoFence;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
