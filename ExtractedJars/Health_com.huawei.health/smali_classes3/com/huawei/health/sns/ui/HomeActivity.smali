.class public Lcom/huawei/health/sns/ui/HomeActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/app/ActionBar$TabListener;
.implements Lo/bgd;
.implements Lo/bkh;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lo/aoo;
.implements Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;
.implements Lo/azd;
.implements Lo/awn$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/HomeActivity$e;
    }
.end annotation


# instance fields
.field private A:Landroid/content/Intent;

.field private B:Z

.field private D:Landroid/widget/TextView;

.field private f:Landroid/app/ActionBar;

.field private g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

.field private h:Lo/bco;

.field private k:Landroid/support/v4/view/ViewPager;

.field private l:Lo/bcl;

.field private m:Z

.field private n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

.field private o:Landroid/view/Menu;

.field private p:Landroid/os/Handler;

.field private q:Lo/aos;

.field private r:Z

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Lo/bio;

.field private u:Z

.field private v:I

.field private w:Ljava/lang/String;

.field private x:Z

.field private final y:Lo/bcn;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->m:Z

    .line 150
    new-instance v0, Lcom/huawei/health/sns/ui/HomeActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/HomeActivity$e;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    .line 194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->u:Z

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->q:Lo/aos;

    .line 204
    new-instance v0, Lo/bcn;

    invoke-direct {v0}, Lo/bcn;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->y:Lo/bcn;

    .line 209
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 214
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    .line 224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->x:Z

    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->B:Z

    .line 239
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->A:Landroid/content/Intent;

    return-void
.end method

.method private A()Z
    .locals 4

    .line 1184
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 1186
    return v3
.end method

.method private B()V
    .locals 1

    .line 1174
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpk;->c()V

    .line 1175
    return-void
.end method

.method private C()V
    .locals 3

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->s:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 1095
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 1096
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1101
    goto :goto_0

    .line 1098
    :catch_0
    move-exception v2

    .line 1100
    const-string v0, "HomeActivity"

    const-string v1, "unRegisterBroadcastReceiver() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1103
    :cond_0
    :goto_0
    return-void
.end method

.method private D()V
    .locals 1

    .line 1163
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->x:Z

    if-eqz v0, :cond_0

    .line 1165
    invoke-static {p0}, Lo/bnz;->c(Landroid/app/Activity;)V

    .line 1167
    :cond_0
    return-void
.end method

.method private E()V
    .locals 5

    .line 1267
    const/4 v3, 0x0

    .line 1268
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->h:Lo/bco;

    invoke-virtual {v0}, Lo/bco;->getCount()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 1270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->y:Lo/bcn;

    invoke-virtual {v0, v4}, Lo/bcn;->b(I)Lo/bcn$d;

    move-result-object v3

    .line 1271
    if-eqz v3, :cond_0

    .line 1273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v1}, Landroid/app/ActionBar;->newTab()Landroid/app/ActionBar$Tab;

    move-result-object v1

    invoke-virtual {v3}, Lo/bcn$d;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/ActionBar$Tab;->setText(I)Landroid/app/ActionBar$Tab;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/app/ActionBar$Tab;->setTabListener(Landroid/app/ActionBar$TabListener;)Landroid/app/ActionBar$Tab;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;)V

    .line 1268
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1276
    :cond_1
    return-void
.end method

.method private F()V
    .locals 0

    .line 1467
    invoke-static {p0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 1468
    return-void
.end method

.method private G()V
    .locals 2

    .line 1369
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    if-eqz v0, :cond_1

    .line 1374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1376
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_1

    .line 1378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 1385
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    if-eqz v0, :cond_1

    .line 1387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1391
    :cond_1
    :goto_0
    return-void
.end method

.method private H()V
    .locals 6

    .line 1206
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    .line 1207
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    if-eqz v0, :cond_2

    .line 1209
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1210
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setNavigationMode(I)V

    .line 1211
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/app/ActionBar;->setDisplayOptions(II)V

    .line 1212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 1213
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    goto :goto_1

    .line 1215
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 1217
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1219
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_action_bar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 1224
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_chat_manager_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 1226
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_user_name:I

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->D:Landroid/widget/TextView;

    .line 1227
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_tab_message:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    invoke-static {v0, v4}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 1229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1230
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 1232
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 1233
    const/high16 v0, -0x80000000

    invoke-virtual {v5, v0}, Landroid/view/Window;->addFlags(I)V

    .line 1234
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 1238
    :cond_2
    :goto_1
    return-void
.end method

.method private I()V
    .locals 3

    .line 1245
    sget v0, Lcom/huawei/android/sns/R$id;->tab_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    .line 1246
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1248
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1251
    :cond_0
    new-instance v0, Lo/bco;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lo/bco;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->h:Lo/bco;

    .line 1252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->h:Lo/bco;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 1256
    invoke-static {p0}, Lo/bny;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1258
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setRotation(F)V

    .line 1260
    :cond_1
    return-void
.end method

.method private J()V
    .locals 2

    .line 1674
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, p0, v1}, Lo/aor;->d(Landroid/app/Activity;Lo/aoo;Z)V

    .line 1675
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->finish()V

    .line 1676
    return-void
