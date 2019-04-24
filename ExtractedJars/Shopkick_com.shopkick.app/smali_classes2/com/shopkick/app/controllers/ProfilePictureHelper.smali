.class public Lcom/shopkick/app/controllers/ProfilePictureHelper;
.super Ljava/lang/Object;
.source "ProfilePictureHelper.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;
.implements Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;,
        Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;,
        Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;
    }
.end annotation


# static fields
.field private static final DEFAULT_CROP_HEIGHT:I = 0x190

.field private static final DEFAULT_CROP_WIDTH:I = 0x280

.field private static final SD_CARD_IMAGE_EXT:Ljava/lang/String; = ".jpg"


# instance fields
.field private final SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

.field private final SD_CARD_TEMP_FILE:Ljava/lang/String;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private asyncSaveSelectPhoto:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private callback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

.field private cameraCaptureFile:Ljava/io/File;

.field private cameraCaptureProgress:Landroid/app/ProgressDialog;

.field private contentResolver:Landroid/content/ContentResolver;

.field private cropX:I

.field private cropY:I

.field private currentActivity:Landroid/app/Activity;

.field private imageOutputFile:Ljava/io/File;

.field private imageToCropFile:Ljava/io/File;

.field private mediaConnection:Landroid/media/MediaScannerConnection;

.field private mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/ContentResolver;Landroid/media/MediaScannerConnection;Lcom/shopkick/app/util/SKMediaScannerConnectionClient;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 74
    iput-object p3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->contentResolver:Landroid/content/ContentResolver;

    .line 75
    iput-object p4, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnection:Landroid/media/MediaScannerConnection;

    .line 76
    iput-object p5, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    const/16 p2, 0x280

    .line 78
    iput p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropX:I

    const/16 p2, 0x190

    .line 79
    iput p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropY:I

    const/4 p2, 0x0

    .line 81
    invoke-virtual {p1, p2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 83
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p3, "shopkickImg"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_FILE:Ljava/lang/String;

    .line 84
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "shopkickCropImg"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 86
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_FILE:Ljava/lang/String;

    const-string p1, ""

    .line 87
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/app/Activity;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Landroid/content/ContentResolver;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->contentResolver:Landroid/content/ContentResolver;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/controllers/ProfilePictureHelper;)Ljava/lang/String;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/controllers/ProfilePictureHelper;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/controllers/ProfilePictureHelper;Ljava/io/File;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->startCropIntent(Ljava/io/File;)V

    return-void
.end method

