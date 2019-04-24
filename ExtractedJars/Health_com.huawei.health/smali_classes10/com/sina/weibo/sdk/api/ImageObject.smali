.class public Lcom/sina/weibo/sdk/api/ImageObject;
.super Lcom/sina/weibo/sdk/api/BaseMediaObject;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/sina/weibo/sdk/api/ImageObject;>;"
        }
    .end annotation
.end field

.field private static final DATA_SIZE:I = 0x200000


# instance fields
.field public imageData:[B

.field public imagePath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/sina/weibo/sdk/api/ImageObject$1;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/api/ImageObject$1;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/api/ImageObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/sina/weibo/sdk/api/BaseMediaObject;-><init>()V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/sina/weibo/sdk/api/BaseMediaObject;-><init>()V

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    .line 61
    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 6

    .line 95
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 96
    const-string v0, "Weibo.ImageObject"

    const-string v1, "imageData and imagePath are null"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    array-length v0, v0

    const/high16 v1, 0x200000

    if-le v0, v1, :cond_1

    .line 100
    const-string v0, "Weibo.ImageObject"

    const-string v1, "imageData is too large"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x200

    if-le v0, v1, :cond_2

    .line 104
    const-string v0, "Weibo.ImageObject"

    const-string v1, "imagePath is too length"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_2
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 108
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 110
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xa00000

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 111
    :cond_3
    const-string v0, "Weibo.ImageObject"

    const-string v1, "checkArgs fail, image content is too large or not exists"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    const/4 v0, 0x0

    return v0

    .line 119
    :cond_4
    goto :goto_0

    .line 115
    :catch_0
    move-exception v5

    .line 116
    const-string v0, "Weibo.ImageObject"

    const-string v1, "checkArgs fail, image content is too large or not exists"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_5
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 85
    const/4 v0, 0x0

    return v0
.end method

.method public getObjType()I
    .locals 1

    .line 126
    const/4 v0, 0x2

    return v0
.end method

.method public final setImageObject(Landroid/graphics/Bitmap;)V
    .locals 6

    .line 64
    const/4 v2, 0x0

    .line 66
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v2, v0

    .line 67
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x55

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 68
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    if-eqz v2, :cond_0

    .line 75
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    :cond_0
    goto :goto_1

    .line 77
    :catch_0
    move-exception v3

    .line 78
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 80
    goto :goto_1

    .line 69
    :catch_1
    move-exception v3

    .line 70
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 71
    const-string v0, "Weibo.ImageObject"

    const-string v1, "put thumb failed"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    if-eqz v2, :cond_1

    .line 75
    :try_start_3
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 79
    :cond_1
    goto :goto_1

    .line 77
    :catch_2
    move-exception v3

    .line 78
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 80
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v4

    .line 74
    if-eqz v2, :cond_2

    .line 75
    :try_start_4
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 79
    :cond_2
    goto :goto_0

    .line 77
    :catch_3
    move-exception v5

    .line 78
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 79
    :goto_0
    throw v4

    .line 81
    :goto_1
    return-void
.end method

.method protected toExtraMediaObject(Ljava/lang/String;)Lcom/sina/weibo/sdk/api/BaseMediaObject;
    .locals 0

    .line 131
    return-object p0
.end method

.method protected toExtraMediaString()Ljava/lang/String;
    .locals 1

    .line 136
    const-string v0, ""

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 91
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    return-void
.end method
