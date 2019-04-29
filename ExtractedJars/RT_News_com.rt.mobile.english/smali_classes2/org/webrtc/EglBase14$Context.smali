.class public Lorg/webrtc/EglBase14$Context;
.super Ljava/lang/Object;
.source "EglBase14.java"

# interfaces
.implements Lorg/webrtc/EglBase$Context;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/EglBase14;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Context"
.end annotation


# instance fields
.field private final egl14Context:Landroid/opengl/EGLContext;


# direct methods
.method public constructor <init>(Landroid/opengl/EGLContext;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lorg/webrtc/EglBase14$Context;->egl14Context:Landroid/opengl/EGLContext;

    return-void
.end method

.method static synthetic access$100(Lorg/webrtc/EglBase14$Context;)Landroid/opengl/EGLContext;
    .locals 0

    .line 50
    iget-object p0, p0, Lorg/webrtc/EglBase14$Context;->egl14Context:Landroid/opengl/EGLContext;

    return-object p0
.end method


# virtual methods
.method public getNativeEglContext()J
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 57
    invoke-static {}, Lorg/webrtc/EglBase14;->access$000()I

    move-result v0

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lorg/webrtc/EglBase14$Context;->egl14Context:Landroid/opengl/EGLContext;

    invoke-virtual {v0}, Landroid/opengl/EGLContext;->getNativeHandle()J

    move-result-wide v0

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lorg/webrtc/EglBase14$Context;->egl14Context:Landroid/opengl/EGLContext;

    invoke-virtual {v0}, Landroid/opengl/EGLContext;->getHandle()I

    move-result v0

    int-to-long v0, v0

    :goto_0
    return-wide v0
.end method
