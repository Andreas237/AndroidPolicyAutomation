.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;
.super Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$a;
    }
.end annotation


# static fields
.field private static final Q:[Ljava/lang/String;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private E:I

.field private F:Landroid/graphics/Bitmap;

.field private G:I

.field private H:Landroid/widget/ImageView;

.field private I:I

.field private J:Lo/fdb;

.field private K:Lo/fdh;

.field private L:Lo/emr;

.field private M:Landroid/widget/Toast;

.field private N:Lo/fdl;

.field private O:Landroid/widget/RelativeLayout;

.field private P:Z

.field private R:Landroid/widget/ImageView;

.field private S:Landroid/app/Dialog;

.field private T:Landroid/widget/RelativeLayout;

.field private V:Landroid/widget/RelativeLayout;

.field private X:Landroid/widget/ImageView;

.field a:Lo/fgj$a;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field d:Landroid/os/Handler;

.field private e:Lo/acu;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:F

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Lo/egd;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field private w:Z

.field private x:Lo/eha;

.field private y:Z

.field private z:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 139
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->Q:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;-><init>()V

    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    .line 122
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->w:Z

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->A:Z

    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->B:Z

    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->C:Z

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    .line 181
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$12;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$12;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d:Landroid/os/Handler;

    .line 413
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->S:Landroid/app/Dialog;

    .line 603
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$23;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$23;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a:Lo/fgj$a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/fdb;)Lo/fdb;
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/fdh;)Lo/fdh;
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->K:Lo/fdh;

    return-object p1
.end method

.method private a()V
    .locals 4

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->A:Z

    invoke-virtual {v0, v1, v2, v3}, Lo/fdb;->c(Lo/acu;Landroid/widget/TextView;Z)V

    .line 303
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->f()V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    if-eqz v0, :cond_2

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 313
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->h()V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->H:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 316
    :cond_2
    const/16 v0, 0x7c8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    .line 317
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    .line 318
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    .line 319
    const/16 v0, 0xa0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    .line 320
    const v0, 0x42613333    # 56.3f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 322
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p()V

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    new-instance v1, Lo/acu;

    invoke-direct {v1}, Lo/acu;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->H:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 325
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->i()V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 328
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r()V

    .line 329
    return-void

    .line 331
    :cond_3
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 763
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 764
    const-string v0, "userCount"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->dm:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 766
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;I)V
    .locals 0

    .line 102
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Z)Z
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->P:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;FFI)F
    .locals 1

    .line 102
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;I)I
    .locals 0

    .line 102
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/Toast;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)Lo/acu;
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/fdl;)Lo/fdl;
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    return-object p1
.end method

.method private b()V
    .locals 3

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->L:Lo/emr;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->L:Lo/emr;

    invoke-virtual {v0, v1, v2}, Lo/fdb;->a(Ljava/lang/String;Lo/emr;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->L:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$19;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$19;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->L:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$20;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$20;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    sget v0, Lcom/huawei/ui/main/R$id;->weight_edit_user_photo:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->H:Landroid/widget/ImageView;

    .line 231
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_gender_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->f:Landroid/widget/RelativeLayout;

    .line 232
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_height_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->k:Landroid/widget/RelativeLayout;

    .line 233
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_birthday_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->h:Landroid/widget/RelativeLayout;

    .line 234
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_weight_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->g:Landroid/widget/RelativeLayout;

    .line 235
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_nickname_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->i:Landroid/widget/RelativeLayout;

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    .line 237
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    .line 238
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_birthday:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    .line 239
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_nickname:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    .line 240
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l:Landroid/widget/TextView;

    .line 241
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_gender_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u:Landroid/widget/ImageView;

    .line 242
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_height_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->s:Landroid/widget/ImageView;

    .line 243
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_birthday_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->q:Landroid/widget/ImageView;

    .line 244
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_nickname_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->t:Landroid/widget/ImageView;

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_user_photo_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->v:Landroid/widget/ImageView;

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_weight_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->z:Landroid/widget/ImageView;

    .line 247
    sget v0, Lcom/huawei/ui/main/R$id;->btn_edit_user_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r:Lo/egd;

    .line 248
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_user_photo_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->O:Landroid/widget/RelativeLayout;

    .line 249
    invoke-static {p0}, Lo/fej;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_weight_delete_user:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 255
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c()V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r:Lo/egd;

    invoke-virtual {v0, v1, v2}, Lo/fdb;->c(Lo/acu;Landroid/view/View;)V

    .line 260
    return-void
.end method

.method private b(Lo/acu;)V
    .locals 12

    .line 1008
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightAgeLimitDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_wifiweight_age_limit:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1010
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1011
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_wifiweight_age_tips:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x41

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1012
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_wifiweight_age_details:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x41

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1013
    sget v0, Lcom/huawei/ui/main/R$id;->wifiweight_age_one_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 1014
    sget v0, Lcom/huawei/ui/main/R$id;->wifiweight_age_two_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 1015
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1016
    invoke-virtual {v10, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1017
    invoke-virtual {v6, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_ui_dialog_no:I

    .line 1019
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)V

    .line 1018
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_ui_dialog_yes:I

    .line 1036
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$8;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$8;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)V

    .line 1035
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1053
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v11

    .line 1054
    invoke-virtual {v11}, Lo/egw;->show()V

    .line 1055
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Z)Z
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->C:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 2

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->s:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->s:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 278
    :goto_0
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 581
    add-int/lit8 v0, p1, 0x32

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 584
    add-int/lit8 v0, p1, 0x32

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    .line 585
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d()V

    return-void
