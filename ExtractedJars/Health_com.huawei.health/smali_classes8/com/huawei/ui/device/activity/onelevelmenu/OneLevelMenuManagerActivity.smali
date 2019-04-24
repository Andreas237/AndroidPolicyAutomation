.class public Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/eoy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;
    }
.end annotation


# instance fields
.field private B:Landroid/view/View$OnClickListener;

.field private C:Landroid/os/Handler;

.field private a:Lo/enz;

.field b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;[B>;"
        }
    .end annotation
.end field

.field private c:Lo/eot;

.field private d:Lo/emr;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private h:Lo/eod;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private j:Landroid/view/View$OnClickListener;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private l:Landroid/widget/LinearLayout;

.field private m:Lo/eop;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/widget/ImageView;

.field private r:Lhuawei/widget/HwProgressBar;

.field private s:Landroid/widget/LinearLayout;

.field private t:Lo/egd;

.field private u:Landroid/widget/LinearLayout;

.field private v:Lo/egy;

.field private w:Ljava/lang/String;

.field private x:Lo/ems;

.field private y:Z

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c:Lo/eot;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k:Ljava/util/ArrayList;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->y:Z

    .line 93
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->w:Ljava/lang/String;

    .line 97
    new-instance v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$a;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    .line 154
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b:Ljava/util/Map;

    .line 237
    new-instance v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$1;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->j:Landroid/view/View$OnClickListener;

    .line 342
    new-instance v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$9;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->B:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eop;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m:Lo/eop;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 179
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_add_bottom_toolbar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_one_level_menu_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    invoke-virtual {v0, v5}, Lo/ems;->e(Landroid/view/View;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 183
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d:Lo/emr;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$2;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$4;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    sget v0, Lcom/huawei/ui/device/R$id;->text_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/egb;

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_one_level_menu_settings_bottom_text1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 206
    sget v0, Lcom/huawei/ui/device/R$id;->text_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egb;

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_one_level_menu_settings_bottom_text2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 209
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_add_bottom_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->B:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_add_bottom_no_content_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->p:Landroid/widget/LinearLayout;

    .line 212
    sget v0, Lcom/huawei/ui/device/R$id;->disagree:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->t:Lo/egd;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->t:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->B:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_bottom_textview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    .line 215
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_loading_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->n:Landroid/widget/LinearLayout;

    .line 216
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_loading_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->r:Lhuawei/widget/HwProgressBar;

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->r:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 218
    sget v0, Lcom/huawei/ui/device/R$id;->drag_item_divider:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->z:Landroid/widget/ImageView;

    .line 220
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_retry_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o:Landroid/widget/LinearLayout;

    .line 221
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_listview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->s:Landroid/widget/LinearLayout;

    .line 222
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_no_content_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u:Landroid/widget/LinearLayout;

    .line 223
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_retry_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->q:Landroid/widget/ImageView;

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->j:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mOneMenuHandler="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    sget v0, Lcom/huawei/ui/device/R$id;->one_level_menu_drag_list:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eop;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m:Lo/eop;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 229
    new-instance v0, Lo/eot;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2, p0}, Lo/eot;-><init>(Landroid/content/Context;Ljava/util/List;Lo/eoy;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c:Lo/eot;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m:Lo/eop;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c:Lo/eot;

    invoke-virtual {v0, v1}, Lo/eop;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 231
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l()V

    .line 232
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Z)V

    return-void
.end method

.method private b()V
    .locals 4

    .line 250
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter dealBackButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter dealBackButton mMenuTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter dealBackButton mMenuItemFromBandTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h:Lo/eod;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lo/eod;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 255
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c()V

    goto :goto_0

    .line 257
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->finish()V

    .line 259
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e(Z)V

    return-void
.end method

