.class public Lo/bjs;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bjs$d;,
        Lo/bjs$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/EditText;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/content/Context;

.field private f:Lo/bjq;

.field private k:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 88
    iput-object p1, p0, Lo/bjs;->e:Landroid/content/Context;

    .line 89
    invoke-direct {p0}, Lo/bjs;->c()V

    .line 90
    return-void
.end method

.method static synthetic a(Lo/bjs;)Landroid/widget/TextView;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/bjs;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 1

    .line 195
    sget v0, Lcom/huawei/android/sns/R$string;->sns_transmit_dialog_title:I

    invoke-virtual {p0, v0}, Lo/bjs;->setTitle(I)V

    .line 196
    return-void
.end method

.method static synthetic b(Lo/bjs;)Landroid/widget/ImageView;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/bjs;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b(I)V
    .locals 3

    .line 282
    iget-object v0, p0, Lo/bjs;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 284
    invoke-static {p1}, Lo/bjt;->d(I)Lo/bjq;

    move-result-object v0

    iput-object v0, p0, Lo/bjs;->f:Lo/bjq;

    .line 285
    iget-object v0, p0, Lo/bjs;->f:Lo/bjq;

    iget-object v1, p0, Lo/bjs;->e:Landroid/content/Context;

    iget-object v2, p0, Lo/bjs;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1, v2}, Lo/bjq;->a(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 287
    :cond_0
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)V"
        }
    .end annotation

    .line 296
    iget-object v0, p0, Lo/bjs;->f:Lo/bjq;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 298
    iget-object v0, p0, Lo/bjs;->f:Lo/bjq;

    invoke-virtual {v0, p1}, Lo/bjq;->e(Ljava/util/ArrayList;)V

    .line 300
    :cond_0
    return-void
.end method

.method private c()V
    .locals 6

    .line 97
    const/4 v4, 0x0

    .line 99
    invoke-virtual {p0}, Lo/bjs;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_transmit_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 102
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    sget v0, Lcom/huawei/android/sns/R$id;->layout_conversation:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 105
    iget-object v0, p0, Lo/bjs;->e:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v5, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 108
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->img_head:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bjs;->a:Landroid/widget/ImageView;

    .line 109
    sget v0, Lcom/huawei/android/sns/R$id;->txt_name:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjs;->c:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/android/sns/R$id;->txt_number:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjs;->d:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/android/sns/R$id;->layout_content:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bjs;->k:Landroid/widget/LinearLayout;

    .line 112
    sget v0, Lcom/huawei/android/sns/R$id;->sns_transmit_message:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lo/bjs;->b:Landroid/widget/EditText;

    .line 113
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v5

    .line 114
    iget-object v0, p0, Lo/bjs;->b:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Lo/bjp;

    invoke-direct {v2, v5}, Lo/bjp;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 115
    invoke-virtual {p0, v4}, Lo/bjs;->setView(Landroid/view/View;)V

    .line 117
    invoke-direct {p0}, Lo/bjs;->a()V

    .line 118
    return-void
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)V"
        }
    .end annotation

    .line 256
    const/4 v2, 0x1

    .line 257
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    .line 259
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgType()I

    move-result v0

    const/16 v1, 0x3e7

    if-eq v0, v1, :cond_0

    .line 261
    const/4 v2, 0x0

    .line 262
    goto :goto_1

    .line 264
    :cond_0
    goto :goto_0

    .line 265
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 267
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/bjs;->b(I)V

    goto :goto_2

    .line 271
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bjs;->b(I)V

    .line 273
    :goto_2
    return-void
.end method

.method static synthetic d(Lo/bjs;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/bjs;->e:Landroid/content/Context;

    return-object v0
.end method

.method private d(J)V
    .locals 3

    .line 165
    new-instance v2, Lo/bjs$2;

    invoke-direct {v2, p0, p1, p2}, Lo/bjs$2;-><init>(Lo/bjs;J)V

    .line 186
    sget-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v2, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 187
    return-void
.end method

.method private e(Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;)V
    .locals 1

    .line 231
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 235
    :sswitch_0
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/bjs;->b(I)V

    .line 236
    goto :goto_1

    .line 239
    :sswitch_1
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/bjs;->b(I)V

    .line 240
    goto :goto_1

    .line 243
    :goto_0
    :sswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bjs;->b(I)V

    .line 246
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x2 -> :sswitch_0
        0x6 -> :sswitch_1
        0x8 -> :sswitch_1
        0x3e7 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public a(Lo/axv;)Lo/bjs;
    .locals 8

    .line 127
    iget-object v0, p0, Lo/bjs;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    invoke-virtual {p1}, Lo/axv;->b()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 131
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lo/bjs$3;

    invoke-direct {v1, p0}, Lo/bjs$3;-><init>(Lo/bjs;)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$c;)V

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {p1}, Lo/axv;->b()J

    move-result-wide v6

    .line 144
    invoke-virtual {p1}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 146
    move-wide v0, v6

    iget-object v2, p0, Lo/bjs;->a:Landroid/widget/ImageView;

    .line 147
    invoke-virtual {p1}, Lo/axv;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lo/axv;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lo/axv;->g()Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-direct {p0, v6, v7}, Lo/bjs;->d(J)V

    .line 155
    :goto_0
    return-object p0
.end method

.method public d(Lo/bjw;)Lo/bjs;
    .locals 4

    .line 310
    new-instance v2, Lo/bjs$b;

    iget-object v0, p0, Lo/bjs;->b:Landroid/widget/EditText;

    invoke-direct {v2, p1, v0}, Lo/bjs$b;-><init>(Lo/bjw;Landroid/widget/EditText;)V

    .line 311
    new-instance v3, Lo/bjs$d;

    invoke-direct {v3, p1}, Lo/bjs$d;-><init>(Lo/bjw;)V

    .line 313
    iget-object v0, p0, Lo/bjs;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0, v2}, Lo/bjs;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 314
    iget-object v0, p0, Lo/bjs;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {p0, v1, v0, v3}, Lo/bjs;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 315
    return-object p0
.end method

.method public e(Ljava/util/ArrayList;)Lo/bjs;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)Lo/bjs;"
        }
    .end annotation

    .line 205
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 207
    :cond_0
    return-object p0

    .line 210
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    .line 213
    invoke-direct {p0, v2}, Lo/bjs;->e(Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;)V

    .line 214
    goto :goto_0

    .line 217
    :cond_2
    invoke-direct {p0, p1}, Lo/bjs;->c(Ljava/util/ArrayList;)V

    .line 219
    :goto_0
    invoke-direct {p0, p1}, Lo/bjs;->b(Ljava/util/ArrayList;)V

    .line 221
    return-object p0
.end method