.end method

.method private c(Lo/fgi;)V
    .locals 3

    .line 543
    invoke-virtual {p1}, Lo/fgi;->getSelectedYear()I

    move-result v0

    invoke-virtual {p1}, Lo/fgi;->getSelectedMonth()I

    move-result v1

    invoke-virtual {p1}, Lo/fgi;->getSelectedDay()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/fdr;->b(III)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_no_choose_birthday_after_now:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 545
    return-void

    .line 547
    :cond_0
    invoke-virtual {p1}, Lo/fgi;->getSelectedYear()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    .line 548
    invoke-virtual {p1}, Lo/fgi;->getSelectedMonth()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    .line 549
    invoke-virtual {p1}, Lo/fgi;->getSelectedDay()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    .line 550
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p()V

    .line 551
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Z)Z
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    return p1
.end method

.method private d(FFI)F
    .locals 4

    .line 1391
    new-instance v2, Ljava/math/BigDecimal;

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 1392
    new-instance v3, Ljava/math/BigDecimal;

    invoke-static {p2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 1393
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 1395
    :pswitch_0
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0

    .line 1397
    :pswitch_1
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0

    .line 1399
    :pswitch_2
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0

    .line 1401
    :pswitch_3
    const/16 v0, 0xa

    const/4 v1, 0x4

    invoke-virtual {v2, v3, v0, v1}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    return v0

    .line 1403
    :goto_0
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d()V
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->O:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 296
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b()V

    return-void
.end method

.method private d(Lo/acu;)V
    .locals 6

    .line 1153
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showEditNickNameDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    sget v0, Lcom/huawei/ui/main/R$layout;->health_healthdata_userinfo_edit_nickname_dialog:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1155
    sget v0, Lcom/huawei/ui/main/R$id;->userinfo_edit_nickname:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x:Lo/eha;

    .line 1156
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x:Lo/eha;

    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x:Lo/eha;

    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eha;->setSelection(I)V

    .line 1161
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x:Lo/eha;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$11;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1}, Lo/eha;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 1172
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_activity_personal_information_name:I

    .line 1173
    invoke-virtual {v0, v1}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 1174
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$13;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 1175
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$14;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 1181
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 1189
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v5

    .line 1190
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egw;->setCanceledOnTouchOutside(Z)V

    .line 1191
    invoke-virtual {v5}, Lo/egw;->show()V

    .line 1193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1200
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;F)F
    .locals 0

    .line 102
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;I)V
    .locals 0

    .line 102
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)V
    .locals 0

    .line 102
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Lo/acu;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/fgi;)V
    .locals 0

    .line 102
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->c(Lo/fgi;)V

    return-void
.end method

