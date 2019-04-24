.class public Lo/ery$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Landroid/widget/TextView;

.field private d:Landroid/os/Handler;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/EditText;

.field private i:D

.field private k:Landroid/widget/Button;

.field private p:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/ery$e;->b:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ery$e;->e:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ery$e;->d:Landroid/os/Handler;

    .line 71
    const/16 v0, 0x102

    iput v0, p0, Lo/ery$e;->f:I

    .line 86
    iput-object p1, p0, Lo/ery$e;->a:Landroid/content/Context;

    .line 87
    iput-object p2, p0, Lo/ery$e;->d:Landroid/os/Handler;

    .line 88
    return-void
.end method

.method static synthetic a(Lo/ery$e;)Landroid/content/Context;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/ery$e;Landroid/text/Editable;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/ery$e;->b(Landroid/text/Editable;)V

    return-void
.end method

.method private a(IF)Z
    .locals 4

    .line 225
    const/4 v2, 0x0

    .line 226
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 228
    :pswitch_0
    const/16 v3, 0x64

    .line 229
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    const/16 v3, 0x3e

    .line 232
    :cond_0
    iget v0, p0, Lo/ery$e;->f:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 233
    mul-int/lit8 v3, v3, 0x2

    .line 235
    :cond_1
    const v0, 0x3dcccccd    # 0.1f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_2

    int-to-float v0, v3

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 236
    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    .line 240
    :pswitch_1
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_3

    const/high16 v0, 0x44b40000    # 1440.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 241
    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    .line 245
    :pswitch_2
    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_4

    const v0, 0x459c4000    # 5000.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 246
    :cond_4
    const/4 v2, 0x1

    .line 252
    :cond_5
    :goto_0
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 4

    .line 431
    invoke-static {}, Lo/ery;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isNumber = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, " , isInteger is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/ery$e;->e(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,isFloat is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/ery$e;->c(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    invoke-static {p0}, Lo/ery$e;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/ery$e;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic a(Lo/ery$e;IF)Z
    .locals 1

    .line 60
    invoke-direct {p0, p1, p2}, Lo/ery$e;->a(IF)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/ery$e;)Landroid/widget/EditText;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    return-object v0
.end method

