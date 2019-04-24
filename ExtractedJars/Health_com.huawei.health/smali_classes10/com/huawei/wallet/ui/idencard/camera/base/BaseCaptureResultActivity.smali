.class public Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field d:Landroid/widget/LinearLayout;

.field e:F

.field protected k:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 49
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    return-void
.end method

.method private a(I)I
    .locals 1

    .line 426
    add-int/lit8 v0, p1, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 430
    :pswitch_0
    sget v0, Lcom/huawei/base/R$id;->edit_id_1:I

    return v0

    .line 434
    :pswitch_1
    sget v0, Lcom/huawei/base/R$id;->edit_id_2:I

    return v0

    .line 438
    :pswitch_2
    sget v0, Lcom/huawei/base/R$id;->edit_id_3:I

    return v0

    .line 442
    :pswitch_3
    sget v0, Lcom/huawei/base/R$id;->edit_id_4:I

    return v0

    .line 446
    :pswitch_4
    sget v0, Lcom/huawei/base/R$id;->edit_id_5:I

    return v0

    .line 450
    :pswitch_5
    sget v0, Lcom/huawei/base/R$id;->edit_id_6:I

    return v0

    .line 454
    :pswitch_6
    sget v0, Lcom/huawei/base/R$id;->edit_id_7:I

    return v0

    .line 457
    :goto_0
    sget v0, Lcom/huawei/base/R$id;->edit_id_8:I

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 219
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 221
    const/4 v3, 0x0

    .line 222
    add-int/lit8 v4, v2, -0x1

    :goto_0
    if-ltz v4, :cond_1

    .line 224
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    move v3, v4

    .line 227
    goto :goto_1

    .line 222
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 231
    :cond_1
    :goto_1
    add-int/lit8 v0, v3, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 260
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    const-string v1, "\\s"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 261
    array-length v0, v2

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    .line 264
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    .line 267
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    const-string v1, "\\s"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 268
    array-length v0, v2

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 274
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    if-ge v4, v0, :cond_2

    .line 276
    aget-object v3, v2, v4

    .line 278
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d:Landroid/widget/LinearLayout;

    invoke-direct {p0, v4, v3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d(ILjava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 279
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    add-int/lit8 v0, v0, -0x1

    if-eq v4, v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->h()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 274
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 286
    :cond_2
    sget v0, Lcom/huawei/base/R$id;->next_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/egd;

    .line 287
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity$1;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;)V

    invoke-virtual {v3, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 295
    return-void
.end method

.method private d(ILjava/lang/String;)Landroid/view/View;
    .locals 5

    .line 335
    new-instance v4, Landroid/widget/EditText;

    invoke-direct {v4, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 336
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setGravity(I)V

    .line 337
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 338
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setId(I)V

    .line 339
    invoke-virtual {v4, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 340
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 341
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setTextSize(F)V

    .line 343
    const/16 v0, 0xe

    const/4 v1, 0x0

    const/16 v2, 0xe

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/widget/EditText;->setPadding(IIII)V

    .line 344
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$color;->white_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setTextColor(I)V

    .line 346
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p0, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->e(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 347
    return-object v4
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 358
    const/4 v2, 0x4

    .line 360
    move-object v3, p1

    .line 361
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v2, :cond_0

    .line 366
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    goto :goto_1

    .line 369
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 373
    :goto_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 318
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 319
    const-string v0, "exocr.bankcard.scanResult"

    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 320
    const v0, 0xca8d11

    invoke-virtual {p0, v0, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->setResult(ILandroid/content/Intent;)V

    .line 321
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->finish()V

    .line 322
    return-void
.end method

.method private static d(C)Z
    .locals 3

    .line 242
    const-string v0, "[0-9]{1}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private e(Ljava/lang/String;)I
    .locals 7

    .line 403
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 404
    const/4 v4, 0x0

    .line 406
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->c:I

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->e:F

    const/high16 v2, 0x42100000    # 36.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    sub-int v5, v0, v1

    .line 409
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x1

    sub-int v6, v5, v0

    .line 410
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    div-int v0, v6, v0

    mul-int v4, v3, v0

    .line 413
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sectionWidth==== "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 414
    return v4
.end method

.method private e()V
    .locals 3

    .line 303
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$bool;->IsSupportOrientation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    sget v0, Lcom/huawei/base/R$id;->orc_result_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 307
    const/4 v0, 0x1

    invoke-static {p0, v2, v0}, Lcom/huawei/wallet/utils/UIUtil;->b(Landroid/app/Activity;Landroid/view/ViewGroup;Z)V

    .line 310
    sget v0, Lcom/huawei/base/R$id;->ocr_bottom_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/wallet/utils/UIUtil;->a(Landroid/app/Activity;Landroid/view/View;)V

    .line 312
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d()V

    return-void
.end method

.method private f()Ljava/lang/String;
    .locals 5

    .line 378
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 380
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    if-ge v4, v0, :cond_1

    .line 382
    invoke-direct {p0, v4}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/EditText;

    .line 384
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 385
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b:I

    add-int/lit8 v0, v0, -0x1

    if-eq v4, v0, :cond_0

    .line 387
    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 391
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private h()Landroid/view/View;
    .locals 3

    .line 326
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 327
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$color;->line_bottom_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 328
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 329
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->e:F

    const/high16 v1, 0x41400000    # 12.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setHeight(I)V

    .line 330
    return-object v2
.end method


# virtual methods
.method protected b()V
    .locals 0

    .line 178
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->finish()V

    .line 179
    return-void
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 0

    .line 198
    return-void
.end method

.method protected c()Z
    .locals 1

    .line 470
    const/4 v0, 0x1

    return v0
.end method

.method protected final e(I)V
    .locals 1

    .line 186
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b(Ljava/lang/String;)V

    .line 187
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    .line 64
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 65
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-static {p0}, Lcom/huawei/wallet/utils/UIUtil;->c(Landroid/app/Activity;)V

    .line 70
    :cond_0
    sget v0, Lcom/huawei/base/R$layout;->ocr_result:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->setContentView(I)V

    .line 71
    sget v0, Lcom/huawei/base/R$id;->card_num_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 72
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 75
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 77
    const-string v0, "from"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 78
    const-string v0, "number"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    goto :goto_0

    .line 82
    :cond_1
    const-string v4, ""

    .line 83
    const-string v5, ""

    .line 90
    :goto_0
    goto :goto_1

    .line 86
    :catch_0
    move-exception v6

    .line 88
    const-string v4, ""

    .line 89
    const-string v5, ""

    .line 91
    :goto_1
    const-string v0, "intent_card_num"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    iput-object v5, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 99
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 101
    invoke-direct {p0, v5}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a:Ljava/lang/String;

    .line 103
    :cond_3
    const/4 v6, 0x0

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 106
    const-string v0, "PicR"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v6

    .line 108
    :cond_4
    if-eqz v6, :cond_5

    .line 110
    const/16 v7, 0x190

    .line 112
    const/16 v8, 0x50

    .line 114
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v8, v0}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 116
    invoke-virtual {v2, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 120
    :cond_5
    :goto_2
    sget v0, Lcom/huawei/base/R$id;->edit_text_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d:Landroid/widget/LinearLayout;

    .line 123
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 124
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 125
    iget v0, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->c:I

    .line 126
    iget v0, v6, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->e:F

    .line 127
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->a()V

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "editGroup width "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->e()V

    .line 132
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 249
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 250
    const-string v0, "ResultActivity : onDestroy"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 251
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 165
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_0

    .line 167
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->b()V

    .line 169
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 2

    .line 137
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 138
    const-string v0, "ResultActivity : onResume"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 139
    return-void
.end method
