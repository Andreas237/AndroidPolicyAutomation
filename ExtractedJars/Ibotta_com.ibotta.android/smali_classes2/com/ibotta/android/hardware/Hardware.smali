.class public interface abstract Lcom/ibotta/android/hardware/Hardware;
.super Ljava/lang/Object;
.source "Hardware.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u000b\u001a\u00020\u000cH&J\u0008\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0004R\u0012\u0010\u0008\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0004R\u0012\u0010\t\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0004R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0004\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/ibotta/android/hardware/Hardware;",
        "",
        "isCoarseLocationAvailable",
        "",
        "()Z",
        "isFineLocationAvailable",
        "isLowMemory",
        "isNetworkConnected",
        "isRearCameraAvailable",
        "isScreenLayoutLarge",
        "isScreenLayoutXLarge",
        "getLocalIpAddress",
        "",
        "getScreenSize",
        "Landroid/graphics/Point;",
        "memoryClass",
        "",
        "ibotta-hardware_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getLocalIpAddress()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getScreenSize()Landroid/graphics/Point;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isCoarseLocationAvailable()Z
.end method

.method public abstract isFineLocationAvailable()Z
.end method

.method public abstract isLowMemory()Z
.end method

.method public abstract isNetworkConnected()Z
.end method

.method public abstract isRearCameraAvailable()Z
.end method

.method public abstract isScreenLayoutLarge()Z
.end method

.method public abstract isScreenLayoutXLarge()Z
.end method

.method public abstract memoryClass()I
.end method
