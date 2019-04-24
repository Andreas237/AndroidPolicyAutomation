.class public Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Landroid/content/Context;

.field private u:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/content/Context;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->k:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 85
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 86
    if-eqz v2, :cond_0

    .line 89
    const-string v0, "totalList"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    .line 91
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->s:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_0
    goto :goto_0

    .line 94
    :catch_0
    move-exception v2

    .line 96
    sget-object v0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->f:Ljava/lang/String;

    const-string v1, "getIntentData Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/view/View;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;I)I
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->s:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Lo/bns;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->n()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/view/View;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 102
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 103
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 107
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 133
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lo/bns;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    invoke-virtual {v0, v1}, Lo/bns;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->s:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bns;->setCurrentItem(IZ)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V

    invoke-virtual {v0, v1}, Lo/bns;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 157
    return-void
.end method

.method private k()V
    .locals 2

    .line 114
    sget v0, Lcom/huawei/android/sns/R$id;->photo_contentView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->a:Landroid/widget/RelativeLayout;

    .line 115
    sget v0, Lcom/huawei/android/sns/R$id;->view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bns;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->l:Lo/bns;

    .line 116
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->g:Landroid/widget/RelativeLayout;

    .line 117
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_click_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->u:Landroid/widget/LinearLayout;

    .line 118
    sget v0, Lcom/huawei/android/sns/R$id;->navi_dark:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    .line 119
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->n:Landroid/view/View;

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;-><init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->f()V

    .line 126
    return-void
.end method

.method private n()V
    .locals 3

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 216
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h:Ljava/util/ArrayList;

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 220
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    iget v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->s:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->a(Ljava/util/ArrayList;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->notifyDataSetChanged()V

    .line 225
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 227
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o()V

    .line 229
    :cond_3
    return-void
.end method

.method private o()V
    .locals 3

    .line 236
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 237
    const-string v0, "totalList"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 238
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->setResult(ILandroid/content/Intent;)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->finish()V

    .line 240
    return-void
.end method


# virtual methods
.method public f()V
    .locals 5

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 164
    sget-object v0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->f:Ljava/lang/String;

    const-string v1, "updateBottomLayout : got bottomLayout null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    return-void

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 170
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 174
    invoke-static {p0}, Lo/boi;->e(Landroid/app/Activity;)I

    move-result v0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 175
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_60_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$3;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 192
    :cond_1
    const/4 v0, 0x0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 197
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 199
    const/4 v0, 0x0

    iput v0, v3, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 200
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->m:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->u:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 207
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 256
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o()V

    .line 257
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onBackPressed()V

    .line 258
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 67
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    iput-object p0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->k:Landroid/content/Context;

    .line 70
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->e()V

    .line 71
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_complain_photo_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->setContentView(I)V

    .line 72
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->a()V

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->g()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->k()V

    .line 75
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h()V

    .line 76
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 245
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 247
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->o()V

    .line 248
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