.end method

.method private K()V
    .locals 1

    .line 1661
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1664
    invoke-static {}, Lo/axj;->e()V

    .line 1665
    invoke-static {}, Lo/auv;->b()V

    .line 1667
    :cond_0
    return-void
.end method

.method private L()Ljava/lang/Runnable;
    .locals 1

    .line 1641
    new-instance v0, Lcom/huawei/health/sns/ui/HomeActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/HomeActivity$4;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    return-object v0
.end method

.method private M()Z
    .locals 5

    .line 1737
    const/4 v3, 0x1

    .line 1739
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "matchContactTime"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1740
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1742
    const-string v0, "HomeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "incrementalMatchContact lastMatchTime  = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1744
    invoke-static {v4}, Lo/ary;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1746
    const-string v0, "HomeActivity"

    const-string v1, "lastMatchTime isToday"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1747
    const/4 v3, 0x0

    .line 1750
    :cond_0
    return v3
.end method

.method private a(I)V
    .locals 2

    .line 1565
    if-lez p1, :cond_1

    .line 1567
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_table_red_dot_5:I

    .line 1570
    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;

    goto :goto_0

    .line 1574
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_table_red_dot:I

    .line 1575
    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;

    goto :goto_0

    .line 1580
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/ActionBar$Tab;

    .line 1582
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->p()V

    return-void
.end method

.method private b(I)V
    .locals 2

    .line 1539
    if-lez p1, :cond_1

    .line 1541
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_table_red_dot_5:I

    .line 1544
    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;

    goto :goto_0

    .line 1548
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_img_table_red_dot:I

    .line 1549
    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;

    goto :goto_0

    .line 1554
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    const-string v1, "show-icon-right"

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/ActionBar$Tab;

    .line 1556
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 4

    .line 477
    if-eqz p1, :cond_0

    .line 480
    const-string v0, "openShortCut"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 481
    const-string v0, "HomeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openShortCut:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 487
    :cond_0
    goto :goto_0

    .line 484
    :catch_0
    move-exception v3

    .line 486
    const-string v0, "HomeActivity"

    const-string v1, "get openShortCut from intent Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->o()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/HomeActivity;Landroid/os/Bundle;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/HomeActivity;Z)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->c(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 1

    .line 1400
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->G()V

    .line 1403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    if-eqz v0, :cond_1

    .line 1407
    if-eqz p1, :cond_0

    .line 1409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e()V

    .line 1411
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d()V

    .line 1415
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    if-eqz v0, :cond_2

    .line 1417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->a()V

    .line 1419
    :cond_2
    return-void
.end method

