.class public Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/EditText;

.field private e:Landroid/widget/EditText;

.field private f:Lo/egd;

.field private g:Lo/egd;

.field private h:Lo/egd;

.field private i:Landroid/widget/TextView;

.field private k:Lo/egd;

.field private l:Lo/egd;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/egd;>;"
        }
    .end annotation
.end field

.field private n:Ljava/lang/String;

.field private o:Lo/egd;

.field private p:Lo/egd;

.field private q:Ljava/lang/Long;

.field private r:Lcom/huawei/health/sns/model/group/Group;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/app/Activity;

.field private u:Lo/aoh;

.field private y:Landroid/os/Handler;

.field private z:Lo/egn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    return-void
.end method

.method private a()V
    .locals 3

    .line 275
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d:Landroid/widget/EditText;

    .line 304
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 275
    invoke-virtual {v0, v1, v2}, Lo/ant;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V

    .line 305
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    .line 590
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 591
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egd;

    .line 592
    if-ne v2, p1, :cond_0

    .line 593
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_create_type_choose:I

    invoke-virtual {v2, v0}, Lo/egd;->setBackgroundResource(I)V

    goto :goto_1

    .line 595
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_create_type:I

    invoke-virtual {v2, v0}, Lo/egd;->setBackgroundResource(I)V

    .line 597
    :goto_1
    goto :goto_0

    .line 599
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l()Z

    .line 600
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Z
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l()Z

    move-result v0

    return v0
.end method

.method private b(Landroid/content/Context;)I
    .locals 5

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 107
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/app/Activity;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->h:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 269
    return-void
.end method

