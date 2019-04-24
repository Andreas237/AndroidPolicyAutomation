.class public Lo/egu$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egu$a$d;
    }
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ProgressBar;

.field private d:Landroid/widget/TextView;

.field e:Lo/egu;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/LinearLayout;

.field private n:Landroid/view/View$OnClickListener;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egu$a;->e:Lo/egu;

    .line 87
    iput-object p1, p0, Lo/egu$a;->b:Landroid/content/Context;

    .line 88
    return-void
.end method

.method static synthetic e(Lo/egu$a;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/egu$a;->n:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(I)Lo/egu$a;
    .locals 2

    .line 120
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 122
    :sswitch_0
    iget-object v0, p0, Lo/egu$a;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 123
    goto :goto_0

    .line 125
    :sswitch_1
    iget-object v0, p0, Lo/egu$a;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 126
    .line 130
    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public a(Landroid/view/View$OnClickListener;)Lo/egu$a;
    .locals 1

    .line 181
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 182
    iget-object v0, p0, Lo/egu$a;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    :cond_0
    return-object p0
.end method

.method public b(I)Lo/egu$a;
    .locals 3

    .line 194
    iget-object v0, p0, Lo/egu$a;->d:Landroid/widget/TextView;

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

    .line 195
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/egu$a;
    .locals 2

    .line 151
    iget-object v0, p0, Lo/egu$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v0, p0, Lo/egu$a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Lo/egu$a;->c:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lo/egu$a;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lo/egu$a;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 156
    return-object p0
.end method

.method public c(Landroid/view/View$OnClickListener;)Lo/egu$a;
    .locals 1

    .line 140
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 141
    iget-object v0, p0, Lo/egu$a;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    :cond_0
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/egu$a;
    .locals 0

    .line 97
    iput-object p1, p0, Lo/egu$a;->o:Ljava/lang/String;

    .line 98
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/egu$a;
    .locals 2

    .line 165
    iget-object v0, p0, Lo/egu$a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lo/egu$a;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lo/egu$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lo/egu$a;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 169
    iget-object v0, p0, Lo/egu$a;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 170
    return-object p0
.end method

.method public d()Lo/egu;
    .locals 12

    .line 209
    iget-object v0, p0, Lo/egu$a;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 211
    invoke-static {}, Lo/egu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    new-instance v0, Lo/egu;

    iget-object v1, p0, Lo/egu$a;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->health_data_insert_dialog:I

    invoke-direct {v0, v1, v2}, Lo/egu;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/egu$a;->e:Lo/egu;

    .line 213
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_loading_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 214
    sget v0, Lcom/huawei/ui/commonui/R$id;->health_data_inserting_img:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 215
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-static {v0}, Lo/egu;->d(Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;

    .line 216
    goto/16 :goto_1

    .line 217
    :cond_0
    new-instance v0, Lo/egu;

    iget-object v1, p0, Lo/egu$a;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {v0, v1, v2}, Lo/egu;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/egu$a;->e:Lo/egu;

    .line 218
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_stress_dowload_progress_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 220
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_percent:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egu$a;->d:Landroid/widget/TextView;

    .line 221
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_progressbar:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/egu$a;->c:Landroid/widget/ProgressBar;

    .line 222
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/egu$a;->i:Landroid/widget/ImageView;

    .line 223
    sget v0, Lcom/huawei/ui/commonui/R$id;->close_log:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egu$a;->h:Landroid/widget/TextView;

    .line 224
    sget v0, Lcom/huawei/ui/commonui/R$id;->doawnload_again:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egu$a;->g:Landroid/widget/TextView;

    .line 225
    sget v0, Lcom/huawei/ui/commonui/R$id;->linear_button:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egu$a;->k:Landroid/widget/LinearLayout;

    .line 226
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_faild:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egu$a;->f:Landroid/widget/TextView;

    .line 227
    iget-object v0, p0, Lo/egu$a;->n:Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 228
    iget-object v0, p0, Lo/egu$a;->i:Landroid/widget/ImageView;

    new-instance v1, Lo/egu$a$d;

    invoke-direct {v1, p0}, Lo/egu$a$d;-><init>(Lo/egu$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    iget-object v0, p0, Lo/egu$a;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lo/egu$a;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 234
    :goto_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_progress_dialog_desc:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egu$a;->a:Landroid/widget/TextView;

    .line 235
    iget-object v0, p0, Lo/egu$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/egu$a;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    const-string v0, "CustomProgressDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "progressDesc :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/egu$a;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/egu$a;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 241
    :goto_1
    iget-object v0, p0, Lo/egu$a;->e:Lo/egu;

    invoke-virtual {v0, v5}, Lo/egu;->setContentView(Landroid/view/View;)V

    .line 243
    iget-object v0, p0, Lo/egu$a;->e:Lo/egu;

    invoke-virtual {v0}, Lo/egu;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 244
    const/16 v0, 0x50

    invoke-virtual {v6, v0}, Landroid/view/Window;->setGravity(I)V

    .line 245
    iget-object v0, p0, Lo/egu$a;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/view/WindowManager;

    .line 246
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 247
    invoke-virtual {v6}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v9

    .line 248
    iget-object v0, p0, Lo/egu$a;->b:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/egu;->e(Landroid/content/Context;F)I

    move-result v10

    .line 249
    iget-object v0, p0, Lo/egu$a;->b:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/egu;->e(Landroid/content/Context;F)I

    move-result v11

    .line 250
    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v11, 0x2

    sub-int/2addr v0, v1

    iput v0, v9, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 251
    iput v10, v9, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 252
    invoke-virtual {v6, v9}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 253
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    invoke-virtual {v6, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 254
    iget-object v0, p0, Lo/egu$a;->e:Lo/egu;

    return-object v0
.end method

.method public e(I)Lo/egu$a;
    .locals 1

    .line 109
    iget-object v0, p0, Lo/egu$a;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 110
    return-object p0
.end method
