.class public final Lcom/scandit/recognition/RecognitionContext;
.super Lcom/scandit/recognition/NativeHandle;
.source "RecognitionContext.java"


# static fields
.field public static final STATUS_FRAME_SEQUENCE_NOT_STARTED:I

.field public static final STATUS_INCONSISTENT_IMAGE_DATA:I

.field public static final STATUS_INTERNAL_ERROR:I

.field public static final STATUS_INVALID_APP_ID:I

.field public static final STATUS_INVALID_DEVICE:I

.field public static final STATUS_INVALID_PLATFORM:I

.field public static final STATUS_INVALID_SDK_VERSION:I

.field public static final STATUS_LICENSE_KEY_EXPIRED:I

.field public static final STATUS_LICENSE_KEY_MISSING:I

.field public static final STATUS_LICENSE_VALIDATION_FAILED_400:I

.field public static final STATUS_LICENSE_VALIDATION_FAILED_403:I

.field public static final STATUS_NO_NETWORK_CONNECTION:I

.field public static final STATUS_SUCCESS:I

.field public static final STATUS_UNKNOWN:I

.field public static final STATUS_UNSUPPORTED_IMAGE_DATA:I

.field public static final STATUS_VALIDATION_FAILED:I

.field public static final VERSION:Ljava/lang/String;

.field private static sDeviceIdFileIdentifier:Ljava/lang/String;

.field private static sDeviceIdKey:Ljava/lang/String;

