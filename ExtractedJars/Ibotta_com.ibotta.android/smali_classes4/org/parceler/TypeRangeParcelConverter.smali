.class public interface abstract Lorg/parceler/TypeRangeParcelConverter;
.super Ljava/lang/Object;
.source "TypeRangeParcelConverter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Ljava/lang/Object;",
        "U:T",
        "L;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract fromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TU;"
        }
    .end annotation
.end method

.method public abstract toParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            "Landroid/os/Parcel;",
            ")V"
        }
    .end annotation
.end method