.method private c(I)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 609
    const-string v0, "HomeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestPermission(code):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    const/4 v3, 0x0

    .line 613
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 615
    const/4 v0, 0x4

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_CONTACTS"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.READ_CONTACTS"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    goto :goto_0

    .line 620
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 627
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 632
    :cond_1
    :goto_0
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/HomeActivity;->d([Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 634
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 636
    :cond_2
    const-string v0, "HomeActivity"

    const-string v1, "can read and write contacts, no need request!"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->a()V

    .line 638
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->D()V

    goto :goto_1

    .line 643
    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    .line 645
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_CONTACTS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->d([Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 648
    if-eqz v5, :cond_4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 650
    :cond_4
    const-string v0, "HomeActivity"

    const-string v1, "can read and write contacts, no need request!"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->a()V

    .line 654
    :cond_5
    const-string v0, "HomeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deniedPermissions size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 657
    :goto_1
    return-void
.end method

.method private c(J)V
    .locals 0

    .line 731
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/HomeActivity;J)V
    .locals 0

    .line 97
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/HomeActivity;->c(J)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/HomeActivity;Landroid/content/Intent;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Landroid/content/Intent;)V

    return-void
.end method

.method private c(Z)V
    .locals 0

    .line 910
    return-void
.end method

.method private d([Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1115
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 1117
    invoke-static {p0, p1}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 1121
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Landroid/content/Intent;)V
    .locals 4

    .line 1497
    const-string v0, "refresh_searchView"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d(Z)V

    .line 1500
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->d(Z)V

    .line 1502
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_4

    .line 1504
    const-string v0, "messageTab"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1506
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    goto :goto_0

    .line 1508
    :cond_1
    const-string v0, "keyHomeTableType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1510
    const-string v0, "keyHomeTableType"

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    goto :goto_0

    .line 1514
    :cond_2
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 1517
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    if-nez v0, :cond_3

    .line 1520
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->K()V

    .line 1523
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1529
    :cond_4
    goto :goto_1

    .line 1526
    :catch_0
    move-exception v3

    .line 1528
    const-string v0, "HomeActivity"

    const-string v1, "getOnNewIntentData from intent Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1530
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->x()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/HomeActivity;I)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->b(I)V

    return-void
.end method

.method private e(I)V
    .locals 1

    .line 1285
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->x:Z

    .line 1286
    return-void
.end method

.method private e(Landroid/os/Bundle;)V
    .locals 6

    .line 1829
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->x()V

    .line 1830
    const/4 v2, 0x0

    .line 1831
    const/4 v3, 0x0

    .line 1832
    if-eqz p1, :cond_1

    .line 1835
    const-string v0, "loginCode"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1836
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1838
    invoke-static {v4}, Lo/azd$a;->valueOf(Ljava/lang/String;)Lo/azd$a;

    move-result-object v2

    .line 1841
    :cond_0
    const-string v0, "imStatus"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1842
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1844
    invoke-static {v5}, Lo/azd$c;->valueOf(Ljava/lang/String;)Lo/azd$c;

    move-result-object v3

    .line 1848
    :cond_1
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne v3, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Z)V

    .line 1850
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    if-eqz v0, :cond_5

    .line 1853
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne v3, v0, :cond_3

    .line 1855
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a(Z)V

    goto :goto_1

    .line 1857
    :cond_3
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne v3, v0, :cond_5

    .line 1861
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->u:Z

    if-eqz v0, :cond_4

    sget-object v0, Lo/azd$a;->h:Lo/azd$a;

    if-eq v2, v0, :cond_4

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1864
    sget v0, Lcom/huawei/android/sns/R$string;->sns_im_online_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1866
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a(Z)V

    .line 1869
    :cond_5
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->u:Z

    .line 1870
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->l()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/HomeActivity;I)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->a(I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->n()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/HomeActivity;)Lo/aos;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->q:Lo/aos;

    return-object v0
.end method

.method private g()V
    .locals 1

    .line 497
    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 499
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    goto :goto_0

    .line 503
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    .line 505
    :goto_0
    return-void
.end method

.method private h()V
    .locals 0

    .line 466
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->z()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/HomeActivity;)Landroid/os/Handler;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private j()Z
    .locals 4

    .line 1196
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ignored_upload_phone_digest"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 1198
    return v3
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/HomeActivity;)Lo/bcl;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 512
    new-instance v1, Lcom/huawei/health/sns/ui/HomeActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/HomeActivity$1;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 540
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 541
    return-void
.end method

.method private l()V
    .locals 2

    .line 548
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->x()V

    .line 549
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->q:Lo/aos;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    invoke-virtual {v0, p0, v1}, Lo/aos;->d(Landroid/app/Activity;Lo/aos$b;)V

    .line 550
    return-void
.end method

.method private m()Ljava/lang/Runnable;
    .locals 1

    .line 562
    new-instance v0, Lcom/huawei/health/sns/ui/HomeActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/HomeActivity$5;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 557
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->m()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 558
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/HomeActivity;)I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    return v0
.end method

.method private o()V
    .locals 1

    .line 580
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/asj;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 581
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->M()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 583
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 585
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->c(I)V

    goto :goto_0

    .line 589
    :cond_2
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->c(I)V

    goto :goto_0

    .line 594
    :cond_3
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->c(I)V

    .line 596
    :goto_0
    return-void
.end method

