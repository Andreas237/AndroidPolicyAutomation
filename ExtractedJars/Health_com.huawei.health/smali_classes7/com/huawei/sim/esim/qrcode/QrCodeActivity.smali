.class public Lcom/huawei/sim/esim/qrcode/QrCodeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field private static a:Ljava/lang/String;

.field private static t:[Ljava/lang/String;


# instance fields
.field private b:Z

.field private c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

.field private d:I

.field private e:Lo/edn;

.field private f:Ljava/lang/String;

.field private g:Lo/ecx;

.field private h:Lo/egn;

.field private i:Lo/edm;

.field private k:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<Lo/od;>;"
        }
    .end annotation
.end field

.field private l:Lo/pr;

.field private final m:I

.field private n:Z

.field private o:I

.field private p:Lo/ems;

.field private q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Landroid/content/Context;

.field private v:Landroid/graphics/Bitmap;

.field private x:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 76
    const-string v0, "QrCodeActivity"

    sput-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    .line 99
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->t:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 78
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d:I

    .line 88
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->f:Ljava/lang/String;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->n:Z

    .line 96
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->m:I

    .line 357
    new-instance v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$4;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 422
    new-instance v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$5;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 431
    new-instance v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$1;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 439
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->x:Landroid/os/Handler;

    return-void
.end method

