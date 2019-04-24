.class public Lcom/microblink/camera/hardware/camera/CameraSurface;
.super Ljava/lang/Object;


# instance fields
.field private mHeight:I

.field private mSurfaceHolder:Landroid/view/SurfaceHolder;

.field private mSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private mWidth:I


# direct methods
.method public constructor <init>(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    iput p2, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    iput p3, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    return-void
.end method

.method public constructor <init>(Landroid/view/SurfaceHolder;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    iput v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    iput p2, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    iput p3, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    return v0
.end method

.method public getSurfaceHolder()Landroid/view/SurfaceHolder;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    return-object v0
.end method

.method public getSurfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    return v0
.end method

.method public isSurfaceSane()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_1

    :cond_0
    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mWidth:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/CameraSurface;->mHeight:I

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
