.class public interface abstract Lorg/parceler/Parcels$ParcelableFactory;
.super Ljava/lang/Object;
.source "Parcels.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/Parcels;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ParcelableFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation
.end method
