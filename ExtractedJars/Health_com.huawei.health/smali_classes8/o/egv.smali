.class public Lo/egv;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egv$b;
    }
.end annotation


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 39
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILo/egv$5;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lo/egv;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method static a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V
    .locals 8

    .line 469
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 471
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 472
    const/16 v0, 0x50

    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 473
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v2, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 474
    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 475
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    .line 476
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 478
    const/4 v6, 0x0

    .line 479
    invoke-static {p2}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    const/high16 v0, 0x433f0000    # 191.0f

    invoke-static {p2, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v6

    goto :goto_0

    .line 482
    :cond_0
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p2, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v6

    .line 484
    :goto_0
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p2, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v7

    .line 485
    invoke-virtual {v4}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v6, 0x2

    sub-int/2addr v0, v1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 486
    iput v7, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 487
    invoke-virtual {v2, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 488
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v2, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 489
    return-void
.end method

.method public static d(Landroid/content/Context;F)I
    .locals 3

    .line 464
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 465
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
