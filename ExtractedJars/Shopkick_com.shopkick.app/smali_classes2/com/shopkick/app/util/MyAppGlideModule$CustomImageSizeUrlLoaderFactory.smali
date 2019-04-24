.class Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoaderFactory;
.super Ljava/lang/Object;
.source "MyAppGlideModule.java"

# interfaces
.implements Lcom/bumptech/glide/load/model/ModelLoaderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/MyAppGlideModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CustomImageSizeUrlLoaderFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/model/ModelLoaderFactory<",
        "Ljava/lang/String;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/util/MyAppGlideModule$1;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoaderFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;)Lcom/bumptech/glide/load/model/ModelLoader;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;",
            ")",
            "Lcom/bumptech/glide/load/model/ModelLoader<",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 86
    const-class v0, Lcom/bumptech/glide/load/model/GlideUrl;

    const-class v1, Ljava/io/InputStream;

    invoke-virtual {p1, v0, v1}, Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;->build(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/model/ModelLoader;

    move-result-object p1

    .line 87
    new-instance v0, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;

    invoke-direct {v0, p1}, Lcom/shopkick/app/util/MyAppGlideModule$CustomImageSizeUrlLoader;-><init>(Lcom/bumptech/glide/load/model/ModelLoader;)V

    return-object v0
.end method

.method public teardown()V
    .locals 0

    return-void
.end method
