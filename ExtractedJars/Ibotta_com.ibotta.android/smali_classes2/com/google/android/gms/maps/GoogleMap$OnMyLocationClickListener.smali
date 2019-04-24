.class public interface abstract Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/maps/GoogleMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnMyLocationClickListener"
.end annotation


# virtual methods
.method public abstract onMyLocationClick(Landroid/location/Location;)V
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
