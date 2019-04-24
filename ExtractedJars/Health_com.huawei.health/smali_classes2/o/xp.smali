.class public Lo/xp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:I

.field private static final c:[Ljava/lang/String;

.field public static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 59
    const-class v0, Lo/xp;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/xp;->e:Ljava/lang/String;

    .line 179
    const/4 v0, 0x0

    sput v0, Lo/xp;->b:I

    .line 382
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "display_name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "contact_id"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "sort_key"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "photo_thumb_uri"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "data1"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "mimetype"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/xp;->c:[Ljava/lang/String;

    .line 448
    const-string v0, "^[^@!#$%&\'*+/=?^_`\\(\\){|}~-][a-z0-9!#$%&\'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&\'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+(?:[A-Z]{2}|com|org|net|edu|gov|mil|biz|info|mobi|name|aero|asia|jobs|museum|in)"

    .line 449
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/xp;->d:Ljava/util/regex/Pattern;

    .line 448
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 4

    .line 183
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 184
    invoke-static {p0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    new-instance v1, Lo/xp$3;

    invoke-direct {v1}, Lo/xp$3;-><init>()V

    invoke-virtual {v0, p0, v1}, Lo/vu;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 195
    :cond_0
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUpdatedStepsFromBaseDatabase steps: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/xp;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    sget v0, Lo/xp;->b:I

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(I)I
    .locals 0

    .line 57
    sput p0, Lo/xp;->b:I

    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 238
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "dd/MM/yyyy HH:mm:ss"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 239
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 240
    const/4 v5, 0x0

    .line 242
    :try_start_0
    invoke-virtual {v4, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 245
    goto :goto_0

    .line 243
    :catch_0
    move-exception v6

    .line 244
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    :goto_0
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 247
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 248
    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 251
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/xz;
    .locals 1

    .line 345
    new-instance v0, Lo/xz;

    invoke-direct {v0, p0}, Lo/xz;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 57
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 259
    invoke-static {p0}, Lo/xp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 260
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 261
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v4}, Ljava/util/Date;-><init>(Ljava/lang/String;)V

    .line 262
    new-instance v6, Ljava/util/Date;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 263
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "MM/dd/yyyy HH:mm:ss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 264
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 265
    invoke-virtual {v7, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 267
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    .line 456
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 457
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 458
    const-string v0, "choose_fragemnt_key"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 459
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 460
    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 7

    .line 535
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 536
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lo/xp;->e:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "Parameter is null"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    return-void

    .line 539
    :cond_1
    invoke-static {p0}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v4

    .line 540
    iget-object v5, v4, Lo/xv;->m:Ljava/lang/String;

    .line 541
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 542
    const-string v0, "pic_6"

    invoke-static {v0}, Lo/xp;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 543
    return-void

    .line 545
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 546
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    .line 547
    invoke-virtual {v0, v5}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 548
    const/16 v1, 0x64

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/xm;

    invoke-direct {v1}, Lo/xm;-><init>()V

    .line 549
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 550
    invoke-virtual {v0, p1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_0

    .line 552
    :cond_3
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "local url  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    iget-object v5, v4, Lo/xv;->s:Ljava/lang/String;

    .line 554
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 555
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 556
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 557
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/io/File;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 558
    const/16 v1, 0x64

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/xm;

    invoke-direct {v1}, Lo/xm;-><init>()V

    .line 559
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 560
    invoke-virtual {v0, p1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_0

    .line 562
    :cond_4
    sget v0, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 565
    :goto_0
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Loading the image from the base application through Imageloader part"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 432
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 433
    new-instance v1, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v1, v2, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 436
    goto :goto_0

    .line 434
    :catch_0
    move-exception v2

    .line 435
    move-object v1, p0

    .line 437
    :goto_0
    return-object v1
.end method

.method public static d(Landroid/content/Context;)V
    .locals 6

    .line 166
    const-string v0, "com.huawei.bone.social.preferences"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 167
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.huawei.bone.social.cleardatarequired"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 169
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/bone/social/manager/service/BackgroundWorkerService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v0, "bundle_task"

    const/16 v1, 0x64

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 172
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 173
    invoke-virtual {p0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 174
    return-void
.end method

.method public static e()J
    .locals 5

    .line 272
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v4

    .line 273
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static e(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9

    .line 595
    const/4 v4, 0x0

    .line 596
    const/4 v5, 0x0

    .line 598
    const-string v0, "healthgroup"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 599
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 603
    if-eqz v5, :cond_1

    .line 605
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 608
    goto/16 :goto_1

    .line 606
    :catch_0
    move-exception v6

    .line 607
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    goto :goto_1

    .line 600
    :catch_1
    move-exception v6

    .line 601
    :try_start_2
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 603
    if-eqz v5, :cond_1

    .line 605
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 608
    goto :goto_1

    .line 606
    :catch_2
    move-exception v6

    .line 607
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    goto :goto_1

    .line 603
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_0

    .line 605
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 608
    goto :goto_0

    .line 606
    :catch_3
    move-exception v8

    .line 607
    sget-object v0, Lo/xp;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    :cond_0
    :goto_0
    throw v7

    .line 611
    :cond_1
    :goto_1
    return-object v4
.end method

.method public static e(Landroid/content/Context;)V
    .locals 0

    .line 463
    invoke-static {p0}, Lo/xp;->d(Landroid/content/Context;)V

    .line 464
    return-void
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 3

    .line 467
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 468
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 469
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 470
    const/4 v0, 0x1

    return v0

    .line 472
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
