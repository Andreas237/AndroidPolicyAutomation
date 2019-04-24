.class public Lo/egw$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egw$c$a;,
        Lo/egw$c$c;
    }
.end annotation


# instance fields
.field a:Lo/egw;

.field b:Landroid/widget/RelativeLayout;

.field c:Lo/egd;

.field d:Landroid/widget/LinearLayout;

.field e:Lo/egd;

.field private f:Landroid/content/Context;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field i:Lo/egd;

.field private k:Landroid/view/View;

.field private l:I

.field private m:I

.field private n:Landroid/view/View$OnClickListener;

.field private o:Ljava/lang/String;

.field private p:Landroid/view/View$OnClickListener;

.field private u:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/16 v0, 0x18

    iput v0, p0, Lo/egw$c;->m:I

    .line 50
    const/16 v0, 0x18

    iput v0, p0, Lo/egw$c;->l:I

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egw$c;->u:Z

    .line 163
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->a:Lo/egw;

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->c:Lo/egd;

    .line 167
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->e:Lo/egd;

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egw$c;->i:Lo/egd;

    .line 54
    iput-object p1, p0, Lo/egw$c;->f:Landroid/content/Context;

    .line 55
    return-void
.end method

.method private a()V
    .locals 2

    .line 258
    iget-object v0, p0, Lo/egw$c;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/egw$c;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 259
    invoke-direct {p0}, Lo/egw$c;->d()V

    goto :goto_0

    .line 260
    :cond_0
    iget-object v0, p0, Lo/egw$c;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/egw$c;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 261
    invoke-direct {p0}, Lo/egw$c;->c()V

    goto :goto_0

    .line 262
    :cond_1
    iget-object v0, p0, Lo/egw$c;->h:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/egw$c;->o:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 263
    invoke-direct {p0}, Lo/egw$c;->b()V

    goto :goto_0

    .line 265
    :cond_2
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 268
    :goto_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 306
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    iget-object v1, p0, Lo/egw$c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 310
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 311
    iget-object v0, p0, Lo/egw$c;->n:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    new-instance v1, Lo/egw$c$c;

    invoke-direct {v1, p0}, Lo/egw$c$c;-><init>(Lo/egw$c;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 314
    :cond_0
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positiveButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/egw$c;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/egw$c;->n:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 319
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    iget-object v1, p0, Lo/egw$c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 323
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 324
    iget-object v0, p0, Lo/egw$c;->p:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lo/egw$c;->i:Lo/egd;

    new-instance v1, Lo/egw$c$a;

    invoke-direct {v1, p0}, Lo/egw$c$a;-><init>(Lo/egw$c;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 327
    :cond_0
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "negativeButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 285
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 288
    iget-object v0, p0, Lo/egw$c;->e:Lo/egd;

    iget-object v1, p0, Lo/egw$c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 290
    iget-object v0, p0, Lo/egw$c;->n:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/egw$c;->e:Lo/egd;

    new-instance v1, Lo/egw$c$c;

    invoke-direct {v1, p0}, Lo/egw$c$c;-><init>(Lo/egw$c;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 293
    :cond_0
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positiveButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    :goto_0
    iget-object v0, p0, Lo/egw$c;->c:Lo/egd;

    iget-object v1, p0, Lo/egw$c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 297
    iget-object v0, p0, Lo/egw$c;->c:Lo/egd;

    iget-object v1, p0, Lo/egw$c;->e:Lo/egd;

    invoke-static {v0, v1}, Lo/ene;->c(Lo/egd;Lo/egd;)V

    .line 298
    iget-object v0, p0, Lo/egw$c;->p:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 299
    iget-object v0, p0, Lo/egw$c;->c:Lo/egd;

    new-instance v1, Lo/egw$c$a;

    invoke-direct {v1, p0}, Lo/egw$c$a;-><init>(Lo/egw$c;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 301
    :cond_1
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "negativeButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/egw$c;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/egw$c;->p:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/egw$c;
    .locals 0

    .line 73
    iput-object p1, p0, Lo/egw$c;->g:Ljava/lang/String;

    .line 74
    return-object p0
.end method

.method public a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;
    .locals 4

    .line 133
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPositiveButton called "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iput-object p1, p0, Lo/egw$c;->h:Ljava/lang/String;

    .line 135
    iput-object p2, p0, Lo/egw$c;->n:Landroid/view/View$OnClickListener;

    .line 136
    return-object p0
.end method

.method public a(Z)Lo/egw$c;
    .locals 0

    .line 83
    iput-boolean p1, p0, Lo/egw$c;->u:Z

    .line 84
    return-object p0
.end method

.method public b(ILandroid/view/View$OnClickListener;)Lo/egw$c;
    .locals 1

    .line 122
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egw$c;->h:Ljava/lang/String;

    .line 123
    iput-object p2, p0, Lo/egw$c;->n:Landroid/view/View$OnClickListener;

    .line 124
    return-object p0
.end method

.method public b(Landroid/view/View;II)Lo/egw$c;
    .locals 1

    .line 105
    iput-object p1, p0, Lo/egw$c;->k:Landroid/view/View;

    .line 106
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iput p3, p0, Lo/egw$c;->m:I

    .line 108
    iput p2, p0, Lo/egw$c;->l:I

    goto :goto_0

    .line 110
    :cond_0
    iput p2, p0, Lo/egw$c;->m:I

    .line 111
    iput p3, p0, Lo/egw$c;->l:I

    .line 113
    :goto_0
    return-object p0
.end method

.method public c(ILandroid/view/View$OnClickListener;)Lo/egw$c;
    .locals 4

    .line 145
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setNegativeButton called "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egw$c;->o:Ljava/lang/String;

    .line 147
    iput-object p2, p0, Lo/egw$c;->p:Landroid/view/View$OnClickListener;

    .line 148
    return-object p0
.end method

.method public c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;
    .locals 4

    .line 157
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setNegativeButton called "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iput-object p1, p0, Lo/egw$c;->o:Ljava/lang/String;

    .line 159
    iput-object p2, p0, Lo/egw$c;->p:Landroid/view/View$OnClickListener;

    .line 160
    return-object p0
.end method

.method public e(I)Lo/egw$c;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egw$c;->g:Ljava/lang/String;

    .line 64
    return-object p0
.end method

.method public e(Landroid/view/View;)Lo/egw$c;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/egw$c;->k:Landroid/view/View;

    .line 95
    return-object p0
.end method

.method public e()Lo/egw;
    .locals 13

    .line 175
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 177
    new-instance v0, Lo/egw;

    iget-object v1, p0, Lo/egw$c;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/egw;-><init>(Landroid/content/Context;ILo/egw$5;)V

    iput-object v0, p0, Lo/egw$c;->a:Lo/egw;

    .line 178
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 179
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_view_dialog_title_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 180
    sget v0, Lcom/huawei/ui/commonui/R$id;->dailog_no_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 183
    new-instance v8, Landroid/util/TypedValue;

    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 184
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v8, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 189
    iget v0, v8, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v8, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v11

    .line 191
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v11, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 192
    new-instance v12, Landroid/util/TypedValue;

    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 193
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v11, v0, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 195
    iget v0, v12, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v10, v0

    .line 196
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    int-to-float v1, v10

    invoke-static {v0, v1}, Lo/egw;->b(Landroid/content/Context;F)I

    move-result v10

    .line 198
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 199
    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 202
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$dimen;->custom_normal_titlebar_title_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v10

    .line 206
    :goto_0
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 209
    iget-object v0, p0, Lo/egw$c;->g:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 210
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 211
    iget-boolean v0, p0, Lo/egw$c;->u:Z

    if-eqz v0, :cond_1

    .line 213
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 215
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 218
    :cond_2
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_view_dailog_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 219
    int-to-float v0, v10

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 220
    iget-object v0, p0, Lo/egw$c;->g:Ljava/lang/String;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    :goto_1
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_rlyt_content:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RelativeLayout;

    .line 227
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v12, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 228
    iget-object v0, p0, Lo/egw$c;->f:Landroid/content/Context;

    iget v1, p0, Lo/egw$c;->m:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/egw$c;->f:Landroid/content/Context;

    iget v2, p0, Lo/egw$c;->l:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v12, v0, v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 229
    invoke-virtual {v11, v12}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    iget-object v0, p0, Lo/egw$c;->k:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 232
    invoke-virtual {v11}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 233
    iget-object v0, p0, Lo/egw$c;->k:Landroid/view/View;

    invoke-virtual {v11, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 236
    :cond_3
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    .line 237
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    .line 239
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_view_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egw$c;->c:Lo/egd;

    .line 240
    iget-object v0, p0, Lo/egw$c;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_view_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egw$c;->e:Lo/egd;

    .line 241
    iget-object v0, p0, Lo/egw$c;->d:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_one_view_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egw$c;->i:Lo/egd;

    .line 244
    invoke-direct {p0}, Lo/egw$c;->a()V

    .line 252
    iget-object v0, p0, Lo/egw$c;->a:Lo/egw;

    iget-object v1, p0, Lo/egw$c;->f:Landroid/content/Context;

    invoke-static {v0, v5, v1}, Lo/egv;->a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V

    .line 254
    iget-object v0, p0, Lo/egw$c;->a:Lo/egw;

    return-object v0
.end method

.method public e(Z)V
    .locals 1

    .line 270
    iget-object v0, p0, Lo/egw$c;->e:Lo/egd;

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Lo/egw$c;->e:Lo/egd;

    invoke-virtual {v0, p1}, Lo/egd;->setEnabled(Z)V

    .line 273
    :cond_0
    return-void
.end method
