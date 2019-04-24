.class public Lo/egq$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egq$e$b;,
        Lo/egq$e$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/egq;

.field private c:F

.field private d:Landroid/graphics/Bitmap;

.field private e:Landroid/widget/ImageView;

.field private i:Landroid/view/View$OnClickListener;

.field private k:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egq$e;->b:Lo/egq;

    .line 98
    iput-object p1, p0, Lo/egq$e;->a:Landroid/content/Context;

    .line 99
    return-void
.end method

.method static synthetic a(Lo/egq$e;)Lo/egq;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/egq$e;->b:Lo/egq;

    return-object v0
.end method

.method static synthetic b(Lo/egq$e;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/egq$e;->i:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static synthetic c(Lo/egq$e;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/egq$e;->k:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/view/View$OnClickListener;)Lo/egq$e;
    .locals 0

    .line 128
    iput-object p1, p0, Lo/egq$e;->i:Landroid/view/View$OnClickListener;

    .line 129
    return-object p0
.end method

.method public d(Landroid/view/View$OnClickListener;)Lo/egq$e;
    .locals 0

    .line 119
    iput-object p1, p0, Lo/egq$e;->k:Landroid/view/View$OnClickListener;

    .line 120
    return-object p0
.end method

.method public d()Lo/egq;
    .locals 13

    .line 137
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 139
    new-instance v0, Lo/egq;

    iget-object v1, p0, Lo/egq$e;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/egq;-><init>(Landroid/content/Context;ILo/egq$1;)V

    iput-object v0, p0, Lo/egq$e;->b:Lo/egq;

    .line 140
    sget v0, Lcom/huawei/ui/commonui/R$layout;->layout_dialog_ad:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 142
    sget v0, Lcom/huawei/ui/commonui/R$id;->ad_image:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/egq$e;->e:Landroid/widget/ImageView;

    .line 143
    sget v0, Lcom/huawei/ui/commonui/R$id;->ad_close:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 145
    iget-object v0, p0, Lo/egq$e;->d:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 146
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lo/egq$e;->d:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory;->create(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;

    move-result-object v8

    .line 147
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setAntiAlias(Z)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setDither(Z)V

    .line 149
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    iget v1, p0, Lo/egq$e;->c:F

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v1, v1, v3

    if-gez v1, :cond_0

    const/high16 v1, 0x41c00000    # 24.0f

    goto :goto_0

    :cond_0
    iget v1, p0, Lo/egq$e;->c:F

    :goto_0
    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v8, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setCornerRadius(F)V

    .line 150
    iget-object v0, p0, Lo/egq$e;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 151
    goto :goto_1

    .line 152
    :cond_1
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    :goto_1
    iget-object v0, p0, Lo/egq$e;->e:Landroid/widget/ImageView;

    new-instance v1, Lo/egq$e$b;

    invoke-direct {v1, p0}, Lo/egq$e$b;-><init>(Lo/egq$e;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    new-instance v0, Lo/egq$e$a;

    invoke-direct {v0, p0}, Lo/egq$e$a;-><init>(Lo/egq$e;)V

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    iget-object v0, p0, Lo/egq$e;->b:Lo/egq;

    invoke-virtual {v0, v6}, Lo/egq;->setContentView(Landroid/view/View;)V

    .line 160
    iget-object v0, p0, Lo/egq$e;->b:Lo/egq;

    invoke-virtual {v0}, Lo/egq;->getWindow()Landroid/view/Window;

    move-result-object v8

    .line 161
    const/16 v0, 0x10

    invoke-virtual {v8, v0}, Landroid/view/Window;->setGravity(I)V

    .line 162
    invoke-virtual {v8}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v9

    .line 163
    const v0, 0x3e4ccccd    # 0.2f

    iput v0, v9, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 164
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/view/WindowManager;

    .line 165
    invoke-interface {v10}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v11

    .line 166
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v12

    .line 167
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 168
    iget-object v0, p0, Lo/egq$e;->a:Landroid/content/Context;

    const/high16 v1, 0x430f0000    # 143.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v12

    .line 170
    :cond_2
    invoke-virtual {v11}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v12, 0x2

    sub-int/2addr v0, v1

    iput v0, v9, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 171
    invoke-virtual {v8, v9}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 177
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v8, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 178
    iget-object v0, p0, Lo/egq$e;->b:Lo/egq;

    return-object v0
.end method

.method public e(Landroid/graphics/Bitmap;)Lo/egq$e;
    .locals 0

    .line 104
    iput-object p1, p0, Lo/egq$e;->d:Landroid/graphics/Bitmap;

    .line 105
    return-object p0
.end method

.method public e()Z
    .locals 4

    .line 183
    iget-object v0, p0, Lo/egq$e;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/egq$e;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 184
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != adImage && adImage.getDrawable() != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    const/4 v0, 0x1

    return v0

    .line 187
    :cond_0
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isImageShowSuccess error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    return v0
.end method
