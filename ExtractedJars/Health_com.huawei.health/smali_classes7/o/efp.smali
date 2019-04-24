.class public Lo/efp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$EGLConfigChooser;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 9

    .line 20
    const/16 v6, 0x13

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 32
    const/4 v0, 0x1

    new-array v7, v0, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 33
    const/4 v0, 0x1

    new-array v8, v0, [I

    .line 34
    move-object v0, p1

    move-object v1, p2

    move-object v2, v6

    move-object v3, v7

    move-object v5, v8

    const/4 v4, 0x1

    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 36
    const/4 v0, 0x0

    aget v0, v8, v0

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    const/4 v0, 0x0

    aget-object v0, v7, v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x3029
        0x0
        0x3040
        0x4
        0x303f
        0x308e
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3025
        0x10
        0x3032
        0x1
        0x3031
        0x4
        0x3038
    .end array-data
.end method
