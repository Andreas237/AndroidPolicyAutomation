.class public Lo/fdl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;


# instance fields
.field private a:Ljava/io/File;

.field private c:Landroid/net/Uri;

.field private d:Ljava/io/File;

.field private final e:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fdl;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lo/fdl;->e:Landroid/app/Activity;

    .line 58
    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 6

    .line 178
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    sget-object v0, Lo/fdl;->b:[Ljava/lang/String;

    invoke-static {p1, v0}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 180
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_4

    .line 181
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 182
    invoke-virtual {p1, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 183
    :goto_0
    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.permission.CAMERA"

    .line 184
    invoke-virtual {p1, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 185
    :goto_1
    if-nez v4, :cond_4

    if-nez v5, :cond_4

    .line 186
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/ene;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 187
    return-void

    .line 191
    :cond_4
    sget-object v0, Lo/fdl;->b:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/fdl;->b(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 193
    return-void
.end method

.method private b(Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 8

    .line 196
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 198
    invoke-virtual {p0, p1}, Lo/fdl;->d(Landroid/app/Activity;)V

    .line 199
    return-void

    .line 201
    :cond_0
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 202
    new-instance v0, Lo/fdl$5;

    invoke-direct {v0, p0}, Lo/fdl$5;-><init>(Lo/fdl;)V

    invoke-static {p1, p2, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 213
    move-object v4, p2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    .line 214
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 216
    :cond_1
    const-string v0, "android.permission.CAMERA"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 213
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    goto :goto_2

    .line 221
    :cond_4
    invoke-virtual {p0, p1}, Lo/fdl;->d(Landroid/app/Activity;)V

    .line 223
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/fdl;Landroid/app/Activity;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/fdl;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public static e(Landroid/app/Activity;)V
    .locals 3

    .line 255
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.PICK"

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 257
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "image/*"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    const/4 v0, 0x3

    invoke-virtual {p0, v2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 259
    return-void
.end method


# virtual methods
.method public a(ILandroid/content/Intent;)V
    .locals 5

    .line 62
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 64
    :sswitch_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 65
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "version>=6.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fdl;->e:Landroid/app/Activity;

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    :cond_0
    iget-object v4, p0, Lo/fdl;->c:Landroid/net/Uri;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 68
    :goto_0
    if-eqz v4, :cond_2

    .line 69
    invoke-virtual {p0, v4}, Lo/fdl;->e(Landroid/net/Uri;)V

    goto :goto_1

    .line 71
    :cond_2
    return-void

    .line 73
    :goto_1
    goto :goto_3

    .line 74
    :cond_3
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "version<6.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fdl;->e:Landroid/app/Activity;

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5

    :cond_4
    iget-object v4, p0, Lo/fdl;->c:Landroid/net/Uri;

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 76
    :goto_2
    invoke-virtual {p0, v4}, Lo/fdl;->e(Landroid/net/Uri;)V

    .line 78
    .line 83
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public a(Landroid/net/Uri;)V
    .locals 5

    .line 115
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cropPic2,uri ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :try_start_0
    invoke-static {}, Lcom/huawei/operation/utils/WebViewUtils;->createImageFile()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lo/fdl;->a:Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_0

    .line 119
    :catch_0
    move-exception v4

    .line 120
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.android.camera.action.CROP"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 125
    const-string v0, "image/*"

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    const-string v0, "crop"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 128
    const-string v0, "aspectX"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    const-string v0, "aspectY"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 131
    const-string v0, "outputX"

    const/16 v1, 0x12c

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 132
    const-string v0, "outputY"

    const/16 v1, 0x12c

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 133
    const-string v0, "outputFormat"

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    const-string v0, "return-data"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 135
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cropPic,intent ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iget-object v0, p0, Lo/fdl;->a:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 137
    const-string v0, "output"

    iget-object v1, p0, Lo/fdl;->a:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 139
    :cond_0
    iget-object v0, p0, Lo/fdl;->e:Landroid/app/Activity;

    const/4 v1, 0x4

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 140
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 8

    .line 145
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 146
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_select_user_photo:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 147
    sget v0, Lcom/huawei/ui/main/R$id;->line_take_photo:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 148
    sget v0, Lcom/huawei/ui/main/R$id;->line_gallery:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 149
    new-instance v6, Lo/egw$c;

    invoke-direct {v6, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 150
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v1, Lo/fdl$1;

    invoke-direct {v1, p0}, Lo/fdl$1;-><init>(Lo/fdl;)V

    invoke-virtual {v6, v0, v1}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 156
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_select_upload_way:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 157
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 158
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 159
    new-instance v0, Lo/fdl$2;

    invoke-direct {v0, p0, p1, v7}, Lo/fdl$2;-><init>(Lo/fdl;Landroid/app/Activity;Lo/egw;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    new-instance v0, Lo/fdl$4;

    invoke-direct {v0, p0, p1, v7}, Lo/fdl$4;-><init>(Lo/fdl;Landroid/app/Activity;Lo/egw;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 175
    return-void
.end method

.method public d()Ljava/io/File;
    .locals 1

    .line 251
    iget-object v0, p0, Lo/fdl;->a:Ljava/io/File;

    return-object v0
.end method

.method public d(Landroid/app/Activity;)V
    .locals 5

    .line 229
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "takePhoto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :try_start_0
    invoke-static {}, Lcom/huawei/operation/utils/WebViewUtils;->createImageFile()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lo/fdl;->d:Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    goto :goto_0

    .line 232
    :catch_0
    move-exception v4

    .line 233
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :goto_0
    iget-object v0, p0, Lo/fdl;->d:Ljava/io/File;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 238
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 239
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 241
    const-string v0, "com.huawei.health.fileprovider"

    iget-object v1, p0, Lo/fdl;->d:Ljava/io/File;

    invoke-static {p1, v0, v1}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lo/fdl;->c:Landroid/net/Uri;

    .line 243
    const-string v0, "output"

    iget-object v1, p0, Lo/fdl;->c:Landroid/net/Uri;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 244
    const/4 v0, 0x1

    invoke-virtual {p1, v4, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 245
    goto :goto_1

    .line 246
    :cond_0
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == outputImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :goto_1
    return-void
.end method

.method public e(Landroid/net/Uri;)V
    .locals 5

    .line 86
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cropPic2,uri ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :try_start_0
    invoke-static {}, Lcom/huawei/operation/utils/WebViewUtils;->createImageFile()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lo/fdl;->a:Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    goto :goto_0

    .line 90
    :catch_0
    move-exception v4

    .line 91
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :goto_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.android.camera.action.CROP"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 95
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 96
    const-string v0, "image/*"

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    const-string v0, "crop"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 99
    const-string v0, "aspectX"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 100
    const-string v0, "aspectY"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 102
    const-string v0, "outputX"

    const/16 v1, 0x12c

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 103
    const-string v0, "outputY"

    const/16 v1, 0x12c

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 104
    const-string v0, "outputFormat"

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    const-string v0, "return-data"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 106
    const-string v0, "SelectPhotoInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cropPic,intent ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lo/fdl;->a:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 108
    const-string v0, "output"

    iget-object v1, p0, Lo/fdl;->a:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 110
    :cond_0
    iget-object v0, p0, Lo/fdl;->e:Landroid/app/Activity;

    const/4 v1, 0x2

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 111
    return-void
.end method