.method private b(Lo/eop;Lo/eot;)V
    .locals 8

    .line 321
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 322
    return-void

    .line 324
    :cond_0
    invoke-virtual {p2}, Lo/eot;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 325
    return-void

    .line 327
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1}, Lo/eot;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 328
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/View;->measure(II)V

    .line 329
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 330
    invoke-virtual {p1}, Lo/eop;->getDividerHeight()I

    move-result v6

    .line 332
    invoke-virtual {p1}, Lo/eop;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 333
    const/4 v0, -0x1

    iput v0, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 334
    invoke-virtual {p2}, Lo/eot;->getCount()I

    move-result v0

    const/4 v1, 0x7

    if-le v0, v1, :cond_2

    .line 335
    add-int v0, v5, v6

    int-to-double v0, v0

    const-wide/high16 v2, 0x401e000000000000L    # 7.5

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    .line 337
    :cond_2
    invoke-virtual {p2}, Lo/eot;->getCount()I

    move-result v0

    add-int v1, v5, v6

    mul-int/2addr v0, v1

    iput v0, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 339
    :goto_0
    invoke-virtual {p1, v7}, Lo/eop;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 340
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 267
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPromptSaveDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 271
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_alarm_settings_save_changes:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    .line 272
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_save:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$3;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    .line 283
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_btn_discard:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$5;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 290
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->v:Lo/egy;

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->v:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->v:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->v:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 295
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Lo/eop;Lo/eot;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lo/eop;Lo/eot;)V

    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 427
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===showRetryView isShow="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    if-eqz p1, :cond_0

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    goto :goto_0

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 443
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->y:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/emr;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d:Lo/emr;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 160
    iput-object p0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a:Lo/enz;

    .line 162
    invoke-static {}, Lo/eod;->a()Lo/eod;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h:Lo/eod;

    .line 163
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k:Ljava/util/ArrayList;

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    .line 168
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mContactTables size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 170
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 171
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->w:Ljava/lang/String;

    .line 173
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eot;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c:Lo/eot;

    return-object v0
.end method

.method private e(Z)V
    .locals 4

    .line 403
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===showLoadingView isShow"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    if-eqz p1, :cond_0

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    goto :goto_0

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 420
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Landroid/os/Handler;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 390
    :cond_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 350
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuAddActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 352
    const-string v0, "intent_to_next_all_list"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 353
    const-string v0, "intent_to_next_open_list"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putIntegerArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 354
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====mMenuTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====mAllList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    const/4 v0, 0x1

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 357
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h:Lo/eod;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 473
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Enter sendDataToBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->w:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    new-instance v4, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$7;

    invoke-direct {v4, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$7;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/enz;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 480
    return-void
.end method

.method private i()V
    .locals 4

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 302
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get null DBdata, the activity will be shut down!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    goto :goto_0

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->x:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 318
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k()V

    return-void
.end method

.method private k()V
    .locals 7

    .line 362
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData() data mContactTables = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a:Lo/enz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 365
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceSettingsInteractors of saveData error null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    return-void

    .line 370
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v6

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->w:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lo/env;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 375
    :cond_1
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====mOneLevelMenuInteractor.isListEqual(mMenuTables,mMenuItemFromBandTables)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h:Lo/eod;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    iget-object v5, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v4, v5}, Lo/eod;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h()V

    .line 379
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b()V

    return-void
.end method

.method private l()V
    .locals 4

    .line 484
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Enter getDataFromBand()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->w:Ljava/lang/String;

    new-instance v3, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;-><init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 536
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->y:Z

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/egy;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->v:Lo/egy;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->i:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m:Lo/eop;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c:Lo/eot;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b(Lo/eop;Lo/eot;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 396
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 448
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 449
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff0c resultCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 453
    :sswitch_0
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====mMenuTables fromnext mMenuTables"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->g:Ljava/util/ArrayList;

    const-string v1, "intent_from_next_open_list"

    invoke-virtual {p3, v1}, Landroid/content/Intent;->getIntegerArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 456
    .line 460
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 149
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 150
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_one_level_menu_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->setContentView(I)V

    .line 151
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->d()V

    .line 152
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->a()V

    .line 153
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 382
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 384
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f()V

    .line 385
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 463
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 464
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b()V

    .line 465
    const/4 v0, 0x0

    return v0

    .line 467
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
