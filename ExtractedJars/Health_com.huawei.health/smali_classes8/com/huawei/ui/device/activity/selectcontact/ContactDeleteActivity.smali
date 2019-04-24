.class public Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;
    }
.end annotation


# instance fields
.field a:Lo/egy;

.field b:Lo/eov;

.field c:Lo/enz;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Landroid/content/Context;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/TextView;

.field private l:J

.field private m:Lo/ems;

.field private final n:I

.field private o:Landroid/widget/ListView;

.field private p:Lo/emr;

.field private q:I

.field private r:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 51
    const-string v0, "ContactDeleteActivity"

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    .line 67
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->l:J

    .line 68
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->n:I

    .line 80
    new-instance v0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$e;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleSelectAll mcheckNum="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 313
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f()V

    goto :goto_0

    .line 316
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->k()V

    .line 318
    :goto_0
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(I)V

    .line 319
    return-void
.end method

.method private a(I)V
    .locals 6

    .line 294
    if-eqz p1, :cond_0

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 300
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p:Lo/emr;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 302
    :goto_0
    return-void
.end method

.method private b()V
    .locals 5

    .line 160
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c:Lo/enz;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/enz;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error ContactDB-------------->>>get null DB, the activity will be finished!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-void

    .line 174
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 177
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 179
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e()V

    return-void
.end method

.method private c()V
    .locals 4

    .line 186
    sget v0, Lcom/huawei/ui/device/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->m:Lo/ems;

    .line 187
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_delete_activity_black_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->m:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->e(Landroid/view/View;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->m:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 191
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_delete_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->i:Landroid/widget/LinearLayout;

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_seleteall_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h:Landroid/widget/LinearLayout;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_seleteall_img:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g:Landroid/widget/ImageView;

    .line 196
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_seleteall_textview:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->k:Landroid/widget/TextView;

    .line 199
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p:Lo/emr;

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->bg_number:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleCountBg(Landroid/graphics/drawable/Drawable;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleCountColor(I)V

    .line 204
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(I)V

    .line 207
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_listview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->o:Landroid/widget/ListView;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->o:Landroid/widget/ListView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->device_settings_contact_listview_item_selector_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 209
    new-instance v0, Lo/eov;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/eov;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b:Lo/eov;

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->o:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b:Lo/eov;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->o:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$4;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 255
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a(I)V

    return-void
.end method

.method private d()V
    .locals 4

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleSetFail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_synchroFailed_dialog:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 128
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->finish()V

    .line 129
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I
    .locals 2

    .line 49
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    return v0
.end method

.method private e()V
    .locals 4

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleSetSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->finish()V

    .line 120
    return-void
.end method

.method private f()V
    .locals 4

    .line 326
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 327
    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 331
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b:Lo/eov;

    invoke-virtual {v0}, Lo/eov;->notifyDataSetChanged()V

    .line 337
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g()V

    .line 338
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I
    .locals 2

    .line 49
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    return v0
.end method

.method private g()V
    .locals 3

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$drawable;->common_selectall_new_21:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 365
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    return v0
.end method

.method private h()V
    .locals 3

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$drawable;->common_desselectall_new_21:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 373
    return-void
.end method

.method private i()V
    .locals 11

    .line 381
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$plurals;->IDS_settings_gemini_contact_delete_confirm:I

    iget v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    int-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 383
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_delete:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    .line 384
    new-instance v10, Lo/egy$b;

    invoke-direct {v10, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 385
    invoke-virtual {v10, v8}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$3;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 386
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_dialog_red_btn_color:I

    new-instance v2, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$2;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    .line 391
    invoke-virtual {v0, v9, v1, v2}, Lo/egy$b;->d(Ljava/lang/String;ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 396
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a:Lo/egy;

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 398
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h()V

    return-void
.end method

.method private k()V
    .locals 4

    .line 345
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 346
    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b:Lo/eov;

    invoke-virtual {v0}, Lo/eov;->notifyDataSetChanged()V

    .line 356
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->h()V

    .line 357
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->p()V

    return-void
.end method

.method private o()Z
    .locals 6

    .line 448
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 450
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->l:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iput-wide v4, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->l:J

    .line 453
    const/4 v0, 0x1

    return v0

    .line 455
    :cond_0
    iput-wide v4, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->l:J

    .line 456
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    return-object v0
.end method

.method private p()V
    .locals 6

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData() delete data before mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "map="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    add-int/lit8 v5, v4, -0x1

    :goto_0
    if-ltz v5, :cond_1

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables i="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    invoke-static {}, Lo/eov;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIsSelected i="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is selected!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 409
    :cond_0
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 417
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData() delete data after mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c:Lo/enz;

    if-nez v0, :cond_2

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceSettingsInteractors of saveData error null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    return-void

    .line 425
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v5

    .line 426
    invoke-virtual {v5}, Lo/env;->i()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 430
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->c:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->d:Ljava/util/List;

    new-instance v3, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity$1;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 442
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 259
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 261
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_delete_layout:I

    if-ne v4, v0, :cond_2

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contact_delete_bottom_delete_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    return-void

    .line 270
    :cond_0
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->q:I

    if-nez v0, :cond_1

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() contact_delete_bottom_delete_layout if (mcheckNum == 0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void

    .line 275
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->i()V

    goto :goto_0

    .line 278
    :cond_2
    sget v0, Lcom/huawei/ui/device/R$id;->contact_delete_bottom_seleteall_layout:I

    if-ne v4, v0, :cond_3

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contact_delete_bottom_seleteall_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->a()V

    goto :goto_0

    .line 284
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 133
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 135
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_delete_activity_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->setContentView(I)V

    .line 139
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->b()V

    .line 143
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 147
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;->r:Landroid/os/Handler;

    .line 153
    :cond_0
    return-void
.end method
