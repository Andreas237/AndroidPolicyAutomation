.class public Lo/bhp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/bhp;


# instance fields
.field private a:Landroid/renderscript/ScriptIntrinsicBlur;

.field private e:Landroid/renderscript/RenderScript;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lo/bhp;->b:Lo/bhp;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object v0

    iput-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    .line 43
    iget-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    iget-object v1, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    invoke-static {v1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v0

    iput-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    .line 44
    return-void
.end method

.method private static c(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 10

    .line 116
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int/2addr v0, p1

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 117
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int/2addr v0, p1

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 119
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 120
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 121
    new-instance v8, Landroid/graphics/RectF;

    int-to-float v0, v4

    int-to-float v1, v5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v8, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 123
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    .line 124
    invoke-static {p0, v6}, Lo/bhp;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/BitmapShader;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 125
    invoke-virtual {v7, v8, v9}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 127
    return-object v6
.end method

.method private static c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/BitmapShader;
    .locals 7

    .line 131
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float v2, v0, v1

    .line 132
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 134
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 135
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 136
    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 137
    new-instance v6, Landroid/graphics/BitmapShader;

    invoke-direct {v6, p0, v5, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 138
    invoke-virtual {v6, v4}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 140
    return-object v6
.end method

.method public static c(Landroid/content/Context;)Lo/bhp;
    .locals 1

    .line 38
    sget-object v0, Lo/bhp;->b:Lo/bhp;

    if-nez v0, :cond_0

    new-instance v0, Lo/bhp;

    invoke-direct {v0, p0}, Lo/bhp;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/bhp;->b:Lo/bhp;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;I)V
    .locals 6

    .line 59
    iget-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 61
    const/4 v2, 0x1

    .line 62
    sget-object v3, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    .line 63
    iget-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    invoke-static {v0, p1, v3, v2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    move-result-object v4

    .line 64
    iget-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    invoke-virtual {v4}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v5

    .line 66
    iget-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    invoke-virtual {v0, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 67
    iget-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    invoke-virtual {v0, v5}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 68
    invoke-virtual {v5, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 70
    invoke-virtual {v4}, Landroid/renderscript/Allocation;->destroy()V

    .line 71
    invoke-virtual {v5}, Landroid/renderscript/Allocation;->destroy()V

    .line 72
    return-void
.end method

.method public b(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 4

    .line 81
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 82
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 84
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 85
    invoke-virtual {p0, p1, v3, p2}, Lo/bhp;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;I)V

    .line 86
    return-object v3
.end method

.method public c()V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/bhp;->a:Landroid/renderscript/ScriptIntrinsicBlur;

    invoke-virtual {v0}, Landroid/renderscript/ScriptIntrinsicBlur;->destroy()V

    .line 53
    :cond_0
    iget-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    if-eqz v0, :cond_1

    .line 54
    iget-object v0, p0, Lo/bhp;->e:Landroid/renderscript/RenderScript;

    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    .line 56
    :cond_1
    return-void
.end method

.method public d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 2

    .line 97
    invoke-static {p1, p3}, Lo/bhp;->c(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 98
    invoke-virtual {p0, v1, p2}, Lo/bhp;->b(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
