.class public Lo/biw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(Lo/biw;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lo/biw;->d(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 14

    .line 82
    const/4 v8, 0x0

    .line 85
    :try_start_0
    new-instance v9, Ljava/util/Hashtable;

    invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V

    .line 86
    sget-object v0, Lo/oi;->d:Lo/oi;

    const-string v1, "utf-8"

    invoke-virtual {v9, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lo/oi;->h:Lo/oi;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    new-instance v0, Lo/uc;

    invoke-direct {v0}, Lo/uc;-><init>()V

    move-object v1, p1

    sget-object v2, Lo/od;->p:Lo/od;

    move/from16 v3, p2

    move/from16 v4, p3

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lo/uc;->a(Ljava/lang/String;Lo/od;IILjava/util/Map;)Lo/qr;

    move-result-object v10

    .line 90
    mul-int v0, p2, p3

    new-array v11, v0, [I

    .line 93
    const/4 v12, 0x0

    :goto_0
    move/from16 v0, p3

    if-ge v12, v0, :cond_2

    .line 95
    const/4 v13, 0x0

    :goto_1
    move/from16 v0, p2

    if-ge v13, v0, :cond_1

    .line 97
    invoke-virtual {v10, v13, v12}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    mul-int v0, v12, p2

    add-int/2addr v0, v13

    const/high16 v1, -0x1000000

    aput v1, v11, v0

    goto :goto_2

    .line 103
    :cond_0
    mul-int v0, v12, p2

    add-int/2addr v0, v13

    const v1, -0x30305

    aput v1, v11, v0

    .line 95
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 93
    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 108
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v8, v0

    .line 109
    move-object v0, v8

    move-object v1, v11

    move/from16 v3, p2

    move/from16 v6, p2

    move/from16 v7, p3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 118
    goto :goto_3

    .line 111
    :catch_0
    move-exception v9

    .line 113
    const-string v0, "SNSQRCode"

    const-string v1, "QRCode build bitmap meet OutOfMemoryError."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    goto :goto_3

    .line 115
    :catch_1
    move-exception v9

    .line 117
    const-string v0, "SNSQRCode"

    const-string v1, "QRCode build bitmap meet Exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_3
    return-object v8
.end method


# virtual methods
.method public b(Ljava/lang/String;IILandroid/widget/ImageView;)V
    .locals 6

    .line 40
    if-nez p4, :cond_0

    .line 42
    return-void

    .line 45
    :cond_0
    if-lez p2, :cond_1

    if-gtz p3, :cond_2

    .line 47
    :cond_1
    return-void

    .line 50
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 52
    return-void

    .line 55
    :cond_3
    new-instance v0, Lo/biw$2;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/biw$2;-><init>(Lo/biw;Ljava/lang/String;IILandroid/widget/ImageView;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 69
    invoke-virtual {v0, v1, v2}, Lo/biw$2;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 70
    return-void
.end method
