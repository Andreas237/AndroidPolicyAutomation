.class public Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/ely;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:Landroid/view/View;

.field private d:Lo/eur;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/LinearLayout;

.field private g:Lo/elz;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/euo;>;"
        }
    .end annotation
.end field

.field private m:Lo/eup;

.field private n:Lo/euo;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/euo;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/euo;>;"
        }
    .end annotation
.end field

.field private q:Landroid/os/HandlerThread;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private s:Lorg/json/JSONArray;

.field private t:Landroid/os/Handler;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eup;>;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/String;

.field private w:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;

.field private z:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 91
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->o:Ljava/util/List;

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->u:Ljava/util/List;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->r:Ljava/util/List;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->s:Lorg/json/JSONArray;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->q:Landroid/os/HandlerThread;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->t:Landroid/os/Handler;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->v:Ljava/lang/String;

    .line 249
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;-><init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->z:Landroid/os/Handler;

    .line 93
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConfiguredPageFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->v:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lorg/json/JSONArray;)Lorg/json/JSONArray;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->s:Lorg/json/JSONArray;

    return-object p1
.end method

.method private a()V
    .locals 9

    .line 137
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPageModule"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_CONFIGURE_MODULES_SAVE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_CONFIGURE_ACTIVITIES_SAVE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 143
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 144
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 146
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 147
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 148
    invoke-static {v8}, Lo/eur;->a(Lorg/json/JSONObject;)Lo/euo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n:Lo/euo;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n:Lo/euo;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n:Lo/euo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 157
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 158
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 159
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 160
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 161
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 162
    invoke-static {v8}, Lo/eur;->b(Lorg/json/JSONObject;)Lo/eup;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m:Lo/eup;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m:Lo/eup;

    if-eqz v0, :cond_2

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m:Lo/eup;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 171
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->u:Ljava/util/List;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->z:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_2

    .line 175
    :catch_0
    move-exception v6

    .line 176
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :goto_2
    iget v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d(I)V

    .line 181
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lo/euo;)Lo/euo;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n:Lo/euo;

    return-object p1
.end method

.method private b()V
    .locals 3

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_getting_file:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    return-void
.end method

.method private c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/euo;>;Ljava/util/List<Lo/eup;>;)Ljava/util/List<Lo/euo;>;"
        }
    .end annotation

    .line 367
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 368
    :cond_0
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "combinedModuleActivity mActivityItemListTemp is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    return-object p1

    .line 372
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/euo;

    .line 374
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lo/euo;->d()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 375
    invoke-virtual {v5}, Lo/euo;->k()Ljava/util/List;

    move-result-object v6

    .line 376
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_2

    .line 377
    return-object p1

    .line 379
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eus;

    .line 380
    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lo/eus;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 381
    invoke-virtual {v8}, Lo/eus;->h()Ljava/lang/String;

    move-result-object v9

    .line 382
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/eup;

    .line 383
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Lo/eup;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 384
    invoke-virtual {v11}, Lo/eup;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/eus;->f(Ljava/lang/String;)V

    .line 385
    invoke-virtual {v11}, Lo/eup;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/eus;->g(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v11}, Lo/eup;->a()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/eus;->h(I)V

    .line 388
    :cond_3
    goto :goto_2

    .line 390
    :cond_4
    goto :goto_1

    .line 392
    :cond_5
    goto/16 :goto_0

    .line 393
    :cond_6
    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/euo;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->n:Lo/euo;

    return-object v0
.end method

.method private c()V
    .locals 9

    .line 398
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealPageModules"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 402
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 403
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealPageModules mPageModuleList is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f()V

    .line 406
    :cond_1
    return-void

    .line 409
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h()V

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 420
    :cond_3
    const/4 v4, 0x0

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/euo;

    .line 422
    new-instance v7, Lo/euq;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/euq;-><init>(Landroid/content/Context;)V

    .line 423
    invoke-virtual {v7, v6}, Lo/euq;->e(Lo/euo;)V

    .line 425
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 426
    const/4 v0, 0x1

    iput v0, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 427
    invoke-virtual {v7}, Lo/euq;->e()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v7, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 430
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 431
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ineffective list, pageModuleId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/euo;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :goto_1
    goto :goto_0

    .line 434
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v4, v0, :cond_7

    .line 435
    :cond_6
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConfigureRootLyt clear!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 439
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f()V

    .line 443
    :cond_7
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lorg/json/JSONArray;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->s:Lorg/json/JSONArray;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 475
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->configure_root_lyt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->configure_net_work_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f:Landroid/widget/LinearLayout;

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->configure_page__load_more:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k:Landroid/widget/TextView;

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->configure_page_loading_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->i:Landroid/widget/ImageView;

    .line 481
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b()V

    .line 482
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 186
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConfigureModulesFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d:Lo/eur;

    new-instance v1, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$5;-><init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    invoke-virtual {v0, p1, v1}, Lo/eur;->d(ILcom/huawei/operation/https/HttpResCallBack;)V

    .line 236
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;Lo/eup;)Lo/eup;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m:Lo/eup;

    return-object p1
.end method

.method private e()V
    .locals 8

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 273
    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->o:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/euo;

    .line 281
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lo/euo;->d()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 282
    invoke-virtual {v4}, Lo/euo;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eus;

    .line 283
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lo/eus;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 285
    invoke-virtual {v6}, Lo/eus;->h()Ljava/lang/String;

    move-result-object v7

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->r:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->r:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    :cond_1
    goto :goto_1

    .line 292
    :cond_2
    goto :goto_0

    .line 295
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->z:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 298
    return-void

    .line 301
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d:Lo/eur;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->r:Ljava/util/List;

    new-instance v2, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$4;-><init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/eur;->b(Ljava/util/List;Lokhttp3/Callback;)V

    .line 363
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    return v0
.end method

.method private f()V
    .locals 3

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->CS_network_connect_error:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k()V

    return-void
.end method

.method private h()V
    .locals 2

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 519
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->w:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 500
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/eup;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->m:Lo/eup;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->u:Ljava/util/List;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lo/eur;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d:Lo/eur;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->z:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public e(Lo/elz;IIII)V
    .locals 0

    .line 455
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 465
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 466
    const-string v0, "TimeEat_configuredPageEnter onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 467
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d()V

    .line 468
    const-string v0, "TimeEat_configuredPageLeave onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 469
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 524
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 99
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 105
    const-string v0, "TimeEat_configuredPageEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 107
    const-string v0, "PAGE_TYPE"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    .line 108
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPageType: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eur;->a(Landroid/content/Context;)Lo/eur;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->d:Lo/eur;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_configure_page:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_configure_sroll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elz;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->g:Lo/elz;

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->g:Lo/elz;

    invoke-virtual {v0, p0}, Lo/elz;->setScrollViewListener(Lo/ely;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->configure_message_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->e:Landroid/widget/LinearLayout;

    .line 117
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Opera_configuredPage"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->q:Landroid/os/HandlerThread;

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->q:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 119
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->q:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->t:Landroid/os/Handler;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->t:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$1;-><init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 131
    const-string v0, "TimeEat_configuredPageLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->c:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 0

    .line 530
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 531
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 459
    const-string v0, "Opera_configuredPage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConfiguredPageFragment onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 461
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 447
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 448
    const-string v0, "TimeEat_configuredPageEnter onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 449
    const-string v0, "TimeEat_configuredPageLeave onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 450
    return-void
.end method
