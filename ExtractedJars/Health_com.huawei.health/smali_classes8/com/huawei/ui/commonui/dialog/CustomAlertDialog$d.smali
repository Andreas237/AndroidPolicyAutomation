.class public Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/DialogInterface$OnCancelListener;

.field private d:Z

.field private e:Landroid/content/DialogInterface$OnKeyListener;

.field private i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    .line 127
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d:Z

    .line 128
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    sget v1, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;-><init>(Landroid/content/Context;ILcom/huawei/ui/commonui/dialog/CustomAlertDialog$4;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->b(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    .line 130
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$ButtonHandler;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$ButtonHandler;-><init>(Landroid/content/DialogInterface;)V

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a(Landroid/os/Handler;)Landroid/os/Handler;

    .line 131
    return-void
.end method

.method private c()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 14

    .line 381
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v5, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v5, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 385
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 388
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c()Landroid/view/View;

    move-result-object v1

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setContentView(Landroid/view/View;)V

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    iget-boolean v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d:Z

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCancelable(Z)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->c:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    iget-object v1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v8

    .line 403
    const/16 v0, 0x50

    invoke-virtual {v8, v0}, Landroid/view/Window;->setGravity(I)V

    .line 404
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v8, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/WindowManager;

    .line 406
    invoke-interface {v9}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v10

    .line 407
    invoke-virtual {v8}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v11

    .line 408
    const/4 v12, 0x0

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    const/high16 v1, 0x433f0000    # 191.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c(Landroid/content/Context;F)I

    move-result v12

    goto :goto_0

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c(Landroid/content/Context;F)I

    move-result v12

    .line 414
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->c(Landroid/content/Context;F)I

    move-result v13

    .line 415
    invoke-virtual {v10}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v12, 0x2

    sub-int/2addr v0, v1

    iput v0, v11, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 416
    iput v13, v11, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 417
    invoke-virtual {v8, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 418
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v8, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 154
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->e(Ljava/lang/String;)V

    .line 157
    :cond_0
    return-object p0
.end method

.method public a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 279
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, v1, p2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 282
    :cond_0
    return-object p0
.end method

.method public a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->a(Landroid/view/View;)V

    .line 207
    return-object p0
.end method

.method public b(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 1

    .line 179
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->e(I)V

    .line 182
    :cond_0
    return-object p0
.end method

.method public b(Z)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 0

    .line 346
    iput-boolean p1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d:Z

    .line 347
    return-object p0
.end method

.method public d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 219
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->i:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-virtual {v0, v1, p2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 222
    :cond_0
    return-object p0
.end method

.method public e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 336
    invoke-direct {p0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->c()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    return-object v0
.end method
