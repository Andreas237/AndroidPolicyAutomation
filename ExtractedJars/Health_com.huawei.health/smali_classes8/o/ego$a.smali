.class public Lo/ego$a;
.super Lo/ege;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ego;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ego$a$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field b:Lo/ego;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/ProgressBar;

.field private f:Landroid/view/View$OnClickListener;

.field private g:Ljava/lang/String;

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Lo/ege;-><init>()V

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ego$a;->b:Lo/ego;

    .line 77
    iput-object p1, p0, Lo/ego$a;->d:Landroid/content/Context;

    .line 78
    return-void
.end method

.method static synthetic e(Lo/ego$a;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/ego$a;->f:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(I)Lo/ego$a;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/ego$a;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 97
    return-object p0
.end method

.method public b(I)Lo/ego$a;
    .locals 3

    .line 106
    iget-object v0, p0, Lo/ego$a;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/ego$a;
    .locals 0

    .line 86
    iput-object p1, p0, Lo/ego$a;->g:Ljava/lang/String;

    .line 87
    return-object p0
.end method

.method public d()Lo/ego;
    .locals 14

    .line 126
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 129
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 130
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 131
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->activity_dialog_bg_new:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 141
    invoke-static {}, Lo/ego;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lo/ego$a;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->health_data_insert_dialog:I

    invoke-direct {v0, v1, v2}, Lo/ego;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/ego$a;->b:Lo/ego;

    .line 144
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_loading_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 145
    sget v0, Lcom/huawei/ui/commonui/R$id;->health_data_inserting_img:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 146
    invoke-virtual {v8}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-static {v0}, Lo/ego;->c(Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;

    .line 147
    goto/16 :goto_1

    .line 148
    :cond_0
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lo/ego$a;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {v0, v1, v2}, Lo/ego;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/ego$a;->b:Lo/ego;

    .line 150
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_progress_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 153
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_percent:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ego$a;->a:Landroid/widget/TextView;

    .line 154
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_progressbar:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/ego$a;->e:Landroid/widget/ProgressBar;

    .line 155
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ego$a;->k:Landroid/widget/ImageView;

    .line 157
    iget-object v0, p0, Lo/ego$a;->f:Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 158
    iget-object v0, p0, Lo/ego$a;->k:Landroid/widget/ImageView;

    new-instance v1, Lo/ego$a$d;

    invoke-direct {v1, p0}, Lo/ego$a$d;-><init>(Lo/ego$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 159
    iget-object v0, p0, Lo/ego$a;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 161
    :cond_1
    iget-object v0, p0, Lo/ego$a;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    :goto_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_desc:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ego$a;->c:Landroid/widget/TextView;

    .line 165
    iget-object v0, p0, Lo/ego$a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ego$a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    const-string v0, "CustomProgressDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "progressDesc :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ego$a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lo/ego$a;->e:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 173
    :goto_1
    invoke-virtual {v5, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 178
    iget-object v0, p0, Lo/ego$a;->b:Lo/ego;

    invoke-virtual {v0, v5}, Lo/ego;->setContentView(Landroid/view/View;)V

    .line 181
    iget-object v0, p0, Lo/ego$a;->b:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->getWindow()Landroid/view/Window;

    move-result-object v8

    .line 182
    const/16 v0, 0x50

    invoke-virtual {v8, v0}, Landroid/view/Window;->setGravity(I)V

    .line 183
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/WindowManager;

    .line 184
    invoke-interface {v9}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v10

    .line 185
    invoke-virtual {v8}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v11

    .line 187
    const/4 v12, 0x0

    .line 188
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    const/high16 v1, 0x433f0000    # 191.0f

    invoke-static {v0, v1}, Lo/ego;->b(Landroid/content/Context;F)I

    move-result v12

    goto :goto_2

    .line 191
    :cond_2
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ego;->b(Landroid/content/Context;F)I

    move-result v12

    .line 193
    :goto_2
    iget-object v0, p0, Lo/ego$a;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ego;->b(Landroid/content/Context;F)I

    move-result v13

    .line 194
    invoke-virtual {v10}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v12, 0x2

    sub-int/2addr v0, v1

    iput v0, v11, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 195
    iput v13, v11, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 196
    invoke-virtual {v8, v11}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 197
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v8, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 199
    iget-object v0, p0, Lo/ego$a;->b:Lo/ego;

    return-object v0
.end method

.method public e(Landroid/view/View$OnClickListener;)Lo/ego$a;
    .locals 0

    .line 116
    iput-object p1, p0, Lo/ego$a;->f:Landroid/view/View$OnClickListener;

    .line 117
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lo/ego$a;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/ego$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    return-object p0
.end method
