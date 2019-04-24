.class public Lo/cfy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cfy$d;,
        Lo/cfy$a;
    }
.end annotation


# instance fields
.field private a:Lo/cfy;

.field private b:Z

.field private c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

.field private d:Landroid/content/Context;

.field private e:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->a:Lo/cfy;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cfy;->b:Z

    .line 52
    iput-object p1, p0, Lo/cfy;->d:Landroid/content/Context;

    .line 54
    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 4

    .line 365
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    move-object v1, v0

    check-cast v1, Landroid/view/WindowManager;

    .line 366
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 367
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 368
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 369
    return v3
.end method

.method public static a(Landroid/content/Context;F)I
    .locals 3

    .line 373
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 374
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c(Landroid/view/Window;Ljava/lang/String;)V
    .locals 6

    .line 134
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 135
    const-string v0, "CommonDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeWaitingDialogContent() window null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void

    .line 138
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->waiting_layout:I

    invoke-virtual {p1, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 139
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 140
    const-string v0, "CommonDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeWaitingDialogContent() contentView null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void

    .line 143
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_progress:I

    .line 144
    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 145
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 146
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    :cond_2
    return-void
.end method

.method static synthetic e(Lo/cfy;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 166
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    return-void

    .line 170
    :cond_0
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_2

    .line 171
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 175
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    .line 177
    :cond_2
    return-void
.end method

.method public b()Landroid/app/Dialog;
    .locals 2

    .line 357
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    return-object v0

    .line 360
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;ZIILo/cfy$d;)V
    .locals 8

    .line 268
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v7, p6

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cfy;->d(Ljava/lang/String;Ljava/lang/String;ZIIZLo/cfy$d;)V

    .line 270
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;ZIIZLo/cfy$d;)V
    .locals 8

    .line 301
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->dismiss()V

    .line 303
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    .line 306
    :cond_0
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    iget-object v1, p0, Lo/cfy;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;-><init>(Landroid/content/Context;)V

    .line 307
    invoke-virtual {v0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c(Ljava/lang/String;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b(Ljava/lang/Object;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c(Z)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    move-result-object v0

    .line 308
    invoke-virtual {v0, p6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e(Z)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    move-result-object v2

    .line 309
    if-lez p5, :cond_1

    .line 310
    new-instance v0, Lo/cfy$1;

    invoke-direct {v0, p0, p7}, Lo/cfy$1;-><init>(Lo/cfy;Lo/cfy$d;)V

    invoke-virtual {v2, p5, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    .line 321
    :cond_1
    if-lez p4, :cond_2

    .line 322
    new-instance v0, Lo/cfy$4;

    invoke-direct {v0, p0, p7}, Lo/cfy$4;-><init>(Lo/cfy;Lo/cfy$d;)V

    invoke-virtual {v2, p4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;

    .line 333
    :cond_2
    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    move-result-object v0

    iput-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    .line 334
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    new-instance v1, Lo/cfy$2;

    invoke-direct {v1, p0}, Lo/cfy$2;-><init>(Lo/cfy;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 341
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 342
    const/16 v0, 0x50

    invoke-virtual {v3, v0}, Landroid/view/Window;->setGravity(I)V

    .line 343
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v3, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 344
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    .line 345
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 346
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 347
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/cfy;->a(Landroid/content/Context;F)I

    move-result v7

    .line 348
    invoke-virtual {v6}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v7, 0x2

    sub-int/2addr v0, v1

    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 349
    iput v7, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 350
    invoke-virtual {v3, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 351
    invoke-virtual {v3, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 352
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$style;->track_dialog_anim:I

    invoke-virtual {v3, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 353
    iget-object v0, p0, Lo/cfy;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->show()V

    .line 354
    return-void
.end method

.method public e(Ljava/lang/String;ZLandroid/content/DialogInterface$OnDismissListener;)V
    .locals 5

    .line 105
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 106
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    .line 110
    :cond_0
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 111
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    return-void

    .line 116
    :cond_1
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lo/cfy;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    .line 117
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 118
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 119
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    iget-boolean v1, p0, Lo/cfy;->b:Z

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 120
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 121
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 122
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 123
    iget-object v0, p0, Lo/cfy;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 124
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_common_ui_loading_layout:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 126
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->setContentView(Landroid/view/View;)V

    .line 127
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->progress:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 128
    iget-object v0, p0, Lo/cfy;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/cfy;->c(Landroid/view/Window;Ljava/lang/String;)V

    .line 131
    :cond_2
    return-void
.end method
