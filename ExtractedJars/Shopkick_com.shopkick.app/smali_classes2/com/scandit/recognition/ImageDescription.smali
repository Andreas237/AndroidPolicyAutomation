.class public Lcom/scandit/recognition/ImageDescription;
.super Lcom/scandit/recognition/NativeHandle;
.source "ImageDescription.java"


# static fields
.field public static final IMAGE_LAYOUT_GRAY_8U:I

.field public static final IMAGE_LAYOUT_RGBA_8U:I

.field public static final IMAGE_LAYOUT_RGB_8U:I

.field public static final IMAGE_LAYOUT_UNKNOWN:I

.field public static final IMAGE_LAYOUT_YPCBCR_8U:I

.field public static final IMAGE_LAYOUT_YPCRCB_8U:I

.field public static final IMAGE_LAYOUT_YUYV_8U:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_UNKNOWN_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_UNKNOWN:I

    .line 46
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_GRAY_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_GRAY_8U:I

    .line 53
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_RGB_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_RGB_8U:I

    .line 60
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_RGBA_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_RGBA_8U:I

    .line 69
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_YPCBCR_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCBCR_8U:I

    .line 78
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_YPCRCB_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YPCRCB_8U:I

    .line 88
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_IMAGE_LAYOUT_YUYV_8U_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/ImageDescription;->IMAGE_LAYOUT_YUYV_8U:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 99
    invoke-static {}, Lcom/scandit/recognition/Native;->sc_image_description_new()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getFirstPlaneOffset()I
    .locals 2

    .line 152
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_first_plane_offset(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getFirstPlaneRowBytes()I
    .locals 2

    .line 172
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_first_plane_row_bytes(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getHeight()I
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_height(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getLayout()I
    .locals 2

    .line 248
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_layout(J)I

    move-result v0

    return v0
.end method

.method public getMemorySize()J
    .locals 2

    .line 259
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_memory_size(J)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getSecondPlaneOffset()I
    .locals 2

    .line 192
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_second_plane_offset(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getSecondPlaneRowBytes()I
    .locals 2

    .line 212
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_second_plane_row_bytes(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getWidth()I
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_image_description_get_width(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method protected release(J)V
    .locals 0

    .line 276
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_image_description_release(J)V

    return-void
.end method

.method public setFirstPlaneOffset(I)V
    .locals 4

    .line 162
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_first_plane_offset(JJ)V

    return-void
.end method

.method public setFirstPlaneRowBytes(I)V
    .locals 4

    .line 182
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_first_plane_row_bytes(JJ)V

    return-void
.end method

.method public setHeight(I)V
    .locals 4

    .line 141
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_height(JJ)V

    return-void
.end method

.method public setLayout(I)V
    .locals 2

    .line 234
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_image_description_set_layout(JI)V

    return-void
.end method

.method public setMemorySize(I)V
    .locals 4

    .line 271
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_memory_size(JJ)V

    return-void
.end method

.method public setSecondPlaneByteRowBytes(I)V
    .locals 4

    .line 222
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_second_plane_row_bytes(JJ)V

    return-void
.end method

.method public setSecondPlaneOffset(I)V
    .locals 4

    .line 202
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_second_plane_offset(JJ)V

    return-void
.end method

.method public setWidth(I)V
    .locals 4

    .line 109
    iget-wide v0, p0, Lcom/scandit/recognition/ImageDescription;->mNative:J

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_image_description_set_width(JJ)V

    return-void
.end method
