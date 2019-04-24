.class public Lo/ehb$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ehb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Landroid/os/Handler;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:D

.field private h:I

.field private i:Landroid/widget/EditText;

.field private k:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/ehb$d;->a:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ehb$d;->b:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ehb$d;->d:Landroid/os/Handler;

    .line 71
    const/16 v0, 0x102

    iput v0, p0, Lo/ehb$d;->h:I

    .line 84
    iput-object p1, p0, Lo/ehb$d;->c:Landroid/content/Context;

    .line 85
    iput-object p2, p0, Lo/ehb$d;->d:Landroid/os/Handler;

    .line 86
    return-void
.end method

.method static synthetic a(Lo/ehb$d;)Landroid/widget/LinearLayout;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private a(IF)Z
    .locals 4

    .line 217
    const/4 v2, 0x0

    .line 218
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 220
    :pswitch_0
    const/16 v3, 0x64

    .line 221
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    const/16 v3, 0x3e

    .line 224
    :cond_0
    iget v0, p0, Lo/ehb$d;->h:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 225
    mul-int/lit8 v3, v3, 0x2

    .line 227
    :cond_1
    const v0, 0x3dcccccd    # 0.1f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_2

    int-to-float v0, v3

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 228
    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    .line 232
    :pswitch_1
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_3

    const/high16 v0, 0x44b40000    # 1440.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 233
    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    .line 237
    :pswitch_2
    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_4

    const v0, 0x459c4000    # 5000.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_5

    .line 238
    :cond_4
    const/4 v2, 0x1

    .line 244
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

