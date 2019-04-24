.class public Lo/bfv;
.super Landroid/app/AlertDialog;
.source "SourceFile"

# interfaces
.implements Lo/bqu;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfv$a;,
        Lo/bfv$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/ProgressBar;

.field private c:Landroid/app/Activity;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private g:Lo/bft;

.field private h:Lo/bqy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bqy<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private i:Landroid/os/Handler;

.field private k:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lo/bft;)V
    .locals 1

    .line 153
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    .line 85
    new-instance v0, Lo/bfv$b;

    invoke-direct {v0, p0}, Lo/bfv$b;-><init>(Lo/bfv;)V

    iput-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    .line 154
    iput-object p1, p0, Lo/bfv;->c:Landroid/app/Activity;

    .line 155
    iput-object p2, p0, Lo/bfv;->g:Lo/bft;

    .line 156
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 201
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_enough_space:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 205
    goto :goto_1

    .line 207
    :pswitch_1
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_file_too_large:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 208
    goto :goto_1

    .line 210
    :pswitch_2
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 211
    goto :goto_1

    .line 213
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v1, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistHttpCode;->getAssistErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 216
    :goto_1
    invoke-direct {p0}, Lo/bfv;->i()V

    .line 217
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lo/bfv;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bfv;->i()V

    return-void
.end method

.method static synthetic b(Lo/bfv;)Lo/bqy;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/bfv;->h:Lo/bqy;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .line 344
    move v3, p1

    .line 346
    if-gez v3, :cond_0

    .line 348
    const/4 v3, 0x0

    goto :goto_0

    .line 350
    :cond_0
    const/16 v0, 0x64

    if-le v3, v0, :cond_1

    .line 352
    const/16 v3, 0x64

    .line 354
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bfv;->b:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    .line 356
    iget-object v0, p0, Lo/bfv;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 358
    :cond_2
    iget-object v0, p0, Lo/bfv;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 360
    iget-object v0, p0, Lo/bfv;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    :cond_3
    return-void
.end method

.method private c()V
    .locals 3

    .line 164
    iget-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 167
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_upload_complain:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    .line 169
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/bfv;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bfv;->e()V

    return-void
.end method

.method static synthetic d(Lo/bfv;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bfv;->f()V

    return-void
.end method

.method static synthetic d(Lo/bfv;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/bfv;->b(I)V

    return-void
.end method

.method private e()V
    .locals 1

    .line 176
    invoke-direct {p0}, Lo/bfv;->i()V

    .line 177
    invoke-direct {p0}, Lo/bfv;->h()V

    .line 178
    iget-object v0, p0, Lo/bfv;->g:Lo/bft;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lo/bfv;->g:Lo/bft;

    invoke-interface {v0}, Lo/bft;->d()V

    .line 182
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/bfv;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bfv;->k()V

    return-void
.end method

.method static synthetic e(Lo/bfv;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/bfv;->a(I)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 297
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lo/bfv;->c:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/android/sns/R$string;->sns_terminate_upload:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_terminate:I

    new-instance v2, Lo/bfv$1;

    invoke-direct {v2, p0}, Lo/bfv$1;-><init>(Lo/bfv;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    new-instance v2, Lo/bfv$a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lo/bfv$a;-><init>(Lo/bfv$4;)V

    .line 308
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/bfv;->k:Landroid/app/AlertDialog;

    .line 310
    iget-object v0, p0, Lo/bfv;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 311
    return-void
.end method

.method private g()V
    .locals 2

    .line 274
    iget-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->upload_progress:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/bfv;->b:Landroid/widget/ProgressBar;

    .line 275
    iget-object v0, p0, Lo/bfv;->b:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 276
    iget-object v0, p0, Lo/bfv;->b:Landroid/widget/ProgressBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 278
    iget-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->cancel_view:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bfv;->e:Landroid/widget/ImageView;

    .line 279
    iget-object v0, p0, Lo/bfv;->e:Landroid/widget/ImageView;

    new-instance v1, Lo/bfv$4;

    invoke-direct {v1, p0}, Lo/bfv$4;-><init>(Lo/bfv;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 288
    iget-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->text_progress:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bfv;->d:Landroid/widget/TextView;

    .line 289
    return-void
.end method

.method private h()V
    .locals 3

    .line 189
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 190
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 191
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 192
    return-void
.end method

.method private i()V
    .locals 1

    .line 243
    invoke-direct {p0}, Lo/bfv;->l()V

    .line 244
    invoke-virtual {p0}, Lo/bfv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {p0}, Lo/bfv;->dismiss()V

    .line 248
    :cond_0
    return-void
.end method

.method private k()V
    .locals 1

    .line 225
    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfv;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 228
    :cond_0
    iget-object v0, p0, Lo/bfv;->h:Lo/bqy;

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lo/bfv;->h:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->b()V

    .line 232
    :cond_1
    return-void

    .line 234
    :cond_2
    invoke-virtual {p0}, Lo/bfv;->show()V

    .line 235
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bfv;->b(I)V

    .line 236
    return-void
.end method

.method private l()V
    .locals 1

    .line 330
    iget-object v0, p0, Lo/bfv;->k:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfv;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/bfv;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 334
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 392
    iget-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 393
    return-void
.end method

.method public b()V
    .locals 2

    .line 380
    iget-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 381
    return-void
.end method

.method public b(Lo/bqy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 398
    iput-object p1, p0, Lo/bfv;->h:Lo/bqy;

    .line 399
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 368
    iget-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    iget-object v1, p0, Lo/bfv;->i:Landroid/os/Handler;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 369
    return-void
.end method

.method public d()V
    .locals 2

    .line 386
    iget-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 387
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 374
    iget-object v0, p0, Lo/bfv;->i:Landroid/os/Handler;

    iget-object v1, p0, Lo/bfv;->i:Landroid/os/Handler;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 375
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 254
    invoke-direct {p0}, Lo/bfv;->c()V

    .line 255
    iget-object v0, p0, Lo/bfv;->a:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lo/bfv;->setView(Landroid/view/View;)V

    .line 256
    invoke-direct {p0}, Lo/bfv;->g()V

    .line 257
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 258
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bfv;->setCanceledOnTouchOutside(Z)V

    .line 259
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 265
    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 266
    invoke-super {p0, p1, p2}, Landroid/app/AlertDialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 265
    :goto_0
    return v0
.end method
