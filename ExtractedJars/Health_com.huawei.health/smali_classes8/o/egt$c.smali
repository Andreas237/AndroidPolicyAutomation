.class public Lo/egt$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egt$c$b;,
        Lo/egt$c$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/ListView;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Landroid/widget/AdapterView$OnItemClickListener;

.field private g:Landroid/content/DialogInterface$OnClickListener;

.field private h:Landroid/content/DialogInterface$OnClickListener;

.field private i:[Z

.field private k:[Ljava/lang/String;

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egt$c;->l:Z

    .line 72
    iput-object p1, p0, Lo/egt$c;->a:Landroid/content/Context;

    .line 73
    return-void
.end method

.method static synthetic a(Lo/egt$c;)[Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egt$c;->k:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lo/egt$c;)[Z
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egt$c;->i:[Z

    return-object v0
.end method

.method public static c(Landroid/content/Context;F)I
    .locals 3

    .line 311
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 312
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic d(Lo/egt$c;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egt$c;->h:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method

.method static synthetic e(Lo/egt$c;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egt$c;->g:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lo/egt$c;
    .locals 0

    .line 169
    iput-object p1, p0, Lo/egt$c;->d:Ljava/lang/String;

    .line 170
    iput-object p2, p0, Lo/egt$c;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 171
    return-object p0
.end method

.method public c()Landroid/widget/ListView;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/egt$c;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method public c([Ljava/lang/String;[Z[ILandroid/widget/AdapterView$OnItemClickListener;Z)Lo/egt$c;
    .locals 1

    .line 184
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egt$c;->l:Z

    .line 185
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/egt$c;->k:[Ljava/lang/String;

    .line 187
    if-eqz p2, :cond_0

    .line 188
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v0

    iput-object v0, p0, Lo/egt$c;->i:[Z

    goto :goto_0

    .line 190
    :cond_0
    array-length v0, p1

    new-array v0, v0, [Z

    iput-object v0, p0, Lo/egt$c;->i:[Z

    .line 193
    :goto_0
    iput-object p4, p0, Lo/egt$c;->f:Landroid/widget/AdapterView$OnItemClickListener;

    .line 194
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lo/egt$c;
    .locals 0

    .line 122
    iput-object p1, p0, Lo/egt$c;->c:Ljava/lang/String;

    .line 123
    return-object p0
.end method

.method public e()Lo/egt;
    .locals 23

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 204
    new-instance v6, Lo/egt;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v2, 0x0

    invoke-direct {v6, v0, v1, v2}, Lo/egt;-><init>(Landroid/content/Context;ILo/egt$5;)V

    .line 205
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_dialog_single_choice_layout:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 208
    new-instance v8, Landroid/util/TypedValue;

    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v8, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v8, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 212
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v9, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 214
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 215
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v9, v0, v11}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 216
    iget v0, v11, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v12, v0

    .line 219
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 222
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 224
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_singel_choic_title:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    .line 225
    int-to-float v0, v12

    const/4 v1, 0x1

    invoke-virtual {v13, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->c:Ljava/lang/String;

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    sget v0, Lcom/huawei/ui/commonui/R$id;->positiveButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/egd;

    .line 229
    sget v0, Lcom/huawei/ui/commonui/R$id;->negativeButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/egd;

    .line 230
    sget v0, Lcom/huawei/ui/commonui/R$id;->dailog_btn_line:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    .line 232
    sget v0, Lcom/huawei/ui/commonui/R$id;->multichoiceList:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egt$c;->b:Landroid/widget/ListView;

    .line 234
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v7, v0}, Lo/egt;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->e:Ljava/lang/String;

    invoke-virtual {v14, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->h:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_0

    .line 239
    new-instance v0, Lo/egt$c$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lo/egt$c$4;-><init>(Lo/egt$c;Lo/egt;)V

    invoke-virtual {v14, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 246
    :cond_0
    new-instance v0, Lo/egt$c$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lo/egt$c$3;-><init>(Lo/egt$c;Lo/egt;)V

    invoke-virtual {v14, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 253
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v14, v0}, Lo/egd;->setVisibility(I)V

    .line 256
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 257
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->d:Ljava/lang/String;

    invoke-virtual {v15, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->g:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_2

    .line 259
    new-instance v0, Lo/egt$c$5;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lo/egt$c$5;-><init>(Lo/egt$c;Lo/egt;)V

    invoke-virtual {v15, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 266
    :cond_2
    new-instance v0, Lo/egt$c$2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lo/egt$c$2;-><init>(Lo/egt$c;Lo/egt;)V

    invoke-virtual {v15, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 273
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {v15, v0}, Lo/egd;->setVisibility(I)V

    .line 276
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 277
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 279
    :cond_4
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 283
    :goto_2
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/egt$c;->l:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 284
    new-instance v0, Lo/egt$c$b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egt$c;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/egt$c;->k:[Ljava/lang/String;

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/egt$c;->i:[Z

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/egt$c;->f:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-direct {v0, v1, v2, v3, v4}, Lo/egt$c$b;-><init>(Landroid/content/Context;[Ljava/lang/String;[ZLandroid/widget/AdapterView$OnItemClickListener;)V

    move-object/from16 v17, v0

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->b:Landroid/widget/ListView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 286
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->f:Landroid/widget/AdapterView$OnItemClickListener;

    if-eqz v0, :cond_5

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->b:Landroid/widget/ListView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egt$c;->f:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_3

    .line 289
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->b:Landroid/widget/ListView;

    new-instance v1, Lo/egt$c$a;

    move-object/from16 v2, p0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/egt$c$a;-><init>(Lo/egt$c;Lo/egt$5;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 294
    :cond_6
    :goto_3
    invoke-virtual {v6}, Lo/egt;->getWindow()Landroid/view/Window;

    move-result-object v17

    .line 295
    move-object/from16 v0, v17

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 296
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/view/WindowManager;

    .line 297
    invoke-interface/range {v18 .. v18}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v19

    .line 298
    invoke-virtual/range {v17 .. v17}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v20

    .line 299
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/egt$c;->c(Landroid/content/Context;F)I

    move-result v21

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egt$c;->a:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/egt$c;->c(Landroid/content/Context;F)I

    move-result v22

    .line 301
    invoke-virtual/range {v19 .. v19}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v22, 0x2

    sub-int/2addr v0, v1

    move-object/from16 v1, v20

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 302
    move/from16 v0, v21

    move-object/from16 v1, v20

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 303
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 304
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 306
    invoke-virtual {v6, v7}, Lo/egt;->setContentView(Landroid/view/View;)V

    .line 307
    return-object v6
.end method
