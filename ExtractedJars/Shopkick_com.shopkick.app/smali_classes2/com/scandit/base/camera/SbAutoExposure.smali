.class public final Lcom/scandit/base/camera/SbAutoExposure;
.super Ljava/lang/Object;
.source "SbAutoExposure.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field private static final HISTOGRAM_COMPUTE:Ljava/lang/String; = "#version 310 es\n#extension GL_EXT_texture_buffer : require\nlayout(local_size_x = 10, local_size_y = 10) in;\nlayout(std430, binding=1) buffer SSBO { uint outHistogram[]; };\nlayout(location = 100) uniform ivec2 inTopLeft;\nlayout(binding=0, rgba8) uniform mediump readonly image2D inPixels;\nvoid main() {\n    ivec2 pos = inTopLeft + ivec2(gl_GlobalInvocationID.xy);\n    ivec4 intensity = ivec4(255.0 * imageLoad(inPixels, pos));\n    atomicAdd(outHistogram[intensity.x], 1u);\n    atomicAdd(outHistogram[intensity.y], 1u);\n    atomicAdd(outHistogram[intensity.z], 1u);\n    atomicAdd(outHistogram[intensity.w], 1u);\n}"

.field private static final LOCAL_SIZE:I = 0xa

.field private static final NUM_GROUPS_X:I = 0x6

.field private static final NUM_GROUPS_Y:I = 0x14


