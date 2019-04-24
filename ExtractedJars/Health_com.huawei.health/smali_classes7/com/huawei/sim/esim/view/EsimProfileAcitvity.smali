.class public Lcom/huawei/sim/esim/view/EsimProfileAcitvity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private B:Landroid/os/Handler;

.field private C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private a:Landroid/widget/ListView;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/edb;>;"
        }
    .end annotation
.end field

.field private c:Lo/dal;

.field private d:Lo/egn;

.field private e:Ljava/lang/Boolean;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private k:Lo/edp;

.field private l:Landroid/widget/ImageView;

.field private m:I

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/view/View;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Z

.field private t:Lo/emr;

.field private u:Landroid/view/View;

.field private v:Lo/egv;

.field private w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private x:[B

.field private y:Lo/ecx;

.field private z:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b:Ljava/util/ArrayList;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    .line 63
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->m:I

    .line 76
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->s:Z

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    .line 358
    new-instance v0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$6;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$6;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 398
    new-instance v0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$7;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->B:Landroid/os/Handler;

    .line 425
    new-instance v0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$10;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 199
    sget v0, Lcom/huawei/sim/R$id;->esim_profile:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a:Landroid/widget/ListView;

    .line 200
    new-instance v0, Lo/edp;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1, p0}, Lo/edp;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->k:Lo/edp;

    .line 201
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->k:Lo/edp;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 202
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->t:Lo/emr;

    .line 203
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->t:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$3;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    sget v0, Lcom/huawei/sim/R$id;->bt_disconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->i:Landroid/view/View;

    .line 216
    sget v0, Lcom/huawei/sim/R$id;->set_bt_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->h:Landroid/view/View;

    .line 217
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->h:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$2;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$2;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->f:Landroid/view/View;

    .line 230
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g:Landroid/widget/ImageView;

    .line 231
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mProfilePolicyRules = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    invoke-static {v3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    array-length v0, v0

    if-lez v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x80

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x40

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x20

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x60

    if-ne v0, v1, :cond_1

    .line 238
    :cond_0
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have PPR1 count"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c()V

    .line 242
    :cond_1
    sget v0, Lcom/huawei/sim/R$id;->back_button_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->p:Landroid/view/View;

    .line 243
    sget v0, Lcom/huawei/sim/R$id;->back_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->r:Landroid/widget/ImageView;

    .line 244
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->p:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$1;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$1;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    sget v0, Lcom/huawei/sim/R$id;->next_button_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->n:Landroid/view/View;

    .line 255
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->n:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$4;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    sget v0, Lcom/huawei/sim/R$id;->next_button_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    .line 287
    sget v0, Lcom/huawei/sim/R$id;->next_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    .line 313
    sget v0, Lcom/huawei/sim/R$id;->bt_comunictaion_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    .line 314
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 315
    sget v0, Lcom/huawei/sim/R$id;->bt_reconnect_set_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->q:Landroid/widget/ImageView;

    .line 316
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 317
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 321
    :cond_2
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 483
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 484
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    .line 485
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 492
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 493
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->s:Z

    if-nez v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_button_retry:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_next:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 161
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->n:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 162
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 163
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 169
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/egv;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;Lo/egv;)Lo/egv;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    return-object p1
.end method

.method private c()V
    .locals 6

    .line 327
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showHavePPR1CountDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->z:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_have_ppr_count_dialog_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 329
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 330
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->z:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/sim/R$string;->IDS_service_area_notice_title:I

    .line 331
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 332
    invoke-virtual {v0, v4}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;

    invoke-direct {v2, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 333
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;

    invoke-direct {v2, p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;-><init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V

    .line 342
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 352
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    .line 353
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 354
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->v:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 356
    :cond_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    sget v0, Lcom/huawei/sim/R$anim;->bt_connecting:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 178
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 180
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 181
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 187
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)[B
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Ljava/lang/Boolean;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 136
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 143
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 449
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 450
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commandResult errorcode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g()V

    .line 452
    return-void

    .line 455
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 456
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->s:Z

    .line 457
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 458
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 459
    invoke-virtual {p0, v4}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->startActivity(Landroid/content/Intent;)V

    .line 460
    goto :goto_1

    .line 462
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->s:Z

    .line 463
    const/4 v4, 0x3

    .line 464
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 465
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 468
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v4

    .line 470
    :goto_0
    const/4 v0, 0x2

    if-ne v0, v4, :cond_3

    .line 471
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b()V

    .line 474
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g()V

    .line 475
    return-void
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e(I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->B:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 503
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 505
    return-void

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 508
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 510
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d:Lo/egn;

    .line 512
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b()V

    return-void
.end method

.method private k()V
    .locals 5

    .line 371
    new-instance v2, Lo/edb;

    invoke-direct {v2}, Lo/edb;-><init>()V

    .line 372
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_profile_SPN:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/edb;->a(Ljava/lang/String;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    invoke-virtual {v0}, Lo/dal;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/edb;->c(Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    invoke-virtual {v0}, Lo/dal;->a()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/edb;->b([B)V

    .line 377
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/edb;->c(I)V

    .line 378
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    new-instance v3, Lo/edb;

    invoke-direct {v3}, Lo/edb;-><init>()V

    .line 380
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_profile_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/edb;->a(Ljava/lang/String;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 382
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    invoke-virtual {v0}, Lo/dal;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/edb;->c(Ljava/lang/String;)V

    .line 384
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/edb;->c(I)V

    .line 385
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    new-instance v4, Lo/edb;

    invoke-direct {v4}, Lo/edb;-><init>()V

    .line 387
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_profile_ICCID:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edb;->a(Ljava/lang/String;)V

    .line 388
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 389
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    invoke-virtual {v0}, Lo/dal;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edb;->c(Ljava/lang/String;)V

    .line 391
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/edb;->c(I)V

    .line 392
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 394
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    invoke-virtual {v0}, Lo/dal;->c()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->x:[B

    .line 396
    :cond_3
    return-void
.end method

.method static synthetic k(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 83
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    sget v0, Lcom/huawei/sim/R$layout;->activity_esim_profile:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->setContentView(I)V

    .line 85
    iput-object p0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->z:Landroid/content/Context;

    .line 86
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 87
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 88
    const-string v0, "eSim_profile"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 89
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 90
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lo/dal;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dal;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c:Lo/dal;

    .line 92
    :cond_0
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e:Ljava/lang/Boolean;

    .line 95
    :cond_1
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    .line 97
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 98
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void

    .line 101
    :cond_2
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->k()V

    .line 102
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a()V

    .line 103
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 105
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 191
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->g()V

    .line 192
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 193
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 196
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 516
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConformActivity onKeyDown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 519
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->w:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 522
    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 523
    invoke-virtual {p0, v5}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->startActivity(Landroid/content/Intent;)V

    .line 524
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->finish()V

    .line 526
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 4

    .line 109
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 110
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->m:I

    .line 113
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->y:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->m:I

    .line 118
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->m:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 119
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBTStatus is DEVICE_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b()V

    goto :goto_0

    .line 122
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->m:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 123
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->d()V

    goto :goto_0

    .line 126
    :cond_2
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->e()V

    .line 128
    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 531
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 532
    return-void
.end method
