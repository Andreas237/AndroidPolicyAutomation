.class public final Lcom/ibotta/android/images/GlideImageCache;
.super Ljava/lang/Object;
.source "GlideImageCache.kt"

# interfaces
.implements Lcom/ibotta/android/images/ImageCache;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/images/GlideImageCache$GlideListener;,
        Lcom/ibotta/android/images/GlideImageCache$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGlideImageCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlideImageCache.kt\ncom/ibotta/android/images/GlideImageCache\n*L\n1#1,156:1\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J>\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J4\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J,\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J6\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/ibotta/android/images/GlideImageCache;",
        "Lcom/ibotta/android/images/ImageCache;",
        "debugState",
        "Lcom/ibotta/android/state/app/debug/DebugState;",
        "(Lcom/ibotta/android/state/app/debug/DebugState;)V",
        "fetch",
        "Lcom/ibotta/android/images/ImageLoadJob;",
        "context",
        "Landroid/content/Context;",
        "drawableId",
        "",
        "size",
        "Lcom/ibotta/android/images/ImageCache$Size;",
        "url",
        "",
        "freeMemory",
        "",
        "load",
        "imageView",
        "Landroid/widget/ImageView;",
        "listener",
        "Lcom/ibotta/android/images/ImageCacheListener;",
        "pause",
        "tag",
        "resume",
        "Companion",
        "GlideListener",
        "ibotta-images_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/images/GlideImageCache$Companion;


# instance fields
.field private final debugState:Lcom/ibotta/android/state/app/debug/DebugState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/images/GlideImageCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/images/GlideImageCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/images/GlideImageCache;->Companion:Lcom/ibotta/android/images/GlideImageCache$Companion;

    .line 153
    sget v0, Lcom/ibotta/android/images/R$id;->ibotta_images_glide_tag:I

    invoke-static {v0}, Lcom/bumptech/glide/request/target/ViewTarget;->setTagId(I)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/state/app/debug/DebugState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/state/app/debug/DebugState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "debugState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/images/GlideImageCache;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    return-void
.end method

.method private final load(Landroid/content/Context;Landroid/widget/ImageView;ILjava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 4

    .line 78
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    const-string v1, "Glide.with(context)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    new-instance v1, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {v1}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    .line 80
    new-instance v2, Lcom/bumptech/glide/GenericTransitionOptions;

    invoke-direct {v2}, Lcom/bumptech/glide/GenericTransitionOptions;-><init>()V

    const/4 v3, -0x1

    if-eq p3, v3, :cond_0

    .line 83
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    const-string v0, "rm.load(drawableId)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v0, p4}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    const-string v0, "rm.load(url)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-eqz p6, :cond_1

    .line 88
    new-instance v0, Lcom/ibotta/android/images/GlideImageCache$GlideListener;

    invoke-direct {v0, p6}, Lcom/ibotta/android/images/GlideImageCache$GlideListener;-><init>(Lcom/ibotta/android/images/ImageCacheListener;)V

    check-cast v0, Lcom/bumptech/glide/request/RequestListener;

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    .line 90
    :cond_1
    sget-object p6, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->ALL:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v1, p6}, Lcom/bumptech/glide/request/RequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 92
    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getWidth()I

    move-result p6

    if-lez p6, :cond_2

    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getHeight()I

    move-result p6

    if-lez p6, :cond_2

    .line 93
    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getWidth()I

    move-result p6

    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getHeight()I

    move-result v0

    invoke-virtual {v1, p6, v0}, Lcom/bumptech/glide/request/RequestOptions;->override(II)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 96
    :cond_2
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/images/GlideImageCache;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isShowImageTransparency()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    new-instance v0, Lcom/ibotta/android/views/images/transformation/ShowTransparencyTransformation;

    invoke-direct {v0}, Lcom/ibotta/android/views/images/transformation/ShowTransparencyTransformation;-><init>()V

    invoke-virtual {p6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz p4, :cond_4

    goto :goto_1

    :cond_4
    const-string p4, ""

    .line 101
    :goto_1
    invoke-interface {p5, p1, p4, p5}, Lcom/ibotta/android/images/ImageCache$Size;->getBitmapTransformation(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;

    move-result-object p4

    if-eqz p4, :cond_5

    .line 102
    invoke-virtual {p6, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_5
    invoke-virtual {p6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_6

    .line 105
    new-instance p4, Lcom/bumptech/glide/load/MultiTransformation;

    check-cast p6, Ljava/util/Collection;

    invoke-direct {p4, p6}, Lcom/bumptech/glide/load/MultiTransformation;-><init>(Ljava/util/Collection;)V

    check-cast p4, Lcom/bumptech/glide/load/Transformation;

    invoke-virtual {v1, p4}, Lcom/bumptech/glide/request/RequestOptions;->transform(Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 108
    :cond_6
    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getPlaceholderResId()I

    move-result p4

    if-lez p4, :cond_7

    .line 109
    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getPlaceholderResId()I

    move-result p4

    invoke-static {p1, p4}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/bumptech/glide/request/RequestOptions;->placeholder(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;

    .line 112
    :cond_7
    invoke-interface {p5}, Lcom/ibotta/android/images/ImageCache$Size;->getFadeIn()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 113
    sget p1, Lcom/ibotta/android/images/R$anim;->anim_fade_in_image_load:I

    invoke-virtual {v2, p1}, Lcom/bumptech/glide/GenericTransitionOptions;->transition(I)Lcom/bumptech/glide/TransitionOptions;

    .line 116
    :cond_8
    check-cast v1, Lcom/bumptech/glide/request/BaseRequestOptions;

    invoke-virtual {p3, v1}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    .line 117
    check-cast v2, Lcom/bumptech/glide/TransitionOptions;

    invoke-virtual {p3, v2}, Lcom/bumptech/glide/RequestBuilder;->transition(Lcom/bumptech/glide/TransitionOptions;)Lcom/bumptech/glide/RequestBuilder;

    if-eqz p2, :cond_9

    .line 119
    invoke-virtual {p3, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    move-result-object p1

    const-string p2, "requestBuilder.into(imageView)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/bumptech/glide/request/target/Target;

    goto :goto_2

    :cond_9
    invoke-virtual {p3}, Lcom/bumptech/glide/RequestBuilder;->preload()Lcom/bumptech/glide/request/target/Target;

    move-result-object p1

    const-string p2, "requestBuilder.preload()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    :goto_2
    new-instance p2, Lcom/ibotta/android/images/GlideImageLoadJob;

    invoke-direct {p2, p1}, Lcom/ibotta/android/images/GlideImageLoadJob;-><init>(Lcom/bumptech/glide/request/target/Target;)V

    check-cast p2, Lcom/ibotta/android/images/ImageLoadJob;

    return-object p2
.end method


# virtual methods
.method public fetch(Landroid/content/Context;ILcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move-object v6, p3

    .line 61
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;Landroid/widget/ImageView;ILjava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public fetch(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    .line 58
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;Landroid/widget/ImageView;ILjava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public freeMemory(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->clearMemory()V

    return-void
.end method

.method public load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 46
    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/images/ImageCacheListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move-object v6, p4

    move-object v7, p5

    .line 55
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;Landroid/widget/ImageView;ILjava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 34
    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/images/ImageCache$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/images/ImageCacheListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v5, p2

    move-object v6, p4

    move-object v7, p5

    .line 43
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/images/GlideImageCache;->load(Landroid/content/Context;Landroid/widget/ImageView;ILjava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method public pause(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->pauseRequests()V

    return-void
.end method

.method public resume(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->resumeRequests()V

    return-void
.end method
