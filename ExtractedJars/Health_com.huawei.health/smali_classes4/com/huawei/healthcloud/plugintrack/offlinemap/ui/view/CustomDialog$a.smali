.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

.field private d:Ljava/lang/String;

.field e:Landroid/view/View$OnClickListener;

.field private f:Z

.field private g:Ljava/lang/Object;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Z

.field private l:Landroid/content/DialogInterface$OnClickListener;

.field private m:Landroid/content/DialogInterface$OnClickListener;

.field private n:Landroid/os/Message;

.field private o:Landroid/os/Handler;

.field private p:Landroid/os/Message;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/view/ViewGroup;

.field private s:Landroid/widget/TextView;

.field private t:Z

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/Button;

.field private w:Landroid/widget/Button;

.field private x:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->o:Landroid/os/Handler;

    .line 82
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a$2;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e:Landroid/view/View$OnClickListener;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->t:Z

    .line 114
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    .line 115
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->f:Z

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->a:Z

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->k:Z

    .line 119
    return-void
.end method

.method private a()V
    .locals 6

    .line 278
    const/4 v3, 0x0

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 283
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->u:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 286
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->z:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->common_ui_custom_dialog_title_top_bottom_padding_nomsg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    .line 291
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_progressbar:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ProgressBar;

    .line 292
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->v:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 297
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->content_divider:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 298
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 299
    return-void
.end method

.method private a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Z
    .locals 2

    .line 251
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    const/4 v0, 0x0

    return v0

    .line 255
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->l()V

    .line 256
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->h()V

    .line 257
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->c(Landroid/view/View;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$c;

    if-ne v0, v1, :cond_1

    .line 260
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d()V

    goto :goto_0

    .line 262
    :cond_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->a()V

    .line 265
    :goto_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->c()V

    .line 266
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Message;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->p:Landroid/os/Message;

    return-object v0
.end method

.method private b()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
    .locals 2

    .line 213
    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;-><init>(Landroid/content/Context;)V

    .line 214
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$ButtonHandler;-><init>(Landroid/content/DialogInterface;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->o:Landroid/os/Handler;

    .line 217
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->f:Z

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->setCancelable(Z)V

    .line 218
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 219
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_ui_custom_dialog:I

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->setContentView(I)V

    .line 220
    invoke-direct {p0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Z

    .line 221
    return-object v1
.end method

.method private b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Z
    .locals 5

    .line 230
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 231
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 233
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->common_ui_custom_dialog_layout:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 234
    instance-of v0, v4, Landroid/view/ViewGroup;

    if-nez v0, :cond_2

    .line 235
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeDialogContent() view is not instanceof ViewGroup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x0

    return v0

    .line 238
    :cond_2
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    .line 239
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_message:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->u:Landroid/widget/TextView;

    .line 240
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->q:Landroid/widget/TextView;

    .line 241
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_title_nomsg:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->s:Landroid/widget/TextView;

    .line 242
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->positive_btn:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    .line 243
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->negative_btn:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->v:Landroid/widget/Button;

    .line 244
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_content:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->z:Landroid/widget/LinearLayout;

    .line 245
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->dialog_button_line:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->x:Landroid/widget/LinearLayout;

    .line 246
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Message;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->n:Landroid/os/Message;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 270
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->t:Z

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_btn_text_default_alert_emui3_0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 273
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 275
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;)Landroid/os/Handler;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->o:Landroid/os/Handler;

    return-object v0
.end method

.method private d()V
    .locals 0

    .line 302
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->k()V

    .line 303
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->i()V

    .line 304
    return-void
.end method

.method private f()V
    .locals 3

    .line 336
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->v:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 338
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->m:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->m:Landroid/content/DialogInterface$OnClickListener;

    const/4 v2, -0x2

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->p:Landroid/os/Message;

    .line 341
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->v:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 346
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->l:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_1

    .line 349
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->o:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->l:Landroid/content/DialogInterface$OnClickListener;

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->n:Landroid/os/Message;

    .line 351
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->k:Z

    if-nez v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->k:Z

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 356
    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    .line 388
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->q:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 390
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->title_divider:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 391
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 392
    goto :goto_0

    .line 393
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 394
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->u:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->q:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 396
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 399
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    :goto_0
    return-void
.end method

.method private i()V
    .locals 6

    .line 307
    const/4 v2, 0x1

    .line 308
    const/4 v3, 0x2

    .line 309
    const/4 v4, 0x0

    .line 311
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 312
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g()V

    .line 313
    const/4 v4, 0x1

    goto :goto_0

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->w:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 318
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->f()V

    .line 320
    or-int/lit8 v4, v4, 0x2

    goto :goto_1

    .line 322
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->v:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 325
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 326
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 329
    :cond_2
    if-eq v4, v2, :cond_3

    if-ne v4, v3, :cond_4

    .line 330
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->btn_divider:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 331
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 333
    :cond_4
    return-void
.end method

.method private k()V
    .locals 7

    .line 359
    const/4 v4, -0x2

    .line 360
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->common_ui_custom_dialog_content_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v5, v0

    .line 361
    const/4 v6, 0x0

    .line 362
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 363
    new-instance v6, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 364
    move-object v0, v6

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    move-object v0, v6

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->common_ui_custom_dialog_message_text_size:I

    .line 366
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 365
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 367
    move-object v0, v6

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->common_ui_custom_dialog_value_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 377
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    goto :goto_0

    .line 379
    :cond_1
    new-instance v6, Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 380
    const/4 v4, 0x1

    .line 383
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 384
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->z:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v5, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v6, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 385
    return-void
.end method

.method private l()V
    .locals 2

    .line 405
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->a:Z

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->common_ui_custom_dialog_transparent_bg:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_0

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->r:Landroid/view/ViewGroup;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->activity_dialog_bg:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    .line 410
    :goto_0
    return-void
.end method


# virtual methods
.method public b(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->h:Ljava/lang/String;

    .line 181
    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 182
    return-object p0
.end method

.method public b(Ljava/lang/Object;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->g:Ljava/lang/Object;

    .line 161
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->d:Ljava/lang/String;

    .line 128
    return-object p0
.end method

.method public c(Z)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 0

    .line 145
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->t:Z

    .line 146
    return-object p0
.end method

.method public e(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->i:Ljava/lang/String;

    .line 193
    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->m:Landroid/content/DialogInterface$OnClickListener;

    .line 194
    return-object p0
.end method

.method public e(Z)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;
    .locals 0

    .line 225
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->f:Z

    .line 226
    return-object p0
.end method

.method public e()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;
    .locals 1

    .line 198
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog$a;->b()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    move-result-object v0

    return-object v0
.end method
