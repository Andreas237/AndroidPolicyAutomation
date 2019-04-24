.class public Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lo/emu;

.field private d:Lo/emr;

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/ImageView;

.field private m:[I

.field private n:[I

.field private o:Landroid/widget/TextView;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private r:Lo/emu;

.field private s:Landroid/widget/LinearLayout;

.field private t:Lo/emu;

.field private u:Lo/emu;

.field private v:Lo/emu;

.field private x:Landroid/widget/RelativeLayout;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    .line 50
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k:Landroid/widget/RelativeLayout;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->i:Landroid/widget/TextView;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->l:Landroid/widget/ImageView;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->z:I

    return-void
.end method

.method private a(I)I
    .locals 1

    .line 403
    if-nez p1, :cond_0

    .line 404
    const/4 v0, 0x2

    return v0

    .line 406
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;I)I
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(I)I

    move-result v0

    return v0
.end method

.method private a()V
    .locals 2

    .line 153
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    goto :goto_0

    .line 156
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    .line 159
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 160
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Z)V

    .line 161
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;II)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Ljava/lang/String;Z)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Ljava/lang/String;Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 278
    if-eqz p1, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->common_color_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 286
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c:Lo/emu;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 124
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c:Lo/emu;

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 150
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->s:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private c()V
    .locals 0

    .line 110
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b()V

    .line 111
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e()V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g()V

    .line 113
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    return p1
.end method

.method private d()V
    .locals 0

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a()V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h()V

    .line 118
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->i()V

    .line 119
    return-void
.end method

.method private d(II)V
    .locals 5

    .line 361
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/ets;->c(Landroid/content/Context;I)V

    .line 363
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 364
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    array-length v0, v0

    if-le v0, p2, :cond_0

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    array-length v0, v0

    if-ge p2, v0, :cond_1

    if-gez p2, :cond_2

    .line 369
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-static {v0, v1}, Lo/ets;->g(Landroid/content/Context;I)V

    goto :goto_0

    .line 371
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    aget v1, v1, p2

    invoke-static {v0, v1}, Lo/ets;->g(Landroid/content/Context;I)V

    .line 375
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 378
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    array-length v0, v0

    if-le v0, p2, :cond_5

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    array-length v0, v0

    if-ge p2, v0, :cond_6

    if-gez p2, :cond_7

    .line 383
    :cond_6
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-static {v0, v1}, Lo/ets;->h(Landroid/content/Context;I)V

    goto :goto_1

    .line 385
    :cond_7
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    aget v1, v1, p2

    invoke-static {v0, v1}, Lo/ets;->h(Landroid/content/Context;I)V

    .line 390
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    :goto_2
    goto :goto_3

    .line 395
    :catch_0
    move-exception v4

    .line 396
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateVoiceInterval IndexOutOfBoundsException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    :goto_3
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    return p1
.end method

.method private e(I)I
    .locals 3

    .line 411
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 412
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->k(Landroid/content/Context;)I

    move-result v1

    .line 413
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    aget v0, v0, v2

    if-ne v1, v0, :cond_0

    .line 415
    return v2

    .line 413
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 418
    :cond_1
    goto :goto_2

    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 419
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->g(Landroid/content/Context;)I

    move-result v1

    .line 420
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    array-length v0, v0

    if-ge v2, v0, :cond_4

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    aget v0, v0, v2

    if-ne v1, v0, :cond_3

    .line 422
    return v2

    .line 420
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 426
    :cond_4
    :goto_2
    const/4 v0, 0x1

    return v0
.end method

.method private e()V
    .locals 4

    .line 164
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_interval_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k:Landroid/widget/RelativeLayout;

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    sget v0, Lcom/huawei/ui/homehealth/R$id;->txt_track_voice_interval:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->i:Landroid/widget/TextView;

    .line 167
    sget v0, Lcom/huawei/ui/homehealth/R$id;->txt_track_voice_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->o:Landroid/widget/TextView;

    .line 168
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_voice_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->l:Landroid/widget/ImageView;

    .line 169
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 175
    :goto_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 177
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_interval_setting_image_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 178
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 179
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_switch_button_setting_image_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 180
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 185
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a(Z)V

    return-void
.end method

.method private e(Ljava/lang/String;Z)V
    .locals 4

    .line 449
    if-eqz p2, :cond_0

    .line 450
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 452
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 455
    :goto_0
    new-instance v2, Lo/dcy;

    invoke-direct {v2}, Lo/dcy;-><init>()V

    .line 456
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 458
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3, p1, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 460
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    return v0
.end method

.method private e(Ljava/lang/String;)Z
    .locals 4

    .line 430
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 431
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 430
    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 432
    if-eqz v2, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 433
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 437
    :cond_1
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 438
    const/4 v0, 0x1

    return v0

    .line 442
    :cond_2
    goto :goto_0

    .line 440
    :catch_0
    move-exception v3

    .line 441
    const/4 v0, 0x1

    return v0

    .line 443
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->t:Lo/emu;

    return-object v0
.end method

