.class public interface abstract Lcom/ibotta/android/images/ImageCache$Size;
.super Ljava/lang/Object;
.source "ImageCache.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/images/ImageCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Size"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/images/ImageCache$Size;",
        "",
        "config",
        "Landroid/graphics/Bitmap$Config;",
        "getConfig",
        "()Landroid/graphics/Bitmap$Config;",
        "fadeIn",
        "",
        "getFadeIn",
        "()Z",
        "height",
        "",
        "getHeight",
        "()I",
        "placeholderResId",
        "getPlaceholderResId",
        "width",
        "getWidth",
        "getBitmapTransformation",
        "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;",
        "context",
        "Landroid/content/Context;",
        "url",
        "",
        "size",
        "ibotta-images_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getBitmapTransformation(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getConfig()Landroid/graphics/Bitmap$Config;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getFadeIn()Z
.end method

.method public abstract getHeight()I
.end method

.method public abstract getPlaceholderResId()I
.end method

.method public abstract getWidth()I
.end method
