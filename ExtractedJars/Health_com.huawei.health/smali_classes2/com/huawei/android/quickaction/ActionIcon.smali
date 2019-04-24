.class public final Lcom/huawei/android/quickaction/ActionIcon;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/android/quickaction/ActionIcon$a;,
        Lcom/huawei/android/quickaction/ActionIcon$e;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/android/quickaction/ActionIcon;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ActionIcon"

.field private static final TYPE_BITMAP:I = 0x1

.field private static final TYPE_RESOURCE:I = 0x2

.field private static final TYPE_URI:I = 0x3


# instance fields
.field private mInt1:I

.field private mObj1:Ljava/lang/Object;

.field private mString1:Ljava/lang/String;

.field private final mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 433
    new-instance v0, Lcom/huawei/android/quickaction/ActionIcon$4;

    invoke-direct {v0}, Lcom/huawei/android/quickaction/ActionIcon$4;-><init>()V

    sput-object v0, Lcom/huawei/android/quickaction/ActionIcon;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 441
    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    iput p1, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    .line 274
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 7

    .line 392
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/android/quickaction/ActionIcon;-><init>(I)V

    .line 393
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 395
    :pswitch_0
    sget-object v0, Landroid/graphics/Bitmap;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/Bitmap;

    .line 396
    iput-object v3, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;

    .line 397
    goto :goto_1

    .line 399
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 400
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 401
    iput-object v4, p0, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    .line 402
    iput v5, p0, Lcom/huawei/android/quickaction/ActionIcon;->mInt1:I

    .line 403
    goto :goto_1

    .line 405
    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    .line 406
    iput-object v6, p0, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    .line 407
    goto :goto_1

    .line 409
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 410
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " type in parcel: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 409
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 412
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static createWithBitmap(Landroid/graphics/Bitmap;)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 3

    .line 312
    if-nez p0, :cond_0

    .line 313
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Bitmap must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 315
    :cond_0
    new-instance v2, Lcom/huawei/android/quickaction/ActionIcon;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lcom/huawei/android/quickaction/ActionIcon;-><init>(I)V

    .line 316
    invoke-direct {v2, p0}, Lcom/huawei/android/quickaction/ActionIcon;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 317
    return-object v2
.end method

.method public static createWithContentUri(Landroid/net/Uri;)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 2

    .line 340
    if-nez p0, :cond_0

    .line 341
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Uri must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 343
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/android/quickaction/ActionIcon;->createWithContentUri(Ljava/lang/String;)Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v0

    return-object v0
.end method

.method public static createWithContentUri(Ljava/lang/String;)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 3

    .line 326
    if-nez p0, :cond_0

    .line 327
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Uri must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 329
    :cond_0
    new-instance v2, Lcom/huawei/android/quickaction/ActionIcon;

    const/4 v0, 0x3

    invoke-direct {v2, v0}, Lcom/huawei/android/quickaction/ActionIcon;-><init>(I)V

    .line 330
    iput-object p0, v2, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    .line 331
    return-object v2
.end method

.method public static createWithFilePath(Ljava/lang/String;)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 1

    .line 353
    invoke-static {p0}, Lcom/huawei/android/quickaction/ActionIcon;->createWithContentUri(Ljava/lang/String;)Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v0

    return-object v0
.end method

.method public static createWithResource(Landroid/content/Context;I)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 2

    .line 284
    if-nez p0, :cond_0

    .line 285
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 287
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/android/quickaction/ActionIcon;->createWithResource(Ljava/lang/String;I)Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v0

    return-object v0
.end method

.method public static createWithResource(Ljava/lang/String;I)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 3

    .line 297
    if-nez p0, :cond_0

    .line 298
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Resource package name must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 300
    :cond_0
    new-instance v2, Lcom/huawei/android/quickaction/ActionIcon;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Lcom/huawei/android/quickaction/ActionIcon;-><init>(I)V

    .line 301
    iput p1, v2, Lcom/huawei/android/quickaction/ActionIcon;->mInt1:I

    .line 302
    iput-object p0, v2, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    .line 303
    return-object v2
.end method

.method private getBitmap()Landroid/graphics/Bitmap;
    .locals 3

    .line 77
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 78
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getBitmap() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private getResId()I
    .locals 3

    .line 111
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 112
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getResId() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_0
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mInt1:I

    return v0
.end method

.method private getResPackage()Ljava/lang/String;
    .locals 3

    .line 101
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 102
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getResPackage() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    return-object v0
.end method

.method private getResources()Landroid/content/res/Resources;
    .locals 3

    .line 91
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getResources() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    return-object v0
.end method

.method private getUri()Landroid/net/Uri;
    .locals 1

    .line 131
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getUriString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private getUriString()Ljava/lang/String;
    .locals 3

    .line 121
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 122
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getUriString() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    return-object v0
.end method