.method private b(I)V
    .locals 6

    .line 351
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 352
    const-string v5, ""

    .line 353
    const/16 v0, 0x70

    if-ne p1, v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create_group_not_success:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 355
    :cond_0
    const/16 v0, 0x72

    if-ne p1, v0, :cond_1

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create_failed_1029:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 358
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_no_bind_phone_number:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 360
    :goto_0
    invoke-virtual {v4, v5}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_user_permission_know:I

    .line 361
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 372
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 373
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 374
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 375
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Lcom/huawei/health/sns/model/group/Group;)Lcom/huawei/health/sns/model/group/Group;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->q:Ljava/lang/Long;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 123
    sget v0, Lcom/huawei/android/sns/R$id;->edit_text_groupname:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d:Landroid/widget/EditText;

    .line 124
    sget v0, Lcom/huawei/android/sns/R$id;->tv_character_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/huawei/android/sns/R$id;->btn_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_startup_next:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 131
    sget v0, Lcom/huawei/android/sns/R$id;->iv_next_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->s:Landroid/widget/ImageView;

    .line 132
    sget v0, Lcom/huawei/android/sns/R$id;->group_name_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b:Landroid/widget/RelativeLayout;

    .line 133
    sget v0, Lcom/huawei/android/sns/R$id;->group_intro_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a:Landroid/widget/RelativeLayout;

    .line 135
    sget v0, Lcom/huawei/android/sns/R$id;->edit_text_group_intro:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e:Landroid/widget/EditText;

    .line 136
    sget v0, Lcom/huawei/android/sns/R$id;->group_intro_num_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i:Landroid/widget/TextView;

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    const/high16 v1, 0x427e0000    # 63.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g:Lo/egd;

    .line 147
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f:Lo/egd;

    .line 148
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_bike:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k:Lo/egd;

    .line 149
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_workout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->h:Lo/egd;

    .line 150
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_swim:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    .line 151
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_other:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    .line 153
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->h:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    const-string v0, "healthwalk"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g:Lo/egd;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    .line 165
    invoke-direct {p0, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b(Landroid/content/Context;)I

    move-result v2

    .line 166
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/emr;

    .line 167
    invoke-virtual {v3}, Lo/emr;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 168
    neg-int v5, v2

    .line 169
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 170
    invoke-virtual {v3, v4}, Lo/emr;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    const/4 v0, 0x0

    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 176
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 177
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_workout:I

    const/16 v1, 0x11

    invoke-virtual {v6, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    invoke-virtual {v0, v6}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 180
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    const/4 v0, 0x0

    iput v0, v7, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 183
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_type_swim:I

    const/16 v1, 0x11

    invoke-virtual {v7, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    invoke-virtual {v0, v7}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 382
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 383
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_no_bind_phone_number:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 386
    :cond_0
    invoke-virtual {v4, p1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_user_permission_know:I

    .line 387
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 393
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 394
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 395
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 396
    return-void
.end method

.method private f()V
    .locals 4

    .line 339
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 342
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    .line 347
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->y:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 319
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 333
    :cond_1
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g()V

    .line 488
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a()V

    goto :goto_0

    .line 492
    :cond_0
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 493
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 495
    :cond_1
    :goto_0
    return-void
.end method

.method private i()V
    .locals 6

    .line 403
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_bind_phone_tips:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_no_bind_phone_number:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 406
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_bind_phone_button:I

    .line 407
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$8;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 417
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 424
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 425
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egv;->setCancelable(Z)V

    .line 426
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 427
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 308
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forwardGroupIconSetActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 311
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 312
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 313
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k()V

    return-void
.end method

.method private l()Z
    .locals 5

    .line 567
    const/4 v2, 0x1

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 570
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 571
    const/4 v2, 0x0

    goto :goto_0

    .line 572
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    const/4 v2, 0x0

    goto :goto_0

    .line 574
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 575
    const/4 v2, 0x0

    .line 577
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->s:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_1

    .line 583
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->s:Landroid/widget/ImageView;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 586
    :goto_1
    return v2
.end method

.method private m()V
    .locals 4

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupDesc(Ljava/lang/String;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupType(Ljava/lang/String;)V

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    invoke-static {v0, v3, v1, v2}, Lo/anz;->c(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V

    .line 547
    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Ljava/lang/Long;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->q:Ljava/lang/Long;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 554
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->r:Lcom/huawei/health/sns/model/group/Group;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/ant;->a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 561
    :cond_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p()V

    return-void
.end method


# virtual methods
.method protected c()V
    .locals 4

    .line 452
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "quitWorkerThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aoh;->a(Landroid/os/Handler;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    invoke-virtual {v0}, Lo/aoh;->quit()Z

    .line 455
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    .line 456
    return-void
.end method

.method protected e()V
    .locals 4

    .line 441
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWorkerThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;

    invoke-direct {v0, p0, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->y:Landroid/os/Handler;

    .line 443
    new-instance v0, Lo/aoh;

    const-string v1, "Group Handler Thread"

    invoke-direct {v0, v1}, Lo/aoh;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->y:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/aoh;->a(Landroid/os/Handler;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->u:Lo/aoh;

    invoke-virtual {v0}, Lo/aoh;->start()V

    .line 446
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 460
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o:Lo/egd;

    if-ne p1, v0, :cond_0

    .line 461
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->h()V

    goto/16 :goto_0

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 463
    const-string v0, "healthwalk"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 464
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 465
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->f:Lo/egd;

    if-ne p1, v0, :cond_2

    .line 466
    const-string v0, "run"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 467
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 468
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->k:Lo/egd;

    if-ne p1, v0, :cond_3

    .line 469
    const-string v0, "riding"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 470
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 471
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->h:Lo/egd;

    if-ne p1, v0, :cond_4

    .line 472
    const-string v0, "bodybuilding"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 473
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 474
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l:Lo/egd;

    if-ne p1, v0, :cond_5

    .line 475
    const-string v0, "swimming"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 476
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    goto :goto_0

    .line 477
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p:Lo/egd;

    if-ne p1, v0, :cond_6

    .line 478
    const-string v0, "other"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n:Ljava/lang/String;

    .line 479
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->a(Landroid/view/View;)V

    .line 481
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 115
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_create_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->setContentView(I)V

    .line 116
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->t:Landroid/app/Activity;

    .line 117
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d()V

    .line 118
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b()V

    .line 119
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->e()V

    .line 120
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 431
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 433
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c()V

    .line 434
    return-void
.end method