.method private cleanup()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnection:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;->registerListener(Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureFile:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 102
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureFile:Ljava/io/File;

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 106
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 107
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageToCropFile:Ljava/io/File;

    if-eqz v0, :cond_2

    .line 111
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 112
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageToCropFile:Ljava/io/File;

    .line 115
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_3

    .line 116
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 118
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    .line 121
    :cond_3
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureProgress:Landroid/app/ProgressDialog;

    .line 122
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->callback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    .line 123
    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->contentResolver:Landroid/content/ContentResolver;

    return-void
.end method

.method private handleCaptureResult(ILandroid/content/Intent;)V
    .locals 0

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureFile:Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->startCropIntent(Ljava/io/File;)V

    goto :goto_0

    .line 234
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    :goto_0
    return-void
.end method

.method private handleCropResult(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 275
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->callback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    invoke-direct {p0, p2}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->handleCroppedImage(Landroid/content/Intent;)[B

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;->photoCropped([B)V

    .line 277
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    return-void
.end method

.method private handleCroppedImage(Landroid/content/Intent;)[B
    .locals 3

    .line 281
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 284
    :try_start_0
    new-instance p1, Ljava/io/FileInputStream;

    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 285
    invoke-virtual {p1}, Ljava/io/FileInputStream;->available()I

    move-result v0

    .line 286
    new-array v0, v0, [B

    .line 287
    invoke-virtual {p1, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 288
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 293
    const-class v0, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IOException reading photo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 291
    const-class v0, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FileNotFoundException reading photo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private handleGalleryChooseResult(ILandroid/content/Intent;)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    .line 239
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 240
    new-instance p1, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;

    invoke-direct {p1, p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper$SavePictureAsyncTask;-><init>(Lcom/shopkick/app/controllers/ProfilePictureHelper;)V

    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->asyncSaveSelectPhoto:Landroid/os/AsyncTask;

    .line 241
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->asyncSaveSelectPhoto:Landroid/os/AsyncTask;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/Intent;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 243
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    :goto_0
    return-void
.end method

.method private isExternalDirectoryAvailable()Z
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_FILE:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private launchCameraScreen()V
    .locals 5

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 162
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_FILE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".jpg"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureFile:Ljava/io/File;

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 167
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "output"

    .line 172
    iget-object v2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    .line 173
    invoke-virtual {v4}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".provider"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureFile:Ljava/io/File;

    invoke-static {v2, v3, v4}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 172
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v1, 0x1

    .line 174
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const/4 v2, 0x3

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private startCropIntent(Ljava/io/File;)V
    .locals 4

    if-nez p1, :cond_0

    .line 249
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    return-void

    .line 252
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageToCropFile:Ljava/io/File;

    .line 254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 255
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->SD_CARD_TEMP_CROP_FILE:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".jpg"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 256
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    .line 258
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageToCropFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 260
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;->registerListener(Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 261
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnection:Landroid/media/MediaScannerConnection;

    invoke-virtual {p1}, Landroid/media/MediaScannerConnection;->connect()V

    .line 263
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const v0, 0x7f1100f8

    .line 264
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const v2, 0x7f1100f7

    .line 265
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 263
    invoke-static {p1, v0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureProgress:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 269
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 0

    .line 93
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    return-void
.end method

.method public getMimeType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    .line 423
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    .line 425
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 428
    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 427
    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 429
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object p2

    .line 430
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 429
    invoke-virtual {p2, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public launchCameraScreen(Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)Z
    .locals 3

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 142
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->isExternalDirectoryAvailable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 146
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->callback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    .line 150
    sget-object p1, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_2

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addPermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    sget-object v1, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    const/16 v2, 0x1b

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return v0

    .line 155
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->launchCameraScreen()V

    return v0
.end method

.method public launchPictureGallery(Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;)Z
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 184
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->isExternalDirectoryAvailable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 188
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->callback:Lcom/shopkick/app/controllers/ProfilePictureHelper$IProfilePictureHelperCallback;

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 192
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 193
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "image/*"

    .line 194
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    .line 195
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const v1, 0x7f1100fc

    .line 199
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 197
    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const/16 v1, 0x16

    .line 196
    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p1, 0x1

    return p1
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    if-ne v0, p1, :cond_1

    const/16 p1, 0x16

    if-eq p2, p1, :cond_0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 222
    :pswitch_0
    invoke-direct {p0, p3, p4}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->handleCropResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 216
    :pswitch_1
    invoke-direct {p0, p3, p4}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->handleCaptureResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 219
    :cond_0
    invoke-direct {p0, p3, p4}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->handleGalleryChooseResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 226
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onMediaScannerConnected()V
    .locals 3

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->mediaConnection:Landroid/media/MediaScannerConnection;

    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageToCropFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 441
    iget-object p3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    if-eqz p3, :cond_3

    const/16 v0, 0x1b

    if-eq p1, v0, :cond_0

    goto :goto_1

    .line 445
    :cond_0
    check-cast p3, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p3, p0}, Lcom/shopkick/app/activities/BaseActivity;->removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 447
    sget-object p1, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    iget-object p3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    invoke-static {p1, p3}, Lcom/shopkick/app/permissions/PermissionUtils;->arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 449
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->launchCameraScreen()V

    goto :goto_0

    .line 452
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const-string p3, "android.permission.CAMERA"

    invoke-static {p1, p3}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 454
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/shopkick/app/permissions/PermissionUtils;->showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;)V

    .line 456
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cleanup()V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    .line 471
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.android.camera.action.CROP"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "image/*"

    .line 472
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "crop"

    const-string/jumbo v0, "true"

    .line 473
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "aspectX"

    .line 474
    iget v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "aspectY"

    .line 475
    iget v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropY:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "outputX"

    .line 476
    iget v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "outputY"

    .line 477
    iget v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropY:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "scale"

    const/4 v0, 0x1

    .line 478
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p2, "output"

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->imageOutputFile:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p2, "outputFormat"

    .line 480
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 482
    iget-object p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 483
    iget-object p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->currentActivity:Landroid/app/Activity;

    const/4 v0, 0x4

    invoke-virtual {p2, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 484
    iget-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureProgress:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_0

    .line 485
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 p1, 0x0

    .line 486
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cameraCaptureProgress:Landroid/app/ProgressDialog;

    :cond_0
    return-void
.end method

.method public setCropSize(II)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropX:I

    .line 128
    iput p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper;->cropY:I

    return-void
.end method
