.class public Lorg/webrtc/EglBase10$Context;
.super Ljava/lang/Object;
.source "EglBase10.java"

# interfaces
.implements Lorg/webrtc/EglBase$Context;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/EglBase10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Context"
.end annotation


# instance fields
.field private final eglContext:Ljavax/microedition/khronos/egl/EGLContext;


# direct methods
.method public constructor <init>(Ljavax/microedition/khronos/egl/EGLContext;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lorg/webrtc/EglBase10$Context;->eglContext:Ljavax/microedition/khronos/egl/EGLContext;

    return-void
.end method

.method static synthetic access$000(Lorg/webrtc/EglBase10$Context;)Ljavax/microedition/khronos/egl/EGLContext;
    .locals 0

    .line 40
    iget-object p0, p0, Lorg/webrtc/EglBase10$Context;->eglContext:Ljavax/microedition/khronos/egl/EGLContext;

    return-object p0
.end method


# virtual methods
.method public getNativeEglContext()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method
