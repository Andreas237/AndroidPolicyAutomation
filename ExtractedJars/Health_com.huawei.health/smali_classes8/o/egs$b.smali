.class public Lo/egs$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/DialogInterface$OnClickListener;

.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lo/egs$b;->e:Landroid/content/Context;

    .line 43
    return-void
.end method

.method static synthetic c(Lo/egs$b;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/egs$b;->a:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method

.method static synthetic d(Lo/egs$b;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/egs$b;->e:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;F)I
    .locals 3

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 140
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public b(Lo/egs;)V
    .locals 4

    .line 144
    sget-object v0, Lo/egs;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissDialog."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/egs;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p1}, Lo/egs;->dismiss()V

    .line 148
    :cond_0
    return-void
.end method

.method public d()Lo/egs;
    .locals 24

    .line 66
    sget-object v0, Lo/egs;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter HuaweiMobileServiceSetDialog create:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    new-instance v4, Lo/egs;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {v4, v0, v1}, Lo/egs;-><init>(Landroid/content/Context;I)V

    .line 68
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 69
    sget v0, Lcom/huawei/ui/commonui/R$layout;->huawei_mobile_service_alert_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 70
    sget v0, Lcom/huawei/ui/commonui/R$id;->note_title:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/huawei/ui/commonui/R$id;->note_message:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 72
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hw_plugin_account_hwid_back_run_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 73
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    sget v0, Lcom/huawei/ui/commonui/R$id;->note_positiveButton:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/egd;

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->b:Ljava/lang/String;

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->d:Ljava/lang/String;

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->a:Landroid/content/DialogInterface$OnClickListener;

    if-nez v0, :cond_2

    .line 85
    new-instance v0, Lo/egs$b$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lo/egs$b$1;-><init>(Lo/egs$b;Lo/egs;)V

    invoke-virtual {v10, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 95
    :cond_2
    new-instance v0, Lo/egs$b$2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lo/egs$b$2;-><init>(Lo/egs$b;Lo/egs;)V

    invoke-virtual {v10, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    :goto_0
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 104
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v11, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 106
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v11, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v12

    .line 108
    new-instance v13, Landroid/util/TypedValue;

    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    .line 109
    new-instance v14, Landroid/util/TypedValue;

    invoke-direct {v14}, Landroid/util/TypedValue;-><init>()V

    .line 110
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v12, v0, v13}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 111
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_contentTextSize:I

    invoke-virtual {v12, v0, v14}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 112
    iget v0, v13, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v15, v0

    .line 113
    int-to-float v0, v15

    const/4 v1, 0x1

    invoke-virtual {v7, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 114
    iget v0, v14, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v1, v0

    move/from16 v16, v1

    .line 115
    move/from16 v0, v16

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-virtual {v8, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 116
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v12, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v17

    .line 119
    invoke-virtual {v12}, Landroid/content/res/TypedArray;->recycle()V

    .line 120
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    invoke-virtual {v4, v6}, Lo/egs;->setContentView(Landroid/view/View;)V

    .line 122
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egs;->setCancelable(Z)V

    .line 124
    invoke-virtual {v4}, Lo/egs;->getWindow()Landroid/view/Window;

    move-result-object v18

    .line 125
    move-object/from16 v0, v18

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/view/WindowManager;

    .line 127
    invoke-interface/range {v19 .. v19}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v20

    .line 128
    invoke-virtual/range {v18 .. v18}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v21

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    move-object/from16 v1, p0

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {v1, v0, v2}, Lo/egs$b;->a(Landroid/content/Context;F)I

    move-result v22

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egs$b;->e:Landroid/content/Context;

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v1, v0, v2}, Lo/egs$b;->a(Landroid/content/Context;F)I

    move-result v23

    .line 131
    invoke-virtual/range {v20 .. v20}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v23, 0x2

    sub-int/2addr v0, v1

    move-object/from16 v1, v21

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 132
    move/from16 v0, v22

    move-object/from16 v1, v21

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 133
    move-object/from16 v0, v18

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 134
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 135
    return-object v4
.end method
