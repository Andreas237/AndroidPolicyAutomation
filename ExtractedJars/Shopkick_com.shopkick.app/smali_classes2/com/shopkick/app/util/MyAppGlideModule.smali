.class public final Lcom/shopkick/app/util/MyAppGlideModule;
.super Lcom/bumptech/glide/module/AppGlideModule;
.source "MyAppGlideModule.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;,
        Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoaderFactory;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/bumptech/glide/module/AppGlideModule;-><init>()V

    return-void
.end method

.method public static clear(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 48
    :try_start_0
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static clear(Landroid/support/v4/app/Fragment;Landroid/view/View;)V
    .locals 0

    .line 57
    :try_start_0
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/support/v4/app/Fragment;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static clear(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 66
    :try_start_0
    invoke-static {p0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public applyOptions(Landroid/content/Context;Lcom/bumptech/glide/GlideBuilder;)V
    .locals 0

    return-void
.end method

.method public registerComponents(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lcom/bumptech/glide/Registry;)V
    .locals 2

    .line 40
    const-class p1, Ljava/lang/String;

    const-class p2, Ljava/io/InputStream;

    new-instance v0, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoaderFactory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoaderFactory;-><init>(Lcom/shopkick/app/util/MyAppGlideModule$1;)V

    invoke-virtual {p3, p1, p2, v0}, Lcom/bumptech/glide/Registry;->prepend(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/model/ModelLoaderFactory;)Lcom/bumptech/glide/Registry;

    return-void
.end method