.method private p()V
    .locals 1

    .line 603
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->c()V

    .line 604
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/HomeActivity;)Z
    .locals 1

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->j()Z

    move-result v0

    return v0
.end method

.method private q()V
    .locals 1

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 780
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->finish()V

    .line 782
    :cond_0
    return-void
.end method

.method private r()V
    .locals 1

    .line 767
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 769
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->finish()V

    .line 771
    :cond_0
    return-void
.end method

.method private s()V
    .locals 6

    .line 666
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 667
    if-eqz v2, :cond_5

    .line 669
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 671
    const-string v0, "com.huawei.health.sns.action.FRIEND_HOME"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 677
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 678
    if-eqz v4, :cond_2

    .line 681
    const-string v0, "sns_sdk_home_tab"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 682
    if-nez v5, :cond_1

    .line 685
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    goto :goto_0

    .line 687
    :cond_1
    const/4 v0, 0x1

    if-ne v5, v0, :cond_2

    .line 690
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 694
    :cond_2
    :goto_0
    const-string v0, "keyHomeTableType"

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 695
    const-string v0, "sns_sdk_channel"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 697
    const-string v0, "sns_sdk_channel"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->w:Ljava/lang/String;

    .line 702
    :cond_3
    const-string v0, "hms_sns_call_friend"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 705
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    goto :goto_1

    .line 707
    :cond_4
    const-string v0, "hms_sns_call_msg"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 710
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 718
    :cond_5
    :goto_1
    goto :goto_2

    .line 715
    :catch_0
    move-exception v2

    .line 717
    const-string v0, "HomeActivity"

    const-string v1, "getIntentData from intent Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    :goto_2
    return-void
.end method

.method private t()V
    .locals 1

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->A:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 919
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->A:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 920
    return-void

    .line 923
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->c(Z)V

    .line 924
    return-void
.end method

.method private u()V
    .locals 0

    .line 935
    return-void
.end method

.method private v()V
    .locals 1

    .line 1018
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    .line 1022
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$a;)V

    .line 1030
    new-instance v0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    .line 1032
    return-void
.end method

.method private w()V
    .locals 2

    .line 967
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_home_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->setContentView(I)V

    .line 969
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->H()V

    .line 971
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->y()V

    .line 974
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 975
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    invoke-static {v0}, Lo/axi;->e(Landroid/os/Handler;)V

    .line 978
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->v()V

    .line 979
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->I()V

    .line 982
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->m:Z

    if-eqz v0, :cond_2

    .line 984
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->m:Z

    .line 985
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 986
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->E()V

    .line 989
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    .line 992
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 997
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 1001
    :goto_0
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lo/azd;)V

    .line 1002
    return-void
.end method

.method private x()V
    .locals 1

    .line 942
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    if-eqz v0, :cond_0

    .line 944
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 945
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    .line 947
    :cond_0
    return-void
.end method

.method private y()V
    .locals 3

    .line 1039
    new-instance v0, Lcom/huawei/health/sns/ui/HomeActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/HomeActivity$2;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->s:Landroid/content/BroadcastReceiver;

    .line 1079
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 1080
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.health.notify.unread.number"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1081
    const-string v0, "action_clear_search"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1082
    const-string v0, "com.huawei.android.sns.action.check.match.contact"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1084
    return-void
.end method