.method private loadDrawableInner(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 200
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 202
    :pswitch_0
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0

    .line 204
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-nez v0, :cond_2

    .line 206
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResPackage()Ljava/lang/String;

    move-result-object v5

    .line 207
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 211
    :cond_0
    const-string v0, "android"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;

    .line 213
    goto :goto_0

    .line 214
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 216
    .line 216
    .line 217
    const/16 v0, 0x2000

    :try_start_0
    invoke-virtual {v6, v5, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    .line 218
    if-eqz v7, :cond_5

    .line 219
    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 223
    goto :goto_0

    :catch_0
    move-exception v7

    .line 224
    const-string v0, "ActionIcon"

    const-string v1, "Unable to find pkg=%s for icon %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 225
    const/4 v3, 0x0

    aput-object v5, v2, v3

    const/4 v3, 0x1

    aput-object p0, v2, v3

    .line 224
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 224
    .line 225
    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 226
    goto/16 :goto_2

    .line 227
    :catch_1
    move-exception v7

    .line 228
    const-string v0, "ActionIcon"

    const-string v1, "TYPE_RESOURCE NameNotFoundException"

    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 233
    :cond_2
    :goto_0
    :try_start_1
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResId()I

    move-result v1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    return-object v0

    .line 234
    :catch_2
    move-exception v5

    .line 235
    const-string v0, "ActionIcon"

    const-string v1, "Unable to load resource 0x%08x from pkg=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 236
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResPackage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 235
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 235
    .line 236
    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_2

    .line 237
    :catch_3
    move-exception v5

    .line 238
    const-string v0, "ActionIcon"

    const-string v1, "TYPE_RESOURCE RuntimeException"

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 240
    goto/16 :goto_2

    .line 242
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getUri()Landroid/net/Uri;

    move-result-object v5

    .line 243
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    .line 244
    const/4 v7, 0x0

    .line 245
    const-string v0, "content"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 246
    const-string v0, "file"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 248
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v0

    move-object v7, v0

    .line 249
    goto :goto_1

    :catch_4
    move-exception v8

    .line 250
    const-string v0, "ActionIcon"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to load image from URI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 252
    goto :goto_1

    .line 254
    :cond_4
    :try_start_3
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/huawei/android/quickaction/ActionIcon;->mString1:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    move-object v7, v0

    .line 255
    goto :goto_1

    :catch_5
    move-exception v8

    .line 256
    const-string v0, "ActionIcon"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to load image from path: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 257
    :catch_6
    move-exception v8

    .line 258
    const-string v0, "ActionIcon"

    const-string v1, "TYPE_URI FileNotFoundException"

    invoke-static {v0, v1, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 261
    :goto_1
    if-eqz v7, :cond_5

    .line 262
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 263
    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 262
    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0

    .line 269
    :cond_5
    :goto_2
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/android/quickaction/ActionIcon;->mObj1:Ljava/lang/Object;

    .line 85
    return-void
.end method

.method private static final typeToString(I)Ljava/lang/String;
    .locals 1

    .line 135
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 137
    :pswitch_0
    const-string v0, "BITMAP"

    return-object v0

    .line 139
    :pswitch_1
    const-string v0, "RESOURCE"

    return-object v0

    .line 141
    :pswitch_2
    const-string v0, "URI"

    return-object v0

    .line 143
    :goto_0
    const-string v0, "UNKNOWN"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public describeContents()I
    .locals 2

    .line 386
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 189
    invoke-direct {p0, p1}, Lcom/huawei/android/quickaction/ActionIcon;->loadDrawableInner(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 190
    if-eqz v1, :cond_0

    .line 191
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 193
    :cond_0
    return-object v1
.end method

.method loadDrawableAsync(Landroid/content/Context;Landroid/os/Message;)V
    .locals 2

    .line 158
    invoke-virtual {p2}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback message must have a target handler"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_0
    new-instance v0, Lcom/huawei/android/quickaction/ActionIcon$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/android/quickaction/ActionIcon$a;-><init>(Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/Context;Landroid/os/Message;)V

    invoke-virtual {v0}, Lcom/huawei/android/quickaction/ActionIcon$a;->e()V

    .line 162
    return-void
.end method

.method loadDrawableAsync(Landroid/content/Context;Lcom/huawei/android/quickaction/ActionIcon$e;Landroid/os/Handler;)V
    .locals 1

    .line 175
    new-instance v0, Lcom/huawei/android/quickaction/ActionIcon$a;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/huawei/android/quickaction/ActionIcon$a;-><init>(Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/Context;Landroid/os/Handler;Lcom/huawei/android/quickaction/ActionIcon$e;)V

    invoke-virtual {v0}, Lcom/huawei/android/quickaction/ActionIcon$a;->e()V

    .line 176
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Icon(typ="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    invoke-static {v1}, Lcom/huawei/android/quickaction/ActionIcon;->typeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 359
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 361
    :pswitch_0
    const-string v0, " size="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 362
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 363
    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 364
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 365
    goto :goto_0

    .line 367
    :pswitch_1
    const-string v0, " pkg="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 368
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResPackage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 369
    const-string v1, " id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 370
    const-string v1, "0x%08x"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    goto :goto_0

    .line 373
    :pswitch_2
    const-string v0, " uri="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getUriString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 378
    :goto_0
    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 416
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 417
    iget v0, p0, Lcom/huawei/android/quickaction/ActionIcon;->mType:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 419
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Bitmap;->writeToParcel(Landroid/os/Parcel;I)V

    .line 420
    goto :goto_0

    .line 422
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 423
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getResId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 424
    goto :goto_0

    .line 426
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/android/quickaction/ActionIcon;->getUriString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 427
    .line 431
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