.method private f()V
    .locals 10

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_voice_interval_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_voice_interval_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 342
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 344
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v4, 0x2

    aget v3, v3, v4

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    const/4 v4, 0x3

    aget v3, v3, v4

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    int-to-double v3, v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v3, v5

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    int-to-double v3, v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v3, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v4, 0x2

    aget v3, v3, v4

    int-to-double v3, v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v3, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    const/4 v4, 0x3

    aget v3, v3, v4

    int-to-double v3, v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v3, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    goto :goto_0

    .line 353
    :catch_0
    move-exception v9

    .line 354
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IndexOutOfBoundsException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->u:Lo/emu;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 204
    sget v0, Lcom/huawei/ui/homehealth/R$id;->track_voice_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->s:Landroid/widget/LinearLayout;

    .line 205
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->r:Lo/emu;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->r:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$2;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 217
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->u:Lo/emu;

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->u:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$5;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 228
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting_pace:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->t:Lo/emu;

    .line 229
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting_pace_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->x:Landroid/widget/RelativeLayout;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->t:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$1;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 240
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_voice_setting_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->v:Lo/emu;

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->v:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$9;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 250
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->r:Lo/emu;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 188
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    .line 189
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    .line 190
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f()V

    .line 191
    const/4 v2, 0x1

    .line 192
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->b(Landroid/content/Context;)I

    move-result v3

    .line 193
    if-nez v3, :cond_0

    .line 194
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ets;->c(Landroid/content/Context;I)V

    .line 195
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Lo/ets;->h(Landroid/content/Context;I)V

    .line 196
    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d(II)V

    goto :goto_0

    .line 198
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->b(Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0, v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d(II)V

    .line 200
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x1f4
        0x3e8
        0x7d0
        0xbb8
    .end array-data

    :array_1
    .array-data 4
        0x5
        0xa
        0xf
        0x14
    .end array-data
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    return p1
.end method

.method private i()V
    .locals 4

    .line 253
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->a:Z

    if-nez v0, :cond_1

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 257
    :cond_1
    const-string v0, "voice_distance"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    .line 258
    const-string v0, "voice_speed_time"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    .line 259
    const-string v0, "voice_pace"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    .line 260
    const-string v0, "voice_heart_rate"

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->r:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->u:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->t:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->v:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 266
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initVoiceContentData , mVoiceDistanceEnable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , mVoiceDurationEnable is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    .line 267
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , mVoicePaceEnable is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " , mVoiceHeartRateEnable is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    .line 268
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 266
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->f:Z

    return v0
.end method

.method private k()V
    .locals 7

    .line 290
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->b(Landroid/content/Context;)I

    move-result v2

    .line 291
    const/4 v3, 0x0

    .line 292
    const/4 v4, 0x1

    .line 294
    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 295
    const/4 v3, 0x1

    .line 296
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->g(Landroid/content/Context;)I

    move-result v5

    .line 297
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    array-length v0, v0

    if-ge v6, v0, :cond_1

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->n:[I

    aget v0, v0, v6

    if-ne v5, v0, :cond_0

    .line 299
    move v4, v6

    .line 300
    goto :goto_1

    .line 297
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 303
    :cond_1
    :goto_1
    goto :goto_3

    :cond_2
    const/4 v0, 0x2

    if-ne v2, v0, :cond_4

    .line 304
    const/4 v3, 0x0

    .line 305
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->k(Landroid/content/Context;)I

    move-result v5

    .line 306
    const/4 v6, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    array-length v0, v0

    if-ge v6, v0, :cond_4

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->m:[I

    aget v0, v0, v6

    if-ne v5, v0, :cond_3

    .line 308
    move v4, v6

    .line 309
    goto :goto_3

    .line 306
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 314
    :cond_4
    :goto_3
    new-instance v0, Lo/epn$a;

    invoke-direct {v0, p0}, Lo/epn$a;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$8;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    .line 315
    invoke-virtual {v0, v1}, Lo/epn$a;->b(Lo/epn$d;)Lo/epn$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$6;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    .line 323
    invoke-virtual {v0, v1}, Lo/epn$a;->e(Lo/epn$d;)Lo/epn$a;

    move-result-object v5

    .line 330
    invoke-virtual {v5}, Lo/epn$a;->b()Lo/epn;

    move-result-object v6

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->q:Ljava/util/Map;

    invoke-virtual {v6, v0, v1}, Lo/epn;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 332
    invoke-virtual {v6, v3, v4}, Lo/epn;->c(II)V

    .line 333
    invoke-virtual {v6}, Lo/epn;->show()V

    .line 334
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->h:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->v:Lo/emu;

    return-object v0
.end method

.method private n()Z
    .locals 2

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->z:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->g:Z

    return v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 466
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 467
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_interval_setting:I

    if-ne v0, v1, :cond_0

    .line 487
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->k()V

    .line 488
    const-string v0, "type"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->hM:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 514
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 83
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->track_sport_voice_settings_frag:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->setContentView(I)V

    .line 86
    iput-object p0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->e:Landroid/content/Context;

    .line 87
    sget v0, Lcom/huawei/ui/homehealth/R$id;->titlebar_track_sport_voice_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d:Lo/emr;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 96
    if-eqz v4, :cond_0

    .line 97
    const-string v0, "currentFrag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->z:I

    .line 99
    :cond_0
    const-string v0, "Track_SportAssistVoiceSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurTab is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->c()V

    .line 105
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;->d()V

    .line 107
    return-void
.end method