# instance fields
.field private mCDF:[I

.field private mCurrentHeight:I

.field private mCurrentWidth:I

.field private mEGL:Lcom/scandit/base/gl/EGLCore;

.field private mExposureNanos:J

.field private mHistogramBuffer:I

.field private mHistogramData:Ljava/nio/IntBuffer;

.field private mHistogramProgram:I

.field private mISO:I

.field private mInputPixelBuffer:I

.field private mInputPixelTexture:I

.field private mLowerExposureNanos:J

.field private mLowerISO:I

.field private mOffScreenSurface:Lcom/scandit/base/gl/OffScreenSurface;

.field private mUpperExposureNanos:J

.field private mUpperISO:I


# direct methods
.method public constructor <init>(Lcom/scandit/base/gl/EGLCore;JJII)V
    .locals 3

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramProgram:I

    .line 45
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelBuffer:I

    .line 46
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const/16 v1, 0x100

    .line 47
    invoke-static {v1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramData:Ljava/nio/IntBuffer;

    .line 52
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCDF:[I

    .line 62
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentWidth:I

    .line 63
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentHeight:I

    .line 66
    iput-wide p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mLowerExposureNanos:J

    .line 67
    iput-wide p4, p0, Lcom/scandit/base/camera/SbAutoExposure;->mUpperExposureNanos:J

    .line 68
    iput p6, p0, Lcom/scandit/base/camera/SbAutoExposure;->mLowerISO:I

    .line 69
    iput p7, p0, Lcom/scandit/base/camera/SbAutoExposure;->mUpperISO:I

    .line 73
    iget p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mUpperISO:I

    iput p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mISO:I

    .line 74
    iget-wide p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mLowerExposureNanos:J

    iput-wide p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    .line 76
    iput-object p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mEGL:Lcom/scandit/base/gl/EGLCore;

    .line 80
    new-instance p1, Lcom/scandit/base/gl/OffScreenSurface;

    iget-object p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mEGL:Lcom/scandit/base/gl/EGLCore;

    const/4 p3, 0x4

    invoke-direct {p1, p2, p3, p3}, Lcom/scandit/base/gl/OffScreenSurface;-><init>(Lcom/scandit/base/gl/EGLCore;II)V

    iput-object p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mOffScreenSurface:Lcom/scandit/base/gl/OffScreenSurface;

    .line 81
    iget-object p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mOffScreenSurface:Lcom/scandit/base/gl/OffScreenSurface;

    invoke-virtual {p1}, Lcom/scandit/base/gl/OffScreenSurface;->makeCurrent()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 84
    :cond_0
    iput v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const-string p1, "#version 310 es\n#extension GL_EXT_texture_buffer : require\nlayout(local_size_x = 10, local_size_y = 10) in;\nlayout(std430, binding=1) buffer SSBO { uint outHistogram[]; };\nlayout(location = 100) uniform ivec2 inTopLeft;\nlayout(binding=0, rgba8) uniform mediump readonly image2D inPixels;\nvoid main() {\n    ivec2 pos = inTopLeft + ivec2(gl_GlobalInvocationID.xy);\n    ivec4 intensity = ivec4(255.0 * imageLoad(inPixels, pos));\n    atomicAdd(outHistogram[intensity.x], 1u);\n    atomicAdd(outHistogram[intensity.y], 1u);\n    atomicAdd(outHistogram[intensity.z], 1u);\n    atomicAdd(outHistogram[intensity.w], 1u);\n}"

    .line 85
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->createComputeProgram(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramProgram:I

    .line 86
    iget p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramProgram:I

    invoke-static {p1}, Landroid/opengl/GLES31;->glUseProgram(I)V

    const-string p1, "glUseProgram"

    .line 87
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 88
    invoke-direct {p0}, Lcom/scandit/base/camera/SbAutoExposure;->prepareOutputBuffer()I

    move-result p1

    iput p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramBuffer:I

    .line 89
    invoke-direct {p0}, Lcom/scandit/base/camera/SbAutoExposure;->prepareInputBuffer()I

    move-result p1

    iput p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelBuffer:I

    const-string p1, "glTexStorage2D"

    .line 91
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    return-void
.end method

.method private calculateExposureAndISO(Ljava/nio/IntBuffer;)Z
    .locals 9

    .line 193
    iget-object v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCDF:[I

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v0, 0x1

    move v2, v0

    .line 194
    :goto_0
    invoke-virtual {p1}, Ljava/nio/IntBuffer;->limit()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 195
    iget-object v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCDF:[I

    add-int/lit8 v4, v2, -0x1

    aget v4, v3, v4

    invoke-virtual {p1, v2}, Ljava/nio/IntBuffer;->get(I)I

    move-result v5

    add-int/2addr v4, v5

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 199
    :cond_0
    invoke-virtual {p1}, Ljava/nio/IntBuffer;->limit()I

    move-result v2

    .line 200
    iget-object v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCDF:[I

    add-int/lit8 v4, v2, -0x1

    aget v5, v3, v4

    if-nez v5, :cond_1

    return v1

    .line 204
    :cond_1
    aget v1, v3, v4

    add-int/lit8 v4, v2, -0x15

    .line 205
    aget v4, v3, v4

    sub-int v4, v1, v4

    .line 206
    div-int/lit8 v5, v1, 0x32

    .line 207
    div-int/lit16 v6, v1, 0x320

    add-int/lit8 v7, v2, -0x6

    .line 208
    aget v3, v3, v7

    sub-int v3, v1, v3

    const/high16 v7, 0x3f800000    # 1.0f

    if-le v3, v6, :cond_2

    sub-int/2addr v3, v6

    int-to-float p1, v3

    int-to-float v1, v1

    div-float/2addr p1, v1

    sub-float/2addr v7, p1

    goto :goto_2

    :cond_2
    if-ge v4, v5, :cond_4

    add-int/lit8 v1, v2, -0xb

    :goto_1
    if-ge v4, v5, :cond_3

    if-lez v1, :cond_3

    .line 217
    invoke-virtual {p1, v1}, Ljava/nio/IntBuffer;->get(I)I

    move-result v3

    add-int/2addr v4, v3

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, -0xa

    int-to-float p1, v2

    add-int/2addr v1, v0

    int-to-float v1, v1

    div-float v7, p1, v1

    :cond_4
    :goto_2
    const/high16 p1, 0x40800000    # 4.0f

    cmpl-float v1, v7, p1

    if-lez v1, :cond_5

    goto :goto_3

    :cond_5
    move p1, v7

    :goto_3
    const/high16 v1, 0x3d800000    # 0.0625f

    cmpg-float v2, p1, v1

    if-gez v2, :cond_6

    move p1, v1

    .line 229
    :cond_6
    iget v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mISO:I

    int-to-long v1, v1

    iget-wide v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    mul-long/2addr v1, v3

    long-to-float v1, v1

    mul-float/2addr p1, v1

    const v1, 0x48f42400    # 500000.0f

    .line 233
    iget v2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mLowerISO:I

    int-to-float v3, v2

    mul-float/2addr v3, v1

    cmpl-float v3, p1, v3

    if-lez v3, :cond_7

    div-float v2, p1, v1

    move v8, v2

    move v2, v1

    move v1, v8

    goto :goto_4

    :cond_7
    int-to-float v1, v2

    int-to-float v2, v2

    div-float v2, p1, v2

    .line 240
    :goto_4
    iget v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mUpperISO:I

    int-to-float v4, v3

    cmpl-float v4, v1, v4

    if-lez v4, :cond_8

    int-to-float v1, v3

    div-float v2, p1, v1

    :cond_8
    float-to-int p1, v1

    .line 244
    iput p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mISO:I

    float-to-long v1, v2

    .line 245
    iput-wide v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    .line 246
    iget-wide v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    iget-wide v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mUpperExposureNanos:J

    cmp-long p1, v1, v3

    if-lez p1, :cond_9

    .line 247
    iput-wide v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    goto :goto_5

    .line 248
    :cond_9
    iget-wide v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mLowerExposureNanos:J

    cmp-long p1, v1, v3

    if-gez p1, :cond_a

    .line 249
    iput-wide v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    :cond_a
    :goto_5
    return v0
.end method

.method private prepareInputBuffer()I
    .locals 4

    const/4 v0, 0x1

    .line 95
    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 96
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES31;->glGenBuffers(I[II)V

    const-string v0, "glGenBuffers"

    .line 97
    invoke-static {v0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 98
    aget v0, v1, v2

    const v1, 0x90d2

    .line 99
    invoke-static {v1, v0}, Landroid/opengl/GLES31;->glBindBuffer(II)V

    const-string v3, "glBindBuffer"

    .line 100
    invoke-static {v3}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 101
    invoke-static {v1, v2}, Landroid/opengl/GLES31;->glBindBuffer(II)V

    const-string v1, "glBindBuffer"

    .line 102
    invoke-static {v1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    return v0
.end method

.method private prepareOutputBuffer()I
    .locals 6

    const/4 v0, 0x1

    .line 107
    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 108
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES31;->glGenBuffers(I[II)V

    const-string v0, "glGenBuffers"

    .line 109
    invoke-static {v0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 110
    aget v0, v1, v2

    const v1, 0x90d2

    .line 111
    invoke-static {v1, v0}, Landroid/opengl/GLES31;->glBindBuffer(II)V

    const-string v3, "glBindBuffer"

    .line 112
    invoke-static {v3}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 113
    iget-object v3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramData:Ljava/nio/IntBuffer;

    const/16 v4, 0x400

    const v5, 0x88e8

    invoke-static {v1, v4, v3, v5}, Landroid/opengl/GLES31;->glBufferData(IILjava/nio/Buffer;I)V

    const-string v3, "glBufferData"

    .line 114
    invoke-static {v3}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 115
    invoke-static {v1, v2}, Landroid/opengl/GLES31;->glBindBuffer(II)V

    const-string v1, "glBindBuffer"

    .line 116
    invoke-static {v1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    return v0
.end method

.method private uploadPixelData(IILjava/nio/ByteBuffer;)V
    .locals 12

    const/4 v0, 0x1

    .line 121
    new-array v1, v0, [I

    .line 122
    iget v2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentWidth:I

    if-ne v2, p1, :cond_0

    iget v2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentHeight:I

    if-eq v2, p2, :cond_2

    .line 124
    :cond_0
    iget v2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    aput v2, v1, v3

    .line 126
    invoke-static {v0, v1, v3}, Landroid/opengl/GLES31;->glDeleteTextures(I[II)V

    .line 128
    :cond_1
    invoke-static {v0, v1, v3}, Landroid/opengl/GLES31;->glGenTextures(I[II)V

    .line 129
    aget v1, v1, v3

    iput v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    .line 130
    iput p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentWidth:I

    .line 131
    iput p2, p0, Lcom/scandit/base/camera/SbAutoExposure;->mCurrentHeight:I

    .line 132
    iget v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const/16 v2, 0xde1

    invoke-static {v2, v1}, Landroid/opengl/GLES31;->glBindTexture(II)V

    const-string v1, "glBindTexture"

    .line 133
    invoke-static {v1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    const v1, 0x8058

    .line 134
    div-int/lit8 v3, p1, 0x4

    invoke-static {v2, v0, v1, v3, p2}, Landroid/opengl/GLES31;->glTexStorage2D(IIIII)V

    const-string v0, "glTexStorage2D"

    .line 135
    invoke-static {v0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    add-int/lit8 v0, p1, -0x3c

    .line 136
    div-int/lit8 v0, v0, 0x8

    add-int/lit16 v1, p2, -0xc8

    .line 137
    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0x64

    .line 138
    invoke-static {v2, v0, v1}, Landroid/opengl/GLES31;->glUniform2i(III)V

    .line 141
    :cond_2
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    const/16 v3, 0xde1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 143
    div-int/lit8 v7, p1, 0x4

    const/16 v9, 0x1908

    const/16 v10, 0x1401

    move v8, p2

    move-object v11, p3

    invoke-static/range {v3 .. v11}, Landroid/opengl/GLES31;->glTexSubImage2D(IIIIIIIILjava/nio/Buffer;)V

    const-string p1, "glTexSubImage2D"

    .line 144
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getExposureNanos()J
    .locals 2

    .line 255
    iget-wide v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    return-wide v0
.end method

.method public getISO()I
    .locals 1

    .line 258
    iget v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mISO:I

    return v0
.end method

.method public updateExposureAndISO(JIIILjava/nio/ByteBuffer;)Z
    .locals 7

    .line 155
    iget-object v0, p0, Lcom/scandit/base/camera/SbAutoExposure;->mOffScreenSurface:Lcom/scandit/base/gl/OffScreenSurface;

    invoke-virtual {v0}, Lcom/scandit/base/gl/OffScreenSurface;->makeCurrent()Z

    .line 156
    iput-wide p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mExposureNanos:J

    .line 157
    iput p3, p0, Lcom/scandit/base/camera/SbAutoExposure;->mISO:I

    .line 158
    iget p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const/16 p2, 0xde1

    invoke-static {p2, p1}, Landroid/opengl/GLES31;->glBindTexture(II)V

    const-string p1, "glBindTexture"

    .line 159
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 161
    invoke-direct {p0, p4, p5, p6}, Lcom/scandit/base/camera/SbAutoExposure;->uploadPixelData(IILjava/nio/ByteBuffer;)V

    .line 163
    iget v1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mInputPixelTexture:I

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x88b8

    const v6, 0x8058

    invoke-static/range {v0 .. v6}, Landroid/opengl/GLES31;->glBindImageTexture(IIIZIII)V

    const-string p1, "glBindImageTexture"

    .line 164
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 165
    iget p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramBuffer:I

    const/4 p2, 0x1

    const p3, 0x90d2

    invoke-static {p3, p2, p1}, Landroid/opengl/GLES31;->glBindBufferBase(III)V

    const-string p1, "glBindBufferBase"

    .line 166
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    const-string p1, "glBufferData"

    .line 167
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 168
    iget p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramBuffer:I

    invoke-static {p3, p1}, Landroid/opengl/GLES31;->glBindBuffer(II)V

    .line 169
    iget-object p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramData:Ljava/nio/IntBuffer;

    invoke-virtual {p1}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    .line 170
    iget-object p1, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramData:Ljava/nio/IntBuffer;

    invoke-virtual {p1}, Ljava/nio/IntBuffer;->capacity()I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    iget-object p4, p0, Lcom/scandit/base/camera/SbAutoExposure;->mHistogramData:Ljava/nio/IntBuffer;

    const p5, 0x88e8

    invoke-static {p3, p1, p4, p5}, Landroid/opengl/GLES31;->glBufferData(IILjava/nio/Buffer;I)V

    const-string p1, "glBufferData"

    .line 172
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 173
    invoke-static {p1}, Landroid/opengl/GLES31;->glMemoryBarrier(I)V

    const/4 p4, 0x6

    const/16 p5, 0x14

    .line 176
    invoke-static {p4, p5, p2}, Landroid/opengl/GLES31;->glDispatchCompute(III)V

    const-string p4, "glDispatchCompute"

    .line 177
    invoke-static {p4}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 178
    invoke-static {p1}, Landroid/opengl/GLES31;->glMemoryBarrier(I)V

    const-string p1, "glMemoryBarrier"

    .line 179
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    const-string p1, "glBindBuffer"

    .line 181
    invoke-static {p1}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/16 p4, 0x400

    .line 183
    invoke-static {p3, p1, p4, p2}, Landroid/opengl/GLES31;->glMapBufferRange(IIII)Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    const-string p2, "glMapBufferRange"

    .line 184
    invoke-static {p2}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 185
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object p1

    .line 186
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/SbAutoExposure;->calculateExposureAndISO(Ljava/nio/IntBuffer;)Z

    move-result p1

    .line 187
    invoke-static {p3}, Landroid/opengl/GLES31;->glUnmapBuffer(I)Z

    const-string p2, "glUnmapBuffer"

    .line 188
    invoke-static {p2}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    return p1
.end method