.method private z()V
    .locals 4

    .line 954
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    if-nez v0, :cond_0

    .line 957
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    .line 959
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->t:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 960
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1759
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/asj;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1761
    const-string v0, "HomeActivity"

    const-string v1, "begin fullSyncContactPhoto."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1763
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0}, Lo/asj;->c()V

    .line 1766
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->M()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1768
    const-string v0, "HomeActivity"

    const-string v1, "begin incrementalMatchContact."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1770
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/HomeActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/HomeActivity$3;-><init>(Lcom/huawei/health/sns/ui/HomeActivity;)V

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1781
    :cond_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 1612
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->z()V

    .line 1613
    invoke-static {p0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1615
    const-string v0, "HomeActivity"

    const-string v1, "Home onlineClick() no network."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1617
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->L()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1618
    return-void

    .line 1621
    :cond_0
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1624
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->u:Z

    goto :goto_0

    .line 1629
    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->L()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1630
    const-string v0, "HomeActivity"

    const-string v1, "Home onlineClick() reLoginIM Failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1632
    :goto_0
    return-void
.end method

.method public c(Lo/azd$c;Lo/azd$a;)V
    .locals 4

    .line 1808
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-eq p1, v0, :cond_0

    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_2

    .line 1810
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1811
    const-string v0, "imStatus"

    invoke-virtual {p1}, Lo/azd$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1812
    if-eqz p2, :cond_1

    .line 1814
    const-string v0, "loginCode"

    invoke-virtual {p2}, Lo/azd$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1816
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    const/16 v1, 0x129

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 1817
    invoke-virtual {v3, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1818
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1820
    :cond_2
    return-void
.end method

.method public c()Z
    .locals 2

    .line 1796
    const/4 v1, 0x0

    .line 1797
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->n:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1799
    const/4 v1, 0x1

    .line 1801
    :cond_0
    return v1
.end method

.method public d(I)V
    .locals 4

    .line 1588
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x130

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1589
    return-void
.end method

.method public d(Lo/awn$e;)V
    .locals 0

    .line 1424
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d(Lo/awn$e;)V

    .line 1425
    return-void
.end method

.method public e()I
    .locals 1

    .line 1786
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1696
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1697
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    if-nez v0, :cond_0

    .line 1699
    const-string v0, "HomeActivity"

    const-string v1, "onActivityResult mAccountCallbackImpl is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1700
    return-void

    .line 1702
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 1704
    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_1

    .line 1706
    const-string v0, "HomeActivity"

    const-string v1, "bindThirdAccount success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1707
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    invoke-virtual {v0}, Lo/bcl;->i()V

    goto :goto_0

    .line 1709
    :cond_1
    const/16 v0, 0x7d1

    if-ne p1, v0, :cond_4

    .line 1711
    const-string v0, "HomeActivity"

    const-string v1, "modifyNickName success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    invoke-virtual {v0}, Lo/bcl;->d()V

    goto :goto_0

    .line 1717
    :cond_2
    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_3

    .line 1719
    const-string v0, "HomeActivity"

    const-string v1, "bindThirdAccount onError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1720
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    invoke-virtual {v0}, Lo/bcl;->f()V

    goto :goto_0

    .line 1722
    :cond_3
    const/16 v0, 0x7d1

    if-ne p1, v0, :cond_4

    .line 1724
    const-string v0, "HomeActivity"

    const-string v1, "modifyNickName onError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1725
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    invoke-virtual {v0}, Lo/bcl;->k()V

    .line 1728
    :cond_4
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1594
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1595
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1597
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    goto :goto_0

    .line 1601
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    .line 1603
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 1604
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 355
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->p()V

    .line 356
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 357
    new-instance v0, Lo/bcl;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bcl;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->l:Lo/bcl;

    .line 358
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->g()V

    .line 360
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Landroid/content/Intent;)V

    .line 362
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v2

    .line 364
    if-nez v2, :cond_0

    .line 366
    const-string v0, "HomeActivity"

    const-string v1, "onCreate begin Login Account."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->J()V

    .line 368
    return-void

    .line 371
    :cond_0
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 372
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->s()V

    goto :goto_0

    .line 374
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    .line 391
    :goto_0
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    if-nez v0, :cond_2

    .line 394
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->K()V

    goto :goto_1

    .line 400
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->B:Z

    .line 404
    :goto_1
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->z:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->e(I)V

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->w:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/aou;->a(Landroid/os/Handler;Ljava/lang/String;)V

    .line 411
    :cond_3
    new-instance v0, Lo/aos;

    invoke-direct {v0}, Lo/aos;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->q:Lo/aos;

    .line 414
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->w()V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->q:Lo/aos;

    invoke-virtual {v0}, Lo/aos;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 419
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->h()V

    goto :goto_2

    .line 424
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->k()V

    .line 426
    :goto_2
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 787
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_friendlist_menu_emui50:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 788
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    .line 789
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 790
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 791
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_add_friend:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 792
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 793
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_sweep:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 794
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_setting:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 796
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 797
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_add_friend:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 798
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 799
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_sweep:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_setting:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 802
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1108
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->C()V

    .line 1109
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lo/azd;)V

    .line 1110
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 1111
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 736
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 738
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 741
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->finish()V

    .line 742
    const/4 v0, 0x1

    return v0

    .line 745
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_1

    .line 748
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->r()V

    .line 749
    const/4 v0, 0x1

    return v0

    .line 751
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 754
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->q()V

    .line 755
    const/4 v0, 0x1

    return v0

    .line 759
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 1473
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 1475
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Landroid/content/Intent;)V

    .line 1477
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v2

    .line 1479
    if-nez v2, :cond_0

    .line 1481
    const-string v0, "HomeActivity"

    const-string v1, "onNewIntent begin Login Account."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1482
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->J()V

    .line 1483
    return-void

    .line 1487
    :cond_0
    const-string v0, "HomeActivity"

    const-string v1, "onNewIntent has login."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1490
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Landroid/content/Intent;)V

    .line 1491
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 842
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_sweep:I

    if-ne v0, v1, :cond_0

    .line 844
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->u()V

    goto/16 :goto_0

    .line 846
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    if-ne v0, v1, :cond_1

    .line 848
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 849
    const-class v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 851
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 852
    const-string v0, "isCreateGroup"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 853
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 854
    goto :goto_0

    .line 855
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_add_friend:I

    if-ne v0, v1, :cond_2

    .line 857
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 858
    const-class v0, Lcom/huawei/health/sns/ui/user/AddFriendActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 859
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 860
    goto :goto_0

    .line 861
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    if-ne v0, v1, :cond_3

    .line 863
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 864
    const-string v0, "DefaultFragment"

    iget v1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 865
    const-class v0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 866
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 867
    goto :goto_0

    .line 868
    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->menu_setting:I

    if-ne v0, v1, :cond_4

    .line 870
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->t()V

    .line 872
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 2

    .line 1315
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1317
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    .line 1318
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 1320
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 1323
    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1329
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    .line 1330
    if-eqz v0, :cond_0

    .line 1332
    invoke-static {v0, p1, p2}, Lo/bmm;->b(Landroid/app/ActionBar;IF)V

    .line 1334
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1339
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setSelectedNavigationItem(I)V

    .line 1341
    iput p1, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    .line 1343
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->B:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_0

    .line 1345
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->B:Z

    .line 1346
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->K()V

    .line 1349
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    if-eqz v0, :cond_2

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    if-eqz v0, :cond_2

    .line 1351
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_1

    .line 1353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 1357
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->o:Landroid/view/Menu;

    sget v1, Lcom/huawei/android/sns/R$id;->menu_search:I

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1360
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->F()V

    .line 1361
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->D()V

    .line 1362
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 6

    .line 808
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 811
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 815
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->menu_group_chat:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 817
    :goto_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v2

    .line 818
    const/4 v3, 0x0

    .line 819
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_2

    .line 821
    invoke-interface {p1, v4}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    .line 822
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    .line 823
    sget v0, Lcom/huawei/android/sns/R$id;->menu_search:I

    if-ne v5, v0, :cond_1

    .line 825
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->r:Z

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 827
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_2

    .line 829
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_2

    .line 819
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 836
    :cond_2
    :goto_2
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 1128
    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    .line 1131
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1133
    invoke-static {p3}, Lo/biq;->d([I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1135
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->B()V

    goto :goto_2

    .line 1138
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 1140
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_3

    .line 1142
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p3

    if-ge v2, v0, :cond_1

    aget v0, p3, v2

    if-nez v0, :cond_1

    .line 1145
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->B()V

    goto :goto_1

    .line 1147
    :cond_1
    const-string v0, "android.permission.READ_CONTACTS"

    aget-object v1, p2, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    array-length v0, p3

    if-ge v2, v0, :cond_2

    aget v0, p3, v2

    if-nez v0, :cond_2

    .line 1150
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->a()V

    .line 1140
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1155
    :cond_3
    :goto_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->D()V

    .line 1156
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1443
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 1444
    const-string v0, "HomeActivity"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1446
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_0

    .line 1448
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 1449
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 1451
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/NotificationManager;

    .line 1452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "IMOfflineNotify"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1457
    :cond_0
    invoke-virtual {p0, p0}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Lo/awn$e;)V

    .line 1459
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/HomeActivity;->G()V

    .line 1460
    return-void
.end method

.method public onTabReselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 1299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->g:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    iget-object v1, v0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    .line 1300
    iget v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->v:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->x:Z

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 1302
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->a()V

    .line 1304
    :cond_0
    return-void
.end method

.method public onTabSelected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 1291
    invoke-virtual {p1}, Landroid/app/ActionBar$Tab;->getPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->e(I)V

    .line 1292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Landroid/app/ActionBar$Tab;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 1293
    return-void
.end method

.method public onTabUnselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 1309
    return-void
.end method
