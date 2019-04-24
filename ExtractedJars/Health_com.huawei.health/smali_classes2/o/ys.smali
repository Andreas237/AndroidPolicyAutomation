.class public Lo/ys;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Lo/yr;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/view/LayoutInflater;

.field private m:Z

.field private n:Z

.field private o:Landroid/content/Context;

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ys;->n:Z

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ys;->m:Z

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ys;->p:Z

    .line 78
    iput-object p1, p0, Lo/ys;->o:Landroid/content/Context;

    .line 79
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/ys;->l:Landroid/view/LayoutInflater;

    .line 80
    invoke-direct {p0}, Lo/ys;->d()V

    .line 81
    return-void
.end method

.method static synthetic a(Lo/ys;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lo/ys;->n:Z

    return v0
.end method

.method private d()V
    .locals 1

    .line 106
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ys;->requestWindowFeature(I)Z

    .line 109
    sget v0, Lcom/huawei/cp3/R$layout;->cp3_custom_dialog_layout:I

    invoke-virtual {p0, v0}, Lo/ys;->setContentView(I)V

    .line 110
    sget v0, Lcom/huawei/cp3/R$id;->dialog_layout:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ys;->h:Landroid/widget/LinearLayout;

    .line 112
    sget v0, Lcom/huawei/cp3/R$id;->title:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/cp3/R$id;->titleView:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ys;->g:Landroid/widget/LinearLayout;

    .line 114
    sget v0, Lcom/huawei/cp3/R$id;->content:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    .line 115
    sget v0, Lcom/huawei/cp3/R$id;->msg:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ys;->e:Landroid/widget/TextView;

    .line 116
    sget v0, Lcom/huawei/cp3/R$id;->button_layout:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ys;->f:Landroid/widget/LinearLayout;

    .line 117
    sget v0, Lcom/huawei/cp3/R$id;->ok:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ys;->a:Landroid/widget/Button;

    .line 118
    sget v0, Lcom/huawei/cp3/R$id;->cancel:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ys;->d:Landroid/widget/Button;

    .line 119
    sget v0, Lcom/huawei/cp3/R$id;->neutral:I

    invoke-virtual {p0, v0}, Lo/ys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ys;->b:Landroid/widget/Button;

    .line 120
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .line 273
    iget-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;
    .locals 5

    .line 160
    if-nez p1, :cond_0

    .line 161
    const-string p1, ""

    .line 164
    :cond_0
    iget-object v0, p0, Lo/ys;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 165
    iget-object v0, p0, Lo/ys;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 166
    iget-object v0, p0, Lo/ys;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 168
    :cond_1
    iget-object v0, p0, Lo/ys;->d:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 169
    iget-object v0, p0, Lo/ys;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lo/ys;->d:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lo/ys;->d:Landroid/widget/Button;

    new-instance v1, Lo/ys$5;

    invoke-direct {v1, p0, p2}, Lo/ys$5;-><init>(Lo/ys;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lo/yr;
    .locals 2

    .line 228
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    :cond_0
    return-object p0
.end method

.method public c(I)Lo/yr;
    .locals 2

    .line 268
    iget-object v0, p0, Lo/ys;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 269
    invoke-virtual {p0, v1}, Lo/ys;->c(Ljava/lang/String;)Lo/yr;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;
    .locals 5

    .line 125
    if-nez p1, :cond_0

    .line 126
    const-string p1, ""

    .line 128
    :cond_0
    iget-object v0, p0, Lo/ys;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 129
    iget-object v0, p0, Lo/ys;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lo/ys;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    :cond_1
    iget-object v0, p0, Lo/ys;->a:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iget-object v0, p0, Lo/ys;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lo/ys;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lo/ys;->a:Landroid/widget/Button;

    new-instance v1, Lo/ys$1;

    invoke-direct {v1, p0, p2}, Lo/ys$1;-><init>(Lo/ys;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/yr;
    .locals 2

    .line 259
    iget-object v0, p0, Lo/ys;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lo/ys;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 261
    iget-object v0, p0, Lo/ys;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    :cond_0
    return-object p0
.end method

.method public cancel()V
    .locals 3

    .line 462
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 465
    goto :goto_0

    .line 463
    :catch_0
    move-exception v2

    .line 464
    const-string v0, "HwDialogCustom"

    const-string v1, "cancel failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 466
    :goto_0
    return-void
.end method

.method public d(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;
    .locals 2

    .line 188
    iget-object v0, p0, Lo/ys;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 189
    invoke-virtual {p0, v1, p2}, Lo/ys;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)Lo/yr;
    .locals 2

    .line 85
    iget-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 87
    iget-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 88
    iget-object v0, p0, Lo/ys;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 90
    :cond_0
    return-object p0
.end method

.method public dismiss()V
    .locals 3

    .line 453
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 456
    goto :goto_0

    .line 454
    :catch_0
    move-exception v2

    .line 455
    const-string v0, "HwDialogCustom"

    const-string v1, "dismiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 457
    :goto_0
    return-void
.end method

.method public e(ILandroid/content/DialogInterface$OnClickListener;)Lo/yr;
    .locals 2

    .line 153
    iget-object v0, p0, Lo/ys;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 154
    invoke-virtual {p0, v1, p2}, Lo/ys;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 3

    .line 471
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->hide()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 474
    goto :goto_0

    .line 472
    :catch_0
    move-exception v2

    .line 473
    const-string v0, "HwDialogCustom"

    const-string v1, "hide failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 475
    :goto_0
    return-void
.end method

.method public onContentChanged()V
    .locals 8

    .line 314
    invoke-super {p0}, Landroid/app/Dialog;->onContentChanged()V

    .line 316
    invoke-virtual {p0}, Lo/ys;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 317
    if-eqz v4, :cond_1

    .line 318
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 321
    invoke-virtual {p0}, Lo/ys;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/yp;->b(Landroid/content/Context;)I

    move-result v6

    .line 322
    invoke-virtual {p0}, Lo/ys;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/yp;->c(Landroid/content/Context;)I

    move-result v7

    .line 324
    if-le v6, v7, :cond_0

    .line 325
    int-to-double v0, v7

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    goto :goto_0

    .line 327
    :cond_0
    int-to-double v0, v6

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 329
    :goto_0
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 331
    :cond_1
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    .line 432
    iget-boolean v0, p0, Lo/ys;->m:Z

    if-eqz v0, :cond_0

    .line 433
    iget-boolean v0, p0, Lo/ys;->p:Z

    return v0

    .line 435
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public setCancelable(Z)V
    .locals 0

    .line 298
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 299
    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 0

    .line 303
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 304
    return-void
.end method

.method public setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .line 293
    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 294
    return-void
.end method

.method public setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 283
    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 284
    return-void
.end method

.method public setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 0

    .line 278
    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 279
    return-void
.end method

.method public setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    .line 288
    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 289
    return-void
.end method

.method public setTitle(I)V
    .locals 3

    .line 238
    iget-object v0, p0, Lo/ys;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 239
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 242
    iget-object v0, p0, Lo/ys;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    :cond_0
    return-void
.end method

.method public show()V
    .locals 3

    .line 443
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 446
    goto :goto_0

    .line 444
    :catch_0
    move-exception v2

    .line 445
    const-string v0, "HwDialogCustom"

    const-string v1, "showDialog failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 448
    :goto_0
    return-void
.end method