.field private static sFrameworkName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    invoke-static {}, Lcom/scandit/recognition/Native;->sc_get_framework_version()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/scandit/recognition/RecognitionContext;->VERSION:Ljava/lang/String;

    .line 44
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_UNKNOWN_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_UNKNOWN:I

    .line 45
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_SUCCESS:I

    .line 46
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INTERNAL_ERROR_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INTERNAL_ERROR:I

    .line 47
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_FRAME_SEQUENCE_NOT_STARTED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_FRAME_SEQUENCE_NOT_STARTED:I

    .line 48
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_UNSUPPORTED_IMAGE_DATA_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_UNSUPPORTED_IMAGE_DATA:I

    .line 49
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INCONSISTENT_IMAGE_DATA_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INCONSISTENT_IMAGE_DATA:I

    .line 50
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_NO_NETWORK_CONNECTION_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_NO_NETWORK_CONNECTION:I

    .line 51
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_VALIDATION_FAILED:I

    .line 52
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_400_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_LICENSE_VALIDATION_FAILED_400:I

    .line 53
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_403_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_LICENSE_VALIDATION_FAILED_403:I

    .line 54
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_LICENSE_KEY_MISSING_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_LICENSE_KEY_MISSING:I

    .line 55
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_LICENSE_KEY_EXPIRED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_LICENSE_KEY_EXPIRED:I

    .line 56
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INVALID_PLATFORM_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INVALID_PLATFORM:I

    .line 57
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INVALID_APP_ID_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INVALID_APP_ID:I

    .line 58
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INVALID_DEVICE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INVALID_DEVICE:I

    .line 59
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_INVALID_SDK_VERSION_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/RecognitionContext;->STATUS_INVALID_SDK_VERSION:I

    const-string v0, "native_low_level"

    .line 61
    sput-object v0, Lcom/scandit/recognition/RecognitionContext;->sFrameworkName:Ljava/lang/String;

    const-string v0, "com.scandit.device_id"

    .line 62
    sput-object v0, Lcom/scandit/recognition/RecognitionContext;->sDeviceIdFileIdentifier:Ljava/lang/String;

    const-string v0, "device_id"

    .line 63
    sput-object v0, Lcom/scandit/recognition/RecognitionContext;->sDeviceIdKey:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    .locals 9

    .line 66
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v4, Lcom/scandit/recognition/RecognitionContext;->sFrameworkName:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 69
    invoke-static {p1}, Lcom/scandit/recognition/RecognitionContext;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    move-object v0, p2

    move-object v8, p4

    .line 66
    invoke-static/range {v0 .. v8}, Lcom/scandit/recognition/Native;->sc_recognition_context_new_full(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method

.method public static create(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/scandit/recognition/RecognitionContext;
    .locals 2

    .line 128
    new-instance v0, Lcom/scandit/recognition/RecognitionContext;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/scandit/recognition/RecognitionContext;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static create(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Lcom/scandit/recognition/RecognitionContext;
    .locals 1

    .line 94
    new-instance v0, Lcom/scandit/recognition/RecognitionContext;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/scandit/recognition/RecognitionContext;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private static getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 98
    sget-object v0, Lcom/scandit/recognition/RecognitionContext;->sDeviceIdFileIdentifier:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 100
    sget-object v1, Lcom/scandit/recognition/RecognitionContext;->sDeviceIdKey:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 105
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v1, "android_id"

    invoke-static {p0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 107
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_1

    return-object p0

    .line 116
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad1d000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 120
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 121
    sget-object v1, Lcom/scandit/recognition/RecognitionContext;->sDeviceIdKey:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 122
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object p0
.end method

.method private static indexToChannel(I)I
    .locals 1

    if-nez p0, :cond_0

    .line 214
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PLANE_CHANNEL_Y_get()I

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 217
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PLANE_CHANNEL_U_get()I

    move-result p0

    return p0

    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    .line 220
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_PLANE_CHANNEL_V_get()I

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static indexToSubsampling(I)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method

.method public static setFrameworkName(Ljava/lang/String;)V
    .locals 0

    .line 274
    sput-object p0, Lcom/scandit/recognition/RecognitionContext;->sFrameworkName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public endFrameSequence()V
    .locals 2

    .line 157
    iget-wide v0, p0, Lcom/scandit/recognition/RecognitionContext;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_recognition_context_end_frame_sequence(J)V

    return-void
.end method

.method public processFrame(Landroid/media/Image;)V
    .locals 29
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 239
    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_3

    .line 242
    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    array-length v0, v0

    int-to-long v5, v0

    .line 243
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sc_image_plane_make_array(J)J

    move-result-wide v7

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 245
    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v2

    aget-object v2, v2, v1

    int-to-long v3, v1

    .line 246
    invoke-static {v7, v8, v3, v4}, Lcom/scandit/recognition/Native;->sc_image_plane_array_get(JJ)J

    move-result-wide v3

    .line 247
    invoke-static {v1}, Lcom/scandit/recognition/RecognitionContext;->indexToSubsampling(I)I

    move-result v9

    .line 248
    invoke-static {v1}, Lcom/scandit/recognition/RecognitionContext;->indexToChannel(I)I

    move-result v11

    .line 249
    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getWidth()I

    move-result v10

    int-to-long v12, v10

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getHeight()I

    move-result v10

    int-to-long v14, v10

    int-to-long v9, v9

    move/from16 v24, v0

    .line 250
    invoke-virtual {v2}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v0

    move-wide/from16 v25, v5

    int-to-long v5, v0

    .line 251
    invoke-virtual {v2}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v0

    move-wide/from16 v27, v7

    int-to-long v7, v0

    move-wide/from16 v18, v9

    move-wide v9, v3

    move-wide/from16 v16, v18

    move-wide/from16 v20, v5

    move-wide/from16 v22, v7

    .line 248
    invoke-static/range {v9 .. v23}, Lcom/scandit/recognition/Native;->sc_image_plane_assign(JIJJJJJJ)V

    .line 252
    invoke-virtual {v2}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v3, v4, v0}, Lcom/scandit/recognition/Native;->sc_image_plane_set_buffer(JLjava/nio/ByteBuffer;)V

    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v24

    move-wide/from16 v5, v25

    move-wide/from16 v7, v27

    goto :goto_0

    :cond_0
    move-wide/from16 v25, v5

    move-wide/from16 v27, v7

    move-object/from16 v7, p0

    .line 254
    iget-wide v1, v7, Lcom/scandit/recognition/RecognitionContext;->mNative:J

    move-wide/from16 v3, v27

    invoke-static/range {v1 .. v6}, Lcom/scandit/recognition/Native;->sc_recognition_context_process_planes(JJJ)J

    move-result-wide v1

    .line 255
    invoke-static/range {v27 .. v28}, Lcom/scandit/recognition/Native;->sc_image_plane_free_array(J)V

    .line 256
    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->ScProcessFrameResult_status_get(J)I

    move-result v0

    .line 258
    :try_start_0
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_UNKNOWN_get()I

    move-result v3

    if-eq v0, v3, :cond_2

    .line 259
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I

    move-result v3

    if-ne v0, v3, :cond_1

    goto :goto_1

    .line 260
    :cond_1
    invoke-static {v0}, Lcom/scandit/recognition/Native;->sc_context_status_flag_get_message(I)Ljava/lang/String;

    move-result-object v3

    .line 261
    new-instance v4, Lcom/scandit/recognition/ContextStatusException;

    invoke-direct {v4, v0, v3}, Lcom/scandit/recognition/ContextStatusException;-><init>(ILjava/lang/String;)V

    throw v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    :cond_2
    :goto_1
    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->delete_ScProcessFrameResult(J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v1, v2}, Lcom/scandit/recognition/Native;->delete_ScProcessFrameResult(J)V

    throw v0

    :cond_3
    move-object/from16 v7, p0

    .line 240
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "only YUV 420 subsampled images are supported at the moment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public processFrame(Lcom/scandit/recognition/ImageDescription;[B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/recognition/ContextStatusException;
        }
    .end annotation

    .line 192
    iget-wide v0, p0, Lcom/scandit/recognition/RecognitionContext;->mNative:J

    invoke-virtual {p1}, Lcom/scandit/recognition/ImageDescription;->getHandle()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3, p2}, Lcom/scandit/recognition/Native;->sc_recognition_context_process_frame(JJ[B)J

    move-result-wide p1

    .line 194
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->ScProcessFrameResult_status_get(J)I

    move-result v0

    .line 196
    :try_start_0
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_UNKNOWN_get()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 197
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 198
    :cond_0
    invoke-static {v0}, Lcom/scandit/recognition/Native;->sc_context_status_flag_get_message(I)Ljava/lang/String;

    move-result-object v1

    .line 199
    new-instance v2, Lcom/scandit/recognition/ContextStatusException;

    invoke-direct {v2, v0, v1}, Lcom/scandit/recognition/ContextStatusException;-><init>(ILjava/lang/String;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->delete_ScProcessFrameResult(J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->delete_ScProcessFrameResult(J)V

    throw v0
.end method

.method protected release(J)V
    .locals 0

    .line 270
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_recognition_context_release(J)V

    return-void
.end method

.method public setGeographicalLocation(FF)V
    .locals 2

    .line 174
    iget-wide v0, p0, Lcom/scandit/recognition/RecognitionContext;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_recognition_context_set_geographical_location(JFF)V

    return-void
.end method

.method public startNewFrameSequence()V
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/scandit/recognition/RecognitionContext;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_recognition_context_start_new_frame_sequence(J)V

    return-void
.end method