.method private e(Lo/acu;)V
    .locals 2

    .line 748
    sget-object v0, Lo/act;->a:Lo/act;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/acu;)V

    invoke-virtual {v0, p1, v1}, Lo/act;->e(Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 760
    return-void
.end method

.method private e(Landroid/view/View;)Z
    .locals 4

    .line 445
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeGenderDialogLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 448
    const/4 v0, 0x0

    return v0

    .line 451
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->R:Landroid/widget/ImageView;

    .line 452
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->X:Landroid/widget/ImageView;

    .line 453
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->T:Landroid/widget/RelativeLayout;

    .line 454
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->V:Landroid/widget/RelativeLayout;

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->T:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->V:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 457
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    if-eqz v0, :cond_1

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->R:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 461
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->R:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 464
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Z)Z
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->w:Z

    return p1
.end method

.method private f()V
    .locals 3

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    if-nez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v2

    .line 363
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    if-nez v0, :cond_1

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 366
    :cond_1
    if-nez v2, :cond_2

    .line 367
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_female:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 370
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_male:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 374
    :goto_1
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->s()V

    return-void
.end method

.method private g()V
    .locals 7

    .line 416
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->w:Z

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 420
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_gender_view:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 421
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 422
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 423
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$24;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$24;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 424
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 430
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->S:Landroid/app/Dialog;

    .line 431
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 433
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->S:Landroid/app/Dialog;

    .line 435
    return-void

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->S:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 439
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Z
    .locals 1

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->R:Landroid/widget/ImageView;

    return-object v0
.end method