.method static synthetic b(Lo/ehb$d;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(Landroid/text/Editable;)V
    .locals 3

    .line 249
    iget-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 250
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 251
    iget v0, p0, Lo/ehb$d;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ehb$d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    return-void

    .line 256
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 257
    iget v0, p0, Lo/ehb$d;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 259
    :pswitch_0
    const/4 v0, 0x1

    invoke-direct {p0, v0, v2}, Lo/ehb$d;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 260
    return-void

    .line 264
    :pswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0, v2}, Lo/ehb$d;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    return-void

    .line 269
    :pswitch_2
    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lo/ehb$d;->a(IF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    return-void

    .line 275
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ehb$d;->a(Z)V

    .line 278
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

.method public static b(Ljava/lang/String;)Z
    .locals 4

    .line 413
    invoke-static {}, Lo/ehb;->b()Ljava/lang/String;

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

    invoke-static {p0}, Lo/ehb$d;->e(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,isFloat is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/ehb$d;->c(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    invoke-static {p0}, Lo/ehb$d;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/ehb$d;->c(Ljava/lang/String;)Z

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

.method static synthetic c(Lo/ehb$d;)Landroid/widget/EditText;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic c(Lo/ehb$d;Landroid/text/Editable;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/ehb$d;->e(Landroid/text/Editable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 2

    .line 437
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 438
    const/4 v0, 0x1

    return v0

    .line 440
    :catch_0
    move-exception v1

    .line 441
    const/4 v0, 0x0

    return v0

    .line 442
    :catch_1
    move-exception v1

    .line 443
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 5

    .line 450
    const/4 v1, -0x1

    .line 451
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 453
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 454
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 455
    invoke-static {v4}, Lo/ehb$d;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    return v3

    .line 453
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 460
    :cond_1
    return v1
.end method

.method static synthetic d(Lo/ehb$d;)Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/ehb$d;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 60
    iput-object p1, p0, Lo/ehb$d;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lo/ehb$d;Landroid/text/Editable;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/ehb$d;->b(Landroid/text/Editable;)V

    return-void
.end method

.method static synthetic e(Lo/ehb$d;)Landroid/content/Context;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    return-object v0
.end method

.method private e(ILandroid/view/View;I)V
    .locals 14

    .line 308
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_title:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 309
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_target_editText:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    .line 310
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 311
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 312
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 314
    new-instance v6, Ljava/util/Timer;

    invoke-direct {v6}, Ljava/util/Timer;-><init>()V

    .line 315
    new-instance v0, Lo/ehb$d$3;

    invoke-direct {v0, p0}, Lo/ehb$d$3;-><init>(Lo/ehb$d;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 322
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_target_unit:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 323
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_target_tip:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ehb$d;->e:Landroid/widget/TextView;

    .line 324
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_target_input_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ehb$d;->f:Landroid/widget/LinearLayout;

    .line 327
    const/4 v9, 0x0

    .line 328
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_target_custom_valid_range:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 330
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 332
    :pswitch_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/ehb$d;->e(I)V

    .line 333
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 334
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_target_type_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
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

    .line 337
    const-string v0, "1440"

    const-wide v1, 0x4096800000000000L    # 1440.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 338
    goto/16 :goto_1

    .line 340
    :pswitch_1
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_target_custom_valid_range_float:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 342
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_target_custom_valid_range_hint:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 344
    new-instance v12, Landroid/text/SpannableString;

    invoke-direct {v12, v11}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 345
    new-instance v13, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v0, 0xb

    const/4 v1, 0x1

    invoke-direct {v13, v0, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 346
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    iget-object v1, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHintTextColor(I)V

    .line 347
    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v12, v13, v1, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 348
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    new-instance v1, Landroid/text/SpannedString;

    invoke-direct {v1, v12}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 351
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lo/ehb$d;->e(I)V

    .line 352
    const/16 v11, 0x64

    .line 353
    const/16 v12, 0x3e

    .line 354
    move/from16 v0, p3

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 355
    const/16 v11, 0xc8

    .line 356
    const/16 v12, 0x7c

    .line 358
    :cond_1
    const-wide v0, 0x3fb99999a0000000L    # 0.10000000149011612

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 359
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 360
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 361
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 363
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

    .line 365
    :cond_2
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 366
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
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

    .line 370
    :goto_0
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 371
    goto :goto_1

    .line 373
    :pswitch_2
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/ehb$d;->e(I)V

    .line 374
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 375
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
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

    .line 378
    const-string v0, "5000"

    const-wide v1, 0x40b3880000000000L    # 5000.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 379
    .line 383
    :goto_1
    iget-wide v0, p0, Lo/ehb$d;->g:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 384
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/ehb$d;->g:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    iget-wide v1, p0, Lo/ehb$d;->g:D

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 387
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 388
    iget-object v0, p0, Lo/ehb$d;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 390
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private e(Landroid/text/Editable;)V
    .locals 4

    .line 281
    iget v0, p0, Lo/ehb$d;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 283
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-static {v2}, Lo/ehb$d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 284
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 285
    return-void

    .line 297
    :cond_0
    invoke-static {v2}, Lo/ehb$d;->d(Ljava/lang/String;)I

    move-result v3

    .line 298
    if-gez v3, :cond_1

    return-void

    .line 299
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 301
    add-int/lit8 v0, v3, 0x3

    add-int/lit8 v1, v3, 0x4

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 304
    :cond_2
    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 422
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 423
    const/4 v0, 0x1

    return v0

    .line 424
    :catch_0
    move-exception v1

    .line 425
    const/4 v0, 0x0

    return v0

    .line 426
    :catch_1
    move-exception v1

    .line 427
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/ehb$d;IF)Z
    .locals 1

    .line 60
    invoke-direct {p0, p1, p2}, Lo/ehb$d;->a(IF)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/ehb$d;)Landroid/widget/Button;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic i(Lo/ehb$d;)I
    .locals 1

    .line 60
    iget v0, p0, Lo/ehb$d;->a:I

    return v0
.end method

.method static synthetic k(Lo/ehb$d;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ehb$d;->d:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .line 393
    if-eqz p1, :cond_0

    .line 394
    iget-object v0, p0, Lo/ehb$d;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 395
    iget-object v0, p0, Lo/ehb$d;->f:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->start_track_custom_edt_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 396
    iget-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 398
    :cond_0
    iget-object v0, p0, Lo/ehb$d;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ehb$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$color;->home_tarck_custom_target_warning_tip_red:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 399
    iget-object v0, p0, Lo/ehb$d;->f:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->start_track_custom_edt_bg_warning:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 400
    iget-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 402
    :goto_0
    return-void
.end method

.method public b(II)Lo/ehb;
    .locals 7

    .line 93
    iput p1, p0, Lo/ehb$d;->a:I

    .line 94
    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 95
    new-instance v4, Lo/ehb;

    iget-object v0, p0, Lo/ehb$d;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$style;->TrackDialog:I

    invoke-direct {v4, v0, v1}, Lo/ehb;-><init>(Landroid/content/Context;I)V

    .line 96
    sget v0, Lcom/huawei/ui/commonui/R$layout;->track_dialog_custom_target_item:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 98
    iput p2, p0, Lo/ehb$d;->h:I

    .line 99
    invoke-direct {p0, p1, v5, p2}, Lo/ehb$d;->e(ILandroid/view/View;I)V

    .line 101
    sget v0, Lcom/huawei/ui/commonui/R$id;->cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 102
    new-instance v0, Lo/ehb$d$5;

    invoke-direct {v0, p0, v4}, Lo/ehb$d$5;-><init>(Lo/ehb$d;Lo/ehb;)V

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    sget v0, Lcom/huawei/ui/commonui/R$id;->ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    .line 110
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    new-instance v1, Lo/ehb$d$2;

    invoke-direct {v1, p0}, Lo/ehb$d$2;-><init>(Lo/ehb$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 127
    iget-object v0, p0, Lo/ehb$d;->k:Landroid/widget/Button;

    new-instance v1, Lo/ehb$d$1;

    invoke-direct {v1, p0, v4}, Lo/ehb$d$1;-><init>(Lo/ehb$d;Lo/ehb;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v0}, Lo/ehb;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 211
    invoke-virtual {v4, v5}, Lo/ehb;->setContentView(Landroid/view/View;)V

    .line 212
    return-object v4
.end method

.method public e(I)V
    .locals 4

    .line 405
    if-lez p1, :cond_0

    .line 406
    iget-object v0, p0, Lo/ehb$d;->i:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 408
    :cond_0
    return-void
.end method