.method private a(I)V
    .locals 2

    .line 414
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 415
    const-string v0, "mata_report"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 416
    invoke-virtual {p0, v1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 417
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 418
    invoke-direct {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g()V

    .line 419
    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/egn;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Lo/pr;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 75
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 318
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    return-void

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 325
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    .line 326
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 328
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 329
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 334
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d:I

    return v0
.end method

.method private e(Landroid/view/SurfaceHolder;)V
    .locals 5

    .line 223
    :try_start_0
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/edg;->b(Landroid/view/SurfaceHolder;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 230
    goto :goto_0

    .line 224
    :catch_0
    move-exception v4

    .line 225
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====  initCamera IOException e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    return-void

    .line 227
    :catch_1
    move-exception v4

    .line 228
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====  initCamera RuntimeException e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void

    .line 231
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    if-nez v0, :cond_0

    .line 232
    new-instance v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->k:Ljava/util/Vector;

    iget-object v2, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->f:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;Ljava/util/Vector;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    .line 234
    :cond_0
    return-void
.end method

.method private g()V
    .locals 4

    .line 346
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    return-void

    .line 349
    :cond_0
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 351
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 353
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->h:Lo/egn;

    .line 355
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/os/Handler;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->x:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()Lo/edn;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e:Lo/edn;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lo/or;
    .locals 16

    .line 482
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 483
    const/4 v0, 0x0

    return-object v0

    .line 485
    :cond_0
    new-instance v8, Ljava/util/Hashtable;

    invoke-direct {v8}, Ljava/util/Hashtable;-><init>()V

    .line 486
    sget-object v0, Lo/og;->e:Lo/og;

    const-string v1, "UTF8"

    invoke-virtual {v8, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    new-instance v9, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v9}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 489
    const/4 v0, 0x1

    iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 490
    move-object/from16 v0, p1

    invoke-static {v0, v9}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    .line 491
    const/4 v0, 0x0

    iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 492
    iget v0, v9, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v0, v0

    const/high16 v1, 0x43480000    # 200.0f

    div-float/2addr v0, v1

    float-to-int v10, v0

    .line 493
    if-gtz v10, :cond_1

    .line 494
    const/4 v10, 0x1

    .line 495
    :cond_1
    iput v10, v9, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 496
    move-object/from16 v0, p1

    invoke-static {v0, v9}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    .line 497
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    new-array v11, v0, [I

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    move-object v1, v11

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 499
    new-instance v12, Lo/ot;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-direct {v12, v0, v1, v11}, Lo/ot;-><init>(II[I)V

    .line 500
    new-instance v13, Lo/oj;

    new-instance v0, Lo/qt;

    invoke-direct {v0, v12}, Lo/qt;-><init>(Lo/om;)V

    invoke-direct {v13, v0}, Lo/oj;-><init>(Lo/ob;)V

    .line 501
    new-instance v14, Lo/ua;

    invoke-direct {v14}, Lo/ua;-><init>()V

    .line 503
    :try_start_0
    invoke-virtual {v14, v13, v8}, Lo/ua;->e(Lo/oj;Ljava/util/Map;)Lo/or;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lo/oh; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lo/of; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    .line 504
    :catch_0
    move-exception v15

    .line 505
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NotFoundException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    goto :goto_0

    .line 506
    :catch_1
    move-exception v15

    .line 507
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ChecksumException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    goto :goto_0

    .line 508
    :catch_2
    move-exception v15

    .line 509
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected b()V
    .locals 5

    .line 122
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--initView---=====-"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    sget v0, Lcom/huawei/sim/R$layout;->activity_sim_qrcode:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->setContentView(I)V

    .line 125
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/edg;->e(Landroid/content/Context;)V

    .line 126
    sget v0, Lcom/huawei/sim/R$id;->viewfinder:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/edn;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e:Lo/edn;

    .line 127
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b:Z

    .line 128
    new-instance v0, Lo/edm;

    invoke-direct {v0, p0}, Lo/edm;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->i:Lo/edm;

    .line 129
    sget v0, Lcom/huawei/sim/R$id;->sim_qrcode_toolbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->p:Lo/ems;

    .line 130
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$layout;->activity_sim_qrcode_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 131
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->p:Lo/ems;

    invoke-virtual {v0, v4}, Lo/ems;->d(Landroid/view/View;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->p:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 133
    sget v0, Lcom/huawei/sim/R$id;->sim_bottom_picture_layout:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;-><init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    return-void
.end method

.method public c()V
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e:Lo/edn;

    invoke-virtual {v0}, Lo/edn;->b()V

    .line 264
    return-void
.end method

.method public c(Lo/or;Landroid/graphics/Bitmap;)Z
    .locals 7

    .line 275
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->i:Lo/edm;

    invoke-virtual {v0}, Lo/edm;->b()V

    .line 277
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 278
    invoke-static {p1}, Lo/pw;->h(Lo/or;)Lo/pr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    .line 280
    :cond_0
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====  handleDecode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    invoke-virtual {v3}, Lo/pr;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v4, Lo/edf;

    invoke-direct {v4}, Lo/edf;-><init>()V

    .line 283
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    invoke-virtual {v4, v0}, Lo/edf;->b(Lo/pr;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e8c\u7ef4\u7801\u4e0d\u53ef\u7528"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/ScanFailActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 286
    invoke-virtual {p0, v5}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 287
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 288
    const/4 v0, 0x0

    return v0

    .line 290
    :cond_1
    const/4 v5, 0x3

    .line 291
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 292
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 295
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v5

    .line 298
    :goto_0
    const/4 v0, 0x2

    if-ne v0, v5, :cond_3

    .line 299
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u84dd\u7259\u8fde\u63a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_loading_profile:I

    invoke-direct {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->l:Lo/pr;

    invoke-virtual {v1}, Lo/pr;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v3, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1, v2, v3}, Lo/ecx;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 304
    :cond_3
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-direct {v6, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 305
    invoke-virtual {p0, v6}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 306
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->finish()V

    .line 308
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public e()Landroid/os/Handler;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 10

    .line 443
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 444
    const/4 v6, 0x0

    .line 445
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 446
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 448
    :sswitch_0
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "_data"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 449
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 451
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    const-string v0, "_data"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 453
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "columnIndex\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 457
    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 460
    invoke-virtual {p0, v6}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a(Ljava/lang/String;)Lo/or;

    move-result-object v9

    .line 461
    const/4 v0, 0x0

    if-ne v0, v9, :cond_1

    .line 462
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e0\u6548\u4e8c\u7ef4\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_scan_qrcode_picture_toast:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 465
    :cond_1
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u89e3\u6790\u7ed3\u679c\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/or;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->v:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v9, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c(Lo/or;Landroid/graphics/Bitmap;)Z

    .line 468
    .line 473
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 105
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->requestWindowFeature(I)Z

    .line 106
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 107
    iput-object p0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->u:Landroid/content/Context;

    .line 108
    invoke-virtual {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b()V

    .line 109
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    .line 110
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void

    .line 114
    :cond_0
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 115
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->o:I

    .line 116
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 117
    sget-object v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mRankData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 206
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->i:Lo/edm;

    invoke-virtual {v0}, Lo/edm;->b()V

    .line 207
    invoke-direct {p0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->g()V

    .line 209
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->x:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 210
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->x:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 211
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->x:Landroid/os/Handler;

    .line 213
    :cond_1
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 214
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 187
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 188
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;->a()V

    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;

    .line 192
    :cond_0
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0}, Lo/edg;->d()V

    .line 193
    invoke-static {}, Lo/edg;->a()Lo/edg;

    move-result-object v0

    invoke-virtual {v0}, Lo/edg;->e()V

    .line 194
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 171
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 172
    sget v0, Lcom/huawei/sim/R$id;->preview_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/SurfaceView;

    .line 173
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    .line 174
    iget-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b:Z

    if-eqz v0, :cond_0

    .line 175
    invoke-direct {p0, v2}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    .line 177
    :cond_0
    invoke-interface {v2, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 178
    const/4 v0, 0x3

    invoke-interface {v2, v0}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 180
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->k:Ljava/util/Vector;

    .line 181
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->f:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 198
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 199
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 238
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 241
    iget-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b:Z

    if-nez v0, :cond_0

    .line 242
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b:Z

    .line 243
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e(Landroid/view/SurfaceHolder;)V

    .line 246
    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 249
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b:Z

    .line 251
    return-void
.end method