.method private h()V
    .locals 9

    .line 334
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt2BirthdayDate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->g()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 337
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 338
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    .line 339
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    .line 340
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    .line 341
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 342
    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x6

    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 343
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x6

    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 344
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 345
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-virtual {v6, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 346
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 347
    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 349
    goto :goto_0

    .line 350
    :cond_0
    const/16 v0, 0x7c8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    .line 351
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    .line 352
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    .line 353
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p()V

    .line 355
    :goto_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 381
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v4, v0, v1

    .line 382
    const/4 v0, 0x3

    invoke-direct {p0, v4, v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    const/high16 v1, 0x41b00000    # 22.0f

    const/4 v2, 0x3

    invoke-direct {p0, v1, v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 383
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userHeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|weight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    goto :goto_0

    .line 385
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x()V

    .line 387
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l()V

    return-void
.end method

.method private k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 528
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$22;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$22;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 539
    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Z
    .locals 1

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->t()Z

    move-result v0

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/app/Dialog;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->S:Landroid/app/Dialog;

    return-object v0
.end method

.method private l()V
    .locals 10

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 687
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 688
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userinfo is not complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    return-void

    .line 691
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    invoke-virtual {v0, v1, v2}, Lo/fdb;->e(Lo/acu;Z)Lo/acu;

    move-result-object v6

    .line 694
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v7

    .line 695
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 696
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_occupied_nick_name:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    .line 698
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 699
    return-void

    .line 695
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 703
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    invoke-virtual {v0, v6}, Lo/fdb;->e(Lo/acu;)Lo/acu;

    move-result-object v8

    .line 706
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a(I)V

    .line 707
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user is current "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/acu;->k()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 710
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 711
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/acu;->d(I)V

    .line 713
    invoke-virtual {v8, v5}, Lo/acu;->c(Ljava/lang/String;)V

    .line 714
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    invoke-virtual {v8, v0}, Lo/acu;->c(I)V

    .line 715
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    invoke-virtual {v8, v0}, Lo/acu;->b(Landroid/graphics/Bitmap;)V

    .line 716
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->C:Z

    if-nez v0, :cond_3

    .line 717
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v8, v0}, Lo/acu;->e(F)V

    .line 718
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v8, v0}, Lo/acu;->d(F)V

    .line 720
    :cond_3
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setWeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "user.getUserInfoWeight():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/acu;->o()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    add-int/lit8 v0, v0, 0x12

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    add-int/lit8 v0, v0, 0x42

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->q()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 740
    invoke-direct {p0, v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b(Lo/acu;)V

    goto :goto_1

    .line 742
    :cond_5
    invoke-direct {p0, v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Lo/acu;)V

    .line 745
    :goto_1
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 566
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$21;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$21;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 577
    return-object v0
.end method

.method private n()V
    .locals 6

    .line 819
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_weight_confirm_delete_user:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 824
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 823
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 833
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 832
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 869
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 870
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 871
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->P:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()Z
    .locals 9

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 635
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "editName is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    const/4 v5, 0x0

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_pls_input_nick_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    const/4 v5, 0x1

    .line 640
    :cond_0
    const/4 v6, 0x0

    .line 641
    const/4 v7, 0x0

    .line 642
    const/4 v8, 0x0

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 645
    const/4 v6, 0x1

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 648
    const/4 v7, 0x1

    .line 650
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 651
    const/4 v8, 0x1

    goto :goto_0

    .line 654
    :cond_3
    const/4 v6, 0x0

    .line 655
    const/4 v7, 0x0

    .line 656
    const/4 v8, 0x0

    .line 658
    :cond_4
    :goto_0
    if-nez v5, :cond_5

    if-nez v6, :cond_5

    if-nez v7, :cond_5

    if-eqz v8, :cond_a

    .line 659
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_complete_privacy_wifi_tip:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 661
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNotCompleteName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|isNotCompleteGender:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|isNotCompleteHeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|isNotCompleteBirth"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    if-eqz v5, :cond_6

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 665
    :cond_6
    if-eqz v6, :cond_7

    .line 666
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 668
    :cond_7
    if-eqz v7, :cond_8

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 671
    :cond_8
    if-eqz v8, :cond_9

    .line 672
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 674
    :cond_9
    const/4 v0, 0x0

    return v0

    .line 676
    :cond_a
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->X:Landroid/widget/ImageView;

    return-object v0
.end method

.method private p()V
    .locals 6

    .line 554
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_userinfo_please_select:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 557
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 558
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-virtual {v3, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 559
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 560
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 563
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/fdb;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    return-object v0
.end method

.method private q()Z
    .locals 7

    .line 1061
    const/4 v3, 0x1

    .line 1062
    const/4 v4, 0x0

    .line 1063
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 1064
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1065
    const/4 v4, 0x1

    .line 1068
    :cond_0
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1069
    const/4 v4, 0x1

    .line 1072
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_userinfo_age_limit_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1074
    const-string v0, "false"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1075
    const/4 v3, 0x0

    .line 1077
    :cond_2
    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/eha;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->x:Lo/eha;

    return-object v0
.end method

.method private r()V
    .locals 5

    .line 980
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 981
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_about_privacy_connectting_error:I

    .line 982
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 983
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 989
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 990
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 991
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 992
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/fdh;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->K:Lo/fdh;

    return-object v0
.end method

.method private s()V
    .locals 8

    .line 877
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showModifyConfirmDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_confirm_user_info:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 879
    sget v0, Lcom/huawei/ui/main/R$id;->confirm_userinfo_dialog_box:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 880
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 896
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 897
    invoke-virtual {v6, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 899
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$10;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 898
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 908
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$6;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 907
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 917
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 918
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 920
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Lo/acu;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    return-object v0
.end method

.method private t()Z
    .locals 10

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 954
    const/4 v0, 0x0

    return v0

    .line 957
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    if-nez v0, :cond_1

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    .line 958
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v6

    .line 959
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->g()I

    move-result v7

    .line 961
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 962
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 963
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 965
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y:Z

    if-ne v5, v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    if-ne v6, v0, :cond_2

    if-eq v7, v9, :cond_3

    .line 966
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 968
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/content/Context;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private u()Z
    .locals 7

    .line 927
    const/4 v3, 0x0

    .line 928
    const/4 v4, 0x1

    .line 929
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 930
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 931
    const/4 v3, 0x1

    .line 934
    :cond_0
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 935
    const/4 v3, 0x1

    .line 938
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_userinfo_modify_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 940
    const-string v0, "false"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 941
    const/4 v4, 0x0

    .line 944
    :cond_2
    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)F
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    return v0
.end method

.method private v()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1363
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1364
    const v5, 0x3dcccccd    # 0.1f

    .line 1366
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1367
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v6, v0

    .line 1368
    const-wide v0, 0x406f400000000000L    # 250.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v7, v0

    .line 1369
    move v8, v6

    :goto_0
    cmpg-float v0, v8, v7

    if-gez v0, :cond_0

    .line 1370
    float-to-double v0, v8

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 1371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1369
    add-float/2addr v8, v5

    goto :goto_0

    .line 1373
    :cond_0
    goto :goto_2

    .line 1375
    :cond_1
    const/high16 v6, 0x41200000    # 10.0f

    :goto_1
    const/high16 v0, 0x437a0000    # 250.0f

    cmpg-float v0, v6, v0

    if-gtz v0, :cond_2

    .line 1376
    float-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 1377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1375
    add-float/2addr v6, v5

    goto :goto_1

    .line 1380
    :cond_2
    :goto_2
    return-object v4
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method private w()V
    .locals 11

    .line 1236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1237
    const-wide/16 v6, 0x0

    .line 1238
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "endTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1239
    const/4 v8, 0x1

    new-array v8, v8, [I

    fill-array-data v8, :array_0

    .line 1240
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 1241
    new-instance v10, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1242
    invoke-static {v6, v7}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-static {v4, v5}, Lo/cnk;->i(J)J

    move-result-wide v2

    invoke-virtual {v10, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 1243
    invoke-virtual {v10, v6, v7, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 1244
    invoke-virtual {v10, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1245
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1246
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1247
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 1248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 1249
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1250
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 1252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$16;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$16;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    invoke-interface {v0, v10, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 1290
    return-void

    nop

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method private x()V
    .locals 9

    .line 1204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    if-nez v0, :cond_0

    .line 1205
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->w()V

    goto/16 :goto_0

    .line 1207
    :cond_0
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "muser weight is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mUser.getUserInfoWeight():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->o()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    new-instance v5, Ljava/text/DecimalFormat;

    const-string v0, "#.0"

    invoke-direct {v5, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1210
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v6, v0, v1

    .line 1211
    const/4 v0, 0x3

    invoke-direct {p0, v6, v6, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    const/high16 v1, 0x41b00000    # 22.0f

    const/4 v2, 0x3

    invoke-direct {p0, v1, v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 1212
    goto/16 :goto_0

    .line 1213
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->o()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 1215
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1216
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v6

    .line 1217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1218
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "muser Lb weightStr is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1220
    goto :goto_0

    .line 1221
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    float-to-double v3, v3

    invoke-virtual {v5, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1222
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "muser user weightStr is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1227
    :goto_0
    return-void
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/widget/TextView;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method private y()V
    .locals 13

    .line 1298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1299
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v4, v0, v1

    .line 1300
    const/4 v0, 0x3

    invoke-direct {p0, v4, v4, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    const/high16 v1, 0x41b00000    # 22.0f

    const/4 v2, 0x3

    invoke-direct {p0, v1, v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    .line 1303
    :cond_0
    new-instance v5, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1304
    sget v0, Lcom/huawei/ui/main/R$layout;->health_healthdata_userinfo_multiuserweight_dialog:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 1305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1306
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_multiuserWeight_dialog_tips:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 1307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_multiuserweight_dialog_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1308
    sget v0, Lcom/huawei/ui/main/R$id;->multiuserweight_number_picker:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/elk;

    .line 1309
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->v()Ljava/util/ArrayList;

    move-result-object v10

    .line 1310
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v9, v0}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 1311
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/elk;->setMinValue(I)V

    .line 1312
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v9, v0}, Lo/elk;->setMaxValue(I)V

    .line 1314
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1315
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-float v1, v1

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v11

    .line 1316
    const/high16 v0, 0x41200000    # 10.0f

    const/4 v1, 0x3

    invoke-direct {p0, v11, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v12

    .line 1317
    float-to-int v0, v12

    invoke-virtual {v9, v0}, Lo/elk;->setValue(I)V

    .line 1318
    goto :goto_0

    .line 1319
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v11

    .line 1320
    const/high16 v0, 0x41200000    # 10.0f

    const/4 v1, 0x3

    invoke-direct {p0, v11, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(FFI)F

    move-result v12

    .line 1321
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get weight:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->j:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|floatValue:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    float-to-int v3, v12

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1323
    float-to-int v0, v12

    invoke-virtual {v9, v0}, Lo/elk;->setValue(I)V

    .line 1326
    :goto_0
    invoke-virtual {v5, v7}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 1327
    invoke-virtual {v0, v6}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$18;

    invoke-direct {v2, p0, v9}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$18;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Lo/elk;)V

    .line 1328
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$17;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$17;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V

    .line 1348
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1354
    invoke-virtual {v5}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 1355
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 1356
    return-void
.end method

.method private z()Z
    .locals 7

    .line 1126
    const/4 v4, 0x0

    .line 1127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_goto_setting_permisson"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1129
    const-string v0, "true"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1130
    const/4 v4, 0x1

    .line 1134
    :cond_0
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 1135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_goto_setting_permisson"

    const-string v3, "false"

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1138
    return v4
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 4

    .line 803
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPicToView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    if-eqz p1, :cond_0

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    invoke-virtual {v0}, Lo/fdl;->d()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    invoke-virtual {v0}, Lo/fdl;->d()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    const/16 v1, 0x12c

    const/16 v2, 0x12c

    invoke-static {p0, v0, v1, v2}, Lo/dbk;->b(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->H:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->F:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 813
    :cond_0
    return-void
.end method

.method protected a(Landroid/widget/ImageView;)V
    .locals 1

    .line 284
    sget v0, Lcom/huawei/ui/main/R$drawable;->health_data_cancel_selector:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 285
    return-void
.end method

.method public d(III)Z
    .locals 6

    .line 1088
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1089
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 1090
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 1091
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 1093
    if-ge p1, v3, :cond_0

    .line 1094
    const/4 v0, 0x0

    return v0

    .line 1096
    :cond_0
    if-ne p1, v3, :cond_1

    if-ge p2, v4, :cond_1

    .line 1097
    const/4 v0, 0x0

    return v0

    .line 1099
    :cond_1
    if-ne p1, v3, :cond_2

    if-ne p2, v4, :cond_2

    if-gt p3, v5, :cond_2

    .line 1100
    const/4 v0, 0x0

    return v0

    .line 1102
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 770
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 771
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 773
    :pswitch_0
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    invoke-virtual {v0, p2, p3}, Lo/fdl;->a(ILandroid/content/Intent;)V

    .line 775
    goto/16 :goto_1

    .line 777
    :pswitch_1
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "take complete,preprare to cutting,data ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", requestCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    invoke-virtual {p0, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a(Landroid/content/Intent;)V

    .line 779
    goto/16 :goto_1

    .line 781
    :pswitch_2
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pick complete,preprare to cutting,data ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", requestCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lo/fdl;->e(Landroid/app/Activity;)V

    goto :goto_1

    .line 785
    :cond_0
    invoke-virtual {p0, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a(Landroid/content/Intent;)V

    .line 787
    goto :goto_1

    .line 789
    :pswitch_3
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 790
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "selest data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fdl;->a(Landroid/net/Uri;)V

    goto :goto_1

    .line 793
    :cond_1
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    goto :goto_1

    .line 797
    :goto_0
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 800
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 2

    .line 1142
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onBackPressed()V

    .line 1143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->M:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 1146
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->finish()V

    .line 1147
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->f:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 392
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->g()V

    goto/16 :goto_0

    .line 393
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->k:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 394
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->A:Z

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->J:Lo/fdb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->D:I

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->a:Lo/fgj$a;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fdb;->d(Lo/acu;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lo/fgj$a;)V

    goto/16 :goto_0

    .line 397
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->h:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 398
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->B:Z

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->I:I

    iget v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->G:I

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->E:I

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->k()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fdr;->c(Landroid/content/Context;IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 401
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->r:Lo/egd;

    if-ne p1, v0, :cond_3

    .line 402
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->n()V

    goto :goto_0

    .line 403
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->O:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/fdl;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 405
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->g:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_5

    .line 406
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->y()V

    goto :goto_0

    .line 407
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->i:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_setting_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e:Lo/acu;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(Lo/acu;)V

    .line 411
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 157
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 158
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_user_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->setContentView(I)V

    .line 159
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->b:Landroid/content/Context;

    .line 160
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 161
    if-nez v4, :cond_0

    .line 162
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    return-void

    .line 166
    :cond_0
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;

    invoke-direct {v0, p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Landroid/content/Intent;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 179
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    .line 1109
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 1111
    invoke-static {p0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v4

    .line 1112
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHaspermission:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1113
    if-eqz v4, :cond_0

    .line 1114
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult : HasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->N:Lo/fdl;

    invoke-virtual {v0, p0}, Lo/fdl;->d(Landroid/app/Activity;)V

    .line 1119
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 996
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onResume()V

    .line 997
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 998
    const-string v0, "PluginDevice_AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isTakePhoto:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->z()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    sget-object v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->Q:[Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 1001
    :cond_0
    return-void
.end method
