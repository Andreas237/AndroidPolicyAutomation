.class public Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lo/emr;

.field private c:Ljava/lang/String;

.field private d:Lo/eox;

.field private e:Landroid/content/Context;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 34
    const-string v0, "ContactSelectNumberDialog"

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 5

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleSubmitClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 147
    const-string v0, "userName"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    const-string v0, "contactId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    const-string v0, "selectNumber"

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 150
    const-string v0, "numberType"

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->setResult(ILandroid/content/Intent;)V

    .line 152
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->finish()V

    .line 153
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)Lo/eox;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->d:Lo/eox;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 58
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->e:Landroid/content/Context;

    .line 61
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 62
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 63
    const-string v0, "userName"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->h:Ljava/lang/String;

    .line 64
    const-string v0, "contactId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k:Ljava/lang/String;

    .line 65
    const-string v0, "userNumbers"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    .line 66
    const-string v0, "numberTypes"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getIntent mUserName is null ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->h:Ljava/lang/String;

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getIntent mContactId is null ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k:Ljava/lang/String;

    .line 77
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getIntent mUserNumbers is null ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    .line 81
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getIntent mNumberType is null ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    .line 87
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check mUserName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mContactId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mUserNumbers="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mNumberType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method private c()Ljava/lang/String;
    .locals 4

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSelectedNumber"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 163
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->a()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCancelClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->finish()V

    .line 139
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->d()V

    return-void
.end method

.method private e()V
    .locals 3

    .line 96
    new-instance v0, Lo/eox;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/eox;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->d:Lo/eox;

    .line 97
    sget v0, Lcom/huawei/ui/device/R$id;->contact_selectnumber_listview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->a:Landroid/widget/ListView;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->a:Landroid/widget/ListView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->device_settings_contact_listview_item_selector_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->d:Lo/eox;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$1;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 116
    sget v0, Lcom/huawei/ui/device/R$id;->contact_select_number_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b:Lo/emr;

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->ic_health_nav_back:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->ic_drawer_app_bar_done_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$2;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog$5;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    return-void
.end method

.method private f()I
    .locals 8

    .line 181
    const/4 v4, 0x0

    .line 182
    invoke-static {}, Lo/eox;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    .line 183
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 184
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 186
    goto :goto_1

    .line 188
    :cond_0
    goto :goto_0

    .line 190
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "selectedIndex="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    return v4
.end method

.method private k()Ljava/lang/String;
    .locals 4

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSelectedType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->g:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 174
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 48
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_select_one_number_dialog_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->setContentView(I)V

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->b()V

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;->e()V

    .line 53
    return-void
.end method
