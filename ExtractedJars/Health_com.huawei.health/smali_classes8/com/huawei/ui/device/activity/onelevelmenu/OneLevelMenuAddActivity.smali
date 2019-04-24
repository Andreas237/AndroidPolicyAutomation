.class public Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lo/emr;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private f:Landroid/widget/LinearLayout;

.field private g:Lo/eor;

.field private h:Lo/eod;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 26
    const-string v0, "OneLevelMenuAddActivity"

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 8

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData() delete data before mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->h:Lo/eod;

    invoke-virtual {v0}, Lo/eod;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    return-void

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 147
    return-void

    .line 149
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "map="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eor;->e()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    add-int/lit8 v7, v6, -0x1

    :goto_0
    if-ltz v7, :cond_3

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables i="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-static {}, Lo/eor;->e()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIsSelected i="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is selected!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 151
    :cond_2
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 159
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====saveData() delete data after mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 162
    const-string v0, "intent_from_next_open_list"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====mMenuTables gotonext mMenuTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eod;->a()Lo/eod;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v4, v5}, Lo/eod;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v7}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->setResult(ILandroid/content/Intent;)V

    .line 165
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->finish()V

    .line 166
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->a()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 85
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_add_menu_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b:Lo/emr;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$2;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_add_menu_no_content_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->f:Landroid/widget/LinearLayout;

    .line 94
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_add_menu_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->p:Landroid/widget/LinearLayout;

    .line 95
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_add_menu_listview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->a:Landroid/widget/ListView;

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 98
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e(Z)V

    goto :goto_0

    .line 100
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e(Z)V

    .line 101
    return-void

    .line 103
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===123mDuplicateListItemTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->a:Landroid/widget/ListView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->device_settings_contact_listview_item_selector_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 105
    new-instance v0, Lo/eor;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/eor;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->g:Lo/eor;

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->g:Lo/eor;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity$5;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 127
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;)Lo/emr;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b:Lo/emr;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 62
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->d:Landroid/content/Context;

    .line 63
    invoke-static {}, Lo/eod;->a()Lo/eod;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->h:Lo/eod;

    .line 64
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent_to_next_all_list"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    .line 66
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent_to_next_open_list"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 69
    return-void

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    .line 73
    return-void

    .line 75
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mAllItemTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mMenuItemTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-static {}, Lo/eod;->a()Lo/eod;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lo/eod;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->i:Ljava/util/ArrayList;

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 130
    if-eqz p1, :cond_0

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 137
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_one_level_add_menu_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->setContentView(I)V

    .line 48
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->e()V

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;->b()V

    .line 50
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 54
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 55
    return-void
.end method
