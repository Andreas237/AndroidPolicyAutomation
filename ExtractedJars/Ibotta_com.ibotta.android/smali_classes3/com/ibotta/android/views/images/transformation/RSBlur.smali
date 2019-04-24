.class public final Lcom/ibotta/android/views/images/transformation/RSBlur;
.super Ljava/lang/Object;
.source "RSBlur.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/images/transformation/RSBlur;",
        "",
        "()V",
        "blur",
        "Landroid/graphics/Bitmap;",
        "context",
        "Landroid/content/Context;",
        "bitmap",
        "radius",
        "",
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
.field public static final INSTANCE:Lcom/ibotta/android/views/images/transformation/RSBlur;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Lcom/ibotta/android/views/images/transformation/RSBlur;

    invoke-direct {v0}, Lcom/ibotta/android/views/images/transformation/RSBlur;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/images/transformation/RSBlur;->INSTANCE:Lcom/ibotta/android/views/images/transformation/RSBlur;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final blur(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 34
    move-object v1, v0

    check-cast v1, Landroid/renderscript/RenderScript;

    .line 35
    move-object v2, v0

    check-cast v2, Landroid/renderscript/Allocation;

    .line 37
    check-cast v0, Landroid/renderscript/ScriptIntrinsicBlur;

    const/4 v3, 0x1

    .line 40
    :try_start_0
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object v1

    if-nez v1, :cond_0

    .line 41
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    new-instance p1, Landroid/renderscript/RenderScript$RSMessageHandler;

    invoke-direct {p1}, Landroid/renderscript/RenderScript$RSMessageHandler;-><init>()V

    invoke-virtual {v1, p1}, Landroid/renderscript/RenderScript;->setMessageHandler(Landroid/renderscript/RenderScript$RSMessageHandler;)V

    .line 44
    sget-object p1, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    invoke-static {v1, p2, p1, v3}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    move-result-object p1
    :try_end_0
    .catch Landroid/renderscript/RSRuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p1, :cond_1

    .line 46
    :try_start_1
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {p1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v2

    .line 47
    invoke-static {v1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v0

    if-nez v0, :cond_2

    .line 49
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    invoke-virtual {v0, p1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    int-to-float v4, p3

    .line 50
    invoke-virtual {v0, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 51
    invoke-virtual {v0, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    if-nez v2, :cond_3

    .line 52
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    invoke-virtual {v2, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Landroid/renderscript/RSRuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    invoke-virtual {v1}, Landroid/renderscript/RenderScript;->destroy()V

    .line 59
    invoke-virtual {p1}, Landroid/renderscript/Allocation;->destroy()V

    .line 60
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    .line 61
    invoke-virtual {v0}, Landroid/renderscript/ScriptIntrinsicBlur;->destroy()V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-object v5, v2

    move-object v2, p1

    move-object p1, v5

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :catch_1
    move-object p1, v2

    .line 56
    :goto_0
    :try_start_2
    sget-object v4, Lcom/ibotta/android/views/images/transformation/FastBlur;->INSTANCE:Lcom/ibotta/android/views/images/transformation/FastBlur;

    invoke-virtual {v4, p2, p3, v3}, Lcom/ibotta/android/views/images/transformation/FastBlur;->blur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_4

    .line 58
    invoke-virtual {v1}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_4
    if-eqz v2, :cond_5

    .line 59
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    :cond_5
    if-eqz p1, :cond_6

    .line 60
    invoke-virtual {p1}, Landroid/renderscript/Allocation;->destroy()V

    :cond_6
    if-eqz v0, :cond_7

    .line 61
    invoke-virtual {v0}, Landroid/renderscript/ScriptIntrinsicBlur;->destroy()V

    :cond_7
    return-object p2

    :catchall_2
    move-exception p2

    move-object v5, v2

    move-object v2, p1

    move-object p1, v5

    :goto_1
    if-eqz v1, :cond_8

    .line 58
    invoke-virtual {v1}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_8
    if-eqz p1, :cond_9

    .line 59
    invoke-virtual {p1}, Landroid/renderscript/Allocation;->destroy()V

    :cond_9
    if-eqz v2, :cond_a

    .line 60
    invoke-virtual {v2}, Landroid/renderscript/Allocation;->destroy()V

    :cond_a
    if-eqz v0, :cond_b

    .line 61
    invoke-virtual {v0}, Landroid/renderscript/ScriptIntrinsicBlur;->destroy()V

    :cond_b
    throw p2
.end method