.method private b(Landroid/text/Editable;)V
    .locals 3

    .line 257
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 258
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 259
    iget v0, p0, Lo/ery$e;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ery$e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    return-void

    .line 264
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 265
    iget v0, p0, Lo/ery$e;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 267
    :pswitch_0
    const/4 v0, 0x1

    invoke-direct {p0, v0, v2}, Lo/ery$e;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    return-void

    .line 272
    :pswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0, v2}, Lo/ery$e;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    return-void

    .line 277
    :pswitch_2
    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lo/ery$e;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 278
    return-void

    .line 284
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ery$e;->e(Z)V

    .line 287
    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lo/ery$e;)Landroid/widget/Button;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic c(Lo/ery$e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 60
    iput-object p1, p0, Lo/ery$e;->e:Ljava/lang/String;

    return-object p1
.end method

.method private c(Landroid/text/Editable;)V
    .locals 4

    .line 290
    iget v0, p0, Lo/ery$e;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 292
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-static {v2}, Lo/ery$e;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 293
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 294
    return-void

    .line 306
    :cond_0
    invoke-static {v2}, Lo/ery$e;->d(Ljava/lang/String;)I

    move-result v3

    .line 307
    if-gez v3, :cond_1

    return-void

    .line 308
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 310
    add-int/lit8 v0, v3, 0x3

    add-int/lit8 v1, v3, 0x4

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 313
    :cond_2
    return-void
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 2

    .line 455
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 456
    const/4 v0, 0x1

    return v0

    .line 458
    :catch_0
    move-exception v1

    .line 459
    const/4 v0, 0x0

    return v0

    .line 460
    :catch_1
    move-exception v1

    .line 461
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 5

    .line 468
    const/4 v1, -0x1

    .line 469
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 471
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 472
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 473
    invoke-static {v4}, Lo/ery$e;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 474
    return v3

    .line 471
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 478
    :cond_1
    return v1
.end method

.method static synthetic d(Lo/ery$e;)Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/ery$e;Landroid/text/Editable;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/ery$e;->c(Landroid/text/Editable;)V

    return-void
.end method

.method static synthetic e(Lo/ery$e;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method private e(ILandroid/view/View;I)V
    .locals 14

    .line 317
    sget v0, Lcom/huawei/ui/homehealth/R$id;->dialog_title:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 318
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_target_editText:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    .line 322
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_target_under_line:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ery$e;->p:Landroid/widget/ImageView;

    .line 323
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    new-instance v1, Lo/ery$e$5;

    invoke-direct {v1, p0}, Lo/ery$e$5;-><init>(Lo/ery$e;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 332
    new-instance v6, Ljava/util/Timer;

    invoke-direct {v6}, Ljava/util/Timer;-><init>()V

    .line 333
    new-instance v0, Lo/ery$e$4;

    invoke-direct {v0, p0}, Lo/ery$e$4;-><init>(Lo/ery$e;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 340
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_target_unit:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egb;

    .line 341
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_target_tip:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ery$e;->c:Landroid/widget/TextView;

    .line 342
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_target_input_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/ery$e;->g:Landroid/widget/RelativeLayout;

    .line 345
    const/4 v9, 0x0

    .line 346
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_custom_valid_range:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 348
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 350
    :pswitch_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/ery$e;->c(I)V

    .line 351
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 352
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 353
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_type_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x5a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 355
    const-string v0, "1440"

    const-wide v1, 0x4096800000000000L    # 1440.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 356
    goto/16 :goto_1

    .line 358
    :pswitch_1
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_custom_valid_range_float:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 360
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_custom_valid_range_hint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 362
    new-instance v12, Landroid/text/SpannableString;

    invoke-direct {v12, v11}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 363
    new-instance v13, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v0, 0xf

    const/4 v1, 0x1

    invoke-direct {v13, v0, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 364
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    const-string v1, "#4D1A1A1A"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 365
    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v12, v13, v1, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 366
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    new-instance v1, Landroid/text/SpannedString;

    invoke-direct {v1, v12}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 369
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lo/ery$e;->c(I)V

    .line 370
    const/16 v11, 0x64

    .line 371
    const/16 v12, 0x3e

    .line 372
    move/from16 v0, p3

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 373
    const/16 v11, 0xc8

    .line 374
    const/16 v12, 0x7c

    .line 376
    :cond_1
    const-wide v0, 0x3fb99999a0000000L    # 0.10000000149011612

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 377
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 379
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 380
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 381
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 383
    :cond_2
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 384
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 388
    :goto_0
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 389
    goto :goto_1

    .line 391
    :pswitch_2
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/ery$e;->c(I)V

    .line 392
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 393
    invoke-virtual {v7, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 394
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x1388

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 396
    const-string v0, "5000"

    const-wide v1, 0x40b3880000000000L    # 5000.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 397
    .line 401
    :goto_1
    iget-wide v0, p0, Lo/ery$e;->i:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 402
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/ery$e;->i:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 403
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/ery$e;->i:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 405
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 406
    iget-object v0, p0, Lo/ery$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 440
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 441
    const/4 v0, 0x1

    return v0

    .line 442
    :catch_0
    move-exception v1

    .line 443
    const/4 v0, 0x0

    return v0

    .line 444
    :catch_1
    move-exception v1

    .line 445
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lo/ery$e;)I
    .locals 1

    .line 60
    iget v0, p0, Lo/ery$e;->b:I

    return v0
.end method

.method static synthetic g(Lo/ery$e;)Landroid/widget/ImageView;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->p:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic h(Lo/ery$e;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->d:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lo/ery$e;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ery$e;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 423
    if-lez p1, :cond_0

    .line 424
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 426
    :cond_0
    return-void
.end method

.method public e(II)Lo/ery;
    .locals 7

    .line 95
    iput p1, p0, Lo/ery$e;->b:I

    .line 96
    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 97
    new-instance v4, Lo/ery;

    iget-object v0, p0, Lo/ery$e;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$style;->TrackDialog:I

    invoke-direct {v4, v0, v1}, Lo/ery;-><init>(Landroid/content/Context;I)V

    .line 98
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->sport_dialog_custom_target_item:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 100
    iput p2, p0, Lo/ery$e;->f:I

    .line 101
    invoke-direct {p0, p1, v5, p2}, Lo/ery$e;->e(ILandroid/view/View;I)V

    .line 103
    sget v0, Lcom/huawei/ui/homehealth/R$id;->cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 104
    new-instance v0, Lo/ery$e$2;

    invoke-direct {v0, p0, v4}, Lo/ery$e$2;-><init>(Lo/ery$e;Lo/ery;)V

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    sget v0, Lcom/huawei/ui/homehealth/R$id;->ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    .line 111
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 112
    iget-object v0, p0, Lo/ery$e;->h:Landroid/widget/EditText;

    new-instance v1, Lo/ery$e$1;

    invoke-direct {v1, p0}, Lo/ery$e$1;-><init>(Lo/ery$e;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 135
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    new-instance v1, Lo/ery$e$3;

    invoke-direct {v1, p0, v4}, Lo/ery$e$3;-><init>(Lo/ery$e;Lo/ery;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/ery;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    invoke-virtual {v4, v5}, Lo/ery;->setContentView(Landroid/view/View;)V

    .line 220
    return-object v4
.end method

.method public e(Z)V
    .locals 3

    .line 411
    if-eqz p1, :cond_0

    .line 412
    iget-object v0, p0, Lo/ery$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 413
    iget-object v0, p0, Lo/ery$e;->g:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->start_track_custom_edt_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 414
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 416
    :cond_0
    iget-object v0, p0, Lo/ery$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ery$e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    iget-object v0, p0, Lo/ery$e;->g:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->start_track_custom_edt_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 418
    iget-object v0, p0, Lo/ery$e;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 420
    :goto_0
    return-void
.end method
